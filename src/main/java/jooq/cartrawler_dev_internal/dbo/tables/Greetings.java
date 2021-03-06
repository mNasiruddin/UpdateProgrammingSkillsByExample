/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.GreetingsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class Greetings extends TableImpl<GreetingsRecord> {

    private static final long serialVersionUID = -1770839765;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Greetings</code>
     */
    public static final Greetings GREETINGS = new Greetings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GreetingsRecord> getRecordType() {
        return GreetingsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Greetings.Greeting_ID</code>.
     */
    public final TableField<GreetingsRecord, Integer> GREETING_ID = createField("Greeting_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Greetings.Greeting_Name</code>.
     */
    public final TableField<GreetingsRecord, String> GREETING_NAME = createField("Greeting_Name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Greetings.Intro_Text</code>.
     */
    public final TableField<GreetingsRecord, String> INTRO_TEXT = createField("Intro_Text", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Greetings.Greeting_Image</code>.
     */
    public final TableField<GreetingsRecord, byte[]> GREETING_IMAGE = createField("Greeting_Image", org.jooq.impl.SQLDataType.BINARY(2147483647), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Greetings.Status</code>.
     */
    public final TableField<GreetingsRecord, Boolean> STATUS = createField("Status", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Greetings.Image_Width</code>.
     */
    public final TableField<GreetingsRecord, String> IMAGE_WIDTH = createField("Image_Width", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Greetings.Image_Height</code>.
     */
    public final TableField<GreetingsRecord, String> IMAGE_HEIGHT = createField("Image_Height", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Greetings</code> table reference
     */
    public Greetings() {
        this(DSL.name("Greetings"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Greetings</code> table reference
     */
    public Greetings(String alias) {
        this(DSL.name(alias), GREETINGS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Greetings</code> table reference
     */
    public Greetings(Name alias) {
        this(alias, GREETINGS);
    }

    private Greetings(Name alias, Table<GreetingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Greetings(Name alias, Table<GreetingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Greetings(Table<O> child, ForeignKey<O, GreetingsRecord> key) {
        super(child, key, GREETINGS);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.GREETINGS_GREETINGS_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GreetingsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GREETINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GreetingsRecord> getPrimaryKey() {
        return Keys.GREETINGS_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GreetingsRecord>> getKeys() {
        return Arrays.<UniqueKey<GreetingsRecord>>asList(Keys.GREETINGS_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Greetings as(String alias) {
        return new Greetings(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Greetings as(Name alias) {
        return new Greetings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Greetings rename(String name) {
        return new Greetings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Greetings rename(Name name) {
        return new Greetings(name, null);
    }
}
