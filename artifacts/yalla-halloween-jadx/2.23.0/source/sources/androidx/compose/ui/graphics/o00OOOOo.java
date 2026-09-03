package androidx.compose.ui.graphics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOOOo {
    public static /* synthetic */ boolean OooO00o(PathMeasure pathMeasure, float f, float f2, Path path, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return pathMeasure.getSegment(f, f2, path, z);
    }
}
