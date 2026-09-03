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
import p253o00ooO0O.o000;
import p253o00ooO0O.o0000O;
import p253o00ooO0O.o0000O0O;
import p253o00ooO0O.o0000OO0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzs {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @GuardedBy("MessengerIpcClient.class")
    public static zzs f14109OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f14110OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ScheduledExecutorService f14111OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public o0000O0O f14112OooO0OO = new o0000O0O(this);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("this")
    public int f14113OooO0Oo = 1;

    @VisibleForTesting
    public zzs(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f14111OooO0O0 = scheduledExecutorService;
        this.f14110OooO00o = context.getApplicationContext();
    }

    public static synchronized zzs zzb(Context context) {
        if (f14109OooO0o0 == null) {
            com.google.android.gms.internal.cloudmessaging.zze.zza();
            f14109OooO0o0 = new zzs(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
        }
        return f14109OooO0o0;
    }

    public final synchronized <T> Task<T> OooO00o(o0000OO0<T> o0000oo1) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(o0000oo1);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(strValueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f14112OooO0OO.OooO0Oo(o0000oo1)) {
            o0000O0O o0000o0o2 = new o0000O0O(this);
            this.f14112OooO0OO = o0000o0o2;
            o0000o0o2.OooO0Oo(o0000oo1);
        }
        return o0000oo1.f40233OooO0O0.getTask();
    }

    public final Task<Void> zzc(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.f14113OooO0Oo;
            this.f14113OooO0Oo = i2 + 1;
        }
        return OooO00o(new o0000O(i2, bundle));
    }

    public final Task<Bundle> zzd(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.f14113OooO0Oo;
            this.f14113OooO0Oo = i2 + 1;
        }
        return OooO00o(new o000(i2, bundle));
    }
}
