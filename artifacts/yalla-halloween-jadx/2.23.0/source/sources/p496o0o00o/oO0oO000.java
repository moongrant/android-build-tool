package p496o0o00o;

import android.content.Context;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.model.VisitorModel;
import com.yalla.yalla.ui.activity.user.VisitorActivity;
import com.yalla.yalla.ui.activity.user.o00Ooo;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p362o0OOo0O.OooOO0;
import p396o0Oo0O.OooOOO;
import p406o0Oo0Ooo.oOO0O0O;
import p543o0oO0O00.OooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0oO000 extends o000O<VisitorModel.Visitor> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ VisitorActivity f49177OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0oO000(VisitorActivity visitorActivity, Context context, int i) {
        super(context, i);
        this.f49177OooOoo0 = visitorActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        VisitorModel.Visitor visitor = (VisitorModel.Visitor) obj;
        if (visitor == null) {
            return;
        }
        viewHolder.itemView.setOnClickListener(new o00Ooo(this, visitor));
        viewHolder.setGone(oO00O0oO.iv_point, AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(visitor.isnew));
        viewHolder.setGone(oO00O0oO.iv_official, visitor.isOfficialRole());
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f10108OooOOOo);
        oooO00o.OooO00o(OooO.OooO00o());
        oooO00o.f43911OooO0OO = OooOOO.OooO00o(visitor.getUserHeader());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.niv_header));
        UserTagView userTagView = (UserTagView) viewHolder.getView(oO00O0oO.visitorUserTagView);
        userTagView.setName(oOO0O0O.OooO0O0(visitor.getUserId(), visitor.getUserName()));
        userTagView.OooO0oo(visitor.getPremiumLevel(), visitor.isPremium());
        userTagView.setSex(visitor.getSex());
        int vipLevel = visitor.getVipLevel();
        VisitorActivity visitorActivity = this.f49177OooOoo0;
        visitorActivity.getClass();
        userTagView.OooO0Oo(vipLevel, true, visitorActivity);
        viewHolder.setText(oO00O0oO.tv_bio, visitor.getBio() == null ? "" : visitor.getBio());
        viewHolder.setText(oO00O0oO.tv_time, o0000oo.OooO0Oo(visitor.vtime, System.currentTimeMillis()));
    }
}
