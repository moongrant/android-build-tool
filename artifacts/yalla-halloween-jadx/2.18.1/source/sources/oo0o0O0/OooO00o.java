package oo0o0O0;

import android.content.Context;
import android.util.DisplayMetrics;
import coil.size.PixelSize;
import coil.size.Size;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements OooO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Context f53344OooO0OO;

    public OooO00o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53344OooO0OO = context;
    }

    @Override // oo0o0O0.OooO0o
    @Nullable
    public final Object OooO0O0(@NotNull Continuation<? super Size> continuation) {
        DisplayMetrics displayMetrics = this.f53344OooO0OO.getResources().getDisplayMetrics();
        return new PixelSize(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public final boolean equals(@Nullable Object obj) {
        return this == obj || ((obj instanceof OooO00o) && Intrinsics.areEqual(this.f53344OooO0OO, ((OooO00o) obj).f53344OooO0OO));
    }

    public final int hashCode() {
        return this.f53344OooO0OO.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("DisplaySizeResolver(context=");
        sbOooO0o0.append(this.f53344OooO0OO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
