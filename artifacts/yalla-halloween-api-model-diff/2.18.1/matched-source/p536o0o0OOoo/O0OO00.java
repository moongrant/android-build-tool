package p536o0o0OOoo;

import android.view.View;
import com.app.base.model.ActivitiesNoticesModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.message.ActivitiesNoticeActivity;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class O0OO00 implements BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ActivitiesNoticeActivity f43740OooO0Oo;

    public O0OO00(ActivitiesNoticeActivity activitiesNoticeActivity) {
        this.f43740OooO0Oo = activitiesNoticeActivity;
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
        WebActivity.f22108OoooooO.OooO00o(this.f43740OooO0Oo, webPageInfo);
    }
}
