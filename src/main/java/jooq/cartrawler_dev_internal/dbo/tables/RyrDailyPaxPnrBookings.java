/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.RyrDailyPaxPnrBookingsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class RyrDailyPaxPnrBookings extends TableImpl<RyrDailyPaxPnrBookingsRecord> {

    private static final long serialVersionUID = -1298319230;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.RYR_Daily_PAX_PNR_Bookings</code>
     */
    public static final RyrDailyPaxPnrBookings RYR_DAILY_PAX_PNR_BOOKINGS = new RyrDailyPaxPnrBookings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RyrDailyPaxPnrBookingsRecord> getRecordType() {
        return RyrDailyPaxPnrBookingsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.RYR_Daily_PAX_PNR_Bookings.Id</code>.
     */
    public final TableField<RyrDailyPaxPnrBookingsRecord, Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.RYR_Daily_PAX_PNR_Bookings.SplitId</code>.
     */
    public final TableField<RyrDailyPaxPnrBookingsRecord, Integer> SPLITID = createField("SplitId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.RYR_Daily_PAX_PNR_Bookings.ArrivalStation</code>.
     */
    public final TableField<RyrDailyPaxPnrBookingsRecord, String> ARRIVALSTATION = createField("ArrivalStation", org.jooq.impl.SQLDataType.NVARCHAR(5), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.RYR_Daily_PAX_PNR_Bookings.BookingCount</code>.
     */
    public final TableField<RyrDailyPaxPnrBookingsRecord, Integer> BOOKINGCOUNT = createField("BookingCount", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.RYR_Daily_PAX_PNR_Bookings.PassengerCount</code>.
     */
    public final TableField<RyrDailyPaxPnrBookingsRecord, Integer> PASSENGERCOUNT = createField("PassengerCount", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.RYR_Daily_PAX_PNR_Bookings.ReservationDate</code>.
     */
    public final TableField<RyrDailyPaxPnrBookingsRecord, Timestamp> RESERVATIONDATE = createField("ReservationDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.RYR_Daily_PAX_PNR_Bookings.UpdateDate</code>.
     */
    public final TableField<RyrDailyPaxPnrBookingsRecord, Timestamp> UPDATEDATE = createField("UpdateDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.RYR_Daily_PAX_PNR_Bookings</code> table reference
     */
    public RyrDailyPaxPnrBookings() {
        this(DSL.name("RYR_Daily_PAX_PNR_Bookings"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.RYR_Daily_PAX_PNR_Bookings</code> table reference
     */
    public RyrDailyPaxPnrBookings(String alias) {
        this(DSL.name(alias), RYR_DAILY_PAX_PNR_BOOKINGS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.RYR_Daily_PAX_PNR_Bookings</code> table reference
     */
    public RyrDailyPaxPnrBookings(Name alias) {
        this(alias, RYR_DAILY_PAX_PNR_BOOKINGS);
    }

    private RyrDailyPaxPnrBookings(Name alias, Table<RyrDailyPaxPnrBookingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RyrDailyPaxPnrBookings(Name alias, Table<RyrDailyPaxPnrBookingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RyrDailyPaxPnrBookings(Table<O> child, ForeignKey<O, RyrDailyPaxPnrBookingsRecord> key) {
        super(child, key, RYR_DAILY_PAX_PNR_BOOKINGS);
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
    public Identity<RyrDailyPaxPnrBookingsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RYR_DAILY_PAX_PNR_BOOKINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RyrDailyPaxPnrBookings as(String alias) {
        return new RyrDailyPaxPnrBookings(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RyrDailyPaxPnrBookings as(Name alias) {
        return new RyrDailyPaxPnrBookings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RyrDailyPaxPnrBookings rename(String name) {
        return new RyrDailyPaxPnrBookings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RyrDailyPaxPnrBookings rename(Name name) {
        return new RyrDailyPaxPnrBookings(name, null);
    }
}
