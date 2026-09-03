package o000O00O;

import androidx.paging.CombineSource;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/UnbatchedFlowCombiner\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,224:1\n107#2,8:225\n116#2:237\n115#2:238\n12744#3,2:233\n18987#3,2:235\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/paging/UnbatchedFlowCombiner\n*L\n196#1:225,8\n196#1:237\n196#1:238\n197#1:233,2\n200#1:235,2\n*E\n"})
public final class o00O00O<T1, T2> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function4<T1, T2, CombineSource, Continuation<? super Unit>, Object> f34571OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CompletableDeferred<Unit> f34572OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Mutex f34573OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final CompletableDeferred<Unit>[] f34574OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Object[] f34575OooO0o0;

    @DebugMetadata(c = "androidx.paging.UnbatchedFlowCombiner", f = "FlowExt.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {191, 230, 208}, m = "onNext", n = {"this", AppMeasurementSdk.ConditionalUserProperty.VALUE, "index", "this", AppMeasurementSdk.ConditionalUserProperty.VALUE, "$this$withLock_u24default$iv", "index", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ o00O00O<T1, T2> f34576OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00O00O f34577OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Mutex f34578OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Object f34579OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f34580OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public /* synthetic */ Object f34581OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f34582OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O00O<T1, T2> o00o00o2, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f34576OooO = o00o00o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34581OooO0oo = obj;
            this.f34582OooOO0 |= Integer.MIN_VALUE;
            return this.f34576OooO.OooO00o(0, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00O00O(@NotNull Function4<? super T1, ? super T2, ? super CombineSource, ? super Continuation<? super Unit>, ? extends Object> send) {
        Intrinsics.checkNotNullParameter(send, "send");
        this.f34571OooO00o = send;
        this.f34572OooO0O0 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.f34573OooO0OO = MutexKt.Mutex$default(false, 1, null);
        CompletableDeferred<Unit>[] completableDeferredArr = new CompletableDeferred[2];
        for (int i = 0; i < 2; i++) {
            completableDeferredArr[i] = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        }
        this.f34574OooO0Oo = completableDeferredArr;
        Object[] objArr = new Object[2];
        for (int i2 = 0; i2 < 2; i2++) {
            objArr[i2] = o00Ooo.f34609OooO00o;
        }
        this.f34575OooO0o0 = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a5 A[Catch: all -> 0x00fa, TryCatch #0 {all -> 0x00fa, blocks: (B:33:0x009e, B:35:0x00a5, B:43:0x00b6, B:45:0x00bc, B:55:0x00d1, B:59:0x00db, B:57:0x00d6, B:58:0x00d9, B:51:0x00c9, B:41:0x00b2), top: B:73:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2 A[Catch: all -> 0x00fa, LOOP:0: B:34:0x00a3->B:41:0x00b2, LOOP_END, TryCatch #0 {all -> 0x00fa, blocks: (B:33:0x009e, B:35:0x00a5, B:43:0x00b6, B:45:0x00bc, B:55:0x00d1, B:59:0x00db, B:57:0x00d6, B:58:0x00d9, B:51:0x00c9, B:41:0x00b2), top: B:73:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc A[Catch: all -> 0x00fa, TryCatch #0 {all -> 0x00fa, blocks: (B:33:0x009e, B:35:0x00a5, B:43:0x00b6, B:45:0x00bc, B:55:0x00d1, B:59:0x00db, B:57:0x00d6, B:58:0x00d9, B:51:0x00c9, B:41:0x00b2), top: B:73:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9 A[Catch: all -> 0x00fa, LOOP:1: B:44:0x00ba->B:51:0x00c9, LOOP_END, TryCatch #0 {all -> 0x00fa, blocks: (B:33:0x009e, B:35:0x00a5, B:43:0x00b6, B:45:0x00bc, B:55:0x00d1, B:59:0x00db, B:57:0x00d6, B:58:0x00d9, B:51:0x00c9, B:41:0x00b2), top: B:73:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1 A[Catch: all -> 0x00fa, TryCatch #0 {all -> 0x00fa, blocks: (B:33:0x009e, B:35:0x00a5, B:43:0x00b6, B:45:0x00bc, B:55:0x00d1, B:59:0x00db, B:57:0x00d6, B:58:0x00d9, B:51:0x00c9, B:41:0x00b2), top: B:73:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6 A[Catch: all -> 0x00fa, TryCatch #0 {all -> 0x00fa, blocks: (B:33:0x009e, B:35:0x00a5, B:43:0x00b6, B:45:0x00bc, B:55:0x00d1, B:59:0x00db, B:57:0x00d6, B:58:0x00d9, B:51:0x00c9, B:41:0x00b2), top: B:73:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d9 A[Catch: all -> 0x00fa, TryCatch #0 {all -> 0x00fa, blocks: (B:33:0x009e, B:35:0x00a5, B:43:0x00b6, B:45:0x00bc, B:55:0x00d1, B:59:0x00db, B:57:0x00d6, B:58:0x00d9, B:51:0x00c9, B:41:0x00b2), top: B:73:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x00cc A[SYNTHETIC] */
    @Nullable
    public final Object OooO00o(int i, @Nullable Object obj, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        OooO00o oooO00o;
        Object obj2;
        o00O00O<T1, T2> o00o00o2;
        Object obj3;
        Mutex mutex;
        Object[] objArr;
        int length;
        int i2;
        boolean z;
        int length2;
        int i3;
        boolean z2;
        Mutex mutex2;
        CombineSource combineSource;
        Function4<T1, T2, CombineSource, Continuation<? super Unit>, Object> function4;
        Object obj4;
        Object obj5;
        o00O00O<T1, T2> o00o00o3;
        boolean z3;
        boolean z4;
        int i4 = i;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i5 = oooO00o.f34582OooOO0;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                oooO00o.f34582OooOO0 = i5 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        } else {
            oooO00o = new OooO00o(this, continuation);
        }
        Object obj6 = oooO00o.f34581OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = oooO00o.f34582OooOO0;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj6);
            CompletableDeferred<Unit>[] completableDeferredArr = this.f34574OooO0Oo;
            if (completableDeferredArr[i4].isCompleted()) {
                oooO00o.f34577OooO0Oo = this;
                obj2 = obj;
                oooO00o.f34579OooO0o0 = obj2;
                oooO00o.f34580OooO0oO = i4;
                oooO00o.f34582OooOO0 = 1;
                if (this.f34572OooO0O0.await(oooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                obj2 = obj;
                completableDeferredArr[i4].complete(Unit.INSTANCE);
            }
            o00o00o2 = this;
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) oooO00o.f34579OooO0o0;
                    o00o00o3 = oooO00o.f34577OooO0Oo;
                    try {
                        ResultKt.throwOnFailure(obj6);
                        o00o00o3.f34572OooO0O0.complete(Unit.INSTANCE);
                        Unit unit = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                i4 = oooO00o.f34580OooO0oO;
                mutex = oooO00o.f34578OooO0o;
                obj3 = oooO00o.f34579OooO0o0;
                o00o00o2 = oooO00o.f34577OooO0Oo;
                ResultKt.throwOnFailure(obj6);
                try {
                    objArr = o00o00o2.f34575OooO0o0;
                    length = objArr.length;
                    i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            z = false;
                            break;
                        }
                        if (objArr[i2] == o00Ooo.f34609OooO00o) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    objArr[i4] = obj3;
                    length2 = objArr.length;
                    i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            z2 = true;
                            break;
                        }
                        if (objArr[i3] == o00Ooo.f34609OooO00o) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            z2 = false;
                            break;
                        }
                        i3++;
                    }
                    if (z2) {
                        if (z) {
                            combineSource = CombineSource.INITIAL;
                        } else if (i4 == 0) {
                            combineSource = CombineSource.RECEIVER;
                        } else {
                            combineSource = CombineSource.OTHER;
                        }
                        function4 = o00o00o2.f34571OooO00o;
                        obj4 = objArr[0];
                        obj5 = objArr[1];
                        oooO00o.f34577OooO0Oo = o00o00o2;
                        oooO00o.f34579OooO0o0 = mutex;
                        oooO00o.f34578OooO0o = null;
                        oooO00o.f34582OooOO0 = 3;
                        if (function4.invoke((T1) obj4, (T2) obj5, combineSource, oooO00o) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex2 = mutex;
                        o00o00o3 = o00o00o2;
                        o00o00o3.f34572OooO0O0.complete(Unit.INSTANCE);
                    } else {
                        mutex2 = mutex;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    mutex.unlock(null);
                    throw th;
                }
            }
            i4 = oooO00o.f34580OooO0oO;
            obj2 = oooO00o.f34579OooO0o0;
            o00o00o2 = oooO00o.f34577OooO0Oo;
            ResultKt.throwOnFailure(obj6);
        }
        Mutex mutex3 = o00o00o2.f34573OooO0OO;
        oooO00o.f34577OooO0Oo = o00o00o2;
        oooO00o.f34579OooO0o0 = obj2;
        oooO00o.f34578OooO0o = mutex3;
        oooO00o.f34580OooO0oO = i4;
        oooO00o.f34582OooOO0 = 2;
        if (mutex3.lock(null, oooO00o) == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj3 = obj2;
        mutex = mutex3;
        objArr = o00o00o2.f34575OooO0o0;
        length = objArr.length;
        i2 = 0;
        while (true) {
            if (i2 < length) {
                z = false;
                break;
            }
            if (objArr[i2] == o00Ooo.f34609OooO00o) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                z = true;
                break;
            }
            i2++;
        }
        objArr[i4] = obj3;
        length2 = objArr.length;
        i3 = 0;
        while (true) {
            if (i3 < length2) {
                z2 = true;
                break;
            }
            if (objArr[i3] == o00Ooo.f34609OooO00o) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                z2 = false;
                break;
            }
            i3++;
        }
        if (z2) {
            if (z) {
                combineSource = CombineSource.INITIAL;
            } else if (i4 == 0) {
                combineSource = CombineSource.RECEIVER;
            } else {
                combineSource = CombineSource.OTHER;
            }
            function4 = o00o00o2.f34571OooO00o;
            obj4 = objArr[0];
            obj5 = objArr[1];
            oooO00o.f34577OooO0Oo = o00o00o2;
            oooO00o.f34579OooO0o0 = mutex;
            oooO00o.f34578OooO0o = null;
            oooO00o.f34582OooOO0 = 3;
            if (function4.invoke((T1) obj4, (T2) obj5, combineSource, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex2 = mutex;
            o00o00o3 = o00o00o2;
            o00o00o3.f34572OooO0O0.complete(Unit.INSTANCE);
        } else {
            mutex2 = mutex;
        }
        Unit unit3 = Unit.INSTANCE;
        mutex2.unlock(null);
        return Unit.INSTANCE;
    }
}
