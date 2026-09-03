package com.yalla.yalla.ui.activity.user;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000O00;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.BaseActivityK;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.p1;
import p471o0OoooO0.o0OoOoOo;
import p475o0Ooooo0.o0O00oO0;
import p492o0o00OO0.o0OO00o0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.O0O0;
import p650o0ooo.n0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/BadgeWearActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBadgeWearActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeWearActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeWearActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n22#2,2:179\n1855#3,2:181\n*S KotlinDebug\n*F\n+ 1 BadgeWearActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeWearActivity\n*L\n29#1:179,2\n40#1:181,2\n*E\n"})
public final class BadgeWearActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f26633OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public String[] f26635OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public n0 f26636OooOo00;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26634OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(p1.class), this, null);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f26637OooOo0O = new LinkedHashMap();

    public final p1 OooOo() {
        return (p1) this.f26634OooOOoo.getValue();
    }

    public final void OooOoO(int i) {
        if (this.f26636OooOo00 == null) {
            n0 n0Var = new n0(this);
            this.f26636OooOo00 = n0Var;
            n0Var.setOnDismissListener(new o0OO00o0(this, 1));
        }
        int[] iArr = new int[2];
        OooOo().f45362OooO0O0.getLocationOnScreen(iArr);
        int iOooO0O0 = (o0000O00.OooO0O0() - iArr[1]) - OooOo().f45362OooO0O0.getHeight();
        n0 n0Var2 = this.f26636OooOo00;
        Intrinsics.checkNotNull(n0Var2);
        n0Var2.f58403OooO = i;
        if (iOooO0O0 <= o0000O0.OooO00o(280.0f)) {
            iOooO0O0 = o0000O0.OooO00o(580.0f);
        }
        WindowManager.LayoutParams attributes = n0Var2.getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = iOooO0O0;
        n0Var2.getWindow().setAttributes(attributes);
        n0 n0Var3 = this.f26636OooOo00;
        Intrinsics.checkNotNull(n0Var3);
        n0Var3.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO0() {
        Uri uriOooO00o;
        Uri uriOooO00o2;
        Uri uriOooO00o3;
        OooOOoo(o000000.wearing_medals);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(((MutableLiveData) o0O00oO0.f47971Oooo0O0.getValue()).getValue(), Boolean.TRUE)) {
            OooOo().f45376OooOOo.setText(o0000.OooO0OO(o000000.badge_wearing_instructions_desc_new));
            OooOo().f45365OooO0o.setImageResource(o0Oo0oo.user_badge_wear_des_1_new);
            OooOo().f45367OooO0oO.setImageResource(o0Oo0oo.user_badge_wear_des_2_new);
            OooOo().f45368OooO0oo.setImageResource(o0Oo0oo.user_badge_wear_des_3_new);
            OooOo().f45360OooO.setImageResource(o0Oo0oo.user_badge_wear_des_4_new);
            OooOo().f45369OooOO0.setImageResource(o0Oo0oo.user_badge_wear_des_5_new);
            OooOo().f45370OooOO0O.setImageResource(o0Oo0oo.user_badge_wear_des_6_new);
        }
        String[] strArrOooO0Oo = O0O0.OooO0Oo((String) o0O00oO0.OooOO0O().getValue());
        Intrinsics.checkNotNullExpressionValue(strArrOooO0Oo, "splitMedal(...)");
        this.f26635OooOo0 = strArrOooO0Oo;
        String[] strArr = null;
        if (strArrOooO0Oo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            strArrOooO0Oo = null;
        }
        boolean z = !(strArrOooO0Oo.length == 0);
        LinkedHashMap linkedHashMap = this.f26637OooOo0O;
        if (z) {
            String[] strArr2 = this.f26635OooOo0;
            if (strArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
                strArr2 = null;
            }
            String[] strArrSplit = strArr2[0].split("_");
            AppCompatTextView appCompatTextView = OooOo().f45381OooOo00;
            String str = strArrSplit[1];
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            appCompatTextView.setText((CharSequence) linkedHashMap.get(Integer.valueOf(Integer.parseInt(str))));
            String str2 = strArrSplit[0];
            Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
            if (Integer.parseInt(str2) == 0) {
                String str3 = strArrSplit[1];
                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                int i = Integer.parseInt(str3);
                String str4 = strArrSplit[2];
                Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
                uriOooO00o3 = O0O0.OooO00o(i, Integer.parseInt(str4));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o3, "getMedalUri(...)");
                OooOo().f45378OooOOoo.setText((CharSequence) null);
            } else {
                String str5 = strArrSplit[1];
                Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
                int i2 = Integer.parseInt(str5);
                String str6 = strArrSplit[0];
                Intrinsics.checkNotNullExpressionValue(str6, "get(...)");
                Uri uriOooO00o4 = O0O0.OooO00o(i2, Integer.parseInt(str6));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o4, "getMedalUri(...)");
                OooOo().f45378OooOOoo.setText(strArrSplit[2]);
                AppCompatTextView appCompatTextView2 = OooOo().f45378OooOOoo;
                String str7 = strArrSplit[1];
                Intrinsics.checkNotNullExpressionValue(str7, "get(...)");
                appCompatTextView2.setTextColor(o0000.OooO00o(O0O0.OooO0O0(Integer.parseInt(str7))));
                uriOooO00o3 = uriOooO00o4;
            }
            SVGAView sVGAView = OooOo().f45371OooOO0o;
            int i3 = o0Oo0oo.icon_badge_no_pic;
            sVGAView.f13232OooOooO = i3;
            sVGAView.setImageResource(i3);
            String string = uriOooO00o3.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            sVGAView.OooOO0O(string, this);
            sVGAView.OooOO0o();
            OooOo().f45373OooOOO0.setSelected(true);
            OooOo().f45381OooOo00.setTextColor(o0000.OooO00o(o0OOO0o.color_122));
        } else {
            OooOo().f45378OooOOoo.setText((CharSequence) null);
            OooOo().f45381OooOo00.setText(o0000.OooO0OO(o000000.user_badge_wear_not_worn));
            OooOo().f45371OooOO0o.setImageResource(o0Oo0oo.user_badge_wear_placeholder);
            OooOo().f45373OooOOO0.setSelected(true);
            OooOo().f45381OooOo00.setTextColor(o0000.OooO00o(o0OOO0o.color_899));
        }
        String[] strArr3 = this.f26635OooOo0;
        if (strArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            strArr3 = null;
        }
        if (strArr3.length > 1) {
            String[] strArr4 = this.f26635OooOo0;
            if (strArr4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
                strArr4 = null;
            }
            String[] strArrSplit2 = strArr4[1].split("_");
            AppCompatTextView appCompatTextView3 = OooOo().f45382OooOo0O;
            String str8 = strArrSplit2[1];
            Intrinsics.checkNotNullExpressionValue(str8, "get(...)");
            appCompatTextView3.setText((CharSequence) linkedHashMap.get(Integer.valueOf(Integer.parseInt(str8))));
            String str9 = strArrSplit2[0];
            Intrinsics.checkNotNullExpressionValue(str9, "get(...)");
            if (Integer.parseInt(str9) == 0) {
                String str10 = strArrSplit2[1];
                Intrinsics.checkNotNullExpressionValue(str10, "get(...)");
                int i4 = Integer.parseInt(str10);
                String str11 = strArrSplit2[2];
                Intrinsics.checkNotNullExpressionValue(str11, "get(...)");
                uriOooO00o2 = O0O0.OooO00o(i4, Integer.parseInt(str11));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o2, "getMedalUri(...)");
                OooOo().f45380OooOo0.setText((CharSequence) null);
            } else {
                OooOo().f45380OooOo0.setText(strArrSplit2[2]);
                AppCompatTextView appCompatTextView4 = OooOo().f45380OooOo0;
                String str12 = strArrSplit2[1];
                Intrinsics.checkNotNullExpressionValue(str12, "get(...)");
                appCompatTextView4.setTextColor(o0000.OooO00o(O0O0.OooO0O0(Integer.parseInt(str12))));
                String str13 = strArrSplit2[1];
                Intrinsics.checkNotNullExpressionValue(str13, "get(...)");
                int i5 = Integer.parseInt(str13);
                String str14 = strArrSplit2[0];
                Intrinsics.checkNotNullExpressionValue(str14, "get(...)");
                uriOooO00o2 = O0O0.OooO00o(i5, Integer.parseInt(str14));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o2, "getMedalUri(...)");
            }
            SVGAView sVGAView2 = OooOo().f45372OooOOO;
            int i6 = o0Oo0oo.icon_badge_no_pic;
            sVGAView2.f13232OooOooO = i6;
            sVGAView2.setImageResource(i6);
            String string2 = uriOooO00o2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            sVGAView2.OooOO0O(string2, this);
            sVGAView2.OooOO0o();
            OooOo().f45374OooOOOO.setSelected(true);
            OooOo().f45382OooOo0O.setTextColor(o0000.OooO00o(o0OOO0o.color_122));
        } else {
            OooOo().f45380OooOo0.setText((CharSequence) null);
            OooOo().f45382OooOo0O.setText(o0000.OooO0OO(o000000.user_badge_wear_not_worn));
            OooOo().f45372OooOOO.setImageResource(o0Oo0oo.user_badge_wear_placeholder);
            AppCompatImageView appCompatImageView = OooOo().f45374OooOOOO;
            String[] strArr5 = this.f26635OooOo0;
            if (strArr5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
                strArr5 = null;
            }
            appCompatImageView.setSelected(!(strArr5.length == 0));
            OooOo().f45382OooOo0O.setTextColor(o0000.OooO00o(o0OOO0o.color_899));
        }
        String[] strArr6 = this.f26635OooOo0;
        if (strArr6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            strArr6 = null;
        }
        if (strArr6.length > 2) {
            String[] strArr7 = this.f26635OooOo0;
            if (strArr7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
                strArr7 = null;
            }
            String[] strArrSplit3 = strArr7[2].split("_");
            AppCompatTextView appCompatTextView5 = OooOo().f45379OooOo;
            String str15 = strArrSplit3[1];
            Intrinsics.checkNotNullExpressionValue(str15, "get(...)");
            appCompatTextView5.setText((CharSequence) linkedHashMap.get(Integer.valueOf(Integer.parseInt(str15))));
            String str16 = strArrSplit3[0];
            Intrinsics.checkNotNullExpressionValue(str16, "get(...)");
            if (Integer.parseInt(str16) == 0) {
                String str17 = strArrSplit3[1];
                Intrinsics.checkNotNullExpressionValue(str17, "get(...)");
                int i7 = Integer.parseInt(str17);
                String str18 = strArrSplit3[2];
                Intrinsics.checkNotNullExpressionValue(str18, "get(...)");
                uriOooO00o = O0O0.OooO00o(i7, Integer.parseInt(str18));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o, "getMedalUri(...)");
                OooOo().f45383OooOo0o.setText((CharSequence) null);
            } else {
                OooOo().f45383OooOo0o.setText(strArrSplit3[2]);
                AppCompatTextView appCompatTextView6 = OooOo().f45383OooOo0o;
                String str19 = strArrSplit3[1];
                Intrinsics.checkNotNullExpressionValue(str19, "get(...)");
                appCompatTextView6.setTextColor(o0000.OooO00o(O0O0.OooO0O0(Integer.parseInt(str19))));
                String str20 = strArrSplit3[1];
                Intrinsics.checkNotNullExpressionValue(str20, "get(...)");
                int i8 = Integer.parseInt(str20);
                String str21 = strArrSplit3[0];
                Intrinsics.checkNotNullExpressionValue(str21, "get(...)");
                uriOooO00o = O0O0.OooO00o(i8, Integer.parseInt(str21));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o, "getMedalUri(...)");
            }
            SVGAView sVGAView3 = OooOo().f45375OooOOOo;
            int i9 = o0Oo0oo.icon_badge_no_pic;
            sVGAView3.f13232OooOooO = i9;
            sVGAView3.setImageResource(i9);
            String string3 = uriOooO00o.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            sVGAView3.OooOO0O(string3, this);
            sVGAView3.OooOO0o();
            OooOo().f45377OooOOo0.setSelected(true);
            OooOo().f45379OooOo.setTextColor(o0000.OooO00o(o0OOO0o.color_122));
        } else {
            OooOo().f45383OooOo0o.setText((CharSequence) null);
            OooOo().f45379OooOo.setText(o0000.OooO0OO(o000000.user_badge_wear_not_worn));
            OooOo().f45375OooOOOo.setImageResource(o0Oo0oo.user_badge_wear_placeholder);
            AppCompatImageView appCompatImageView2 = OooOo().f45377OooOOo0;
            String[] strArr8 = this.f26635OooOo0;
            if (strArr8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            } else {
                strArr = strArr8;
            }
            appCompatImageView2.setSelected(strArr.length > 1);
            OooOo().f45379OooOo.setTextColor(o0000.OooO00o(o0OOO0o.color_899));
        }
        OooOo().f45363OooO0OO.setOnClickListener(this);
        OooOo().f45364OooO0Oo.setOnClickListener(this);
        OooOo().f45366OooO0o0.setOnClickListener(this);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOo().f45363OooO0OO)) {
            OooOoO(0);
            return;
        }
        String[] strArr = null;
        if (Intrinsics.areEqual(view, OooOo().f45364OooO0Oo)) {
            String[] strArr2 = this.f26635OooOo0;
            if (strArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            } else {
                strArr = strArr2;
            }
            if (!(strArr.length == 0)) {
                OooOoO(1);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(view, OooOo().f45366OooO0o0)) {
            String[] strArr3 = this.f26635OooOo0;
            if (strArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            } else {
                strArr = strArr3;
            }
            if (strArr.length > 1) {
                OooOoO(2);
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f45361OooO00o);
        LiveEventBus.get("Wear_badge_page").observeSticky(this, new o0OoOoOo(1, this));
    }
}
