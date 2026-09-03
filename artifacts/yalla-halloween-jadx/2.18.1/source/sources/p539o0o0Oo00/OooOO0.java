package p539o0o0Oo00;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058o0000OoO.OooO;
import p254o00ooO0O.o00O000;
import p293o0O0Oo0O.OooOo00;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static Thread.UncaughtExceptionHandler f44126OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f44128OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public static Class<?> f44129OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static boolean f44130OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static boolean f44131OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOO0 f44125OooO00o = new OooOO0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final SimpleDateFormat f44127OooO0OO = new SimpleDateFormat("mm-dd HH:mm:ss");

    @NotNull
    public final String OooO00o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StringBuilder sb = new StringBuilder();
        File externalCacheDir = context.getExternalCacheDir();
        sb.append(externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null);
        return OooO.OooO00o(sb, File.separator, "crash/");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0082 A[Catch: IOException -> 0x007e, TRY_LEAVE, TryCatch #6 {IOException -> 0x007e, blocks: (B:47:0x007a, B:51:0x0082), top: B:57:0x007a }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final void OooO0O0(String str) throws Throwable {
        FileInputStream fileInputStream;
        IOException e;
        BufferedReader bufferedReader;
        FileNotFoundException e2;
        if (!new File((String) str).exists()) {
            Log.e("CrashHandler", "LogcatCrashInfo() 日志文件不存在");
            return;
        }
        try {
            try {
                try {
                    fileInputStream = new FileInputStream((String) str);
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "GBK"));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    bufferedReader.close();
                                    fileInputStream.close();
                                    return;
                                }
                                Log.e("CrashHandler", line);
                            } catch (FileNotFoundException e3) {
                                e2 = e3;
                                e2.printStackTrace();
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                    return;
                                }
                                return;
                            } catch (IOException e4) {
                                e = e4;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                    return;
                                }
                                return;
                            }
                        }
                    } catch (FileNotFoundException e5) {
                        e2 = e5;
                        bufferedReader = null;
                    } catch (IOException e6) {
                        e = e6;
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                        str = 0;
                        if (str != 0) {
                            try {
                                str.close();
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
                }
            } catch (FileNotFoundException e9) {
                fileInputStream = null;
                e2 = e9;
                bufferedReader = null;
            } catch (IOException e10) {
                fileInputStream = null;
                e = e10;
                bufferedReader = null;
            } catch (Throwable th2) {
                fileInputStream = null;
                th = th2;
                str = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void OooO0OO(String str, Throwable th, boolean z) {
        if (f44128OooO0Oo) {
            if (z) {
                o00O00.OooO0o("CrashHandler", str, th);
            }
            if (!f44131OooO0oO) {
                new Thread(new OooOo00(str, th, 1)).start();
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
                o00O00.OooO0o0("CrashHandler", "Toast Time");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:34:0x0101  */
    /* JADX WARN: Code duplicated, block: B:35:0x0105  */
    /* JADX WARN: Code duplicated, block: B:37:0x0109  */
    /* JADX WARN: Code duplicated, block: B:39:0x010f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0119  */
    /* JADX WARN: Code duplicated, block: B:44:0x011c  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(@NotNull Thread thread, @NotNull Throwable ex) throws Throwable {
        String message;
        boolean z;
        String message2;
        boolean z2;
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(ex, "ex");
        if (f44128OooO0Oo) {
            StringBuffer stringBuffer = new StringBuffer();
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            ex.setStackTrace(ex.getStackTrace());
            ex.printStackTrace(printWriter);
            printWriter.close();
            stringBuffer.append(stringWriter.toString());
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str = "crash-" + f44127OooO0OO.format(new Date()) + '-' + jCurrentTimeMillis + ".txt";
                o00O000 o00o001 = o00O000.f34346OooO00o;
                String strOooO00o = OooO00o(o00O000.OooO00o());
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
                o00O00.OooO0o0("CrashHandler", "saveCatchInfo2File() an error occured while writing file... Exception:");
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
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = f44126OooO0O0;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, ex);
        }
        if (!f44130OooO0o0 || f44129OooO0o == null) {
            return;
        }
        o00O000 o00o002 = o00O000.f34346OooO00o;
        Object systemService = o00O000.OooO00o().getSystemService("alarm");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        try {
            Intent intent = new Intent(o00O000.OooO00o(), f44129OooO0o);
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            alarmManager.set(1, System.currentTimeMillis(), PendingIntent.getActivity(o00O000.OooO00o(), 0, intent, 1073741824));
        } catch (Exception e2) {
            o00O00.OooO0o0("CrashHandler", "first class error:" + e2);
        }
    }
}
