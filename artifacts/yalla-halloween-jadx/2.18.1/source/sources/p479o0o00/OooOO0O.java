package p479o0o00;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o0000O0O.OooO0O0;
import o0O0O00.o000O;
import o0O0O00.o000O000;
import o0O0O00.o0O0O00;
import p043OooooO0.o00O0000;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends Lambda implements Function1<o000O000.OooO00o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function2<oOO00O, Integer, Unit> f40704Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f40705Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ List<o000O000> f40706Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o000O f40707Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f40708OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ int f40709OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ OooO0o f40710OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ long f40711OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f40712OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final /* synthetic */ int f40713OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ Function3<List<OooOo00>, oOO00O, Integer, Unit> f40714o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0O(int i, List<? extends o000O000> list, o000O o000o, Function2<? super oOO00O, ? super Integer, Unit> function2, OooO0o oooO0o, int i2, long j, Ref.IntRef intRef, Ref.IntRef intRef2, Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function3, int i3) {
        super(1);
        this.f40705Oooo0o = i;
        this.f40706Oooo0oO = list;
        this.f40707Oooo0oo = o000o;
        this.f40704Oooo = function2;
        this.f40710OoooO00 = oooO0o;
        this.f40709OoooO0 = i2;
        this.f40711OoooO0O = j;
        this.f40708OoooO = intRef;
        this.f40712OoooOO0 = intRef2;
        this.f40714o000oOoO = function3;
        this.f40713OoooOOO = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000O000.OooO00o oooO00o) {
        o000O000.OooO00o layout = oooO00o;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        ArrayList tabPositions = new ArrayList();
        int i = this.f40705Oooo0o;
        List<o000O000> list = this.f40706Oooo0oO;
        o000O o000o = this.f40707Oooo0oo;
        int size = list.size();
        int i2 = i;
        for (int i3 = 0; i3 < size; i3++) {
            o000O000 o000o001 = list.get(i3);
            o000O000.OooO00o.OooO0oO(layout, o000o001, i2, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            tabPositions.add(new OooOo00(o000o.OooO0o0(i2), o000o.OooO0o0(o000o001.f35265Oooo0o)));
            i2 += o000o001.f35265Oooo0o;
        }
        List<o0O0O00> listOooOo0O = this.f40707Oooo0oo.OooOo0O(Oooo000.Divider, this.f40704Oooo);
        long j = this.f40711OoooO0O;
        Ref.IntRef intRef = this.f40708OoooO;
        Ref.IntRef intRef2 = this.f40712OoooOO0;
        int size2 = listOooOo0O.size();
        int i4 = 0;
        while (i4 < size2) {
            o0O0O00 o0o0o00 = listOooOo0O.get(i4);
            int i5 = intRef.element;
            o000O000 o000o000Oooo000 = o0o0o00.Oooo000(OooO0O0.OooO00o(j, i5, i5, 0, 0, 12));
            o000O000.OooO00o.OooO0oO(layout, o000o000Oooo000, 0, intRef2.element - o000o000Oooo000.f35266Oooo0oO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            i4++;
            intRef = intRef;
            size2 = size2;
            intRef2 = intRef2;
            j = j;
        }
        List<o0O0O00> listOooOo0O2 = this.f40707Oooo0oo.OooOo0O(Oooo000.Indicator, o00O0000.OooO0O0(-322332654, true, new OooOO0(this.f40714o000oOoO, tabPositions, this.f40713OoooOOO)));
        Ref.IntRef intRef3 = this.f40708OoooO;
        Ref.IntRef intRef4 = this.f40712OoooOO0;
        int size3 = listOooOo0O2.size();
        for (int i6 = 0; i6 < size3; i6++) {
            o000O000.OooO00o.OooO0oO(layout, listOooOo0O2.get(i6).Oooo000(OooO0O0.f27298OooO0O0.OooO0OO(intRef3.element, intRef4.element)), 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
        }
        OooO0o oooO0o = this.f40710OoooO00;
        o000O density = this.f40707Oooo0oo;
        int i7 = this.f40705Oooo0o;
        int i8 = this.f40709OoooO0;
        Objects.requireNonNull(oooO0o);
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        Integer num = oooO0o.f40700OooO0OO;
        if (num == null || num.intValue() != i8) {
            oooO0o.f40700OooO0OO = Integer.valueOf(i8);
            OooOo00 oooOo00 = (OooOo00) CollectionsKt.getOrNull(tabPositions, i8);
            if (oooOo00 != null) {
                OooOo00 oooOo01 = (OooOo00) CollectionsKt.last((List) tabPositions);
                int iOoooooO = density.OoooooO(oooOo01.f40746OooO00o + oooOo01.f40747OooO0O0) + i7;
                int iOooO0Oo = iOoooooO - oooO0o.f40698OooO00o.OooO0Oo();
                BuildersKt__Builders_commonKt.launch$default(oooO0o.f40699OooO0O0, null, null, new OooO0OO(oooO0o, RangesKt.coerceIn(density.OoooooO(oooOo00.f40746OooO00o) - ((iOooO0Oo / 2) - (density.OoooooO(oooOo00.f40747OooO0O0) / 2)), 0, RangesKt.coerceAtLeast(iOoooooO - iOooO0Oo, 0)), null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }
}
