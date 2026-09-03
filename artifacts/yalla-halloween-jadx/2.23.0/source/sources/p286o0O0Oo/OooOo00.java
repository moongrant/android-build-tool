package p286o0O0Oo;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f42241OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final File f42242OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final File f42243OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final File f42244OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final File f42245OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final File f42246OooO0o0;

    public OooOo00(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f42241OooO00o = filesDir;
        if (Build.VERSION.SDK_INT >= 28) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + Application.getProcessName().replaceAll("[^a-zA-Z0-9.]", "_");
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        OooO0OO(file);
        this.f42242OooO0O0 = file;
        File file2 = new File(file, "open-sessions");
        OooO0OO(file2);
        this.f42243OooO0OO = file2;
        File file3 = new File(file, "reports");
        OooO0OO(file3);
        this.f42244OooO0Oo = file3;
        File file4 = new File(file, "priority-reports");
        OooO0OO(file4);
        this.f42246OooO0o0 = file4;
        File file5 = new File(file, "native-reports");
        OooO0OO(file5);
        this.f42245OooO0o = file5;
    }

    public static void OooO00o(File file) {
        if (file.exists() && OooO0Oo(file)) {
            String str = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    public static synchronized void OooO0OO(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
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
    }

    public static boolean OooO0Oo(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                OooO0Oo(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> OooO0o0(@Nullable T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public final File OooO0O0(String str, String str2) {
        File file = new File(this.f42243OooO0OO, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
