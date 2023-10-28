package gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TabPane;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Modality;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.Tooltip;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import java.io.File;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.List;
import java.time.LocalDate;
import java.util.LinkedList;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;

import gui.supportclass.*;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.value.ObservableValue;
import javafx.util.Callback;
import services.*;
import services.impl.*;
import java.time.format.DateTimeFormatter;
import java.lang.reflect.Method;

import entities.*;

public class PrototypeController implements Initializable {


	DateTimeFormatter dateformatter;
	 
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		lab1system_service = ServiceManager.createLab1System();
		thirdpartyservices_service = ServiceManager.createThirdPartyServices();
		searchgoodsservice_service = ServiceManager.createSearchGoodsService();
		managecartservice_service = ServiceManager.createManageCartService();
		orderpaymentservice_service = ServiceManager.createOrderPaymentService();
		applyrefundservice_service = ServiceManager.createApplyRefundService();
		mabageordersservice_service = ServiceManager.createMabageOrdersService();
		managerefundservice_service = ServiceManager.createManageRefundService();
		managecommodityservice_service = ServiceManager.createManageCommodityService();
		manageuserservice_service = ServiceManager.createManageUserService();
				
		this.dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
	   	 //prepare data for contract
	   	 prepareData();
	   	 
	   	 //generate invariant panel
	   	 genereateInvairantPanel();
	   	 
		 //Actor Threeview Binding
		 actorTreeViewBinding();
		 
		 //Generate
		 generatOperationPane();
		 genereateOpInvariantPanel();
		 
		 //prilimariry data
		 try {
			DataFitService.fit();
		 } catch (PreconditionException e) {
			// TODO Auto-generated catch block
		 	e.printStackTrace();
		 }
		 
		 //generate class statistic
		 classStatisicBingding();
		 
		 //generate object statistic
		 generateObjectTable();
		 
		 //genereate association statistic
		 associationStatisicBingding();

		 //set listener 
		 setListeners();
	}
	
	/**
	 * deepCopyforTreeItem (Actor Generation)
	 */
	TreeItem<String> deepCopyTree(TreeItem<String> item) {
		    TreeItem<String> copy = new TreeItem<String>(item.getValue());
		    for (TreeItem<String> child : item.getChildren()) {
		        copy.getChildren().add(deepCopyTree(child));
		    }
		    return copy;
	}
	
	/**
	 * check all invariant and update invariant panel
	 */
	public void invairantPanelUpdate() {
		
		try {
			
			for (Entry<String, Label> inv : entity_invariants_label_map.entrySet()) {
				String invname = inv.getKey();
				String[] invt = invname.split("_");
				String entityName = invt[0];
				for (Object o : EntityManager.getAllInstancesOf(entityName)) {				
					 Method m = o.getClass().getMethod(invname);
					 if ((boolean)m.invoke(o) == false) {
						 inv.getValue().setStyle("-fx-max-width: Infinity;" + 
									"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #af0c27 100%);" +
								    "-fx-padding: 6px;" +
								    "-fx-border-color: black;");
						 break;
					 }
				}				
			}
			
			for (Entry<String, Label> inv : service_invariants_label_map.entrySet()) {
				String invname = inv.getKey();
				String[] invt = invname.split("_");
				String serviceName = invt[0];
				for (Object o : ServiceManager.getAllInstancesOf(serviceName)) {				
					 Method m = o.getClass().getMethod(invname);
					 if ((boolean)m.invoke(o) == false) {
						 inv.getValue().setStyle("-fx-max-width: Infinity;" + 
									"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #af0c27 100%);" +
								    "-fx-padding: 6px;" +
								    "-fx-border-color: black;");
						 break;
					 }
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

	/**
	 * check op invariant and update op invariant panel
	 */		
	public void opInvairantPanelUpdate() {
		
		try {
			
			for (Entry<String, Label> inv : op_entity_invariants_label_map.entrySet()) {
				String invname = inv.getKey();
				String[] invt = invname.split("_");
				String entityName = invt[0];
				for (Object o : EntityManager.getAllInstancesOf(entityName)) {
					 Method m = o.getClass().getMethod(invname);
					 if ((boolean)m.invoke(o) == false) {
						 inv.getValue().setStyle("-fx-max-width: Infinity;" + 
									"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #af0c27 100%);" +
								    "-fx-padding: 6px;" +
								    "-fx-border-color: black;");
						 break;
					 }
				}
			}
			
			for (Entry<String, Label> inv : op_service_invariants_label_map.entrySet()) {
				String invname = inv.getKey();
				String[] invt = invname.split("_");
				String serviceName = invt[0];
				for (Object o : ServiceManager.getAllInstancesOf(serviceName)) {
					 Method m = o.getClass().getMethod(invname);
					 if ((boolean)m.invoke(o) == false) {
						 inv.getValue().setStyle("-fx-max-width: Infinity;" + 
									"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #af0c27 100%);" +
								    "-fx-padding: 6px;" +
								    "-fx-border-color: black;");
						 break;
					 }
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/* 
	*	generate op invariant panel 
	*/
	public void genereateOpInvariantPanel() {
		
		opInvariantPanel = new HashMap<String, VBox>();
		op_entity_invariants_label_map = new LinkedHashMap<String, Label>();
		op_service_invariants_label_map = new LinkedHashMap<String, Label>();
		
		VBox v;
		List<String> entities;
		v = new VBox();
		
		//entities invariants
		entities = ManageCartServiceImpl.opINVRelatedEntity.get("addCart");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("addCart" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ManageCartService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("addCart", v);
		
		v = new VBox();
		
		//entities invariants
		entities = SearchGoodsServiceImpl.opINVRelatedEntity.get("browseGoods");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("browseGoods" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("SearchGoodsService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("browseGoods", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ManageCartServiceImpl.opINVRelatedEntity.get("browseCart");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("browseCart" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ManageCartService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("browseCart", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ManageCartServiceImpl.opINVRelatedEntity.get("deleteCart");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("deleteCart" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ManageCartService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("deleteCart", v);
		
		v = new VBox();
		
		//entities invariants
		entities = OrderPaymentServiceImpl.opINVRelatedEntity.get("orderPay");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("orderPay" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("OrderPaymentService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("orderPay", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ApplyRefundServiceImpl.opINVRelatedEntity.get("applyRefund");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("applyRefund" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ApplyRefundService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("applyRefund", v);
		
		v = new VBox();
		
		//entities invariants
		entities = MabageOrdersServiceImpl.opINVRelatedEntity.get("browseOrder");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("browseOrder" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("MabageOrdersService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("browseOrder", v);
		
		v = new VBox();
		
		//entities invariants
		entities = MabageOrdersServiceImpl.opINVRelatedEntity.get("deleteOrder");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("deleteOrder" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("MabageOrdersService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("deleteOrder", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ManageRefundServiceImpl.opINVRelatedEntity.get("refuseRefund");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("refuseRefund" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ManageRefundService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("refuseRefund", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ManageRefundServiceImpl.opINVRelatedEntity.get("agreeRefund");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("agreeRefund" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ManageRefundService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("agreeRefund", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ManageCommodityServiceImpl.opINVRelatedEntity.get("addGoods");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("addGoods" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ManageCommodityService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("addGoods", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ManageCommodityServiceImpl.opINVRelatedEntity.get("deleteGoods");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("deleteGoods" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ManageCommodityService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("deleteGoods", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ManageCommodityServiceImpl.opINVRelatedEntity.get("checkGoods");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("checkGoods" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ManageCommodityService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("checkGoods", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ManageCommodityServiceImpl.opINVRelatedEntity.get("modifyPrice");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("modifyPrice" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ManageCommodityService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("modifyPrice", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ManageUserServiceImpl.opINVRelatedEntity.get("browseUser");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("browseUser" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ManageUserService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("browseUser", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ManageUserServiceImpl.opINVRelatedEntity.get("addUser");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("addUser" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ManageUserService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("addUser", v);
		
		v = new VBox();
		
		//entities invariants
		entities = ManageUserServiceImpl.opINVRelatedEntity.get("deleteUser");
		if (entities != null) {
			for (String opRelatedEntities : entities) {
				for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
					
					String invname = inv.getKey();
					String[] invt = invname.split("_");
					String entityName = invt[0];
		
					if (opRelatedEntities.equals(entityName)) {
						Label l = new Label(invname);
						l.setStyle("-fx-max-width: Infinity;" + 
								"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
							    "-fx-padding: 6px;" +
							    "-fx-border-color: black;");
						Tooltip tp = new Tooltip();
						tp.setText(inv.getValue());
						l.setTooltip(tp);
						
						op_entity_invariants_label_map.put(invname, l);
						
						v.getChildren().add(l);
					}
				}
			}
		} else {
			Label l = new Label("deleteUser" + " is no related invariants");
			l.setPadding(new Insets(8, 8, 8, 8));
			v.getChildren().add(l);
		}
		
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			String invname = inv.getKey();
			String[] invt = invname.split("_");
			String serviceName = invt[0];
			
			if (serviceName.equals("ManageUserService")) {
				Label l = new Label(invname);
				l.setStyle("-fx-max-width: Infinity;" + 
						   "-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
						   "-fx-padding: 6px;" +
						   "-fx-border-color: black;");
				Tooltip tp = new Tooltip();
				tp.setText(inv.getValue());
				l.setTooltip(tp);
				
				op_entity_invariants_label_map.put(invname, l);
				
				v.getChildren().add(l);
			}
		}
		opInvariantPanel.put("deleteUser", v);
		
		
	}
	
	
	/*
	*  generate invariant panel
	*/
	public void genereateInvairantPanel() {
		
		service_invariants_label_map = new LinkedHashMap<String, Label>();
		entity_invariants_label_map = new LinkedHashMap<String, Label>();
		
		//entity_invariants_map
		VBox v = new VBox();
		//service invariants
		for (Entry<String, String> inv : service_invariants_map.entrySet()) {
			
			Label l = new Label(inv.getKey());
			l.setStyle("-fx-max-width: Infinity;" + 
					"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
				    "-fx-padding: 6px;" +
				    "-fx-border-color: black;");
			
			Tooltip tp = new Tooltip();
			tp.setText(inv.getValue());
			l.setTooltip(tp);
			
			service_invariants_label_map.put(inv.getKey(), l);
			v.getChildren().add(l);
			
		}
		//entity invariants
		for (Entry<String, String> inv : entity_invariants_map.entrySet()) {
			
			String INVname = inv.getKey();
			Label l = new Label(INVname);
			if (INVname.contains("AssociationInvariants")) {
				l.setStyle("-fx-max-width: Infinity;" + 
					"-fx-background-color: linear-gradient(to right, #099b17 0%, #F0FFFF 100%);" +
				    "-fx-padding: 6px;" +
				    "-fx-border-color: black;");
			} else {
				l.setStyle("-fx-max-width: Infinity;" + 
									"-fx-background-color: linear-gradient(to right, #7FFF00 0%, #F0FFFF 100%);" +
								    "-fx-padding: 6px;" +
								    "-fx-border-color: black;");
			}	
			Tooltip tp = new Tooltip();
			tp.setText(inv.getValue());
			l.setTooltip(tp);
			
			entity_invariants_label_map.put(inv.getKey(), l);
			v.getChildren().add(l);
			
		}
		ScrollPane scrollPane = new ScrollPane(v);
		scrollPane.setFitToWidth(true);
		all_invariant_pane.setMaxHeight(850);
		
		all_invariant_pane.setContent(scrollPane);
	}	
	
	
	
	/* 
	*	mainPane add listener
	*/
	public void setListeners() {
		 mainPane.getSelectionModel().selectedItemProperty().addListener((ov, oldTab, newTab) -> {
			 
			 	if (newTab.getText().equals("System State")) {
			 		System.out.println("refresh all");
			 		refreshAll();
			 	}
		    
		    });
	}
	
	
	//checking all invariants
	public void checkAllInvariants() {
		
		invairantPanelUpdate();
	
	}	
	
	//refresh all
	public void refreshAll() {
		
		invairantPanelUpdate();
		classStatisticUpdate();
		generateObjectTable();
	}
	
	
	//update association
	public void updateAssociation(String className) {
		
		for (AssociationInfo assoc : allassociationData.get(className)) {
			assoc.computeAssociationNumber();
		}
		
	}
	
	public void updateAssociation(String className, int index) {
		
		for (AssociationInfo assoc : allassociationData.get(className)) {
			assoc.computeAssociationNumber(index);
		}
		
	}	
	
	public void generateObjectTable() {
		
		allObjectTables = new LinkedHashMap<String, TableView>();
		
		TableView<Map<String, String>> tableUser = new TableView<Map<String, String>>();

		//super entity attribute column
						
		//attributes table column
		TableColumn<Map<String, String>, String> tableUser_UserId = new TableColumn<Map<String, String>, String>("UserId");
		tableUser_UserId.setMinWidth("UserId".length()*10);
		tableUser_UserId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserId"));
		    }
		});	
		tableUser.getColumns().add(tableUser_UserId);
		TableColumn<Map<String, String>, String> tableUser_UserName = new TableColumn<Map<String, String>, String>("UserName");
		tableUser_UserName.setMinWidth("UserName".length()*10);
		tableUser_UserName.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserName"));
		    }
		});	
		tableUser.getColumns().add(tableUser_UserName);
		TableColumn<Map<String, String>, String> tableUser_Password = new TableColumn<Map<String, String>, String>("Password");
		tableUser_Password.setMinWidth("Password".length()*10);
		tableUser_Password.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("Password"));
		    }
		});	
		tableUser.getColumns().add(tableUser_Password);
		TableColumn<Map<String, String>, String> tableUser_UserStatus = new TableColumn<Map<String, String>, String>("UserStatus");
		tableUser_UserStatus.setMinWidth("UserStatus".length()*10);
		tableUser_UserStatus.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserStatus"));
		    }
		});	
		tableUser.getColumns().add(tableUser_UserStatus);
		TableColumn<Map<String, String>, String> tableUser_Identity = new TableColumn<Map<String, String>, String>("Identity");
		tableUser_Identity.setMinWidth("Identity".length()*10);
		tableUser_Identity.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("Identity"));
		    }
		});	
		tableUser.getColumns().add(tableUser_Identity);
		
		//table data
		ObservableList<Map<String, String>> dataUser = FXCollections.observableArrayList();
		List<User> rsUser = EntityManager.getAllInstancesOf("User");
		for (User r : rsUser) {
			//table entry
			Map<String, String> unit = new HashMap<String, String>();
			
			unit.put("UserId", String.valueOf(r.getUserId()));
			if (r.getUserName() != null)
				unit.put("UserName", String.valueOf(r.getUserName()));
			else
				unit.put("UserName", "");
			if (r.getPassword() != null)
				unit.put("Password", String.valueOf(r.getPassword()));
			else
				unit.put("Password", "");
			unit.put("UserStatus", String.valueOf(r.getUserStatus()));
			if (r.getIdentity() != null)
				unit.put("Identity", String.valueOf(r.getIdentity()));
			else
				unit.put("Identity", "");

			dataUser.add(unit);
		}
		
		tableUser.getSelectionModel().selectedIndexProperty().addListener(
							 (observable, oldValue, newValue) ->  { 
							 										 //get selected index
							 										 objectindex = tableUser.getSelectionModel().getSelectedIndex();
							 			 				 			 System.out.println("select: " + objectindex);

							 			 				 			 //update association object information
							 			 				 			 if (objectindex != -1)
										 			 					 updateAssociation("User", objectindex);
							 			 				 			 
							 			 				 		  });
		
		tableUser.setItems(dataUser);
		allObjectTables.put("User", tableUser);
		
		TableView<Map<String, String>> tableCustomer = new TableView<Map<String, String>>();

		//super entity attribute column
		TableColumn<Map<String, String>, String> tableCustomer_UserId = new TableColumn<Map<String, String>, String>("UserId");
		tableCustomer_UserId.setMinWidth("UserId".length()*10);
		tableCustomer_UserId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserId"));
		    }
		});	
		tableCustomer.getColumns().add(tableCustomer_UserId);
		TableColumn<Map<String, String>, String> tableCustomer_UserName = new TableColumn<Map<String, String>, String>("UserName");
		tableCustomer_UserName.setMinWidth("UserName".length()*10);
		tableCustomer_UserName.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserName"));
		    }
		});	
		tableCustomer.getColumns().add(tableCustomer_UserName);
		TableColumn<Map<String, String>, String> tableCustomer_Password = new TableColumn<Map<String, String>, String>("Password");
		tableCustomer_Password.setMinWidth("Password".length()*10);
		tableCustomer_Password.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("Password"));
		    }
		});	
		tableCustomer.getColumns().add(tableCustomer_Password);
		TableColumn<Map<String, String>, String> tableCustomer_UserStatus = new TableColumn<Map<String, String>, String>("UserStatus");
		tableCustomer_UserStatus.setMinWidth("UserStatus".length()*10);
		tableCustomer_UserStatus.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserStatus"));
		    }
		});	
		tableCustomer.getColumns().add(tableCustomer_UserStatus);
		TableColumn<Map<String, String>, String> tableCustomer_Identity = new TableColumn<Map<String, String>, String>("Identity");
		tableCustomer_Identity.setMinWidth("Identity".length()*10);
		tableCustomer_Identity.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("Identity"));
		    }
		});	
		tableCustomer.getColumns().add(tableCustomer_Identity);
						
		//attributes table column
		TableColumn<Map<String, String>, String> tableCustomer_OrderNum = new TableColumn<Map<String, String>, String>("OrderNum");
		tableCustomer_OrderNum.setMinWidth("OrderNum".length()*10);
		tableCustomer_OrderNum.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("OrderNum"));
		    }
		});	
		tableCustomer.getColumns().add(tableCustomer_OrderNum);
		
		//table data
		ObservableList<Map<String, String>> dataCustomer = FXCollections.observableArrayList();
		List<Customer> rsCustomer = EntityManager.getAllInstancesOf("Customer");
		for (Customer r : rsCustomer) {
			//table entry
			Map<String, String> unit = new HashMap<String, String>();
			unit.put("UserId", String.valueOf(r.getUserId()));
			if (r.getUserName() != null)
				unit.put("UserName", String.valueOf(r.getUserName()));
			else
				unit.put("UserName", "");
			if (r.getPassword() != null)
				unit.put("Password", String.valueOf(r.getPassword()));
			else
				unit.put("Password", "");
			unit.put("UserStatus", String.valueOf(r.getUserStatus()));
			if (r.getIdentity() != null)
				unit.put("Identity", String.valueOf(r.getIdentity()));
			else
				unit.put("Identity", "");
			
			unit.put("OrderNum", String.valueOf(r.getOrderNum()));

			dataCustomer.add(unit);
		}
		
		tableCustomer.getSelectionModel().selectedIndexProperty().addListener(
							 (observable, oldValue, newValue) ->  { 
							 										 //get selected index
							 										 objectindex = tableCustomer.getSelectionModel().getSelectedIndex();
							 			 				 			 System.out.println("select: " + objectindex);

							 			 				 			 //update association object information
							 			 				 			 if (objectindex != -1)
										 			 					 updateAssociation("Customer", objectindex);
							 			 				 			 
							 			 				 		  });
		
		tableCustomer.setItems(dataCustomer);
		allObjectTables.put("Customer", tableCustomer);
		
		TableView<Map<String, String>> tableAdmin = new TableView<Map<String, String>>();

		//super entity attribute column
		TableColumn<Map<String, String>, String> tableAdmin_UserId = new TableColumn<Map<String, String>, String>("UserId");
		tableAdmin_UserId.setMinWidth("UserId".length()*10);
		tableAdmin_UserId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserId"));
		    }
		});	
		tableAdmin.getColumns().add(tableAdmin_UserId);
		TableColumn<Map<String, String>, String> tableAdmin_UserName = new TableColumn<Map<String, String>, String>("UserName");
		tableAdmin_UserName.setMinWidth("UserName".length()*10);
		tableAdmin_UserName.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserName"));
		    }
		});	
		tableAdmin.getColumns().add(tableAdmin_UserName);
		TableColumn<Map<String, String>, String> tableAdmin_Password = new TableColumn<Map<String, String>, String>("Password");
		tableAdmin_Password.setMinWidth("Password".length()*10);
		tableAdmin_Password.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("Password"));
		    }
		});	
		tableAdmin.getColumns().add(tableAdmin_Password);
		TableColumn<Map<String, String>, String> tableAdmin_UserStatus = new TableColumn<Map<String, String>, String>("UserStatus");
		tableAdmin_UserStatus.setMinWidth("UserStatus".length()*10);
		tableAdmin_UserStatus.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserStatus"));
		    }
		});	
		tableAdmin.getColumns().add(tableAdmin_UserStatus);
		TableColumn<Map<String, String>, String> tableAdmin_Identity = new TableColumn<Map<String, String>, String>("Identity");
		tableAdmin_Identity.setMinWidth("Identity".length()*10);
		tableAdmin_Identity.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("Identity"));
		    }
		});	
		tableAdmin.getColumns().add(tableAdmin_Identity);
						
		//attributes table column
		TableColumn<Map<String, String>, String> tableAdmin_PlaceOrderNum = new TableColumn<Map<String, String>, String>("PlaceOrderNum");
		tableAdmin_PlaceOrderNum.setMinWidth("PlaceOrderNum".length()*10);
		tableAdmin_PlaceOrderNum.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("PlaceOrderNum"));
		    }
		});	
		tableAdmin.getColumns().add(tableAdmin_PlaceOrderNum);
		
		//table data
		ObservableList<Map<String, String>> dataAdmin = FXCollections.observableArrayList();
		List<Admin> rsAdmin = EntityManager.getAllInstancesOf("Admin");
		for (Admin r : rsAdmin) {
			//table entry
			Map<String, String> unit = new HashMap<String, String>();
			unit.put("UserId", String.valueOf(r.getUserId()));
			if (r.getUserName() != null)
				unit.put("UserName", String.valueOf(r.getUserName()));
			else
				unit.put("UserName", "");
			if (r.getPassword() != null)
				unit.put("Password", String.valueOf(r.getPassword()));
			else
				unit.put("Password", "");
			unit.put("UserStatus", String.valueOf(r.getUserStatus()));
			if (r.getIdentity() != null)
				unit.put("Identity", String.valueOf(r.getIdentity()));
			else
				unit.put("Identity", "");
			
			unit.put("PlaceOrderNum", String.valueOf(r.getPlaceOrderNum()));

			dataAdmin.add(unit);
		}
		
		tableAdmin.getSelectionModel().selectedIndexProperty().addListener(
							 (observable, oldValue, newValue) ->  { 
							 										 //get selected index
							 										 objectindex = tableAdmin.getSelectionModel().getSelectedIndex();
							 			 				 			 System.out.println("select: " + objectindex);

							 			 				 			 //update association object information
							 			 				 			 if (objectindex != -1)
										 			 					 updateAssociation("Admin", objectindex);
							 			 				 			 
							 			 				 		  });
		
		tableAdmin.setItems(dataAdmin);
		allObjectTables.put("Admin", tableAdmin);
		
		TableView<Map<String, String>> tableSuperAdmin = new TableView<Map<String, String>>();

		//super entity attribute column
		TableColumn<Map<String, String>, String> tableSuperAdmin_UserId = new TableColumn<Map<String, String>, String>("UserId");
		tableSuperAdmin_UserId.setMinWidth("UserId".length()*10);
		tableSuperAdmin_UserId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserId"));
		    }
		});	
		tableSuperAdmin.getColumns().add(tableSuperAdmin_UserId);
		TableColumn<Map<String, String>, String> tableSuperAdmin_UserName = new TableColumn<Map<String, String>, String>("UserName");
		tableSuperAdmin_UserName.setMinWidth("UserName".length()*10);
		tableSuperAdmin_UserName.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserName"));
		    }
		});	
		tableSuperAdmin.getColumns().add(tableSuperAdmin_UserName);
		TableColumn<Map<String, String>, String> tableSuperAdmin_Password = new TableColumn<Map<String, String>, String>("Password");
		tableSuperAdmin_Password.setMinWidth("Password".length()*10);
		tableSuperAdmin_Password.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("Password"));
		    }
		});	
		tableSuperAdmin.getColumns().add(tableSuperAdmin_Password);
		TableColumn<Map<String, String>, String> tableSuperAdmin_UserStatus = new TableColumn<Map<String, String>, String>("UserStatus");
		tableSuperAdmin_UserStatus.setMinWidth("UserStatus".length()*10);
		tableSuperAdmin_UserStatus.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserStatus"));
		    }
		});	
		tableSuperAdmin.getColumns().add(tableSuperAdmin_UserStatus);
		TableColumn<Map<String, String>, String> tableSuperAdmin_Identity = new TableColumn<Map<String, String>, String>("Identity");
		tableSuperAdmin_Identity.setMinWidth("Identity".length()*10);
		tableSuperAdmin_Identity.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("Identity"));
		    }
		});	
		tableSuperAdmin.getColumns().add(tableSuperAdmin_Identity);
						
		//attributes table column
		TableColumn<Map<String, String>, String> tableSuperAdmin_Introduce = new TableColumn<Map<String, String>, String>("Introduce");
		tableSuperAdmin_Introduce.setMinWidth("Introduce".length()*10);
		tableSuperAdmin_Introduce.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("Introduce"));
		    }
		});	
		tableSuperAdmin.getColumns().add(tableSuperAdmin_Introduce);
		
		//table data
		ObservableList<Map<String, String>> dataSuperAdmin = FXCollections.observableArrayList();
		List<SuperAdmin> rsSuperAdmin = EntityManager.getAllInstancesOf("SuperAdmin");
		for (SuperAdmin r : rsSuperAdmin) {
			//table entry
			Map<String, String> unit = new HashMap<String, String>();
			unit.put("UserId", String.valueOf(r.getUserId()));
			if (r.getUserName() != null)
				unit.put("UserName", String.valueOf(r.getUserName()));
			else
				unit.put("UserName", "");
			if (r.getPassword() != null)
				unit.put("Password", String.valueOf(r.getPassword()));
			else
				unit.put("Password", "");
			unit.put("UserStatus", String.valueOf(r.getUserStatus()));
			if (r.getIdentity() != null)
				unit.put("Identity", String.valueOf(r.getIdentity()));
			else
				unit.put("Identity", "");
			
			if (r.getIntroduce() != null)
				unit.put("Introduce", String.valueOf(r.getIntroduce()));
			else
				unit.put("Introduce", "");

			dataSuperAdmin.add(unit);
		}
		
		tableSuperAdmin.getSelectionModel().selectedIndexProperty().addListener(
							 (observable, oldValue, newValue) ->  { 
							 										 //get selected index
							 										 objectindex = tableSuperAdmin.getSelectionModel().getSelectedIndex();
							 			 				 			 System.out.println("select: " + objectindex);

							 			 				 			 //update association object information
							 			 				 			 if (objectindex != -1)
										 			 					 updateAssociation("SuperAdmin", objectindex);
							 			 				 			 
							 			 				 		  });
		
		tableSuperAdmin.setItems(dataSuperAdmin);
		allObjectTables.put("SuperAdmin", tableSuperAdmin);
		
		TableView<Map<String, String>> tableOrders = new TableView<Map<String, String>>();

		//super entity attribute column
						
		//attributes table column
		TableColumn<Map<String, String>, String> tableOrders_OrderId = new TableColumn<Map<String, String>, String>("OrderId");
		tableOrders_OrderId.setMinWidth("OrderId".length()*10);
		tableOrders_OrderId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("OrderId"));
		    }
		});	
		tableOrders.getColumns().add(tableOrders_OrderId);
		TableColumn<Map<String, String>, String> tableOrders_GoodsId = new TableColumn<Map<String, String>, String>("GoodsId");
		tableOrders_GoodsId.setMinWidth("GoodsId".length()*10);
		tableOrders_GoodsId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsId"));
		    }
		});	
		tableOrders.getColumns().add(tableOrders_GoodsId);
		TableColumn<Map<String, String>, String> tableOrders_GoodsName = new TableColumn<Map<String, String>, String>("GoodsName");
		tableOrders_GoodsName.setMinWidth("GoodsName".length()*10);
		tableOrders_GoodsName.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsName"));
		    }
		});	
		tableOrders.getColumns().add(tableOrders_GoodsName);
		TableColumn<Map<String, String>, String> tableOrders_GoodsPrice = new TableColumn<Map<String, String>, String>("GoodsPrice");
		tableOrders_GoodsPrice.setMinWidth("GoodsPrice".length()*10);
		tableOrders_GoodsPrice.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsPrice"));
		    }
		});	
		tableOrders.getColumns().add(tableOrders_GoodsPrice);
		TableColumn<Map<String, String>, String> tableOrders_TotalPrice = new TableColumn<Map<String, String>, String>("TotalPrice");
		tableOrders_TotalPrice.setMinWidth("TotalPrice".length()*10);
		tableOrders_TotalPrice.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("TotalPrice"));
		    }
		});	
		tableOrders.getColumns().add(tableOrders_TotalPrice);
		TableColumn<Map<String, String>, String> tableOrders_UserId = new TableColumn<Map<String, String>, String>("UserId");
		tableOrders_UserId.setMinWidth("UserId".length()*10);
		tableOrders_UserId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserId"));
		    }
		});	
		tableOrders.getColumns().add(tableOrders_UserId);
		TableColumn<Map<String, String>, String> tableOrders_OrderAffair = new TableColumn<Map<String, String>, String>("OrderAffair");
		tableOrders_OrderAffair.setMinWidth("OrderAffair".length()*10);
		tableOrders_OrderAffair.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("OrderAffair"));
		    }
		});	
		tableOrders.getColumns().add(tableOrders_OrderAffair);
		
		//table data
		ObservableList<Map<String, String>> dataOrders = FXCollections.observableArrayList();
		List<Orders> rsOrders = EntityManager.getAllInstancesOf("Orders");
		for (Orders r : rsOrders) {
			//table entry
			Map<String, String> unit = new HashMap<String, String>();
			
			if (r.getOrderId() != null)
				unit.put("OrderId", String.valueOf(r.getOrderId()));
			else
				unit.put("OrderId", "");
			if (r.getGoodsId() != null)
				unit.put("GoodsId", String.valueOf(r.getGoodsId()));
			else
				unit.put("GoodsId", "");
			if (r.getGoodsName() != null)
				unit.put("GoodsName", String.valueOf(r.getGoodsName()));
			else
				unit.put("GoodsName", "");
			if (r.getGoodsPrice() != null)
				unit.put("GoodsPrice", String.valueOf(r.getGoodsPrice()));
			else
				unit.put("GoodsPrice", "");
			if (r.getTotalPrice() != null)
				unit.put("TotalPrice", String.valueOf(r.getTotalPrice()));
			else
				unit.put("TotalPrice", "");
			if (r.getUserId() != null)
				unit.put("UserId", String.valueOf(r.getUserId()));
			else
				unit.put("UserId", "");
			unit.put("OrderAffair", String.valueOf(r.getOrderAffair()));

			dataOrders.add(unit);
		}
		
		tableOrders.getSelectionModel().selectedIndexProperty().addListener(
							 (observable, oldValue, newValue) ->  { 
							 										 //get selected index
							 										 objectindex = tableOrders.getSelectionModel().getSelectedIndex();
							 			 				 			 System.out.println("select: " + objectindex);

							 			 				 			 //update association object information
							 			 				 			 if (objectindex != -1)
										 			 					 updateAssociation("Orders", objectindex);
							 			 				 			 
							 			 				 		  });
		
		tableOrders.setItems(dataOrders);
		allObjectTables.put("Orders", tableOrders);
		
		TableView<Map<String, String>> tableShoppingCart = new TableView<Map<String, String>>();

		//super entity attribute column
						
		//attributes table column
		TableColumn<Map<String, String>, String> tableShoppingCart_GoodsId = new TableColumn<Map<String, String>, String>("GoodsId");
		tableShoppingCart_GoodsId.setMinWidth("GoodsId".length()*10);
		tableShoppingCart_GoodsId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsId"));
		    }
		});	
		tableShoppingCart.getColumns().add(tableShoppingCart_GoodsId);
		TableColumn<Map<String, String>, String> tableShoppingCart_GoodsName = new TableColumn<Map<String, String>, String>("GoodsName");
		tableShoppingCart_GoodsName.setMinWidth("GoodsName".length()*10);
		tableShoppingCart_GoodsName.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsName"));
		    }
		});	
		tableShoppingCart.getColumns().add(tableShoppingCart_GoodsName);
		TableColumn<Map<String, String>, String> tableShoppingCart_GoodsNum = new TableColumn<Map<String, String>, String>("GoodsNum");
		tableShoppingCart_GoodsNum.setMinWidth("GoodsNum".length()*10);
		tableShoppingCart_GoodsNum.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsNum"));
		    }
		});	
		tableShoppingCart.getColumns().add(tableShoppingCart_GoodsNum);
		TableColumn<Map<String, String>, String> tableShoppingCart_GoodsPrice = new TableColumn<Map<String, String>, String>("GoodsPrice");
		tableShoppingCart_GoodsPrice.setMinWidth("GoodsPrice".length()*10);
		tableShoppingCart_GoodsPrice.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsPrice"));
		    }
		});	
		tableShoppingCart.getColumns().add(tableShoppingCart_GoodsPrice);
		TableColumn<Map<String, String>, String> tableShoppingCart_CartAffair = new TableColumn<Map<String, String>, String>("CartAffair");
		tableShoppingCart_CartAffair.setMinWidth("CartAffair".length()*10);
		tableShoppingCart_CartAffair.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("CartAffair"));
		    }
		});	
		tableShoppingCart.getColumns().add(tableShoppingCart_CartAffair);
		TableColumn<Map<String, String>, String> tableShoppingCart_UserId = new TableColumn<Map<String, String>, String>("UserId");
		tableShoppingCart_UserId.setMinWidth("UserId".length()*10);
		tableShoppingCart_UserId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserId"));
		    }
		});	
		tableShoppingCart.getColumns().add(tableShoppingCart_UserId);
		TableColumn<Map<String, String>, String> tableShoppingCart_TotalPrice = new TableColumn<Map<String, String>, String>("TotalPrice");
		tableShoppingCart_TotalPrice.setMinWidth("TotalPrice".length()*10);
		tableShoppingCart_TotalPrice.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("TotalPrice"));
		    }
		});	
		tableShoppingCart.getColumns().add(tableShoppingCart_TotalPrice);
		
		//table data
		ObservableList<Map<String, String>> dataShoppingCart = FXCollections.observableArrayList();
		List<ShoppingCart> rsShoppingCart = EntityManager.getAllInstancesOf("ShoppingCart");
		for (ShoppingCart r : rsShoppingCart) {
			//table entry
			Map<String, String> unit = new HashMap<String, String>();
			
			unit.put("GoodsId", String.valueOf(r.getGoodsId()));
			if (r.getGoodsName() != null)
				unit.put("GoodsName", String.valueOf(r.getGoodsName()));
			else
				unit.put("GoodsName", "");
			if (r.getGoodsNum() != null)
				unit.put("GoodsNum", String.valueOf(r.getGoodsNum()));
			else
				unit.put("GoodsNum", "");
			if (r.getGoodsPrice() != null)
				unit.put("GoodsPrice", String.valueOf(r.getGoodsPrice()));
			else
				unit.put("GoodsPrice", "");
			unit.put("CartAffair", String.valueOf(r.getCartAffair()));
			unit.put("UserId", String.valueOf(r.getUserId()));
			if (r.getTotalPrice() != null)
				unit.put("TotalPrice", String.valueOf(r.getTotalPrice()));
			else
				unit.put("TotalPrice", "");

			dataShoppingCart.add(unit);
		}
		
		tableShoppingCart.getSelectionModel().selectedIndexProperty().addListener(
							 (observable, oldValue, newValue) ->  { 
							 										 //get selected index
							 										 objectindex = tableShoppingCart.getSelectionModel().getSelectedIndex();
							 			 				 			 System.out.println("select: " + objectindex);

							 			 				 			 //update association object information
							 			 				 			 if (objectindex != -1)
										 			 					 updateAssociation("ShoppingCart", objectindex);
							 			 				 			 
							 			 				 		  });
		
		tableShoppingCart.setItems(dataShoppingCart);
		allObjectTables.put("ShoppingCart", tableShoppingCart);
		
		TableView<Map<String, String>> tableCommodity = new TableView<Map<String, String>>();

		//super entity attribute column
		TableColumn<Map<String, String>, String> tableCommodity_GoodsId = new TableColumn<Map<String, String>, String>("GoodsId");
		tableCommodity_GoodsId.setMinWidth("GoodsId".length()*10);
		tableCommodity_GoodsId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsId"));
		    }
		});	
		tableCommodity.getColumns().add(tableCommodity_GoodsId);
		TableColumn<Map<String, String>, String> tableCommodity_GoodsName = new TableColumn<Map<String, String>, String>("GoodsName");
		tableCommodity_GoodsName.setMinWidth("GoodsName".length()*10);
		tableCommodity_GoodsName.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsName"));
		    }
		});	
		tableCommodity.getColumns().add(tableCommodity_GoodsName);
		TableColumn<Map<String, String>, String> tableCommodity_GoodsNum = new TableColumn<Map<String, String>, String>("GoodsNum");
		tableCommodity_GoodsNum.setMinWidth("GoodsNum".length()*10);
		tableCommodity_GoodsNum.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsNum"));
		    }
		});	
		tableCommodity.getColumns().add(tableCommodity_GoodsNum);
		TableColumn<Map<String, String>, String> tableCommodity_GoodsPrice = new TableColumn<Map<String, String>, String>("GoodsPrice");
		tableCommodity_GoodsPrice.setMinWidth("GoodsPrice".length()*10);
		tableCommodity_GoodsPrice.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsPrice"));
		    }
		});	
		tableCommodity.getColumns().add(tableCommodity_GoodsPrice);
						
		//attributes table column
		TableColumn<Map<String, String>, String> tableCommodity_ModifyPrice = new TableColumn<Map<String, String>, String>("ModifyPrice");
		tableCommodity_ModifyPrice.setMinWidth("ModifyPrice".length()*10);
		tableCommodity_ModifyPrice.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("ModifyPrice"));
		    }
		});	
		tableCommodity.getColumns().add(tableCommodity_ModifyPrice);
		TableColumn<Map<String, String>, String> tableCommodity_ComAffair = new TableColumn<Map<String, String>, String>("ComAffair");
		tableCommodity_ComAffair.setMinWidth("ComAffair".length()*10);
		tableCommodity_ComAffair.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("ComAffair"));
		    }
		});	
		tableCommodity.getColumns().add(tableCommodity_ComAffair);
		
		//table data
		ObservableList<Map<String, String>> dataCommodity = FXCollections.observableArrayList();
		List<Commodity> rsCommodity = EntityManager.getAllInstancesOf("Commodity");
		for (Commodity r : rsCommodity) {
			//table entry
			Map<String, String> unit = new HashMap<String, String>();
			unit.put("GoodsId", String.valueOf(r.getGoodsId()));
			if (r.getGoodsName() != null)
				unit.put("GoodsName", String.valueOf(r.getGoodsName()));
			else
				unit.put("GoodsName", "");
			if (r.getGoodsNum() != null)
				unit.put("GoodsNum", String.valueOf(r.getGoodsNum()));
			else
				unit.put("GoodsNum", "");
			if (r.getGoodsPrice() != null)
				unit.put("GoodsPrice", String.valueOf(r.getGoodsPrice()));
			else
				unit.put("GoodsPrice", "");
			
			unit.put("ModifyPrice", String.valueOf(r.getModifyPrice()));
			unit.put("ComAffair", String.valueOf(r.getComAffair()));

			dataCommodity.add(unit);
		}
		
		tableCommodity.getSelectionModel().selectedIndexProperty().addListener(
							 (observable, oldValue, newValue) ->  { 
							 										 //get selected index
							 										 objectindex = tableCommodity.getSelectionModel().getSelectedIndex();
							 			 				 			 System.out.println("select: " + objectindex);

							 			 				 			 //update association object information
							 			 				 			 if (objectindex != -1)
										 			 					 updateAssociation("Commodity", objectindex);
							 			 				 			 
							 			 				 		  });
		
		tableCommodity.setItems(dataCommodity);
		allObjectTables.put("Commodity", tableCommodity);
		
		TableView<Map<String, String>> tableGoods = new TableView<Map<String, String>>();

		//super entity attribute column
						
		//attributes table column
		TableColumn<Map<String, String>, String> tableGoods_GoodsId = new TableColumn<Map<String, String>, String>("GoodsId");
		tableGoods_GoodsId.setMinWidth("GoodsId".length()*10);
		tableGoods_GoodsId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsId"));
		    }
		});	
		tableGoods.getColumns().add(tableGoods_GoodsId);
		TableColumn<Map<String, String>, String> tableGoods_GoodsName = new TableColumn<Map<String, String>, String>("GoodsName");
		tableGoods_GoodsName.setMinWidth("GoodsName".length()*10);
		tableGoods_GoodsName.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsName"));
		    }
		});	
		tableGoods.getColumns().add(tableGoods_GoodsName);
		TableColumn<Map<String, String>, String> tableGoods_GoodsNum = new TableColumn<Map<String, String>, String>("GoodsNum");
		tableGoods_GoodsNum.setMinWidth("GoodsNum".length()*10);
		tableGoods_GoodsNum.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsNum"));
		    }
		});	
		tableGoods.getColumns().add(tableGoods_GoodsNum);
		TableColumn<Map<String, String>, String> tableGoods_GoodsPrice = new TableColumn<Map<String, String>, String>("GoodsPrice");
		tableGoods_GoodsPrice.setMinWidth("GoodsPrice".length()*10);
		tableGoods_GoodsPrice.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsPrice"));
		    }
		});	
		tableGoods.getColumns().add(tableGoods_GoodsPrice);
		
		//table data
		ObservableList<Map<String, String>> dataGoods = FXCollections.observableArrayList();
		List<Goods> rsGoods = EntityManager.getAllInstancesOf("Goods");
		for (Goods r : rsGoods) {
			//table entry
			Map<String, String> unit = new HashMap<String, String>();
			
			unit.put("GoodsId", String.valueOf(r.getGoodsId()));
			if (r.getGoodsName() != null)
				unit.put("GoodsName", String.valueOf(r.getGoodsName()));
			else
				unit.put("GoodsName", "");
			if (r.getGoodsNum() != null)
				unit.put("GoodsNum", String.valueOf(r.getGoodsNum()));
			else
				unit.put("GoodsNum", "");
			if (r.getGoodsPrice() != null)
				unit.put("GoodsPrice", String.valueOf(r.getGoodsPrice()));
			else
				unit.put("GoodsPrice", "");

			dataGoods.add(unit);
		}
		
		tableGoods.getSelectionModel().selectedIndexProperty().addListener(
							 (observable, oldValue, newValue) ->  { 
							 										 //get selected index
							 										 objectindex = tableGoods.getSelectionModel().getSelectedIndex();
							 			 				 			 System.out.println("select: " + objectindex);

							 			 				 			 //update association object information
							 			 				 			 if (objectindex != -1)
										 			 					 updateAssociation("Goods", objectindex);
							 			 				 			 
							 			 				 		  });
		
		tableGoods.setItems(dataGoods);
		allObjectTables.put("Goods", tableGoods);
		
		TableView<Map<String, String>> tablePayment = new TableView<Map<String, String>>();

		//super entity attribute column
		TableColumn<Map<String, String>, String> tablePayment_OrderId = new TableColumn<Map<String, String>, String>("OrderId");
		tablePayment_OrderId.setMinWidth("OrderId".length()*10);
		tablePayment_OrderId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("OrderId"));
		    }
		});	
		tablePayment.getColumns().add(tablePayment_OrderId);
		TableColumn<Map<String, String>, String> tablePayment_GoodsId = new TableColumn<Map<String, String>, String>("GoodsId");
		tablePayment_GoodsId.setMinWidth("GoodsId".length()*10);
		tablePayment_GoodsId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsId"));
		    }
		});	
		tablePayment.getColumns().add(tablePayment_GoodsId);
		TableColumn<Map<String, String>, String> tablePayment_GoodsName = new TableColumn<Map<String, String>, String>("GoodsName");
		tablePayment_GoodsName.setMinWidth("GoodsName".length()*10);
		tablePayment_GoodsName.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsName"));
		    }
		});	
		tablePayment.getColumns().add(tablePayment_GoodsName);
		TableColumn<Map<String, String>, String> tablePayment_GoodsPrice = new TableColumn<Map<String, String>, String>("GoodsPrice");
		tablePayment_GoodsPrice.setMinWidth("GoodsPrice".length()*10);
		tablePayment_GoodsPrice.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("GoodsPrice"));
		    }
		});	
		tablePayment.getColumns().add(tablePayment_GoodsPrice);
		TableColumn<Map<String, String>, String> tablePayment_TotalPrice = new TableColumn<Map<String, String>, String>("TotalPrice");
		tablePayment_TotalPrice.setMinWidth("TotalPrice".length()*10);
		tablePayment_TotalPrice.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("TotalPrice"));
		    }
		});	
		tablePayment.getColumns().add(tablePayment_TotalPrice);
		TableColumn<Map<String, String>, String> tablePayment_UserId = new TableColumn<Map<String, String>, String>("UserId");
		tablePayment_UserId.setMinWidth("UserId".length()*10);
		tablePayment_UserId.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("UserId"));
		    }
		});	
		tablePayment.getColumns().add(tablePayment_UserId);
		TableColumn<Map<String, String>, String> tablePayment_OrderAffair = new TableColumn<Map<String, String>, String>("OrderAffair");
		tablePayment_OrderAffair.setMinWidth("OrderAffair".length()*10);
		tablePayment_OrderAffair.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("OrderAffair"));
		    }
		});	
		tablePayment.getColumns().add(tablePayment_OrderAffair);
						
		//attributes table column
		TableColumn<Map<String, String>, String> tablePayment_IfPay = new TableColumn<Map<String, String>, String>("IfPay");
		tablePayment_IfPay.setMinWidth("IfPay".length()*10);
		tablePayment_IfPay.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("IfPay"));
		    }
		});	
		tablePayment.getColumns().add(tablePayment_IfPay);
		TableColumn<Map<String, String>, String> tablePayment_IfRefund = new TableColumn<Map<String, String>, String>("IfRefund");
		tablePayment_IfRefund.setMinWidth("IfRefund".length()*10);
		tablePayment_IfRefund.setCellValueFactory(new Callback<CellDataFeatures<Map<String, String>, String>, ObservableValue<String>>() {	   
			@Override
		    public ObservableValue<String> call(CellDataFeatures<Map<String, String>, String> data) {
		        return new ReadOnlyStringWrapper(data.getValue().get("IfRefund"));
		    }
		});	
		tablePayment.getColumns().add(tablePayment_IfRefund);
		
		//table data
		ObservableList<Map<String, String>> dataPayment = FXCollections.observableArrayList();
		List<Payment> rsPayment = EntityManager.getAllInstancesOf("Payment");
		for (Payment r : rsPayment) {
			//table entry
			Map<String, String> unit = new HashMap<String, String>();
			if (r.getOrderId() != null)
				unit.put("OrderId", String.valueOf(r.getOrderId()));
			else
				unit.put("OrderId", "");
			if (r.getGoodsId() != null)
				unit.put("GoodsId", String.valueOf(r.getGoodsId()));
			else
				unit.put("GoodsId", "");
			if (r.getGoodsName() != null)
				unit.put("GoodsName", String.valueOf(r.getGoodsName()));
			else
				unit.put("GoodsName", "");
			if (r.getGoodsPrice() != null)
				unit.put("GoodsPrice", String.valueOf(r.getGoodsPrice()));
			else
				unit.put("GoodsPrice", "");
			if (r.getTotalPrice() != null)
				unit.put("TotalPrice", String.valueOf(r.getTotalPrice()));
			else
				unit.put("TotalPrice", "");
			if (r.getUserId() != null)
				unit.put("UserId", String.valueOf(r.getUserId()));
			else
				unit.put("UserId", "");
			unit.put("OrderAffair", String.valueOf(r.getOrderAffair()));
			
			unit.put("IfPay", String.valueOf(r.getIfPay()));
			unit.put("IfRefund", String.valueOf(r.getIfRefund()));

			dataPayment.add(unit);
		}
		
		tablePayment.getSelectionModel().selectedIndexProperty().addListener(
							 (observable, oldValue, newValue) ->  { 
							 										 //get selected index
							 										 objectindex = tablePayment.getSelectionModel().getSelectedIndex();
							 			 				 			 System.out.println("select: " + objectindex);

							 			 				 			 //update association object information
							 			 				 			 if (objectindex != -1)
										 			 					 updateAssociation("Payment", objectindex);
							 			 				 			 
							 			 				 		  });
		
		tablePayment.setItems(dataPayment);
		allObjectTables.put("Payment", tablePayment);
		

		
	}
	
	/* 
	* update all object tables with sub dataset
	*/ 
	public void updateUserTable(List<User> rsUser) {
			ObservableList<Map<String, String>> dataUser = FXCollections.observableArrayList();
			for (User r : rsUser) {
				Map<String, String> unit = new HashMap<String, String>();
				
				
				unit.put("UserId", String.valueOf(r.getUserId()));
				if (r.getUserName() != null)
					unit.put("UserName", String.valueOf(r.getUserName()));
				else
					unit.put("UserName", "");
				if (r.getPassword() != null)
					unit.put("Password", String.valueOf(r.getPassword()));
				else
					unit.put("Password", "");
				unit.put("UserStatus", String.valueOf(r.getUserStatus()));
				if (r.getIdentity() != null)
					unit.put("Identity", String.valueOf(r.getIdentity()));
				else
					unit.put("Identity", "");
				dataUser.add(unit);
			}
			
			allObjectTables.get("User").setItems(dataUser);
	}
	public void updateCustomerTable(List<Customer> rsCustomer) {
			ObservableList<Map<String, String>> dataCustomer = FXCollections.observableArrayList();
			for (Customer r : rsCustomer) {
				Map<String, String> unit = new HashMap<String, String>();
				
				unit.put("UserId", String.valueOf(r.getUserId()));
				if (r.getUserName() != null)
					unit.put("UserName", String.valueOf(r.getUserName()));
				else
					unit.put("UserName", "");
				if (r.getPassword() != null)
					unit.put("Password", String.valueOf(r.getPassword()));
				else
					unit.put("Password", "");
				unit.put("UserStatus", String.valueOf(r.getUserStatus()));
				if (r.getIdentity() != null)
					unit.put("Identity", String.valueOf(r.getIdentity()));
				else
					unit.put("Identity", "");
				
				unit.put("OrderNum", String.valueOf(r.getOrderNum()));
				dataCustomer.add(unit);
			}
			
			allObjectTables.get("Customer").setItems(dataCustomer);
	}
	public void updateAdminTable(List<Admin> rsAdmin) {
			ObservableList<Map<String, String>> dataAdmin = FXCollections.observableArrayList();
			for (Admin r : rsAdmin) {
				Map<String, String> unit = new HashMap<String, String>();
				
				unit.put("UserId", String.valueOf(r.getUserId()));
				if (r.getUserName() != null)
					unit.put("UserName", String.valueOf(r.getUserName()));
				else
					unit.put("UserName", "");
				if (r.getPassword() != null)
					unit.put("Password", String.valueOf(r.getPassword()));
				else
					unit.put("Password", "");
				unit.put("UserStatus", String.valueOf(r.getUserStatus()));
				if (r.getIdentity() != null)
					unit.put("Identity", String.valueOf(r.getIdentity()));
				else
					unit.put("Identity", "");
				
				unit.put("PlaceOrderNum", String.valueOf(r.getPlaceOrderNum()));
				dataAdmin.add(unit);
			}
			
			allObjectTables.get("Admin").setItems(dataAdmin);
	}
	public void updateSuperAdminTable(List<SuperAdmin> rsSuperAdmin) {
			ObservableList<Map<String, String>> dataSuperAdmin = FXCollections.observableArrayList();
			for (SuperAdmin r : rsSuperAdmin) {
				Map<String, String> unit = new HashMap<String, String>();
				
				unit.put("UserId", String.valueOf(r.getUserId()));
				if (r.getUserName() != null)
					unit.put("UserName", String.valueOf(r.getUserName()));
				else
					unit.put("UserName", "");
				if (r.getPassword() != null)
					unit.put("Password", String.valueOf(r.getPassword()));
				else
					unit.put("Password", "");
				unit.put("UserStatus", String.valueOf(r.getUserStatus()));
				if (r.getIdentity() != null)
					unit.put("Identity", String.valueOf(r.getIdentity()));
				else
					unit.put("Identity", "");
				
				if (r.getIntroduce() != null)
					unit.put("Introduce", String.valueOf(r.getIntroduce()));
				else
					unit.put("Introduce", "");
				dataSuperAdmin.add(unit);
			}
			
			allObjectTables.get("SuperAdmin").setItems(dataSuperAdmin);
	}
	public void updateOrdersTable(List<Orders> rsOrders) {
			ObservableList<Map<String, String>> dataOrders = FXCollections.observableArrayList();
			for (Orders r : rsOrders) {
				Map<String, String> unit = new HashMap<String, String>();
				
				
				if (r.getOrderId() != null)
					unit.put("OrderId", String.valueOf(r.getOrderId()));
				else
					unit.put("OrderId", "");
				if (r.getGoodsId() != null)
					unit.put("GoodsId", String.valueOf(r.getGoodsId()));
				else
					unit.put("GoodsId", "");
				if (r.getGoodsName() != null)
					unit.put("GoodsName", String.valueOf(r.getGoodsName()));
				else
					unit.put("GoodsName", "");
				if (r.getGoodsPrice() != null)
					unit.put("GoodsPrice", String.valueOf(r.getGoodsPrice()));
				else
					unit.put("GoodsPrice", "");
				if (r.getTotalPrice() != null)
					unit.put("TotalPrice", String.valueOf(r.getTotalPrice()));
				else
					unit.put("TotalPrice", "");
				if (r.getUserId() != null)
					unit.put("UserId", String.valueOf(r.getUserId()));
				else
					unit.put("UserId", "");
				unit.put("OrderAffair", String.valueOf(r.getOrderAffair()));
				dataOrders.add(unit);
			}
			
			allObjectTables.get("Orders").setItems(dataOrders);
	}
	public void updateShoppingCartTable(List<ShoppingCart> rsShoppingCart) {
			ObservableList<Map<String, String>> dataShoppingCart = FXCollections.observableArrayList();
			for (ShoppingCart r : rsShoppingCart) {
				Map<String, String> unit = new HashMap<String, String>();
				
				
				unit.put("GoodsId", String.valueOf(r.getGoodsId()));
				if (r.getGoodsName() != null)
					unit.put("GoodsName", String.valueOf(r.getGoodsName()));
				else
					unit.put("GoodsName", "");
				if (r.getGoodsNum() != null)
					unit.put("GoodsNum", String.valueOf(r.getGoodsNum()));
				else
					unit.put("GoodsNum", "");
				if (r.getGoodsPrice() != null)
					unit.put("GoodsPrice", String.valueOf(r.getGoodsPrice()));
				else
					unit.put("GoodsPrice", "");
				unit.put("CartAffair", String.valueOf(r.getCartAffair()));
				unit.put("UserId", String.valueOf(r.getUserId()));
				if (r.getTotalPrice() != null)
					unit.put("TotalPrice", String.valueOf(r.getTotalPrice()));
				else
					unit.put("TotalPrice", "");
				dataShoppingCart.add(unit);
			}
			
			allObjectTables.get("ShoppingCart").setItems(dataShoppingCart);
	}
	public void updateCommodityTable(List<Commodity> rsCommodity) {
			ObservableList<Map<String, String>> dataCommodity = FXCollections.observableArrayList();
			for (Commodity r : rsCommodity) {
				Map<String, String> unit = new HashMap<String, String>();
				
				unit.put("GoodsId", String.valueOf(r.getGoodsId()));
				if (r.getGoodsName() != null)
					unit.put("GoodsName", String.valueOf(r.getGoodsName()));
				else
					unit.put("GoodsName", "");
				if (r.getGoodsNum() != null)
					unit.put("GoodsNum", String.valueOf(r.getGoodsNum()));
				else
					unit.put("GoodsNum", "");
				if (r.getGoodsPrice() != null)
					unit.put("GoodsPrice", String.valueOf(r.getGoodsPrice()));
				else
					unit.put("GoodsPrice", "");
				
				unit.put("ModifyPrice", String.valueOf(r.getModifyPrice()));
				unit.put("ComAffair", String.valueOf(r.getComAffair()));
				dataCommodity.add(unit);
			}
			
			allObjectTables.get("Commodity").setItems(dataCommodity);
	}
	public void updateGoodsTable(List<Goods> rsGoods) {
			ObservableList<Map<String, String>> dataGoods = FXCollections.observableArrayList();
			for (Goods r : rsGoods) {
				Map<String, String> unit = new HashMap<String, String>();
				
				
				unit.put("GoodsId", String.valueOf(r.getGoodsId()));
				if (r.getGoodsName() != null)
					unit.put("GoodsName", String.valueOf(r.getGoodsName()));
				else
					unit.put("GoodsName", "");
				if (r.getGoodsNum() != null)
					unit.put("GoodsNum", String.valueOf(r.getGoodsNum()));
				else
					unit.put("GoodsNum", "");
				if (r.getGoodsPrice() != null)
					unit.put("GoodsPrice", String.valueOf(r.getGoodsPrice()));
				else
					unit.put("GoodsPrice", "");
				dataGoods.add(unit);
			}
			
			allObjectTables.get("Goods").setItems(dataGoods);
	}
	public void updatePaymentTable(List<Payment> rsPayment) {
			ObservableList<Map<String, String>> dataPayment = FXCollections.observableArrayList();
			for (Payment r : rsPayment) {
				Map<String, String> unit = new HashMap<String, String>();
				
				if (r.getOrderId() != null)
					unit.put("OrderId", String.valueOf(r.getOrderId()));
				else
					unit.put("OrderId", "");
				if (r.getGoodsId() != null)
					unit.put("GoodsId", String.valueOf(r.getGoodsId()));
				else
					unit.put("GoodsId", "");
				if (r.getGoodsName() != null)
					unit.put("GoodsName", String.valueOf(r.getGoodsName()));
				else
					unit.put("GoodsName", "");
				if (r.getGoodsPrice() != null)
					unit.put("GoodsPrice", String.valueOf(r.getGoodsPrice()));
				else
					unit.put("GoodsPrice", "");
				if (r.getTotalPrice() != null)
					unit.put("TotalPrice", String.valueOf(r.getTotalPrice()));
				else
					unit.put("TotalPrice", "");
				if (r.getUserId() != null)
					unit.put("UserId", String.valueOf(r.getUserId()));
				else
					unit.put("UserId", "");
				unit.put("OrderAffair", String.valueOf(r.getOrderAffair()));
				
				unit.put("IfPay", String.valueOf(r.getIfPay()));
				unit.put("IfRefund", String.valueOf(r.getIfRefund()));
				dataPayment.add(unit);
			}
			
			allObjectTables.get("Payment").setItems(dataPayment);
	}
	
	/* 
	* update all object tables
	*/ 
	public void updateUserTable() {
			ObservableList<Map<String, String>> dataUser = FXCollections.observableArrayList();
			List<User> rsUser = EntityManager.getAllInstancesOf("User");
			for (User r : rsUser) {
				Map<String, String> unit = new HashMap<String, String>();


				unit.put("UserId", String.valueOf(r.getUserId()));
				if (r.getUserName() != null)
					unit.put("UserName", String.valueOf(r.getUserName()));
				else
					unit.put("UserName", "");
				if (r.getPassword() != null)
					unit.put("Password", String.valueOf(r.getPassword()));
				else
					unit.put("Password", "");
				unit.put("UserStatus", String.valueOf(r.getUserStatus()));
				if (r.getIdentity() != null)
					unit.put("Identity", String.valueOf(r.getIdentity()));
				else
					unit.put("Identity", "");
				dataUser.add(unit);
			}
			
			allObjectTables.get("User").setItems(dataUser);
	}
	public void updateCustomerTable() {
			ObservableList<Map<String, String>> dataCustomer = FXCollections.observableArrayList();
			List<Customer> rsCustomer = EntityManager.getAllInstancesOf("Customer");
			for (Customer r : rsCustomer) {
				Map<String, String> unit = new HashMap<String, String>();

				unit.put("UserId", String.valueOf(r.getUserId()));
				if (r.getUserName() != null)
					unit.put("UserName", String.valueOf(r.getUserName()));
				else
					unit.put("UserName", "");
				if (r.getPassword() != null)
					unit.put("Password", String.valueOf(r.getPassword()));
				else
					unit.put("Password", "");
				unit.put("UserStatus", String.valueOf(r.getUserStatus()));
				if (r.getIdentity() != null)
					unit.put("Identity", String.valueOf(r.getIdentity()));
				else
					unit.put("Identity", "");

				unit.put("OrderNum", String.valueOf(r.getOrderNum()));
				dataCustomer.add(unit);
			}
			
			allObjectTables.get("Customer").setItems(dataCustomer);
	}
	public void updateAdminTable() {
			ObservableList<Map<String, String>> dataAdmin = FXCollections.observableArrayList();
			List<Admin> rsAdmin = EntityManager.getAllInstancesOf("Admin");
			for (Admin r : rsAdmin) {
				Map<String, String> unit = new HashMap<String, String>();

				unit.put("UserId", String.valueOf(r.getUserId()));
				if (r.getUserName() != null)
					unit.put("UserName", String.valueOf(r.getUserName()));
				else
					unit.put("UserName", "");
				if (r.getPassword() != null)
					unit.put("Password", String.valueOf(r.getPassword()));
				else
					unit.put("Password", "");
				unit.put("UserStatus", String.valueOf(r.getUserStatus()));
				if (r.getIdentity() != null)
					unit.put("Identity", String.valueOf(r.getIdentity()));
				else
					unit.put("Identity", "");

				unit.put("PlaceOrderNum", String.valueOf(r.getPlaceOrderNum()));
				dataAdmin.add(unit);
			}
			
			allObjectTables.get("Admin").setItems(dataAdmin);
	}
	public void updateSuperAdminTable() {
			ObservableList<Map<String, String>> dataSuperAdmin = FXCollections.observableArrayList();
			List<SuperAdmin> rsSuperAdmin = EntityManager.getAllInstancesOf("SuperAdmin");
			for (SuperAdmin r : rsSuperAdmin) {
				Map<String, String> unit = new HashMap<String, String>();

				unit.put("UserId", String.valueOf(r.getUserId()));
				if (r.getUserName() != null)
					unit.put("UserName", String.valueOf(r.getUserName()));
				else
					unit.put("UserName", "");
				if (r.getPassword() != null)
					unit.put("Password", String.valueOf(r.getPassword()));
				else
					unit.put("Password", "");
				unit.put("UserStatus", String.valueOf(r.getUserStatus()));
				if (r.getIdentity() != null)
					unit.put("Identity", String.valueOf(r.getIdentity()));
				else
					unit.put("Identity", "");

				if (r.getIntroduce() != null)
					unit.put("Introduce", String.valueOf(r.getIntroduce()));
				else
					unit.put("Introduce", "");
				dataSuperAdmin.add(unit);
			}
			
			allObjectTables.get("SuperAdmin").setItems(dataSuperAdmin);
	}
	public void updateOrdersTable() {
			ObservableList<Map<String, String>> dataOrders = FXCollections.observableArrayList();
			List<Orders> rsOrders = EntityManager.getAllInstancesOf("Orders");
			for (Orders r : rsOrders) {
				Map<String, String> unit = new HashMap<String, String>();


				if (r.getOrderId() != null)
					unit.put("OrderId", String.valueOf(r.getOrderId()));
				else
					unit.put("OrderId", "");
				if (r.getGoodsId() != null)
					unit.put("GoodsId", String.valueOf(r.getGoodsId()));
				else
					unit.put("GoodsId", "");
				if (r.getGoodsName() != null)
					unit.put("GoodsName", String.valueOf(r.getGoodsName()));
				else
					unit.put("GoodsName", "");
				if (r.getGoodsPrice() != null)
					unit.put("GoodsPrice", String.valueOf(r.getGoodsPrice()));
				else
					unit.put("GoodsPrice", "");
				if (r.getTotalPrice() != null)
					unit.put("TotalPrice", String.valueOf(r.getTotalPrice()));
				else
					unit.put("TotalPrice", "");
				if (r.getUserId() != null)
					unit.put("UserId", String.valueOf(r.getUserId()));
				else
					unit.put("UserId", "");
				unit.put("OrderAffair", String.valueOf(r.getOrderAffair()));
				dataOrders.add(unit);
			}
			
			allObjectTables.get("Orders").setItems(dataOrders);
	}
	public void updateShoppingCartTable() {
			ObservableList<Map<String, String>> dataShoppingCart = FXCollections.observableArrayList();
			List<ShoppingCart> rsShoppingCart = EntityManager.getAllInstancesOf("ShoppingCart");
			for (ShoppingCart r : rsShoppingCart) {
				Map<String, String> unit = new HashMap<String, String>();


				unit.put("GoodsId", String.valueOf(r.getGoodsId()));
				if (r.getGoodsName() != null)
					unit.put("GoodsName", String.valueOf(r.getGoodsName()));
				else
					unit.put("GoodsName", "");
				if (r.getGoodsNum() != null)
					unit.put("GoodsNum", String.valueOf(r.getGoodsNum()));
				else
					unit.put("GoodsNum", "");
				if (r.getGoodsPrice() != null)
					unit.put("GoodsPrice", String.valueOf(r.getGoodsPrice()));
				else
					unit.put("GoodsPrice", "");
				unit.put("CartAffair", String.valueOf(r.getCartAffair()));
				unit.put("UserId", String.valueOf(r.getUserId()));
				if (r.getTotalPrice() != null)
					unit.put("TotalPrice", String.valueOf(r.getTotalPrice()));
				else
					unit.put("TotalPrice", "");
				dataShoppingCart.add(unit);
			}
			
			allObjectTables.get("ShoppingCart").setItems(dataShoppingCart);
	}
	public void updateCommodityTable() {
			ObservableList<Map<String, String>> dataCommodity = FXCollections.observableArrayList();
			List<Commodity> rsCommodity = EntityManager.getAllInstancesOf("Commodity");
			for (Commodity r : rsCommodity) {
				Map<String, String> unit = new HashMap<String, String>();

				unit.put("GoodsId", String.valueOf(r.getGoodsId()));
				if (r.getGoodsName() != null)
					unit.put("GoodsName", String.valueOf(r.getGoodsName()));
				else
					unit.put("GoodsName", "");
				if (r.getGoodsNum() != null)
					unit.put("GoodsNum", String.valueOf(r.getGoodsNum()));
				else
					unit.put("GoodsNum", "");
				if (r.getGoodsPrice() != null)
					unit.put("GoodsPrice", String.valueOf(r.getGoodsPrice()));
				else
					unit.put("GoodsPrice", "");

				unit.put("ModifyPrice", String.valueOf(r.getModifyPrice()));
				unit.put("ComAffair", String.valueOf(r.getComAffair()));
				dataCommodity.add(unit);
			}
			
			allObjectTables.get("Commodity").setItems(dataCommodity);
	}
	public void updateGoodsTable() {
			ObservableList<Map<String, String>> dataGoods = FXCollections.observableArrayList();
			List<Goods> rsGoods = EntityManager.getAllInstancesOf("Goods");
			for (Goods r : rsGoods) {
				Map<String, String> unit = new HashMap<String, String>();


				unit.put("GoodsId", String.valueOf(r.getGoodsId()));
				if (r.getGoodsName() != null)
					unit.put("GoodsName", String.valueOf(r.getGoodsName()));
				else
					unit.put("GoodsName", "");
				if (r.getGoodsNum() != null)
					unit.put("GoodsNum", String.valueOf(r.getGoodsNum()));
				else
					unit.put("GoodsNum", "");
				if (r.getGoodsPrice() != null)
					unit.put("GoodsPrice", String.valueOf(r.getGoodsPrice()));
				else
					unit.put("GoodsPrice", "");
				dataGoods.add(unit);
			}
			
			allObjectTables.get("Goods").setItems(dataGoods);
	}
	public void updatePaymentTable() {
			ObservableList<Map<String, String>> dataPayment = FXCollections.observableArrayList();
			List<Payment> rsPayment = EntityManager.getAllInstancesOf("Payment");
			for (Payment r : rsPayment) {
				Map<String, String> unit = new HashMap<String, String>();

				if (r.getOrderId() != null)
					unit.put("OrderId", String.valueOf(r.getOrderId()));
				else
					unit.put("OrderId", "");
				if (r.getGoodsId() != null)
					unit.put("GoodsId", String.valueOf(r.getGoodsId()));
				else
					unit.put("GoodsId", "");
				if (r.getGoodsName() != null)
					unit.put("GoodsName", String.valueOf(r.getGoodsName()));
				else
					unit.put("GoodsName", "");
				if (r.getGoodsPrice() != null)
					unit.put("GoodsPrice", String.valueOf(r.getGoodsPrice()));
				else
					unit.put("GoodsPrice", "");
				if (r.getTotalPrice() != null)
					unit.put("TotalPrice", String.valueOf(r.getTotalPrice()));
				else
					unit.put("TotalPrice", "");
				if (r.getUserId() != null)
					unit.put("UserId", String.valueOf(r.getUserId()));
				else
					unit.put("UserId", "");
				unit.put("OrderAffair", String.valueOf(r.getOrderAffair()));

				unit.put("IfPay", String.valueOf(r.getIfPay()));
				unit.put("IfRefund", String.valueOf(r.getIfRefund()));
				dataPayment.add(unit);
			}
			
			allObjectTables.get("Payment").setItems(dataPayment);
	}
	
	public void classStatisicBingding() {
	
		 classInfodata = FXCollections.observableArrayList();
	 	 user = new ClassInfo("User", EntityManager.getAllInstancesOf("User").size());
	 	 classInfodata.add(user);
	 	 customer = new ClassInfo("Customer", EntityManager.getAllInstancesOf("Customer").size());
	 	 classInfodata.add(customer);
	 	 admin = new ClassInfo("Admin", EntityManager.getAllInstancesOf("Admin").size());
	 	 classInfodata.add(admin);
	 	 superadmin = new ClassInfo("SuperAdmin", EntityManager.getAllInstancesOf("SuperAdmin").size());
	 	 classInfodata.add(superadmin);
	 	 orders = new ClassInfo("Orders", EntityManager.getAllInstancesOf("Orders").size());
	 	 classInfodata.add(orders);
	 	 shoppingcart = new ClassInfo("ShoppingCart", EntityManager.getAllInstancesOf("ShoppingCart").size());
	 	 classInfodata.add(shoppingcart);
	 	 commodity = new ClassInfo("Commodity", EntityManager.getAllInstancesOf("Commodity").size());
	 	 classInfodata.add(commodity);
	 	 goods = new ClassInfo("Goods", EntityManager.getAllInstancesOf("Goods").size());
	 	 classInfodata.add(goods);
	 	 payment = new ClassInfo("Payment", EntityManager.getAllInstancesOf("Payment").size());
	 	 classInfodata.add(payment);
	 	 
		 class_statisic.setItems(classInfodata);
		 
		 //Class Statisic Binding
		 class_statisic.getSelectionModel().selectedItemProperty().addListener(
				 (observable, oldValue, newValue) ->  { 
				 										 //no selected object in table
				 										 objectindex = -1;
				 										 
				 										 //get lastest data, reflect updateTableData method
				 										 try {
												 			 Method updateob = this.getClass().getMethod("update" + newValue.getName() + "Table", null);
												 			 updateob.invoke(this);			 
												 		 } catch (Exception e) {
												 		 	 e.printStackTrace();
												 		 }		 										 
				 	
				 										 //show object table
				 			 				 			 TableView obs = allObjectTables.get(newValue.getName());
				 			 				 			 if (obs != null) {
				 			 				 				object_statics.setContent(obs);
				 			 				 				object_statics.setText("All Objects " + newValue.getName() + ":");
				 			 				 			 }
				 			 				 			 
				 			 				 			 //update association information
							 			 				 updateAssociation(newValue.getName());
				 			 				 			 
				 			 				 			 //show association information
				 			 				 			 ObservableList<AssociationInfo> asso = allassociationData.get(newValue.getName());
				 			 				 			 if (asso != null) {
				 			 				 			 	association_statisic.setItems(asso);
				 			 				 			 }
				 			 				 		  });
	}
	
	public void classStatisticUpdate() {
	 	 user.setNumber(EntityManager.getAllInstancesOf("User").size());
	 	 customer.setNumber(EntityManager.getAllInstancesOf("Customer").size());
	 	 admin.setNumber(EntityManager.getAllInstancesOf("Admin").size());
	 	 superadmin.setNumber(EntityManager.getAllInstancesOf("SuperAdmin").size());
	 	 orders.setNumber(EntityManager.getAllInstancesOf("Orders").size());
	 	 shoppingcart.setNumber(EntityManager.getAllInstancesOf("ShoppingCart").size());
	 	 commodity.setNumber(EntityManager.getAllInstancesOf("Commodity").size());
	 	 goods.setNumber(EntityManager.getAllInstancesOf("Goods").size());
	 	 payment.setNumber(EntityManager.getAllInstancesOf("Payment").size());
		
	}
	
	/**
	 * association binding
	 */
	public void associationStatisicBingding() {
		
		allassociationData = new HashMap<String, ObservableList<AssociationInfo>>();
		
		ObservableList<AssociationInfo> User_association_data = FXCollections.observableArrayList();
		
		allassociationData.put("User", User_association_data);
		
		ObservableList<AssociationInfo> Customer_association_data = FXCollections.observableArrayList();
		AssociationInfo Customer_associatition_CustomerHasOrders = new AssociationInfo("Customer", "Orders", "CustomerHasOrders", true);
		Customer_association_data.add(Customer_associatition_CustomerHasOrders);
		
		allassociationData.put("Customer", Customer_association_data);
		
		ObservableList<AssociationInfo> Admin_association_data = FXCollections.observableArrayList();
		
		allassociationData.put("Admin", Admin_association_data);
		
		ObservableList<AssociationInfo> SuperAdmin_association_data = FXCollections.observableArrayList();
		
		allassociationData.put("SuperAdmin", SuperAdmin_association_data);
		
		ObservableList<AssociationInfo> Orders_association_data = FXCollections.observableArrayList();
		AssociationInfo Orders_associatition_OrderstoUser = new AssociationInfo("Orders", "User", "OrderstoUser", false);
		Orders_association_data.add(Orders_associatition_OrderstoUser);
		AssociationInfo Orders_associatition_OrdersOfCustomer = new AssociationInfo("Orders", "Customer", "OrdersOfCustomer", false);
		Orders_association_data.add(Orders_associatition_OrdersOfCustomer);
		AssociationInfo Orders_associatition_OrdersFromShoppingCart = new AssociationInfo("Orders", "ShoppingCart", "OrdersFromShoppingCart", false);
		Orders_association_data.add(Orders_associatition_OrdersFromShoppingCart);
		AssociationInfo Orders_associatition_OrdersHasGoods = new AssociationInfo("Orders", "Goods", "OrdersHasGoods", true);
		Orders_association_data.add(Orders_associatition_OrdersHasGoods);
		
		allassociationData.put("Orders", Orders_association_data);
		
		ObservableList<AssociationInfo> ShoppingCart_association_data = FXCollections.observableArrayList();
		AssociationInfo ShoppingCart_associatition_ShoppingCartToOrders = new AssociationInfo("ShoppingCart", "Orders", "ShoppingCartToOrders", false);
		ShoppingCart_association_data.add(ShoppingCart_associatition_ShoppingCartToOrders);
		AssociationInfo ShoppingCart_associatition_ShoppingCartHasGoods = new AssociationInfo("ShoppingCart", "Goods", "ShoppingCartHasGoods", true);
		ShoppingCart_association_data.add(ShoppingCart_associatition_ShoppingCartHasGoods);
		
		allassociationData.put("ShoppingCart", ShoppingCart_association_data);
		
		ObservableList<AssociationInfo> Commodity_association_data = FXCollections.observableArrayList();
		
		allassociationData.put("Commodity", Commodity_association_data);
		
		ObservableList<AssociationInfo> Goods_association_data = FXCollections.observableArrayList();
		AssociationInfo Goods_associatition_GoodsInShoppingCart = new AssociationInfo("Goods", "ShoppingCart", "GoodsInShoppingCart", true);
		Goods_association_data.add(Goods_associatition_GoodsInShoppingCart);
		AssociationInfo Goods_associatition_GoodsInOrders = new AssociationInfo("Goods", "Orders", "GoodsInOrders", true);
		Goods_association_data.add(Goods_associatition_GoodsInOrders);
		
		allassociationData.put("Goods", Goods_association_data);
		
		ObservableList<AssociationInfo> Payment_association_data = FXCollections.observableArrayList();
		
		allassociationData.put("Payment", Payment_association_data);
		
		
		association_statisic.getSelectionModel().selectedItemProperty().addListener(
			    (observable, oldValue, newValue) ->  { 
	
							 		if (newValue != null) {
							 			 try {
							 			 	 if (newValue.getNumber() != 0) {
								 				 //choose object or not
								 				 if (objectindex != -1) {
									 				 Class[] cArg = new Class[1];
									 				 cArg[0] = List.class;
									 				 //reflect updateTableData method
										 			 Method updateob = this.getClass().getMethod("update" + newValue.getTargetClass() + "Table", cArg);
										 			 //find choosen object
										 			 Object selectedob = EntityManager.getAllInstancesOf(newValue.getSourceClass()).get(objectindex);
										 			 //reflect find association method
										 			 Method getAssociatedObject = selectedob.getClass().getMethod("get" + newValue.getAssociationName());
										 			 List r = new LinkedList();
										 			 //one or mulity?
										 			 if (newValue.getIsMultiple() == true) {
											 			 
											 			r = (List) getAssociatedObject.invoke(selectedob);
										 			 }
										 			 else {
										 				r.add(getAssociatedObject.invoke(selectedob));
										 			 }
										 			 //invoke update method
										 			 updateob.invoke(this, r);
										 			  
										 			 
								 				 }
												 //bind updated data to GUI
					 				 			 TableView obs = allObjectTables.get(newValue.getTargetClass());
					 				 			 if (obs != null) {
					 				 				object_statics.setContent(obs);
					 				 				object_statics.setText("Targets Objects " + newValue.getTargetClass() + ":");
					 				 			 }
					 				 		 }
							 			 }
							 			 catch (Exception e) {
							 				 e.printStackTrace();
							 			 }
							 		}
					 		  });
		
	}	
	
	

    //prepare data for contract
	public void prepareData() {
		
		//definition map
		definitions_map = new HashMap<String, String>();
		definitions_map.put("addCart", "cart:ShoppingCart = ShoppingCart.allInstance()->any(c:ShoppingCart | c.GoodsId = goodsId)\r\r\n");
		definitions_map.put("browseGoods", "customer:User = User.allInstance()->any(cust:User | cust.UserId = id)\r\r\n");
		definitions_map.put("browseCart", "cart:ShoppingCart = ShoppingCart.allInstance()->any(c:ShoppingCart | c.GoodsId = goodsId)\r\r\n");
		definitions_map.put("deleteCart", "cart:ShoppingCart = ShoppingCart.allInstance()->any(c:ShoppingCart | c.GoodsId = goodsId)\r\r\n");
		definitions_map.put("orderPay", "order:Orders = Orders.allInstance()->any(o:Orders | o.OrderId = orderId)\r\r\n");
		definitions_map.put("applyRefund", "order:Orders = Orders.allInstance()->any(o:Orders | o.OrderId = orderId)\r\r\n");
		definitions_map.put("browseOrder", "order:Orders = Orders.allInstance()->any(o:Orders | o.OrderId = orderId)\r\r\n");
		definitions_map.put("deleteOrder", "order:Orders = Orders.allInstance()->any(o:Orders | o.OrderId = orderId)\r\r\n");
		definitions_map.put("refuseRefund", "order:Orders = Orders.allInstance()->any(o:Orders | o.OrderId = orderId)\r\r\n");
		definitions_map.put("agreeRefund", "order:Orders = Orders.allInstance()->any(o:Orders | o.OrderId = orderId)\r\r\n");
		definitions_map.put("addGoods", "commodity:Commodity = Commodity.allInstance()->any(comm:Commodity | comm.GoodsId = goodsId)\r\r\n");
		definitions_map.put("deleteGoods", "commodity:Commodity = Commodity.allInstance()->any(comm:Commodity | comm.GoodsId = goodsId)\r\r\n");
		definitions_map.put("checkGoods", "commodity:Commodity = Commodity.allInstance()->any(comm:Commodity | comm.GoodsId = goodsId)\r\r\n");
		definitions_map.put("modifyPrice", "commodity:Commodity = Commodity.allInstance()->any(comm:Commodity | comm.GoodsId = goodsId)\r\r\n");
		definitions_map.put("browseUser", "admin:User = User.allInstance()->any(cust:User | cust.UserId = id)\r\r\n");
		definitions_map.put("addUser", "admin:User = User.allInstance()->any(cust:User | cust.UserId = id)\r\r\n");
		definitions_map.put("deleteUser", "admin:User = User.allInstance()->any(cust:User | cust.UserId = id)\r\r\n");
		
		//precondition map
		preconditions_map = new HashMap<String, String>();
		preconditions_map.put("addCart", "cart.oclIsUndefined() = true and\ncart.CartAffair = CartAffairType::ADD\n");
		preconditions_map.put("browseGoods", "customer.oclIsUndefined() = true and\ncustomer.UserStatus = UserStatus::CUSTOMER\n");
		preconditions_map.put("browseCart", "cart.oclIsUndefined() = true and\ncart.CartAffair = CartAffairType::BROWSE\n");
		preconditions_map.put("deleteCart", "cart.oclIsUndefined() = true and\ncart.CartAffair = CartAffairType::DELETE\n");
		preconditions_map.put("orderPay", "order.oclIsUndefined() = true");
		preconditions_map.put("applyRefund", "order.oclIsUndefined() = true");
		preconditions_map.put("browseOrder", "order.oclIsUndefined() = true and\norder.OrderAffair = OrderAffairType::BROWSE\n");
		preconditions_map.put("deleteOrder", "order.oclIsUndefined() = true and\norder.OrderAffair = OrderAffairType::DELETE\n");
		preconditions_map.put("refuseRefund", "order.oclIsUndefined() = true");
		preconditions_map.put("agreeRefund", "order.oclIsUndefined() = true");
		preconditions_map.put("addGoods", "commodity.oclIsUndefined() = true and\ncommodity.ComAffiar = ComAffiarType::ADD\n");
		preconditions_map.put("deleteGoods", "commodity.oclIsUndefined() = true and\ncommodity.ComAffiar = ComAffiarType::DELETE\n");
		preconditions_map.put("checkGoods", "commodity.oclIsUndefined() = true and\ncommodity.ComAffiar = ComAffiarType::CHECK\n");
		preconditions_map.put("modifyPrice", "commodity.oclIsUndefined() = true and\ncommodity.ComAffiar = ComAffiarType::MODIFYPRICE\n");
		preconditions_map.put("browseUser", "admin.oclIsUndefined() = false and\nadmin.UserStatus = UserStatus::SUPERADMIN\n");
		preconditions_map.put("addUser", "admin.oclIsUndefined() = false and\nadmin.UserStatus = UserStatus::SUPERADMIN\n");
		preconditions_map.put("deleteUser", "admin.oclIsUndefined() = false and\nadmin.UserStatus = UserStatus::SUPERADMIN\n");
		
		//postcondition map
		postconditions_map = new HashMap<String, String>();
		postconditions_map.put("addCart", "let c:ShoppingCart inc.oclIsNew() and\nc.Goodsid = goodsId and\nc.GoodsName = goodsname and\nc.GoodsNum = goodsNum and\nc.GoodsPrice = goodsPrice and\nShoppingCart.allInstance()->includes(c) and\nresult = true\n");
		postconditions_map.put("browseGoods", "let cust:User incust.oclIsNew() and\ncust.UserId = id and\ncust.UserName = name and\nUser.allInstance()->includes(cust) and\nresult = true\n");
		postconditions_map.put("browseCart", "let c:ShoppingCart inc.oclIsNew() and\nc.Goodsid = goodsId and\nc.GoodsName = goodsname and\nc.GoodsNum = goodsNum and\nc.GoodsPrice = goodsPrice and\nc.TotalPrice = totalPrice and\nShoppingCart.allInstance()->includes(c) and\nresult = true\n");
		postconditions_map.put("deleteCart", "let c:ShoppingCart inc.oclIsNew() and\nc.Goodsid = goodsId and\nc.GoodsName = goodsname and\nc.GoodsNum = goodsNum and\nc.TotalPrice = totalPrice and\nShoppingCart.allInstance()->includes(c) and\nresult = true\n");
		postconditions_map.put("orderPay", "let o:Orders ino.oclIsNew() and\no.OrderId = orderId and\no.Goodsid = goodsId and\no.GoodsName = goodsname and\no.GoodsNum = goodsNum and\no.TotalPrice = totalPrice and\nOrders.allInstance()->includes(o) and\nresult = true\n");
		postconditions_map.put("applyRefund", "let o:Orders ino.oclIsNew() and\no.TotalPrice = totalNum and\nOrders.allInstance()->includes(o) and\nresult = true\n");
		postconditions_map.put("browseOrder", "let o:Orders ino.oclIsNew() and\no.OrderId = orderId and\no.Goodsid = goodsId and\no.GoodsName = goodsname and\no.GoodsNum = goodsNum and\no.GoodsPrice = goodsPrice and\no.TotalPrice = totalPrice and\nOrders.allInstance()->includes(o) and\nresult = true\n");
		postconditions_map.put("deleteOrder", "let o:Orders ino.oclIsNew() and\no.OrderId = orderId and\no.TotalPrice = totalPrice and\nOrders.allInstance()->includes(o) and\nresult = true\n");
		postconditions_map.put("refuseRefund", "let o:Orders ino.oclIsNew() and\no.OrderId = orderId and\nOrders.allInstance()->includes(o) and\nresult = true\n");
		postconditions_map.put("agreeRefund", "let o:Orders ino.oclIsNew() and\no.OrderId = orderId and\no.Goodsid = goodsId and\no.GoodsName = goodsname and\no.GoodsNum = goodsNum and\no.TotalPrice = totalPrice and\nOrders.allInstance()->includes(o) and\nresult = true\n");
		postconditions_map.put("addGoods", "let comm:Commodity incomm.oclIsNew() and\ncomm.Goodsid = goodsId and\ncomm.GoodsName = goodsname and\ncomm.GoodsNum = totalNum + addNum and\nCommodity.allInstance()->includes(comm) and\nresult = true\n");
		postconditions_map.put("deleteGoods", "let comm:Commodity incomm.oclIsNew() and\ncomm.Goodsid = goodsId and\ncomm.GoodsName = goodsname and\ncomm.GoodsNum = totalNum - goodsNum and\nCommodity.allInstance()->includes(comm) and\nresult = true\n");
		postconditions_map.put("checkGoods", "let comm:Commodity incomm.oclIsNew() and\ncomm.Goodsid = goodsId and\ncomm.GoodsName = goodsname and\ncomm.GoodsPrice = goodsPrice and\ncomm.GoodsNum = totalNum and\nCommodity.allInstance()->includes(comm) and\nresult = true\n");
		postconditions_map.put("modifyPrice", "let comm:Commodity incomm.oclIsNew() and\ncomm.Goodsid = goodsId and\ncomm.GoodsName = goodsname and\ncomm.GoodsPrice = goodsPrice and\nCommodity.allInstance()->includes(comm) and\nresult = true\n");
		postconditions_map.put("browseUser", "let admin:User inadmin.oclIsNew() and\nadmin.UserId = id and\nadmin.UserName = name and\nadmin.Password = userPassword and\nadmin.Identity = identity and\nUser.allInstance()->includes(admin) and\nresult = true\n");
		postconditions_map.put("addUser", "let admin:User inadmin.oclIsNew() and\nadmin.UserId = id and\nadmin.UserName = name and\nadmin.Password = userPassword and\nadmin.Identity = identity and\nUser.allInstance()->includes(admin) and\nresult = true\n");
		postconditions_map.put("deleteUser", "let admin:User inadmin.oclIsNew() and\nadmin.UserId = id and\nadmin.UserName = name and\nadmin.Password = userPassword and\nadmin.Identity = identity and\nUser.allInstance()->includes(admin) and\nresult = true\n");
		
		//service invariants map
		service_invariants_map = new LinkedHashMap<String, String>();
		
		//entity invariants map
		entity_invariants_map = new LinkedHashMap<String, String>();
		
	}
	
	public void generatOperationPane() {
		
		 operationPanels = new LinkedHashMap<String, GridPane>();
		
		 // ==================== GridPane_addCart ====================
		 GridPane addCart = new GridPane();
		 addCart.setHgap(4);
		 addCart.setVgap(6);
		 addCart.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> addCart_content = addCart.getChildren();
		 Label addCart_goodsId_label = new Label("goodsId:");
		 addCart_goodsId_label.setMinWidth(Region.USE_PREF_SIZE);
		 addCart_content.add(addCart_goodsId_label);
		 GridPane.setConstraints(addCart_goodsId_label, 0, 0);
		 
		 addCart_goodsId_t = new TextField();
		 addCart_content.add(addCart_goodsId_t);
		 addCart_goodsId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(addCart_goodsId_t, 1, 0);
		 Label addCart_goodsName_label = new Label("goodsName:");
		 addCart_goodsName_label.setMinWidth(Region.USE_PREF_SIZE);
		 addCart_content.add(addCart_goodsName_label);
		 GridPane.setConstraints(addCart_goodsName_label, 0, 1);
		 
		 addCart_goodsName_t = new TextField();
		 addCart_content.add(addCart_goodsName_t);
		 addCart_goodsName_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(addCart_goodsName_t, 1, 1);
		 Label addCart_goodsNum_label = new Label("goodsNum:");
		 addCart_goodsNum_label.setMinWidth(Region.USE_PREF_SIZE);
		 addCart_content.add(addCart_goodsNum_label);
		 GridPane.setConstraints(addCart_goodsNum_label, 0, 2);
		 
		 addCart_goodsNum_t = new TextField();
		 addCart_content.add(addCart_goodsNum_t);
		 addCart_goodsNum_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(addCart_goodsNum_t, 1, 2);
		 Label addCart_goodsPrice_label = new Label("goodsPrice:");
		 addCart_goodsPrice_label.setMinWidth(Region.USE_PREF_SIZE);
		 addCart_content.add(addCart_goodsPrice_label);
		 GridPane.setConstraints(addCart_goodsPrice_label, 0, 3);
		 
		 addCart_goodsPrice_t = new TextField();
		 addCart_content.add(addCart_goodsPrice_t);
		 addCart_goodsPrice_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(addCart_goodsPrice_t, 1, 3);
		 operationPanels.put("addCart", addCart);
		 
		 // ==================== GridPane_browseGoods ====================
		 GridPane browseGoods = new GridPane();
		 browseGoods.setHgap(4);
		 browseGoods.setVgap(6);
		 browseGoods.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> browseGoods_content = browseGoods.getChildren();
		 Label browseGoods_id_label = new Label("id:");
		 browseGoods_id_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseGoods_content.add(browseGoods_id_label);
		 GridPane.setConstraints(browseGoods_id_label, 0, 0);
		 
		 browseGoods_id_t = new TextField();
		 browseGoods_content.add(browseGoods_id_t);
		 browseGoods_id_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseGoods_id_t, 1, 0);
		 Label browseGoods_name_label = new Label("name:");
		 browseGoods_name_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseGoods_content.add(browseGoods_name_label);
		 GridPane.setConstraints(browseGoods_name_label, 0, 1);
		 
		 browseGoods_name_t = new TextField();
		 browseGoods_content.add(browseGoods_name_t);
		 browseGoods_name_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseGoods_name_t, 1, 1);
		 operationPanels.put("browseGoods", browseGoods);
		 
		 // ==================== GridPane_browseCart ====================
		 GridPane browseCart = new GridPane();
		 browseCart.setHgap(4);
		 browseCart.setVgap(6);
		 browseCart.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> browseCart_content = browseCart.getChildren();
		 Label browseCart_goodsId_label = new Label("goodsId:");
		 browseCart_goodsId_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseCart_content.add(browseCart_goodsId_label);
		 GridPane.setConstraints(browseCart_goodsId_label, 0, 0);
		 
		 browseCart_goodsId_t = new TextField();
		 browseCart_content.add(browseCart_goodsId_t);
		 browseCart_goodsId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseCart_goodsId_t, 1, 0);
		 Label browseCart_goodsName_label = new Label("goodsName:");
		 browseCart_goodsName_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseCart_content.add(browseCart_goodsName_label);
		 GridPane.setConstraints(browseCart_goodsName_label, 0, 1);
		 
		 browseCart_goodsName_t = new TextField();
		 browseCart_content.add(browseCart_goodsName_t);
		 browseCart_goodsName_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseCart_goodsName_t, 1, 1);
		 Label browseCart_goodsNum_label = new Label("goodsNum:");
		 browseCart_goodsNum_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseCart_content.add(browseCart_goodsNum_label);
		 GridPane.setConstraints(browseCart_goodsNum_label, 0, 2);
		 
		 browseCart_goodsNum_t = new TextField();
		 browseCart_content.add(browseCart_goodsNum_t);
		 browseCart_goodsNum_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseCart_goodsNum_t, 1, 2);
		 Label browseCart_goodsPrice_label = new Label("goodsPrice:");
		 browseCart_goodsPrice_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseCart_content.add(browseCart_goodsPrice_label);
		 GridPane.setConstraints(browseCart_goodsPrice_label, 0, 3);
		 
		 browseCart_goodsPrice_t = new TextField();
		 browseCart_content.add(browseCart_goodsPrice_t);
		 browseCart_goodsPrice_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseCart_goodsPrice_t, 1, 3);
		 Label browseCart_totalPrice_label = new Label("totalPrice:");
		 browseCart_totalPrice_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseCart_content.add(browseCart_totalPrice_label);
		 GridPane.setConstraints(browseCart_totalPrice_label, 0, 4);
		 
		 browseCart_totalPrice_t = new TextField();
		 browseCart_content.add(browseCart_totalPrice_t);
		 browseCart_totalPrice_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseCart_totalPrice_t, 1, 4);
		 operationPanels.put("browseCart", browseCart);
		 
		 // ==================== GridPane_deleteCart ====================
		 GridPane deleteCart = new GridPane();
		 deleteCart.setHgap(4);
		 deleteCart.setVgap(6);
		 deleteCart.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> deleteCart_content = deleteCart.getChildren();
		 Label deleteCart_goodsId_label = new Label("goodsId:");
		 deleteCart_goodsId_label.setMinWidth(Region.USE_PREF_SIZE);
		 deleteCart_content.add(deleteCart_goodsId_label);
		 GridPane.setConstraints(deleteCart_goodsId_label, 0, 0);
		 
		 deleteCart_goodsId_t = new TextField();
		 deleteCart_content.add(deleteCart_goodsId_t);
		 deleteCart_goodsId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(deleteCart_goodsId_t, 1, 0);
		 Label deleteCart_goodsName_label = new Label("goodsName:");
		 deleteCart_goodsName_label.setMinWidth(Region.USE_PREF_SIZE);
		 deleteCart_content.add(deleteCart_goodsName_label);
		 GridPane.setConstraints(deleteCart_goodsName_label, 0, 1);
		 
		 deleteCart_goodsName_t = new TextField();
		 deleteCart_content.add(deleteCart_goodsName_t);
		 deleteCart_goodsName_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(deleteCart_goodsName_t, 1, 1);
		 Label deleteCart_goodsNum_label = new Label("goodsNum:");
		 deleteCart_goodsNum_label.setMinWidth(Region.USE_PREF_SIZE);
		 deleteCart_content.add(deleteCart_goodsNum_label);
		 GridPane.setConstraints(deleteCart_goodsNum_label, 0, 2);
		 
		 deleteCart_goodsNum_t = new TextField();
		 deleteCart_content.add(deleteCart_goodsNum_t);
		 deleteCart_goodsNum_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(deleteCart_goodsNum_t, 1, 2);
		 Label deleteCart_totalPrice_label = new Label("totalPrice:");
		 deleteCart_totalPrice_label.setMinWidth(Region.USE_PREF_SIZE);
		 deleteCart_content.add(deleteCart_totalPrice_label);
		 GridPane.setConstraints(deleteCart_totalPrice_label, 0, 3);
		 
		 deleteCart_totalPrice_t = new TextField();
		 deleteCart_content.add(deleteCart_totalPrice_t);
		 deleteCart_totalPrice_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(deleteCart_totalPrice_t, 1, 3);
		 operationPanels.put("deleteCart", deleteCart);
		 
		 // ==================== GridPane_orderPay ====================
		 GridPane orderPay = new GridPane();
		 orderPay.setHgap(4);
		 orderPay.setVgap(6);
		 orderPay.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> orderPay_content = orderPay.getChildren();
		 Label orderPay_orderId_label = new Label("orderId:");
		 orderPay_orderId_label.setMinWidth(Region.USE_PREF_SIZE);
		 orderPay_content.add(orderPay_orderId_label);
		 GridPane.setConstraints(orderPay_orderId_label, 0, 0);
		 
		 orderPay_orderId_t = new TextField();
		 orderPay_content.add(orderPay_orderId_t);
		 orderPay_orderId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(orderPay_orderId_t, 1, 0);
		 Label orderPay_goodsId_label = new Label("goodsId:");
		 orderPay_goodsId_label.setMinWidth(Region.USE_PREF_SIZE);
		 orderPay_content.add(orderPay_goodsId_label);
		 GridPane.setConstraints(orderPay_goodsId_label, 0, 1);
		 
		 orderPay_goodsId_t = new TextField();
		 orderPay_content.add(orderPay_goodsId_t);
		 orderPay_goodsId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(orderPay_goodsId_t, 1, 1);
		 Label orderPay_goodsName_label = new Label("goodsName:");
		 orderPay_goodsName_label.setMinWidth(Region.USE_PREF_SIZE);
		 orderPay_content.add(orderPay_goodsName_label);
		 GridPane.setConstraints(orderPay_goodsName_label, 0, 2);
		 
		 orderPay_goodsName_t = new TextField();
		 orderPay_content.add(orderPay_goodsName_t);
		 orderPay_goodsName_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(orderPay_goodsName_t, 1, 2);
		 Label orderPay_goodsNum_label = new Label("goodsNum:");
		 orderPay_goodsNum_label.setMinWidth(Region.USE_PREF_SIZE);
		 orderPay_content.add(orderPay_goodsNum_label);
		 GridPane.setConstraints(orderPay_goodsNum_label, 0, 3);
		 
		 orderPay_goodsNum_t = new TextField();
		 orderPay_content.add(orderPay_goodsNum_t);
		 orderPay_goodsNum_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(orderPay_goodsNum_t, 1, 3);
		 Label orderPay_totalPrice_label = new Label("totalPrice:");
		 orderPay_totalPrice_label.setMinWidth(Region.USE_PREF_SIZE);
		 orderPay_content.add(orderPay_totalPrice_label);
		 GridPane.setConstraints(orderPay_totalPrice_label, 0, 4);
		 
		 orderPay_totalPrice_t = new TextField();
		 orderPay_content.add(orderPay_totalPrice_t);
		 orderPay_totalPrice_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(orderPay_totalPrice_t, 1, 4);
		 operationPanels.put("orderPay", orderPay);
		 
		 // ==================== GridPane_applyRefund ====================
		 GridPane applyRefund = new GridPane();
		 applyRefund.setHgap(4);
		 applyRefund.setVgap(6);
		 applyRefund.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> applyRefund_content = applyRefund.getChildren();
		 Label applyRefund_orderID_label = new Label("orderID:");
		 applyRefund_orderID_label.setMinWidth(Region.USE_PREF_SIZE);
		 applyRefund_content.add(applyRefund_orderID_label);
		 GridPane.setConstraints(applyRefund_orderID_label, 0, 0);
		 
		 applyRefund_orderID_t = new TextField();
		 applyRefund_content.add(applyRefund_orderID_t);
		 applyRefund_orderID_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(applyRefund_orderID_t, 1, 0);
		 Label applyRefund_totalNum_label = new Label("totalNum:");
		 applyRefund_totalNum_label.setMinWidth(Region.USE_PREF_SIZE);
		 applyRefund_content.add(applyRefund_totalNum_label);
		 GridPane.setConstraints(applyRefund_totalNum_label, 0, 1);
		 
		 applyRefund_totalNum_t = new TextField();
		 applyRefund_content.add(applyRefund_totalNum_t);
		 applyRefund_totalNum_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(applyRefund_totalNum_t, 1, 1);
		 operationPanels.put("applyRefund", applyRefund);
		 
		 // ==================== GridPane_browseOrder ====================
		 GridPane browseOrder = new GridPane();
		 browseOrder.setHgap(4);
		 browseOrder.setVgap(6);
		 browseOrder.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> browseOrder_content = browseOrder.getChildren();
		 Label browseOrder_orderId_label = new Label("orderId:");
		 browseOrder_orderId_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseOrder_content.add(browseOrder_orderId_label);
		 GridPane.setConstraints(browseOrder_orderId_label, 0, 0);
		 
		 browseOrder_orderId_t = new TextField();
		 browseOrder_content.add(browseOrder_orderId_t);
		 browseOrder_orderId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseOrder_orderId_t, 1, 0);
		 Label browseOrder_goodsId_label = new Label("goodsId:");
		 browseOrder_goodsId_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseOrder_content.add(browseOrder_goodsId_label);
		 GridPane.setConstraints(browseOrder_goodsId_label, 0, 1);
		 
		 browseOrder_goodsId_t = new TextField();
		 browseOrder_content.add(browseOrder_goodsId_t);
		 browseOrder_goodsId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseOrder_goodsId_t, 1, 1);
		 Label browseOrder_goodsName_label = new Label("goodsName:");
		 browseOrder_goodsName_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseOrder_content.add(browseOrder_goodsName_label);
		 GridPane.setConstraints(browseOrder_goodsName_label, 0, 2);
		 
		 browseOrder_goodsName_t = new TextField();
		 browseOrder_content.add(browseOrder_goodsName_t);
		 browseOrder_goodsName_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseOrder_goodsName_t, 1, 2);
		 Label browseOrder_goodsPrice_label = new Label("goodsPrice:");
		 browseOrder_goodsPrice_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseOrder_content.add(browseOrder_goodsPrice_label);
		 GridPane.setConstraints(browseOrder_goodsPrice_label, 0, 3);
		 
		 browseOrder_goodsPrice_t = new TextField();
		 browseOrder_content.add(browseOrder_goodsPrice_t);
		 browseOrder_goodsPrice_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseOrder_goodsPrice_t, 1, 3);
		 Label browseOrder_totalPrice_label = new Label("totalPrice:");
		 browseOrder_totalPrice_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseOrder_content.add(browseOrder_totalPrice_label);
		 GridPane.setConstraints(browseOrder_totalPrice_label, 0, 4);
		 
		 browseOrder_totalPrice_t = new TextField();
		 browseOrder_content.add(browseOrder_totalPrice_t);
		 browseOrder_totalPrice_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseOrder_totalPrice_t, 1, 4);
		 operationPanels.put("browseOrder", browseOrder);
		 
		 // ==================== GridPane_deleteOrder ====================
		 GridPane deleteOrder = new GridPane();
		 deleteOrder.setHgap(4);
		 deleteOrder.setVgap(6);
		 deleteOrder.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> deleteOrder_content = deleteOrder.getChildren();
		 Label deleteOrder_orderId_label = new Label("orderId:");
		 deleteOrder_orderId_label.setMinWidth(Region.USE_PREF_SIZE);
		 deleteOrder_content.add(deleteOrder_orderId_label);
		 GridPane.setConstraints(deleteOrder_orderId_label, 0, 0);
		 
		 deleteOrder_orderId_t = new TextField();
		 deleteOrder_content.add(deleteOrder_orderId_t);
		 deleteOrder_orderId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(deleteOrder_orderId_t, 1, 0);
		 Label deleteOrder_totalPrice_label = new Label("totalPrice:");
		 deleteOrder_totalPrice_label.setMinWidth(Region.USE_PREF_SIZE);
		 deleteOrder_content.add(deleteOrder_totalPrice_label);
		 GridPane.setConstraints(deleteOrder_totalPrice_label, 0, 1);
		 
		 deleteOrder_totalPrice_t = new TextField();
		 deleteOrder_content.add(deleteOrder_totalPrice_t);
		 deleteOrder_totalPrice_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(deleteOrder_totalPrice_t, 1, 1);
		 operationPanels.put("deleteOrder", deleteOrder);
		 
		 // ==================== GridPane_refuseRefund ====================
		 GridPane refuseRefund = new GridPane();
		 refuseRefund.setHgap(4);
		 refuseRefund.setVgap(6);
		 refuseRefund.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> refuseRefund_content = refuseRefund.getChildren();
		 Label refuseRefund_orderId_label = new Label("orderId:");
		 refuseRefund_orderId_label.setMinWidth(Region.USE_PREF_SIZE);
		 refuseRefund_content.add(refuseRefund_orderId_label);
		 GridPane.setConstraints(refuseRefund_orderId_label, 0, 0);
		 
		 refuseRefund_orderId_t = new TextField();
		 refuseRefund_content.add(refuseRefund_orderId_t);
		 refuseRefund_orderId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(refuseRefund_orderId_t, 1, 0);
		 operationPanels.put("refuseRefund", refuseRefund);
		 
		 // ==================== GridPane_agreeRefund ====================
		 GridPane agreeRefund = new GridPane();
		 agreeRefund.setHgap(4);
		 agreeRefund.setVgap(6);
		 agreeRefund.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> agreeRefund_content = agreeRefund.getChildren();
		 Label agreeRefund_orderId_label = new Label("orderId:");
		 agreeRefund_orderId_label.setMinWidth(Region.USE_PREF_SIZE);
		 agreeRefund_content.add(agreeRefund_orderId_label);
		 GridPane.setConstraints(agreeRefund_orderId_label, 0, 0);
		 
		 agreeRefund_orderId_t = new TextField();
		 agreeRefund_content.add(agreeRefund_orderId_t);
		 agreeRefund_orderId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(agreeRefund_orderId_t, 1, 0);
		 Label agreeRefund_goodsId_label = new Label("goodsId:");
		 agreeRefund_goodsId_label.setMinWidth(Region.USE_PREF_SIZE);
		 agreeRefund_content.add(agreeRefund_goodsId_label);
		 GridPane.setConstraints(agreeRefund_goodsId_label, 0, 1);
		 
		 agreeRefund_goodsId_t = new TextField();
		 agreeRefund_content.add(agreeRefund_goodsId_t);
		 agreeRefund_goodsId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(agreeRefund_goodsId_t, 1, 1);
		 Label agreeRefund_goodsName_label = new Label("goodsName:");
		 agreeRefund_goodsName_label.setMinWidth(Region.USE_PREF_SIZE);
		 agreeRefund_content.add(agreeRefund_goodsName_label);
		 GridPane.setConstraints(agreeRefund_goodsName_label, 0, 2);
		 
		 agreeRefund_goodsName_t = new TextField();
		 agreeRefund_content.add(agreeRefund_goodsName_t);
		 agreeRefund_goodsName_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(agreeRefund_goodsName_t, 1, 2);
		 Label agreeRefund_goodsNum_label = new Label("goodsNum:");
		 agreeRefund_goodsNum_label.setMinWidth(Region.USE_PREF_SIZE);
		 agreeRefund_content.add(agreeRefund_goodsNum_label);
		 GridPane.setConstraints(agreeRefund_goodsNum_label, 0, 3);
		 
		 agreeRefund_goodsNum_t = new TextField();
		 agreeRefund_content.add(agreeRefund_goodsNum_t);
		 agreeRefund_goodsNum_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(agreeRefund_goodsNum_t, 1, 3);
		 Label agreeRefund_totalPrice_label = new Label("totalPrice:");
		 agreeRefund_totalPrice_label.setMinWidth(Region.USE_PREF_SIZE);
		 agreeRefund_content.add(agreeRefund_totalPrice_label);
		 GridPane.setConstraints(agreeRefund_totalPrice_label, 0, 4);
		 
		 agreeRefund_totalPrice_t = new TextField();
		 agreeRefund_content.add(agreeRefund_totalPrice_t);
		 agreeRefund_totalPrice_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(agreeRefund_totalPrice_t, 1, 4);
		 operationPanels.put("agreeRefund", agreeRefund);
		 
		 // ==================== GridPane_addGoods ====================
		 GridPane addGoods = new GridPane();
		 addGoods.setHgap(4);
		 addGoods.setVgap(6);
		 addGoods.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> addGoods_content = addGoods.getChildren();
		 Label addGoods_goodsId_label = new Label("goodsId:");
		 addGoods_goodsId_label.setMinWidth(Region.USE_PREF_SIZE);
		 addGoods_content.add(addGoods_goodsId_label);
		 GridPane.setConstraints(addGoods_goodsId_label, 0, 0);
		 
		 addGoods_goodsId_t = new TextField();
		 addGoods_content.add(addGoods_goodsId_t);
		 addGoods_goodsId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(addGoods_goodsId_t, 1, 0);
		 Label addGoods_goodsName_label = new Label("goodsName:");
		 addGoods_goodsName_label.setMinWidth(Region.USE_PREF_SIZE);
		 addGoods_content.add(addGoods_goodsName_label);
		 GridPane.setConstraints(addGoods_goodsName_label, 0, 1);
		 
		 addGoods_goodsName_t = new TextField();
		 addGoods_content.add(addGoods_goodsName_t);
		 addGoods_goodsName_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(addGoods_goodsName_t, 1, 1);
		 Label addGoods_addNum_label = new Label("addNum:");
		 addGoods_addNum_label.setMinWidth(Region.USE_PREF_SIZE);
		 addGoods_content.add(addGoods_addNum_label);
		 GridPane.setConstraints(addGoods_addNum_label, 0, 2);
		 
		 addGoods_addNum_t = new TextField();
		 addGoods_content.add(addGoods_addNum_t);
		 addGoods_addNum_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(addGoods_addNum_t, 1, 2);
		 Label addGoods_totalNum_label = new Label("totalNum:");
		 addGoods_totalNum_label.setMinWidth(Region.USE_PREF_SIZE);
		 addGoods_content.add(addGoods_totalNum_label);
		 GridPane.setConstraints(addGoods_totalNum_label, 0, 3);
		 
		 addGoods_totalNum_t = new TextField();
		 addGoods_content.add(addGoods_totalNum_t);
		 addGoods_totalNum_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(addGoods_totalNum_t, 1, 3);
		 operationPanels.put("addGoods", addGoods);
		 
		 // ==================== GridPane_deleteGoods ====================
		 GridPane deleteGoods = new GridPane();
		 deleteGoods.setHgap(4);
		 deleteGoods.setVgap(6);
		 deleteGoods.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> deleteGoods_content = deleteGoods.getChildren();
		 Label deleteGoods_goodsId_label = new Label("goodsId:");
		 deleteGoods_goodsId_label.setMinWidth(Region.USE_PREF_SIZE);
		 deleteGoods_content.add(deleteGoods_goodsId_label);
		 GridPane.setConstraints(deleteGoods_goodsId_label, 0, 0);
		 
		 deleteGoods_goodsId_t = new TextField();
		 deleteGoods_content.add(deleteGoods_goodsId_t);
		 deleteGoods_goodsId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(deleteGoods_goodsId_t, 1, 0);
		 Label deleteGoods_goodsName_label = new Label("goodsName:");
		 deleteGoods_goodsName_label.setMinWidth(Region.USE_PREF_SIZE);
		 deleteGoods_content.add(deleteGoods_goodsName_label);
		 GridPane.setConstraints(deleteGoods_goodsName_label, 0, 1);
		 
		 deleteGoods_goodsName_t = new TextField();
		 deleteGoods_content.add(deleteGoods_goodsName_t);
		 deleteGoods_goodsName_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(deleteGoods_goodsName_t, 1, 1);
		 Label deleteGoods_goodsNum_label = new Label("goodsNum:");
		 deleteGoods_goodsNum_label.setMinWidth(Region.USE_PREF_SIZE);
		 deleteGoods_content.add(deleteGoods_goodsNum_label);
		 GridPane.setConstraints(deleteGoods_goodsNum_label, 0, 2);
		 
		 deleteGoods_goodsNum_t = new TextField();
		 deleteGoods_content.add(deleteGoods_goodsNum_t);
		 deleteGoods_goodsNum_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(deleteGoods_goodsNum_t, 1, 2);
		 Label deleteGoods_totalNum_label = new Label("totalNum:");
		 deleteGoods_totalNum_label.setMinWidth(Region.USE_PREF_SIZE);
		 deleteGoods_content.add(deleteGoods_totalNum_label);
		 GridPane.setConstraints(deleteGoods_totalNum_label, 0, 3);
		 
		 deleteGoods_totalNum_t = new TextField();
		 deleteGoods_content.add(deleteGoods_totalNum_t);
		 deleteGoods_totalNum_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(deleteGoods_totalNum_t, 1, 3);
		 operationPanels.put("deleteGoods", deleteGoods);
		 
		 // ==================== GridPane_checkGoods ====================
		 GridPane checkGoods = new GridPane();
		 checkGoods.setHgap(4);
		 checkGoods.setVgap(6);
		 checkGoods.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> checkGoods_content = checkGoods.getChildren();
		 Label checkGoods_goodsId_label = new Label("goodsId:");
		 checkGoods_goodsId_label.setMinWidth(Region.USE_PREF_SIZE);
		 checkGoods_content.add(checkGoods_goodsId_label);
		 GridPane.setConstraints(checkGoods_goodsId_label, 0, 0);
		 
		 checkGoods_goodsId_t = new TextField();
		 checkGoods_content.add(checkGoods_goodsId_t);
		 checkGoods_goodsId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(checkGoods_goodsId_t, 1, 0);
		 Label checkGoods_goodsName_label = new Label("goodsName:");
		 checkGoods_goodsName_label.setMinWidth(Region.USE_PREF_SIZE);
		 checkGoods_content.add(checkGoods_goodsName_label);
		 GridPane.setConstraints(checkGoods_goodsName_label, 0, 1);
		 
		 checkGoods_goodsName_t = new TextField();
		 checkGoods_content.add(checkGoods_goodsName_t);
		 checkGoods_goodsName_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(checkGoods_goodsName_t, 1, 1);
		 Label checkGoods_goodsNum_label = new Label("goodsNum:");
		 checkGoods_goodsNum_label.setMinWidth(Region.USE_PREF_SIZE);
		 checkGoods_content.add(checkGoods_goodsNum_label);
		 GridPane.setConstraints(checkGoods_goodsNum_label, 0, 2);
		 
		 checkGoods_goodsNum_t = new TextField();
		 checkGoods_content.add(checkGoods_goodsNum_t);
		 checkGoods_goodsNum_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(checkGoods_goodsNum_t, 1, 2);
		 Label checkGoods_goodsPrice_label = new Label("goodsPrice:");
		 checkGoods_goodsPrice_label.setMinWidth(Region.USE_PREF_SIZE);
		 checkGoods_content.add(checkGoods_goodsPrice_label);
		 GridPane.setConstraints(checkGoods_goodsPrice_label, 0, 3);
		 
		 checkGoods_goodsPrice_t = new TextField();
		 checkGoods_content.add(checkGoods_goodsPrice_t);
		 checkGoods_goodsPrice_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(checkGoods_goodsPrice_t, 1, 3);
		 Label checkGoods_totalNum_label = new Label("totalNum:");
		 checkGoods_totalNum_label.setMinWidth(Region.USE_PREF_SIZE);
		 checkGoods_content.add(checkGoods_totalNum_label);
		 GridPane.setConstraints(checkGoods_totalNum_label, 0, 4);
		 
		 checkGoods_totalNum_t = new TextField();
		 checkGoods_content.add(checkGoods_totalNum_t);
		 checkGoods_totalNum_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(checkGoods_totalNum_t, 1, 4);
		 operationPanels.put("checkGoods", checkGoods);
		 
		 // ==================== GridPane_modifyPrice ====================
		 GridPane modifyPrice = new GridPane();
		 modifyPrice.setHgap(4);
		 modifyPrice.setVgap(6);
		 modifyPrice.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> modifyPrice_content = modifyPrice.getChildren();
		 Label modifyPrice_goodsId_label = new Label("goodsId:");
		 modifyPrice_goodsId_label.setMinWidth(Region.USE_PREF_SIZE);
		 modifyPrice_content.add(modifyPrice_goodsId_label);
		 GridPane.setConstraints(modifyPrice_goodsId_label, 0, 0);
		 
		 modifyPrice_goodsId_t = new TextField();
		 modifyPrice_content.add(modifyPrice_goodsId_t);
		 modifyPrice_goodsId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(modifyPrice_goodsId_t, 1, 0);
		 Label modifyPrice_goodsName_label = new Label("goodsName:");
		 modifyPrice_goodsName_label.setMinWidth(Region.USE_PREF_SIZE);
		 modifyPrice_content.add(modifyPrice_goodsName_label);
		 GridPane.setConstraints(modifyPrice_goodsName_label, 0, 1);
		 
		 modifyPrice_goodsName_t = new TextField();
		 modifyPrice_content.add(modifyPrice_goodsName_t);
		 modifyPrice_goodsName_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(modifyPrice_goodsName_t, 1, 1);
		 Label modifyPrice_goodsPrice_label = new Label("goodsPrice:");
		 modifyPrice_goodsPrice_label.setMinWidth(Region.USE_PREF_SIZE);
		 modifyPrice_content.add(modifyPrice_goodsPrice_label);
		 GridPane.setConstraints(modifyPrice_goodsPrice_label, 0, 2);
		 
		 modifyPrice_goodsPrice_t = new TextField();
		 modifyPrice_content.add(modifyPrice_goodsPrice_t);
		 modifyPrice_goodsPrice_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(modifyPrice_goodsPrice_t, 1, 2);
		 operationPanels.put("modifyPrice", modifyPrice);
		 
		 // ==================== GridPane_browseUser ====================
		 GridPane browseUser = new GridPane();
		 browseUser.setHgap(4);
		 browseUser.setVgap(6);
		 browseUser.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> browseUser_content = browseUser.getChildren();
		 Label browseUser_userId_label = new Label("userId:");
		 browseUser_userId_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseUser_content.add(browseUser_userId_label);
		 GridPane.setConstraints(browseUser_userId_label, 0, 0);
		 
		 browseUser_userId_t = new TextField();
		 browseUser_content.add(browseUser_userId_t);
		 browseUser_userId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseUser_userId_t, 1, 0);
		 Label browseUser_userName_label = new Label("userName:");
		 browseUser_userName_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseUser_content.add(browseUser_userName_label);
		 GridPane.setConstraints(browseUser_userName_label, 0, 1);
		 
		 browseUser_userName_t = new TextField();
		 browseUser_content.add(browseUser_userName_t);
		 browseUser_userName_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseUser_userName_t, 1, 1);
		 Label browseUser_userPassword_label = new Label("userPassword:");
		 browseUser_userPassword_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseUser_content.add(browseUser_userPassword_label);
		 GridPane.setConstraints(browseUser_userPassword_label, 0, 2);
		 
		 browseUser_userPassword_t = new TextField();
		 browseUser_content.add(browseUser_userPassword_t);
		 browseUser_userPassword_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseUser_userPassword_t, 1, 2);
		 Label browseUser_identity_label = new Label("identity:");
		 browseUser_identity_label.setMinWidth(Region.USE_PREF_SIZE);
		 browseUser_content.add(browseUser_identity_label);
		 GridPane.setConstraints(browseUser_identity_label, 0, 3);
		 
		 browseUser_identity_t = new TextField();
		 browseUser_content.add(browseUser_identity_t);
		 browseUser_identity_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(browseUser_identity_t, 1, 3);
		 operationPanels.put("browseUser", browseUser);
		 
		 // ==================== GridPane_addUser ====================
		 GridPane addUser = new GridPane();
		 addUser.setHgap(4);
		 addUser.setVgap(6);
		 addUser.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> addUser_content = addUser.getChildren();
		 Label addUser_userId_label = new Label("userId:");
		 addUser_userId_label.setMinWidth(Region.USE_PREF_SIZE);
		 addUser_content.add(addUser_userId_label);
		 GridPane.setConstraints(addUser_userId_label, 0, 0);
		 
		 addUser_userId_t = new TextField();
		 addUser_content.add(addUser_userId_t);
		 addUser_userId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(addUser_userId_t, 1, 0);
		 Label addUser_userName_label = new Label("userName:");
		 addUser_userName_label.setMinWidth(Region.USE_PREF_SIZE);
		 addUser_content.add(addUser_userName_label);
		 GridPane.setConstraints(addUser_userName_label, 0, 1);
		 
		 addUser_userName_t = new TextField();
		 addUser_content.add(addUser_userName_t);
		 addUser_userName_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(addUser_userName_t, 1, 1);
		 Label addUser_userPassword_label = new Label("userPassword:");
		 addUser_userPassword_label.setMinWidth(Region.USE_PREF_SIZE);
		 addUser_content.add(addUser_userPassword_label);
		 GridPane.setConstraints(addUser_userPassword_label, 0, 2);
		 
		 addUser_userPassword_t = new TextField();
		 addUser_content.add(addUser_userPassword_t);
		 addUser_userPassword_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(addUser_userPassword_t, 1, 2);
		 Label addUser_identity_label = new Label("identity:");
		 addUser_identity_label.setMinWidth(Region.USE_PREF_SIZE);
		 addUser_content.add(addUser_identity_label);
		 GridPane.setConstraints(addUser_identity_label, 0, 3);
		 
		 addUser_identity_t = new TextField();
		 addUser_content.add(addUser_identity_t);
		 addUser_identity_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(addUser_identity_t, 1, 3);
		 operationPanels.put("addUser", addUser);
		 
		 // ==================== GridPane_deleteUser ====================
		 GridPane deleteUser = new GridPane();
		 deleteUser.setHgap(4);
		 deleteUser.setVgap(6);
		 deleteUser.setPadding(new Insets(8, 8, 8, 8));
		 
		 ObservableList<Node> deleteUser_content = deleteUser.getChildren();
		 Label deleteUser_userId_label = new Label("userId:");
		 deleteUser_userId_label.setMinWidth(Region.USE_PREF_SIZE);
		 deleteUser_content.add(deleteUser_userId_label);
		 GridPane.setConstraints(deleteUser_userId_label, 0, 0);
		 
		 deleteUser_userId_t = new TextField();
		 deleteUser_content.add(deleteUser_userId_t);
		 deleteUser_userId_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(deleteUser_userId_t, 1, 0);
		 Label deleteUser_userName_label = new Label("userName:");
		 deleteUser_userName_label.setMinWidth(Region.USE_PREF_SIZE);
		 deleteUser_content.add(deleteUser_userName_label);
		 GridPane.setConstraints(deleteUser_userName_label, 0, 1);
		 
		 deleteUser_userName_t = new TextField();
		 deleteUser_content.add(deleteUser_userName_t);
		 deleteUser_userName_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(deleteUser_userName_t, 1, 1);
		 Label deleteUser_userPassword_label = new Label("userPassword:");
		 deleteUser_userPassword_label.setMinWidth(Region.USE_PREF_SIZE);
		 deleteUser_content.add(deleteUser_userPassword_label);
		 GridPane.setConstraints(deleteUser_userPassword_label, 0, 2);
		 
		 deleteUser_userPassword_t = new TextField();
		 deleteUser_content.add(deleteUser_userPassword_t);
		 deleteUser_userPassword_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(deleteUser_userPassword_t, 1, 2);
		 Label deleteUser_identity_label = new Label("identity:");
		 deleteUser_identity_label.setMinWidth(Region.USE_PREF_SIZE);
		 deleteUser_content.add(deleteUser_identity_label);
		 GridPane.setConstraints(deleteUser_identity_label, 0, 3);
		 
		 deleteUser_identity_t = new TextField();
		 deleteUser_content.add(deleteUser_identity_t);
		 deleteUser_identity_t.setMinWidth(Region.USE_PREF_SIZE);
		 GridPane.setConstraints(deleteUser_identity_t, 1, 3);
		 operationPanels.put("deleteUser", deleteUser);
		 
	}	

	public void actorTreeViewBinding() {
		
		 

		TreeItem<String> treeRootadministrator = new TreeItem<String>("Root node");
		
		TreeItem<String> subTreeRoot_User = new TreeItem<String>("manageUser");
					 		subTreeRoot_User.getChildren().addAll(Arrays.asList(					 		
					 			 		new TreeItem<String>("createUser"),
					 			 		new TreeItem<String>("queryUser"),
					 			 		new TreeItem<String>("modifyUser"),
					 			 		new TreeItem<String>("deleteUser")					 			 	
					 			 	));							 		
		TreeItem<String> subTreeRoot_Customer = new TreeItem<String>("manageCustomer");
					 		subTreeRoot_Customer.getChildren().addAll(Arrays.asList(					 		
					 			 		new TreeItem<String>("createCustomer"),
					 			 		new TreeItem<String>("queryCustomer"),
					 			 		new TreeItem<String>("modifyCustomer"),
					 			 		new TreeItem<String>("deleteCustomer")					 			 	
					 			 	));							 		
		TreeItem<String> subTreeRoot_Admin = new TreeItem<String>("manageAdmin");
					 		subTreeRoot_Admin.getChildren().addAll(Arrays.asList(					 		
					 			 		new TreeItem<String>("createAdmin"),
					 			 		new TreeItem<String>("queryAdmin"),
					 			 		new TreeItem<String>("modifyAdmin"),
					 			 		new TreeItem<String>("deleteAdmin")					 			 	
					 			 	));							 		
		TreeItem<String> subTreeRoot_SuperAdmin = new TreeItem<String>("manageSuperAdmin");
					 		subTreeRoot_SuperAdmin.getChildren().addAll(Arrays.asList(					 		
					 			 		new TreeItem<String>("createSuperAdmin"),
					 			 		new TreeItem<String>("querySuperAdmin"),
					 			 		new TreeItem<String>("modifySuperAdmin"),
					 			 		new TreeItem<String>("deleteSuperAdmin")					 			 	
					 			 	));							 		
		TreeItem<String> subTreeRoot_Orders = new TreeItem<String>("manageOrders");
					 		subTreeRoot_Orders.getChildren().addAll(Arrays.asList(					 		
					 			 		new TreeItem<String>("createOrders"),
					 			 		new TreeItem<String>("queryOrders"),
					 			 		new TreeItem<String>("modifyOrders"),
					 			 		new TreeItem<String>("deleteOrders")					 			 	
					 			 	));							 		
		TreeItem<String> subTreeRoot_ShoppingCart = new TreeItem<String>("manageShoppingCart");
					 		subTreeRoot_ShoppingCart.getChildren().addAll(Arrays.asList(					 		
					 			 		new TreeItem<String>("createShoppingCart"),
					 			 		new TreeItem<String>("queryShoppingCart"),
					 			 		new TreeItem<String>("modifyShoppingCart"),
					 			 		new TreeItem<String>("deleteShoppingCart")					 			 	
					 			 	));							 		
		TreeItem<String> subTreeRoot_Commodity = new TreeItem<String>("manageCommodity");
					 		subTreeRoot_Commodity.getChildren().addAll(Arrays.asList(					 		
					 			 		new TreeItem<String>("createCommodity"),
					 			 		new TreeItem<String>("queryCommodity"),
					 			 		new TreeItem<String>("modifyCommodity"),
					 			 		new TreeItem<String>("deleteCommodity")					 			 	
					 			 	));							 		
		
					 			
						 		
		treeRootadministrator.getChildren().addAll(Arrays.asList(
		 	subTreeRoot_User,
		 	subTreeRoot_Customer,
		 	subTreeRoot_Admin,
		 	subTreeRoot_SuperAdmin,
		 	subTreeRoot_Orders,
		 	subTreeRoot_ShoppingCart,
		 	subTreeRoot_Commodity
				));	
				
	 			treeRootadministrator.setExpanded(true);

		actor_treeview_administrator.setShowRoot(false);
		actor_treeview_administrator.setRoot(treeRootadministrator);
	 		
		actor_treeview_administrator.getSelectionModel().selectedItemProperty().addListener(
		 				 (observable, oldValue, newValue) -> { 
		 				 								
		 				 							 //clear the previous return
		 											 operation_return_pane.setContent(new Label());
		 											 
		 				 							 clickedOp = newValue.getValue();
		 				 							 GridPane op = operationPanels.get(clickedOp);
		 				 							 VBox vb = opInvariantPanel.get(clickedOp);
		 				 							 
		 				 							 //op pannel
		 				 							 if (op != null) {
		 				 								 operation_paras.setContent(operationPanels.get(newValue.getValue()));
		 				 								 
		 				 								 ObservableList<Node> l = operationPanels.get(newValue.getValue()).getChildren();
		 				 								 choosenOperation = new LinkedList<TextField>();
		 				 								 for (Node n : l) {
		 				 								 	 if (n instanceof TextField) {
		 				 								 	 	choosenOperation.add((TextField)n);
		 				 								 	  }
		 				 								 }
		 				 								 
		 				 								 definition.setText(definitions_map.get(newValue.getValue()));
		 				 								 precondition.setText(preconditions_map.get(newValue.getValue()));
		 				 								 postcondition.setText(postconditions_map.get(newValue.getValue()));
		 				 								 
		 				 						     }
		 				 							 else {
		 				 								 Label l = new Label(newValue.getValue() + " is no contract information in requirement model.");
		 				 								 l.setPadding(new Insets(8, 8, 8, 8));
		 				 								 operation_paras.setContent(l);
		 				 							 }	
		 				 							 
		 				 							 //op invariants
		 				 							 if (vb != null) {
		 				 							 	ScrollPane scrollPane = new ScrollPane(vb);
		 				 							 	scrollPane.setFitToWidth(true);
		 				 							 	invariants_panes.setMaxHeight(200); 
		 				 							 	//all_invariant_pane.setContent(scrollPane);	
		 				 							 	
		 				 							 	invariants_panes.setContent(scrollPane);
		 				 							 } else {
		 				 							 	 Label l = new Label(newValue.getValue() + " is no related invariants");
		 				 							     l.setPadding(new Insets(8, 8, 8, 8));
		 				 							     invariants_panes.setContent(l);
		 				 							 }
		 				 							 
		 				 							 //reset pre- and post-conditions area color
		 				 							 precondition.setStyle("-fx-background-color:#FFFFFF; -fx-control-inner-background: #FFFFFF ");
		 				 							 postcondition.setStyle("-fx-background-color:#FFFFFF; -fx-control-inner-background: #FFFFFF");
		 				 							 //reset condition panel title
		 				 							 precondition_pane.setText("Precondition");
		 				 							 postcondition_pane.setText("Postcondition");
		 				 						} 
		 				 				);

		
		
		 
		TreeItem<String> treeRootcustomer = new TreeItem<String>("Root node");
			TreeItem<String> subTreeRoot_searchGoods = new TreeItem<String>("searchGoods");
			subTreeRoot_searchGoods.getChildren().addAll(Arrays.asList(			 		    
					 	new TreeItem<String>("browseGoods")
				 		));	
			TreeItem<String> subTreeRoot_manageCart = new TreeItem<String>("manageCart");
			subTreeRoot_manageCart.getChildren().addAll(Arrays.asList(			 		    
					 	new TreeItem<String>("addCart"),
					 	new TreeItem<String>("browseCart"),
					 	new TreeItem<String>("deleteCart")
				 		));	
			TreeItem<String> subTreeRoot_orderPayment = new TreeItem<String>("orderPayment");
			subTreeRoot_orderPayment.getChildren().addAll(Arrays.asList(			 		    
					 	new TreeItem<String>("orderPay")
				 		));	
			TreeItem<String> subTreeRoot_applyRefund = new TreeItem<String>("applyRefund");
			subTreeRoot_applyRefund.getChildren().addAll(Arrays.asList(			 		    
					 	new TreeItem<String>("applyRefund")
				 		));	
		
		treeRootcustomer.getChildren().addAll(Arrays.asList(
			subTreeRoot_searchGoods,
			subTreeRoot_manageCart,
			subTreeRoot_orderPayment,
			subTreeRoot_applyRefund
					));
		
		treeRootcustomer.setExpanded(true);

		actor_treeview_customer.setShowRoot(false);
		actor_treeview_customer.setRoot(treeRootcustomer);
		
		//TreeView click, then open the GridPane for inputing parameters
		actor_treeview_customer.getSelectionModel().selectedItemProperty().addListener(
						 (observable, oldValue, newValue) -> { 
						 								
						 							 //clear the previous return
													 operation_return_pane.setContent(new Label());
													 
						 							 clickedOp = newValue.getValue();
						 							 GridPane op = operationPanels.get(clickedOp);
						 							 VBox vb = opInvariantPanel.get(clickedOp);
						 							 
						 							 //op pannel
						 							 if (op != null) {
						 								 operation_paras.setContent(operationPanels.get(newValue.getValue()));
						 								 
						 								 ObservableList<Node> l = operationPanels.get(newValue.getValue()).getChildren();
						 								 choosenOperation = new LinkedList<TextField>();
						 								 for (Node n : l) {
						 								 	 if (n instanceof TextField) {
						 								 	 	choosenOperation.add((TextField)n);
						 								 	  }
						 								 }
						 								 
						 								 definition.setText(definitions_map.get(newValue.getValue()));
						 								 precondition.setText(preconditions_map.get(newValue.getValue()));
						 								 postcondition.setText(postconditions_map.get(newValue.getValue()));
						 								 
						 						     }
						 							 else {
						 								 Label l = new Label(newValue.getValue() + " is no contract information in requirement model.");
						 								 l.setPadding(new Insets(8, 8, 8, 8));
						 								 operation_paras.setContent(l);
						 							 }	
						 							 
						 							 //op invariants
						 							 if (vb != null) {
						 							 	ScrollPane scrollPane = new ScrollPane(vb);
						 							 	scrollPane.setFitToWidth(true);
						 							 	invariants_panes.setMaxHeight(200); 
						 							 	//all_invariant_pane.setContent(scrollPane);	
						 							 	
						 							 	invariants_panes.setContent(scrollPane);
						 							 } else {
						 							 	 Label l = new Label(newValue.getValue() + " is no related invariants");
						 							     l.setPadding(new Insets(8, 8, 8, 8));
						 							     invariants_panes.setContent(l);
						 							 }
						 							 
						 							 //reset pre- and post-conditions area color
						 							 precondition.setStyle("-fx-background-color:#FFFFFF; -fx-control-inner-background: #FFFFFF ");
						 							 postcondition.setStyle("-fx-background-color:#FFFFFF; -fx-control-inner-background: #FFFFFF");
						 							 //reset condition panel title
						 							 precondition_pane.setText("Precondition");
						 							 postcondition_pane.setText("Postcondition");
						 						} 
						 				);
		TreeItem<String> treeRootadmin = new TreeItem<String>("Root node");
			TreeItem<String> subTreeRoot_manageRefund = new TreeItem<String>("manageRefund");
			subTreeRoot_manageRefund.getChildren().addAll(Arrays.asList(			 		    
					 	new TreeItem<String>("refuseRefund"),
					 	new TreeItem<String>("agreeRefund")
				 		));	
			TreeItem<String> subTreeRoot_mabageOrders = new TreeItem<String>("mabageOrders");
			subTreeRoot_mabageOrders.getChildren().addAll(Arrays.asList(			 		    
					 	new TreeItem<String>("browseOrder"),
					 	new TreeItem<String>("deleteOrder")
				 		));	
			TreeItem<String> subTreeRoot_manageCommodity = new TreeItem<String>("manageCommodity");
			subTreeRoot_manageCommodity.getChildren().addAll(Arrays.asList(			 		    
					 	new TreeItem<String>("addGoods"),
					 	new TreeItem<String>("deleteGoods"),
					 	new TreeItem<String>("checkGoods"),
					 	new TreeItem<String>("modifyPrice")
				 		));	
		
		treeRootadmin.getChildren().addAll(Arrays.asList(
			subTreeRoot_manageRefund,
			subTreeRoot_mabageOrders,
			subTreeRoot_manageCommodity
					));
		
		treeRootadmin.setExpanded(true);

		actor_treeview_admin.setShowRoot(false);
		actor_treeview_admin.setRoot(treeRootadmin);
		
		//TreeView click, then open the GridPane for inputing parameters
		actor_treeview_admin.getSelectionModel().selectedItemProperty().addListener(
						 (observable, oldValue, newValue) -> { 
						 								
						 							 //clear the previous return
													 operation_return_pane.setContent(new Label());
													 
						 							 clickedOp = newValue.getValue();
						 							 GridPane op = operationPanels.get(clickedOp);
						 							 VBox vb = opInvariantPanel.get(clickedOp);
						 							 
						 							 //op pannel
						 							 if (op != null) {
						 								 operation_paras.setContent(operationPanels.get(newValue.getValue()));
						 								 
						 								 ObservableList<Node> l = operationPanels.get(newValue.getValue()).getChildren();
						 								 choosenOperation = new LinkedList<TextField>();
						 								 for (Node n : l) {
						 								 	 if (n instanceof TextField) {
						 								 	 	choosenOperation.add((TextField)n);
						 								 	  }
						 								 }
						 								 
						 								 definition.setText(definitions_map.get(newValue.getValue()));
						 								 precondition.setText(preconditions_map.get(newValue.getValue()));
						 								 postcondition.setText(postconditions_map.get(newValue.getValue()));
						 								 
						 						     }
						 							 else {
						 								 Label l = new Label(newValue.getValue() + " is no contract information in requirement model.");
						 								 l.setPadding(new Insets(8, 8, 8, 8));
						 								 operation_paras.setContent(l);
						 							 }	
						 							 
						 							 //op invariants
						 							 if (vb != null) {
						 							 	ScrollPane scrollPane = new ScrollPane(vb);
						 							 	scrollPane.setFitToWidth(true);
						 							 	invariants_panes.setMaxHeight(200); 
						 							 	//all_invariant_pane.setContent(scrollPane);	
						 							 	
						 							 	invariants_panes.setContent(scrollPane);
						 							 } else {
						 							 	 Label l = new Label(newValue.getValue() + " is no related invariants");
						 							     l.setPadding(new Insets(8, 8, 8, 8));
						 							     invariants_panes.setContent(l);
						 							 }
						 							 
						 							 //reset pre- and post-conditions area color
						 							 precondition.setStyle("-fx-background-color:#FFFFFF; -fx-control-inner-background: #FFFFFF ");
						 							 postcondition.setStyle("-fx-background-color:#FFFFFF; -fx-control-inner-background: #FFFFFF");
						 							 //reset condition panel title
						 							 precondition_pane.setText("Precondition");
						 							 postcondition_pane.setText("Postcondition");
						 						} 
						 				);
		TreeItem<String> treeRootsuper_admin = new TreeItem<String>("Root node");
			TreeItem<String> subTreeRoot_manageUser = new TreeItem<String>("manageUser");
			subTreeRoot_manageUser.getChildren().addAll(Arrays.asList(			 		    
					 	new TreeItem<String>("browseUser"),
					 	new TreeItem<String>("addUser"),
					 	new TreeItem<String>("deleteUser")
				 		));	
		
		treeRootsuper_admin.getChildren().addAll(Arrays.asList(
			subTreeRoot_manageUser
					));
		
		treeRootsuper_admin.setExpanded(true);

		actor_treeview_super_admin.setShowRoot(false);
		actor_treeview_super_admin.setRoot(treeRootsuper_admin);
		
		//TreeView click, then open the GridPane for inputing parameters
		actor_treeview_super_admin.getSelectionModel().selectedItemProperty().addListener(
						 (observable, oldValue, newValue) -> { 
						 								
						 							 //clear the previous return
													 operation_return_pane.setContent(new Label());
													 
						 							 clickedOp = newValue.getValue();
						 							 GridPane op = operationPanels.get(clickedOp);
						 							 VBox vb = opInvariantPanel.get(clickedOp);
						 							 
						 							 //op pannel
						 							 if (op != null) {
						 								 operation_paras.setContent(operationPanels.get(newValue.getValue()));
						 								 
						 								 ObservableList<Node> l = operationPanels.get(newValue.getValue()).getChildren();
						 								 choosenOperation = new LinkedList<TextField>();
						 								 for (Node n : l) {
						 								 	 if (n instanceof TextField) {
						 								 	 	choosenOperation.add((TextField)n);
						 								 	  }
						 								 }
						 								 
						 								 definition.setText(definitions_map.get(newValue.getValue()));
						 								 precondition.setText(preconditions_map.get(newValue.getValue()));
						 								 postcondition.setText(postconditions_map.get(newValue.getValue()));
						 								 
						 						     }
						 							 else {
						 								 Label l = new Label(newValue.getValue() + " is no contract information in requirement model.");
						 								 l.setPadding(new Insets(8, 8, 8, 8));
						 								 operation_paras.setContent(l);
						 							 }	
						 							 
						 							 //op invariants
						 							 if (vb != null) {
						 							 	ScrollPane scrollPane = new ScrollPane(vb);
						 							 	scrollPane.setFitToWidth(true);
						 							 	invariants_panes.setMaxHeight(200); 
						 							 	//all_invariant_pane.setContent(scrollPane);	
						 							 	
						 							 	invariants_panes.setContent(scrollPane);
						 							 } else {
						 							 	 Label l = new Label(newValue.getValue() + " is no related invariants");
						 							     l.setPadding(new Insets(8, 8, 8, 8));
						 							     invariants_panes.setContent(l);
						 							 }
						 							 
						 							 //reset pre- and post-conditions area color
						 							 precondition.setStyle("-fx-background-color:#FFFFFF; -fx-control-inner-background: #FFFFFF ");
						 							 postcondition.setStyle("-fx-background-color:#FFFFFF; -fx-control-inner-background: #FFFFFF");
						 							 //reset condition panel title
						 							 precondition_pane.setText("Precondition");
						 							 postcondition_pane.setText("Postcondition");
						 						} 
						 				);
	}

	/**
	*    Execute Operation
	*/
	@FXML
	public void execute(ActionEvent event) {
		
		switch (clickedOp) {
		case "addCart" : addCart(); break;
		case "browseGoods" : browseGoods(); break;
		case "browseCart" : browseCart(); break;
		case "deleteCart" : deleteCart(); break;
		case "orderPay" : orderPay(); break;
		case "applyRefund" : applyRefund(); break;
		case "browseOrder" : browseOrder(); break;
		case "deleteOrder" : deleteOrder(); break;
		case "refuseRefund" : refuseRefund(); break;
		case "agreeRefund" : agreeRefund(); break;
		case "addGoods" : addGoods(); break;
		case "deleteGoods" : deleteGoods(); break;
		case "checkGoods" : checkGoods(); break;
		case "modifyPrice" : modifyPrice(); break;
		case "browseUser" : browseUser(); break;
		case "addUser" : addUser(); break;
		case "deleteUser" : deleteUser(); break;
		
		}
		
		System.out.println("execute buttion clicked");
		
		//checking relevant invariants
		opInvairantPanelUpdate();
	}

	/**
	*    Refresh All
	*/		
	@FXML
	public void refresh(ActionEvent event) {
		
		refreshAll();
		System.out.println("refresh all");
	}		
	
	/**
	*    Save All
	*/			
	@FXML
	public void save(ActionEvent event) {
		
		Stage stage = (Stage) mainPane.getScene().getWindow();
		
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Save State to File");
		fileChooser.setInitialFileName("*.state");
		fileChooser.getExtensionFilters().addAll(
		         new ExtensionFilter("RMCode State File", "*.state"));
		
		File file = fileChooser.showSaveDialog(stage);
		
		if (file != null) {
			System.out.println("save state to file " + file.getAbsolutePath());				
			EntityManager.save(file);
		}
	}
	
	/**
	*    Load All
	*/			
	@FXML
	public void load(ActionEvent event) {
		
		Stage stage = (Stage) mainPane.getScene().getWindow();
		
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open State File");
		fileChooser.getExtensionFilters().addAll(
		         new ExtensionFilter("RMCode State File", "*.state"));
		
		File file = fileChooser.showOpenDialog(stage);
		
		if (file != null) {
			System.out.println("choose file" + file.getAbsolutePath());
			EntityManager.load(file); 
		}
		
		//refresh GUI after load data
		refreshAll();
	}
	
	
	//precondition unsat dialog
	public void preconditionUnSat() {
		
		Alert alert = new Alert(AlertType.WARNING, "");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(mainPane.getScene().getWindow());
        alert.getDialogPane().setContentText("Precondtion is not satisfied");
        alert.getDialogPane().setHeaderText(null);
        alert.showAndWait();	
	}
	
	//postcondition unsat dialog
	public void postconditionUnSat() {
		
		Alert alert = new Alert(AlertType.WARNING, "");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(mainPane.getScene().getWindow());
        alert.getDialogPane().setContentText("Postcondtion is not satisfied");
        alert.getDialogPane().setHeaderText(null);
        alert.showAndWait();	
	}

	public void thirdpartyServiceUnSat() {
		
		Alert alert = new Alert(AlertType.WARNING, "");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(mainPane.getScene().getWindow());
        alert.getDialogPane().setContentText("third party service is exception");
        alert.getDialogPane().setHeaderText(null);
        alert.showAndWait();	
	}		
	
	
	public void addCart() {
		
		System.out.println("execute addCart");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: addCart in service: ManageCartService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(managecartservice_service.addCart(
			addCart_goodsId_t.getText(),
			addCart_goodsName_t.getText(),
			addCart_goodsNum_t.getText(),
			addCart_goodsPrice_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void browseGoods() {
		
		System.out.println("execute browseGoods");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: browseGoods in service: SearchGoodsService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(searchgoodsservice_service.browseGoods(
			browseGoods_id_t.getText(),
			browseGoods_name_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void browseCart() {
		
		System.out.println("execute browseCart");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: browseCart in service: ManageCartService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(managecartservice_service.browseCart(
			browseCart_goodsId_t.getText(),
			browseCart_goodsName_t.getText(),
			browseCart_goodsNum_t.getText(),
			browseCart_goodsPrice_t.getText(),
			browseCart_totalPrice_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void deleteCart() {
		
		System.out.println("execute deleteCart");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: deleteCart in service: ManageCartService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(managecartservice_service.deleteCart(
			deleteCart_goodsId_t.getText(),
			deleteCart_goodsName_t.getText(),
			deleteCart_goodsNum_t.getText(),
			deleteCart_totalPrice_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void orderPay() {
		
		System.out.println("execute orderPay");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: orderPay in service: OrderPaymentService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(orderpaymentservice_service.orderPay(
			orderPay_orderId_t.getText(),
			orderPay_goodsId_t.getText(),
			orderPay_goodsName_t.getText(),
			orderPay_goodsNum_t.getText(),
			orderPay_totalPrice_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void applyRefund() {
		
		System.out.println("execute applyRefund");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: applyRefund in service: ApplyRefundService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(applyrefundservice_service.applyRefund(
			applyRefund_orderID_t.getText(),
			applyRefund_totalNum_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void browseOrder() {
		
		System.out.println("execute browseOrder");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: browseOrder in service: MabageOrdersService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(mabageordersservice_service.browseOrder(
			browseOrder_orderId_t.getText(),
			browseOrder_goodsId_t.getText(),
			browseOrder_goodsName_t.getText(),
			browseOrder_goodsPrice_t.getText(),
			browseOrder_totalPrice_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void deleteOrder() {
		
		System.out.println("execute deleteOrder");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: deleteOrder in service: MabageOrdersService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(mabageordersservice_service.deleteOrder(
			deleteOrder_orderId_t.getText(),
			deleteOrder_totalPrice_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void refuseRefund() {
		
		System.out.println("execute refuseRefund");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: refuseRefund in service: ManageRefundService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(managerefundservice_service.refuseRefund(
			refuseRefund_orderId_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void agreeRefund() {
		
		System.out.println("execute agreeRefund");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: agreeRefund in service: ManageRefundService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(managerefundservice_service.agreeRefund(
			agreeRefund_orderId_t.getText(),
			agreeRefund_goodsId_t.getText(),
			agreeRefund_goodsName_t.getText(),
			agreeRefund_goodsNum_t.getText(),
			agreeRefund_totalPrice_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void addGoods() {
		
		System.out.println("execute addGoods");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: addGoods in service: ManageCommodityService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(managecommodityservice_service.addGoods(
			addGoods_goodsId_t.getText(),
			addGoods_goodsName_t.getText(),
			addGoods_addNum_t.getText(),
			addGoods_totalNum_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void deleteGoods() {
		
		System.out.println("execute deleteGoods");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: deleteGoods in service: ManageCommodityService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(managecommodityservice_service.deleteGoods(
			deleteGoods_goodsId_t.getText(),
			deleteGoods_goodsName_t.getText(),
			deleteGoods_goodsNum_t.getText(),
			deleteGoods_totalNum_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void checkGoods() {
		
		System.out.println("execute checkGoods");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: checkGoods in service: ManageCommodityService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(managecommodityservice_service.checkGoods(
			checkGoods_goodsId_t.getText(),
			checkGoods_goodsName_t.getText(),
			checkGoods_goodsNum_t.getText(),
			checkGoods_goodsPrice_t.getText(),
			checkGoods_totalNum_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void modifyPrice() {
		
		System.out.println("execute modifyPrice");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: modifyPrice in service: ManageCommodityService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(managecommodityservice_service.modifyPrice(
			modifyPrice_goodsId_t.getText(),
			modifyPrice_goodsName_t.getText(),
			modifyPrice_goodsPrice_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void browseUser() {
		
		System.out.println("execute browseUser");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: browseUser in service: ManageUserService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(manageuserservice_service.browseUser(
			browseUser_userId_t.getText(),
			browseUser_userName_t.getText(),
			browseUser_userPassword_t.getText(),
			browseUser_identity_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void addUser() {
		
		System.out.println("execute addUser");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: addUser in service: ManageUserService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(manageuserservice_service.addUser(
			addUser_userId_t.getText(),
			addUser_userName_t.getText(),
			addUser_userPassword_t.getText(),
			addUser_identity_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}
	public void deleteUser() {
		
		System.out.println("execute deleteUser");
		String time = String.format("%1$tH:%1$tM:%1$tS", System.currentTimeMillis());
		log.appendText(time + " -- execute operation: deleteUser in service: ManageUserService ");
		
		try {
			//invoke op with parameters
			//return value is primitive type, bind result to label.
			String result = String.valueOf(manageuserservice_service.deleteUser(
			deleteUser_userId_t.getText(),
			deleteUser_userName_t.getText(),
			deleteUser_userPassword_t.getText(),
			deleteUser_identity_t.getText()
			));	
			Label l = new Label(result);
			l.setPadding(new Insets(8, 8, 8, 8));
			operation_return_pane.setContent(l);
		    log.appendText(" -- success!\n");
		    //set pre- and post-conditions text area color
		    precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #7CFC00");
		    //contract evaluation result
		    precondition_pane.setText("Precondition: True");
		    postcondition_pane.setText("Postcondition: True");
		    
		    
		} catch (PreconditionException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (PostconditionException e) {
			log.appendText(" -- failed!\n");
			postcondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");	
			postcondition_pane.setText("Postcondition: False");
			postconditionUnSat();
			
		} catch (NumberFormatException e) {
			log.appendText(" -- failed!\n");
			precondition.setStyle("-fx-background-color:#000000; -fx-control-inner-background: #FF0000");
			precondition_pane.setText("Precondition: False");	
			preconditionUnSat();
			
		} catch (Exception e ) {		
			if (e instanceof ThirdPartyServiceException)
				thirdpartyServiceUnSat();
		}
	}




	//select object index
	int objectindex;
	
	@FXML
	TabPane mainPane;

	@FXML
	TextArea log;
	
	@FXML
	TreeView<String> actor_treeview_customer;
	@FXML
	TreeView<String> actor_treeview_admin;
	@FXML
	TreeView<String> actor_treeview_super_admin;
	
	@FXML
	TreeView<String> actor_treeview_administrator;


	@FXML
	TextArea definition;
	@FXML
	TextArea precondition;
	@FXML
	TextArea postcondition;
	@FXML
	TextArea invariants;
	
	@FXML
	TitledPane precondition_pane;
	@FXML
	TitledPane postcondition_pane;
	
	//chosen operation textfields
	List<TextField> choosenOperation;
	String clickedOp;
		
	@FXML
	TableView<ClassInfo> class_statisic;
	@FXML
	TableView<AssociationInfo> association_statisic;
	
	Map<String, ObservableList<AssociationInfo>> allassociationData;
	ObservableList<ClassInfo> classInfodata;
	
	Lab1System lab1system_service;
	ThirdPartyServices thirdpartyservices_service;
	SearchGoodsService searchgoodsservice_service;
	ManageCartService managecartservice_service;
	OrderPaymentService orderpaymentservice_service;
	ApplyRefundService applyrefundservice_service;
	MabageOrdersService mabageordersservice_service;
	ManageRefundService managerefundservice_service;
	ManageCommodityService managecommodityservice_service;
	ManageUserService manageuserservice_service;
	
	ClassInfo user;
	ClassInfo customer;
	ClassInfo admin;
	ClassInfo superadmin;
	ClassInfo orders;
	ClassInfo shoppingcart;
	ClassInfo commodity;
	ClassInfo goods;
	ClassInfo payment;
		
	@FXML
	TitledPane object_statics;
	Map<String, TableView> allObjectTables;
	
	@FXML
	TitledPane operation_paras;
	
	@FXML
	TitledPane operation_return_pane;
	
	@FXML 
	TitledPane all_invariant_pane;
	
	@FXML
	TitledPane invariants_panes;
	
	Map<String, GridPane> operationPanels;
	Map<String, VBox> opInvariantPanel;
	
	//all textfiled or eumntity
	TextField addCart_goodsId_t;
	TextField addCart_goodsName_t;
	TextField addCart_goodsNum_t;
	TextField addCart_goodsPrice_t;
	TextField browseGoods_id_t;
	TextField browseGoods_name_t;
	TextField browseCart_goodsId_t;
	TextField browseCart_goodsName_t;
	TextField browseCart_goodsNum_t;
	TextField browseCart_goodsPrice_t;
	TextField browseCart_totalPrice_t;
	TextField deleteCart_goodsId_t;
	TextField deleteCart_goodsName_t;
	TextField deleteCart_goodsNum_t;
	TextField deleteCart_totalPrice_t;
	TextField orderPay_orderId_t;
	TextField orderPay_goodsId_t;
	TextField orderPay_goodsName_t;
	TextField orderPay_goodsNum_t;
	TextField orderPay_totalPrice_t;
	TextField applyRefund_orderID_t;
	TextField applyRefund_totalNum_t;
	TextField browseOrder_orderId_t;
	TextField browseOrder_goodsId_t;
	TextField browseOrder_goodsName_t;
	TextField browseOrder_goodsPrice_t;
	TextField browseOrder_totalPrice_t;
	TextField deleteOrder_orderId_t;
	TextField deleteOrder_totalPrice_t;
	TextField refuseRefund_orderId_t;
	TextField agreeRefund_orderId_t;
	TextField agreeRefund_goodsId_t;
	TextField agreeRefund_goodsName_t;
	TextField agreeRefund_goodsNum_t;
	TextField agreeRefund_totalPrice_t;
	TextField addGoods_goodsId_t;
	TextField addGoods_goodsName_t;
	TextField addGoods_addNum_t;
	TextField addGoods_totalNum_t;
	TextField deleteGoods_goodsId_t;
	TextField deleteGoods_goodsName_t;
	TextField deleteGoods_goodsNum_t;
	TextField deleteGoods_totalNum_t;
	TextField checkGoods_goodsId_t;
	TextField checkGoods_goodsName_t;
	TextField checkGoods_goodsNum_t;
	TextField checkGoods_goodsPrice_t;
	TextField checkGoods_totalNum_t;
	TextField modifyPrice_goodsId_t;
	TextField modifyPrice_goodsName_t;
	TextField modifyPrice_goodsPrice_t;
	TextField browseUser_userId_t;
	TextField browseUser_userName_t;
	TextField browseUser_userPassword_t;
	TextField browseUser_identity_t;
	TextField addUser_userId_t;
	TextField addUser_userName_t;
	TextField addUser_userPassword_t;
	TextField addUser_identity_t;
	TextField deleteUser_userId_t;
	TextField deleteUser_userName_t;
	TextField deleteUser_userPassword_t;
	TextField deleteUser_identity_t;
	
	HashMap<String, String> definitions_map;
	HashMap<String, String> preconditions_map;
	HashMap<String, String> postconditions_map;
	HashMap<String, String> invariants_map;
	LinkedHashMap<String, String> service_invariants_map;
	LinkedHashMap<String, String> entity_invariants_map;
	LinkedHashMap<String, Label> service_invariants_label_map;
	LinkedHashMap<String, Label> entity_invariants_label_map;
	LinkedHashMap<String, Label> op_entity_invariants_label_map;
	LinkedHashMap<String, Label> op_service_invariants_label_map;
	

	
}
