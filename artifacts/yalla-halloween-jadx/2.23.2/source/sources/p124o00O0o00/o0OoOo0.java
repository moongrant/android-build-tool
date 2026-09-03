package p124o00O0o00;

import java.io.EOFException;
import kotlin.UByte;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.oo0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 extends oo0ooO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ByteString f36595OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final oo0OOoo f36596OooO0o0;

    static {
        ByteString byteString = ByteString.f60193OooO0oO;
        f36595OooO0o = ByteString.OooO00o.OooO0O0("0021F904");
    }

    public o0OoOo0(@NotNull o0O0o0 o0o0o0) {
        super(o0o0o0);
        this.f36596OooO0o0 = new oo0OOoo();
    }

    @Override // p662o0oooO0O.oo0ooO, p662o0oooO0O.oO00000
    public final long OooOO0O(@NotNull oo0OOoo oo0oooo, long j) throws EOFException {
        long j2;
        request(j);
        oo0OOoo oo0oooo2 = this.f36596OooO0o0;
        long j3 = -1;
        if (oo0oooo2.f59828OooO0o0 == 0) {
            return j == 0 ? 0L : -1L;
        }
        long jCoerceAtLeast = 0;
        while (true) {
            ByteString byteString = f36595OooO0o;
            long jOooo00o = j3;
            while (true) {
                jOooo00o = this.f36596OooO0o0.Oooo00o(byteString.data[0], jOooo00o + 1, LongCompanionObject.MAX_VALUE);
                if (jOooo00o == j3 || (request(byteString.data.length) && oo0oooo2.Oooo00O(jOooo00o, byteString))) {
                    break;
                }
                j3 = -1;
            }
            if (jOooo00o == j3) {
                break;
            }
            jCoerceAtLeast += RangesKt.coerceAtLeast(oo0oooo2.OooOO0O(oo0oooo, jOooo00o + ((long) 4)), 0L);
            if (request(5L) && oo0oooo2.OooOo(4L) == 0) {
                if (((UByte.m4233constructorimpl(oo0oooo2.OooOo(1L)) & UByte.MAX_VALUE) | ((UByte.m4233constructorimpl(oo0oooo2.OooOo(2L)) & UByte.MAX_VALUE) << 8)) < 2) {
                    oo0oooo.o00o0O(oo0oooo2.OooOo(0L));
                    oo0oooo.o00o0O(10);
                    oo0oooo.o00o0O(0);
                    oo0oooo2.skip(3L);
                }
            }
            j3 = -1;
        }
        if (jCoerceAtLeast < j) {
            j2 = 0;
            jCoerceAtLeast += RangesKt.coerceAtLeast(oo0oooo2.OooOO0O(oo0oooo, j - jCoerceAtLeast), 0L);
        } else {
            j2 = 0;
        }
        if (jCoerceAtLeast == j2) {
            return -1L;
        }
        return jCoerceAtLeast;
    }

    public final boolean request(long j) {
        oo0OOoo oo0oooo = this.f36596OooO0o0;
        long j2 = oo0oooo.f59828OooO0o0;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return super.OooOO0O(oo0oooo, j3) == j3;
    }
}
