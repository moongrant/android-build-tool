package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import o0OO0OoO.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class zzez {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f16153OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f16154OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f16155OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f16156OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f16157OooO0o0;

    public zzez(o0O0O00 o0o0o00, String str, long j) {
        this.f16157OooO0o0 = o0o0o00;
        Preconditions.checkNotEmpty(str);
        this.f16153OooO00o = str;
        this.f16154OooO0O0 = j;
    }

    @WorkerThread
    public final long zza() {
        if (!this.f16155OooO0OO) {
            this.f16155OooO0OO = true;
            this.f16156OooO0Oo = this.f16157OooO0o0.OooO0o0().getLong(this.f16153OooO00o, this.f16154OooO0O0);
        }
        return this.f16156OooO0Oo;
    }

    @WorkerThread
    public final void zzb(long j) {
        SharedPreferences.Editor editorEdit = this.f16157OooO0o0.OooO0o0().edit();
        editorEdit.putLong(this.f16153OooO00o, j);
        editorEdit.apply();
        this.f16156OooO0Oo = j;
    }
}
