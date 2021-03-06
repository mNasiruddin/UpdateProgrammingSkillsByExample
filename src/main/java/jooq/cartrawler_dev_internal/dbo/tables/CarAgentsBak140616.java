/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.CarAgentsBak140616Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class CarAgentsBak140616 extends TableImpl<CarAgentsBak140616Record> {

    private static final long serialVersionUID = 1386785774;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.car_agents_bak140616</code>
     */
    public static final CarAgentsBak140616 CAR_AGENTS_BAK140616 = new CarAgentsBak140616();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CarAgentsBak140616Record> getRecordType() {
        return CarAgentsBak140616Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.car_agent_id</code>.
     */
    public final TableField<CarAgentsBak140616Record, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.car_agent_name</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> CAR_AGENT_NAME = createField("car_agent_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.contact_phone</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> CONTACT_PHONE = createField("contact_phone", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.contact_fax</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> CONTACT_FAX = createField("contact_fax", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.country_id</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.booking_email</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> BOOKING_EMAIL = createField("booking_email", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.airport_tax</code>.
     */
    public final TableField<CarAgentsBak140616Record, BigDecimal> AIRPORT_TAX = createField("airport_tax", org.jooq.impl.SQLDataType.NUMERIC(5, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.plan_code</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> PLAN_CODE = createField("plan_code", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.account_no</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> ACCOUNT_NO = createField("account_no", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.rental_conditions</code>.
     */
    public final TableField<CarAgentsBak140616Record, Integer> RENTAL_CONDITIONS = createField("rental_conditions", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.rates_email</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> RATES_EMAIL = createField("rates_email", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.password</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.Airport_Tax_Amt</code>.
     */
    public final TableField<CarAgentsBak140616Record, BigDecimal> AIRPORT_TAX_AMT = createField("Airport_Tax_Amt", org.jooq.impl.SQLDataType.NUMERIC(9, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.europe_rates</code>.
     */
    public final TableField<CarAgentsBak140616Record, Boolean> EUROPE_RATES = createField("europe_rates", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.freesale_code</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> FREESALE_CODE = createField("freesale_code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.markup_percent</code>.
     */
    public final TableField<CarAgentsBak140616Record, BigDecimal> MARKUP_PERCENT = createField("markup_percent", org.jooq.impl.SQLDataType.NUMERIC(9, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.fully_paid</code>.
     */
    public final TableField<CarAgentsBak140616Record, Boolean> FULLY_PAID = createField("fully_paid", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.markup_change_date</code>.
     */
    public final TableField<CarAgentsBak140616Record, Timestamp> MARKUP_CHANGE_DATE = createField("markup_change_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.markup_change_user</code>.
     */
    public final TableField<CarAgentsBak140616Record, Integer> MARKUP_CHANGE_USER = createField("markup_change_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.car_agent_desc</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> CAR_AGENT_DESC = createField("car_agent_desc", org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.car_agent_status</code>.
     */
    public final TableField<CarAgentsBak140616Record, Boolean> CAR_AGENT_STATUS = createField("car_agent_status", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.image</code>.
     */
    public final TableField<CarAgentsBak140616Record, byte[]> IMAGE = createField("image", org.jooq.impl.SQLDataType.BINARY(2147483647), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.image_width</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> IMAGE_WIDTH = createField("image_width", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.image_height</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> IMAGE_HEIGHT = createField("image_height", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.xml_agent_id</code>.
     */
    public final TableField<CarAgentsBak140616Record, Integer> XML_AGENT_ID = createField("xml_agent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.xml_agent_type</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> XML_AGENT_TYPE = createField("xml_agent_type", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.year_loaded</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> YEAR_LOADED = createField("year_loaded", org.jooq.impl.SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.oneway_charge</code>.
     */
    public final TableField<CarAgentsBak140616Record, BigDecimal> ONEWAY_CHARGE = createField("oneway_charge", org.jooq.impl.SQLDataType.NUMERIC(9, 3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.iscommercial</code>.
     */
    public final TableField<CarAgentsBak140616Record, Boolean> ISCOMMERCIAL = createField("iscommercial", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.priceless</code>.
     */
    public final TableField<CarAgentsBak140616Record, Integer> PRICELESS = createField("priceless", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.picture</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> PICTURE = createField("picture", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.company_name</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> COMPANY_NAME = createField("company_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.percentage_bias</code>.
     */
    public final TableField<CarAgentsBak140616Record, Integer> PERCENTAGE_BIAS = createField("percentage_bias", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.technical_contact_email</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> TECHNICAL_CONTACT_EMAIL = createField("technical_contact_email", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.amendedBy</code>.
     */
    public final TableField<CarAgentsBak140616Record, Integer> AMENDEDBY = createField("amendedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.ui_token</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> UI_TOKEN = createField("ui_token", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.reporting_email</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> REPORTING_EMAIL = createField("reporting_email", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.preferred_supplier</code>.
     */
    public final TableField<CarAgentsBak140616Record, Boolean> PREFERRED_SUPPLIER = createField("preferred_supplier", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.cxl_fee</code>.
     */
    public final TableField<CarAgentsBak140616Record, BigDecimal> CXL_FEE = createField("cxl_fee", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.cxl_currency</code>.
     */
    public final TableField<CarAgentsBak140616Record, String> CXL_CURRENCY = createField("cxl_currency", org.jooq.impl.SQLDataType.VARCHAR(6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.pruning_category</code>.
     */
    public final TableField<CarAgentsBak140616Record, Integer> PRUNING_CATEGORY = createField("pruning_category", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.ca_flags</code>.
     */
    public final TableField<CarAgentsBak140616Record, Integer> CA_FLAGS = createField("ca_flags", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.fk_legalagreement</code>.
     */
    public final TableField<CarAgentsBak140616Record, Integer> FK_LEGALAGREEMENT = createField("fk_legalagreement", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.fk_supplierbrand</code>.
     */
    public final TableField<CarAgentsBak140616Record, Integer> FK_SUPPLIERBRAND = createField("fk_supplierbrand", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.fk_suppliers</code>.
     */
    public final TableField<CarAgentsBak140616Record, Integer> FK_SUPPLIERS = createField("fk_suppliers", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agents_bak140616.last_updated_date</code>.
     */
    public final TableField<CarAgentsBak140616Record, Timestamp> LAST_UPDATED_DATE = createField("last_updated_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.car_agents_bak140616</code> table reference
     */
    public CarAgentsBak140616() {
        this(DSL.name("car_agents_bak140616"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.car_agents_bak140616</code> table reference
     */
    public CarAgentsBak140616(String alias) {
        this(DSL.name(alias), CAR_AGENTS_BAK140616);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.car_agents_bak140616</code> table reference
     */
    public CarAgentsBak140616(Name alias) {
        this(alias, CAR_AGENTS_BAK140616);
    }

    private CarAgentsBak140616(Name alias, Table<CarAgentsBak140616Record> aliased) {
        this(alias, aliased, null);
    }

    private CarAgentsBak140616(Name alias, Table<CarAgentsBak140616Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CarAgentsBak140616(Table<O> child, ForeignKey<O, CarAgentsBak140616Record> key) {
        super(child, key, CAR_AGENTS_BAK140616);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CarAgentsBak140616Record, Integer> getIdentity() {
        return Keys.IDENTITY_CAR_AGENTS_BAK140616;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentsBak140616 as(String alias) {
        return new CarAgentsBak140616(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentsBak140616 as(Name alias) {
        return new CarAgentsBak140616(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CarAgentsBak140616 rename(String name) {
        return new CarAgentsBak140616(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CarAgentsBak140616 rename(Name name) {
        return new CarAgentsBak140616(name, null);
    }
}
