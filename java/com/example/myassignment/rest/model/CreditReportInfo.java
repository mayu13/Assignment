
package com.example.myassignment.rest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreditReportInfo {

    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("scoreBand")
    @Expose
    private Integer scoreBand;
    @SerializedName("clientRef")
    @Expose
    private String clientRef;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("maxScoreValue")
    @Expose
    private Integer maxScoreValue;
    @SerializedName("minScoreValue")
    @Expose
    private Integer minScoreValue;
    @SerializedName("monthsSinceLastDefaulted")
    @Expose
    private Integer monthsSinceLastDefaulted;
    @SerializedName("hasEverDefaulted")
    @Expose
    private Boolean hasEverDefaulted;
    @SerializedName("monthsSinceLastDelinquent")
    @Expose
    private Integer monthsSinceLastDelinquent;
    @SerializedName("hasEverBeenDelinquent")
    @Expose
    private Boolean hasEverBeenDelinquent;
    @SerializedName("percentageCreditUsed")
    @Expose
    private Integer percentageCreditUsed;
    @SerializedName("percentageCreditUsedDirectionFlag")
    @Expose
    private Integer percentageCreditUsedDirectionFlag;
    @SerializedName("changedScore")
    @Expose
    private Integer changedScore;
    @SerializedName("currentShortTermDebt")
    @Expose
    private Integer currentShortTermDebt;
    @SerializedName("currentShortTermNonPromotionalDebt")
    @Expose
    private Integer currentShortTermNonPromotionalDebt;
    @SerializedName("currentShortTermCreditLimit")
    @Expose
    private Integer currentShortTermCreditLimit;
    @SerializedName("currentShortTermCreditUtilisation")
    @Expose
    private Integer currentShortTermCreditUtilisation;
    @SerializedName("changeInShortTermDebt")
    @Expose
    private Integer changeInShortTermDebt;
    @SerializedName("currentLongTermDebt")
    @Expose
    private Integer currentLongTermDebt;
    @SerializedName("currentLongTermNonPromotionalDebt")
    @Expose
    private Integer currentLongTermNonPromotionalDebt;
    @SerializedName("currentLongTermCreditLimit")
    @Expose
    private Object currentLongTermCreditLimit;
    @SerializedName("currentLongTermCreditUtilisation")
    @Expose
    private Object currentLongTermCreditUtilisation;
    @SerializedName("changeInLongTermDebt")
    @Expose
    private Integer changeInLongTermDebt;
    @SerializedName("numPositiveScoreFactors")
    @Expose
    private Integer numPositiveScoreFactors;
    @SerializedName("numNegativeScoreFactors")
    @Expose
    private Integer numNegativeScoreFactors;
    @SerializedName("equifaxScoreBand")
    @Expose
    private Integer equifaxScoreBand;
    @SerializedName("equifaxScoreBandDescription")
    @Expose
    private String equifaxScoreBandDescription;
    @SerializedName("daysUntilNextReport")
    @Expose
    private Integer daysUntilNextReport;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScoreBand() {
        return scoreBand;
    }

    public void setScoreBand(Integer scoreBand) {
        this.scoreBand = scoreBand;
    }

    public String getClientRef() {
        return clientRef;
    }

    public void setClientRef(String clientRef) {
        this.clientRef = clientRef;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getMaxScoreValue() {
        return maxScoreValue;
    }

    public void setMaxScoreValue(Integer maxScoreValue) {
        this.maxScoreValue = maxScoreValue;
    }

    public Integer getMinScoreValue() {
        return minScoreValue;
    }

    public void setMinScoreValue(Integer minScoreValue) {
        this.minScoreValue = minScoreValue;
    }

    public Integer getMonthsSinceLastDefaulted() {
        return monthsSinceLastDefaulted;
    }

    public void setMonthsSinceLastDefaulted(Integer monthsSinceLastDefaulted) {
        this.monthsSinceLastDefaulted = monthsSinceLastDefaulted;
    }

    public Boolean getHasEverDefaulted() {
        return hasEverDefaulted;
    }

    public void setHasEverDefaulted(Boolean hasEverDefaulted) {
        this.hasEverDefaulted = hasEverDefaulted;
    }

    public Integer getMonthsSinceLastDelinquent() {
        return monthsSinceLastDelinquent;
    }

    public void setMonthsSinceLastDelinquent(Integer monthsSinceLastDelinquent) {
        this.monthsSinceLastDelinquent = monthsSinceLastDelinquent;
    }

    public Boolean getHasEverBeenDelinquent() {
        return hasEverBeenDelinquent;
    }

    public void setHasEverBeenDelinquent(Boolean hasEverBeenDelinquent) {
        this.hasEverBeenDelinquent = hasEverBeenDelinquent;
    }

    public Integer getPercentageCreditUsed() {
        return percentageCreditUsed;
    }

    public void setPercentageCreditUsed(Integer percentageCreditUsed) {
        this.percentageCreditUsed = percentageCreditUsed;
    }

    public Integer getPercentageCreditUsedDirectionFlag() {
        return percentageCreditUsedDirectionFlag;
    }

    public void setPercentageCreditUsedDirectionFlag(Integer percentageCreditUsedDirectionFlag) {
        this.percentageCreditUsedDirectionFlag = percentageCreditUsedDirectionFlag;
    }

    public Integer getChangedScore() {
        return changedScore;
    }

    public void setChangedScore(Integer changedScore) {
        this.changedScore = changedScore;
    }

    public Integer getCurrentShortTermDebt() {
        return currentShortTermDebt;
    }

    public void setCurrentShortTermDebt(Integer currentShortTermDebt) {
        this.currentShortTermDebt = currentShortTermDebt;
    }

    public Integer getCurrentShortTermNonPromotionalDebt() {
        return currentShortTermNonPromotionalDebt;
    }

    public void setCurrentShortTermNonPromotionalDebt(Integer currentShortTermNonPromotionalDebt) {
        this.currentShortTermNonPromotionalDebt = currentShortTermNonPromotionalDebt;
    }

    public Integer getCurrentShortTermCreditLimit() {
        return currentShortTermCreditLimit;
    }

    public void setCurrentShortTermCreditLimit(Integer currentShortTermCreditLimit) {
        this.currentShortTermCreditLimit = currentShortTermCreditLimit;
    }

    public Integer getCurrentShortTermCreditUtilisation() {
        return currentShortTermCreditUtilisation;
    }

    public void setCurrentShortTermCreditUtilisation(Integer currentShortTermCreditUtilisation) {
        this.currentShortTermCreditUtilisation = currentShortTermCreditUtilisation;
    }

    public Integer getChangeInShortTermDebt() {
        return changeInShortTermDebt;
    }

    public void setChangeInShortTermDebt(Integer changeInShortTermDebt) {
        this.changeInShortTermDebt = changeInShortTermDebt;
    }

    public Integer getCurrentLongTermDebt() {
        return currentLongTermDebt;
    }

    public void setCurrentLongTermDebt(Integer currentLongTermDebt) {
        this.currentLongTermDebt = currentLongTermDebt;
    }

    public Integer getCurrentLongTermNonPromotionalDebt() {
        return currentLongTermNonPromotionalDebt;
    }

    public void setCurrentLongTermNonPromotionalDebt(Integer currentLongTermNonPromotionalDebt) {
        this.currentLongTermNonPromotionalDebt = currentLongTermNonPromotionalDebt;
    }

    public Object getCurrentLongTermCreditLimit() {
        return currentLongTermCreditLimit;
    }

    public void setCurrentLongTermCreditLimit(Object currentLongTermCreditLimit) {
        this.currentLongTermCreditLimit = currentLongTermCreditLimit;
    }

    public Object getCurrentLongTermCreditUtilisation() {
        return currentLongTermCreditUtilisation;
    }

    public void setCurrentLongTermCreditUtilisation(Object currentLongTermCreditUtilisation) {
        this.currentLongTermCreditUtilisation = currentLongTermCreditUtilisation;
    }

    public Integer getChangeInLongTermDebt() {
        return changeInLongTermDebt;
    }

    public void setChangeInLongTermDebt(Integer changeInLongTermDebt) {
        this.changeInLongTermDebt = changeInLongTermDebt;
    }

    public Integer getNumPositiveScoreFactors() {
        return numPositiveScoreFactors;
    }

    public void setNumPositiveScoreFactors(Integer numPositiveScoreFactors) {
        this.numPositiveScoreFactors = numPositiveScoreFactors;
    }

    public Integer getNumNegativeScoreFactors() {
        return numNegativeScoreFactors;
    }

    public void setNumNegativeScoreFactors(Integer numNegativeScoreFactors) {
        this.numNegativeScoreFactors = numNegativeScoreFactors;
    }

    public Integer getEquifaxScoreBand() {
        return equifaxScoreBand;
    }

    public void setEquifaxScoreBand(Integer equifaxScoreBand) {
        this.equifaxScoreBand = equifaxScoreBand;
    }

    public String getEquifaxScoreBandDescription() {
        return equifaxScoreBandDescription;
    }

    public void setEquifaxScoreBandDescription(String equifaxScoreBandDescription) {
        this.equifaxScoreBandDescription = equifaxScoreBandDescription;
    }

    public Integer getDaysUntilNextReport() {
        return daysUntilNextReport;
    }

    public void setDaysUntilNextReport(Integer daysUntilNextReport) {
        this.daysUntilNextReport = daysUntilNextReport;
    }

}
