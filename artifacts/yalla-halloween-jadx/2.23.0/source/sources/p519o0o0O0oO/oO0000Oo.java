package p519o0o0O0oO;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.GuessUserData;
import kotlin.jvm.internal.Intrinsics;
import p362o0OOo0O.OooOO0;
import p543o0oO0O00.OooO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.u7;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000Oo implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0000o0 f52797OooO0Oo;

    public oO0000Oo(oO0000o0 oo0000o0) {
        this.f52797OooO0Oo = oo0000o0;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String strValueOf;
        oO0000o0 oo0000o0 = this.f52797OooO0Oo;
        if (obj == null) {
            ConstraintLayout constraintLayout = oo0000o0.f52799OooOO0o.f58961OooO0O0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clSelfRanking");
            o000OO00.OooO0O0(constraintLayout);
            return;
        }
        ConstraintLayout constraintLayout2 = oo0000o0.f52799OooOO0o.f58961OooO0O0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.clSelfRanking");
        o000OO00.OooOOOO(constraintLayout2);
        GuessUserData guessUserData = (GuessUserData) obj;
        u7 u7Var = oo0000o0.f52799OooOO0o;
        AppCompatImageView appCompatImageView = u7Var.f58965OooO0o0;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.ivRanking");
        o000OO00.OooOOOO(appCompatImageView);
        ImageView imageView = u7Var.f58964OooO0o;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivRankingFrame");
        o000OO00.OooOOOO(imageView);
        AppCompatTextView appCompatTextView = u7Var.f58972OooOOO0;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.tvRanking");
        o000OO00.OooO0OO(appCompatTextView);
        int num = guessUserData.getNum();
        if (num == 1) {
            u7Var.f58965OooO0o0.setImageResource(oOo00OO0.user_support_one);
            u7Var.f58964OooO0o.setImageResource(oOo00OO0.room_dialog_rank_gold);
        } else if (num == 2) {
            u7Var.f58965OooO0o0.setImageResource(oOo00OO0.user_support_two);
            u7Var.f58964OooO0o.setImageResource(oOo00OO0.user_badge_item_rank_second);
        } else if (num != 3) {
            AppCompatImageView appCompatImageView2 = u7Var.f58965OooO0o0;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "binding.ivRanking");
            o000OO00.OooO0OO(appCompatImageView2);
            ImageView imageView2 = u7Var.f58964OooO0o;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivRankingFrame");
            o000OO00.OooO0OO(imageView2);
            AppCompatTextView appCompatTextView2 = u7Var.f58972OooOOO0;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.tvRanking");
            o000OO00.OooOOOO(appCompatTextView2);
            AppCompatTextView appCompatTextView3 = u7Var.f58972OooOOO0;
            if (guessUserData.getNum() <= 0) {
                strValueOf = guessUserData.getNumber() > 0 ? "10+" : " - ";
            } else {
                strValueOf = String.valueOf(guessUserData.getNum());
            }
            appCompatTextView3.setText(strValueOf);
        } else {
            u7Var.f58965OooO0o0.setImageResource(oOo00OO0.user_support_three);
            u7Var.f58964OooO0o.setImageResource(oOo00OO0.user_badge_item_rank_third);
        }
        int num2 = guessUserData.getNum();
        if (num2 == 1) {
            TextView textView = u7Var.f58973OooOOOO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTips");
            o000OO00.OooO0O0(textView);
        } else {
            if (2 <= num2 && num2 < 11) {
                if (guessUserData.getDifferenceNumber() > 0) {
                    u7Var.f58973OooOOOO.setText(o0000O.OooO00o(guessUserData.getMoraRankType() == 1 ? o0000.OooO0OO(oO00OOo0.room_dialog_guess_self_gap1) : o0000.OooO0OO(oO00OOo0.room_dialog_guess_self_gap3), String.valueOf(guessUserData.getDifferenceNumber())));
                    TextView textView2 = u7Var.f58973OooOOOO;
                    Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvTips");
                    o000OO00.OooOOOO(textView2);
                } else {
                    TextView textView3 = u7Var.f58973OooOOOO;
                    Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTips");
                    o000OO00.OooO0O0(textView3);
                }
            } else if (guessUserData.getDifferenceNumber() > 0) {
                u7Var.f58973OooOOOO.setText(o0000O.OooO00o(guessUserData.getMoraRankType() == 1 ? o0000.OooO0OO(oO00OOo0.room_dialog_guess_self_gap2) : o0000.OooO0OO(oO00OOo0.room_dialog_guess_self_gap4), String.valueOf(guessUserData.getDifferenceNumber())));
                TextView textView4 = u7Var.f58973OooOOOO;
                Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvTips");
                o000OO00.OooOOOO(textView4);
            } else {
                TextView textView5 = u7Var.f58973OooOOOO;
                Intrinsics.checkNotNullExpressionValue(textView5, "binding.tvTips");
                o000OO00.OooO0O0(textView5);
            }
        }
        u7Var.f58976OooOOo0.OooO0Oo(guessUserData.getPremiumLevel(), guessUserData.isPremium());
        u7Var.f58967OooO0oo.setSex(guessUserData.getSex());
        u7Var.f58970OooOO0o.setText(guessUserData.getUserName());
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(oo0000o0.f52798OooOO0O);
        oooO00o.OooO00o(OooO.OooO0OO());
        oooO00o.f43911OooO0OO = guessUserData.getUserHeader();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(u7Var.f58963OooO0Oo);
        u7Var.f58968OooOO0.setText(String.valueOf(guessUserData.getNumber()));
    }
}
