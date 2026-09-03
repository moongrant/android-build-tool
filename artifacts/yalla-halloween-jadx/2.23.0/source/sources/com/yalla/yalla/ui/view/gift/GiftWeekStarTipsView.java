package com.yalla.yalla.ui.view.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.marquee.MarqueeText;
import com.code.android.util.o000O0;
import com.code.android.util.o000OO00;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o00oO0o;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.rb;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/ui/view/gift/GiftWeekStarTipsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "string", "", "setData", "Lkotlin/Function0;", "OooO0o0", "Lkotlin/jvm/functions/Function0;", "getViewClickListener", "()Lkotlin/jvm/functions/Function0;", "setViewClickListener", "(Lkotlin/jvm/functions/Function0;)V", "viewClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class GiftWeekStarTipsView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final rb f31054OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> viewClickListener;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> viewClickListener = GiftWeekStarTipsView.this.getViewClickListener();
            if (viewClickListener != null) {
                viewClickListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftWeekStarTipsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final Function0<Unit> getViewClickListener() {
        return this.viewClickListener;
    }

    public final void setData(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        rb rbVar = this.f31054OooO0Oo;
        MarqueeText marqueeText = rbVar.f58766OooO0O0;
        Intrinsics.checkNotNullExpressionValue(marqueeText, "binding.content");
        MarqueeText.OooOO0o(marqueeText);
        MarqueeText marqueeText2 = rbVar.f58766OooO0O0;
        marqueeText2.setText(string);
        Intrinsics.checkNotNullExpressionValue(marqueeText2, "binding.content");
        o000OO00.OooOOOO(marqueeText2);
    }

    public final void setViewClickListener(@Nullable Function0<Unit> function0) {
        this.viewClickListener = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftWeekStarTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GiftWeekStarTipsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftWeekStarTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        rb rbVarInflate = rb.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(rbVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f31054OooO0Oo = rbVarInflate;
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = o000O0.f10354OooO00o;
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        o000O0.f10354OooO00o = context;
        ConstraintLayout constraintLayout = rbVarInflate.f58767OooO0OO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutRoot");
        o000OO00.OooO(constraintLayout, new OooO00o());
        setData(o00oO0o.OooO0OO(context, oO00OOo0.weekly_gifts_new));
    }
}
