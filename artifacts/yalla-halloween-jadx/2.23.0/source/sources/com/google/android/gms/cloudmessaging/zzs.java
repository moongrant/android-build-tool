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
import p251o00ooO0O.o0000;
import p251o00ooO0O.o00000OO;
import p251o00ooO0O.o0000O00;
import p251o00ooO0O.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzs {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @GuardedBy("MessengerIpcClient.class")
    public static zzs f14585OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f14586OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ScheduledExecutorService f14587OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("this")
    public o00000OO f14588OooO0OO = new o00000OO(this);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("this")
    public int f14589OooO0Oo = 1;

    @VisibleForTesting
    public zzs(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f14587OooO0O0 = scheduledExecutorService;
        this.f14586OooO00o = context.getApplicationContext();
    }

    public static synchronized zzs zzb(Context context) {
        if (f14585OooO0o0 == null) {
            com.google.android.gms.internal.cloudmessaging.zze.zza();
            f14585OooO0o0 = new zzs(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
        }
        return f14585OooO0o0;
    }

    public final synchronized <T> Task<T> OooO00o(o0000O00<T> o0000o00) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(o0000o00);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(strValueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f14588OooO0OO.OooO0Oo(o0000o00)) {
            o00000OO o00000oo2 = new o00000OO(this);
            this.f14588OooO0OO = o00000oo2;
            o00000oo2.OooO0Oo(o0000o00);
        }
        return o0000o00.f40906OooO0O0.getTask();
    }

    public final Task<Void> zzc(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.f14589OooO0Oo;
            this.f14589OooO0Oo = i2 + 1;
        }
        return OooO00o(new o0000(i2, bundle));
    }

    public final Task<Bundle> zzd(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.f14589OooO0Oo;
            this.f14589OooO0Oo = i2 + 1;
        }
        return OooO00o(new o0000oo(i2, bundle));
    }
}
