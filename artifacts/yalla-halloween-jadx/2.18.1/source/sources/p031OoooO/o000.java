package p031OoooO;

import androidx.compose.material.SwipeableState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class o000 implements FlowCollector<Map<Float, Object>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SwipeableState<Object> f2609Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ float f2610Oooo0oO;

    public o000(SwipeableState<Object> swipeableState, float f) {
        this.f2609Oooo0o = swipeableState;
        this.f2610Oooo0oO = f;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00da  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0138  */
    /* JADX WARN: Code duplicated, block: B:62:0x017c  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Map<Float, Object> map, Continuation continuation) {
        int i;
        int i2;
        List listListOf;
        List listListOf2;
        int size;
        float fFloatValue;
        Object obj;
        Object objOooO0O0;
        float fFloatValue2;
        Map<Float, Object> map2 = map;
        Float fOooO00o = o0000O.OooO00o(map2, this.f2609Oooo0o.OooO0o0());
        Intrinsics.checkNotNull(fOooO00o);
        float fFloatValue3 = fOooO00o.floatValue();
        float fFloatValue4 = this.f2609Oooo0o.f5914OooO0o0.getValue().floatValue();
        Set<Float> setKeySet = map2.keySet();
        Function2 function2 = (Function2) this.f2609Oooo0o.f5921OooOOO0.getValue();
        float f = this.f2610Oooo0oO;
        float fFloatValue5 = ((Number) this.f2609Oooo0o.f5920OooOOO.getValue()).floatValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setKeySet) {
            Map<Float, Object> map3 = map2;
            if (((double) ((Number) obj2).floatValue()) <= ((double) fFloatValue4) + 0.001d) {
                arrayList.add(obj2);
            }
            map2 = map3;
        }
        Map<Float, Object> map4 = map2;
        Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : setKeySet) {
            if (((double) ((Number) obj3).floatValue()) >= ((double) fFloatValue4) - 0.001d) {
                arrayList2.add(obj3);
            }
        }
        Float fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) arrayList2);
        if (fMaxOrNull != null) {
            if (fMinOrNull == null || Intrinsics.areEqual(fMaxOrNull, fMinOrNull)) {
                listListOf2 = CollectionsKt.listOf(fMaxOrNull);
            } else {
                i = 0;
                i2 = 1;
                listListOf = CollectionsKt.listOf((Object[]) new Float[]{fMaxOrNull, fMinOrNull});
            }
            size = listListOf.size();
            if (size != 0) {
                if (size != i2) {
                    fFloatValue = ((Number) listListOf.get(i)).floatValue();
                    fFloatValue2 = ((Number) listListOf.get(i2)).floatValue();
                    if (fFloatValue3 <= fFloatValue4 ? f > (-fFloatValue5) && fFloatValue4 > ((Number) function2.invoke(Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue))).floatValue() : f >= fFloatValue5 || fFloatValue4 >= ((Number) function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue()) {
                    }
                } else {
                    fFloatValue2 = ((Number) listListOf.get(0)).floatValue();
                }
                fFloatValue = fFloatValue2;
            } else {
                fFloatValue = fFloatValue3;
            }
            obj = map4.get(Boxing.boxFloat(fFloatValue));
            if (obj == null && this.f2609Oooo0o.f5910OooO0O0.invoke(obj).booleanValue()) {
                Object objOooO0OO = SwipeableState.OooO0OO(this.f2609Oooo0o, obj, null, continuation, 2, null);
                return objOooO0OO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0OO : Unit.INSTANCE;
            }
            SwipeableState<Object> swipeableState = this.f2609Oooo0o;
            objOooO0O0 = swipeableState.OooO0O0(fFloatValue3, swipeableState.f5909OooO00o, continuation);
            if (objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objOooO0O0;
            }
            return Unit.INSTANCE;
        }
        listListOf2 = CollectionsKt.listOfNotNull(fMinOrNull);
        listListOf = listListOf2;
        i2 = 1;
        i = 0;
        size = listListOf.size();
        if (size != 0) {
            if (size != i2) {
                fFloatValue = ((Number) listListOf.get(i)).floatValue();
                fFloatValue2 = ((Number) listListOf.get(i2)).floatValue();
                if (fFloatValue3 <= fFloatValue4) {
                }
            } else {
                fFloatValue2 = ((Number) listListOf.get(0)).floatValue();
            }
            fFloatValue = fFloatValue2;
        } else {
            fFloatValue = fFloatValue3;
        }
        obj = map4.get(Boxing.boxFloat(fFloatValue));
        if (obj == null) {
        }
        SwipeableState<Object> swipeableState2 = this.f2609Oooo0o;
        objOooO0O0 = swipeableState2.OooO0O0(fFloatValue3, swipeableState2.f5909OooO00o, continuation);
        if (objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objOooO0O0;
        }
        return Unit.INSTANCE;
    }
}
