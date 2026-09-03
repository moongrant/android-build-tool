package oo00oO;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements OooO0O0 {

    /* JADX INFO: renamed from: oo00oO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0520OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ZipFile f60876OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ZipEntry f60877OooO0O0;

        public C0520OooO00o(ZipFile zipFile, ZipEntry zipEntry) {
            this.f60876OooO00o = zipFile;
            this.f60877OooO0O0 = zipEntry;
        }
    }

    public static void OooO00o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static C0520OooO00o OooO0O0(Context context, String[] strArr, String str, OooO oooO) {
        String[] strArrOooO0Oo = OooO0Oo(context);
        int length = strArrOooO0Oo.length;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = strArrOooO0Oo[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 >= 5) {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                            break;
                        }
                    }
                    for (String str3 : strArr) {
                        String str4 = "lib" + File.separatorChar + str3 + File.separatorChar + str;
                        oooO.getClass();
                        OooO.OooO0Oo("Looking for %s in APK %s...", str4, str2);
                        ZipEntry entry = zipFile.getEntry(str4);
                        if (entry != null) {
                            return new C0520OooO00o(zipFile, entry);
                        }
                    }
                    i4 = i5;
                }
            }
            i++;
        }
    }

    public static String[] OooO0OO(Context context, String str) {
        Pattern patternCompile = Pattern.compile("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        for (String str2 : OooO0Oo(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] OooO0Oo(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}
