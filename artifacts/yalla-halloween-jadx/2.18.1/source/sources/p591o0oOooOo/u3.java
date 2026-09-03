package p591o0oOooOo;

import Oooo0.o000oOoO;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.platform.o000;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import org.jetbrains.annotations.NotNull;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p261o00ooOoO.u;
import p479o0o00.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class u3 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final u3 f47344OooO00o = new u3();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static Function3<o00OOOO0, oOO00O, Integer, Unit> f47345OooO0O0 = (o00) o00O0000.OooO0O0(2054158371, false, OooO00o.f47347Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static Function2<oOO00O, Integer, Unit> f47346OooO0OO = (o00) o00O0000.OooO0O0(-373123527, false, OooO0O0.f47348Oooo0o);

    public static final class OooO00o extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f47347Oooo0o = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
            o00OOOO0 modifier = o00oooo1;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            if ((iIntValue & 14) == 0) {
                iIntValue |= ooo00o2.Oooo0oo(modifier) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                float fOoooOoo = ((OooO) ooo00o2.OooOO0o(o000.f6356OooO0o0)).OoooOoo(8);
                o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(modifier);
                Float fValueOf = Float.valueOf(fOoooOoo);
                ooo00o2.OooO0o0(1157296644);
                boolean zOooo0oo = ooo00o2.Oooo0oo(fValueOf);
                Object objOooO0o = ooo00o2.OooO0o();
                if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                    objOooO0o = new t3(fOoooOoo);
                    ooo00o2.Oooo00o(objOooO0o);
                }
                ooo00o2.Oooo0o0();
                o000oOoO.OooO00o(o00oooo0OooO0o, (Function1) objOooO0o, ooo00o2, 0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f47348Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                OooOo.f40725OooO00o.OooO00o(null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, u.OooO0O0(ooo00o2).OooOo00(), ooo00o2, 3072, 3);
            }
            return Unit.INSTANCE;
        }
    }
}
