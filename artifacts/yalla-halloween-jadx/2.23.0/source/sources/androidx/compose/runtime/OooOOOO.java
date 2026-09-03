package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOOO {
    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    @NotNull
    public static Double OooO00o(MutableDoubleState mutableDoubleState) {
        return Double.valueOf(mutableDoubleState.getDoubleValue());
    }

    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    public static void OooO0OO(MutableDoubleState mutableDoubleState, double d) {
        mutableDoubleState.setDoubleValue(d);
    }
}
