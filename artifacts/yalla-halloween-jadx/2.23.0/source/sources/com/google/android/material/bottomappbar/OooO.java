package com.google.android.material.bottomappbar;

import androidx.annotation.NonNull;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends FloatingActionButton.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f16407OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f16408OooO0O0;

    public class OooO00o extends FloatingActionButton.OooO00o {
        public OooO00o() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OooO00o
        public final void OooO0O0() {
            BottomAppBar bottomAppBar = OooO.this.f16408OooO0O0;
            int i = BottomAppBar.f16366o0ooOOo;
            bottomAppBar.getClass();
        }
    }

    public OooO(BottomAppBar bottomAppBar, int i) {
        this.f16408OooO0O0 = bottomAppBar;
        this.f16407OooO00o = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OooO00o
    public final void OooO00o(@NonNull FloatingActionButton floatingActionButton) {
        int i = BottomAppBar.f16366o0ooOOo;
        floatingActionButton.setTranslationX(this.f16408OooO0O0.OooOoo0(this.f16407OooO00o));
        floatingActionButton.OooOOO0(new OooO00o(), true);
    }
}
