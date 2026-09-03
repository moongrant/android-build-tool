package p580o0oOoOo;

import Oooo000.o00Ooo;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import o00000.OooO0OO;
import o0000O0O.o00Oo0;
import p027Oooo0o.o000O00O;
import p031OoooO.o000O0O0;
import p033OoooO00.o00O0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p254o00ooO0O.o000O0o;
import p507o0o00oOO.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO0o00 extends Lambda implements Function3<o00Ooo, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f46408Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O00O f46409Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f46410Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o00(CoroutineScope coroutineScope, o000O00O o000o00o2, o0O00OO<Boolean> o0o00oo2) {
        super(3);
        this.f46408Oooo0o = coroutineScope;
        this.f46409Oooo0oO = o000o00o2;
        this.f46410Oooo0oo = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o00Ooo o00ooo2, oOO00O ooo00o, Integer num) {
        o00Ooo AnimatedVisibility = o00ooo2;
        oOO00O ooo00o2 = ooo00o;
        num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        Function3<o00O000<?>, p100o000oOoO.o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        String strOooO00o = OooO0OO.OooO00o(R.string.New_Applications, ooo00o2);
        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
        o000O0O0.OooO0OO(strOooO00o, PaddingKt.OooO0o(o000O0o.OooO0O0(BackgroundKt.OooO0O0(PaddingKt.OooO(o00OOOO0.OooO00o.f4198Oooo0o, 16, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12, 6), o0000O0.f41714OooOoO, o00O0O.OooO00o()), false, false, null, new o0OOooO0(this.f46408Oooo0o, this.f46409Oooo0oO, this.f46410Oooo0oo), 253), 8, 4), o0000O0.f41710OooOo0, o00Oo0.OooO0OO(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, 3456, 0, 65520);
        return Unit.INSTANCE;
    }
}
