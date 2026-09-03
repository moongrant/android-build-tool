package p651o0ooo00O;

import java.io.IOException;
import p639o0ooOO0o.oo0oOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O00 extends oo0oOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OOo f59892OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(String str, o000OOo o000ooo2) {
        super(str, true);
        this.f59892OooO0o0 = o000ooo2;
    }

    @Override // p639o0ooOO0o.oo0oOO0
    public final long OooO00o() {
        o000OOo o000ooo2 = this.f59892OooO0o0;
        o000ooo2.getClass();
        try {
            o000ooo2.f59963OooOoo0.OooO0oo(2, 0, false);
            return -1L;
        } catch (IOException e) {
            o000ooo2.OooO0OO(e);
            return -1L;
        }
    }
}
