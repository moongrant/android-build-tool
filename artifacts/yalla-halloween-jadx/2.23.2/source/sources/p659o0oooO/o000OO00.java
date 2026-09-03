package p659o0oooO;

import java.io.IOException;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0o0000;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OO00 extends Lambda implements Function2<Integer, Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0o0 f59638OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<Long> f59639OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<Long> f59640OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<Long> f59641OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(o0o0000 o0o0000Var, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        super(2);
        this.f59638OooO0Oo = o0o0000Var;
        this.f59640OooO0o0 = objectRef;
        this.f59639OooO0o = objectRef2;
        this.f59641OooO0oO = objectRef3;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v12, types: [T, java.lang.Long] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Long l) throws IOException {
        int iIntValue = num.intValue();
        long jLongValue = l.longValue();
        if (iIntValue == 21589) {
            if (jLongValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            o0O0o0 o0o0o0 = this.f59638OooO0Oo;
            int i = o0o0o0.readByte() & UByte.MAX_VALUE;
            boolean z = (i & 1) == 1;
            boolean z2 = (i & 2) == 2;
            boolean z3 = (i & 4) == 4;
            long j = z ? 5L : 1L;
            if (z2) {
                j += 4;
            }
            if (z3) {
                j += 4;
            }
            if (jLongValue < j) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z) {
                this.f59640OooO0o0.element = Long.valueOf(((long) o0o0o0.o0000Ooo()) * 1000);
            }
            if (z2) {
                this.f59639OooO0o.element = Long.valueOf(((long) o0o0o0.o0000Ooo()) * 1000);
            }
            if (z3) {
                this.f59641OooO0oO.element = Long.valueOf(((long) o0o0o0.o0000Ooo()) * 1000);
            }
        }
        return Unit.INSTANCE;
    }
}
