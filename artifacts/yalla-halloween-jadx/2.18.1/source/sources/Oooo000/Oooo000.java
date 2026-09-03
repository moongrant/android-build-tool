package Oooo000;

import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 implements o0O0O00.o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000oOoO<?> f817OooO00o;

    public static final class OooO extends Lambda implements Function1<o0O0O00.OooOOOO, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f818Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(1);
            this.f818Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(o0O0O00.OooOOOO oooOOOO) {
            o0O0O00.OooOOOO it = oooOOOO;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.OooOoo(this.f818Oooo0o));
        }
    }

    public static final class OooO00o extends Lambda implements Function1<o0O0O00.OooOOOO, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f819Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(1);
            this.f819Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(o0O0O00.OooOOOO oooOOOO) {
            o0O0O00.OooOOOO it = oooOOOO;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.OooOOO(this.f819Oooo0o));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0O0O00.OooOOOO, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f820Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(1);
            this.f820Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(o0O0O00.OooOOOO oooOOOO) {
            o0O0O00.OooOOOO it = oooOOOO;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.OooOooO(this.f820Oooo0o));
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<o0O0O00.o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f821Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O0O00.o000O000[] f822Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f823Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f824Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0O0O00.o000O000[] o000o000Arr, Oooo000 oooo000, int i, int i2) {
            super(1);
            this.f822Oooo0o = o000o000Arr;
            this.f823Oooo0oO = oooo000;
            this.f824Oooo0oo = i;
            this.f821Oooo = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0O0O00.o000O000.OooO00o oooO00o) {
            o0O0O00.o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o0O0O00.o000O000[] o000o000Arr = this.f822Oooo0o;
            Oooo000 oooo000 = this.f823Oooo0oO;
            int i = this.f824Oooo0oo;
            int i2 = this.f821Oooo;
            for (o0O0O00.o000O000 o000o001 : o000o000Arr) {
                if (o000o001 != null) {
                    long jOooO00o = oooo000.f817OooO00o.f910OooO0O0.OooO00o(o0000O0O.o0OoOo0.OooO00o(o000o001.f35265Oooo0o, o000o001.f35266Oooo0oO), o0000O0O.o0OoOo0.OooO00o(i, i2), LayoutDirection.Ltr);
                    o0000O0O.OooOo.OooO00o oooO00o2 = o0000O0O.OooOo.f27310OooO0O0;
                    layout.OooO0OO(o000o001, (int) (jOooO00o >> 32), o0000O0O.OooOo.OooO0OO(jOooO00o), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<o0O0O00.OooOOOO, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f825Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(1);
            this.f825Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(o0O0O00.OooOOOO oooOOOO) {
            o0O0O00.OooOOOO it = oooOOOO;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.OoooO(this.f825Oooo0o));
        }
    }

    public Oooo000(@NotNull o000oOoO<?> rootScope) {
        Intrinsics.checkNotNullParameter(rootScope, "rootScope");
        this.f817OooO00o = rootScope;
    }

    @Override // o0O0O00.o000000
    @NotNull
    public final o0O0O00.o000000O OooO00o(@NotNull o0O0O00.o00000O0 measure, @NotNull List<? extends o0O0O00.o0O0O00> measurables, long j) {
        o0O0O00.o000O000 o000o001;
        int i;
        o0O0O00.o000O000 o000o002;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size();
        o0O0O00.o000O000[] o000o000Arr = new o0O0O00.o000O000[size];
        int size2 = measurables.size();
        int i2 = 0;
        while (true) {
            o000o001 = null;
            i = 1;
            if (i2 >= size2) {
                break;
            }
            o0O0O00.o0O0O00 o0o0o00 = measurables.get(i2);
            Object objOooo0o = o0o0o00.Oooo0o();
            o000oOoO.OooO00o oooO00o = objOooo0o instanceof o000oOoO.OooO00o ? (o000oOoO.OooO00o) objOooo0o : null;
            if (((oooO00o == null || !oooO00o.f914Oooo0o) ? 0 : 1) != 0) {
                o000o000Arr[i2] = o0o0o00.Oooo000(j);
            }
            i2++;
        }
        int size3 = measurables.size();
        for (int i3 = 0; i3 < size3; i3++) {
            o0O0O00.o0O0O00 o0o0o01 = measurables.get(i3);
            if (o000o000Arr[i3] == null) {
                o000o000Arr[i3] = o0o0o01.Oooo000(j);
            }
        }
        if (!(size == 0)) {
            o000o002 = o000o000Arr[0];
            int lastIndex = ArraysKt.getLastIndex(o000o000Arr);
            if (lastIndex != 0) {
                int i4 = o000o002 != null ? o000o002.f35265Oooo0o : 0;
                if (1 <= lastIndex) {
                    int i5 = 1;
                    while (true) {
                        o0O0O00.o000O000 o000o003 = o000o000Arr[i5];
                        int i6 = o000o003 != null ? o000o003.f35265Oooo0o : 0;
                        if (i4 < i6) {
                            o000o002 = o000o003;
                            i4 = i6;
                        }
                        if (i5 == lastIndex) {
                            break;
                        }
                        i5++;
                    }
                }
            }
        } else {
            o000o002 = null;
        }
        int i7 = o000o002 != null ? o000o002.f35265Oooo0o : 0;
        if (!(size == 0)) {
            o000o001 = o000o000Arr[0];
            int lastIndex2 = ArraysKt.getLastIndex(o000o000Arr);
            if (lastIndex2 != 0) {
                int i8 = o000o001 != null ? o000o001.f35266Oooo0oO : 0;
                if (1 <= lastIndex2) {
                    while (true) {
                        o0O0O00.o000O000 o000o004 = o000o000Arr[i];
                        int i9 = o000o004 != null ? o000o004.f35266Oooo0oO : 0;
                        if (i8 < i9) {
                            o000o001 = o000o004;
                            i8 = i9;
                        }
                        if (i == lastIndex2) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        int i10 = o000o001 != null ? o000o001.f35266Oooo0oO : 0;
        this.f817OooO00o.f911OooO0OO.setValue(new o0000O0O.o000oOoO(o0000O0O.o0OoOo0.OooO00o(i7, i10)));
        return measure.OooOooo(i7, i10, MapsKt.emptyMap(), new OooO0OO(o000o000Arr, this, i7, i10));
    }

    @Override // o0O0O00.o000000
    public final int OooO0O0(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull List<? extends o0O0O00.OooOOOO> measurables, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt.maxOrNull(SequencesKt.map(CollectionsKt.asSequence(measurables), new OooO(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // o0O0O00.o000000
    public final int OooO0OO(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull List<? extends o0O0O00.OooOOOO> measurables, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt.maxOrNull(SequencesKt.map(CollectionsKt.asSequence(measurables), new OooO0O0(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // o0O0O00.o000000
    public final int OooO0Oo(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull List<? extends o0O0O00.OooOOOO> measurables, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt.maxOrNull(SequencesKt.map(CollectionsKt.asSequence(measurables), new OooO00o(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // o0O0O00.o000000
    public final int OooO0o0(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull List<? extends o0O0O00.OooOOOO> measurables, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) SequencesKt.maxOrNull(SequencesKt.map(CollectionsKt.asSequence(measurables), new OooO0o(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
