/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Issalgorithm;

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
public class IssalgorithmRecord extends UpdatableRecordImpl<IssalgorithmRecord> implements Record7<Integer, String, Double, Double, Double, String, Timestamp> {

    private static final long serialVersionUID = -759896220;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issAlgorithm.algorithm_id</code>.
     */
    public void setAlgorithmId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issAlgorithm.algorithm_id</code>.
     */
    public Integer getAlgorithmId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issAlgorithm.algorithm_name</code>.
     */
    public void setAlgorithmName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issAlgorithm.algorithm_name</code>.
     */
    public String getAlgorithmName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issAlgorithm.p1</code>.
     */
    public void setP1(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issAlgorithm.p1</code>.
     */
    public Double getP1() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issAlgorithm.p2</code>.
     */
    public void setP2(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issAlgorithm.p2</code>.
     */
    public Double getP2() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issAlgorithm.p3</code>.
     */
    public void setP3(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issAlgorithm.p3</code>.
     */
    public Double getP3() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issAlgorithm.clazz</code>.
     */
    public void setClazz(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issAlgorithm.clazz</code>.
     */
    public String getClazz() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.issAlgorithm.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.issAlgorithm.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Double, Double, Double, String, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Double, Double, Double, String, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Issalgorithm.ISSALGORITHM.ALGORITHM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Issalgorithm.ISSALGORITHM.ALGORITHM_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return Issalgorithm.ISSALGORITHM.P1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return Issalgorithm.ISSALGORITHM.P2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return Issalgorithm.ISSALGORITHM.P3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Issalgorithm.ISSALGORITHM.CLAZZ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Issalgorithm.ISSALGORITHM.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getAlgorithmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAlgorithmName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component3() {
        return getP1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getP2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component5() {
        return getP3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getClazz();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAlgorithmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAlgorithmName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getP1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getP2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getP3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getClazz();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssalgorithmRecord value1(Integer value) {
        setAlgorithmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssalgorithmRecord value2(String value) {
        setAlgorithmName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssalgorithmRecord value3(Double value) {
        setP1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssalgorithmRecord value4(Double value) {
        setP2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssalgorithmRecord value5(Double value) {
        setP3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssalgorithmRecord value6(String value) {
        setClazz(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssalgorithmRecord value7(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssalgorithmRecord values(Integer value1, String value2, Double value3, Double value4, Double value5, String value6, Timestamp value7) {
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
     * Create a detached IssalgorithmRecord
     */
    public IssalgorithmRecord() {
        super(Issalgorithm.ISSALGORITHM);
    }

    /**
     * Create a detached, initialised IssalgorithmRecord
     */
    public IssalgorithmRecord(Integer algorithmId, String algorithmName, Double p1, Double p2, Double p3, String clazz, Timestamp created) {
        super(Issalgorithm.ISSALGORITHM);

        set(0, algorithmId);
        set(1, algorithmName);
        set(2, p1);
        set(3, p2);
        set(4, p3);
        set(5, clazz);
        set(6, created);
    }
}
