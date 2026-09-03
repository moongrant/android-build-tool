package p571o0oOo0o;

import Oooo0.o00;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000.OooO0O0;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p263o00ooo.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oOoo {

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f45604Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f45605Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f45606Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OOOO0 o00oooo1, int i, int i2) {
            super(2);
            this.f45604Oooo0o = o00oooo1;
            this.f45605Oooo0oO = i;
            this.f45606Oooo0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00oOoo.OooO00o(this.f45604Oooo0o, ooo00o, this.f45605Oooo0oO | 1, this.f45606Oooo0oo);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable o00OOOO0 other, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(637709374);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.Oooo0oo(other) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            if (i4 != 0) {
                other = o00OOOO0.OooO00o.f4198Oooo0o;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o000OO0O o000oo0oOooO00o = OooO0O0.OooO00o(R.drawable.icv_coin, ooo00oOooOOo);
            Intrinsics.checkNotNullParameter(other, "other");
            o00.OooO00o(o000oo0oOooO00o, null, SizeKt.OooOO0(other, 24), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 56, 120);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(other, i, i2));
    }
}
