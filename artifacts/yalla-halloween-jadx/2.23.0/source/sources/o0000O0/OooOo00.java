package o0000O0;

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

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final p188o00o0O.OooOo<String, Typeface> f34071OooO00o = new p188o00o0O.OooOo<>(16);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadPoolExecutor f34072OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f34073OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("LOCK")
    public static final p188o00o0O.Oooo000<String, ArrayList<o000OO.OooO00o<OooO00o>>> f34074OooO0Oo;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, ResponseInfo.UnknownError, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new Oooo0());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f34072OooO0O0 = threadPoolExecutor;
        f34073OooO0OO = new Object();
        f34074OooO0Oo = new p188o00o0O.Oooo000<>();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034 A[EDGE_INSN: B:21:0x0034->B:25:0x003c BREAK  A[LOOP:0: B:17:0x002a->B:23:0x0038]] */
    @NonNull
    public static OooO00o OooO00o(@NonNull String str, @NonNull Context context, @NonNull OooOO0 oooOO1, int i) {
        int i2;
        p188o00o0O.OooOo<String, Typeface> oooOo = f34071OooO00o;
        Typeface typeface = oooOo.get(str);
        if (typeface != null) {
            return new OooO00o(typeface);
        }
        try {
            OooOo oooOoOooO00o = OooO.OooO00o(context, oooOO1);
            int i3 = 1;
            Oooo000[] oooo000Arr = oooOoOooO00o.f34070OooO0O0;
            int i4 = oooOoOooO00o.f34069OooO00o;
            if (i4 != 0) {
                if (i4 != 1) {
                    i2 = -3;
                    break;
                }
                i2 = -2;
            } else {
                if (oooo000Arr == null || oooo000Arr.length == 0) {
                    i2 = i3;
                    break;
                }
                int length = oooo000Arr.length;
                i3 = 0;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        i2 = i3;
                        break;
                    }
                    int i6 = oooo000Arr[i5].f34084OooO0o0;
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
            }
            if (i2 != 0) {
                return new OooO00o(i2);
            }
            Typeface typefaceOooO0O0 = p052o00000oO.OooOOOO.f33996OooO00o.OooO0O0(context, oooo000Arr, i);
            if (typefaceOooO0O0 == null) {
                return new OooO00o(-3);
            }
            oooOo.put(str, typefaceOooO0O0);
            return new OooO00o(typefaceOooO0O0);
        } catch (PackageManager.NameNotFoundException unused) {
            return new OooO00o(-1);
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Typeface f34075OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f34076OooO0O0;

        public OooO00o(int i) {
            this.f34075OooO00o = null;
            this.f34076OooO0O0 = i;
        }

        @SuppressLint({"WrongConstant"})
        public OooO00o(@NonNull Typeface typeface) {
            this.f34075OooO00o = typeface;
            this.f34076OooO0O0 = 0;
        }
    }
}
