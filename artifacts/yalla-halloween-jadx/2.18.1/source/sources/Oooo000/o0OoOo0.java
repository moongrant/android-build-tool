package Oooo000;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 implements o0O0O00.o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oo000o f990OooO00o;

    public static final class OooO extends Lambda implements Function1<o0O0O00.OooOOOO, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f991Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(1);
            this.f991Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(o0O0O00.OooOOOO oooOOOO) {
            o0O0O00.OooOOOO it = oooOOOO;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.OooOoo(this.f991Oooo0o));
        }
    }

    public static final class OooO00o extends Lambda implements Function1<o0O0O00.OooOOOO, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f992Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(1);
            this.f992Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(o0O0O00.OooOOOO oooOOOO) {
            o0O0O00.OooOOOO it = oooOOOO;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.OooOOO(this.f992Oooo0o));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0O0O00.OooOOOO, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f993Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(1);
            this.f993Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(o0O0O00.OooOOOO oooOOOO) {
            o0O0O00.OooOOOO it = oooOOOO;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.OooOooO(this.f993Oooo0o));
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<o0O0O00.o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ List<o0O0O00.o000O000> f994Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(List<? extends o0O0O00.o000O000> list) {
            super(1);
            this.f994Oooo0o = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0O0O00.o000O000.OooO00o oooO00o) {
            o0O0O00.o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<o0O0O00.o000O000> list = this.f994Oooo0o;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                layout.OooO0OO(list.get(i), 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<o0O0O00.OooOOOO, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f995Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(1);
            this.f995Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(o0O0O00.OooOOOO oooOOOO) {
            o0O0O00.OooOOOO it = oooOOOO;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.OoooO(this.f995Oooo0o));
        }
    }

    public o0OoOo0(@NotNull oo000o scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f990OooO00o = scope;
    }

    @Override // o0O0O00.o000000
    @NotNull
    public final o0O0O00.o000000O OooO00o(@NotNull o0O0O00.o00000O0 measure, @NotNull List<? extends o0O0O00.o0O0O00> measurables, long j) {
        Object obj;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(measurables, 10));
        Iterator<T> it = measurables.iterator();
        while (it.hasNext()) {
            arrayList.add(((o0O0O00.o0O0O00) it.next()).Oooo000(j));
        }
        Object obj2 = null;
        int i = 1;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int i2 = ((o0O0O00.o000O000) obj).f35265Oooo0o;
            int lastIndex = CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i3 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i3);
                    int i4 = ((o0O0O00.o000O000) obj3).f35265Oooo0o;
                    if (i2 < i4) {
                        obj = obj3;
                        i2 = i4;
                    }
                    if (i3 == lastIndex) {
                        break;
                    }
                    i3++;
                }
            }
        } else {
            obj = null;
        }
        o0O0O00.o000O000 o000o001 = (o0O0O00.o000O000) obj;
        int i5 = o000o001 != null ? o000o001.f35265Oooo0o : 0;
        if (!arrayList.isEmpty()) {
            Object obj4 = arrayList.get(0);
            int i6 = ((o0O0O00.o000O000) obj4).f35266Oooo0oO;
            int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex2) {
                while (true) {
                    Object obj5 = arrayList.get(i);
                    int i7 = ((o0O0O00.o000O000) obj5).f35266Oooo0oO;
                    if (i6 < i7) {
                        obj4 = obj5;
                        i6 = i7;
                    }
                    if (i == lastIndex2) {
                        break;
                    }
                    i++;
                }
            }
            obj2 = obj4;
        }
        o0O0O00.o000O000 o000o002 = (o0O0O00.o000O000) obj2;
        int i8 = o000o002 != null ? o000o002.f35266Oooo0oO : 0;
        this.f990OooO00o.f999OooO00o.setValue(new o0000O0O.o000oOoO(o0000O0O.o0OoOo0.OooO00o(i5, i8)));
        return measure.OooOooo(i5, i8, MapsKt.emptyMap(), new OooO0OO(arrayList));
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
