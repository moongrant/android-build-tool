package p421o0OoO000;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class OooOO0O {
    public static void OooO00o(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        OooO00o(file2);
                    }
                    file2.delete();
                }
            }
            file.delete();
        }
    }
}
