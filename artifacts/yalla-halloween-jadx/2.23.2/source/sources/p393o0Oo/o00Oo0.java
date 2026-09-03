package p393o0Oo;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p466o0OooOoo.o0O0o00O;
import p675oOooo0o.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.download.AppDownloadExtKt$downloadGiftVideo$2", f = "AppDownloadExt.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nAppDownloadExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppDownloadExt.kt\ncom/yalla/yalla/download/AppDownloadExtKt$downloadGiftVideo$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,47:1\n314#2,11:48\n*S KotlinDebug\n*F\n+ 1 AppDownloadExt.kt\ncom/yalla/yalla/download/AppDownloadExtKt$downloadGiftVideo$2\n*L\n33#1:48,11\n*E\n"})
public final class o00Oo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f43603OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f43604OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f43605OooO0o0;

    public static final class OooO00o<D> implements o0000O00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<File> f43606OooO00o;

        public OooO00o(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f43606OooO00o = cancellableContinuationImpl;
        }

        @Override // p675oOooo0o.o0000O00
        public final void result(boolean z, Object obj) {
            String str = (String) obj;
            CancellableContinuation<File> cancellableContinuation = this.f43606OooO00o;
            if (z) {
                if (!(str == null || StringsKt.isBlank(str))) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m4215constructorimpl(new File(str)));
                    return;
                }
            }
            cancellableContinuation.resumeWith(Result.m4215constructorimpl(null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(String str, String str2, Continuation<? super o00Oo0> continuation) {
        super(2, continuation);
        this.f43605OooO0o0 = str;
        this.f43604OooO0o = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00Oo0(this.f43605OooO0o0, this.f43604OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return ((o00Oo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f43603OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f43605OooO0o0;
            String str2 = this.f43604OooO0o;
            this.f43603OooO0Oo = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            File file = o0O0o00O.f47844OooO00o;
            oo000o oo000oVar = new oo000o(o0O0o00O.OooO0OO());
            Intrinsics.checkNotNullExpressionValue(oo000oVar, "download(...)");
            oo000oVar.f43607OooO = str;
            oo000oVar.f43611OooO0Oo = new OooO00o(cancellableContinuationImpl);
            oo000oVar.OooO0O0(str2);
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
