package com.facebook;

import com.facebook.internal.FeatureManager;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import kotlin.jvm.internal.Intrinsics;
import p331o0OO0o0.o000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0 implements FeatureManager.Callback, androidx.activity.result.OooO00o, p562o0oOo0O.o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f10572OooO0Oo;

    public /* synthetic */ OooOO0(Object obj) {
        this.f10572OooO0Oo = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        MainRoomRecommendFragment.initView$lambda$1((MainRoomRecommendFragment) this.f10572OooO0Oo);
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        o000OOo this$0 = (o000OOo) this.f10572OooO0Oo;
        int i = o000OOo.f43179OooOO0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO0o0();
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        FacebookException.m4036_init_$lambda0((String) this.f10572OooO0Oo, z);
    }
}
