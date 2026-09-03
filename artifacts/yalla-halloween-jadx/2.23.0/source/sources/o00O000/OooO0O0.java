package o00O000;

import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f36140OooO00o = new ArrayList();

    public final void OooO00o(Path path) {
        ArrayList arrayList = this.f36140OooO00o;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            o00Ooo o00ooo2 = (o00Ooo) arrayList.get(size);
            o00O0.OooOOOO.OooO00o oooO00o = o00O0.OooOOOO.f35982OooO00o;
            if (o00ooo2 != null && !o00ooo2.f36247OooO00o) {
                o00O0.OooOOOO.OooO00o(path, o00ooo2.f36250OooO0Oo.OooOO0o() / 100.0f, o00ooo2.f36252OooO0o0.OooOO0o() / 100.0f, o00ooo2.f36251OooO0o.OooOO0o() / 360.0f);
            }
        }
    }
}
