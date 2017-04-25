package com.h5c.postserviceintegration;

/**
 * Created by Harsh on 23-08-2016.
 */
public class JsonConstants {

    //public static final String BASE_URL = "http://103.230.39.149:8080"; /*Dev Server*/
    //public static final String BASE_URL = "http://192.168.1.12:8080"; /*Amit Local Server*/
    //public static final String BASE_URL = "http://14.192.17.181:8080"; /*AHM Server*/
    //public static final String BASE_URL = "https://asianhm.health5c.com:8443";
    public static final String BASE_URL = "http://talkmdlive.empowerlis.com:8080"; /*Bret Server*/
    //public static final String BASE_URL = "http://192.168.1.111:8080"; /*Laxman Local Server*/
    //public static final String BASE_URL = "https://talkmdlive.empowerlis.com:8443"; /*Bret Server*/
    //biswabhusan@gmail.com  Biswa123$ /*User name & password for Bret Server*/

// userName == devdoctor , password == devdoctor

    //public static final String BASE_URL ="http://103.19.89.152:8080";
    //public static final String BASE_URL = "http://192.168.1.141:8080";
    //public static final String BASE_URL = "http://192.168.1.138:8080";
    public static final String LOGIN_URL = "/ccp-services/authenticate";
    public static final String REGISTRATION_URL = "/ccp-services/registration";
    public static final String ForgotPassword_URL = "/ccp-services/forgotPassword/{userName}";
    public static final String SEARCH_PATIENT = "/ccp-services/authenticate/partnerMembersList";
    public static final String GET_PARTNER_ID = "/ccp-services/authenticate/getPartnerId";
    public static final String DYNAMIC_MENU_SERVICE = "/ccp-services/role/loadPartnerPrivileges";

    /*Health Trackers*/
    /*BMI Tracker Create Service*/
    public static final String BMI_CREATE = "/ccp-services/vitals/create"; /*Same Service Can Be Used For BMR_CREATE*/
    public static final String BMI_LIST = "/ccp-services/vitals/bmiList/{user_id}/{page_id}";
    public static final String BMI_DELETE = "/ccp-services/vitals/delete/{memberId}/{listId}";

    /*BMR Tracker Create Service*/
    public static final String BMR_LIST = "/ccp-services/vitals/bMRList/{memberId}/{page_id}";
    public static final String BMR_DELETE = "/ccp-services/vitals/delete/{memberId}/{bmrListId}";

    /*HWR Tracker Create Service*/
    public static final String HWR_CREATE = "ccp-services/tracker/create";
    public static final String HWR_LIST = "ccp-services/tracker/handWList/{memberId}";
    public static final String HWR_DELETE = "ccp-services/tracker/deleteDailyIntake/{listID}/{memberId}";

    /*Patient Detail*/
    public static final String APPOINTMENTS = "/ccp-services/appointment/userList/{userMemberid}/0";
    public static final String VITALS = "/ccp-services/vitals/userList/{userMemberid}/0";
    public static final String ALLERGY = "/ccp-services/allergies/userList/{userMemberid}/0";
    public static final String HOSPITALIZATION = "/ccp-services/hospital/userList/{userMemberid}/0";
    public static final String PRESCRIPTION = "/ccp-services/doctorvisit/userList/{userMemberid}/0";
    public static final String LABTESTRESULT = "/ccp-services/testResults/userList/{userMemberid}/0";
    public static final String PROBLEMS = "/ccp-services/problems/list/{userMemberid}";
    public static final String PROCEDEURE = "/ccp-services/procedures/list/{userMemberid}";
    public static final String ALLERGY_NAME = "/ccp-services/aallergyMaster/create";

    /*View More Read Service*/
    public static final String APPOINTMENTS_VIEW = "ccp-services/appointment/read/{memberId}/{appointmentId}";
    public static final String READ_ALLERGY_SERVICE = "/ccp-services/allergies/read/{memberId}/{allergyId}";
    public static final String READ_HOSPITALIZATION_SERVICE = "/ccp-services/hospital/read/{memberId}/{hospitalizationId}";
    public static final String READ_VITAL = "ccp-services/vitals/read/{memberId}/{vitalsId}";
    public static final String READ_TEST_RESULTS = "ccp-services/testResults/read/{memberId}/{testResultId}";
    public static final String READ_PRESCRIPTION = "/ccp-services/doctorvisit/read/{memberId}/{doctorVisitId}";

    /*Add Doctor Services*/
    public static final String GET_SPECIALITY_NAME = "/ccp-services/speciality/{name}";
    public static final String ADD_DOCTOR = "/ccp-services/doctor/create";
    public static final String GET_QUALIFICATION = "/ccp-services/qualification/{name}";

    /*Add Prescription*/
    public static final String GET_PHARAMACY_LIST = "/ccp-services/pharmacy/{input_text}";
    public static final String GET_DOCTOR_LIST = "/ccp-services/doctor/{input_text}";
    public static final String DOCTOR_VISIT = "/ccp-services/doctorvisit/create";
    public static final String ADD_PHARMACY = "/ccp-services/pharmacy/create";
    public static final String ADD_HOSPITAL = "/ccp-services/hospitals/create";

    /*Add Allergy*/
    public static final String CREATE_ALLERGY = "/ccp-services/allergies/create";
    public static final String GET_ALLERGY_DATA_AC = "/ccp-services/allergies/{input_text}";
    public static final String ALLERGY_TYPE_REACTION_URL = "/ccp-services/problems/{input_text}";

    /*Add Hospitalisation*/
    public static final String ADD_HOSPITALIZATION = "/ccp-services/hospital/create";
    public static final String GET_HOSPITAL_NAME_LIST = "/ccp-services/hospitals/{input_text}";

    /*Add Vitals Services*/
    public static final String SUBMIT_VITAL_SERVICE = "/ccp-services/vitals/create";

    /*Add Test Result Services*/
    public static final String ADD_TEST_RESULT_CREATE = "/ccp-services/testResults/create";
    public static final String GET_TEST_NAME = "/ccp-services/testResults/testName/{input_text}";
    public static final String GET_TEST_SEARCH_NAME = "/ccp-services/testResults/searchType/{input_text}";
    public static final String GET_PROFILT_TEST_RESULT = "/ccp-services/testResults/searchTestProfile/{test_id}";

    /*Book appointment*/
    public static final String BOOK_APPOINTMENT_SUGGESTION = "/ccp-services/doctor/autocompleteSplOrPostal/{specialityName}";
    public static final String DOCTOR_LIST = "/ccp-services/doctor/doctorsBySpecialityOrPostalCode/{specialityName}";
    public static final String BA_MEDICAL_CONDITION = "/ccp-services/problems/{conditionName}";
    public static final String BOOK_APPOINT_CREATE = "/ccp-services/appointment/createWithSlot";
    public static final String BOOK_APPOINTMENT_SLOT_LIST = "/ccp-services/doctorSchedule/getDoctorSlots/{doctorId}/{slotSelectedDate}/{virtual}";

    /*Clinical Note*/
    public static final String GET_PATIENT_INFO_ON_CLINICAL_NOTE = "/ccp-services/clinicalNote/patientInfo/{memberId}";
    public static final String CREATING_CLINICAL_NOTE = "/ccp-services/clinicalNote/create";

    /*DocDashboard*/
    public static final String DOC_DASHBOARD_APPOINTMENT = "/ccp-services/appointment/loggedInDoctorAllAppointments";
    public static final String DOC_DASHBOARD_APPOINTMENTDATES = "/ccp-services/appointment/monthWiseAppointmentDates/{date}";
    public static final String PATIENT_FACESHEET_ALLERGY = "/ccp-services/allergies/userLatestList/{memberId}";
    public static final String PATIENT_FACESHEET_VITALS = "/ccp-services/vitals/userLatestList/{memberId}";
    public static final String PATIENT_FACESHEET_PROBLEMS = "/ccp-services/problems/userLatestList/{memberId}";
    public static final String PATIENT_FACESHEET_PRESCRIPTION = "/ccp-services/doctorvisit/userLatestList/{memberId}";
    public static final String PATIENT_FACESHEET_FAMILY_HISTORY = "/ccp-services/familyHistory/userLatestList/{memberId}";
    public static final String DOCTOR_DASHBOARD_TODAY_VISITS = "/ccp-services/appointment/loggedInDoctorAppointments";
    public static final String PATIENT_DEMOGRAPHIC_DETAILS = "/ccp-services/authenticate/memberByMemberId/{memberId}";
    public static final String DD_TASKS = "/ccp-services/clinicalNote/partnerPendingTaskList";
    public static final String DD_DATEWISE_APPOINMENTS = "/ccp-services/appointment/dateWiseAppointments/{yyyy-MM-dd}";

    /*Doctor Registration*/
    public static final String DOC_REGISTRATION_URL1 = "/ccp-services/partnerUser/create";
    public static final String DOC_REGISTRATION_URL2 = "/ccp-services/doctor/create";
    public static final String DOC_REG_QUAL = "/ccp-services/qualification/{searchTerm}";
    public static final String DOC_REG_SPECIALITY = "/ccp-services/speciality/{searchTerm}";
    public static final String DOC_REG_PIN_CODE = "/ccp-services/zipCodeManager/{searchTerm}";
    public static final String DOC_REG_PARTNER = "/ccp-services/partners/{searchTerm}";
    public static final String DOC_REG_ROLE = "/ccp-services/role/getRolesbyUserId/{searchTerm}";
    public static final String NOTIFICATION_SERVICE = "/ccp-services/notification/createDeviceInfo";

    /*Doctors Visit - My Encounter*/
    public static final String MY_ENCOUNTER_PENDING = "/ccp-services/clinicalNote/partnerPendingTaskList";
    public static final String MY_ENCOUNTER_COMPLETED = "/ccp-services/clinicalNote/partnerCompletedTaskList";
    public static final String MY_ENCOUNTER_VIEW_MORE = "/ccp-services/clinicalNote/read/{memberId}/{clinicalNoteId}";
    /*PHC Member My Visit*/
    public static final String PHC_MY_VISIT = "/ccp-services/clinicalNote/userList/{memberId}/{pageNumber}"; /*Page number {pageNumber} set to 0*/
    // Appointment Status service
    public static final String MARK_AS_ARRIVED = "/ccp-services/appointment/markAsArrived/{memberId}/{appointmentId}";
    public static final String MARK_AS_READY = "/ccp-services/appointment/markAsReady/{memberId}/{appointmentId}";
    public static final String markAsRoomed = "/ccp-services/appointment/markAsRoomed/{memberId}/{appointmentId}";
    public static final String checkout = "/ccp-services/appointment/checkout/{memberId}/{appointmentId}";
    public static final String markAsNoShow = "/ccp-services/appointment/markAsNoShow/{memberId}/{appointmentId}";
    public static final String markAsRescheduled = "/ccp-services/appointment/markAsRescheduled/{memberId}/{appointmentId}";
    public static final String cancel = "/ccp-services/appointment/cancel/{memberId}/{appointmentId}";
    public static final String markAsScheduled = "/ccp-services/appointment/markAsScheduled/{memberId}/{appointmentId}";
    public static final String markAsConfirmed = "/ccp-services/appointment/markAsConfirmed/{memberId}/{appointmentId}";
    public static final String MARK_EDIT_APPOINTMENT = "/ccp-services/appointment/editAppointment/{memberId}/{appointmentId}";
    public static final String resheduled = "/ccp-services/appointment/reSchedule";
    public static final String editAppointment = "/ccp-services/appointment/updateWithSlot";
    /* Partner User Detail*/
    public static final String PARTNER_DETAIL_URL = "/ccp-services/partners/read/{partnerId}";
    public static final String SESSION_RENEW = "/ccp-services/authenticate/keepTokenAlive";
    public static final String UNIQUE_USER_ID = "/ccp-services/registration/checkUserId/{userId}";
    public static final String CLINICAL_NOTE_FORM_EDIT = "/ccp-services/clinicalNote/patientInfoAndClinicalData/{memberId}/{clinicalNoteId}/{appointmentId}";
    public static final String GOV_ID = "/ccp-services/govIdMaster/allGovernmentIdTypes";
}


