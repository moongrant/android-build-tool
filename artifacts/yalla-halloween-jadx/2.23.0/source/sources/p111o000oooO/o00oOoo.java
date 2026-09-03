package p111o000oooO;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p097o000o0oO.o000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oOoo implements o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f35936OooO00o;

    public o00oOoo(@NotNull Context context) {
        this.f35936OooO00o = context;
    }

    @Override // p111o000oooO.o00O00O
    @Nullable
    public final Object OooO00o(@NotNull o000O00 o000o01) {
        DisplayMetrics displayMetrics = this.f35936OooO00o.getResources().getDisplayMetrics();
        o0O0ooO.OooO00o oooO00o = new o0O0ooO.OooO00o(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new o00O00(oooO00o, oooO00o);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00oOoo) {
            if (Intrinsics.areEqual(this.f35936OooO00o, ((o00oOoo) obj).f35936OooO00o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35936OooO00o.hashCode();
    }
}
