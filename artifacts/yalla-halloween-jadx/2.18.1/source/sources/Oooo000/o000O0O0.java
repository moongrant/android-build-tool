package Oooo000;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public abstract class o000O0O0 implements o0O0O00.oo000o {
    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // o0O0O00.oo000o
    public final int Oooo000(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull o0O0O00.OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.OooOOO(i);
    }

    @Override // o0O0O00.oo000o
    public final int OoooO(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull o0O0O00.OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.OoooO(i);
    }

    @Override // o0O0O00.oo000o
    public final int OoooOOO(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull o0O0O00.OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.OooOoo(i);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    @Override // o0O0O00.oo000o
    public final int Oooooo(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull o0O0O00.OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.OooOooO(i);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
