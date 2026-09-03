package p028Oooo0oO;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class o0oOO extends DeferrableSurface {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ SurfaceRequest f1202OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(SurfaceRequest surfaceRequest, Size size) {
        super(34, size);
        this.f1202OooOOO0 = surfaceRequest;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    @NonNull
    public final OooO00o<Surface> OooO0oO() {
        return this.f1202OooOOO0.f3508OooO0o;
    }
}
