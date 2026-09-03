package p522o0o0O0o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O {
    public static final void OooO00o(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.getLayoutParams().height = i;
        view.requestLayout();
    }
}
