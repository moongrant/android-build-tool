package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.umeng.analytics.pro.ak;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import p323o0O0oo0.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class InstallReferrerClientImpl extends InstallReferrerClient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f11327OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f11328OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooOOO0 f11329OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f11330OooO0Oo;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    public final class OooO00o implements ServiceConnection {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InstallReferrerStateListener f11331OooO00o;

        public OooO00o(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f11331OooO00o = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            OooOOO0 c0371OooO00o;
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
            InstallReferrerClientImpl installReferrerClientImpl = InstallReferrerClientImpl.this;
            int i = OooOOO0.OooO00o.f36890OooO00o;
            if (iBinder == null) {
                c0371OooO00o = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                c0371OooO00o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OooOOO0)) ? new OooOOO0.OooO00o.C0371OooO00o(iBinder) : (OooOOO0) iInterfaceQueryLocalInterface;
            }
            installReferrerClientImpl.f11329OooO0OO = c0371OooO00o;
            InstallReferrerClientImpl.this.f11327OooO00o = 2;
            this.f11331OooO00o.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
            InstallReferrerClientImpl installReferrerClientImpl = InstallReferrerClientImpl.this;
            installReferrerClientImpl.f11329OooO0OO = null;
            installReferrerClientImpl.f11327OooO00o = 0;
            this.f11331OooO00o.onInstallReferrerServiceDisconnected();
        }
    }

    public InstallReferrerClientImpl(@NonNull Context context) {
        this.f11328OooO0O0 = context.getApplicationContext();
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void endConnection() {
        this.f11327OooO00o = 3;
        if (this.f11330OooO0Oo != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.f11328OooO0O0.unbindService(this.f11330OooO0Oo);
            this.f11330OooO0Oo = null;
        }
        this.f11329OooO0OO = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final ReferrerDetails getInstallReferrer() throws RemoteException {
        if (!isReady()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString(ak.f20239o, this.f11328OooO0O0.getPackageName());
        try {
            return new ReferrerDetails(this.f11329OooO0OO.OooO0o0(bundle));
        } catch (RemoteException e) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f11327OooO00o = 0;
            throw e;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final boolean isReady() {
        return (this.f11327OooO00o != 2 || this.f11329OooO0OO == null || this.f11330OooO0Oo == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void startConnection(@NonNull InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        boolean z;
        if (isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.f11327OooO00o;
        if (i == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i == 3) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
        this.f11330OooO0Oo = new OooO00o(installReferrerStateListener);
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = this.f11328OooO0O0.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f11327OooO00o = 0;
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                z = this.f11328OooO0O0.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (z) {
                if (this.f11328OooO0O0.bindService(new Intent(intent), this.f11330OooO0Oo, 1)) {
                    InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                    return;
                }
                InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
                this.f11327OooO00o = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(1);
                return;
            }
        }
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.f11327OooO00o = 0;
        installReferrerStateListener.onInstallReferrerSetupFinished(2);
    }
}
