package androidx.profileinstaller;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {
    public static boolean OooO00o(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = OooO00o(file2) && z;
        }
        return z;
    }
}
