package p254o00ooO0O;

import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class oOO00O {
    public static final void OooO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (OooO0Oo(view)) {
            return;
        }
        view.setVisibility(0);
    }

    public static final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() == 8) {
            return;
        }
        view.setVisibility(8);
    }

    public static final void OooO0O0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() == 4) {
            return;
        }
        view.setVisibility(4);
    }

    public static final boolean OooO0OO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getContext().getResources().getConfiguration().getLayoutDirection() == 0;
    }

    public static final boolean OooO0Oo(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 0;
    }

    public static final void OooO0o(@NotNull View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i5 = OooO0OO(view) ? i : i2;
        if (OooO0OO(view)) {
            i = i2;
        }
        int i6 = OooO0OO(view) ? i3 : i4;
        if (OooO0OO(view)) {
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
        if (view.getBackground() instanceof ColorDrawable) {
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            Paint paint = shapeDrawable.getPaint();
            Drawable background = view.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
            paint.setColor(((ColorDrawable) background).getColor());
            shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
            view.setBackground(shapeDrawable);
        }
    }

    public static final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public static final void OooO0oO(@NotNull View view, @NotNull Function1<? super View, Unit> listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        view.setOnClickListener(new o00O00O(listener, 0));
    }

    public static final void OooO0oo(@NotNull View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            OooO(view);
        } else {
            OooO00o(view);
        }
    }
}
