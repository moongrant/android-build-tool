package com.yalla.yalla.ui.activity.user;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000O00;
import com.code.android.util.o000O0Oo;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.BadgeWearActivity;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;
import p519o0o0O0oO.k0;
import p579o0oOoo.oOo00o0o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.aa;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/BadgeWearActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBadgeWearActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeWearActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeWearActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,178:1\n22#2,2:179\n*S KotlinDebug\n*F\n+ 1 BadgeWearActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeWearActivity\n*L\n29#1:179,2\n*E\n"})
public final class BadgeWearActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f27099OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public String[] f27101OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public k0 f27102OooOo00;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27100OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(aa.class), this, null);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f27103OooOo0O = new LinkedHashMap();

    @SourceDebugExtension({"SMAP\nBadgeWearActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeWearActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeWearActivity$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n1855#2,2:179\n*S KotlinDebug\n*F\n+ 1 BadgeWearActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeWearActivity$onCreate$1\n*L\n40#1:179,2\n*E\n"})
    public static final class OooO00o implements Observer<Object> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            BadgeWearActivity badgeWearActivity = BadgeWearActivity.this;
            badgeWearActivity.f27103OooOo0O.clear();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.yalla.yalla.model.BadgeDataModel>");
            for (BadgeDataModel badgeDataModel : TypeIntrinsics.asMutableList(obj)) {
                badgeWearActivity.f27103OooOo0O.put(Integer.valueOf(badgeDataModel.getMedalId()), badgeDataModel.getName());
            }
            badgeWearActivity.OooOoO0();
        }
    }

    public final aa OooOo() {
        return (aa) this.f27100OooOOoo.getValue();
    }

    public final void OooOoO(int i) {
        if (this.f27102OooOo00 == null) {
            k0 k0Var = new k0(this);
            this.f27102OooOo00 = k0Var;
            k0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0o00o.o000O0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    int i2 = BadgeWearActivity.f27099OooOo0o;
                    BadgeWearActivity this$0 = this.f48984OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.OooOoO0();
                }
            });
        }
        int[] iArr = new int[2];
        OooOo().f57497OooO0O0.getLocationOnScreen(iArr);
        int iOooO00o = (o0000O00.OooO00o() - iArr[1]) - OooOo().f57497OooO0O0.getHeight();
        k0 k0Var2 = this.f27102OooOo00;
        Intrinsics.checkNotNull(k0Var2);
        k0Var2.f52391OooO = i;
        if (iOooO00o <= o0000O0.OooO00o(280.0f)) {
            iOooO00o = o0000O0.OooO00o(580.0f);
        }
        WindowManager.LayoutParams attributes = k0Var2.getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = iOooO00o;
        k0Var2.getWindow().setAttributes(attributes);
        k0 k0Var3 = this.f27102OooOo00;
        Intrinsics.checkNotNull(k0Var3);
        k0Var3.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO0() {
        Uri uriOooO00o;
        Uri uriOooO00o2;
        Uri uriOooO00o3;
        OooOOoo(oO00OOo0.wearing_medals);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(((MutableLiveData) o000000O.f46709Oooo0O0.getValue()).getValue(), Boolean.TRUE)) {
            OooOo().f57511OooOOo.setText(o0000.OooO0OO(oO00OOo0.badge_wearing_instructions_desc_new));
            OooOo().f57500OooO0o.setImageResource(oOo00OO0.user_badge_wear_des_1_new);
            OooOo().f57502OooO0oO.setImageResource(oOo00OO0.user_badge_wear_des_2_new);
            OooOo().f57503OooO0oo.setImageResource(oOo00OO0.user_badge_wear_des_3_new);
            OooOo().f57495OooO.setImageResource(oOo00OO0.user_badge_wear_des_4_new);
            OooOo().f57504OooOO0.setImageResource(oOo00OO0.user_badge_wear_des_5_new);
            OooOo().f57505OooOO0O.setImageResource(oOo00OO0.user_badge_wear_des_6_new);
        }
        String[] strArrOooO0Oo = oOo00o0o.OooO0Oo((String) o000000O.OooOO0O().getValue());
        Intrinsics.checkNotNullExpressionValue(strArrOooO0Oo, "splitMedal(Account.medal.value)");
        this.f27101OooOo0 = strArrOooO0Oo;
        if (strArrOooO0Oo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            strArrOooO0Oo = null;
        }
        boolean z = !(strArrOooO0Oo.length == 0);
        LinkedHashMap linkedHashMap = this.f27103OooOo0O;
        if (z) {
            String[] strArr = this.f27101OooOo0;
            if (strArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
                strArr = null;
            }
            String[] strArrSplit = strArr[0].split("_");
            AppCompatTextView appCompatTextView = OooOo().f57516OooOo00;
            String str = strArrSplit[1];
            Intrinsics.checkNotNullExpressionValue(str, "medalSingle[1]");
            appCompatTextView.setText((CharSequence) linkedHashMap.get(Integer.valueOf(Integer.parseInt(str))));
            String str2 = strArrSplit[0];
            Intrinsics.checkNotNullExpressionValue(str2, "medalSingle[0]");
            if (Integer.parseInt(str2) == 0) {
                String str3 = strArrSplit[1];
                Intrinsics.checkNotNullExpressionValue(str3, "medalSingle[1]");
                int i = Integer.parseInt(str3);
                String str4 = strArrSplit[2];
                Intrinsics.checkNotNullExpressionValue(str4, "medalSingle[2]");
                uriOooO00o3 = oOo00o0o.OooO00o(i, Integer.parseInt(str4));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o3, "getMedalUri(medalSingle[…, medalSingle[2].toInt())");
                OooOo().f57513OooOOoo.setText((CharSequence) null);
            } else {
                String str5 = strArrSplit[1];
                Intrinsics.checkNotNullExpressionValue(str5, "medalSingle[1]");
                int i2 = Integer.parseInt(str5);
                String str6 = strArrSplit[0];
                Intrinsics.checkNotNullExpressionValue(str6, "medalSingle[0]");
                Uri uriOooO00o4 = oOo00o0o.OooO00o(i2, Integer.parseInt(str6));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o4, "getMedalUri(medalSingle[…, medalSingle[0].toInt())");
                OooOo().f57513OooOOoo.setText(strArrSplit[2]);
                AppCompatTextView appCompatTextView2 = OooOo().f57513OooOOoo;
                String str7 = strArrSplit[1];
                Intrinsics.checkNotNullExpressionValue(str7, "medalSingle[1]");
                appCompatTextView2.setTextColor(o0000.OooO00o(oOo00o0o.OooO0O0(Integer.parseInt(str7))));
                uriOooO00o3 = uriOooO00o4;
            }
            SVGAView sVGAView = OooOo().f57506OooOO0o;
            int i3 = oOo00OO0.icon_badge_no_pic;
            sVGAView.f10172OooOooO = i3;
            sVGAView.setImageResource(i3);
            String string = uriOooO00o3.toString();
            Intrinsics.checkNotNullExpressionValue(string, "medalUri.toString()");
            sVGAView.OooOO0O(string, this);
            sVGAView.OooOO0o();
            OooOo().f57508OooOOO0.setSelected(true);
            OooOo().f57516OooOo00.setTextColor(o0000.OooO00o(oO00O0o.color_122));
        } else {
            OooOo().f57513OooOOoo.setText((CharSequence) null);
            OooOo().f57516OooOo00.setText(o0000.OooO0OO(oO00OOo0.user_badge_wear_not_worn));
            OooOo().f57506OooOO0o.setImageResource(oOo00OO0.user_badge_wear_placeholder);
            OooOo().f57508OooOOO0.setSelected(true);
            OooOo().f57516OooOo00.setTextColor(o0000.OooO00o(oO00O0o.color_899));
        }
        String[] strArr2 = this.f27101OooOo0;
        if (strArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            strArr2 = null;
        }
        if (strArr2.length > 1) {
            String[] strArr3 = this.f27101OooOo0;
            if (strArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
                strArr3 = null;
            }
            String[] strArrSplit2 = strArr3[1].split("_");
            AppCompatTextView appCompatTextView3 = OooOo().f57517OooOo0O;
            String str8 = strArrSplit2[1];
            Intrinsics.checkNotNullExpressionValue(str8, "medalSingle[1]");
            appCompatTextView3.setText((CharSequence) linkedHashMap.get(Integer.valueOf(Integer.parseInt(str8))));
            String str9 = strArrSplit2[0];
            Intrinsics.checkNotNullExpressionValue(str9, "medalSingle[0]");
            if (Integer.parseInt(str9) == 0) {
                String str10 = strArrSplit2[1];
                Intrinsics.checkNotNullExpressionValue(str10, "medalSingle[1]");
                int i4 = Integer.parseInt(str10);
                String str11 = strArrSplit2[2];
                Intrinsics.checkNotNullExpressionValue(str11, "medalSingle[2]");
                uriOooO00o2 = oOo00o0o.OooO00o(i4, Integer.parseInt(str11));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o2, "getMedalUri(medalSingle[…, medalSingle[2].toInt())");
                OooOo().f57515OooOo0.setText((CharSequence) null);
            } else {
                OooOo().f57515OooOo0.setText(strArrSplit2[2]);
                AppCompatTextView appCompatTextView4 = OooOo().f57515OooOo0;
                String str12 = strArrSplit2[1];
                Intrinsics.checkNotNullExpressionValue(str12, "medalSingle[1]");
                appCompatTextView4.setTextColor(o0000.OooO00o(oOo00o0o.OooO0O0(Integer.parseInt(str12))));
                String str13 = strArrSplit2[1];
                Intrinsics.checkNotNullExpressionValue(str13, "medalSingle[1]");
                int i5 = Integer.parseInt(str13);
                String str14 = strArrSplit2[0];
                Intrinsics.checkNotNullExpressionValue(str14, "medalSingle[0]");
                uriOooO00o2 = oOo00o0o.OooO00o(i5, Integer.parseInt(str14));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o2, "getMedalUri(medalSingle[…, medalSingle[0].toInt())");
            }
            SVGAView sVGAView2 = OooOo().f57507OooOOO;
            int i6 = oOo00OO0.icon_badge_no_pic;
            sVGAView2.f10172OooOooO = i6;
            sVGAView2.setImageResource(i6);
            String string2 = uriOooO00o2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "medalUri.toString()");
            sVGAView2.OooOO0O(string2, this);
            sVGAView2.OooOO0o();
            OooOo().f57509OooOOOO.setSelected(true);
            OooOo().f57517OooOo0O.setTextColor(o0000.OooO00o(oO00O0o.color_122));
        } else {
            OooOo().f57515OooOo0.setText((CharSequence) null);
            OooOo().f57517OooOo0O.setText(o0000.OooO0OO(oO00OOo0.user_badge_wear_not_worn));
            OooOo().f57507OooOOO.setImageResource(oOo00OO0.user_badge_wear_placeholder);
            AppCompatImageView appCompatImageView = OooOo().f57509OooOOOO;
            String[] strArr4 = this.f27101OooOo0;
            if (strArr4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
                strArr4 = null;
            }
            appCompatImageView.setSelected(!(strArr4.length == 0));
            OooOo().f57517OooOo0O.setTextColor(o0000.OooO00o(oO00O0o.color_899));
        }
        String[] strArr5 = this.f27101OooOo0;
        if (strArr5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            strArr5 = null;
        }
        if (strArr5.length > 2) {
            String[] strArr6 = this.f27101OooOo0;
            if (strArr6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
                strArr6 = null;
            }
            String[] strArrSplit3 = strArr6[2].split("_");
            AppCompatTextView appCompatTextView5 = OooOo().f57514OooOo;
            String str15 = strArrSplit3[1];
            Intrinsics.checkNotNullExpressionValue(str15, "medalSingle[1]");
            appCompatTextView5.setText((CharSequence) linkedHashMap.get(Integer.valueOf(Integer.parseInt(str15))));
            String str16 = strArrSplit3[0];
            Intrinsics.checkNotNullExpressionValue(str16, "medalSingle[0]");
            if (Integer.parseInt(str16) == 0) {
                String str17 = strArrSplit3[1];
                Intrinsics.checkNotNullExpressionValue(str17, "medalSingle[1]");
                int i7 = Integer.parseInt(str17);
                String str18 = strArrSplit3[2];
                Intrinsics.checkNotNullExpressionValue(str18, "medalSingle[2]");
                uriOooO00o = oOo00o0o.OooO00o(i7, Integer.parseInt(str18));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o, "getMedalUri(medalSingle[…, medalSingle[2].toInt())");
                OooOo().f57518OooOo0o.setText((CharSequence) null);
            } else {
                OooOo().f57518OooOo0o.setText(strArrSplit3[2]);
                AppCompatTextView appCompatTextView6 = OooOo().f57518OooOo0o;
                String str19 = strArrSplit3[1];
                Intrinsics.checkNotNullExpressionValue(str19, "medalSingle[1]");
                appCompatTextView6.setTextColor(o0000.OooO00o(oOo00o0o.OooO0O0(Integer.parseInt(str19))));
                String str20 = strArrSplit3[1];
                Intrinsics.checkNotNullExpressionValue(str20, "medalSingle[1]");
                int i8 = Integer.parseInt(str20);
                String str21 = strArrSplit3[0];
                Intrinsics.checkNotNullExpressionValue(str21, "medalSingle[0]");
                uriOooO00o = oOo00o0o.OooO00o(i8, Integer.parseInt(str21));
                Intrinsics.checkNotNullExpressionValue(uriOooO00o, "getMedalUri(medalSingle[…, medalSingle[0].toInt())");
            }
            SVGAView sVGAView3 = OooOo().f57510OooOOOo;
            int i9 = oOo00OO0.icon_badge_no_pic;
            sVGAView3.f10172OooOooO = i9;
            sVGAView3.setImageResource(i9);
            String string3 = uriOooO00o.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "medalUri.toString()");
            sVGAView3.OooOO0O(string3, this);
            sVGAView3.OooOO0o();
            OooOo().f57512OooOOo0.setSelected(true);
            OooOo().f57514OooOo.setTextColor(o0000.OooO00o(oO00O0o.color_122));
        } else {
            String[] strArr7 = null;
            OooOo().f57518OooOo0o.setText((CharSequence) null);
            OooOo().f57514OooOo.setText(o0000.OooO0OO(oO00OOo0.user_badge_wear_not_worn));
            OooOo().f57510OooOOOo.setImageResource(oOo00OO0.user_badge_wear_placeholder);
            AppCompatImageView appCompatImageView2 = OooOo().f57512OooOOo0;
            String[] strArr8 = this.f27101OooOo0;
            if (strArr8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("splitMedal");
            } else {
                strArr7 = strArr8;
            }
            appCompatImageView2.setSelected(strArr7.length > 1);
            OooOo().f57514OooOo.setTextColor(o0000.OooO00o(oO00O0o.color_899));
        }
        OooOo().f57498OooO0OO.setOnClickListener(this);
        OooOo().f57499OooO0Oo.setOnClickListener(this);
        OooOo().f57501OooO0o0.setOnClickListener(this);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOo().f57498OooO0OO)) {
            OooOoO(0);
            return;
        }
        String[] strArr = null;
        if (Intrinsics.areEqual(view, OooOo().f57499OooO0Oo)) {
            String[] strArr2 = this.f27101OooOo0;
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
        if (Intrinsics.areEqual(view, OooOo().f57501OooO0o0)) {
            String[] strArr3 = this.f27101OooOo0;
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
        setContentView(OooOo().f57496OooO00o);
        LiveEventBus.get("Wear_badge_page").observeSticky(this, new OooO00o());
    }
}
