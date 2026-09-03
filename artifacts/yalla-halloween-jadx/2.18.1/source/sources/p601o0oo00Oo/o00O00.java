package p601o0oo00Oo;

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
import com.yalla.yalla.common.model.ShopVehicleListModel;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o00000O.oo0o0Oo;
import o0000O0O.OooO;
import o0O0O00.o000000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O000O;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000O0O0;
import p032OoooO0.OooOo;
import p033OoooO00.o00O0O;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o000O0Oo;
import p261o00ooOoO.u;
import p442o0OoOo0.Oooo000;
import p507o0o00oOO.o0000O0;
import p617o0oo0o.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00 {

    public static final class OooO00o extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<String> f48079Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f48080Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O00OO<String> o0o00oo2, int i) {
            super(1);
            this.f48079Oooo0o = o0o00oo2;
            this.f48080Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            if (StringsKt.trim((CharSequence) it).toString().length() == 0) {
                this.f48079Oooo0o.setValue("");
            } else if (it.length() <= this.f48080Oooo0oO) {
                this.f48079Oooo0o.setValue(it);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<Function2<? super oOO00O, ? super Integer, ? extends Unit>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<String> f48081Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f48082Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0O00OO<String> o0o00oo2, String str) {
            super(3);
            this.f48081Oooo0o = o0o00oo2;
            this.f48082Oooo0oO = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super oOO00O, ? super Integer, ? extends Unit> function2, oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2;
            Function2<? super oOO00O, ? super Integer, ? extends Unit> innerTextField = function2;
            oOO00O ooo00o3 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= ooo00o3.Oooo0oo(innerTextField) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && ooo00o3.OooOo0()) {
                ooo00o3.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                ooo00o3.OooO0o0(-2060811154);
                if (this.f48081Oooo0o.getValue().length() == 0) {
                    String str = this.f48082Oooo0oO;
                    if (str == null) {
                        str = "";
                    }
                    ooo00o2 = ooo00o3;
                    o000O0O0.OooO0OO(str, null, u.OooO0O0(ooo00o3).OooOO0(), o00Oo0.OooO00o(14, ooo00o3), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, 0, 0, 65522);
                } else {
                    ooo00o2 = ooo00o3;
                }
                ooo00o2.Oooo0o0();
                innerTextField.invoke(ooo00o2, Integer.valueOf(i & 14));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f48083Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f48084Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<String> f48085Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f48086Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f48087OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f48088OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00OOOO0 o00oooo1, o0O00OO<String> o0o00oo2, String str, int i, int i2, int i3) {
            super(2);
            this.f48084Oooo0o = o00oooo1;
            this.f48085Oooo0oO = o0o00oo2;
            this.f48086Oooo0oo = str;
            this.f48083Oooo = i;
            this.f48088OoooO00 = i2;
            this.f48087OoooO0 = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00O00.OooO00o(this.f48084Oooo0o, this.f48085Oooo0oO, this.f48086Oooo0oo, this.f48083Oooo, ooo00o, this.f48088OoooO00 | 1, this.f48087OoooO0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x010a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0113  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:64:0x0171  */
    /* JADX WARN: Code duplicated, block: B:66:0x0175  */
    /* JADX WARN: Code duplicated, block: B:69:0x0197  */
    /* JADX WARN: Code duplicated, block: B:71:0x019a  */
    /* JADX WARN: Code duplicated, block: B:75:0x024e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0260  */
    /* JADX WARN: Code duplicated, block: B:79:0x026c  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v7, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable o00OOOO0 o00oooo1, @NotNull o0O00OO<String> textValue, @Nullable String str, int i, @Nullable oOO00O ooo00o, int i2, int i3) {
        o00OOOO0 o00oooo2;
        int i4;
        int i5;
        o00OOOO0 o00oooo3;
        int i6;
        o00OOOO0.OooO00o oooO00o;
        o000000 o000000VarOooO00o;
        OooO oooO;
        LayoutDirection layoutDirection;
        o00OOOOo o00ooooo2;
        Function0<o000000.OooO00o> function0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0;
        String value;
        boolean zOooo0oo;
        Object objOooO0o;
        Function1 function1;
        o00OOOO0 o00oooo0OooO0o;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        oOO00O composer = ooo00o.OooOOo(-1434261148);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            o00oooo2 = o00oooo1;
        } else if ((i2 & 14) == 0) {
            o00oooo2 = o00oooo1;
            i4 = (composer.Oooo0oo(o00oooo2) ? 4 : 2) | i2;
        } else {
            o00oooo2 = o00oooo1;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composer.Oooo0oo(textValue) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= composer.Oooo0oo(str) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 == 0) {
            if ((i2 & 7168) == 0) {
                i5 = i;
                i4 |= composer.OooO(i5) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
            }
            if ((i4 & 5851) == 1170 || !composer.OooOo0()) {
                if (i7 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i8 != 0) {
                    i6 = ShopVehicleListModel.VehicleTagType_Vip300;
                } else {
                    i6 = i5;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                float f = 12;
                o00OOOO0 o00oooo0OooO00o = Oooo000.OooO00o(SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o).OooOOoo(o00oooo3), 150), o00O0O.OooO0OO(f));
                o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                float f2 = 16;
                o00OOOO0 o00oooo0OooO0oo = PaddingKt.OooO0oo(BackgroundKt.OooO0O0(o00oooo0OooO00o, o0000O0.f41781o0000oO0, o000O0Oo.f32099OooO00o), f2, f2, f2, f);
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
                composer.OooO0o0(-1323940314);
                oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
                layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oo);
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
                value = textValue.getValue();
                Integer numValueOf = Integer.valueOf(i6);
                composer.OooO0o0(511388516);
                zOooo0oo = composer.Oooo0oo(numValueOf) | composer.Oooo0oo(textValue);
                objOooO0o = composer.OooO0o();
                if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                    objOooO0o = new OooO00o(textValue, i6);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                function1 = (Function1) objOooO0o;
                o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
                Intrinsics.checkNotNullParameter(o00oooo0OooO0o, "<this>");
                if (!(((double) 1.0f) > 0.0d)) {
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                }
                Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                Function1<o00O000o, Unit> function4 = o00oOoo.f6560OooO00o;
                OooOo.OooO00o(value, function1, o00oooo0OooO0o.OooOOoo(new o0O000O(true)), false, false, new oo0o0Oo(u.OooO0O0(composer).OooO0o(), o00Oo0.OooO00o(14, composer), null, null, null, 0L, null, null, 0L, 262140), null, null, false, 0, null, null, null, null, o00O0000.OooO00o(composer, 251633123, new OooO0O0(textValue, str)), composer, 0, 24576, 16344);
                StringBuilder sb = new StringBuilder();
                sb.append(textValue.getValue().length());
                sb.append('/');
                sb.append(i6);
                o000O0O0.OooO0OO(sb.toString(), SizeKt.OooO0o(oooO00o), o0000O0.f41782o0000oOO, o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, new o0000O0.OooO0o(6), 0L, 0, false, 0, null, null, composer, 3504, 0, 65008);
                o0O0OO0.OooO00o(composer);
            } else {
                composer.OooOoo0();
                o00oooo3 = o00oooo2;
                i6 = i5;
            }
            oo0oooOooOo = composer.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO0OO(o00oooo3, textValue, str, i6, i2, i3));
        }
        i4 |= 3072;
        i5 = i;
        if ((i4 & 5851) == 1170) {
            if (i7 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i8 != 0) {
                i6 = ShopVehicleListModel.VehicleTagType_Vip300;
            } else {
                i6 = i5;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function5 = oo0o0O0.f29705OooO00o;
            oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            float f3 = 12;
            o00OOOO0 o00oooo0OooO00o2 = Oooo000.OooO00o(SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o).OooOOoo(o00oooo3), 150), o00O0O.OooO0OO(f3));
            o0000O0 o0000o2 = o0000O0.f41691OooO00o;
            float f4 = 16;
            o00OOOO0 o00oooo0OooO0oo2 = PaddingKt.OooO0oo(BackgroundKt.OooO0O0(o00oooo0OooO00o2, o0000O0.f41781o0000oO0, o000O0Oo.f32099OooO00o), f4, f4, f4, f3);
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o002 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
            composer.OooO0o0(-1323940314);
            oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
            layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oo2);
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
            value = textValue.getValue();
            Integer numValueOf2 = Integer.valueOf(i6);
            composer.OooO0o0(511388516);
            zOooo0oo = composer.Oooo0oo(numValueOf2) | composer.Oooo0oo(textValue);
            objOooO0o = composer.OooO0o();
            if (zOooo0oo) {
                objOooO0o = new OooO00o(textValue, i6);
                composer.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new OooO00o(textValue, i6);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            function1 = (Function1) objOooO0o;
            o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
            Intrinsics.checkNotNullParameter(o00oooo0OooO0o, "<this>");
            if (!(((double) 1.0f) > 0.0d)) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            Function1<o00O000o, Unit> function6 = o00oOoo.f6560OooO00o;
            Function1<o00O000o, Unit> function7 = o00oOoo.f6560OooO00o;
            OooOo.OooO00o(value, function1, o00oooo0OooO0o.OooOOoo(new o0O000O(true)), false, false, new oo0o0Oo(u.OooO0O0(composer).OooO0o(), o00Oo0.OooO00o(14, composer), null, null, null, 0L, null, null, 0L, 262140), null, null, false, 0, null, null, null, null, o00O0000.OooO00o(composer, 251633123, new OooO0O0(textValue, str)), composer, 0, 24576, 16344);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(textValue.getValue().length());
            sb2.append('/');
            sb2.append(i6);
            o000O0O0.OooO0OO(sb2.toString(), SizeKt.OooO0o(oooO00o), o0000O0.f41782o0000oOO, o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, new o0000O0.OooO0o(6), 0L, 0, false, 0, null, null, composer, 3504, 0, 65008);
            o0O0OO0.OooO00o(composer);
        } else {
            if (i7 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i8 != 0) {
                i6 = ShopVehicleListModel.VehicleTagType_Vip300;
            } else {
                i6 = i5;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function8 = oo0o0O0.f29705OooO00o;
            oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            float f5 = 12;
            o00OOOO0 o00oooo0OooO00o3 = Oooo000.OooO00o(SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o).OooOOoo(o00oooo3), 150), o00O0O.OooO0OO(f5));
            o0000O0 o0000o3 = o0000O0.f41691OooO00o;
            float f6 = 16;
            o00OOOO0 o00oooo0OooO0oo3 = PaddingKt.OooO0oo(BackgroundKt.OooO0O0(o00oooo0OooO00o3, o0000O0.f41781o0000oO0, o000O0Oo.f32099OooO00o), f6, f6, f6, f5);
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o003 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
            composer.OooO0o0(-1323940314);
            oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
            layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oo3);
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
            value = textValue.getValue();
            Integer numValueOf3 = Integer.valueOf(i6);
            composer.OooO0o0(511388516);
            zOooo0oo = composer.Oooo0oo(numValueOf3) | composer.Oooo0oo(textValue);
            objOooO0o = composer.OooO0o();
            if (zOooo0oo) {
                objOooO0o = new OooO00o(textValue, i6);
                composer.Oooo00o(objOooO0o);
            } else {
                objOooO0o = new OooO00o(textValue, i6);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            function1 = (Function1) objOooO0o;
            o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
            Intrinsics.checkNotNullParameter(o00oooo0OooO0o, "<this>");
            if (!(((double) 1.0f) > 0.0d)) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            Function1<o00O000o, Unit> function9 = o00oOoo.f6560OooO00o;
            Function1<o00O000o, Unit> function10 = o00oOoo.f6560OooO00o;
            OooOo.OooO00o(value, function1, o00oooo0OooO0o.OooOOoo(new o0O000O(true)), false, false, new oo0o0Oo(u.OooO0O0(composer).OooO0o(), o00Oo0.OooO00o(14, composer), null, null, null, 0L, null, null, 0L, 262140), null, null, false, 0, null, null, null, null, o00O0000.OooO00o(composer, 251633123, new OooO0O0(textValue, str)), composer, 0, 24576, 16344);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(textValue.getValue().length());
            sb3.append('/');
            sb3.append(i6);
            o000O0O0.OooO0OO(sb3.toString(), SizeKt.OooO0o(oooO00o), o0000O0.f41782o0000oOO, o0000O0O.o00Oo0.OooO0OO(12), null, null, null, 0L, null, new o0000O0.OooO0o(6), 0L, 0, false, 0, null, null, composer, 3504, 0, 65008);
            o0O0OO0.OooO00o(composer);
        }
        oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(o00oooo3, textValue, str, i6, i2, i3));
    }
}
