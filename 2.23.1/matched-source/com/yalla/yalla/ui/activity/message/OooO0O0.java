package com.yalla.yalla.ui.activity.message;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.ActivitiesNoticesModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.zego.zegoavkit2.ZegoConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends p570o0oOo0o.o000O0<ActivitiesNoticesModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ActivitiesNoticeActivity f25212OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(ActivitiesNoticeActivity activitiesNoticeActivity, Context context, int i) {
        super(context, i);
        this.f25212OooOoo0 = activitiesNoticeActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        ActivitiesNoticesModel activitiesNoticesModel = (ActivitiesNoticesModel) obj;
        int i = p565o0oOo000.o0Oo0oo.activities_icon;
        View view = viewHolder.getView(i);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ActivitiesNoticeActivity activitiesNoticeActivity = this.f25212OooOoo0;
        layoutParams.height = ((activitiesNoticeActivity.f25161OooOOoo - o0OO0.OooO0o.OooO0O0(activitiesNoticeActivity, 40.0d)) * 2) / 5;
        view.setLayoutParams(layoutParams);
        if (TextUtils.isEmpty(activitiesNoticesModel.imageurl)) {
            viewHolder.setGone(i, true);
        } else {
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f13197OooOOOo);
            oooO00o.OooO00o(p645o0ooOOO0.o0O0O0Oo.OooO0Oo());
            oooO00o.OooO0o0(6);
            oooO00o.f43127OooO0OO = activitiesNoticesModel.imageurl;
            oooO00o.f43125OooO00o = 0;
            oooO00o.f43130OooO0o0 = true;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(i));
            viewHolder.setGone(i, true);
        }
        viewHolder.setText(p565o0oOo000.o0Oo0oo.activities_title, activitiesNoticesModel.title);
        if (com.code.android.util.OooOo00.OooO0O0(activitiesNoticesModel.activityurl)) {
            StringBuilder sb = new StringBuilder();
            sb.append(activitiesNoticesModel.description);
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            int i2 = p565o0oOo000.o000OOo.View_more;
            sb.append(activitiesNoticeActivity.getString(i2));
            String string = sb.toString();
            String string2 = activitiesNoticeActivity.getString(i2);
            int i3 = p565o0oOo000.o0ooOOo.color_00d8c9;
            Object obj2 = ContextCompat.f5284OooO00o;
            viewHolder.setText(p565o0oOo000.o0Oo0oo.activities_content, p595o0oo0.OooOo00.OooO00o(ContextCompat.OooO0o.OooO00o(activitiesNoticeActivity, i3), string, string2));
        } else {
            viewHolder.setText(p565o0oOo000.o0Oo0oo.activities_content, activitiesNoticesModel.description);
        }
        long j = activitiesNoticesModel.releasetimep;
        if (j < 1) {
            viewHolder.setText(p565o0oOo000.o0Oo0oo.activities_time, activitiesNoticesModel.releasetime);
        } else {
            viewHolder.setText(p565o0oOo000.o0Oo0oo.activities_time, p606o0oo0O0.OooOOOO.OooO0Oo(j, System.currentTimeMillis()));
        }
    }
}
