package p218o00oO0O;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o implements oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final View f33637OooO00o;

    public o00oO0o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f33637OooO00o = view;
    }

    @Override // p218o00oO0O.oo000o
    public final void OooO00o() {
        this.f33637OooO00o.performHapticFeedback(9);
    }
}
