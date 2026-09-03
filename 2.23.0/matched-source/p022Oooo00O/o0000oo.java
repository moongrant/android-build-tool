package p022Oooo00O;

import android.text.TextUtils;
import androidx.camera.core.OooOOOO;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.OooO;
import androidx.camera.view.OooO0OO;
import com.facebook.appevents.codeless.ViewIndexer;
import java.util.ArrayList;
import java.util.List;
import o000OO.OooOOO0;
import p437o0OoOo0.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f500OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f501OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f502OooO0o0;

    public /* synthetic */ o0000oo(int i, Object obj, Object obj2) {
        this.f500OooO0Oo = i;
        this.f502OooO0o0 = obj;
        this.f501OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f500OooO0Oo) {
            case 0:
                o000OO o000oo2 = (o000OO) this.f502OooO0o0;
                List<o000OO.OooOOO0> list = (List) this.f501OooO0o;
                o000oo2.getClass();
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (o000OO.OooOOO0 oooOOO0 : list) {
                    if (o000oo2.f550OooO0Oo.OooO0Oo(oooOOO0.OooO0Oo())) {
                        o000oo2.f550OooO0Oo.f3746OooO0O0.remove(oooOOO0.OooO0Oo());
                        arrayList.add(oooOOO0.OooO0Oo());
                        if (oooOOO0.OooO0o0() == OooOOOO.class) {
                            z = true;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    o000oo2.OooOo00("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera", null);
                    if (z) {
                        o000oo2.f556OooOO0O.f845OooO0oo.getClass();
                    }
                    o000oo2.OooOOo0();
                    if (o000oo2.f550OooO0Oo.OooO0OO().isEmpty()) {
                        o000oo2.f556OooOO0O.f848OooOO0o.f823OooO0OO = false;
                    } else {
                        o000oo2.Oooo0o();
                    }
                    if (o000oo2.f550OooO0Oo.OooO0O0().isEmpty()) {
                        o000oo2.f556OooOO0O.OooOO0O();
                        o000oo2.OooOooo();
                        o000oo2.f556OooOO0O.OooOOoo(false);
                        o000oo2.f561OooOOOo = o000oo2.OooOoO();
                        o000oo2.OooOo00("Closing camera.", null);
                        int i = o000OO.OooO0O0.f579OooO00o[o000oo2.f554OooO0oo.ordinal()];
                        if (i == 2) {
                            OooOOO0.OooO0o(null, o000oo2.f558OooOOO == null);
                            o000oo2.Oooo000(o000OO.OooOO0.INITIALIZED);
                        } else if (i == 4 || i == 5) {
                            o000oo2.Oooo000(o000OO.OooOO0.CLOSING);
                            o000oo2.OooOOo();
                        } else if (i == 6 || i == 7) {
                            boolean zOooO00o = o000oo2.f557OooOO0o.OooO00o();
                            o000oo2.Oooo000(o000OO.OooOO0.CLOSING);
                            if (zOooO00o) {
                                OooOOO0.OooO0o(null, o000oo2.OooOoO0());
                                o000oo2.OooOo0();
                            }
                        } else {
                            o000oo2.OooOo00("close() ignored due to being in state: " + o000oo2.f554OooO0oo, null);
                        }
                    } else {
                        o000oo2.Oooo0o0();
                        o000oo2.OooOooo();
                        if (o000oo2.f554OooO0oo == o000OO.OooOO0.OPENED) {
                            o000oo2.OooOoo0();
                        }
                    }
                    break;
                }
                break;
            case 1:
                OooO oooO = (OooO) this.f502OooO0o0;
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.f501OooO0o;
                SurfaceRequest surfaceRequest2 = oooO.f4101OooO0oo;
                if (surfaceRequest2 != null && surfaceRequest2 == surfaceRequest) {
                    oooO.f4101OooO0oo = null;
                    oooO.f4100OooO0oO = null;
                }
                OooO0OO.OooO00o oooO00o = oooO.f4104OooOO0o;
                if (oooO00o != null) {
                    ((o000oOoO) oooO00o).OooO00o();
                    oooO.f4104OooOO0o = null;
                }
                break;
            default:
                ViewIndexer.m4083sendToServer$lambda1((String) this.f502OooO0o0, (ViewIndexer) this.f501OooO0o);
                break;
        }
    }
}
