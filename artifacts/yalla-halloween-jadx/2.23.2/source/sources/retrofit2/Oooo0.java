package retrofit2;

import javax.annotation.Nullable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o0O00oO0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Oooo0<ResponseT, ReturnT> extends o000OO<ReturnT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000oo f60484OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OO.OooO00o f60485OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOO<o0O00oO0, ResponseT> f60486OooO0OO;

    public static final class OooO00o<ResponseT, ReturnT> extends Oooo0<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooO0OO<ResponseT, ReturnT> f60487OooO0Oo;

        public OooO00o(o0000oo o0000ooVar, o00OO.OooO00o oooO00o, OooOOO<o0O00oO0, ResponseT> oooOOO, retrofit2.OooO0OO<ResponseT, ReturnT> oooO0OO) {
            super(o0000ooVar, oooO00o, oooOOO);
            this.f60487OooO0Oo = oooO0OO;
        }

        @Override // retrofit2.Oooo0
        public final Object OooO0OO(o0OOO0o o0ooo0o2, Object[] objArr) {
            return this.f60487OooO0Oo.OooO00o(o0ooo0o2);
        }
    }

    public static final class OooO0O0<ResponseT> extends Oooo0<ResponseT, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooO0OO<ResponseT, retrofit2.OooO0O0<ResponseT>> f60488OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f60489OooO0o0;

        public OooO0O0(o0000oo o0000ooVar, o00OO.OooO00o oooO00o, OooOOO oooOOO, retrofit2.OooO0OO oooO0OO) {
            super(o0000ooVar, oooO00o, oooOOO);
            this.f60488OooO0Oo = oooO0OO;
            this.f60489OooO0o0 = false;
        }

        @Override // retrofit2.Oooo0
        public final Object OooO0OO(o0OOO0o o0ooo0o2, Object[] objArr) throws Throwable {
            Object result;
            retrofit2.OooO0O0 oooO0O0 = (retrofit2.OooO0O0) this.f60488OooO0Oo.OooO00o(o0ooo0o2);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                if (this.f60489OooO0o0) {
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
                    cancellableContinuationImpl.invokeOnCancellation(new o00O0O(oooO0O0));
                    oooO0O0.OooOooo(new o00Ooo(cancellableContinuationImpl));
                    result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                } else {
                    CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
                    cancellableContinuationImpl2.invokeOnCancellation(new o0OoOo0(oooO0O0));
                    oooO0O0.OooOooo(new o00Oo0(cancellableContinuationImpl2));
                    result = cancellableContinuationImpl2.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                }
                return result;
            } catch (Exception e) {
                return o0ooOOo.OooO00o(e, continuation);
            }
        }
    }

    public static final class OooO0OO<ResponseT> extends Oooo0<ResponseT, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooO0OO<ResponseT, retrofit2.OooO0O0<ResponseT>> f60490OooO0Oo;

        public OooO0OO(o0000oo o0000ooVar, o00OO.OooO00o oooO00o, OooOOO<o0O00oO0, ResponseT> oooOOO, retrofit2.OooO0OO<ResponseT, retrofit2.OooO0O0<ResponseT>> oooO0OO) {
            super(o0000ooVar, oooO00o, oooOOO);
            this.f60490OooO0Oo = oooO0OO;
        }

        @Override // retrofit2.Oooo0
        public final Object OooO0OO(o0OOO0o o0ooo0o2, Object[] objArr) throws Throwable {
            retrofit2.OooO0O0 oooO0O0 = (retrofit2.OooO0O0) this.f60490OooO0Oo.OooO00o(o0ooo0o2);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
                cancellableContinuationImpl.invokeOnCancellation(new oo000o(oooO0O0));
                oooO0O0.OooOooo(new o00oO0o(cancellableContinuationImpl));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result;
            } catch (Exception e) {
                return o0ooOOo.OooO00o(e, continuation);
            }
        }
    }

    public Oooo0(o0000oo o0000ooVar, o00OO.OooO00o oooO00o, OooOOO<o0O00oO0, ResponseT> oooOOO) {
        this.f60484OooO00o = o0000ooVar;
        this.f60485OooO0O0 = oooO00o;
        this.f60486OooO0OO = oooOOO;
    }

    @Override // retrofit2.o000OO
    @Nullable
    public final ReturnT OooO00o(Object[] objArr) {
        return (ReturnT) OooO0OO(new o0OOO0o(this.f60484OooO00o, objArr, this.f60485OooO0O0, this.f60486OooO0OO), objArr);
    }

    @Nullable
    public abstract Object OooO0OO(o0OOO0o o0ooo0o2, Object[] objArr);
}
