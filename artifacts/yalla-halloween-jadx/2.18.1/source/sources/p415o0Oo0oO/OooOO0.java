package p415o0Oo0oO;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f39561OooO00o = new OooO00o();

    public static class OooO00o implements OooOO0 {
        public final void OooO00o(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }

        public final void OooO0O0(File file) throws IOException {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new IOException("not a readable directory: " + file);
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    OooO0O0(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete " + file2);
                }
            }
        }

        public final void OooO0OO(File file, File file2) throws IOException {
            OooO00o(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }
    }
}
