package p130o00O0oo;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p118o00O0Oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00 implements o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f36768OooO00o;

    public o000O00(@NotNull Context context) {
        this.f36768OooO00o = context;
    }

    @Override // p130o00O0oo.o000OO0O
    @Nullable
    public final Object OooO0O0(@NotNull o0000 o0000Var) {
        DisplayMetrics displayMetrics = this.f36768OooO00o.getResources().getDisplayMetrics();
        o000Oo0.OooO00o oooO00o = new o000Oo0.OooO00o(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new o000O0Oo(oooO00o, oooO00o);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o000O00) {
            if (Intrinsics.areEqual(this.f36768OooO00o, ((o000O00) obj).f36768OooO00o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36768OooO00o.hashCode();
    }
}
