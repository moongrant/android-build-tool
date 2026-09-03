package p606o0oo0O0o;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nTimeFormatExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeFormatExt.kt\ncom/yalla/yalla/util/time/TimeFormatExt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n1#2:315\n*E\n"})
public final class o0O0OOOo {
    public static long OooO00o(long j) {
        int length = String.valueOf(System.currentTimeMillis()).length() - String.valueOf(j).length();
        int i = 1;
        if (1 <= length) {
            while (true) {
                j *= (long) 10;
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return j;
    }
}
