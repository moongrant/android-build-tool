package o0OOo000;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f38616OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final File f38617OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final File f38618OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final File f38619OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final File f38620OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final File f38621OooO0o0;

    public OooOO0(Context context) {
        String string;
        File filesDir = context.getFilesDir();
        this.f38616OooO00o = filesDir;
        if (Build.VERSION.SDK_INT >= 28) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(".com.google.firebase.crashlytics.files.v2");
            sbOooO0o0.append(File.pathSeparator);
            sbOooO0o0.append(Application.getProcessName().replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sbOooO0o0.toString();
        } else {
            string = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, string);
        OooO0oo(file);
        this.f38617OooO0O0 = file;
        File file2 = new File(file, "open-sessions");
        OooO0oo(file2);
        this.f38618OooO0OO = file2;
        File file3 = new File(file, "reports");
        OooO0oo(file3);
        this.f38619OooO0Oo = file3;
        File file4 = new File(file, "priority-reports");
        OooO0oo(file4);
        this.f38621OooO0o0 = file4;
        File file5 = new File(file, "native-reports");
        OooO0oo(file5);
        this.f38620OooO0o = file5;
    }

    public static boolean OooO(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                OooO(file2);
            }
        }
        return file.delete();
    }

    public static synchronized File OooO0oo(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            file.delete();
        }
        if (!file.mkdirs()) {
            Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
        }
        return file;
    }

    public static <T> List<T> OooOO0(@Nullable T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public final void OooO00o(File file) {
        if (file.exists() && OooO(file)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Deleted previous Crashlytics file system: ");
            sbOooO0o0.append(file.getPath());
            String string = sbOooO0o0.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string, null);
            }
        }
    }

    public final File OooO0O0(String str) {
        return new File(this.f38617OooO0O0, str);
    }

    public final List<File> OooO0OO() {
        return OooOO0(this.f38620OooO0o.listFiles());
    }

    public final List<File> OooO0Oo() {
        return OooOO0(this.f38621OooO0o0.listFiles());
    }

    public final File OooO0o(String str) {
        File file = new File(this.f38618OooO0OO, str);
        file.mkdirs();
        return file;
    }

    public final List<File> OooO0o0() {
        return OooOO0(this.f38619OooO0Oo.listFiles());
    }

    public final File OooO0oO(String str, String str2) {
        return new File(OooO0o(str), str2);
    }
}
