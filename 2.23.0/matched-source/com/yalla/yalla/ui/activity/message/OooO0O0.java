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
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends p564o0oOo0OO.o000O<ActivitiesNoticesModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ActivitiesNoticeActivity f25666OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(ActivitiesNoticeActivity activitiesNoticeActivity, Context context, int i) {
        super(context, i);
        this.f25666OooOoo0 = activitiesNoticeActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        ActivitiesNoticesModel activitiesNoticesModel = (ActivitiesNoticesModel) obj;
        int i = oO00O0oO.activities_icon;
        View view = viewHolder.getView(i);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ActivitiesNoticeActivity activitiesNoticeActivity = this.f25666OooOoo0;
        layoutParams.height = ((activitiesNoticeActivity.f25615OooOOoo - com.android.billingclient.api.o0Oo0oo.OooO00o(activitiesNoticeActivity, 40.0d)) * 2) / 5;
        view.setLayoutParams(layoutParams);
        if (TextUtils.isEmpty(activitiesNoticesModel.imageurl)) {
            viewHolder.setGone(i, true);
        } else {
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f10108OooOOOo);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
            oooO00o.OooO0o0(6);
            oooO00o.f43911OooO0OO = activitiesNoticesModel.imageurl;
            oooO00o.f43909OooO00o = 0;
            oooO00o.f43914OooO0o0 = true;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(i));
            viewHolder.setGone(i, true);
        }
        viewHolder.setText(oO00O0oO.activities_title, activitiesNoticesModel.title);
        if (com.code.android.util.OooOo00.OooO0O0(activitiesNoticesModel.activityurl)) {
            StringBuilder sb = new StringBuilder();
            sb.append(activitiesNoticesModel.description);
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            int i2 = oO00OOo0.View_more;
            sb.append(activitiesNoticeActivity.getString(i2));
            String string = sb.toString();
            String string2 = activitiesNoticeActivity.getString(i2);
            int i3 = oO00O0o.color_00d8c9;
            Object obj2 = ContextCompat.f5271OooO00o;
            viewHolder.setText(oO00O0oO.activities_content, p590o0oo0.OooOOOO.OooO00o(ContextCompat.OooO0o.OooO00o(activitiesNoticeActivity, i3), string, string2));
        } else {
            viewHolder.setText(oO00O0oO.activities_content, activitiesNoticesModel.description);
        }
        long j = activitiesNoticesModel.releasetimep;
        if (j < 1) {
            viewHolder.setText(oO00O0oO.activities_time, activitiesNoticesModel.releasetime);
        } else {
            viewHolder.setText(oO00O0oO.activities_time, p601o0oo0O0.o0000oo.OooO0Oo(j, System.currentTimeMillis()));
        }
    }
}
