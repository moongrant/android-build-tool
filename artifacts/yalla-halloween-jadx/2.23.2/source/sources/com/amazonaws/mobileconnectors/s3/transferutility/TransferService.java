package com.amazonaws.mobileconnectors.s3.transferutility;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TransferService extends Service {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Log f12277OooO0oO = LogFactory.OooO00o(TransferService.class);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static TransferNetworkLossHandler f12278OooO0oo;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f12279OooO0Oo = true;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f12281OooO0o0 = 1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f12280OooO0o = true;

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        TransferStatusUpdater transferStatusUpdater;
        if ((getApplicationInfo().flags & 2) == 0) {
            return;
        }
        printWriter.printf("network status: %s\n", Boolean.valueOf(f12278OooO0oo.OooO0Oo()));
        Log log = TransferStatusUpdater.f12282OooO0OO;
        synchronized (TransferStatusUpdater.class) {
            if (TransferStatusUpdater.f12286OooO0oO == null) {
                TransferDBUtil transferDBUtil = new TransferDBUtil(this);
                TransferStatusUpdater.f12284OooO0o = transferDBUtil;
                TransferStatusUpdater.f12286OooO0oO = new TransferStatusUpdater(transferDBUtil);
            }
            transferStatusUpdater = TransferStatusUpdater.f12286OooO0oO;
        }
        Map<Integer, TransferRecord> mapOooO0OO = transferStatusUpdater.OooO0OO();
        printWriter.printf("# of active transfers: %d\n", Integer.valueOf(mapOooO0OO.size()));
        for (TransferRecord transferRecord : mapOooO0OO.values()) {
            printWriter.printf("bucket: %s, key: %s, status: %s, total size: %d, current: %d\n", transferRecord.f12258OooOO0O, transferRecord.f12259OooOO0o, transferRecord.f12257OooOO0, Long.valueOf(transferRecord.f12253OooO0o), Long.valueOf(transferRecord.f12255OooO0oO));
        }
        printWriter.flush();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Can't bind to TransferService");
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log log = f12277OooO0oO;
        log.OooO0oo("Starting Transfer Service to listen for network connectivity changes.");
        f12278OooO0oo = TransferNetworkLossHandler.OooO0OO(getApplicationContext());
        synchronized (this) {
            if (this.f12279OooO0Oo) {
                try {
                    log.OooO0oo("Registering the network receiver");
                    registerReceiver(f12278OooO0oo, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f12279OooO0Oo = false;
                } catch (IllegalArgumentException unused) {
                    f12277OooO0oO.OooO("Ignoring the exception trying to register the receiver for connectivity change.");
                } catch (IllegalStateException unused2) {
                    f12277OooO0oO.OooO("Ignoring the leak in registering the receiver.");
                }
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        try {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    f12277OooO0oO.OooO0oo("Moving the service out of the Foreground state.");
                    synchronized (this) {
                        stopForeground(this.f12280OooO0o);
                    }
                    super.onDestroy();
                }
                f12277OooO0oO.OooO0oo("De-registering the network receiver.");
                synchronized (this) {
                    if (!this.f12279OooO0Oo) {
                        unregisterReceiver(f12278OooO0oo);
                        this.f12279OooO0Oo = true;
                        f12278OooO0oo = null;
                    }
                    super.onDestroy();
                }
            } catch (IllegalArgumentException unused) {
                f12277OooO0oO.OooO("Exception trying to de-register the network receiver");
            }
        } catch (Exception e) {
            f12277OooO0oO.OooO0o0("Error in moving the service out of the foreground state: " + e);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                synchronized (this) {
                    Notification notification = (Notification) intent.getParcelableExtra("notification");
                    if (notification != null) {
                        this.f12281OooO0o0 = intent.getIntExtra("ongoing-notification-id", this.f12281OooO0o0);
                        this.f12280OooO0o = intent.getBooleanExtra("remove-notification", this.f12280OooO0o);
                        f12277OooO0oO.OooO0oo("Putting the service in Foreground state.");
                        startForeground(this.f12281OooO0o0, notification);
                    } else {
                        f12277OooO0oO.OooO0o0("No notification is passed in the intent. Unable to transition to foreground.");
                    }
                }
            } catch (Exception e) {
                f12277OooO0oO.OooO0o0("Error in moving the service to foreground state: " + e);
            }
            return 1;
        }
        synchronized (this) {
            if (this.f12279OooO0Oo) {
                try {
                    f12277OooO0oO.OooO0oo("Registering the network receiver");
                    registerReceiver(f12278OooO0oo, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f12279OooO0Oo = false;
                } catch (IllegalArgumentException unused) {
                    f12277OooO0oO.OooO("Ignoring the exception trying to register the receiver for connectivity change.");
                } catch (IllegalStateException unused2) {
                    f12277OooO0oO.OooO("Ignoring the leak in registering the receiver.");
                }
            }
            return 1;
        }
    }
}
