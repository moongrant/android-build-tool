package p012OooOo0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.o000OOo;
import androidx.core.content.res.OooO00o;
import java.util.WeakHashMap;
import p081o000OoO.Oooo0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public final class OooOO0O {
    public static ColorStateList OooO00o(@NonNull Context context, @ColorRes int i) {
        ColorStateList colorStateListOooO00o;
        ColorStateList colorStateList;
        OooO00o.OooO0OO oooO0OO;
        Object obj = o000O000.OooO00o.f28085OooO00o;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = OooO00o.f7829OooO00o;
        OooO00o.OooO0o oooO0o = new OooO00o.OooO0o(resources, theme);
        synchronized (OooO00o.f7831OooO0OO) {
            SparseArray<OooO00o.OooO0OO> sparseArray = OooO00o.f7830OooO0O0.get(oooO0o);
            colorStateListOooO00o = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (oooO0OO = sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (!oooO0OO.f7833OooO0O0.equals(resources.getConfiguration()) || (!(theme == null && oooO0OO.f7834OooO0OO == 0) && (theme == null || oooO0OO.f7834OooO0OO != theme.hashCode()))) {
                sparseArray.remove(i);
                colorStateList = null;
            } else {
                colorStateList = oooO0OO.f7832OooO00o;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal<TypedValue> threadLocal2 = OooO00o.f7829OooO00o;
        TypedValue typedValue = threadLocal2.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal2.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (!(i2 >= 28 && i2 <= 31)) {
            try {
                colorStateListOooO00o = Oooo0.OooO00o(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListOooO00o == null) {
            return Build.VERSION.SDK_INT >= 23 ? OooO00o.OooO0O0.OooO0O0(resources, i, theme) : resources.getColorStateList(i);
        }
        synchronized (OooO00o.f7831OooO0OO) {
            WeakHashMap<OooO00o.OooO0o, SparseArray<OooO00o.OooO0OO>> weakHashMap = OooO00o.f7830OooO0O0;
            SparseArray<OooO00o.OooO0OO> sparseArray2 = weakHashMap.get(oooO0o);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray<>();
                weakHashMap.put(oooO0o, sparseArray2);
            }
            sparseArray2.append(i, new OooO00o.OooO0OO(colorStateListOooO00o, oooO0o.f7835OooO00o.getConfiguration(), theme));
        }
        return colorStateListOooO00o;
    }

    @Nullable
    public static Drawable OooO0O0(@NonNull Context context, @DrawableRes int i) {
        return o000OOo.OooO0Oo().OooO0o(context, i);
    }
}
