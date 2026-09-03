package p032OoooO0;

import Oooo000.o0000O00;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p025Oooo0O0.o000O;
import p025Oooo0O0.o000O0O0;
import p025Oooo0O0.o000OO0O;
import p026Oooo0OO.o000;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00o0 extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo00oO f3355Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f3356Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o000 f3357Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o0(oo00oO oo00oo, boolean z, o000 o000Var) {
        super(3);
        this.f3355Oooo0o = oo00oo;
        this.f3356Oooo0oO = z;
        this.f3357Oooo0oo = o000Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
        boolean z;
        oOO00O ooo00o2 = ooo00o;
        o0000O00.OooO00o(num, o00oooo1, "$this$composed", ooo00o2, 805428266);
        boolean z2 = this.f3355Oooo0o.OooO0OO() == Orientation.Vertical || !(ooo00o2.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O) == LayoutDirection.Rtl);
        o0oOO consumeScrollDelta = new o0oOO(this.f3355Oooo0o);
        Intrinsics.checkNotNullParameter(consumeScrollDelta, "consumeScrollDelta");
        ooo00o2.OooO0o0(-180460798);
        oO0Oo oo0ooOooO0o = o0OOO00.OooO0o(consumeScrollDelta, ooo00o2);
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o = ooo00o2.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = o000O.OooO00o(new o000O0O0(oo0ooOooO0o));
            ooo00o2.Oooo00o(objOooO0o);
        }
        ooo00o2.Oooo0o0();
        o000OO0O state = (o000OO0O) objOooO0o;
        ooo00o2.Oooo0o0();
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        Orientation orientation = this.f3355Oooo0o.OooO0OO();
        if (this.f3356Oooo0oO) {
            if (this.f3355Oooo0o.OooO00o() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        o000 o000Var = this.f3357Oooo0oo;
        ScrollableKt.OooO0O0 oooO0O0 = ScrollableKt.f5724OooO00o;
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        o00OOOO0 o00oooo0OooO0O0 = ScrollableKt.OooO0O0(oooO00o, state, orientation, null, z, z2, null, o000Var);
        ooo00o2.Oooo0o0();
        return o00oooo0OooO0O0;
    }
}
