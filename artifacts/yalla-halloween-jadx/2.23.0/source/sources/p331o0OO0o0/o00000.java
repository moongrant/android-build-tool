package p331o0OO0o0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public o0OOO0o f43166OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o0OOO0o f43167OooO0O0;

    public final void OooO00o(@NotNull o0OOO0o task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (this.f43166OooO00o == null) {
            this.f43166OooO00o = task;
        }
        o0OOO0o o0ooo0o2 = this.f43167OooO0O0;
        if (o0ooo0o2 != null) {
            o0ooo0o2.f43191OooO0O0 = task;
        }
        this.f43167OooO0O0 = task;
    }
}
