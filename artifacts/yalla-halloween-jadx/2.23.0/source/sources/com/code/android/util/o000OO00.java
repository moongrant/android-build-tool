package com.code.android.util;

import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO00 {
    public static final void OooO(@NotNull View view, @NotNull final Function1<? super View, Unit> listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        view.setOnClickListener(new View.OnClickListener() { // from class: com.code.android.util.o000O0O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View it) {
                Function1 listener2 = listener;
                Intrinsics.checkNotNullParameter(listener2, "$listener");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (Math.abs(jCurrentTimeMillis - o000OO0O.f10369OooO00o) > 500) {
                    o000OO0O.f10369OooO00o = jCurrentTimeMillis;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    listener2.invoke(it);
                }
            }
        });
    }

    public static final void OooO00o(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        imageView.setRotationY(imageView.getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? 180.0f : 0.0f);
    }

    public static final void OooO0O0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() == 8) {
            return;
        }
        view.setVisibility(8);
    }

    public static final void OooO0OO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() == 4) {
            return;
        }
        view.setVisibility(4);
    }

    public static final boolean OooO0Oo(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getContext().getResources().getConfiguration().getLayoutDirection() == 0;
    }

    public static final void OooO0o(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(viewGroup);
        }
    }

    public static final boolean OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 0;
    }

    public static final void OooO0oO(@NotNull ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        int i5 = OooO0Oo(viewGroup) ? i : i2;
        if (OooO0Oo(viewGroup)) {
            i = i2;
        }
        int i6 = OooO0Oo(viewGroup) ? i3 : i4;
        if (OooO0Oo(viewGroup)) {
            i3 = i4;
        }
        float[] fArr = new float[8];
        if (i5 > 0) {
            float f = i5;
            fArr[0] = f;
            fArr[1] = f;
        }
        if (i > 0) {
            float f2 = i;
            fArr[2] = f2;
            fArr[3] = f2;
        }
        if (i6 > 0) {
            float f3 = i6;
            fArr[6] = f3;
            fArr[7] = f3;
        }
        if (i3 > 0) {
            float f4 = i3;
            fArr[4] = f4;
            fArr[5] = f4;
        }
        if (viewGroup.getBackground() instanceof ColorDrawable) {
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            Paint paint = shapeDrawable.getPaint();
            Drawable background = viewGroup.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
            paint.setColor(((ColorDrawable) background).getColor());
            shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
            viewGroup.setBackground(shapeDrawable);
        }
    }

    public static void OooO0oo(View view, Function1 action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        OooO(view, new o000O(action));
    }

    public static final void OooOO0(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), i);
    }

    public static final void OooOO0O(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    public static final void OooOO0o(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(view.getPaddingStart(), i, view.getPaddingEnd(), view.getPaddingBottom());
    }

    public static final void OooOOO(int i, @NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.getLayoutParams().height = i;
        textView.requestLayout();
    }

    public static final void OooOOO0(@NotNull View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            OooOOOO(view);
        } else {
            OooO0O0(view);
        }
    }

    public static final void OooOOOO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (OooO0o0(view)) {
            return;
        }
        view.setVisibility(0);
    }
}
