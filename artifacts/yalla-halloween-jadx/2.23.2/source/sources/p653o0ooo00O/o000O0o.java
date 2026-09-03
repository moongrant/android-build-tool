package p653o0ooo00O;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0oO0O0o;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f59378OooO00o = new LinkedHashSet();

    public final synchronized void OooO00o(@NotNull o0oO0O0o route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f59378OooO00o.remove(route);
    }
}
