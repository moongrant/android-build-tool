package p566o0oOo00O;

import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o0O0O0O;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p257o00ooOO0.o0oO0O0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0000Ooo f45202OooO00o = new o0000Ooo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static Function4<o0O0O0O, Integer, oOO00O, Integer, Unit> f45203OooO0O0 = (o00) o00O0000.OooO0O0(-1170650001, false, OooO00o.f45204Oooo0o);

    public static final class OooO00o extends Lambda implements Function4<o0O0O0O, Integer, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f45204Oooo0o = new OooO00o();

        public OooO00o() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(o0O0O0O o0o0o0o, Integer num, oOO00O ooo00o, Integer num2) {
            o0O0O0O BottomListEntityDialog = o0o0o0o;
            int iIntValue = num.intValue();
            oOO00O ooo00o2 = ooo00o;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(BottomListEntityDialog, "$this$BottomListEntityDialog");
            if ((iIntValue2 & 112) == 0) {
                iIntValue2 |= ooo00o2.OooO(iIntValue) ? 32 : 16;
            }
            if ((iIntValue2 & 721) == 144 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                if (iIntValue == 0) {
                    o0oO0O0o.OooO0OO(R.drawable.icon_userinfo_vip_change_bp, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ooo00o2, 0, 6);
                }
            }
            return Unit.INSTANCE;
        }
    }
}
