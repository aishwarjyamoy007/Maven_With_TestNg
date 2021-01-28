package com.company;

public class Constants {
    public static String webUrl="https://www.cognizant.com/";
    public static  String chromeSuccess="Chrome is opened";
    public static  String chromeFailure="Chrome is not opened";
    public static  String MicrosoftEdgeSuccess="Microsoft Edge is opened";
    public static  String MicrosoftEdgeFailure="Microsoft Edge is not opened";
    public static  String websiteSuccess="Website  is opened";
    public static  String websiteFailure="Website  is not opened";
    public static String xpathAbout="//a[@id='About']";
    public static String aboutSuccess="About Menu is clicked Successfully";
    public static String aboutFailure="About Menu is not clicked Successfully";
    public static String xpathContactUs="//a[@class='flex-container align-middle' and @title='Contact Us']";
    public static String contactUsSuccess="Contact Us Menu is clicked Successfully";
    public static String contactUsFailure="Contact Us Menu is not clicked Successfully";
    public static String xpathTwitter="//a[@title='Twitter'and @class='mr1']";
    public static String xpathTwitterLinkText="//a[contains(text(),'Twitter')]";
    public static String twitterSuccess="Twitter Icon is validated Successfully";
    public static String twitterFailure="Twitter Icon is not validated Successfully";
    public static String xpathFacebook="//a[@title='Facebook'and @class='mr1']";
    public static String xpathFacebookLinkText="//a[contains(text(),'Facebook')]";
    public static String facebookSuccess="FaceBook Icon is validated Successfully";
    public static String facebookFailure="FaceBook Icon is not validated Successfully";
    public static String xpathLinkedin="//a[@title='LinkedIn'and @class='mr1']";
    public static String xpathLinkedInLinkText="//a[contains(text(),'LinkedIn')]";
    public static String linkedInSuccess="LinkedIn Icon is validated Successfully";
    public static String linkedInFailure="LinkedIn Icon is not validated Successfully";
    public static String xpathContactOurTeam="//a[@title='CONTACT OUR TEAM']";
    public static String contactOurTeamSuccess="Contact Our Team menu is clicked Successfully";
    public static String contactOurTeamFailure="Contact Our Team menu is clicked Successfully";
    public static String xpathNameAttribute="//label[contains(text(),'NAME')]";
    public static String xpathNameInputField="//input[@id='firstname' and @name='FIRST NAME']";
    public static String xpathEmailInputField="//input[@id='emailid' and @name='EMAIL']";
    public static String xpathOrganizationInputField="//input[@id='organisation' and @name='ORGANIZATION']";
    public static String xpathContactNumberInputField="(//input[@id='contact'])[1]";

    public static String nameAttributeSuccess="Name Attribute is validated Successfully";
    public static String nameAttributeFailure="Name Attribute is not validated Successfully";
    public static String xpathEmailAttribute="//label[contains(text(),'EMAIL')]";
    public static String emailAttributeSuccess="Email Attribute is validated Successfully";
    public static String emailAttributeFailure="Email Attribute is not validated Successfully";
    public static String xpathOrganizationAttribute="//label[contains(text(),'ORGANIZATION')]";
    public static String organizationAttributeSuccess="Organization Attribute is validated Successfully";
    public static String organizationAttributeFailure="Organization Attribute is not validated Successfully";
    public static String xpathContactNumberAttribute="//label[contains(text(),'CONTACT NUMBER')]";
    public static String contactNumberAttributeSuccess="Contact Number Attribute is validated Successfully";
    public static String contactNumberAttributeFailure="Contact Number Attribute is not validated Successfully";
    public static String xpathSelectRegionAttribute="//select[@id='region' and @name='select']";
    public static String regionAttributeSuccess="Region Attribute is validated Successfully";
    public static String regionAttributeFailure="Region Attribute is not validated Successfully";
    public static String xpathSelectEnquiryAttribute="//select[@id='enquiry' and @name='select']";
    public static String enquiryAttributeSuccess="Enquiry Attribute is validated Successfully";
    public static String enquiryAttributeFailure="Enquiry Attribute is not validated Successfully";
    public static String xpathMessageAttribute="//label[contains(text(),'MESSAGE')]";
    public static String messageAttributeSuccess="Message Attribute is validated Successfully";
    public static String messageAttributeFailure="Message Attribute is not validated Successfully";
    public static String xpathContactButton="//a[@class='button my-half medium-m0 small js-contact-widget']";
    public static String contactButtonSuccess="Message Attribute is validated Successfully";
    public static String contactButtonFailure="Message Attribute is not validated Successfully";
    public static String xpathNameButtonAttribute="//span[contains(text(),'Name*')]";
    public static String xpathEmailButtonAttribute="//span[contains(text(),'Email*')]";
    public static String xpathOrganizationButtonAttribute="//span[contains(text(),'Organization*')]";
    public static String xpathPhoneNumberButtonAttribute="//span[contains(text(),'Phone Number*')]";
    public static String xpathRegionButtonAttribute="//select[@id='region'and @name='select']";
    public static String xpathEnquiryButtonAttribute="//select[@id='enquiry'and @name='select']";
    public static String xpathMessageButtonAttribute="//label[contains(text(),'MESSAGE')]";
    public static String xpathLatestThinking="//a[@id='Latest_thinking']";
    public static String xpathJobsOfFutureIndex="//a[@title='Jobs of the Future Index'and @class='flex-container align-middle']";
    public static String xpathIndex="(//h3[contains(text(),'Cognizant Jobs of the Future Index')])[1]";
    public static String xpathQtrChange="(//p[contains(text(),'% Qtr.Change:')and @class='inline-block m0 text-bold'])[1]";
    public static String qtrChangeValue="(//span[@class='float-right text-green text-red'])[1]";
    public static String xpathYearChange="(//p[contains(text(),'% Year Change:')])[1]";
    public static String yearChangeValue="(//span[@class='float-right text-green text-red'])[2]";
    public static String xpathQtrJobChange="(//p[contains(text(),'Qtr. Jobs Change:')])[1]";
    public static String xpathQtrChangeValue="(//span[@class='float-right text-green text-red'])[3]";
    public static String xpathTotalCjobs="//p[contains(text(),'Total CJoF Jobs:')]";
    public static String totalCjobsValue="(//span[@class='float-right'])[1]";
    public static String jdbcUrl="jdbc:sqlite:C:/Users/user/Desktop/Sqlite/";
    public static String jdbcSuccessMessage="A new database has been created.";
    public static String jdbcFailureMessage="A new database cannot be created";
    public static String tableUrl="jdbc:sqlite:C:/Users/user/Desktop/Sqlite/COGNIZANT.db";
    public static String tableCreationSuccessMessage="New table is Successfully created";
    public static String rowSuccessfullyAddedMessage="Row is Successfully Inserted";
    public static String rowAdditionFailureMessage="Insert to Table is  Failed";
    public static String querySuccessfullyExecutedMessage="SELECT Query Successfully executed";
    public static String selectQuery="select distinct * from COGNIZANT_INDEX";
    public static String tableCreationQuery="CREATE TABLE IF NOT EXISTS COGNIZANT_INDEX (\n"
            + "	field VARCHAR(10) ,\n"
            + "	value VARCHAR(10)\n"+");";
    public static String jsonReadSuccessMessage="Reading from the JSON File is successful";
    public static String jsonReadFailureMessage="Reading from the JSON File is not Successful";
    public static String jsonWriteSuccessMessage="Writing to the JSON File is Successful";
    public static String jsonWriteFailureMessage="Writing to the JSON File is not Successful";






}
