/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yufei.searchrecommend.service.impl;

import com.yufei.searchrecommend.entity.RecommendAppRule;
import com.google.common.collect.Lists;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jasstion
 */
public class AbstractRecommenderTest {

    public AbstractRecommenderTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getUserInfoByUserId method, of class AbstractRecommender.
     */
    @Test
    public void testGetUserInfoByUserId() {
    }

    /**
     * Test of getAppRule method, of class AbstractRecommender.
     */
    @Test
    public void testGetAppRule() {
    }

    /**
     * Test of makeBaiheQuery method, of class AbstractRecommender.
     */
    @Test
    public void testMakeBaiheQuery() {
    }

    /**
     * Test of processRecommendUsersRelations method, of class
     * AbstractRecommender.
     */
    @Test
    public void testProcessRecommendUsersRelations() {
        //http://userrelation1.yufei.com/inner/relation/count.json?params={userID:%2756027289%27,relationSign:%27recommend_interested_user%27}
        List<String> recommendUserIds = Lists.newArrayList("117851575");
        String visitedUserId = "56027289";
        InterestedUsersRecommender interestedUsersRecommender = new InterestedUsersRecommender();
        RecommendAppRule recommendAppRule = new RecommendAppRule();
        recommendAppRule.setIfWriteIntoUserRelations(true);

        interestedUsersRecommender.processRecommendUsersRelations(recommendAppRule, visitedUserId, recommendUserIds);
    }

    /**
     * Test of duplicateRecommendUsersFromUserRelations method, of class
     * AbstractRecommender.
     */
    @Test
    public void testDuplicateRecommendUsersFromUserRelations() {
         List<String> recommendUserIds = Lists.newArrayList("117851575");
        String visitedUserId = "56027289";
        InterestedUsersRecommender interestedUsersRecommender = new InterestedUsersRecommender();
        RecommendAppRule recommendAppRule = new RecommendAppRule();
        recommendAppRule.setIfWriteIntoUserRelations(true);
        recommendAppRule.setIfDuplicateFromUserRelations(true);

        interestedUsersRecommender.duplicateRecommendUsersFromUserRelations(recommendAppRule, recommendUserIds, visitedUserId);
    }

}
