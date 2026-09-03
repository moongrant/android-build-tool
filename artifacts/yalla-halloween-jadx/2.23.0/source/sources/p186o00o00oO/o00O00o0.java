package p186o00o00oO;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00o0 {
    public static MeasurePolicy OooO00o(Alignment.Companion companion, Arrangement.HorizontalOrVertical horizontalOrVertical, Composer composer, int i, int i2) {
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVertical, companion.getStart(), composer, i);
        composer.startReplaceableGroup(i2);
        return measurePolicyColumnMeasurePolicy;
    }

    public static /* synthetic */ void OooO0O0(oo00o oo00oVar, long j, boolean z, int i) {
        if ((i & 2) != 0) {
            z = ColorKt.m1722luminance8_81llA(j) > 0.5f;
        }
        oo00oVar.OooO00o(j, z, (i & 4) != 0 ? o00O0.f38689OooO0O0 : null);
    }
}
