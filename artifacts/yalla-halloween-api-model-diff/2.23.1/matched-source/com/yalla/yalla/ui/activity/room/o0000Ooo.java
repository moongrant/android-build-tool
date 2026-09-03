package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000Ooo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f26389OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f26390OooO0o0;

    public /* synthetic */ o0000Ooo(int i, View.OnClickListener onClickListener) {
        this.f26389OooO0Oo = i;
        this.f26390OooO0o0 = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f26389OooO0Oo;
        View.OnClickListener onClickListener = this.f26390OooO0o0;
        switch (i) {
            case 0:
                ExploreTagRoomListActivity this$0 = (ExploreTagRoomListActivity) onClickListener;
                int i2 = ExploreTagRoomListActivity.f26096OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                LinearLayout llTagRoot = this$0.OooOo().f44748OooO0OO.f44783OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(llTagRoot, "llTagRoot");
                com.code.android.util.o000O.OooO0O0(llTagRoot);
                break;
            default:
                p675oO0Oo.o0O00O this$1 = (p675oO0Oo.o0O00O) onClickListener;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooO0O0();
                break;
        }
    }
}
