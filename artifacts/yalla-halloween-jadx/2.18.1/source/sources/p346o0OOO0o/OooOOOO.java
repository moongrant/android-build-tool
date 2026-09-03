package p346o0OOO0o;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import o0000O0O.oo000o;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public Function0<? extends CoroutineScope> f38146OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public CoroutineScope f38147OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooOOO f38148OooO0OO;

    public static final class OooO00o extends Lambda implements Function0<CoroutineScope> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineScope invoke() {
            return OooOOOO.this.f38147OooO0O0;
        }
    }

    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {217}, m = "dispatchPostFling-RZ2iAVY", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f38150Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f38152Oooo0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f38150Oooo0o = obj;
            this.f38152Oooo0oo |= Integer.MIN_VALUE;
            return OooOOOO.this.OooO00o(0L, 0L, this);
        }
    }

    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {IZegoLiveEventCallback.StreamEvent.PlayFail}, m = "dispatchPreFling-QWom1Mo", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f38153Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f38155Oooo0oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f38153Oooo0o = obj;
            this.f38155Oooo0oo |= Integer.MIN_VALUE;
            return OooOOOO.this.OooO0OO(0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(long j, long j2, @NotNull Continuation<? super oo000o> continuation) {
        OooO0O0 oooO0O0;
        long j3;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f38152Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f38152Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        OooO0O0 oooO0O1 = oooO0O0;
        Object objOooO00o = oooO0O1.f38150Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O1.f38152Oooo0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO00o);
            OooOOO oooOOO = this.f38148OooO0OO;
            if (oooOOO != null) {
                oooO0O1.f38152Oooo0oo = 1;
                objOooO00o = oooOOO.OooO00o(j, j2, oooO0O1);
                if (objOooO00o == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                oo000o.OooO00o oooO00o = oo000o.f27328OooO0O0;
                j3 = oo000o.f27329OooO0OO;
            }
            return new oo000o(j3);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objOooO00o);
        j3 = ((oo000o) objOooO00o).f27330OooO00o;
        return new oo000o(j3);
    }

    public final long OooO0O0(long j, long j2, int i) {
        OooOOO oooOOO = this.f38148OooO0OO;
        if (oooOOO != null) {
            return oooOOO.OooO0Oo(j, j2, i);
        }
        OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
        return OooO.f30392OooO0OO;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0OO(long j, @NotNull Continuation<? super oo000o> continuation) {
        OooO0OO oooO0OO;
        long j2;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f38155Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f38155Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objOooO0OO = oooO0OO.f38153Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f38155Oooo0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0OO);
            OooOOO oooOOO = this.f38148OooO0OO;
            if (oooOOO != null) {
                oooO0OO.f38155Oooo0oo = 1;
                objOooO0OO = oooOOO.OooO0OO(j, oooO0OO);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                oo000o.OooO00o oooO00o = oo000o.f27328OooO0O0;
                j2 = oo000o.f27329OooO0OO;
            }
            return new oo000o(j2);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objOooO0OO);
        j2 = ((oo000o) objOooO0OO).f27330OooO00o;
        return new oo000o(j2);
    }

    @NotNull
    public final CoroutineScope OooO0Oo() {
        CoroutineScope coroutineScopeInvoke = this.f38146OooO00o.invoke();
        if (coroutineScopeInvoke != null) {
            return coroutineScopeInvoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
