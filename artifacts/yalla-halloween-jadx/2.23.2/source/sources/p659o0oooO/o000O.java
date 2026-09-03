package p659o0oooO;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0o0000;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O extends Lambda implements Function2<Integer, Long, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f59625OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f59626OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f59627OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f59628OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0o0 f59629OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f59630OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(Ref.BooleanRef booleanRef, long j, Ref.LongRef longRef, o0o0000 o0o0000Var, Ref.LongRef longRef2, Ref.LongRef longRef3) {
        super(2);
        this.f59626OooO0Oo = booleanRef;
        this.f59628OooO0o0 = j;
        this.f59627OooO0o = longRef;
        this.f59629OooO0oO = o0o0000Var;
        this.f59630OooO0oo = longRef2;
        this.f59625OooO = longRef3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Long l) throws IOException {
        int iIntValue = num.intValue();
        long jLongValue = l.longValue();
        if (iIntValue == 1) {
            Ref.BooleanRef booleanRef = this.f59626OooO0Oo;
            if (booleanRef.element) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            booleanRef.element = true;
            if (jLongValue < this.f59628OooO0o0) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            Ref.LongRef longRef = this.f59627OooO0o;
            long jO000oOoO = longRef.element;
            o0O0o0 o0o0o0 = this.f59629OooO0oO;
            if (jO000oOoO == 4294967295L) {
                jO000oOoO = o0o0o0.o000oOoO();
            }
            longRef.element = jO000oOoO;
            Ref.LongRef longRef2 = this.f59630OooO0oo;
            longRef2.element = longRef2.element == 4294967295L ? o0o0o0.o000oOoO() : 0L;
            Ref.LongRef longRef3 = this.f59625OooO;
            longRef3.element = longRef3.element == 4294967295L ? o0o0o0.o000oOoO() : 0L;
        }
        return Unit.INSTANCE;
    }
}
