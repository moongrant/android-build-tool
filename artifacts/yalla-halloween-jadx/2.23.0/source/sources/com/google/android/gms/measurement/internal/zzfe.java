package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import p269o00ooooo.o0OOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfe {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f15949OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f15950OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f15951OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f15952OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOO0 f15953OooO0o0;

    public zzfe(o0OOO0 o0ooo1, String str, long j) {
        this.f15953OooO0o0 = o0ooo1;
        Preconditions.checkNotEmpty(str);
        this.f15949OooO00o = str;
        this.f15950OooO0O0 = j;
    }

    @WorkerThread
    public final long zza() {
        if (!this.f15951OooO0OO) {
            this.f15951OooO0OO = true;
            this.f15952OooO0Oo = this.f15953OooO0o0.OooO0Oo().getLong(this.f15949OooO00o, this.f15950OooO0O0);
        }
        return this.f15952OooO0Oo;
    }

    @WorkerThread
    public final void zzb(long j) {
        SharedPreferences.Editor editorEdit = this.f15953OooO0o0.OooO0Oo().edit();
        editorEdit.putLong(this.f15949OooO00o, j);
        editorEdit.apply();
        this.f15952OooO0Oo = j;
    }
}
