//package sample;
//
//import javafx.beans.property.SimpleStringProperty;
//import javafx.beans.property.StringProperty;
//
//public class SignUpModel {
//
//    private final StringProperty FIRSTNAME;
//    private final StringProperty LASTNAME;
//    private final StringProperty USERNAME;
//    private final StringProperty PASSWORD;
//    private final StringProperty PHONE;
//    private final StringProperty GENDER;
//
//    public SignUpModel( String firstname , String lastname , String username , String password , String phone , String gender) {
//
//        this.FIRSTNAME = new SimpleStringProperty(firstname);
//        this.LASTNAME = new SimpleStringProperty(lastname);
//        this.USERNAME = new SimpleStringProperty(username);
//        this.PASSWORD = new SimpleStringProperty(password);
//        this.PHONE = new SimpleStringProperty(phone);
//        this.GENDER = new SimpleStringProperty(gender);
//
//    }
//
//    public String getFIRSTNAME() {
//        return FIRSTNAME.get();
//    }
//
//    public StringProperty FIRSTNAMEProperty() {
//        return FIRSTNAME;
//    }
//
//    public void setFIRSTNAME(String FIRSTNAME) {
//        this.FIRSTNAME.set(FIRSTNAME);
//    }
//
//    public String getLASTNAME() {
//        return LASTNAME.get();
//    }
//
//    public StringProperty LASTNAMEProperty() {
//        return LASTNAME;
//    }
//
//    public void setLASTNAME(String LASTNAME) {
//        this.LASTNAME.set(LASTNAME);
//    }
//
//    public String getUSERNAME() {
//        return USERNAME.get();
//    }
//
//    public StringProperty USERNAMEProperty() {
//        return USERNAME;
//    }
//
//    public void setUSERNAME(String USERNAME) {
//        this.USERNAME.set(USERNAME);
//    }
//
//    public String getPASSWORD() {
//        return PASSWORD.get();
//    }
//
//    public StringProperty PASSWORDProperty() {
//        return PASSWORD;
//    }
//
//    public void setPASSWORD(String PASSWORD) {
//        this.PASSWORD.set(PASSWORD);
//    }
//
//    public String getPHONE() {
//        return PHONE.get();
//    }
//
//    public StringProperty PHONEProperty() {
//        return PHONE;
//    }
//
//    public void setPHONE(String PHONE) {
//        this.PHONE.set(PHONE);
//    }
//
//    public String getGENDER() {
//        return GENDER.get();
//    }
//
//    public StringProperty GENDERProperty() {
//        return GENDER;
//    }
//
//    public void setGENDER(String GENDER) {
//        this.GENDER.set(GENDER);
//    }
//
//}
