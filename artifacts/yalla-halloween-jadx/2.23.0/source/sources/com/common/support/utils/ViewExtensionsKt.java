package com.common.support.utils;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qiniu.android.collect.ReportItem;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a\u0012\u0010\t\u001a\u00020\n*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f\u001a#\u0010\r\u001a\u00020\u000e\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u0002H\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a7\u0010\u0011\u001a\u00020\n\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u0002H\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\n0\u0014¢\u0006\u0002\u0010\u0015\u001a\u0012\u0010\u0016\u001a\u00020\n*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f\u001a\n\u0010\u0017\u001a\u00020\n*\u00020\u0004\u001a\u001e\u0010\u0018\u001a\u00020\n*\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0086\bø\u0001\u0000\u001a\n\u0010\u001a\u001a\u00020\n*\u00020\u0004\u001a\u001e\u0010\u001b\u001a\u00020\n*\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0086\bø\u0001\u0000\u001a\n\u0010\u001c\u001a\u00020\u000e*\u00020\u0004\u001a\n\u0010\u001d\u001a\u00020\u000e*\u00020\u0004\u001a\n\u0010\u001e\u001a\u00020\u000e*\u00020\u0004\u001a\n\u0010\u001f\u001a\u00020\u000e*\u00020\u0004\u001a\u001a\u0010 \u001a\u00020\n*\u00020\u00042\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f\u001a\u0012\u0010#\u001a\u00020\n*\u00020\u00042\u0006\u0010$\u001a\u00020\f\u001a\u0012\u0010%\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0000\u001a\u00020\f\u001a\u0012\u0010&\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0000\u001a\u00020\f\u001a\u0012\u0010'\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0000\u001a\u00020\f\u001a\u0012\u0010(\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0000\u001a\u00020\f\u001a\u0012\u0010)\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0000\u001a\u00020\f\u001a\u0012\u0010*\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0000\u001a\u00020\f\u001a\u0012\u0010+\u001a\u00020\n*\u00020\u00042\u0006\u0010$\u001a\u00020\f\u001a\u0012\u0010,\u001a\u00020\n*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f\u001a\u0012\u0010-\u001a\u00020\n*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f\u001a\n\u0010.\u001a\u00020\n*\u00020\u0004\u001a\u001e\u0010/\u001a\u00020\n*\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0086\bø\u0001\u0000\u001a\u001e\u00100\u001a\u00020\n*\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0086\bø\u0001\u0000\u001a\u001e\u00101\u001a\u00020\n*\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0086\bø\u0001\u0000\"2\u0010\u0002\u001a\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u0002H\u00032\u0006\u0010\u0000\u001a\u00020\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00062"}, d2 = {AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "triggerLastTime", "T", "Landroid/view/View;", "getTriggerLastTime", "(Landroid/view/View;)J", "setTriggerLastTime", "(Landroid/view/View;J)V", "bottomMargin", "", "size", "", "clickEnable", "", "time", "(Landroid/view/View;J)Z", "clickWithTrigger", "delay", ReportItem.LogTypeBlock, "Lkotlin/Function1;", "(Landroid/view/View;JLkotlin/jvm/functions/Function1;)V", "endMargin", "gone", "goneIf", "Lkotlin/Function0;", "invisible", "invisibleIf", "isGone", "isInvisible", "isRtl", "isVisible", "resize", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "setHeight", "newValue", "setPaddingBottom", "setPaddingEnd", "setPaddingHorizontal", "setPaddingStart", "setPaddingTop", "setPaddingVertical", "setWidth", "startMargin", "topMargin", "visible", "visibleIf", "visibleIfElseGone", "visibleIfElseInvisible", "utils_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ViewExtensionsKt {
    public static final void bottomMargin(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = marginLayoutParams2 == null ? 0 : marginLayoutParams2.leftMargin;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i3 = marginLayoutParams3 == null ? 0 : marginLayoutParams3.topMargin;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        marginLayoutParams.setMargins(i2, i3, marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0, i);
        view.setLayoutParams(marginLayoutParams);
    }

    private static final <T extends View> boolean clickEnable(T t, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - getTriggerLastTime(t)) < j) {
            return false;
        }
        setTriggerLastTime(t, jCurrentTimeMillis);
        return true;
    }

    public static final <T extends View> void clickWithTrigger(@NotNull final T t, final long j, @NotNull final Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        t.setOnClickListener(new View.OnClickListener() { // from class: com.common.support.utils.OooO0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewExtensionsKt.m4030clickWithTrigger$lambda7(t, j, block, view);
            }
        });
    }

    public static /* synthetic */ void clickWithTrigger$default(View view, long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        clickWithTrigger(view, j, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: clickWithTrigger$lambda-7, reason: not valid java name */
    public static final void m4030clickWithTrigger$lambda7(View this_clickWithTrigger, long j, Function1 block, View view) {
        Intrinsics.checkNotNullParameter(this_clickWithTrigger, "$this_clickWithTrigger");
        Intrinsics.checkNotNullParameter(block, "$block");
        if (clickEnable(this_clickWithTrigger, j)) {
            if (view == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of com.common.support.utils.ViewExtensionsKt.clickWithTrigger$lambda-7");
            }
            block.invoke(view);
        }
    }

    public static final void endMargin(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.setMarginEnd(i);
        view.setLayoutParams(marginLayoutParams);
    }

    private static final <T extends View> long getTriggerLastTime(T t) {
        if (t.getTag(1123460103) == null) {
            return -1L;
        }
        Object tag = t.getTag(1123460103);
        if (tag != null) {
            return ((Long) tag).longValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    public static final void gone(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (isGone(view)) {
            return;
        }
        view.setVisibility(8);
    }

    public static final void goneIf(@NotNull View view, @NotNull Function0<Boolean> block) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (block.invoke().booleanValue()) {
            gone(view);
        }
    }

    public static final void invisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (isInvisible(view)) {
            return;
        }
        view.setVisibility(4);
    }

    public static final void invisibleIf(@NotNull View view, @NotNull Function0<Boolean> block) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (block.invoke().booleanValue()) {
            invisible(view);
        }
    }

    public static final boolean isGone(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final boolean isInvisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 4;
    }

    public static final boolean isRtl(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        return ViewCompat.OooO.OooO0Oo(view) == 1;
    }

    public static final boolean isVisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 0;
    }

    public static final void resize(@NotNull View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static final void setHeight(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static final void setPaddingBottom(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), i);
    }

    public static final void setPaddingEnd(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static final void setPaddingHorizontal(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(i, view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static final void setPaddingStart(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    public static final void setPaddingTop(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(view.getPaddingStart(), i, view.getPaddingEnd(), view.getPaddingBottom());
    }

    public static final void setPaddingVertical(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(view.getPaddingStart(), i, view.getPaddingEnd(), i);
    }

    private static final <T extends View> void setTriggerLastTime(T t, long j) {
        t.setTag(1123460103, Long.valueOf(j));
    }

    public static final void setWidth(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    public static final void startMargin(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.setMarginStart(i);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void topMargin(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = marginLayoutParams2 == null ? 0 : marginLayoutParams2.leftMargin;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i3 = marginLayoutParams3 == null ? 0 : marginLayoutParams3.rightMargin;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        marginLayoutParams.setMargins(i2, i, i3, marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void visible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (isVisible(view)) {
            return;
        }
        view.setVisibility(0);
    }

    public static final void visibleIf(@NotNull View view, @NotNull Function0<Boolean> block) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (block.invoke().booleanValue()) {
            visible(view);
        }
    }

    public static final void visibleIfElseGone(@NotNull View view, @NotNull Function0<Boolean> block) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (block.invoke().booleanValue()) {
            visible(view);
        } else {
            gone(view);
        }
    }

    public static final void visibleIfElseInvisible(@NotNull View view, @NotNull Function0<Boolean> block) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (block.invoke().booleanValue()) {
            visible(view);
        } else {
            invisible(view);
        }
    }
}
