package Oooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000O implements p076o000OOo.OooOO0O, o0O0O00.o0000O0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public Function1<? super o0O0O00.Oooo000, Unit> f563Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public o0O0O00.Oooo000 f564Oooo0oO;

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ p048OoooooO.o00OOOO0 OooOOoo(p048OoooooO.o00OOOO0 o00oooo1) {
        return p048OoooooO.o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // o0O0O00.o0000O0
    public final void OooOoo(@NotNull o0O0O00.Oooo000 coordinates) {
        Function1<? super o0O0O00.Oooo000, Unit> function1;
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f564Oooo0oO = coordinates;
        if (!coordinates.OooOoO()) {
            Function1<? super o0O0O00.Oooo000, Unit> function2 = this.f563Oooo0o;
            if (function2 != null) {
                function2.invoke(null);
                return;
            }
            return;
        }
        o0O0O00.Oooo000 oooo000 = this.f564Oooo0oO;
        if (oooo000 != null) {
            Intrinsics.checkNotNull(oooo000);
            if (!oooo000.OooOoO() || (function1 = this.f563Oooo0o) == null) {
                return;
            }
            function1.invoke(this.f564Oooo0oO);
        }
    }

    @Override // p076o000OOo.OooOO0O
    public final void OooOooO(@NotNull p076o000OOo.OooOOOO scope) {
        Function1<? super o0O0O00.Oooo000, Unit> function1;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Function1<? super o0O0O00.Oooo000, Unit> function2 = (Function1) scope.OooO00o(o000OO0O.f592OooO00o);
        if (function2 == null && (function1 = this.f563Oooo0o) != null) {
            function1.invoke(null);
        }
        this.f563Oooo0o = function2;
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

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
