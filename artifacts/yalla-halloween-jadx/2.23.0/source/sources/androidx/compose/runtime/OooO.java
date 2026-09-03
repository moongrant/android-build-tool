package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO {
    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    @NotNull
    public static Double OooO00o(DoubleState doubleState) {
        return Double.valueOf(doubleState.getDoubleValue());
    }
}
