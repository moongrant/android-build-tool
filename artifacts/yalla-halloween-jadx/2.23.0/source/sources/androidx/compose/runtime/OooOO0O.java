package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O {
    @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
    @NotNull
    public static Integer OooO00o(IntState intState) {
        return Integer.valueOf(intState.getIntValue());
    }
}
