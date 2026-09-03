package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
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
import java.util.concurrent.Executor;
import p088o000o00.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileInstaller {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f8837OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public static final OooO0O0 f8838OooO0O0 = new OooO0O0();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface DiagnosticCode {
    }

    public class OooO00o implements OooO0OO {
        @Override // androidx.profileinstaller.ProfileInstaller.OooO0OO
        public final void OooO00o(int i, @Nullable Object obj) {
        }
    }

    public class OooO0O0 implements OooO0OO {
        @Override // androidx.profileinstaller.ProfileInstaller.OooO0OO
        public final void OooO00o(int i, @Nullable Object obj) {
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
        void OooO00o(int i, @Nullable Object obj);
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

    public static void OooO0O0(@NonNull Executor executor, @NonNull final OooO0OO oooO0OO, final int i, @Nullable final Object obj) {
        executor.execute(new Runnable() { // from class: o000o00.OooOO0O
            @Override // java.lang.Runnable
            public final void run() {
                oooO0OO.OooO00o(i, obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:124:0x01bf A[Catch: all -> 0x01d5, TRY_LEAVE, TryCatch #22 {all -> 0x01d5, blocks: (B:122:0x01b1, B:124:0x01bf, B:127:0x01cb), top: B:219:0x01b1, outer: #28 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x01cb A[Catch: all -> 0x01d5, TRY_ENTER, TRY_LEAVE, TryCatch #22 {all -> 0x01d5, blocks: (B:122:0x01b1, B:124:0x01bf, B:127:0x01cb), top: B:219:0x01b1, outer: #28 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:153:0x020f A[Catch: all -> 0x0223, LOOP:0: B:151:0x0209->B:153:0x020f, LOOP_END, TryCatch #0 {all -> 0x0223, blocks: (B:150:0x0207, B:151:0x0209, B:153:0x020f, B:154:0x0214), top: B:194:0x0207, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x024d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0250  */
    /* JADX WARN: Code duplicated, block: B:227:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0214 A[EDGE_INSN: B:229:0x0214->B:154:0x0214 BREAK  A[LOOP:0: B:151:0x0209->B:153:0x020f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x0134  */
    /* JADX WARN: Code duplicated, block: B:83:0x0145  */
    @WorkerThread
    public static void OooO0OO(@NonNull Context context, @NonNull Executor executor, @NonNull OooO0OO oooO0OO, boolean z) {
        boolean z2;
        p088o000o00.OooO0OO[] oooO0OOArr;
        int i;
        boolean z3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        FileInputStream fileInputStreamCreateInputStream;
        AssetFileDescriptor assetFileDescriptorOpenFd2;
        FileInputStream fileInputStreamCreateInputStream2;
        p088o000o00.OooO0OO[] oooO0OOArr2;
        byte[] bArr;
        byte[] bArr2;
        boolean z4;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        byte[] bArr3;
        int i2;
        ByteArrayOutputStream byteArrayOutputStream;
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
                                oooO0OO.OooO00o(2, null);
                            }
                        } catch (Throwable th) {
                            try {
                                dataInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (IOException unused) {
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Skipping profile installation for ");
                    sbOooO0O0.append(context.getPackageName());
                    Log.d("ProfileInstaller", sbOooO0O0.toString());
                    return;
                }
            }
            StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("Installing profile for ");
            sbOooO0O1.append(context.getPackageName());
            Log.d("ProfileInstaller", sbOooO0O1.toString());
            int i3 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            androidx.profileinstaller.OooO00o oooO00o = new androidx.profileinstaller.OooO00o(assets, executor, oooO0OO, name, file2);
            if (oooO00o.f8831OooO0Oo != null) {
                if (file2.canWrite()) {
                    oooO00o.f8832OooO0o = true;
                    z2 = true;
                } else {
                    oooO00o.OooO0O0(4, null);
                }
                if (z2) {
                    oooO00o.OooO00o();
                    if (oooO00o.f8831OooO0Oo != null) {
                        try {
                            assetFileDescriptorOpenFd2 = assets.openFd("dexopt/baseline.prof");
                            try {
                                fileInputStreamCreateInputStream2 = assetFileDescriptorOpenFd2.createInputStream();
                                try {
                                    oooO00o.f8834OooO0oO = OooOOOO.OooOO0(fileInputStreamCreateInputStream2, OooOOOO.OooO0o(fileInputStreamCreateInputStream2, OooOOOO.f28624OooO00o), name);
                                    fileInputStreamCreateInputStream2.close();
                                    assetFileDescriptorOpenFd2.close();
                                } catch (Throwable th3) {
                                    if (fileInputStreamCreateInputStream2 == null) {
                                        throw th3;
                                    }
                                    try {
                                        fileInputStreamCreateInputStream2.close();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th5) {
                                if (assetFileDescriptorOpenFd2 == null) {
                                    throw th5;
                                }
                                try {
                                    assetFileDescriptorOpenFd2.close();
                                    throw th5;
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                    throw th5;
                                }
                            }
                        } catch (FileNotFoundException e) {
                            oooO00o.f8830OooO0OO.OooO00o(6, e);
                        } catch (IOException e2) {
                            oooO00o.f8830OooO0OO.OooO00o(7, e2);
                        } catch (IllegalStateException e3) {
                            oooO00o.f8830OooO0OO.OooO00o(8, e3);
                        }
                        oooO0OOArr = oooO00o.f8834OooO0oO;
                        if (oooO0OOArr != null) {
                            i = Build.VERSION.SDK_INT;
                            if (i < 24 && (i == 24 || i == 25 || i == 31)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                try {
                                    assetFileDescriptorOpenFd = oooO00o.f8828OooO00o.openFd("dexopt/baseline.profm");
                                    try {
                                        fileInputStreamCreateInputStream = assetFileDescriptorOpenFd.createInputStream();
                                        try {
                                            oooO00o.f8834OooO0oO = OooOOOO.OooO0oO(fileInputStreamCreateInputStream, OooOOOO.OooO0o(fileInputStreamCreateInputStream, OooOOOO.f28625OooO0O0), oooO00o.f8831OooO0Oo, oooO0OOArr);
                                            fileInputStreamCreateInputStream.close();
                                            assetFileDescriptorOpenFd.close();
                                        } catch (Throwable th7) {
                                            if (fileInputStreamCreateInputStream == null) {
                                                throw th7;
                                            }
                                            try {
                                                fileInputStreamCreateInputStream.close();
                                                throw th7;
                                            } catch (Throwable th8) {
                                                th7.addSuppressed(th8);
                                                throw th7;
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        if (assetFileDescriptorOpenFd == null) {
                                            throw th9;
                                        }
                                        try {
                                            assetFileDescriptorOpenFd.close();
                                            throw th9;
                                        } catch (Throwable th10) {
                                            th9.addSuppressed(th10);
                                            throw th9;
                                        }
                                    }
                                } catch (FileNotFoundException e4) {
                                    oooO00o.f8830OooO0OO.OooO00o(9, e4);
                                } catch (IOException e5) {
                                    oooO00o.f8830OooO0OO.OooO00o(7, e5);
                                } catch (IllegalStateException e6) {
                                    oooO00o.f8834OooO0oO = null;
                                    oooO00o.f8830OooO0OO.OooO00o(8, e6);
                                }
                            }
                        }
                    }
                    oooO0OOArr2 = oooO00o.f8834OooO0oO;
                    bArr = oooO00o.f8831OooO0Oo;
                    if (oooO0OOArr2 != null && bArr != null) {
                        oooO00o.OooO00o();
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(OooOOOO.f28624OooO00o);
                                byteArrayOutputStream.write(bArr);
                                if (OooOOOO.OooOO0o(byteArrayOutputStream, bArr, oooO0OOArr2)) {
                                    oooO00o.f8835OooO0oo = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    oooO00o.f8834OooO0oO = null;
                                } else {
                                    oooO00o.f8830OooO0OO.OooO00o(5, null);
                                    oooO00o.f8834OooO0oO = null;
                                    byteArrayOutputStream.close();
                                }
                            } catch (Throwable th11) {
                                try {
                                    byteArrayOutputStream.close();
                                    throw th11;
                                } catch (Throwable th12) {
                                    th11.addSuppressed(th12);
                                    throw th11;
                                }
                            }
                        } catch (IOException e7) {
                            oooO00o.f8830OooO0OO.OooO00o(7, e7);
                        } catch (IllegalStateException e8) {
                            oooO00o.f8830OooO0OO.OooO00o(8, e8);
                        }
                    }
                    bArr2 = oooO00o.f8835OooO0oo;
                    if (bArr2 == null) {
                        z4 = false;
                    } else {
                        oooO00o.OooO00o();
                        try {
                            try {
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                try {
                                    fileOutputStream = new FileOutputStream(oooO00o.f8833OooO0o0);
                                    try {
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i2 = byteArrayInputStream.read(bArr3);
                                            if (i2 > 0) {
                                                break;
                                            } else {
                                                fileOutputStream.write(bArr3, 0, i2);
                                            }
                                        }
                                        oooO00o.OooO0O0(1, null);
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        oooO00o.f8835OooO0oo = null;
                                        oooO00o.f8834OooO0oO = null;
                                        z4 = true;
                                    } catch (Throwable th13) {
                                        try {
                                            fileOutputStream.close();
                                            throw th13;
                                        } catch (Throwable th14) {
                                            th13.addSuppressed(th14);
                                            throw th13;
                                        }
                                    }
                                } catch (Throwable th15) {
                                    try {
                                        byteArrayInputStream.close();
                                        throw th15;
                                    } catch (Throwable th16) {
                                        th15.addSuppressed(th16);
                                        throw th15;
                                    }
                                }
                            } catch (Throwable th17) {
                                oooO00o.f8835OooO0oo = null;
                                oooO00o.f8834OooO0oO = null;
                                throw th17;
                            }
                        } catch (FileNotFoundException e9) {
                            oooO00o.OooO0O0(6, e9);
                            oooO00o.f8835OooO0oo = null;
                            oooO00o.f8834OooO0oO = null;
                            z4 = false;
                        } catch (IOException e10) {
                            oooO00o.OooO0O0(7, e10);
                            oooO00o.f8835OooO0oo = null;
                            oooO00o.f8834OooO0oO = null;
                            z4 = false;
                        }
                    }
                    if (z4) {
                        OooO00o(packageInfo, filesDir);
                    }
                }
                return;
            }
            oooO00o.OooO0O0(3, Integer.valueOf(i3));
            z2 = false;
            if (z2) {
                return;
            }
            oooO00o.OooO00o();
            if (oooO00o.f8831OooO0Oo != null) {
                assetFileDescriptorOpenFd2 = assets.openFd("dexopt/baseline.prof");
                fileInputStreamCreateInputStream2 = assetFileDescriptorOpenFd2.createInputStream();
                oooO00o.f8834OooO0oO = OooOOOO.OooOO0(fileInputStreamCreateInputStream2, OooOOOO.OooO0o(fileInputStreamCreateInputStream2, OooOOOO.f28624OooO00o), name);
                fileInputStreamCreateInputStream2.close();
                assetFileDescriptorOpenFd2.close();
                oooO0OOArr = oooO00o.f8834OooO0oO;
                if (oooO0OOArr != null) {
                    i = Build.VERSION.SDK_INT;
                    if (i < 24) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        assetFileDescriptorOpenFd = oooO00o.f8828OooO00o.openFd("dexopt/baseline.profm");
                        fileInputStreamCreateInputStream = assetFileDescriptorOpenFd.createInputStream();
                        oooO00o.f8834OooO0oO = OooOOOO.OooO0oO(fileInputStreamCreateInputStream, OooOOOO.OooO0o(fileInputStreamCreateInputStream, OooOOOO.f28625OooO0O0), oooO00o.f8831OooO0Oo, oooO0OOArr);
                        fileInputStreamCreateInputStream.close();
                        assetFileDescriptorOpenFd.close();
                    }
                }
            }
            oooO0OOArr2 = oooO00o.f8834OooO0oO;
            bArr = oooO00o.f8831OooO0Oo;
            if (oooO0OOArr2 != null) {
                oooO00o.OooO00o();
                byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(OooOOOO.f28624OooO00o);
                byteArrayOutputStream.write(bArr);
                if (OooOOOO.OooOO0o(byteArrayOutputStream, bArr, oooO0OOArr2)) {
                    oooO00o.f8830OooO0OO.OooO00o(5, null);
                    oooO00o.f8834OooO0oO = null;
                    byteArrayOutputStream.close();
                } else {
                    oooO00o.f8835OooO0oo = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    oooO00o.f8834OooO0oO = null;
                }
            }
            bArr2 = oooO00o.f8835OooO0oo;
            if (bArr2 == null) {
                z4 = false;
            } else {
                oooO00o.OooO00o();
                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                fileOutputStream = new FileOutputStream(oooO00o.f8833OooO0o0);
                bArr3 = new byte[512];
                while (true) {
                    i2 = byteArrayInputStream.read(bArr3);
                    if (i2 > 0) {
                        break;
                        break;
                    }
                    fileOutputStream.write(bArr3, 0, i2);
                    byteArrayInputStream.close();
                    throw th15;
                }
                oooO00o.OooO0O0(1, null);
                fileOutputStream.close();
                byteArrayInputStream.close();
                oooO00o.f8835OooO0oo = null;
                oooO00o.f8834OooO0oO = null;
                z4 = true;
            }
            if (z4) {
                OooO00o(packageInfo, filesDir);
            }
        } catch (PackageManager.NameNotFoundException e11) {
            oooO0OO.OooO00o(7, e11);
        }
    }
}
