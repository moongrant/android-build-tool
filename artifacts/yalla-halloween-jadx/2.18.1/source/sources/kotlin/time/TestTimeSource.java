package kotlin.time;

import OooO00o.OooO00o;
import kotlin.Metadata;
import kotlin.SinceKotlin;

/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@ExperimentalTime
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m1976overflowLRDsOJo(long duration) {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("TestTimeSource will overflow if its reading ");
        sbOooO0o0.append(this.reading);
        sbOooO0o0.append("ns is advanced by ");
        sbOooO0o0.append((Object) Duration.m1892toStringimpl(duration));
        sbOooO0o0.append('.');
        throw new IllegalStateException(sbOooO0o0.toString());
    }

    /* JADX INFO: renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m1977plusAssignLRDsOJo(long duration) {
        long j;
        long jM1889toLongimpl = Duration.m1889toLongimpl(duration, getUnit());
        if (jM1889toLongimpl == Long.MIN_VALUE || jM1889toLongimpl == Long.MAX_VALUE) {
            double dM1886toDoubleimpl = this.reading + Duration.m1886toDoubleimpl(duration, getUnit());
            if (dM1886toDoubleimpl > 9.223372036854776E18d || dM1886toDoubleimpl < -9.223372036854776E18d) {
                m1976overflowLRDsOJo(duration);
            }
            j = (long) dM1886toDoubleimpl;
        } else {
            long j2 = this.reading;
            j = j2 + jM1889toLongimpl;
            if ((jM1889toLongimpl ^ j2) >= 0 && (j2 ^ j) < 0) {
                m1976overflowLRDsOJo(duration);
            }
        }
        this.reading = j;
    }

    @Override // kotlin.time.AbstractLongTimeSource
    /* JADX INFO: renamed from: read, reason: from getter */
    public long getReading() {
        return this.reading;
    }
}
