package p506o0o00oOo;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;
import com.code.android.util.o000000;
import com.code.android.util.o000O;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.model.SupportInfo;
import com.yalla.yalla.ui.activity.user.SupportTopActivity;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;
import p605o0oo0O0O.o0O0O0Oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSupportTopActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportTopActivity.kt\ncom/yalla/yalla/ui/activity/user/SupportTopActivity$initView$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
public final class oO0O00 extends o0000oo<SupportInfo.UserData> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ SupportTopActivity f50472OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00(SupportTopActivity supportTopActivity, int i) {
        super(supportTopActivity, i);
        this.f50472OooOoo0 = supportTopActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        SupportInfo.UserData userData = (SupportInfo.UserData) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (userData == null) {
            return;
        }
        int i = o0OO00O.ranking;
        AppCompatTextView appCompatTextView = (AppCompatTextView) helper.getView(i);
        if (appCompatTextView != null) {
            appCompatTextView.setText((CharSequence) null);
        }
        int iOooO0o0 = o000000.OooO0o0(userData.getNum());
        if (iOooO0o0 == 1) {
            int i2 = o0OO00O.ivRanking;
            View view = helper.getView(i2);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            o000O.OooOOOO(view);
            ((AppCompatImageView) helper.getView(i2)).setImageResource(o0Oo0oo.user_support_one);
        } else if (iOooO0o0 == 2) {
            int i3 = o0OO00O.ivRanking;
            View view2 = helper.getView(i3);
            Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
            o000O.OooOOOO(view2);
            ((AppCompatImageView) helper.getView(i3)).setImageResource(o0Oo0oo.user_support_two);
        } else if (iOooO0o0 != 3) {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) helper.getView(i);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setText(userData.getNum());
            }
            View view3 = helper.getView(o0OO00O.ivRanking);
            Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
            o000O.OooO0O0(view3);
        } else {
            int i4 = o0OO00O.ivRanking;
            View view4 = helper.getView(i4);
            Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
            o000O.OooOOOO(view4);
            ((AppCompatImageView) helper.getView(i4)).setImageResource(o0Oo0oo.user_support_three);
        }
        SupportTopActivity supportTopActivity = this.f50472OooOoo0;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(supportTopActivity);
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.f43126OooO0OO = userData.getUserHeader();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(o0OO00O.userHead));
        SVGAView sVGAView = (SVGAView) helper.getView(o0OO00O.userFrame);
        String userHeaderFrame = userData.getUserHeaderFrame();
        sVGAView.setImageDrawable(null);
        sVGAView.setVisibility(4);
        sVGAView.OooO0oO(false);
        if (!OooOo00.OooO00o(userHeaderFrame) && !"/headframe/0.png".equals(userHeaderFrame)) {
            sVGAView.setVisibility(0);
            sVGAView.f13232OooOooO = 0;
            sVGAView.setImageResource(0);
            sVGAView.OooOO0O(userHeaderFrame, supportTopActivity);
            sVGAView.OooOO0o();
        }
        UserTagView userTagView = (UserTagView) helper.getView(o0OO00O.userTagView);
        userTagView.OooO0oo(userData.getPremiumLevel(), userData.isPremium());
        userTagView.OooO0Oo(userData.getVipLevel(), true, supportTopActivity);
        userTagView.setSex(userData.getSex());
        userTagView.setName(userData.getUserName());
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) helper.getView(o0OO00O.isFriend);
        boolean isFriend = userData.getIsFriend();
        Intrinsics.checkNotNull(appCompatTextView3);
        if (isFriend) {
            o000O.OooOOOO(appCompatTextView3);
        } else {
            o000O.OooO0O0(appCompatTextView3);
        }
        ((AppCompatTextView) helper.getView(o0OO00O.coin)).setText(Intrinsics.areEqual(userData.getNumber(), AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "***" : o0O0O0Oo.OooO0Oo(userData.getNumber()));
    }
}
