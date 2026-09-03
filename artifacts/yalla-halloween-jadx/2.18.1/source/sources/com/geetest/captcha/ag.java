package com.geetest.captcha;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.qiniu.android.common.Constants;
import com.umeng.analytics.pro.ak;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u0018\u0010\u000f\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u0018\u0010\u0014\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u0018\u0010\u0015\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\nJ\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0018\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u0018\u0010\u001c\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\u0018\u0010\u001d\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/geetest/captcha/utils/LogUtils;", "", "()V", "DEBUG", "", "ERROR", "INFO", "LEVEL", "PRINT_SIZE", "TAG", "", "VERBOSE", "WARN", "logger", "Lcom/geetest/captcha/utils/LogUtils$Logger;", "d", "", "msg", ViewHierarchyConstants.TAG_KEY, "destroy", "e", ak.aC, "init", "level", "log2sd", "printLongString", "data", "release", ak.aE, "w", "Logger", "captcha_release"}, k = 1, mv = {1, 1, 16})
public final class ag {
    private static a c;
    public static final ag a = new ag();
    private static int b = 4;
    private static String d = "Captcha";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u001a\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/geetest/captcha/utils/LogUtils$Logger;", "", "()V", "handler", "Landroid/os/Handler;", "sdf", "Ljava/text/SimpleDateFormat;", "thread", "Landroid/os/HandlerThread;", "checkLogFile", "", "destroy", "init", "log", ViewHierarchyConstants.TAG_KEY, "", "msg", "write", "content", "Companion", "Item", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class a {
        public static final C0090a a = new C0090a(0);
        private HandlerThread b;
        private Handler c;
        private final SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);

        /* JADX INFO: renamed from: com.geetest.captcha.ag$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/geetest/captcha/utils/LogUtils$Logger$Companion;", "", "()V", "EXTERNAL_DIR", "", "FILE_NAME", "MAX_FILE_SIZE", "", "WHAT_INIT", "", "WHAT_MSG", "build", "sdf", "Ljava/text/SimpleDateFormat;", "millis", ViewHierarchyConstants.TAG_KEY, "msg", "deleteCauseExceedMaxSize", "", "externalDirPath", "captcha_release"}, k = 1, mv = {1, 1, 16})
        public static final class C0090a {
            private C0090a() {
            }

            public /* synthetic */ C0090a(byte b) {
                this();
            }

            public static String a() {
                StringBuilder sb = new StringBuilder();
                ah ahVar = ah.a;
                sb.append(ah.a());
                return OooO.OooO00o(sb, File.separator, "Geetest");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/geetest/captcha/utils/LogUtils$Logger$Item;", "", "()V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "millis", "", "getMillis", "()J", "setMillis", "(J)V", ViewHierarchyConstants.TAG_KEY, "getTag", "setTag", "captcha_release"}, k = 1, mv = {1, 1, 16})
        public static final class b {
            public long a;

            @Nullable
            public String b;

            @Nullable
            public String c;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/geetest/captcha/utils/LogUtils$Logger$init$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "captcha_release"}, k = 1, mv = {1, 1, 16})
        public static final class c extends Handler {
            public c(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(@NotNull Message msg) throws Throwable {
                super.handleMessage(msg);
                try {
                    if (Thread.interrupted()) {
                        return;
                    }
                    int i = msg.what;
                    if (i != 0) {
                        if (i == 1) {
                            C0090a c0090a = a.a;
                            File file = new File(C0090a.a());
                            if (file.exists()) {
                                File file2 = new File(file, "captcha_log.txt");
                                if (!file2.exists() || file2.length() < 10485760) {
                                    return;
                                }
                                file2.delete();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Object obj = msg.obj;
                    if (obj == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.geetest.captcha.utils.LogUtils.Logger.Item");
                    }
                    b bVar = (b) obj;
                    C0090a c0090a2 = a.a;
                    SimpleDateFormat simpleDateFormat = a.this.d;
                    long j = bVar.a;
                    String str = simpleDateFormat.format(new Date(j)) + '\t' + bVar.b + '\n' + bVar.c + '\n';
                    Intrinsics.checkExpressionValueIsNotNull(str, "sb.toString()");
                    a.a(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public final synchronized void b() {
            Handler handler = this.c;
            if (handler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handler");
            }
            Message messageObtainMessage = handler.obtainMessage();
            Intrinsics.checkExpressionValueIsNotNull(messageObtainMessage, "handler.obtainMessage()");
            messageObtainMessage.what = 1;
            Handler handler2 = this.c;
            if (handler2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handler");
            }
            handler2.sendMessage(messageObtainMessage);
        }

        public final synchronized void c() {
            try {
                Handler handler = this.c;
                if (handler == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("handler");
                }
                handler.removeMessages(0);
                Handler handler2 = this.c;
                if (handler2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("handler");
                }
                handler2.removeMessages(1);
                HandlerThread handlerThread = this.b;
                if (handlerThread == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thread");
                }
                handlerThread.quitSafely();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final synchronized void a() {
            HandlerThread handlerThread = new HandlerThread("Captcha Thread");
            this.b = handlerThread;
            handlerThread.start();
            HandlerThread handlerThread2 = this.b;
            if (handlerThread2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thread");
            }
            this.c = new c(handlerThread2.getLooper());
        }

        public final synchronized void a(@Nullable String str, @Nullable String str2) {
            Handler handler = this.c;
            if (handler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handler");
            }
            Message messageObtainMessage = handler.obtainMessage();
            Intrinsics.checkExpressionValueIsNotNull(messageObtainMessage, "handler.obtainMessage()");
            messageObtainMessage.what = 0;
            b bVar = new b();
            bVar.a = System.currentTimeMillis();
            bVar.b = str;
            bVar.c = str2;
            messageObtainMessage.obj = bVar;
            Handler handler2 = this.c;
            if (handler2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handler");
            }
            handler2.sendMessage(messageObtainMessage);
        }

        public static final /* synthetic */ void a(String str) throws Throwable {
            BufferedOutputStream bufferedOutputStream = null;
            try {
                File file = new File(C0090a.a());
                if (!file.exists()) {
                    file.mkdirs();
                }
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(new File(file, "captcha_log.txt"), true));
                try {
                    Charset charsetForName = Charset.forName(Constants.UTF_8);
                    Intrinsics.checkExpressionValueIsNotNull(charsetForName, "Charset.forName(charsetName)");
                    if (str != null) {
                        byte[] bytes = str.getBytes(charsetForName);
                        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                        bufferedOutputStream2.write(bytes);
                        try {
                            bufferedOutputStream2.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                } catch (Exception unused2) {
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private ag() {
    }

    public static void a(@NotNull String str) {
        if (b <= 2) {
            Log.d(d, str);
            c(d, str);
        }
    }

    public static void b(@Nullable String str, @NotNull String str2) {
        if (b <= 3) {
            Log.i(str, str2);
            c(str, str2);
        }
    }

    private static void c(String str, String str2) {
        if (c == null) {
            a aVar = new a();
            c = aVar;
            aVar.a();
            a aVar2 = c;
            if (aVar2 != null) {
                aVar2.b();
            }
        }
        a aVar3 = c;
        if (aVar3 != null) {
            aVar3.a(str, str2);
        }
    }

    public static void a(@Nullable String str, @NotNull String str2) {
        if (b <= 2) {
            Log.d(str, str2);
            c(str, str2);
        }
    }

    public static void b(@NotNull String str) {
        Log.i(d, str);
        c(d, str);
    }

    public static void a() {
        try {
            a aVar = c;
            if (aVar != null) {
                if (aVar != null) {
                    aVar.c();
                }
                c = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
