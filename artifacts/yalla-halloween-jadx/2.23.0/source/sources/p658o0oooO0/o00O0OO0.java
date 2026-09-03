package p658o0oooO0;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p659o0oooO00.o0000;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0OO0 extends Lambda implements Function2<Integer, Long, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f60149OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f60150OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f60151OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f60152OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0000 f60153OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f60154OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(Ref.BooleanRef booleanRef, long j, Ref.LongRef longRef, o00O0000 o00o0001, Ref.LongRef longRef2, Ref.LongRef longRef3) {
        super(2);
        this.f60150OooO0Oo = booleanRef;
        this.f60152OooO0o0 = j;
        this.f60151OooO0o = longRef;
        this.f60153OooO0oO = o00o0001;
        this.f60154OooO0oo = longRef2;
        this.f60149OooO = longRef3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Long l) throws IOException {
        int iIntValue = num.intValue();
        long jLongValue = l.longValue();
        if (iIntValue == 1) {
            Ref.BooleanRef booleanRef = this.f60150OooO0Oo;
            if (booleanRef.element) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            booleanRef.element = true;
            if (jLongValue < this.f60152OooO0o0) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            Ref.LongRef longRef = this.f60151OooO0o;
            long jO000oOoO = longRef.element;
            o0000 o0000Var = this.f60153OooO0oO;
            if (jO000oOoO == 4294967295L) {
                jO000oOoO = o0000Var.o000oOoO();
            }
            longRef.element = jO000oOoO;
            Ref.LongRef longRef2 = this.f60154OooO0oo;
            longRef2.element = longRef2.element == 4294967295L ? o0000Var.o000oOoO() : 0L;
            Ref.LongRef longRef3 = this.f60149OooO;
            longRef3.element = longRef3.element == 4294967295L ? o0000Var.o000oOoO() : 0L;
        }
        return Unit.INSTANCE;
    }
}
