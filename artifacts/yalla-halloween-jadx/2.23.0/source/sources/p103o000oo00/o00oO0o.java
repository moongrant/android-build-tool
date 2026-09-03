package p103o000oo00;

import java.io.EOFException;
import kotlin.UByte;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o extends o0000OO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ByteString f35701OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00000O f35702OooO0o0;

    static {
        ByteString byteString = ByteString.f60866OooO0oO;
        f35701OooO0o = ByteString.OooO00o.OooO0O0("0021F904");
    }

    public o00oO0o(@NotNull o0000 o0000Var) {
        super(o0000Var);
        this.f35702OooO0o0 = new o00000O();
    }

    @Override // p659o0oooO00.o0000OO0, p659o0oooO00.o00O00
    public final long o0000OO0(@NotNull o00000O o00000o, long j) throws EOFException {
        long j2;
        request(j);
        o00000O o00000o2 = this.f35702OooO0o0;
        long j3 = -1;
        if (o00000o2.f60177OooO0o0 == 0) {
            return j == 0 ? 0L : -1L;
        }
        long jCoerceAtLeast = 0;
        while (true) {
            ByteString byteString = f35701OooO0o;
            long jOooo00o = j3;
            while (true) {
                jOooo00o = this.f35702OooO0o0.Oooo00o(byteString.data[0], jOooo00o + 1, LongCompanionObject.MAX_VALUE);
                if (jOooo00o == j3 || (request(byteString.data.length) && o00000o2.Oooo00O(jOooo00o, byteString))) {
                    break;
                }
                j3 = -1;
            }
            if (jOooo00o == j3) {
                break;
            }
            jCoerceAtLeast += RangesKt.coerceAtLeast(o00000o2.o0000OO0(o00000o, jOooo00o + ((long) 4)), 0L);
            if (request(5L) && o00000o2.OooOo(4L) == 0) {
                if (((UByte.m4231constructorimpl(o00000o2.OooOo(1L)) & UByte.MAX_VALUE) | ((UByte.m4231constructorimpl(o00000o2.OooOo(2L)) & UByte.MAX_VALUE) << 8)) < 2) {
                    o00000o.o00O0O(o00000o2.OooOo(0L));
                    o00000o.o00O0O(10);
                    o00000o.o00O0O(0);
                    o00000o2.skip(3L);
                }
            }
            j3 = -1;
        }
        if (jCoerceAtLeast < j) {
            j2 = 0;
            jCoerceAtLeast += RangesKt.coerceAtLeast(o00000o2.o0000OO0(o00000o, j - jCoerceAtLeast), 0L);
        } else {
            j2 = 0;
        }
        if (jCoerceAtLeast == j2) {
            return -1L;
        }
        return jCoerceAtLeast;
    }

    public final boolean request(long j) {
        o00000O o00000o = this.f35702OooO0o0;
        long j2 = o00000o.f60177OooO0o0;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return super.o0000OO0(o00000o, j3) == j3;
    }
}
