package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo000 {
    @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
    @NotNull
    public static Integer OooO00o(MutableIntState mutableIntState) {
        return Integer.valueOf(mutableIntState.getIntValue());
    }

    @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
    public static void OooO0OO(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }
}
