package p027Oooo0o;

import com.google.android.gms.common.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f1857OooO00o = 2500;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final float f1858OooO0O0 = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

    public static final oo000o OooO00o(o000O00O o000o00o2, int i) {
        oo000o oo000oVar;
        List<oo000o> listOooO0O0 = o000o00o2.OooO0oO().OooO0O0();
        int size = listOooO0O0.size();
        for (int i2 = 0; i2 < size; i2++) {
            oo000oVar = listOooO0O0.get(i2);
            if (oo000oVar.getIndex() == i) {
                return oo000oVar;
            }
        }
        oo000oVar = null;
        return oo000oVar;
    }
}
