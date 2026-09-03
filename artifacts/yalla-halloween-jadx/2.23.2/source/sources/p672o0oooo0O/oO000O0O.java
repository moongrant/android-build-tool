package p672o0oooo0O;

import android.os.Build;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOo0.o000O0o;

/* JADX INFO: loaded from: classes5.dex */
public final class oO000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ArrayList f59915OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile OooO0OO[] f59916OooO0O0 = new OooO0OO[0];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f59917OooO0OO = new OooO00o();

    public static class OooO00o extends OooO0OO {
        @Override // o0oooo0O.oO000O0O.OooO0OO
        public final void OooO00o(String str, Object... objArr) {
            for (OooO0OO oooO0OO : oO000O0O.f59916OooO0O0) {
                oooO0OO.OooO00o(str, objArr);
            }
        }

        @Override // o0oooo0O.oO000O0O.OooO0OO
        public final void OooO0O0(String str, Object... objArr) {
            for (OooO0OO oooO0OO : oO000O0O.f59916OooO0O0) {
                oooO0OO.OooO0O0(str, objArr);
            }
        }

        @Override // o0oooo0O.oO000O0O.OooO0OO
        public final void OooO0OO(Throwable th) {
            for (OooO0OO oooO0OO : oO000O0O.f59916OooO0O0) {
                oooO0OO.OooO0OO(th);
            }
        }

        @Override // o0oooo0O.oO000O0O.OooO0OO
        public final void OooO0o0(int i, String str, @NotNull String str2) {
            throw new AssertionError("Missing override for log method.");
        }
    }

    public static class OooO0O0 extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Pattern f59918OooO0O0 = Pattern.compile("(\\$\\d+)+$");

        @Override // o0oooo0O.oO000O0O.OooO0OO
        public final String OooO0Oo() {
            String strOooO0Oo = super.OooO0Oo();
            if (strOooO0Oo != null) {
                return strOooO0Oo;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length <= 5) {
                throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
            }
            String className = stackTrace[5].getClassName();
            Matcher matcher = f59918OooO0O0.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll("");
            }
            String strSubstring = className.substring(className.lastIndexOf(46) + 1);
            return (strSubstring.length() <= 23 || Build.VERSION.SDK_INT >= 24) ? strSubstring : strSubstring.substring(0, 23);
        }

        @Override // o0oooo0O.oO000O0O.OooO0OO
        public final void OooO0o0(int i, String str, @NotNull String str2) {
            int iMin;
            if (str2.length() < 4000) {
                if (i == 7) {
                    Log.wtf(str, str2);
                    return;
                } else {
                    Log.println(i, str, str2);
                    return;
                }
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iIndexOf = str2.indexOf(10, i2);
                if (iIndexOf == -1) {
                    iIndexOf = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf, i2 + 4000);
                    String strSubstring = str2.substring(i2, iMin);
                    if (i == 7) {
                        Log.wtf(str, strSubstring);
                    } else {
                        Log.println(i, str, strSubstring);
                    }
                    if (iMin >= iIndexOf) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    public static abstract class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ThreadLocal<String> f59919OooO00o = new ThreadLocal<>();

        public void OooO00o(String str, Object... objArr) {
            OooO0o(3, null, str, objArr);
        }

        public void OooO0O0(String str, Object... objArr) {
            OooO0o(6, null, str, objArr);
        }

        public void OooO0OO(Throwable th) {
            OooO0o(6, th, null, new Object[0]);
        }

        @Nullable
        public String OooO0Oo() {
            ThreadLocal<String> threadLocal = this.f59919OooO00o;
            String str = threadLocal.get();
            if (str != null) {
                threadLocal.remove();
            }
            return str;
        }

        public final void OooO0o(int i, Throwable th, String str, Object... objArr) {
            String string;
            String strOooO0Oo = OooO0Oo();
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str != null) {
                if (objArr.length > 0) {
                    str = String.format(str, objArr);
                }
                if (th != null) {
                    StringBuilder sbOooO0O0 = o000O0o.OooO0O0(str, "\n");
                    StringWriter stringWriter = new StringWriter(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    sbOooO0O0.append(stringWriter.toString());
                    string = sbOooO0O0.toString();
                } else {
                    string = str;
                }
            } else {
                if (th == null) {
                    return;
                }
                StringWriter stringWriter2 = new StringWriter(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
                th.printStackTrace(printWriter2);
                printWriter2.flush();
                string = stringWriter2.toString();
            }
            OooO0o0(i, strOooO0Oo, string);
        }

        public abstract void OooO0o0(int i, @Nullable String str, @NotNull String str2);
    }

    @NotNull
    public static OooO00o OooO00o(String str) {
        for (OooO0OO oooO0OO : f59916OooO0O0) {
            oooO0OO.f59919OooO00o.set(str);
        }
        return f59917OooO0OO;
    }
}
