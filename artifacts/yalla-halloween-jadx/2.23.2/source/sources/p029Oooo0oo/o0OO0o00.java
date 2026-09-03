package p029Oooo0oo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p030OoooO.OooOOO0;
import p031OoooO0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO0o00 implements OooOOO0<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OO000 f1289OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0OO0o f1290OooO0O0;

    public o0OO0o00(o0OO0o o0oo0o2, o0OO000 o0oo000) {
        this.f1290OooO0O0 = o0oo0o2;
        this.f1289OooO00o = o0oo000;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
        o0Oo0oo.OooO00o();
        o0OO0o o0oo0o2 = this.f1290OooO0O0;
        if (this.f1289OooO00o == o0oo0o2.f1287OooO00o) {
            o0oo0o2.f1287OooO00o = null;
        }
    }

    @Override // p030OoooO.OooOOO0
    public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Void r1) {
    }
}
