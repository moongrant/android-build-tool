package com.yalla.yalla.ui.activity.user;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
import com.yalla.yalla.model.user.UserHeaderFrameModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends o0000oo<UserHeaderFrameModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameActivity f26662OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(UserHeaderFrameActivity userHeaderFrameActivity, int i) {
        super(userHeaderFrameActivity, i);
        this.f26662OooOoo0 = userHeaderFrameActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        UserHeaderFrameModel model = (UserHeaderFrameModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(model, "model");
        TextView textView = (TextView) helper.getView(o0OO00O.tvContentUnLock);
        TextView textView2 = (TextView) helper.getView(o0OO00O.tvContentLock);
        RelativeLayout relativeLayout = (RelativeLayout) helper.getView(o0OO00O.layout);
        TextView textView3 = (TextView) helper.getView(o0OO00O.tvName);
        View view = helper.getView(o0OO00O.viewBottom);
        SVGAView sVGAView = (SVGAView) helper.getView(o0OO00O.ivSvga);
        Intrinsics.checkNotNull(textView);
        o000O.OooO0O0(textView);
        Intrinsics.checkNotNull(textView2);
        o000O.OooO0O0(textView2);
        Intrinsics.checkNotNull(view);
        o000O.OooO0O0(view);
        Intrinsics.checkNotNull(relativeLayout);
        o000O.OooO0O0(relativeLayout);
        int localTypeModel = model.getLocalTypeModel();
        if (localTypeModel != 0 && localTypeModel != 1) {
            if (localTypeModel == 2) {
                o000O.OooOOOO(textView);
                return;
            } else if (localTypeModel == 3) {
                o000O.OooOOOO(textView2);
                return;
            } else {
                if (localTypeModel != 4) {
                    return;
                }
                o000O.OooOOOO(view);
                return;
            }
        }
        o000O.OooOOOO(relativeLayout);
        relativeLayout.setBackground(null);
        if (model.getLocalIsSelect()) {
            relativeLayout.setBackgroundResource(o0Oo0oo.bg_round_bg_transparent_stroke_green_r12);
        }
        textView3.setVisibility(4);
        if (model.getIsweared() == 1) {
            textView3.setVisibility(0);
        }
        sVGAView.setVisibility(4);
        boolean z = model.getLocalTypeModel() == 1;
        String pic = model.getPic();
        sVGAView.setImageDrawable(null);
        sVGAView.setVisibility(4);
        sVGAView.OooO0oO(false);
        if (com.code.android.util.OooOo00.OooO00o(pic)) {
            return;
        }
        if (z && "/headframe/0.png".equals(pic)) {
            return;
        }
        sVGAView.setVisibility(0);
        sVGAView.f13232OooOooO = 0;
        sVGAView.setImageResource(0);
        sVGAView.OooOO0O(pic, this.f26662OooOoo0);
        sVGAView.OooOO0o();
    }
}
