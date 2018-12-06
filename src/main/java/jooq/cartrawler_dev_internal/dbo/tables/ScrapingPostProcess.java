/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.ScrapingPostProcessRecord;

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
public class ScrapingPostProcess extends TableImpl<ScrapingPostProcessRecord> {

    private static final long serialVersionUID = 2146150122;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.scraping_post_process</code>
     */
    public static final ScrapingPostProcess SCRAPING_POST_PROCESS = new ScrapingPostProcess();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScrapingPostProcessRecord> getRecordType() {
        return ScrapingPostProcessRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_post_process.jobId</code>.
     */
    public final TableField<ScrapingPostProcessRecord, Long> JOBID = createField("jobId", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_post_process.scrapeid</code>.
     */
    public final TableField<ScrapingPostProcessRecord, Long> SCRAPEID = createField("scrapeid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_post_process.complete</code>.
     */
    public final TableField<ScrapingPostProcessRecord, Boolean> COMPLETE = createField("complete", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.scraping_post_process.waiting_since</code>.
     */
    public final TableField<ScrapingPostProcessRecord, Timestamp> WAITING_SINCE = createField("waiting_since", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.scraping_post_process</code> table reference
     */
    public ScrapingPostProcess() {
        this(DSL.name("scraping_post_process"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.scraping_post_process</code> table reference
     */
    public ScrapingPostProcess(String alias) {
        this(DSL.name(alias), SCRAPING_POST_PROCESS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.scraping_post_process</code> table reference
     */
    public ScrapingPostProcess(Name alias) {
        this(alias, SCRAPING_POST_PROCESS);
    }

    private ScrapingPostProcess(Name alias, Table<ScrapingPostProcessRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScrapingPostProcess(Name alias, Table<ScrapingPostProcessRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ScrapingPostProcess(Table<O> child, ForeignKey<O, ScrapingPostProcessRecord> key) {
        super(child, key, SCRAPING_POST_PROCESS);
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
    public ScrapingPostProcess as(String alias) {
        return new ScrapingPostProcess(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScrapingPostProcess as(Name alias) {
        return new ScrapingPostProcess(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScrapingPostProcess rename(String name) {
        return new ScrapingPostProcess(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ScrapingPostProcess rename(Name name) {
        return new ScrapingPostProcess(name, null);
    }
}