package p145o00Oo0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 implements o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Bitmap f32050OooO00o;

    public OooOo00(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f32050OooO00o = bitmap;
    }

    @Override // p145o00Oo0.o0000oo
    public final void OooO00o() {
        this.f32050OooO00o.prepareToDraw();
    }

    @Override // p145o00Oo0.o0000oo
    public final int OooO0O0() {
        Bitmap.Config config = this.f32050OooO00o.getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "bitmap.config");
        return OooOo.OooO0OO(config);
    }

    @Override // p145o00Oo0.o0000oo
    public final int getHeight() {
        return this.f32050OooO00o.getHeight();
    }

    @Override // p145o00Oo0.o0000oo
    public final int getWidth() {
        return this.f32050OooO00o.getWidth();
    }
}
