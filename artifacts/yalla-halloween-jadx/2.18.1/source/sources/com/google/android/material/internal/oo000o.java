package com.google.android.material.internal;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements o00Ooo.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ boolean f17366OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f17367OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ boolean f17368OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00Ooo.OooO0OO f17369OooO0Oo;

    public oo000o(boolean z, boolean z2, boolean z3, o00Ooo.OooO0OO oooO0OO) {
        this.f17366OooO00o = z;
        this.f17367OooO0O0 = z2;
        this.f17368OooO0OO = z3;
        this.f17369OooO0Oo = oooO0OO;
    }

    @Override // com.google.android.material.internal.o00Ooo.OooO0OO
    @NonNull
    public final WindowInsetsCompat OooO00o(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull o00Ooo.OooO0o oooO0o) {
        if (this.f17366OooO00o) {
            oooO0o.f17364OooO0Oo = windowInsetsCompat.OooO0o() + oooO0o.f17364OooO0Oo;
        }
        boolean zOooO0o = o00Ooo.OooO0o(view);
        if (this.f17367OooO0O0) {
            if (zOooO0o) {
                oooO0o.f17363OooO0OO = windowInsetsCompat.OooO0oO() + oooO0o.f17363OooO0OO;
            } else {
                oooO0o.f17361OooO00o = windowInsetsCompat.OooO0oO() + oooO0o.f17361OooO00o;
            }
        }
        if (this.f17368OooO0OO) {
            if (zOooO0o) {
                oooO0o.f17361OooO00o = windowInsetsCompat.OooO0oo() + oooO0o.f17361OooO00o;
            } else {
                oooO0o.f17363OooO0OO = windowInsetsCompat.OooO0oo() + oooO0o.f17363OooO0OO;
            }
        }
        oooO0o.OooO00o(view);
        o00Ooo.OooO0OO oooO0OO = this.f17369OooO0Oo;
        return oooO0OO != null ? oooO0OO.OooO00o(view, windowInsetsCompat, oooO0o) : windowInsetsCompat;
    }
}
