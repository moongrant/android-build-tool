package p032OoooO0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.OooOo;
import p025Oooo0O0.o00000O0;
import p025Oooo0O0.o0OoOo0;
import p418o0Oo0oo.o00000;
import p418o0Oo0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O {

    public static final class OooO00o extends Lambda implements Function1<OooO, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f3073Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O00OO o00o00oo2) {
            super(1);
            this.f3073Oooo0o = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OooO oooO) {
            this.f3073Oooo0o.OooO00o(oooO.f30395OooO00o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f3074Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00O00OO o00o00oo2) {
            super(0);
            this.f3074Oooo0o = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f3074Oooo0o.onStop();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f3075Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00O00OO o00o00oo2) {
            super(0);
            this.f3075Oooo0o = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f3075Oooo0o.onCancel();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<o0Oo0oo, OooO, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f3076Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o00O00OO o00o00oo2) {
            super(2);
            this.f3076Oooo0o = o00o00oo2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(o0Oo0oo o0oo0oo2, OooO oooO) {
            long j = oooO.f30395OooO00o;
            Intrinsics.checkNotNullParameter(o0oo0oo2, "<anonymous parameter 0>");
            this.f3076Oooo0o.OooO0Oo(j);
            return Unit.INSTANCE;
        }
    }

    @Nullable
    public static final Object OooO00o(@NotNull o00000 o00000Var, @NotNull o00O00OO o00o00oo2, @NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o = new OooO00o(o00o00oo2);
        OooO0O0 oooO0O0 = new OooO0O0(o00o00oo2);
        OooO0OO oooO0OO = new OooO0OO(o00o00oo2);
        OooO0o oooO0o = new OooO0o(o00o00oo2);
        float f = OooOo.f1396OooO00o;
        Object objOooO0O0 = o00000O0.OooO0O0(o00000Var, new o0OoOo0(oooO00o, oooO0OO, oooO0O0, oooO0o, null), continuation);
        if (objOooO0O0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objOooO0O0 = Unit.INSTANCE;
        }
        return objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0O0 : Unit.INSTANCE;
    }
}
