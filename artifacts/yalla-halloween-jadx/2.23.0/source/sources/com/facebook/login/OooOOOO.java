package com.facebook.login;

import androidx.activity.result.ActivityResult;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import kotlin.jvm.functions.Function1;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOOO implements androidx.activity.result.OooO00o, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f10703OooO0Oo;

    public /* synthetic */ OooOOOO(Object obj) {
        this.f10703OooO0Oo = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        MainExploreFragment.initView$lambda$1$lambda$0((MainExploreFragment) this.f10703OooO0Oo);
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        LoginFragment.m4172onCreate$lambda1((Function1) this.f10703OooO0Oo, (ActivityResult) obj);
    }
}
