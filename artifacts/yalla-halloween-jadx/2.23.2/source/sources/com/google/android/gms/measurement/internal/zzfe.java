package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import p271o00ooooo.oOo000Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfe {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f15473OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f15474OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f15475OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f15476OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oOo000Oo f15477OooO0o0;

    public zzfe(oOo000Oo ooo000oo, String str, long j) {
        this.f15477OooO0o0 = ooo000oo;
        Preconditions.checkNotEmpty(str);
        this.f15473OooO00o = str;
        this.f15474OooO0O0 = j;
    }

    @WorkerThread
    public final long zza() {
        if (!this.f15475OooO0OO) {
            this.f15475OooO0OO = true;
            this.f15476OooO0Oo = this.f15477OooO0o0.OooO0Oo().getLong(this.f15473OooO00o, this.f15474OooO0O0);
        }
        return this.f15476OooO0Oo;
    }

    @WorkerThread
    public final void zzb(long j) {
        SharedPreferences.Editor editorEdit = this.f15477OooO0o0.OooO0Oo().edit();
        editorEdit.putLong(this.f15473OooO00o, j);
        editorEdit.apply();
        this.f15476OooO0Oo = j;
    }
}
