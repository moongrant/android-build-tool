package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import p520o0o0O0oo.x6;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00000OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f26832OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f26833OooO0o0;

    public /* synthetic */ o00000OO(Object obj, int i) {
        this.f26832OooO0Oo = i;
        this.f26833OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f26832OooO0Oo;
        Object obj = this.f26833OooO0o0;
        switch (i) {
            case 0:
                ExploreTagRoomListActivity this$0 = (ExploreTagRoomListActivity) obj;
                int i2 = ExploreTagRoomListActivity.f26546OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                LinearLayout linearLayout = this$0.OooOo().f58582OooO0OO.f57813OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llTags.llTagRoot");
                com.code.android.util.o000OO00.OooO0O0(linearLayout);
                break;
            default:
                x6 this$1 = (x6) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                FrameLayout frameLayout = this$1.OooOOo().f58234OooOOoo;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "mBinding.overrideGiftContainer");
                com.code.android.util.o000OO00.OooO0O0(frameLayout);
                break;
        }
    }
}
