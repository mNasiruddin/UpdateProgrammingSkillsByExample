/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Onlinestopsaleconfig;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;


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
public class OnlinestopsaleconfigRecord extends UpdatableRecordImpl<OnlinestopsaleconfigRecord> implements Record21<UUID, Long, String, String, String, String, Boolean, String, String, String, String, String, String, String, String, Boolean, String, String, Long, Long, String> {

    private static final long serialVersionUID = -1551601296;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.car_agent_id</code>.
     */
    public void setCarAgentId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.car_agent_id</code>.
     */
    public Long getCarAgentId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.currency</code>.
     */
    public void setCurrency(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.currency</code>.
     */
    public String getCurrency() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.time_zone_id</code>.
     */
    public void setTimeZoneId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.time_zone_id</code>.
     */
    public String getTimeZoneId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.separator</code>.
     */
    public void setSeparator(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.separator</code>.
     */
    public String getSeparator() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.money_separator</code>.
     */
    public void setMoneySeparator(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.money_separator</code>.
     */
    public String getMoneySeparator() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.rate_code</code>.
     */
    public void setRateCode(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.rate_code</code>.
     */
    public Boolean getRateCode() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.protocol</code>.
     */
    public void setProtocol(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.protocol</code>.
     */
    public String getProtocol() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.user_id</code>.
     */
    public void setUserId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.user_id</code>.
     */
    public String getUserId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.password</code>.
     */
    public void setPassword(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.password</code>.
     */
    public String getPassword() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.prod_url</code>.
     */
    public void setProdUrl(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.prod_url</code>.
     */
    public String getProdUrl() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.file_name</code>.
     */
    public void setFileName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.file_name</code>.
     */
    public String getFileName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.weekend_pickup</code>.
     */
    public void setWeekendPickup(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.weekend_pickup</code>.
     */
    public String getWeekendPickup() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.weekend_return</code>.
     */
    public void setWeekendReturn(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.weekend_return</code>.
     */
    public String getWeekendReturn() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.car_group_match</code>.
     */
    public void setCarGroupMatch(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.car_group_match</code>.
     */
    public String getCarGroupMatch() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.isActive</code>.
     */
    public void setIsactive(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.isActive</code>.
     */
    public Boolean getIsactive() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.config_match_kind</code>.
     */
    public void setConfigMatchKind(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.config_match_kind</code>.
     */
    public String getConfigMatchKind() {
        return (String) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.config_match</code>.
     */
    public void setConfigMatch(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.config_match</code>.
     */
    public String getConfigMatch() {
        return (String) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.CreatedDate</code>.
     */
    public void setCreateddate(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.CreatedDate</code>.
     */
    public Long getCreateddate() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.lastReadTime</code>.
     */
    public void setLastreadtime(Long value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.lastReadTime</code>.
     */
    public Long getLastreadtime() {
        return (Long) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.lastReadStatus</code>.
     */
    public void setLastreadstatus(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.OnlineStopSaleConfig.lastReadStatus</code>.
     */
    public String getLastreadstatus() {
        return (String) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<UUID, Long, String, String, String, String, Boolean, String, String, String, String, String, String, String, String, Boolean, String, String, Long, Long, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<UUID, Long, String, String, String, String, Boolean, String, String, String, String, String, String, String, String, Boolean, String, String, Long, Long, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.CAR_AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.TIME_ZONE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.SEPARATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.MONEY_SEPARATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.RATE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.PROTOCOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.PROD_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.WEEKEND_PICKUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.WEEKEND_RETURN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.CAR_GROUP_MATCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field16() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.ISACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.CONFIG_MATCH_KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.CONFIG_MATCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field19() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field20() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.LASTREADTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return Onlinestopsaleconfig.ONLINESTOPSALECONFIG.LASTREADSTATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTimeZoneId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSeparator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getMoneySeparator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getRateCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getProtocol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getProdUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getWeekendPickup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getWeekendReturn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getCarGroupMatch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component16() {
        return getIsactive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getConfigMatchKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getConfigMatch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component19() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component20() {
        return getLastreadtime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component21() {
        return getLastreadstatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTimeZoneId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSeparator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMoneySeparator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getRateCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getProtocol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getProdUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getWeekendPickup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getWeekendReturn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCarGroupMatch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value16() {
        return getIsactive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getConfigMatchKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getConfigMatch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value19() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value20() {
        return getLastreadtime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getLastreadstatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value2(Long value) {
        setCarAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value3(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value4(String value) {
        setTimeZoneId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value5(String value) {
        setSeparator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value6(String value) {
        setMoneySeparator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value7(Boolean value) {
        setRateCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value8(String value) {
        setProtocol(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value9(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value10(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value11(String value) {
        setProdUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value12(String value) {
        setFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value13(String value) {
        setWeekendPickup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value14(String value) {
        setWeekendReturn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value15(String value) {
        setCarGroupMatch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value16(Boolean value) {
        setIsactive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value17(String value) {
        setConfigMatchKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value18(String value) {
        setConfigMatch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value19(Long value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value20(Long value) {
        setLastreadtime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord value21(String value) {
        setLastreadstatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnlinestopsaleconfigRecord values(UUID value1, Long value2, String value3, String value4, String value5, String value6, Boolean value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, Boolean value16, String value17, String value18, Long value19, Long value20, String value21) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OnlinestopsaleconfigRecord
     */
    public OnlinestopsaleconfigRecord() {
        super(Onlinestopsaleconfig.ONLINESTOPSALECONFIG);
    }

    /**
     * Create a detached, initialised OnlinestopsaleconfigRecord
     */
    public OnlinestopsaleconfigRecord(UUID guid, Long carAgentId, String currency, String timeZoneId, String separator, String moneySeparator, Boolean rateCode, String protocol, String userId, String password, String prodUrl, String fileName, String weekendPickup, String weekendReturn, String carGroupMatch, Boolean isactive, String configMatchKind, String configMatch, Long createddate, Long lastreadtime, String lastreadstatus) {
        super(Onlinestopsaleconfig.ONLINESTOPSALECONFIG);

        set(0, guid);
        set(1, carAgentId);
        set(2, currency);
        set(3, timeZoneId);
        set(4, separator);
        set(5, moneySeparator);
        set(6, rateCode);
        set(7, protocol);
        set(8, userId);
        set(9, password);
        set(10, prodUrl);
        set(11, fileName);
        set(12, weekendPickup);
        set(13, weekendReturn);
        set(14, carGroupMatch);
        set(15, isactive);
        set(16, configMatchKind);
        set(17, configMatch);
        set(18, createddate);
        set(19, lastreadtime);
        set(20, lastreadstatus);
    }
}
