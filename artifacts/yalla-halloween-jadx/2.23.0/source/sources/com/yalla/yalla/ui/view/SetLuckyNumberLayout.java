package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.OooOO0;
import androidx.media3.ui.OooOO0O;
import com.code.android.util.o000OO00;
import com.google.android.exoplayer2.ui.o00oO0o;
import com.google.android.exoplayer2.ui.oo000o;
import com.yalla.yalla.ui.activity.room.o0OoOo0;
import com.yalla.yalla.ui.view.SetLuckyNumberLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOOOO.j9;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010!R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006\""}, d2 = {"Lcom/yalla/yalla/ui/view/SetLuckyNumberLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function1;", "", "", "OooO0Oo", "Lkotlin/jvm/functions/Function1;", "getCostListener", "()Lkotlin/jvm/functions/Function1;", "setCostListener", "(Lkotlin/jvm/functions/Function1;)V", "costListener", "OooO0o0", "getRangeListener", "setRangeListener", "rangeListener", "OooO0oO", "I", "getCurrCost", "()I", "setCurrCost", "(I)V", "currCost", "OooO0oo", "getCurrRange", "setCurrRange", "currRange", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class SetLuckyNumberLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final /* synthetic */ int f30669OooO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> costListener;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final j9 f30671OooO0o;

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
        j9 j9Var = this.f30671OooO0o;
        ImageView imageView = j9Var.f58195OooOO0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivLNCostFee");
        o000OO00.OooO0OO(imageView);
        ImageView imageView2 = j9Var.f58194OooO0oo;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivLNCost2");
        o000OO00.OooO0OO(imageView2);
        ImageView imageView3 = j9Var.f58186OooO;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivLNCost5");
        o000OO00.OooO0OO(imageView3);
        int i2 = this.currCost;
        if (i2 == 0) {
            ImageView imageView4 = j9Var.f58195OooOO0;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivLNCostFee");
            o000OO00.OooOOOO(imageView4);
        } else if (i2 == 2) {
            ImageView imageView5 = j9Var.f58194OooO0oo;
            Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivLNCost2");
            o000OO00.OooOOOO(imageView5);
        } else if (i2 != 5) {
            ImageView imageView6 = j9Var.f58195OooOO0;
            Intrinsics.checkNotNullExpressionValue(imageView6, "binding.ivLNCostFee");
            o000OO00.OooOOOO(imageView6);
        } else {
            ImageView imageView7 = j9Var.f58186OooO;
            Intrinsics.checkNotNullExpressionValue(imageView7, "binding.ivLNCost5");
            o000OO00.OooOOOO(imageView7);
        }
    }

    public final void OooO0OO(int i) {
        this.currRange = i;
        j9 j9Var = this.f30671OooO0o;
        ImageView imageView = j9Var.f58196OooOO0O;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivRange1");
        o000OO00.OooO0OO(imageView);
        ImageView imageView2 = j9Var.f58197OooOO0o;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivRange2");
        o000OO00.OooO0OO(imageView2);
        ImageView imageView3 = j9Var.f58198OooOOO0;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivRange3");
        o000OO00.OooO0OO(imageView3);
        int i2 = this.currRange;
        if (i2 == 1) {
            ImageView imageView4 = j9Var.f58196OooOO0O;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivRange1");
            o000OO00.OooOOOO(imageView4);
        } else if (i2 == 2) {
            ImageView imageView5 = j9Var.f58197OooOO0o;
            Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivRange2");
            o000OO00.OooOOOO(imageView5);
        } else if (i2 != 3) {
            ImageView imageView6 = j9Var.f58196OooOO0O;
            Intrinsics.checkNotNullExpressionValue(imageView6, "binding.ivRange1");
            o000OO00.OooOOOO(imageView6);
        } else {
            ImageView imageView7 = j9Var.f58198OooOOO0;
            Intrinsics.checkNotNullExpressionValue(imageView7, "binding.ivRange3");
            o000OO00.OooOOOO(imageView7);
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
        j9 j9VarInflate = j9.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(j9VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f30671OooO0o = j9VarInflate;
        j9VarInflate.f58190OooO0Oo.setOnClickListener(new o0OoOo0(this, 2));
        int i2 = 3;
        j9VarInflate.f58188OooO0O0.setOnClickListener(new oo000o(this, 3));
        j9VarInflate.f58189OooO0OO.setOnClickListener(new o00oO0o(this, 2));
        j9VarInflate.f58192OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: o0o0OoOO.u2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = SetLuckyNumberLayout.f30669OooO;
                SetLuckyNumberLayout this$0 = this.f55718OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0OO(1);
                this$0.currRange = 1;
                Function1<? super Integer, Unit> function1 = this$0.rangeListener;
                if (function1 != null) {
                    function1.invoke(1);
                }
            }
        });
        j9VarInflate.f58191OooO0o.setOnClickListener(new OooOO0(this, i2));
        j9VarInflate.f58193OooO0oO.setOnClickListener(new OooOO0O(this, i2));
        this.currCost = -1;
        this.currRange = -1;
    }
}
