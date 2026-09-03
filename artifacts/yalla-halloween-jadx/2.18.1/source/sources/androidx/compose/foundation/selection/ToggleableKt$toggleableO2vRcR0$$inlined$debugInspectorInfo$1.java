package androidx.compose.foundation.selection;

import Oooo0.o00O0000;
import androidx.compose.ui.platform.o00O000o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O0.OooOO0O;
import p026Oooo0OO.o000;

/* JADX INFO: renamed from: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/o00O000o;", "", "invoke", "(Landroidx/compose/ui/platform/o00O000o;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class ToggleableKt$toggleableO2vRcR0$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<o00O000o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f5861Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f5862Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000 f5863Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O0000 f5864Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Function1 f5865OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f5866OoooO00;

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O000o o00o000o2) {
        o00O000o o00o000o3 = o00o000o2;
        Intrinsics.checkNotNullParameter(o00o000o3, "$this$null");
        Objects.requireNonNull(o00o000o3);
        o00o000o3.f6462OooO0O0.OooO00o(AppMeasurementSdk.ConditionalUserProperty.VALUE, Boolean.valueOf(this.f5862Oooo0o));
        o00o000o3.f6462OooO0O0.OooO00o("interactionSource", this.f5863Oooo0oO);
        o00o000o3.f6462OooO0O0.OooO00o("indication", this.f5864Oooo0oo);
        o00o000o3.f6462OooO0O0.OooO00o("enabled", Boolean.valueOf(this.f5861Oooo));
        o00o000o3.f6462OooO0O0.OooO00o("role", this.f5866OoooO00);
        o00o000o3.f6462OooO0O0.OooO00o("onValueChange", this.f5865OoooO0);
        return Unit.INSTANCE;
    }
}
