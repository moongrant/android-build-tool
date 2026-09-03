package oOO00O;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
public class o0000 extends o00000OO {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static boolean f60143OooO0oo = true;

    @Override // oOO00O.o0000oo
    @SuppressLint({"NewApi"})
    public void OooO00o(int i, @NonNull View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.OooO00o(i, view);
        } else if (f60143OooO0oo) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f60143OooO0oo = false;
            }
        }
    }
}
