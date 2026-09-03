package p579o0oOoOOo;

import Oooo000.OooO0o;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000.OooO0O0;
import o00000.OooO0OO;
import o0000O0O.OooO;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import p028Oooo0o0.o0O000O;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000O0O0;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o000O0Oo;
import p254o00ooO0O.o0000oo;
import p261o00ooOoO.u;
import p507o0o00oOO.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f46004Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f46005Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f46006Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f46007Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f46008OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f46009OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, String str, int i2, int i3, String str2, int i4) {
            super(2);
            this.f46005Oooo0o = i;
            this.f46006Oooo0oO = str;
            this.f46007Oooo0oo = i2;
            this.f46004Oooo = i3;
            this.f46009OoooO00 = str2;
            this.f46008OoooO0 = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            l.OooO00o(this.f46005Oooo0o, this.f46006Oooo0oO, this.f46007Oooo0oo, this.f46004Oooo, this.f46009OoooO00, ooo00o, this.f46008OoooO0 | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(int i, String str, int i2, int i3, String str2, oOO00O ooo00o, int i4) {
        int i5;
        oOO00O composer = ooo00o.OooOOo(404602597);
        if ((i4 & 14) == 0) {
            i5 = (composer.OooO(i) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            i5 |= composer.Oooo0oo(str) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i5 |= composer.OooO(i2) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            i5 |= composer.OooO(i3) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
        }
        if ((57344 & i4) == 0) {
            i5 |= composer.Oooo0oo(str2) ? 16384 : 8192;
        }
        if ((46811 & i5) == 9362 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(PaddingKt.OooO(SizeKt.OooO0o(oooO00o), 16, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (float) 10.5d, 1);
            o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
            composer.OooO0o0(693286680);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
            composer.OooO0o0(-1323940314);
            OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0oO);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            float f = 35;
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, i, composer), null, SizeKt.OooOO0(oooO00o, f), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            o0000oo.OooO0O0(10, null, composer, 6, 2);
            o000O0O0.OooO0OO(str, null, u.OooO0O0(composer).OooO0o(), o0000O0O.o00Oo0.OooO0OO(14), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i5 >> 3) & 14) | 3072, 0, 65522);
            o0000oo.OooO0O0(4, null, composer, 6, 2);
            Oooo0.o00.OooO00o(OooO0O0.OooO00o(i2, composer), null, SizeKt.OooOO0(oooO00o, 15), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            float f2 = 1;
            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
            if (!(((double) 1.0f) > 0.0d)) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
            Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
            o0O000O o0o000o = new o0O000O(true);
            oooO00o.OooOOoo(o0o000o);
            o0000oo.OooO0O0(f2, o0o000o, composer, 6, 0);
            Oooo0.o00.OooO00o(OooO0O0.OooO00o(i3, composer), null, SizeKt.OooOO0(oooO00o, f), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            o000O0O0.OooO0OO(str2, PaddingKt.OooO(SizeKt.OooOO0o(oooO00o, 37), 5, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14), u.OooO0O0(composer).OooO0oO(), o0000O0O.o00Oo0.OooO0OO(13), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, ((i5 >> 12) & 14) | 3120, 0, 65520);
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(i, str, i2, i3, str2, i4));
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooO0O0(oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(65389384);
        if (i == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            composer.OooO0o0(-483455358);
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
            composer.OooO0o0(-1323940314);
            OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(oooO00o);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            OooO00o(R.drawable.icon_post_send_gift_info_head_1, "Diana Campos", R.drawable.icon_female, R.drawable.icon_post_send_gift_info_gift_1, "x1", composer, 24624);
            float f = (float) 0.5d;
            float f2 = 61;
            o0000oo.OooO0OO(f, BackgroundKt.OooO0O0(PaddingKt.OooO(SizeKt.OooO0o(oooO00o), f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14), u.OooO0O0(composer).OooOO0o(), o000O0Oo.f32099OooO00o), composer, 6, 0);
            OooO00o(R.drawable.icon_post_send_gift_info_head_2, "Jioke Ugoorji", R.drawable.icon_male, R.drawable.icon_post_send_gift_info_gift_2, "x77", composer, 24624);
            o0000oo.OooO0OO(f, BackgroundKt.OooO0O0(PaddingKt.OooO(SizeKt.OooO0o(oooO00o), f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 14), u.OooO0O0(composer).OooOO0o(), o000O0Oo.f32099OooO00o), composer, 6, 0);
            String strOooO00o = OooO0OO.OooO00o(R.string.post_send_gift_info_info, composer);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            long j = o0000O0.f41786o0000ooO;
            float f3 = 16;
            o000O0O0.OooO0OO(strOooO00o, PaddingKt.OooO(PaddingKt.OooO0oO(oooO00o, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13), j, o0000O0O.o00Oo0.OooO0OO(14), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3504, 0, 65520);
            o000O0O0.OooO0OO("E.g: 465=3x1+6x77", PaddingKt.OooO(PaddingKt.OooO0oO(oooO00o, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13), j, o0000O0O.o00Oo0.OooO0OO(14), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3510, 0, 65520);
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new k(i));
    }
}
