package com.common.support.apm.xlog;

import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&¨\u0006\b"}, d2 = {"Lcom/common/support/apm/xlog/LogFileProvider;", "", "isLogFile", "", ShareInternalUtility.STAGING_PARAM, "Ljava/io/File;", "queryAllLogFiles", "", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface LogFileProvider {
    boolean isLogFile(@NotNull File file);

    @NotNull
    List<File> queryAllLogFiles();
}
