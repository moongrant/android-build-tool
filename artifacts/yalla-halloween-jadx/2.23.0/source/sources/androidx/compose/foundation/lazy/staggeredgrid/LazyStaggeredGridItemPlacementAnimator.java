package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.qiniu.android.collect.ReportItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002JD\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0004J\u0006\u0010(\u001a\u00020\u001cJ\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002J!\u0010*\u001a\u00020\u001c*\u00020\u000f2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0,H\u0082\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000bj\b\u0012\u0004\u0012\u00020\u0001`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\u00020\u0014*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006-"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "", "()V", "firstVisibleIndex", "", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyToItemInfoMap", "", "Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;", "movingAwayKeys", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "movingAwayToEndBound", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "movingAwayToStartBound", "movingInFromEndBound", "movingInFromStartBound", "hasAnimations", "", "getHasAnimations", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;)Z", "node", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "getNode", "(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "initializeNode", "", "item", "mainAxisOffset", "onMeasured", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "isVertical", "laneCount", "reset", "startAnimationsIfNeeded", "forEachNode", ReportItem.LogTypeBlock, "Lkotlin/Function1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,279:1\n268#1,2:294\n270#1,2:297\n268#1,2:334\n270#1,2:338\n268#1,2:340\n270#1,2:343\n268#1,4:345\n101#2,2:280\n33#2,6:282\n103#2:288\n33#2,4:289\n38#2:299\n33#2,6:302\n33#2,6:310\n33#2,6:320\n33#2,6:328\n1#3:293\n86#4:296\n79#4:336\n86#4:337\n79#4:342\n1011#5,2:300\n1002#5,2:308\n1855#5,2:316\n1011#5,2:318\n1002#5,2:326\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n*L\n110#1:294,2\n110#1:297,2\n237#1:334,2\n237#1:338,2\n245#1:340,2\n245#1:343,2\n261#1:345,4\n63#1:280,2\n63#1:282,6\n63#1:288\n86#1:289,4\n86#1:299\n129#1:302,6\n139#1:310,6\n183#1:320,6\n196#1:328,6\n112#1:296\n239#1:336\n240#1:337\n251#1:342\n128#1:300,2\n138#1:308,2\n148#1:316,2\n182#1:318,2\n195#1:326,2\n*E\n"})
public final class LazyStaggeredGridItemPlacementAnimator {
    private int firstVisibleIndex;

    @NotNull
    private final Map<Object, ItemInfo> keyToItemInfoMap = new LinkedHashMap();

    @NotNull
    private LazyLayoutKeyIndexMap keyIndexMap = LazyLayoutKeyIndexMap.INSTANCE;

    @NotNull
    private final LinkedHashSet<Object> movingAwayKeys = new LinkedHashSet<>();

    @NotNull
    private final List<LazyStaggeredGridMeasuredItem> movingInFromStartBound = new ArrayList();

    @NotNull
    private final List<LazyStaggeredGridMeasuredItem> movingInFromEndBound = new ArrayList();

    @NotNull
    private final List<LazyStaggeredGridMeasuredItem> movingAwayToStartBound = new ArrayList();

    @NotNull
    private final List<LazyStaggeredGridMeasuredItem> movingAwayToEndBound = new ArrayList();

    private final void forEachNode(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem, Function1<? super LazyLayoutAnimateItemModifierNode, Unit> function1) {
        int placeablesCount = lazyStaggeredGridMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutAnimateItemModifierNode node = getNode(lazyStaggeredGridMeasuredItem.getParentData(i));
            if (node != null) {
                function1.invoke(node);
            }
        }
    }

    private final boolean getHasAnimations(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem) {
        int placeablesCount = lazyStaggeredGridMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            if (getNode(lazyStaggeredGridMeasuredItem.getParentData(i)) != null) {
                return true;
            }
        }
        return false;
    }

    private final LazyLayoutAnimateItemModifierNode getNode(Object obj) {
        if (obj instanceof LazyLayoutAnimateItemModifierNode) {
            return (LazyLayoutAnimateItemModifierNode) obj;
        }
        return null;
    }

    private final void initializeNode(LazyStaggeredGridMeasuredItem item, int mainAxisOffset) {
        long jMo648getOffsetnOccac = item.getOffset();
        long jM3879copyiSbpLlY$default = item.getIsVertical() ? IntOffset.m3879copyiSbpLlY$default(jMo648getOffsetnOccac, 0, mainAxisOffset, 1, null) : IntOffset.m3879copyiSbpLlY$default(jMo648getOffsetnOccac, mainAxisOffset, 0, 2, null);
        int placeablesCount = item.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutAnimateItemModifierNode node = getNode(item.getParentData(i));
            if (node != null) {
                long jMo648getOffsetnOccac2 = item.getOffset();
                long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m3883getXimpl(jMo648getOffsetnOccac2) - IntOffset.m3883getXimpl(jMo648getOffsetnOccac), IntOffset.m3884getYimpl(jMo648getOffsetnOccac2) - IntOffset.m3884getYimpl(jMo648getOffsetnOccac));
                node.m621setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m3883getXimpl(jIntOffset) + IntOffset.m3883getXimpl(jM3879copyiSbpLlY$default), IntOffset.m3884getYimpl(jIntOffset) + IntOffset.m3884getYimpl(jM3879copyiSbpLlY$default)));
            }
        }
    }

    private final void startAnimationsIfNeeded(LazyStaggeredGridMeasuredItem item) {
        int placeablesCount = item.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutAnimateItemModifierNode node = getNode(item.getParentData(i));
            if (node != null) {
                long jMo648getOffsetnOccac = item.getOffset();
                long rawOffset = node.getRawOffset();
                if (!IntOffset.m3882equalsimpl0(rawOffset, LazyLayoutAnimateItemModifierNode.INSTANCE.m622getNotInitializednOccac()) && !IntOffset.m3882equalsimpl0(rawOffset, jMo648getOffsetnOccac)) {
                    node.m618animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m3883getXimpl(jMo648getOffsetnOccac) - IntOffset.m3883getXimpl(rawOffset), IntOffset.m3884getYimpl(jMo648getOffsetnOccac) - IntOffset.m3884getYimpl(rawOffset)));
                }
                node.m621setRawOffsetgyyYBs(jMo648getOffsetnOccac);
            }
        }
    }

    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, @NotNull List<LazyStaggeredGridMeasuredItem> positionedItems, @NotNull LazyStaggeredGridMeasureProvider itemProvider, boolean isVertical, int laneCount) {
        boolean z;
        int i;
        int i2;
        int i3;
        List<LazyStaggeredGridMeasuredItem> positionedItems2 = positionedItems;
        Intrinsics.checkNotNullParameter(positionedItems2, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        int size = positionedItems.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z = false;
                break;
            } else {
                if (getHasAnimations(positionedItems2.get(i4))) {
                    z = true;
                    break;
                }
                i4++;
            }
        }
        if (!z && this.keyToItemInfoMap.isEmpty()) {
            reset();
            return;
        }
        int i5 = this.firstVisibleIndex;
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) CollectionsKt.firstOrNull((List) positionedItems);
        this.firstVisibleIndex = lazyStaggeredGridMeasuredItem != null ? lazyStaggeredGridMeasuredItem.getIndex() : 0;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap = this.keyIndexMap;
        this.keyIndexMap = itemProvider.getKeyIndexMap();
        int i6 = isVertical ? layoutHeight : layoutWidth;
        long jIntOffset = isVertical ? IntOffsetKt.IntOffset(0, consumedScroll) : IntOffsetKt.IntOffset(consumedScroll, 0);
        this.movingAwayKeys.addAll(this.keyToItemInfoMap.keySet());
        int size2 = positionedItems.size();
        int i7 = 0;
        while (i7 < size2) {
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = positionedItems2.get(i7);
            this.movingAwayKeys.remove(lazyStaggeredGridMeasuredItem2.getKey());
            if (getHasAnimations(lazyStaggeredGridMeasuredItem2)) {
                ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyStaggeredGridMeasuredItem2.getKey());
                if (itemInfo == null) {
                    this.keyToItemInfoMap.put(lazyStaggeredGridMeasuredItem2.getKey(), new ItemInfo(lazyStaggeredGridMeasuredItem2.getLane(), lazyStaggeredGridMeasuredItem2.getSpan(), lazyStaggeredGridMeasuredItem2.getCrossAxisOffset()));
                    int index = lazyLayoutKeyIndexMap.getIndex(lazyStaggeredGridMeasuredItem2.getKey());
                    if (index == -1 || lazyStaggeredGridMeasuredItem2.getIndex() == index) {
                        long jMo648getOffsetnOccac = lazyStaggeredGridMeasuredItem2.getOffset();
                        initializeNode(lazyStaggeredGridMeasuredItem2, lazyStaggeredGridMeasuredItem2.getIsVertical() ? IntOffset.m3884getYimpl(jMo648getOffsetnOccac) : IntOffset.m3883getXimpl(jMo648getOffsetnOccac));
                    } else if (index < i5) {
                        this.movingInFromStartBound.add(lazyStaggeredGridMeasuredItem2);
                    } else {
                        this.movingInFromEndBound.add(lazyStaggeredGridMeasuredItem2);
                    }
                    i2 = i7;
                } else {
                    int placeablesCount = lazyStaggeredGridMeasuredItem2.getPlaceablesCount();
                    int i8 = 0;
                    while (i8 < placeablesCount) {
                        LazyLayoutAnimateItemModifierNode node = getNode(lazyStaggeredGridMeasuredItem2.getParentData(i8));
                        if (node != null) {
                            i3 = i7;
                            if (!IntOffset.m3882equalsimpl0(node.getRawOffset(), LazyLayoutAnimateItemModifierNode.INSTANCE.m622getNotInitializednOccac())) {
                                long rawOffset = node.getRawOffset();
                                node.m621setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m3883getXimpl(jIntOffset) + IntOffset.m3883getXimpl(rawOffset), IntOffset.m3884getYimpl(jIntOffset) + IntOffset.m3884getYimpl(rawOffset)));
                            }
                        } else {
                            i3 = i7;
                        }
                        i8++;
                        i7 = i3;
                    }
                    i2 = i7;
                    itemInfo.setLane(lazyStaggeredGridMeasuredItem2.getLane());
                    itemInfo.setSpan(lazyStaggeredGridMeasuredItem2.getSpan());
                    itemInfo.setCrossAxisOffset(lazyStaggeredGridMeasuredItem2.getCrossAxisOffset());
                    startAnimationsIfNeeded(lazyStaggeredGridMeasuredItem2);
                }
            } else {
                i2 = i7;
                this.keyToItemInfoMap.remove(lazyStaggeredGridMeasuredItem2.getKey());
            }
            i7 = i2 + 1;
            size2 = size2;
            positionedItems2 = positionedItems;
        }
        int[] iArr = new int[laneCount];
        for (int i9 = 0; i9 < laneCount; i9++) {
            iArr[i9] = 0;
        }
        if (!this.movingInFromStartBound.isEmpty()) {
            List<LazyStaggeredGridMeasuredItem> list = this.movingInFromStartBound;
            if (list.size() > 1) {
                CollectionsKt.sortWith(list, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyStaggeredGridMeasuredItem) t2).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyStaggeredGridMeasuredItem) t).getKey())));
                    }
                });
            }
            List<LazyStaggeredGridMeasuredItem> list2 = this.movingInFromStartBound;
            int size3 = list2.size();
            for (int i10 = 0; i10 < size3; i10++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = list2.get(i10);
                int lane = lazyStaggeredGridMeasuredItem3.getLane();
                iArr[lane] = lazyStaggeredGridMeasuredItem3.getMainAxisSize() + iArr[lane];
                initializeNode(lazyStaggeredGridMeasuredItem3, 0 - iArr[lazyStaggeredGridMeasuredItem3.getLane()]);
                startAnimationsIfNeeded(lazyStaggeredGridMeasuredItem3);
            }
            ArraysKt___ArraysJvmKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        }
        if (!this.movingInFromEndBound.isEmpty()) {
            List<LazyStaggeredGridMeasuredItem> list3 = this.movingInFromEndBound;
            if (list3.size() > 1) {
                CollectionsKt.sortWith(list3, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyStaggeredGridMeasuredItem) t).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyStaggeredGridMeasuredItem) t2).getKey())));
                    }
                });
            }
            List<LazyStaggeredGridMeasuredItem> list4 = this.movingInFromEndBound;
            int size4 = list4.size();
            for (int i11 = 0; i11 < size4; i11++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem4 = list4.get(i11);
                int i12 = iArr[lazyStaggeredGridMeasuredItem4.getLane()] + i6;
                int lane2 = lazyStaggeredGridMeasuredItem4.getLane();
                iArr[lane2] = lazyStaggeredGridMeasuredItem4.getMainAxisSize() + iArr[lane2];
                initializeNode(lazyStaggeredGridMeasuredItem4, i12);
                startAnimationsIfNeeded(lazyStaggeredGridMeasuredItem4);
            }
            ArraysKt___ArraysJvmKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        }
        for (Object obj : this.movingAwayKeys) {
            ItemInfo itemInfo2 = (ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, obj);
            int index2 = this.keyIndexMap.getIndex(obj);
            if (index2 == -1) {
                this.keyToItemInfoMap.remove(obj);
            } else {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ = itemProvider.m662getAndMeasurejy6DScQ(index2, SpanRange.m667constructorimpl(itemInfo2.getLane(), itemInfo2.getSpan()));
                int placeablesCount2 = lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ.getPlaceablesCount();
                boolean z2 = false;
                for (int i13 = 0; i13 < placeablesCount2; i13++) {
                    LazyLayoutAnimateItemModifierNode node2 = getNode(lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ.getParentData(i13));
                    if (node2 != null && node2.isAnimationInProgress()) {
                        z2 = true;
                    }
                }
                if (!z2 && index2 == lazyLayoutKeyIndexMap.getIndex(obj)) {
                    this.keyToItemInfoMap.remove(obj);
                } else if (index2 < this.firstVisibleIndex) {
                    this.movingAwayToStartBound.add(lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ);
                } else {
                    this.movingAwayToEndBound.add(lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ);
                }
            }
        }
        if (!this.movingAwayToStartBound.isEmpty()) {
            List<LazyStaggeredGridMeasuredItem> list5 = this.movingAwayToStartBound;
            if (list5.size() > 1) {
                CollectionsKt.sortWith(list5, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyStaggeredGridMeasuredItem) t2).getKey())), Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyStaggeredGridMeasuredItem) t).getKey())));
                    }
                });
            }
            List<LazyStaggeredGridMeasuredItem> list6 = this.movingAwayToStartBound;
            int size5 = list6.size();
            for (int i14 = 0; i14 < size5; i14++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem5 = list6.get(i14);
                int lane3 = lazyStaggeredGridMeasuredItem5.getLane();
                iArr[lane3] = lazyStaggeredGridMeasuredItem5.getMainAxisSize() + iArr[lane3];
                lazyStaggeredGridMeasuredItem5.position(0 - iArr[lazyStaggeredGridMeasuredItem5.getLane()], ((ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, lazyStaggeredGridMeasuredItem5.getKey())).getCrossAxisOffset(), i6);
                positionedItems.add(lazyStaggeredGridMeasuredItem5);
                startAnimationsIfNeeded(lazyStaggeredGridMeasuredItem5);
            }
            i = 0;
            ArraysKt___ArraysJvmKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        } else {
            i = 0;
        }
        if (!this.movingAwayToEndBound.isEmpty()) {
            List<LazyStaggeredGridMeasuredItem> list7 = this.movingAwayToEndBound;
            if (list7.size() > 1) {
                CollectionsKt.sortWith(list7, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyStaggeredGridMeasuredItem) t).getKey())), Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyStaggeredGridMeasuredItem) t2).getKey())));
                    }
                });
            }
            List<LazyStaggeredGridMeasuredItem> list8 = this.movingAwayToEndBound;
            int size6 = list8.size();
            for (int i15 = i; i15 < size6; i15++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem6 = list8.get(i15);
                int i16 = iArr[lazyStaggeredGridMeasuredItem6.getLane()] + i6;
                int lane4 = lazyStaggeredGridMeasuredItem6.getLane();
                iArr[lane4] = lazyStaggeredGridMeasuredItem6.getMainAxisSize() + iArr[lane4];
                lazyStaggeredGridMeasuredItem6.position(i16, ((ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, lazyStaggeredGridMeasuredItem6.getKey())).getCrossAxisOffset(), i6);
                positionedItems.add(lazyStaggeredGridMeasuredItem6);
                startAnimationsIfNeeded(lazyStaggeredGridMeasuredItem6);
            }
        }
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.clear();
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyIndexMap = LazyLayoutKeyIndexMap.INSTANCE;
        this.firstVisibleIndex = -1;
    }
}
