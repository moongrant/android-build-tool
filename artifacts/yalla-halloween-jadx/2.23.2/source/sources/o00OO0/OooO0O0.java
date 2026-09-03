package o00OO0;

import android.graphics.Path;
import com.google.android.gms.measurement.internal.zzlh;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p271o00ooooo.oO0OOO00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements oO0OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f36940OooO00o;

    public OooO0O0(zzlh zzlhVar) {
        this.f36940OooO00o = zzlhVar;
    }

    @Override // p271o00ooooo.oO0OOO00
    public final void OooO00o(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((zzlh) this.f36940OooO00o).OooO0oO(str, i, th, bArr, map);
    }

    public final void OooO0O0(Path path) {
        List list = (List) this.f36940OooO00o;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            o00Ooo o00ooo2 = (o00Ooo) list.get(size);
            o00OOO0.OooOOOO.OooO00o oooO00o = o00OOO0.OooOOOO.f37433OooO00o;
            if (o00ooo2 != null && !o00ooo2.f37047OooO00o) {
                o00OOO0.OooOOOO.OooO00o(path, o00ooo2.f37050OooO0Oo.OooOO0o() / 100.0f, o00ooo2.f37052OooO0o0.OooOO0o() / 100.0f, o00ooo2.f37051OooO0o.OooOO0o() / 360.0f);
            }
        }
    }

    public OooO0O0() {
        this.f36940OooO00o = new ArrayList();
    }
}
