package p448o0OoOoo;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O0OOO {
    public static MeasurePolicy OooO00o(Alignment.Companion companion, Arrangement.HorizontalOrVertical horizontalOrVertical, Composer composer, int i, int i2) {
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVertical, companion.getStart(), composer, i);
        composer.startReplaceableGroup(i2);
        return measurePolicyColumnMeasurePolicy;
    }
}
