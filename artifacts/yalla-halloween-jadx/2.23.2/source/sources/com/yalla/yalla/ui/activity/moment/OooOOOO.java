package com.yalla.yalla.ui.activity.moment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0000Ooo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends o0000Ooo {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f25779OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(MomentDetailActivity momentDetailActivity, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.f25779OooO0oo = momentDetailActivity;
    }

    @Override // p114o00O00o.OooO0OO
    public final int OooO0OO() {
        return this.f25779OooO0oo.f25614OooOo0o.size();
    }

    @Override // androidx.fragment.app.o0000Ooo
    @NotNull
    public final Fragment OooOOo0(int i) {
        return (Fragment) this.f25779OooO0oo.f25614OooOo0o.get(i);
    }
}
