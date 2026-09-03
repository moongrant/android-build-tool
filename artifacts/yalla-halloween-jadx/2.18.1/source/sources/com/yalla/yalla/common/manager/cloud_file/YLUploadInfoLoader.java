package com.yalla.yalla.common.manager.cloud_file;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.interfaceType.FeedbackType;
import com.common.support.apollo.Apollo;
import com.yalla.support.cloudfilemanager.CloudFileUploadInfo;
import com.yalla.support.cloudfilemanager.UploadInfoLoader;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.UploadTokenModel;
import com.yalla.yalla.common.repository.CloudFileRepo;
import com.yalla.yalla.common.repository.CloudFileRepo$loadToken$$inlined$call$1;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.OooOOOO;
import p254o00ooO0O.o000Oo0;
import p487o0o000oO.o0OOO0o;
import p516o0o0O000.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J%\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/common/manager/cloud_file/YLUploadInfoLoader;", "Lcom/yalla/support/cloudfilemanager/UploadInfoLoader;", "Lcom/yalla/yalla/common/manager/cloud_file/CloudFileType;", "()V", "cloudFileInfoRepo", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "getUploadInfo", "Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo;", "fileType", "sourceId", "", "(Lcom/yalla/yalla/common/manager/cloud_file/CloudFileType;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class YLUploadInfoLoader implements UploadInfoLoader<CloudFileType> {
    public static final int $stable = 0;

    @NotNull
    private final CloudFileRepo cloudFileInfoRepo = new CloudFileRepo();

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.cloud_file.YLUploadInfoLoader$getUploadInfo$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.common.manager.cloud_file.YLUploadInfoLoader", f = "YLUploadInfoLoader.kt", i = {}, l = {15}, m = "getUploadInfo", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return YLUploadInfoLoader.this.getUploadInfo2((CloudFileType) null, (Long) null, (Continuation<? super CloudFileUploadInfo>) this);
        }
    }

    @Override // com.yalla.support.cloudfilemanager.UploadInfoLoader
    public /* bridge */ /* synthetic */ Object getUploadInfo(CloudFileType cloudFileType, Long l, Continuation continuation) {
        return getUploadInfo2(cloudFileType, l, (Continuation<? super CloudFileUploadInfo>) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    /* JADX INFO: renamed from: getUploadInfo, reason: avoid collision after fix types in other method */
    public Object getUploadInfo2(@NotNull CloudFileType cloudFileType, @Nullable Long l, @NotNull Continuation<? super CloudFileUploadInfo> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        UploadTokenModel uploadTokenModel;
        CloudFileUploadInfo aWSUploadInfo;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objWithContext = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CloudFileRepo cloudFileRepo = this.cloudFileInfoRepo;
            anonymousClass1.label = 1;
            Objects.requireNonNull(cloudFileRepo);
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new CloudFileRepo$loadToken$$inlined$call$1(cloudFileRepo, null, cloudFileType, l), anonymousClass1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Response response = (Response) objWithContext;
        if (!response.getIsSuccess() || (uploadTokenModel = (UploadTokenModel) response.getData()) == null) {
            return null;
        }
        String strRemoveSuffix = StringsKt__StringsJVMKt.endsWith$default(uploadTokenModel.getFileName(), "/", false, 2, null) ? StringsKt.removeSuffix(uploadTokenModel.getFileName(), (CharSequence) "/") : uploadTokenModel.getFileName();
        String upAK = uploadTokenModel.getUpAK();
        String strQ = Apollo.f12658OooO00o.q("K2");
        if (StringsKt.isBlank(strQ)) {
            if (!o0OOO0o.OooO0OO()) {
                throw new NullPointerException("Apollo not init");
            }
            System.exit(1);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
        String token = OooOOOO.OooO0O0(o000000O.OooO0O0(upAK, strQ), uploadTokenModel.getUpToken());
        String upType = uploadTokenModel.getUpType();
        if (Intrinsics.areEqual(upType, "1")) {
            Intrinsics.checkNotNullExpressionValue(token, "token");
            aWSUploadInfo = new CloudFileUploadInfo.QiNiuUploadInfo(strRemoveSuffix, token);
        } else if (Intrinsics.areEqual(upType, FeedbackType.Suggestions)) {
            String bucket = uploadTokenModel.getBucket();
            String providerName = uploadTokenModel.getProviderName();
            String identityId = uploadTokenModel.getIdentityId();
            String str = uploadTokenModel.getRegion() + ':' + uploadTokenModel.getPoolId();
            String region = uploadTokenModel.getRegion();
            Intrinsics.checkNotNullExpressionValue(token, "token");
            aWSUploadInfo = new CloudFileUploadInfo.AWSUploadInfo(strRemoveSuffix, bucket, providerName, identityId, str, region, token);
        } else {
            aWSUploadInfo = null;
        }
        if (aWSUploadInfo == null) {
            return null;
        }
        aWSUploadInfo.setUploadType(o000Oo0.OooO0OO(uploadTokenModel.getUpToken(), 0));
        return aWSUploadInfo;
    }
}
