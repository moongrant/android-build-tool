package oOO00O;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(19)
public class o000000 extends o0000oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static boolean f60144OooO0OO = true;

    @SuppressLint({"NewApi"})
    public float OooO0O0(@NonNull View view) {
        if (f60144OooO0OO) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f60144OooO0OO = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void OooO0OO(@NonNull View view, float f) {
        if (f60144OooO0OO) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f60144OooO0OO = false;
            }
        }
        view.setAlpha(f);
    }
}
