package p464o0Ooo0oO;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import p089o000o000.o00;
import p089o000o000.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O<Key, Value> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f40444OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00<Key, Value> f40445OooO0O0;

    public o0000O(CoroutineScope viewModelScope, Function0 pagingSourceFactory) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.f40444OooO00o = viewModelScope;
        this.f40445OooO0O0 = new o00<>(new o00O0000(20, 5, false, 0, 56), pagingSourceFactory);
    }
}
