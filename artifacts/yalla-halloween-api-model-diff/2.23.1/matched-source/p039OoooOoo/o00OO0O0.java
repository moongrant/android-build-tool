package p039OoooOoo;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.OooO0OO;
import androidx.camera.video.OooOO0;
import androidx.camera.video.OooOO0O;
import androidx.camera.video.VideoOutput;
import java.util.Set;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOOO0;
import p030OoooO.OooOo;
import p033OoooO0O.o0O0O00;
import p045Oooooo.o0000Ooo;
import p045Oooooo.o00O0000;
import p045Oooooo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO0O0 implements OooOOO0<o00O0O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O00OOO f1674OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f1675OooO0O0;

    public o00OO0O0(OooOO0O oooOO0O, o0O00OOO o0o00ooo2) {
        this.f1675OooO0O0 = oooOO0O;
        this.f1674OooO00o = o0o00ooo2;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
        OooO0OO oooO0OO;
        o00O0O0.OooO00o("Recorder", "VideoEncoder Setup error: " + th);
        OooOO0O oooOO0O = this.f1675OooO0O0;
        synchronized (oooOO0O.f3926OooO0o) {
            try {
                oooO0OO = null;
                switch (OooOO0O.OooOO0.f3985OooO00o[oooOO0O.f3929OooO0oo.ordinal()]) {
                    case 1:
                    case 2:
                    case 5:
                    case 6:
                    case 9:
                        throw new AssertionError("Encountered encoder setup error while in unexpected state " + oooOO0O.f3929OooO0oo + ": " + th);
                    case 3:
                    case 4:
                        OooO0OO oooO0OO2 = oooOO0O.f3932OooOO0o;
                        oooOO0O.f3932OooOO0o = null;
                        oooO0OO = oooO0OO2;
                    case 7:
                        oooOO0O.OooOoo0(-1);
                        oooOO0O.OooOoOO(OooOO0O.OooOOO.ERROR);
                        break;
                    case 8:
                    default:
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (oooO0OO != null) {
            oooOO0O.OooO0oo(oooO0OO, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9 A[Catch: all -> 0x00da, TryCatch #0 {all -> 0x00da, blocks: (B:19:0x0081, B:20:0x008b, B:47:0x00fa, B:22:0x0090, B:23:0x0099, B:24:0x00a0, B:27:0x00a5, B:28:0x00ac, B:29:0x00ad, B:30:0x00c0, B:33:0x00c4, B:36:0x00c9, B:38:0x00cf, B:41:0x00dc, B:44:0x00ea), top: B:59:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf A[Catch: all -> 0x00da, TryCatch #0 {all -> 0x00da, blocks: (B:19:0x0081, B:20:0x008b, B:47:0x00fa, B:22:0x0090, B:23:0x0099, B:24:0x00a0, B:27:0x00a5, B:28:0x00ac, B:29:0x00ad, B:30:0x00c0, B:33:0x00c4, B:36:0x00c9, B:38:0x00cf, B:41:0x00dc, B:44:0x00ea), top: B:59:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc A[Catch: all -> 0x00da, TryCatch #0 {all -> 0x00da, blocks: (B:19:0x0081, B:20:0x008b, B:47:0x00fa, B:22:0x0090, B:23:0x0099, B:24:0x00a0, B:27:0x00a5, B:28:0x00ac, B:29:0x00ad, B:30:0x00c0, B:33:0x00c4, B:36:0x00c9, B:38:0x00cf, B:41:0x00dc, B:44:0x00ea), top: B:59:0x0081 }] */
    @Override // p030OoooO.OooOOO0
    public final void onSuccess(@Nullable o00O0O o00o0o2) {
        boolean z;
        OooO0OO oooO0OO;
        int i;
        o00O0O o00o0o3 = o00o0o2;
        o00O0O0.OooO00o("Recorder", "VideoEncoder is created. " + o00o0o3);
        if (o00o0o3 == null) {
            return;
        }
        boolean z2 = false;
        OooOO0O.OooOOO0 oooOOO0OooOOOO = null;
        o000OO.OooOOO0.OooO0o(null, this.f1675OooO0O0.f3970OoooOo0 == this.f1674OooO00o);
        o000OO.OooOOO0.OooO0o(null, this.f1675OooO0O0.f3948OooOoo == null);
        final OooOO0O oooOO0O = this.f1675OooO0O0;
        o0O00OOO o0o00ooo2 = this.f1674OooO00o;
        oooOO0O.getClass();
        o0000Ooo o0000ooo = o0o00ooo2.f1711OooO0Oo;
        oooOO0O.f3948OooOoo = o0000ooo;
        ((o00O0000) o0000ooo.f1896OooO0oO).OooO0o0();
        oooOO0O.f3948OooOoo.OooO0O0();
        Surface surface = o0o00ooo2.f1707OooO != o0O00OOO.OooO0O0.READY ? null : o0o00ooo2.f1713OooO0o0;
        oooOO0O.f3946OooOoO0 = surface;
        oooOO0O.OooOoO(surface);
        o0O0O00 o0o0o00 = oooOO0O.f3924OooO0OO;
        o00O0O.OooO0OO.OooO00o oooO00o = new o00O0O.OooO0OO.OooO00o() { // from class: OoooOoo.o00O0
            @Override // Oooooo.o00O0O.OooO0OO.OooO00o
            public final void OooO00o(Surface surface2) {
                oooOO0O.OooOoO(surface2);
            }
        };
        o0o00ooo2.f1714OooO0oO = o0o0o00;
        o0o00ooo2.f1715OooO0oo = oooO00o;
        com.google.common.util.concurrent.OooOO0O oooOO0OOooO0o0 = OooOo.OooO0o0(o0o00ooo2.f1718OooOO0o);
        oooOO0OOooO0o0.OooO0oo(new OooOo.OooO0O0(oooOO0OOooO0o0, new OooOO0(oooOO0O, o0o00ooo2)), o0o0o00);
        OooOO0O oooOO0O2 = this.f1675OooO0O0;
        synchronized (oooOO0O2.f3926OooO0o) {
            try {
                switch (OooOO0O.OooOO0.f3985OooO00o[oooOO0O2.f3929OooO0oo.ordinal()]) {
                    case 1:
                        z = true;
                        o000OO.OooOOO0.OooO0o("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", oooOO0O2.OooOOO0());
                        oooO0OO = null;
                        i = 0;
                        z2 = true;
                        break;
                    case 2:
                        z = false;
                        o000OO.OooOOO0.OooO0o("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", oooOO0O2.OooOOO0());
                        oooO0OO = null;
                        i = 0;
                        z2 = true;
                        break;
                    case 3:
                        z = true;
                        if (oooOO0O2.f3931OooOO0O != null) {
                            oooO0OO = null;
                            i = 0;
                        } else if (oooOO0O2.f3973o000oOoO == VideoOutput.SourceState.INACTIVE) {
                            oooO0OO = oooOO0O2.f3932OooOO0o;
                            oooOO0O2.f3932OooOO0o = null;
                            oooOO0O2.OooOo0O();
                            Set<OooOO0O.OooOOO> set = OooOO0O.f3915Ooooo00;
                            i = 4;
                        } else {
                            i = 0;
                            oooO0OO = null;
                            oooOOO0OooOOOO = oooOO0O2.OooOOOO(oooOO0O2.f3929OooO0oo);
                        }
                        break;
                    case 4:
                        z = false;
                        if (oooOO0O2.f3931OooOO0O != null) {
                            oooO0OO = null;
                            i = 0;
                        } else if (oooOO0O2.f3973o000oOoO == VideoOutput.SourceState.INACTIVE) {
                            oooO0OO = oooOO0O2.f3932OooOO0o;
                            oooOO0O2.f3932OooOO0o = null;
                            oooOO0O2.OooOo0O();
                            Set<OooOO0O.OooOOO> set2 = OooOO0O.f3915Ooooo00;
                            i = 4;
                        } else {
                            i = 0;
                            oooO0OO = null;
                            oooOOO0OooOOOO = oooOO0O2.OooOOOO(oooOO0O2.f3929OooO0oo);
                        }
                        break;
                    case 5:
                    case 9:
                        throw new AssertionError("Incorrectly invoke onConfigured() in state " + oooOO0O2.f3929OooO0oo);
                    case 6:
                        if (!oooOO0O2.f3928OooO0oO) {
                            throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                        }
                        z = false;
                        oooO0OO = null;
                        i = 0;
                        break;
                        break;
                    case 7:
                        oooOO0O2.OooOoOO(OooOO0O.OooOOO.IDLING);
                        z = false;
                        oooO0OO = null;
                        i = 0;
                        break;
                    case 8:
                        o00O0O0.OooO0O0("Recorder", "onConfigured() was invoked when the Recorder had encountered error");
                        z = false;
                        oooO0OO = null;
                        i = 0;
                        break;
                    default:
                        z = false;
                        oooO0OO = null;
                        i = 0;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            oooOO0O2.Oooo00O(oooOO0O2.f3933OooOOO, true);
            oooOO0O2.f3948OooOoo.OooOOO();
            if (z) {
                oooOO0O2.f3948OooOoo.OooO0o();
                return;
            }
            return;
        }
        if (oooOOO0OooOOOO != null) {
            oooOO0O2.OooOooo(oooOOO0OooOOOO, z);
        } else if (oooO0OO != null) {
            oooOO0O2.OooO0oo(oooO0OO, i);
        }
    }
}
