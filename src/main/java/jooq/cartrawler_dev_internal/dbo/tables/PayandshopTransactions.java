/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.PayandshopTransactionsRecord;

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
import org.jooq.types.UByte;


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
public class PayandshopTransactions extends TableImpl<PayandshopTransactionsRecord> {

    private static final long serialVersionUID = -953993369;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions</code>
     */
    public static final PayandshopTransactions PAYANDSHOP_TRANSACTIONS = new PayandshopTransactions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PayandshopTransactionsRecord> getRecordType() {
        return PayandshopTransactionsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.ref</code>.
     */
    public final TableField<PayandshopTransactionsRecord, Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.payandshop_id</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> PAYANDSHOP_ID = createField("payandshop_id", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.payandshop_amount</code>.
     */
    public final TableField<PayandshopTransactionsRecord, BigDecimal> PAYANDSHOP_AMOUNT = createField("payandshop_amount", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.request_type</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> REQUEST_TYPE = createField("request_type", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.payandshop_pasref</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> PAYANDSHOP_PASREF = createField("payandshop_pasref", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.payandshop_auth_code</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> PAYANDSHOP_AUTH_CODE = createField("payandshop_auth_code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.trans_datetime</code>.
     */
    public final TableField<PayandshopTransactionsRecord, Timestamp> TRANS_DATETIME = createField("trans_datetime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.autosettle</code>.
     */
    public final TableField<PayandshopTransactionsRecord, Boolean> AUTOSETTLE = createField("autosettle", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.user_id</code>.
     */
    public final TableField<PayandshopTransactionsRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.currency</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.exchangeRate</code>.
     */
    public final TableField<PayandshopTransactionsRecord, BigDecimal> EXCHANGERATE = createField("exchangeRate", org.jooq.impl.SQLDataType.NUMERIC(10, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.issue_country</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> ISSUE_COUNTRY = createField("issue_country", org.jooq.impl.SQLDataType.CHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.narrative</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> NARRATIVE = createField("narrative", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.payandshop_account</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> PAYANDSHOP_ACCOUNT = createField("payandshop_account", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.transaction_id</code>.
     */
    public final TableField<PayandshopTransactionsRecord, Integer> TRANSACTION_ID = createField("transaction_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.fk_reservation</code>.
     */
    public final TableField<PayandshopTransactionsRecord, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.reservation_id</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> RESERVATION_ID = createField("reservation_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.fk_refundreason</code>.
     */
    public final TableField<PayandshopTransactionsRecord, Integer> FK_REFUNDREASON = createField("fk_refundreason", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.payment_method_id</code>.
     */
    public final TableField<PayandshopTransactionsRecord, UByte> PAYMENT_METHOD_ID = createField("payment_method_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.payment_method_type</code>.
     */
    public final TableField<PayandshopTransactionsRecord, UByte> PAYMENT_METHOD_TYPE = createField("payment_method_type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.dcc_ccp</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> DCC_CCP = createField("dcc_ccp", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.dcc_type</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> DCC_TYPE = createField("dcc_type", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.dcc_rate</code>.
     */
    public final TableField<PayandshopTransactionsRecord, BigDecimal> DCC_RATE = createField("dcc_rate", org.jooq.impl.SQLDataType.NUMERIC(10, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.dcc_ratetype</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> DCC_RATETYPE = createField("dcc_ratetype", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.dcc_amount_currency</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> DCC_AMOUNT_CURRENCY = createField("dcc_amount_currency", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.dcc_amount</code>.
     */
    public final TableField<PayandshopTransactionsRecord, BigDecimal> DCC_AMOUNT = createField("dcc_amount", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.dcc_source</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> DCC_SOURCE = createField("dcc_source", org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.dcc_rateNotMarkedUp</code>.
     */
    public final TableField<PayandshopTransactionsRecord, BigDecimal> DCC_RATENOTMARKEDUP = createField("dcc_rateNotMarkedUp", org.jooq.impl.SQLDataType.NUMERIC(10, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.issuer_id</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> ISSUER_ID = createField("issuer_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.revenue_source</code>.
     */
    public final TableField<PayandshopTransactionsRecord, Short> REVENUE_SOURCE = createField("revenue_source", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.at_fault</code>.
     */
    public final TableField<PayandshopTransactionsRecord, Integer> AT_FAULT = createField("at_fault", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.crm_case_ref</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> CRM_CASE_REF = createField("crm_case_ref", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.fk_payandshop_card</code>.
     */
    public final TableField<PayandshopTransactionsRecord, Integer> FK_PAYANDSHOP_CARD = createField("fk_payandshop_card", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.tx_ref_num</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> TX_REF_NUM = createField("tx_ref_num", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.payment_provider</code>.
     */
    public final TableField<PayandshopTransactionsRecord, Short> PAYMENT_PROVIDER = createField("payment_provider", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.external_reference_id</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> EXTERNAL_REFERENCE_ID = createField("external_reference_id", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions.request_status</code>.
     */
    public final TableField<PayandshopTransactionsRecord, String> REQUEST_STATUS = createField("request_status", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions</code> table reference
     */
    public PayandshopTransactions() {
        this(DSL.name("PayandShop_Transactions"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions</code> table reference
     */
    public PayandshopTransactions(String alias) {
        this(DSL.name(alias), PAYANDSHOP_TRANSACTIONS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.PayandShop_Transactions</code> table reference
     */
    public PayandshopTransactions(Name alias) {
        this(alias, PAYANDSHOP_TRANSACTIONS);
    }

    private PayandshopTransactions(Name alias, Table<PayandshopTransactionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PayandshopTransactions(Name alias, Table<PayandshopTransactionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PayandshopTransactions(Table<O> child, ForeignKey<O, PayandshopTransactionsRecord> key) {
        super(child, key, PAYANDSHOP_TRANSACTIONS);
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
        return Arrays.<Index>asList(Indexes.PAYANDSHOP_TRANSACTIONS_DASHBOARD, Indexes.PAYANDSHOP_TRANSACTIONS_DATRTIME_CLUSTERED, Indexes.PAYANDSHOP_TRANSACTIONS_FKR, Indexes.PAYANDSHOP_TRANSACTIONS_PK_PAYANDSHOP_TRANSACTIONS, Indexes.PAYANDSHOP_TRANSACTIONS_PK_PAYANDSHOP_TRANSACTIONS_1, Indexes.PAYANDSHOP_TRANSACTIONS_TXID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PayandshopTransactionsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PAYANDSHOP_TRANSACTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PayandshopTransactionsRecord> getPrimaryKey() {
        return Keys.PK_PAYANDSHOP_TRANSACTIONS_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PayandshopTransactionsRecord>> getKeys() {
        return Arrays.<UniqueKey<PayandshopTransactionsRecord>>asList(Keys.PK_PAYANDSHOP_TRANSACTIONS_1, Keys.PK_PAYANDSHOP_TRANSACTIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayandshopTransactions as(String alias) {
        return new PayandshopTransactions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayandshopTransactions as(Name alias) {
        return new PayandshopTransactions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PayandshopTransactions rename(String name) {
        return new PayandshopTransactions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PayandshopTransactions rename(Name name) {
        return new PayandshopTransactions(name, null);
    }
}