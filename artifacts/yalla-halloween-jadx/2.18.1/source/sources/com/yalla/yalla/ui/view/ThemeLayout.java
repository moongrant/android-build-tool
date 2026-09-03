package com.yalla.yalla.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.util.netimage.listener.OooOO0O;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p175o00OooOo.o0OO00o0;
import p254o00ooO0O.o000O0O0;
import p616o0oo0Ooo.oO0O00;
import p617o0oo0o.o0OO00O;
import p649o0ooOOoo.ue;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/ui/view/ThemeLayout;", "Landroid/widget/FrameLayout;", "", "isSelected", "", "setSelectTheme", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "def", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ThemeLayout extends FrameLayout {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final /* synthetic */ int f25215Oooo0oO = 0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public ue f25216Oooo0o;

    public static final class OooO00o extends OooOO0O {
        public OooO00o() {
        }

        @Override // com.yalla.yalla.util.netimage.listener.OooOO0O
        public final void OooO0Oo(int i, boolean z) {
            if (z) {
                ThemeLayout.this.f25216Oooo0o.f50730OooOo00.setAlpha(1.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ue ueVarInflate = ue.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(ueVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25216Oooo0o = ueVarInflate;
    }

    public static void OooO0OO(ThemeLayout themeLayout, ThemeModel item, boolean z, Function0 function0, Function0 function1, int i) {
        String strOooO0OO;
        boolean z2 = (i & 2) != 0 ? false : z;
        boolean z3 = (i & 4) != 0;
        Function0 function2 = (i & 8) != 0 ? null : function0;
        Function0 function3 = (i & 16) == 0 ? function1 : null;
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = themeLayout.f25216Oooo0o.f50723OooOOO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvRemainNum");
        o00O0O.OooO00o(textView);
        boolean z4 = item.getIsHave() == 1;
        LinearLayout linearLayout = themeLayout.f25216Oooo0o.f50721OooOO0O;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llThemeType");
        o00O0O.OooO(linearLayout);
        if (item.getIsRoomTeamAward()) {
            TextView textView2 = themeLayout.f25216Oooo0o.f50729OooOOoo;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvThemeType");
            o0OO00O.OooO00o(textView2, o000O0O0.OooO00o(R.color.color_FFEE63), o000O0O0.OooO00o(R.color.color_FFA907));
            themeLayout.f25216Oooo0o.f50716OooO0o.setImageResource(R.mipmap.ic_room_member_host);
            themeLayout.f25216Oooo0o.f50729OooOOoo.setText(OooOOO.OooO0OO(R.string.room_theme_mine_member_group_reward));
            themeLayout.f25216Oooo0o.f50729OooOOoo.setSelected(true);
        } else if (item.getIsBoxAward()) {
            TextView textView3 = themeLayout.f25216Oooo0o.f50729OooOOoo;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvThemeType");
            o0OO00O.OooO00o(textView3, o000O0O0.OooO00o(R.color.color_FFEF9D), o000O0O0.OooO00o(R.color.color_FFCC50));
            themeLayout.f25216Oooo0o.f50716OooO0o.setImageResource(R.drawable.room_ic_theme_box_award);
            themeLayout.f25216Oooo0o.f50729OooOOoo.setText(OooOOO.OooO0OO(R.string.room_theme_mine_chest_reward));
        } else if (item.getThemeTagType() != 1 || item.getPremiumLvThemeTag() <= PremiumLevel.Premium0.getValue()) {
            LinearLayout linearLayout2 = themeLayout.f25216Oooo0o.f50721OooOO0O;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llThemeType");
            o00O0O.OooO00o(linearLayout2);
        } else {
            int premiumLvThemeTag = item.getPremiumLvThemeTag();
            if (premiumLvThemeTag == PremiumLevel.Premium1.getValue()) {
                TextView textView4 = themeLayout.f25216Oooo0o.f50729OooOOoo;
                Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvThemeType");
                o0OO00O.OooO00o(textView4, o000O0O0.OooO00o(R.color.color_FBE7D7), o000O0O0.OooO00o(R.color.color_C89272));
            } else if (premiumLvThemeTag == PremiumLevel.Premium2.getValue()) {
                TextView textView5 = themeLayout.f25216Oooo0o.f50729OooOOoo;
                Intrinsics.checkNotNullExpressionValue(textView5, "binding.tvThemeType");
                o0OO00O.OooO00o(textView5, o000O0O0.OooO00o(R.color.color_E4FEF9), o000O0O0.OooO00o(R.color.color_B9FDBB));
            } else if (premiumLvThemeTag == PremiumLevel.Premium3.getValue()) {
                TextView textView6 = themeLayout.f25216Oooo0o.f50729OooOOoo;
                Intrinsics.checkNotNullExpressionValue(textView6, "binding.tvThemeType");
                o0OO00O.OooO00o(textView6, o000O0O0.OooO00o(R.color.color_DCF5FE), o000O0O0.OooO00o(R.color.color_91D7FB));
            } else if (premiumLvThemeTag == PremiumLevel.Premium4.getValue()) {
                TextView textView7 = themeLayout.f25216Oooo0o.f50729OooOOoo;
                Intrinsics.checkNotNullExpressionValue(textView7, "binding.tvThemeType");
                o0OO00O.OooO00o(textView7, o000O0O0.OooO00o(R.color.color_F9DBE9), o000O0O0.OooO00o(R.color.color_F090B6));
            } else if (premiumLvThemeTag == PremiumLevel.Premium5.getValue()) {
                TextView textView8 = themeLayout.f25216Oooo0o.f50729OooOOoo;
                Intrinsics.checkNotNullExpressionValue(textView8, "binding.tvThemeType");
                o0OO00O.OooO00o(textView8, o000O0O0.OooO00o(R.color.color_FAE3FD), o000O0O0.OooO00o(R.color.color_F099F9));
            }
            TextView textView9 = themeLayout.f25216Oooo0o.f50729OooOOoo;
            UserPremiumView.OooO00o oooO00o = UserPremiumView.f21052OoooO00;
            textView9.setText(oooO00o.OooO0O0(item.getPremiumLvThemeTag()));
            themeLayout.f25216Oooo0o.f50716OooO0o.setImageResource(oooO00o.OooO00o(item.getPremiumLvThemeTag()));
        }
        TextView textView10 = themeLayout.f25216Oooo0o.f50722OooOO0o;
        Intrinsics.checkNotNullExpressionValue(textView10, "binding.tvActivityTheme");
        o0OO00O.OooO00o(textView10, o000O0O0.OooO00o(R.color.color_FCF), o000O0O0.OooO00o(R.color.color_D7A5F6), o000O0O0.OooO00o(R.color.color_B8F));
        TextView textView11 = themeLayout.f25216Oooo0o.f50722OooOO0o;
        Intrinsics.checkNotNullExpressionValue(textView11, "binding.tvActivityTheme");
        o00O0O.OooO(textView11);
        themeLayout.f25216Oooo0o.f50722OooOO0o.setText(item.getThemeTag());
        int themeTagType = item.getThemeTagType();
        if (themeTagType == 0) {
            TextView textView12 = themeLayout.f25216Oooo0o.f50722OooOO0o;
            Intrinsics.checkNotNullExpressionValue(textView12, "binding.tvActivityTheme");
            o00O0O.OooO00o(textView12);
            strOooO0OO = z4 ? OooOOO.OooO0OO(R.string.Purchased) : OooOOO.OooO0OO(R.string.Purchase);
        } else if (themeTagType == 1) {
            TextView textView13 = themeLayout.f25216Oooo0o.f50722OooOO0o;
            Intrinsics.checkNotNullExpressionValue(textView13, "binding.tvActivityTheme");
            o00O0O.OooO00o(textView13);
            strOooO0OO = z4 ? OooOOO.OooO0OO(R.string.Obtained) : OooOOO.OooO0OO(R.string.Obtain);
        } else if (themeTagType == 2) {
            strOooO0OO = z4 ? OooOOO.OooO0OO(R.string.Purchased) : OooOOO.OooO0OO(R.string.Purchase);
        } else if (themeTagType != 3) {
            TextView textView14 = themeLayout.f25216Oooo0o.f50722OooOO0o;
            Intrinsics.checkNotNullExpressionValue(textView14, "binding.tvActivityTheme");
            o00O0O.OooO00o(textView14);
            strOooO0OO = "";
        } else {
            strOooO0OO = z4 ? OooOOO.OooO0OO(R.string.Obtained) : OooOOO.OooO0OO(R.string.Obtain);
        }
        int i2 = R.drawable.room_ic_theme_scale_video;
        if (!z3) {
            LinearLayout linearLayout3 = themeLayout.f25216Oooo0o.f50711OooO;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.llBottomPurchase");
            o00O0O.OooO00o(linearLayout3);
            if (StringsKt.isBlank(item.getVideoPath())) {
                ImageView imageView = themeLayout.f25216Oooo0o.f50718OooO0oO;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivZoomTheme");
                o00O0O.OooO00o(imageView);
            } else {
                ImageView imageView2 = themeLayout.f25216Oooo0o.f50718OooO0oO;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivZoomTheme");
                o00O0O.OooO(imageView2);
                themeLayout.f25216Oooo0o.f50718OooO0oO.setImageResource(R.drawable.room_ic_theme_scale_video);
            }
            if (item.getTimeLong() <= -1 || item.getDayNum() <= 0) {
                return;
            }
            TextView textView15 = themeLayout.f25216Oooo0o.f50723OooOOO;
            Intrinsics.checkNotNullExpressionValue(textView15, "binding.tvRemainNum");
            o00O0O.OooO(textView15);
            themeLayout.f25216Oooo0o.f50723OooOOO.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.days_remained), String.valueOf(item.getDayNum())));
            return;
        }
        ImageView imageView3 = themeLayout.f25216Oooo0o.f50718OooO0oO;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivZoomTheme");
        o00O0O.OooO(imageView3);
        ImageView imageView4 = themeLayout.f25216Oooo0o.f50718OooO0oO;
        if (!(!StringsKt.isBlank(item.getVideoPath()))) {
            i2 = R.drawable.room_ic_theme_scale;
        }
        imageView4.setImageResource(i2);
        if (item.getIsCanGive()) {
            FrameLayout frameLayout = themeLayout.f25216Oooo0o.f50714OooO0OO;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.flSendGift");
            o00O0O.OooO(frameLayout);
            themeLayout.f25216Oooo0o.f50714OooO0OO.setOnClickListener(new o00OO0O0.OooO0O0(function2, 5));
        } else {
            FrameLayout frameLayout2 = themeLayout.f25216Oooo0o.f50714OooO0OO;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "binding.flSendGift");
            o00O0O.OooO00o(frameLayout2);
        }
        LinearLayout linearLayout4 = themeLayout.f25216Oooo0o.f50711OooO;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "binding.llBottomPurchase");
        o00O0O.OooO(linearLayout4);
        TextView textView16 = themeLayout.f25216Oooo0o.f50727OooOOo;
        Drawable drawableOooO0O0 = ((z2 && z4) || !z2 || z4) ? OooOOO.OooO0O0(R.drawable.room_shape_theme_can_not_purchase) : OooOOO.OooO0O0(R.drawable.room_shape_theme_purchase);
        textView16.setBackground(drawableOooO0O0);
        int iOooO00o = ((z2 && z4) || !z2 || z4) ? o000O0O0.OooO00o(R.color.color_321) : o000O0O0.OooO00o(R.color.color_630);
        textView16.setTextColor(iOooO00o);
        textView16.setText(strOooO0OO);
        if (z4 && item.getDayNum() > 0 && item.getTimeLong() > -1) {
            TextView textView17 = themeLayout.f25216Oooo0o.f50723OooOOO;
            Intrinsics.checkNotNullExpressionValue(textView17, "binding.tvRemainNum");
            o00O0O.OooO(textView17);
            themeLayout.f25216Oooo0o.f50723OooOOO.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.days_remained), String.valueOf(item.getDayNum())));
        }
        themeLayout.f25216Oooo0o.f50727OooOOo.setOnClickListener(new o0OO00o0(function3, 1));
    }

    public final void OooO00o(@NotNull ThemeModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f25216Oooo0o.f50726OooOOOo.setText(item.getName());
        if (item.getIsHave() == 1 || item.getLimitNum() <= 0) {
            TextView textView = this.f25216Oooo0o.f50724OooOOO0;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvLimitTime");
            o00O0O.OooO00o(textView);
        } else {
            TextView textView2 = this.f25216Oooo0o.f50724OooOOO0;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvLimitTime");
            o00O0O.OooO(textView2);
            this.f25216Oooo0o.f50724OooOOO0.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.days_special), String.valueOf(item.getLimitNum())));
        }
    }

    public final void OooO0O0(@NotNull ThemeModel item, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getDefaultDrawable()) {
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
            oooO00o.f48433OooO0oO = R.drawable.icon_room_bg;
            oooO00o.f48427OooO00o = 1;
            oooO00o.f48441OooOOOo = R.drawable.icon_room_theme_placeholder_big;
            oooO00o.OooO0oO(8);
            oooO00o.OooO0o(this.f25216Oooo0o.f50717OooO0o0);
        } else {
            try {
                this.f25216Oooo0o.f50730OooOo00.setAlpha(0.4f);
                oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
                oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(item.getPic(), OooOo00.OooO00o(165), OooOo00.OooO00o(269));
                oooO00o2.f48427OooO00o = 0;
                oooO00o2.f48441OooOOOo = R.drawable.icon_room_theme_placeholder_big;
                oooO00o2.OooO0oO(8);
                oooO00o2.f48436OooOO0O = new OooO00o();
                oooO00o2.OooO0o(this.f25216Oooo0o.f50717OooO0o0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f25216Oooo0o.f50717OooO0o0.setOnClickListener(new o00OO0O0.OooO00o(function0, 4));
    }

    public final void setSelectTheme(boolean isSelected) {
        if (isSelected) {
            FrameLayout frameLayout = this.f25216Oooo0o.f50713OooO0O0;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.flSelectedThemeBg");
            o00O0O.OooO(frameLayout);
        } else {
            FrameLayout frameLayout2 = this.f25216Oooo0o.f50713OooO0O0;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "binding.flSelectedThemeBg");
            o00O0O.OooO00o(frameLayout2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ue ueVarInflate = ue.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(ueVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25216Oooo0o = ueVarInflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeLayout(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ue ueVarInflate = ue.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(ueVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25216Oooo0o = ueVarInflate;
    }
}
