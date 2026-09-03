package p034OoooO0O;

import Oooo000.OooO0o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
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
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO {

    public static final class OooO00o implements o000000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f3482OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OoooO0O.o00000OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0025OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ List<o000O000> f3483Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0025OooO00o(List<? extends o000O000> list) {
                super(1);
                this.f3483Oooo0o = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o000O000.OooO00o oooO00o) {
                o000O000.OooO00o layout = oooO00o;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                List<o000O000> list = this.f3483Oooo0o;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    layout.OooO0OO(list.get(i), 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // o0O0O00.o000000
        @NotNull
        public final o000000O OooO00o(@NotNull o00000O0 Layout, @NotNull List<? extends o0O0O00> measurables, long j) {
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            ArrayList arrayList = new ArrayList(measurables.size());
            int size = measurables.size();
            Integer numValueOf = 0;
            for (int i = 0; i < size; i++) {
                arrayList.add(measurables.get(i).Oooo000(j));
            }
            int size2 = arrayList.size();
            Integer numValueOf2 = numValueOf;
            for (int i2 = 0; i2 < size2; i2++) {
                numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((o000O000) arrayList.get(i2)).f35265Oooo0o));
            }
            int iIntValue = numValueOf2.intValue();
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((o000O000) arrayList.get(i3)).f35266Oooo0oO));
            }
            return Layout.OooOooo(iIntValue, numValueOf.intValue(), MapsKt.emptyMap(), new C0025OooO00o(arrayList));
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

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f3484Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f3485Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f3486Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f3487Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(o00OOOO0 o00oooo1, Function2<? super oOO00O, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f3485Oooo0o = o00oooo1;
            this.f3486Oooo0oO = function2;
            this.f3487Oooo0oo = i;
            this.f3484Oooo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00000OO.OooO00o(this.f3485Oooo0o, this.f3486Oooo0oO, ooo00o, this.f3487Oooo0oo | 1, this.f3484Oooo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(@Nullable o00OOOO0 o00oooo1, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O composer = ooo00o.OooOOo(-2105228848);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composer.Oooo0oo(o00oooo1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composer.Oooo0oo(content) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            if (i4 != 0) {
                o00oooo1 = o00OOOO0.OooO00o.f4198Oooo0o;
            }
            OooO00o oooO00o = OooO00o.f3482OooO00o;
            composer.OooO0o0(-1323940314);
            OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo1);
            int i5 = (((((i3 << 3) & 112) | ((i3 >> 3) & 14)) << 9) & 7168) | 6;
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
            oO00000o.OooO0O0(composer, oooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, Integer.valueOf((i5 >> 3) & 112));
            composer.OooO0o0(2058660585);
            content.invoke(composer, Integer.valueOf((i5 >> 9) & 14));
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(o00oooo1, content, i, i2));
    }
}
