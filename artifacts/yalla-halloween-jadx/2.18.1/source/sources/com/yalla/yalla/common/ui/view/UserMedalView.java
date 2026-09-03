package com.yalla.yalla.common.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p104o000oo0O.o00Oo0;
import p168o00Ooo0.o00oO0o;
import p168o00Ooo0.oo000o;
import p649o0ooOOoo.aj;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/common/ui/view/UserMedalView;", "Landroid/widget/LinearLayout;", "", "getLoadingIdRes", "Lo0ooOOoo/aj;", "Oooo0o", "Lkotlin/Lazy;", "getBinding", "()Lo0ooOOoo/aj;", "binding", "", "Oooo0oO", "Z", "getShowHolder", "()Z", "setShowHolder", "(Z)V", "showHolder", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserMedalView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f21036Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    public boolean showHolder;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f21039Oooo0oo;

    public static final class OooO00o extends Lambda implements Function0<aj> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f21040Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ UserMedalView f21041Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, UserMedalView userMedalView) {
            super(0);
            this.f21040Oooo0o = context;
            this.f21041Oooo0oO = userMedalView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final aj invoke() {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f21040Oooo0o);
            UserMedalView userMedalView = this.f21041Oooo0oO;
            Objects.requireNonNull(userMedalView, "parent");
            layoutInflaterFrom.inflate(R.layout.view_medal, userMedalView);
            int i = R.id.image1;
            SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(userMedalView, R.id.image1);
            if (sVGAView != null) {
                i = R.id.image2;
                SVGAView sVGAView2 = (SVGAView) o00Oo0.OooO00o(userMedalView, R.id.image2);
                if (sVGAView2 != null) {
                    i = R.id.image3;
                    SVGAView sVGAView3 = (SVGAView) o00Oo0.OooO00o(userMedalView, R.id.image3);
                    if (sVGAView3 != null) {
                        i = R.id.layout1;
                        ConstraintLayout constraintLayout = (ConstraintLayout) o00Oo0.OooO00o(userMedalView, R.id.layout1);
                        if (constraintLayout != null) {
                            i = R.id.layout2;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) o00Oo0.OooO00o(userMedalView, R.id.layout2);
                            if (constraintLayout2 != null) {
                                i = R.id.layout3;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) o00Oo0.OooO00o(userMedalView, R.id.layout3);
                                if (constraintLayout3 != null) {
                                    i = R.id.num1;
                                    ImageView imageView = (ImageView) o00Oo0.OooO00o(userMedalView, R.id.num1);
                                    if (imageView != null) {
                                        i = R.id.num2;
                                        ImageView imageView2 = (ImageView) o00Oo0.OooO00o(userMedalView, R.id.num2);
                                        if (imageView2 != null) {
                                            i = R.id.num3;
                                            ImageView imageView3 = (ImageView) o00Oo0.OooO00o(userMedalView, R.id.num3);
                                            if (imageView3 != null) {
                                                aj ajVar = new aj(userMedalView, sVGAView, sVGAView2, sVGAView3, constraintLayout, constraintLayout2, constraintLayout3, imageView, imageView2, imageView3);
                                                Intrinsics.checkNotNullExpressionValue(ajVar, "inflate(LayoutInflater.from(context), this)");
                                                return ajVar;
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
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final aj getBinding() {
        return (aj) this.binding.getValue();
    }

    private final int getLoadingIdRes() {
        return this.showHolder ? this.f21036Oooo : this.f21039Oooo0oo;
    }

    public final void OooO00o() {
        setVisibility(8);
        getBinding().f48979OooO0o0.setVisibility(8);
        getBinding().f48981OooO0oo.setVisibility(8);
        getBinding().f48975OooO0O0.setVisibility(8);
        getBinding().f48978OooO0o.setVisibility(8);
        getBinding().f48973OooO.setVisibility(8);
        getBinding().f48976OooO0OO.setVisibility(8);
        getBinding().f48980OooO0oO.setVisibility(8);
        getBinding().f48982OooOO0.setVisibility(8);
        getBinding().f48977OooO0Oo.setVisibility(8);
    }

    public final void OooO0O0(@Nullable String str, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        OooO00o();
        if (this.showHolder) {
            setVisibility(0);
            getBinding().f48979OooO0o0.setVisibility(0);
            getBinding().f48975OooO0O0.setVisibility(0);
            getBinding().f48975OooO0O0.setImageResource(getLoadingIdRes());
            getBinding().f48978OooO0o.setVisibility(0);
            getBinding().f48976OooO0OO.setVisibility(0);
            getBinding().f48976OooO0OO.setImageResource(getLoadingIdRes());
            getBinding().f48980OooO0oO.setVisibility(0);
            getBinding().f48977OooO0Oo.setVisibility(0);
            getBinding().f48977OooO0Oo.setImageResource(getLoadingIdRes());
        }
        String[] splitMedal = o00oO0o.OooO0Oo(str);
        Intrinsics.checkNotNullExpressionValue(splitMedal, "splitMedal");
        if (!(splitMedal.length == 0)) {
            setVisibility(0);
            getBinding().f48979OooO0o0.setVisibility(0);
            o00oO0o.OooO0OO(getBinding().f48981OooO0oo, getBinding().f48975OooO0O0, splitMedal[0], getLoadingIdRes(), lifecycleOwner);
            if (splitMedal.length > 1) {
                getBinding().f48978OooO0o.setVisibility(0);
                o00oO0o.OooO0OO(getBinding().f48973OooO, getBinding().f48976OooO0OO, splitMedal[1], getLoadingIdRes(), lifecycleOwner);
            }
            if (splitMedal.length > 2) {
                getBinding().f48980OooO0oO.setVisibility(0);
                o00oO0o.OooO0OO(getBinding().f48982OooOO0, getBinding().f48977OooO0Oo, splitMedal[2], getLoadingIdRes(), lifecycleOwner);
            }
        }
    }

    public final boolean getShowHolder() {
        return this.showHolder;
    }

    public final void setShowHolder(boolean z) {
        this.showHolder = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserMedalView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserMedalView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt.lazy(new OooO00o(context, this));
        this.f21039Oooo0oo = R.drawable.icon_badge_no_pic;
        this.f21036Oooo = R.drawable.icon_wear_badge_holder;
        if (oo000o.OooO0o0()) {
            getBinding().f48981OooO0oo.setScaleType(ImageView.ScaleType.FIT_END);
            getBinding().f48973OooO.setScaleType(ImageView.ScaleType.FIT_END);
            getBinding().f48982OooOO0.setScaleType(ImageView.ScaleType.FIT_END);
        }
    }
}
