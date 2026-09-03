package p154o00OoO00;

import java.io.File;
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
import oo0o0O0.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p415o0Oo0ooO.x0;
import p416o0Oo0ooo.y0;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.uikit.svga.SharedSvgaManager$downloadSvgaFromNet$2", f = "SharedSvgaManager.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSharedSvgaManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedSvgaManager.kt\ncom/code/android/uikit/svga/SharedSvgaManager$downloadSvgaFromNet$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,131:1\n314#2,11:132\n*S KotlinDebug\n*F\n+ 1 SharedSvgaManager.kt\ncom/code/android/uikit/svga/SharedSvgaManager$downloadSvgaFromNet$2\n*L\n88#1:132,11\n*E\n"})
public final class o00O0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f38184OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f38185OooO0o0;

    public static final class OooO00o<D> implements OooO0OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<File> f38186OooO0Oo;

        public OooO00o(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f38186OooO0Oo = cancellableContinuationImpl;
        }

        @Override // oo0o0O0.OooO0OO
        public final void result(boolean z, Object obj) {
            Result.Companion companion = Result.INSTANCE;
            this.f38186OooO0Oo.resumeWith(Result.m4213constructorimpl(new File((String) obj)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(String str, Continuation<? super o00O0O> continuation) {
        super(2, continuation);
        this.f38185OooO0o0 = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0O(this.f38185OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return ((o00O0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f38184OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f38185OooO0o0;
            this.f38184OooO0Oo = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            x0 x0Var = new x0(y0.f45409OooO0OO);
            Intrinsics.checkNotNullExpressionValue(x0Var, "download(svgaCachePath)");
            x0Var.f45401OooO0Oo = new OooO00o(cancellableContinuationImpl);
            x0Var.OooO0O0(str);
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
