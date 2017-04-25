package com.h5c.postserviceintegration;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by MADHURYA on 6/21/2016.
 */
public class CommonConstants {

    public static String[] toolbarNameStack = new String[20];
    public static int backStackCounter = 0;
    public static String LANDING_NAVAGATION_STRING = null;
    public static final String DASHBOARD = "DashBoard";
    public static final String PATIENT_REGISTRATION = "PatientRegistration";
    public static final String SEARCH_PATIENTS = "SearchPatients";
    public static String SearchPatientMemberId = null;
    public static final String FACESHEET = "FaceSheet";
    public static boolean SESSION_LOGGED_IN = false;
    public static String TOKEN_H5C = null;
    public static String USER_ID = null;
    public static String PARTNER_SIGN_ID = null;
    public static String PARTNER_USER_ID = null;
    public static Boolean CHECK_FOR_LOGIN = false;
    public static Integer GENDER_ID = null;
    public static Integer PARTNER_ID = null;
    public static String PatientName = null;
    public static String PatientBloodGrup = null;
    public static String PatientAge = null;
    public static String PATIENT_USERID;
    public static Long PATIENT_DOB;
    public static String BACK_TO_DASHBOARD = null;
    public static Integer bloodGroupId = null;
    public static Integer language = null;
    public static Integer howDoYouKnowUs = null;
    public static Integer govId = null;
    public static Integer searchParameter = null;
    public static String partnerIdIs = "";

    /*prevention package model*/
    public static String preventionPacakgeID = "000";
    public static String hospitalNameId = "";
    public static String Medicine = "false";

    /*Trackers*/
    public static String HEALTH_TRACKER = "HealthTracker";
    public static String CREATE_TRACKER = "null";

    /*BMITracker*/
    public static final String BMI_TRACKER = "BMITracker";
    public static Objects bmiId = null;
    public static Object bmicreated = null;
    public static Integer bmiDiastolic = 0;
    public static Boolean bmiMarkforDeletion = false;
    public static Double bmioxygenSaturation = 0.0;
    public static Double bmiPulse = 0.0;
    public static Integer bmiSystolic = 0;
    public static Object bmiUpdated = null;
    public static Double bmiWaist = 0.0;
    public static Double bmiTemperature = 0.0;
    public static Integer bmiTrackerFlag = 1;
    public static Integer bmiBMRActivityID = 0;
    public static Double bmiBMR = 0.0;
    public static Integer bmiHUNIT = 1;
    public static Integer bmiWUNIT = 6;
    public static Integer bmiTempUnit = 7;
    public static Object bminame = null;
    public static Boolean bmisysMaster = false;
    public static Integer bmiEnteredbypid = 0;

    public static final String BMR_TRACKER = "BMRTracker";
    public static final String BP_TRACKER = "BPTracker";
    public static final String HWR_TRACKER = "HWRTracker";
    public static final String CHOLESTEROL_TRACKER = "CholesterolTracker";
    public static final String GLUCOSE_TRACKER = "GlucoseTracker";
    public static final String THYROID_TRACKER = "ThyroidTracker";
    public static final String SLEEP_TRACKER = "SleepTracker";
    public static final String WATER_TRACKER = "WaterTracker";
    public static final String BMI_List = "BMIList";
    public static final String DOCTOR_PROFILE = "doc_profile";
    public static final String PHC_DASHBOARD_NEW = "PhcDashBoardNew";
    public static final String BOOK_APPOINTMENT = "BookAppointment";
    public static final String PATIENT_REGISTRATION_AHM = "PatientRegistrationAHM";
    public static final String PATIENT_FACESHEET_NEW = "PatientFaceSheetNew";

    /*Patient Details*/
    public static final String PATIENT_DETAILS = "PatientDetails";
    public static List<String> serchPatientModel = new ArrayList<String>();
    public static Integer ListPosition = null;
    public static int position = 0;
    public static String suggestion_Speciality_Name = null;

    /*Patient Registration*/
    public static Integer PatRegEnteredbypid = null;
    public static String PR_EMAILID = "";

    /*Book Appointments*/
    public static final String BOOK_TIME_SLOTS = "BookTimeSlots";
    public static final String CREATE_APPOINTMENT_VIDEO = "CreateAppointmentVideo";
    public static final String ADD_ATTACHMENT_CREATE_APPOINTMENT = "addAttachmentAppointment";
    public static String attachmentActivity = "";
    public static boolean imageAvailable = false;
    public static String BookOrCall = null;
    public static Integer doc_Id = null;
    public static Integer patientMemberID = null;

    /*Doctor Constants*/
    public static String doctor_id = "null";
    public static String pharamacyid = "null";
    public static Integer prescriptionUpdateId = null;
    public static final String ADD_ENCOUNTER = "AddEncounter";
    public static int enterbyid = 0;
    public static String Created = null;
    public static List<String> dashboardList = new ArrayList<String>();
    public static String vitualRoomIdList;
    public static String connectToDoctorThruAppointmentList = "";
    public static String vitualRoomIdForPHC = null;
    public static final String PATIENT_FACESHEET = "PatientFacesheet";

    /*add alergy creation constants*/
    public static Integer allergyStatus = 0;
    public static Integer allergyType = 0;
    public static Integer allergyTrearedBydoctor = 0;
    public static String ALLERGY_SEARCH_ID_VALUE = null;

    public static String scheduledID = "0";
    public static String templetedId = "0";

    /*vital calculation height and weight*/
    public static String vitaSwitch = "0";
    public static String vitalHeight = "0";
    public static String vitalWeight = "0";
    public static String heightValueFinal = "0";
    public static String weightValueFinal = "0";
    public static String hVitalId = "0";
    public static String wVitalId = "0";
    public static String tVitalId = "0";
    public static String bmiValue = "0";
    public static Integer vitalsUpdateId = null;

    /*app constants*/
    public static final String centiMeters = "1";
    public static final String meters = "2";
    public static final String inches = "3";
    public static final String feets = "4";
    public static final String labs = "5";
    public static final String kelogram = "6";
    public static final String centigrade = "7";
    public static final String faranite = "8";

    /*Test Result*/
    public static Integer Test_Type = null;
    public static String Test_Name_Id = "";
    public static Integer SEC_Test_Name_Id = null;
    public static String immunizationDetailId = "";
    public static String orderdoctorId = "";

    public static String TestInfoName = "TRIGLYCERIDES";
    public static Integer TestInfoId = 3;
    public static Integer TestInfoResult = 1;
    public static String TestObservation = "null";
    public static Long TestResultId = null;
    public static String TestResultReadID = "null";
    public static String UploadedImageStringValue = "null";

    public static Boolean PrimaryMember = true;
    public static String uploadImage = "null";
    public static Integer relationId = null;
    public static Date yyyy_MM_dd_Date_Wise_appoinments = null;
    public static String CreateAppoinment = "";

    public static String addFormsMedium = "";
    public static Long bookingDate;
    public static final String attachmentFormCode = "ADD_FORM_ATTACHMENTS";
    public static final String ADD_VITALS = "ADD Vitals";

    public static String ClinicalNoteViewMoreTag = "";
    public static String ClinicalNoteListId = "";

    public static String urlpath = null;
    public static Context context = null;
    public static Context context1 = null;
    public static ImageView image = null;
    public static Bitmap bitmap = null;
    public static String path = null;
    public static final String IMAGE_VIEWER = "ImageViewerWithoutDownloading";
    public static String appointmentId = "";
    public static String appointmentIdDocdetail = "";

    /*edit switch value*/
    public static String editSwitchValue = "null";

    /*health diary edit switch value*/
    public static final String editAllergies = "allergyList";
    public static final String editVitals = "vitalsList";

    /*Prescription Edit*/
    public static final String editPrescription = "prescriptionList";
    public static String editPresID = "null";
    public static Integer presId = null;
    public static String editDoctorName = "null";
    public static String editNotes = "null";
    public static String editPharmacyName = "null";
    public static String editDate = "0";
    public static String editMedicine = "null";
    public static String editAdminister = "null";
    public static String editDay = "null";
    public static Integer editIntake1 = null;
    public static Integer editIntake2 = null;
    public static Integer editIntake3 = null;
    public static Integer problem = null;

    public static String patientDeatailsDOB = null;
    public static final Long MAX_DATE = 7289634599000l;
    public static final Long MIN_DATE = -2209008601000l;
    public static String encounterTask = "c";
    public static String videoPartViewMore = null;
    public static String connectToDoctor = null;
    public static String pHCDasboardMobile = "";
    /*Add Doctor*/
    public static Integer genderid = null;
    public static Integer specilityId = null;
    public static Integer qualificationid = null;
    public static Boolean D_active = null;
    public static Boolean D_sysmaster = null;
    public static String createApp = "";
    public static String phcFlow = "";

    /* Attachments*/
    public static Integer countForFiveImages = 0;
    public static Integer imageSelected = 0;
    public static boolean addForm = false;
    public static String loginType = "";
    public static String status ="";
    /* clinical Note*/
    public static String clinicalReasonForVisit = "";
/* for changing from add encounter to edit counter or rejoin*/
    public static String checkAddEncounterToEditEncounter = "";
    public static Integer clinicalNoteID = null;
    public static String viewMorePendingtask = "";
    public static String ddTasks = "";

    /*for Session Expire*/
    public static long lastActivity = 0;


    public static Integer patient_PHCnameId = null;
    public static String patient_PHCname = null;
    public static Context contextVideo = null;
    public static final String TAG = "VC-->";
    public static boolean dashboardFlaG = false;
    public static String onlymedicalWarning = "";
    public static boolean netFast= false;
    public static String videopending = "false";
    public static List<String> finalbytes = new ArrayList<String>();
    public static List<String> finalnames = new ArrayList<String>();
    public static List<Long> finalsizes = new ArrayList<Long>();
    public static List<String> finaltypes = new ArrayList<String>();
    public static List<String> finalbytes1 = new ArrayList<String>();
    public static List<String> finalnames1 = new ArrayList<String>();
    public static List<Long> finalsizes1 = new ArrayList<Long>();
    public static List<String> finaltypes1 = new ArrayList<String>();
    public static List<String> finalbytes2 = new ArrayList<String>();
    public static List<String> finalnames2 = new ArrayList<String>();
    public static List<Long> finalsizes2 = new ArrayList<Long>();
    public static List<String> finaltypes2 = new ArrayList<String>();

    public static List<String> finalbytes1Path = new ArrayList<String>();
    public static List<String> finalbytes2Path = new ArrayList<String>();
    public static int maxAttachment= 0;
    public static String phc_name = "";
    public static Bundle bundle = new Bundle();

    //Clonocal Note Setting Data
    public static String bmi = "";
    public static String weight = "";
    public static String tempretaure = "";
    public static String bp = "";
    public static String pulses = "";
    public static String spo = "";
    public static String medicalWarning = "";
    public static String healthCenter = "";
    public static String reasonForVisit = "";
    public static String quickNote = "";
    public static String subjective = "";
    public static String objective = "";
    public static String diagnosis = "";
    public static String plan = "";
    public static String followUp = "";
    public static String prescription = "";
    public static String test = "";
    public static String docName = "";
    public static String degree = "";
    public static String speciality = "";
    public static String docAddress = "";
    public static String organizationName = "";
    public static String orgPinCode = "";
    public static String logo = "";
    public static String sign = "";
    public static String date = "";
    public static String appointmentIdssss = "";
    public static String clinicalNoteIdsss = "";
    public static String VideoFlag = "";
    public static List<String> finalbytesPresPreview = new ArrayList<String>();
    public static List<String> finalbytesTestPreview = new ArrayList<String>();
    public static String patientPhoto = "";
}
