package p258o00ooOOo;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"SimpleDateFormat"})
public final class f {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final f f34635OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f34636OooO0O0 = LazyKt.lazy(OooO00o.f34638Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f34637OooO0OO = LazyKt.lazy(OooO0O0.f34639Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<SimpleDateFormat> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f34638Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<SimpleDateFormat> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f34639Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    }

    @NotNull
    public static final int[] OooO00o(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return new int[]{calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13)};
    }

    public static final long OooO0O0(@NotNull int[] mDateArray) {
        Intrinsics.checkNotNullParameter(mDateArray, "mDateArray");
        Calendar calendar = Calendar.getInstance();
        calendar.set(mDateArray[0], mDateArray[1], mDateArray[2], mDateArray[3], mDateArray[4], 0);
        return calendar.getTimeInMillis();
    }

    public static final long OooO0OO(long j, int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.add(11, i);
        calendar.add(12, i2);
        return calendar.getTimeInMillis();
    }
}
