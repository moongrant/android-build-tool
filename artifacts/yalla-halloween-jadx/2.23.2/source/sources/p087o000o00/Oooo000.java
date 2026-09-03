package p087o000o00;

import java.io.IOException;
import kotlin.UByte;
import o000OOoO.OooOO0O;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O000 f35026OooO00o = new o000O000(8);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f35027OooO0O0;

    public final long OooO00o(OooOO0O oooOO0O) throws IOException {
        o000O000 o000o001 = this.f35026OooO00o;
        int i = 0;
        oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 1, false);
        int i2 = o000o001.f34962OooO00o[0] & UByte.MAX_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        oooOO0O.OooO0OO(o000o001.f34962OooO00o, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (o000o001.f34962OooO00o[i] & UByte.MAX_VALUE) + (i5 << 8);
        }
        this.f35027OooO0O0 = i4 + 1 + this.f35027OooO0O0;
        return i5;
    }
}
