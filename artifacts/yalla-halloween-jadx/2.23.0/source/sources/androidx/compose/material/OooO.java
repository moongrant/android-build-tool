package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO {
    public static MeasurePolicy OooO00o(Arrangement arrangement, Alignment.Vertical vertical, Composer composer, int i, int i2) {
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), vertical, composer, i);
        composer.startReplaceableGroup(i2);
        return measurePolicyRowMeasurePolicy;
    }

    public static Map OooO0O0(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }
}
