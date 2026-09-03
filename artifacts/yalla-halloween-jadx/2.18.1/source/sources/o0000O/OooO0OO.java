package o0000O;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.GifListJson;
import com.yalla.yalla.model.ThemeConfig;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt__StringsKt;
import o00000O.o0OoOo0;
import o0000O0O.OooO;
import o00O0O.OooOO0;
import o0O0O00.Oooo0;
import o0O0O00.o00Oo0;
import p028Oooo0o0.o0O000O;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p031OoooO.o0OOO0o;
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
import p100o000oOoO.oo0ooO;
import p114o00O00o.OooOOOO;
import p114o00O00o.o000oOoO;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o000O0Oo;
import p145o00Oo0.o000OO;
import p175o00OooOo.oo0oO0;
import p254o00ooO0O.o0000O00;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0o;
import p263o00ooo.o000OO0O;
import p442o0OoOo0.Oooo000;
import p507o0o00oOO.o0000O0;
import p517o0o0O00O.o000000;
import p519o0o0O0O.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements o000000 {
    /* JADX WARN: Type inference failed for: r16v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r2v8, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    public static final void OooO00o(GifListJson gifListJson, Function0 function0, oOO00O ooo00o, int i) {
        String beforeText;
        long j;
        long j2;
        long j3;
        String beforeBtnTextColor;
        o00000O0 o00000o0OooO00o;
        String beforeBtnColor;
        o00000O0 o00000o0OooO00o2;
        String beforeTextColor;
        o00000O0 o00000o0OooO00o3;
        String beforeBgColor;
        List listSplit$default;
        long j4;
        oOO00O composer = ooo00o.OooOOo(1236292757);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        ThemeConfig themeConfig = gifListJson.getThemeConfig();
        ArrayList colors = new ArrayList();
        if (themeConfig != null && (beforeBgColor = themeConfig.getBeforeBgColor()) != null && (listSplit$default = StringsKt__StringsKt.split$default(beforeBgColor, new String[]{","}, false, 0, 6, (Object) null)) != null) {
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                o00000O0 o00000o0OooO00o4 = o0000O00.OooO00o((String) it.next());
                if (o00000o0OooO00o4 != null) {
                    j4 = o00000o0OooO00o4.f32070OooO00o;
                } else {
                    o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                    j4 = o0000O0.f41693OooO0OO;
                }
                colors.add(new o00000O0(j4));
            }
            Unit unit = Unit.INSTANCE;
        }
        OooO0Oo(colors);
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
        Intrinsics.checkNotNullParameter(colors, "colors");
        long jOooO00o = OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        long jOooO00o2 = OooOO0.OooO00o(Float.POSITIVE_INFINITY, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        Intrinsics.checkNotNullParameter(colors, "colors");
        o00OOOO0 o00oooo0OooO00o = BackgroundKt.OooO00o(o00oooo0OooO0o0, new o000OO(colors, jOooO00o, jOooO00o2, 0), null, 6);
        composer.OooO0o0(733328855);
        o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4172OooO0O0;
        o0O0O00.o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00oo0oo, false, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<OooO> o0o0o0o0 = o000.f6356OooO0o0;
        OooO oooO = (OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO00o);
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
        ?? r2 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r2);
        ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r3);
        ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r4);
        ?? r16 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r16, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        ThemeConfig themeConfig2 = gifListJson.getThemeConfig();
        String beforePic = themeConfig2 != null ? themeConfig2.getBeforePic() : null;
        composer.OooO0o0(604400049);
        oOO00O.OooOO0 oooOO0OooO00o = OooOOOO.OooO00o(o000oOoO.f30327OooO00o, composer);
        composer.OooO0o0(604401387);
        coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(o0O0O00.f6591OooO0O0));
        c0072OooO00o.f9912OooO0OO = beforePic;
        oo0o0Oo.f42218OooO00o.OooO00o(c0072OooO00o, composer, 56);
        Oooo0.o00.OooO00o(com.umeng.analytics.pro.OooO00o.OooO0O0(c0072OooO00o, oooOO0OooO00o, composer), null, SizeKt.OooOO0(oooO00o, 28), o00oo0oo, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 28080, 96);
        o00OOOO0 o00oooo0OooO0o1 = SizeKt.OooO0o0(oooO00o);
        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o0O0O00.o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
        composer.OooO0o0(-1323940314);
        OooO oooO2 = (OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooO0o1);
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
        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r2, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r16, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        o0000oo.OooO0O0(12, null, composer, 6, 2);
        ThemeConfig themeConfig3 = gifListJson.getThemeConfig();
        if (themeConfig3 == null || (beforeText = themeConfig3.getBeforeText()) == null) {
            beforeText = "";
        }
        String str = beforeText;
        ThemeConfig themeConfig4 = gifListJson.getThemeConfig();
        if (themeConfig4 == null || (beforeTextColor = themeConfig4.getBeforeTextColor()) == null || (o00000o0OooO00o3 = o0000O00.OooO00o(beforeTextColor)) == null) {
            o0000O0 o0000o2 = o0000O0.f41691OooO00o;
            j = o0000O0.f41693OooO0OO;
        } else {
            j = o00000o0OooO00o3.f32070OooO00o;
        }
        long j5 = j;
        long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(13);
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        if (!(((double) 1.0f) > 0.0d)) {
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function4 = o00oOoo.f6560OooO00o;
        o0O000O o0o000o = new o0O000O(true);
        oooO00o.OooOOoo(o0o000o);
        o000O0O0.OooO0OO(str, o0o000o, j5, jOooO0OO, null, null, null, 0L, null, null, 0L, 2, false, 2, null, null, composer, 3072, 3120, 55280);
        o0000oo.OooO0O0(24, null, composer, 6, 2);
        String strOooO00o = o00000.OooO0OO.OooO00o(R.string.Purchase, composer);
        o00OOOO0 o00oooo0OooO00o2 = Oooo000.OooO00o(SizeKt.OooOOO0(oooO00o, 62, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), o00O0O.f3431OooO00o);
        ThemeConfig themeConfig5 = gifListJson.getThemeConfig();
        if (themeConfig5 == null || (beforeBtnColor = themeConfig5.getBeforeBtnColor()) == null || (o00000o0OooO00o2 = o0000O00.OooO00o(beforeBtnColor)) == null) {
            o0000O0 o0000o3 = o0000O0.f41691OooO00o;
            j2 = o0000O0.f41692OooO0O0;
        } else {
            j2 = o00000o0OooO00o2.f32070OooO00o;
        }
        o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(o00oooo0OooO00o2, j2, o000O0Oo.f32099OooO00o);
        composer.OooO0o0(1157296644);
        boolean zOooo0oo = composer.Oooo0oo(function0);
        Object objOooO0o = composer.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new p175o00OooOo.o0OO000o(function0);
            composer.Oooo00o(objOooO0o);
        }
        composer.Oooo0o0();
        float f = 6;
        o00OOOO0 o00oooo0OooO0oo = PaddingKt.OooO0oo(o000O0o.OooO0O0(o00oooo0OooO0O0, false, false, null, (Function0) objOooO0o, KotlinVersion.MAX_COMPONENT_VALUE), f, 4, f, 5);
        long jOooO0OO2 = o0000O0O.o00Oo0.OooO0OO(13);
        ThemeConfig themeConfig6 = gifListJson.getThemeConfig();
        if (themeConfig6 == null || (beforeBtnTextColor = themeConfig6.getBeforeBtnTextColor()) == null || (o00000o0OooO00o = o0000O00.OooO00o(beforeBtnTextColor)) == null) {
            o0000O0 o0000o4 = o0000O0.f41691OooO00o;
            j3 = o0000O0.f41692OooO0O0;
        } else {
            j3 = o00000o0OooO00o.f32070OooO00o;
        }
        o000O0O0.OooO0OO(strOooO00o, o00oooo0OooO0oo, j3, jOooO0OO2, null, null, null, 0L, null, new o0000O0.OooO0o(3), 0L, 0, false, 0, null, new o00000O.oo0o0Oo(0L, new o0OoOo0(), 786431), composer, 3072, 0, 32240);
        o0000oo.OooO0O0(9, null, composer, 6, 2);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function5 = oo0o0O0.f29705OooO00o;
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oo0oO0(gifListJson, function0, i));
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooO0O0(GifListJson gifListJson, oOO00O ooo00o, int i) {
        long j;
        long j2;
        String afterTextColor;
        o00000O0 o00000o0OooO00o;
        String afterIconColor;
        o00000O0 o00000o0OooO00o2;
        String afterBgColor;
        List listSplit$default;
        long j3;
        oOO00O composer = ooo00o.OooOOo(-1981726344);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        ThemeConfig themeConfig = gifListJson.getThemeConfig();
        ArrayList colors = new ArrayList();
        if (themeConfig != null && (afterBgColor = themeConfig.getAfterBgColor()) != null && (listSplit$default = StringsKt__StringsKt.split$default(afterBgColor, new String[]{","}, false, 0, 6, (Object) null)) != null) {
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                o00000O0 o00000o0OooO00o3 = o0000O00.OooO00o((String) it.next());
                if (o00000o0OooO00o3 != null) {
                    j3 = o00000o0OooO00o3.f32070OooO00o;
                } else {
                    o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                    j3 = o0000O0.f41693OooO0OO;
                }
                colors.add(new o00000O0(j3));
            }
        }
        OooO0Oo(colors);
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
        Intrinsics.checkNotNullParameter(colors, "colors");
        long jOooO00o = OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        long jOooO00o2 = OooOO0.OooO00o(Float.POSITIVE_INFINITY, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        Intrinsics.checkNotNullParameter(colors, "colors");
        o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(BackgroundKt.OooO00o(o00oooo0OooO0o0, new o000OO(colors, jOooO00o, jOooO00o2, 0), null, 6), 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o0O0O00.o000000 o000000VarOooO0O0 = p139o00OOOo0.o0O0O00.OooO0O0(composer, 693286680, p028Oooo0o0.o00O000.f2033OooO0o, oooO0O0, composer, -1323940314);
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
        oO00000o.OooO0O0(composer, o000000VarOooO0O0, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
        o000OO0O o000oo0oOooO00o = com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.drawable.ic_room_gift_buy_time_lock, composer);
        if (themeConfig == null || (afterIconColor = themeConfig.getAfterIconColor()) == null || (o00000o0OooO00o2 = o0000O00.OooO00o(afterIconColor)) == null) {
            o0000O0 o0000o2 = o0000O0.f41691OooO00o;
            j = o0000O0.f41692OooO0O0;
        } else {
            j = o00000o0OooO00o2.f32070OooO00o;
        }
        o0OOO0o.OooO00o(o000oo0oOooO00o, null, SizeKt.OooOO0(oooO00o, 14), j, composer, 440, 0);
        o0000oo.OooO0O0(4, null, composer, 6, 2);
        String strOooO00o = p625o0oo0oo.o000O0O0.OooO00o(o00000.OooO0OO.OooO00o(R.string.user_info_vehicle_days, composer), String.valueOf(gifListJson.getDayNum()));
        if (themeConfig == null || (afterTextColor = themeConfig.getAfterTextColor()) == null || (o00000o0OooO00o = o0000O00.OooO00o(afterTextColor)) == null) {
            o0000O0 o0000o3 = o0000O0.f41691OooO00o;
            j2 = o0000O0.f41693OooO0OO;
        } else {
            j2 = o00000o0OooO00o.f32070OooO00o;
        }
        o000O0O0.OooO0OO(strOooO00o, null, j2, o0000O0O.o00Oo0.OooO0OO(13), null, null, null, 0L, null, null, 0L, 2, false, 2, null, null, composer, 3072, 3120, 55282);
        o0O0OO0.OooO00o(composer);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new p175o00OooOo.oo0ooO(gifListJson, i));
    }

    public static final void OooO0OO(View view, LayoutNode layoutNode) {
        long jOooO0o0 = Oooo0.OooO0o0(layoutNode.f6165o00Ooo);
        int iRoundToInt = MathKt.roundToInt(o00O0O.OooO.OooO0OO(jOooO0o0));
        int iRoundToInt2 = MathKt.roundToInt(o00O0O.OooO.OooO0Oo(jOooO0o0));
        view.layout(iRoundToInt, iRoundToInt2, view.getMeasuredWidth() + iRoundToInt, view.getMeasuredHeight() + iRoundToInt2);
    }

    public static final void OooO0Oo(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            arrayList.add(new o00000O0(o0000O0.f41692OooO0O0));
        }
        if (arrayList.size() == 1) {
            arrayList.add(arrayList.get(0));
        }
    }
}
