package p471o0OoooO0;

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
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p208o00o0oOO.o0O000o0;
import p355o0OOOo0o.OooO0o;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.s2;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47870OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f47871OooO0o0;

    public /* synthetic */ o0O000(int i, View.OnClickListener onClickListener) {
        this.f47870OooO0Oo = i;
        this.f47871OooO0o0 = onClickListener;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i;
        int i2 = this.f47870OooO0Oo;
        View.OnClickListener onClickListener = this.f47871OooO0o0;
        switch (i2) {
            case 0:
                o0O000Oo this$0 = (o0O000Oo) onClickListener;
                MusicState.State state = (MusicState.State) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i3 = state != null ? o0O000Oo.OooO00o.$EnumSwitchMapping$0[state.ordinal()] : -1;
                if (i3 == 1) {
                    this$0.f47877OooOO0O.f44414OooO.setImageResource(o0Oo0oo.icon_room_music_playing);
                    MusicTable value = MusicState.f22362OooO00o.getValue();
                    if (value != null && value.mDuration == 0) {
                        int iOooOOO = OooO0o.OooO0O0().OooO00o().OooOOO();
                        TextView textView = this$0.f47877OooOO0O.f44432OooOOoo;
                        Lazy lazy = o0O000o0.f39631OooO00o;
                        textView.setText(o0O000o0.OooO0OO(iOooOOO));
                        value.mDuration = iOooOOO;
                        o00Oo0.OooO00o().OooOoO0().OooO0o(value);
                        break;
                    }
                } else if (i3 == 2) {
                    this$0.f47877OooOO0O.f44414OooO.setImageResource(o0Oo0oo.icon_room_music_play);
                    break;
                } else if (i3 == 3) {
                    this$0.f47877OooOO0O.f44414OooO.setImageResource(o0Oo0oo.icon_room_music_play);
                    break;
                }
                break;
            case 1:
                BadgeRankActivity this$1 = (BadgeRankActivity) onClickListener;
                BadgePersonal badgePersonal = (BadgePersonal) obj;
                int i4 = BadgeRankActivity.f26621OooOo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (badgePersonal != null) {
                    ConstraintLayout userBadgeItemRoot = this$1.OooOo().f44190OooO0o0.f45508OooOO0o;
                    Intrinsics.checkNotNullExpressionValue(userBadgeItemRoot, "userBadgeItemRoot");
                    o000O.OooOOOO(userBadgeItemRoot);
                    s2 s2Var = this$1.OooOo().f44190OooO0o0;
                    s2Var.f45508OooOO0o.setBackgroundColor(-1);
                    int rank = badgePersonal.getRank();
                    AppCompatImageView ivUserMark = s2Var.f45501OooO0Oo;
                    AppCompatImageView ivRank = s2Var.f45499OooO0O0;
                    AppCompatTextView tvRank = s2Var.f45503OooO0o0;
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
                        ivRank.setImageResource(rank2 != 1 ? rank2 != 2 ? o0Oo0oo.user_support_three : o0Oo0oo.user_support_two : o0Oo0oo.user_support_one);
                        Intrinsics.checkNotNullExpressionValue(ivRank, "ivRank");
                        o000O.OooOOOO(ivRank);
                        int rank3 = badgePersonal.getRank();
                        if (rank3 == 1) {
                            i = o0Oo0oo.user_badge_item_rank_first;
                        } else if (rank3 != 2) {
                            i = rank3 != 3 ? o0Oo0oo.user_badge_item_rank_first : o0Oo0oo.user_badge_item_rank_third;
                        } else {
                            i = o0Oo0oo.user_badge_item_rank_second;
                        }
                        ivUserMark.setImageResource(i);
                        Intrinsics.checkNotNullExpressionValue(ivUserMark, "ivUserMark");
                        o000O.OooOOOO(ivUserMark);
                        Intrinsics.checkNotNullExpressionValue(tvRank, "tvRank");
                        o000O.OooO0O0(tvRank);
                    }
                    Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this$1);
                    oooO00o.OooO00o(d1.OooO00o());
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    oooO00o.f43126OooO0OO = String.valueOf(o0O00oO0.OooO().getValue());
                    oooO00o.f43124OooO00o = 0;
                    oooO00o.OooO0O0(1, o0000.OooO00o(o0OOO0o.color_e2e2e2));
                    oooO00o.OooO0Oo(s2Var.f45500OooO0OO);
                    s2Var.f45497OooO.setText(String.valueOf(o0O00oO0.OooOOoo().getValue()));
                    boolean openDiamondMedal = badgePersonal.getOpenDiamondMedal();
                    AppCompatTextView tvRankDiamond = s2Var.f45504OooO0oO;
                    if (openDiamondMedal) {
                        tvRankDiamond.setText(String.valueOf(badgePersonal.getDiamondNum()));
                        Intrinsics.checkNotNullExpressionValue(tvRankDiamond, "tvRankDiamond");
                        o000O.OooOOOO(tvRankDiamond);
                    } else {
                        Intrinsics.checkNotNullExpressionValue(tvRankDiamond, "tvRankDiamond");
                        o000O.OooO0O0(tvRankDiamond);
                    }
                    s2Var.f45505OooO0oo.setText(String.valueOf(badgePersonal.getGoldNum()));
                    s2Var.f45507OooOO0O.setText(String.valueOf(badgePersonal.getSilverNum()));
                    s2Var.f45502OooO0o.setText(String.valueOf(badgePersonal.getCopperNum()));
                    s2Var.f45506OooOO0.setText(String.valueOf(badgePersonal.getSumStars()));
                } else {
                    ConstraintLayout userBadgeItemRoot2 = this$1.OooOo().f44190OooO0o0.f45508OooOO0o;
                    Intrinsics.checkNotNullExpressionValue(userBadgeItemRoot2, "userBadgeItemRoot");
                    o000O.OooO0O0(userBadgeItemRoot2);
                }
                break;
            default:
                TreasureBoxDialog this$2 = (TreasureBoxDialog) onClickListener;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooOO0O();
                break;
        }
    }
}
