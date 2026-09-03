package p566o0oOo00O;

import android.content.Context;
import android.widget.ImageView;
import com.app.base.model.VisitorModel;
import com.chad.library.adapter.base.OooO00o;
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.ui.activity.user.Oooo000;
import com.yalla.yalla.ui.activity.user.VisitorActivity;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p520o0o0O0O0.o00O0O;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000o00 extends OooO0OO<VisitorModel.Visitor> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ VisitorActivity f45370OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000o00(VisitorActivity visitorActivity, Context context) {
        super(context, R.layout.item_visitor);
        this.f45370OooO00o = visitorActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        VisitorModel.Visitor visitor = (VisitorModel.Visitor) obj;
        if (visitor == null) {
            return;
        }
        oooO0o.itemView.setOnClickListener(new Oooo000(this, visitor));
        oooO0o.OooO0oO(R.id.iv_point, AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(visitor.isnew));
        oooO0o.OooO0oO(R.id.iv_official, visitor.isOfficialRole());
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(visitor.getUserHeader(), OooOo00.OooO00o(80), true);
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.niv_header));
        UserTagView userTagView = (UserTagView) oooO0o.OooO0Oo(R.id.visitorUserTagView);
        userTagView.setName(o00O0O.f42677OooO00o.OooO0O0(visitor.getUserId(), visitor.getUserName()));
        userTagView.OooO0oO(visitor.isPremium(), visitor.getPremiumLevel());
        userTagView.setSex(visitor.getSex());
        userTagView.setKaVip(visitor.getVipLevel());
        oooO0o.OooOO0(R.id.tv_bio, visitor.getBio() == null ? "" : visitor.getBio());
        oooO0o.OooOO0(R.id.tv_time, o00O0.f48624OooO00o.OooO0Oo(visitor.vtime, System.currentTimeMillis()));
    }
}
