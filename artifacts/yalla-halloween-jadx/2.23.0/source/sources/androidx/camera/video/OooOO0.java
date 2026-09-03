package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.ScheduledFuture;
import p028Oooo0oO.o00O0O0;
import p039OoooOoo.o0O000Oo;
import p045Oooooo.o0000Ooo;
import p045Oooooo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements p030OoooO.OooOOO0<o00O0O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O000Oo f3910OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f3911OooO0O0;

    public OooOO0(OooOO0O oooOO0O, o0O000Oo o0o000oo2) {
        this.f3911OooO0O0 = oooOO0O;
        this.f3910OooO00o = o0o000oo2;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
        o00O0O0.OooO00o("Recorder", "Error in ReadyToReleaseFuture: " + th);
    }

    @Override // p030OoooO.OooOOO0
    public final void onSuccess(@Nullable o00O0O o00o0o2) throws Exception {
        o0000Ooo o0000ooo;
        o00O0O o00o0o3 = o00o0o2;
        o00O0O0.OooO00o("Recorder", "VideoEncoder can be released: " + o00o0o3);
        if (o00o0o3 == null) {
            return;
        }
        OooOO0O oooOO0O = this.f3911OooO0O0;
        ScheduledFuture<?> scheduledFuture = oooOO0O.f3965OoooOOO;
        if (scheduledFuture != null && scheduledFuture.cancel(false) && (o0000ooo = oooOO0O.f3945OooOoo) != null && o0000ooo == o00o0o3) {
            OooOO0O.OooOOOo(o0000ooo);
        }
        oooOO0O.f3968OoooOoO = this.f3910OooO00o;
        oooOO0O.OooOoO(null);
        oooOO0O.OooOOoo(oooOO0O.OooOOO0());
    }
}
