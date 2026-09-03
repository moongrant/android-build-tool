package p337o0OO0ooO;

import java.io.IOException;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000OO0;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo extends o0000OO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000000O f43381OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(o000000O o000000o2, o00O0000 o00o0001) {
        super(o00o0001);
        this.f43381OooO0o0 = o000000o2;
    }

    @Override // p659o0oooO00.o0000OO0, p659o0oooO00.o00O00
    public final long o0000OO0(o00000O o00000o, long j) throws IOException {
        o000000O o000000o2 = this.f43381OooO0o0;
        int i = o000000o2.f43365OooO0O0;
        if (i == 0) {
            return -1L;
        }
        long jO0000OO0 = super.o0000OO0(o00000o, Math.min(j, i));
        if (jO0000OO0 == -1) {
            return -1L;
        }
        o000000o2.f43365OooO0O0 = (int) (((long) o000000o2.f43365OooO0O0) - jO0000OO0);
        return jO0000OO0;
    }
}
