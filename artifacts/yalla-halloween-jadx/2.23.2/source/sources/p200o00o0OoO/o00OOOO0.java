package p200o00o0OoO;

import com.opensource.svgaplayer.OooO0OO;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import o0OO0O0O.o00Ooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.uikit.svga.SharedSvgaManager$loadSvgaFromAssets$2", f = "SharedSvgaManager.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSharedSvgaManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedSvgaManager.kt\ncom/code/android/uikit/svga/SharedSvgaManager$loadSvgaFromAssets$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,131:1\n314#2,11:132\n*S KotlinDebug\n*F\n+ 1 SharedSvgaManager.kt\ncom/code/android/uikit/svga/SharedSvgaManager$loadSvgaFromAssets$2\n*L\n105#1:132,11\n*E\n"})
public final class o00OOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o00Ooo>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f39301OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f39302OooO0o0;

    public static final class OooO00o implements OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<o00Ooo> f39303OooO00o;

        public OooO00o(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f39303OooO00o = cancellableContinuationImpl;
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void OooO00o(@NotNull o00Ooo videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            this.f39303OooO00o.resumeWith(Result.m4215constructorimpl(videoItem));
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void onError() {
            this.f39303OooO00o.resumeWith(Result.m4215constructorimpl(null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(String str, Continuation<? super o00OOOO0> continuation) {
        super(2, continuation);
        this.f39302OooO0o0 = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00OOOO0(this.f39302OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o00Ooo> continuation) {
        return ((o00OOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f39301OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f39302OooO0o0;
            this.f39301OooO0Oo = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            o00OOO0O.f39300OooO0o0.OooO00o(str, new OooO00o(cancellableContinuationImpl));
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
