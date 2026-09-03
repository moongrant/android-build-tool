package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import o0OO0OoO.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfb {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public final String f16158OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f16159OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f16160OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f16161OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f16162OooO0o0;

    public /* synthetic */ zzfb(o0O0O00 o0o0o00, long j) {
        this.f16162OooO0o0 = o0o0o00;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j > 0);
        this.f16158OooO00o = "health_monitor:start";
        this.f16159OooO0O0 = "health_monitor:count";
        this.f16160OooO0OO = "health_monitor:value";
        this.f16161OooO0Oo = j;
    }

    @WorkerThread
    public final void OooO00o() {
        this.f16162OooO0o0.zzg();
        long jCurrentTimeMillis = this.f16162OooO0o0.f37615OooO00o.zzav().currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.f16162OooO0o0.OooO0o0().edit();
        editorEdit.remove(this.f16159OooO0O0);
        editorEdit.remove(this.f16160OooO0OO);
        editorEdit.putLong(this.f16158OooO00o, jCurrentTimeMillis);
        editorEdit.apply();
    }

    @WorkerThread
    public final Pair zza() {
        long jAbs;
        this.f16162OooO0o0.zzg();
        this.f16162OooO0o0.zzg();
        long j = this.f16162OooO0o0.OooO0o0().getLong(this.f16158OooO00o, 0L);
        if (j == 0) {
            OooO00o();
            jAbs = 0;
        } else {
            jAbs = Math.abs(j - this.f16162OooO0o0.f37615OooO00o.zzav().currentTimeMillis());
        }
        long j2 = this.f16161OooO0Oo;
        if (jAbs < j2) {
            return null;
        }
        if (jAbs > j2 + j2) {
            OooO00o();
            return null;
        }
        String string = this.f16162OooO0o0.OooO0o0().getString(this.f16160OooO0OO, null);
        long j3 = this.f16162OooO0o0.OooO0o0().getLong(this.f16159OooO0O0, 0L);
        OooO00o();
        return (string == null || j3 <= 0) ? o0O0O00.f37762OooOo0o : new Pair(string, Long.valueOf(j3));
    }

    @WorkerThread
    public final void zzb(String str, long j) {
        this.f16162OooO0o0.zzg();
        if (this.f16162OooO0o0.OooO0o0().getLong(this.f16158OooO00o, 0L) == 0) {
            OooO00o();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f16162OooO0o0.OooO0o0().getLong(this.f16159OooO0O0, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor editorEdit = this.f16162OooO0o0.OooO0o0().edit();
            editorEdit.putString(this.f16160OooO0OO, str);
            editorEdit.putLong(this.f16159OooO0O0, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = this.f16162OooO0o0.f37615OooO00o.zzv().OooO().nextLong();
        long j3 = j2 + 1;
        long j4 = Long.MAX_VALUE / j3;
        SharedPreferences.Editor editorEdit2 = this.f16162OooO0o0.OooO0o0().edit();
        if ((jNextLong & Long.MAX_VALUE) < j4) {
            editorEdit2.putString(this.f16160OooO0OO, str);
        }
        editorEdit2.putLong(this.f16159OooO0O0, j3);
        editorEdit2.apply();
    }
}
