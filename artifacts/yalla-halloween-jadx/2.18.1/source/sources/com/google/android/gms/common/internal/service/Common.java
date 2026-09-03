package com.google.android.gms.common.internal.service;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import o0OO000.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class Common {

    @NonNull
    @KeepForSdk
    public static final Api<Api.ApiOptions.NoOptions> API;

    @NonNull
    @KeepForSdk
    public static final Api.ClientKey<zah> CLIENT_KEY;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Api.AbstractClientBuilder<zah, Api.ApiOptions.NoOptions> f15626OooO00o;
    public static final zae zaa;

    static {
        Api.ClientKey<zah> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        OooO00o oooO00o = new OooO00o();
        f15626OooO00o = oooO00o;
        API = new Api<>("Common.API", oooO00o, clientKey);
        zaa = new zae();
    }
}
