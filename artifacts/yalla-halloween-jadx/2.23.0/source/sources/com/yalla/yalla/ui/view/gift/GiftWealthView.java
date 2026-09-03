package com.yalla.yalla.ui.view.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000O;
import com.code.android.util.o000OO00;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.WealthLevel;
import com.yalla.yalla.ui.view.gift.GiftWealthView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o000O0;
import p417o0OoO0.o000O0Oo;
import p417o0OoO0.o000O0o;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.qb;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/ui/view/gift/GiftWealthView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function0;", "", "OooO0o0", "Lkotlin/jvm/functions/Function0;", "getToRechargeListener", "()Lkotlin/jvm/functions/Function0;", "setToRechargeListener", "(Lkotlin/jvm/functions/Function0;)V", "toRechargeListener", "OooO0o", "getToWealthLevelListener", "setToWealthLevelListener", "toWealthLevelListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class GiftWealthView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ int f31043OooO0oo = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final qb f31044OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> toWealthLevelListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> toRechargeListener;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public FragmentActivity f31047OooO0oO;

    public static final class OooO extends Lambda implements Function1<View, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> toWealthLevelListener = GiftWealthView.this.getToWealthLevelListener();
            if (toWealthLevelListener != null) {
                toWealthLevelListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> toWealthLevelListener = GiftWealthView.this.getToWealthLevelListener();
            if (toWealthLevelListener != null) {
                toWealthLevelListener.invoke();
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
            Function0<Unit> toWealthLevelListener = GiftWealthView.this.getToWealthLevelListener();
            if (toWealthLevelListener != null) {
                toWealthLevelListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<View, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean zIsUnlocked$default = WealthLevel.Companion.isUnlocked$default(WealthLevel.INSTANCE, null, 1, null);
            GiftWealthView giftWealthView = GiftWealthView.this;
            if (zIsUnlocked$default) {
                o0OO000.OooO00o("102323");
                Function0<Unit> toRechargeListener = giftWealthView.getToRechargeListener();
                if (toRechargeListener != null) {
                    toRechargeListener.invoke();
                }
            } else {
                o0OO000.OooO00o("102322");
                Function0<Unit> toWealthLevelListener = giftWealthView.getToWealthLevelListener();
                if (toWealthLevelListener != null) {
                    toWealthLevelListener.invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<View, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> toWealthLevelListener = GiftWealthView.this.getToWealthLevelListener();
            if (toWealthLevelListener != null) {
                toWealthLevelListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<View, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> toWealthLevelListener = GiftWealthView.this.getToWealthLevelListener();
            if (toWealthLevelListener != null) {
                toWealthLevelListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftWealthView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(@Nullable FragmentActivity fragmentActivity) {
        this.f31047OooO0oO = fragmentActivity;
        qb qbVar = this.f31044OooO0Oo;
        SVGAView sVGAView = qbVar.f58691OooO0OO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.ivLevel");
        o000OO00.OooO0O0(sVGAView);
        TextView textView = qbVar.f58698OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvUnlockContent");
        o000OO00.OooO0O0(textView);
        TextView it = qbVar.f58699OooOO0o;
        Intrinsics.checkNotNullExpressionValue(it, "binding.tvUpdateContent");
        o000OO00.OooO0O0(it);
        TextView textView2 = qbVar.f58697OooOO0;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvFullContent");
        o000OO00.OooO0O0(textView2);
        ImageView imageView = qbVar.f58694OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivWealthUnlockedArrow");
        o000OO00.OooO0O0(imageView);
        View view = qbVar.f58696OooO0oo;
        Intrinsics.checkNotNullExpressionValue(view, "binding.progressWealth");
        o000OO00.OooO0O0(view);
        ImageView imageView2 = qbVar.f58692OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivWealthLine");
        o000OO00.OooO0O0(imageView2);
        ImageView imageView3 = qbVar.f58693OooO0o;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivWealthUpdate");
        o000OO00.OooOOOO(imageView3);
        boolean zIsUnlocked$default = WealthLevel.Companion.isUnlocked$default(WealthLevel.INSTANCE, null, 1, null);
        SVGAView it2 = qbVar.f58691OooO0OO;
        if (!zIsUnlocked$default) {
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            o000OO00.OooOOOO(it2);
            int i = oO00OOO.ic_wealth_default;
            it2.f10172OooOooO = i;
            it2.setImageResource(i);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            it2.OooOO0O(o0OoOo0.OooOOO((String) o000000O.OooO0o().getValue(), ""), this.f31047OooO0oO);
            it2.OooOO0o();
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvUnlockContent");
            o000OO00.OooOOOO(textView);
            imageView3.setImageResource(oO00OOO.ic_wealth_unlock_gift_send);
            return;
        }
        o000000O o000000o3 = o000000O.f46674OooO00o;
        if (o0OoOo0.OooO00o((Boolean) ((MutableLiveData) o000000O.f46715OoooO.getValue()).getValue())) {
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            o000OO00.OooOOOO(it2);
            int i2 = oO00OOO.ic_wealth_default;
            it2.f10172OooOooO = i2;
            it2.setImageResource(i2);
            it2.OooOO0O(o0OoOo0.OooOOO((String) o000000O.OooO0o().getValue(), ""), this.f31047OooO0oO);
            it2.OooOO0o();
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvFullContent");
            o000OO00.OooOOOO(textView2);
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivWealthLine");
            o000OO00.OooOOOO(imageView2);
            imageView3.setImageResource(oO00OOO.ic_wealth_update_gift_send);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(it2, "it");
        o000OO00.OooOOOO(it2);
        int i3 = oO00OOO.ic_wealth_default;
        it2.f10172OooOooO = i3;
        it2.setImageResource(i3);
        it2.OooOO0O(o0OoOo0.OooOOO((String) o000000O.OooO0o().getValue(), ""), this.f31047OooO0oO);
        it2.OooOO0o();
        Lazy lazy = o000000O.f46713Oooo0oO;
        long jOooOO0 = o0OoOo0.OooOO0((Long) ((MutableLiveData) lazy.getValue()).getValue());
        Lazy lazy2 = o000000O.f46716OoooO0;
        final long jOooOO1 = jOooOO0 - o0OoOo0.OooOO0((Long) ((MutableLiveData) lazy2.getValue()).getValue());
        Lazy lazy3 = o000000O.f46717OoooO00;
        final long jOooOO2 = o0OoOo0.OooOO0((Long) ((MutableLiveData) lazy3.getValue()).getValue()) - o0OoOo0.OooOO0((Long) ((MutableLiveData) lazy2.getValue()).getValue());
        long jOooOO3 = o0OoOo0.OooOO0((Long) ((MutableLiveData) lazy3.getValue()).getValue()) - o0OoOo0.OooOO0((Long) ((MutableLiveData) lazy.getValue()).getValue());
        final View progressWealthBg = qbVar.f58688OooO;
        Intrinsics.checkNotNullExpressionValue(progressWealthBg, "progressWealthBg");
        o000OO00.OooOOOO(progressWealthBg);
        Intrinsics.checkNotNullExpressionValue(view, "binding.progressWealth");
        o000OO00.OooOOOO(view);
        progressWealthBg.post(new Runnable() { // from class: o0oOOoOo.o0OO0O0
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = GiftWealthView.f31043OooO0oo;
                View progressWealthBg2 = progressWealthBg;
                Intrinsics.checkNotNullParameter(progressWealthBg2, "$progressWealthBg");
                GiftWealthView this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int width = progressWealthBg2.getWidth();
                double d = jOooOO1;
                long j = jOooOO2;
                double d2 = d / j;
                if (d2 >= 1.0d) {
                    d2 = 1.0d;
                }
                double d3 = d2 * ((double) width);
                if (j > 0) {
                    View view2 = this$0.f31044OooO0Oo.f58696OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(view2, "binding.progressWealth");
                    o000O0Oo.OooO0OO(view2, (int) d3);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(it, "it");
        o000OO00.OooOOOO(it);
        String strValueOf = String.valueOf(o0OoOo0.OooO0o0(0, (Integer) o000000O.OooO0oO().getValue()) + 1);
        it.setText(o0000O.OooO00o(o000O0.OooO0O0(oO00OOo0.gift_WealthUnlocked, this), String.valueOf(jOooOO3), strValueOf));
        o000O0o.OooO0Oo(it, o000O0.OooO00o(oO00O0o.color_FFE574_FF, this), strValueOf);
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivWealthUnlockedArrow");
        o000OO00.OooOOOO(imageView);
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivWealthLine");
        o000OO00.OooOOOO(imageView2);
        imageView3.setImageResource(oO00OOO.ic_wealth_update_gift_send);
    }

    @Nullable
    public final Function0<Unit> getToRechargeListener() {
        return this.toRechargeListener;
    }

    @Nullable
    public final Function0<Unit> getToWealthLevelListener() {
        return this.toWealthLevelListener;
    }

    public final void setToRechargeListener(@Nullable Function0<Unit> function0) {
        this.toRechargeListener = function0;
    }

    public final void setToWealthLevelListener(@Nullable Function0<Unit> function0) {
        this.toWealthLevelListener = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftWealthView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GiftWealthView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftWealthView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        qb qbVarInflate = qb.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(qbVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f31044OooO0Oo = qbVarInflate;
        ConstraintLayout constraintLayout = qbVarInflate.f58695OooO0oO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutRoot");
        o000OO00.OooO(constraintLayout, new OooO00o());
        TextView textView = qbVarInflate.f58698OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvUnlockContent");
        o000OO00.OooO(textView, new OooO0O0());
        ImageView imageView = qbVarInflate.f58693OooO0o;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivWealthUpdate");
        o000OO00.OooO(imageView, new OooO0OO());
        TextView textView2 = qbVarInflate.f58699OooOO0o;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvUpdateContent");
        o000OO00.OooO(textView2, new OooO0o());
        ImageView imageView2 = qbVarInflate.f58694OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivWealthUnlockedArrow");
        o000OO00.OooO(imageView2, new OooO());
        TextView textView3 = qbVarInflate.f58697OooOO0;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvFullContent");
        o000OO00.OooO(textView3, new OooOO0());
    }
}
