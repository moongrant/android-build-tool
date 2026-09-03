package androidx.compose.ui.draw;

import androidx.compose.ui.platform.o00O000o;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0O0O00.OooOO0;
import p048OoooooO.o00OO0O0;
import p145o00Oo0.o00000O;
import p263o00ooo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/o00O000o;", "", "invoke", "(Landroidx/compose/ui/platform/o00O000o;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class PainterModifierKt$paint$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<o00O000o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f5985Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000OO0O f5986Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f5987Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0 f5988Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o00000O f5989OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ float f5990OoooO00;

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O000o o00o000o2) {
        o00O000o o00o000o3 = o00o000o2;
        Intrinsics.checkNotNullParameter(o00o000o3, "$this$null");
        Objects.requireNonNull(o00o000o3);
        o00o000o3.f6462OooO0O0.OooO00o("painter", this.f5986Oooo0o);
        o00o000o3.f6462OooO0O0.OooO00o("sizeToIntrinsics", Boolean.valueOf(this.f5987Oooo0oO));
        o00o000o3.f6462OooO0O0.OooO00o("alignment", this.f5988Oooo0oo);
        o00o000o3.f6462OooO0O0.OooO00o("contentScale", this.f5985Oooo);
        o00o000o3.f6462OooO0O0.OooO00o("alpha", Float.valueOf(this.f5990OoooO00));
        o00o000o3.f6462OooO0O0.OooO00o("colorFilter", this.f5989OoooO0);
        return Unit.INSTANCE;
    }
}
