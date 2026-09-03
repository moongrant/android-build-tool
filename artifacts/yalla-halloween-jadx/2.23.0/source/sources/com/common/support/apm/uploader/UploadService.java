package com.common.support.apm.uploader;

import com.common.support.apm.sailfishhttp.BaseServerResponse;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/common/support/apm/uploader/UploadService;", "", "Lo0ooO0oO/o00OOOO0;", "okHttpClient", "", "defaultDomain", RemoteConfigConstants$RequestFieldKey.APP_ID, "appNameSpace", "", "init", "Ljava/io/File;", ShareInternalUtility.STAGING_PARAM, "filedMD5", "Lcom/common/support/apm/sailfishhttp/BaseServerResponse;", "uploadFileLog", "Lcom/common/support/apm/uploader/UploadApi;", "uploadApi", "Lcom/common/support/apm/uploader/UploadApi;", "<init>", "()V", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class UploadService {

    @NotNull
    public static final UploadService INSTANCE = new UploadService();
    private static UploadApi uploadApi;

    private UploadService() {
    }

    public final void init(@NotNull o00OOOO0 okHttpClient, @NotNull String defaultDomain, @NotNull String appId, @NotNull String appNameSpace) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(defaultDomain, "defaultDomain");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appNameSpace, "appNameSpace");
        uploadApi = new UploadApi(okHttpClient, defaultDomain, appId, appNameSpace);
    }

    @Nullable
    public final BaseServerResponse<Unit> uploadFileLog(@NotNull File file, @NotNull String filedMD5) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(filedMD5, "filedMD5");
        UploadApi uploadApi2 = uploadApi;
        if (uploadApi2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadApi");
            uploadApi2 = null;
        }
        return uploadApi2.uploadFileLog(file, filedMD5);
    }
}
