package o0000OO0;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0O0O00.o000000;
import o0O0O00.o000000O;
import o0O0O00.o00000O0;
import o0O0O00.o000O000;
import o0O0O00.o000OOo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0 f27440OooO00o = new OooOO0();

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ List<o000O000> f27441Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(List<? extends o000O000> list) {
            super(1);
            this.f27441Oooo0o = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<o000O000> list = this.f27441Oooo0o;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                o000O000.OooO00o.OooO0oO(layout, list.get(i), 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o0O0O00.o000000
    @NotNull
    public final o000000O OooO00o(@NotNull o00000O0 Layout, @NotNull List<? extends o0O0O00.o0O0O00> measurables, long j) {
        Object obj;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(measurables.get(i).Oooo000(j));
        }
        Object obj2 = null;
        int i2 = 1;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int i3 = ((o000O000) obj).f35265Oooo0o;
            int lastIndex = CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i4 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i4);
                    int i5 = ((o000O000) obj3).f35265Oooo0o;
                    if (i3 < i5) {
                        obj = obj3;
                        i3 = i5;
                    }
                    if (i4 == lastIndex) {
                        break;
                    }
                    i4++;
                }
            }
        } else {
            obj = null;
        }
        o000O000 o000o001 = (o000O000) obj;
        int iOooOO0 = o000o001 != null ? o000o001.f35265Oooo0o : o0000O0O.OooO0O0.OooOO0(j);
        if (!arrayList.isEmpty()) {
            Object obj4 = arrayList.get(0);
            int i6 = ((o000O000) obj4).f35266Oooo0oO;
            int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex2) {
                while (true) {
                    Object obj5 = arrayList.get(i2);
                    int i7 = ((o000O000) obj5).f35266Oooo0oO;
                    if (i6 < i7) {
                        obj4 = obj5;
                        i6 = i7;
                    }
                    if (i2 == lastIndex2) {
                        break;
                    }
                    i2++;
                }
            }
            obj2 = obj4;
        }
        o000O000 o000o002 = (o000O000) obj2;
        return Layout.OooOooo(iOooOO0, o000o002 != null ? o000o002.f35266Oooo0oO : o0000O0O.OooO0O0.OooO(j), MapsKt.emptyMap(), new OooO00o(arrayList));
    }

    @Override // o0O0O00.o000000
    public final /* synthetic */ int OooO0O0(o0O0O00.OooOo00 oooOo00, List list, int i) {
        return o000OOo.OooO0Oo(this, oooOo00, list, i);
    }

    @Override // o0O0O00.o000000
    public final /* synthetic */ int OooO0OO(o0O0O00.OooOo00 oooOo00, List list, int i) {
        return o000OOo.OooO0O0(this, oooOo00, list, i);
    }

    @Override // o0O0O00.o000000
    public final /* synthetic */ int OooO0Oo(o0O0O00.OooOo00 oooOo00, List list, int i) {
        return o000OOo.OooO00o(this, oooOo00, list, i);
    }

    @Override // o0O0O00.o000000
    public final /* synthetic */ int OooO0o0(o0O0O00.OooOo00 oooOo00, List list, int i) {
        return o000OOo.OooO0OO(this, oooOo00, list, i);
    }
}
