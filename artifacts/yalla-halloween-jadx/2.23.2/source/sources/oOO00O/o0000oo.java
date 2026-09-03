package oOO00O;

import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Field f60151OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f60152OooO0O0;

    public void OooO00o(int i, @NonNull View view) {
        if (!f60152OooO0O0) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f60151OooO00o = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f60152OooO0O0 = true;
        }
        Field field = f60151OooO00o;
        if (field != null) {
            try {
                f60151OooO00o.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
