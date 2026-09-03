package com.yalla.yalla.ui.activity.room;

import android.view.KeyEvent;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.view.SwitchView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000O implements p562o0oOo0O.o000oOoO, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f26834OooO0Oo;

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        MemberListRemoveActivity this$0 = (MemberListRemoveActivity) this.f26834OooO0Oo;
        int i = MemberListRemoveActivity.f26562OooOoO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoO(true);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        SwitchView.OooO0O0((SwitchView) this.f26834OooO0Oo, i);
    }
}
