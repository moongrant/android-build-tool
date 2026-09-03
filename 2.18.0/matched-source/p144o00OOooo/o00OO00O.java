package p144o00OOooo;

import android.content.Intent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.app.base.fragment.room.RoomInfoMomentFragment;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.ui.view.UserPrettyIdView;
import com.yalla.yalla.model.BadgePersonal;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.service.im.IMMessageService;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.moment.TopicCreateActivity;
import com.yalla.yalla.ui.activity.moment.TopicReviewActivity;
import com.yalla.yalla.ui.activity.user.BadgeRankActivity;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import kotlin.jvm.internal.Intrinsics;
import o00OOO.OooO00o;
import p255o00ooO0O.o000O0O0;
import p500o0o00Oo0.OooOOO;
import p517o0o0O00.o00O00;
import p524o0o0O0o.oOO00O;
import p603o0oo00Oo.o0OO0o00;
import p618o0oo0Ooo.oO0O000o;
import p651o0ooOOoo.mi;
import p651o0ooOOoo.va;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OO00O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32034OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32035OooO0O0;

    public /* synthetic */ o00OO00O(Object obj, int i) {
        this.f32034OooO00o = i;
        this.f32035OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f32034OooO00o) {
            case 0:
                RoomInfoMomentFragment.m65initObserver$lambda1((RoomInfoMomentFragment) this.f32035OooO0O0, (MomentDetailModel) obj);
                break;
            case 1:
                va bindingDrawer = (va) this.f32035OooO0O0;
                Integer isPrettyId = (Integer) obj;
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                UserPrettyIdView userPrettyIdView = bindingDrawer.f50813OooO0o0;
                Intrinsics.checkNotNullExpressionValue(isPrettyId, "isPrettyId");
                userPrettyIdView.setUserPrettyId(isPrettyId.intValue());
                break;
            case 2:
                IMMessageService this$0 = (IMMessageService) this.f32035OooO0O0;
                int i = IMMessageService.f21681OoooO0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    o00O00.OooO0OO("MessageService", "New_Message_Firebase : getMessageFromServer");
                    this$0.f21682Oooo.OooO0o0();
                }
                break;
            case 3:
                MainActivity this$1 = (MainActivity) this.f32035OooO0O0;
                o0OO0o00 o0oo0o01 = (o0OO0o00) obj;
                MainActivity.OooO00o oooO00o = MainActivity.f21962o00Ooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                long jCurrentTimeMillis = System.currentTimeMillis();
                o0OO0o00 o0oo0o02 = this$1.f21970o00O0O;
                if (jCurrentTimeMillis - oOO00O.OooO0o(o0oo0o02 != null ? Long.valueOf(o0oo0o02.f48224OooO0o) : null) > 3600000) {
                    this$1.f21970o00O0O = o0oo0o01;
                    this$1.Oooo0O0();
                }
                break;
            case 4:
                TopicCreateActivity context = (TopicCreateActivity) this.f32035OooO0O0;
                int i2 = TopicCreateActivity.f22568Oooooo0;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (((Response) obj).getIsSuccess()) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    context.startActivity(new Intent(context, (Class<?>) TopicReviewActivity.class));
                    context.finish();
                }
                break;
            case 5:
                BadgeRankActivity this$2 = (BadgeRankActivity) this.f32035OooO0O0;
                BadgePersonal badgePersonal = (BadgePersonal) obj;
                BadgeRankActivity.OooO00o oooO00o2 = BadgeRankActivity.f23318OoooooO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (badgePersonal != null) {
                    ConstraintLayout constraintLayout = this$2.OooOoo().f49623OooO0o0.f50076OooOO0o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.ilBottom.userBadgeItemRoot");
                    p255o00ooO0O.oOO00O.OooO(constraintLayout);
                    mi miVar = this$2.OooOoo().f49623OooO0o0;
                    miVar.f50076OooOO0o.setBackgroundColor(-1);
                    if (badgePersonal.getRank() > 3 || badgePersonal.getRank() == 0) {
                        AppCompatTextView tvRank = miVar.f50071OooO0o0;
                        Intrinsics.checkNotNullExpressionValue(tvRank, "tvRank");
                        p255o00ooO0O.oOO00O.OooO(tvRank);
                        miVar.f50071OooO0o0.setText(badgePersonal.getRank() == 0 ? badgePersonal.getSumStars() > 0 ? "50+" : "-" : String.valueOf(badgePersonal.getRank()));
                        AppCompatImageView ivUserMark = miVar.f50069OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(ivUserMark, "ivUserMark");
                        p255o00ooO0O.oOO00O.OooO0O0(ivUserMark);
                        AppCompatImageView ivRank = miVar.f50067OooO0O0;
                        Intrinsics.checkNotNullExpressionValue(ivRank, "ivRank");
                        p255o00ooO0O.oOO00O.OooO00o(ivRank);
                    } else {
                        AppCompatImageView appCompatImageView = miVar.f50067OooO0O0;
                        int rank = badgePersonal.getRank();
                        appCompatImageView.setImageResource(rank != 1 ? rank != 2 ? R.drawable.user_support_three : R.drawable.user_support_two : R.drawable.user_support_one);
                        AppCompatImageView ivRank2 = miVar.f50067OooO0O0;
                        Intrinsics.checkNotNullExpressionValue(ivRank2, "ivRank");
                        p255o00ooO0O.oOO00O.OooO(ivRank2);
                        AppCompatImageView appCompatImageView2 = miVar.f50069OooO0Oo;
                        int rank2 = badgePersonal.getRank();
                        int i3 = R.drawable.user_badge_item_rank_first;
                        if (rank2 != 1) {
                            if (rank2 == 2) {
                                i3 = R.drawable.user_badge_item_rank_second;
                            } else if (rank2 == 3) {
                                i3 = R.drawable.user_badge_item_rank_third;
                            }
                        }
                        appCompatImageView2.setImageResource(i3);
                        AppCompatImageView ivUserMark2 = miVar.f50069OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(ivUserMark2, "ivUserMark");
                        p255o00ooO0O.oOO00O.OooO(ivUserMark2);
                        AppCompatTextView tvRank2 = miVar.f50071OooO0o0;
                        Intrinsics.checkNotNullExpressionValue(tvRank2, "tvRank");
                        p255o00ooO0O.oOO00O.OooO00o(tvRank2);
                    }
                    oO0O000o.OooO00o oooO00o3 = new oO0O000o.OooO00o(this$2);
                    oooO00o3.OooO00o(OooO00o.OooO00o());
                    OooOOO oooOOO = OooOOO.f41235OooO00o;
                    oooO00o3.f48447OooO0OO = String.valueOf(oooOOO.OooO0oo().getValue());
                    oooO00o3.f48445OooO00o = 0;
                    oooO00o3.OooO0OO(1, o000O0O0.OooO00o(R.color.color_e2e2e2));
                    oooO00o3.OooO0o(miVar.f50068OooO0OO);
                    miVar.f50065OooO.setText(String.valueOf(oooOOO.OooOoO().getValue()));
                    if (badgePersonal.getOpenDiamondMedal()) {
                        miVar.f50072OooO0oO.setText(String.valueOf(badgePersonal.getDiamondNum()));
                        AppCompatTextView tvRankDiamond = miVar.f50072OooO0oO;
                        Intrinsics.checkNotNullExpressionValue(tvRankDiamond, "tvRankDiamond");
                        p255o00ooO0O.oOO00O.OooO(tvRankDiamond);
                    } else {
                        AppCompatTextView tvRankDiamond2 = miVar.f50072OooO0oO;
                        Intrinsics.checkNotNullExpressionValue(tvRankDiamond2, "tvRankDiamond");
                        p255o00ooO0O.oOO00O.OooO00o(tvRankDiamond2);
                    }
                    miVar.f50073OooO0oo.setText(String.valueOf(badgePersonal.getGoldNum()));
                    miVar.f50075OooOO0O.setText(String.valueOf(badgePersonal.getSilverNum()));
                    miVar.f50070OooO0o.setText(String.valueOf(badgePersonal.getCopperNum()));
                    miVar.f50074OooOO0.setText(String.valueOf(badgePersonal.getSumStars()));
                } else {
                    ConstraintLayout constraintLayout2 = this$2.OooOoo().f49623OooO0o0.f50076OooOO0o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.ilBottom.userBadgeItemRoot");
                    p255o00ooO0O.oOO00O.OooO00o(constraintLayout2);
                }
                break;
            default:
                RoomGameBoxDialog this$3 = (RoomGameBoxDialog) this.f32035OooO0O0;
                Integer it = (Integer) obj;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                this$3.f23768OooOO0O = it.intValue();
                this$3.OooOOOO(true, RoomGameBoxDialog.GameType.GameLuckyNumber);
                break;
        }
    }
}
