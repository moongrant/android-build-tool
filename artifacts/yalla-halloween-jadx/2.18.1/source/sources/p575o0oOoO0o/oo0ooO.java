package p575o0oOoO0o;

import Oooo0.o00;
import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o0O0O00;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import oOO00O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p114o00O00o.OooOOOO;
import p114o00O00o.OooOo00;
import p114o00O00o.Oooo0;
import p114o00O00o.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oo0ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oo0ooO f45695OooO00o = new oo0ooO();

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f45696Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f45698Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f45699Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f45700OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OOOO0 o00oooo1, String str, int i, int i2) {
            super(2);
            this.f45698Oooo0oO = o00oooo1;
            this.f45699Oooo0oo = str;
            this.f45696Oooo = i;
            this.f45700OoooO00 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oo0ooO.this.OooO00o(this.f45698Oooo0oO, this.f45699Oooo0oo, ooo00o, this.f45696Oooo | 1, this.f45700OoooO00);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable o00OOOO0 o00oooo1, @NotNull String url, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(url, "url");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1884513158);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (ooo00oOooOOo.Oooo0oo(o00oooo1) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= ooo00oOooOOo.Oooo0oo(url) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            o00OOOO0 other = i4 != 0 ? o00OOOO0.OooO00o.f4198Oooo0o : o00oooo1;
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00oOooOOo.OooO0o0(604400049);
            OooOO0 oooOO0OooO00o = OooOOOO.OooO00o(o000oOoO.f30327OooO00o, ooo00oOooOOo);
            ooo00oOooOOo.OooO0o0(604401387);
            coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) ooo00oOooOOo.OooOO0o(o0O0O00.f6591OooO0O0));
            c0072OooO00o.f9912OooO0OO = url;
            c0072OooO00o.OooO0O0(true);
            c0072OooO00o.OooO0Oo(R.drawable.icon_gift_default_gray);
            c0072OooO00o.OooO0OO(R.drawable.icon_gift_default_gray);
            OooOo00 oooOo00OooO00o = Oooo0.OooO00o(c0072OooO00o.OooO00o(), oooOO0OooO00o, ooo00oOooOOo);
            ooo00oOooOOo.Oooo0o0();
            ooo00oOooOOo.Oooo0o0();
            Intrinsics.checkNotNullParameter(other, "other");
            o00.OooO00o(oooOo00OooO00o, null, other, null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 48, 120);
            o00oooo1 = other;
        }
        p100o000oOoO.oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(o00oooo1, url, i, i2));
    }
}
