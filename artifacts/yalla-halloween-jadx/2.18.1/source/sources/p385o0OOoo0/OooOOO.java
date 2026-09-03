package p385o0OOoo0;

import android.os.Trace;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p357o0OOOo0O.o00oO0o;
import p357o0OOOo0O.o0OOO0o;
import p357o0OOOo0O.o0Oo0oo;
import p357o0OOOo0O.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements o0Oo0oo {
    @Override // p357o0OOOo0O.o0Oo0oo
    public final List<oo000o<?>> OooO00o(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final oo000o<?> oo000oVar : componentRegistrar.getComponents()) {
            final String str = oo000oVar.f38366OooO00o;
            if (str != null) {
                oo000oVar = new oo000o<>(str, oo000oVar.f38367OooO0O0, oo000oVar.f38368OooO0OO, oo000oVar.f38369OooO0Oo, oo000oVar.f38371OooO0o0, new o0OOO0o() { // from class: o0OOoo0.OooOOO0
                    @Override // p357o0OOOo0O.o0OOO0o
                    public final Object OooO00o(o00oO0o o00oo0o2) {
                        String str2 = str;
                        oo000o oo000oVar2 = oo000oVar;
                        try {
                            Trace.beginSection(str2);
                            return oo000oVar2.f38370OooO0o.OooO00o(o00oo0o2);
                        } finally {
                            Trace.endSection();
                        }
                    }
                }, oo000oVar.f38372OooO0oO);
            }
            arrayList.add(oo000oVar);
        }
        return arrayList;
    }
}
