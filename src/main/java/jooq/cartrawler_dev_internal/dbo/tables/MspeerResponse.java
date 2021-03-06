/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.MspeerResponseRecord;

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
public class MspeerResponse extends TableImpl<MspeerResponseRecord> {

    private static final long serialVersionUID = -412838795;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.MSpeer_response</code>
     */
    public static final MspeerResponse MSPEER_RESPONSE = new MspeerResponse();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MspeerResponseRecord> getRecordType() {
        return MspeerResponseRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_response.request_id</code>.
     */
    public final TableField<MspeerResponseRecord, Integer> REQUEST_ID = createField("request_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_response.peer</code>.
     */
    public final TableField<MspeerResponseRecord, String> PEER = createField("peer", org.jooq.impl.SQLDataType.NVARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_response.peer_db</code>.
     */
    public final TableField<MspeerResponseRecord, String> PEER_DB = createField("peer_db", org.jooq.impl.SQLDataType.NVARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_response.received_date</code>.
     */
    public final TableField<MspeerResponseRecord, Timestamp> RECEIVED_DATE = createField("received_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.MSpeer_response</code> table reference
     */
    public MspeerResponse() {
        this(DSL.name("MSpeer_response"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MSpeer_response</code> table reference
     */
    public MspeerResponse(String alias) {
        this(DSL.name(alias), MSPEER_RESPONSE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MSpeer_response</code> table reference
     */
    public MspeerResponse(Name alias) {
        this(alias, MSPEER_RESPONSE);
    }

    private MspeerResponse(Name alias, Table<MspeerResponseRecord> aliased) {
        this(alias, aliased, null);
    }

    private MspeerResponse(Name alias, Table<MspeerResponseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MspeerResponse(Table<O> child, ForeignKey<O, MspeerResponseRecord> key) {
        super(child, key, MSPEER_RESPONSE);
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
    public MspeerResponse as(String alias) {
        return new MspeerResponse(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerResponse as(Name alias) {
        return new MspeerResponse(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MspeerResponse rename(String name) {
        return new MspeerResponse(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MspeerResponse rename(Name name) {
        return new MspeerResponse(name, null);
    }
}
