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
import com.code.android.util.o000O;
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
import p405o0Oo0OOO.f3;
import p423o0OoO0OO.o00O0O0O;
import p423o0OoO0OO.o00O0OOO;
import p423o0OoO0OO.oo0oOO0;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/ui/view/gift/GiftWealthView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function0;", "", "OooO0o0", "Lkotlin/jvm/functions/Function0;", "getToRechargeListener", "()Lkotlin/jvm/functions/Function0;", "setToRechargeListener", "(Lkotlin/jvm/functions/Function0;)V", "toRechargeListener", "OooO0o", "getToWealthLevelListener", "setToWealthLevelListener", "toWealthLevelListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class GiftWealthView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ int f30498OooO0oo = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final f3 f30499OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> toWealthLevelListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> toRechargeListener;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public FragmentActivity f30502OooO0oO;

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
                o0oo0000.OooO00o.OooO0O0("102323");
                Function0<Unit> toRechargeListener = giftWealthView.getToRechargeListener();
                if (toRechargeListener != null) {
                    toRechargeListener.invoke();
                }
            } else {
                o0oo0000.OooO00o.OooO0O0("102322");
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
        this.f30502OooO0oO = fragmentActivity;
        f3 f3Var = this.f30499OooO0Oo;
        SVGAView ivLevel = f3Var.f43857OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivLevel, "ivLevel");
        o000O.OooO0O0(ivLevel);
        TextView tvUnlockContent = f3Var.f43864OooOO0O;
        Intrinsics.checkNotNullExpressionValue(tvUnlockContent, "tvUnlockContent");
        o000O.OooO0O0(tvUnlockContent);
        TextView tvUpdateContent = f3Var.f43865OooOO0o;
        Intrinsics.checkNotNullExpressionValue(tvUpdateContent, "tvUpdateContent");
        o000O.OooO0O0(tvUpdateContent);
        TextView tvFullContent = f3Var.f43863OooOO0;
        Intrinsics.checkNotNullExpressionValue(tvFullContent, "tvFullContent");
        o000O.OooO0O0(tvFullContent);
        ImageView ivWealthUnlockedArrow = f3Var.f43860OooO0o0;
        Intrinsics.checkNotNullExpressionValue(ivWealthUnlockedArrow, "ivWealthUnlockedArrow");
        o000O.OooO0O0(ivWealthUnlockedArrow);
        View progressWealth = f3Var.f43862OooO0oo;
        Intrinsics.checkNotNullExpressionValue(progressWealth, "progressWealth");
        o000O.OooO0O0(progressWealth);
        ImageView ivWealthLine = f3Var.f43858OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(ivWealthLine, "ivWealthLine");
        o000O.OooO0O0(ivWealthLine);
        ImageView ivWealthUpdate = f3Var.f43859OooO0o;
        Intrinsics.checkNotNullExpressionValue(ivWealthUpdate, "ivWealthUpdate");
        o000O.OooOOOO(ivWealthUpdate);
        boolean zIsUnlocked$default = WealthLevel.Companion.isUnlocked$default(WealthLevel.INSTANCE, null, 1, null);
        SVGAView sVGAView = f3Var.f43857OooO0OO;
        if (!zIsUnlocked$default) {
            Intrinsics.checkNotNull(sVGAView);
            o000O.OooOOOO(sVGAView);
            int i = o0O0O00.ic_wealth_default;
            sVGAView.f13232OooOooO = i;
            sVGAView.setImageResource(i);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            sVGAView.OooOO0O(o0OoOo0.OooOOO((String) o0O00oO0.OooO0o().getValue(), ""), this.f30502OooO0oO);
            sVGAView.OooOO0o();
            Intrinsics.checkNotNullExpressionValue(tvUnlockContent, "tvUnlockContent");
            o000O.OooOOOO(tvUnlockContent);
            ivWealthUpdate.setImageResource(o0O0O00.ic_wealth_unlock_gift_send);
            return;
        }
        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
        if (o0OoOo0.OooO00o((Boolean) ((MutableLiveData) o0O00oO0.f47977OoooO.getValue()).getValue())) {
            Intrinsics.checkNotNull(sVGAView);
            o000O.OooOOOO(sVGAView);
            int i2 = o0O0O00.ic_wealth_default;
            sVGAView.f13232OooOooO = i2;
            sVGAView.setImageResource(i2);
            sVGAView.OooOO0O(o0OoOo0.OooOOO((String) o0O00oO0.OooO0o().getValue(), ""), this.f30502OooO0oO);
            sVGAView.OooOO0o();
            Intrinsics.checkNotNullExpressionValue(tvFullContent, "tvFullContent");
            o000O.OooOOOO(tvFullContent);
            Intrinsics.checkNotNullExpressionValue(ivWealthLine, "ivWealthLine");
            o000O.OooOOOO(ivWealthLine);
            ivWealthUpdate.setImageResource(o0O0O00.ic_wealth_update_gift_send);
            return;
        }
        Intrinsics.checkNotNull(sVGAView);
        o000O.OooOOOO(sVGAView);
        int i3 = o0O0O00.ic_wealth_default;
        sVGAView.f13232OooOooO = i3;
        sVGAView.setImageResource(i3);
        sVGAView.OooOO0O(o0OoOo0.OooOOO((String) o0O00oO0.OooO0o().getValue(), ""), this.f30502OooO0oO);
        sVGAView.OooOO0o();
        Lazy lazy = o0O00oO0.f47975Oooo0oO;
        long jOooOO0 = o0OoOo0.OooOO0((Long) ((MutableLiveData) lazy.getValue()).getValue());
        Lazy lazy2 = o0O00oO0.f47978OoooO0;
        final long jOooOO1 = jOooOO0 - o0OoOo0.OooOO0((Long) ((MutableLiveData) lazy2.getValue()).getValue());
        Lazy lazy3 = o0O00oO0.f47979OoooO00;
        final long jOooOO2 = o0OoOo0.OooOO0((Long) ((MutableLiveData) lazy3.getValue()).getValue()) - o0OoOo0.OooOO0((Long) ((MutableLiveData) lazy2.getValue()).getValue());
        long jOooOO3 = o0OoOo0.OooOO0((Long) ((MutableLiveData) lazy3.getValue()).getValue()) - o0OoOo0.OooOO0((Long) ((MutableLiveData) lazy.getValue()).getValue());
        final View view = f3Var.f43854OooO;
        Intrinsics.checkNotNull(view);
        o000O.OooOOOO(view);
        Intrinsics.checkNotNullExpressionValue(progressWealth, "progressWealth");
        o000O.OooOOOO(progressWealth);
        view.post(new Runnable() { // from class: o0oOOooo.oO0O00o0
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = GiftWealthView.f30498OooO0oo;
                View progressWealthBg = view;
                Intrinsics.checkNotNullParameter(progressWealthBg, "$progressWealthBg");
                GiftWealthView this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int width = progressWealthBg.getWidth();
                double d = jOooOO1;
                long j = jOooOO2;
                double d2 = d / j;
                if (d2 >= 1.0d) {
                    d2 = 1.0d;
                }
                double d3 = d2 * ((double) width);
                if (j > 0) {
                    View progressWealth2 = this$0.f30499OooO0Oo.f43862OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(progressWealth2, "progressWealth");
                    oo0oOO0.OooO0OO(progressWealth2, (int) d3);
                }
            }
        });
        Intrinsics.checkNotNull(tvUpdateContent);
        o000O.OooOOOO(tvUpdateContent);
        String strValueOf = String.valueOf(o0OoOo0.OooO0o0(0, (Integer) o0O00oO0.OooO0oO().getValue()) + 1);
        tvUpdateContent.setText(o0000O.OooO00o(o00O0OOO.OooO0O0(o000000.gift_WealthUnlocked, this), String.valueOf(jOooOO3), strValueOf));
        o00O0O0O.OooO0Oo(tvUpdateContent, o00O0OOO.OooO00o(o0OOO0o.color_FFE574_FF, this), strValueOf);
        Intrinsics.checkNotNullExpressionValue(ivWealthUnlockedArrow, "ivWealthUnlockedArrow");
        o000O.OooOOOO(ivWealthUnlockedArrow);
        Intrinsics.checkNotNullExpressionValue(ivWealthLine, "ivWealthLine");
        o000O.OooOOOO(ivWealthLine);
        ivWealthUpdate.setImageResource(o0O0O00.ic_wealth_update_gift_send);
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
        f3 f3VarInflate = f3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(f3VarInflate, "inflate(...)");
        this.f30499OooO0Oo = f3VarInflate;
        ConstraintLayout layoutRoot = f3VarInflate.f43861OooO0oO;
        Intrinsics.checkNotNullExpressionValue(layoutRoot, "layoutRoot");
        o000O.OooO(layoutRoot, new OooO00o());
        TextView tvUnlockContent = f3VarInflate.f43864OooOO0O;
        Intrinsics.checkNotNullExpressionValue(tvUnlockContent, "tvUnlockContent");
        o000O.OooO(tvUnlockContent, new OooO0O0());
        ImageView ivWealthUpdate = f3VarInflate.f43859OooO0o;
        Intrinsics.checkNotNullExpressionValue(ivWealthUpdate, "ivWealthUpdate");
        o000O.OooO(ivWealthUpdate, new OooO0OO());
        TextView tvUpdateContent = f3VarInflate.f43865OooOO0o;
        Intrinsics.checkNotNullExpressionValue(tvUpdateContent, "tvUpdateContent");
        o000O.OooO(tvUpdateContent, new OooO0o());
        ImageView ivWealthUnlockedArrow = f3VarInflate.f43860OooO0o0;
        Intrinsics.checkNotNullExpressionValue(ivWealthUnlockedArrow, "ivWealthUnlockedArrow");
        o000O.OooO(ivWealthUnlockedArrow, new OooO());
        TextView tvFullContent = f3VarInflate.f43863OooOO0;
        Intrinsics.checkNotNullExpressionValue(tvFullContent, "tvFullContent");
        o000O.OooO(tvFullContent, new OooOO0());
    }
}
