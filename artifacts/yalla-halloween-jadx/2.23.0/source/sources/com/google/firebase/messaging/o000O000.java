package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long f20351OooO00o = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f20352OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("WakeLockHolder.syncObject")
    public static WakeLock f20353OooO0OO;

    public static void OooO00o(@NonNull Intent intent) {
        synchronized (f20352OooO0O0) {
            if (f20353OooO0OO != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                f20353OooO0OO.release();
            }
        }
    }

    public static ComponentName OooO0O0(@NonNull Context context, @NonNull Intent intent) {
        synchronized (f20352OooO0O0) {
            if (f20353OooO0OO == null) {
                WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                f20353OooO0OO = wakeLock;
                wakeLock.setReferenceCounted(true);
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!booleanExtra) {
                f20353OooO0OO.acquire(f20351OooO00o);
            }
            return componentNameStartService;
        }
    }
}
