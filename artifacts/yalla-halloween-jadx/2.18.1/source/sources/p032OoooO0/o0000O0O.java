package p032OoooO0;

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
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O.Oooo000;
import o00000O.oo0o0Oo;
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
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Pair<List<o00000O.OooO00o.OooO0O0<Oooo000>>, List<o00000O.OooO00o.OooO0O0<Function3<String, oOO00O, Integer, Unit>>>> f3023OooO00o = new Pair<>(CollectionsKt.emptyList(), CollectionsKt.emptyList());

    public static final class OooO00o implements o000000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f3024OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OoooO0.o0000O0O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0022OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ List<o000O000> f3025Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0022OooO00o(List<? extends o000O000> list) {
                super(1);
                this.f3025Oooo0o = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o000O000.OooO00o oooO00o) {
                o000O000.OooO00o layout = oooO00o;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                List<o000O000> list = this.f3025Oooo0o;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    o000O000.OooO00o.OooO0oO(layout, list.get(i), 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // o0O0O00.o000000
        @NotNull
        public final o000000O OooO00o(@NotNull o00000O0 Layout, @NotNull List<? extends o0O0O00> children, long j) {
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(children, "children");
            ArrayList arrayList = new ArrayList(children.size());
            int size = children.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(children.get(i).Oooo000(j));
            }
            return Layout.OooOooo(o0000O0O.OooO0O0.OooO0oo(j), o0000O0O.OooO0O0.OooO0oO(j), MapsKt.emptyMap(), new C0022OooO00o(arrayList));
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00000O.OooO00o f3026Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ List<o00000O.OooO00o.OooO0O0<Function3<String, oOO00O, Integer, Unit>>> f3027Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f3028Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00000O.OooO00o oooO00o, List<o00000O.OooO00o.OooO0O0<Function3<String, oOO00O, Integer, Unit>>> list, int i) {
            super(2);
            this.f3026Oooo0o = oooO00o;
            this.f3027Oooo0oO = list;
            this.f3028Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0000O0O.OooO00o(this.f3026Oooo0o, this.f3027Oooo0oO, ooo00o, this.f3028Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(@NotNull o00000O.OooO00o text, @NotNull List<o00000O.OooO00o.OooO0O0<Function3<String, oOO00O, Integer, Unit>>> inlineContents, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(inlineContents, "inlineContents");
        oOO00O composer = ooo00o.OooOOo(-110905764);
        int size = inlineContents.size();
        for (int i2 = 0; i2 < size; i2++) {
            o00000O.OooO00o.OooO0O0<Function3<String, oOO00O, Integer, Unit>> oooO0O0 = inlineContents.get(i2);
            Function3<String, oOO00O, Integer, Unit> function3 = oooO0O0.f26768OooO00o;
            int i3 = oooO0O0.f26769OooO0O0;
            int i4 = oooO0O0.f26770OooO0OO;
            OooO00o oooO00o = OooO00o.f3024OooO00o;
            composer.OooO0o0(-1323940314);
            o00OOOO0.OooO00o oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
            OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(oooO00o2);
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
            ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-72427749);
            function3.invoke(text.subSequence(i3, i4).f26756Oooo0o, composer, 0);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(text, inlineContents, i));
    }

    @NotNull
    public static final oOO00O OooO0O0(@NotNull oOO00O current, @NotNull o00000O.OooO00o text, @NotNull oo0o0Oo style, @NotNull OooO density, @NotNull o00000oO.o000OOo.OooO0O0 fontFamilyResolver, boolean z, int i, int i2, @NotNull List<o00000O.OooO00o.OooO0O0<Oooo000>> placeholders) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        if (Intrinsics.areEqual(current.f3390OooO00o, text) && Intrinsics.areEqual(current.f3391OooO0O0, style)) {
            if (current.f3393OooO0Oo == z) {
                if (current.f3395OooO0o0 == i) {
                    if (current.f3392OooO0OO == i2 && Intrinsics.areEqual(current.f3394OooO0o, density) && Intrinsics.areEqual(current.f3397OooO0oo, placeholders) && current.f3396OooO0oO == fontFamilyResolver) {
                        return current;
                    }
                }
                return new oOO00O(text, style, i2, z, i, density, fontFamilyResolver, placeholders, null);
            }
            return new oOO00O(text, style, i2, z, i, density, fontFamilyResolver, placeholders, null);
        }
        return new oOO00O(text, style, i2, z, i, density, fontFamilyResolver, placeholders, null);
    }
}
