package p029Oooo0oo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p030OoooO.OooOOO0;
import p031OoooO0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO0o implements OooOOO0<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OO000 f1311OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0OO0oO0 f1312OooO0O0;

    public o0OO0o(o0OO0oO0 o0oo0oo1, o0OO000 o0oo000) {
        this.f1312OooO0O0 = o0oo0oo1;
        this.f1311OooO00o = o0oo000;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
        o0Oo0oo.OooO00o();
        o0OO0oO0 o0oo0oo1 = this.f1312OooO0O0;
        if (this.f1311OooO00o == o0oo0oo1.f1314OooO00o) {
            o0oo0oo1.f1314OooO00o = null;
        }
    }

    @Override // p030OoooO.OooOOO0
    public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Void r1) {
    }
}
