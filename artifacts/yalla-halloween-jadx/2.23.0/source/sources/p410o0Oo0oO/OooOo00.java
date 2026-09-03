package p410o0Oo0oO;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import net.sqlcipher.database.SQLiteDatabase;
import org.jctools.util.Pow2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p029Oooo0oo.o0O0o00O;
import p031OoooO0.o0OoOo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOo00 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static Thread.UncaughtExceptionHandler f45227OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f45229OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public static Class<?> f45230OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static boolean f45231OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static boolean f45232OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOo00 f45226OooO00o = new OooOo00();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final SimpleDateFormat f45228OooO0OO = new SimpleDateFormat("mm-dd HH:mm:ss");

    @NotNull
    public static String OooO00o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File externalCacheDir = context.getExternalCacheDir();
        return o0OoOo0.OooO00o(externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null, File.separator, "crash/");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x007c A[Catch: IOException -> 0x0078, TRY_LEAVE, TryCatch #2 {IOException -> 0x0078, blocks: (B:50:0x0074, B:54:0x007c), top: B:58:0x0074 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.BufferedReader] */
    public static void OooO0O0(String str) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        IOException e;
        BufferedReader bufferedReader;
        FileNotFoundException e2;
        if (!new File(str).exists()) {
            Log.e("CrashHandler", "LogcatCrashInfo() 日志文件不存在");
            return;
        }
        ?? r0 = 0;
        r0 = 0;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream(str);
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "GBK"));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                } else {
                                    Log.e("CrashHandler", line);
                                }
                            } catch (FileNotFoundException e3) {
                                e2 = e3;
                                e2.printStackTrace();
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (fileInputStream == null) {
                                    return;
                                }
                            } catch (IOException e4) {
                                e = e4;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (fileInputStream == null) {
                                    return;
                                }
                            }
                        }
                        bufferedReader.close();
                    } catch (FileNotFoundException e5) {
                        e2 = e5;
                        bufferedReader = null;
                    } catch (IOException e6) {
                        e = e6;
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (r0 != 0) {
                            try {
                                r0.close();
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                            } catch (IOException e7) {
                                e7.printStackTrace();
                                throw th;
                            }
                        } else if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException e8) {
                    e8.printStackTrace();
                    return;
                }
            } catch (FileNotFoundException e9) {
                fileInputStream = null;
                e2 = e9;
                bufferedReader = null;
            } catch (IOException e10) {
                fileInputStream = null;
                e = e10;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
            fileInputStream.close();
        } catch (Throwable th4) {
            r0 = str;
            th = th4;
        }
    }

    public static void OooO0OO(String str, Throwable th, boolean z) {
        if (f45229OooO0Oo) {
            if (z) {
                OooOOO0.OooO0o0("CrashHandler", str, th);
            }
            if (!f45232OooO0oO) {
                new Thread(new o0O0o00O(1, str, th)).start();
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
                OooOOO0.OooO00o(101, "CrashHandler", "Toast Time", null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:35:0x0103  */
    /* JADX WARN: Code duplicated, block: B:37:0x0107  */
    /* JADX WARN: Code duplicated, block: B:39:0x010d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0117  */
    /* JADX WARN: Code duplicated, block: B:44:0x011a  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(@NotNull Thread thread, @NotNull Throwable ex) throws Throwable {
        String message;
        boolean z;
        String message2;
        boolean z2;
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(ex, "ex");
        if (f45229OooO0Oo) {
            StringBuffer stringBuffer = new StringBuffer();
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            ex.setStackTrace(ex.getStackTrace());
            ex.printStackTrace(printWriter);
            printWriter.close();
            stringBuffer.append(stringWriter.toString());
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str = "crash-" + f45228OooO0OO.format(new Date()) + "-" + jCurrentTimeMillis + ".txt";
                String strOooO00o = OooO00o(o000O0.OooO00o());
                File file = new File(strOooO00o);
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(strOooO00o + str);
                String string = stringBuffer.toString();
                Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
                byte[] bytes = string.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                OooO0O0(strOooO00o + str);
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
                OooOOO0.OooO00o(101, "CrashHandler", "saveCatchInfo2File() an error occured while writing file... Exception:", null);
            }
        }
        boolean z3 = ex instanceof NoClassDefFoundError;
        if (z3) {
            String message3 = ex.getMessage();
            if (message3 != null && StringsKt__StringsKt.contains(message3, "YlEncryption", true)) {
                OooO0OO("NotReportError", ex, true);
            } else if (!z3) {
                message2 = ex.getMessage();
                if (message2 == null) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    OooO0OO("NotReportError", ex, true);
                } else if (ex instanceof UnsatisfiedLinkError) {
                    message = ex.getMessage();
                    if (message == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (z) {
                        OooO0OO("NotReportError", ex, true);
                    }
                }
            } else if (ex instanceof UnsatisfiedLinkError) {
                message = ex.getMessage();
                if (message == null) {
                    z = false;
                } else {
                    z = false;
                }
                if (z) {
                    OooO0OO("NotReportError", ex, true);
                }
            }
        } else if (!z3) {
            message2 = ex.getMessage();
            if (message2 == null && StringsKt__StringsKt.contains(message2, "AESUtil", true)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                OooO0OO("NotReportError", ex, true);
            } else if (ex instanceof UnsatisfiedLinkError) {
                message = ex.getMessage();
                if (message == null) {
                    z = false;
                } else {
                    z = false;
                }
                if (z) {
                    OooO0OO("NotReportError", ex, true);
                }
            }
        } else if (ex instanceof UnsatisfiedLinkError) {
            message = ex.getMessage();
            if (message == null && StringsKt__StringsKt.contains(message, ".so\" not found", true)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                OooO0OO("NotReportError", ex, true);
            }
        }
        OooO0OO("Crash Error", ex, false);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f45227OooO0O0;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, ex);
        }
        if (!f45231OooO0o0 || f45230OooO0o == null) {
            return;
        }
        Object systemService = o000O0.OooO00o().getSystemService("alarm");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        try {
            Intent intent = new Intent(o000O0.OooO00o(), f45230OooO0o);
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            alarmManager.set(1, System.currentTimeMillis(), PendingIntent.getActivity(o000O0.OooO00o(), 0, intent, Pow2.MAX_POW2));
        } catch (Exception e2) {
            OooOOO0.OooO00o(101, "CrashHandler", "first class error:" + e2, null);
        }
    }
}
