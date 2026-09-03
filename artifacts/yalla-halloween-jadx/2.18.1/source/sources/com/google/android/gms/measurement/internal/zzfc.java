package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import o0OO0OoO.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfc {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f16163OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f16164OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f16165OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f16166OooO0Oo;

    public zzfc(o0O0O00 o0o0o00, String str, String str2) {
        this.f16166OooO0Oo = o0o0o00;
        Preconditions.checkNotEmpty(str);
        this.f16163OooO00o = str;
    }

    @WorkerThread
    public final String zza() {
        if (!this.f16164OooO0O0) {
            this.f16164OooO0O0 = true;
            this.f16165OooO0OO = this.f16166OooO0Oo.OooO0o0().getString(this.f16163OooO00o, null);
        }
        return this.f16165OooO0OO;
    }

    @WorkerThread
    public final void zzb(String str) {
        SharedPreferences.Editor editorEdit = this.f16166OooO0Oo.OooO0o0().edit();
        editorEdit.putString(this.f16163OooO00o, str);
        editorEdit.apply();
        this.f16165OooO0OO = str;
    }
}
