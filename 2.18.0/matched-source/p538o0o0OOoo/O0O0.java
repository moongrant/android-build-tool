package p538o0o0OOoo;

import android.view.View;
import com.app.base.model.ActivitiesNoticesModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.message.ActivitiesNoticeActivity;
import p393o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class O0O0 implements BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ActivitiesNoticeActivity f43754Oooo;

    public O0O0(ActivitiesNoticeActivity activitiesNoticeActivity) {
        this.f43754Oooo = activitiesNoticeActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ActivitiesNoticesModel activitiesNoticesModel = (ActivitiesNoticesModel) baseQuickAdapter.getData().get(i);
        if (activitiesNoticesModel == null || !OooO0OO.OooO0O0(activitiesNoticesModel.activityurl)) {
            return;
        }
        o0O00000.OooO0o0("Message_activity_details", activitiesNoticesModel.title);
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.ActivityNotice);
        webPageInfo.OooO0Oo(activitiesNoticesModel.activityurl);
        webPageInfo.OooO0OO(activitiesNoticesModel.title);
        webPageInfo.OooO0O0(WebPageInfo.ShareType.INSTANCE.OooO00o(activitiesNoticesModel.isshare), activitiesNoticesModel.imageurl, activitiesNoticesModel.description);
        webPageInfo.OooO00o("type", "1");
        webPageInfo.OooO00o("barId", activitiesNoticesModel.id);
        WebActivity.f22127ooOO.OooO00o(this.f43754Oooo, webPageInfo);
    }
}
