package p200o00o0OoO;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p393o0Oo.oo000o;
import p466o0OooOoo.o0O0o00O;
import p675oOooo0o.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.uikit.svga.SharedSvgaManager$downloadSvgaFromNet$2", f = "SharedSvgaManager.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSharedSvgaManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedSvgaManager.kt\ncom/code/android/uikit/svga/SharedSvgaManager$downloadSvgaFromNet$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,131:1\n314#2,11:132\n*S KotlinDebug\n*F\n+ 1 SharedSvgaManager.kt\ncom/code/android/uikit/svga/SharedSvgaManager$downloadSvgaFromNet$2\n*L\n88#1:132,11\n*E\n"})
public final class o00OOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f39290OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f39291OooO0o0;

    public static final class OooO00o<D> implements o0000O00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<File> f39292OooO00o;

        public OooO00o(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f39292OooO00o = cancellableContinuationImpl;
        }

        @Override // p675oOooo0o.o0000O00
        public final void result(boolean z, Object obj) {
            Result.Companion companion = Result.INSTANCE;
            this.f39292OooO00o.resumeWith(Result.m4215constructorimpl(new File((String) obj)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0(String str, Continuation<? super o00OOO0> continuation) {
        super(2, continuation);
        this.f39291OooO0o0 = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00OOO0(this.f39291OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return ((o00OOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f39290OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f39291OooO0o0;
            this.f39290OooO0Oo = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            oo000o oo000oVar = new oo000o(o0O0o00O.f47846OooO0OO);
            Intrinsics.checkNotNullExpressionValue(oo000oVar, "download(...)");
            oo000oVar.f43611OooO0Oo = new OooO00o(cancellableContinuationImpl);
            oo000oVar.OooO0O0(str);
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
