package com.yalla.yalla.common.repository;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.model.ChangeUrlModel;
import com.facebook.share.internal.ShareInternalUtility;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.support.cloudfilemanager.CloudFileManager;
import com.yalla.yalla.common.manager.cloud_file.CloudFile;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.UploadFileResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p498o0o00Oo0.o00O00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class CloudFileRepo extends o00O00O {

    @DebugMetadata(c = "com.yalla.yalla.common.repository.CloudFileRepo", f = "CloudFileRepo.kt", i = {}, l = {58}, m = "loadVoiceUrl", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20693Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20695Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20693Oooo0o = obj;
            this.f20695Oooo0oo |= Integer.MIN_VALUE;
            return CloudFileRepo.this.OooO0o0(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.CloudFileRepo", f = "CloudFileRepo.kt", i = {0}, l = {35}, m = "uploadFileResult", n = {ShareInternalUtility.STAGING_PARAM}, s = {"L$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f20696Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public List f20697Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f20698Oooo0oO;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20698Oooo0oO = obj;
            this.f20696Oooo |= Integer.MIN_VALUE;
            return CloudFileRepo.this.OooO(null, null, null, false, this);
        }
    }

    public static Object OooO0o(CloudFileRepo cloudFileRepo, CloudFileType cloudFileType, Uri uri, Continuation continuation) {
        Objects.requireNonNull(cloudFileRepo);
        return CloudFile.INSTANCE.getManager().uploadFile(cloudFileType, uri, (Long) null, false, (Continuation<? super CloudFileInfo>) continuation);
    }

    public static Object OooO0oO(CloudFileRepo cloudFileRepo, CloudFileType cloudFileType, File file, Continuation continuation) {
        Objects.requireNonNull(cloudFileRepo);
        return CloudFile.INSTANCE.getManager().uploadFile(cloudFileType, file, (Long) null, false, (Continuation<? super CloudFileInfo>) continuation);
    }

    public static Object OooO0oo(CloudFileRepo cloudFileRepo, CloudFileType cloudFileType, List list, Continuation continuation) {
        Objects.requireNonNull(cloudFileRepo);
        return CloudFile.INSTANCE.getManager().uploadFile(cloudFileType, (List<? extends Uri>) list, (Long) null, false, (Continuation<? super List<CloudFileInfo>>) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO(@NotNull CloudFileType cloudFileType, @NotNull List<? extends Uri> list, @Nullable Long l, boolean z, @NotNull Continuation<? super List<UploadFileResult>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f20696Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f20696Oooo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        OooO0O0 oooO0O1 = oooO0O0;
        Object objUploadFile = oooO0O1.f20698Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O1.f20696Oooo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUploadFile);
            CloudFileManager<CloudFileType> manager = CloudFile.INSTANCE.getManager();
            oooO0O1.f20697Oooo0o = list;
            oooO0O1.f20696Oooo = 1;
            objUploadFile = manager.uploadFile(cloudFileType, list, l, z, oooO0O1);
            if (objUploadFile == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = oooO0O1.f20697Oooo0o;
            ResultKt.throwOnFailure(objUploadFile);
        }
        List list2 = (List) objUploadFile;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : list2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CloudFileInfo cloudFileInfo = (CloudFileInfo) obj;
            if (list.size() > i3) {
                arrayList.add(new UploadFileResult(list.get(i3), cloudFileInfo));
            }
            i3 = i4;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o0(@NotNull String str, @NotNull Continuation<? super String> continuation) throws Throwable {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f20695Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f20695Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objWithContext = oooO00o.f20693Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f20695Oooo0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            CloudFileRepo$loadVoiceUrl$$inlined$call$1 cloudFileRepo$loadVoiceUrl$$inlined$call$1 = new CloudFileRepo$loadVoiceUrl$$inlined$call$1(this, null, str);
            oooO00o.f20695Oooo0oo = 1;
            objWithContext = BuildersKt.withContext(io2, cloudFileRepo$loadVoiceUrl$$inlined$call$1, oooO00o);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        ChangeUrlModel changeUrlModel = (ChangeUrlModel) ((Response) objWithContext).getData();
        if (changeUrlModel != null) {
            return changeUrlModel.getVoiceurl();
        }
        return null;
    }
}
