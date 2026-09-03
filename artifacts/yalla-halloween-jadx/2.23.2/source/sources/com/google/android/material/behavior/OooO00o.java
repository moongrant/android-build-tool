package com.google.android.material.behavior;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.snackbar.OooO;
import java.util.WeakHashMap;
import o0000O.o00000;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements o00000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f15877OooO0Oo;

    public OooO00o(SwipeDismissBehavior swipeDismissBehavior) {
        this.f15877OooO0Oo = swipeDismissBehavior;
    }

    @Override // o0000O.o00000
    public final boolean perform(@NonNull View view, @Nullable o00000.OooO00o oooO00o) {
        SwipeDismissBehavior swipeDismissBehavior = this.f15877OooO0Oo;
        boolean z = false;
        if (!swipeDismissBehavior.OooOo00(view)) {
            return false;
        }
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        boolean z2 = ViewCompat.OooO.OooO0Oo(view) == 1;
        int i = swipeDismissBehavior.f15884OooO0o0;
        if ((i == 0 && z2) || (i == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.OooO0O0 oooO0O0 = swipeDismissBehavior.f15880OooO0O0;
        if (oooO0O0 != null) {
            ((OooO) oooO0O0).OooO00o(view);
        }
        return true;
    }
}
