package com.yalla.support.cloudfilemanager.uploader;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.amazonaws.auth.AWSAbstractCognitoDeveloperIdentityProvider;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.yalla.support.cloudfilemanager.CloudFileConfig;
import com.yalla.support.cloudfilemanager.CloudFileUploadInfo;
import com.yalla.support.cloudfilemanager.request.UploadRequest;
import com.yalla.support.cloudfilemanager.util.FileUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00O000;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0019\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/yalla/support/cloudfilemanager/uploader/AWSUploader;", "Lcom/yalla/support/cloudfilemanager/uploader/CloudFileUploader;", "()V", "awsUpload", "", "uploadRequest", "Lcom/yalla/support/cloudfilemanager/request/UploadRequest;", "(Lcom/yalla/support/cloudfilemanager/request/UploadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAmazonS3Client", "Lcom/yalla/support/cloudfilemanager/uploader/AmazonS3Client1;", "awsInfo", "Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo$AWSUploadInfo;", "uploadFile", "AWSYallaIdentityProvider", "CloudFileManager_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AWSUploader implements CloudFileUploader {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/yalla/support/cloudfilemanager/uploader/AWSUploader$AWSYallaIdentityProvider;", "Lcom/amazonaws/auth/AWSAbstractCognitoDeveloperIdentityProvider;", "identityPoolId", "", "regions", "(Ljava/lang/String;Ljava/lang/String;)V", "awsIdentityId", "getAwsIdentityId", "()Ljava/lang/String;", "setAwsIdentityId", "(Ljava/lang/String;)V", "awsProviderName", "getAwsProviderName", "setAwsProviderName", "awsToken", "getAwsToken", "setAwsToken", "getIdentityId", "getProviderName", "getToken", "refresh", "CloudFileManager_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AWSYallaIdentityProvider extends AWSAbstractCognitoDeveloperIdentityProvider {

        @NotNull
        private String awsIdentityId;

        @NotNull
        private String awsProviderName;

        @NotNull
        private String awsToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AWSYallaIdentityProvider(@NotNull String identityPoolId, @NotNull String regions) {
            super("", identityPoolId, Regions.OooO00o(regions));
            Intrinsics.checkNotNullParameter(identityPoolId, "identityPoolId");
            Intrinsics.checkNotNullParameter(regions, "regions");
            this.awsIdentityId = "";
            this.awsToken = "";
            this.awsProviderName = "";
        }

        @NotNull
        public final String getAwsIdentityId() {
            return this.awsIdentityId;
        }

        @NotNull
        public final String getAwsProviderName() {
            return this.awsProviderName;
        }

        @NotNull
        public final String getAwsToken() {
            return this.awsToken;
        }

        @Override // com.amazonaws.auth.AWSAbstractCognitoIdentityProvider, com.amazonaws.auth.AWSCognitoIdentityProvider
        @NotNull
        public String getIdentityId() {
            return this.awsIdentityId;
        }

        @Override // com.amazonaws.auth.AWSAbstractCognitoDeveloperIdentityProvider, com.amazonaws.auth.AWSAbstractCognitoIdentityProvider
        @NotNull
        public String getProviderName() {
            return this.awsProviderName;
        }

        @Override // com.amazonaws.auth.AWSAbstractCognitoIdentityProvider
        @NotNull
        public String getToken() {
            return this.awsToken;
        }

        @Override // com.amazonaws.auth.AWSAbstractCognitoIdentityProvider, com.amazonaws.auth.AWSIdentityProvider
        @NotNull
        public String refresh() {
            setToken(null);
            String str = this.awsIdentityId;
            this.identityId = str;
            String str2 = this.awsToken;
            this.token = str2;
            update(str, str2);
            String token = this.token;
            Intrinsics.checkNotNullExpressionValue(token, "token");
            return token;
        }

        public final void setAwsIdentityId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.awsIdentityId = str;
        }

        public final void setAwsProviderName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.awsProviderName = str;
        }

        public final void setAwsToken(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.awsToken = str;
        }
    }

    /* JADX INFO: renamed from: com.yalla.support.cloudfilemanager.uploader.AWSUploader$awsUpload$2, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.support.cloudfilemanager.uploader.AWSUploader$awsUpload$2", f = "AWSUploader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        public final /* synthetic */ CloudFileUploadInfo.AWSUploadInfo $awsInfo;
        public final /* synthetic */ UploadRequest $uploadRequest;
        public int label;
        public final /* synthetic */ AWSUploader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UploadRequest uploadRequest, CloudFileUploadInfo.AWSUploadInfo aWSUploadInfo, AWSUploader aWSUploader, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$uploadRequest = uploadRequest;
            this.$awsInfo = aWSUploadInfo;
            this.this$0 = aWSUploader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$uploadRequest, this.$awsInfo, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00fb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IOException {
            String fileMimeType;
            String fileExtension;
            String resourceUrl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InputStream inputStreamOpenInputStream = null;
            try {
                try {
                    if (this.$uploadRequest.getFile() != null) {
                        FileUtil fileUtil = FileUtil.INSTANCE;
                        File file = this.$uploadRequest.getFile();
                        Intrinsics.checkNotNull(file);
                        fileMimeType = fileUtil.getFileMimeType(file);
                        File file2 = this.$uploadRequest.getFile();
                        Intrinsics.checkNotNull(file2);
                        fileExtension = fileUtil.getFileExtension(file2);
                        inputStreamOpenInputStream = new FileInputStream(this.$uploadRequest.getFile());
                    } else {
                        FileUtil fileUtil2 = FileUtil.INSTANCE;
                        Uri uri = this.$uploadRequest.getUri();
                        Intrinsics.checkNotNull(uri);
                        fileMimeType = fileUtil2.getFileMimeType(uri);
                        Uri uri2 = this.$uploadRequest.getUri();
                        Intrinsics.checkNotNull(uri2);
                        fileExtension = fileUtil2.getFileExtension(uri2);
                        o00O000 o00o001 = o00O000.f34346OooO00o;
                        ContentResolver contentResolver = o00O000.OooO00o().getContentResolver();
                        Uri uri3 = this.$uploadRequest.getUri();
                        Intrinsics.checkNotNull(uri3);
                        inputStreamOpenInputStream = contentResolver.openInputStream(uri3);
                    }
                    if (inputStreamOpenInputStream == null) {
                        return "";
                    }
                    ObjectMetadata objectMetadata = new ObjectMetadata();
                    objectMetadata.OooOOo(fileMimeType);
                    String str = this.$awsInfo.getCloudFileName() + '/' + this.$uploadRequest.getIndex() + '.' + fileExtension;
                    PutObjectRequest putObjectRequest = new PutObjectRequest(this.$awsInfo.getAwsBucketName(), str, inputStreamOpenInputStream, objectMetadata);
                    AmazonS3Client1 amazonS3Client1CreateAmazonS3Client = this.this$0.createAmazonS3Client(this.$awsInfo);
                    amazonS3Client1CreateAmazonS3Client.putObject(putObjectRequest);
                    CloudFileConfig cloudFileConfig = CloudFileConfig.INSTANCE;
                    if (StringsKt.isBlank(cloudFileConfig.getFileHost())) {
                        resourceUrl = amazonS3Client1CreateAmazonS3Client.getResourceUrl(this.$awsInfo.getAwsBucketName(), str);
                    } else {
                        resourceUrl = cloudFileConfig.getFileHost() + str;
                    }
                    Intrinsics.checkNotNullExpressionValue(resourceUrl, "if (CloudFileConfig.file…leName)\n                }");
                    inputStreamOpenInputStream.close();
                    return resourceUrl;
                } catch (Exception e) {
                    e.printStackTrace();
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                    return "";
                }
            } catch (Throwable th) {
                if (inputStreamOpenInputStream != null) {
                    inputStreamOpenInputStream.close();
                }
                throw th;
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awsUpload(UploadRequest uploadRequest, Continuation<? super String> continuation) {
        CloudFileUploadInfo cloudFileUploadInfo = uploadRequest.getCloudFileUploadInfo();
        Intrinsics.checkNotNull(cloudFileUploadInfo, "null cannot be cast to non-null type com.yalla.support.cloudfilemanager.CloudFileUploadInfo.AWSUploadInfo");
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(uploadRequest, (CloudFileUploadInfo.AWSUploadInfo) cloudFileUploadInfo, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AmazonS3Client1 createAmazonS3Client(CloudFileUploadInfo.AWSUploadInfo awsInfo) {
        o00O000 o00o001 = o00O000.f34346OooO00o;
        Context contextOooO00o = o00O000.OooO00o();
        AWSYallaIdentityProvider aWSYallaIdentityProvider = new AWSYallaIdentityProvider(awsInfo.getAwsIdentityPoolId(), awsInfo.getAwsRegion());
        aWSYallaIdentityProvider.setAwsIdentityId(awsInfo.getAwsIdentityId());
        aWSYallaIdentityProvider.setAwsProviderName(awsInfo.getAwsProviderName());
        aWSYallaIdentityProvider.setAwsToken(awsInfo.getAwsToken());
        return new AmazonS3Client1(new CognitoCachingCredentialsProvider(contextOooO00o, aWSYallaIdentityProvider, Regions.OooO00o(awsInfo.getAwsRegion())), RegionUtils.OooO00o(awsInfo.getAwsRegion()));
    }

    @Override // com.yalla.support.cloudfilemanager.uploader.CloudFileUploader
    @Nullable
    public Object uploadFile(@NotNull UploadRequest uploadRequest, @NotNull Continuation<? super String> continuation) {
        return awsUpload(uploadRequest, continuation);
    }
}
