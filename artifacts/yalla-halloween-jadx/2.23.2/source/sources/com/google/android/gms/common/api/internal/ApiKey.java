package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ApiKey<O extends Api.ApiOptions> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f14226OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Api<O> f14227OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final O f14228OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f14229OooO0Oo;

    public ApiKey(Api<O> api, @Nullable O o, @Nullable String str) {
        this.f14227OooO0O0 = api;
        this.f14228OooO0OO = o;
        this.f14229OooO0Oo = str;
        this.f14226OooO00o = Objects.hashCode(api, o, str);
    }

    @NonNull
    public static <O extends Api.ApiOptions> ApiKey<O> zaa(@NonNull Api<O> api, @Nullable O o, @Nullable String str) {
        return new ApiKey<>(api, o, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return Objects.equal(this.f14227OooO0O0, apiKey.f14227OooO0O0) && Objects.equal(this.f14228OooO0OO, apiKey.f14228OooO0OO) && Objects.equal(this.f14229OooO0Oo, apiKey.f14229OooO0Oo);
    }

    public final int hashCode() {
        return this.f14226OooO00o;
    }

    @NonNull
    public final String zab() {
        return this.f14227OooO0O0.zad();
    }
}
