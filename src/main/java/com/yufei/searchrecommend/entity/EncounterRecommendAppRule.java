/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yufei.searchrecommend.entity;

/**
 *
 * @author jasstion
 */
public class EncounterRecommendAppRule extends RecommendAppRule {

    public EncounterRecommendAppRule() {
        super();
    }

    public EncounterRecommendAppRule(String appId, String appName, String filter, String sort, String cacheStrstegy, boolean ifWriteIntoUserRelations, boolean ifDuplicateFromUserRelations) {
        super(appId, appName, filter, sort, cacheStrstegy, ifWriteIntoUserRelations, ifDuplicateFromUserRelations);
    }

    private float identityWeight = 0f;
    private float ageWeight = 0f;
    private float heightWeight = 0f;
    private float locationWeight = 0f;
    private float lastLoginTimeWeight = 0f;
    private float districtWeight = 0f;
    private float cityWeight = 0f;
    private float marriageStatusWeight=0f;
    //duplication days
    private int dupDays = -1;

    public float getMarriageStatusWeight() {
        return marriageStatusWeight;
    }

    public void setMarriageStatusWeight(float marriageStatusWeight) {
        this.marriageStatusWeight = marriageStatusWeight;
    }
    
    public int getDupDays() {
        return dupDays;
    }

    public void setDupDays(int dupDays) {
        this.dupDays = dupDays;
    }

    public float getDistrictWeight() {
        return districtWeight;
    }

    public void setDistrictWeight(float districtWeight) {
        this.districtWeight = districtWeight;
    }

    public float getCityWeight() {
        return cityWeight;
    }

    public void setCityWeight(float cityWeight) {
        this.cityWeight = cityWeight;
    }

    public float getIdentityWeight() {
        return identityWeight;
    }

    public float getLastLoginTimeWeight() {
        return lastLoginTimeWeight;
    }

    public void setLastLoginTimeWeight(float lastLoginTimeWeight) {
        this.lastLoginTimeWeight = lastLoginTimeWeight;
    }

    public void setIdentityWeight(float identityWeight) {
        this.identityWeight = identityWeight;
    }

    public float getAgeWeight() {
        return ageWeight;
    }

    public void setAgeWeight(float ageWeight) {
        this.ageWeight = ageWeight;
    }

    public float getHeightWeight() {
        return heightWeight;
    }

    public void setHeightWeight(float heightWeight) {
        this.heightWeight = heightWeight;
    }

    public float getLocationWeight() {
        return locationWeight;
    }

    public void setLocationWeight(float locationWeight) {
        this.locationWeight = locationWeight;
    }

}
