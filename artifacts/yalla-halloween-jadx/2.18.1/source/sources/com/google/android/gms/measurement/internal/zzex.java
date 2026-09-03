package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import o0OO0OoO.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class zzex {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f16144OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f16145OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f16146OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f16147OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f16148OooO0o0;

    public zzex(o0O0O00 o0o0o00, String str, boolean z) {
        this.f16148OooO0o0 = o0o0o00;
        Preconditions.checkNotEmpty(str);
        this.f16144OooO00o = str;
        this.f16145OooO0O0 = z;
    }

    @WorkerThread
    public final void zza(boolean z) {
        SharedPreferences.Editor editorEdit = this.f16148OooO0o0.OooO0o0().edit();
        editorEdit.putBoolean(this.f16144OooO00o, z);
        editorEdit.apply();
        this.f16147OooO0Oo = z;
    }

    @WorkerThread
    public final boolean zzb() {
        if (!this.f16146OooO0OO) {
            this.f16146OooO0OO = true;
            this.f16147OooO0Oo = this.f16148OooO0o0.OooO0o0().getBoolean(this.f16144OooO00o, this.f16145OooO0O0);
        }
        return this.f16147OooO0Oo;
    }
}
