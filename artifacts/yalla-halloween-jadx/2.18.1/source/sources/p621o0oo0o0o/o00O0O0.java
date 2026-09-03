package p621o0oo0o0o;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O0O0 f48625OooO00o = new o00O0O0();

    public final boolean OooO00o(long j, long j2) {
        return (OooO0OO(j, j2) && OooO0O0(2, j, j2)) && OooO0O0(5, j, j2);
    }

    public final boolean OooO0O0(int i, long j, long j2) {
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

    public final boolean OooO0OO(long j, long j2) {
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
