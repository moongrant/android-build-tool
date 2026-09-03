package p154o00OoO00;

import com.opensource.svgaplayer.OooO0OO;
import java.io.File;
import java.io.FileInputStream;
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
import o0OO0O0.oo000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.uikit.svga.SharedSvgaManager$loadSvgaFromFileInputStream$2", f = "SharedSvgaManager.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSharedSvgaManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedSvgaManager.kt\ncom/code/android/uikit/svga/SharedSvgaManager$loadSvgaFromFileInputStream$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,131:1\n314#2,11:132\n*S KotlinDebug\n*F\n+ 1 SharedSvgaManager.kt\ncom/code/android/uikit/svga/SharedSvgaManager$loadSvgaFromFileInputStream$2\n*L\n65#1:132,11\n*E\n"})
public final class o00oO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super oo000o>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f38195OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f38196OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ File f38197OooO0o0;

    public static final class OooO00o implements OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<oo000o> f38198OooO00o;

        public OooO00o(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f38198OooO00o = cancellableContinuationImpl;
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void OooO00o(@NotNull oo000o videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            this.f38198OooO00o.resumeWith(Result.m4213constructorimpl(videoItem));
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void onError() {
            this.f38198OooO00o.resumeWith(Result.m4213constructorimpl(null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(File file, String str, Continuation<? super o00oO0o> continuation) {
        super(2, continuation);
        this.f38197OooO0o0 = file;
        this.f38196OooO0o = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00oO0o(this.f38197OooO0o0, this.f38196OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super oo000o> continuation) {
        return ((o00oO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f38195OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f38196OooO0o;
            File file = this.f38197OooO0o0;
            this.f38195OooO0Oo = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                OooO0OO.OooO0Oo(o00Oo0.f38191OooO0o0, fileInputStream, str, new OooO00o(cancellableContinuationImpl), true, 48);
            } catch (Exception e) {
                e.printStackTrace();
                cancellableContinuationImpl.resumeWith(Result.m4213constructorimpl(null));
            }
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
