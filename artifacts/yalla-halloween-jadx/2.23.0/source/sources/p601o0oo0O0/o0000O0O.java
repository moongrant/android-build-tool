package p601o0oo0O0;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nTimeCompare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeCompare.kt\ncom/yalla/yalla/util/time/TimeCompare\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1#2:163\n*E\n"})
public final class o0000O0O {
    public static boolean OooO00o(long j, long j2) {
        return (OooO0OO(j, j2) && OooO0O0(2, j, j2)) && OooO0O0(5, j, j2);
    }

    public static boolean OooO0O0(int i, long j, long j2) {
        Calendar timeCalendar = Calendar.getInstance();
        timeCalendar.setTimeInMillis(j);
        Intrinsics.checkNotNullExpressionValue(timeCalendar, "getInstance().apply { timeInMillis = taskTime }");
        Calendar targetCalendar = Calendar.getInstance();
        targetCalendar.setTimeInMillis(j2);
        Intrinsics.checkNotNullExpressionValue(targetCalendar, "getInstance().apply { timeInMillis = targetTime }");
        Intrinsics.checkNotNullParameter(timeCalendar, "timeCalendar");
        Intrinsics.checkNotNullParameter(targetCalendar, "targetCalendar");
        return targetCalendar.get(i) - timeCalendar.get(i) == 0;
    }

    public static boolean OooO0OO(long j, long j2) {
        Calendar timeCalendar = Calendar.getInstance();
        timeCalendar.setTimeInMillis(j);
        Intrinsics.checkNotNullExpressionValue(timeCalendar, "getInstance().apply { timeInMillis = taskTime }");
        Calendar targetCalendar = Calendar.getInstance();
        targetCalendar.setTimeInMillis(j2);
        Intrinsics.checkNotNullExpressionValue(targetCalendar, "getInstance().apply { timeInMillis = targetTime }");
        Intrinsics.checkNotNullParameter(timeCalendar, "timeCalendar");
        Intrinsics.checkNotNullParameter(targetCalendar, "targetCalendar");
        return targetCalendar.get(1) - timeCalendar.get(1) == 0;
    }
}
