package p028Oooo0o0;

import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO0OO;
import o0000O0O.OooOo;
import o0000O0O.Oooo000;
import o0O0O00.o000000O;
import o0O0O00.o00000O0;
import o0O0O00.o000O000;
import o0O0O00.o0O0O00;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0000O {

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O000 f2115Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O000 o000o001) {
            super(1);
            this.f2115Oooo0o = o000o001;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o000O000 placeRelative = this.f2115Oooo0o;
            OooOo.OooO00o oooO00o2 = OooOo.f27310OooO0O0;
            long j = OooOo.f27311OooO0OO;
            o000O000.OooO00o.C0363OooO00o c0363OooO00o = o000O000.OooO00o.f35268OooO00o;
            Objects.requireNonNull(layout);
            Intrinsics.checkNotNullParameter(placeRelative, "$this$placeRelative");
            if (layout.OooO00o() == LayoutDirection.Ltr || layout.OooO0O0() == 0) {
                long jO000oOoO = placeRelative.o000oOoO();
                OooOo.OooO00o oooO00o3 = OooOo.f27310OooO0O0;
                placeRelative.OooooOo(Oooo000.OooO00o(((int) (j >> 32)) + ((int) (jO000oOoO >> 32)), OooOo.OooO0OO(jO000oOoO) + OooOo.OooO0OO(j)), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null);
            } else {
                int iOooO0O0 = layout.OooO0O0() - ((int) (placeRelative.f35267Oooo0oo >> 32));
                OooOo.OooO00o oooO00o4 = OooOo.f27310OooO0O0;
                long jOooO00o = Oooo000.OooO00o(iOooO0O0 - ((int) (j >> 32)), OooOo.OooO0OO(j));
                long jO000oOoO2 = placeRelative.o000oOoO();
                placeRelative.OooooOo(Oooo000.OooO00o(((int) (jOooO00o >> 32)) + ((int) (jO000oOoO2 >> 32)), OooOo.OooO0OO(jO000oOoO2) + OooOo.OooO0OO(jOooO00o)), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null);
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static o000000O OooO00o(o0O000 o0o001, @NotNull o00000O0 measure, @NotNull o0O0O00 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jOooOOO = o0o001.OooOOO(measure, measurable, j);
        o0o001.o0OoOo0();
        o000O000 o000o000Oooo000 = measurable.Oooo000(OooO0OO.OooO0Oo(j, jOooOOO));
        return measure.OooOooo(o000o000Oooo000.f35265Oooo0o, o000o000Oooo000.f35266Oooo0oO, MapsKt.emptyMap(), new OooO00o(o000o000Oooo000));
    }
}
