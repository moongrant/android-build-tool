package p442o0OoOo0;

import androidx.compose.ui.platform.o00O00;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o000000.o00O0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;
import p191o00o0O.o00oO0o;
import p191o00o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends o00O00 implements o00O0O {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Function1<o0Oo0oo, Unit> f40209Oooo0oO;

    /* JADX WARN: Illegal instructions before constructor call */
    public Oooo0(@NotNull Function1 onDraw) {
        Function1<o00O000o, Unit> inspectorInfo = o00oOoo.f6560OooO00o;
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        super(inspectorInfo);
        this.f40209Oooo0oO = onDraw;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // p442o0OoOo0.o00O0O
    public final void Oooo0o(@NotNull o00oO0o o00oo0o2) {
        Intrinsics.checkNotNullParameter(o00oo0o2, "<this>");
        this.f40209Oooo0oO.invoke(o00oo0o2);
        ((o00O0O) o00oo0o2).o0ooOOo();
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Oooo0) {
            return Intrinsics.areEqual(this.f40209Oooo0oO, ((Oooo0) obj).f40209Oooo0oO);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40209Oooo0oO.hashCode();
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
