package p536o0o0OOoo;

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
import p168o00Ooo0.o0O0O00;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p418o0Oo0oo.oo000o;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000000 extends OooO0OO<ActivitiesNoticesModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ActivitiesNoticeActivity f43738OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000000(ActivitiesNoticeActivity activitiesNoticeActivity, Context context) {
        super(context, R.layout.item_activities_);
        this.f43738OooO00o = activitiesNoticeActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        ActivitiesNoticesModel activitiesNoticesModel = (ActivitiesNoticesModel) obj;
        View viewOooO0Oo = oooO0o.OooO0Oo(R.id.activities_icon);
        ViewGroup.LayoutParams layoutParams = viewOooO0Oo.getLayoutParams();
        ActivitiesNoticeActivity activitiesNoticeActivity = this.f43738OooO00o;
        layoutParams.height = ((activitiesNoticeActivity.f22123OoooOoo - oo000o.OooO00o(activitiesNoticeActivity, 40.0d)) * 2) / 5;
        viewOooO0Oo.setLayoutParams(layoutParams);
        if (TextUtils.isEmpty(activitiesNoticesModel.imageurl)) {
            oooO0o.OooO0oO(R.id.activities_icon, true);
        } else {
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o2.OooO0oO(6);
            oooO00o2.f48429OooO0OO = activitiesNoticesModel.imageurl;
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.f48432OooO0o0 = true;
            oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.activities_icon));
            oooO0o.OooO0oO(R.id.activities_icon, true);
        }
        oooO0o.OooOO0(R.id.activities_title, activitiesNoticesModel.title);
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(activitiesNoticesModel.activityurl)) {
            oooO0o.OooOO0(R.id.activities_content, o0O0O00.OooO00o(activitiesNoticesModel.description + ZegoConstants.ZegoVideoDataAuxPublishingStream + this.f43738OooO00o.getString(R.string.View_more), this.f43738OooO00o.getString(R.string.View_more), o000O000.OooO00o.OooO0O0(this.f43738OooO00o, R.color.color_00d8c9)));
        } else {
            oooO0o.OooOO0(R.id.activities_content, activitiesNoticesModel.description);
        }
        long j = activitiesNoticesModel.releasetimep;
        if (j < 1) {
            oooO0o.OooOO0(R.id.activities_time, activitiesNoticesModel.releasetime);
        } else {
            oooO0o.OooOO0(R.id.activities_time, o00O0.f48624OooO00o.OooO0Oo(j, System.currentTimeMillis()));
        }
    }
}
