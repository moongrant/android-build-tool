package com.twitter.sdk.android.core.services;

import com.facebook.share.internal.ShareConstants;
import com.twitter.sdk.android.core.models.OooOOO;
import p641o0ooOO0o.o0oO0Ooo;
import retrofit2.OooO0O0;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/* JADX INFO: loaded from: classes2.dex */
public interface MediaService {
    @POST("https://upload.twitter.com/1.1/media/upload.json")
    @Multipart
    OooO0O0<OooOOO> upload(@Part(ShareConstants.WEB_DIALOG_PARAM_MEDIA) o0oO0Ooo o0oo0ooo2, @Part("media_data") o0oO0Ooo o0oo0ooo3, @Part("additional_owners") o0oO0Ooo o0oo0ooo4);
}
