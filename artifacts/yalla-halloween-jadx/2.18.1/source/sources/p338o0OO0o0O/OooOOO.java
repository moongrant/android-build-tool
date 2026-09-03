package p338o0OO0o0O;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends Property<ImageView, Matrix> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Matrix f37979OooO00o;

    public OooOOO() {
        super(Matrix.class, "imageMatrixProperty");
        this.f37979OooO00o = new Matrix();
    }

    @Override // android.util.Property
    @NonNull
    public final Matrix get(@NonNull ImageView imageView) {
        this.f37979OooO00o.set(imageView.getImageMatrix());
        return this.f37979OooO00o;
    }

    @Override // android.util.Property
    public final void set(@NonNull ImageView imageView, @NonNull Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
