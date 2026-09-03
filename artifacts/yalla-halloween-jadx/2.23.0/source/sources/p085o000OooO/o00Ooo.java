package p085o000OooO;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.util.HashMap;
import p084o000Ooo0.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f35149OooO00o = o000oOoO.OooO0o0("WrkDbPathHelper");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f35150OooO0O0 = {"-journal", "-shm", "-wal"};

    public static void OooO00o(@NonNull Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            String str = f35149OooO00o;
            o000oOoO.OooO0OO().OooO00o(str, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap map = new HashMap();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            map.put(databasePath, file);
            for (String str2 : f35150OooO0O0) {
                map.put(new File(databasePath.getPath() + str2), new File(file.getPath() + str2));
            }
            for (File file2 : map.keySet()) {
                File file3 = (File) map.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        o000oOoO.OooO0OO().OooO0o(str, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                    }
                    o000oOoO.OooO0OO().OooO00o(str, file2.renameTo(file3) ? String.format("Migrated %s to %s", file2, file3) : String.format("Renaming %s to %s failed", file2, file3), new Throwable[0]);
                }
            }
        }
    }
}
