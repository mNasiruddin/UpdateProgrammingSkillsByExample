/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Budgettargetsbiasing;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class BudgettargetsbiasingRecord extends UpdatableRecordImpl<BudgettargetsbiasingRecord> implements Record5<UUID, Integer, Integer, Integer, String> {

    private static final long serialVersionUID = 1247831666;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BudgetTargetsBiasing.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BudgetTargetsBiasing.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BudgetTargetsBiasing.id</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BudgetTargetsBiasing.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BudgetTargetsBiasing.fk_BudgetTargets</code>.
     */
    public void setFkBudgettargets(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BudgetTargetsBiasing.fk_BudgetTargets</code>.
     */
    public Integer getFkBudgettargets() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BudgetTargetsBiasing.fk_PlanBiasing</code>.
     */
    public void setFkPlanbiasing(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BudgetTargetsBiasing.fk_PlanBiasing</code>.
     */
    public Integer getFkPlanbiasing() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.BudgetTargetsBiasing.supplier</code>.
     */
    public void setSupplier(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.BudgetTargetsBiasing.supplier</code>.
     */
    public String getSupplier() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, Integer, Integer, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, Integer, Integer, Integer, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Budgettargetsbiasing.BUDGETTARGETSBIASING.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Budgettargetsbiasing.BUDGETTARGETSBIASING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Budgettargetsbiasing.BUDGETTARGETSBIASING.FK_BUDGETTARGETS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Budgettargetsbiasing.BUDGETTARGETSBIASING.FK_PLANBIASING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Budgettargetsbiasing.BUDGETTARGETSBIASING.SUPPLIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFkBudgettargets();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getFkPlanbiasing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSupplier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFkBudgettargets();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getFkPlanbiasing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSupplier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgettargetsbiasingRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgettargetsbiasingRecord value2(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgettargetsbiasingRecord value3(Integer value) {
        setFkBudgettargets(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgettargetsbiasingRecord value4(Integer value) {
        setFkPlanbiasing(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgettargetsbiasingRecord value5(String value) {
        setSupplier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgettargetsbiasingRecord values(UUID value1, Integer value2, Integer value3, Integer value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BudgettargetsbiasingRecord
     */
    public BudgettargetsbiasingRecord() {
        super(Budgettargetsbiasing.BUDGETTARGETSBIASING);
    }

    /**
     * Create a detached, initialised BudgettargetsbiasingRecord
     */
    public BudgettargetsbiasingRecord(UUID guid, Integer id, Integer fkBudgettargets, Integer fkPlanbiasing, String supplier) {
        super(Budgettargetsbiasing.BUDGETTARGETSBIASING);

        set(0, guid);
        set(1, id);
        set(2, fkBudgettargets);
        set(3, fkPlanbiasing);
        set(4, supplier);
    }
}
