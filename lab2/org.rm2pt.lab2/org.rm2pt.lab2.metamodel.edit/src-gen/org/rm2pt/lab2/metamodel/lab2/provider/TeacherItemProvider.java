/**
 */
package org.rm2pt.lab2.metamodel.lab2.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.rm2pt.lab2.metamodel.lab2.Lab2Factory;
import org.rm2pt.lab2.metamodel.lab2.Lab2Package;
import org.rm2pt.lab2.metamodel.lab2.Teacher;

/**
 * This is the item provider adapter for a {@link org.rm2pt.lab2.metamodel.lab2.Teacher} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TeacherItemProvider extends UserItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeacherItemProvider(AdapterFactory adapterFactory) {
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

			addGradePropertyDescriptor(object);
			addCousePropertyDescriptor(object);
			addCorrectPropertyDescriptor(object);
			addInclassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Grade feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGradePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Teacher_grade_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Teacher_grade_feature",
								"_UI_Teacher_type"),
						Lab2Package.Literals.TEACHER__GRADE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Couse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCousePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Teacher_couse_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Teacher_couse_feature",
								"_UI_Teacher_type"),
						Lab2Package.Literals.TEACHER__COUSE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Correct feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCorrectPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Teacher_correct_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Teacher_correct_feature",
								"_UI_Teacher_type"),
						Lab2Package.Literals.TEACHER__CORRECT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Inclass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInclassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Teacher_inclass_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Teacher_inclass_feature",
								"_UI_Teacher_type"),
						Lab2Package.Literals.TEACHER__INCLASS, true, false, true, null, null, null));
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
			childrenFeatures.add(Lab2Package.Literals.TEACHER__INPUT);
			childrenFeatures.add(Lab2Package.Literals.TEACHER__TEACHING);
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
	 * This returns Teacher.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Teacher"));
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
		String label = ((Teacher) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Teacher_type")
				: getString("_UI_Teacher_type") + " " + label;
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

		switch (notification.getFeatureID(Teacher.class)) {
		case Lab2Package.TEACHER__GRADE:
		case Lab2Package.TEACHER__COUSE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Lab2Package.TEACHER__INPUT:
		case Lab2Package.TEACHER__TEACHING:
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

		newChildDescriptors.add(
				createChildParameter(Lab2Package.Literals.TEACHER__INPUT, Lab2Factory.eINSTANCE.createReportCard()));

		newChildDescriptors.add(
				createChildParameter(Lab2Package.Literals.TEACHER__TEACHING, Lab2Factory.eINSTANCE.createCourse()));
	}

}
