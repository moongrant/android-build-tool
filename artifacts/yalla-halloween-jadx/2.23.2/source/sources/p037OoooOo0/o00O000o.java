package p037OoooOo0;

import android.graphics.RectF;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.media3.session.o000OO0O;
import java.util.Map;
import p031OoooO0.o0OO00O;
import p080o000OoO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O000o implements SurfaceRequest.OooO0o, o00000O0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1569OooO0Oo;

    public /* synthetic */ o00O000o(Object obj) {
        this.f1569OooO0Oo = obj;
    }

    @Override // androidx.camera.core.SurfaceRequest.OooO0o
    public final void OooO00o(SurfaceRequest.OooO0OO oooO0OO) {
        for (Map.Entry entry : ((Map) this.f1569OooO0Oo).entrySet()) {
            int iOooO0O0 = oooO0OO.OooO0O0() - ((SurfaceProcessorNode.OooO0OO) entry.getKey()).OooO0Oo();
            if (((SurfaceProcessorNode.OooO0OO) entry.getKey()).OooO0OO()) {
                iOooO0O0 = -iOooO0O0;
            }
            RectF rectF = o0OO00O.f1384OooO00o;
            ((o00) entry.getValue()).OooO0o(((iOooO0O0 % 360) + 360) % 360, -1);
        }
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((o000OO0O.OooO0OO) this.f1569OooO0Oo).getClass();
        throw null;
    }
}
