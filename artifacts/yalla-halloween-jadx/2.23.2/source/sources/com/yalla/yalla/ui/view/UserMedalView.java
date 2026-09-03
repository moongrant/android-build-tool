package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.uikit.svga.SVGAView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.i3;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p590o0oOooo0.O0O0;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/view/UserMedalView;", "Landroid/widget/LinearLayout;", "", "getLoadingIdRes", "marginStart", "", "setBetweenMargin", "Lo0Oo0OOO/i3;", "OooO0Oo", "Lkotlin/Lazy;", "getBinding", "()Lo0Oo0OOO/i3;", "binding", "", "OooO0o0", "Z", "getShowHolder", "()Z", "setShowHolder", "(Z)V", "showHolder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class UserMedalView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f30242OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    public boolean showHolder;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f30244OooO0oO;

    public static final class OooO00o extends Lambda implements Function0<i3> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f30245OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserMedalView f30246OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, UserMedalView userMedalView) {
            super(0);
            this.f30245OooO0Oo = context;
            this.f30246OooO0o0 = userMedalView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final i3 invoke() {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f30245OooO0Oo);
            UserMedalView userMedalView = this.f30246OooO0o0;
            if (userMedalView == null) {
                throw new NullPointerException("parent");
            }
            layoutInflaterFrom.inflate(oo0o0Oo.view_medal, userMedalView);
            int i = o0OO00O.image1;
            SVGAView sVGAView = (SVGAView) o00O00o0.OooO0O0.OooO00o(i, userMedalView);
            if (sVGAView != null) {
                i = o0OO00O.image2;
                SVGAView sVGAView2 = (SVGAView) o00O00o0.OooO0O0.OooO00o(i, userMedalView);
                if (sVGAView2 != null) {
                    i = o0OO00O.image3;
                    SVGAView sVGAView3 = (SVGAView) o00O00o0.OooO0O0.OooO00o(i, userMedalView);
                    if (sVGAView3 != null) {
                        i = o0OO00O.layout1;
                        ConstraintLayout constraintLayout = (ConstraintLayout) o00O00o0.OooO0O0.OooO00o(i, userMedalView);
                        if (constraintLayout != null) {
                            i = o0OO00O.layout2;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) o00O00o0.OooO0O0.OooO00o(i, userMedalView);
                            if (constraintLayout2 != null) {
                                i = o0OO00O.layout3;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) o00O00o0.OooO0O0.OooO00o(i, userMedalView);
                                if (constraintLayout3 != null) {
                                    i = o0OO00O.num1;
                                    ImageView imageView = (ImageView) o00O00o0.OooO0O0.OooO00o(i, userMedalView);
                                    if (imageView != null) {
                                        i = o0OO00O.num2;
                                        ImageView imageView2 = (ImageView) o00O00o0.OooO0O0.OooO00o(i, userMedalView);
                                        if (imageView2 != null) {
                                            i = o0OO00O.num3;
                                            ImageView imageView3 = (ImageView) o00O00o0.OooO0O0.OooO00o(i, userMedalView);
                                            if (imageView3 != null) {
                                                i3 i3Var = new i3(userMedalView, sVGAView, sVGAView2, sVGAView3, constraintLayout, constraintLayout2, constraintLayout3, imageView, imageView2, imageView3);
                                                Intrinsics.checkNotNullExpressionValue(i3Var, "inflate(...)");
                                                return i3Var;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(userMedalView.getResources().getResourceName(i)));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserMedalView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final i3 getBinding() {
        return (i3) this.binding.getValue();
    }

    private final int getLoadingIdRes() {
        return this.showHolder ? this.f30244OooO0oO : this.f30242OooO0o;
    }

    public final void OooO00o(@Nullable String str, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        setVisibility(8);
        getBinding().f43964OooO0o0.setVisibility(8);
        getBinding().f43966OooO0oo.setVisibility(8);
        getBinding().f43960OooO0O0.setVisibility(8);
        getBinding().f43963OooO0o.setVisibility(8);
        getBinding().f43958OooO.setVisibility(8);
        getBinding().f43961OooO0OO.setVisibility(8);
        getBinding().f43965OooO0oO.setVisibility(8);
        getBinding().f43967OooOO0.setVisibility(8);
        getBinding().f43962OooO0Oo.setVisibility(8);
        if (this.showHolder) {
            setVisibility(0);
            getBinding().f43964OooO0o0.setVisibility(0);
            getBinding().f43960OooO0O0.setVisibility(0);
            getBinding().f43960OooO0O0.setImageResource(getLoadingIdRes());
            getBinding().f43963OooO0o.setVisibility(0);
            getBinding().f43961OooO0OO.setVisibility(0);
            getBinding().f43961OooO0OO.setImageResource(getLoadingIdRes());
            getBinding().f43965OooO0oO.setVisibility(0);
            getBinding().f43962OooO0Oo.setVisibility(0);
            getBinding().f43962OooO0Oo.setImageResource(getLoadingIdRes());
        }
        String[] strArrOooO0Oo = O0O0.OooO0Oo(str);
        Intrinsics.checkNotNull(strArrOooO0Oo);
        if (!(strArrOooO0Oo.length == 0)) {
            setVisibility(0);
            getBinding().f43964OooO0o0.setVisibility(0);
            O0O0.OooO0OO(getBinding().f43966OooO0oo, getBinding().f43960OooO0O0, strArrOooO0Oo[0], getLoadingIdRes(), lifecycleOwner);
            if (strArrOooO0Oo.length > 1) {
                getBinding().f43963OooO0o.setVisibility(0);
                O0O0.OooO0OO(getBinding().f43958OooO, getBinding().f43961OooO0OO, strArrOooO0Oo[1], getLoadingIdRes(), lifecycleOwner);
            }
            if (strArrOooO0Oo.length > 2) {
                getBinding().f43965OooO0oO.setVisibility(0);
                O0O0.OooO0OO(getBinding().f43967OooOO0, getBinding().f43962OooO0Oo, strArrOooO0Oo[2], getLoadingIdRes(), lifecycleOwner);
            }
        }
    }

    public final boolean getShowHolder() {
        return this.showHolder;
    }

    public final void setBetweenMargin(int marginStart) {
        ViewGroup.LayoutParams layoutParams = getBinding().f43963OooO0o.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(marginStart);
        ViewGroup.LayoutParams layoutParams2 = getBinding().f43965OooO0oO.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart(marginStart);
    }

    public final void setShowHolder(boolean z) {
        this.showHolder = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserMedalView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ UserMedalView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserMedalView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt.lazy(new OooO00o(context, this));
        this.f30242OooO0o = o0Oo0oo.icon_badge_no_pic;
        this.f30244OooO0oO = o0Oo0oo.icon_wear_badge_holder;
        if (OooOo00.OooO0o0()) {
            getBinding().f43966OooO0oo.setScaleType(ImageView.ScaleType.FIT_END);
            getBinding().f43958OooO.setScaleType(ImageView.ScaleType.FIT_END);
            getBinding().f43967OooOO0.setScaleType(ImageView.ScaleType.FIT_END);
        }
    }
}
