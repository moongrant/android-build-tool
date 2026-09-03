package com.common.support.apm.utils;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"ONE_DAY_MS", "", "deleteExpiredFiles", "", "directory", "Ljava/io/File;", "expiredDays", "", "directoryPath", "", "deleteOnlyFiles", "dirFile", "sailfish_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class FileUtilKt {
    private static final long ONE_DAY_MS = 86400000;

    public static final void deleteExpiredFiles(@NotNull String directoryPath, int i) {
        Intrinsics.checkNotNullParameter(directoryPath, "directoryPath");
        if (directoryPath.length() == 0) {
            return;
        }
        File file = new File(directoryPath);
        if (file.exists() && file.isDirectory()) {
            deleteExpiredFiles(file, i);
        }
    }

    public static /* synthetic */ void deleteExpiredFiles$default(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 15;
        }
        deleteExpiredFiles(str, i);
    }

    public static final void deleteOnlyFiles(@NotNull File dirFile) {
        Intrinsics.checkNotNullParameter(dirFile, "dirFile");
        if (dirFile.exists()) {
            if (dirFile.isFile()) {
                dirFile.delete();
                return;
            }
            File[] fileArrListFiles = dirFile.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            int length = fileArrListFiles.length;
            int i = 0;
            while (i < length) {
                File it = fileArrListFiles[i];
                i++;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                deleteOnlyFiles(it);
            }
        }
    }

    public static /* synthetic */ void deleteExpiredFiles$default(File file, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 15;
        }
        deleteExpiredFiles(file, i);
    }

    public static final void deleteExpiredFiles(@NotNull File directory, int i) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        if (directory.isDirectory()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - (((long) i) * ONE_DAY_MS);
            File[] fileArrListFiles = directory.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            int length = fileArrListFiles.length;
            int i2 = 0;
            while (i2 < length) {
                File it = fileArrListFiles[i2];
                i2++;
                if (!it.isFile()) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    deleteExpiredFiles(it, i);
                } else if (jCurrentTimeMillis > it.lastModified()) {
                    it.delete();
                }
            }
        }
    }
}
