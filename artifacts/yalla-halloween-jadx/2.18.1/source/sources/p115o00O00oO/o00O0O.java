package p115o00O00oO;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p674o0oooo0.o0O00000;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O extends o0O00000 {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ByteString f30354Oooo0oo = ByteString.f53047OoooO00.OooO0O0("0021F904");

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o0oOO f30355Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(@NotNull o0O0O0O delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f30355Oooo0oO = new o0oOO();
    }

    @Override // p674o0oooo0.o0O00000, p674o0oooo0.o0O0O0O
    public final long Oooo0O0(@NotNull o0oOO sink, long j) throws EOFException {
        long j2;
        long j3;
        Intrinsics.checkNotNullParameter(sink, "sink");
        request(j);
        long j4 = -1;
        if (this.f30355Oooo0oO.f52099Oooo0oO == 0) {
            return j == 0 ? 0L : -1L;
        }
        long jCoerceAtLeast = 0;
        while (true) {
            ByteString byteString = f30354Oooo0oo;
            long jOooOo0O = j4;
            while (true) {
                jOooOo0O = this.f30355Oooo0oO.OooOo0O(byteString.OooO0oo(0), jOooOo0O + 1, Long.MAX_VALUE);
                if (jOooOo0O == j4 || (request(byteString.OooO0o0()) && this.f30355Oooo0oO.Ooooo00(jOooOo0O, byteString))) {
                    break;
                }
                j4 = -1;
            }
            if (jOooOo0O == j4) {
                break;
            }
            jCoerceAtLeast += RangesKt.coerceAtLeast(this.f30355Oooo0oO.Oooo0O0(sink, jOooOo0O + ((long) 4)), 0L);
            if (request(5L) && this.f30355Oooo0oO.OooOOoo(4L) == 0 && this.f30355Oooo0oO.OooOOoo(1L) < 2) {
                j3 = 0;
                sink.Ooooo0o(this.f30355Oooo0oO.OooOOoo(0L));
                sink.Ooooo0o(10);
                sink.Ooooo0o(0);
                this.f30355Oooo0oO.skip(3L);
            } else {
                j3 = 0;
            }
            j4 = -1;
        }
        if (jCoerceAtLeast < j) {
            j2 = 0;
            jCoerceAtLeast += RangesKt.coerceAtLeast(this.f30355Oooo0oO.Oooo0O0(sink, j - jCoerceAtLeast), 0L);
        } else {
            j2 = 0;
        }
        return jCoerceAtLeast == j2 ? j4 : jCoerceAtLeast;
    }

    public final boolean request(long j) {
        o0oOO o0ooo2 = this.f30355Oooo0oO;
        long j2 = o0ooo2.f52099Oooo0oO;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return super.Oooo0O0(o0ooo2, j3) == j3;
    }
}
