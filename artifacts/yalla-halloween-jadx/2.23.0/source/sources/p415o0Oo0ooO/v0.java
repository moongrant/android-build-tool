package p415o0Oo0ooO;

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
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import oo0o0O0.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p416o0Oo0ooo.y0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.download.AppDownloadExtKt$downloadGiftVideo$2", f = "AppDownloadExt.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nAppDownloadExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDownloadExt.kt\ncom/yalla/yalla/download/AppDownloadExtKt$downloadGiftVideo$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,47:1\n314#2,11:48\n*S KotlinDebug\n*F\n+ 1 AppDownloadExt.kt\ncom/yalla/yalla/download/AppDownloadExtKt$downloadGiftVideo$2\n*L\n33#1:48,11\n*E\n"})
public final class v0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45393OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f45394OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f45395OooO0o0;

    public static final class OooO00o<D> implements OooO0OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<File> f45396OooO0Oo;

        public OooO00o(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f45396OooO0Oo = cancellableContinuationImpl;
        }

        @Override // oo0o0O0.OooO0OO
        public final void result(boolean z, Object obj) {
            String str = (String) obj;
            CancellableContinuation<File> cancellableContinuation = this.f45396OooO0Oo;
            if (z) {
                if (!(str == null || StringsKt.isBlank(str))) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m4213constructorimpl(new File(str)));
                    return;
                }
            }
            cancellableContinuation.resumeWith(Result.m4213constructorimpl(null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(String str, String str2, Continuation<? super v0> continuation) {
        super(2, continuation);
        this.f45395OooO0o0 = str;
        this.f45394OooO0o = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new v0(this.f45395OooO0o0, this.f45394OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return ((v0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45393OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f45395OooO0o0;
            String str2 = this.f45394OooO0o;
            this.f45393OooO0Oo = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            File file = y0.f45407OooO00o;
            x0 x0Var = new x0(y0.OooO0OO());
            Intrinsics.checkNotNullExpressionValue(x0Var, "download(giftVideoPath)");
            x0Var.f45397OooO = str;
            x0Var.f45401OooO0Oo = new OooO00o(cancellableContinuationImpl);
            x0Var.OooO0O0(str2);
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
