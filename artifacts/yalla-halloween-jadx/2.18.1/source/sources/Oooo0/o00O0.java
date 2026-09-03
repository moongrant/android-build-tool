package Oooo0;

import android.view.View;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0 extends Lambda implements Function3<p048OoooooO.o00OOOO0, p100o000oOoO.oOO00O, Integer, p048OoooooO.o00OOOO0> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function1<o0000O0O.OooOo00, Unit> f609Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<o0000O0O.OooO, o00O0O.OooO> f610Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<o0000O0O.OooO, o00O0O.OooO> f611Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ float f612Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o00O0O0 f613OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0 f614OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O0(Function1<? super o0000O0O.OooO, o00O0O.OooO> function1, Function1<? super o0000O0O.OooO, o00O0O.OooO> function2, float f, Function1<? super o0000O0O.OooOo00, Unit> function3, o00OO0O0 o00oo0o1, o00O0O0 o00o0o0) {
        super(3);
        this.f610Oooo0o = function1;
        this.f611Oooo0oO = function2;
        this.f612Oooo0oo = f;
        this.f609Oooo = function3;
        this.f614OoooO00 = o00oo0o1;
        this.f613OoooO0 = o00o0o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long OooO00o(o0O00OO o0o00oo2) {
        return ((o00O0O.OooO) o0o00oo2.getValue()).f30395OooO00o;
    }

    public static final long OooO0O0(oO0Oo oo0oo) {
        return ((o00O0O.OooO) oo0oo.getValue()).f30395OooO00o;
    }

    @Override // kotlin.jvm.functions.Function3
    public final p048OoooooO.o00OOOO0 invoke(p048OoooooO.o00OOOO0 o00oooo1, p100o000oOoO.oOO00O ooo00o, Integer num) {
        p048OoooooO.o00OOOO0 o00oooo2 = o00oooo1;
        p100o000oOoO.oOO00O ooo00o2 = ooo00o;
        Oooo000.o0000O00.OooO00o(num, o00oooo2, "$this$composed", ooo00o2, -454877003);
        View view = (View) ooo00o2.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6594OooO0o);
        o0000O0O.OooO oooO = (o0000O0O.OooO) ooo00o2.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o = ooo00o2.OooO0o();
        o000oOoO.oOO00O.OooO00o.C0323OooO00o c0323OooO00o = o000oOoO.oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
            objOooO0o = o0OOO00.OooO0Oo(new o00O0O.OooO(o00O0O.OooO.f30394OooO0o0));
            ooo00o2.Oooo00o(objOooO0o);
        }
        ooo00o2.Oooo0o0();
        o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
        oO0Oo oo0ooOooO0o = o0OOO00.OooO0o(this.f610Oooo0o, ooo00o2);
        oO0Oo oo0ooOooO0o2 = o0OOO00.OooO0o(this.f611Oooo0oO, ooo00o2);
        oO0Oo oo0ooOooO0o3 = o0OOO00.OooO0o(Float.valueOf(this.f612Oooo0oo), ooo00o2);
        oO0Oo oo0ooOooO0o4 = o0OOO00.OooO0o(this.f609Oooo, ooo00o2);
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o2 = ooo00o2.OooO0o();
        if (objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = o0OOO00.OooO0O0(new oo00o(oooO, oo0ooOooO0o, o0o00oo2));
            ooo00o2.Oooo00o(objOooO0o2);
        }
        ooo00o2.Oooo0o0();
        oO0Oo oo0oo = (oO0Oo) objOooO0o2;
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o3 = ooo00o2.OooO0o();
        if (objOooO0o3 == c0323OooO00o) {
            objOooO0o3 = o0OOO00.OooO0O0(new o00O00o0(oo0oo));
            ooo00o2.Oooo00o(objOooO0o3);
        }
        ooo00o2.Oooo0o0();
        oO0Oo oo0oo2 = (oO0Oo) objOooO0o3;
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o4 = ooo00o2.OooO0o();
        if (objOooO0o4 == c0323OooO00o) {
            objOooO0o4 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
            ooo00o2.Oooo00o(objOooO0o4);
        }
        ooo00o2.Oooo0o0();
        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) objOooO0o4;
        float f = this.f614OoooO00.OooO00o() ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : this.f612Oooo0oo;
        o00O0O0 o00o0o0 = this.f613OoooO0;
        o00O0O0.OooO00o oooO00o2 = o00O0O0.f647OooO0oO;
        p100o000oOoO.o00Oo00.OooO0o(new Object[]{view, oooO, Float.valueOf(f), o00o0o0, Boolean.valueOf(Intrinsics.areEqual(o00o0o0, o00O0O0.f646OooO))}, new o00O000o(this.f614OoooO00, this.f613OoooO0, view, oooO, this.f612Oooo0oo, mutableSharedFlow, oo0ooOooO0o4, oo0oo2, oo0oo, oo0ooOooO0o2, o0o00oo2, oo0ooOooO0o3, null), ooo00o2);
        p048OoooooO.o00OOOO0 o00oooo0OooO00o = SemanticsModifierKt.OooO00o(DrawModifierKt.OooO00o(OnGloballyPositionedModifierKt.OooO00o(o00oooo2, new o00O00(o0o00oo2)), new o00O00O(mutableSharedFlow)), false, new o00O00OO(oo0oo));
        ooo00o2.Oooo0o0();
        return o00oooo0OooO00o;
    }
}
