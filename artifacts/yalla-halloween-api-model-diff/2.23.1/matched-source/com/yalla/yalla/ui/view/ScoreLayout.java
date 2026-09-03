package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOO.ooo0o;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.o0ooOOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/ui/view/ScoreLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "", "score", "", "setCurrentScore", "Lkotlin/Function1;", "OooO0o", "Lkotlin/jvm/functions/Function1;", "getSelectRequest", "()Lkotlin/jvm/functions/Function1;", "setSelectRequest", "(Lkotlin/jvm/functions/Function1;)V", "selectRequest", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class ScoreLayout extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ooo0o f30065OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> selectRequest;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f30067OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public TextView f30068OooO0oO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScoreLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final Function1<Integer, Unit> getSelectRequest() {
        return this.selectRequest;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        Function1<? super Integer, Unit> function1;
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f30067OooO0o0) {
            TextView textView = this.f30068OooO0oO;
            if (textView != null) {
                textView.setTextColor(o0000.OooO00o(o0ooOOo.color_00d8c9));
            }
            TextView textView2 = this.f30068OooO0oO;
            if (textView2 != null) {
                textView2.setBackgroundResource(o0OOO0o.message_shape_view_score_border);
            }
            TextView textView3 = (TextView) view;
            this.f30068OooO0oO = textView3;
            if (textView3 != null) {
                textView3.setTextColor(o0000.OooO00o(o0ooOOo.white));
            }
            TextView textView4 = this.f30068OooO0oO;
            if (textView4 != null) {
                textView4.setBackgroundResource(o0OOO0o.message_shape_view_score_select);
            }
            ooo0o ooo0oVar = this.f30065OooO0Oo;
            if (Intrinsics.areEqual(view, ooo0oVar.f45324OooO0O0)) {
                Function1<? super Integer, Unit> function2 = this.selectRequest;
                if (function2 != null) {
                    function2.invoke(0);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, ooo0oVar.f45325OooO0OO)) {
                Function1<? super Integer, Unit> function3 = this.selectRequest;
                if (function3 != null) {
                    function3.invoke(1);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, ooo0oVar.f45328OooO0o0)) {
                Function1<? super Integer, Unit> function4 = this.selectRequest;
                if (function4 != null) {
                    function4.invoke(2);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, ooo0oVar.f45327OooO0o)) {
                Function1<? super Integer, Unit> function5 = this.selectRequest;
                if (function5 != null) {
                    function5.invoke(3);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, ooo0oVar.f45329OooO0oO)) {
                Function1<? super Integer, Unit> function6 = this.selectRequest;
                if (function6 != null) {
                    function6.invoke(4);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, ooo0oVar.f45330OooO0oo)) {
                Function1<? super Integer, Unit> function7 = this.selectRequest;
                if (function7 != null) {
                    function7.invoke(5);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, ooo0oVar.f45322OooO)) {
                Function1<? super Integer, Unit> function8 = this.selectRequest;
                if (function8 != null) {
                    function8.invoke(6);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, ooo0oVar.f45331OooOO0)) {
                Function1<? super Integer, Unit> function9 = this.selectRequest;
                if (function9 != null) {
                    function9.invoke(7);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, ooo0oVar.f45332OooOO0O)) {
                Function1<? super Integer, Unit> function10 = this.selectRequest;
                if (function10 != null) {
                    function10.invoke(8);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, ooo0oVar.f45333OooOO0o)) {
                Function1<? super Integer, Unit> function11 = this.selectRequest;
                if (function11 != null) {
                    function11.invoke(9);
                    return;
                }
                return;
            }
            if (!Intrinsics.areEqual(view, ooo0oVar.f45326OooO0Oo) || (function1 = this.selectRequest) == null) {
                return;
            }
            function1.invoke(10);
        }
    }

    public final void setCurrentScore(int score) {
        TextView textView;
        this.f30067OooO0o0 = false;
        TextView textView2 = this.f30068OooO0oO;
        if (textView2 != null) {
            textView2.setTextColor(o0000.OooO00o(o0ooOOo.color_00d8c9));
        }
        TextView textView3 = this.f30068OooO0oO;
        if (textView3 != null) {
            textView3.setBackgroundResource(o0OOO0o.message_shape_view_score_border);
        }
        ooo0o ooo0oVar = this.f30065OooO0Oo;
        switch (score) {
            case 0:
                textView = ooo0oVar.f45324OooO0O0;
                break;
            case 1:
                textView = ooo0oVar.f45325OooO0OO;
                break;
            case 2:
                textView = ooo0oVar.f45328OooO0o0;
                break;
            case 3:
                textView = ooo0oVar.f45327OooO0o;
                break;
            case 4:
                textView = ooo0oVar.f45329OooO0oO;
                break;
            case 5:
                textView = ooo0oVar.f45330OooO0oo;
                break;
            case 6:
                textView = ooo0oVar.f45322OooO;
                break;
            case 7:
                textView = ooo0oVar.f45331OooOO0;
                break;
            case 8:
                textView = ooo0oVar.f45332OooOO0O;
                break;
            case 9:
                textView = ooo0oVar.f45333OooOO0o;
                break;
            case 10:
                textView = ooo0oVar.f45326OooO0Oo;
                break;
            default:
                textView = null;
                break;
        }
        this.f30068OooO0oO = textView;
        if (textView != null) {
            textView.setTextColor(o0000.OooO00o(o0ooOOo.white));
        }
        TextView textView4 = this.f30068OooO0oO;
        if (textView4 != null) {
            textView4.setBackgroundResource(o0OOO0o.message_shape_view_score_select);
        }
    }

    public final void setSelectRequest(@Nullable Function1<? super Integer, Unit> function1) {
        this.selectRequest = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScoreLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScoreLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScoreLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ooo0o ooo0oVarInflate = ooo0o.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(ooo0oVarInflate, "inflate(...)");
        this.f30065OooO0Oo = ooo0oVarInflate;
        this.f30067OooO0o0 = true;
        ooo0oVarInflate.f45324OooO0O0.setOnClickListener(this);
        ooo0oVarInflate.f45325OooO0OO.setOnClickListener(this);
        ooo0oVarInflate.f45328OooO0o0.setOnClickListener(this);
        ooo0oVarInflate.f45327OooO0o.setOnClickListener(this);
        ooo0oVarInflate.f45329OooO0oO.setOnClickListener(this);
        ooo0oVarInflate.f45330OooO0oo.setOnClickListener(this);
        ooo0oVarInflate.f45322OooO.setOnClickListener(this);
        ooo0oVarInflate.f45331OooOO0.setOnClickListener(this);
        ooo0oVarInflate.f45332OooOO0O.setOnClickListener(this);
        ooo0oVarInflate.f45333OooOO0o.setOnClickListener(this);
        ooo0oVarInflate.f45326OooO0Oo.setOnClickListener(this);
    }
}
