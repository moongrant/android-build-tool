package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import p271o00ooooo.oOo000Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfc {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f15464OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f15465OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f15466OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f15467OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oOo000Oo f15468OooO0o0;

    public zzfc(oOo000Oo ooo000oo, String str, boolean z) {
        this.f15468OooO0o0 = ooo000oo;
        Preconditions.checkNotEmpty(str);
        this.f15464OooO00o = str;
        this.f15465OooO0O0 = z;
    }

    @WorkerThread
    public final void zza(boolean z) {
        SharedPreferences.Editor editorEdit = this.f15468OooO0o0.OooO0Oo().edit();
        editorEdit.putBoolean(this.f15464OooO00o, z);
        editorEdit.apply();
        this.f15467OooO0Oo = z;
    }

    @WorkerThread
    public final boolean zzb() {
        if (!this.f15466OooO0OO) {
            this.f15466OooO0OO = true;
            this.f15467OooO0Oo = this.f15468OooO0o0.OooO0Oo().getBoolean(this.f15464OooO00o, this.f15465OooO0O0);
        }
        return this.f15467OooO0Oo;
    }
}
