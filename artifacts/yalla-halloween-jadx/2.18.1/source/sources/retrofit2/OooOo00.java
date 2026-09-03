package retrofit2;

import javax.annotation.Nullable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooOo00<ResponseT, ReturnT> extends o000OOo<ReturnT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OO00O f53755OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0ooO.OooO00o f53756OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0<o00OOOOo, ResponseT> f53757OooO0OO;

    public static final class OooO00o<ResponseT, ReturnT> extends OooOo00<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooO0OO<ResponseT, ReturnT> f53758OooO0Oo;

        public OooO00o(o0OO00O o0oo00o2, o0O0ooO.OooO00o oooO00o, OooOO0<o00OOOOo, ResponseT> oooOO1, retrofit2.OooO0OO<ResponseT, ReturnT> oooO0OO) {
            super(o0oo00o2, oooO00o, oooOO1);
            this.f53758OooO0Oo = oooO0OO;
        }

        @Override // retrofit2.OooOo00
        public final ReturnT OooO0OO(retrofit2.OooO0O0<ResponseT> oooO0O0, Object[] objArr) {
            return this.f53758OooO0Oo.OooO00o(oooO0O0);
        }
    }

    public static final class OooO0O0<ResponseT> extends OooOo00<ResponseT, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooO0OO<ResponseT, retrofit2.OooO0O0<ResponseT>> f53759OooO0Oo;

        public OooO0O0(o0OO00O o0oo00o2, o0O0ooO.OooO00o oooO00o, OooOO0 oooOO1, retrofit2.OooO0OO oooO0OO) {
            super(o0oo00o2, oooO00o, oooOO1);
            this.f53759OooO0Oo = oooO0OO;
        }

        @Override // retrofit2.OooOo00
        public final Object OooO0OO(retrofit2.OooO0O0<ResponseT> oooO0O0, Object[] objArr) {
            retrofit2.OooO0O0<ResponseT> oooO0O0OooO00o = this.f53759OooO0Oo.OooO00o(oooO0O0);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
                cancellableContinuationImpl.invokeOnCancellation(new Oooo000(oooO0O0OooO00o));
                oooO0O0OooO00o.OoooOo0(new Oooo0(cancellableContinuationImpl));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result;
            } catch (Exception e) {
                return o00O0O.OooO00o(e, continuation);
            }
        }
    }

    public static final class OooO0OO<ResponseT> extends OooOo00<ResponseT, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final retrofit2.OooO0OO<ResponseT, retrofit2.OooO0O0<ResponseT>> f53760OooO0Oo;

        public OooO0OO(o0OO00O o0oo00o2, o0O0ooO.OooO00o oooO00o, OooOO0<o00OOOOo, ResponseT> oooOO1, retrofit2.OooO0OO<ResponseT, retrofit2.OooO0O0<ResponseT>> oooO0OO) {
            super(o0oo00o2, oooO00o, oooOO1);
            this.f53760OooO0Oo = oooO0OO;
        }

        @Override // retrofit2.OooOo00
        public final Object OooO0OO(retrofit2.OooO0O0<ResponseT> oooO0O0, Object[] objArr) {
            retrofit2.OooO0O0<ResponseT> oooO0O0OooO00o = this.f53760OooO0Oo.OooO00o(oooO0O0);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
                cancellableContinuationImpl.invokeOnCancellation(new o000oOoO(oooO0O0OooO00o));
                oooO0O0OooO00o.OoooOo0(new o0OoOo0(cancellableContinuationImpl));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result;
            } catch (Exception e) {
                return o00O0O.OooO00o(e, continuation);
            }
        }
    }

    public OooOo00(o0OO00O o0oo00o2, o0O0ooO.OooO00o oooO00o, OooOO0<o00OOOOo, ResponseT> oooOO1) {
        this.f53755OooO00o = o0oo00o2;
        this.f53756OooO0O0 = oooO00o;
        this.f53757OooO0OO = oooOO1;
    }

    @Override // retrofit2.o000OOo
    @Nullable
    public final ReturnT OooO00o(Object[] objArr) {
        return OooO0OO(new o00Oo0(this.f53755OooO00o, objArr, this.f53756OooO0O0, this.f53757OooO0OO), objArr);
    }

    @Nullable
    public abstract ReturnT OooO0OO(retrofit2.OooO0O0<ResponseT> oooO0O0, Object[] objArr);
}
