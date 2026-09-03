package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0Oo0oo f6617OooO00o = new o0Oo0oo();

    @DoNotInline
    @RequiresApi(24)
    public final void OooO00o(@NotNull View view, @Nullable p418o0Oo0oo.o00oO0o o00oo0o2) {
        PointerIcon systemIcon;
        Intrinsics.checkNotNullParameter(view, "view");
        if (o00oo0o2 instanceof p418o0Oo0oo.OooOO0O) {
            Objects.requireNonNull((p418o0Oo0oo.OooOO0O) o00oo0o2);
            systemIcon = null;
        } else {
            systemIcon = o00oo0o2 instanceof p418o0Oo0oo.OooOOO0 ? PointerIcon.getSystemIcon(view.getContext(), ((p418o0Oo0oo.OooOOO0) o00oo0o2).f39652OooO00o) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (Intrinsics.areEqual(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
