package com.yalla.yalla.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.yalla.netimage.listener.OooOO0O;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.ui.fragment.room.o00oO0o;
import com.yalla.yalla.ui.fragment.room.oo000o;
import com.yalla.yalla.ui.view.ThemeLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p370o0OOo0Oo.Oooo000;
import p407o0Oo0OOO.O0OO00;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.o0ooOOo;
import p565o0oOo000.oo0o0Oo;
import p587o0oOooO.oO00Oo00;
import p675oO0Oo.b3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/ui/view/ThemeLayout;", "Landroid/widget/FrameLayout;", "", "isSelected", "", "setSelectTheme", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "def", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class ThemeLayout extends FrameLayout {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f30223OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final O0OO00 f30224OooO0Oo;

    public static final class OooO00o extends OooOO0O {
        public OooO00o() {
        }

        @Override // com.yalla.netimage.listener.OooOO0O
        public final void OooO0O0(int i, boolean z) {
            if (z) {
                ThemeLayout.this.f30224OooO0Oo.f43696OooOo00.setAlpha(1.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        O0OO00 o0oo00Inflate = O0OO00.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(o0oo00Inflate, "inflate(...)");
        this.f30224OooO0Oo = o0oo00Inflate;
    }

    public static void OooO0OO(ThemeLayout themeLayout, ThemeModel item, boolean z, oo000o oo000oVar, o00oO0o o00oo0o2, int i) {
        String strOooO0OO;
        boolean z2 = (i & 2) != 0 ? false : z;
        boolean z3 = (i & 4) != 0;
        final oo000o oo000oVar2 = (i & 8) != 0 ? null : oo000oVar;
        final o00oO0o o00oo0o3 = (i & 16) == 0 ? o00oo0o2 : null;
        Intrinsics.checkNotNullParameter(item, "item");
        O0OO00 o0oo00 = themeLayout.f30224OooO0Oo;
        TextView tvRemainNum = o0oo00.f43689OooOOO;
        Intrinsics.checkNotNullExpressionValue(tvRemainNum, "tvRemainNum");
        o000O.OooO0O0(tvRemainNum);
        LinearLayout llThemeType = o0oo00.f43687OooOO0O;
        Intrinsics.checkNotNullExpressionValue(llThemeType, "llThemeType");
        o000O.OooOOOO(llThemeType);
        boolean isRoomTeamAward = item.getIsRoomTeamAward();
        ImageView imageView = o0oo00.f43682OooO0o;
        TextView textView = o0oo00.f43695OooOOoo;
        if (isRoomTeamAward) {
            Intrinsics.checkNotNullExpressionValue(textView, "tvThemeType");
            oO00Oo00.OooO00o(textView, o0000.OooO00o(o0ooOOo.color_FFEE63), o0000.OooO00o(o0ooOOo.color_FFA907));
            imageView.setImageResource(oo0o0Oo.ic_room_member_host);
            textView.setText(o0000.OooO0OO(o000OOo.room_theme_mine_member_group_reward));
            textView.setSelected(true);
        } else if (item.getIsBoxAward()) {
            Intrinsics.checkNotNullExpressionValue(textView, "tvThemeType");
            oO00Oo00.OooO00o(textView, o0000.OooO00o(o0ooOOo.color_FFEF9D), o0000.OooO00o(o0ooOOo.color_FFCC50));
            imageView.setImageResource(o0OOO0o.room_ic_theme_box_award);
            textView.setText(o0000.OooO0OO(o000OOo.room_theme_mine_chest_reward));
        } else if (item.getThemeTagType() != 1 || item.getPremiumLvThemeTag() <= PremiumLevel.Premium0.getValue()) {
            Intrinsics.checkNotNullExpressionValue(llThemeType, "llThemeType");
            o000O.OooO0O0(llThemeType);
        } else {
            int i2 = UserPremiumView.f30267OooO0o0;
            int premiumLvThemeTag = item.getPremiumLvThemeTag();
            Intrinsics.checkNotNullExpressionValue(textView, "tvThemeType");
            Intrinsics.checkNotNullParameter(textView, "textView");
            int i3 = UserPremiumView.OooO00o.C0342OooO00o.$EnumSwitchMapping$0[PremiumLevel.INSTANCE.of(Integer.valueOf(premiumLvThemeTag)).ordinal()];
            if (i3 == 2) {
                oO00Oo00.OooO00o(textView, o0000.OooO00o(o0ooOOo.color_FBE7D7), o0000.OooO00o(o0ooOOo.color_C89272));
            } else if (i3 == 3) {
                oO00Oo00.OooO00o(textView, o0000.OooO00o(o0ooOOo.color_E4FEF9), o0000.OooO00o(o0ooOOo.color_B9FDBB));
            } else if (i3 == 4) {
                oO00Oo00.OooO00o(textView, o0000.OooO00o(o0ooOOo.color_DCF5FE), o0000.OooO00o(o0ooOOo.color_91D7FB));
            } else if (i3 == 5) {
                oO00Oo00.OooO00o(textView, o0000.OooO00o(o0ooOOo.color_F9DBE9), o0000.OooO00o(o0ooOOo.color_F090B6));
            } else if (i3 == 6) {
                oO00Oo00.OooO00o(textView, o0000.OooO00o(o0ooOOo.color_FAE3FD), o0000.OooO00o(o0ooOOo.color_F099F9));
            }
            textView.setText(UserPremiumView.OooO00o.OooO0O0(item.getPremiumLvThemeTag()));
            imageView.setImageResource(UserPremiumView.OooO00o.OooO00o(item.getPremiumLvThemeTag()));
        }
        TextView tvActivityTheme = o0oo00.f43688OooOO0o;
        Intrinsics.checkNotNullExpressionValue(tvActivityTheme, "tvActivityTheme");
        oO00Oo00.OooO00o(tvActivityTheme, o0000.OooO00o(o0ooOOo.color_FCF), o0000.OooO00o(o0ooOOo.color_D7A5F6), o0000.OooO00o(o0ooOOo.color_B8F));
        Intrinsics.checkNotNullExpressionValue(tvActivityTheme, "tvActivityTheme");
        o000O.OooOOOO(tvActivityTheme);
        tvActivityTheme.setText(item.getThemeTag());
        boolean z4 = item.getIsHave() == 1;
        int themeTagType = item.getThemeTagType();
        if (themeTagType == 0) {
            Intrinsics.checkNotNullExpressionValue(tvActivityTheme, "tvActivityTheme");
            o000O.OooO0O0(tvActivityTheme);
            strOooO0OO = o0000.OooO0OO(z4 ? o000OOo.Purchased : o000OOo.Purchase);
        } else if (themeTagType == 1) {
            Intrinsics.checkNotNullExpressionValue(tvActivityTheme, "tvActivityTheme");
            o000O.OooO0O0(tvActivityTheme);
            strOooO0OO = o0000.OooO0OO(z4 ? o000OOo.Obtained : o000OOo.Obtain);
        } else if (themeTagType == 2) {
            strOooO0OO = o0000.OooO0OO(z4 ? o000OOo.Purchased : o000OOo.Purchase);
        } else if (themeTagType != 3) {
            Intrinsics.checkNotNullExpressionValue(tvActivityTheme, "tvActivityTheme");
            o000O.OooO0O0(tvActivityTheme);
            strOooO0OO = "";
        } else {
            strOooO0OO = o0000.OooO0OO(z4 ? o000OOo.Obtained : o000OOo.Obtain);
        }
        TextView tvRemainNum2 = o0oo00.f43689OooOOO;
        LinearLayout llBottomPurchase = o0oo00.f43677OooO;
        ImageView ivZoomTheme = o0oo00.f43684OooO0oO;
        if (!z3) {
            Intrinsics.checkNotNullExpressionValue(llBottomPurchase, "llBottomPurchase");
            o000O.OooO0O0(llBottomPurchase);
            if (StringsKt.isBlank(item.getVideoPath())) {
                Intrinsics.checkNotNullExpressionValue(ivZoomTheme, "ivZoomTheme");
                o000O.OooO0O0(ivZoomTheme);
            } else {
                Intrinsics.checkNotNullExpressionValue(ivZoomTheme, "ivZoomTheme");
                o000O.OooOOOO(ivZoomTheme);
                ivZoomTheme.setImageResource(o0OOO0o.room_ic_theme_scale_video);
            }
            if (item.getTimeLong() <= -1 || item.getDayNum() <= 0) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(tvRemainNum2, "tvRemainNum");
            o000O.OooOOOO(tvRemainNum2);
            tvRemainNum2.setText(o0000O.OooO00o(o0000.OooO0OO(o000OOo.days_remained), String.valueOf(item.getDayNum())));
            return;
        }
        Intrinsics.checkNotNullExpressionValue(ivZoomTheme, "ivZoomTheme");
        o000O.OooOOOO(ivZoomTheme);
        ivZoomTheme.setImageResource(StringsKt.isBlank(item.getVideoPath()) ^ true ? o0OOO0o.room_ic_theme_scale_video : o0OOO0o.room_ic_theme_scale);
        boolean isCanGive = item.getIsCanGive();
        FrameLayout flSendGift = o0oo00.f43680OooO0OO;
        if (isCanGive) {
            Intrinsics.checkNotNullExpressionValue(flSendGift, "flSendGift");
            o000O.OooOOOO(flSendGift);
            flSendGift.setOnClickListener(new View.OnClickListener() { // from class: o0o0Ooo0.oO0O00
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = ThemeLayout.f30223OooO0o0;
                    Function0 function0 = oo000oVar2;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            });
        } else {
            Intrinsics.checkNotNullExpressionValue(flSendGift, "flSendGift");
            o000O.OooO0O0(flSendGift);
        }
        Intrinsics.checkNotNullExpressionValue(llBottomPurchase, "llBottomPurchase");
        o000O.OooOOOO(llBottomPurchase);
        Drawable drawableOooO0O0 = ((z2 && z4) || !z2 || z4) ? o0000.OooO0O0(o0OOO0o.room_shape_theme_can_not_purchase) : o0000.OooO0O0(o0OOO0o.room_shape_theme_purchase);
        TextView textView2 = o0oo00.f43693OooOOo;
        textView2.setBackground(drawableOooO0O0);
        int iOooO00o = ((z2 && z4) || !z2 || z4) ? o0000.OooO00o(o0ooOOo.color_321) : o0000.OooO00o(o0ooOOo.color_630);
        textView2.setTextColor(iOooO00o);
        textView2.setText(strOooO0OO);
        if (z4 && item.getDayNum() > 0 && item.getTimeLong() > -1) {
            Intrinsics.checkNotNullExpressionValue(tvRemainNum2, "tvRemainNum");
            o000O.OooOOOO(tvRemainNum2);
            tvRemainNum2.setText(o0000O.OooO00o(o0000.OooO0OO(o000OOo.days_remained), String.valueOf(item.getDayNum())));
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: o0o0Ooo0.oO0O00O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = ThemeLayout.f30223OooO0o0;
                Function0 function0 = o00oo0o3;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
    }

    public final void OooO00o(@NotNull ThemeModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        O0OO00 o0oo00 = this.f30224OooO0Oo;
        o0oo00.f43692OooOOOo.setText(item.getName());
        if (item.getIsHave() == 1 || item.getLimitNum() <= 0) {
            TextView tvLimitTime = o0oo00.f43690OooOOO0;
            Intrinsics.checkNotNullExpressionValue(tvLimitTime, "tvLimitTime");
            o000O.OooO0O0(tvLimitTime);
        } else {
            TextView tvLimitTime2 = o0oo00.f43690OooOOO0;
            Intrinsics.checkNotNullExpressionValue(tvLimitTime2, "tvLimitTime");
            o000O.OooOOOO(tvLimitTime2);
            o0oo00.f43690OooOOO0.setText(o0000O.OooO00o(o0000.OooO0OO(o000OOo.days_special), String.valueOf(item.getLimitNum())));
        }
    }

    public final void OooO0O0(@NotNull ThemeModel item, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean defaultDrawable = item.getDefaultDrawable();
        O0OO00 o0oo00 = this.f30224OooO0Oo;
        if (defaultDrawable) {
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(getContext());
            oooO00o.f43131OooO0oO = o0OOO0o.icon_room_bg;
            oooO00o.f43125OooO00o = 1;
            oooO00o.f43139OooOOOo = o0OOO0o.icon_room_theme_placeholder_big;
            oooO00o.OooO0o0(8);
            oooO00o.OooO0Oo(o0oo00.f43683OooO0o0);
        } else {
            try {
                o0oo00.f43696OooOo00.setAlpha(0.4f);
                Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(getContext());
                oooO00o2.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(o0000O0.OooO00o(165), o0000O0.OooO00o(269), item.getPic());
                oooO00o2.f43125OooO00o = 0;
                oooO00o2.f43139OooOOOo = o0OOO0o.icon_room_theme_placeholder_big;
                oooO00o2.OooO0o0(8);
                oooO00o2.f43134OooOO0O = new OooO00o();
                oooO00o2.OooO0Oo(o0oo00.f43683OooO0o0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        o0oo00.f43683OooO0o0.setOnClickListener(new b3(function0, 1));
    }

    public final void setSelectTheme(boolean isSelected) {
        O0OO00 o0oo00 = this.f30224OooO0Oo;
        if (isSelected) {
            FrameLayout flSelectedThemeBg = o0oo00.f43679OooO0O0;
            Intrinsics.checkNotNullExpressionValue(flSelectedThemeBg, "flSelectedThemeBg");
            o000O.OooOOOO(flSelectedThemeBg);
        } else {
            FrameLayout flSelectedThemeBg2 = o0oo00.f43679OooO0O0;
            Intrinsics.checkNotNullExpressionValue(flSelectedThemeBg2, "flSelectedThemeBg");
            o000O.OooO0O0(flSelectedThemeBg2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        O0OO00 o0oo00Inflate = O0OO00.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(o0oo00Inflate, "inflate(...)");
        this.f30224OooO0Oo = o0oo00Inflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeLayout(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        O0OO00 o0oo00Inflate = O0OO00.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(o0oo00Inflate, "inflate(...)");
        this.f30224OooO0Oo = o0oo00Inflate;
    }
}
