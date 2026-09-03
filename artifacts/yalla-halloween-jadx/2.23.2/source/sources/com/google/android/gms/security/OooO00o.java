package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends AsyncTask {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Context f15647OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ProviderInstaller.ProviderInstallListener f15648OooO0O0;

    public OooO00o(Context context, ProviderInstaller.ProviderInstallListener providerInstallListener) {
        this.f15647OooO00o = context;
        this.f15648OooO0O0 = providerInstallListener;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            ProviderInstaller.installIfNeeded(this.f15647OooO00o);
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
        int iIntValue = num.intValue();
        ProviderInstaller.ProviderInstallListener providerInstallListener = this.f15648OooO0O0;
        if (iIntValue == 0) {
            providerInstallListener.onProviderInstalled();
            return;
        }
        providerInstallListener.onProviderInstallFailed(num.intValue(), ProviderInstaller.f15649OooO00o.getErrorResolutionIntent(this.f15647OooO00o, num.intValue(), "pi"));
    }
}
