package p527o0o0OO0;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OoOo0 f43133OooO00o = new o0OoOo0();

    @NotNull
    public final synchronized String OooO00o(@Nullable Long l) {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(OooOOO.f41216OooO00o.OooOo().getValue());
        sb.append('-');
        sb.append(l);
        sb.append('-');
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }
}
