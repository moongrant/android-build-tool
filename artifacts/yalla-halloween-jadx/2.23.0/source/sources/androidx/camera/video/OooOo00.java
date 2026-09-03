package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.CancellationException;
import p028Oooo0oO.o00O0O0;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 implements p030OoooO.OooOOO0<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ com.google.common.util.concurrent.OooO00o f4025OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f4026OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f4027OooO0OO;

    public OooOo00(OooOOOO oooOOOO, o00O000.OooO0o oooO0o, boolean z) {
        this.f4027OooO0OO = oooOOOO;
        this.f4025OooO00o = oooO0o;
        this.f4026OooO0O0 = z;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        o00O0O0.OooO0OO("VideoCapture", "Surface update completed with unexpected exception", th);
    }

    @Override // p030OoooO.OooOOO0
    public final void onSuccess(@Nullable Void r3) {
        VideoOutput.SourceState sourceState;
        OooOOOO oooOOOO = this.f4027OooO0OO;
        if (this.f4025OooO00o != oooOOOO.f4007OooOOo || (sourceState = oooOOOO.f4012OooOo00) == VideoOutput.SourceState.INACTIVE) {
            return;
        }
        VideoOutput.SourceState sourceState2 = this.f4026OooO0O0 ? VideoOutput.SourceState.ACTIVE_STREAMING : VideoOutput.SourceState.ACTIVE_NON_STREAMING;
        if (sourceState2 != sourceState) {
            oooOOOO.f4012OooOo00 = sourceState2;
            oooOOOO.Oooo0O0().OooO0Oo(sourceState2);
        }
    }
}
