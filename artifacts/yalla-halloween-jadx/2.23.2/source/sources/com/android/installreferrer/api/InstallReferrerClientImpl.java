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
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import p239o00oo.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
public final class InstallReferrerClientImpl extends InstallReferrerClient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f12866OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f12867OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00O00OO f12868OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f12869OooO0Oo;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    public final class OooO00o implements ServiceConnection {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InstallReferrerStateListener f12870OooO00o;

        public OooO00o(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f12870OooO00o = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            o00O00OO c0440OooO00o;
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
            int i = o00O00OO.OooO00o.f40051OooO0Oo;
            if (iBinder == null) {
                c0440OooO00o = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                c0440OooO00o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof o00O00OO)) ? new o00O00OO.OooO00o.C0440OooO00o(iBinder) : (o00O00OO) iInterfaceQueryLocalInterface;
            }
            InstallReferrerClientImpl installReferrerClientImpl = InstallReferrerClientImpl.this;
            installReferrerClientImpl.f12868OooO0OO = c0440OooO00o;
            installReferrerClientImpl.f12866OooO00o = 2;
            this.f12870OooO00o.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
            InstallReferrerClientImpl installReferrerClientImpl = InstallReferrerClientImpl.this;
            installReferrerClientImpl.f12868OooO0OO = null;
            installReferrerClientImpl.f12866OooO00o = 0;
            this.f12870OooO00o.onInstallReferrerServiceDisconnected();
        }
    }

    public InstallReferrerClientImpl(@NonNull Context context) {
        this.f12867OooO0O0 = context.getApplicationContext();
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void endConnection() {
        this.f12866OooO00o = 3;
        if (this.f12869OooO0Oo != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.f12867OooO0O0.unbindService(this.f12869OooO0Oo);
            this.f12869OooO0Oo = null;
        }
        this.f12868OooO0OO = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final ReferrerDetails getInstallReferrer() throws RemoteException {
        if (!isReady()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f12867OooO0O0.getPackageName());
        try {
            return new ReferrerDetails(this.f12868OooO0OO.OooO0OO(bundle));
        } catch (RemoteException e) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f12866OooO00o = 0;
            throw e;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final boolean isReady() {
        return (this.f12866OooO00o != 2 || this.f12868OooO0OO == null || this.f12869OooO0Oo == null) ? false : true;
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
        int i = this.f12866OooO00o;
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
        this.f12869OooO0Oo = new OooO00o(installReferrerStateListener);
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.f12867OooO0O0;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f12866OooO00o = 0;
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                z = context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (z) {
                if (context.bindService(new Intent(intent), this.f12869OooO0Oo, 1)) {
                    InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                    return;
                }
                InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
                this.f12866OooO00o = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(1);
                return;
            }
        }
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.f12866OooO00o = 0;
        installReferrerStateListener.onInstallReferrerSetupFinished(2);
    }
}
