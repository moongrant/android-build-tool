package p030Oooo0oo;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.Oooo000;
import o0O0O00.o000OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;
import p076o000OOo.OooOO0O;
import p076o000OOo.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0oO0Ooo implements OooOO0O, o000OO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0O00oO0 f2543Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public o0O00oO0 f2544Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Oooo000 f2545Oooo0oo;

    public o0oO0Ooo(@NotNull o0O00oO0 defaultParent) {
        Intrinsics.checkNotNullParameter(defaultParent, "defaultParent");
        this.f2543Oooo0o = defaultParent;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p076o000OOo.OooOO0O
    public final void OooOooO(@NotNull OooOOOO scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f2544Oooo0oO = (o0O00oO0) scope.OooO00o(o0O00o00.f2511OooO00o);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // o0O0O00.o000OO
    public final void Oooo00O(@NotNull Oooo000 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f2545Oooo0oo = coordinates;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
