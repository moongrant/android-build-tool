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
import p081o000OoOO.OooOO0;
import p579o0oOoo.oOo00o0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.tb;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/view/UserMedalView;", "Landroid/widget/LinearLayout;", "", "getLoadingIdRes", "marginStart", "", "setBetweenMargin", "Lo0ooOOOO/tb;", "OooO0Oo", "Lkotlin/Lazy;", "getBinding", "()Lo0ooOOOO/tb;", "binding", "", "OooO0o0", "Z", "getShowHolder", "()Z", "setShowHolder", "(Z)V", "showHolder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class UserMedalView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f30787OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    public boolean showHolder;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f30789OooO0oO;

    public static final class OooO00o extends Lambda implements Function0<tb> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f30790OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserMedalView f30791OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, UserMedalView userMedalView) {
            super(0);
            this.f30790OooO0Oo = context;
            this.f30791OooO0o0 = userMedalView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final tb invoke() {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f30790OooO0Oo);
            UserMedalView userMedalView = this.f30791OooO0o0;
            if (userMedalView == null) {
                throw new NullPointerException("parent");
            }
            layoutInflaterFrom.inflate(oO00OO0O.view_medal, userMedalView);
            int i = oO00O0oO.image1;
            SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, userMedalView);
            if (sVGAView != null) {
                i = oO00O0oO.image2;
                SVGAView sVGAView2 = (SVGAView) OooOO0.OooO00o(i, userMedalView);
                if (sVGAView2 != null) {
                    i = oO00O0oO.image3;
                    SVGAView sVGAView3 = (SVGAView) OooOO0.OooO00o(i, userMedalView);
                    if (sVGAView3 != null) {
                        i = oO00O0oO.layout1;
                        ConstraintLayout constraintLayout = (ConstraintLayout) OooOO0.OooO00o(i, userMedalView);
                        if (constraintLayout != null) {
                            i = oO00O0oO.layout2;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) OooOO0.OooO00o(i, userMedalView);
                            if (constraintLayout2 != null) {
                                i = oO00O0oO.layout3;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) OooOO0.OooO00o(i, userMedalView);
                                if (constraintLayout3 != null) {
                                    i = oO00O0oO.num1;
                                    ImageView imageView = (ImageView) OooOO0.OooO00o(i, userMedalView);
                                    if (imageView != null) {
                                        i = oO00O0oO.num2;
                                        ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, userMedalView);
                                        if (imageView2 != null) {
                                            i = oO00O0oO.num3;
                                            ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, userMedalView);
                                            if (imageView3 != null) {
                                                tb tbVar = new tb(userMedalView, sVGAView, sVGAView2, sVGAView3, constraintLayout, constraintLayout2, constraintLayout3, imageView, imageView2, imageView3);
                                                Intrinsics.checkNotNullExpressionValue(tbVar, "inflate(LayoutInflater.from(context), this)");
                                                return tbVar;
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

    private final tb getBinding() {
        return (tb) this.binding.getValue();
    }

    private final int getLoadingIdRes() {
        return this.showHolder ? this.f30789OooO0oO : this.f30787OooO0o;
    }

    public final void OooO00o(@Nullable String str, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        setVisibility(8);
        getBinding().f58901OooO0o0.setVisibility(8);
        getBinding().f58903OooO0oo.setVisibility(8);
        getBinding().f58897OooO0O0.setVisibility(8);
        getBinding().f58900OooO0o.setVisibility(8);
        getBinding().f58895OooO.setVisibility(8);
        getBinding().f58898OooO0OO.setVisibility(8);
        getBinding().f58902OooO0oO.setVisibility(8);
        getBinding().f58904OooOO0.setVisibility(8);
        getBinding().f58899OooO0Oo.setVisibility(8);
        if (this.showHolder) {
            setVisibility(0);
            getBinding().f58901OooO0o0.setVisibility(0);
            getBinding().f58897OooO0O0.setVisibility(0);
            getBinding().f58897OooO0O0.setImageResource(getLoadingIdRes());
            getBinding().f58900OooO0o.setVisibility(0);
            getBinding().f58898OooO0OO.setVisibility(0);
            getBinding().f58898OooO0OO.setImageResource(getLoadingIdRes());
            getBinding().f58902OooO0oO.setVisibility(0);
            getBinding().f58899OooO0Oo.setVisibility(0);
            getBinding().f58899OooO0Oo.setImageResource(getLoadingIdRes());
        }
        String[] splitMedal = oOo00o0o.OooO0Oo(str);
        Intrinsics.checkNotNullExpressionValue(splitMedal, "splitMedal");
        if (!(splitMedal.length == 0)) {
            setVisibility(0);
            getBinding().f58901OooO0o0.setVisibility(0);
            oOo00o0o.OooO0OO(getBinding().f58903OooO0oo, getBinding().f58897OooO0O0, splitMedal[0], getLoadingIdRes(), lifecycleOwner);
            if (splitMedal.length > 1) {
                getBinding().f58900OooO0o.setVisibility(0);
                oOo00o0o.OooO0OO(getBinding().f58895OooO, getBinding().f58898OooO0OO, splitMedal[1], getLoadingIdRes(), lifecycleOwner);
            }
            if (splitMedal.length > 2) {
                getBinding().f58902OooO0oO.setVisibility(0);
                oOo00o0o.OooO0OO(getBinding().f58904OooOO0, getBinding().f58899OooO0Oo, splitMedal[2], getLoadingIdRes(), lifecycleOwner);
            }
        }
    }

    public final boolean getShowHolder() {
        return this.showHolder;
    }

    public final void setBetweenMargin(int marginStart) {
        ViewGroup.LayoutParams layoutParams = getBinding().f58900OooO0o.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(marginStart);
        ViewGroup.LayoutParams layoutParams2 = getBinding().f58902OooO0oO.getLayoutParams();
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
        this.f30787OooO0o = oOo00OO0.icon_badge_no_pic;
        this.f30789OooO0oO = oOo00OO0.icon_wear_badge_holder;
        if (p591o0oo000O.OooO.OooO0o0()) {
            getBinding().f58903OooO0oo.setScaleType(ImageView.ScaleType.FIT_END);
            getBinding().f58895OooO.setScaleType(ImageView.ScaleType.FIT_END);
            getBinding().f58904OooOO0.setScaleType(ImageView.ScaleType.FIT_END);
        }
    }
}
