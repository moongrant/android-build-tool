package com.yalla.yalla.ui.view.tips;

import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AppBarStateChangeListener implements AppBarLayout.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public State f31362OooO00o = State.IDLE;

    public enum State {
        EXPANDED,
        COLLAPSED,
        EXPANDING,
        IDLE
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
    public final void OooO00o(AppBarLayout appBarLayout, int i) {
        if (i == 0) {
            State state = this.f31362OooO00o;
            State state2 = State.EXPANDED;
            if (state != state2) {
                OooO0O0(appBarLayout, state, state2);
            }
            this.f31362OooO00o = state2;
            return;
        }
        if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
            State state3 = this.f31362OooO00o;
            State state4 = State.COLLAPSED;
            if (state3 != state4) {
                OooO0O0(appBarLayout, state3, state4);
            }
            this.f31362OooO00o = state4;
            return;
        }
        State state5 = this.f31362OooO00o;
        State state6 = State.IDLE;
        if (state5 != state6) {
            OooO0O0(appBarLayout, state5, state6);
        }
        this.f31362OooO00o = state6;
    }

    public abstract void OooO0O0(AppBarLayout appBarLayout, State state, State state2);
}
