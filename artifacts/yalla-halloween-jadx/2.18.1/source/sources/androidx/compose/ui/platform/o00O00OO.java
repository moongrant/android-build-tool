package androidx.compose.ui.platform;

import android.graphics.Matrix;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function2<T, Matrix, Unit> f6463OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Matrix f6464OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Matrix f6465OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public float[] f6466OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f6467OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public float[] f6468OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f6469OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f6470OooO0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public o00O00OO(@NotNull Function2<? super T, ? super Matrix, Unit> getMatrix) {
        Intrinsics.checkNotNullParameter(getMatrix, "getMatrix");
        this.f6463OooO00o = getMatrix;
        this.f6467OooO0o = true;
        this.f6469OooO0oO = true;
        this.f6470OooO0oo = true;
    }

    @Nullable
    public final float[] OooO00o(T t) {
        float[] fArrOooO00o = this.f6468OooO0o0;
        if (fArrOooO00o == null) {
            fArrOooO00o = p145o00Oo0.o0000O.OooO00o();
            this.f6468OooO0o0 = fArrOooO00o;
        }
        if (this.f6469OooO0oO) {
            this.f6470OooO0oo = o00O00O.OooO00o(OooO0O0(t), fArrOooO00o);
            this.f6469OooO0oO = false;
        }
        if (this.f6470OooO0oo) {
            return fArrOooO00o;
        }
        return null;
    }

    @NotNull
    public final float[] OooO0O0(T t) {
        float[] fArrOooO00o = this.f6466OooO0Oo;
        if (fArrOooO00o == null) {
            fArrOooO00o = p145o00Oo0.o0000O.OooO00o();
            this.f6466OooO0Oo = fArrOooO00o;
        }
        if (!this.f6467OooO0o) {
            return fArrOooO00o;
        }
        Matrix matrix = this.f6464OooO0O0;
        if (matrix == null) {
            matrix = new Matrix();
            this.f6464OooO0O0 = matrix;
        }
        this.f6463OooO00o.invoke(t, matrix);
        Matrix matrix2 = this.f6465OooO0OO;
        if (matrix2 == null || !Intrinsics.areEqual(matrix, matrix2)) {
            p145o00Oo0.Oooo000.OooO00o(fArrOooO00o, matrix);
            this.f6464OooO0O0 = matrix2;
            this.f6465OooO0OO = matrix;
        }
        this.f6467OooO0o = false;
        return fArrOooO00o;
    }

    public final void OooO0OO() {
        this.f6467OooO0o = true;
        this.f6469OooO0oO = true;
    }
}
