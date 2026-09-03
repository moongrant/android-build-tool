package p031OoooO;

import androidx.compose.material.SwipeableState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 implements FlowCollector<Map<Float, Object>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Object f2678Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ SwipeableState<Object> f2679Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oo000o<Float> f2680Oooo0oo;

    @DebugMetadata(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", i = {0, 0}, l = {335}, m = "emit", n = {"this", "anchors"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o0000OO0 f2682Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Map f2683Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f2684Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f2685OoooO00;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f2684Oooo0oo = obj;
            this.f2685OoooO00 |= Integer.MIN_VALUE;
            return o0000OO0.this.emit(null, this);
        }
    }

    public o0000OO0(Object obj, SwipeableState<Object> swipeableState, oo000o<Float> oo000oVar) {
        this.f2678Oooo0o = obj;
        this.f2679Oooo0oO = swipeableState;
        this.f2680Oooo0oo = oo000oVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final Object emit(@NotNull Map<Float, Object> map, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        OooO00o oooO00o;
        o0000OO0 o0000oo1;
        float fFloatValue;
        LinkedHashMap linkedHashMap;
        Object objFirstOrNull;
        boolean z;
        float fFloatValue2;
        LinkedHashMap linkedHashMap2;
        Object objFirstOrNull2;
        boolean z2;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f2685OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f2685OoooO00 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f2684Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f2685OoooO00;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = oooO00o.f2683Oooo0oO;
            o0000oo1 = oooO00o.f2682Oooo0o;
            try {
                ResultKt.throwOnFailure(obj);
                fFloatValue2 = o0000oo1.f2679Oooo0oO.f5915OooO0oO.getValue().floatValue();
                linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<Float, Object> entry : map.entrySet()) {
                    if (Math.abs(entry.getKey().floatValue() - fFloatValue2) < 0.5f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                objFirstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap2.values());
                if (objFirstOrNull2 == null) {
                    objFirstOrNull2 = o0000oo1.f2679Oooo0oO.OooO0o0();
                }
                o0000oo1.f2679Oooo0oO.OooO0oO(objFirstOrNull2);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                fFloatValue = o0000oo1.f2679Oooo0oO.f5915OooO0oO.getValue().floatValue();
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Float, Object> entry2 : map.entrySet()) {
                    if (Math.abs(entry2.getKey().floatValue() - fFloatValue) < 0.5f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                objFirstOrNull = CollectionsKt.firstOrNull(linkedHashMap.values());
                if (objFirstOrNull == null) {
                    objFirstOrNull = o0000oo1.f2679Oooo0oO.OooO0o0();
                }
                o0000oo1.f2679Oooo0oO.OooO0oO(objFirstOrNull);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            Float fOooO00o = o0000O.OooO00o(map, this.f2678Oooo0o);
            if (fOooO00o == null) {
                throw new IllegalArgumentException("The target value must have an associated anchor.".toString());
            }
            SwipeableState<Object> swipeableState = this.f2679Oooo0oO;
            float fFloatValue3 = fOooO00o.floatValue();
            oo000o<Float> oo000oVar = this.f2680Oooo0oo;
            oooO00o.f2682Oooo0o = this;
            oooO00o.f2683Oooo0oO = map;
            oooO00o.f2685OoooO00 = 1;
            if (swipeableState.OooO0O0(fFloatValue3, oo000oVar, oooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
            o0000oo1 = this;
            fFloatValue2 = o0000oo1.f2679Oooo0oO.f5915OooO0oO.getValue().floatValue();
            linkedHashMap2 = new LinkedHashMap();
            while (r9.hasNext()) {
                if (Math.abs(entry.getKey().floatValue() - fFloatValue2) < 0.5f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            objFirstOrNull2 = CollectionsKt.firstOrNull(linkedHashMap2.values());
            if (objFirstOrNull2 == null) {
                objFirstOrNull2 = o0000oo1.f2679Oooo0oO.OooO0o0();
            }
            o0000oo1.f2679Oooo0oO.OooO0oO(objFirstOrNull2);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            o0000oo1 = this;
            fFloatValue = o0000oo1.f2679Oooo0oO.f5915OooO0oO.getValue().floatValue();
            linkedHashMap = new LinkedHashMap();
            while (r9.hasNext()) {
                if (Math.abs(entry2.getKey().floatValue() - fFloatValue) < 0.5f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            objFirstOrNull = CollectionsKt.firstOrNull(linkedHashMap.values());
            if (objFirstOrNull == null) {
                objFirstOrNull = o0000oo1.f2679Oooo0oO.OooO0o0();
            }
            o0000oo1.f2679Oooo0oO.OooO0oO(objFirstOrNull);
            throw th;
        }
    }
}
