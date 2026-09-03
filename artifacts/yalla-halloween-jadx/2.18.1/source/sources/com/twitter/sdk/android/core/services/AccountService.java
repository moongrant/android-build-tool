package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.models.User;
import retrofit2.OooO0O0;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes2.dex */
public interface AccountService {
    @GET("/1.1/account/verify_credentials.json")
    OooO0O0<User> verifyCredentials(@Query("include_entities") Boolean bool, @Query("skip_status") Boolean bool2, @Query("include_email") Boolean bool3);
}
