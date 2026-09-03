package p028Oooo0o0;

import OooO00o.OooO00o;
import Oooo000.Oooo0;
import androidx.compose.ui.platform.o00O00;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import o0O0O00.o000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00O extends o00O00 implements o000 {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public o00OO0O0 f2047Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f2048Oooo0oo;

    /* JADX WARN: Illegal instructions before constructor call */
    public o00O00O(@NotNull o00OO0O0 alignment, boolean z) {
        Function1<o00O000o, Unit> inspectorInfo = o00oOoo.f6560OooO00o;
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        super(inspectorInfo);
        this.f2047Oooo0oO = alignment;
        this.f2048Oooo0oo = z;
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

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        o00O00O o00o00o2 = obj instanceof o00O00O ? (o00O00O) obj : null;
        return o00o00o2 != null && Intrinsics.areEqual(this.f2047Oooo0oO, o00o00o2.f2047Oooo0oO) && this.f2048Oooo0oo == o00o00o2.f2048Oooo0oo;
    }

    public final int hashCode() {
        return (this.f2047Oooo0oO.hashCode() * 31) + (this.f2048Oooo0oo ? 1231 : 1237);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @Override // o0O0O00.o000
    public final Object o0ooOoO(OooO oooO, Object obj) {
        Intrinsics.checkNotNullParameter(oooO, "<this>");
        return this;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("BoxChildData(alignment=");
        sbOooO0o0.append(this.f2047Oooo0oO);
        sbOooO0o0.append(", matchParentSize=");
        return Oooo0.OooO0O0(sbOooO0o0, this.f2048Oooo0oo, ')');
    }
}
