package p078o000Oo0O;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
public class o000Oo0 extends o000O000 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static boolean f34953OooO0oo = true;

    @Override // p078o000Oo0O.o000O00O
    @SuppressLint({"NewApi"})
    public void OooO00o(int i, @NonNull View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.OooO00o(i, view);
        } else if (f34953OooO0oo) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f34953OooO0oo = false;
            }
        }
    }
}
