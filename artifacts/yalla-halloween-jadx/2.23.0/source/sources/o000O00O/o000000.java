package o000O00O;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000000<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f34488OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final androidx.paging.o0OOO0o<T> f34489OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final androidx.paging.OooO00o<T> f34490OooO0OO;

    public o000000(@NotNull CoroutineScope scope, @NotNull androidx.paging.o0OOO0o parent) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f34488OooO00o = scope;
        this.f34489OooO0O0 = parent;
        this.f34490OooO0OO = new androidx.paging.OooO00o<>(parent.f7366OooO00o, scope);
    }
}
