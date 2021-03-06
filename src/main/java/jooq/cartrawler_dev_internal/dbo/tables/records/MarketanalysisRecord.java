/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Marketanalysis;

import org.jooq.Record1;
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
public class MarketanalysisRecord extends UpdatableRecordImpl<MarketanalysisRecord> {

    private static final long serialVersionUID = 1794029690;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.id</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleAtHour</code>.
     */
    public void setScheduleathour(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleAtHour</code>.
     */
    public Integer getScheduleathour() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleEndHour</code>.
     */
    public void setScheduleendhour(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleEndHour</code>.
     */
    public Integer getScheduleendhour() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleWeekdaysOnly</code>.
     */
    public void setScheduleweekdaysonly(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleWeekdaysOnly</code>.
     */
    public Boolean getScheduleweekdaysonly() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleDayOfWeek</code>.
     */
    public void setScheduledayofweek(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleDayOfWeek</code>.
     */
    public Integer getScheduledayofweek() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleWhenMonthly</code>.
     */
    public void setSchedulewhenmonthly(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleWhenMonthly</code>.
     */
    public Integer getSchedulewhenmonthly() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleInterval</code>.
     */
    public void setScheduleinterval(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleInterval</code>.
     */
    public String getScheduleinterval() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.oneDay</code>.
     */
    public void setOneday(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.oneDay</code>.
     */
    public Boolean getOneday() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.threeDay</code>.
     */
    public void setThreeday(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.threeDay</code>.
     */
    public Boolean getThreeday() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.sevenDay</code>.
     */
    public void setSevenday(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.sevenDay</code>.
     */
    public Boolean getSevenday() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.tenDay</code>.
     */
    public void setTenday(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.tenDay</code>.
     */
    public Boolean getTenday() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.weekendDays</code>.
     */
    public void setWeekenddays(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.weekendDays</code>.
     */
    public Boolean getWeekenddays() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.ratesFor</code>.
     */
    public void setRatesfor(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.ratesFor</code>.
     */
    public String getRatesfor() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scanners</code>.
     */
    public void setScanners(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scanners</code>.
     */
    public String getScanners() {
        return (String) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.fk_user</code>.
     */
    public void setFkUser(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.fk_user</code>.
     */
    public Integer getFkUser() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.sipps</code>.
     */
    public void setSipps(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.sipps</code>.
     */
    public String getSipps() {
        return (String) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.lastRunTime</code>.
     */
    public void setLastruntime(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.lastRunTime</code>.
     */
    public Timestamp getLastruntime() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.nextRunTimeInformationalOnly</code>.
     */
    public void setNextruntimeinformationalonly(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.nextRunTimeInformationalOnly</code>.
     */
    public Timestamp getNextruntimeinformationalonly() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.ratesForDate</code>.
     */
    public void setRatesfordate(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.ratesForDate</code>.
     */
    public Timestamp getRatesfordate() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.repeatWeeks</code>.
     */
    public void setRepeatweeks(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.repeatWeeks</code>.
     */
    public Integer getRepeatweeks() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.foldSIPPS</code>.
     */
    public void setFoldsipps(Boolean value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.foldSIPPS</code>.
     */
    public Boolean getFoldsipps() {
        return (Boolean) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.twoDay</code>.
     */
    public void setTwoday(Boolean value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.twoDay</code>.
     */
    public Boolean getTwoday() {
        return (Boolean) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.fourDay</code>.
     */
    public void setFourday(Boolean value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.fourDay</code>.
     */
    public Boolean getFourday() {
        return (Boolean) get(24);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.fiveDay</code>.
     */
    public void setFiveday(Boolean value) {
        set(25, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.fiveDay</code>.
     */
    public Boolean getFiveday() {
        return (Boolean) get(25);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.sixDay</code>.
     */
    public void setSixday(Boolean value) {
        set(26, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.sixDay</code>.
     */
    public Boolean getSixday() {
        return (Boolean) get(26);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.displayCurrency</code>.
     */
    public void setDisplaycurrency(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.displayCurrency</code>.
     */
    public String getDisplaycurrency() {
        return (String) get(27);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleImmediately</code>.
     */
    public void setScheduleimmediately(Boolean value) {
        set(28, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleImmediately</code>.
     */
    public Boolean getScheduleimmediately() {
        return (Boolean) get(28);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.eightDay</code>.
     */
    public void setEightday(Boolean value) {
        set(29, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.eightDay</code>.
     */
    public Boolean getEightday() {
        return (Boolean) get(29);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.nineDay</code>.
     */
    public void setNineday(Boolean value) {
        set(30, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.nineDay</code>.
     */
    public Boolean getNineday() {
        return (Boolean) get(30);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.elevenDay</code>.
     */
    public void setElevenday(Boolean value) {
        set(31, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.elevenDay</code>.
     */
    public Boolean getElevenday() {
        return (Boolean) get(31);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.twelveDay</code>.
     */
    public void setTwelveday(Boolean value) {
        set(32, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.twelveDay</code>.
     */
    public Boolean getTwelveday() {
        return (Boolean) get(32);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.thirteenDay</code>.
     */
    public void setThirteenday(Boolean value) {
        set(33, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.thirteenDay</code>.
     */
    public Boolean getThirteenday() {
        return (Boolean) get(33);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.fourteenDay</code>.
     */
    public void setFourteenday(Boolean value) {
        set(34, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.fourteenDay</code>.
     */
    public Boolean getFourteenday() {
        return (Boolean) get(34);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.fifteenDay</code>.
     */
    public void setFifteenday(Boolean value) {
        set(35, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.fifteenDay</code>.
     */
    public Boolean getFifteenday() {
        return (Boolean) get(35);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.sixteenDay</code>.
     */
    public void setSixteenday(Boolean value) {
        set(36, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.sixteenDay</code>.
     */
    public Boolean getSixteenday() {
        return (Boolean) get(36);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.seventeenDay</code>.
     */
    public void setSeventeenday(Boolean value) {
        set(37, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.seventeenDay</code>.
     */
    public Boolean getSeventeenday() {
        return (Boolean) get(37);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.eighteenDay</code>.
     */
    public void setEighteenday(Boolean value) {
        set(38, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.eighteenDay</code>.
     */
    public Boolean getEighteenday() {
        return (Boolean) get(38);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.nineteenDay</code>.
     */
    public void setNineteenday(Boolean value) {
        set(39, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.nineteenDay</code>.
     */
    public Boolean getNineteenday() {
        return (Boolean) get(39);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.twentyDay</code>.
     */
    public void setTwentyday(Boolean value) {
        set(40, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.twentyDay</code>.
     */
    public Boolean getTwentyday() {
        return (Boolean) get(40);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.twentyOneDay</code>.
     */
    public void setTwentyoneday(Boolean value) {
        set(41, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.twentyOneDay</code>.
     */
    public Boolean getTwentyoneday() {
        return (Boolean) get(41);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.forExternalViewing</code>.
     */
    public void setForexternalviewing(Boolean value) {
        set(42, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.forExternalViewing</code>.
     */
    public Boolean getForexternalviewing() {
        return (Boolean) get(42);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.rateShopFormat</code>.
     */
    public void setRateshopformat(Boolean value) {
        set(43, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.rateShopFormat</code>.
     */
    public Boolean getRateshopformat() {
        return (Boolean) get(43);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.safetynet</code>.
     */
    public void setSafetynet(BigDecimal value) {
        set(44, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.safetynet</code>.
     */
    public BigDecimal getSafetynet() {
        return (BigDecimal) get(44);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.postScrapeEmail</code>.
     */
    public void setPostscrapeemail(String value) {
        set(45, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.postScrapeEmail</code>.
     */
    public String getPostscrapeemail() {
        return (String) get(45);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.postPriceEmail</code>.
     */
    public void setPostpriceemail(String value) {
        set(46, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.postPriceEmail</code>.
     */
    public String getPostpriceemail() {
        return (String) get(46);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.tetheredLocations</code>.
     */
    public void setTetheredlocations(String value) {
        set(47, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.tetheredLocations</code>.
     */
    public String getTetheredlocations() {
        return (String) get(47);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleDayOfWeek2</code>.
     */
    public void setScheduledayofweek2(Integer value) {
        set(48, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.scheduleDayOfWeek2</code>.
     */
    public Integer getScheduledayofweek2() {
        return (Integer) get(48);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.weekFrequency</code>.
     */
    public void setWeekfrequency(Integer value) {
        set(49, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.weekFrequency</code>.
     */
    public Integer getWeekfrequency() {
        return (Integer) get(49);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.hourFrequency</code>.
     */
    public void setHourfrequency(Integer value) {
        set(50, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.hourFrequency</code>.
     */
    public Integer getHourfrequency() {
        return (Integer) get(50);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.dayFrequency</code>.
     */
    public void setDayfrequency(Integer value) {
        set(51, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.dayFrequency</code>.
     */
    public Integer getDayfrequency() {
        return (Integer) get(51);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.conformanceEmail</code>.
     */
    public void setConformanceemail(String value) {
        set(52, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.conformanceEmail</code>.
     */
    public String getConformanceemail() {
        return (String) get(52);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.repeatMode</code>.
     */
    public void setRepeatmode(String value) {
        set(53, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.repeatMode</code>.
     */
    public String getRepeatmode() {
        return (String) get(53);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.repeatCount</code>.
     */
    public void setRepeatcount(Integer value) {
        set(54, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.repeatCount</code>.
     */
    public Integer getRepeatcount() {
        return (Integer) get(54);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.DTRateShopFormat</code>.
     */
    public void setDtrateshopformat(Boolean value) {
        set(55, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.DTRateShopFormat</code>.
     */
    public Boolean getDtrateshopformat() {
        return (Boolean) get(55);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.pickupHour</code>.
     */
    public void setPickuphour(Short value) {
        set(56, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.pickupHour</code>.
     */
    public Short getPickuphour() {
        return (Short) get(56);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.dropoffHour</code>.
     */
    public void setDropoffhour(Short value) {
        set(57, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.dropoffHour</code>.
     */
    public Short getDropoffhour() {
        return (Short) get(57);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.ignoreTransmission</code>.
     */
    public void setIgnoretransmission(Boolean value) {
        set(58, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.ignoreTransmission</code>.
     */
    public Boolean getIgnoretransmission() {
        return (Boolean) get(58);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.baseRateEstimatePc</code>.
     */
    public void setBaserateestimatepc(Short value) {
        set(59, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.baseRateEstimatePc</code>.
     */
    public Short getBaserateestimatepc() {
        return (Short) get(59);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.rateShopFormatType</code>.
     */
    public void setRateshopformattype(String value) {
        set(60, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.rateShopFormatType</code>.
     */
    public String getRateshopformattype() {
        return (String) get(60);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.includeMarketSnapshotReport</code>.
     */
    public void setIncludemarketsnapshotreport(Boolean value) {
        set(61, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.includeMarketSnapshotReport</code>.
     */
    public Boolean getIncludemarketsnapshotreport() {
        return (Boolean) get(61);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.specificDaysMulti</code>.
     */
    public void setSpecificdaysmulti(String value) {
        set(62, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.specificDaysMulti</code>.
     */
    public String getSpecificdaysmulti() {
        return (String) get(62);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.pickupDaysAfterRunDate</code>.
     */
    public void setPickupdaysafterrundate(String value) {
        set(63, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.pickupDaysAfterRunDate</code>.
     */
    public String getPickupdaysafterrundate() {
        return (String) get(63);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.runForCustomPropagation</code>.
     */
    public void setRunforcustompropagation(String value) {
        set(64, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.runForCustomPropagation</code>.
     */
    public String getRunforcustompropagation() {
        return (String) get(64);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.includeBaseRateInSnapShot</code>.
     */
    public void setIncludebaserateinsnapshot(Boolean value) {
        set(65, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.includeBaseRateInSnapShot</code>.
     */
    public Boolean getIncludebaserateinsnapshot() {
        return (Boolean) get(65);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.RankReport</code>.
     */
    public void setRankreport(Boolean value) {
        set(66, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.RankReport</code>.
     */
    public Boolean getRankreport() {
        return (Boolean) get(66);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.tripKind</code>.
     */
    public void setTripkind(String value) {
        set(67, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.tripKind</code>.
     */
    public String getTripkind() {
        return (String) get(67);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.allowCTComparison</code>.
     */
    public void setAllowctcomparison(Boolean value) {
        set(68, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.allowCTComparison</code>.
     */
    public Boolean getAllowctcomparison() {
        return (Boolean) get(68);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.cheapestCar</code>.
     */
    public void setCheapestcar(Boolean value) {
        set(69, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.cheapestCar</code>.
     */
    public Boolean getCheapestcar() {
        return (Boolean) get(69);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.isCheapestCarReport</code>.
     */
    public void setIscheapestcarreport(Boolean value) {
        set(70, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.isCheapestCarReport</code>.
     */
    public Boolean getIscheapestcarreport() {
        return (Boolean) get(70);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.internalSupplierComparison</code>.
     */
    public void setInternalsuppliercomparison(Boolean value) {
        set(71, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.internalSupplierComparison</code>.
     */
    public Boolean getInternalsuppliercomparison() {
        return (Boolean) get(71);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.includeAbv</code>.
     */
    public void setIncludeabv(Boolean value) {
        set(72, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.includeAbv</code>.
     */
    public Boolean getIncludeabv() {
        return (Boolean) get(72);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.selected_suppliers</code>.
     */
    public void setSelectedSuppliers(String value) {
        set(73, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketAnalysis.selected_suppliers</code>.
     */
    public String getSelectedSuppliers() {
        return (String) get(73);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MarketanalysisRecord
     */
    public MarketanalysisRecord() {
        super(Marketanalysis.MARKETANALYSIS);
    }

    /**
     * Create a detached, initialised MarketanalysisRecord
     */
    public MarketanalysisRecord(UUID guid, Integer id, String name, Integer scheduleathour, Integer scheduleendhour, Boolean scheduleweekdaysonly, Integer scheduledayofweek, Integer schedulewhenmonthly, String scheduleinterval, Boolean oneday, Boolean threeday, Boolean sevenday, Boolean tenday, Boolean weekenddays, String ratesfor, String scanners, Integer fkUser, String sipps, Timestamp lastruntime, Timestamp nextruntimeinformationalonly, Timestamp ratesfordate, Integer repeatweeks, Boolean foldsipps, Boolean twoday, Boolean fourday, Boolean fiveday, Boolean sixday, String displaycurrency, Boolean scheduleimmediately, Boolean eightday, Boolean nineday, Boolean elevenday, Boolean twelveday, Boolean thirteenday, Boolean fourteenday, Boolean fifteenday, Boolean sixteenday, Boolean seventeenday, Boolean eighteenday, Boolean nineteenday, Boolean twentyday, Boolean twentyoneday, Boolean forexternalviewing, Boolean rateshopformat, BigDecimal safetynet, String postscrapeemail, String postpriceemail, String tetheredlocations, Integer scheduledayofweek2, Integer weekfrequency, Integer hourfrequency, Integer dayfrequency, String conformanceemail, String repeatmode, Integer repeatcount, Boolean dtrateshopformat, Short pickuphour, Short dropoffhour, Boolean ignoretransmission, Short baserateestimatepc, String rateshopformattype, Boolean includemarketsnapshotreport, String specificdaysmulti, String pickupdaysafterrundate, String runforcustompropagation, Boolean includebaserateinsnapshot, Boolean rankreport, String tripkind, Boolean allowctcomparison, Boolean cheapestcar, Boolean ischeapestcarreport, Boolean internalsuppliercomparison, Boolean includeabv, String selectedSuppliers) {
        super(Marketanalysis.MARKETANALYSIS);

        set(0, guid);
        set(1, id);
        set(2, name);
        set(3, scheduleathour);
        set(4, scheduleendhour);
        set(5, scheduleweekdaysonly);
        set(6, scheduledayofweek);
        set(7, schedulewhenmonthly);
        set(8, scheduleinterval);
        set(9, oneday);
        set(10, threeday);
        set(11, sevenday);
        set(12, tenday);
        set(13, weekenddays);
        set(14, ratesfor);
        set(15, scanners);
        set(16, fkUser);
        set(17, sipps);
        set(18, lastruntime);
        set(19, nextruntimeinformationalonly);
        set(20, ratesfordate);
        set(21, repeatweeks);
        set(22, foldsipps);
        set(23, twoday);
        set(24, fourday);
        set(25, fiveday);
        set(26, sixday);
        set(27, displaycurrency);
        set(28, scheduleimmediately);
        set(29, eightday);
        set(30, nineday);
        set(31, elevenday);
        set(32, twelveday);
        set(33, thirteenday);
        set(34, fourteenday);
        set(35, fifteenday);
        set(36, sixteenday);
        set(37, seventeenday);
        set(38, eighteenday);
        set(39, nineteenday);
        set(40, twentyday);
        set(41, twentyoneday);
        set(42, forexternalviewing);
        set(43, rateshopformat);
        set(44, safetynet);
        set(45, postscrapeemail);
        set(46, postpriceemail);
        set(47, tetheredlocations);
        set(48, scheduledayofweek2);
        set(49, weekfrequency);
        set(50, hourfrequency);
        set(51, dayfrequency);
        set(52, conformanceemail);
        set(53, repeatmode);
        set(54, repeatcount);
        set(55, dtrateshopformat);
        set(56, pickuphour);
        set(57, dropoffhour);
        set(58, ignoretransmission);
        set(59, baserateestimatepc);
        set(60, rateshopformattype);
        set(61, includemarketsnapshotreport);
        set(62, specificdaysmulti);
        set(63, pickupdaysafterrundate);
        set(64, runforcustompropagation);
        set(65, includebaserateinsnapshot);
        set(66, rankreport);
        set(67, tripkind);
        set(68, allowctcomparison);
        set(69, cheapestcar);
        set(70, ischeapestcarreport);
        set(71, internalsuppliercomparison);
        set(72, includeabv);
        set(73, selectedSuppliers);
    }
}
