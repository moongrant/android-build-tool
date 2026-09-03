package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ApiKey<O extends Api.ApiOptions> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f15203OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Api<O> f15204OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final O f15205OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f15206OooO0Oo;

    public ApiKey(Api<O> api, @Nullable O o2, @Nullable String str) {
        this.f15204OooO0O0 = api;
        this.f15205OooO0OO = o2;
        this.f15206OooO0Oo = str;
        this.f15203OooO00o = Objects.hashCode(api, o2, str);
    }

    @NonNull
    public static <O extends Api.ApiOptions> ApiKey<O> zaa(@NonNull Api<O> api, @Nullable O o2, @Nullable String str) {
        return new ApiKey<>(api, o2, str);
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
        return Objects.equal(this.f15204OooO0O0, apiKey.f15204OooO0O0) && Objects.equal(this.f15205OooO0OO, apiKey.f15205OooO0OO) && Objects.equal(this.f15206OooO0Oo, apiKey.f15206OooO0Oo);
    }

    public final int hashCode() {
        return this.f15203OooO00o;
    }

    @NonNull
    public final String zab() {
        return this.f15204OooO0O0.zad();
    }
}
