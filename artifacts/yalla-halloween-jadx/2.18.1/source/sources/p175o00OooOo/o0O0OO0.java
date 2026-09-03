package p175o00OooOo;

import Oooo000.o00O00;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import com.app.base.view.FacePanelView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import p027Oooo0o.o000;
import p027Oooo0o.o000oOoO;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p047Oooooo0.o00OO0OO;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p114o00O00o.OooOOOO;
import p114o00O00o.OooOo00;
import p145o00Oo0.o00000OO;
import p145o00Oo0.o000O0Oo;
import p175o00OooOo.o0O0O0o0;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0o;
import p497o0o00Oo.OooOOO0;
import p507o0o00oOO.o0000O0;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0OO0 extends Lambda implements Function1<o000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FacePanelView f32714Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OO0(FacePanelView facePanelView) {
        super(1);
        this.f32714Oooo0o = facePanelView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000 o000Var) {
        o000 LazyRow = o000Var;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final FacePanelView facePanelView = this.f32714Oooo0o;
        final o00OO0OO<FacePanelView.OooO0OO> o00oo0oo = facePanelView.f11965OoooOOo;
        LazyRow.OooO0OO(o00oo0oo.size(), null, new Function1<Integer, Object>() { // from class: com.app.base.view.FacePanelView$IndicatorContainer$1$1$invoke$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Integer num) {
                o00oo0oo.get(num.intValue());
                return null;
            }
        }, o00O0000.OooO0O0(-1091073711, true, new Function4<o000oOoO, Integer, oOO00O, Integer, Unit>() { // from class: com.app.base.view.FacePanelView$IndicatorContainer$1$1$invoke$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
            @Override // kotlin.jvm.functions.Function4
            public final Unit invoke(o000oOoO o000oooo2, Integer num, oOO00O ooo00o, Integer num2) {
                int i;
                int i2;
                long jOooO0OO;
                Object obj;
                boolean z;
                o000oOoO items = o000oooo2;
                int iIntValue = num.intValue();
                oOO00O composer = ooo00o;
                int iIntValue2 = num2.intValue();
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((iIntValue2 & 14) == 0) {
                    i = (composer.Oooo0oo(items) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 112) == 0) {
                    i |= composer.OooO(iIntValue) ? 32 : 16;
                }
                if ((i & 731) == 146 && composer.OooOo0()) {
                    composer.OooOoo0();
                } else {
                    int i3 = (i & 112) | (i & 14);
                    FacePanelView.OooO0OO oooO0OO = (FacePanelView.OooO0OO) o00oo0oo.get(iIntValue);
                    if ((i3 & 112) == 0) {
                        i2 = (composer.OooO(iIntValue) ? 32 : 16) | i3;
                    } else {
                        i2 = i3;
                    }
                    if ((i3 & 896) == 0) {
                        i2 |= composer.Oooo0oo(oooO0OO) ? 256 : 128;
                    }
                    if ((i2 & 5841) == 1168 && composer.OooOo0()) {
                        composer.OooOoo0();
                    } else {
                        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                        o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(SizeKt.OooO0Oo(SizeKt.OooOO0o(oooO00o, 65)), false, false, null, new o0O0O0o0(facePanelView, iIntValue), 253);
                        o0O0O0O.OooOO0 oooOO1 = facePanelView.f11960OoooO0;
                        if (oooOO1 != null && oooOO1.OooO0o0() == iIntValue) {
                            jOooO0OO = o00000OO.OooO0OO(4293980400L);
                        } else {
                            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                            jOooO0OO = o0000O0.f41692OooO0O0;
                        }
                        o00OOOO0 o00oooo0OooO0O1 = BackgroundKt.OooO0O0(o00oooo0OooO0O0, jOooO0OO, o000O0Oo.f32099OooO00o);
                        composer.OooO0o0(733328855);
                        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
                        composer.OooO0o0(-1323940314);
                        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
                        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O);
                        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(androidx.compose.ui.platform.o000.f6364OooOOOO);
                        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O1);
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
                        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
                        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
                        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
                        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
                        composer.OooO0o0(2058660585);
                        composer.OooO0o0(-2137368960);
                        if (StringsKt.OooOoOO(oooO0OO.f11975OooO0O0, "android")) {
                            obj = Uri.parse(oooO0OO.f11975OooO0O0);
                            z = true;
                        } else {
                            obj = oooO0OO.f11975OooO0O0;
                            z = false;
                        }
                        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                        o00OOOO0 o00oooo0OooOOO0 = (Intrinsics.areEqual(p044OooooOO.o00O00O.OooO0O0(OooOOO0.OooO0o0().OooOO0o(), composer).getValue(), Boolean.FALSE) && oooO0OO.f11976OooO0OO == 1) ? o00O00.OooOOO0(oooO00o, false, 0L, 4, false, false, 26, -2, 1, 571) : oooO00o;
                        composer.OooO0o0(604400049);
                        oOO00O.OooOO0 oooOO0OooO00o = OooOOOO.OooO00o(p114o00O00o.o000oOoO.f30327OooO00o, composer);
                        composer.OooO0o0(604401387);
                        coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(o0O0O00.f6591OooO0O0));
                        c0072OooO00o.f9912OooO0OO = obj;
                        Unit unit = Unit.INSTANCE;
                        OooOo00 oooOo00OooO0O0 = com.umeng.analytics.pro.OooO00o.OooO0O0(c0072OooO00o, oooOO0OooO00o, composer);
                        o0O0O00.OooOO0.OooO00o.C0361OooO00o c0361OooO00o = o0O0O00.OooOO0.OooO00o.f35238OooO0O0;
                        o00OOOO0 o00oooo0OooOO0 = SizeKt.OooOO0(oooO00o, z ? 24 : 30);
                        p048OoooooO.o00OO0OO alignment = o00OO0O0.OooO00o.f4175OooO0o;
                        Intrinsics.checkNotNullParameter(o00oooo0OooOO0, "<this>");
                        Intrinsics.checkNotNullParameter(alignment, "alignment");
                        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
                        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                        Oooo0.o00.OooO00o(oooOo00OooO0O0, null, o00oooo0OooOO0.OooOOoo(new p028Oooo0o0.o00O00O(alignment, false)).OooOOoo(o00oooo0OooOOO0), null, c0361OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24624, 104);
                        o00OOOO0 o00oooo0OooO0O2 = BackgroundKt.OooO0O0(SizeKt.OooOO0o(oooO00o, 1), o00000OO.OooO0OO(4293059298L), o000O0Oo.f32099OooO00o);
                        p048OoooooO.o00OO0OO alignment2 = o00OO0O0.OooO00o.f4177OooO0oO;
                        Intrinsics.checkNotNullParameter(o00oooo0OooO0O2, "<this>");
                        Intrinsics.checkNotNullParameter(alignment2, "alignment");
                        o0000oo.OooO0OO(14, o00oooo0OooO0O2.OooOOoo(new p028Oooo0o0.o00O00O(alignment2, false)), composer, 6, 0);
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                        composer.Oooo0o();
                        composer.Oooo0o0();
                        composer.Oooo0o0();
                    }
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }
}
