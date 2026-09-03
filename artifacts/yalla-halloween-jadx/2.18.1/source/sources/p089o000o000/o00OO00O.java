package p089o000o000;

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
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO00O<T1, T2> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function4<T1, T2, CombineSource, Continuation<? super Unit>, Object> f29013OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CompletableDeferred<Unit> f29014OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Mutex f29015OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final CompletableDeferred<Unit>[] f29016OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Object[] f29017OooO0o0;

    @DebugMetadata(c = "androidx.paging.UnbatchedFlowCombiner", f = "FlowExt.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {191, 230, 208}, m = "onNext", n = {"this", AppMeasurementSdk.ConditionalUserProperty.VALUE, "index", "this", AppMeasurementSdk.ConditionalUserProperty.VALUE, "$this$withLock_u24default$iv", "index", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f29018Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o00OO00O f29019Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Object f29020Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Mutex f29021Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o00OO00O<T1, T2> f29022OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f29023OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f29024OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OO00O<T1, T2> o00oo00o, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f29022OoooO0 = o00oo00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29023OoooO00 = obj;
            this.f29024OoooO0O |= Integer.MIN_VALUE;
            return this.f29022OoooO0.OooO00o(0, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00OO00O(@NotNull Function4<? super T1, ? super T2, ? super CombineSource, ? super Continuation<? super Unit>, ? extends Object> send) {
        Intrinsics.checkNotNullParameter(send, "send");
        this.f29013OooO00o = send;
        this.f29014OooO0O0 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.f29015OooO0OO = MutexKt.Mutex$default(false, 1, null);
        CompletableDeferred<Unit>[] completableDeferredArr = new CompletableDeferred[2];
        for (int i = 0; i < 2; i++) {
            completableDeferredArr[i] = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        }
        this.f29016OooO0Oo = completableDeferredArr;
        Object[] objArr = new Object[2];
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj = o00Ooo.f29037OooO00o;
            objArr[i2] = o00Ooo.f29037OooO00o;
        }
        this.f29017OooO0o0 = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a7 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:33:0x00a0, B:35:0x00a7, B:43:0x00ba, B:45:0x00c2, B:55:0x00d9, B:59:0x00e3, B:57:0x00de, B:58:0x00e1, B:51:0x00d1, B:41:0x00b6), top: B:73:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[Catch: all -> 0x0104, LOOP:0: B:34:0x00a5->B:41:0x00b6, LOOP_END, TryCatch #0 {all -> 0x0104, blocks: (B:33:0x00a0, B:35:0x00a7, B:43:0x00ba, B:45:0x00c2, B:55:0x00d9, B:59:0x00e3, B:57:0x00de, B:58:0x00e1, B:51:0x00d1, B:41:0x00b6), top: B:73:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:33:0x00a0, B:35:0x00a7, B:43:0x00ba, B:45:0x00c2, B:55:0x00d9, B:59:0x00e3, B:57:0x00de, B:58:0x00e1, B:51:0x00d1, B:41:0x00b6), top: B:73:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1 A[Catch: all -> 0x0104, LOOP:1: B:44:0x00c0->B:51:0x00d1, LOOP_END, TryCatch #0 {all -> 0x0104, blocks: (B:33:0x00a0, B:35:0x00a7, B:43:0x00ba, B:45:0x00c2, B:55:0x00d9, B:59:0x00e3, B:57:0x00de, B:58:0x00e1, B:51:0x00d1, B:41:0x00b6), top: B:73:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:33:0x00a0, B:35:0x00a7, B:43:0x00ba, B:45:0x00c2, B:55:0x00d9, B:59:0x00e3, B:57:0x00de, B:58:0x00e1, B:51:0x00d1, B:41:0x00b6), top: B:73:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00de A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:33:0x00a0, B:35:0x00a7, B:43:0x00ba, B:45:0x00c2, B:55:0x00d9, B:59:0x00e3, B:57:0x00de, B:58:0x00e1, B:51:0x00d1, B:41:0x00b6), top: B:73:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:33:0x00a0, B:35:0x00a7, B:43:0x00ba, B:45:0x00c2, B:55:0x00d9, B:59:0x00e3, B:57:0x00de, B:58:0x00e1, B:51:0x00d1, B:41:0x00b6), top: B:73:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4 A[SYNTHETIC] */
    @Nullable
    public final Object OooO00o(int i, @Nullable Object obj, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        OooO00o oooO00o;
        Object obj2;
        o00OO00O<T1, T2> o00oo00o;
        Object obj3;
        Mutex mutex;
        Object[] objArr;
        int length;
        int i2;
        boolean z;
        Object[] objArr2;
        int length2;
        int i3;
        boolean z2;
        Mutex mutex2;
        CombineSource combineSource;
        Function4<T1, T2, CombineSource, Continuation<? super Unit>, Object> function4;
        Object obj4;
        Object obj5;
        o00OO00O<T1, T2> o00oo00o2;
        Object obj6;
        boolean z3;
        Object obj7;
        boolean z4;
        int i4 = i;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i5 = oooO00o.f29024OoooO0O;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                oooO00o.f29024OoooO0O = i5 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        } else {
            oooO00o = new OooO00o(this, continuation);
        }
        Object obj8 = oooO00o.f29023OoooO00;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = oooO00o.f29024OoooO0O;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj8);
            if (this.f29016OooO0Oo[i4].isCompleted()) {
                CompletableDeferred<Unit> completableDeferred = this.f29014OooO0O0;
                oooO00o.f29019Oooo0o = this;
                obj2 = obj;
                oooO00o.f29020Oooo0oO = obj2;
                oooO00o.f29018Oooo = i4;
                oooO00o.f29024OoooO0O = 1;
                if (completableDeferred.await(oooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                obj2 = obj;
                this.f29016OooO0Oo[i4].complete(Unit.INSTANCE);
            }
            o00oo00o = this;
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) oooO00o.f29020Oooo0oO;
                    o00oo00o2 = oooO00o.f29019Oooo0o;
                    try {
                        ResultKt.throwOnFailure(obj8);
                        o00oo00o2.f29014OooO0O0.complete(Unit.INSTANCE);
                        Unit unit = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return unit;
                    } catch (Throwable th) {
                        th = th;
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                i4 = oooO00o.f29018Oooo;
                mutex = oooO00o.f29021Oooo0oo;
                obj3 = oooO00o.f29020Oooo0oO;
                o00oo00o = oooO00o.f29019Oooo0o;
                ResultKt.throwOnFailure(obj8);
                try {
                    objArr = o00oo00o.f29017OooO0o0;
                    length = objArr.length;
                    i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            z = false;
                            break;
                        }
                        obj7 = objArr[i2];
                        Object obj9 = o00Ooo.f29037OooO00o;
                        if (obj7 == o00Ooo.f29037OooO00o) {
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
                    objArr2 = o00oo00o.f29017OooO0o0;
                    objArr2[i4] = obj3;
                    length2 = objArr2.length;
                    i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            z2 = true;
                            break;
                        }
                        obj6 = objArr2[i3];
                        Object obj10 = o00Ooo.f29037OooO00o;
                        if (obj6 == o00Ooo.f29037OooO00o) {
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
                        function4 = o00oo00o.f29013OooO00o;
                        Object[] objArr3 = o00oo00o.f29017OooO0o0;
                        obj4 = objArr3[0];
                        obj5 = objArr3[1];
                        oooO00o.f29019Oooo0o = o00oo00o;
                        oooO00o.f29020Oooo0oO = mutex;
                        oooO00o.f29021Oooo0oo = null;
                        oooO00o.f29024OoooO0O = 3;
                        if (function4.invoke((T1) obj4, (T2) obj5, combineSource, oooO00o) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex2 = mutex;
                        o00oo00o2 = o00oo00o;
                        o00oo00o2.f29014OooO0O0.complete(Unit.INSTANCE);
                    } else {
                        mutex2 = mutex;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return unit2;
                } catch (Throwable th2) {
                    th = th2;
                    mutex.unlock(null);
                    throw th;
                }
            }
            i4 = oooO00o.f29018Oooo;
            obj2 = oooO00o.f29020Oooo0oO;
            o00oo00o = oooO00o.f29019Oooo0o;
            ResultKt.throwOnFailure(obj8);
        }
        Mutex mutex3 = o00oo00o.f29015OooO0OO;
        oooO00o.f29019Oooo0o = o00oo00o;
        oooO00o.f29020Oooo0oO = obj2;
        oooO00o.f29021Oooo0oo = mutex3;
        oooO00o.f29018Oooo = i4;
        oooO00o.f29024OoooO0O = 2;
        if (mutex3.lock(null, oooO00o) == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj3 = obj2;
        mutex = mutex3;
        objArr = o00oo00o.f29017OooO0o0;
        length = objArr.length;
        i2 = 0;
        while (true) {
            if (i2 < length) {
                z = false;
                break;
            }
            obj7 = objArr[i2];
            Object obj11 = o00Ooo.f29037OooO00o;
            if (obj7 == o00Ooo.f29037OooO00o) {
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
        objArr2 = o00oo00o.f29017OooO0o0;
        objArr2[i4] = obj3;
        length2 = objArr2.length;
        i3 = 0;
        while (true) {
            if (i3 < length2) {
                z2 = true;
                break;
            }
            obj6 = objArr2[i3];
            Object obj12 = o00Ooo.f29037OooO00o;
            if (obj6 == o00Ooo.f29037OooO00o) {
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
            function4 = o00oo00o.f29013OooO00o;
            Object[] objArr4 = o00oo00o.f29017OooO0o0;
            obj4 = objArr4[0];
            obj5 = objArr4[1];
            oooO00o.f29019Oooo0o = o00oo00o;
            oooO00o.f29020Oooo0oO = mutex;
            oooO00o.f29021Oooo0oo = null;
            oooO00o.f29024OoooO0O = 3;
            if (function4.invoke((T1) obj4, (T2) obj5, combineSource, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex2 = mutex;
            o00oo00o2 = o00oo00o;
            o00oo00o2.f29014OooO0O0.complete(Unit.INSTANCE);
        } else {
            mutex2 = mutex;
        }
        Unit unit3 = Unit.INSTANCE;
        mutex2.unlock(null);
        return unit3;
    }
}
