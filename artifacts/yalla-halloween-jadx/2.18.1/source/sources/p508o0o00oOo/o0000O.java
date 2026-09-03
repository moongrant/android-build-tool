package p508o0o00oOo;

import Oooo0.o00;
import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000.OooO0O0;
import o0O0O00.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p516o0o0O000.Oooo0;
import p516o0o0O000.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O {

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f41816Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f41817Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OOOO0 o00oooo1, int i) {
            super(2);
            this.f41816Oooo0o = o00oooo1;
            this.f41817Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0000O.OooO00o(this.f41816Oooo0o, ooo00o, this.f41817Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull o00OOOO0 modifier, @Nullable oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-986826852);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00oOooOOo.OooO0o0(652413274);
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                Context context = p031OoooO.o0000O.f2657OooO00o;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                    context = null;
                }
                objOooO0o = Oooo0.OooO00o(context, R.array.anim_loading_horse_green);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            oO0Oo oo0ooOooO00o = oo000o.OooO00o((int[]) objOooO0o, 1000L, null, ooo00oOooOOo, 60);
            ooo00oOooOOo.Oooo0o0();
            o00.OooO00o(OooO0O0.OooO00o(((Number) oo0ooOooO00o.getValue()).intValue(), ooo00oOooOOo), null, modifier.OooOOoo(SizeKt.OooOO0O(o00OOOO0.OooO00o.f4198Oooo0o, 90, 55)), null, OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 24632, 104);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(modifier, i));
    }
}
