package androidx.compose.foundation.gestures;

import Oooo0.oo0oOO0;
import androidx.compose.ui.platform.o00O000o;
import com.facebook.internal.ServerProtocol;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p025Oooo0O0.o000000O;
import p025Oooo0O0.o000OO0O;
import p026Oooo0OO.o000;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/o00O000o;", "", "invoke", "(Landroidx/compose/ui/platform/o00O000o;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class ScrollableKt$scrollable$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<o00O000o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f5734Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Orientation f5735Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000OO0O f5736Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oo0oOO0 f5737Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o000000O f5738OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ boolean f5739OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ o000 f5740OoooO0O;

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O000o o00o000o2) {
        o00O000o o00o000o3 = o00o000o2;
        Intrinsics.checkNotNullParameter(o00o000o3, "$this$null");
        Objects.requireNonNull(o00o000o3);
        o00o000o3.f6462OooO0O0.OooO00o("orientation", this.f5735Oooo0o);
        o00o000o3.f6462OooO0O0.OooO00o(ServerProtocol.DIALOG_PARAM_STATE, this.f5736Oooo0oO);
        o00o000o3.f6462OooO0O0.OooO00o("overscrollEffect", this.f5737Oooo0oo);
        o00o000o3.f6462OooO0O0.OooO00o("enabled", Boolean.valueOf(this.f5734Oooo));
        o00o000o3.f6462OooO0O0.OooO00o("reverseDirection", Boolean.valueOf(this.f5739OoooO00));
        o00o000o3.f6462OooO0O0.OooO00o("flingBehavior", this.f5738OoooO0);
        o00o000o3.f6462OooO0O0.OooO00o("interactionSource", this.f5740OoooO0O);
        return Unit.INSTANCE;
    }
}
