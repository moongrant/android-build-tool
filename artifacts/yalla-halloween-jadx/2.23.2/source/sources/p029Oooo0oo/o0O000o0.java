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
public final class o0O000o0 extends o0OOOO00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f1230OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f1231OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ImageCapture.OooOO0 f1232OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ImageCapture.OooOO0O f1233OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Matrix f1234OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Rect f1235OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f1236OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f1237OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final List<o000oOoO> f1238OooOO0;

    public o0O000o0(Executor executor, @Nullable ImageCapture.OooOO0 oooOO1, @Nullable ImageCapture.OooOO0O oooOO0O, Rect rect, Matrix matrix, int i, int i2, int i3, List list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f1231OooO0O0 = executor;
        this.f1232OooO0OO = oooOO1;
        this.f1233OooO0Oo = oooOO0O;
        this.f1235OooO0o0 = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f1234OooO0o = matrix;
        this.f1236OooO0oO = i;
        this.f1237OooO0oo = i2;
        this.f1230OooO = i3;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f1238OooOO0 = list;
    }

    @Override // p029Oooo0oo.o0OOOO00
    @NonNull
    public final Matrix OooO() {
        return this.f1234OooO0o;
    }

    @Override // p029Oooo0oo.o0OOOO00
    @NonNull
    public final Executor OooO00o() {
        return this.f1231OooO0O0;
    }

    @Override // p029Oooo0oo.o0OOOO00
    public final int OooO0O0() {
        return this.f1230OooO;
    }

    @Override // p029Oooo0oo.o0OOOO00
    @NonNull
    public final Rect OooO0OO() {
        return this.f1235OooO0o0;
    }

    @Override // p029Oooo0oo.o0OOOO00
    @Nullable
    public final ImageCapture.OooO OooO0Oo() {
        return null;
    }

    @Override // p029Oooo0oo.o0OOOO00
    @Nullable
    public final ImageCapture.OooOO0 OooO0o() {
        return this.f1232OooO0OO;
    }

    @Override // p029Oooo0oo.o0OOOO00
    @IntRange(from = 1, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
    public final int OooO0o0() {
        return this.f1237OooO0oo;
    }

    @Override // p029Oooo0oo.o0OOOO00
    @Nullable
    public final ImageCapture.OooOO0O OooO0oO() {
        return this.f1233OooO0Oo;
    }

    @Override // p029Oooo0oo.o0OOOO00
    public final int OooO0oo() {
        return this.f1236OooO0oO;
    }

    @Override // p029Oooo0oo.o0OOOO00
    @NonNull
    public final List<o000oOoO> OooOO0() {
        return this.f1238OooOO0;
    }

    public final boolean equals(Object obj) {
        ImageCapture.OooOO0 oooOO1;
        ImageCapture.OooOO0O oooOO0O;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0OOOO00)) {
            return false;
        }
        o0OOOO00 o0oooo01 = (o0OOOO00) obj;
        return this.f1231OooO0O0.equals(o0oooo01.OooO00o()) && o0oooo01.OooO0Oo() == null && ((oooOO1 = this.f1232OooO0OO) != null ? oooOO1.equals(o0oooo01.OooO0o()) : o0oooo01.OooO0o() == null) && ((oooOO0O = this.f1233OooO0Oo) != null ? oooOO0O.equals(o0oooo01.OooO0oO()) : o0oooo01.OooO0oO() == null) && this.f1235OooO0o0.equals(o0oooo01.OooO0OO()) && this.f1234OooO0o.equals(o0oooo01.OooO()) && this.f1236OooO0oO == o0oooo01.OooO0oo() && this.f1237OooO0oo == o0oooo01.OooO0o0() && this.f1230OooO == o0oooo01.OooO0O0() && this.f1238OooOO0.equals(o0oooo01.OooOO0());
    }

    public final int hashCode() {
        int iHashCode = (((this.f1231OooO0O0.hashCode() ^ 1000003) * 1000003) ^ 0) * 1000003;
        ImageCapture.OooOO0 oooOO1 = this.f1232OooO0OO;
        int iHashCode2 = (iHashCode ^ (oooOO1 == null ? 0 : oooOO1.hashCode())) * 1000003;
        ImageCapture.OooOO0O oooOO0O = this.f1233OooO0Oo;
        return ((((((((((((iHashCode2 ^ (oooOO0O != null ? oooOO0O.hashCode() : 0)) * 1000003) ^ this.f1235OooO0o0.hashCode()) * 1000003) ^ this.f1234OooO0o.hashCode()) * 1000003) ^ this.f1236OooO0oO) * 1000003) ^ this.f1237OooO0oo) * 1000003) ^ this.f1230OooO) * 1000003) ^ this.f1238OooOO0.hashCode();
    }

    public final String toString() {
        return "TakePictureRequest{appExecutor=" + this.f1231OooO0O0 + ", inMemoryCallback=" + ((Object) null) + ", onDiskCallback=" + this.f1232OooO0OO + ", outputFileOptions=" + this.f1233OooO0Oo + ", cropRect=" + this.f1235OooO0o0 + ", sensorToBufferTransform=" + this.f1234OooO0o + ", rotationDegrees=" + this.f1236OooO0oO + ", jpegQuality=" + this.f1237OooO0oo + ", captureMode=" + this.f1230OooO + ", sessionConfigCameraCaptureCallbacks=" + this.f1238OooOO0 + "}";
    }
}
