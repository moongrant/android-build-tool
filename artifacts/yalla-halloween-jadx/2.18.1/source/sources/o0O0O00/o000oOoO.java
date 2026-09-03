package o0O0O00;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.platform.o00O00;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;
import p100o000oOoO.o0;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o000oOoO extends o00O00 implements o000, o00O0O {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Object f35288Oooo0oO;

    /* JADX WARN: Illegal instructions before constructor call */
    public o000oOoO(@NotNull Object layoutId) {
        Function1<o00O000o, Unit> inspectorInfo = o00oOoo.f6560OooO00o;
        Intrinsics.checkNotNullParameter(layoutId, "layoutId");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        super(inspectorInfo);
        this.f35288Oooo0oO = layoutId;
    }

    @Override // o0O0O00.o00O0O
    @NotNull
    public final Object OooO00o() {
        return this.f35288Oooo0oO;
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
        o000oOoO o000oooo2 = obj instanceof o000oOoO ? (o000oOoO) obj : null;
        if (o000oooo2 == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f35288Oooo0oO, o000oooo2.f35288Oooo0oO);
    }

    public final int hashCode() {
        return this.f35288Oooo0oO.hashCode();
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @Override // o0O0O00.o000
    @Nullable
    public final Object o0ooOoO(@NotNull o0000O0O.OooO oooO, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(oooO, "<this>");
        return this;
    }

    @NotNull
    public final String toString() {
        return o0.OooO00o(OooO00o.OooO00o.OooO0o0("LayoutId(id="), this.f35288Oooo0oO, ')');
    }
}
