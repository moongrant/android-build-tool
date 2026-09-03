package p101o000oOoo;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(22)
public class oO00OOo0 extends oO00OOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static boolean f29755OooO = true;

    @Override // p101o000oOoo.oOOoOOO0
    @SuppressLint({"NewApi"})
    public void OooO00o(@NonNull View view, int i, int i2, int i3, int i4) {
        if (f29755OooO) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f29755OooO = false;
            }
        }
    }
}
