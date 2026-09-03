package p646o0ooOoo;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o0O00000;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0O0OoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f59650OooO00o = new LinkedHashSet();

    public final synchronized void OooO00o(@NotNull o0O00000 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f59650OooO00o.remove(route);
    }
}
