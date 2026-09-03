package com.twitter.sdk.android.core.services;

import com.facebook.share.internal.ShareConstants;
import com.twitter.sdk.android.core.models.OooOOO;
import p634o0ooO0oO.oo00oO;
import retrofit2.OooO0O0;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/* JADX INFO: loaded from: classes4.dex */
public interface MediaService {
    @POST("https://upload.twitter.com/1.1/media/upload.json")
    @Multipart
    OooO0O0<OooOOO> upload(@Part(ShareConstants.WEB_DIALOG_PARAM_MEDIA) oo00oO oo00oo, @Part("media_data") oo00oO oo00oo2, @Part("additional_owners") oo00oO oo00oo3);
}
