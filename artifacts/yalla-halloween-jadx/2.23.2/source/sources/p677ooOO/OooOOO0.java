package p677ooOO;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.oo0o0O0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public static final oo0o0O0 f60363OooO00o;

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    static {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT < 33) {
            String str = Build.MANUFACTURER;
            if ("SAMSUNG".equalsIgnoreCase(str)) {
                String str2 = Build.DEVICE;
                if ("F2Q".equalsIgnoreCase(str2) || "Q2Q".equalsIgnoreCase(str2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                if (!("OPPO".equalsIgnoreCase(str) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE))) {
                    if (!("LENOVO".equalsIgnoreCase(str) && "Q706F".equalsIgnoreCase(Build.DEVICE))) {
                        z = false;
                    }
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(new OooOOOO());
        }
        if ("XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL)) {
            arrayList.add(new OooOOO());
        }
        f60363OooO00o = new oo0o0O0(arrayList);
    }
}
