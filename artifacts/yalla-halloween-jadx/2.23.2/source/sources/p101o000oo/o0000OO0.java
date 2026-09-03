package p101o000oo;

import androidx.paging.OooO00o;
import androidx.paging.o0OOO0o;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f35429OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0OOO0o<T> f35430OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooO00o<T> f35431OooO0OO;

    public o0000OO0(@NotNull CoroutineScope scope, @NotNull o0OOO0o parent) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f35429OooO00o = scope;
        this.f35430OooO0O0 = parent;
        this.f35431OooO0OO = new OooO00o<>(parent.f10460OooO00o, scope);
    }
}
