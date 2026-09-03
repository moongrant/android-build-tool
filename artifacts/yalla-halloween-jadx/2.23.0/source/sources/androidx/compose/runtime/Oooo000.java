package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo000 {
    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    @NotNull
    public static Long OooO00o(MutableLongState mutableLongState) {
        return Long.valueOf(mutableLongState.getLongValue());
    }

    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    public static void OooO0OO(MutableLongState mutableLongState, long j) {
        mutableLongState.setLongValue(j);
    }
}
