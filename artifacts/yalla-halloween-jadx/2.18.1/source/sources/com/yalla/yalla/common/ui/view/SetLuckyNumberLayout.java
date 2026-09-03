package com.yalla.yalla.common.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.ui.view.SetLuckyNumberLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p177o00Ooooo.oOo000Oo;
import p254o00ooO0O.oOO00O;
import p508o0o00oOo.o000O0;
import p649o0ooOOoo.ug;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010!R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006\""}, d2 = {"Lcom/yalla/yalla/common/ui/view/SetLuckyNumberLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function1;", "", "", "Oooo0o", "Lkotlin/jvm/functions/Function1;", "getCostListener", "()Lkotlin/jvm/functions/Function1;", "setCostListener", "(Lkotlin/jvm/functions/Function1;)V", "costListener", "Oooo0oO", "getRangeListener", "setRangeListener", "rangeListener", "Oooo", "I", "getCurrCost", "()I", "setCurrCost", "(I)V", "currCost", "OoooO00", "getCurrRange", "setCurrRange", "currRange", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attr", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SetLuckyNumberLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final /* synthetic */ int f21014OoooO0 = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name and from kotlin metadata */
    public int currCost;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> costListener;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> rangeListener;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final ug f21018Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name and from kotlin metadata */
    public int currRange;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SetLuckyNumberLayout(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO0O0(int i) {
        this.currCost = i;
        Function1<? super Integer, Unit> function1 = this.costListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    public final void OooO0OO(int i) {
        this.currRange = i;
        Function1<? super Integer, Unit> function1 = this.rangeListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    public final void OooO0Oo(int i) {
        this.currCost = i;
        ImageView imageView = this.f21018Oooo0oo.f50742OooOO0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivLNCostFee");
        oOO00O.OooO0O0(imageView);
        ImageView imageView2 = this.f21018Oooo0oo.f50741OooO0oo;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivLNCost2");
        oOO00O.OooO0O0(imageView2);
        ImageView imageView3 = this.f21018Oooo0oo.f50733OooO;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivLNCost5");
        oOO00O.OooO0O0(imageView3);
        int i2 = this.currCost;
        if (i2 == 0) {
            ImageView imageView4 = this.f21018Oooo0oo.f50742OooOO0;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivLNCostFee");
            oOO00O.OooO(imageView4);
        } else if (i2 == 2) {
            ImageView imageView5 = this.f21018Oooo0oo.f50741OooO0oo;
            Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivLNCost2");
            oOO00O.OooO(imageView5);
        } else if (i2 != 5) {
            ImageView imageView6 = this.f21018Oooo0oo.f50742OooOO0;
            Intrinsics.checkNotNullExpressionValue(imageView6, "binding.ivLNCostFee");
            oOO00O.OooO(imageView6);
        } else {
            ImageView imageView7 = this.f21018Oooo0oo.f50733OooO;
            Intrinsics.checkNotNullExpressionValue(imageView7, "binding.ivLNCost5");
            oOO00O.OooO(imageView7);
        }
    }

    public final void OooO0o0(int i) {
        this.currRange = i;
        ImageView imageView = this.f21018Oooo0oo.f50743OooOO0O;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivRange1");
        oOO00O.OooO0O0(imageView);
        ImageView imageView2 = this.f21018Oooo0oo.f50744OooOO0o;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivRange2");
        oOO00O.OooO0O0(imageView2);
        ImageView imageView3 = this.f21018Oooo0oo.f50745OooOOO0;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivRange3");
        oOO00O.OooO0O0(imageView3);
        int i2 = this.currRange;
        if (i2 == 1) {
            ImageView imageView4 = this.f21018Oooo0oo.f50743OooOO0O;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivRange1");
            oOO00O.OooO(imageView4);
        } else if (i2 == 2) {
            ImageView imageView5 = this.f21018Oooo0oo.f50744OooOO0o;
            Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivRange2");
            oOO00O.OooO(imageView5);
        } else if (i2 != 3) {
            ImageView imageView6 = this.f21018Oooo0oo.f50743OooOO0O;
            Intrinsics.checkNotNullExpressionValue(imageView6, "binding.ivRange1");
            oOO00O.OooO(imageView6);
        } else {
            ImageView imageView7 = this.f21018Oooo0oo.f50745OooOOO0;
            Intrinsics.checkNotNullExpressionValue(imageView7, "binding.ivRange3");
            oOO00O.OooO(imageView7);
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
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SetLuckyNumberLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ug ugVarInflate = ug.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(ugVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f21018Oooo0oo = ugVarInflate;
        ugVarInflate.f50737OooO0Oo.setOnClickListener(new oOo000Oo(this, 2));
        ugVarInflate.f50735OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0o00oOo.o000O0Oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetLuckyNumberLayout this$0 = this.f41857Oooo0o;
                int i2 = SetLuckyNumberLayout.f21014OoooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0Oo(2);
                this$0.OooO0O0(2);
            }
        });
        ugVarInflate.f50736OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0o00oOo.o000OO0O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetLuckyNumberLayout this$0 = this.f41874Oooo0o;
                int i2 = SetLuckyNumberLayout.f21014OoooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0Oo(5);
                this$0.OooO0O0(5);
            }
        });
        ugVarInflate.f50739OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: o0o00oOo.o000O0O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetLuckyNumberLayout this$0 = this.f41856Oooo0o;
                int i2 = SetLuckyNumberLayout.f21014OoooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0o0(1);
                this$0.OooO0OO(1);
            }
        });
        ugVarInflate.f50738OooO0o.setOnClickListener(new View.OnClickListener() { // from class: o0o00oOo.o000O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SetLuckyNumberLayout this$0 = this.f41820Oooo0o;
                int i2 = SetLuckyNumberLayout.f21014OoooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0o0(2);
                this$0.OooO0OO(2);
            }
        });
        ugVarInflate.f50740OooO0oO.setOnClickListener(new o000O0(this, 0));
        this.currCost = -1;
        this.currRange = -1;
    }
}
