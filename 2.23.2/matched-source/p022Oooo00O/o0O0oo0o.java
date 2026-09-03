package p022Oooo00O;

import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import o000OO.OooO00o;
import p037OoooOo0.o000;
import p037OoooOo0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0oo0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f792OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f793OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f794OooO0o0;

    public /* synthetic */ o0O0oo0o(int i, Object obj, Object obj2) {
        this.f792OooO0Oo = i;
        this.f794OooO0o0 = obj;
        this.f793OooO0o = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [OoooOo0.o000OO] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f792OooO0Oo;
        Object obj = this.f793OooO0o;
        Object obj2 = this.f794OooO0o0;
        switch (i) {
            case 0:
                o0O0OOOo o0o0oooo = (o0O0OOOo) obj2;
                Objects.requireNonNull(o0o0oooo.f770OooO0o);
                o0o0oooo.f770OooO0o.OooOOOo((o0oO0O0o) obj);
                break;
            default:
                final o000 o000Var = (o000) obj2;
                final SurfaceOutput surfaceOutput = (SurfaceOutput) obj;
                Surface surfaceO0000OO0 = surfaceOutput.o0000OO0(o000Var.f1472OooO0o, new OooO00o() { // from class: OoooOo0.o000OO
                    @Override // o000OO.OooO00o
                    public final void accept(Object obj3) throws IOException {
                        o000 o000Var2 = o000Var;
                        o000Var2.getClass();
                        SurfaceOutput surfaceOutput2 = surfaceOutput;
                        surfaceOutput2.close();
                        Surface surface = (Surface) o000Var2.f1477OooOO0O.remove(surfaceOutput2);
                        if (surface != null) {
                            o000Oo0 o000oo1 = o000Var2.f1471OooO0Oo;
                            o000oo1.OooO0Oo(true);
                            o000oo1.OooO0OO();
                            o000oo1.OooOOo(surface, true);
                        }
                    }
                });
                o000Oo0 o000oo1 = o000Var.f1471OooO0Oo;
                o000oo1.OooO0Oo(true);
                o000oo1.OooO0OO();
                HashMap map = o000oo1.f1553OooO0O0;
                if (!map.containsKey(surfaceO0000OO0)) {
                    map.put(surfaceO0000OO0, o000Oo0.f1550OooOo00);
                }
                o000Var.f1477OooOO0O.put(surfaceOutput, surfaceO0000OO0);
                break;
        }
    }
}
