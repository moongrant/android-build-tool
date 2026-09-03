package p632o0ooO00O;

import Oooo000.OooO0o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Iterator;
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
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo00OO0 {

    public static final class OooO00o implements o000000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f48786OooO00o = new OooO00o();

        /* JADX INFO: renamed from: o0ooO00O.oOo00OO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0423OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ List<o000O000> f48787Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0423OooO00o(List<o000O000> list) {
                super(1);
                this.f48787Oooo0o = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o000O000.OooO00o oooO00o) {
                o000O000.OooO00o layout = oooO00o;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                int i = 0;
                for (o000O000 o000o001 : this.f48787Oooo0o) {
                    o000O000.OooO00o.OooO0oO(layout, o000o001, 0, i, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
                    i += o000o001.f35266Oooo0oO;
                }
                return Unit.INSTANCE;
            }
        }

        @Override // o0O0O00.o000000
        @NotNull
        public final o000000O OooO00o(@NotNull o00000O0 Layout, @NotNull List<? extends o0O0O00> measurableList, long j) {
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurableList, "measurableList");
            ArrayList arrayList = new ArrayList();
            Iterator<? extends o0O0O00> it = measurableList.iterator();
            int iMax = 0;
            int iOoooOOO = 0;
            while (it.hasNext()) {
                o000O000 o000o000Oooo000 = it.next().Oooo000(j);
                iMax = Math.max(iMax, o000o000Oooo000.f35265Oooo0o);
                iOoooOOO += o000o000Oooo000.OoooOOO() + iOoooOOO;
                arrayList.add(o000o000Oooo000);
            }
            return Layout.OooOooo(iMax, iOoooOOO, MapsKt.emptyMap(), new C0423OooO00o(arrayList));
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
        public final /* synthetic */ int f48788Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f48789Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f48790Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f48791Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(o00OOOO0 o00oooo1, Function2<? super oOO00O, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f48789Oooo0o = o00oooo1;
            this.f48790Oooo0oO = function2;
            this.f48791Oooo0oo = i;
            this.f48788Oooo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oOo00OO0.OooO00o(this.f48789Oooo0o, this.f48790Oooo0oO, ooo00o, this.f48791Oooo0oo | 1, this.f48788Oooo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(@Nullable o00OOOO0 o00oooo1, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O composer = ooo00o.OooOOo(249078733);
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
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            OooO00o oooO00o = OooO00o.f48786OooO00o;
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
