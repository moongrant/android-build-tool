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
import com.code.android.util.o000OO00;
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
import oO0OO.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p579o0oOoo.oO00O0o;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.k7;
import p648o0ooo.o00Ooo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\b\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/ui/view/ThemeLayout;", "Landroid/widget/FrameLayout;", "", "isSelected", "", "setSelectTheme", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "def", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class ThemeLayout extends FrameLayout {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f30758OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final k7 f30759OooO0Oo;

    public static final class OooO00o extends OooOO0O {
        public OooO00o() {
        }

        @Override // com.yalla.netimage.listener.OooOO0O
        public final void OooO0O0(int i, boolean z) {
            if (z) {
                ThemeLayout.this.f30759OooO0Oo.f58298OooOo00.setAlpha(1.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        k7 k7VarInflate = k7.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(k7VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f30759OooO0Oo = k7VarInflate;
    }

    public static void OooO0OO(ThemeLayout themeLayout, ThemeModel item, boolean z, oo000o oo000oVar, o00oO0o o00oo0o2, int i) {
        String strOooO0OO;
        boolean z2 = (i & 2) != 0 ? false : z;
        boolean z3 = (i & 4) != 0;
        oo000o oo000oVar2 = (i & 8) != 0 ? null : oo000oVar;
        final o00oO0o o00oo0o3 = (i & 16) == 0 ? o00oo0o2 : null;
        Intrinsics.checkNotNullParameter(item, "item");
        k7 k7Var = themeLayout.f30759OooO0Oo;
        TextView textView = k7Var.f58291OooOOO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvRemainNum");
        o000OO00.OooO0O0(textView);
        LinearLayout linearLayout = k7Var.f58289OooOO0O;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llThemeType");
        o000OO00.OooOOOO(linearLayout);
        boolean isRoomTeamAward = item.getIsRoomTeamAward();
        ImageView imageView = k7Var.f58284OooO0o;
        TextView textView2 = k7Var.f58297OooOOoo;
        if (isRoomTeamAward) {
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvThemeType");
            oO00O0o.OooO00o(textView2, o0000.OooO00o(p584o0oOooO0.oO00O0o.color_FFEE63), o0000.OooO00o(p584o0oOooO0.oO00O0o.color_FFA907));
            imageView.setImageResource(oO00OOO.ic_room_member_host);
            textView2.setText(o0000.OooO0OO(oO00OOo0.room_theme_mine_member_group_reward));
            textView2.setSelected(true);
        } else if (item.getIsBoxAward()) {
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvThemeType");
            oO00O0o.OooO00o(textView2, o0000.OooO00o(p584o0oOooO0.oO00O0o.color_FFEF9D), o0000.OooO00o(p584o0oOooO0.oO00O0o.color_FFCC50));
            imageView.setImageResource(oOo00OO0.room_ic_theme_box_award);
            textView2.setText(o0000.OooO0OO(oO00OOo0.room_theme_mine_chest_reward));
        } else if (item.getThemeTagType() != 1 || item.getPremiumLvThemeTag() <= PremiumLevel.Premium0.getValue()) {
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llThemeType");
            o000OO00.OooO0O0(linearLayout);
        } else {
            int i2 = UserPremiumView.f30802OooO0o0;
            int premiumLvThemeTag = item.getPremiumLvThemeTag();
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvThemeType");
            Intrinsics.checkNotNullParameter(textView2, "textView");
            int i3 = UserPremiumView.OooO00o.C0343OooO00o.$EnumSwitchMapping$0[PremiumLevel.INSTANCE.of(Integer.valueOf(premiumLvThemeTag)).ordinal()];
            if (i3 == 2) {
                oO00O0o.OooO00o(textView2, o0000.OooO00o(p584o0oOooO0.oO00O0o.color_FBE7D7), o0000.OooO00o(p584o0oOooO0.oO00O0o.color_C89272));
            } else if (i3 == 3) {
                oO00O0o.OooO00o(textView2, o0000.OooO00o(p584o0oOooO0.oO00O0o.color_E4FEF9), o0000.OooO00o(p584o0oOooO0.oO00O0o.color_B9FDBB));
            } else if (i3 == 4) {
                oO00O0o.OooO00o(textView2, o0000.OooO00o(p584o0oOooO0.oO00O0o.color_DCF5FE), o0000.OooO00o(p584o0oOooO0.oO00O0o.color_91D7FB));
            } else if (i3 == 5) {
                oO00O0o.OooO00o(textView2, o0000.OooO00o(p584o0oOooO0.oO00O0o.color_F9DBE9), o0000.OooO00o(p584o0oOooO0.oO00O0o.color_F090B6));
            } else if (i3 == 6) {
                oO00O0o.OooO00o(textView2, o0000.OooO00o(p584o0oOooO0.oO00O0o.color_FAE3FD), o0000.OooO00o(p584o0oOooO0.oO00O0o.color_F099F9));
            }
            textView2.setText(UserPremiumView.OooO00o.OooO0O0(item.getPremiumLvThemeTag()));
            imageView.setImageResource(UserPremiumView.OooO00o.OooO00o(item.getPremiumLvThemeTag()));
        }
        TextView textView3 = k7Var.f58290OooOO0o;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvActivityTheme");
        oO00O0o.OooO00o(textView3, o0000.OooO00o(p584o0oOooO0.oO00O0o.color_FCF), o0000.OooO00o(p584o0oOooO0.oO00O0o.color_D7A5F6), o0000.OooO00o(p584o0oOooO0.oO00O0o.color_B8F));
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvActivityTheme");
        o000OO00.OooOOOO(textView3);
        textView3.setText(item.getThemeTag());
        boolean z4 = item.getIsHave() == 1;
        int themeTagType = item.getThemeTagType();
        if (themeTagType == 0) {
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvActivityTheme");
            o000OO00.OooO0O0(textView3);
            strOooO0OO = o0000.OooO0OO(z4 ? oO00OOo0.Purchased : oO00OOo0.Purchase);
        } else if (themeTagType == 1) {
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvActivityTheme");
            o000OO00.OooO0O0(textView3);
            strOooO0OO = o0000.OooO0OO(z4 ? oO00OOo0.Obtained : oO00OOo0.Obtain);
        } else if (themeTagType == 2) {
            strOooO0OO = o0000.OooO0OO(z4 ? oO00OOo0.Purchased : oO00OOo0.Purchase);
        } else if (themeTagType != 3) {
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvActivityTheme");
            o000OO00.OooO0O0(textView3);
            strOooO0OO = "";
        } else {
            strOooO0OO = o0000.OooO0OO(z4 ? oO00OOo0.Obtained : oO00OOo0.Obtain);
        }
        TextView textView4 = k7Var.f58291OooOOO;
        LinearLayout linearLayout2 = k7Var.f58279OooO;
        ImageView imageView2 = k7Var.f58286OooO0oO;
        if (!z3) {
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llBottomPurchase");
            o000OO00.OooO0O0(linearLayout2);
            if (StringsKt.isBlank(item.getVideoPath())) {
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivZoomTheme");
                o000OO00.OooO0O0(imageView2);
            } else {
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivZoomTheme");
                o000OO00.OooOOOO(imageView2);
                imageView2.setImageResource(oOo00OO0.room_ic_theme_scale_video);
            }
            if (item.getTimeLong() <= -1 || item.getDayNum() <= 0) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvRemainNum");
            o000OO00.OooOOOO(textView4);
            textView4.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.days_remained), String.valueOf(item.getDayNum())));
            return;
        }
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivZoomTheme");
        o000OO00.OooOOOO(imageView2);
        imageView2.setImageResource(StringsKt.isBlank(item.getVideoPath()) ^ true ? oOo00OO0.room_ic_theme_scale_video : oOo00OO0.room_ic_theme_scale);
        boolean isCanGive = item.getIsCanGive();
        FrameLayout frameLayout = k7Var.f58282OooO0OO;
        if (isCanGive) {
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.flSendGift");
            o000OO00.OooOOOO(frameLayout);
            frameLayout.setOnClickListener(new OooOO0(oo000oVar2, 1));
        } else {
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.flSendGift");
            o000OO00.OooO0O0(frameLayout);
        }
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llBottomPurchase");
        o000OO00.OooOOOO(linearLayout2);
        Drawable drawableOooO0O0 = ((z2 && z4) || !z2 || z4) ? o0000.OooO0O0(oOo00OO0.room_shape_theme_can_not_purchase) : o0000.OooO0O0(oOo00OO0.room_shape_theme_purchase);
        TextView textView5 = k7Var.f58295OooOOo;
        textView5.setBackground(drawableOooO0O0);
        int iOooO00o = ((z2 && z4) || !z2 || z4) ? o0000.OooO00o(p584o0oOooO0.oO00O0o.color_321) : o0000.OooO00o(p584o0oOooO0.oO00O0o.color_630);
        textView5.setTextColor(iOooO00o);
        textView5.setText(strOooO0OO);
        if (z4 && item.getDayNum() > 0 && item.getTimeLong() > -1) {
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvRemainNum");
            o000OO00.OooOOOO(textView4);
            textView4.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.days_remained), String.valueOf(item.getDayNum())));
        }
        textView5.setOnClickListener(new View.OnClickListener() { // from class: o0o0OoOO.d3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = ThemeLayout.f30758OooO0o0;
                Function0 function0 = o00oo0o3;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
    }

    public final void OooO00o(@NotNull ThemeModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        k7 k7Var = this.f30759OooO0Oo;
        k7Var.f58294OooOOOo.setText(item.getName());
        if (item.getIsHave() == 1 || item.getLimitNum() <= 0) {
            TextView textView = k7Var.f58292OooOOO0;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvLimitTime");
            o000OO00.OooO0O0(textView);
        } else {
            TextView textView2 = k7Var.f58292OooOOO0;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvLimitTime");
            o000OO00.OooOOOO(textView2);
            k7Var.f58292OooOOO0.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.days_special), String.valueOf(item.getLimitNum())));
        }
    }

    public final void OooO0O0(@NotNull ThemeModel item, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean defaultDrawable = item.getDefaultDrawable();
        int i = 1;
        k7 k7Var = this.f30759OooO0Oo;
        if (defaultDrawable) {
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(getContext());
            oooO00o.f43915OooO0oO = oOo00OO0.icon_room_bg;
            oooO00o.f43909OooO00o = 1;
            oooO00o.f43923OooOOOo = oOo00OO0.icon_room_theme_placeholder_big;
            oooO00o.OooO0o0(8);
            oooO00o.OooO0Oo(k7Var.f58285OooO0o0);
        } else {
            try {
                k7Var.f58298OooOo00.setAlpha(0.4f);
                o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(getContext());
                oooO00o2.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(o0000O0.OooO00o(165), o0000O0.OooO00o(269), item.getPic());
                oooO00o2.f43909OooO00o = 0;
                oooO00o2.f43923OooOOOo = oOo00OO0.icon_room_theme_placeholder_big;
                oooO00o2.OooO0o0(8);
                oooO00o2.f43918OooOO0O = new OooO00o();
                oooO00o2.OooO0Oo(k7Var.f58285OooO0o0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        k7Var.f58285OooO0o0.setOnClickListener(new o00Ooo(function0, i));
    }

    public final void setSelectTheme(boolean isSelected) {
        k7 k7Var = this.f30759OooO0Oo;
        if (isSelected) {
            FrameLayout frameLayout = k7Var.f58281OooO0O0;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.flSelectedThemeBg");
            o000OO00.OooOOOO(frameLayout);
        } else {
            FrameLayout frameLayout2 = k7Var.f58281OooO0O0;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "binding.flSelectedThemeBg");
            o000OO00.OooO0O0(frameLayout2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        k7 k7VarInflate = k7.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(k7VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f30759OooO0Oo = k7VarInflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeLayout(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        k7 k7VarInflate = k7.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(k7VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f30759OooO0Oo = k7VarInflate;
    }
}
