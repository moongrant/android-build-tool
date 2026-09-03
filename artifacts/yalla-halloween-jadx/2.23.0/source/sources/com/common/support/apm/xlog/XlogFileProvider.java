package com.common.support.apm.xlog;

import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bJ\u0014\u0010\f\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bJ\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/common/support/apm/xlog/XlogFileProvider;", "Lcom/common/support/apm/xlog/BaseLogFileProvider;", "logs", "Ljava/io/File;", "(Ljava/io/File;)V", "logFileSuffix", "", "uploadedDir", "allFilesAddUploadedTag", "", "files", "", "deleteAllFiles", "fileAddUploadedTag", ShareInternalUtility.STAGING_PARAM, "isLogFile", "", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class XlogFileProvider extends BaseLogFileProvider {

    @NotNull
    private final String logFileSuffix;

    @NotNull
    private final File uploadedDir;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XlogFileProvider(@NotNull File logs) {
        super(logs);
        Intrinsics.checkNotNullParameter(logs, "logs");
        this.logFileSuffix = ".xlog";
        File file = new File(XlogWriter.INSTANCE.getLogCacheDir$sailfish_release());
        this.uploadedDir = file;
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    private final void fileAddUploadedTag(File file) {
        File file2 = new File(this.uploadedDir.getAbsolutePath() + ((Object) File.separator) + ((Object) file.getName()) + '_' + System.currentTimeMillis());
        if (file2.exists()) {
            file2.delete();
        }
        file.renameTo(file2);
    }

    public final void allFilesAddUploadedTag(@NotNull List<? extends File> files) {
        Intrinsics.checkNotNullParameter(files, "files");
        Iterator<T> it = files.iterator();
        while (it.hasNext()) {
            fileAddUploadedTag((File) it.next());
        }
    }

    public final void deleteAllFiles(@NotNull List<? extends File> files) {
        Intrinsics.checkNotNullParameter(files, "files");
        for (File file : files) {
            if (!file.delete()) {
                fileAddUploadedTag(file);
            }
        }
    }

    @Override // com.common.support.apm.xlog.LogFileProvider
    public boolean isLogFile(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String namePrefix = XlogWriter.INSTANCE.getFileLogConfig$sailfish_release().getNamePrefix();
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        if (StringsKt.Oooo00o(name, namePrefix)) {
            String name2 = file.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "file.name");
            if (StringsKt.OooOO0O(name2, this.logFileSuffix)) {
                return true;
            }
        }
        return false;
    }
}
