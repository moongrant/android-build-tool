package p538o0o0OOoo;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.app.base.model.ActivitiesNoticesModel;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.message.ActivitiesNoticeActivity;
import com.zego.zegoavkit2.ZegoConstants;
import p032OoooO0.o0000OO0;
import p169o00Ooo0.o0O0O00;
import p189o00o00o0.OooO0OO;
import p189o00o00o0.OooO0o;
import p618o0oo0Ooo.oO0O000o;
import p623o0oo0o0o.oo00o;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00 extends OooO0OO<ActivitiesNoticesModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ActivitiesNoticeActivity f43851OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00(ActivitiesNoticeActivity activitiesNoticeActivity, Context context) {
        super(context, R.layout.item_activities_);
        this.f43851OooO00o = activitiesNoticeActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        ActivitiesNoticesModel activitiesNoticesModel = (ActivitiesNoticesModel) obj;
        View viewOooO0Oo = oooO0o.OooO0Oo(R.id.activities_icon);
        ViewGroup.LayoutParams layoutParams = viewOooO0Oo.getLayoutParams();
        ActivitiesNoticeActivity activitiesNoticeActivity = this.f43851OooO00o;
        layoutParams.height = ((activitiesNoticeActivity.f22142OooooO0 - o0000OO0.OooO0O0(activitiesNoticeActivity, 40.0d)) * 2) / 5;
        viewOooO0Oo.setLayoutParams(layoutParams);
        if (TextUtils.isEmpty(activitiesNoticesModel.imageurl)) {
            oooO0o.OooO0oO(R.id.activities_icon, true);
        } else {
            oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this.mContext);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o2.OooO0oO(6);
            oooO00o2.f48447OooO0OO = activitiesNoticesModel.imageurl;
            oooO00o2.f48445OooO00o = 0;
            oooO00o2.f48450OooO0o0 = true;
            oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.activities_icon));
            oooO0o.OooO0oO(R.id.activities_icon, true);
        }
        oooO0o.OooOO0(R.id.activities_title, activitiesNoticesModel.title);
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(activitiesNoticesModel.activityurl)) {
            oooO0o.OooOO0(R.id.activities_content, o0O0O00.OooO00o(activitiesNoticesModel.description + ZegoConstants.ZegoVideoDataAuxPublishingStream + this.f43851OooO00o.getString(R.string.View_more), this.f43851OooO00o.getString(R.string.View_more), o000O000.OooO00o.OooO0O0(this.f43851OooO00o, R.color.color_00d8c9)));
        } else {
            oooO0o.OooOO0(R.id.activities_content, activitiesNoticesModel.description);
        }
        long j = activitiesNoticesModel.releasetimep;
        if (j < 1) {
            oooO0o.OooOO0(R.id.activities_time, activitiesNoticesModel.releasetime);
        } else {
            oooO0o.OooOO0(R.id.activities_time, oo00o.f48643OooO00o.OooO0Oo(j, System.currentTimeMillis()));
        }
    }
}
