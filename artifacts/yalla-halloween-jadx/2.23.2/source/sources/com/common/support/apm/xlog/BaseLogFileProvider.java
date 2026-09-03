package com.common.support.apm.xlog;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/common/support/apm/xlog/BaseLogFileProvider;", "Lcom/common/support/apm/xlog/LogFileProvider;", "logs", "Ljava/io/File;", "(Ljava/io/File;)V", "queryAllLogFiles", "", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseLogFileProvider implements LogFileProvider {

    @NotNull
    private final File logs;

    public BaseLogFileProvider(@NotNull File logs) {
        Intrinsics.checkNotNullParameter(logs, "logs");
        this.logs = logs;
    }

    @Override // com.common.support.apm.xlog.LogFileProvider
    @NotNull
    public List<File> queryAllLogFiles() {
        if (!this.logs.exists() || this.logs.isFile() || !this.logs.canRead()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = this.logs.listFiles();
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            int i = 0;
            while (i < length) {
                File it = fileArrListFiles[i];
                i++;
                if (it.isFile() && it.length() > 0) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    if (isLogFile(it)) {
                        arrayList.add(it);
                    }
                }
            }
        }
        return arrayList;
    }
}
