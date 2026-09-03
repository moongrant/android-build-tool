package p028Oooo0oO;

import androidx.camera.core.OooOOOO;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.audio.OooO00o;
import p045Oooooo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0OOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1134OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1135OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1136OooO0o0;

    public /* synthetic */ o00O0OOO(int i, Object obj, Object obj2) {
        this.f1134OooO0Oo = i;
        this.f1136OooO0o0 = obj;
        this.f1135OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1134OooO0Oo;
        Object obj = this.f1135OooO0o;
        Object obj2 = this.f1136OooO0o0;
        switch (i) {
            case 0:
                ((OooOOOO.OooO0OO) obj2).OooO00o((SurfaceRequest) obj);
                return;
            default:
                OooO00o oooO00o = (OooO00o) obj2;
                BufferProvider<? extends o000OO0O> bufferProvider = (BufferProvider) obj;
                oooO00o.getClass();
                int i2 = OooO00o.OooO0OO.f4066OooO00o[oooO00o.f4046OooO0oO.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                } else {
                    if (oooO00o.f4050OooOO0o != bufferProvider) {
                        oooO00o.OooO0O0(bufferProvider);
                        return;
                    }
                    return;
                }
        }
    }
}
