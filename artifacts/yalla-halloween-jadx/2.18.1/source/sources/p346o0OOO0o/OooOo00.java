package p346o0OOO0o;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import o0000O0O.oo000o;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;
import p076o000OOo.OooOO0O;
import p076o000OOo.OooOOO;
import p076o000OOo.OooOOOO;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 implements OooOO0O, OooOOO<OooOo00>, OooOOO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final OooOOOO f38158Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final OooOOO f38159Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f38160Oooo0oo;

    public static final class OooO00o extends Lambda implements Function0<CoroutineScope> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineScope invoke() {
            return OooOo00.this.OooO0o0();
        }
    }

    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", i = {0, 0, 0, 1}, l = {94, 96}, m = "onPostFling-RZ2iAVY", n = {"this", "consumed", "available", "selfConsumed"}, s = {"L$0", "J$0", "J$1", "J$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f38162Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooOo00 f38163Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public long f38164Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public long f38165Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f38166OoooO0;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f38162Oooo = obj;
            this.f38166OoooO0 |= Integer.MIN_VALUE;
            return OooOo00.this.OooO00o(0L, 0L, this);
        }
    }

    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", i = {0, 0, 1}, l = {88, 89}, m = "onPreFling-QWom1Mo", n = {"this", "available", "parentPreConsumed"}, s = {"L$0", "J$0", "J$0"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooOo00 f38169Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public long f38170Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f38171Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f38172OoooO00;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f38171Oooo0oo = obj;
            this.f38172OoooO00 |= Integer.MIN_VALUE;
            return OooOo00.this.OooO0OO(0L, this);
        }
    }

    public OooOo00(@NotNull OooOOOO dispatcher, @NotNull OooOOO connection) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f38158Oooo0o = dispatcher;
        this.f38159Oooo0oO = connection;
        OooO00o oooO00o = new OooO00o();
        Intrinsics.checkNotNullParameter(oooO00o, "<set-?>");
        dispatcher.f38146OooO00o = oooO00o;
        this.f38160Oooo0oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p346o0OOO0o.OooOOO
    @Nullable
    public final Object OooO00o(long j, long j2, @NotNull Continuation<? super oo000o> continuation) {
        OooO0O0 oooO0O0;
        long j3;
        long j4;
        OooOo00 oooOo00;
        long j5;
        long j6;
        long j7;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f38166OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f38166OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objOooO00o = oooO0O0.f38162Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f38166OoooO0;
        if (i2 != 0) {
            if (i2 == 1) {
                long j8 = oooO0O0.f38165Oooo0oo;
                long j9 = oooO0O0.f38164Oooo0oO;
                oooOo00 = oooO0O0.f38163Oooo0o;
                ResultKt.throwOnFailure(objOooO00o);
                j4 = j8;
                j3 = j9;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j7 = oooO0O0.f38164Oooo0oO;
                ResultKt.throwOnFailure(objOooO00o);
            }
            j5 = ((oo000o) objOooO00o).f27330OooO00o;
            j6 = j7;
            return new oo000o(oo000o.OooO0o0(j6, j5));
        }
        ResultKt.throwOnFailure(objOooO00o);
        OooOOO oooOOO = this.f38159Oooo0oO;
        oooO0O0.f38163Oooo0o = this;
        j3 = j;
        oooO0O0.f38164Oooo0oO = j3;
        j4 = j2;
        oooO0O0.f38165Oooo0oo = j4;
        oooO0O0.f38166OoooO0 = 1;
        objOooO00o = oooOOO.OooO00o(j, j2, oooO0O0);
        if (objOooO00o == coroutine_suspended) {
            return coroutine_suspended;
        }
        oooOo00 = this;
        long j10 = ((oo000o) objOooO00o).f27330OooO00o;
        OooOo00 oooOo00OooO0o = oooOo00.OooO0o();
        if (oooOo00OooO0o != null) {
            long jOooO0o0 = oo000o.OooO0o0(j3, j10);
            long jOooO0Oo = oo000o.OooO0Oo(j4, j10);
            oooO0O0.f38163Oooo0o = null;
            oooO0O0.f38164Oooo0oO = j10;
            oooO0O0.f38166OoooO0 = 2;
            objOooO00o = oooOo00OooO0o.OooO00o(jOooO0o0, jOooO0Oo, oooO0O0);
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
            j7 = j10;
            j5 = ((oo000o) objOooO00o).f27330OooO00o;
            j6 = j7;
        } else {
            oo000o.OooO00o oooO00o = oo000o.f27328OooO0O0;
            j5 = oo000o.f27329OooO0OO;
            j6 = j10;
        }
        return new oo000o(oo000o.OooO0o0(j6, j5));
    }

    @Override // p346o0OOO0o.OooOOO
    public final long OooO0O0(long j, int i) {
        long jOooO0O0;
        OooOo00 oooOo00OooO0o = OooO0o();
        if (oooOo00OooO0o != null) {
            jOooO0O0 = oooOo00OooO0o.OooO0O0(j, i);
        } else {
            OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
            jOooO0O0 = OooO.f30392OooO0OO;
        }
        return OooO.OooO0oO(jOooO0O0, this.f38159Oooo0oO.OooO0O0(OooO.OooO0o(j, jOooO0O0), i));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p346o0OOO0o.OooOOO
    @Nullable
    public final Object OooO0OO(long j, @NotNull Continuation<? super oo000o> continuation) {
        OooO0OO oooO0OO;
        long j2;
        OooOo00 oooOo00;
        long j3;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f38172OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f38172OoooO00 = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objOooO0OO = oooO0OO.f38171Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f38172OoooO00;
        if (i2 != 0) {
            if (i2 == 1) {
                j = oooO0OO.f38170Oooo0oO;
                oooOo00 = oooO0OO.f38169Oooo0o;
                ResultKt.throwOnFailure(objOooO0OO);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = oooO0OO.f38170Oooo0oO;
                ResultKt.throwOnFailure(objOooO0OO);
            }
            return new oo000o(oo000o.OooO0o0(j3, ((oo000o) objOooO0OO).f27330OooO00o));
        }
        ResultKt.throwOnFailure(objOooO0OO);
        OooOo00 oooOo00OooO0o = OooO0o();
        if (oooOo00OooO0o != null) {
            oooO0OO.f38169Oooo0o = this;
            oooO0OO.f38170Oooo0oO = j;
            oooO0OO.f38172OoooO00 = 1;
            objOooO0OO = oooOo00OooO0o.OooO0OO(j, oooO0OO);
            if (objOooO0OO == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooOo00 = this;
        } else {
            oo000o.OooO00o oooO00o = oo000o.f27328OooO0O0;
            j2 = oo000o.f27329OooO0OO;
            oooOo00 = this;
        }
        OooOOO oooOOO = oooOo00.f38159Oooo0oO;
        long jOooO0Oo = oo000o.OooO0Oo(j, j2);
        oooO0OO.f38169Oooo0o = null;
        oooO0OO.f38170Oooo0oO = j2;
        oooO0OO.f38172OoooO00 = 2;
        objOooO0OO = oooOOO.OooO0OO(jOooO0Oo, oooO0OO);
        if (objOooO0OO == coroutine_suspended) {
            return coroutine_suspended;
        }
        j3 = j2;
        return new oo000o(oo000o.OooO0o0(j3, ((oo000o) objOooO0OO).f27330OooO00o));
        j2 = ((oo000o) objOooO0OO).f27330OooO00o;
        OooOOO oooOOO2 = oooOo00.f38159Oooo0oO;
        long jOooO0Oo2 = oo000o.OooO0Oo(j, j2);
        oooO0OO.f38169Oooo0o = null;
        oooO0OO.f38170Oooo0oO = j2;
        oooO0OO.f38172OoooO00 = 2;
        objOooO0OO = oooOOO2.OooO0OO(jOooO0Oo2, oooO0OO);
        if (objOooO0OO == coroutine_suspended) {
            return coroutine_suspended;
        }
        j3 = j2;
        return new oo000o(oo000o.OooO0o0(j3, ((oo000o) objOooO0OO).f27330OooO00o));
    }

    @Override // p346o0OOO0o.OooOOO
    public final long OooO0Oo(long j, long j2, int i) {
        long jOooO0Oo;
        long jOooO0Oo2 = this.f38159Oooo0oO.OooO0Oo(j, j2, i);
        OooOo00 oooOo00OooO0o = OooO0o();
        if (oooOo00OooO0o != null) {
            jOooO0Oo = oooOo00OooO0o.OooO0Oo(OooO.OooO0oO(j, jOooO0Oo2), OooO.OooO0o(j2, jOooO0Oo2), i);
        } else {
            OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
            jOooO0Oo = OooO.f30392OooO0OO;
        }
        return OooO.OooO0oO(jOooO0Oo2, jOooO0Oo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OooOo00 OooO0o() {
        return (OooOo00) this.f38160Oooo0oo.getValue();
    }

    public final CoroutineScope OooO0o0() {
        CoroutineScope coroutineScopeOooO0o0;
        OooOo00 oooOo00OooO0o = OooO0o();
        if ((oooOo00OooO0o == null || (coroutineScopeOooO0o0 = oooOo00OooO0o.OooO0o0()) == null) && (coroutineScopeOooO0o0 = this.f38158Oooo0o.f38147OooO0O0) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return coroutineScopeOooO0o0;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p076o000OOo.OooOO0O
    public final void OooOooO(@NotNull OooOOOO scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f38160Oooo0oo.setValue((OooOo00) scope.OooO00o(OooOo.f38156OooO00o));
        this.f38158Oooo0o.f38148OooO0OO = OooO0o();
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
    public final p076o000OOo.OooOo00<OooOo00> getKey() {
        return OooOo.f38156OooO00o;
    }

    @Override // p076o000OOo.OooOOO
    public final OooOo00 getValue() {
        return this;
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
