package p650o0ooo;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.viewpager2.widget.ViewPager2;
import com.code.android.easydialog.WindowAnim;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.GuessUserData;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.GuessGiftListFragment;
import com.yalla.yalla.ui.fragment.GuessListFragment;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.h;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p595o0oo00O.OooOo00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0o00O extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Context f58660OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final h f58661OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0O0o00O(@NotNull Context context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58660OooOO0O = context;
        h hVarInflate = h.inflate(LayoutInflater.from(context), this.f58508OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(hVarInflate, "inflate(...)");
        this.f58661OooOO0o = hVarInflate;
        Window window = this.f58509OooO0o0.getWindow();
        if (window != null) {
            window.getAttributes().height = -1;
            window.setAttributes(window.getAttributes());
        }
        if (context instanceof FragmentActivity) {
            hVarInflate.f43892OooOO0O.setText(o0000.OooO0OO(o000000.room_dialog_guess_list_title));
            hVarInflate.f43885OooO0OO.setOnClickListener(this);
            OooOO0(0);
            hVarInflate.f43882OooO.setOnClickListener(this);
            hVarInflate.f43894OooOOO.setOnClickListener(this);
            hVarInflate.f43897OooOOOo.setOnClickListener(this);
            hVarInflate.f43884OooO0O0.setOnClickListener(this);
            o0O0o000 o0o0o000 = new o0O0o000(context, CollectionsKt.mutableListOf(new GuessGiftListFragment((FragmentActivity) context), new GuessListFragment(context, 0, 2, 2, null)));
            ViewPager2 viewPager2 = hVarInflate.f43898OooOOo;
            viewPager2.setAdapter(o0o0o000);
            viewPager2.registerOnPageChangeCallback(new oo0OOoo(this));
            LiveEventBus.get("ROOM_GUESS_LIST_SELF_DATA").observe((LifecycleOwner) context, new Observer() { // from class: o0ooo.o0O0OOOo
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    String strValueOf;
                    o0O0o00O this$0 = this.f58652OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (obj == null) {
                        ConstraintLayout clSelfRanking = this$0.f58661OooOO0o.f43884OooO0O0;
                        Intrinsics.checkNotNullExpressionValue(clSelfRanking, "clSelfRanking");
                        o000O.OooO0O0(clSelfRanking);
                        return;
                    }
                    ConstraintLayout clSelfRanking2 = this$0.f58661OooOO0o.f43884OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(clSelfRanking2, "clSelfRanking");
                    o000O.OooOOOO(clSelfRanking2);
                    GuessUserData guessUserData = (GuessUserData) obj;
                    h hVar = this$0.f58661OooOO0o;
                    AppCompatImageView ivRanking = hVar.f43888OooO0o0;
                    Intrinsics.checkNotNullExpressionValue(ivRanking, "ivRanking");
                    o000O.OooOOOO(ivRanking);
                    ImageView ivRankingFrame = hVar.f43887OooO0o;
                    Intrinsics.checkNotNullExpressionValue(ivRankingFrame, "ivRankingFrame");
                    o000O.OooOOOO(ivRankingFrame);
                    AppCompatTextView tvRanking = hVar.f43895OooOOO0;
                    Intrinsics.checkNotNullExpressionValue(tvRanking, "tvRanking");
                    o000O.OooO0OO(tvRanking);
                    int num = guessUserData.getNum();
                    AppCompatImageView ivRanking2 = hVar.f43888OooO0o0;
                    if (num == 1) {
                        ivRanking2.setImageResource(o0Oo0oo.user_support_one);
                        ivRankingFrame.setImageResource(o0Oo0oo.room_dialog_rank_gold);
                    } else if (num == 2) {
                        ivRanking2.setImageResource(o0Oo0oo.user_support_two);
                        ivRankingFrame.setImageResource(o0Oo0oo.user_badge_item_rank_second);
                    } else if (num != 3) {
                        Intrinsics.checkNotNullExpressionValue(ivRanking2, "ivRanking");
                        o000O.OooO0OO(ivRanking2);
                        Intrinsics.checkNotNullExpressionValue(ivRankingFrame, "ivRankingFrame");
                        o000O.OooO0OO(ivRankingFrame);
                        Intrinsics.checkNotNullExpressionValue(tvRanking, "tvRanking");
                        o000O.OooOOOO(tvRanking);
                        if (guessUserData.getNum() <= 0) {
                            strValueOf = guessUserData.getNumber() > 0 ? "10+" : " - ";
                        } else {
                            strValueOf = String.valueOf(guessUserData.getNum());
                        }
                        tvRanking.setText(strValueOf);
                    } else {
                        ivRanking2.setImageResource(o0Oo0oo.user_support_three);
                        ivRankingFrame.setImageResource(o0Oo0oo.user_badge_item_rank_third);
                    }
                    int num2 = guessUserData.getNum();
                    TextView tvTips = hVar.f43896OooOOOO;
                    if (num2 == 1) {
                        Intrinsics.checkNotNullExpressionValue(tvTips, "tvTips");
                        o000O.OooO0O0(tvTips);
                    } else {
                        if (2 <= num2 && num2 < 11) {
                            if (guessUserData.getDifferenceNumber() > 0) {
                                tvTips.setText(o0000O.OooO00o(guessUserData.getMoraRankType() == 1 ? o0000.OooO0OO(o000000.room_dialog_guess_self_gap1) : o0000.OooO0OO(o000000.room_dialog_guess_self_gap3), String.valueOf(guessUserData.getDifferenceNumber())));
                                Intrinsics.checkNotNullExpressionValue(tvTips, "tvTips");
                                o000O.OooOOOO(tvTips);
                            } else {
                                Intrinsics.checkNotNullExpressionValue(tvTips, "tvTips");
                                o000O.OooO0O0(tvTips);
                            }
                        } else if (guessUserData.getDifferenceNumber() > 0) {
                            tvTips.setText(o0000O.OooO00o(guessUserData.getMoraRankType() == 1 ? o0000.OooO0OO(o000000.room_dialog_guess_self_gap2) : o0000.OooO0OO(o000000.room_dialog_guess_self_gap4), String.valueOf(guessUserData.getDifferenceNumber())));
                            Intrinsics.checkNotNullExpressionValue(tvTips, "tvTips");
                            o000O.OooOOOO(tvTips);
                        } else {
                            Intrinsics.checkNotNullExpressionValue(tvTips, "tvTips");
                            o000O.OooO0O0(tvTips);
                        }
                    }
                    hVar.f43899OooOOo0.OooO0Oo(guessUserData.getPremiumLevel(), guessUserData.isPremium());
                    hVar.f43890OooO0oo.setSex(guessUserData.getSex());
                    hVar.f43893OooOO0o.setText(guessUserData.getUserName());
                    Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this$0.f58660OooOO0O);
                    oooO00o.OooO00o(d1.OooO0OO());
                    oooO00o.f43126OooO0OO = guessUserData.getUserHeader();
                    oooO00o.f43124OooO00o = 0;
                    oooO00o.OooO0Oo(hVar.f43886OooO0Oo);
                    hVar.f43891OooOO0.setText(String.valueOf(guessUserData.getNumber()));
                }
            });
        }
    }

    public final void OooOO0(int i) {
        h hVar = this.f58661OooOO0o;
        hVar.f43882OooO.setSelected(i == 0);
        hVar.f43894OooOOO.setSelected(i == 1);
        if (i == 0 && OooOo00.OooO0o0()) {
            hVar.f43882OooO.setBackground(o0000.OooO0O0(o0Oo0oo.room_shape_dialog_guess_list_table_right));
            hVar.f43894OooOOO.setBackground(null);
        } else if (i == 0) {
            hVar.f43882OooO.setBackground(o0000.OooO0O0(o0Oo0oo.room_shape_dialog_guess_list_table_left));
            hVar.f43894OooOOO.setBackground(null);
        } else if (i == 1 && OooOo00.OooO0o0()) {
            hVar.f43882OooO.setBackground(null);
            hVar.f43894OooOOO.setBackground(o0000.OooO0O0(o0Oo0oo.room_shape_dialog_guess_list_table_left));
        } else if (i == 1) {
            hVar.f43882OooO.setBackground(null);
            hVar.f43894OooOOO.setBackground(o0000.OooO0O0(o0Oo0oo.room_shape_dialog_guess_list_table_right));
        }
        hVar.f43889OooO0oO.setImageResource(hVar.f43882OooO.isSelected() ? o0Oo0oo.room_dialog_guessing_gift : o0Oo0oo.icon_room_bottom_game_box_mora);
    }

    @Override // p650o0ooo.o000OO00, android.view.View.OnClickListener
    public final void onClick(@NotNull View v) throws Throwable {
        Intrinsics.checkNotNullParameter(v, "v");
        super.onClick(v);
        h hVar = this.f58661OooOO0o;
        boolean zAreEqual = Intrinsics.areEqual(v, hVar.f43882OooO);
        ViewPager2 viewPager2 = hVar.f43898OooOOo;
        if (zAreEqual) {
            viewPager2.setCurrentItem(0, false);
            return;
        }
        if (Intrinsics.areEqual(v, hVar.f43894OooOOO)) {
            viewPager2.setCurrentItem(1, false);
            return;
        }
        if (!Intrinsics.areEqual(v, hVar.f43885OooO0OO)) {
            if (Intrinsics.areEqual(v, hVar.f43897OooOOOo)) {
                OooO0O0();
                return;
            }
            if (Intrinsics.areEqual(v, hVar.f43884OooO0O0)) {
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
                Context context = this.f58660OooOO0O;
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                UserInfoActivity.OooO00o.OooO0OO(oooO00o, (FragmentActivity) context, String.valueOf(o0O00oO0.OooOOo0().getValue()), false, 12);
                return;
            }
            return;
        }
        Context context2 = this.f58507OooO0Oo;
        p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(context2);
        View childAt = o000o.f38489OooO0OO.getChildAt(0);
        if (childAt == null) {
            throw new Throwable("Must be called after setContentView");
        }
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        int iRoundToInt = MathKt.roundToInt(Resources.getSystem().getDisplayMetrics().widthPixels * 1.0f);
        layoutParams.width = iRoundToInt;
        childAt.setLayoutParams(layoutParams);
        Window windowOooO0Oo = o000o.OooO0Oo();
        WindowManager.LayoutParams attributes = windowOooO0Oo != null ? windowOooO0Oo.getAttributes() : null;
        if (attributes != null) {
            attributes.width = iRoundToInt;
        }
        Intrinsics.checkNotNull(o000o, "null cannot be cast to non-null type T of com.code.android.easydialog.EasyDialog");
        o000o.OooO0oo();
        o000o.OooOO0O(WindowAnim.BottomWithAlpha);
        o000o.OooOOO0().f39387OooO00o.setBackgroundResource(o0Oo0oo.room_shape_dialog_guess_list_bg);
        o000o.OooOoO0(o000000.room_dialog_guess_list_title);
        o000o.OooOOO0().f39393OooO0oO.setTextColor(o0000.OooO00o(o0OOO0o.white));
        View viewInflate = View.inflate(context2, oo0o0Oo.room_dialog_guess_list_directions, null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        o000o.OooOOo(viewInflate);
        int i = o0Oo0oo.room_dialog_guess_list_direction;
        o000o.OooOoOO();
        o000o.OooOOO0().f39389OooO0OO.setImageResource(i);
        o000o.OooOOo0(false);
        o000o.OooOO0o();
    }
}
