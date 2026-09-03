package p179o00o00;

import com.code.android.cloudfilemanager.uploader.UploadException;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.storage.UploadManager;
import com.qiniu.android.storage.UploadOptions;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;
import p182o00o000O.Oooo000;
import p184o00o00O0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.cloudfilemanager.uploader.QiniuUploader$uploadFile$2", f = "QiniuUploader.kt", i = {0, 0, 1}, l = {67, 76}, m = "invokeSuspend", n = {"uploadOptions", "cloudFileName", "cloudFileName"}, s = {"L$0", "L$1", "L$0"})
public final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f38381OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f38382OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f38383OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f38384OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oo00oO.OooO00o f38385OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Oooo000.OooO0O0 f38386OooO0oo;

    @DebugMetadata(c = "com.code.android.cloudfilemanager.uploader.QiniuUploader$uploadFile$2$1$1", f = "QiniuUploader.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f38387OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo00oO.OooO00o f38388OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oo00oO.OooO00o oooO00o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f38388OooO0o0 = oooO00o;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f38388OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f38387OooO0Oo;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            do {
                File file = this.f38388OooO0o0.f60303OooO0O0;
                Intrinsics.checkNotNull(file);
                if (file.length() != 0) {
                    return Unit.INSTANCE;
                }
                this.f38387OooO0Oo = 1;
            } while (DelayKt.delay(200L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(oo00oO.OooO00o oooO00o, Oooo000.OooO0O0 oooO0O0, OooOOOO oooOOOO, Continuation<? super OooOOO> continuation) {
        super(2, continuation);
        this.f38385OooO0oO = oooO00o;
        this.f38386OooO0oo = oooO0O0;
        this.f38381OooO = oooOOOO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OooOOO oooOOO = new OooOOO(this.f38385OooO0oO, this.f38386OooO0oo, this.f38381OooO, continuation);
        oooOOO.f38383OooO0o = obj;
        return oooOOO;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:36:0x0113 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0119  */
    /* JADX WARN: Code duplicated, block: B:40:0x0121  */
    /* JADX WARN: Code duplicated, block: B:44:0x0134 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0135  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        UploadOptions uploadOptions;
        String str;
        String str2;
        UploadOptions uploadOptions2;
        String str3;
        OooOOOO oooOOOO;
        boolean z;
        UploadManager uploadManager;
        ResponseInfo responseInfoSyncPut;
        Object objWithContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f38384OooO0o0;
        Oooo000.OooO0O0 oooO0O0 = this.f38386OooO0oo;
        oo00oO.OooO00o oooO00o = this.f38385OooO0oO;
        if (i != 0) {
            if (i == 1) {
                str2 = this.f38382OooO0Oo;
                uploadOptions = (UploadOptions) this.f38383OooO0o;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th) {
                    th = th;
                    str = str2;
                    Result.Companion companion = Result.INSTANCE;
                    Result.m4215constructorimpl(ResultKt.createFailure(th));
                    str2 = str;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (String) this.f38383OooO0o;
                ResultKt.throwOnFailure(obj);
                objWithContext = obj;
            }
            responseInfoSyncPut = (ResponseInfo) objWithContext;
            if (responseInfoSyncPut.isOK()) {
                return str3;
            }
            throw new UploadException(o00O00OO.OooO00o("Qiniu Upload : ", responseInfoSyncPut.error));
        }
        ResultKt.throwOnFailure(obj);
        File file = oooO00o.f60303OooO0O0;
        if (file == null || file == null) {
            return "";
        }
        Intrinsics.checkNotNull(file);
        uploadOptions = new UploadOptions(new LinkedHashMap(), OooO0o.OooO0OO(file), false, null, null);
        File file2 = oooO00o.f60303OooO0O0;
        Intrinsics.checkNotNull(file2);
        String strOooO0O0 = OooO0o.OooO0O0(file2);
        str = oooO0O0.f38473OooO0OO + "/" + oooO00o.f60305OooO0Oo + "." + strOooO0O0;
        File file3 = oooO00o.f60303OooO0O0;
        Intrinsics.checkNotNull(file3);
        boolean zExists = file3.exists();
        File file4 = oooO00o.f60303OooO0O0;
        Intrinsics.checkNotNull(file4);
        System.out.println((Object) ("exists: " + zExists + " size = " + file4.length()));
        File file5 = oooO00o.f60303OooO0O0;
        Intrinsics.checkNotNull(file5);
        if (file5.length() == 0) {
            try {
                Result.Companion companion2 = Result.INSTANCE;
                OooO00o oooO00o2 = new OooO00o(oooO00o, null);
                this.f38383OooO0o = uploadOptions;
                this.f38382OooO0Oo = str;
                this.f38384OooO0o0 = 1;
                if (TimeoutKt.withTimeout(3000L, oooO00o2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str;
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion3 = Result.INSTANCE;
                Result.m4215constructorimpl(ResultKt.createFailure(th));
                str2 = str;
            }
        } else {
            uploadOptions2 = uploadOptions;
            str3 = str;
        }
        oooOOOO = this.f38381OooO;
        z = oooOOOO.f38398OooO0OO;
        if (z) {
            oo00oO.OooO00o oooO00o3 = this.f38385OooO0oO;
            String str4 = oooO0O0.f38474OooO0Oo;
            this.f38383OooO0o = str3;
            this.f38382OooO0Oo = null;
            this.f38384OooO0o0 = 2;
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new OooOOO0(oooOOOO, oooO00o3, str3, str4, uploadOptions2, null), this);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            responseInfoSyncPut = (ResponseInfo) objWithContext;
        } else {
            if (z) {
                uploadManager = new UploadManager(oooOOOO.f38396OooO00o);
            } else {
                uploadManager = new UploadManager();
            }
            responseInfoSyncPut = uploadManager.syncPut(oooO00o.f60303OooO0O0, str3, oooO0O0.f38474OooO0Oo, uploadOptions2);
        }
        if (responseInfoSyncPut.isOK()) {
            return str3;
        }
        throw new UploadException(o00O00OO.OooO00o("Qiniu Upload : ", responseInfoSyncPut.error));
        Result.m4215constructorimpl(Unit.INSTANCE);
        str3 = str2;
        uploadOptions2 = uploadOptions;
        oooOOOO = this.f38381OooO;
        z = oooOOOO.f38398OooO0OO;
        if (z) {
            oo00oO.OooO00o oooO00o4 = this.f38385OooO0oO;
            String str5 = oooO0O0.f38474OooO0Oo;
            this.f38383OooO0o = str3;
            this.f38382OooO0Oo = null;
            this.f38384OooO0o0 = 2;
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new OooOOO0(oooOOOO, oooO00o4, str3, str5, uploadOptions2, null), this);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            responseInfoSyncPut = (ResponseInfo) objWithContext;
        } else {
            if (z) {
                uploadManager = new UploadManager(oooOOOO.f38396OooO00o);
            } else {
                uploadManager = new UploadManager();
            }
            responseInfoSyncPut = uploadManager.syncPut(oooO00o.f60303OooO0O0, str3, oooO0O0.f38474OooO0Oo, uploadOptions2);
        }
        if (responseInfoSyncPut.isOK()) {
            return str3;
        }
        throw new UploadException(o00O00OO.OooO00o("Qiniu Upload : ", responseInfoSyncPut.error));
    }
}
