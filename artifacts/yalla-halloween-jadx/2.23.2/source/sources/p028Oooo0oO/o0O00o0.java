package p028Oooo0oO;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00o0 extends DeferrableSurface {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ SurfaceRequest f1168OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o0(SurfaceRequest surfaceRequest, Size size) {
        super(34, size);
        this.f1168OooOOO0 = surfaceRequest;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    @NonNull
    public final OooOO0O<Surface> OooO0oO() {
        return this.f1168OooOOO0.f3506OooO0o;
    }
}
