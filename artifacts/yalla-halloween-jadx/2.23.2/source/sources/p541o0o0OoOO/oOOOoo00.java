package p541o0o0OoOO;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOOoo00 extends Lambda implements Function2<Integer, Long, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oOOOoo00 f55284OooO0Oo = new oOOOoo00();

    public oOOOoo00() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, Long l) {
        int iIntValue = num.intValue();
        long jLongValue = l.longValue();
        StringBuilder sb = new StringBuilder();
        sb.append(jLongValue);
        sb.append(iIntValue);
        String string = sb.toString();
        long j = iIntValue;
        if (string != null) {
            try {
                j = Long.parseLong(string);
            } catch (Exception unused) {
            }
        } else {
            j = 0;
        }
        return Long.valueOf(j);
    }
}
