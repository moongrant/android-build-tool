package p496o0o00o;

import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;
import com.code.android.util.o000000;
import com.code.android.util.o000OO00;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.model.SupportInfo;
import com.yalla.yalla.ui.activity.user.SupportTopActivity;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p362o0OOo0O.OooOO0;
import p543o0oO0O00.OooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSupportTopActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportTopActivity.kt\ncom/yalla/yalla/ui/activity/user/SupportTopActivity$initView$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
public final class o0oOO extends o000O<SupportInfo.UserData> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ SupportTopActivity f49118OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(SupportTopActivity supportTopActivity, int i) {
        super(supportTopActivity, i);
        this.f49118OooOoo0 = supportTopActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        SupportInfo.UserData userData = (SupportInfo.UserData) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (userData == null) {
            return;
        }
        int i = oO00O0oO.ranking;
        AppCompatTextView appCompatTextView = (AppCompatTextView) helper.getView(i);
        if (appCompatTextView != null) {
            appCompatTextView.setText((CharSequence) null);
        }
        int iOooO0o0 = o000000.OooO0o0(userData.getNum());
        if (iOooO0o0 == 1) {
            int i2 = oO00O0oO.ivRanking;
            View view = helper.getView(i2);
            Intrinsics.checkNotNullExpressionValue(view, "helper.getView<AppCompatImageView>(R.id.ivRanking)");
            o000OO00.OooOOOO(view);
            ((AppCompatImageView) helper.getView(i2)).setImageResource(oOo00OO0.user_support_one);
        } else if (iOooO0o0 == 2) {
            int i3 = oO00O0oO.ivRanking;
            View view2 = helper.getView(i3);
            Intrinsics.checkNotNullExpressionValue(view2, "helper.getView<AppCompatImageView>(R.id.ivRanking)");
            o000OO00.OooOOOO(view2);
            ((AppCompatImageView) helper.getView(i3)).setImageResource(oOo00OO0.user_support_two);
        } else if (iOooO0o0 != 3) {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) helper.getView(i);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setText(userData.getNum());
            }
            View view3 = helper.getView(oO00O0oO.ivRanking);
            Intrinsics.checkNotNullExpressionValue(view3, "helper.getView<AppCompatImageView>(R.id.ivRanking)");
            o000OO00.OooO0O0(view3);
        } else {
            int i4 = oO00O0oO.ivRanking;
            View view4 = helper.getView(i4);
            Intrinsics.checkNotNullExpressionValue(view4, "helper.getView<AppCompatImageView>(R.id.ivRanking)");
            o000OO00.OooOOOO(view4);
            ((AppCompatImageView) helper.getView(i4)).setImageResource(oOo00OO0.user_support_three);
        }
        SupportTopActivity supportTopActivity = this.f49118OooOoo0;
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(supportTopActivity);
        oooO00o.OooO00o(OooO.OooO0OO());
        oooO00o.f43911OooO0OO = userData.getUserHeader();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.userHead));
        SVGAView sVGAView = (SVGAView) helper.getView(oO00O0oO.userFrame);
        String userHeaderFrame = userData.getUserHeaderFrame();
        sVGAView.setImageDrawable(null);
        sVGAView.setVisibility(4);
        sVGAView.OooO0oO(false);
        if (!OooOo00.OooO00o(userHeaderFrame) && !"/headframe/0.png".equals(userHeaderFrame)) {
            sVGAView.setVisibility(0);
            sVGAView.f10172OooOooO = 0;
            sVGAView.setImageResource(0);
            sVGAView.OooOO0O(userHeaderFrame, supportTopActivity);
            sVGAView.OooOO0o();
        }
        UserTagView userTagView = (UserTagView) helper.getView(oO00O0oO.userTagView);
        userTagView.OooO0oo(userData.getPremiumLevel(), userData.isPremium());
        userTagView.OooO0Oo(userData.getVipLevel(), true, supportTopActivity);
        userTagView.setSex(userData.getSex());
        userTagView.setName(userData.getUserName());
        AppCompatTextView convert$lambda$0 = (AppCompatTextView) helper.getView(oO00O0oO.isFriend);
        boolean isFriend = userData.getIsFriend();
        Intrinsics.checkNotNullExpressionValue(convert$lambda$0, "convert$lambda$0");
        if (isFriend) {
            o000OO00.OooOOOO(convert$lambda$0);
        } else {
            o000OO00.OooO0O0(convert$lambda$0);
        }
        ((AppCompatTextView) helper.getView(oO00O0oO.coin)).setText(Intrinsics.areEqual(userData.getNumber(), AppEventsConstants.EVENT_PARAM_VALUE_NO) ? "***" : OooOOOO.OooO0Oo(userData.getNumber()));
    }
}
