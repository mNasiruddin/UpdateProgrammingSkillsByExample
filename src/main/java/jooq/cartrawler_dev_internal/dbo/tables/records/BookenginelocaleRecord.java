/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Bookenginelocale;

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
public class BookenginelocaleRecord extends UpdatableRecordImpl<BookenginelocaleRecord> implements Record7<Integer, String, String, String, String, String, Boolean> {

    private static final long serialVersionUID = -933382458;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BookEngineLocale.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BookEngineLocale.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BookEngineLocale.locale</code>.
     */
    public void setLocale(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BookEngineLocale.locale</code>.
     */
    public String getLocale() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BookEngineLocale.positiveFormat</code>.
     */
    public void setPositiveformat(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BookEngineLocale.positiveFormat</code>.
     */
    public String getPositiveformat() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BookEngineLocale.negativeFormat</code>.
     */
    public void setNegativeformat(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BookEngineLocale.negativeFormat</code>.
     */
    public String getNegativeformat() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BookEngineLocale.decimalSymbol</code>.
     */
    public void setDecimalsymbol(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BookEngineLocale.decimalSymbol</code>.
     */
    public String getDecimalsymbol() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BookEngineLocale.digitGroupSymbol</code>.
     */
    public void setDigitgroupsymbol(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BookEngineLocale.digitGroupSymbol</code>.
     */
    public String getDigitgroupsymbol() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BookEngineLocale.groupDigits</code>.
     */
    public void setGroupdigits(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BookEngineLocale.groupDigits</code>.
     */
    public Boolean getGroupdigits() {
        return (Boolean) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String, String, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String, String, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Bookenginelocale.BOOKENGINELOCALE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Bookenginelocale.BOOKENGINELOCALE.LOCALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Bookenginelocale.BOOKENGINELOCALE.POSITIVEFORMAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Bookenginelocale.BOOKENGINELOCALE.NEGATIVEFORMAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Bookenginelocale.BOOKENGINELOCALE.DECIMALSYMBOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Bookenginelocale.BOOKENGINELOCALE.DIGITGROUPSYMBOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Bookenginelocale.BOOKENGINELOCALE.GROUPDIGITS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getLocale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPositiveformat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getNegativeformat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDecimalsymbol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDigitgroupsymbol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getGroupdigits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLocale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPositiveformat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNegativeformat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDecimalsymbol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDigitgroupsymbol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getGroupdigits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookenginelocaleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookenginelocaleRecord value2(String value) {
        setLocale(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookenginelocaleRecord value3(String value) {
        setPositiveformat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookenginelocaleRecord value4(String value) {
        setNegativeformat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookenginelocaleRecord value5(String value) {
        setDecimalsymbol(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookenginelocaleRecord value6(String value) {
        setDigitgroupsymbol(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookenginelocaleRecord value7(Boolean value) {
        setGroupdigits(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookenginelocaleRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Boolean value7) {
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
     * Create a detached BookenginelocaleRecord
     */
    public BookenginelocaleRecord() {
        super(Bookenginelocale.BOOKENGINELOCALE);
    }

    /**
     * Create a detached, initialised BookenginelocaleRecord
     */
    public BookenginelocaleRecord(Integer id, String locale, String positiveformat, String negativeformat, String decimalsymbol, String digitgroupsymbol, Boolean groupdigits) {
        super(Bookenginelocale.BOOKENGINELOCALE);

        set(0, id);
        set(1, locale);
        set(2, positiveformat);
        set(3, negativeformat);
        set(4, decimalsymbol);
        set(5, digitgroupsymbol);
        set(6, groupdigits);
    }
}
