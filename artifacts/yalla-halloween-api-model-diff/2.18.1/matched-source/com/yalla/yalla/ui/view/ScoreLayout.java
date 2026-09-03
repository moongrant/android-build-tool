package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p649o0ooOOoo.lc;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/ui/view/ScoreLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "", "score", "", "setCurrentScore", "Lkotlin/Function1;", "Oooo0oo", "Lkotlin/jvm/functions/Function1;", "getSelectRequest", "()Lkotlin/jvm/functions/Function1;", "setSelectRequest", "(Lkotlin/jvm/functions/Function1;)V", "selectRequest", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ScoreLayout extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public TextView f25120Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final lc f25121Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f25122Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> selectRequest;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScoreLayout(@NotNull Context context) {
        this(context, null, 0);
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
        if (this.f25122Oooo0oO) {
            TextView textView = this.f25120Oooo;
            if (textView != null) {
                textView.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
            }
            TextView textView2 = this.f25120Oooo;
            if (textView2 != null) {
                textView2.setBackgroundResource(R.drawable.message_shape_view_score_border);
            }
            TextView textView3 = (TextView) view;
            this.f25120Oooo = textView3;
            if (textView3 != null) {
                textView3.setTextColor(o000O0O0.OooO00o(R.color.white));
            }
            TextView textView4 = this.f25120Oooo;
            if (textView4 != null) {
                textView4.setBackgroundResource(R.drawable.message_shape_view_score_select);
            }
            if (Intrinsics.areEqual(view, this.f25121Oooo0o.f49952OooO0O0)) {
                Function1<? super Integer, Unit> function2 = this.selectRequest;
                if (function2 != null) {
                    function2.invoke(0);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, this.f25121Oooo0o.f49953OooO0OO)) {
                Function1<? super Integer, Unit> function3 = this.selectRequest;
                if (function3 != null) {
                    function3.invoke(1);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, this.f25121Oooo0o.f49956OooO0o0)) {
                Function1<? super Integer, Unit> function4 = this.selectRequest;
                if (function4 != null) {
                    function4.invoke(2);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, this.f25121Oooo0o.f49955OooO0o)) {
                Function1<? super Integer, Unit> function5 = this.selectRequest;
                if (function5 != null) {
                    function5.invoke(3);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, this.f25121Oooo0o.f49957OooO0oO)) {
                Function1<? super Integer, Unit> function6 = this.selectRequest;
                if (function6 != null) {
                    function6.invoke(4);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, this.f25121Oooo0o.f49958OooO0oo)) {
                Function1<? super Integer, Unit> function7 = this.selectRequest;
                if (function7 != null) {
                    function7.invoke(5);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, this.f25121Oooo0o.f49950OooO)) {
                Function1<? super Integer, Unit> function8 = this.selectRequest;
                if (function8 != null) {
                    function8.invoke(6);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, this.f25121Oooo0o.f49959OooOO0)) {
                Function1<? super Integer, Unit> function9 = this.selectRequest;
                if (function9 != null) {
                    function9.invoke(7);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, this.f25121Oooo0o.f49960OooOO0O)) {
                Function1<? super Integer, Unit> function10 = this.selectRequest;
                if (function10 != null) {
                    function10.invoke(8);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, this.f25121Oooo0o.f49961OooOO0o)) {
                Function1<? super Integer, Unit> function11 = this.selectRequest;
                if (function11 != null) {
                    function11.invoke(9);
                    return;
                }
                return;
            }
            if (!Intrinsics.areEqual(view, this.f25121Oooo0o.f49954OooO0Oo) || (function1 = this.selectRequest) == null) {
                return;
            }
            function1.invoke(10);
        }
    }

    public final void setCurrentScore(int score) {
        TextView textView;
        this.f25122Oooo0oO = false;
        TextView textView2 = this.f25120Oooo;
        if (textView2 != null) {
            textView2.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
        }
        TextView textView3 = this.f25120Oooo;
        if (textView3 != null) {
            textView3.setBackgroundResource(R.drawable.message_shape_view_score_border);
        }
        switch (score) {
            case 0:
                textView = this.f25121Oooo0o.f49952OooO0O0;
                break;
            case 1:
                textView = this.f25121Oooo0o.f49953OooO0OO;
                break;
            case 2:
                textView = this.f25121Oooo0o.f49956OooO0o0;
                break;
            case 3:
                textView = this.f25121Oooo0o.f49955OooO0o;
                break;
            case 4:
                textView = this.f25121Oooo0o.f49957OooO0oO;
                break;
            case 5:
                textView = this.f25121Oooo0o.f49958OooO0oo;
                break;
            case 6:
                textView = this.f25121Oooo0o.f49950OooO;
                break;
            case 7:
                textView = this.f25121Oooo0o.f49959OooOO0;
                break;
            case 8:
                textView = this.f25121Oooo0o.f49960OooOO0O;
                break;
            case 9:
                textView = this.f25121Oooo0o.f49961OooOO0o;
                break;
            case 10:
                textView = this.f25121Oooo0o.f49954OooO0Oo;
                break;
            default:
                textView = null;
                break;
        }
        this.f25120Oooo = textView;
        if (textView != null) {
            textView.setTextColor(o000O0O0.OooO00o(R.color.white));
        }
        TextView textView4 = this.f25120Oooo;
        if (textView4 != null) {
            textView4.setBackgroundResource(R.drawable.message_shape_view_score_select);
        }
    }

    public final void setSelectRequest(@Nullable Function1<? super Integer, Unit> function1) {
        this.selectRequest = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScoreLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScoreLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        lc lcVarInflate = lc.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(lcVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25121Oooo0o = lcVarInflate;
        this.f25122Oooo0oO = true;
        lcVarInflate.f49952OooO0O0.setOnClickListener(this);
        lcVarInflate.f49953OooO0OO.setOnClickListener(this);
        lcVarInflate.f49956OooO0o0.setOnClickListener(this);
        lcVarInflate.f49955OooO0o.setOnClickListener(this);
        lcVarInflate.f49957OooO0oO.setOnClickListener(this);
        lcVarInflate.f49958OooO0oo.setOnClickListener(this);
        lcVarInflate.f49950OooO.setOnClickListener(this);
        lcVarInflate.f49959OooOO0.setOnClickListener(this);
        lcVarInflate.f49960OooOO0O.setOnClickListener(this);
        lcVarInflate.f49961OooOO0o.setOnClickListener(this);
        lcVarInflate.f49954OooO0Oo.setOnClickListener(this);
    }
}
