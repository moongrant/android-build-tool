package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import com.amazonaws.regions.Region;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o {
    public static MeasurePolicy OooO00o(Alignment.Companion companion, Arrangement.Vertical vertical, Composer composer, int i, int i2) {
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, companion.getStart(), composer, i);
        composer.startReplaceableGroup(i2);
        return measurePolicyColumnMeasurePolicy;
    }

    public static Region OooO0O0(String str, String str2, ArrayList arrayList) {
        Region region = new Region(str, str2);
        arrayList.add(region);
        return region;
    }
}
