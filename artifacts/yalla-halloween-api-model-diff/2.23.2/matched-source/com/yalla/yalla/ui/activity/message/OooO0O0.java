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
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends p571o0oOoO0.o0000oo<ActivitiesNoticesModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ActivitiesNoticeActivity f25211OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(ActivitiesNoticeActivity activitiesNoticeActivity, Context context, int i) {
        super(context, i);
        this.f25211OooOoo0 = activitiesNoticeActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        ActivitiesNoticesModel activitiesNoticesModel = (ActivitiesNoticesModel) obj;
        int i = p562o0oOo000.o0OO00O.activities_icon;
        View view = viewHolder.getView(i);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ActivitiesNoticeActivity activitiesNoticeActivity = this.f25211OooOoo0;
        layoutParams.height = ((activitiesNoticeActivity.f25160OooOOoo - o0OO0.OooO0o.OooO0O0(activitiesNoticeActivity, 40.0d)) * 2) / 5;
        view.setLayoutParams(layoutParams);
        if (TextUtils.isEmpty(activitiesNoticesModel.imageurl)) {
            viewHolder.setGone(i, true);
        } else {
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f13186OooOOOo);
            oooO00o.OooO00o(d1.OooO0Oo());
            oooO00o.OooO0o0(6);
            oooO00o.f43126OooO0OO = activitiesNoticesModel.imageurl;
            oooO00o.f43124OooO00o = 0;
            oooO00o.f43129OooO0o0 = true;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(i));
            viewHolder.setGone(i, true);
        }
        viewHolder.setText(p562o0oOo000.o0OO00O.activities_title, activitiesNoticesModel.title);
        if (com.code.android.util.OooOo00.OooO0O0(activitiesNoticesModel.activityurl)) {
            StringBuilder sb = new StringBuilder();
            sb.append(activitiesNoticesModel.description);
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            int i2 = p562o0oOo000.o000000.View_more;
            sb.append(activitiesNoticeActivity.getString(i2));
            String string = sb.toString();
            String string2 = activitiesNoticeActivity.getString(i2);
            int i3 = p562o0oOo000.o0OOO0o.color_00d8c9;
            Object obj2 = ContextCompat.f5281OooO00o;
            viewHolder.setText(p562o0oOo000.o0OO00O.activities_content, p605o0oo0O0O.o0O0O0Oo.OooO00o(ContextCompat.OooO0o.OooO00o(activitiesNoticeActivity, i3), string, string2));
        } else {
            viewHolder.setText(p562o0oOo000.o0OO00O.activities_content, activitiesNoticesModel.description);
        }
        long j = activitiesNoticesModel.releasetimep;
        if (j < 1) {
            viewHolder.setText(p562o0oOo000.o0OO00O.activities_time, activitiesNoticesModel.releasetime);
        } else {
            viewHolder.setText(p562o0oOo000.o0OO00O.activities_time, p606o0oo0O0o.o0O0O0o0.OooO0Oo(j, System.currentTimeMillis()));
        }
    }
}
