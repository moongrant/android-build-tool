package p101o000oOoo;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class oO00Oo0 extends oO00Oo00 {
    @Override // p101o000oOoo.oO00OOo0, p101o000oOoo.oOOoOOO0
    public final void OooO00o(@NonNull View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p101o000oOoo.oO00Oo00, p101o000oOoo.oOOoOOO0
    public final void OooO0O0(@NonNull View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p101o000oOoo.oO00OOO
    public final float OooO0OO(@NonNull View view) {
        return view.getTransitionAlpha();
    }

    @Override // p101o000oOoo.oO00OOO
    public final void OooO0Oo(@NonNull View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p101o000oOoo.oO00OOOo
    public final void OooO0o(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p101o000oOoo.oO00OOOo
    public final void OooO0o0(@NonNull View view, @Nullable Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // p101o000oOoo.oO00OOOo
    public final void OooO0oO(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
