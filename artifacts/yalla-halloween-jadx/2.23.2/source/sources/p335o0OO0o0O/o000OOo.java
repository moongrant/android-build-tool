package p335o0OO0o0O;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public o00oO0o f42470OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o00oO0o f42471OooO0O0;

    public final void OooO00o(@NotNull o00oO0o task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (this.f42470OooO00o == null) {
            this.f42470OooO00o = task;
        }
        o00oO0o o00oo0o2 = this.f42471OooO0O0;
        if (o00oo0o2 != null) {
            o00oo0o2.f42473OooO0O0 = task;
        }
        this.f42471OooO0O0 = task;
    }
}
