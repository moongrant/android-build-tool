package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.io.ConstantsKt;
import o000O0Oo.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileInstaller {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f7432OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public static final OooO0O0 f7433OooO0O0 = new OooO0O0();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface DiagnosticCode {
    }

    public class OooO00o implements OooO0OO {
        @Override // androidx.profileinstaller.ProfileInstaller.OooO0OO
        public final void OooO00o() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.OooO0OO
        public final void OooO0O0(int i, @Nullable Object obj) {
        }
    }

    public class OooO0O0 implements OooO0OO {
        @Override // androidx.profileinstaller.ProfileInstaller.OooO0OO
        public final void OooO00o() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }

        @Override // androidx.profileinstaller.ProfileInstaller.OooO0OO
        public final void OooO0O0(int i, @Nullable Object obj) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    public interface OooO0OO {
        void OooO00o();

        void OooO0O0(int i, @Nullable Object obj);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ResultCode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void OooO00o(@NonNull PackageInfo packageInfo, @NonNull File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0189 A[Catch: all -> 0x019e, TRY_LEAVE, TryCatch #32 {all -> 0x019e, blocks: (B:100:0x017d, B:102:0x0189, B:105:0x0198, B:106:0x019d), top: B:267:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0198 A[Catch: all -> 0x019e, TRY_ENTER, TryCatch #32 {all -> 0x019e, blocks: (B:100:0x017d, B:102:0x0189, B:105:0x0198, B:106:0x019d), top: B:267:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x01ac A[Catch: IllegalStateException -> 0x01b0, IOException -> 0x01b8, FileNotFoundException -> 0x01be, TRY_LEAVE, TryCatch #29 {FileNotFoundException -> 0x01be, IOException -> 0x01b8, IllegalStateException -> 0x01b0, blocks: (B:98:0x0175, B:103:0x0193, B:116:0x01ac, B:114:0x01a9, B:113:0x01a6), top: B:272:0x0175 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e8 A[Catch: all -> 0x01fd, TRY_LEAVE, TryCatch #17 {all -> 0x01fd, blocks: (B:135:0x01dc, B:137:0x01e8, B:140:0x01f3), top: B:254:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:140:0x01f3 A[Catch: all -> 0x01fd, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x01fd, blocks: (B:135:0x01dc, B:137:0x01e8, B:140:0x01f3), top: B:254:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0217  */
    /* JADX WARN: Code duplicated, block: B:160:0x0221  */
    /* JADX WARN: Code duplicated, block: B:161:0x0224  */
    /* JADX WARN: Code duplicated, block: B:169:0x023e  */
    /* JADX WARN: Code duplicated, block: B:217:0x0291  */
    /* JADX WARN: Code duplicated, block: B:221:0x029a  */
    /* JADX WARN: Code duplicated, block: B:226:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:228:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:248:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0228 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00df  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0113 A[Catch: IllegalStateException -> 0x0128, all -> 0x012a, IOException -> 0x012c, TRY_LEAVE, TryCatch #12 {IOException -> 0x012c, blocks: (B:54:0x0109, B:56:0x0113, B:67:0x012e, B:68:0x0133), top: B:248:0x0109, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x012e A[Catch: IllegalStateException -> 0x0128, all -> 0x012a, IOException -> 0x012c, TRY_ENTER, TryCatch #12 {IOException -> 0x012c, blocks: (B:54:0x0109, B:56:0x0113, B:67:0x012e, B:68:0x0133), top: B:248:0x0109, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x015b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0172  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @WorkerThread
    public static void OooO0O0(@NonNull Context context, @NonNull Executor executor, @NonNull OooO0OO oooO0OO, boolean z) throws IOException {
        boolean z2;
        byte[] bArr;
        FileInputStream fileInputStreamOooO00o;
        int i;
        o000O0Oo.OooO0O0[] oooO0O0ArrOooO0oo;
        o000O0Oo.OooO0O0[] oooO0O0Arr;
        int i2;
        boolean z3;
        androidx.profileinstaller.OooO0O0 oooO0O0;
        FileInputStream fileInputStreamOooO00o2;
        OooO0OO oooO0OO2;
        o000O0Oo.OooO0O0[] oooO0O0Arr2;
        byte[] bArr2;
        ?? r4;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr3;
        int i3;
        ?? r5;
        boolean z4;
        ?? r6;
        byte[] bArr4;
        ByteArrayOutputStream byteArrayOutputStream;
        ?? r11;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j == packageInfo.lastUpdateTime;
                            if (z5) {
                                oooO0OO.OooO0O0(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    ProfileVerifier.OooO0OO(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i4 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            androidx.profileinstaller.OooO0O0 oooO0O1 = oooO0O0;
            androidx.profileinstaller.OooO0O0 oooO0O2 = new androidx.profileinstaller.OooO0O0(assets, executor, oooO0OO, name, file2);
            byte[] bArr5 = oooO0O1.f7425OooO0OO;
            if (bArr5 != null) {
                if (file2.canWrite()) {
                    oooO0O1.f7427OooO0o = true;
                    z2 = true;
                } else {
                    oooO0O1.OooO0O0(4, null);
                }
                if (z2) {
                    ?? r7 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?";
                    if (oooO0O1.f7427OooO0o) {
                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                    }
                    bArr = OooOOO0.f34846OooO00o;
                    if (bArr5 != null) {
                        try {
                            fileInputStreamOooO00o = oooO0O1.OooO00o(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e) {
                            oooO0OO.OooO0O0(6, e);
                            fileInputStreamOooO00o = null;
                        } catch (IOException e2) {
                            oooO0OO.OooO0O0(7, e2);
                            fileInputStreamOooO00o = null;
                        }
                        try {
                            if (fileInputStreamOooO00o != null) {
                                try {
                                    try {
                                        if (Arrays.equals(bArr, o000O0Oo.OooO0OO.OooO0O0(fileInputStreamOooO00o, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        oooO0O0ArrOooO0oo = OooOOO0.OooO0oo(fileInputStreamOooO00o, o000O0Oo.OooO0OO.OooO0O0(fileInputStreamOooO00o, 4), oooO0O1.f7428OooO0o0);
                                        try {
                                            fileInputStreamOooO00o.close();
                                        } catch (IOException e3) {
                                            oooO0OO.OooO0O0(7, e3);
                                        }
                                        oooO0O1.f7429OooO0oO = oooO0O0ArrOooO0oo;
                                    } catch (IOException e4) {
                                        i = 7;
                                        oooO0OO.OooO0O0(7, e4);
                                        try {
                                            fileInputStreamOooO00o.close();
                                        } catch (IOException e5) {
                                            oooO0OO.OooO0O0(i, e5);
                                        }
                                        oooO0O0ArrOooO0oo = null;
                                    }
                                } catch (IllegalStateException e6) {
                                    oooO0OO.OooO0O0(8, e6);
                                    i = 7;
                                    fileInputStreamOooO00o.close();
                                    oooO0O0ArrOooO0oo = null;
                                }
                            }
                            oooO0O0Arr = oooO0O1.f7429OooO0oO;
                            if (oooO0O0Arr != null) {
                                i2 = Build.VERSION.SDK_INT;
                                if (i2 >= 24 || i2 > 33) {
                                    z3 = false;
                                } else {
                                    if (i2 != 24 && i2 != 25) {
                                        switch (i2) {
                                            case 31:
                                            case 32:
                                            case 33:
                                                break;
                                            default:
                                                z3 = false;
                                                break;
                                        }
                                    }
                                    z3 = true;
                                }
                                if (z3) {
                                    try {
                                        fileInputStreamOooO00o2 = oooO0O1.OooO00o(assets, "dexopt/baseline.profm");
                                        if (fileInputStreamOooO00o2 == null) {
                                            try {
                                                if (Arrays.equals(OooOOO0.f34847OooO0O0, o000O0Oo.OooO0OO.OooO0O0(fileInputStreamOooO00o2, 4))) {
                                                    throw new IllegalStateException("Invalid magic");
                                                }
                                                oooO0O1.f7429OooO0oO = OooOOO0.OooO0o0(fileInputStreamOooO00o2, o000O0Oo.OooO0OO.OooO0O0(fileInputStreamOooO00o2, 4), bArr5, oooO0O0Arr);
                                                fileInputStreamOooO00o2.close();
                                                oooO0O0 = oooO0O1;
                                            } catch (Throwable th4) {
                                                try {
                                                    fileInputStreamOooO00o2.close();
                                                    throw th4;
                                                } catch (Throwable th5) {
                                                    th4.addSuppressed(th5);
                                                    throw th4;
                                                }
                                            }
                                        } else {
                                            if (fileInputStreamOooO00o2 != null) {
                                                fileInputStreamOooO00o2.close();
                                            }
                                            oooO0O0 = null;
                                        }
                                    } catch (FileNotFoundException e7) {
                                        oooO0OO.OooO0O0(9, e7);
                                    } catch (IOException e8) {
                                        oooO0OO.OooO0O0(7, e8);
                                    } catch (IllegalStateException e9) {
                                        oooO0O1.f7429OooO0oO = null;
                                        oooO0OO.OooO0O0(8, e9);
                                    }
                                    if (oooO0O0 != null) {
                                        oooO0O1 = oooO0O0;
                                    }
                                }
                            }
                        } catch (Throwable th6) {
                            try {
                                fileInputStreamOooO00o.close();
                                throw th6;
                            } catch (IOException e10) {
                                oooO0OO.OooO0O0(7, e10);
                                throw th6;
                            }
                        }
                    }
                    oooO0OO2 = oooO0O1.f7424OooO0O0;
                    oooO0O0Arr2 = oooO0O1.f7429OooO0oO;
                    if (oooO0O0Arr2 != null && (bArr4 = oooO0O1.f7425OooO0OO) != null) {
                        if (oooO0O1.f7427OooO0o) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr4);
                                if (OooOOO0.OooOO0(byteArrayOutputStream, bArr4, oooO0O0Arr2)) {
                                    oooO0O1.f7430OooO0oo = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    oooO0O1.f7429OooO0oO = null;
                                } else {
                                    oooO0OO2.OooO0O0(5, null);
                                    oooO0O1.f7429OooO0oO = null;
                                    byteArrayOutputStream.close();
                                }
                            } catch (Throwable th7) {
                                try {
                                    byteArrayOutputStream.close();
                                    throw th7;
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                    throw th7;
                                }
                            }
                        } catch (IOException e11) {
                            oooO0OO2.OooO0O0(7, e11);
                        } catch (IllegalStateException e12) {
                            oooO0OO2.OooO0O0(8, e12);
                        }
                    }
                    bArr2 = oooO0O1.f7430OooO0oo;
                    if (bArr2 == null) {
                        r6 = 1;
                    } else {
                        try {
                            if (oooO0O1.f7427OooO0o) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        fileOutputStream = new FileOutputStream(oooO0O1.f7426OooO0Oo);
                                        try {
                                            try {
                                                bArr3 = new byte[ConstantsKt.MINIMUM_BLOCK_SIZE];
                                                while (true) {
                                                    i3 = byteArrayInputStream.read(bArr3);
                                                    if (i3 > 0) {
                                                        try {
                                                            fileOutputStream.write(bArr3, 0, i3);
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th;
                                                            } catch (Throwable th10) {
                                                                th.addSuppressed(th10);
                                                                throw th;
                                                            }
                                                        }
                                                    } else {
                                                        r5 = 1;
                                                        try {
                                                            oooO0O1.OooO0O0(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            oooO0O1.f7430OooO0oo = null;
                                                            oooO0O1.f7429OooO0oO = null;
                                                            z4 = true;
                                                            if (z4) {
                                                                OooO00o(packageInfo, filesDir);
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                            th = th;
                                                            fileOutputStream.close();
                                                            throw th;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th12) {
                                                th = th12;
                                                Throwable th13 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th13;
                                                } catch (Throwable th14) {
                                                    th13.addSuppressed(th14);
                                                    throw th13;
                                                }
                                            }
                                        } catch (Throwable th15) {
                                            th = th15;
                                        }
                                    } catch (Throwable th16) {
                                        th = th16;
                                    }
                                } catch (FileNotFoundException e13) {
                                    e = e13;
                                    oooO0O1.OooO0O0(6, e);
                                    r4 = r7;
                                    oooO0O1.f7430OooO0oo = null;
                                    oooO0O1.f7429OooO0oO = null;
                                    r6 = r4;
                                    z4 = false;
                                    r5 = r6;
                                } catch (IOException e14) {
                                    e = e14;
                                    oooO0O1.OooO0O0(7, e);
                                    r4 = r7;
                                    oooO0O1.f7430OooO0oo = null;
                                    oooO0O1.f7429OooO0oO = null;
                                    r6 = r4;
                                    z4 = false;
                                    r5 = r6;
                                }
                            } catch (FileNotFoundException e15) {
                                e = e15;
                                r7 = 1;
                                oooO0O1.OooO0O0(6, e);
                                r4 = r7;
                                oooO0O1.f7430OooO0oo = null;
                                oooO0O1.f7429OooO0oO = null;
                                r6 = r4;
                                z4 = false;
                                r5 = r6;
                            } catch (IOException e16) {
                                e = e16;
                                r7 = 1;
                                oooO0O1.OooO0O0(7, e);
                                r4 = r7;
                                oooO0O1.f7430OooO0oo = null;
                                oooO0O1.f7429OooO0oO = null;
                                r6 = r4;
                                z4 = false;
                                r5 = r6;
                            }
                        } catch (Throwable th17) {
                            oooO0O1.f7430OooO0oo = null;
                            oooO0O1.f7429OooO0oO = null;
                            throw th17;
                        }
                    }
                    z4 = false;
                    r5 = r6;
                    if (z4) {
                        OooO00o(packageInfo, filesDir);
                    }
                } else {
                    r5 = 1;
                    z4 = false;
                }
                if (z4 || !z) {
                    r11 = 0;
                } else {
                    r11 = r5;
                }
                ProfileVerifier.OooO0OO(context, r11);
            }
            oooO0O1.OooO0O0(3, Integer.valueOf(i4));
            z2 = false;
            if (z2) {
                r5 = 1;
                z4 = false;
            } else {
                ?? r8 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?";
                if (oooO0O1.f7427OooO0o) {
                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                }
                bArr = OooOOO0.f34846OooO00o;
                if (bArr5 != null) {
                    fileInputStreamOooO00o = oooO0O1.OooO00o(assets, "dexopt/baseline.prof");
                    if (fileInputStreamOooO00o != null) {
                        if (Arrays.equals(bArr, o000O0Oo.OooO0OO.OooO0O0(fileInputStreamOooO00o, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        oooO0O0ArrOooO0oo = OooOOO0.OooO0oo(fileInputStreamOooO00o, o000O0Oo.OooO0OO.OooO0O0(fileInputStreamOooO00o, 4), oooO0O1.f7428OooO0o0);
                        fileInputStreamOooO00o.close();
                        oooO0O1.f7429OooO0oO = oooO0O0ArrOooO0oo;
                    }
                    oooO0O0Arr = oooO0O1.f7429OooO0oO;
                    if (oooO0O0Arr != null) {
                        i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 24) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            fileInputStreamOooO00o2 = oooO0O1.OooO00o(assets, "dexopt/baseline.profm");
                            if (fileInputStreamOooO00o2 == null) {
                                if (fileInputStreamOooO00o2 != null) {
                                    fileInputStreamOooO00o2.close();
                                }
                                oooO0O0 = null;
                            } else {
                                if (Arrays.equals(OooOOO0.f34847OooO0O0, o000O0Oo.OooO0OO.OooO0O0(fileInputStreamOooO00o2, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                oooO0O1.f7429OooO0oO = OooOOO0.OooO0o0(fileInputStreamOooO00o2, o000O0Oo.OooO0OO.OooO0O0(fileInputStreamOooO00o2, 4), bArr5, oooO0O0Arr);
                                fileInputStreamOooO00o2.close();
                                oooO0O0 = oooO0O1;
                            }
                            if (oooO0O0 != null) {
                                oooO0O1 = oooO0O0;
                            }
                        }
                    }
                }
                oooO0OO2 = oooO0O1.f7424OooO0O0;
                oooO0O0Arr2 = oooO0O1.f7429OooO0oO;
                if (oooO0O0Arr2 != null) {
                    if (oooO0O1.f7427OooO0o) {
                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                    }
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.write(bArr);
                    byteArrayOutputStream.write(bArr4);
                    if (OooOOO0.OooOO0(byteArrayOutputStream, bArr4, oooO0O0Arr2)) {
                        oooO0OO2.OooO0O0(5, null);
                        oooO0O1.f7429OooO0oO = null;
                        byteArrayOutputStream.close();
                    } else {
                        oooO0O1.f7430OooO0oo = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        oooO0O1.f7429OooO0oO = null;
                    }
                }
                bArr2 = oooO0O1.f7430OooO0oo;
                if (bArr2 == null) {
                    r6 = 1;
                } else {
                    if (oooO0O1.f7427OooO0o) {
                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                    }
                    byteArrayInputStream = new ByteArrayInputStream(bArr2);
                    fileOutputStream = new FileOutputStream(oooO0O1.f7426OooO0Oo);
                    bArr3 = new byte[ConstantsKt.MINIMUM_BLOCK_SIZE];
                    while (true) {
                        i3 = byteArrayInputStream.read(bArr3);
                        if (i3 > 0) {
                            fileOutputStream.write(bArr3, 0, i3);
                        } else {
                            r5 = 1;
                            oooO0O1.OooO0O0(1, null);
                            fileOutputStream.close();
                            byteArrayInputStream.close();
                            oooO0O1.f7430OooO0oo = null;
                            oooO0O1.f7429OooO0oO = null;
                            z4 = true;
                            if (z4) {
                                OooO00o(packageInfo, filesDir);
                            }
                        }
                    }
                }
                z4 = false;
                r5 = r6;
                if (z4) {
                    OooO00o(packageInfo, filesDir);
                }
            }
            if (z4) {
                r11 = 0;
            } else {
                r11 = 0;
            }
            ProfileVerifier.OooO0OO(context, r11);
        } catch (PackageManager.NameNotFoundException e17) {
            oooO0OO.OooO0O0(7, e17);
            ProfileVerifier.OooO0OO(context, false);
        }
    }
}
