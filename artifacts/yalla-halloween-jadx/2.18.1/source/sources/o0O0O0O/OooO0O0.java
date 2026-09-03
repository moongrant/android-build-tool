package o0O0O0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.accompanist.pager.ExperimentalPagerApi;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import p633o0ooO00o.oOo000Oo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@ExperimentalPagerApi
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f35330OooO00o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Function3<oOo000Oo, Integer, Integer, Integer> f35331OooO0O0 = OooO00o.f35332Oooo0o;

    public static final class OooO00o extends Lambda implements Function3<oOo000Oo, Integer, Integer, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f35332Oooo0o = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Integer invoke(oOo000Oo ooo000oo, Integer num, Integer num2) {
            oOo000Oo layoutInfo = ooo000oo;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
            return Integer.valueOf(RangesKt.coerceIn(RangesKt.coerceIn(iIntValue2, iIntValue - 1, iIntValue + 1), 0, layoutInfo.OooO0oo() - 1));
        }
    }
}
