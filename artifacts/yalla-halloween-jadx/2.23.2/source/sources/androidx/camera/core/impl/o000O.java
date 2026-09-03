package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000O extends DeferrableSurface {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Surface f3682OooOOO0;

    public o000O(@NonNull Surface surface, @NonNull Size size, int i) {
        super(i, size);
        this.f3682OooOOO0 = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    @NonNull
    public final com.google.common.util.concurrent.OooOO0O<Surface> OooO0oO() {
        return p030OoooO.OooOo.OooO0Oo(this.f3682OooOOO0);
    }

    public o000O(@NonNull Surface surface) {
        this.f3682OooOOO0 = surface;
    }
}
