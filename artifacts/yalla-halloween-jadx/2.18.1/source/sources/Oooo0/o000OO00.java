package Oooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO00 implements p076o000OOo.OooOO0O, p076o000OOo.OooOOO<Function1<? super o0O0O00.Oooo000, ? extends Unit>>, Function1<o0O0O00.Oooo000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Function1<o0O0O00.Oooo000, Unit> f589Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public Function1<? super o0O0O00.Oooo000, Unit> f590Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public o0O0O00.Oooo000 f591Oooo0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public o000OO00(@NotNull Function1<? super o0O0O00.Oooo000, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f589Oooo0o = handler;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ p048OoooooO.o00OOOO0 OooOOoo(p048OoooooO.o00OOOO0 o00oooo1) {
        return p048OoooooO.o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p076o000OOo.OooOO0O
    public final void OooOooO(@NotNull p076o000OOo.OooOOOO scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Function1<? super o0O0O00.Oooo000, Unit> function1 = (Function1) scope.OooO00o(o000OO0O.f592OooO00o);
        if (Intrinsics.areEqual(function1, this.f590Oooo0oO)) {
            return;
        }
        this.f590Oooo0oO = function1;
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

    @Override // p076o000OOo.OooOOO
    @NotNull
    public final p076o000OOo.OooOo00<Function1<? super o0O0O00.Oooo000, ? extends Unit>> getKey() {
        return o000OO0O.f592OooO00o;
    }

    @Override // p076o000OOo.OooOOO
    public final Function1<? super o0O0O00.Oooo000, ? extends Unit> getValue() {
        return this;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0O0O00.Oooo000 oooo000) {
        o0O0O00.Oooo000 oooo001 = oooo000;
        this.f591Oooo0oo = oooo001;
        this.f589Oooo0o.invoke(oooo001);
        Function1<? super o0O0O00.Oooo000, Unit> function1 = this.f590Oooo0oO;
        if (function1 != null) {
            function1.invoke(oooo001);
        }
        return Unit.INSTANCE;
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
