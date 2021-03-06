/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.XmlAgent;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class XmlAgentRecord extends UpdatableRecordImpl<XmlAgentRecord> implements Record7<Integer, String, String, String, String, BigDecimal, Boolean> {

    private static final long serialVersionUID = -1400962601;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.XML_Agent.XML_Agent_ID</code>.
     */
    public void setXmlAgentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.XML_Agent.XML_Agent_ID</code>.
     */
    public Integer getXmlAgentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.XML_Agent.XML_Agent_Name</code>.
     */
    public void setXmlAgentName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.XML_Agent.XML_Agent_Name</code>.
     */
    public String getXmlAgentName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.XML_Agent.Argus_Contact_Name</code>.
     */
    public void setArgusContactName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.XML_Agent.Argus_Contact_Name</code>.
     */
    public String getArgusContactName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.XML_Agent.Argus_Contact_Phone</code>.
     */
    public void setArgusContactPhone(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.XML_Agent.Argus_Contact_Phone</code>.
     */
    public String getArgusContactPhone() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.XML_Agent.Argus_Contact_Email</code>.
     */
    public void setArgusContactEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.XML_Agent.Argus_Contact_Email</code>.
     */
    public String getArgusContactEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.XML_Agent.Rate_Difference</code>.
     */
    public void setRateDifference(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.XML_Agent.Rate_Difference</code>.
     */
    public BigDecimal getRateDifference() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.XML_Agent.XML_Agent_Status</code>.
     */
    public void setXmlAgentStatus(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.XML_Agent.XML_Agent_Status</code>.
     */
    public Boolean getXmlAgentStatus() {
        return (Boolean) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String, BigDecimal, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String, BigDecimal, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return XmlAgent.XML_AGENT.XML_AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return XmlAgent.XML_AGENT.XML_AGENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return XmlAgent.XML_AGENT.ARGUS_CONTACT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return XmlAgent.XML_AGENT.ARGUS_CONTACT_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return XmlAgent.XML_AGENT.ARGUS_CONTACT_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return XmlAgent.XML_AGENT.RATE_DIFFERENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return XmlAgent.XML_AGENT.XML_AGENT_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getXmlAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getXmlAgentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getArgusContactName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getArgusContactPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getArgusContactEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getRateDifference();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getXmlAgentStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getXmlAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getXmlAgentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getArgusContactName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getArgusContactPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getArgusContactEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getRateDifference();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getXmlAgentStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlAgentRecord value1(Integer value) {
        setXmlAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlAgentRecord value2(String value) {
        setXmlAgentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlAgentRecord value3(String value) {
        setArgusContactName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlAgentRecord value4(String value) {
        setArgusContactPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlAgentRecord value5(String value) {
        setArgusContactEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlAgentRecord value6(BigDecimal value) {
        setRateDifference(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlAgentRecord value7(Boolean value) {
        setXmlAgentStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XmlAgentRecord values(Integer value1, String value2, String value3, String value4, String value5, BigDecimal value6, Boolean value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached XmlAgentRecord
     */
    public XmlAgentRecord() {
        super(XmlAgent.XML_AGENT);
    }

    /**
     * Create a detached, initialised XmlAgentRecord
     */
    public XmlAgentRecord(Integer xmlAgentId, String xmlAgentName, String argusContactName, String argusContactPhone, String argusContactEmail, BigDecimal rateDifference, Boolean xmlAgentStatus) {
        super(XmlAgent.XML_AGENT);

        set(0, xmlAgentId);
        set(1, xmlAgentName);
        set(2, argusContactName);
        set(3, argusContactPhone);
        set(4, argusContactEmail);
        set(5, rateDifference);
        set(6, xmlAgentStatus);
    }
}
