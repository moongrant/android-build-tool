package p109o000ooo;

import android.view.View;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import p321o0O0ooO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final View f35821OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public volatile Deferred<? extends o00oO0o> f35822OooO0O0;

    public o000000(@NotNull View view, @NotNull Deferred<? extends o00oO0o> deferred) {
        this.f35821OooO00o = view;
        this.f35822OooO0O0 = deferred;
    }

    @Override // p109o000ooo.o00O0O
    public final void dispose() {
        boolean z;
        o000000O o000000oOooO0OO = o000O0O0.OooO0OO(this.f35821OooO00o);
        synchronized (o000000oOooO0OO) {
            z = this != o000000oOooO0OO.f35825OooO0o0;
        }
        if (z) {
            return;
        }
        o000O0O0.OooO0OO(this.f35821OooO00o).OooO00o();
    }
}
