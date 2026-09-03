package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00Oo00 {
    static {
        Path.Companion companion = Path.INSTANCE;
    }

    public static void OooO00o(Path path, @NotNull Rect rect, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        path.arcTo(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z);
    }

    public static void OooO0O0(Path path) {
        path.reset();
    }

    public static void OooO0OO(Path path, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
    }

    public static /* synthetic */ void OooO0oO(Path path, Path path2, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j = Offset.INSTANCE.m1463getZeroF1C5BW0();
        }
        path.mo1579addPathUv8p0NA(path2, j);
    }
}
