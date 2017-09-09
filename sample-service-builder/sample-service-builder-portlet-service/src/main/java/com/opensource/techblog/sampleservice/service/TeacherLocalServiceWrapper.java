package com.opensource.techblog.sampleservice.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TeacherLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TeacherLocalService
 * @generated
 */
public class TeacherLocalServiceWrapper implements TeacherLocalService,
    ServiceWrapper<TeacherLocalService> {
    private TeacherLocalService _teacherLocalService;

    public TeacherLocalServiceWrapper(TeacherLocalService teacherLocalService) {
        _teacherLocalService = teacherLocalService;
    }

    /**
    * Adds the teacher to the database. Also notifies the appropriate model listeners.
    *
    * @param teacher the teacher
    * @return the teacher that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.opensource.techblog.sampleservice.model.Teacher addTeacher(
        com.opensource.techblog.sampleservice.model.Teacher teacher)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teacherLocalService.addTeacher(teacher);
    }

    /**
    * Creates a new teacher with the primary key. Does not add the teacher to the database.
    *
    * @param teacherId the primary key for the new teacher
    * @return the new teacher
    */
    @Override
    public com.opensource.techblog.sampleservice.model.Teacher createTeacher(
        long teacherId) {
        return _teacherLocalService.createTeacher(teacherId);
    }

    /**
    * Deletes the teacher with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param teacherId the primary key of the teacher
    * @return the teacher that was removed
    * @throws PortalException if a teacher with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.opensource.techblog.sampleservice.model.Teacher deleteTeacher(
        long teacherId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teacherLocalService.deleteTeacher(teacherId);
    }

    /**
    * Deletes the teacher from the database. Also notifies the appropriate model listeners.
    *
    * @param teacher the teacher
    * @return the teacher that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.opensource.techblog.sampleservice.model.Teacher deleteTeacher(
        com.opensource.techblog.sampleservice.model.Teacher teacher)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teacherLocalService.deleteTeacher(teacher);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _teacherLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teacherLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opensource.techblog.sampleservice.model.impl.TeacherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _teacherLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opensource.techblog.sampleservice.model.impl.TeacherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teacherLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teacherLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teacherLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.opensource.techblog.sampleservice.model.Teacher fetchTeacher(
        long teacherId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teacherLocalService.fetchTeacher(teacherId);
    }

    /**
    * Returns the teacher with the primary key.
    *
    * @param teacherId the primary key of the teacher
    * @return the teacher
    * @throws PortalException if a teacher with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.opensource.techblog.sampleservice.model.Teacher getTeacher(
        long teacherId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teacherLocalService.getTeacher(teacherId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _teacherLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the teachers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.opensource.techblog.sampleservice.model.impl.TeacherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of teachers
    * @param end the upper bound of the range of teachers (not inclusive)
    * @return the range of teachers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.opensource.techblog.sampleservice.model.Teacher> getTeachers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teacherLocalService.getTeachers(start, end);
    }

    /**
    * Returns the number of teachers.
    *
    * @return the number of teachers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getTeachersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teacherLocalService.getTeachersCount();
    }

    /**
    * Updates the teacher in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param teacher the teacher
    * @return the teacher that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.opensource.techblog.sampleservice.model.Teacher updateTeacher(
        com.opensource.techblog.sampleservice.model.Teacher teacher)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _teacherLocalService.updateTeacher(teacher);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _teacherLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _teacherLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _teacherLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TeacherLocalService getWrappedTeacherLocalService() {
        return _teacherLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTeacherLocalService(
        TeacherLocalService teacherLocalService) {
        _teacherLocalService = teacherLocalService;
    }

    @Override
    public TeacherLocalService getWrappedService() {
        return _teacherLocalService;
    }

    @Override
    public void setWrappedService(TeacherLocalService teacherLocalService) {
        _teacherLocalService = teacherLocalService;
    }
}