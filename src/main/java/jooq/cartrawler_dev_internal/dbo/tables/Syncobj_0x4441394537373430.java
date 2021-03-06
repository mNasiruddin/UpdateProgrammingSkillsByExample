/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.Syncobj_0x4441394537373430Record;

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
public class Syncobj_0x4441394537373430 extends TableImpl<Syncobj_0x4441394537373430Record> {

    private static final long serialVersionUID = -664023103;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430</code>
     */
    public static final Syncobj_0x4441394537373430 SYNCOBJ_0X4441394537373430 = new Syncobj_0x4441394537373430();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Syncobj_0x4441394537373430Record> getRecordType() {
        return Syncobj_0x4441394537373430Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.idAffBank</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, Integer> IDAFFBANK = createField("idAffBank", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.Client_ID</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, Integer> CLIENT_ID = createField("Client_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.AccName</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> ACCNAME = createField("AccName", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.BankName</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> BANKNAME = createField("BankName", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.BankAddress</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> BANKADDRESS = createField("BankAddress", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.BankSortCode</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> BANKSORTCODE = createField("BankSortCode", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.BankAccNo</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> BANKACCNO = createField("BankAccNo", org.jooq.impl.SQLDataType.VARCHAR(70), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.SwiftCode</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> SWIFTCODE = createField("SwiftCode", org.jooq.impl.SQLDataType.VARCHAR(70), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.IBAN</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> IBAN = createField("IBAN", org.jooq.impl.SQLDataType.VARCHAR(70), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.BankCountryID</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> BANKCOUNTRYID = createField("BankCountryID", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.last_changed_date</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, Timestamp> LAST_CHANGED_DATE = createField("last_changed_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.AccName_inter</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> ACCNAME_INTER = createField("AccName_inter", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.BankName_inter</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> BANKNAME_INTER = createField("BankName_inter", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.BankAddress_inter</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> BANKADDRESS_INTER = createField("BankAddress_inter", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.BankSortCode_inter</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> BANKSORTCODE_INTER = createField("BankSortCode_inter", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.SwiftCode_inter</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> SWIFTCODE_INTER = createField("SwiftCode_inter", org.jooq.impl.SQLDataType.VARCHAR(70), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.IBAN_inter</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> IBAN_INTER = createField("IBAN_inter", org.jooq.impl.SQLDataType.VARCHAR(70), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.BankCountryID_inter</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> BANKCOUNTRYID_INTER = createField("BankCountryID_inter", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430.BankAccNo_inter</code>.
     */
    public final TableField<Syncobj_0x4441394537373430Record, String> BANKACCNO_INTER = createField("BankAccNo_inter", org.jooq.impl.SQLDataType.VARCHAR(70), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430</code> table reference
     */
    public Syncobj_0x4441394537373430() {
        this(DSL.name("syncobj_0x4441394537373430"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430</code> table reference
     */
    public Syncobj_0x4441394537373430(String alias) {
        this(DSL.name(alias), SYNCOBJ_0X4441394537373430);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.syncobj_0x4441394537373430</code> table reference
     */
    public Syncobj_0x4441394537373430(Name alias) {
        this(alias, SYNCOBJ_0X4441394537373430);
    }

    private Syncobj_0x4441394537373430(Name alias, Table<Syncobj_0x4441394537373430Record> aliased) {
        this(alias, aliased, null);
    }

    private Syncobj_0x4441394537373430(Name alias, Table<Syncobj_0x4441394537373430Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Syncobj_0x4441394537373430(Table<O> child, ForeignKey<O, Syncobj_0x4441394537373430Record> key) {
        super(child, key, SYNCOBJ_0X4441394537373430);
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
    public Identity<Syncobj_0x4441394537373430Record, Integer> getIdentity() {
        return Keys.IDENTITY_SYNCOBJ_0X4441394537373430;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4441394537373430 as(String alias) {
        return new Syncobj_0x4441394537373430(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4441394537373430 as(Name alias) {
        return new Syncobj_0x4441394537373430(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Syncobj_0x4441394537373430 rename(String name) {
        return new Syncobj_0x4441394537373430(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Syncobj_0x4441394537373430 rename(Name name) {
        return new Syncobj_0x4441394537373430(name, null);
    }
}
