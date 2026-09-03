package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0O0ooO extends o00O00 implements OoooooO.o00OOOO0.OooO0O0 {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final OooO00o f6614Oooo0oO;

    public final class OooO00o implements OoooooO.o00OOOO0.OooO0O0 {
        @Override // p048OoooooO.o00OOOO0
        public final /* synthetic */ p048OoooooO.o00OOOO0 OooOOoo(p048OoooooO.o00OOOO0 o00oooo1) {
            return p048OoooooO.o0o0Oo.OooO00o(this, o00oooo1);
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

    /* JADX WARN: Illegal instructions before constructor call */
    public o0O0ooO() {
        Function1<o00O000o, Unit> inspectorInfo = o00oOoo.f6560OooO00o;
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        super(inspectorInfo);
        this.f6614Oooo0oO = new OooO00o();
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
