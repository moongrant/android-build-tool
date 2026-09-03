package p648o0ooOOo;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;
import p076o000OOo.OooOO0O;
import p076o000OOo.OooOOO;
import p076o000OOo.OooOOOO;
import p076o000OOo.OooOo00;
import p648o0ooOOo.c;

/* JADX INFO: loaded from: classes.dex */
public final class d<T extends c> implements OooOO0O, OooOOO<d<T>> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public d<T> f48898Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public final Function1<c, Boolean> f48899Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public final Function1<c, Boolean> f48900Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final OooOo00<d<T>> f48901Oooo0oo;

    public d(@Nullable Function1 function1, @NotNull OooOo00 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f48899Oooo0o = function1;
        this.f48900Oooo0oO = null;
        this.f48901Oooo0oo = key;
    }

    public final boolean OooO00o(T t) {
        Function1<c, Boolean> function1 = this.f48899Oooo0o;
        if (function1 != null && function1.invoke(t).booleanValue()) {
            return true;
        }
        d<T> dVar = this.f48898Oooo;
        if (dVar != null) {
            return dVar.OooO00o(t);
        }
        return false;
    }

    public final boolean OooO0O0(T t) {
        d<T> dVar = this.f48898Oooo;
        if (dVar != null && dVar.OooO0O0(t)) {
            return true;
        }
        Function1<c, Boolean> function1 = this.f48900Oooo0oO;
        if (function1 != null) {
            return function1.invoke(t).booleanValue();
        }
        return false;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p076o000OOo.OooOO0O
    public final void OooOooO(@NotNull OooOOOO scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f48898Oooo = (d) scope.OooO00o(this.f48901Oooo0oo);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    @Override // p076o000OOo.OooOOO
    @NotNull
    public final OooOo00<d<T>> getKey() {
        return this.f48901Oooo0oo;
    }

    @Override // p076o000OOo.OooOOO
    public final Object getValue() {
        return this;
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
