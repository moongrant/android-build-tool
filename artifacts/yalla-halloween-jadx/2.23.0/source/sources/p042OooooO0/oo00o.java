package p042OooooO0;

import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.audio.OooO00o;
import p045Oooooo.o000OO0O;
import p245o00oo0o.o0O00;
import p247o00oo0oO.o0oOOo;
import p247o00oo0oO.oo00oO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1807OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1808OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1809OooO0o0;

    public /* synthetic */ oo00o(int i, Object obj, Object obj2) {
        this.f1807OooO0Oo = i;
        this.f1809OooO0o0 = obj;
        this.f1808OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1807OooO0Oo;
        Object obj = this.f1808OooO0o;
        Object obj2 = this.f1809OooO0o0;
        switch (i) {
            case 0:
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
            default:
                oo00oO.OooO00o oooO00o2 = (oo00oO.OooO00o) obj2;
                oooO00o2.getClass();
                int i3 = o0O00.f40595OooO00o;
                oooO00o2.f40869OooO0O0.onVideoSizeChanged((o0oOOo) obj);
                return;
        }
    }
}
