package p320o0O0oo0;

import android.os.Trace;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.OooOO0;
import com.google.firebase.components.o00oO0o;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO00O implements OooOO0 {
    @Override // com.google.firebase.components.OooOO0
    public final List<OooO0O0<?>> OooO00o(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final OooO0O0<?> oooO0O0 : componentRegistrar.getComponents()) {
            final String str = oooO0O0.f19320OooO00o;
            if (str != null) {
                oooO0O0 = new OooO0O0<>(str, oooO0O0.f19321OooO0O0, oooO0O0.f19322OooO0OO, oooO0O0.f19323OooO0Oo, oooO0O0.f19325OooO0o0, new OooO() { // from class: o0O0oo0.o00OO000
                    @Override // com.google.firebase.components.OooO
                    public final Object OooO00o(o00oO0o o00oo0o2) {
                        String str2 = str;
                        OooO0O0 oooO0O1 = oooO0O0;
                        try {
                            Trace.beginSection(str2);
                            return oooO0O1.f19324OooO0o.OooO00o(o00oo0o2);
                        } finally {
                            Trace.endSection();
                        }
                    }
                }, oooO0O0.f19326OooO0oO);
            }
            arrayList.add(oooO0O0);
        }
        return arrayList;
    }
}
