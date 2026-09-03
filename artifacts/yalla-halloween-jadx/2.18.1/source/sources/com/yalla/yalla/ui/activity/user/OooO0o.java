package com.yalla.yalla.ui.activity.user;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.app.base.model.UserHeaderFrameModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.ui.view.SVGAView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends p188o00o00o0.OooO0OO<UserHeaderFrameModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameActivity f23349OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(UserHeaderFrameActivity userHeaderFrameActivity) {
        super(userHeaderFrameActivity, R.layout.item_user_header_frame);
        this.f23349OooO00o = userHeaderFrameActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        UserHeaderFrameModel model = (UserHeaderFrameModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(model, "model");
        TextView tvContentUnLock = (TextView) helper.OooO0Oo(R.id.tvContentUnLock);
        TextView tvContentLock = (TextView) helper.OooO0Oo(R.id.tvContentLock);
        RelativeLayout layout = (RelativeLayout) helper.OooO0Oo(R.id.layout);
        TextView textView = (TextView) helper.OooO0Oo(R.id.tvName);
        View viewBottom = helper.OooO0Oo(R.id.viewBottom);
        SVGAView sVGAView = (SVGAView) helper.OooO0Oo(R.id.ivSvga);
        Intrinsics.checkNotNullExpressionValue(tvContentUnLock, "tvContentUnLock");
        o00O0O.OooO00o(tvContentUnLock);
        Intrinsics.checkNotNullExpressionValue(tvContentLock, "tvContentLock");
        o00O0O.OooO00o(tvContentLock);
        Intrinsics.checkNotNullExpressionValue(viewBottom, "viewBottom");
        o00O0O.OooO00o(viewBottom);
        Intrinsics.checkNotNullExpressionValue(layout, "layout");
        o00O0O.OooO00o(layout);
        int localTypeModel = model.getLocalTypeModel();
        if (localTypeModel != 0 && localTypeModel != 1) {
            if (localTypeModel == 2) {
                o00O0O.OooO(tvContentUnLock);
                return;
            } else if (localTypeModel == 3) {
                o00O0O.OooO(tvContentLock);
                return;
            } else {
                if (localTypeModel != 4) {
                    return;
                }
                o00O0O.OooO(viewBottom);
                return;
            }
        }
        o00O0O.OooO(layout);
        layout.setBackground(null);
        if (model.getLocalIsSelect()) {
            layout.setBackgroundResource(R.drawable.bg_round_bg_transparent_stroke_green_r12);
        }
        textView.setVisibility(4);
        if (model.getIsweared() == 1) {
            textView.setVisibility(0);
        }
        sVGAView.setVisibility(4);
        UserHeaderFrameActivity userHeaderFrameActivity = this.f23349OooO00o;
        boolean z = model.getLocalTypeModel() == 1;
        String pic = model.getPic();
        sVGAView.setImageDrawable(null);
        sVGAView.setVisibility(4);
        sVGAView.OooO0o0(false);
        if (com.yalla.support.common.util.OooO0OO.OooO00o(pic)) {
            return;
        }
        if (z && "/headframe/0.png".equals(pic)) {
            return;
        }
        sVGAView.setVisibility(0);
        sVGAView.f21010OooooO0 = 0;
        sVGAView.OooO0oo(pic, userHeaderFrameActivity);
        sVGAView.OooO();
    }
}
