package p470o0Oooo0;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000 {
    @NotNull
    public static final InputMethodManager OooO00o(@NotNull Context getInputMethodManager) {
        Intrinsics.checkNotNullParameter(getInputMethodManager, "$this$getInputMethodManager");
        Object systemService = getInputMethodManager.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }
}
