package p030Oooo0oo;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import o00O0O.OooOO0;
import o00O0O.OooOO0O;
import o0O0O00.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p076o000OOo.OooOOO;
import p076o000OOo.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0OOO0 extends o0oO0Ooo implements OooOOO<o0O00oO0>, o0O00oO0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o0O0O0o0 f2514Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public Pair<OooOO0O, ? extends Job> f2515OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public Pair<OooOO0O, ? extends Job> f2516OoooO00;

    @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2", f = "BringIntoViewResponder.kt", i = {0, 1, 1, 1, 2}, l = {214, 223, 230}, m = "invokeSuspend", n = {"thisRequest", "layoutCoordinates", "thisRequest", "previousRequest", "thisRequest"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f2517Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Pair f2518Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Pair f2519Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f2520Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f2521OoooO0;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f2523OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo000 oooo000, OooOO0O oooOO0O, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f2521OoooO0 = oooo000;
            this.f2523OoooO0O = oooOO0O;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = o0O0OOO0.this.new OooO00o(this.f2521OoooO0, this.f2523OoooO0O, continuation);
            oooO00o.f2517Oooo = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00d6 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002b, B:52:0x00d0, B:54:0x00d6), top: B:87:0x002b }] */
        /* JADX WARN: Code duplicated, block: B:56:0x00e4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:76:0x0114  */
        /* JADX WARN: Code duplicated, block: B:78:0x0118  */
        /* JADX WARN: Code duplicated, block: B:83:0x0124  */
        /* JADX WARN: Code duplicated, block: B:85:0x0128  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Pair] */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.Pair] */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Pair, kotlin.Pair<o00O0O.OooOO0O, ? extends kotlinx.coroutines.Job>] */
        /* JADX WARN: Type inference failed for: r7v4 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ?? pair;
            o0O0OOO0 o0o0ooo0;
            Pair<OooOO0O, ? extends Job> pair2;
            Pair<OooOO0O, ? extends Job> pair3;
            Oooo000 oooo000;
            ?? r2;
            Pair<OooOO0O, ? extends Job> pair4;
            ?? r0;
            o0O0OOO0 o0o0ooo1;
            Pair<OooOO0O, ? extends Job> pair5;
            Pair<OooOO0O, ? extends Job> pair6;
            o0O0OOO0 o0o0ooo2;
            ?? r1;
            ?? r3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2520Oooo0oo;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f2517Oooo;
                    Oooo000 oooo001 = o0O0OOO0.this.f2545Oooo0oo;
                    if (oooo001 == null || !oooo001.OooOoO()) {
                        oooo001 = null;
                    }
                    if (oooo001 == null) {
                        return Unit.INSTANCE;
                    }
                    if (!this.f2521OoooO0.OooOoO()) {
                        return Unit.INSTANCE;
                    }
                    Oooo000 oooo002 = this.f2521OoooO0;
                    OooOO0O oooOO0O = this.f2523OoooO0O;
                    boolean z = false;
                    OooOO0O oooOO0OOooo = oooo001.Oooo(oooo002, false);
                    OooOO0O oooOO0OOooO0Oo = oooOO0O.OooO0Oo(OooOO0.OooO00o(oooOO0OOooo.f30404OooO00o, oooOO0OOooo.f30405OooO0O0));
                    pair = new Pair(oooOO0OOooO0Oo, JobKt.getJob(coroutineScope.getCoroutineContext()));
                    o0O0OOO0 o0o0ooo3 = o0O0OOO0.this;
                    Pair<OooOO0O, ? extends Job> pair7 = o0o0ooo3.f2516OoooO00;
                    o0o0ooo3.f2516OoooO00 = pair;
                    if (pair7 != null) {
                        try {
                            OooOO0O first = pair7.getFirst();
                            if (first.f30404OooO00o <= oooOO0OOooO0Oo.f30404OooO00o && first.f30405OooO0O0 <= oooOO0OOooO0Oo.f30405OooO0O0 && first.f30406OooO0OO >= oooOO0OOooO0Oo.f30406OooO0OO && first.f30407OooO0Oo >= oooOO0OOooO0Oo.f30407OooO0Oo) {
                                z = true;
                            }
                            if (z) {
                                Job second = pair7.getSecond();
                                this.f2517Oooo = oooo001;
                                this.f2518Oooo0o = pair;
                                this.f2519Oooo0oO = pair7;
                                this.f2520Oooo0oo = 2;
                                if (second.join(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                oooo000 = oooo001;
                                r2 = pair;
                                pair4 = pair7;
                                o0o0ooo2 = o0O0OOO0.this;
                                r3 = r2;
                                if (o0o0ooo2.f2515OoooO0 == pair4) {
                                    this.f2517Oooo = r2;
                                    this.f2518Oooo0o = null;
                                    this.f2519Oooo0oO = null;
                                    this.f2520Oooo0oo = 3;
                                    if (o0O0OOO0.OooO0O0(o0o0ooo2, r2, oooo000, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    r1 = r2;
                                    r3 = r1;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            o0o0ooo0 = o0O0OOO0.this;
                            pair2 = o0o0ooo0.f2515OoooO0;
                            pair3 = o0o0ooo0.f2516OoooO00;
                            if (pair2 == pair3) {
                                o0o0ooo0.f2515OoooO0 = null;
                            }
                            if (pair3 == pair) {
                                o0o0ooo0.f2516OoooO00 = null;
                            }
                            throw th;
                        }
                    }
                    o0O0OOO0 o0o0ooo4 = o0O0OOO0.this;
                    this.f2517Oooo = pair;
                    this.f2520Oooo0oo = 1;
                    if (o0O0OOO0.OooO0O0(o0o0ooo4, pair, oooo001, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r0 = pair;
                    Unit unit = Unit.INSTANCE;
                    o0o0ooo1 = o0O0OOO0.this;
                    pair5 = o0o0ooo1.f2515OoooO0;
                    pair6 = o0o0ooo1.f2516OoooO00;
                    if (pair5 == pair6) {
                        o0o0ooo1.f2515OoooO0 = null;
                    }
                    if (pair6 == r0) {
                        o0o0ooo1.f2516OoooO00 = null;
                    }
                    return unit;
                }
                if (i == 1) {
                    Pair pair8 = (Pair) this.f2517Oooo;
                    ResultKt.throwOnFailure(obj);
                    r0 = pair8;
                    Unit unit2 = Unit.INSTANCE;
                    o0o0ooo1 = o0O0OOO0.this;
                    pair5 = o0o0ooo1.f2515OoooO0;
                    pair6 = o0o0ooo1.f2516OoooO00;
                    if (pair5 == pair6) {
                        o0o0ooo1.f2515OoooO0 = null;
                    }
                    if (pair6 == r0) {
                        o0o0ooo1.f2516OoooO00 = null;
                    }
                    return unit2;
                }
                if (i == 2) {
                    pair4 = this.f2519Oooo0oO;
                    r2 = this.f2518Oooo0o;
                    oooo000 = (Oooo000) this.f2517Oooo;
                    try {
                        ResultKt.throwOnFailure(obj);
                        r2 = r2;
                        o0o0ooo2 = o0O0OOO0.this;
                        r3 = r2;
                        if (o0o0ooo2.f2515OoooO0 == pair4) {
                            this.f2517Oooo = r2;
                            this.f2518Oooo0o = null;
                            this.f2519Oooo0oO = null;
                            this.f2520Oooo0oo = 3;
                            if (o0O0OOO0.OooO0O0(o0o0ooo2, r2, oooo000, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r1 = r2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        pair = r2;
                        o0o0ooo0 = o0O0OOO0.this;
                        pair2 = o0o0ooo0.f2515OoooO0;
                        pair3 = o0o0ooo0.f2516OoooO00;
                        if (pair2 == pair3) {
                            o0o0ooo0.f2515OoooO0 = null;
                        }
                        if (pair3 == pair) {
                            o0o0ooo0.f2516OoooO00 = null;
                        }
                        throw th;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Pair pair9 = (Pair) this.f2517Oooo;
                    ResultKt.throwOnFailure(obj);
                    r1 = pair9;
                }
                r3 = r1;
                o0O0OOO0 o0o0ooo5 = o0O0OOO0.this;
                Pair<OooOO0O, ? extends Job> pair10 = o0o0ooo5.f2515OoooO0;
                Pair<OooOO0O, ? extends Job> pair11 = o0o0ooo5.f2516OoooO00;
                if (pair10 == pair11) {
                    o0o0ooo5.f2515OoooO0 = null;
                }
                if (pair11 == r3) {
                    o0o0ooo5.f2516OoooO00 = null;
                }
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
                pair = coroutine_suspended;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOO0(@NotNull o0O00oO0 defaultParent) {
        super(defaultParent);
        Intrinsics.checkNotNullParameter(defaultParent, "defaultParent");
    }

    public static final Object OooO0O0(o0O0OOO0 o0o0ooo0, Pair pair, Oooo000 oooo000, Continuation continuation) {
        o0o0ooo0.f2515OoooO0 = pair;
        OooOO0O oooOO0O = (OooOO0O) pair.getFirst();
        o0O0O0o0 o0o0o0o0 = o0o0ooo0.f2514Oooo;
        if (o0o0o0o0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("responder");
            o0o0o0o0 = null;
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new o0O0OOOo(o0o0ooo0, o0o0o0o0.OooO00o(oooOO0O), oooo000, oooOO0O, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @Override // p030Oooo0oo.o0O00oO0
    @Nullable
    public final Object OooO00o(@NotNull OooOO0O oooOO0O, @NotNull Oooo000 oooo000, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OooO00o(oooo000, oooOO0O, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @Override // p076o000OOo.OooOOO
    @NotNull
    public final OooOo00<o0O00oO0> getKey() {
        return o0O00o00.f2511OooO00o;
    }

    @Override // p076o000OOo.OooOOO
    public final o0O00oO0 getValue() {
        return this;
    }
}
