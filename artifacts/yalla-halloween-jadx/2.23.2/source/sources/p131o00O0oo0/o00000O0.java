package p131o00O0oo0;

import android.view.View;
import kotlinx.coroutines.Deferred;
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 implements oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final View f36797OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public volatile Deferred<? extends o0Oo0oo> f36798OooO0O0;

    public o00000O0(@NotNull View view, @NotNull Deferred<? extends o0Oo0oo> deferred) {
        this.f36797OooO00o = view;
        this.f36798OooO0O0 = deferred;
    }

    @Override // p131o00O0oo0.oo000o
    public final void dispose() {
        boolean z;
        o00000O o00000oOooO0OO = OooOo00.OooO0OO(this.f36797OooO00o);
        synchronized (o00000oOooO0OO) {
            z = this != o00000oOooO0OO.f36793OooO0o0;
        }
        if (z) {
            return;
        }
        OooOo00.OooO0OO(this.f36797OooO00o).OooO00o();
    }
}
