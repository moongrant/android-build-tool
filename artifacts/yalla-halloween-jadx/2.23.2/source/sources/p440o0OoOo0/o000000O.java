package p440o0OoOo0;

import android.os.Parcelable;
import android.view.Surface;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.OooO;
import androidx.media3.session.o0000OO0;
import androidx.media3.session.o000oOoO;
import o000OO.OooO00o;
import p028Oooo0oO.o00O0O0;
import p033OoooO0O.o00oO0o;
import p080o000OoO.o0O0O00;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000000O implements o000Oo0.OooO0OO, o0O0O00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f47180OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Parcelable f47181OooO0o0;

    public /* synthetic */ o000000O(Object obj, Surface surface) {
        this.f47180OooO0Oo = obj;
        this.f47181OooO0o0 = surface;
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(final o000Oo0.OooO00o oooO00o) {
        OooO oooO = (OooO) this.f47180OooO0Oo;
        Surface surface = (Surface) this.f47181OooO0o0;
        oooO.getClass();
        o00O0O0.OooO00o("TextureViewImpl", "Surface set on Preview.");
        oooO.f4101OooO0oo.OooO0O0(surface, o00oO0o.OooO00o(), new OooO00o() { // from class: o0OoOo0.o00000
            @Override // o000OO.OooO00o
            public final void accept(Object obj) {
                oooO00o.OooO0O0((SurfaceRequest.Result) obj);
            }
        });
        return "provideSurface[request=" + oooO.f4101OooO0oo + " surface=" + surface + "]";
    }

    @Override // p080o000OoO.o0O0O00
    public final void accept(Object obj) {
        ((o0000OO0) this.f47180OooO0Oo).OooO0o0();
        ((o000oOoO.OooO00o) obj).OooO00o();
    }
}
