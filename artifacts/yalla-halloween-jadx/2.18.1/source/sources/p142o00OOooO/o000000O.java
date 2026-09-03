package p142o00OOooO;

import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.app.base.fragment.MainMomentFollowingFragment;
import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.model.GuessUserData;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.account.ReOpenAccountActivity;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.room.LuckyPacketDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o00OOO.OooO00o;
import p188o00o00o0.OooO0OO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p498o0o00Oo0.OooOOO;
import p579o0oOoOOo.oOO0OO0O;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.ne;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000000O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31918OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31919OooO0O0;

    public /* synthetic */ o000000O(Object obj, int i) {
        this.f31918OooO00o = i;
        this.f31919OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f31918OooO00o) {
            case 0:
                MainMomentFollowingFragment.m12initObserver$lambda10((MainMomentFollowingFragment) this.f31919OooO0O0, (Long) obj);
                break;
            case 1:
                LoginActivity context = (LoginActivity) this.f31919OooO0O0;
                LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                Intrinsics.checkNotNullParameter(context, "this$0");
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) ReOpenAccountActivity.class));
                break;
            case 2:
                PrivateChatActivity this$0 = (PrivateChatActivity) this.f31919OooO0O0;
                Boolean aBoolean = (Boolean) obj;
                PrivateChatActivity.OooO00o oooO00o2 = PrivateChatActivity.f22166o00oO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(aBoolean, "aBoolean");
                if (aBoolean.booleanValue()) {
                    this$0.Oooo00o().f49096OooO0o.f49658OooO0O0.setVisibility(8);
                    this$0.Oooo00o().f49099OooO0oo.f49857OooO0O0.setVisibility(0);
                }
                break;
            case 3:
                PostDetailActivity this$1 = (PostDetailActivity) this.f31919OooO0O0;
                MomentDetailModel result = (MomentDetailModel) obj;
                PostDetailActivity.OooO00o oooO00o3 = PostDetailActivity.f22417o0O0O00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                MomentDetailModel momentDetailModel = this$1.f22420Ooooo0o;
                if (momentDetailModel != null && momentDetailModel.getId() == result.getId()) {
                    momentDetailModel.setPraiseNum(result.getPraiseNum());
                    LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailModel);
                    this$1.Oooo00o().selfPraiseItem(true);
                    break;
                }
                break;
            case 4:
                LuckyPacketDetailActivity this$2 = (LuckyPacketDetailActivity) this.f31919OooO0O0;
                LuckyPacketDetailActivity.OooO00o oooO00o4 = LuckyPacketDetailActivity.f22854OooooOo;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.BonusDetailReply");
                Room.BonusDetailReply bonusDetailReply = (Room.BonusDetailReply) obj;
                Objects.requireNonNull(this$2);
                if (bonusDetailReply != null) {
                    oO0O00.OooO00o oooO00o5 = new oO0O00.OooO00o(this$2);
                    oooO00o5.OooO00o(OooO00o.OooO00o());
                    oooO00o5.f48429OooO0OO = CloudImageUtilKt.imgSize(bonusDetailReply.getFromuseravatar(), OooOo00.OooO00o(60), true);
                    oooO00o5.f48427OooO00o = 0;
                    oooO00o5.OooO0o(this$2.OooOoo().f49967OooO0O0.f50028OooO0O0);
                    OooO0OO<Room.BonusDetail> oooO0OO = null;
                    ne neVar = null;
                    if (bonusDetailReply.getBonustype() == 2) {
                        this$2.OooOoo().f49967OooO0O0.f50029OooO0OO.setText(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Lucky_Bag_Gifts_from_XXX), bonusDetailReply.getFromusername()));
                        oO0O00.OooO00o oooO00o6 = new oO0O00.OooO00o(this$2);
                        oooO00o6.f48429OooO0OO = CloudImageUtilKt.imgFormat(bonusDetailReply.getGiftimg());
                        oooO00o6.f48427OooO00o = 0;
                        oooO00o6.f48441OooOOOo = R.drawable.room_dialog_lucky_golds_send_gift_item_default;
                        oooO00o6.OooO0o(this$2.OooOoo().f49967OooO0O0.f50031OooO0o0);
                        this$2.OooOoo().f49967OooO0O0.f50030OooO0Oo.setText(OooO.OooO0oo(Integer.valueOf(bonusDetailReply.getGotbonusnum()), ""));
                    } else {
                        this$2.OooOoo().f49967OooO0O0.f50029OooO0OO.setText(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Lucky_Bag_Golds_from_XXX), bonusDetailReply.getFromusername()));
                        this$2.OooOoo().f49967OooO0O0.f50031OooO0o0.setImageResource(R.drawable.coin3);
                        this$2.OooOoo().f49967OooO0O0.f50030OooO0Oo.setText(OooO.OooO0oo(Integer.valueOf(bonusDetailReply.getGotbonusnum()), ""));
                    }
                    if (bonusDetailReply.getCode() == 0) {
                        this$2.OooOoo().f49969OooO0Oo.Oooo0OO(true, true);
                        OooO0OO<Room.BonusDetail> oooO0OO2 = this$2.f22859OooooOO;
                        if (oooO0OO2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            oooO0OO2 = null;
                        }
                        Boolean bool = Boolean.TRUE;
                        oooO0OO2.setLoadComplete(bool, bool, Boolean.FALSE);
                        if (bonusDetailReply.getBonusgrabnum() > 0) {
                            ne neVar2 = this$2.f22856Ooooo00;
                            if (neVar2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("header");
                                neVar2 = null;
                            }
                            neVar2.f50111OooO0OO.setVisibility(0);
                        } else {
                            ne neVar3 = this$2.f22856Ooooo00;
                            if (neVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("header");
                                neVar3 = null;
                            }
                            neVar3.f50111OooO0OO.setVisibility(8);
                        }
                        ne neVar4 = this$2.f22856Ooooo00;
                        if (neVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("header");
                            neVar4 = null;
                        }
                        neVar4.f50111OooO0OO.setText(o000O0O0.OooO0OO(R.string.red_opened) + ' ' + OooO.OooO0oo(Integer.valueOf(bonusDetailReply.getBonusgrabnum()), "") + '/' + OooO.OooO0oo(Integer.valueOf(bonusDetailReply.getBonustotalnum()), ""));
                        OooO0OO<Room.BonusDetail> oooO0OO3 = this$2.f22859OooooOO;
                        if (oooO0OO3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        } else {
                            oooO0OO = oooO0OO3;
                        }
                        oooO0OO.setNewData(bonusDetailReply.getBonusdetailsList());
                        if (!bonusDetailReply.getGotbonus()) {
                            this$2.OooOoo().f49967OooO0O0.f50031OooO0o0.setVisibility(8);
                            this$2.OooOoo().f49967OooO0O0.f50030OooO0Oo.setVisibility(8);
                        } else {
                            this$2.OooOoo().f49967OooO0O0.f50031OooO0o0.setVisibility(0);
                            this$2.OooOoo().f49967OooO0O0.f50030OooO0Oo.setVisibility(0);
                        }
                    } else {
                        this$2.OooOoo().f49969OooO0Oo.Oooo0OO(true, false);
                        OooO0OO<Room.BonusDetail> oooO0OO4 = this$2.f22859OooooOO;
                        if (oooO0OO4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            oooO0OO4 = null;
                        }
                        Boolean bool2 = Boolean.TRUE;
                        Boolean bool3 = Boolean.FALSE;
                        oooO0OO4.setLoadComplete(bool2, bool3, bool3);
                        ne neVar5 = this$2.f22856Ooooo00;
                        if (neVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("header");
                        } else {
                            neVar = neVar5;
                        }
                        neVar.f50111OooO0OO.setVisibility(8);
                    }
                }
                break;
            case 5:
                UserInfoActivity this$3 = (UserInfoActivity) this.f31919OooO0O0;
                Integer num = (Integer) obj;
                UserInfoActivity.OooO00o oooO00o7 = UserInfoActivity.f23452o0ooOO0;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (!(num == null) && (num == null || num.intValue() != 0)) {
                    this$3.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50067OooOooo.setVisibility(0);
                    Integer value = OooOOO.f41216OooO00o.OooOOO().getValue();
                    Intrinsics.checkNotNull(value);
                    int iIntValue = value.intValue();
                    if (iIntValue == 1 || iIntValue == 8) {
                        TextView textView = this$3.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50067OooOooo;
                        StringBuilder sb = new StringBuilder();
                        sb.append(num);
                        sb.append('+');
                        textView.setText(sb.toString());
                    } else {
                        TextView textView2 = this$3.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50067OooOooo;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append('+');
                        sb2.append(num);
                        textView2.setText(sb2.toString());
                    }
                } else {
                    this$3.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50067OooOooo.setVisibility(4);
                }
                break;
            case 6:
                oOO0OO0O this$4 = (oOO0OO0O) this.f31919OooO0O0;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                if (obj != null) {
                    ConstraintLayout constraintLayout = this$4.f46096OoooOO0.f49258OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clSelfRanking");
                    oOO00O.OooO(constraintLayout);
                    GuessUserData guessUserData = (GuessUserData) obj;
                    AppCompatImageView appCompatImageView = this$4.f46096OoooOO0.f49262OooO0o0;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.ivRanking");
                    oOO00O.OooO(appCompatImageView);
                    ImageView imageView = this$4.f46096OoooOO0.f49261OooO0o;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivRankingFrame");
                    oOO00O.OooO(imageView);
                    AppCompatTextView appCompatTextView = this$4.f46096OoooOO0.f49269OooOOO0;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.tvRanking");
                    oOO00O.OooO0O0(appCompatTextView);
                    int num2 = guessUserData.getNum();
                    if (num2 == 1) {
                        this$4.f46096OoooOO0.f49262OooO0o0.setImageResource(R.drawable.user_support_one);
                        this$4.f46096OoooOO0.f49261OooO0o.setImageResource(R.drawable.room_dialog_rank_gold);
                    } else if (num2 == 2) {
                        this$4.f46096OoooOO0.f49262OooO0o0.setImageResource(R.drawable.user_support_two);
                        this$4.f46096OoooOO0.f49261OooO0o.setImageResource(R.drawable.user_badge_item_rank_second);
                    } else if (num2 != 3) {
                        AppCompatImageView appCompatImageView2 = this$4.f46096OoooOO0.f49262OooO0o0;
                        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "binding.ivRanking");
                        oOO00O.OooO0O0(appCompatImageView2);
                        ImageView imageView2 = this$4.f46096OoooOO0.f49261OooO0o;
                        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivRankingFrame");
                        oOO00O.OooO0O0(imageView2);
                        AppCompatTextView appCompatTextView2 = this$4.f46096OoooOO0.f49269OooOOO0;
                        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.tvRanking");
                        oOO00O.OooO(appCompatTextView2);
                        this$4.f46096OoooOO0.f49269OooOOO0.setText(guessUserData.getNum() <= 0 ? guessUserData.getNumber() > 0 ? "10+" : " - " : String.valueOf(guessUserData.getNum()));
                    } else {
                        this$4.f46096OoooOO0.f49262OooO0o0.setImageResource(R.drawable.user_support_three);
                        this$4.f46096OoooOO0.f49261OooO0o.setImageResource(R.drawable.user_badge_item_rank_third);
                    }
                    int num3 = guessUserData.getNum();
                    if (num3 == 1) {
                        TextView textView3 = this$4.f46096OoooOO0.f49270OooOOOO;
                        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTips");
                        oOO00O.OooO00o(textView3);
                    } else if (2 <= num3 && num3 < 11) {
                        if (guessUserData.getDifferenceNumber() > 0) {
                            this$4.f46096OoooOO0.f49270OooOOOO.setText(OooOo.OooO00o(guessUserData.getMoraRankType() == 1 ? o000O0O0.OooO0OO(R.string.room_dialog_guess_self_gap1) : o000O0O0.OooO0OO(R.string.room_dialog_guess_self_gap3), String.valueOf(guessUserData.getDifferenceNumber())));
                            TextView textView4 = this$4.f46096OoooOO0.f49270OooOOOO;
                            Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvTips");
                            oOO00O.OooO(textView4);
                        } else {
                            TextView textView5 = this$4.f46096OoooOO0.f49270OooOOOO;
                            Intrinsics.checkNotNullExpressionValue(textView5, "binding.tvTips");
                            oOO00O.OooO00o(textView5);
                        }
                    } else if (guessUserData.getDifferenceNumber() > 0) {
                        this$4.f46096OoooOO0.f49270OooOOOO.setText(OooOo.OooO00o(guessUserData.getMoraRankType() == 1 ? o000O0O0.OooO0OO(R.string.room_dialog_guess_self_gap2) : o000O0O0.OooO0OO(R.string.room_dialog_guess_self_gap4), String.valueOf(guessUserData.getDifferenceNumber())));
                        TextView textView6 = this$4.f46096OoooOO0.f49270OooOOOO;
                        Intrinsics.checkNotNullExpressionValue(textView6, "binding.tvTips");
                        oOO00O.OooO(textView6);
                    } else {
                        TextView textView7 = this$4.f46096OoooOO0.f49270OooOOOO;
                        Intrinsics.checkNotNullExpressionValue(textView7, "binding.tvTips");
                        oOO00O.OooO00o(textView7);
                    }
                    this$4.f46096OoooOO0.f49273OooOOo0.OooO0Oo(guessUserData.isPremium(), guessUserData.getPremiumLevel());
                    this$4.f46096OoooOO0.f49264OooO0oo.setSex(guessUserData.getSex());
                    this$4.f46096OoooOO0.f49267OooOO0o.setText(guessUserData.getUserName());
                    oO0O00.OooO00o oooO00o8 = new oO0O00.OooO00o(this$4.f46095OoooO);
                    oooO00o8.OooO00o(OooO00o.OooO0o0());
                    oooO00o8.f48429OooO0OO = guessUserData.getUserHeader();
                    oooO00o8.f48427OooO00o = 0;
                    oooO00o8.OooO0o(this$4.f46096OoooOO0.f49260OooO0Oo);
                    this$4.f46096OoooOO0.f49265OooOO0.setText(String.valueOf(guessUserData.getNumber()));
                } else {
                    ConstraintLayout constraintLayout2 = this$4.f46096OoooOO0.f49258OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.clSelfRanking");
                    oOO00O.OooO00o(constraintLayout2);
                }
                break;
            default:
                Activity activity = (Activity) this.f31919OooO0O0;
                Intrinsics.checkNotNullParameter(activity, "$activity");
                activity.finish();
                break;
        }
    }
}
