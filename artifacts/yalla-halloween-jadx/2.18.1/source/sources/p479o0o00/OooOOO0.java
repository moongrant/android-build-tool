package p479o0o00;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o0000O0O.OooO0O0;
import o0O0O00.o000000O;
import o0O0O00.o000O;
import o0O0O00.o000O000;
import o0O0O00.o0O0O00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends Lambda implements Function2<o000O, OooO0O0, o000000O> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooO0o f40717Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ float f40718Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<oOO00O, Integer, Unit> f40719Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function2<oOO00O, Integer, Unit> f40720Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Function3<List<OooOo00>, oOO00O, Integer, Unit> f40721OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ int f40722OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ int f40723OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOOO0(float f, Function2<? super oOO00O, ? super Integer, Unit> function2, Function2<? super oOO00O, ? super Integer, Unit> function3, OooO0o oooO0o, int i, Function3<? super List<OooOo00>, ? super oOO00O, ? super Integer, Unit> function4, int i2) {
        super(2);
        this.f40718Oooo0o = f;
        this.f40719Oooo0oO = function2;
        this.f40720Oooo0oo = function3;
        this.f40717Oooo = oooO0o;
        this.f40722OoooO00 = i;
        this.f40721OoooO0 = function4;
        this.f40723OoooO0O = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final o000000O invoke(o000O o000o, OooO0O0 oooO0O0) {
        o000O SubcomposeLayout = o000o;
        long j = oooO0O0.f27302OooO00o;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int iOoooooO = SubcomposeLayout.OoooooO(0);
        int iOoooooO2 = SubcomposeLayout.OoooooO(this.f40718Oooo0o);
        long jOooO00o = OooO0O0.OooO00o(j, iOoooooO, 0, 0, 0, 14);
        List<o0O0O00> listOooOo0O = SubcomposeLayout.OooOo0O(Oooo000.Tabs, this.f40719Oooo0oO);
        ArrayList arrayList = new ArrayList(listOooOo0O.size());
        int size = listOooOo0O.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(listOooOo0O.get(i).Oooo000(jOooO00o));
        }
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = iOoooooO2 * 2;
        Ref.IntRef intRef2 = new Ref.IntRef();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            o000O000 o000o001 = (o000O000) arrayList.get(i2);
            intRef.element += o000o001.f35265Oooo0o;
            intRef2.element = Math.max(intRef2.element, o000o001.f35266Oooo0oO);
        }
        return SubcomposeLayout.OooOooo(intRef.element, intRef2.element, MapsKt.emptyMap(), new OooOO0O(iOoooooO2, arrayList, SubcomposeLayout, this.f40720Oooo0oo, this.f40717Oooo, this.f40722OoooO00, j, intRef, intRef2, this.f40721OoooO0, this.f40723OoooO0O));
    }
}
