package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.view.SetLuckyNumberLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.y0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010!R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006\""}, d2 = {"Lcom/yalla/yalla/ui/view/SetLuckyNumberLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function1;", "", "", "OooO0Oo", "Lkotlin/jvm/functions/Function1;", "getCostListener", "()Lkotlin/jvm/functions/Function1;", "setCostListener", "(Lkotlin/jvm/functions/Function1;)V", "costListener", "OooO0o0", "getRangeListener", "setRangeListener", "rangeListener", "OooO0oO", "I", "getCurrCost", "()I", "setCurrCost", "(I)V", "currCost", "OooO0oo", "getCurrRange", "setCurrRange", "currRange", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class SetLuckyNumberLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final /* synthetic */ int f30124OooO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> costListener;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final y0 f30126OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> rangeListener;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    public int currCost;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    public int currRange;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SetLuckyNumberLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO0O0(int i) {
        this.currCost = i;
        y0 y0Var = this.f30126OooO0o;
        ImageView ivLNCostFee = y0Var.f45701OooOO0;
        Intrinsics.checkNotNullExpressionValue(ivLNCostFee, "ivLNCostFee");
        o000O.OooO0OO(ivLNCostFee);
        ImageView ivLNCost2 = y0Var.f45700OooO0oo;
        Intrinsics.checkNotNullExpressionValue(ivLNCost2, "ivLNCost2");
        o000O.OooO0OO(ivLNCost2);
        ImageView ivLNCost5 = y0Var.f45692OooO;
        Intrinsics.checkNotNullExpressionValue(ivLNCost5, "ivLNCost5");
        o000O.OooO0OO(ivLNCost5);
        int i2 = this.currCost;
        if (i2 == 0) {
            ImageView ivLNCostFee2 = y0Var.f45701OooOO0;
            Intrinsics.checkNotNullExpressionValue(ivLNCostFee2, "ivLNCostFee");
            o000O.OooOOOO(ivLNCostFee2);
        } else if (i2 == 2) {
            ImageView ivLNCost3 = y0Var.f45700OooO0oo;
            Intrinsics.checkNotNullExpressionValue(ivLNCost3, "ivLNCost2");
            o000O.OooOOOO(ivLNCost3);
        } else if (i2 != 5) {
            ImageView ivLNCostFee3 = y0Var.f45701OooOO0;
            Intrinsics.checkNotNullExpressionValue(ivLNCostFee3, "ivLNCostFee");
            o000O.OooOOOO(ivLNCostFee3);
        } else {
            ImageView ivLNCost6 = y0Var.f45692OooO;
            Intrinsics.checkNotNullExpressionValue(ivLNCost6, "ivLNCost5");
            o000O.OooOOOO(ivLNCost6);
        }
    }

    public final void OooO0OO(int i) {
        this.currRange = i;
        y0 y0Var = this.f30126OooO0o;
        ImageView ivRange1 = y0Var.f45702OooOO0O;
        Intrinsics.checkNotNullExpressionValue(ivRange1, "ivRange1");
        o000O.OooO0OO(ivRange1);
        ImageView ivRange2 = y0Var.f45703OooOO0o;
        Intrinsics.checkNotNullExpressionValue(ivRange2, "ivRange2");
        o000O.OooO0OO(ivRange2);
        ImageView ivRange3 = y0Var.f45704OooOOO0;
        Intrinsics.checkNotNullExpressionValue(ivRange3, "ivRange3");
        o000O.OooO0OO(ivRange3);
        int i2 = this.currRange;
        if (i2 == 1) {
            ImageView ivRange4 = y0Var.f45702OooOO0O;
            Intrinsics.checkNotNullExpressionValue(ivRange4, "ivRange1");
            o000O.OooOOOO(ivRange4);
        } else if (i2 == 2) {
            ImageView ivRange5 = y0Var.f45703OooOO0o;
            Intrinsics.checkNotNullExpressionValue(ivRange5, "ivRange2");
            o000O.OooOOOO(ivRange5);
        } else if (i2 != 3) {
            ImageView ivRange6 = y0Var.f45702OooOO0O;
            Intrinsics.checkNotNullExpressionValue(ivRange6, "ivRange1");
            o000O.OooOOOO(ivRange6);
        } else {
            ImageView ivRange7 = y0Var.f45704OooOOO0;
            Intrinsics.checkNotNullExpressionValue(ivRange7, "ivRange3");
            o000O.OooOOOO(ivRange7);
        }
    }

    @Nullable
    public final Function1<Integer, Unit> getCostListener() {
        return this.costListener;
    }

    public final int getCurrCost() {
        return this.currCost;
    }

    public final int getCurrRange() {
        return this.currRange;
    }

    @Nullable
    public final Function1<Integer, Unit> getRangeListener() {
        return this.rangeListener;
    }

    public final void setCostListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.costListener = function1;
    }

    public final void setCurrCost(int i) {
        this.currCost = i;
    }

    public final void setCurrRange(int i) {
        this.currRange = i;
    }

    public final void setRangeListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.rangeListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SetLuckyNumberLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SetLuckyNumberLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SetLuckyNumberLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        y0 y0VarInflate = y0.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(y0VarInflate, "inflate(...)");
        this.f30126OooO0o = y0VarInflate;
        y0VarInflate.f45696OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: o0oOooOO.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = SetLuckyNumberLayout.f30124OooO;
                SetLuckyNumberLayout this$0 = this.f56988OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0(0);
                this$0.currCost = 0;
                Function1<? super Integer, Unit> function1 = this$0.costListener;
                if (function1 != null) {
                    function1.invoke(0);
                }
            }
        });
        y0VarInflate.f45694OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0oOooOO.u1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = SetLuckyNumberLayout.f30124OooO;
                SetLuckyNumberLayout this$0 = this.f56993OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0(2);
                this$0.currCost = 2;
                Function1<? super Integer, Unit> function1 = this$0.costListener;
                if (function1 != null) {
                    function1.invoke(2);
                }
            }
        });
        y0VarInflate.f45695OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0oOooOO.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = SetLuckyNumberLayout.f30124OooO;
                SetLuckyNumberLayout this$0 = this.f56999OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0(5);
                this$0.currCost = 5;
                Function1<? super Integer, Unit> function1 = this$0.costListener;
                if (function1 != null) {
                    function1.invoke(5);
                }
            }
        });
        y0VarInflate.f45698OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: o0oOooOO.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = SetLuckyNumberLayout.f30124OooO;
                SetLuckyNumberLayout this$0 = this.f57006OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0OO(1);
                this$0.currRange = 1;
                Function1<? super Integer, Unit> function1 = this$0.rangeListener;
                if (function1 != null) {
                    function1.invoke(1);
                }
            }
        });
        y0VarInflate.f45697OooO0o.setOnClickListener(new View.OnClickListener() { // from class: o0oOooOO.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = SetLuckyNumberLayout.f30124OooO;
                SetLuckyNumberLayout this$0 = this.f57018OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0OO(2);
                this$0.currRange = 2;
                Function1<? super Integer, Unit> function1 = this$0.rangeListener;
                if (function1 != null) {
                    function1.invoke(2);
                }
            }
        });
        y0VarInflate.f45699OooO0oO.setOnClickListener(new View.OnClickListener() { // from class: o0oOooOO.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = SetLuckyNumberLayout.f30124OooO;
                SetLuckyNumberLayout this$0 = this.f57026OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0OO(3);
                this$0.currRange = 3;
                Function1<? super Integer, Unit> function1 = this$0.rangeListener;
                if (function1 != null) {
                    function1.invoke(3);
                }
            }
        });
        this.currCost = -1;
        this.currRange = -1;
    }
}
