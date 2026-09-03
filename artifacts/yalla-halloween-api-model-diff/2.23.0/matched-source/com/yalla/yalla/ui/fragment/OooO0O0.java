package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.view.View;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import kotlin.jvm.internal.Intrinsics;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f28224OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f28225OooO0o0;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f28224OooO0Oo = i;
        this.f28225OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f28224OooO0Oo;
        Object obj = this.f28225OooO0o0;
        switch (i) {
            case 0:
                BadgeFragment.showPopupWindow$lambda$4((BadgeFragment) obj, view);
                break;
            default:
                TopicInfoHeadView this$0 = (TopicInfoHeadView) obj;
                int i2 = TopicInfoHeadView.f30775OooO0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Context context = this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(context);
                o0oo00o2.OooOoO(com.code.android.util.o0000.OooO0OO(oO00OOo0.topic_info_dialog_title));
                o0oo00o2.OooOo00(com.code.android.util.o0000.OooO0OO(oO00OOo0.topic_info_dialog_content));
                o0oo00o2.OooOo0(new TopicInfoHeadView.OooO0O0(o0oo00o2));
                o0oo00o2.OooOO0o();
                break;
        }
    }
}
