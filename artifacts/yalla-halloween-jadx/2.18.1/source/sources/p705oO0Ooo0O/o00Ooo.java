package p705oO0Ooo0O;

import android.os.Build;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<OooO0OO> f52942OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile OooO0OO[] f52943OooO0O0 = new OooO0OO[0];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f52944OooO0OO = new OooO00o();

    public static class OooO00o extends OooO0OO {
        @Override // oO0Ooo0O.o00Ooo.OooO0OO
        public final void OooO00o(String str, Object... objArr) {
            for (OooO0OO oooO0OO : o00Ooo.f52943OooO0O0) {
                oooO0OO.OooO00o(str, objArr);
            }
        }

        @Override // oO0Ooo0O.o00Ooo.OooO0OO
        public final void OooO0O0(String str, Object... objArr) {
            for (OooO0OO oooO0OO : o00Ooo.f52943OooO0O0) {
                oooO0OO.OooO0O0(str, objArr);
            }
        }

        @Override // oO0Ooo0O.o00Ooo.OooO0OO
        public final void OooO0OO(Throwable th) {
            for (OooO0OO oooO0OO : o00Ooo.f52943OooO0O0) {
                oooO0OO.OooO0OO(th);
            }
        }

        @Override // oO0Ooo0O.o00Ooo.OooO0OO
        public final void OooO0o(int i, String str, @NotNull String str2) {
            throw new AssertionError("Missing override for log method.");
        }
    }

    public static class OooO0O0 extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Pattern f52945OooO0O0 = Pattern.compile("(\\$\\d+)+$");

        @Override // oO0Ooo0O.o00Ooo.OooO0OO
        public final void OooO0o(int i, String str, @NotNull String str2) {
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
            int i2 = 0;
            int length = str2.length();
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

        @Override // oO0Ooo0O.o00Ooo.OooO0OO
        public final String OooO0o0() {
            String str = this.f52946OooO00o.get();
            if (str != null) {
                this.f52946OooO00o.remove();
            }
            if (str != null) {
                return str;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length <= 5) {
                throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
            }
            String className = stackTrace[5].getClassName();
            Matcher matcher = f52945OooO0O0.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll("");
            }
            String strSubstring = className.substring(className.lastIndexOf(46) + 1);
            return (strSubstring.length() <= 23 || Build.VERSION.SDK_INT >= 24) ? strSubstring : strSubstring.substring(0, 23);
        }
    }

    public static abstract class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ThreadLocal<String> f52946OooO00o = new ThreadLocal<>();

        public void OooO00o(String str, Object... objArr) {
            OooO0oO(3, null, str, objArr);
        }

        public void OooO0O0(String str, Object... objArr) {
            OooO0oO(6, null, str, objArr);
        }

        public void OooO0OO(Throwable th) {
            OooO0oO(6, th, null, new Object[0]);
        }

        public final String OooO0Oo(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        public abstract void OooO0o(int i, @Nullable String str, @NotNull String str2);

        @Nullable
        public String OooO0o0() {
            String str = this.f52946OooO00o.get();
            if (str != null) {
                this.f52946OooO00o.remove();
            }
            return str;
        }

        public final void OooO0oO(int i, Throwable th, String str, Object... objArr) {
            String string;
            String strOooO0o0 = OooO0o0();
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str != null) {
                if (objArr.length > 0) {
                    str = String.format(str, objArr);
                }
                if (th != null) {
                    StringBuilder sbOooO00o = Oooo0.OooO00o(str, "\n");
                    sbOooO00o.append(OooO0Oo(th));
                    string = sbOooO00o.toString();
                } else {
                    string = str;
                }
            } else if (th == null) {
                return;
            } else {
                string = OooO0Oo(th);
            }
            OooO0o(i, strOooO0o0, string);
        }
    }

    @NotNull
    public static OooO0OO OooO00o(String str) {
        for (OooO0OO oooO0OO : f52943OooO0O0) {
            oooO0OO.f52946OooO00o.set(str);
        }
        return f52944OooO0OO;
    }
}
