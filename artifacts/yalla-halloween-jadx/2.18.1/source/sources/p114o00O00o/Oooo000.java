package p114o00O00o;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 implements OooO0O0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f30326Oooo0o;

    public Oooo000(OooOo00 oooOo00) {
        this.f30326Oooo0o = oooOo00;
    }

    @Override // o00O0OO.OooO0O0
    public final void OooO00o(@NotNull Drawable result) {
        Intrinsics.checkNotNullParameter(result, "result");
    }

    @Override // o00O0OO.OooO0O0
    public final void OooO0O0(@Nullable Drawable drawable) {
        OooOo00.OooOO0O(this.f30326Oooo0o, new OooOo00.OooO0OO.C0331OooO0OO(drawable == null ? null : OooOOO0.OooO00o(drawable)));
    }

    @Override // o00O0OO.OooO0O0
    public final void onError() {
    }
}
