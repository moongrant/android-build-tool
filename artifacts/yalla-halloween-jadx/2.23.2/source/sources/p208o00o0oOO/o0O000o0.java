package p208o00o0oOO;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.security.CertificateUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p031OoooO0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"SimpleDateFormat"})
public final class o0O000o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f39631OooO00o = LazyKt.lazy(OooO00o.f39633OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f39632OooO0O0 = LazyKt.lazy(OooO0O0.f39634OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<SimpleDateFormat> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f39633OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<SimpleDateFormat> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f39634OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    }

    @NotNull
    public static int[] OooO00o(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return new int[]{calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13)};
    }

    public static long OooO0O0(@NotNull int[] mDateArray) {
        Intrinsics.checkNotNullParameter(mDateArray, "mDateArray");
        Calendar calendar = Calendar.getInstance();
        calendar.set(mDateArray[0], mDateArray[1], mDateArray[2], mDateArray[3], mDateArray[4], 0);
        return calendar.getTimeInMillis();
    }

    @NotNull
    public static String OooO0OO(int i) {
        int i2 = i / 1000;
        String strValueOf = String.valueOf(i2 / 60);
        String strValueOf2 = String.valueOf(i2 % 60);
        if (strValueOf.length() == 1) {
            strValueOf = AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(strValueOf);
        }
        if (strValueOf2.length() == 1) {
            strValueOf2 = AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(strValueOf2);
        }
        return o0OoOo0.OooO0O0(strValueOf, CertificateUtil.DELIMITER, strValueOf2);
    }
}
