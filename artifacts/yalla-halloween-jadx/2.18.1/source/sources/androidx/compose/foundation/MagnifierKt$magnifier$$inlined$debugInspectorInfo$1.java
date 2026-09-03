package androidx.compose.foundation;

import Oooo0.o00O0O0;
import Oooo0.o00O0O00;
import androidx.compose.ui.platform.o00O000o;
import com.facebook.internal.AnalyticsEvents;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/o00O000o;", "", "invoke", "(Landroidx/compose/ui/platform/o00O000o;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class MagnifierKt$magnifier$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<o00O000o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o00O0O0 f5601Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1 f5602Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function1 f5603Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ float f5604Oooo0oo;

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O000o o00o000o2) {
        o00O000o o00o000o3 = o00o000o2;
        Intrinsics.checkNotNullParameter(o00o000o3, "$this$null");
        o0Oo0oo<Function0<o00O0O.OooO>> o0oo0oo2 = o00O0O00.f655OooO00o;
        Objects.requireNonNull(o00o000o3);
        o00o000o3.f6462OooO0O0.OooO00o("sourceCenter", this.f5602Oooo0o);
        o00o000o3.f6462OooO0O0.OooO00o("magnifierCenter", this.f5603Oooo0oO);
        o00o000o3.f6462OooO0O0.OooO00o("zoom", Float.valueOf(this.f5604Oooo0oo));
        o00o000o3.f6462OooO0O0.OooO00o(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, this.f5601Oooo);
        return Unit.INSTANCE;
    }
}
