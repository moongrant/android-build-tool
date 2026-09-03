package retrofit2;

import javax.annotation.Nullable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o0O0o;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o000oOoO<ResponseT, ReturnT> extends o0000O<ReturnT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000O0 f61149OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O00o0.OooO00o f61150OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOOO<o0O0o, ResponseT> f61151OooO0OO;

    public static final class OooO00o<ResponseT, ReturnT> extends o000oOoO<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooO0OO<ResponseT, ReturnT> f61152OooO0Oo;

        public OooO00o(o0000O0 o0000o1, o00O00o0.OooO00o oooO00o, OooOOOO<o0O0o, ResponseT> oooOOOO, retrofit2.OooO0OO<ResponseT, ReturnT> oooO0OO) {
            super(o0000o1, oooO00o, oooOOOO);
            this.f61152OooO0Oo = oooO0OO;
        }

        @Override // retrofit2.o000oOoO
        public final Object OooO0OO(o0Oo0oo o0oo0oo2, Object[] objArr) {
            return this.f61152OooO0Oo.OooO00o(o0oo0oo2);
        }
    }

    public static final class OooO0O0<ResponseT> extends o000oOoO<ResponseT, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooO0OO<ResponseT, retrofit2.OooO0O0<ResponseT>> f61153OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f61154OooO0o0;

        public OooO0O0(o0000O0 o0000o1, o00O00o0.OooO00o oooO00o, OooOOOO oooOOOO, retrofit2.OooO0OO oooO0OO) {
            super(o0000o1, oooO00o, oooOOOO);
            this.f61153OooO0Oo = oooO0OO;
            this.f61154OooO0o0 = false;
        }

        @Override // retrofit2.o000oOoO
        public final Object OooO0OO(o0Oo0oo o0oo0oo2, Object[] objArr) throws Throwable {
            Object result;
            retrofit2.OooO0O0 oooO0O0 = (retrofit2.OooO0O0) this.f61153OooO0Oo.OooO00o(o0oo0oo2);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                if (this.f61154OooO0o0) {
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
                    cancellableContinuationImpl.invokeOnCancellation(new o00Oo0(oooO0O0));
                    oooO0O0.OooOooO(new oo000o(cancellableContinuationImpl));
                    result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                } else {
                    CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
                    cancellableContinuationImpl2.invokeOnCancellation(new o00O0O(oooO0O0));
                    oooO0O0.OooOooO(new o00Ooo(cancellableContinuationImpl2));
                    result = cancellableContinuationImpl2.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                }
                return result;
            } catch (Exception e) {
                return o0OOO0o.OooO00o(e, continuation);
            }
        }
    }

    public static final class OooO0OO<ResponseT> extends o000oOoO<ResponseT, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooO0OO<ResponseT, retrofit2.OooO0O0<ResponseT>> f61155OooO0Oo;

        public OooO0OO(o0000O0 o0000o1, o00O00o0.OooO00o oooO00o, OooOOOO<o0O0o, ResponseT> oooOOOO, retrofit2.OooO0OO<ResponseT, retrofit2.OooO0O0<ResponseT>> oooO0OO) {
            super(o0000o1, oooO00o, oooOOOO);
            this.f61155OooO0Oo = oooO0OO;
        }

        @Override // retrofit2.o000oOoO
        public final Object OooO0OO(o0Oo0oo o0oo0oo2, Object[] objArr) throws Throwable {
            retrofit2.OooO0O0 oooO0O0 = (retrofit2.OooO0O0) this.f61155OooO0Oo.OooO00o(o0oo0oo2);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
                cancellableContinuationImpl.invokeOnCancellation(new o00oO0o(oooO0O0));
                oooO0O0.OooOooO(new o0ooOOo(cancellableContinuationImpl));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result;
            } catch (Exception e) {
                return o0OOO0o.OooO00o(e, continuation);
            }
        }
    }

    public o000oOoO(o0000O0 o0000o1, o00O00o0.OooO00o oooO00o, OooOOOO<o0O0o, ResponseT> oooOOOO) {
        this.f61149OooO00o = o0000o1;
        this.f61150OooO0O0 = oooO00o;
        this.f61151OooO0OO = oooOOOO;
    }

    @Override // retrofit2.o0000O
    @Nullable
    public final ReturnT OooO00o(Object[] objArr) {
        return (ReturnT) OooO0OO(new o0Oo0oo(this.f61149OooO00o, objArr, this.f61150OooO0O0, this.f61151OooO0OO), objArr);
    }

    @Nullable
    public abstract Object OooO0OO(o0Oo0oo o0oo0oo2, Object[] objArr);
}
