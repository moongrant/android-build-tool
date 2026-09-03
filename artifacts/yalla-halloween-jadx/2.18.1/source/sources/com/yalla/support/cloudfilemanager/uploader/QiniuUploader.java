package com.yalla.support.cloudfilemanager.uploader;

import OooO00o.OooO00o;
import android.net.Uri;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.storage.UploadManager;
import com.qiniu.android.storage.UploadOptions;
import com.yalla.support.cloudfilemanager.CloudFileConfig;
import com.yalla.support.cloudfilemanager.CloudFileUploadInfo;
import com.yalla.support.cloudfilemanager.request.UploadRequest;
import com.yalla.support.cloudfilemanager.util.FileUtil;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/yalla/support/cloudfilemanager/uploader/QiniuUploader;", "Lcom/yalla/support/cloudfilemanager/uploader/CloudFileUploader;", "()V", "uploadManager", "Lcom/qiniu/android/storage/UploadManager;", "uploadFile", "", "uploadRequest", "Lcom/yalla/support/cloudfilemanager/request/UploadRequest;", "(Lcom/yalla/support/cloudfilemanager/request/UploadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CloudFileManager_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class QiniuUploader implements CloudFileUploader {

    @NotNull
    private final UploadManager uploadManager = new UploadManager();

    /* JADX INFO: renamed from: com.yalla.support.cloudfilemanager.uploader.QiniuUploader$uploadFile$2, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.support.cloudfilemanager.uploader.QiniuUploader$uploadFile$2", f = "QiniuUploader.kt", i = {0, 0}, l = {45}, m = "invokeSuspend", n = {"uploadOptions", "cloudFileName"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        public final /* synthetic */ CloudFileUploadInfo.QiNiuUploadInfo $qiniuInfo;
        public final /* synthetic */ UploadRequest $uploadRequest;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ QiniuUploader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UploadRequest uploadRequest, CloudFileUploadInfo.QiNiuUploadInfo qiNiuUploadInfo, QiniuUploader qiniuUploader, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$uploadRequest = uploadRequest;
            this.$qiniuInfo = qiNiuUploadInfo;
            this.this$0 = qiniuUploader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$uploadRequest, this.$qiniuInfo, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:43:0x0155  */
        /* JADX WARN: Code duplicated, block: B:45:0x0161  */
        /* JADX WARN: Code duplicated, block: B:48:0x016c  */
        /* JADX WARN: Code duplicated, block: B:49:0x016e  */
        /* JADX WARN: Code duplicated, block: B:51:0x0182 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:49:0x016e, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws JSONException {
            UploadOptions uploadOptions;
            String str;
            String str2;
            Throwable th;
            ResponseInfo responseInfoSyncPut;
            CloudFileConfig cloudFileConfig;
            String string;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$uploadRequest.getFile() == null && this.$uploadRequest.getUri() == null) {
                    return "";
                }
                if (this.$uploadRequest.getFile() == null && this.$uploadRequest.getUri() != null) {
                    FileUtil fileUtil = FileUtil.INSTANCE;
                    Uri uri = this.$uploadRequest.getUri();
                    Intrinsics.checkNotNull(uri);
                    File fileCopyFile2Cache = fileUtil.copyFile2Cache(uri);
                    if (fileCopyFile2Cache == null) {
                        return "";
                    }
                    this.$uploadRequest.setFile(fileCopyFile2Cache);
                    this.$uploadRequest.setTempFile(true);
                }
                if (this.$uploadRequest.getFile() == null) {
                    return "";
                }
                FileUtil fileUtil2 = FileUtil.INSTANCE;
                File file = this.$uploadRequest.getFile();
                Intrinsics.checkNotNull(file);
                uploadOptions = new UploadOptions(new LinkedHashMap(), fileUtil2.getFileMimeType(file), false, null, null);
                File file2 = this.$uploadRequest.getFile();
                Intrinsics.checkNotNull(file2);
                str = this.$qiniuInfo.getCloudFileName() + '/' + this.$uploadRequest.getIndex() + '.' + fileUtil2.getFileExtension(file2);
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("exists: ");
                File file3 = this.$uploadRequest.getFile();
                Intrinsics.checkNotNull(file3);
                sbOooO0o0.append(file3.exists());
                sbOooO0o0.append(" size = ");
                File file4 = this.$uploadRequest.getFile();
                Intrinsics.checkNotNull(file4);
                sbOooO0o0.append(file4.length());
                System.out.println((Object) sbOooO0o0.toString());
                File file5 = this.$uploadRequest.getFile();
                Intrinsics.checkNotNull(file5);
                if (file5.length() == 0) {
                    UploadRequest uploadRequest = this.$uploadRequest;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        QiniuUploader$uploadFile$2$1$1 qiniuUploader$uploadFile$2$1$1 = new QiniuUploader$uploadFile$2$1$1(uploadRequest, null);
                        this.L$0 = uploadOptions;
                        this.L$1 = str;
                        this.label = 1;
                        if (TimeoutKt.withTimeout(3000L, qiniuUploader$uploadFile$2$1$1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                    } catch (Throwable th2) {
                        str2 = str;
                        th = th2;
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m502constructorimpl(ResultKt.createFailure(th));
                    }
                }
                responseInfoSyncPut = this.this$0.uploadManager.syncPut(this.$uploadRequest.getFile(), str, this.$qiniuInfo.getToken(), uploadOptions);
                if (responseInfoSyncPut.isOK()) {
                    return "";
                }
                cloudFileConfig = CloudFileConfig.INSTANCE;
                if (StringsKt.isBlank(cloudFileConfig.getFileHost())) {
                    string = responseInfoSyncPut.response.getString("key");
                    if (string == null) {
                        return str;
                    }
                    return string;
                }
                return cloudFileConfig.getFileHost() + str;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$1;
            uploadOptions = (UploadOptions) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion3 = Result.INSTANCE;
                Result.m502constructorimpl(ResultKt.createFailure(th));
            }
            Result.m502constructorimpl(Unit.INSTANCE);
            str = str2;
            responseInfoSyncPut = this.this$0.uploadManager.syncPut(this.$uploadRequest.getFile(), str, this.$qiniuInfo.getToken(), uploadOptions);
            if (responseInfoSyncPut.isOK()) {
                return "";
            }
            cloudFileConfig = CloudFileConfig.INSTANCE;
            if (StringsKt.isBlank(cloudFileConfig.getFileHost())) {
                string = responseInfoSyncPut.response.getString("key");
                if (string == null) {
                    return str;
                }
                return string;
            }
            return cloudFileConfig.getFileHost() + str;
        }
    }

    @Override // com.yalla.support.cloudfilemanager.uploader.CloudFileUploader
    @Nullable
    public Object uploadFile(@NotNull UploadRequest uploadRequest, @NotNull Continuation<? super String> continuation) {
        CloudFileUploadInfo cloudFileUploadInfo = uploadRequest.getCloudFileUploadInfo();
        Intrinsics.checkNotNull(cloudFileUploadInfo, "null cannot be cast to non-null type com.yalla.support.cloudfilemanager.CloudFileUploadInfo.QiNiuUploadInfo");
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(uploadRequest, (CloudFileUploadInfo.QiNiuUploadInfo) cloudFileUploadInfo, this, null), continuation);
    }
}
