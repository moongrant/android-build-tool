package o000O0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.qiniu.android.http.ResponseInfo;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p021OooOooo.o00oO0o;
import p021OooOooo.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final oo000o<String, Typeface> f28066OooO00o = new oo000o<>(16);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadPoolExecutor f28067OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f28068OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("LOCK")
    public static final o00oO0o<String, ArrayList<o000OO0O.OooO00o<OooO00o>>> f28069OooO0Oo;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, ResponseInfo.UnknownError, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new Oooo0());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f28067OooO0O0 = threadPoolExecutor;
        f28068OooO0OO = new Object();
        f28069OooO0Oo = new o00oO0o<>();
    }

    public static String OooO00o(@NonNull OooOO0 oooOO1, int i) {
        return oooOO1.f28053OooO0o0 + "-" + i;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0034 A[EDGE_INSN: B:22:0x0034->B:27:0x003d BREAK  A[LOOP:0: B:18:0x002a->B:24:0x0038]] */
    @NonNull
    public static OooO00o OooO0O0(@NonNull String str, @NonNull Context context, @NonNull OooOO0 oooOO1, int i) {
        int i2;
        Typeface typeface = f28066OooO00o.get(str);
        if (typeface != null) {
            return new OooO00o(typeface);
        }
        try {
            OooOo oooOoOooO00o = OooO.OooO00o(context, oooOO1);
            int i3 = oooOoOooO00o.f28064OooO00o;
            int i4 = 1;
            if (i3 == 0) {
                Oooo000[] oooo000Arr = oooOoOooO00o.f28065OooO0O0;
                if (oooo000Arr == null || oooo000Arr.length == 0) {
                    i2 = i4;
                    break;
                }
                int length = oooo000Arr.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        i4 = 0;
                        i2 = i4;
                        break;
                    }
                    int i6 = oooo000Arr[i5].f28079OooO0o0;
                    if (i6 != 0) {
                        if (i6 >= 0) {
                            i2 = i6;
                            break;
                        }
                        i2 = -3;
                        break;
                    }
                    i5++;
                }
            } else {
                if (i3 != 1) {
                    i2 = -3;
                    break;
                }
                i2 = -2;
            }
            if (i2 != 0) {
                return new OooO00o(i2);
            }
            Typeface typefaceOooO0O0 = p071o000O0o.OooOOO0.f28175OooO00o.OooO0O0(context, oooOoOooO00o.f28065OooO0O0, i);
            if (typefaceOooO0O0 == null) {
                return new OooO00o(-3);
            }
            f28066OooO00o.put(str, typefaceOooO0O0);
            return new OooO00o(typefaceOooO0O0);
        } catch (PackageManager.NameNotFoundException unused) {
            return new OooO00o(-1);
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Typeface f28070OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f28071OooO0O0;

        public OooO00o(int i) {
            this.f28070OooO00o = null;
            this.f28071OooO0O0 = i;
        }

        @SuppressLint({"WrongConstant"})
        public OooO00o(@NonNull Typeface typeface) {
            this.f28070OooO00o = typeface;
            this.f28071OooO0O0 = 0;
        }
    }
}
