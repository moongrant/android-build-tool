package p289o0O0Oo0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.ServerProtocol;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import kotlin.UByte;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f41468OooO00o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static long f41469OooO0O0 = -1;

    public enum OooO00o {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;

        private static final Map<String, OooO00o> matcher;

        static {
            OooO00o oooO00o = X86_32;
            OooO00o oooO00o2 = ARMV6;
            OooO00o oooO00o3 = ARMV7;
            OooO00o oooO00o4 = ARM64;
            HashMap map = new HashMap(4);
            matcher = map;
            map.put("armeabi-v7a", oooO00o3);
            map.put("armeabi", oooO00o2);
            map.put("arm64-v8a", oooO00o4);
            map.put("x86", oooO00o);
        }

        public static OooO00o OooO00o() {
            String str = Build.CPU_ABI;
            if (!TextUtils.isEmpty(str)) {
                OooO00o oooO00o = matcher.get(str.toLowerCase(Locale.US));
                return oooO00o == null ? UNKNOWN : oooO00o;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
            return UNKNOWN;
        }
    }

    public static boolean OooO() {
        if (!Build.PRODUCT.contains(ServerProtocol.DIALOG_PARAM_SDK_VERSION)) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static void OooO00o(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", str, e);
            }
        }
    }

    public static long OooO0O0(int i, String str, String str2) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    public static String OooO0OO(File file) throws Throwable {
        BufferedReader bufferedReader;
        String str = null;
        str = null;
        str = null;
        BufferedReader bufferedReader2 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                while (true) {
                    try {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] strArrSplit = Pattern.compile("\\s*:\\s*").split(line, 2);
                            if (strArrSplit.length > 1 && strArrSplit[0].equals("MemTotal")) {
                                str = strArrSplit[1];
                                break;
                            }
                        } catch (Exception e) {
                            e = e;
                            Log.e("FirebaseCrashlytics", "Error parsing " + file, e);
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        OooO00o(bufferedReader2, "Failed to close system file reader.");
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                OooO00o(bufferedReader2, "Failed to close system file reader.");
                throw th;
            }
            OooO00o(bufferedReader, "Failed to close system file reader.");
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int OooO0Oo() {
        boolean zOooO = OooO();
        ?? r0 = zOooO;
        if (OooOO0()) {
            r0 = (zOooO ? 1 : 0) | 2;
        }
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger() ? r0 | 4 : r0;
    }

    public static int OooO0o(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static String OooO0o0(Context context) {
        int iOooO0o = OooO0o(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iOooO0o == 0) {
            iOooO0o = OooO0o(context, "com.crashlytics.android.build_id", "string");
        }
        if (iOooO0o != 0) {
            return context.getResources().getString(iOooO0o);
        }
        return null;
    }

    public static synchronized long OooO0oO() {
        long jOooO0O0;
        if (f41469OooO0O0 == -1) {
            String strOooO0OO = OooO0OO(new File("/proc/meminfo"));
            if (TextUtils.isEmpty(strOooO0OO)) {
                jOooO0O0 = 0;
                f41469OooO0O0 = jOooO0O0;
            } else {
                String upperCase = strOooO0OO.toUpperCase(Locale.US);
                try {
                    if (upperCase.endsWith("KB")) {
                        jOooO0O0 = OooO0O0(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, upperCase, "KB");
                    } else if (upperCase.endsWith("MB")) {
                        jOooO0O0 = OooO0O0(ZegoConstants.ErrorMask.RoomServerErrorMask, upperCase, "MB");
                    } else if (upperCase.endsWith("GB")) {
                        jOooO0O0 = OooO0O0(Pow2.MAX_POW2, upperCase, "GB");
                    } else {
                        Log.w("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: ".concat(upperCase), null);
                        jOooO0O0 = 0;
                    }
                } catch (NumberFormatException e) {
                    Log.e("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: " + upperCase, e);
                }
                f41469OooO0O0 = jOooO0O0;
            }
            throw th;
        }
        return f41469OooO0O0;
    }

    public static String OooO0oo(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & UByte.MAX_VALUE;
            int i3 = i * 2;
            char[] cArr2 = f41468OooO00o;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static boolean OooOO0() {
        boolean zOooO = OooO();
        String str = Build.TAGS;
        if ((zOooO || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zOooO && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static String OooOO0O(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return OooO0oo(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e);
            return "";
        }
    }

    public static String OooOO0o(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }
}
