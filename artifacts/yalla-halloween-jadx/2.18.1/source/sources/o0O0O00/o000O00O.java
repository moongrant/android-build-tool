package o0O0O00;

import androidx.compose.ui.node.LayoutNode;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O extends LayoutNode.OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o000O00O f35271OooO0O0 = new o000O00O();

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f35272Oooo0o = new OooO00o();

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

    public static final class OooO0O0 extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O000 f35273Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000O000 o000o001) {
            super(1);
            this.f35273Oooo0o = o000o001;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o000O000.OooO00o.OooO0oo(layout, this.f35273Oooo0o, 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 12, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ List<o000O000> f35274Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(List<? extends o000O000> list) {
            super(1);
            this.f35274Oooo0o = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<o000O000> list = this.f35274Oooo0o;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                o000O000.OooO00o.OooO0oo(layout, list.get(i), 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 12, null);
            }
            return Unit.INSTANCE;
        }
    }

    public o000O00O() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // o0O0O00.o000000
    @NotNull
    public final o000000O OooO00o(@NotNull o00000O0 measure, @NotNull List<? extends o0O0O00> measurables, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (measurables.isEmpty()) {
            return measure.OooOooo(o0000O0O.OooO0O0.OooOO0(j), o0000O0O.OooO0O0.OooO(j), MapsKt.emptyMap(), OooO00o.f35272Oooo0o);
        }
        if (measurables.size() == 1) {
            o000O000 o000o000Oooo000 = measurables.get(0).Oooo000(j);
            return measure.OooOooo(o0000O0O.OooO0OO.OooO0o(j, o000o000Oooo000.f35265Oooo0o), o0000O0O.OooO0OO.OooO0o0(j, o000o000Oooo000.f35266Oooo0oO), MapsKt.emptyMap(), new OooO0O0(o000o000Oooo000));
        }
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(measurables.get(i).Oooo000(j));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            o000O000 o000o001 = (o000O000) arrayList.get(i2);
            iMax = Math.max(o000o001.f35265Oooo0o, iMax);
            iMax2 = Math.max(o000o001.f35266Oooo0oO, iMax2);
        }
        return measure.OooOooo(o0000O0O.OooO0OO.OooO0o(j, iMax), o0000O0O.OooO0OO.OooO0o0(j, iMax2), MapsKt.emptyMap(), new OooO0OO(arrayList));
    }
}
