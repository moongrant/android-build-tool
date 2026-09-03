package p101o000oOoo;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public class oO00Oo00 extends oO00OOo0 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static boolean f29756OooOO0 = true;

    @Override // p101o000oOoo.oOOoOOO0
    @SuppressLint({"NewApi"})
    public void OooO0O0(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.OooO0O0(view, i);
        } else if (f29756OooOO0) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f29756OooOO0 = false;
            }
        }
    }
}
