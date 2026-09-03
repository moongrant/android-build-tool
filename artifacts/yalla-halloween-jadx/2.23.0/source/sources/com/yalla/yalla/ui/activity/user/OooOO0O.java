package com.yalla.yalla.ui.activity.user;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.user.UserHeaderFrameModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends o000O<UserHeaderFrameModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameActivity f27129OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(UserHeaderFrameActivity userHeaderFrameActivity, int i) {
        super(userHeaderFrameActivity, i);
        this.f27129OooOoo0 = userHeaderFrameActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        UserHeaderFrameModel model = (UserHeaderFrameModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(model, "model");
        TextView tvContentUnLock = (TextView) helper.getView(oO00O0oO.tvContentUnLock);
        TextView tvContentLock = (TextView) helper.getView(oO00O0oO.tvContentLock);
        RelativeLayout layout = (RelativeLayout) helper.getView(oO00O0oO.layout);
        TextView textView = (TextView) helper.getView(oO00O0oO.tvName);
        View viewBottom = helper.getView(oO00O0oO.viewBottom);
        SVGAView sVGAView = (SVGAView) helper.getView(oO00O0oO.ivSvga);
        Intrinsics.checkNotNullExpressionValue(tvContentUnLock, "tvContentUnLock");
        o000OO00.OooO0O0(tvContentUnLock);
        Intrinsics.checkNotNullExpressionValue(tvContentLock, "tvContentLock");
        o000OO00.OooO0O0(tvContentLock);
        Intrinsics.checkNotNullExpressionValue(viewBottom, "viewBottom");
        o000OO00.OooO0O0(viewBottom);
        Intrinsics.checkNotNullExpressionValue(layout, "layout");
        o000OO00.OooO0O0(layout);
        int localTypeModel = model.getLocalTypeModel();
        if (localTypeModel != 0 && localTypeModel != 1) {
            if (localTypeModel == 2) {
                o000OO00.OooOOOO(tvContentUnLock);
                return;
            } else if (localTypeModel == 3) {
                o000OO00.OooOOOO(tvContentLock);
                return;
            } else {
                if (localTypeModel != 4) {
                    return;
                }
                o000OO00.OooOOOO(viewBottom);
                return;
            }
        }
        o000OO00.OooOOOO(layout);
        layout.setBackground(null);
        if (model.getLocalIsSelect()) {
            layout.setBackgroundResource(oOo00OO0.bg_round_bg_transparent_stroke_green_r12);
        }
        textView.setVisibility(4);
        if (model.getIsweared() == 1) {
            textView.setVisibility(0);
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
        sVGAView.f10172OooOooO = 0;
        sVGAView.setImageResource(0);
        sVGAView.OooOO0O(pic, this.f27129OooOoo0);
        sVGAView.OooOO0o();
    }
}
