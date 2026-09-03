package p145o00Oo0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements o000O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final PathMeasure f32137OooO00o;

    public o00Oo0(@NotNull PathMeasure internalPathMeasure) {
        Intrinsics.checkNotNullParameter(internalPathMeasure, "internalPathMeasure");
        this.f32137OooO00o = internalPathMeasure;
    }

    @Override // p145o00Oo0.o000O00O
    public final float OooO00o() {
        return this.f32137OooO00o.getLength();
    }

    @Override // p145o00Oo0.o000O00O
    public final boolean OooO0O0(float f, float f2, @NotNull o000O0o destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        PathMeasure pathMeasure = this.f32137OooO00o;
        if (destination instanceof o0OoOo0) {
            return pathMeasure.getSegment(f, f2, ((o0OoOo0) destination).f32146OooO00o, true);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // p145o00Oo0.o000O00O
    public final void OooO0OO(@Nullable o000O0o o000o0o2) {
        Path path;
        PathMeasure pathMeasure = this.f32137OooO00o;
        if (o000o0o2 == null) {
            path = null;
        } else {
            if (!(o000o0o2 instanceof o0OoOo0)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            path = ((o0OoOo0) o000o0o2).f32146OooO00o;
        }
        pathMeasure.setPath(path, false);
    }
}
