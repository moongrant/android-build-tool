package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import kotlin.jvm.internal.LongCompanionObject;
import p271o00ooooo.oOo000Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfg {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f15478OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f15479OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f15480OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f15481OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oOo000Oo f15482OooO0o0;

    public /* synthetic */ zzfg(oOo000Oo ooo000oo, long j) {
        this.f15482OooO0o0 = ooo000oo;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j > 0);
        this.f15478OooO00o = "health_monitor:start";
        this.f15479OooO0O0 = "health_monitor:count";
        this.f15480OooO0OO = "health_monitor:value";
        this.f15481OooO0Oo = j;
    }

    @WorkerThread
    public final void OooO00o() {
        oOo000Oo ooo000oo = this.f15482OooO0o0;
        ooo000oo.zzg();
        long jCurrentTimeMillis = ooo000oo.f40788OooO00o.zzax().currentTimeMillis();
        SharedPreferences.Editor editorEdit = ooo000oo.OooO0Oo().edit();
        editorEdit.remove(this.f15479OooO0O0);
        editorEdit.remove(this.f15480OooO0OO);
        editorEdit.putLong(this.f15478OooO00o, jCurrentTimeMillis);
        editorEdit.apply();
    }

    @WorkerThread
    public final Pair zza() {
        long jAbs;
        oOo000Oo ooo000oo = this.f15482OooO0o0;
        ooo000oo.zzg();
        ooo000oo.zzg();
        long j = ooo000oo.OooO0Oo().getLong(this.f15478OooO00o, 0L);
        if (j == 0) {
            OooO00o();
            jAbs = 0;
        } else {
            jAbs = Math.abs(j - ooo000oo.f40788OooO00o.zzax().currentTimeMillis());
        }
        long j2 = this.f15481OooO0Oo;
        if (jAbs < j2) {
            return null;
        }
        if (jAbs > j2 + j2) {
            OooO00o();
            return null;
        }
        String string = ooo000oo.OooO0Oo().getString(this.f15480OooO0OO, null);
        long j3 = ooo000oo.OooO0Oo().getLong(this.f15479OooO0O0, 0L);
        OooO00o();
        return (string == null || j3 <= 0) ? oOo000Oo.f40763OooOo : new Pair(string, Long.valueOf(j3));
    }

    @WorkerThread
    public final void zzb(String str, long j) {
        oOo000Oo ooo000oo = this.f15482OooO0o0;
        ooo000oo.zzg();
        if (ooo000oo.OooO0Oo().getLong(this.f15478OooO00o, 0L) == 0) {
            OooO00o();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferencesOooO0Oo = ooo000oo.OooO0Oo();
        String str2 = this.f15479OooO0O0;
        long j2 = sharedPreferencesOooO0Oo.getLong(str2, 0L);
        String str3 = this.f15480OooO0OO;
        if (j2 <= 0) {
            SharedPreferences.Editor editorEdit = ooo000oo.OooO0Oo().edit();
            editorEdit.putString(str3, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = ooo000oo.f40788OooO00o.zzv().OooO0oo().nextLong() & LongCompanionObject.MAX_VALUE;
        long j3 = j2 + 1;
        long j4 = LongCompanionObject.MAX_VALUE / j3;
        SharedPreferences.Editor editorEdit2 = ooo000oo.OooO0Oo().edit();
        if (jNextLong < j4) {
            editorEdit2.putString(str3, str);
        }
        editorEdit2.putLong(str2, j3);
        editorEdit2.apply();
    }
}
