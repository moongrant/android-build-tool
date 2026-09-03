package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import kotlin.jvm.internal.LongCompanionObject;
import p269o00ooooo.o0OOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfg {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f15954OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f15955OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f15956OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f15957OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOO0 f15958OooO0o0;

    public /* synthetic */ zzfg(o0OOO0 o0ooo1, long j) {
        this.f15958OooO0o0 = o0ooo1;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j > 0);
        this.f15954OooO00o = "health_monitor:start";
        this.f15955OooO0O0 = "health_monitor:count";
        this.f15956OooO0OO = "health_monitor:value";
        this.f15957OooO0Oo = j;
    }

    @WorkerThread
    public final void OooO00o() {
        o0OOO0 o0ooo1 = this.f15958OooO0o0;
        o0ooo1.zzg();
        long jCurrentTimeMillis = o0ooo1.f41276OooO00o.zzax().currentTimeMillis();
        SharedPreferences.Editor editorEdit = o0ooo1.OooO0Oo().edit();
        editorEdit.remove(this.f15955OooO0O0);
        editorEdit.remove(this.f15956OooO0OO);
        editorEdit.putLong(this.f15954OooO00o, jCurrentTimeMillis);
        editorEdit.apply();
    }

    @WorkerThread
    public final Pair zza() {
        long jAbs;
        o0OOO0 o0ooo1 = this.f15958OooO0o0;
        o0ooo1.zzg();
        o0ooo1.zzg();
        long j = o0ooo1.OooO0Oo().getLong(this.f15954OooO00o, 0L);
        if (j == 0) {
            OooO00o();
            jAbs = 0;
        } else {
            jAbs = Math.abs(j - o0ooo1.f41276OooO00o.zzax().currentTimeMillis());
        }
        long j2 = this.f15957OooO0Oo;
        if (jAbs < j2) {
            return null;
        }
        if (jAbs > j2 + j2) {
            OooO00o();
            return null;
        }
        String string = o0ooo1.OooO0Oo().getString(this.f15956OooO0OO, null);
        long j3 = o0ooo1.OooO0Oo().getLong(this.f15955OooO0O0, 0L);
        OooO00o();
        return (string == null || j3 <= 0) ? o0OOO0.f41207OooOo : new Pair(string, Long.valueOf(j3));
    }

    @WorkerThread
    public final void zzb(String str, long j) {
        o0OOO0 o0ooo1 = this.f15958OooO0o0;
        o0ooo1.zzg();
        if (o0ooo1.OooO0Oo().getLong(this.f15954OooO00o, 0L) == 0) {
            OooO00o();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferencesOooO0Oo = o0ooo1.OooO0Oo();
        String str2 = this.f15955OooO0O0;
        long j2 = sharedPreferencesOooO0Oo.getLong(str2, 0L);
        String str3 = this.f15956OooO0OO;
        if (j2 <= 0) {
            SharedPreferences.Editor editorEdit = o0ooo1.OooO0Oo().edit();
            editorEdit.putString(str3, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = o0ooo1.f41276OooO00o.zzv().OooO0oo().nextLong() & LongCompanionObject.MAX_VALUE;
        long j3 = j2 + 1;
        long j4 = LongCompanionObject.MAX_VALUE / j3;
        SharedPreferences.Editor editorEdit2 = o0ooo1.OooO0Oo().edit();
        if (jNextLong < j4) {
            editorEdit2.putString(str3, str);
        }
        editorEdit2.putLong(str2, j3);
        editorEdit2.apply();
    }
}
