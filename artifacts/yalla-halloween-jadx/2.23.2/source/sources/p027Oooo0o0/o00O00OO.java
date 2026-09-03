package p027Oooo0o0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.o0Oo0oo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o000OO.OooOOO0;
import p022Oooo00O.o000;
import p023Oooo00o.oO00o000;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O00OO implements CameraCoordinator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public Set<Set<String>> f1088OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f1089OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final HashMap f1086OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ArrayList f1085OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ArrayList f1087OooO0OO = new ArrayList();

    public o00O00OO(@NonNull oO00o000 oo00o000) {
        this.f1088OooO0Oo = new HashSet();
        try {
            this.f1088OooO0Oo = oo00o000.f962OooO00o.OooO0OO();
        } catch (CameraAccessExceptionCompat unused) {
            o00O0O0.OooO0O0("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator<Set<String>> it = this.f1088OooO0Oo.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList(it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                HashMap map = this.f1086OooO0O0;
                if (!map.containsKey(str)) {
                    map.put(str, new ArrayList());
                }
                if (!map.containsKey(str2)) {
                    map.put(str2, new ArrayList());
                }
                ((List) map.get(str)).add((String) arrayList.get(1));
                ((List) map.get(str2)).add((String) arrayList.get(0));
            }
        }
    }

    @Nullable
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public final String OooO00o(@NonNull String str) {
        HashMap map = this.f1086OooO0O0;
        if (!map.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) map.get(str)) {
            Iterator it = this.f1087OooO0OO.iterator();
            while (it.hasNext()) {
                o0Oo0oo o0oo0ooOooOO0O = ((o0Oo0oo) ((CameraInfo) it.next())).OooOO0O();
                OooOOO0.OooO0O0(o0oo0ooOooOO0O instanceof o000, "CameraInfo doesn't contain Camera2 implementation.");
                if (str2.equals(((o000) o0oo0ooOooOO0O).f459OooO0OO.f1072OooO00o.f457OooO00o)) {
                    return str2;
                }
            }
        }
        return null;
    }
}
