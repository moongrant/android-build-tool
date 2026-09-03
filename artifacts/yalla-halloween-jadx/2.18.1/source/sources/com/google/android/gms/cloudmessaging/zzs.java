package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import p328o0O0ooOO.o0O0o;
import p328o0O0ooOO.o0oOO;
import p328o0O0ooOO.o0oOOo;
import p328o0O0ooOO.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
public final class zzs {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @GuardedBy("MessengerIpcClient.class")
    public static zzs f15086OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f15087OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ScheduledExecutorService f15088OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public o0oOO f15089OooO0OO = new o0oOO(this);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("this")
    public int f15090OooO0Oo = 1;

    @VisibleForTesting
    public zzs(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f15088OooO0O0 = scheduledExecutorService;
        this.f15087OooO00o = context.getApplicationContext();
    }

    public static synchronized zzs zzb(Context context) {
        if (f15086OooO0o0 == null) {
            com.google.android.gms.internal.cloudmessaging.zze.zza();
            f15086OooO0o0 = new zzs(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
        }
        return f15086OooO0o0;
    }

    public final synchronized <T> Task<T> OooO00o(o0oOOo<T> o0oooo2) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(o0oooo2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(strValueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f15089OooO0OO.OooO0Oo(o0oooo2)) {
            o0oOO o0ooo2 = new o0oOO(this);
            this.f15089OooO0OO = o0ooo2;
            o0ooo2.OooO0Oo(o0oooo2);
        }
        return o0oooo2.f37042OooO0O0.getTask();
    }

    public final Task<Void> zzc(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.f15090OooO0Oo;
            this.f15090OooO0Oo = i2 + 1;
        }
        return OooO00o(new oo00oO(i2, bundle));
    }

    public final Task<Bundle> zzd(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.f15090OooO0Oo;
            this.f15090OooO0Oo = i2 + 1;
        }
        return OooO00o(new o0O0o(i2, bundle));
    }
}
