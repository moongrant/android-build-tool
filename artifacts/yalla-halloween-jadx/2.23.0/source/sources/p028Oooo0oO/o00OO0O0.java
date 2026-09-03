package p028Oooo0oO;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.OooOO0O;
import androidx.camera.core.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00OO0O0 extends OooOO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f1160OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Object f1161OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final oo00o f1162OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f1163OooOO0;

    public o00OO0O0(@NonNull OooOOO0 oooOOO0, @Nullable Size size, @NonNull oo00o oo00oVar) {
        super(oooOOO0);
        this.f1161OooO0oO = new Object();
        if (size == null) {
            this.f1160OooO = super.getWidth();
            this.f1163OooOO0 = super.getHeight();
        } else {
            this.f1160OooO = size.getWidth();
            this.f1163OooOO0 = size.getHeight();
        }
        this.f1162OooO0oo = oo00oVar;
    }

    public final void OooO0OO(@Nullable Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.f1160OooO, this.f1163OooOO0)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.f1161OooO0oO) {
        }
    }

    @Override // androidx.camera.core.OooOO0O, androidx.camera.core.OooOOO0
    public final int getHeight() {
        return this.f1163OooOO0;
    }

    @Override // androidx.camera.core.OooOO0O, androidx.camera.core.OooOOO0
    public final int getWidth() {
        return this.f1160OooO;
    }

    @Override // androidx.camera.core.OooOO0O, androidx.camera.core.OooOOO0
    @NonNull
    public final oo00o o00000OO() {
        return this.f1162OooO0oo;
    }
}
