package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class o000OO implements o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Matrix f6441OooO00o = new Matrix();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final int[] f6442OooO0O0 = new int[2];

    @Override // androidx.compose.ui.platform.o0000O0
    @DoNotInline
    public void OooO00o(@NotNull View view, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f6441OooO00o.reset();
        view.transformMatrixToGlobal(this.f6441OooO00o);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f6442OooO0O0);
        int[] iArr = this.f6442OooO0O0;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f6442OooO0O0;
        this.f6441OooO00o.postTranslate(iArr2[0] - i, iArr2[1] - i2);
        p145o00Oo0.Oooo000.OooO00o(matrix, this.f6441OooO00o);
    }
}
