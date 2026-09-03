package Oooo0;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalFoundationApi
public final class o00OO000 implements p076o000OOo.OooOO0O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Function1<androidx.compose.foundation.lazy.layout.o00Ooo, Unit> f685Oooo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public o00OO000(@NotNull Function1<? super androidx.compose.foundation.lazy.layout.o00Ooo, Unit> onPinnableParentAvailable) {
        Intrinsics.checkNotNullParameter(onPinnableParentAvailable, "onPinnableParentAvailable");
        this.f685Oooo0o = onPinnableParentAvailable;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ p048OoooooO.o00OOOO0 OooOOoo(p048OoooooO.o00OOOO0 o00oooo1) {
        return p048OoooooO.o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p076o000OOo.OooOO0O
    public final void OooOooO(@NotNull p076o000OOo.OooOOOO scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f685Oooo0o.invoke((androidx.compose.foundation.lazy.layout.o00Ooo) scope.OooO00o(androidx.compose.foundation.lazy.layout.oo000o.f5848OooO00o));
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return p048OoooooO.o00OOOOo.OooO00o(this, function1);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof o00OO000) && Intrinsics.areEqual(((o00OO000) obj).f685Oooo0o, this.f685Oooo0o);
    }

    public final int hashCode() {
        return this.f685Oooo0o.hashCode();
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
