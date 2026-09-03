package p071o000O0o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import o000O0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, FontResourcesParserCompat.OooO0OO> f28189OooO00o = new ConcurrentHashMap<>();

    public class OooO00o implements OooO0O0<Oooo000> {
        @Override // o000O0o.Oooo0.OooO0O0
        public final int OooO00o(Oooo000 oooo000) {
            return oooo000.f28077OooO0OO;
        }

        @Override // o000O0o.Oooo0.OooO0O0
        public final boolean OooO0O0(Oooo000 oooo000) {
            return oooo000.f28078OooO0Oo;
        }
    }

    public interface OooO0O0<T> {
        int OooO00o(T t);

        boolean OooO0O0(T t);
    }

    public static <T> T OooO0o0(T[] tArr, int i, OooO0O0<T> oooO0O0) {
        int i2 = (i & 1) == 0 ? ShopVehicleListModel.VehicleTagType_Vip400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(oooO0O0.OooO00o(t2) - i2) * 2) + (oooO0O0.OooO0O0(t2) == z ? 0 : 1);
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
        File fileOooO0Oo = o000oOoO.OooO0Oo(context);
        if (fileOooO0Oo == null) {
            return null;
        }
        try {
            if (o000oOoO.OooO0OO(fileOooO0Oo, inputStream)) {
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
        File fileOooO0Oo = o000oOoO.OooO0Oo(context);
        if (fileOooO0Oo == null) {
            return null;
        }
        try {
            if (o000oOoO.OooO0O0(fileOooO0Oo, resources, i)) {
                return Typeface.createFromFile(fileOooO0Oo.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileOooO0Oo.delete();
        }
    }

    public Oooo000 OooO0o(Oooo000[] oooo000Arr, int i) {
        return (Oooo000) OooO0o0(oooo000Arr, i, new OooO00o());
    }
}
