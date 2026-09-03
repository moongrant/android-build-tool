package p118o00O0Oo;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.ArrayList;
import java.util.List;
import p129o00O0oOo.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o0ooOOo> f30607OooO00o = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0ooOOo>] */
    public final void OooO00o(o0ooOOo o0ooooo2) {
        this.f30607OooO00o.add(o0ooooo2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0ooOOo>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0ooOOo>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [o00O0OoO.OooOO0O<?, java.lang.Float>, o00O0OoO.OooOOOO] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o00O0OoO.OooOO0O<?, java.lang.Float>, o00O0OoO.OooOOOO] */
    /* JADX WARN: Type inference failed for: r3v0, types: [o00O0OoO.OooOO0O<?, java.lang.Float>, o00O0OoO.OooOOOO] */
    public final void OooO0O0(Path path) {
        int size = this.f30607OooO00o.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            o0ooOOo o0ooooo2 = (o0ooOOo) this.f30607OooO00o.get(size);
            ThreadLocal<PathMeasure> threadLocal = o000O0Oo.f31141OooO00o;
            if (o0ooooo2 != null && !o0ooooo2.f30737OooO00o) {
                o000O0Oo.OooO00o(path, o0ooooo2.f30740OooO0Oo.OooOO0o() / 100.0f, o0ooooo2.f30742OooO0o0.OooOO0o() / 100.0f, o0ooooo2.f30741OooO0o.OooOO0o() / 360.0f);
            }
        }
    }
}
