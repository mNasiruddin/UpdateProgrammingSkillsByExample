/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.RuleRecord;

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
public class Rule extends TableImpl<RuleRecord> {

    private static final long serialVersionUID = -1739533756;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.rule</code>
     */
    public static final Rule RULE = new Rule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RuleRecord> getRecordType() {
        return RuleRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule.guid</code>.
     */
    public final TableField<RuleRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule.rule_id</code>.
     */
    public final TableField<RuleRecord, Integer> RULE_ID = createField("rule_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule.parent_rule_id</code>.
     */
    public final TableField<RuleRecord, Integer> PARENT_RULE_ID = createField("parent_rule_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule.type</code>.
     */
    public final TableField<RuleRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule.rule_values</code>.
     */
    public final TableField<RuleRecord, String> RULE_VALUES = createField("rule_values", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule.rule_charge_id</code>.
     */
    public final TableField<RuleRecord, Integer> RULE_CHARGE_ID = createField("rule_charge_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule.rule_message_id</code>.
     */
    public final TableField<RuleRecord, Integer> RULE_MESSAGE_ID = createField("rule_message_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule.user_id</code>.
     */
    public final TableField<RuleRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule.amenddate</code>.
     */
    public final TableField<RuleRecord, Timestamp> AMENDDATE = createField("amenddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.rule</code> table reference
     */
    public Rule() {
        this(DSL.name("rule"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.rule</code> table reference
     */
    public Rule(String alias) {
        this(DSL.name(alias), RULE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.rule</code> table reference
     */
    public Rule(Name alias) {
        this(alias, RULE);
    }

    private Rule(Name alias, Table<RuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rule(Name alias, Table<RuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Rule(Table<O> child, ForeignKey<O, RuleRecord> key) {
        super(child, key, RULE);
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
        return Arrays.<Index>asList(Indexes.RULE_CHARGGEID, Indexes.RULE_PK_RULE_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RuleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RuleRecord> getPrimaryKey() {
        return Keys.PK_RULE_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RuleRecord>> getKeys() {
        return Arrays.<UniqueKey<RuleRecord>>asList(Keys.PK_RULE_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rule as(String alias) {
        return new Rule(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rule as(Name alias) {
        return new Rule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rule rename(String name) {
        return new Rule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rule rename(Name name) {
        return new Rule(name, null);
    }
}
