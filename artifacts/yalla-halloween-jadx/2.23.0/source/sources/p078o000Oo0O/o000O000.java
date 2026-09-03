package p078o000Oo0O;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(22)
public class o000O000 extends o0000OO0 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static boolean f34947OooO0oO = true;

    @SuppressLint({"NewApi"})
    public void OooO0oO(@NonNull View view, int i, int i2, int i3, int i4) {
        if (f34947OooO0oO) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f34947OooO0oO = false;
            }
        }
    }
}
