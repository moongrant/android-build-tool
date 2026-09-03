package p018OooOoo0;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO {
    public static MeasurePolicy OooO00o(Alignment.Companion companion, boolean z, Composer composer, int i, int i2) {
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), z, composer, i);
        composer.startReplaceableGroup(i2);
        return measurePolicyRememberBoxMeasurePolicy;
    }

    public static Object OooO0O0(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }
}
