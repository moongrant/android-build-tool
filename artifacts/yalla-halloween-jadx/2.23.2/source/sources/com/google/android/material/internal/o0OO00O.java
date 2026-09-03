package com.google.android.material.internal;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O implements oo0o0Oo.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ boolean f16850OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f16851OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ boolean f16852OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo.OooO0O0 f16853OooO0Oo;

    public o0OO00O(boolean z, boolean z2, boolean z3, BottomAppBar.OooO0OO oooO0OO) {
        this.f16850OooO00o = z;
        this.f16851OooO0O0 = z2;
        this.f16852OooO0OO = z3;
        this.f16853OooO0Oo = oooO0OO;
    }

    @Override // com.google.android.material.internal.oo0o0Oo.OooO0O0
    @NonNull
    public final WindowInsetsCompat OooO00o(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull oo0o0Oo.OooO0OO oooO0OO) {
        if (this.f16850OooO00o) {
            oooO0OO.f16866OooO0Oo = windowInsetsCompat.OooO0OO() + oooO0OO.f16866OooO0Oo;
        }
        boolean zOooO0o = oo0o0Oo.OooO0o(view);
        if (this.f16851OooO0O0) {
            if (zOooO0o) {
                oooO0OO.f16865OooO0OO = windowInsetsCompat.OooO0Oo() + oooO0OO.f16865OooO0OO;
            } else {
                oooO0OO.f16863OooO00o = windowInsetsCompat.OooO0Oo() + oooO0OO.f16863OooO00o;
            }
        }
        if (this.f16852OooO0OO) {
            if (zOooO0o) {
                oooO0OO.f16863OooO00o = windowInsetsCompat.OooO0o0() + oooO0OO.f16863OooO00o;
            } else {
                oooO0OO.f16865OooO0OO = windowInsetsCompat.OooO0o0() + oooO0OO.f16865OooO0OO;
            }
        }
        int i = oooO0OO.f16863OooO00o;
        int i2 = oooO0OO.f16864OooO0O0;
        int i3 = oooO0OO.f16865OooO0OO;
        int i4 = oooO0OO.f16866OooO0Oo;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooO.OooOO0O(view, i, i2, i3, i4);
        oo0o0Oo.OooO0O0 oooO0O0 = this.f16853OooO0Oo;
        return oooO0O0 != null ? oooO0O0.OooO00o(view, windowInsetsCompat, oooO0OO) : windowInsetsCompat;
    }
}
