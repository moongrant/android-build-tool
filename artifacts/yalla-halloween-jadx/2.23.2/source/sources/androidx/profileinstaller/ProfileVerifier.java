package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import p639o0ooOO0.o000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class ProfileVerifier {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000O0<CompilationStatus> f10528OooO00o = new o000O0<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f10529OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static CompilationStatus f10530OooO0OO = null;

    public static class CompilationStatus {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface ResultCode {
        }
    }

    @RequiresApi(33)
    public static class OooO00o {
        @DoNotInline
        public static PackageInfo OooO00o(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f10531OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f10532OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f10533OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f10534OooO0Oo;

        public OooO0O0(long j, int i, long j2, int i2) {
            this.f10531OooO00o = i;
            this.f10532OooO0O0 = i2;
            this.f10533OooO0OO = j;
            this.f10534OooO0Oo = j2;
        }

        public static OooO0O0 OooO00o(@NonNull File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                OooO0O0 oooO0O0 = new OooO0O0(dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readInt());
                dataInputStream.close();
                return oooO0O0;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final void OooO0O0(@NonNull File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f10531OooO00o);
                dataOutputStream.writeInt(this.f10532OooO0O0);
                dataOutputStream.writeLong(this.f10533OooO0OO);
                dataOutputStream.writeLong(this.f10534OooO0Oo);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f10532OooO0O0 == oooO0O0.f10532OooO0O0 && this.f10533OooO0OO == oooO0O0.f10533OooO0OO && this.f10531OooO00o == oooO0O0.f10531OooO00o && this.f10534OooO0Oo == oooO0O0.f10534OooO0Oo;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f10532OooO0O0), Long.valueOf(this.f10533OooO0OO), Integer.valueOf(this.f10531OooO00o), Long.valueOf(this.f10534OooO0Oo));
        }
    }

    public static long OooO00o(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? OooO00o.OooO00o(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static CompilationStatus OooO0O0(int i, boolean z, boolean z2) {
        CompilationStatus compilationStatus = new CompilationStatus();
        f10530OooO0OO = compilationStatus;
        f10528OooO00o.OooOO0(compilationStatus);
        return f10530OooO0OO;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:85:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @WorkerThread
    public static void OooO0OO(@NonNull Context context, boolean z) {
        int i;
        int i2;
        File file;
        boolean z2;
        File file2;
        long length;
        boolean z3;
        File file3;
        OooO0O0 oooO0O0OooO00o;
        OooO0O0 oooO0O0;
        int i3;
        if (z || f10530OooO0OO == null) {
            synchronized (f10529OooO0O0) {
                if (z) {
                    i = Build.VERSION.SDK_INT;
                    i2 = 0;
                    if (i >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        long jOooO00o = OooO00o(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            oooO0O0OooO00o = OooO0O0.OooO00o(file3);
                        } else {
                            oooO0O0OooO00o = null;
                        }
                        if (oooO0O0OooO00o == null) {
                            if (z2) {
                                i2 = 1;
                            } else if (z3) {
                                i2 = 2;
                            }
                        } else if (z2) {
                            i2 = 1;
                        } else if (z3) {
                            i2 = 2;
                        }
                        if (z) {
                            i2 = 2;
                        }
                        if (oooO0O0OooO00o != null) {
                            i2 = 3;
                        }
                        oooO0O0 = new OooO0O0(jOooO00o, 1, length, i2);
                        if (oooO0O0OooO00o != null) {
                            oooO0O0.OooO0O0(file3);
                        } else {
                            oooO0O0.OooO0O0(file3);
                        }
                        OooO0O0(i2, z2, z3);
                        return;
                    }
                    OooO0O0(262144, false, false);
                    return;
                }
                if (f10530OooO0OO != null) {
                    return;
                }
                i = Build.VERSION.SDK_INT;
                i2 = 0;
                if (i >= 28 && i != 30) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists() || length3 <= 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    try {
                        long jOooO00o2 = OooO00o(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                oooO0O0OooO00o = OooO0O0.OooO00o(file3);
                            } catch (IOException unused) {
                                OooO0O0(131072, z2, z3);
                                return;
                            }
                        } else {
                            oooO0O0OooO00o = null;
                        }
                        if (oooO0O0OooO00o == null && oooO0O0OooO00o.f10533OooO0OO == jOooO00o2 && (i3 = oooO0O0OooO00o.f10532OooO0O0) != 2) {
                            i2 = i3;
                        } else if (z2) {
                            i2 = 1;
                        } else if (z3) {
                            i2 = 2;
                        }
                        if (z && z3 && i2 != 1) {
                            i2 = 2;
                        }
                        if (oooO0O0OooO00o != null && oooO0O0OooO00o.f10532OooO0O0 == 2 && i2 == 1 && length3 < oooO0O0OooO00o.f10534OooO0Oo) {
                            i2 = 3;
                        }
                        oooO0O0 = new OooO0O0(jOooO00o2, 1, length, i2);
                        if (oooO0O0OooO00o != null || !oooO0O0OooO00o.equals(oooO0O0)) {
                            try {
                                oooO0O0.OooO0O0(file3);
                            } catch (IOException unused2) {
                                i2 = 196608;
                            }
                        }
                        OooO0O0(i2, z2, z3);
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        OooO0O0(65536, z2, z3);
                        return;
                    }
                }
                OooO0O0(262144, false, false);
                return;
                throw th;
            }
        }
    }
}
