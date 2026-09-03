package com.yalla.yalla.ui.view.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
import com.yalla.yalla.model.gift.GiftPropModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.z2;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R2\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/ui/view/gift/GiftNewTipsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/gift/GiftPropModel;", "gift", "", "setData", "Lkotlin/Function1;", "OooO0o", "Lkotlin/jvm/functions/Function1;", "getViewClickListener", "()Lkotlin/jvm/functions/Function1;", "setViewClickListener", "(Lkotlin/jvm/functions/Function1;)V", "viewClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class GiftNewTipsView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final z2 f30457OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super GiftPropModel, Unit> viewClickListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public GiftPropModel f30459OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            GiftNewTipsView giftNewTipsView = GiftNewTipsView.this;
            Function1<GiftPropModel, Unit> viewClickListener = giftNewTipsView.getViewClickListener();
            if (viewClickListener != null) {
                viewClickListener.invoke(giftNewTipsView.f30459OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            GiftNewTipsView giftNewTipsView = GiftNewTipsView.this;
            Function1<GiftPropModel, Unit> viewClickListener = giftNewTipsView.getViewClickListener();
            if (viewClickListener != null) {
                viewClickListener.invoke(giftNewTipsView.f30459OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftNewTipsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final Function1<GiftPropModel, Unit> getViewClickListener() {
        return this.viewClickListener;
    }

    public final void setData(@Nullable GiftPropModel gift) {
        this.f30459OooO0o0 = gift;
        if (gift != null) {
            String string = StringsKt.trim((CharSequence) gift.getImageUrl()).toString();
            SVGAView sVGAView = this.f30457OooO0Oo.f45733OooO0O0;
            int i = o0Oo0oo.icon_gift_default_gray;
            sVGAView.f13232OooOooO = i;
            sVGAView.setImageResource(i);
            sVGAView.OooOO0O(string, null);
        }
    }

    public final void setViewClickListener(@Nullable Function1<? super GiftPropModel, Unit> function1) {
        this.viewClickListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftNewTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GiftNewTipsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftNewTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        z2 z2VarInflate = z2.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(z2VarInflate, "inflate(...)");
        this.f30457OooO0Oo = z2VarInflate;
        TextView text = z2VarInflate.f45734OooO0OO;
        Intrinsics.checkNotNullExpressionValue(text, "text");
        o000O.OooO(text, new OooO00o());
        SVGAView giftImage = z2VarInflate.f45733OooO0O0;
        Intrinsics.checkNotNullExpressionValue(giftImage, "giftImage");
        o000O.OooO(giftImage, new OooO0O0());
    }
}
