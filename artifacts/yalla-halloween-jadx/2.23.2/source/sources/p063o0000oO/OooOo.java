package p063o0000oO;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(18)
public final class OooOo {
    @JvmStatic
    @DoNotInline
    public static final void OooO00o(@NotNull Bundle bundle, @NotNull String str, @Nullable IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
