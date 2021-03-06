/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.CarAgentNotes;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class CarAgentNotesRecord extends UpdatableRecordImpl<CarAgentNotesRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1594214717;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Notes.Car_Agent_Id</code>.
     */
    public void setCarAgentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Notes.Car_Agent_Id</code>.
     */
    public Integer getCarAgentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Notes.Notes</code>.
     */
    public void setNotes(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Car_Agent_Notes.Notes</code>.
     */
    public String getNotes() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CarAgentNotes.CAR_AGENT_NOTES.CAR_AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CarAgentNotes.CAR_AGENT_NOTES.NOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentNotesRecord value1(Integer value) {
        setCarAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentNotesRecord value2(String value) {
        setNotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarAgentNotesRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CarAgentNotesRecord
     */
    public CarAgentNotesRecord() {
        super(CarAgentNotes.CAR_AGENT_NOTES);
    }

    /**
     * Create a detached, initialised CarAgentNotesRecord
     */
    public CarAgentNotesRecord(Integer carAgentId, String notes) {
        super(CarAgentNotes.CAR_AGENT_NOTES);

        set(0, carAgentId);
        set(1, notes);
    }
}
