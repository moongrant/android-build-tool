package com.google.android.material.bottomappbar;

import androidx.annotation.NonNull;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends FloatingActionButton.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f16569OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f16570OooO0O0;

    public class OooO00o extends FloatingActionButton.OooO00o {
        public OooO00o() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OooO00o
        public final void OooO0O0() {
            BottomAppBar bottomAppBar = OooO0O0.this.f16570OooO0O0;
            int i = BottomAppBar.f16535o0000OO0;
            Objects.requireNonNull(bottomAppBar);
        }
    }

    public OooO0O0(BottomAppBar bottomAppBar, int i) {
        this.f16570OooO0O0 = bottomAppBar;
        this.f16569OooO00o = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OooO00o
    public final void OooO00o(@NonNull FloatingActionButton floatingActionButton) {
        BottomAppBar bottomAppBar = this.f16570OooO0O0;
        int i = this.f16569OooO00o;
        int i2 = BottomAppBar.f16535o0000OO0;
        floatingActionButton.setTranslationX(bottomAppBar.Oooo00O(i));
        floatingActionButton.OooOOOO(new OooO00o(), true);
    }
}
