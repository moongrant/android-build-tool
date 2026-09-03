package p029Oooo0oo;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.o000oOoO;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000o0 extends o0oo0000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f1245OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f1246OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ImageCapture.OooOO0 f1247OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ImageCapture.OooOO0O f1248OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Matrix f1249OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Rect f1250OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f1251OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f1252OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final List<o000oOoO> f1253OooOO0;

    public o0O000o0(Executor executor, @Nullable ImageCapture.OooOO0 oooOO1, @Nullable ImageCapture.OooOO0O oooOO0O, Rect rect, Matrix matrix, int i, int i2, int i3, List list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f1246OooO0O0 = executor;
        this.f1247OooO0OO = oooOO1;
        this.f1248OooO0Oo = oooOO0O;
        this.f1250OooO0o0 = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f1249OooO0o = matrix;
        this.f1251OooO0oO = i;
        this.f1252OooO0oo = i2;
        this.f1245OooO = i3;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f1253OooOO0 = list;
    }

    @Override // p029Oooo0oo.o0oo0000
    @NonNull
    public final Matrix OooO() {
        return this.f1249OooO0o;
    }

    @Override // p029Oooo0oo.o0oo0000
    @NonNull
    public final Executor OooO00o() {
        return this.f1246OooO0O0;
    }

    @Override // p029Oooo0oo.o0oo0000
    public final int OooO0O0() {
        return this.f1245OooO;
    }

    @Override // p029Oooo0oo.o0oo0000
    @NonNull
    public final Rect OooO0OO() {
        return this.f1250OooO0o0;
    }

    @Override // p029Oooo0oo.o0oo0000
    @Nullable
    public final ImageCapture.OooO OooO0Oo() {
        return null;
    }

    @Override // p029Oooo0oo.o0oo0000
    @Nullable
    public final ImageCapture.OooOO0 OooO0o() {
        return this.f1247OooO0OO;
    }

    @Override // p029Oooo0oo.o0oo0000
    @IntRange(from = 1, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
    public final int OooO0o0() {
        return this.f1252OooO0oo;
    }

    @Override // p029Oooo0oo.o0oo0000
    @Nullable
    public final ImageCapture.OooOO0O OooO0oO() {
        return this.f1248OooO0Oo;
    }

    @Override // p029Oooo0oo.o0oo0000
    public final int OooO0oo() {
        return this.f1251OooO0oO;
    }

    @Override // p029Oooo0oo.o0oo0000
    @NonNull
    public final List<o000oOoO> OooOO0() {
        return this.f1253OooOO0;
    }

    public final boolean equals(Object obj) {
        ImageCapture.OooOO0 oooOO1;
        ImageCapture.OooOO0O oooOO0O;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0oo0000)) {
            return false;
        }
        o0oo0000 o0oo0000Var = (o0oo0000) obj;
        return this.f1246OooO0O0.equals(o0oo0000Var.OooO00o()) && o0oo0000Var.OooO0Oo() == null && ((oooOO1 = this.f1247OooO0OO) != null ? oooOO1.equals(o0oo0000Var.OooO0o()) : o0oo0000Var.OooO0o() == null) && ((oooOO0O = this.f1248OooO0Oo) != null ? oooOO0O.equals(o0oo0000Var.OooO0oO()) : o0oo0000Var.OooO0oO() == null) && this.f1250OooO0o0.equals(o0oo0000Var.OooO0OO()) && this.f1249OooO0o.equals(o0oo0000Var.OooO()) && this.f1251OooO0oO == o0oo0000Var.OooO0oo() && this.f1252OooO0oo == o0oo0000Var.OooO0o0() && this.f1245OooO == o0oo0000Var.OooO0O0() && this.f1253OooOO0.equals(o0oo0000Var.OooOO0());
    }

    public final int hashCode() {
        int iHashCode = (((this.f1246OooO0O0.hashCode() ^ 1000003) * 1000003) ^ 0) * 1000003;
        ImageCapture.OooOO0 oooOO1 = this.f1247OooO0OO;
        int iHashCode2 = (iHashCode ^ (oooOO1 == null ? 0 : oooOO1.hashCode())) * 1000003;
        ImageCapture.OooOO0O oooOO0O = this.f1248OooO0Oo;
        return ((((((((((((iHashCode2 ^ (oooOO0O != null ? oooOO0O.hashCode() : 0)) * 1000003) ^ this.f1250OooO0o0.hashCode()) * 1000003) ^ this.f1249OooO0o.hashCode()) * 1000003) ^ this.f1251OooO0oO) * 1000003) ^ this.f1252OooO0oo) * 1000003) ^ this.f1245OooO) * 1000003) ^ this.f1253OooOO0.hashCode();
    }

    public final String toString() {
        return "TakePictureRequest{appExecutor=" + this.f1246OooO0O0 + ", inMemoryCallback=" + ((Object) null) + ", onDiskCallback=" + this.f1247OooO0OO + ", outputFileOptions=" + this.f1248OooO0Oo + ", cropRect=" + this.f1250OooO0o0 + ", sensorToBufferTransform=" + this.f1249OooO0o + ", rotationDegrees=" + this.f1251OooO0oO + ", jpegQuality=" + this.f1252OooO0oo + ", captureMode=" + this.f1245OooO + ", sessionConfigCameraCaptureCallbacks=" + this.f1253OooOO0 + "}";
    }
}
