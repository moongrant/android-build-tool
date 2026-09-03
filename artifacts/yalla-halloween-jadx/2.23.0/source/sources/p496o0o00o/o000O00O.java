package p496o0o00o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.BadgePersonal;
import com.yalla.yalla.ui.activity.user.BadgeRankActivity;
import kotlin.jvm.internal.Intrinsics;
import p362o0OOo0O.OooOO0;
import p464o0Oooo.o000000O;
import p543o0oO0O00.OooO;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.db;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00O implements Observer<BadgePersonal> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BadgeRankActivity f48987OooO0Oo;

    public o000O00O(BadgeRankActivity badgeRankActivity) {
        this.f48987OooO0Oo = badgeRankActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(BadgePersonal badgePersonal) {
        String strValueOf;
        int i;
        int i2;
        BadgePersonal badgePersonal2 = badgePersonal;
        BadgeRankActivity badgeRankActivity = this.f48987OooO0Oo;
        if (badgePersonal2 == null) {
            int i3 = BadgeRankActivity.f27087OooOo;
            ConstraintLayout constraintLayout = badgeRankActivity.OooOo().f59410OooO0o0.f57766OooOO0o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.ilBottom.userBadgeItemRoot");
            o000OO00.OooO0O0(constraintLayout);
            return;
        }
        int i4 = BadgeRankActivity.f27087OooOo;
        ConstraintLayout constraintLayout2 = badgeRankActivity.OooOo().f59410OooO0o0.f57766OooOO0o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.ilBottom.userBadgeItemRoot");
        o000OO00.OooOOOO(constraintLayout2);
        db dbVar = badgeRankActivity.OooOo().f59410OooO0o0;
        dbVar.f57766OooOO0o.setBackgroundColor(-1);
        int rank = badgePersonal2.getRank();
        AppCompatImageView ivUserMark = dbVar.f57759OooO0Oo;
        AppCompatImageView ivRank = dbVar.f57757OooO0O0;
        AppCompatTextView tvRank = dbVar.f57761OooO0o0;
        if (rank > 3 || badgePersonal2.getRank() == 0) {
            Intrinsics.checkNotNullExpressionValue(tvRank, "tvRank");
            o000OO00.OooOOOO(tvRank);
            if (badgePersonal2.getRank() == 0) {
                strValueOf = badgePersonal2.getSumStars() > 0 ? "50+" : "-";
            } else {
                strValueOf = String.valueOf(badgePersonal2.getRank());
            }
            tvRank.setText(strValueOf);
            Intrinsics.checkNotNullExpressionValue(ivUserMark, "ivUserMark");
            o000OO00.OooO0OO(ivUserMark);
            Intrinsics.checkNotNullExpressionValue(ivRank, "ivRank");
            o000OO00.OooO0O0(ivRank);
        } else {
            int rank2 = badgePersonal2.getRank();
            if (rank2 != 1) {
                i = rank2 != 2 ? oOo00OO0.user_support_three : oOo00OO0.user_support_two;
            } else {
                i = oOo00OO0.user_support_one;
            }
            ivRank.setImageResource(i);
            Intrinsics.checkNotNullExpressionValue(ivRank, "ivRank");
            o000OO00.OooOOOO(ivRank);
            int rank3 = badgePersonal2.getRank();
            if (rank3 == 1) {
                i2 = oOo00OO0.user_badge_item_rank_first;
            } else if (rank3 != 2) {
                i2 = rank3 != 3 ? oOo00OO0.user_badge_item_rank_first : oOo00OO0.user_badge_item_rank_third;
            } else {
                i2 = oOo00OO0.user_badge_item_rank_second;
            }
            ivUserMark.setImageResource(i2);
            Intrinsics.checkNotNullExpressionValue(ivUserMark, "ivUserMark");
            o000OO00.OooOOOO(ivUserMark);
            Intrinsics.checkNotNullExpressionValue(tvRank, "tvRank");
            o000OO00.OooO0O0(tvRank);
        }
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(badgeRankActivity);
        oooO00o.OooO00o(OooO.OooO00o());
        o000000O o000000o2 = o000000O.f46674OooO00o;
        oooO00o.f43911OooO0OO = String.valueOf(o000000O.OooO().getValue());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0O0(1, o0000.OooO00o(oO00O0o.color_e2e2e2));
        oooO00o.OooO0Oo(dbVar.f57758OooO0OO);
        dbVar.f57755OooO.setText(String.valueOf(o000000O.OooOOoo().getValue()));
        boolean openDiamondMedal = badgePersonal2.getOpenDiamondMedal();
        AppCompatTextView tvRankDiamond = dbVar.f57762OooO0oO;
        if (openDiamondMedal) {
            tvRankDiamond.setText(String.valueOf(badgePersonal2.getDiamondNum()));
            Intrinsics.checkNotNullExpressionValue(tvRankDiamond, "tvRankDiamond");
            o000OO00.OooOOOO(tvRankDiamond);
        } else {
            Intrinsics.checkNotNullExpressionValue(tvRankDiamond, "tvRankDiamond");
            o000OO00.OooO0O0(tvRankDiamond);
        }
        dbVar.f57763OooO0oo.setText(String.valueOf(badgePersonal2.getGoldNum()));
        dbVar.f57765OooOO0O.setText(String.valueOf(badgePersonal2.getSilverNum()));
        dbVar.f57760OooO0o.setText(String.valueOf(badgePersonal2.getCopperNum()));
        dbVar.f57764OooOO0.setText(String.valueOf(badgePersonal2.getSumStars()));
    }
}
