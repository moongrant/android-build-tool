package p107o000ooO0;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.util.HashMap;
import p102o000oo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f29968OooO00o = o0OoOo0.OooO0o0("WrkDbPathHelper");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f29969OooO0O0 = {"-journal", "-shm", "-wal"};

    public static void OooO00o(@NonNull Context context) {
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || !databasePath.exists()) {
            return;
        }
        o0OoOo0.OooO0OO().OooO00o(f29968OooO00o, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        HashMap map = new HashMap();
        if (i >= 23) {
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            File databasePath3 = i < 23 ? context.getDatabasePath("androidx.work.workdb") : new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            map.put(databasePath2, databasePath3);
            for (String str : f29969OooO0O0) {
                map.put(new File(databasePath2.getPath() + str), new File(databasePath3.getPath() + str));
            }
        }
        for (File file : map.keySet()) {
            File file2 = (File) map.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    o0OoOo0.OooO0OO().OooO0o(f29968OooO00o, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                o0OoOo0.OooO0OO().OooO00o(f29968OooO00o, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
            }
        }
    }
}
