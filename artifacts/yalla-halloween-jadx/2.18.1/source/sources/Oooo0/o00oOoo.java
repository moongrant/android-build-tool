package Oooo0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00oOoo implements p442o0OoOo0.o00O0O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0O0ooO f701Oooo0o;

    public o00oOoo(@NotNull o0O0ooO indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        this.f701Oooo0o = indicationInstance;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ p048OoooooO.o00OOOO0 OooOOoo(p048OoooooO.o00OOOO0 o00oooo1) {
        return p048OoooooO.o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // p442o0OoOo0.o00O0O
    public final void Oooo0o(@NotNull p191o00o0O.o00oO0o o00oo0o2) {
        Intrinsics.checkNotNullParameter(o00oo0o2, "<this>");
        this.f701Oooo0o.OooO0OO(o00oo0o2);
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
