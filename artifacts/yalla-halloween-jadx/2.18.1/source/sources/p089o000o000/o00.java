package p089o000o000;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00<Key, Value> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Flow<o0O0ooO<Value>> f28690OooO00o;

    public o00(o00O0000 config, Function0 pagingSourceFactory) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.f28690OooO00o = new o000OO(pagingSourceFactory instanceof oo0oOO0 ? new o000OO00(pagingSourceFactory) : new o000OOo0(pagingSourceFactory, null), null, config).f28877OooO0o;
    }
}
