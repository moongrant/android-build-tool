package com.yalla.yalla.ui.activity.moment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00000OO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends o00000OO {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f26228OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(MomentDetailActivity momentDetailActivity, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.f26228OooO0oo = momentDetailActivity;
    }

    @Override // p082o000OoOo.OooOO0O
    public final int OooO0OO() {
        return this.f26228OooO0oo.f26063OooOo0o.size();
    }

    @Override // androidx.fragment.app.o00000OO
    @NotNull
    public final Fragment OooOOo0(int i) {
        return (Fragment) this.f26228OooO0oo.f26063OooOo0o.get(i);
    }
}
