package com.twitter.sdk.android.core.services;

import com.facebook.share.internal.ShareConstants;
import p436o0OoOOOO.o0O00O;
import p660o0ooo0o0.o0o0Oo;
import retrofit2.OooO0O0;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/* JADX INFO: loaded from: classes2.dex */
public interface MediaService {
    @POST("https://upload.twitter.com/1.1/media/upload.json")
    @Multipart
    OooO0O0<o0O00O> upload(@Part(ShareConstants.WEB_DIALOG_PARAM_MEDIA) o0o0Oo o0o0oo, @Part("media_data") o0o0Oo o0o0oo2, @Part("additional_owners") o0o0Oo o0o0oo3);
}
