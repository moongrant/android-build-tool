package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes2.dex */
public final class zal {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SparseIntArray f15641OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public GoogleApiAvailabilityLight f15642OooO0O0;

    public zal() {
        this(GoogleApiAvailability.getInstance());
    }

    public final int zaa(Context context, int i) {
        return this.f15641OooO00o.get(i, -1);
    }

    public final int zab(@NonNull Context context, @NonNull Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int i = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int iZaa = zaa(context, minApkVersion);
        if (iZaa == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f15641OooO00o.size()) {
                    i = -1;
                    break;
                }
                int iKeyAt = this.f15641OooO00o.keyAt(i2);
                if (iKeyAt > minApkVersion && this.f15641OooO00o.get(iKeyAt) == 0) {
                    break;
                }
                i2++;
            }
            iZaa = i == -1 ? this.f15642OooO0O0.isGooglePlayServicesAvailable(context, minApkVersion) : i;
            this.f15641OooO00o.put(minApkVersion, iZaa);
        }
        return iZaa;
    }

    public final void zac() {
        this.f15641OooO00o.clear();
    }

    public zal(@NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.f15641OooO00o = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.f15642OooO0O0 = googleApiAvailabilityLight;
    }
}
