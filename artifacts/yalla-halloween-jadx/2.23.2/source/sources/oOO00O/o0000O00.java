package oOO00O;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(29)
public final class o0000O00 extends o0000 {
    @Override // oOO00O.o0000, oOO00O.o0000oo
    public final void OooO00o(int i, @NonNull View view) {
        view.setTransitionVisibility(i);
    }

    @Override // oOO00O.o000000
    public final float OooO0O0(@NonNull View view) {
        return view.getTransitionAlpha();
    }

    @Override // oOO00O.o000000
    public final void OooO0OO(@NonNull View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // oOO00O.o00000O0
    public final void OooO0Oo(@NonNull View view, @Nullable Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // oOO00O.o00000O0
    public final void OooO0o(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // oOO00O.o00000O0
    public final void OooO0o0(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // oOO00O.o00000OO
    public final void OooO0oO(@NonNull View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
