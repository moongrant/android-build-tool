package oo00oO;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.getkeepsafe.relinker.MissingLibraryException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipFile;
import p031OoooO0.o0OoOo0;
import p177o00o00.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f60872OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f60873OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f60874OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f60875OooO0Oo;

    public OooO() {
        OooOO0 oooOO1 = new OooOO0();
        OooO00o oooO00o = new OooO00o();
        this.f60872OooO00o = new HashSet();
        this.f60873OooO0O0 = oooOO1;
        this.f60874OooO0OO = oooO00o;
    }

    public static void OooO0Oo(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public final File OooO00o(Context context, String str, String str2) {
        String strOooO00o = ((OooOO0) this.f60873OooO0O0).OooO00o(str);
        return str2 == null || str2.length() == 0 ? new File(context.getDir("lib", 0), strOooO00o) : new File(context.getDir("lib", 0), o0OoOo0.OooO00o(strOooO00o, ".", str2));
    }

    public final void OooO0O0(Context context, String str) throws Throwable {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        OooO0Oo("Beginning load of %s...", str);
        OooO0OO(context, str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.File] */
    public final void OooO0OO(Context context, String str, String str2) throws Throwable {
        o0O0O00 o0o0o00;
        OooO00o.C0520OooO00o c0520OooO00o;
        String[] strArrOooO0OO;
        InputStream inputStream;
        ?? r10;
        ?? r14;
        OooO0OO oooO0OO = this.f60873OooO0O0;
        HashSet hashSet = this.f60872OooO00o;
        int i = 1;
        boolean z = false;
        if (hashSet.contains(str)) {
            OooO0Oo("%s already loaded previously!", str);
            return;
        }
        try {
            ((OooOO0) oooO0OO).getClass();
            System.loadLibrary(str);
            hashSet.add(str);
            OooO0Oo("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e) {
            OooO0Oo("Loading the library normally failed: %s", Log.getStackTraceString(e));
            OooO0Oo("%s (%s) was not loaded normally, re-linking...", str, str2);
            ?? OooO00o2 = OooO00o(context, str, str2);
            if (!OooO00o2.exists()) {
                File dir = context.getDir("lib", 0);
                File fileOooO00o = OooO00o(context, str, str2);
                OooOO0 oooOO1 = (OooOO0) oooO0OO;
                File[] fileArrListFiles = dir.listFiles(new OooO0o(oooOO1.OooO00o(str)));
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (!file.getAbsolutePath().equals(fileOooO00o.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                oooOO1.getClass();
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr.length <= 0) {
                    String str3 = Build.CPU_ABI2;
                    strArr = !(str3 == null || str3.length() == 0) ? new String[]{Build.CPU_ABI, str3} : new String[]{Build.CPU_ABI};
                }
                String[] strArr2 = strArr;
                String strOooO00o = oooOO1.OooO00o(str);
                ((OooO00o) this.f60874OooO0OO).getClass();
                try {
                    OooO00o.C0520OooO00o c0520OooO00oOooO0O0 = OooO00o.OooO0O0(context, strArr2, strOooO00o, this);
                    try {
                        if (c0520OooO00oOooO0O0 == null) {
                            try {
                                strArrOooO0OO = OooO00o.OooO0OO(context, strOooO00o);
                            } catch (Exception e2) {
                                strArrOooO0OO = new String[]{e2.toString()};
                            }
                            throw new MissingLibraryException(strOooO00o, strArr2, strArrOooO0OO);
                        }
                        int i2 = 0;
                        while (true) {
                            int i3 = i2 + 1;
                            ZipFile zipFile = c0520OooO00oOooO0O0.f60876OooO00o;
                            if (i2 < 5) {
                                Object[] objArr = new Object[i];
                                objArr[z ? 1 : 0] = strOooO00o;
                                OooO0Oo("Found %s! Extracting...", objArr);
                                try {
                                    if (OooO00o2.exists() || OooO00o2.createNewFile()) {
                                        try {
                                            inputStream = zipFile.getInputStream(c0520OooO00oOooO0O0.f60877OooO0O0);
                                            try {
                                                ?? fileOutputStream = new FileOutputStream((File) OooO00o2);
                                                try {
                                                    try {
                                                        byte[] bArr = new byte[4096];
                                                        long j = 0;
                                                        ?? r7 = z;
                                                        while (true) {
                                                            int i4 = inputStream.read(bArr);
                                                            if (i4 == -1) {
                                                                break;
                                                            }
                                                            fileOutputStream.write(bArr, r7, i4);
                                                            j += (long) i4;
                                                            i3 = i3;
                                                            r7 = 0;
                                                        }
                                                        fileOutputStream.flush();
                                                        fileOutputStream.getFD().sync();
                                                        if (j == OooO00o2.length()) {
                                                            OooO00o.OooO00o(inputStream);
                                                            OooO00o.OooO00o(fileOutputStream);
                                                            OooO00o2.setReadable(true, r7);
                                                            OooO00o2.setExecutable(true, r7);
                                                            OooO00o2.setWritable(true);
                                                        }
                                                    } catch (FileNotFoundException | IOException unused) {
                                                    }
                                                    i3 = i3;
                                                    r14 = fileOutputStream;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    r10 = fileOutputStream;
                                                    OooO00o.OooO00o(inputStream);
                                                    OooO00o.OooO00o(r10);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException | IOException unused2) {
                                                i3 = i3;
                                                r14 = 0;
                                                OooO00o.OooO00o(inputStream);
                                                OooO00o.OooO00o(r14);
                                                i2 = i3;
                                                i = 1;
                                                z = false;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r10 = 0;
                                                OooO00o.OooO00o(inputStream);
                                                OooO00o.OooO00o(r10);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused3) {
                                            inputStream = null;
                                            r14 = 0;
                                            OooO00o.OooO00o(inputStream);
                                            OooO00o.OooO00o(r14);
                                            i2 = i3;
                                            i = 1;
                                            z = false;
                                        } catch (IOException unused4) {
                                            inputStream = null;
                                            r14 = 0;
                                            OooO00o.OooO00o(inputStream);
                                            OooO00o.OooO00o(r14);
                                            i2 = i3;
                                            i = 1;
                                            z = false;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            inputStream = null;
                                        }
                                        OooO00o.OooO00o(inputStream);
                                        OooO00o.OooO00o(r14);
                                    } else {
                                        i3 = i3;
                                    }
                                } catch (IOException unused5) {
                                }
                                i2 = i3;
                                i = 1;
                                z = false;
                            } else if (zipFile != null) {
                            }
                            try {
                                zipFile.close();
                            } catch (IOException unused6) {
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c0520OooO00o = c0520OooO00oOooO0O0;
                        if (c0520OooO00o != null) {
                            try {
                                ZipFile zipFile2 = c0520OooO00o.f60876OooO00o;
                                if (zipFile2 != null) {
                                    zipFile2.close();
                                }
                            } catch (IOException unused7) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c0520OooO00o = null;
                }
            }
            try {
                if (this.f60875OooO0Oo) {
                    try {
                        o0O0O00 o0o0o01 = new o0O0O00(OooO00o2);
                        try {
                            List<String> listOooO00o = o0o0o01.OooO00o();
                            o0o0o01.close();
                            for (String str4 : listOooO00o) {
                                ((OooOO0) oooO0OO).getClass();
                                OooO0O0(context, str4.substring(3, str4.length() - 3));
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            o0o0o00 = o0o0o01;
                            o0o0o00.close();
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        o0o0o00 = null;
                    }
                }
            } catch (IOException unused8) {
            }
            String absolutePath = OooO00o2.getAbsolutePath();
            ((OooOO0) oooO0OO).getClass();
            System.load(absolutePath);
            hashSet.add(str);
            OooO0Oo("%s (%s) was re-linked!", str, str2);
        }
    }
}
