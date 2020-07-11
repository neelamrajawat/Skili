package com.securesurveillance.skili.apiinterfaces;

import com.securesurveillance.skili.apiHandler.AppConstants;
import com.securesurveillance.skili.model.responsemodel.GetCategoryModel;
import com.securesurveillance.skili.model.responsemodel.LoginModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by adarsh on 8/19/2018.
 */

public interface DeleteEducationController {

    @DELETE(AppConstants.Urls.DELETE_EDUCATION)
    Call<LoginModel> getResponse(@Header("authorization") String token , @Query("profileId") String profileId,
                                 @Query("educationId") String educationId);
}
