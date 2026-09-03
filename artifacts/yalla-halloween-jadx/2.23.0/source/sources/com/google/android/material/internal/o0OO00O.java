package com.google.android.material.internal;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000O0Oo;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O implements oo0o0Oo.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f17323OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f17324OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f17325OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo.OooO0O0 f17326OooO0oO;

    public o0OO00O(boolean z, boolean z2, boolean z3, BottomAppBar.OooO0OO oooO0OO) {
        this.f17323OooO0Oo = z;
        this.f17325OooO0o0 = z2;
        this.f17324OooO0o = z3;
        this.f17326OooO0oO = oooO0OO;
    }

    @Override // com.google.android.material.internal.oo0o0Oo.OooO0O0
    @NonNull
    public final WindowInsetsCompat OooO0O0(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull oo0o0Oo.OooO0OO oooO0OO) {
        if (this.f17323OooO0Oo) {
            oooO0OO.f17339OooO0Oo = windowInsetsCompat.OooO0OO() + oooO0OO.f17339OooO0Oo;
        }
        boolean zOooO0o = oo0o0Oo.OooO0o(view);
        if (this.f17325OooO0o0) {
            if (zOooO0o) {
                oooO0OO.f17338OooO0OO = windowInsetsCompat.OooO0Oo() + oooO0OO.f17338OooO0OO;
            } else {
                oooO0OO.f17336OooO00o = windowInsetsCompat.OooO0Oo() + oooO0OO.f17336OooO00o;
            }
        }
        if (this.f17324OooO0o) {
            if (zOooO0o) {
                oooO0OO.f17336OooO00o = windowInsetsCompat.OooO0o0() + oooO0OO.f17336OooO00o;
            } else {
                oooO0OO.f17338OooO0OO = windowInsetsCompat.OooO0o0() + oooO0OO.f17338OooO0OO;
            }
        }
        int i = oooO0OO.f17336OooO00o;
        int i2 = oooO0OO.f17337OooO0O0;
        int i3 = oooO0OO.f17338OooO0OO;
        int i4 = oooO0OO.f17339OooO0Oo;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooO.OooOO0O(view, i, i2, i3, i4);
        oo0o0Oo.OooO0O0 oooO0O0 = this.f17326OooO0oO;
        return oooO0O0 != null ? oooO0O0.OooO0O0(view, windowInsetsCompat, oooO0OO) : windowInsetsCompat;
    }
}
