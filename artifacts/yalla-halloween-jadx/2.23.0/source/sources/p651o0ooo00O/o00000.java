package p651o0ooo00O;

import java.io.IOException;
import p639o0ooOO0o.oo0oOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class o00000 extends oo0oOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f59858OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OOo f59859OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f59860OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(String str, o000OOo o000ooo2, int i, int i2) {
        super(str, true);
        this.f59859OooO0o0 = o000ooo2;
        this.f59858OooO0o = i;
        this.f59860OooO0oO = i2;
    }

    @Override // p639o0ooOO0o.oo0oOO0
    public final long OooO00o() {
        int i = this.f59858OooO0o;
        int i2 = this.f59860OooO0oO;
        o000OOo o000ooo2 = this.f59859OooO0o0;
        o000ooo2.getClass();
        try {
            o000ooo2.f59963OooOoo0.OooO0oo(i, i2, true);
            return -1L;
        } catch (IOException e) {
            o000ooo2.OooO0OO(e);
            return -1L;
        }
    }
}
