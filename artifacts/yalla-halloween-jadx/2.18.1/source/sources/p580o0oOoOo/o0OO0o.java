package p580o0oOoOo;

import Oooo000.OooO0o;
import Oooo000.o0000OO0;
import Oooo000.o000O000;
import Oooo000.o00oO0o;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o000000.OooO00o;
import o0000O0O.OooO;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import p023Oooo00O.o000O00;
import p027Oooo0o.Oooo000;
import p027Oooo0o.o0000Ooo;
import p027Oooo0o.o000O00O;
import p027Oooo0o.o000OO0O;
import p027Oooo0o.oo000o;
import p028Oooo0o0.o00O00o0;
import p028Oooo0o0.o0O0OO0;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00OO0OO;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p522o0o0O0o.o00O000o;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO0o extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f46407Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o(boolean z) {
        super(3);
        this.f46407Oooo0o = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
        o00O00o0 ContentStatus = o00o00o1;
        oOO00O composer = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
        if ((iIntValue & 81) == 16 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            final o000O00O o000o00oOooO00o = o000OO0O.OooO00o(composer);
            composer.OooO0o0(-492369756);
            Object objOooO0o = composer.OooO0o();
            Object obj = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == obj) {
                objOooO0o = o0OOO00.OooO0Oo(Boolean.FALSE);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            final o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
            Object objOooO0O0 = o000O00.OooO0O0(composer, 773894976, -492369756);
            if (objOooO0O0 == obj) {
                objOooO0O0 = o00oO0o.OooO0OO(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, composer), composer);
            }
            composer.Oooo0o0();
            final CoroutineScope coroutineScope = ((o00OO0OO) objOooO0O0).f29498Oooo0o;
            composer.Oooo0o0();
            final Ref.IntRef intRef = new Ref.IntRef();
            composer.OooO0o0(-492369756);
            Object objOooO0o2 = composer.OooO0o();
            if (objOooO0o2 == obj) {
                objOooO0o2 = 0;
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            intRef.element = ((Number) objOooO0o2).intValue();
            Observable<Object> observable = LiveEventBus.get("HAVE_NEW_APPLY_MIC");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.HAVE_NEW_APPLY_MIC)");
            o00O000o.OooO00o(observable, new Observer() { // from class: o0oOoOo.o0O0o0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj2) {
                    o000O00O state = o000o00oOooO00o;
                    CoroutineScope coroutineScope2 = coroutineScope;
                    Ref.IntRef columnHeight = intRef;
                    o0O00OO haveNewApply$delegate = o0o00oo2;
                    Pair pair = (Pair) obj2;
                    Intrinsics.checkNotNullParameter(state, "$state");
                    Intrinsics.checkNotNullParameter(coroutineScope2, "$coroutineScope");
                    Intrinsics.checkNotNullParameter(columnHeight, "$columnHeight");
                    Intrinsics.checkNotNullParameter(haveNewApply$delegate, "$haveNewApply$delegate");
                    o0000Ooo o0000oooOooO0oO = state.OooO0oO();
                    if (!((Boolean) pair.getSecond()).booleanValue()) {
                        Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) o0000oooOooO0oO.OooO0O0());
                        Intrinsics.checkNotNull(objLastOrNull);
                        if (((oo000o) objLastOrNull).getIndex() == o00O.OooO0o.f43216OooO00o.OooO00o() - 1) {
                            haveNewApply$delegate.setValue(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    if (((Boolean) pair.getFirst()).booleanValue()) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new o0O0oo00(state, null), 3, null);
                    } else {
                        if (o0000oooOooO0oO.OooO0O0().size() <= 1) {
                            return;
                        }
                        int index = (((oo000o) CollectionsKt.last((List) o0000oooOooO0oO.OooO0O0())).OooO00o() != columnHeight.element ? (oo000o) CollectionsKt.last((List) o0000oooOooO0oO.OooO0O0()) : o0000oooOooO0oO.OooO0O0().get(o0000oooOooO0oO.OooO0O0().size() - 2)).getIndex();
                        o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
                        haveNewApply$delegate.setValue(Boolean.valueOf(index < o00O.OooO0o.f43226OooOO0o.size() - 1));
                    }
                }
            }, composer, 72);
            Boolean boolValueOf = Boolean.valueOf(o000o00oOooO00o.OooO00o());
            composer.OooO0o0(511388516);
            boolean zOooo0oo = composer.Oooo0oo(o000o00oOooO00o) | composer.Oooo0oo(o0o00oo2);
            Object objOooO0o3 = composer.OooO0o();
            if (zOooo0oo || objOooO0o3 == obj) {
                objOooO0o3 = new o0O(o000o00oOooO00o, o0o00oo2, null);
                composer.Oooo00o(objOooO0o3);
            }
            composer.Oooo0o0();
            o00Oo00.OooO0o0(boolValueOf, (Function2) objOooO0o3, composer);
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO00o = OnRemeasuredModifierKt.OooO00o(SizeKt.OooO0o0(oooO00o), new o0OO000(intRef));
            boolean z = this.f46407Oooo0o;
            composer.OooO0o0(733328855);
            o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
            composer.OooO0o0(-1323940314);
            OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(OooO00o.f26575OooO0Oo);
            Function0<OooO00o> function0 = OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO00o);
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
            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            Observable<Object> observable2 = LiveEventBus.get("REFRESH_APPLY_MIC_LIST");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.REFRESH_APPLY_MIC_LIST)");
            o00O000o.OooO00o(observable2, new Observer() { // from class: o0oOoOo.o0oOo0O0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj2) {
                    CoroutineScope coroutineScope2 = coroutineScope;
                    o000O00O state = o000o00oOooO00o;
                    Intrinsics.checkNotNullParameter(coroutineScope2, "$coroutineScope");
                    Intrinsics.checkNotNullParameter(state, "$state");
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new o0OO000o(state, null), 3, null);
                }
            }, composer, 72);
            o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            composer.OooO0o0(1157296644);
            boolean zOooo0oo2 = composer.Oooo0oo(boolValueOf2);
            Object objOooO0o4 = composer.OooO0o();
            if (zOooo0oo2 || objOooO0o4 == obj) {
                objOooO0o4 = new o0OO0(z);
                composer.Oooo00o(objOooO0o4);
            }
            composer.Oooo0o0();
            Oooo000.OooO00o(o00oooo0OooO0o0, o000o00oOooO00o, null, false, null, null, null, false, (Function1) objOooO0o4, composer, 6, 252);
            boolean z2 = ((Boolean) o0o00oo2.getValue()).booleanValue() && z;
            o0000OO0 o0000oo0OooO0Oo = Oooo000.o000000.OooO0Oo(null, 3);
            o000O000 o000o000OooO0o0 = Oooo000.o000000.OooO0o0(null, 3);
            p048OoooooO.o00OO0OO alignment = o00OO0O0.OooO00o.f4178OooO0oo;
            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            Function1<androidx.compose.ui.platform.o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
            Function1<androidx.compose.ui.platform.o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
            p028Oooo0o0.o00O00O other = new p028Oooo0o0.o00O00O(alignment, false);
            Intrinsics.checkNotNullParameter(other, "other");
            Oooo000.o00Oo0.OooO0Oo(z2, other, o0000oo0OooO0Oo, o000o000OooO0o0, null, o00O0000.OooO00o(composer, -377824692, new o0OO0o00(coroutineScope, o000o00oOooO00o, o0o00oo2)), composer, 200064, 16);
            o0O0OO0.OooO00o(composer);
        }
        return Unit.INSTANCE;
    }
}
