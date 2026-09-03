package p655o0ooo0O;

import java.io.IOException;
import p652o0ooo000.o00000O;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0000Oo extends o00000O {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOo000 f59523OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000Oo(String str, o0OOo000 o0ooo001) {
        super(str, true);
        this.f59523OooO0o0 = o0ooo001;
    }

    @Override // p652o0ooo000.o00000O
    public final long OooO00o() {
        o0OOo000 o0ooo001 = this.f59523OooO0o0;
        o0ooo001.getClass();
        try {
            o0ooo001.f59476OooOoo0.OooO0oo(2, 0, false);
            return -1L;
        } catch (IOException e) {
            o0ooo001.OooO0OO(e);
            return -1L;
        }
    }
}
