package com.yalla.yalla.ui.activity.user;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.BadgeWearActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139o00OOOo0.o00O0;
import p143o00OOooo.o00OO000;
import p168o00Ooo0.o00oO0o;
import p206o00o0o0o.o000OO0O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p649o0ooOOoo.kh;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/BadgeWearActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class BadgeWearActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final /* synthetic */ int f23311OooooOO = 0;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public o00O0 f23313Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public String[] f23314Ooooo0o;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23312OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(kh.class), this, null);

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public Map<Integer, String> f23315OooooO0 = new LinkedHashMap();

    public final kh OooOoo() {
        return (kh) this.f23312OoooOoo.getValue();
    }

    /* JADX WARN: Type inference failed for: r13v14, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r13v34, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.lang.String>] */
    public final void OooOooO() {
        Uri uriOooO00o;
        Uri uriOooO00o2;
        Uri uriOooO00o3;
        OooOo(R.string.wearing_medals);
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        if (Intrinsics.areEqual(oooOOO.OooOO0o().getValue(), Boolean.TRUE)) {
            OooOoo().f49890OooOOo.setText(o000O0O0.OooO0OO(R.string.badge_wearing_instructions_desc_new));
            OooOoo().f49879OooO0o.setImageResource(R.drawable.user_badge_wear_des_1_new);
            OooOoo().f49881OooO0oO.setImageResource(R.drawable.user_badge_wear_des_2_new);
            OooOoo().f49882OooO0oo.setImageResource(R.drawable.user_badge_wear_des_3_new);
            OooOoo().f49874OooO.setImageResource(R.drawable.user_badge_wear_des_4_new);
            OooOoo().f49883OooOO0.setImageResource(R.drawable.user_badge_wear_des_5_new);
            OooOoo().f49884OooOO0O.setImageResource(R.drawable.user_badge_wear_des_6_new);
        }
        String[] strArrOooO0Oo = o00oO0o.OooO0Oo(oooOOO.OooOO0O().getValue());
        Intrinsics.checkNotNullExpressionValue(strArrOooO0Oo, "splitMedal(Account.medal.value)");
        this.f23314Ooooo0o = strArrOooO0Oo;
        String[] strArr = null;
        if (strArrOooO0Oo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            strArrOooO0Oo = null;
        }
        if (!(strArrOooO0Oo.length == 0)) {
            String[] strArr2 = this.f23314Ooooo0o;
            if (strArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
                strArr2 = null;
            }
            String[] strArrOooO0o0 = o00oO0o.OooO0o0(strArr2[0]);
            AppCompatTextView appCompatTextView = OooOoo().f49895OooOo00;
            ?? r13 = this.f23315OooooO0;
            String str = strArrOooO0o0[1];
            Intrinsics.checkNotNullExpressionValue(str, "medalSingle[1]");
            appCompatTextView.setText((CharSequence) r13.get(Integer.valueOf(Integer.parseInt(str))));
            String str2 = strArrOooO0o0[0];
            Intrinsics.checkNotNullExpressionValue(str2, "medalSingle[0]");
            if (Integer.parseInt(str2) == 0) {
                String str3 = strArrOooO0o0[1];
                Intrinsics.checkNotNullExpressionValue(str3, "medalSingle[1]");
                int i = Integer.parseInt(str3);
                String str4 = strArrOooO0o0[2];
                Intrinsics.checkNotNullExpressionValue(str4, "medalSingle[2]");
                uriOooO00o3 = o00oO0o.OooO00o(i, Integer.parseInt(str4));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o3, "getMedalUri(medalSingle[…, medalSingle[2].toInt())");
                OooOoo().f49892OooOOoo.setText((CharSequence) null);
            } else {
                String str5 = strArrOooO0o0[1];
                Intrinsics.checkNotNullExpressionValue(str5, "medalSingle[1]");
                int i2 = Integer.parseInt(str5);
                String str6 = strArrOooO0o0[0];
                Intrinsics.checkNotNullExpressionValue(str6, "medalSingle[0]");
                Uri uriOooO00o4 = o00oO0o.OooO00o(i2, Integer.parseInt(str6));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o4, "getMedalUri(medalSingle[…, medalSingle[0].toInt())");
                OooOoo().f49892OooOOoo.setText(strArrOooO0o0[2]);
                AppCompatTextView appCompatTextView2 = OooOoo().f49892OooOOoo;
                String str7 = strArrOooO0o0[1];
                Intrinsics.checkNotNullExpressionValue(str7, "medalSingle[1]");
                appCompatTextView2.setTextColor(o000O0O0.OooO00o(o00oO0o.OooO0O0(Integer.parseInt(str7))));
                uriOooO00o3 = uriOooO00o4;
            }
            SVGAView sVGAView = OooOoo().f49885OooOO0o;
            sVGAView.f21010OooooO0 = R.drawable.icon_badge_no_pic;
            String string = uriOooO00o3.toString();
            Intrinsics.checkNotNullExpressionValue(string, "medalUri.toString()");
            sVGAView.OooO0oo(string, this);
            sVGAView.OooO();
            OooOoo().f49887OooOOO0.setSelected(true);
            OooOoo().f49895OooOo00.setTextColor(o000O0O0.OooO00o(R.color.color_122));
        } else {
            OooOoo().f49892OooOOoo.setText((CharSequence) null);
            OooOoo().f49895OooOo00.setText(o000O0O0.OooO0OO(R.string.user_badge_wear_not_worn));
            OooOoo().f49885OooOO0o.setImageResource(R.drawable.user_badge_wear_placeholder);
            OooOoo().f49887OooOOO0.setSelected(true);
            OooOoo().f49895OooOo00.setTextColor(o000O0O0.OooO00o(R.color.color_899));
        }
        String[] strArr3 = this.f23314Ooooo0o;
        if (strArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            strArr3 = null;
        }
        if (strArr3.length > 1) {
            String[] strArr4 = this.f23314Ooooo0o;
            if (strArr4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
                strArr4 = null;
            }
            String[] strArrOooO0o1 = o00oO0o.OooO0o0(strArr4[1]);
            AppCompatTextView appCompatTextView3 = OooOoo().f49896OooOo0O;
            ?? r14 = this.f23315OooooO0;
            String str8 = strArrOooO0o1[1];
            Intrinsics.checkNotNullExpressionValue(str8, "medalSingle[1]");
            appCompatTextView3.setText((CharSequence) r14.get(Integer.valueOf(Integer.parseInt(str8))));
            String str9 = strArrOooO0o1[0];
            Intrinsics.checkNotNullExpressionValue(str9, "medalSingle[0]");
            if (Integer.parseInt(str9) == 0) {
                String str10 = strArrOooO0o1[1];
                Intrinsics.checkNotNullExpressionValue(str10, "medalSingle[1]");
                int i3 = Integer.parseInt(str10);
                String str11 = strArrOooO0o1[2];
                Intrinsics.checkNotNullExpressionValue(str11, "medalSingle[2]");
                uriOooO00o2 = o00oO0o.OooO00o(i3, Integer.parseInt(str11));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o2, "getMedalUri(medalSingle[…, medalSingle[2].toInt())");
                OooOoo().f49894OooOo0.setText((CharSequence) null);
            } else {
                OooOoo().f49894OooOo0.setText(strArrOooO0o1[2]);
                AppCompatTextView appCompatTextView4 = OooOoo().f49894OooOo0;
                String str12 = strArrOooO0o1[1];
                Intrinsics.checkNotNullExpressionValue(str12, "medalSingle[1]");
                appCompatTextView4.setTextColor(o000O0O0.OooO00o(o00oO0o.OooO0O0(Integer.parseInt(str12))));
                String str13 = strArrOooO0o1[1];
                Intrinsics.checkNotNullExpressionValue(str13, "medalSingle[1]");
                int i4 = Integer.parseInt(str13);
                String str14 = strArrOooO0o1[0];
                Intrinsics.checkNotNullExpressionValue(str14, "medalSingle[0]");
                uriOooO00o2 = o00oO0o.OooO00o(i4, Integer.parseInt(str14));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o2, "getMedalUri(medalSingle[…, medalSingle[0].toInt())");
            }
            SVGAView sVGAView2 = OooOoo().f49886OooOOO;
            sVGAView2.f21010OooooO0 = R.drawable.icon_badge_no_pic;
            String string2 = uriOooO00o2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "medalUri.toString()");
            sVGAView2.OooO0oo(string2, this);
            sVGAView2.OooO();
            OooOoo().f49888OooOOOO.setSelected(true);
            OooOoo().f49896OooOo0O.setTextColor(o000O0O0.OooO00o(R.color.color_122));
        } else {
            OooOoo().f49894OooOo0.setText((CharSequence) null);
            OooOoo().f49896OooOo0O.setText(o000O0O0.OooO0OO(R.string.user_badge_wear_not_worn));
            OooOoo().f49886OooOOO.setImageResource(R.drawable.user_badge_wear_placeholder);
            AppCompatImageView appCompatImageView = OooOoo().f49888OooOOOO;
            String[] strArr5 = this.f23314Ooooo0o;
            if (strArr5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
                strArr5 = null;
            }
            appCompatImageView.setSelected(!(strArr5.length == 0));
            OooOoo().f49896OooOo0O.setTextColor(o000O0O0.OooO00o(R.color.color_899));
        }
        String[] strArr6 = this.f23314Ooooo0o;
        if (strArr6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            strArr6 = null;
        }
        if (strArr6.length > 2) {
            String[] strArr7 = this.f23314Ooooo0o;
            if (strArr7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
                strArr7 = null;
            }
            String[] strArrOooO0o2 = o00oO0o.OooO0o0(strArr7[2]);
            AppCompatTextView appCompatTextView5 = OooOoo().f49893OooOo;
            ?? r15 = this.f23315OooooO0;
            String str15 = strArrOooO0o2[1];
            Intrinsics.checkNotNullExpressionValue(str15, "medalSingle[1]");
            appCompatTextView5.setText((CharSequence) r15.get(Integer.valueOf(Integer.parseInt(str15))));
            String str16 = strArrOooO0o2[0];
            Intrinsics.checkNotNullExpressionValue(str16, "medalSingle[0]");
            if (Integer.parseInt(str16) == 0) {
                String str17 = strArrOooO0o2[1];
                Intrinsics.checkNotNullExpressionValue(str17, "medalSingle[1]");
                int i5 = Integer.parseInt(str17);
                String str18 = strArrOooO0o2[2];
                Intrinsics.checkNotNullExpressionValue(str18, "medalSingle[2]");
                uriOooO00o = o00oO0o.OooO00o(i5, Integer.parseInt(str18));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o, "getMedalUri(medalSingle[…, medalSingle[2].toInt())");
                OooOoo().f49897OooOo0o.setText((CharSequence) null);
            } else {
                OooOoo().f49897OooOo0o.setText(strArrOooO0o2[2]);
                AppCompatTextView appCompatTextView6 = OooOoo().f49897OooOo0o;
                String str19 = strArrOooO0o2[1];
                Intrinsics.checkNotNullExpressionValue(str19, "medalSingle[1]");
                appCompatTextView6.setTextColor(o000O0O0.OooO00o(o00oO0o.OooO0O0(Integer.parseInt(str19))));
                String str20 = strArrOooO0o2[1];
                Intrinsics.checkNotNullExpressionValue(str20, "medalSingle[1]");
                int i6 = Integer.parseInt(str20);
                String str21 = strArrOooO0o2[0];
                Intrinsics.checkNotNullExpressionValue(str21, "medalSingle[0]");
                uriOooO00o = o00oO0o.OooO00o(i6, Integer.parseInt(str21));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o, "getMedalUri(medalSingle[…, medalSingle[0].toInt())");
            }
            SVGAView sVGAView3 = OooOoo().f49889OooOOOo;
            sVGAView3.f21010OooooO0 = R.drawable.icon_badge_no_pic;
            String string3 = uriOooO00o.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "medalUri.toString()");
            sVGAView3.OooO0oo(string3, this);
            sVGAView3.OooO();
            OooOoo().f49891OooOOo0.setSelected(true);
            OooOoo().f49893OooOo.setTextColor(o000O0O0.OooO00o(R.color.color_122));
        } else {
            OooOoo().f49897OooOo0o.setText((CharSequence) null);
            OooOoo().f49893OooOo.setText(o000O0O0.OooO0OO(R.string.user_badge_wear_not_worn));
            OooOoo().f49889OooOOOo.setImageResource(R.drawable.user_badge_wear_placeholder);
            AppCompatImageView appCompatImageView2 = OooOoo().f49891OooOOo0;
            String[] strArr8 = this.f23314Ooooo0o;
            if (strArr8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            } else {
                strArr = strArr8;
            }
            appCompatImageView2.setSelected(strArr.length > 1);
            OooOoo().f49893OooOo.setTextColor(o000O0O0.OooO00o(R.color.color_899));
        }
        OooOoo().f49877OooO0OO.setOnClickListener(this);
        OooOoo().f49878OooO0Oo.setOnClickListener(this);
        OooOoo().f49880OooO0o0.setOnClickListener(this);
    }

    public final void OooOooo(int i) {
        if (this.f23313Ooooo00 == null) {
            o00O0 o00o1 = new o00O0(this);
            this.f23313Ooooo00 = o00o1;
            o00o1.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0oOo00O.o00000OO
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    BadgeWearActivity this$0 = this.f45193Oooo0o;
                    int i2 = BadgeWearActivity.f23311OooooOO;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.OooOooO();
                }
            });
        }
        int[] iArr = new int[2];
        OooOoo().f49876OooO0O0.getLocationOnScreen(iArr);
        int iOooO0oO = (o000OO0O.OooO0oO() - iArr[1]) - OooOoo().f49876OooO0O0.getHeight();
        o00O0 o00o2 = this.f23313Ooooo00;
        Intrinsics.checkNotNull(o00o2);
        o00o2.f31812OoooO0 = i;
        if (iOooO0oO <= com.yalla.support.common.util.OooOo00.OooO00o(280.0f)) {
            iOooO0oO = com.yalla.support.common.util.OooOo00.OooO00o(580.0f);
        }
        WindowManager.LayoutParams attributes = o00o2.getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = iOooO0oO;
        o00o2.getWindow().setAttributes(attributes);
        o00O0 o00o3 = this.f23313Ooooo00;
        Intrinsics.checkNotNull(o00o3);
        o00o3.show();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoo().f49877OooO0OO)) {
            OooOooo(0);
            return;
        }
        String[] strArr = null;
        if (Intrinsics.areEqual(view, OooOoo().f49878OooO0Oo)) {
            String[] strArr2 = this.f23314Ooooo0o;
            if (strArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            } else {
                strArr = strArr2;
            }
            if (!(strArr.length == 0)) {
                OooOooo(1);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(view, OooOoo().f49880OooO0o0)) {
            String[] strArr3 = this.f23314Ooooo0o;
            if (strArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            } else {
                strArr = strArr3;
            }
            if (strArr.length > 1) {
                OooOooo(2);
            }
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f49875OooO00o);
        LiveEventBus.get("Wear_badge_page").observeSticky(this, new o00OO000(this, 4));
    }
}
