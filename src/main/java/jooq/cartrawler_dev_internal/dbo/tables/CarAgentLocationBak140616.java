/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.CarAgentLocationBak140616Record;

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
public class CarAgentLocationBak140616 extends TableImpl<CarAgentLocationBak140616Record> {

    private static final long serialVersionUID = 1486009433;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616</code>
     */
    public static final CarAgentLocationBak140616 CAR_AGENT_LOCATION_BAK140616 = new CarAgentLocationBak140616();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CarAgentLocationBak140616Record> getRecordType() {
        return CarAgentLocationBak140616Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616.car_agent_location_id</code>.
     */
    public final TableField<CarAgentLocationBak140616Record, Integer> CAR_AGENT_LOCATION_ID = createField("car_agent_location_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616.status</code>.
     */
    public final TableField<CarAgentLocationBak140616Record, Boolean> STATUS = createField("status", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616.car_agent_id</code>.
     */
    public final TableField<CarAgentLocationBak140616Record, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616.car_agent_location_name</code>.
     */
    public final TableField<CarAgentLocationBak140616Record, String> CAR_AGENT_LOCATION_NAME = createField("car_agent_location_name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616.car_agent_location_code</code>.
     */
    public final TableField<CarAgentLocationBak140616Record, String> CAR_AGENT_LOCATION_CODE = createField("car_agent_location_code", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616.corporate_location_code</code>.
     */
    public final TableField<CarAgentLocationBak140616Record, String> CORPORATE_LOCATION_CODE = createField("corporate_location_code", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616.physical_location_id</code>.
     */
    public final TableField<CarAgentLocationBak140616Record, Integer> PHYSICAL_LOCATION_ID = createField("physical_location_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616.flags</code>.
     */
    public final TableField<CarAgentLocationBak140616Record, Short> FLAGS = createField("flags", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616.filter_option</code>.
     */
    public final TableField<CarAgentLocationBak140616Record, Integer> FILTER_OPTION = createField("filter_option", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616.CarMetrics1</code>.
     */
    public final TableField<CarAgentLocationBak140616Record, BigDecimal> CARMETRICS1 = createField("CarMetrics1", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616.CarMetrics2</code>.
     */
    public final TableField<CarAgentLocationBak140616Record, BigDecimal> CARMETRICS2 = createField("CarMetrics2", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616.CarMetrics3</code>.
     */
    public final TableField<CarAgentLocationBak140616Record, BigDecimal> CARMETRICS3 = createField("CarMetrics3", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616.CarMetrics4</code>.
     */
    public final TableField<CarAgentLocationBak140616Record, BigDecimal> CARMETRICS4 = createField("CarMetrics4", org.jooq.impl.SQLDataType.NUMERIC(10, 4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616.demolition_date</code>.
     */
    public final TableField<CarAgentLocationBak140616Record, Timestamp> DEMOLITION_DATE = createField("demolition_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616.demolition_reason</code>.
     */
    public final TableField<CarAgentLocationBak140616Record, Short> DEMOLITION_REASON = createField("demolition_reason", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616</code> table reference
     */
    public CarAgentLocationBak140616() {
        this(DSL.name("car_agent_location_bak140616"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616</code> table reference
     */
    public CarAgentLocationBak140616(String alias) {
        this(DSL.name(alias), CAR_AGENT_LOCATION_BAK140616);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.car_agent_location_bak140616</code> table reference
     */
    public CarAgentLocationBak140616(Name alias) {
        this(alias, CAR_AGENT_LOCATION_BAK140616);
    }

    private CarAgentLocationBak140616(Name alias, Table<CarAgentLocationBak140616Record> aliased) {
        this(alias, aliased, null);
    }

    private CarAgentLocationBak140616(Name alias, Table<CarAgentLocationBak140616Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CarAgentLocationBak140616(Table<O> child, ForeignKey<O, CarAgentLocationBak140616Record> key) {
        super(child, key, CAR_AGENT_LOCATION_BAK140616);
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
    public Identity<CarAgentLocationBak140616Record, Integer> getIdentity() {
        return Keys.IDENTITY_CAR_AGENT_LOCATION_BAK140616;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak140616 as(String alias) {
        return new CarAgentLocationBak140616(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentLocationBak140616 as(Name alias) {
        return new CarAgentLocationBak140616(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CarAgentLocationBak140616 rename(String name) {
        return new CarAgentLocationBak140616(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CarAgentLocationBak140616 rename(Name name) {
        return new CarAgentLocationBak140616(name, null);
    }
}