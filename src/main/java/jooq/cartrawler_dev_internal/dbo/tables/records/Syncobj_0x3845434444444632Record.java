/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Syncobj_0x3845434444444632;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UByte;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Syncobj_0x3845434444444632Record extends TableRecordImpl<Syncobj_0x3845434444444632Record> {

    private static final long serialVersionUID = 1909358715;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.User_ID</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.User_ID</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.User_Name</code>.
     */
    public void setUserName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.User_Name</code>.
     */
    public String getUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Password</code>.
     */
    public void setPassword(byte... value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Password</code>.
     */
    public byte[] getPassword() {
        return (byte[]) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.PIN</code>.
     */
    public void setPin(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.PIN</code>.
     */
    public String getPin() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Confirm_Enabled</code>.
     */
    public void setConfirmEnabled(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Confirm_Enabled</code>.
     */
    public Boolean getConfirmEnabled() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Name</code>.
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Name</code>.
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.EMail</code>.
     */
    public void setEmail(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.EMail</code>.
     */
    public String getEmail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Address</code>.
     */
    public void setAddress(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Address</code>.
     */
    public String getAddress() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Phone_No</code>.
     */
    public void setPhoneNo(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Phone_No</code>.
     */
    public String getPhoneNo() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Fax_No</code>.
     */
    public void setFaxNo(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Fax_No</code>.
     */
    public String getFaxNo() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Location_ID</code>.
     */
    public void setLocationId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Location_ID</code>.
     */
    public Integer getLocationId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Agency_ID</code>.
     */
    public void setAgencyId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Agency_ID</code>.
     */
    public Integer getAgencyId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Agency_Master</code>.
     */
    public void setAgencyMaster(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Agency_Master</code>.
     */
    public Boolean getAgencyMaster() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.System_Master</code>.
     */
    public void setSystemMaster(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.System_Master</code>.
     */
    public Boolean getSystemMaster() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Reports_User</code>.
     */
    public void setReportsUser(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Reports_User</code>.
     */
    public Boolean getReportsUser() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Marketing_User</code>.
     */
    public void setMarketingUser(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Marketing_User</code>.
     */
    public Boolean getMarketingUser() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Disabled</code>.
     */
    public void setDisabled(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Disabled</code>.
     */
    public Boolean getDisabled() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.User_Type</code>.
     */
    public void setUserType(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.User_Type</code>.
     */
    public String getUserType() {
        return (String) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Financial_access</code>.
     */
    public void setFinancialAccess(Boolean value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.Financial_access</code>.
     */
    public Boolean getFinancialAccess() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.isdeleted</code>.
     */
    public void setIsdeleted(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.isdeleted</code>.
     */
    public Boolean getIsdeleted() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.rights</code>.
     */
    public void setRights(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.rights</code>.
     */
    public String getRights() {
        return (String) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.mobile</code>.
     */
    public void setMobile(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.mobile</code>.
     */
    public String getMobile() {
        return (String) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.prefsDemoMode</code>.
     */
    public void setPrefsdemomode(Boolean value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.prefsDemoMode</code>.
     */
    public Boolean getPrefsdemomode() {
        return (Boolean) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.prefsDataMode</code>.
     */
    public void setPrefsdatamode(Boolean value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.prefsDataMode</code>.
     */
    public Boolean getPrefsdatamode() {
        return (Boolean) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.prefsHighPrecisionMode</code>.
     */
    public void setPrefshighprecisionmode(Boolean value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.prefsHighPrecisionMode</code>.
     */
    public Boolean getPrefshighprecisionmode() {
        return (Boolean) get(24);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.pricingMaxFrom</code>.
     */
    public void setPricingmaxfrom(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.pricingMaxFrom</code>.
     */
    public Integer getPricingmaxfrom() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.pricingMaxTo</code>.
     */
    public void setPricingmaxto(Integer value) {
        set(26, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.pricingMaxTo</code>.
     */
    public Integer getPricingmaxto() {
        return (Integer) get(26);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.fk_pricingApprover</code>.
     */
    public void setFkPricingapprover(Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.fk_pricingApprover</code>.
     */
    public Integer getFkPricingapprover() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.org_id</code>.
     */
    public void setOrgId(Integer value) {
        set(28, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.org_id</code>.
     */
    public Integer getOrgId() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.pref_db_host</code>.
     */
    public void setPrefDbHost(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.pref_db_host</code>.
     */
    public String getPrefDbHost() {
        return (String) get(29);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.amendedBy</code>.
     */
    public void setAmendedby(Integer value) {
        set(30, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.amendedBy</code>.
     */
    public Integer getAmendedby() {
        return (Integer) get(30);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.isGroup</code>.
     */
    public void setIsgroup(Boolean value) {
        set(31, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.isGroup</code>.
     */
    public Boolean getIsgroup() {
        return (Boolean) get(31);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.isClientUser</code>.
     */
    public void setIsclientuser(Boolean value) {
        set(32, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.isClientUser</code>.
     */
    public Boolean getIsclientuser() {
        return (Boolean) get(32);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.originatingClient</code>.
     */
    public void setOriginatingclient(Integer value) {
        set(33, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.originatingClient</code>.
     */
    public Integer getOriginatingclient() {
        return (Integer) get(33);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.userClientID</code>.
     */
    public void setUserclientid(Integer value) {
        set(34, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.userClientID</code>.
     */
    public Integer getUserclientid() {
        return (Integer) get(34);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.nontrustedclient</code>.
     */
    public void setNontrustedclient(Boolean value) {
        set(35, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.nontrustedclient</code>.
     */
    public Boolean getNontrustedclient() {
        return (Boolean) get(35);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.lastChangePass</code>.
     */
    public void setLastchangepass(Timestamp value) {
        set(36, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.lastChangePass</code>.
     */
    public Timestamp getLastchangepass() {
        return (Timestamp) get(36);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.defaultDashboardChannelType</code>.
     */
    public void setDefaultdashboardchanneltype(UByte value) {
        set(37, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.defaultDashboardChannelType</code>.
     */
    public UByte getDefaultdashboardchanneltype() {
        return (UByte) get(37);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.isKoiosUser</code>.
     */
    public void setIskoiosuser(Boolean value) {
        set(38, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.isKoiosUser</code>.
     */
    public Boolean getIskoiosuser() {
        return (Boolean) get(38);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.UserFlags</code>.
     */
    public void setUserflags(Integer value) {
        set(39, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.UserFlags</code>.
     */
    public Integer getUserflags() {
        return (Integer) get(39);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.car_agent_id</code>.
     */
    public void setCarAgentId(Integer value) {
        set(40, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.car_agent_id</code>.
     */
    public Integer getCarAgentId() {
        return (Integer) get(40);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.GenesysExtension</code>.
     */
    public void setGenesysextension(Short value) {
        set(41, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.GenesysExtension</code>.
     */
    public Short getGenesysextension() {
        return (Short) get(41);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.lastlogindate</code>.
     */
    public void setLastlogindate(Timestamp value) {
        set(42, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.lastlogindate</code>.
     */
    public Timestamp getLastlogindate() {
        return (Timestamp) get(42);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.redshift</code>.
     */
    public void setRedshift(Boolean value) {
        set(43, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3845434444444632.redshift</code>.
     */
    public Boolean getRedshift() {
        return (Boolean) get(43);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Syncobj_0x3845434444444632Record
     */
    public Syncobj_0x3845434444444632Record() {
        super(Syncobj_0x3845434444444632.SYNCOBJ_0X3845434444444632);
    }

    /**
     * Create a detached, initialised Syncobj_0x3845434444444632Record
     */
    public Syncobj_0x3845434444444632Record(Integer userId, String userName, byte[] password, String pin, Boolean confirmEnabled, String name, String email, String address, String phoneNo, String faxNo, Integer locationId, Integer agencyId, Boolean agencyMaster, Boolean systemMaster, Boolean reportsUser, Boolean marketingUser, Boolean disabled, String userType, Boolean financialAccess, Boolean isdeleted, String rights, String mobile, Boolean prefsdemomode, Boolean prefsdatamode, Boolean prefshighprecisionmode, Integer pricingmaxfrom, Integer pricingmaxto, Integer fkPricingapprover, Integer orgId, String prefDbHost, Integer amendedby, Boolean isgroup, Boolean isclientuser, Integer originatingclient, Integer userclientid, Boolean nontrustedclient, Timestamp lastchangepass, UByte defaultdashboardchanneltype, Boolean iskoiosuser, Integer userflags, Integer carAgentId, Short genesysextension, Timestamp lastlogindate, Boolean redshift) {
        super(Syncobj_0x3845434444444632.SYNCOBJ_0X3845434444444632);

        set(0, userId);
        set(1, userName);
        set(2, password);
        set(3, pin);
        set(4, confirmEnabled);
        set(5, name);
        set(6, email);
        set(7, address);
        set(8, phoneNo);
        set(9, faxNo);
        set(10, locationId);
        set(11, agencyId);
        set(12, agencyMaster);
        set(13, systemMaster);
        set(14, reportsUser);
        set(15, marketingUser);
        set(16, disabled);
        set(17, userType);
        set(18, financialAccess);
        set(19, isdeleted);
        set(20, rights);
        set(21, mobile);
        set(22, prefsdemomode);
        set(23, prefsdatamode);
        set(24, prefshighprecisionmode);
        set(25, pricingmaxfrom);
        set(26, pricingmaxto);
        set(27, fkPricingapprover);
        set(28, orgId);
        set(29, prefDbHost);
        set(30, amendedby);
        set(31, isgroup);
        set(32, isclientuser);
        set(33, originatingclient);
        set(34, userclientid);
        set(35, nontrustedclient);
        set(36, lastchangepass);
        set(37, defaultdashboardchanneltype);
        set(38, iskoiosuser);
        set(39, userflags);
        set(40, carAgentId);
        set(41, genesysextension);
        set(42, lastlogindate);
        set(43, redshift);
    }
}