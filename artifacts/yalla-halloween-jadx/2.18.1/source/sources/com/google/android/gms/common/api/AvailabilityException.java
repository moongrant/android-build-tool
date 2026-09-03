package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import p021OooOooo.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public class AvailabilityException extends Exception {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Oooo0<ApiKey<?>, ConnectionResult> f15148Oooo0o;

    public AvailabilityException(@NonNull Oooo0<ApiKey<?>, ConnectionResult> oooo0) {
        this.f15148Oooo0o = oooo0;
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<O> apiKey = googleApi.getApiKey();
        boolean z = this.f15148Oooo0o.getOrDefault(apiKey, null) != null;
        String strZab = apiKey.zab();
        StringBuilder sb = new StringBuilder(String.valueOf(strZab).length() + 58);
        sb.append("The given API (");
        sb.append(strZab);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.f15148Oooo0o.getOrDefault(apiKey, null));
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (ApiKey apiKey : (Oooo0.OooO0OO) this.f15148Oooo0o.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull(this.f15148Oooo0o.getOrDefault(apiKey, null));
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
        boolean z = this.f15148Oooo0o.getOrDefault(apiKey, null) != null;
        String strZab = apiKey.zab();
        StringBuilder sb = new StringBuilder(String.valueOf(strZab).length() + 58);
        sb.append("The given API (");
        sb.append(strZab);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.f15148Oooo0o.getOrDefault(apiKey, null));
    }
}
