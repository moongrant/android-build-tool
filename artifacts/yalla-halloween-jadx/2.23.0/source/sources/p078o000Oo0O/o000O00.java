package p078o000Oo0O;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(29)
public final class o000O00 extends o000Oo0 {
    @Override // p078o000Oo0O.o000Oo0, p078o000Oo0O.o000O00O
    public final void OooO00o(int i, @NonNull View view) {
        view.setTransitionVisibility(i);
    }

    @Override // p078o000Oo0O.o0000O0O
    public final float OooO0O0(@NonNull View view) {
        return view.getTransitionAlpha();
    }

    @Override // p078o000Oo0O.o0000O0O
    public final void OooO0OO(@NonNull View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p078o000Oo0O.o0000OO0
    public final void OooO0Oo(@NonNull View view, @Nullable Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // p078o000Oo0O.o0000OO0
    public final void OooO0o(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // p078o000Oo0O.o0000OO0
    public final void OooO0o0(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p078o000Oo0O.o000O000
    public final void OooO0oO(@NonNull View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
