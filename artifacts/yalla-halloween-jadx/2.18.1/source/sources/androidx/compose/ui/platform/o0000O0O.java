package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O implements o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final int[] f6406OooO00o = new int[2];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final float[] f6407OooO0O0 = p145o00Oo0.o0000O.OooO00o();

    @Override // androidx.compose.ui.platform.o0000O0
    public final void OooO00o(@NotNull View view, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        p145o00Oo0.o0000O.OooO0Oo(matrix);
        OooO0OO(view, matrix);
    }

    public final void OooO0O0(float[] fArr, float f, float f2) {
        p145o00Oo0.o0000O.OooO0Oo(this.f6407OooO0O0);
        p145o00Oo0.o0000O.OooO0o0(this.f6407OooO0O0, f, f2);
        oo0o0Oo.OooO00o(fArr, this.f6407OooO0O0);
    }

    public final void OooO0OO(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            OooO0OO((View) parent, fArr);
            OooO0O0(fArr, -view.getScrollX(), -view.getScrollY());
            OooO0O0(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.f6406OooO00o;
            view.getLocationInWindow(iArr);
            OooO0O0(fArr, -view.getScrollX(), -view.getScrollY());
            OooO0O0(fArr, iArr[0], iArr[1]);
        }
        Matrix viewMatrix = view.getMatrix();
        if (viewMatrix.isIdentity()) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(viewMatrix, "viewMatrix");
        p145o00Oo0.Oooo000.OooO00o(this.f6407OooO0O0, viewMatrix);
        oo0o0Oo.OooO00o(fArr, this.f6407OooO0O0);
    }
}
