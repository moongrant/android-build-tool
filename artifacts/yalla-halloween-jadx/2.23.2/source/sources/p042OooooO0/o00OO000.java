package p042OooooO0;

import androidx.annotation.RequiresApi;
import java.util.concurrent.TimeUnit;
import o000OO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00OO000 {
    public static long OooO00o(int i, long j) {
        long j2 = i;
        OooOOO0.OooO0O0(j2 > 0, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j) / j2;
    }

    public static long OooO0O0(int i, long j) {
        long j2 = i;
        OooOOO0.OooO0O0(j2 > 0, "bytesPerFrame must be greater than 0.");
        return j / j2;
    }
}
