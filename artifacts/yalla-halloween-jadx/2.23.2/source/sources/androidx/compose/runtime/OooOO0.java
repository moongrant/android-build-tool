package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 {
    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    @NotNull
    public static Float OooO00o(FloatState floatState) {
        return Float.valueOf(floatState.getFloatValue());
    }
}
