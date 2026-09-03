package p547o0oOO0Oo;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.unit.IntSize;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final MutableState<Boolean> f55880OooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Modifier f55881OooO0O0 = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, OooO00o.f55882OooO0Oo);

    public static final class OooO00o extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f55882OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            o000O0O0.f55880OooO00o.setValue(Boolean.valueOf(new BigDecimal(IntSize.m3924getHeightimpl(it.mo2801getSizeYbymL2g())).divide(new BigDecimal(IntSize.m3925getWidthimpl(it.mo2801getSizeYbymL2g())), 3, RoundingMode.DOWN).floatValue() > new BigDecimal(16).divide(new BigDecimal(9), 3, RoundingMode.DOWN).floatValue()));
            return Unit.INSTANCE;
        }
    }
}
