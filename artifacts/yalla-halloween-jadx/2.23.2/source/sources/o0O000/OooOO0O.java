package o0O000;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends Property<ImageView, Matrix> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Matrix f40887OooO00o;

    public OooOO0O() {
        super(Matrix.class, "imageMatrixProperty");
        this.f40887OooO00o = new Matrix();
    }

    @Override // android.util.Property
    @NonNull
    public final Matrix get(@NonNull ImageView imageView) {
        Matrix matrix = this.f40887OooO00o;
        matrix.set(imageView.getImageMatrix());
        return matrix;
    }

    @Override // android.util.Property
    public final void set(@NonNull ImageView imageView, @NonNull Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
