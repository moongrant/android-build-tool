package o0O0O00;

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

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 extends o00O00 implements o0000O {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Function1<o0000O0O.o000oOoO, Unit> f35259Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f35260Oooo0oo;

    /* JADX WARN: Illegal instructions before constructor call */
    public o0000OO0(@NotNull Function1 onSizeChanged) {
        Function1<o00O000o, Unit> inspectorInfo = o00oOoo.f6560OooO00o;
        Intrinsics.checkNotNullParameter(onSizeChanged, "onSizeChanged");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        super(inspectorInfo);
        this.f35259Oooo0oO = onSizeChanged;
        this.f35260Oooo0oo = o0000O0O.o0OoOo0.OooO00o(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // o0O0O00.o0000O
    public final void OooOoO(long j) {
        if (o0000O0O.o000oOoO.OooO00o(this.f35260Oooo0oo, j)) {
            return;
        }
        this.f35259Oooo0oO.invoke(new o0000O0O.o000oOoO(j));
        this.f35260Oooo0oo = j;
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
        if (obj instanceof o0000OO0) {
            return Intrinsics.areEqual(this.f35259Oooo0oO, ((o0000OO0) obj).f35259Oooo0oO);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35259Oooo0oO.hashCode();
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
