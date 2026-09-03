package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO {
    public static /* synthetic */ void OooO00o(TransformScope transformScope, float f, long j, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            j = Offset.INSTANCE.m1463getZeroF1C5BW0();
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        transformScope.mo264transformByd4ec7I(f, j, f2);
    }
}
