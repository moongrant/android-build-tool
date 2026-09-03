package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\fH\u0016R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "nearestRange", "Lkotlin/ranges/IntRange;", "intervalContent", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;)V", "keys", "", "", "[Ljava/lang/Object;", "keysStartIndex", "", "map", "", "getIndex", "key", "getKey", "index", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutKeyIndexMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n26#2:100\n1#3:101\n*S KotlinDebug\n*F\n+ 1 LazyLayoutKeyIndexMap.kt\nandroidx/compose/foundation/lazy/layout/NearestRangeKeyIndexMap\n*L\n70#1:100\n*E\n"})
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {

    @NotNull
    private final Object[] keys;
    private final int keysStartIndex;

    @NotNull
    private final Map<Object, Integer> map;

    public NearestRangeKeyIndexMap(@NotNull IntRange nearestRange, @NotNull LazyLayoutIntervalContent<?> intervalContent) {
        Intrinsics.checkNotNullParameter(nearestRange, "nearestRange");
        Intrinsics.checkNotNullParameter(intervalContent, "intervalContent");
        IntervalList<Interval> intervals = intervalContent.getIntervals();
        final int first = nearestRange.getFirst();
        if (!(first >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        final int iMin = Math.min(nearestRange.getLast(), intervals.getSize() - 1);
        if (iMin < first) {
            this.map = MapsKt.emptyMap();
            this.keys = new Object[0];
            this.keysStartIndex = 0;
        } else {
            this.keys = new Object[(iMin - first) + 1];
            this.keysStartIndex = first;
            final HashMap map = new HashMap();
            intervals.forEach(first, iMin, new Function1<IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval> interval) {
                    invoke2(interval);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x003e  */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval> it) {
                    Object defaultLazyLayoutKey;
                    Intrinsics.checkNotNullParameter(it, "it");
                    Function1<Integer, Object> key = it.getValue().getKey();
                    int iMax = Math.max(first, it.getStartIndex());
                    int iMin2 = Math.min(iMin, (it.getSize() + it.getStartIndex()) - 1);
                    if (iMax > iMin2) {
                        return;
                    }
                    while (true) {
                        if (key == null) {
                            defaultLazyLayoutKey = Lazy_androidKt.getDefaultLazyLayoutKey(iMax);
                        } else {
                            defaultLazyLayoutKey = key.invoke(Integer.valueOf(iMax - it.getStartIndex()));
                            if (defaultLazyLayoutKey == null) {
                                defaultLazyLayoutKey = Lazy_androidKt.getDefaultLazyLayoutKey(iMax);
                            }
                        }
                        map.put(defaultLazyLayoutKey, Integer.valueOf(iMax));
                        this.keys[iMax - this.keysStartIndex] = defaultLazyLayoutKey;
                        if (iMax == iMin2) {
                            return;
                        } else {
                            iMax++;
                        }
                    }
                }
            });
            this.map = map;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public int getIndex(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Integer num = this.map.get(key);
        if (num == null) {
            num = -1;
        }
        return num.intValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    @Nullable
    public Object getKey(int index) {
        Object[] objArr = this.keys;
        int i = index - this.keysStartIndex;
        if (i < 0 || i > ArraysKt.getLastIndex(objArr)) {
            return null;
        }
        return objArr[i];
    }
}
