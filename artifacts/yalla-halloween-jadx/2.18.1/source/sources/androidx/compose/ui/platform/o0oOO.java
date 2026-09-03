package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
public final class o0oOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0oOO f6625OooO00o = new o0oOO();

    @DoNotInline
    public final void OooO00o(@NotNull View view, @Nullable p145o00Oo0.o000OO0O o000oo0o2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRenderEffect(null);
    }
}
