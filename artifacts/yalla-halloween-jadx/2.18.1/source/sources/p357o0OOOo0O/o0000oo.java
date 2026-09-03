package p357o0OOOo0O;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import p375o0OOo0oo.o0OOO0o;
import p375o0OOo0oo.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo<T> implements o0OOO0o<T>, o0ooOOo<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f38350OooO0OO = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public o0ooOOo.OooO00o<T> f38351OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile o0OOO0o<T> f38352OooO0O0;

    public o0000oo(o0ooOOo.OooO00o<T> oooO00o, o0OOO0o<T> o0ooo0o2) {
        this.f38351OooO00o = oooO00o;
        this.f38352OooO0O0 = o0ooo0o2;
    }

    public final void OooO00o(@NonNull final o0ooOOo.OooO00o<T> oooO00o) {
        o0OOO0o<T> o0ooo0o2;
        o0OOO0o<T> o0ooo0o3 = this.f38352OooO0O0;
        o0000O00 o0000o00 = o0000O00.f38347OooO00o;
        if (o0ooo0o3 != o0000o00) {
            oooO00o.OooO0O0(o0ooo0o3);
            return;
        }
        o0OOO0o<T> o0ooo0o4 = null;
        synchronized (this) {
            o0ooo0o2 = this.f38352OooO0O0;
            if (o0ooo0o2 != o0000o00) {
                o0ooo0o4 = o0ooo0o2;
            } else {
                final o0ooOOo.OooO00o<T> oooO00o2 = this.f38351OooO00o;
                this.f38351OooO00o = new o0ooOOo.OooO00o() { // from class: o0OOOo0O.o0000
                    @Override // o0OOo0oo.o0ooOOo.OooO00o
                    public final void OooO0O0(o0OOO0o o0ooo0o5) {
                        o0ooOOo.OooO00o oooO00o3 = oooO00o2;
                        o0ooOOo.OooO00o oooO00o4 = oooO00o;
                        oooO00o3.OooO0O0(o0ooo0o5);
                        oooO00o4.OooO0O0(o0ooo0o5);
                    }
                };
            }
        }
        if (o0ooo0o4 != null) {
            oooO00o.OooO0O0(o0ooo0o2);
        }
    }

    @Override // p375o0OOo0oo.o0OOO0o
    public final T get() {
        return this.f38352OooO0O0.get();
    }
}
