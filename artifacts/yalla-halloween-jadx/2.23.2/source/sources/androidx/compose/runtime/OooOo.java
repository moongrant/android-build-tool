package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo {
    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    @NotNull
    public static Float OooO00o(MutableFloatState mutableFloatState) {
        return Float.valueOf(mutableFloatState.getFloatValue());
    }

    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    public static void OooO0OO(MutableFloatState mutableFloatState, float f) {
        mutableFloatState.setFloatValue(f);
    }
}
