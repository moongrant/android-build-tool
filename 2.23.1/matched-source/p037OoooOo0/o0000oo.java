package p037OoooOo0;

import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.OooO;
import androidx.camera.view.OooO0OO;
import com.google.common.util.concurrent.OooOO0O;
import p028Oooo0oO.o00O0O0;
import p442o0OoOo0.o0ooOOo;
import p642o0ooOO0.o000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1521OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1522OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1523OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f1524OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Object f1525OooO0oo;

    public /* synthetic */ o0000oo(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f1521OooO0Oo = i;
        this.f1523OooO0o0 = obj;
        this.f1522OooO0o = obj2;
        this.f1524OooO0oO = obj3;
        this.f1525OooO0oo = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1521OooO0Oo;
        Object obj = this.f1525OooO0oo;
        Object obj2 = this.f1524OooO0oO;
        Object obj3 = this.f1522OooO0o;
        Object obj4 = this.f1523OooO0o0;
        switch (i) {
            case 0:
                o000 o000Var = (o000) obj4;
                DynamicRange dynamicRange = (DynamicRange) obj3;
                o000O00O o000o00o2 = (o000O00O) obj2;
                o000O0.OooO00o oooO00o = (o000O0.OooO00o) obj;
                o000Var.getClass();
                try {
                    o000Var.f1474OooO0Oo.OooOO0o(dynamicRange, o000o00o2);
                    oooO00o.OooO0O0(null);
                } catch (RuntimeException e) {
                    oooO00o.OooO0OO(e);
                }
                break;
            default:
                OooO oooO = (OooO) obj4;
                Surface surface = (Surface) obj3;
                OooOO0O oooOO0O = (OooOO0O) obj2;
                SurfaceRequest surfaceRequest = (SurfaceRequest) obj;
                oooO.getClass();
                o00O0O0.OooO00o("TextureViewImpl", "Safe to release surface.");
                OooO0OO.OooO00o oooO00o2 = oooO.f4107OooOO0o;
                if (oooO00o2 != null) {
                    ((o0ooOOo) oooO00o2).OooO00o();
                    oooO.f4107OooOO0o = null;
                }
                surface.release();
                if (oooO.f4103OooO0oO == oooOO0O) {
                    oooO.f4103OooO0oO = null;
                }
                if (oooO.f4104OooO0oo == surfaceRequest) {
                    oooO.f4104OooO0oo = null;
                }
                break;
        }
    }
}
