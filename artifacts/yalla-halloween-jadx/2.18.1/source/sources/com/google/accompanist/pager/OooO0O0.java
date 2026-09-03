package com.google.accompanist.pager;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import o0O0O0O.OooO;
import o0O0O0O.OooO0o;
import p027Oooo0o.o000oOoO;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends Lambda implements Function4<o000oOoO, Integer, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12971Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0O0O.OooO00o f12972Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function4<OooO0o, Integer, oOO00O, Integer, Unit> f12973Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooO f12974Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO0O0(o0O0O0O.OooO00o oooO00o, Function4<? super OooO0o, ? super Integer, ? super oOO00O, ? super Integer, Unit> function4, OooO oooO, int i) {
        super(4);
        this.f12972Oooo0o = oooO00o;
        this.f12973Oooo0oO = function4;
        this.f12974Oooo0oo = oooO;
        this.f12971Oooo = i;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(o000oOoO o000oooo2, Integer num, oOO00O ooo00o, Integer num2) {
        int i;
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
        int i2 = i;
        if ((i2 & 731) == 146 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            o00OOOO0 o00oooo0OooOOOO = SizeKt.OooOOOO(items.OooO0O0(NestedScrollModifierKt.OooO00o(o00OOOO0.OooO00o.f4198Oooo0o, this.f12972Oooo0o, null), 1.0f), null, 3);
            Function4<OooO0o, Integer, oOO00O, Integer, Unit> function4 = this.f12973Oooo0oO;
            OooO oooO = this.f12974Oooo0oo;
            int i3 = this.f12971Oooo;
            composer.OooO0o0(733328855);
            o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooOOOO);
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
            oO00000o.OooO0O0(composer, oooO2, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            function4.invoke(oooO, Integer.valueOf(iIntValue), composer, Integer.valueOf((i2 & 112) | (i3 & 896)));
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
        }
        return Unit.INSTANCE;
    }
}
