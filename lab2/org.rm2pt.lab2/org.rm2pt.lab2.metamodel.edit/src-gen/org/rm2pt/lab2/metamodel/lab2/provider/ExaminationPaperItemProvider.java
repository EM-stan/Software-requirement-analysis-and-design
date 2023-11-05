/**
 */
package org.rm2pt.lab2.metamodel.lab2.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.rm2pt.lab2.metamodel.lab2.ExaminationPaper;
import org.rm2pt.lab2.metamodel.lab2.Lab2Factory;
import org.rm2pt.lab2.metamodel.lab2.Lab2Package;

/**
 * This is the item provider adapter for a {@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExaminationPaperItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExaminationPaperItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addCourseidPropertyDescriptor(object);
			addTeacheridPropertyDescriptor(object);
			addStudentidPropertyDescriptor(object);
			addIfanswerPropertyDescriptor(object);
			addIfcorrectPropertyDescriptor(object);
			addScorePropertyDescriptor(object);
			addWhichcoursePropertyDescriptor(object);
			addWhichstudentPropertyDescriptor(object);
			addWhichteacherPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ExaminationPaper_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ExaminationPaper_id_feature",
								"_UI_ExaminationPaper_type"),
						Lab2Package.Literals.EXAMINATION_PAPER__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Courseid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCourseidPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ExaminationPaper_courseid_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ExaminationPaper_courseid_feature",
								"_UI_ExaminationPaper_type"),
						Lab2Package.Literals.EXAMINATION_PAPER__COURSEID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Teacherid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTeacheridPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ExaminationPaper_teacherid_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ExaminationPaper_teacherid_feature",
								"_UI_ExaminationPaper_type"),
						Lab2Package.Literals.EXAMINATION_PAPER__TEACHERID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Studentid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStudentidPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ExaminationPaper_studentid_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ExaminationPaper_studentid_feature",
								"_UI_ExaminationPaper_type"),
						Lab2Package.Literals.EXAMINATION_PAPER__STUDENTID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ifanswer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIfanswerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ExaminationPaper_ifanswer_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ExaminationPaper_ifanswer_feature",
								"_UI_ExaminationPaper_type"),
						Lab2Package.Literals.EXAMINATION_PAPER__IFANSWER, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ifcorrect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIfcorrectPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ExaminationPaper_ifcorrect_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ExaminationPaper_ifcorrect_feature",
								"_UI_ExaminationPaper_type"),
						Lab2Package.Literals.EXAMINATION_PAPER__IFCORRECT, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Score feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScorePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ExaminationPaper_score_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ExaminationPaper_score_feature",
								"_UI_ExaminationPaper_type"),
						Lab2Package.Literals.EXAMINATION_PAPER__SCORE, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Whichcourse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhichcoursePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ExaminationPaper_whichcourse_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ExaminationPaper_whichcourse_feature",
								"_UI_ExaminationPaper_type"),
						Lab2Package.Literals.EXAMINATION_PAPER__WHICHCOURSE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Whichstudent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhichstudentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ExaminationPaper_whichstudent_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ExaminationPaper_whichstudent_feature",
								"_UI_ExaminationPaper_type"),
						Lab2Package.Literals.EXAMINATION_PAPER__WHICHSTUDENT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Whichteacher feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhichteacherPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ExaminationPaper_whichteacher_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ExaminationPaper_whichteacher_feature",
								"_UI_ExaminationPaper_type"),
						Lab2Package.Literals.EXAMINATION_PAPER__WHICHTEACHER, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Lab2Package.Literals.EXAMINATION_PAPER__SUBMIT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ExaminationPaper.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExaminationPaper"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExaminationPaper) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_ExaminationPaper_type")
				: getString("_UI_ExaminationPaper_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ExaminationPaper.class)) {
		case Lab2Package.EXAMINATION_PAPER__ID:
		case Lab2Package.EXAMINATION_PAPER__COURSEID:
		case Lab2Package.EXAMINATION_PAPER__TEACHERID:
		case Lab2Package.EXAMINATION_PAPER__STUDENTID:
		case Lab2Package.EXAMINATION_PAPER__IFANSWER:
		case Lab2Package.EXAMINATION_PAPER__IFCORRECT:
		case Lab2Package.EXAMINATION_PAPER__SCORE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Lab2Package.EXAMINATION_PAPER__SUBMIT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(Lab2Package.Literals.EXAMINATION_PAPER__SUBMIT,
				Lab2Factory.eINSTANCE.createSubmitedPaper()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Lab2EditPlugin.INSTANCE;
	}

}
