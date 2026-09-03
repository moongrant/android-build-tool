package com.google.android.material.internal;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo extends androidx.core.view.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f17286OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f17287OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ NavigationMenuPresenter.OooO0O0 f17288OooO0OO;

    public OooOo(NavigationMenuPresenter.OooO0O0 oooO0O0, int i, boolean z) {
        this.f17288OooO0OO = oooO0O0;
        this.f17286OooO00o = i;
        this.f17287OooO0O0 = z;
    }

    @Override // androidx.core.view.OooO00o
    public final void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull o0000O.o0Oo0oo o0oo0oo2) {
        NavigationMenuPresenter navigationMenuPresenter;
        super.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
        int i = this.f17286OooO00o;
        int i2 = 0;
        int i3 = i;
        while (true) {
            navigationMenuPresenter = NavigationMenuPresenter.this;
            if (i2 >= i) {
                break;
            }
            if (navigationMenuPresenter.f17165OooO0oo.getItemViewType(i2) == 2) {
                i3--;
            }
            i2++;
        }
        if (navigationMenuPresenter.f17163OooO0o0.getChildCount() == 0) {
            i3--;
        }
        o0oo0oo2.OooOO0o(o0000O.o0Oo0oo.OooO0o.OooO00o(i3, 1, 1, 1, this.f17287OooO0O0, view.isSelected()));
    }
}
