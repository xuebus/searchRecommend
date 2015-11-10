/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yufei.searchrecommend.service.impl;

import com.yufei.searchrecommend.service.IRecommend;
import com.yufei.searchrecommend.service.QueryService;
import com.yufei.searchrecommend.solr.SolrQueryService;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jasstion
 */
public class SimilarUsersRecommenderTest {

    public SimilarUsersRecommenderTest() {
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
     * Test of recommend method, of class SimilarUsersRecommender.
     */
    @Test
    public void testRecommend() {
        String profileUserId = "75817500";
        String visitUserId = "56027289";

        Map<String, String> params = Maps.newHashMap();
        params.put("profileUserId", profileUserId);
        params.put("visitUserId", visitUserId);
        params.put("count", "36");
        QueryService queryService = new SolrQueryService();
        IRecommend interestedUsersRecommender = new SimilarUsersRecommender();
        //similarUserIds
        Map<String, Object> results = interestedUsersRecommender.recommend(params);
        List<String> userIds = (List<String>) results.get("similarUserIds");
        //            query.setFls(Lists.newArrayList("userID","lastLoginDate","hasMainPhoto"));

        for (String userId : userIds) {
            System.out.print(userId + "\n");
        }
    }

}
