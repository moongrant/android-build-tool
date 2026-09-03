package p052o00000oO;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import com.google.logging.type.LogSeverity;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import o0000O0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class o00O0O {

    public interface OooO00o<T> {
        boolean OooO00o(T t);

        int OooO0O0(T t);
    }

    public o00O0O() {
        new ConcurrentHashMap();
    }

    public static <T> T OooO0o0(T[] tArr, int i, OooO00o<T> oooO00o) {
        int i2 = (i & 1) == 0 ? 400 : LogSeverity.ALERT_VALUE;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(oooO00o.OooO0O0(t2) - i2) * 2) + (oooO00o.OooO00o(t2) == z ? 0 : 1);
            if (t == null || i3 > iAbs) {
                t = t2;
                i3 = iAbs;
            }
        }
        return t;
    }

    @Nullable
    public Typeface OooO00o(Context context, FontResourcesParserCompat.OooO0OO oooO0OO, Resources resources, int i) {
        throw null;
    }

    @Nullable
    public Typeface OooO0O0(Context context, @NonNull Oooo000[] oooo000Arr, int i) {
        throw null;
    }

    public Typeface OooO0OO(Context context, InputStream inputStream) {
        File fileOooO0Oo = o00Oo0.OooO0Oo(context);
        if (fileOooO0Oo == null) {
            return null;
        }
        try {
            if (o00Oo0.OooO0OO(fileOooO0Oo, inputStream)) {
                return Typeface.createFromFile(fileOooO0Oo.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileOooO0Oo.delete();
        }
    }

    @Nullable
    public Typeface OooO0Oo(Context context, Resources resources, int i, String str, int i2) {
        File fileOooO0Oo = o00Oo0.OooO0Oo(context);
        if (fileOooO0Oo == null) {
            return null;
        }
        try {
            if (o00Oo0.OooO0O0(fileOooO0Oo, resources, i)) {
                return Typeface.createFromFile(fileOooO0Oo.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileOooO0Oo.delete();
        }
    }

    public Oooo000 OooO0o(int i, Oooo000[] oooo000Arr) {
        return (Oooo000) OooO0o0(oooo000Arr, i, new o0OoOo0());
    }
}
