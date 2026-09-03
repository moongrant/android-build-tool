package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.ActivitiesNoticesModel;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o implements BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ActivitiesNoticeActivity f25213OooO0Oo;

    public OooO0o(ActivitiesNoticeActivity activitiesNoticeActivity) {
        this.f25213OooO0Oo = activitiesNoticeActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ActivitiesNoticesModel activitiesNoticesModel = (ActivitiesNoticesModel) baseQuickAdapter.f13189OooOOoo.get(i);
        if (activitiesNoticesModel == null || !com.code.android.util.OooOo00.OooO0O0(activitiesNoticesModel.activityurl)) {
            return;
        }
        HashMap map = new HashMap();
        map.put("activeid", activitiesNoticesModel.id);
        o0oo0000.OooO00o.OooO0OO("204005", map);
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.ActivityNotice);
        webPageInfo.OooO0o0(activitiesNoticesModel.activityurl);
        webPageInfo.OooO0Oo(activitiesNoticesModel.title);
        WebPageInfo.ShareType.Companion companion = WebPageInfo.ShareType.INSTANCE;
        int i2 = activitiesNoticesModel.isshare;
        companion.getClass();
        webPageInfo.OooO0OO(WebPageInfo.ShareType.Companion.OooO00o(i2), activitiesNoticesModel.imageurl, activitiesNoticesModel.description);
        webPageInfo.OooO00o("type", "1");
        webPageInfo.OooO00o("barId", activitiesNoticesModel.id);
        int i3 = WebActivity.f25130OooOoO0;
        WebActivity.OooO00o.OooO00o(this.f25213OooO0Oo, webPageInfo);
    }
}
