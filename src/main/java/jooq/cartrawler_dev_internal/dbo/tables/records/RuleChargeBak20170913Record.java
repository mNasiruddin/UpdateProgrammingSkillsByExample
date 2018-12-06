/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.RuleChargeBak20170913;

import org.jooq.impl.TableRecordImpl;


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
public class RuleChargeBak20170913Record extends TableRecordImpl<RuleChargeBak20170913Record> {

    private static final long serialVersionUID = 342461799;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.rule_charge_id</code>.
     */
    public void setRuleChargeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.rule_charge_id</code>.
     */
    public Integer getRuleChargeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.unit</code>.
     */
    public void setUnit(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.unit</code>.
     */
    public String getUnit() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.unit_amount</code>.
     */
    public void setUnitAmount(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.unit_amount</code>.
     */
    public BigDecimal getUnitAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.base_amount</code>.
     */
    public void setBaseAmount(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.base_amount</code>.
     */
    public BigDecimal getBaseAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.min_amount</code>.
     */
    public void setMinAmount(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.min_amount</code>.
     */
    public BigDecimal getMinAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.max_amount</code>.
     */
    public void setMaxAmount(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.max_amount</code>.
     */
    public BigDecimal getMaxAmount() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.min_units</code>.
     */
    public void setMinUnits(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.min_units</code>.
     */
    public Integer getMinUnits() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.max_units</code>.
     */
    public void setMaxUnits(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.max_units</code>.
     */
    public Integer getMaxUnits() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.percentage</code>.
     */
    public void setPercentage(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.percentage</code>.
     */
    public BigDecimal getPercentage() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.currency</code>.
     */
    public void setCurrency(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.currency</code>.
     */
    public String getCurrency() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.in_rate</code>.
     */
    public void setInRate(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.in_rate</code>.
     */
    public Boolean getInRate() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.tax_exclusive</code>.
     */
    public void setTaxExclusive(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.tax_exclusive</code>.
     */
    public Boolean getTaxExclusive() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.on_request</code>.
     */
    public void setOnRequest(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.on_request</code>.
     */
    public Boolean getOnRequest() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.excess</code>.
     */
    public void setExcess(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.excess</code>.
     */
    public Boolean getExcess() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.excess_amount</code>.
     */
    public void setExcessAmount(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.excess_amount</code>.
     */
    public BigDecimal getExcessAmount() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.monthday_period</code>.
     */
    public void setMonthdayPeriod(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.monthday_period</code>.
     */
    public String getMonthdayPeriod() {
        return (String) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.payable_at_counter</code>.
     */
    public void setPayableAtCounter(Boolean value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.payable_at_counter</code>.
     */
    public Boolean getPayableAtCounter() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.required</code>.
     */
    public void setRequired(Boolean value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.required</code>.
     */
    public Boolean getRequired() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.rate_type</code>.
     */
    public void setRateType(Integer value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.rate_type</code>.
     */
    public Integer getRateType() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.max_coverage</code>.
     */
    public void setMaxCoverage(Boolean value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.max_coverage</code>.
     */
    public Boolean getMaxCoverage() {
        return (Boolean) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.max_coverage_unlimited</code>.
     */
    public void setMaxCoverageUnlimited(Boolean value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.max_coverage_unlimited</code>.
     */
    public Boolean getMaxCoverageUnlimited() {
        return (Boolean) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.max_coverage_amount</code>.
     */
    public void setMaxCoverageAmount(BigDecimal value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.max_coverage_amount</code>.
     */
    public BigDecimal getMaxCoverageAmount() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.deposit_amount</code>.
     */
    public void setDepositAmount(BigDecimal value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.deposit_amount</code>.
     */
    public BigDecimal getDepositAmount() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.deposit</code>.
     */
    public void setDeposit(Boolean value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.rule_charge_bak20170913.deposit</code>.
     */
    public Boolean getDeposit() {
        return (Boolean) get(24);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RuleChargeBak20170913Record
     */
    public RuleChargeBak20170913Record() {
        super(RuleChargeBak20170913.RULE_CHARGE_BAK20170913);
    }

    /**
     * Create a detached, initialised RuleChargeBak20170913Record
     */
    public RuleChargeBak20170913Record(UUID guid, Integer ruleChargeId, String unit, BigDecimal unitAmount, BigDecimal baseAmount, BigDecimal minAmount, BigDecimal maxAmount, Integer minUnits, Integer maxUnits, BigDecimal percentage, String currency, Boolean inRate, Boolean taxExclusive, Boolean onRequest, Boolean excess, BigDecimal excessAmount, String monthdayPeriod, Boolean payableAtCounter, Boolean required, Integer rateType, Boolean maxCoverage, Boolean maxCoverageUnlimited, BigDecimal maxCoverageAmount, BigDecimal depositAmount, Boolean deposit) {
        super(RuleChargeBak20170913.RULE_CHARGE_BAK20170913);

        set(0, guid);
        set(1, ruleChargeId);
        set(2, unit);
        set(3, unitAmount);
        set(4, baseAmount);
        set(5, minAmount);
        set(6, maxAmount);
        set(7, minUnits);
        set(8, maxUnits);
        set(9, percentage);
        set(10, currency);
        set(11, inRate);
        set(12, taxExclusive);
        set(13, onRequest);
        set(14, excess);
        set(15, excessAmount);
        set(16, monthdayPeriod);
        set(17, payableAtCounter);
        set(18, required);
        set(19, rateType);
        set(20, maxCoverage);
        set(21, maxCoverageUnlimited);
        set(22, maxCoverageAmount);
        set(23, depositAmount);
        set(24, deposit);
    }
}