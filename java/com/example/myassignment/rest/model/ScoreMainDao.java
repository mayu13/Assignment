
package com.example.myassignment.rest.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ScoreMainDao {

    @SerializedName("accountIDVStatus")
    @Expose
    private String accountIDVStatus;
    @SerializedName("creditReportInfo")
    @Expose
    private CreditReportInfo creditReportInfo;
    @SerializedName("dashboardStatus")
    @Expose
    private String dashboardStatus;
    @SerializedName("personaType")
    @Expose
    private String personaType;
    @SerializedName("coachingSummary")
    @Expose
    private CoachingSummary coachingSummary;
    @SerializedName("augmentedCreditScore")
    @Expose
    private Object augmentedCreditScore;

    public String getAccountIDVStatus() {
        return accountIDVStatus;
    }

    public void setAccountIDVStatus(String accountIDVStatus) {
        this.accountIDVStatus = accountIDVStatus;
    }

    public CreditReportInfo getCreditReportInfo() {
        return creditReportInfo;
    }

    public void setCreditReportInfo(CreditReportInfo creditReportInfo) {
        this.creditReportInfo = creditReportInfo;
    }

    public String getDashboardStatus() {
        return dashboardStatus;
    }

    public void setDashboardStatus(String dashboardStatus) {
        this.dashboardStatus = dashboardStatus;
    }

    public String getPersonaType() {
        return personaType;
    }

    public void setPersonaType(String personaType) {
        this.personaType = personaType;
    }

    public CoachingSummary getCoachingSummary() {
        return coachingSummary;
    }

    public void setCoachingSummary(CoachingSummary coachingSummary) {
        this.coachingSummary = coachingSummary;
    }

    public Object getAugmentedCreditScore() {
        return augmentedCreditScore;
    }

    public void setAugmentedCreditScore(Object augmentedCreditScore) {
        this.augmentedCreditScore = augmentedCreditScore;
    }

}
