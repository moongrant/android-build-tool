package com.yalla.yalla.ui.view.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.marquee.MarqueeText;
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.gift.GiftPropModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.b3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R2\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/ui/view/gift/GiftTipsViewMerge;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function1;", "Lcom/yalla/yalla/model/gift/GiftPropModel;", "", "OooO0o", "Lkotlin/jvm/functions/Function1;", "getViewClickListener", "()Lkotlin/jvm/functions/Function1;", "setViewClickListener", "(Lkotlin/jvm/functions/Function1;)V", "viewClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class GiftTipsViewMerge extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final b3 f30463OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super GiftPropModel, Unit> viewClickListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public GiftPropModel f30465OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            GiftTipsViewMerge giftTipsViewMerge = GiftTipsViewMerge.this;
            Function1<GiftPropModel, Unit> viewClickListener = giftTipsViewMerge.getViewClickListener();
            if (viewClickListener != null) {
                viewClickListener.invoke(giftTipsViewMerge.f30465OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftTipsViewMerge(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final Function1<GiftPropModel, Unit> getViewClickListener() {
        return this.viewClickListener;
    }

    public final void setViewClickListener(@Nullable Function1<? super GiftPropModel, Unit> function1) {
        this.viewClickListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftTipsViewMerge(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GiftTipsViewMerge(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftTipsViewMerge(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        b3 b3VarInflate = b3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(b3VarInflate, "inflate(...)");
        this.f30463OooO0Oo = b3VarInflate;
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = o000O00O.f13421OooO00o;
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        o000O00O.f13421OooO00o = context;
        ConstraintLayout layoutRoot = b3VarInflate.f43743OooO0o;
        Intrinsics.checkNotNullExpressionValue(layoutRoot, "layoutRoot");
        o000O.OooO(layoutRoot, new OooO00o());
        MarqueeText content = b3VarInflate.f43741OooO0OO;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        MarqueeText.OooOO0o(content);
    }
}
