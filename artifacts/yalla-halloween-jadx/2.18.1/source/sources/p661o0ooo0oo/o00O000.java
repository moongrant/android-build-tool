package p661o0ooo0oo;

import java.io.IOException;
import p664o0oooO00.oo0o0Oo;
import p674o0oooo0.o00Oo00;
import p674o0oooo0.o0O000Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000 extends oo0o0Oo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0ooO f51495OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(o0O0ooO o0o0ooo, String str) {
        super(str, true);
        this.f51495OooO0o0 = o0o0ooo;
    }

    @Override // p664o0oooO00.oo0o0Oo
    public final long OooO00o() {
        synchronized (this.f51495OooO0o0) {
            o0O0ooO o0o0ooo = this.f51495OooO0o0;
            if (!o0o0ooo.f51518OoooOOO || o0o0ooo.f51519OoooOOo) {
                return -1L;
            }
            try {
                o0o0ooo.Oooo00o();
            } catch (IOException unused) {
                this.f51495OooO0o0.f51520OoooOo0 = true;
            }
            try {
                if (this.f51495OooO0o0.OooOOO()) {
                    this.f51495OooO0o0.OooOoOO();
                    this.f51495OooO0o0.f51513OoooO = 0;
                }
            } catch (IOException unused2) {
                o0O0ooO o0o0ooo2 = this.f51495OooO0o0;
                o0o0ooo2.f51521OoooOoO = true;
                o0o0ooo2.f51514OoooO0 = o0O000Oo.OooO0O0(new o00Oo00());
            }
            return -1L;
        }
    }
}
