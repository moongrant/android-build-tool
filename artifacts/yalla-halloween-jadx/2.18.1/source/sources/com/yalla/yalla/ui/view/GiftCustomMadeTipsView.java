package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.GiftPropModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.oOO00O;
import p497o0o00Oo.OooOOO0;
import p606o0oo0O.OooOo;
import p649o0ooOOoo.wi;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R2\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/view/GiftCustomMadeTipsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/GiftPropModel;", "giftPropModel", "", "setData", "", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "setVisibility", "Lkotlin/Function1;", "Oooo0oo", "Lkotlin/jvm/functions/Function1;", "getShowCustomMadeGiftListener", "()Lkotlin/jvm/functions/Function1;", "setShowCustomMadeGiftListener", "(Lkotlin/jvm/functions/Function1;)V", "showCustomMadeGiftListener", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GiftCustomMadeTipsView extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final wi f24798Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public GiftPropModel f24799Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super GiftPropModel, Unit> showCustomMadeGiftListener;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            OooOo.OooO0O0("102215");
            Function1<GiftPropModel, Unit> showCustomMadeGiftListener = GiftCustomMadeTipsView.this.getShowCustomMadeGiftListener();
            if (showCustomMadeGiftListener != null) {
                showCustomMadeGiftListener.invoke(GiftCustomMadeTipsView.this.f24799Oooo0oO);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftCustomMadeTipsView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final Function1<GiftPropModel, Unit> getShowCustomMadeGiftListener() {
        return this.showCustomMadeGiftListener;
    }

    public final void setData(@NotNull GiftPropModel giftPropModel) {
        Intrinsics.checkNotNullParameter(giftPropModel, "giftPropModel");
        this.f24799Oooo0oO = giftPropModel;
        GiftPropModel.CustomPropDetail customPropDetail = giftPropModel.getCustomPropDetail();
        if (customPropDetail != null && customPropDetail.isFirstOpenCustomMade()) {
            OooOo.OooO0O0("102214");
            Function1<? super GiftPropModel, Unit> function1 = this.showCustomMadeGiftListener;
            if (function1 != null) {
                function1.invoke(giftPropModel);
            }
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            OooOOO0.OooO0Oo().OooOO0O();
        }
        SVGAView sVGAView = this.f24798Oooo0o.f50909OooO0O0;
        Object context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        sVGAView.OooO0oo("svga/room_gift_type_custom_made_tips.svga", (LifecycleOwner) context);
        sVGAView.OooO();
        this.f24798Oooo0o.f50910OooO0OO.requestFocus();
        this.f24798Oooo0o.f50910OooO0OO.requestFocusFromTouch();
    }

    public final void setShowCustomMadeGiftListener(@Nullable Function1<? super GiftPropModel, Unit> function1) {
        this.showCustomMadeGiftListener = function1;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        if (visibility == 8) {
            SVGAView sVGAView = this.f24798Oooo0o.f50909OooO0O0;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "mBinding.svgaView");
            sVGAView.OooOO0(false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftCustomMadeTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftCustomMadeTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        wi wiVarInflate = wi.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(wiVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24798Oooo0o = wiVarInflate;
        ConstraintLayout constraintLayout = wiVarInflate.f50908OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.root");
        oOO00O.OooO0oO(constraintLayout, new OooO00o());
        if (oo000o.OooO0o0()) {
            wiVarInflate.f50909OooO0O0.setScaleX(-1.0f);
        }
    }
}
