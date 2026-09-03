package p566o0oOo00O;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.chad.library.adapter.base.OooO00o;
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.SupportInfo;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.ui.activity.user.SupportTopActivity;
import kotlin.jvm.internal.Intrinsics;
import p168o00Ooo0.o0O0O00;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000Oo0;
import p254o00ooO0O.oOO00O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O0O extends OooO0OO<SupportInfo.UserData> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SupportTopActivity f45261OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0O(SupportTopActivity supportTopActivity) {
        super(supportTopActivity, R.layout.user_activity_support_top_item);
        this.f45261OooO00o = supportTopActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        SupportInfo.UserData userData = (SupportInfo.UserData) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (userData == null) {
            return;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) helper.OooO0Oo(R.id.ranking);
        if (appCompatTextView != null) {
            appCompatTextView.setText((CharSequence) null);
        }
        int iOooO0OO = o000Oo0.OooO0OO(userData.getNum(), 0);
        if (iOooO0OO == 1) {
            View viewOooO0Oo = helper.OooO0Oo(R.id.ivRanking);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "helper.getView<AppCompatImageView>(R.id.ivRanking)");
            oOO00O.OooO(viewOooO0Oo);
            ((AppCompatImageView) helper.OooO0Oo(R.id.ivRanking)).setImageResource(R.drawable.user_support_one);
        } else if (iOooO0OO == 2) {
            View viewOooO0Oo2 = helper.OooO0Oo(R.id.ivRanking);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo2, "helper.getView<AppCompatImageView>(R.id.ivRanking)");
            oOO00O.OooO(viewOooO0Oo2);
            ((AppCompatImageView) helper.OooO0Oo(R.id.ivRanking)).setImageResource(R.drawable.user_support_two);
        } else if (iOooO0OO != 3) {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) helper.OooO0Oo(R.id.ranking);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setText(userData.getNum());
            }
            View viewOooO0Oo3 = helper.OooO0Oo(R.id.ivRanking);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo3, "helper.getView<AppCompatImageView>(R.id.ivRanking)");
            oOO00O.OooO00o(viewOooO0Oo3);
        } else {
            View viewOooO0Oo4 = helper.OooO0Oo(R.id.ivRanking);
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo4, "helper.getView<AppCompatImageView>(R.id.ivRanking)");
            oOO00O.OooO(viewOooO0Oo4);
            ((AppCompatImageView) helper.OooO0Oo(R.id.ivRanking)).setImageResource(R.drawable.user_support_three);
        }
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f45261OooO00o);
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.f48429OooO0OO = userData.getUserHeader();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.userHead));
        SVGAView sVGAView = (SVGAView) helper.OooO0Oo(R.id.userFrame);
        SupportTopActivity supportTopActivity = this.f45261OooO00o;
        String userHeaderFrame = userData.getUserHeaderFrame();
        sVGAView.setImageDrawable(null);
        sVGAView.setVisibility(4);
        sVGAView.OooO0o0(false);
        if (!com.yalla.support.common.util.OooO0OO.OooO00o(userHeaderFrame) && !"/headframe/0.png".equals(userHeaderFrame)) {
            sVGAView.setVisibility(0);
            sVGAView.f21010OooooO0 = 0;
            sVGAView.OooO0oo(userHeaderFrame, supportTopActivity);
            sVGAView.OooO();
        }
        UserTagView userTagView = (UserTagView) helper.OooO0Oo(R.id.userTagView);
        userTagView.OooO0oO(userData.isPremium(), userData.getPremiumLevel());
        userTagView.setKaVip(userData.getVipLevel());
        userTagView.setSex(userData.getSex());
        userTagView.setName(userData.getUserName());
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) helper.OooO0Oo(R.id.isFriend);
        boolean isFriend = userData.getIsFriend();
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        if (isFriend) {
            oOO00O.OooO(appCompatTextView3);
        } else {
            oOO00O.OooO00o(appCompatTextView3);
        }
        ((AppCompatTextView) helper.OooO0Oo(R.id.coin)).setText(Intrinsics.areEqual(userData.getNumber(), AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "***" : o0O0O00.OooO0Oo(userData.getNumber()));
    }
}
