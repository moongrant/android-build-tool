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
import p023Oooo00o.oO0OOO00;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O00o0 implements CameraCoordinator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public Set<Set<String>> f1102OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f1103OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final HashMap f1100OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ArrayList f1099OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ArrayList f1101OooO0OO = new ArrayList();

    public o00O00o0(@NonNull oO0OOO00 oo0ooo00) {
        this.f1102OooO0Oo = new HashSet();
        try {
            this.f1102OooO0Oo = oo0ooo00.f982OooO00o.OooO0OO();
        } catch (CameraAccessExceptionCompat unused) {
            o00O0O0.OooO0O0("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator<Set<String>> it = this.f1102OooO0Oo.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList(it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                HashMap map = this.f1100OooO0O0;
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
        HashMap map = this.f1100OooO0O0;
        if (!map.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) map.get(str)) {
            Iterator it = this.f1101OooO0OO.iterator();
            while (it.hasNext()) {
                o0Oo0oo o0oo0ooOooOO0O = ((o0Oo0oo) ((CameraInfo) it.next())).OooOO0O();
                OooOOO0.OooO0O0(o0oo0ooOooOO0O instanceof o000, "CameraInfo doesn't contain Camera2 implementation.");
                if (str2.equals(((o000) o0oo0ooOooOO0O).f458OooO0OO.f1086OooO00o.f456OooO00o)) {
                    return str2;
                }
            }
        }
        return null;
    }
}
