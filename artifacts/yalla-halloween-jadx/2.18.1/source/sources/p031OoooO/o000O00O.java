package p031OoooO;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO0O0;
import o0O0O00.OooOo00;
import o0O0O00.o000000;
import o0O0O00.o000000O;
import o0O0O00.o00000O0;
import o0O0O00.o000O000;
import o0O0O00.o000OOo;
import o0O0O00.o0O0O00;
import o0O0O00.o0OoOo0;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O implements o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function2<oOO00O, Integer, Unit> f2739OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function2<oOO00O, Integer, Unit> f2740OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f2741Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O000 f2742Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000O000 f2743Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00000O0 f2744Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Integer f2745OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f2746OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ Integer f2747OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O000 o000o001, o000O000 o000o002, o00000O0 o00000o1, int i, int i2, Integer num, Integer num2) {
            super(1);
            this.f2742Oooo0o = o000o001;
            this.f2743Oooo0oO = o000o002;
            this.f2744Oooo0oo = o00000o1;
            this.f2741Oooo = i;
            this.f2746OoooO00 = i2;
            this.f2745OoooO0 = num;
            this.f2747OoooO0O = num2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000 o000o001;
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o000O000 o000o002 = this.f2742Oooo0o;
            if (o000o002 != null && (o000o001 = this.f2743Oooo0oO) != null) {
                o00000O0 o00000o1 = this.f2744Oooo0oo;
                int i = this.f2741Oooo;
                int i2 = this.f2746OoooO00;
                Integer num = this.f2745OoooO0;
                Intrinsics.checkNotNull(num);
                int iIntValue = num.intValue();
                Integer num2 = this.f2747OoooO0O;
                Intrinsics.checkNotNull(num2);
                int iIntValue2 = num2.intValue();
                int iOoooooO = o00000o1.OoooooO(iIntValue == iIntValue2 ? o000O00.f2696OooO0Oo : o000O00.f2698OooO0o0);
                o000OO0O o000oo0o2 = o000OO0O.f2839OooO00o;
                int iOoooooO2 = o00000o1.OoooooO(o000OO0O.f2840OooO0O0) + iOoooooO;
                int iOooooOO = (o00000o1.OooooOO(o000O00.f2697OooO0o) + o000o001.f35266Oooo0oO) - iIntValue;
                int i3 = (i2 - iIntValue2) - iOoooooO2;
                o000O000.OooO00o.OooO0oO(layout, o000o002, (i - o000o002.f35265Oooo0o) / 2, i3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
                o000O000.OooO00o.OooO0oO(layout, o000o001, (i - o000o001.f35265Oooo0o) / 2, i3 - iOooooOO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            } else if (o000o002 != null) {
                int i4 = this.f2746OoooO00;
                float f = o000O00.f2693OooO00o;
                o000O000.OooO00o.OooO0oO(layout, o000o002, 0, (i4 - o000o002.f35266Oooo0oO) / 2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            } else {
                o000O000 o000o003 = this.f2743Oooo0oO;
                if (o000o003 != null) {
                    int i5 = this.f2746OoooO00;
                    float f2 = o000O00.f2693OooO00o;
                    o000O000.OooO00o.OooO0oO(layout, o000o003, 0, (i5 - o000o003.f35266Oooo0oO) / 2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o000O00O(Function2<? super oOO00O, ? super Integer, Unit> function2, Function2<? super oOO00O, ? super Integer, Unit> function3) {
        this.f2739OooO00o = function2;
        this.f2740OooO0O0 = function3;
    }

    @Override // o0O0O00.o000000
    @NotNull
    public final o000000O OooO00o(@NotNull o00000O0 Layout, @NotNull List<? extends o0O0O00> measurables, long j) {
        o000O000 o000o000Oooo000;
        o000O000 o000o000Oooo001;
        float f;
        o0O0O00 o0o0o00;
        o0O0O00 o0o0o01;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (this.f2739OooO00o != null) {
            Iterator<T> it = measurables.iterator();
            do {
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                o0o0o01 = (o0O0O00) it.next();
            } while (!Intrinsics.areEqual(o0OoOo0.OooO00o(o0o0o01), ViewHierarchyConstants.TEXT_KEY));
            o000o000Oooo000 = o0o0o01.Oooo000(OooO0O0.OooO00o(j, 0, 0, 0, 0, 11));
        } else {
            o000o000Oooo000 = null;
        }
        if (this.f2740OooO0O0 != null) {
            Iterator<T> it2 = measurables.iterator();
            do {
                if (!it2.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                o0o0o00 = (o0O0O00) it2.next();
            } while (!Intrinsics.areEqual(o0OoOo0.OooO00o(o0o0o00), "icon"));
            o000o000Oooo001 = o0o0o00.Oooo000(j);
        } else {
            o000o000Oooo001 = null;
        }
        int iMax = Math.max(o000o000Oooo000 != null ? o000o000Oooo000.f35265Oooo0o : 0, o000o000Oooo001 != null ? o000o000Oooo001.f35265Oooo0o : 0);
        if (o000o000Oooo000 == null || o000o000Oooo001 == null) {
            float f2 = o000O00.f2693OooO00o;
            f = o000O00.f2693OooO00o;
        } else {
            float f3 = o000O00.f2693OooO00o;
            f = o000O00.f2694OooO0O0;
        }
        int iOoooooO = Layout.OoooooO(f);
        return Layout.OooOooo(iMax, iOoooooO, MapsKt.emptyMap(), new OooO00o(o000o000Oooo000, o000o000Oooo001, Layout, iMax, iOoooooO, o000o000Oooo000 != null ? Integer.valueOf(o000o000Oooo000.OooOo0o(o0O0O00.OooO0O0.f35231OooO00o)) : null, o000o000Oooo000 != null ? Integer.valueOf(o000o000Oooo000.OooOo0o(o0O0O00.OooO0O0.f35232OooO0O0)) : null));
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
