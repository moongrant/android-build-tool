package p028Oooo0o0;

import Oooo000.OooO0o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Objects;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import o0000O0O.o0OoOo0;
import o0O0O00.OooOo00;
import o0O0O00.o000000;
import o0O0O00.o000000O;
import o0O0O00.o00000O0;
import o0O0O00.o000O000;
import o0O0O00.o000OOo;
import o0O0O00.o00Oo0;
import o0O0O00.o0O0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O00OO f2221OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f2222OooO0O0;

    public static final class OooO00o extends Lambda implements Function2<p100o000oOoO.oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f2223Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f2224Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OOOO0 o00oooo1, int i) {
            super(2);
            this.f2223Oooo0o = o00oooo1;
            this.f2224Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
            num.intValue();
            oOO00O.OooO00o(this.f2223Oooo0o, ooo00o, this.f2224Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements o000000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f2225OooO00o = new OooO0O0();

        public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public static final OooO00o f2226Oooo0o = new OooO00o();

            public OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o000O000.OooO00o oooO00o) {
                o000O000.OooO00o layout = oooO00o;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                return Unit.INSTANCE;
            }
        }

        @Override // o0O0O00.o000000
        @NotNull
        public final o000000O OooO00o(@NotNull o00000O0 MeasurePolicy, @NotNull List<? extends o0O0O00> list, long j) {
            Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
            return MeasurePolicy.OooOooo(o0000O0O.OooO0O0.OooOO0(j), o0000O0O.OooO0O0.OooO(j), MapsKt.emptyMap(), OooO00o.f2226Oooo0o);
        }

        @Override // o0O0O00.o000000
        public final /* synthetic */ int OooO0O0(OooOo00 oooOo00, List list, int i) {
            return o000OOo.OooO0Oo(this, oooOo00, list, i);
        }

        @Override // o0O0O00.o000000
        public final /* synthetic */ int OooO0OO(OooOo00 oooOo00, List list, int i) {
            return o000OOo.OooO0O0(this, oooOo00, list, i);
        }

        @Override // o0O0O00.o000000
        public final /* synthetic */ int OooO0Oo(OooOo00 oooOo00, List list, int i) {
            return o000OOo.OooO00o(this, oooOo00, list, i);
        }

        @Override // o0O0O00.o000000
        public final /* synthetic */ int OooO0o0(OooOo00 oooOo00, List list, int i) {
            return o000OOo.OooO0OO(this, oooOo00, list, i);
        }
    }

    static {
        o00OO0OO alignment = o00OO0O0.OooO00o.f4172OooO0O0;
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        f2221OooO00o = new o00O00OO(false, alignment);
        f2222OooO0O0 = OooO0O0.f2225OooO00o;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull o00OOOO0 modifier, @Nullable p100o000oOoO.oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        p100o000oOoO.oOO00O composer = ooo00o.OooOOo(-211209833);
        if ((i & 14) == 0) {
            i2 = (composer.Oooo0oo(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            OooO0O0 oooO0O0 = f2222OooO0O0;
            composer.OooO0o0(-1323940314);
            OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, p100o000oOoO.oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(modifier);
            int i3 = (((((i2 << 3) & 112) | 384) << 9) & 7168) | 6;
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
            oO00000o.OooO0O0(composer, oooO0O0, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, Integer.valueOf((i3 >> 3) & 112));
            composer.OooO0o0(2058660585);
            composer.OooO0o0(1021196736);
            if (((i3 >> 9) & 14 & 11) == 2 && composer.OooOo0()) {
                composer.OooOoo0();
            }
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(modifier, i));
    }

    public static final boolean OooO0O0(o0O0O00 o0o0o00) {
        Object objOooo0o = o0o0o00.Oooo0o();
        o00O00O o00o00o2 = objOooo0o instanceof o00O00O ? (o00O00O) objOooo0o : null;
        if (o00o00o2 != null) {
            return o00o00o2.f2048Oooo0oo;
        }
        return false;
    }

    public static final void OooO0OO(o000O000.OooO00o oooO00o, o000O000 o000o001, o0O0O00 o0o0o00, LayoutDirection layoutDirection, int i, int i2, o00OO0O0 o00oo0o1) {
        o00OO0O0 o00oo0o2;
        Object objOooo0o = o0o0o00.Oooo0o();
        o00O00O o00o00o2 = objOooo0o instanceof o00O00O ? (o00O00O) objOooo0o : null;
        oooO00o.OooO0o0(o000o001, ((o00o00o2 == null || (o00oo0o2 = o00o00o2.f2047Oooo0oO) == null) ? o00oo0o1 : o00oo0o2).OooO00o(o0OoOo0.OooO00o(o000o001.f35265Oooo0o, o000o001.f35266Oooo0oO), o0OoOo0.OooO00o(i, i2), layoutDirection), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final o000000 OooO0Oo(@NotNull o00OO0O0 alignment, boolean z, @Nullable p100o000oOoO.oOO00O ooo00o) {
        o000000 o000000Var;
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        ooo00o.OooO0o0(56522820);
        if (!Intrinsics.areEqual(alignment, o00OO0O0.OooO00o.f4172OooO0O0) || z) {
            Boolean boolValueOf = Boolean.valueOf(z);
            ooo00o.OooO0o0(511388516);
            boolean zOooo0oo = ooo00o.Oooo0oo(boolValueOf) | ooo00o.Oooo0oo(alignment);
            Object objOooO0o = ooo00o.OooO0o();
            if (zOooo0oo || objOooO0o == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                objOooO0o = new o00O00OO(z, alignment);
                ooo00o.Oooo00o(objOooO0o);
            }
            ooo00o.Oooo0o0();
            o000000Var = (o000000) objOooO0o;
        } else {
            o000000Var = f2221OooO00o;
        }
        ooo00o.Oooo0o0();
        return o000000Var;
    }
}
