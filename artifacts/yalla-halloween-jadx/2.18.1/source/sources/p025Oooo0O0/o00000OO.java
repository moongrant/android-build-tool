package p025Oooo0O0;

import androidx.compose.foundation.gestures.ScrollableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;
import p076o000OOo.OooOOO;
import p076o000OOo.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO implements OooOOO<Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public static final o00000OO f1499Oooo0o = new o00000OO();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public static final OooOo00<Boolean> f1500Oooo0oO = ScrollableKt.f5725OooO0O0;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final boolean f1501Oooo0oo = true;

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
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
    public final OooOo00<Boolean> getKey() {
        return f1500Oooo0oO;
    }

    @Override // p076o000OOo.OooOOO
    public final Boolean getValue() {
        return Boolean.valueOf(f1501Oooo0oo);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
