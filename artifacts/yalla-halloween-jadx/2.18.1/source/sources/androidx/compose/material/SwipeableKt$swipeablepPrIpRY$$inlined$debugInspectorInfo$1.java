package androidx.compose.material;

import Oooo0.OooOO0O;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.platform.o00O000o;
import com.facebook.internal.ServerProtocol;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p026Oooo0OO.o000;
import p031OoooO.o0O0O00;

/* JADX INFO: renamed from: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/o00O000o;", "", "invoke", "(Landroidx/compose/ui/platform/o00O000o;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class SwipeableKt$swipeablepPrIpRY$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<o00O000o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f5899Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SwipeableState f5900Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Map f5901Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Orientation f5902Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f5903OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o000 f5904OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ boolean f5905OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ Function2 f5906OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ float f5907OoooOO0;

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O000o o00o000o2) {
        o00O000o o00o000o3 = o00o000o2;
        Intrinsics.checkNotNullParameter(o00o000o3, "$this$null");
        Objects.requireNonNull(o00o000o3);
        o00o000o3.f6462OooO0O0.OooO00o(ServerProtocol.DIALOG_PARAM_STATE, this.f5900Oooo0o);
        o00o000o3.f6462OooO0O0.OooO00o("anchors", this.f5901Oooo0oO);
        o00o000o3.f6462OooO0O0.OooO00o("orientation", this.f5902Oooo0oo);
        o00o000o3.f6462OooO0O0.OooO00o("enabled", Boolean.valueOf(this.f5899Oooo));
        o00o000o3.f6462OooO0O0.OooO00o("reverseDirection", Boolean.valueOf(this.f5905OoooO00));
        o00o000o3.f6462OooO0O0.OooO00o("interactionSource", this.f5904OoooO0);
        o00o000o3.f6462OooO0O0.OooO00o("thresholds", this.f5906OoooO0O);
        o00o000o3.f6462OooO0O0.OooO00o("resistance", this.f5903OoooO);
        OooOO0O.OooO0O0(this.f5907OoooOO0, o00o000o3.f6462OooO0O0, "velocityThreshold");
        return Unit.INSTANCE;
    }
}
