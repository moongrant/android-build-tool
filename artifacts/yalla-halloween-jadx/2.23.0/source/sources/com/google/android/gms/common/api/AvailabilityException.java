package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import p188o00o0O.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public class AvailabilityException extends Exception {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0<ApiKey<?>, ConnectionResult> f14647OooO0Oo;

    public AvailabilityException(@NonNull OooOO0<ApiKey<?>, ConnectionResult> oooOO1) {
        this.f14647OooO0Oo = oooOO1;
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<O> apiKey = googleApi.getApiKey();
        OooOO0<ApiKey<?>, ConnectionResult> oooOO1 = this.f14647OooO0Oo;
        boolean z = oooOO1.getOrDefault(apiKey, null) != null;
        String strZab = apiKey.zab();
        StringBuilder sb = new StringBuilder(String.valueOf(strZab).length() + 58);
        sb.append("The given API (");
        sb.append(strZab);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull(oooOO1.getOrDefault(apiKey, null));
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        OooOO0<ApiKey<?>, ConnectionResult> oooOO1 = this.f14647OooO0Oo;
        boolean z = true;
        for (ApiKey apiKey : (OooOO0.OooO0OO) oooOO1.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull(oooOO1.getOrDefault(apiKey, null));
            z &= !connectionResult.isSuccess();
            String strZab = apiKey.zab();
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(strZab).length() + 2 + strValueOf.length());
            sb.append(strZab);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ApiKey<O> apiKey = hasApiKey.getApiKey();
        OooOO0<ApiKey<?>, ConnectionResult> oooOO1 = this.f14647OooO0Oo;
        boolean z = oooOO1.getOrDefault(apiKey, null) != null;
        String strZab = apiKey.zab();
        StringBuilder sb = new StringBuilder(String.valueOf(strZab).length() + 58);
        sb.append("The given API (");
        sb.append(strZab);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull(oooOO1.getOrDefault(apiKey, null));
    }
}
