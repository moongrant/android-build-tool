package o000000;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class OooO {
    public static final int OooO00o(long j, long j2) {
        boolean zOooO0OO = OooO0OO(j);
        if (zOooO0OO != OooO0OO(j2)) {
            return zOooO0OO ? -1 : 1;
        }
        return (int) Math.signum(OooO0O0(j) - OooO0O0(j2));
    }

    public static final float OooO0O0(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean OooO0OO(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }
}
