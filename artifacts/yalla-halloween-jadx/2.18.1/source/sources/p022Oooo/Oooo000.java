package p022Oooo;

import androidx.compose.ui.state.ToggleableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import o00000O0.OooOO0O;
import o00000O0.o0OO00O;
import o00000O0.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends Lambda implements Function1<o0OO00O, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f477Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f478Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ToggleableState f479Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f480Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(OooOO0O oooOO0O, ToggleableState toggleableState, boolean z, Function0<Unit> function0) {
        super(1);
        this.f478Oooo0o = oooOO0O;
        this.f479Oooo0oO = toggleableState;
        this.f480Oooo0oo = z;
        this.f477Oooo = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0OO00O o0oo00o2) {
        o0OO00O semantics = o0oo00o2;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        OooOO0O oooOO0O = this.f478Oooo0o;
        if (oooOO0O != null) {
            o0ooOOo.OooOO0(semantics, oooOO0O.f26913OooO00o);
        }
        ToggleableState toggleableState = this.f479Oooo0oO;
        KProperty<Object>[] kPropertyArr = o0ooOOo.f26961OooO00o;
        Intrinsics.checkNotNullParameter(semantics, "<this>");
        Intrinsics.checkNotNullParameter(toggleableState, "<set-?>");
        o0ooOOo.f26971OooOO0o.OooO00o(semantics, o0ooOOo.f26961OooO00o[15], toggleableState);
        o0ooOOo.OooO0OO(semantics, new OooOo(this.f477Oooo));
        if (!this.f480Oooo0oo) {
            o0ooOOo.OooO00o(semantics);
        }
        return Unit.INSTANCE;
    }
}
