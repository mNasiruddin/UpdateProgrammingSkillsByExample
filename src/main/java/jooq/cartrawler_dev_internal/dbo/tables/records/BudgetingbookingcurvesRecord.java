/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Budgetingbookingcurves;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class BudgetingbookingcurvesRecord extends UpdatableRecordImpl<BudgetingbookingcurvesRecord> implements Record9<UUID, Timestamp, Timestamp, Integer, Double, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -2105547949;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.pickupFrom</code>.
     */
    public void setPickupfrom(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.pickupFrom</code>.
     */
    public Timestamp getPickupfrom() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.pickupTo</code>.
     */
    public void setPickupto(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.pickupTo</code>.
     */
    public Timestamp getPickupto() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.advanceWeeks</code>.
     */
    public void setAdvanceweeks(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.advanceWeeks</code>.
     */
    public Integer getAdvanceweeks() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.weight</code>.
     */
    public void setWeight(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.weight</code>.
     */
    public Double getWeight() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.id</code>.
     */
    public void setId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.id</code>.
     */
    public Integer getId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.fk_user</code>.
     */
    public void setFkUser(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.fk_user</code>.
     */
    public Integer getFkUser() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.fk_virtualLocation</code>.
     */
    public void setFkVirtuallocation(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.fk_virtualLocation</code>.
     */
    public Integer getFkVirtuallocation() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.fk_channel</code>.
     */
    public void setFkChannel(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.budgetingBookingCurves.fk_channel</code>.
     */
    public Integer getFkChannel() {
        return (Integer) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<UUID, Timestamp, Timestamp, Integer, Double, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<UUID, Timestamp, Timestamp, Integer, Double, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Budgetingbookingcurves.BUDGETINGBOOKINGCURVES.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Budgetingbookingcurves.BUDGETINGBOOKINGCURVES.PICKUPFROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Budgetingbookingcurves.BUDGETINGBOOKINGCURVES.PICKUPTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Budgetingbookingcurves.BUDGETINGBOOKINGCURVES.ADVANCEWEEKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return Budgetingbookingcurves.BUDGETINGBOOKINGCURVES.WEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Budgetingbookingcurves.BUDGETINGBOOKINGCURVES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Budgetingbookingcurves.BUDGETINGBOOKINGCURVES.FK_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Budgetingbookingcurves.BUDGETINGBOOKINGCURVES.FK_VIRTUALLOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Budgetingbookingcurves.BUDGETINGBOOKINGCURVES.FK_CHANNEL;
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
    public Timestamp component2() {
        return getPickupfrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getPickupto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getAdvanceweeks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component5() {
        return getWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getFkUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getFkVirtuallocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getFkChannel();
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
    public Timestamp value2() {
        return getPickupfrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getPickupto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAdvanceweeks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getWeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getFkUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getFkVirtuallocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getFkChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetingbookingcurvesRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetingbookingcurvesRecord value2(Timestamp value) {
        setPickupfrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetingbookingcurvesRecord value3(Timestamp value) {
        setPickupto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetingbookingcurvesRecord value4(Integer value) {
        setAdvanceweeks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetingbookingcurvesRecord value5(Double value) {
        setWeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetingbookingcurvesRecord value6(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetingbookingcurvesRecord value7(Integer value) {
        setFkUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetingbookingcurvesRecord value8(Integer value) {
        setFkVirtuallocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetingbookingcurvesRecord value9(Integer value) {
        setFkChannel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BudgetingbookingcurvesRecord values(UUID value1, Timestamp value2, Timestamp value3, Integer value4, Double value5, Integer value6, Integer value7, Integer value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BudgetingbookingcurvesRecord
     */
    public BudgetingbookingcurvesRecord() {
        super(Budgetingbookingcurves.BUDGETINGBOOKINGCURVES);
    }

    /**
     * Create a detached, initialised BudgetingbookingcurvesRecord
     */
    public BudgetingbookingcurvesRecord(UUID guid, Timestamp pickupfrom, Timestamp pickupto, Integer advanceweeks, Double weight, Integer id, Integer fkUser, Integer fkVirtuallocation, Integer fkChannel) {
        super(Budgetingbookingcurves.BUDGETINGBOOKINGCURVES);

        set(0, guid);
        set(1, pickupfrom);
        set(2, pickupto);
        set(3, advanceweeks);
        set(4, weight);
        set(5, id);
        set(6, fkUser);
        set(7, fkVirtuallocation);
        set(8, fkChannel);
    }
}