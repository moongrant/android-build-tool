package p089o000o000;

import androidx.paging.ActiveFlowTracker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f28705OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0ooO<T> f28706OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final ActiveFlowTracker f28707OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO<T> f28708OooO0Oo;

    public o00000O(@NotNull CoroutineScope scope, @NotNull o0O0ooO<T> parent, @Nullable ActiveFlowTracker activeFlowTracker) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f28705OooO00o = scope;
        this.f28706OooO0O0 = parent;
        this.f28707OooO0OO = activeFlowTracker;
        OooO<T> oooO = new OooO<>(parent.f29065OooO00o, scope);
        if (activeFlowTracker != null) {
            activeFlowTracker.OooO00o();
        }
        this.f28708OooO0Oo = oooO;
    }
}
