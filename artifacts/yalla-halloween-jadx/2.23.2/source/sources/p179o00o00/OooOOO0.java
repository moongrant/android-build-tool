package p179o00o00;

import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.storage.UpCompletionHandler;
import com.qiniu.android.storage.UploadManager;
import com.qiniu.android.storage.UploadOptions;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.cloudfilemanager.uploader.QiniuUploader$splitPut$2", f = "QiniuUploader.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseInfo>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ UploadOptions f38389OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f38390OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oo00oO.OooO00o f38391OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f38392OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f38393OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f38394OooO0oo;

    public static final class OooO00o implements UpCompletionHandler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Continuation<ResponseInfo> f38395OooO00o;

        public OooO00o(SafeContinuation safeContinuation) {
            this.f38395OooO00o = safeContinuation;
        }

        @Override // com.qiniu.android.storage.UpCompletionHandler
        public final void complete(String str, ResponseInfo responseInfo, JSONObject jSONObject) {
            this.f38395OooO00o.resumeWith(Result.m4215constructorimpl(responseInfo));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(OooOOOO oooOOOO, oo00oO.OooO00o oooO00o, String str, String str2, UploadOptions uploadOptions, Continuation<? super OooOOO0> continuation) {
        super(2, continuation);
        this.f38392OooO0o0 = oooOOOO;
        this.f38391OooO0o = oooO00o;
        this.f38393OooO0oO = str;
        this.f38394OooO0oo = str2;
        this.f38389OooO = uploadOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOOO0(this.f38392OooO0o0, this.f38391OooO0o, this.f38393OooO0oO, this.f38394OooO0oo, this.f38389OooO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseInfo> continuation) {
        return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f38390OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f38393OooO0oO;
            String str2 = this.f38394OooO0oo;
            UploadOptions uploadOptions = this.f38389OooO;
            OooOOOO oooOOOO = this.f38392OooO0o0;
            oo00oO.OooO00o oooO00o = this.f38391OooO0o;
            this.f38390OooO0Oo = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
            (oooOOOO.f38398OooO0OO ? new UploadManager(oooOOOO.f38396OooO00o) : new UploadManager()).put(oooO00o.f60303OooO0O0, str, str2, new OooO00o(safeContinuation), uploadOptions);
            obj = safeContinuation.getOrThrow();
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
