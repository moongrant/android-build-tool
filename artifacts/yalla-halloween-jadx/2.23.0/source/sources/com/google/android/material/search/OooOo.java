package com.google.android.material.search;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.oo0o0Oo;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import p466o0Oooo0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo implements oo0o0Oo.OooO0O0, oOO00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f17500OooO0Oo;

    public /* synthetic */ OooOo(Object obj) {
        this.f17500OooO0Oo = obj;
    }

    @Override // p466o0Oooo0o.oOO00O
    public final void OooO00o() {
        ((UserInfoLeftFragment) this.f17500OooO0Oo).lambda$showAddPowerSeeroomFriend$6();
    }

    @Override // com.google.android.material.internal.oo0o0Oo.OooO0O0
    public final WindowInsetsCompat OooO0O0(View view, WindowInsetsCompat windowInsetsCompat, oo0o0Oo.OooO0OO oooO0OO) {
        MaterialToolbar materialToolbar = ((SearchView) this.f17500OooO0Oo).f17532OooOO0;
        boolean zOooO0o = oo0o0Oo.OooO0o(materialToolbar);
        materialToolbar.setPadding(windowInsetsCompat.OooO0Oo() + (zOooO0o ? oooO0OO.f17338OooO0OO : oooO0OO.f17336OooO00o), oooO0OO.f17337OooO0O0, windowInsetsCompat.OooO0o0() + (zOooO0o ? oooO0OO.f17336OooO00o : oooO0OO.f17338OooO0OO), oooO0OO.f17339OooO0Oo);
        return windowInsetsCompat;
    }
}
