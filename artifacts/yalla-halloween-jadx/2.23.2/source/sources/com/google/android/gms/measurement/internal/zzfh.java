package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import p271o00ooooo.oOo000Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfh {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f15483OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f15484OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f15485OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOo000Oo f15486OooO0Oo;

    public zzfh(oOo000Oo ooo000oo, String str, String str2) {
        this.f15486OooO0Oo = ooo000oo;
        Preconditions.checkNotEmpty(str);
        this.f15483OooO00o = str;
    }

    @WorkerThread
    public final String zza() {
        if (!this.f15484OooO0O0) {
            this.f15484OooO0O0 = true;
            this.f15485OooO0OO = this.f15486OooO0Oo.OooO0Oo().getString(this.f15483OooO00o, null);
        }
        return this.f15485OooO0OO;
    }

    @WorkerThread
    public final void zzb(String str) {
        SharedPreferences.Editor editorEdit = this.f15486OooO0Oo.OooO0Oo().edit();
        editorEdit.putString(this.f15483OooO00o, str);
        editorEdit.apply();
        this.f15485OooO0OO = str;
    }
}
