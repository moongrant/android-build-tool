package p078o000Oo0O;

import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class o000O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Field f34948OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f34949OooO0O0;

    public void OooO00o(int i, @NonNull View view) {
        if (!f34949OooO0O0) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f34948OooO00o = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f34949OooO0O0 = true;
        }
        Field field = f34948OooO00o;
        if (field != null) {
            try {
                f34948OooO00o.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
