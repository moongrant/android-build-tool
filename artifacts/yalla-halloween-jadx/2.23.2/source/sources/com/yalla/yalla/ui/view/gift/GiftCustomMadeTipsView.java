package com.yalla.yalla.ui.view.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.model.gift.GiftPropModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.d3;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R2\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/ui/view/gift/GiftCustomMadeTipsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "isLTR", "", "setLeftToRight", "Lcom/yalla/yalla/model/gift/GiftPropModel;", "giftPropModel", "setData", "", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "setVisibility", "Lkotlin/Function1;", "OooO0o", "Lkotlin/jvm/functions/Function1;", "getShowCustomMadeGiftListener", "()Lkotlin/jvm/functions/Function1;", "setShowCustomMadeGiftListener", "(Lkotlin/jvm/functions/Function1;)V", "showCustomMadeGiftListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class GiftCustomMadeTipsView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final /* synthetic */ int f30449OooO0oO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final d3 f30450OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super GiftPropModel, Unit> showCustomMadeGiftListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public GiftPropModel f30452OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o0oo0000.OooO00o.OooO0O0("102215");
            GiftCustomMadeTipsView giftCustomMadeTipsView = GiftCustomMadeTipsView.this;
            Function1<GiftPropModel, Unit> showCustomMadeGiftListener = giftCustomMadeTipsView.getShowCustomMadeGiftListener();
            if (showCustomMadeGiftListener != null) {
                showCustomMadeGiftListener.invoke(giftCustomMadeTipsView.f30452OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftCustomMadeTipsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final Function1<GiftPropModel, Unit> getShowCustomMadeGiftListener() {
        return this.showCustomMadeGiftListener;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final void setData(@NotNull GiftPropModel giftPropModel) {
        boolean z;
        Intrinsics.checkNotNullParameter(giftPropModel, "giftPropModel");
        this.f30452OooO0o0 = giftPropModel;
        GiftPropModel.CustomPropDetail customPropDetail = giftPropModel.getCustomPropDetail();
        if (customPropDetail != null) {
            z = customPropDetail.isFirstOpenCustomMade();
        }
        if (z) {
            o0oo0000.OooO00o.OooO0O0("102214");
            Function1<? super GiftPropModel, Unit> function1 = this.showCustomMadeGiftListener;
            if (function1 != null) {
                function1.invoke(giftPropModel);
            }
            o00Ooo.OooO0Oo().OooOO0O();
        }
        d3 d3Var = this.f30450OooO0Oo;
        SVGAView sVGAView = d3Var.f43788OooO0O0;
        Object context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        sVGAView.OooOO0O("svga/room_gift_type_custom_made_tips.svga", (LifecycleOwner) context);
        sVGAView.OooOO0o();
        TextView textView = d3Var.f43789OooO0OO;
        textView.requestFocus();
        textView.requestFocusFromTouch();
    }

    public final void setLeftToRight(boolean isLTR) {
        if (isLTR) {
            this.f30450OooO0Oo.f43788OooO0O0.setScaleX(-1.0f);
        }
    }

    public final void setShowCustomMadeGiftListener(@Nullable Function1<? super GiftPropModel, Unit> function1) {
        this.showCustomMadeGiftListener = function1;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        if (visibility == 8) {
            SVGAView svgaView = this.f30450OooO0Oo.f43788OooO0O0;
            Intrinsics.checkNotNullExpressionValue(svgaView, "svgaView");
            int i = SVGAView.f13219OooOooo;
            svgaView.OooOOO0(false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftCustomMadeTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GiftCustomMadeTipsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftCustomMadeTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        d3 d3VarInflate = d3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d3VarInflate, "inflate(...)");
        this.f30450OooO0Oo = d3VarInflate;
        ConstraintLayout constraintLayout = d3VarInflate.f43787OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        o000O.OooO(constraintLayout, new OooO00o());
    }
}
