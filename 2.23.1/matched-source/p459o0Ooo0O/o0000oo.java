package p459o0Ooo0O;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.model.BadgePersonal;
import com.yalla.yalla.ui.activity.user.BadgeRankActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentFragment;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p208o00o0oOO.o0O00O0o;
import p356o0OOOo0o.OooO;
import p370o0OOo0Oo.Oooo000;
import p407o0Oo0OOO.t2;
import p410o0Oo0Oo0.o00O0O;
import p474o0OoooOO.oo0oO0;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.o0ooOOo;
import p645o0ooOOO0.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000oo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47767OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f47768OooO0o0;

    public /* synthetic */ o0000oo(int i, View.OnClickListener onClickListener) {
        this.f47767OooO0Oo = i;
        this.f47768OooO0o0 = onClickListener;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i;
        int i2 = this.f47767OooO0Oo;
        View.OnClickListener onClickListener = this.f47768OooO0o0;
        switch (i2) {
            case 0:
                o0000O0O this$0 = (o0000O0O) onClickListener;
                MusicState.State state = (MusicState.State) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i3 = state != null ? o0000O0O.OooO00o.$EnumSwitchMapping$0[state.ordinal()] : -1;
                if (i3 == 1) {
                    this$0.f47759OooOO0O.f44385OooO.setImageResource(o0OOO0o.icon_room_music_playing);
                    MusicTable value = MusicState.f22369OooO00o.getValue();
                    if (value != null && value.mDuration == 0) {
                        int iOooOOO = OooO.OooO0O0().OooO00o().OooOOO();
                        TextView textView = this$0.f47759OooOO0O.f44403OooOOoo;
                        Lazy lazy = o0O00O0o.f39628OooO00o;
                        textView.setText(o0O00O0o.OooO0OO(iOooOOO));
                        value.mDuration = iOooOOO;
                        o00O0O.OooO00o().OooOoO0().OooO0o(value);
                        break;
                    }
                } else if (i3 == 2) {
                    this$0.f47759OooOO0O.f44385OooO.setImageResource(o0OOO0o.icon_room_music_play);
                    break;
                } else if (i3 == 3) {
                    this$0.f47759OooOO0O.f44385OooO.setImageResource(o0OOO0o.icon_room_music_play);
                    break;
                }
                break;
            case 1:
                BadgeRankActivity this$1 = (BadgeRankActivity) onClickListener;
                BadgePersonal badgePersonal = (BadgePersonal) obj;
                int i4 = BadgeRankActivity.f26622OooOo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (badgePersonal != null) {
                    ConstraintLayout userBadgeItemRoot = this$1.OooOo().f44708OooO0o0.f45523OooOO0o;
                    Intrinsics.checkNotNullExpressionValue(userBadgeItemRoot, "userBadgeItemRoot");
                    o000O.OooOOOO(userBadgeItemRoot);
                    t2 t2Var = this$1.OooOo().f44708OooO0o0;
                    t2Var.f45523OooOO0o.setBackgroundColor(-1);
                    int rank = badgePersonal.getRank();
                    AppCompatImageView ivUserMark = t2Var.f45516OooO0Oo;
                    AppCompatImageView ivRank = t2Var.f45514OooO0O0;
                    AppCompatTextView tvRank = t2Var.f45518OooO0o0;
                    if (rank > 3 || badgePersonal.getRank() == 0) {
                        Intrinsics.checkNotNullExpressionValue(tvRank, "tvRank");
                        o000O.OooOOOO(tvRank);
                        tvRank.setText(badgePersonal.getRank() == 0 ? badgePersonal.getSumStars() > 0 ? "50+" : "-" : String.valueOf(badgePersonal.getRank()));
                        Intrinsics.checkNotNullExpressionValue(ivUserMark, "ivUserMark");
                        o000O.OooO0OO(ivUserMark);
                        Intrinsics.checkNotNullExpressionValue(ivRank, "ivRank");
                        o000O.OooO0O0(ivRank);
                    } else {
                        int rank2 = badgePersonal.getRank();
                        ivRank.setImageResource(rank2 != 1 ? rank2 != 2 ? o0OOO0o.user_support_three : o0OOO0o.user_support_two : o0OOO0o.user_support_one);
                        Intrinsics.checkNotNullExpressionValue(ivRank, "ivRank");
                        o000O.OooOOOO(ivRank);
                        int rank3 = badgePersonal.getRank();
                        if (rank3 == 1) {
                            i = o0OOO0o.user_badge_item_rank_first;
                        } else if (rank3 != 2) {
                            i = rank3 != 3 ? o0OOO0o.user_badge_item_rank_first : o0OOO0o.user_badge_item_rank_third;
                        } else {
                            i = o0OOO0o.user_badge_item_rank_second;
                        }
                        ivUserMark.setImageResource(i);
                        Intrinsics.checkNotNullExpressionValue(ivUserMark, "ivUserMark");
                        o000O.OooOOOO(ivUserMark);
                        Intrinsics.checkNotNullExpressionValue(tvRank, "tvRank");
                        o000O.OooO0O0(tvRank);
                    }
                    Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this$1);
                    oooO00o.OooO00o(o0O0O0Oo.OooO00o());
                    oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                    oooO00o.f43127OooO0OO = String.valueOf(oo0oO0.OooO().getValue());
                    oooO00o.f43125OooO00o = 0;
                    oooO00o.OooO0O0(1, o0000.OooO00o(o0ooOOo.color_e2e2e2));
                    oooO00o.OooO0Oo(t2Var.f45515OooO0OO);
                    t2Var.f45512OooO.setText(String.valueOf(oo0oO0.OooOOoo().getValue()));
                    boolean openDiamondMedal = badgePersonal.getOpenDiamondMedal();
                    AppCompatTextView tvRankDiamond = t2Var.f45519OooO0oO;
                    if (openDiamondMedal) {
                        tvRankDiamond.setText(String.valueOf(badgePersonal.getDiamondNum()));
                        Intrinsics.checkNotNullExpressionValue(tvRankDiamond, "tvRankDiamond");
                        o000O.OooOOOO(tvRankDiamond);
                    } else {
                        Intrinsics.checkNotNullExpressionValue(tvRankDiamond, "tvRankDiamond");
                        o000O.OooO0O0(tvRankDiamond);
                    }
                    t2Var.f45520OooO0oo.setText(String.valueOf(badgePersonal.getGoldNum()));
                    t2Var.f45522OooOO0O.setText(String.valueOf(badgePersonal.getSilverNum()));
                    t2Var.f45517OooO0o.setText(String.valueOf(badgePersonal.getCopperNum()));
                    t2Var.f45521OooOO0.setText(String.valueOf(badgePersonal.getSumStars()));
                } else {
                    ConstraintLayout userBadgeItemRoot2 = this$1.OooOo().f44708OooO0o0.f45523OooOO0o;
                    Intrinsics.checkNotNullExpressionValue(userBadgeItemRoot2, "userBadgeItemRoot");
                    o000O.OooO0O0(userBadgeItemRoot2);
                }
                break;
            default:
                MainMomentFragment.initObserver$lambda$7((MainMomentFragment) onClickListener, (Integer) obj);
                break;
        }
    }
}
