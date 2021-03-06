/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.Groups_080217Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Groups_080217 extends TableImpl<Groups_080217Record> {

    private static final long serialVersionUID = 297383318;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.groups_080217</code>
     */
    public static final Groups_080217 GROUPS_080217 = new Groups_080217();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Groups_080217Record> getRecordType() {
        return Groups_080217Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.Group_ID</code>.
     */
    public final TableField<Groups_080217Record, String> GROUP_ID = createField("Group_ID", org.jooq.impl.SQLDataType.VARCHAR(6).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.Country_id</code>.
     */
    public final TableField<Groups_080217Record, String> COUNTRY_ID = createField("Country_id", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.Group_Name</code>.
     */
    public final TableField<Groups_080217Record, String> GROUP_NAME = createField("Group_Name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.Group_type</code>.
     */
    public final TableField<Groups_080217Record, String> GROUP_TYPE = createField("Group_type", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.Van_Group</code>.
     */
    public final TableField<Groups_080217Record, Boolean> VAN_GROUP = createField("Van_Group", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.MinAge_30</code>.
     */
    public final TableField<Groups_080217Record, Boolean> MINAGE_30 = createField("MinAge_30", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.Group_Description</code>.
     */
    public final TableField<Groups_080217Record, String> GROUP_DESCRIPTION = createField("Group_Description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.list_order</code>.
     */
    public final TableField<Groups_080217Record, Integer> LIST_ORDER = createField("list_order", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.Status</code>.
     */
    public final TableField<Groups_080217Record, Boolean> STATUS = createField("Status", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.KCode</code>.
     */
    public final TableField<Groups_080217Record, String> KCODE = createField("KCode", org.jooq.impl.SQLDataType.CHAR(4), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.Agency_Name</code>.
     */
    public final TableField<Groups_080217Record, String> AGENCY_NAME = createField("Agency_Name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.advance_time</code>.
     */
    public final TableField<Groups_080217Record, Integer> ADVANCE_TIME = createField("advance_time", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.car_agent</code>.
     */
    public final TableField<Groups_080217Record, Integer> CAR_AGENT = createField("car_agent", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.res_group</code>.
     */
    public final TableField<Groups_080217Record, Integer> RES_GROUP = createField("res_group", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.freesale</code>.
     */
    public final TableField<Groups_080217Record, Boolean> FREESALE = createField("freesale", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.OTA_VehClass</code>.
     */
    public final TableField<Groups_080217Record, Integer> OTA_VEHCLASS = createField("OTA_VehClass", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.OTA_VehCategory</code>.
     */
    public final TableField<Groups_080217Record, Integer> OTA_VEHCATEGORY = createField("OTA_VehCategory", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.car_id</code>.
     */
    public final TableField<Groups_080217Record, Integer> CAR_ID = createField("car_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.temp_res_count</code>.
     */
    public final TableField<Groups_080217Record, Integer> TEMP_RES_COUNT = createField("temp_res_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.onrequest</code>.
     */
    public final TableField<Groups_080217Record, Boolean> ONREQUEST = createField("onrequest", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.blocked</code>.
     */
    public final TableField<Groups_080217Record, Boolean> BLOCKED = createField("blocked", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.guaranteed_car</code>.
     */
    public final TableField<Groups_080217Record, Boolean> GUARANTEED_CAR = createField("guaranteed_car", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.createDate</code>.
     */
    public final TableField<Groups_080217Record, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.gFlags</code>.
     */
    public final TableField<Groups_080217Record, Short> GFLAGS = createField("gFlags", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.winter_Tyre</code>.
     */
    public final TableField<Groups_080217Record, Boolean> WINTER_TYRE = createField("winter_Tyre", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.parking_Sensor</code>.
     */
    public final TableField<Groups_080217Record, Boolean> PARKING_SENSOR = createField("parking_Sensor", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.guarenteed_German_Model</code>.
     */
    public final TableField<Groups_080217Record, Boolean> GUARENTEED_GERMAN_MODEL = createField("guarenteed_German_Model", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.luggage_Rack</code>.
     */
    public final TableField<Groups_080217Record, Boolean> LUGGAGE_RACK = createField("luggage_Rack", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.exceptional_Fuel_Economy</code>.
     */
    public final TableField<Groups_080217Record, Boolean> EXCEPTIONAL_FUEL_ECONOMY = createField("exceptional_Fuel_Economy", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.blue_Tooth_Enabled</code>.
     */
    public final TableField<Groups_080217Record, Boolean> BLUE_TOOTH_ENABLED = createField("blue_Tooth_Enabled", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.front_Screen_Demister</code>.
     */
    public final TableField<Groups_080217Record, Boolean> FRONT_SCREEN_DEMISTER = createField("front_Screen_Demister", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.parking_Assist_Technology</code>.
     */
    public final TableField<Groups_080217Record, Boolean> PARKING_ASSIST_TECHNOLOGY = createField("parking_Assist_Technology", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.usb_Connection</code>.
     */
    public final TableField<Groups_080217Record, Boolean> USB_CONNECTION = createField("usb_Connection", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.groups_080217.gpsIncluded</code>.
     */
    public final TableField<Groups_080217Record, Boolean> GPSINCLUDED = createField("gpsIncluded", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.groups_080217</code> table reference
     */
    public Groups_080217() {
        this(DSL.name("groups_080217"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.groups_080217</code> table reference
     */
    public Groups_080217(String alias) {
        this(DSL.name(alias), GROUPS_080217);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.groups_080217</code> table reference
     */
    public Groups_080217(Name alias) {
        this(alias, GROUPS_080217);
    }

    private Groups_080217(Name alias, Table<Groups_080217Record> aliased) {
        this(alias, aliased, null);
    }

    private Groups_080217(Name alias, Table<Groups_080217Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Groups_080217(Table<O> child, ForeignKey<O, Groups_080217Record> key) {
        super(child, key, GROUPS_080217);
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
    public Groups_080217 as(String alias) {
        return new Groups_080217(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Groups_080217 as(Name alias) {
        return new Groups_080217(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Groups_080217 rename(String name) {
        return new Groups_080217(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Groups_080217 rename(Name name) {
        return new Groups_080217(name, null);
    }
}
