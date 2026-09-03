package com.amazonaws.mobileconnectors.s3.transferutility;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TransferService extends Service {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final Log f10500Oooo = LogFactory.OooO00o(TransferService.class);

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static TransferNetworkLossHandler f10501OoooO00;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f10502Oooo0o = true;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f10503Oooo0oO = 1;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f10504Oooo0oo = true;

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Map mapUnmodifiableMap;
        if ((getApplicationInfo().flags & 2) == 0) {
            return;
        }
        printWriter.printf("network status: %s\n", Boolean.valueOf(f10501OoooO00.OooO0O0()));
        TransferStatusUpdater transferStatusUpdaterOooO00o = TransferStatusUpdater.OooO00o(this);
        synchronized (transferStatusUpdaterOooO00o) {
            mapUnmodifiableMap = Collections.unmodifiableMap(transferStatusUpdaterOooO00o.f10510OooO00o);
        }
        printWriter.printf("# of active transfers: %d\n", Integer.valueOf(mapUnmodifiableMap.size()));
        for (TransferRecord transferRecord : mapUnmodifiableMap.values()) {
            printWriter.printf("bucket: %s, key: %s, status: %s, total size: %d, current: %d\n", transferRecord.f10480OooOO0O, transferRecord.f10481OooOO0o, transferRecord.f10479OooOO0, Long.valueOf(transferRecord.f10475OooO0o), Long.valueOf(transferRecord.f10477OooO0oO));
        }
        printWriter.flush();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Can't bind to TransferService");
    }

    @Override // android.app.Service
    public final void onCreate() {
        TransferNetworkLossHandler transferNetworkLossHandler;
        super.onCreate();
        Log log = f10500Oooo;
        log.OooO0o("Starting Transfer Service to listen for network connectivity changes.");
        Context applicationContext = getApplicationContext();
        Log log2 = TransferNetworkLossHandler.f10463OooO0Oo;
        synchronized (TransferNetworkLossHandler.class) {
            if (TransferNetworkLossHandler.f10464OooO0o0 == null) {
                TransferNetworkLossHandler.f10464OooO0o0 = new TransferNetworkLossHandler(applicationContext);
            }
            transferNetworkLossHandler = TransferNetworkLossHandler.f10464OooO0o0;
        }
        f10501OoooO00 = transferNetworkLossHandler;
        synchronized (this) {
            if (this.f10502Oooo0o) {
                try {
                    log.OooO0o("Registering the network receiver");
                    registerReceiver(f10501OoooO00, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f10502Oooo0o = false;
                } catch (IllegalArgumentException unused) {
                    f10500Oooo.OooO("Ignoring the exception trying to register the receiver for connectivity change.");
                } catch (IllegalStateException unused2) {
                    f10500Oooo.OooO("Ignoring the leak in registering the receiver.");
                }
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        try {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    f10500Oooo.OooO0o("Moving the service out of the Foreground state.");
                    synchronized (this) {
                        stopForeground(this.f10504Oooo0oo);
                    }
                    super.onDestroy();
                }
                f10500Oooo.OooO0o("De-registering the network receiver.");
                synchronized (this) {
                    if (!this.f10502Oooo0o) {
                        unregisterReceiver(f10501OoooO00);
                        this.f10502Oooo0o = true;
                        f10501OoooO00 = null;
                    }
                    super.onDestroy();
                }
            } catch (IllegalArgumentException unused) {
                f10500Oooo.OooO("Exception trying to de-register the network receiver");
            }
        } catch (Exception e) {
            f10500Oooo.OooOO0("Error in moving the service out of the foreground state: " + e);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                synchronized (this) {
                    Notification notification = (Notification) intent.getParcelableExtra("notification");
                    if (notification != null) {
                        this.f10503Oooo0oO = intent.getIntExtra("ongoing-notification-id", this.f10503Oooo0oO);
                        this.f10504Oooo0oo = intent.getBooleanExtra("remove-notification", this.f10504Oooo0oo);
                        f10500Oooo.OooO0o("Putting the service in Foreground state.");
                        startForeground(this.f10503Oooo0oO, notification);
                    } else {
                        f10500Oooo.OooOO0("No notification is passed in the intent. Unable to transition to foreground.");
                    }
                }
            } catch (Exception e) {
                f10500Oooo.OooOO0("Error in moving the service to foreground state: " + e);
            }
            return 1;
        }
        synchronized (this) {
            if (this.f10502Oooo0o) {
                try {
                    f10500Oooo.OooO0o("Registering the network receiver");
                    registerReceiver(f10501OoooO00, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f10502Oooo0o = false;
                } catch (IllegalArgumentException unused) {
                    f10500Oooo.OooO("Ignoring the exception trying to register the receiver for connectivity change.");
                } catch (IllegalStateException unused2) {
                    f10500Oooo.OooO("Ignoring the leak in registering the receiver.");
                }
            }
            return 1;
        }
    }
}
