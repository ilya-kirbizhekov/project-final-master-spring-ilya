package com.javarush.jira.profile.internal.web;

import com.javarush.jira.AbstractControllerTest;


import com.javarush.jira.profile.ProfileTo;



import org.junit.jupiter.api.Test;

import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static com.javarush.jira.common.util.JsonUtil.writeValue;
import static com.javarush.jira.login.internal.web.UserTestData.*;

import static com.javarush.jira.profile.internal.web.ProfileTestData.USER_PROFILE_TO;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static com.javarush.jira.profile.internal.web.ProfileRestController.REST_URL;
import static com.javarush.jira.profile.internal.web.ProfileTestData.*;


class ProfileRestControllerTest extends AbstractControllerTest {



    @Test // No user logged in...
    void NoAuthorization() throws Exception {
        perform(MockMvcRequestBuilders.get(REST_URL))
                .andExpect(status().isUnauthorized());
    }

    @Test
    @WithUserDetails(value = USER_MAIL) // User id = 1 is authorized
    void GetUserUserProfile() throws Exception{

        ProfileTo user_profile = USER_PROFILE_TO; // get user profile data from profileTestData

        ResultActions actions = perform(MockMvcRequestBuilders.get(REST_URL))
                .andExpect(status().isOk())
                .andDo(print());

    }

    @Test
    @WithUserDetails(value = ADMIN_MAIL)
    void UpdateUserProfileByAdmin() throws Exception{
        ProfileTo profileTo = getNewTo();
        perform(MockMvcRequestBuilders.put(ProfileRestController.REST_URL)
                .contentType(MediaType.APPLICATION_JSON)
                .content(writeValue(profileTo)))
                .andDo(print())
                .andExpect(status().isNoContent());
    }


}