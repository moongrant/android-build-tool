package p506o0o00oOo;

import android.content.Context;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.model.VisitorModel;
import com.yalla.yalla.ui.activity.user.VisitorActivity;
import com.yalla.yalla.ui.activity.user.o00Ooo;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p368o0OOo0Oo.Oooo000;
import p403o0Oo0OO.OooO0OO;
import p412o0Oo0o0O.o000O000;
import p562o0oOo000.o0OO00O;
import p571o0oOoO0.o0000oo;
import p606o0oo0O0o.o0O0O0o0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 extends o0000oo<VisitorModel.Visitor> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ VisitorActivity f50413OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(VisitorActivity visitorActivity, Context context, int i) {
        super(context, i);
        this.f50413OooOoo0 = visitorActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        VisitorModel.Visitor visitor = (VisitorModel.Visitor) obj;
        if (visitor == null) {
            return;
        }
        viewHolder.itemView.setOnClickListener(new o00Ooo(this, visitor));
        viewHolder.setGone(o0OO00O.iv_point, AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(visitor.isnew));
        viewHolder.setGone(o0OO00O.iv_official, visitor.isOfficialRole());
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f13186OooOOOo);
        oooO00o.OooO00o(d1.OooO00o());
        oooO00o.f43126OooO0OO = OooO0OO.OooO00o(visitor.getUserHeader());
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) viewHolder.getView(o0OO00O.niv_header));
        UserTagView userTagView = (UserTagView) viewHolder.getView(o0OO00O.visitorUserTagView);
        userTagView.setName(o000O000.OooO0O0(visitor.getUserId(), visitor.getUserName()));
        userTagView.OooO0oo(visitor.getPremiumLevel(), visitor.isPremium());
        userTagView.setSex(visitor.getSex());
        int vipLevel = visitor.getVipLevel();
        VisitorActivity visitorActivity = this.f50413OooOoo0;
        visitorActivity.getClass();
        userTagView.OooO0Oo(vipLevel, true, visitorActivity);
        viewHolder.setText(o0OO00O.tv_bio, visitor.getBio() == null ? "" : visitor.getBio());
        viewHolder.setText(o0OO00O.tv_time, o0O0O0o0.OooO0Oo(visitor.vtime, System.currentTimeMillis()));
    }
}
