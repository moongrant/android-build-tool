package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends AsyncTask {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Context f16322OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ProviderInstaller.ProviderInstallListener f16323OooO0O0;

    public OooO00o(Context context, ProviderInstaller.ProviderInstallListener providerInstallListener) {
        this.f16322OooO00o = context;
        this.f16323OooO0O0 = providerInstallListener;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            ProviderInstaller.installIfNeeded(this.f16322OooO00o);
            return 0;
        } catch (GooglePlayServicesNotAvailableException e) {
            return Integer.valueOf(e.errorCode);
        } catch (GooglePlayServicesRepairableException e2) {
            return Integer.valueOf(e2.getConnectionStatusCode());
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f16323OooO0O0.onProviderInstalled();
        } else {
            this.f16323OooO0O0.onProviderInstallFailed(num.intValue(), ProviderInstaller.f16324OooO00o.getErrorResolutionIntent(this.f16322OooO00o, num.intValue(), "pi"));
        }
    }
}
