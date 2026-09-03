package androidx.compose.foundation;

import androidx.compose.ui.platform.o00O000o;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o000OOo0;
import p145o00Oo0.o0O0ooO;
import p145o00Oo0.o0Oo0oo;

/* JADX INFO: renamed from: androidx.compose.foundation.BorderKt$border-ziNgDLE$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/o00O000o;", "", "invoke", "(Landroidx/compose/ui/platform/o00O000o;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class BorderKt$borderziNgDLE$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<o00O000o, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ float f5537Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f5538Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o000OOo0 f5539Oooo0oo;

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O000o o00o000o2) {
        o00O000o o00o000o3 = o00o000o2;
        Intrinsics.checkNotNullParameter(o00o000o3, "$this$null");
        Objects.requireNonNull(o00o000o3);
        Oooo0.OooOO0O.OooO0O0(this.f5537Oooo0o, o00o000o3.f6462OooO0O0, ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
        o0Oo0oo o0oo0oo2 = this.f5538Oooo0oO;
        if (o0oo0oo2 instanceof o0O0ooO) {
            o00o000o3.f6462OooO0O0.OooO00o("color", new o00000O0(((o0O0ooO) o0oo0oo2).f32140OooO0O0));
            long j = ((o0O0ooO) this.f5538Oooo0oO).f32140OooO0O0;
        } else {
            o00o000o3.f6462OooO0O0.OooO00o("brush", o0oo0oo2);
        }
        o00o000o3.f6462OooO0O0.OooO00o("shape", this.f5539Oooo0oo);
        return Unit.INSTANCE;
    }
}
