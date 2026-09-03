package p406o0Oo0OOO;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public oO0Oo f39125OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public oO0Oo f39126OooO0O0;

    public final void OooO00o(@NotNull oO0Oo task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (this.f39125OooO00o == null) {
            this.f39125OooO00o = task;
        }
        oO0Oo oo0oo = this.f39126OooO0O0;
        if (oo0oo != null) {
            oo0oo.f39128OooO0O0 = task;
        }
        this.f39126OooO0O0 = task;
    }
}
