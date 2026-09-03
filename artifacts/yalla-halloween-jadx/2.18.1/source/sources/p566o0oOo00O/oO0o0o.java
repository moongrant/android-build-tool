package p566o0oOo00O;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.ui.activity.user.VipActivity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000.OooO0O0;
import o00000.OooO0OO;
import o000000.OooO00o;
import o0000O0O.OooO;
import o00OO0O.OooOO0O;
import o0O0O00.OooOO0;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import o0O0O0O.OooO0o;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.o0O0OOO0;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p033OoooO00.o00O0O;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p145o00Oo0.o000O0Oo;
import p263o00ooo.o000OO0O;
import p442o0OoOo0.Oooo000;
import p507o0o00oOO.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0o0o extends Lambda implements Function4<OooO0o, Integer, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VipActivity f45387Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0o(VipActivity vipActivity) {
        super(4);
        this.f45387Oooo0o = vipActivity;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0154  */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r21v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r2v11, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r3v14, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(OooO0o oooO0o, Integer num, oOO00O ooo00o, Integer num2) {
        int i;
        int i2;
        oOO00O ooo00o2;
        Function0<OooO00o> function0;
        OooO0o HorizontalPager = oooO0o;
        int iIntValue = num.intValue();
        oOO00O composer = ooo00o;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if ((iIntValue2 & 14) == 0) {
            i = (composer.Oooo0oo(HorizontalPager) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 112) == 0) {
            i |= composer.OooO(iIntValue) ? 32 : 16;
        }
        if ((i & 731) == 146 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            Integer numValueOf = Integer.valueOf(iIntValue);
            int i3 = i & 112;
            composer.OooO0o0(511388516);
            boolean zOooo0oo = composer.Oooo0oo(numValueOf) | composer.Oooo0oo(HorizontalPager);
            Object objOooO0o = composer.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new oO0Ooooo(HorizontalPager, iIntValue);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o00OOOO0 o00oooo0OooO00o = GraphicsLayerModifierKt.OooO00o(oooO00o, (Function1) objOooO0o);
            VipActivity vipActivity = this.f45387Oooo0o;
            composer.OooO0o0(733328855);
            o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4172OooO0O0;
            o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo, false, composer);
            composer.OooO0o0(-1323940314);
            o0O0O0o0<OooO> o0o0o0o0 = o000.f6356OooO0o0;
            OooO oooO = (OooO) composer.OooOO0o(o0o0o0o0);
            o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Objects.requireNonNull(OooO00o.f26575OooO0Oo);
            Function0<OooO00o> function1 = OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO00o);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function1);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            ?? r10 = OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r10);
            ?? r2 = OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r2);
            ?? r3 = OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r3);
            ?? r21 = OooO00o.C0279OooO00o.f26582OooO0oO;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r21, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5741OooO00o;
            int i4 = iIntValue + 1;
            VipActivity.OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
            Objects.requireNonNull(vipActivity);
            VipLevel.Companion companion = VipLevel.INSTANCE;
            int i5 = VipActivity.o0Oo0oo.$EnumSwitchMapping$0[companion.OooO0O0(i4).ordinal()];
            if (i5 == 1) {
                i2 = R.drawable.user_ka_vip_level_page_1;
            } else if (i5 == 2) {
                i2 = R.drawable.user_ka_vip_level_page_2;
            } else if (i5 == 3) {
                i2 = R.drawable.user_ka_vip_level_page_3;
            } else if (i5 == 4) {
                i2 = R.drawable.user_ka_vip_level_page_4;
            } else if (i5 != 5) {
                i2 = R.drawable.user_ka_vip_level_page_1;
            } else {
                i2 = R.drawable.user_ka_vip_level_page_5;
            }
            o000OO0O o000oo0oOooO00o = OooO0O0.OooO00o(i2, composer);
            o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
            OooOO0.OooO00o.OooO0O0 oooO0O1 = OooOO0.OooO00o.f35243OooO0oO;
            o00OO0OO o00oo0oo2 = o00OO0O0.OooO00o.f4175OooO0o;
            Oooo0.o00.OooO00o(o000oo0oOooO00o, null, o00oooo0OooO0o0, o00oo0oo2, oooO0O1, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 28088, 96);
            VipActivity.OooOoOO(vipActivity, boxScopeInstance, iIntValue, composer, i3 | 518);
            if (vipActivity.Oooo000().getPersonalKaVipModel().getKaVIPState() == VipState.VipFrozen.getValue() && vipActivity.Oooo000().getPersonalKaVipModel().getKaVIPLv() == companion.OooO0O0(i4).getValue()) {
                float f = 16;
                o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(SizeKt.OooOO0o(Oooo000.OooO00o(oooO00o, o00O0O.OooO0OO(f)), 298), 170);
                o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                o00OOOO0 o00oooo0OooO00o2 = boxScopeInstance.OooO00o(BackgroundKt.OooO0O0(o00oooo0OooO0oO, o0000O0.f41703OooOOO0, o000O0Oo.f32099OooO00o), o00oo0oo2);
                composer.OooO0o0(733328855);
                o000000 o000000VarOooO0Oo2 = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo, false, composer);
                composer.OooO0o0(-1323940314);
                OooO oooO2 = (OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO00o2);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    function0 = function1;
                    composer.OooOoO0(function0);
                } else {
                    function0 = function1;
                    composer.Oooo00O();
                }
                Function0<OooO00o> function2 = function0;
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo2, r10, composer, oooO2, r2, composer, layoutDirection2, r3, composer, o00ooooo3, r21, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                o00OOOO0 o00oooo0OooO00o3 = boxScopeInstance.OooO00o(PaddingKt.OooO(oooO00o, (float) 25.5d, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (float) 23.5d, 20, 2), o00OO0O0.OooO00o.f4178OooO0oo);
                composer.OooO0o0(693286680);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, o00OO0O0.OooO00o.f4180OooOO0O, composer);
                composer.OooO0o0(-1323940314);
                OooO oooO3 = (OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o00Oo0.OooO0O0(o00oooo0OooO00o3);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function2);
                } else {
                    composer.Oooo00O();
                }
                ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r10, composer, oooO3, r2, composer, layoutDirection3, r3, composer, o00ooooo4, r21, composer, "composer", composer), composer, 0);
                Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.user_ka_vip_look, composer), null, SizeKt.OooOO0(oooO00o, f), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
                o0O0OOO0.OooO00o(SizeKt.OooOO0o(oooO00o, 4), composer, 6);
                ooo00o2 = composer;
                o000O0O0.OooO0OO(OooOo.OooO00o(OooO0OO.OooO00o(R.string.user_ka_vip_forzen_hint, composer), String.valueOf(Math.abs(vipActivity.Oooo000().getPersonalKaVipModel().getCurrentExperience()))), null, o0000O0.f41690OooO, o0000O0O.o00Oo0.OooO0OO(12), null, null, null, o0000O0O.o00Oo0.OooO0o0(4294967296L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), null, null, 0L, 0, false, 0, null, null, ooo00o2, 3456, 0, 65394);
                OooOO0O.OooO00o(ooo00o2);
            } else {
                ooo00o2 = composer;
            }
            o0O0OO0.OooO00o(ooo00o2);
        }
        return Unit.INSTANCE;
    }
}
