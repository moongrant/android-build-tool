package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import p269o00ooooo.o0OOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfc {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f15940OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f15941OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f15942OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f15943OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOO0 f15944OooO0o0;

    public zzfc(o0OOO0 o0ooo1, String str, boolean z) {
        this.f15944OooO0o0 = o0ooo1;
        Preconditions.checkNotEmpty(str);
        this.f15940OooO00o = str;
        this.f15941OooO0O0 = z;
    }

    @WorkerThread
    public final void zza(boolean z) {
        SharedPreferences.Editor editorEdit = this.f15944OooO0o0.OooO0Oo().edit();
        editorEdit.putBoolean(this.f15940OooO00o, z);
        editorEdit.apply();
        this.f15943OooO0Oo = z;
    }

    @WorkerThread
    public final boolean zzb() {
        if (!this.f15942OooO0OO) {
            this.f15942OooO0OO = true;
            this.f15943OooO0Oo = this.f15944OooO0o0.OooO0Oo().getBoolean(this.f15940OooO00o, this.f15941OooO0O0);
        }
        return this.f15943OooO0Oo;
    }
}
