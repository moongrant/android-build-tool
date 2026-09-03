package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import java.util.List;
import p037OoooOo0.o00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends SurfaceProcessorNode.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00 f3829OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<SurfaceProcessorNode.OooO0OO> f3830OooO0O0;

    public OooO00o(o00 o00Var, List<SurfaceProcessorNode.OooO0OO> list) {
        if (o00Var == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f3829OooO00o = o00Var;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f3830OooO0O0 = list;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OooO0O0
    @NonNull
    public final List<SurfaceProcessorNode.OooO0OO> OooO00o() {
        return this.f3830OooO0O0;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OooO0O0
    @NonNull
    public final o00 OooO0O0() {
        return this.f3829OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceProcessorNode.OooO0O0)) {
            return false;
        }
        SurfaceProcessorNode.OooO0O0 oooO0O0 = (SurfaceProcessorNode.OooO0O0) obj;
        return this.f3829OooO00o.equals(oooO0O0.OooO0O0()) && this.f3830OooO0O0.equals(oooO0O0.OooO00o());
    }

    public final int hashCode() {
        return ((this.f3829OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f3830OooO0O0.hashCode();
    }

    public final String toString() {
        return "In{surfaceEdge=" + this.f3829OooO00o + ", outConfigs=" + this.f3830OooO0O0 + "}";
    }
}
