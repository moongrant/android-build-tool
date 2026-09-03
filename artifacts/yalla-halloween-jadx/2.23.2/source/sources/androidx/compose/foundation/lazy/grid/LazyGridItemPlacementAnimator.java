package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.Constraints;
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
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002JD\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0014J\u0006\u0010)\u001a\u00020\u001cJ\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002J!\u0010+\u001a\u00020\u001c*\u00020\u000f2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0-H\u0082\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000bj\b\u0012\u0004\u0012\u00020\u0001`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\u00020\u0014*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "", "()V", "firstVisibleIndex", "", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyToItemInfoMap", "", "Landroidx/compose/foundation/lazy/grid/ItemInfo;", "movingAwayKeys", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "movingAwayToEndBound", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "movingAwayToStartBound", "movingInFromEndBound", "movingInFromStartBound", "hasAnimations", "", "getHasAnimations", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;)Z", "node", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "getNode", "(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "initializeNode", "", "item", "mainAxisOffset", "onMeasured", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "isVertical", "reset", "startAnimationsIfNeeded", "forEachNode", ReportItem.LogTypeBlock, "Lkotlin/Function1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n311#1,2:336\n313#1,2:339\n311#1,2:376\n313#1,2:380\n311#1,2:382\n313#1,2:385\n311#1,4:387\n101#2,2:322\n33#2,6:324\n103#2:330\n33#2,4:331\n38#2:341\n33#2,6:344\n33#2,6:352\n33#2,6:362\n33#2,6:370\n1#3:335\n86#4:338\n79#4:378\n86#4:379\n79#4:384\n1011#5,2:342\n1002#5,2:350\n1855#5,2:358\n1011#5,2:360\n1002#5,2:368\n*S KotlinDebug\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n110#1:336,2\n110#1:339,2\n280#1:376,2\n280#1:380,2\n288#1:382,2\n288#1:385,2\n304#1:387,4\n63#1:322,2\n63#1:324,6\n63#1:330\n86#1:331,4\n86#1:341\n129#1:344,6\n146#1:352,6\n201#1:362,6\n227#1:370,6\n112#1:338\n282#1:378\n283#1:379\n294#1:384\n128#1:342,2\n145#1:350,2\n160#1:358,2\n200#1:360,2\n226#1:368,2\n*E\n"})
public final class LazyGridItemPlacementAnimator {
    private int firstVisibleIndex;

    @NotNull
    private final Map<Object, ItemInfo> keyToItemInfoMap = new LinkedHashMap();

    @NotNull
    private LazyLayoutKeyIndexMap keyIndexMap = LazyLayoutKeyIndexMap.INSTANCE;

    @NotNull
    private final LinkedHashSet<Object> movingAwayKeys = new LinkedHashSet<>();

    @NotNull
    private final List<LazyGridMeasuredItem> movingInFromStartBound = new ArrayList();

    @NotNull
    private final List<LazyGridMeasuredItem> movingInFromEndBound = new ArrayList();

    @NotNull
    private final List<LazyGridMeasuredItem> movingAwayToStartBound = new ArrayList();

    @NotNull
    private final List<LazyGridMeasuredItem> movingAwayToEndBound = new ArrayList();

    private final void forEachNode(LazyGridMeasuredItem lazyGridMeasuredItem, Function1<? super LazyLayoutAnimateItemModifierNode, Unit> function1) {
        int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutAnimateItemModifierNode node = getNode(lazyGridMeasuredItem.getParentData(i));
            if (node != null) {
                function1.invoke(node);
            }
        }
    }

    private final boolean getHasAnimations(LazyGridMeasuredItem lazyGridMeasuredItem) {
        int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            if (getNode(lazyGridMeasuredItem.getParentData(i)) != null) {
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

    private final void initializeNode(LazyGridMeasuredItem item, int mainAxisOffset) {
        long offset = item.getOffset();
        long jM3889copyiSbpLlY$default = item.getIsVertical() ? IntOffset.m3889copyiSbpLlY$default(offset, 0, mainAxisOffset, 1, null) : IntOffset.m3889copyiSbpLlY$default(offset, mainAxisOffset, 0, 2, null);
        int placeablesCount = item.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutAnimateItemModifierNode node = getNode(item.getParentData(i));
            if (node != null) {
                long offset2 = item.getOffset();
                long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m3893getXimpl(offset2) - IntOffset.m3893getXimpl(offset), IntOffset.m3894getYimpl(offset2) - IntOffset.m3894getYimpl(offset));
                node.m623setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m3893getXimpl(jIntOffset) + IntOffset.m3893getXimpl(jM3889copyiSbpLlY$default), IntOffset.m3894getYimpl(jIntOffset) + IntOffset.m3894getYimpl(jM3889copyiSbpLlY$default)));
            }
        }
    }

    private final void startAnimationsIfNeeded(LazyGridMeasuredItem item) {
        int placeablesCount = item.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutAnimateItemModifierNode node = getNode(item.getParentData(i));
            if (node != null) {
                long offset = item.getOffset();
                long rawOffset = node.getRawOffset();
                if (!IntOffset.m3892equalsimpl0(rawOffset, LazyLayoutAnimateItemModifierNode.INSTANCE.m624getNotInitializednOccac()) && !IntOffset.m3892equalsimpl0(rawOffset, offset)) {
                    node.m620animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m3893getXimpl(offset) - IntOffset.m3893getXimpl(rawOffset), IntOffset.m3894getYimpl(offset) - IntOffset.m3894getYimpl(rawOffset)));
                }
                node.m623setRawOffsetgyyYBs(offset);
            }
        }
    }

    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, @NotNull List<LazyGridMeasuredItem> positionedItems, @NotNull LazyGridMeasuredItemProvider itemProvider, @NotNull LazyGridSpanLayoutProvider spanLayoutProvider, boolean isVertical) {
        boolean z;
        int i;
        int i2;
        int i3;
        List<LazyGridMeasuredItem> positionedItems2 = positionedItems;
        Intrinsics.checkNotNullParameter(positionedItems2, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
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
        LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) CollectionsKt.firstOrNull((List) positionedItems);
        this.firstVisibleIndex = lazyGridMeasuredItem != null ? lazyGridMeasuredItem.getIndex() : 0;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap = this.keyIndexMap;
        this.keyIndexMap = itemProvider.getKeyIndexMap();
        int i6 = isVertical ? layoutHeight : layoutWidth;
        long jIntOffset = isVertical ? IntOffsetKt.IntOffset(0, consumedScroll) : IntOffsetKt.IntOffset(consumedScroll, 0);
        this.movingAwayKeys.addAll(this.keyToItemInfoMap.keySet());
        int size2 = positionedItems.size();
        int i7 = 0;
        while (i7 < size2) {
            LazyGridMeasuredItem lazyGridMeasuredItem2 = positionedItems2.get(i7);
            this.movingAwayKeys.remove(lazyGridMeasuredItem2.getKey());
            if (getHasAnimations(lazyGridMeasuredItem2)) {
                ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyGridMeasuredItem2.getKey());
                if (itemInfo == null) {
                    this.keyToItemInfoMap.put(lazyGridMeasuredItem2.getKey(), new ItemInfo(lazyGridMeasuredItem2.getCrossAxisSize(), lazyGridMeasuredItem2.getCrossAxisOffset()));
                    int index = lazyLayoutKeyIndexMap.getIndex(lazyGridMeasuredItem2.getKey());
                    if (index == -1 || lazyGridMeasuredItem2.getIndex() == index) {
                        long offset = lazyGridMeasuredItem2.getOffset();
                        initializeNode(lazyGridMeasuredItem2, lazyGridMeasuredItem2.getIsVertical() ? IntOffset.m3894getYimpl(offset) : IntOffset.m3893getXimpl(offset));
                    } else if (index < i5) {
                        this.movingInFromStartBound.add(lazyGridMeasuredItem2);
                    } else {
                        this.movingInFromEndBound.add(lazyGridMeasuredItem2);
                    }
                    i = size2;
                    i2 = i5;
                } else {
                    int placeablesCount = lazyGridMeasuredItem2.getPlaceablesCount();
                    int i8 = 0;
                    while (i8 < placeablesCount) {
                        LazyLayoutAnimateItemModifierNode node = getNode(lazyGridMeasuredItem2.getParentData(i8));
                        int i9 = size2;
                        if (node != null) {
                            i3 = i5;
                            if (!IntOffset.m3892equalsimpl0(node.getRawOffset(), LazyLayoutAnimateItemModifierNode.INSTANCE.m624getNotInitializednOccac())) {
                                long rawOffset = node.getRawOffset();
                                node.m623setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m3893getXimpl(jIntOffset) + IntOffset.m3893getXimpl(rawOffset), IntOffset.m3894getYimpl(jIntOffset) + IntOffset.m3894getYimpl(rawOffset)));
                            }
                        } else {
                            i3 = i5;
                        }
                        i8++;
                        size2 = i9;
                        i5 = i3;
                    }
                    i = size2;
                    i2 = i5;
                    itemInfo.setCrossAxisSize(lazyGridMeasuredItem2.getCrossAxisSize());
                    itemInfo.setCrossAxisOffset(lazyGridMeasuredItem2.getCrossAxisOffset());
                    startAnimationsIfNeeded(lazyGridMeasuredItem2);
                }
            } else {
                i = size2;
                i2 = i5;
                this.keyToItemInfoMap.remove(lazyGridMeasuredItem2.getKey());
            }
            i7++;
            positionedItems2 = positionedItems;
            size2 = i;
            i5 = i2;
        }
        List<LazyGridMeasuredItem> list = this.movingInFromStartBound;
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyGridMeasuredItem) t2).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyGridMeasuredItem) t).getKey())));
                }
            });
        }
        List<LazyGridMeasuredItem> list2 = this.movingInFromStartBound;
        int size3 = list2.size();
        int i10 = -1;
        int i11 = 0;
        int mainAxisSize = 0;
        for (int i12 = 0; i12 < size3; i12++) {
            LazyGridMeasuredItem lazyGridMeasuredItem3 = list2.get(i12);
            int row = isVertical ? lazyGridMeasuredItem3.getRow() : lazyGridMeasuredItem3.getColumn();
            if (row == -1 || row != i10) {
                i11 += mainAxisSize;
                mainAxisSize = lazyGridMeasuredItem3.getMainAxisSize();
                i10 = row;
            } else {
                mainAxisSize = Math.max(mainAxisSize, lazyGridMeasuredItem3.getMainAxisSize());
            }
            initializeNode(lazyGridMeasuredItem3, (0 - i11) - lazyGridMeasuredItem3.getMainAxisSize());
            startAnimationsIfNeeded(lazyGridMeasuredItem3);
        }
        List<LazyGridMeasuredItem> list3 = this.movingInFromEndBound;
        if (list3.size() > 1) {
            CollectionsKt.sortWith(list3, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyGridMeasuredItem) t).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap.getIndex(((LazyGridMeasuredItem) t2).getKey())));
                }
            });
        }
        List<LazyGridMeasuredItem> list4 = this.movingInFromEndBound;
        int size4 = list4.size();
        int i13 = 0;
        int mainAxisSize2 = 0;
        int i14 = -1;
        for (int i15 = 0; i15 < size4; i15++) {
            LazyGridMeasuredItem lazyGridMeasuredItem4 = list4.get(i15);
            int row2 = isVertical ? lazyGridMeasuredItem4.getRow() : lazyGridMeasuredItem4.getColumn();
            if (row2 == -1 || row2 != i14) {
                i13 += mainAxisSize2;
                mainAxisSize2 = lazyGridMeasuredItem4.getMainAxisSize();
                i14 = row2;
            } else {
                mainAxisSize2 = Math.max(mainAxisSize2, lazyGridMeasuredItem4.getMainAxisSize());
            }
            initializeNode(lazyGridMeasuredItem4, i6 + i13);
            startAnimationsIfNeeded(lazyGridMeasuredItem4);
        }
        for (Object obj : this.movingAwayKeys) {
            ItemInfo itemInfo2 = (ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, obj);
            int index2 = this.keyIndexMap.getIndex(obj);
            if (index2 == -1) {
                this.keyToItemInfoMap.remove(obj);
            } else {
                LazyGridMeasuredItem lazyGridMeasuredItemM614getAndMeasure3p2s80s$default = LazyGridMeasuredItemProvider.m614getAndMeasure3p2s80s$default(itemProvider, index2, 0, isVertical ? Constraints.INSTANCE.m3753fixedWidthOenEA2s(itemInfo2.getCrossAxisSize()) : Constraints.INSTANCE.m3752fixedHeightOenEA2s(itemInfo2.getCrossAxisSize()), 2, null);
                int placeablesCount2 = lazyGridMeasuredItemM614getAndMeasure3p2s80s$default.getPlaceablesCount();
                boolean z2 = false;
                for (int i16 = 0; i16 < placeablesCount2; i16++) {
                    LazyLayoutAnimateItemModifierNode node2 = getNode(lazyGridMeasuredItemM614getAndMeasure3p2s80s$default.getParentData(i16));
                    if (node2 != null && node2.isAnimationInProgress()) {
                        z2 = true;
                    }
                }
                if (!z2 && index2 == lazyLayoutKeyIndexMap.getIndex(obj)) {
                    this.keyToItemInfoMap.remove(obj);
                } else if (index2 < this.firstVisibleIndex) {
                    this.movingAwayToStartBound.add(lazyGridMeasuredItemM614getAndMeasure3p2s80s$default);
                } else {
                    this.movingAwayToEndBound.add(lazyGridMeasuredItemM614getAndMeasure3p2s80s$default);
                }
            }
        }
        List<LazyGridMeasuredItem> list5 = this.movingAwayToStartBound;
        if (list5.size() > 1) {
            CollectionsKt.sortWith(list5, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyGridMeasuredItem) t2).getKey())), Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyGridMeasuredItem) t).getKey())));
                }
            });
        }
        List<LazyGridMeasuredItem> list6 = this.movingAwayToStartBound;
        int size5 = list6.size();
        int i17 = -1;
        int i18 = 0;
        int mainAxisSize3 = 0;
        for (int i19 = 0; i19 < size5; i19++) {
            LazyGridMeasuredItem lazyGridMeasuredItem5 = list6.get(i19);
            int lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(lazyGridMeasuredItem5.getIndex());
            if (lineIndexOfItem == -1 || lineIndexOfItem != i17) {
                i18 += mainAxisSize3;
                mainAxisSize3 = lazyGridMeasuredItem5.getMainAxisSize();
                i17 = lineIndexOfItem;
            } else {
                mainAxisSize3 = Math.max(mainAxisSize3, lazyGridMeasuredItem5.getMainAxisSize());
            }
            lazyGridMeasuredItem5.position((0 - i18) - lazyGridMeasuredItem5.getMainAxisSize(), ((ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, lazyGridMeasuredItem5.getKey())).getCrossAxisOffset(), layoutWidth, layoutHeight, (48 & 16) != 0 ? -1 : 0, (48 & 32) != 0 ? -1 : 0);
            positionedItems.add(lazyGridMeasuredItem5);
            startAnimationsIfNeeded(lazyGridMeasuredItem5);
        }
        List<LazyGridMeasuredItem> list7 = this.movingAwayToEndBound;
        if (list7.size() > 1) {
            CollectionsKt.sortWith(list7, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyGridMeasuredItem) t).getKey())), Integer.valueOf(this.this$0.keyIndexMap.getIndex(((LazyGridMeasuredItem) t2).getKey())));
                }
            });
        }
        List<LazyGridMeasuredItem> list8 = this.movingAwayToEndBound;
        int size6 = list8.size();
        int i20 = -1;
        int mainAxisSize4 = 0;
        int i21 = 0;
        for (int i22 = 0; i22 < size6; i22++) {
            LazyGridMeasuredItem lazyGridMeasuredItem6 = list8.get(i22);
            int lineIndexOfItem2 = spanLayoutProvider.getLineIndexOfItem(lazyGridMeasuredItem6.getIndex());
            if (lineIndexOfItem2 == -1 || lineIndexOfItem2 != i20) {
                i21 += mainAxisSize4;
                mainAxisSize4 = lazyGridMeasuredItem6.getMainAxisSize();
                i20 = lineIndexOfItem2;
            } else {
                mainAxisSize4 = Math.max(mainAxisSize4, lazyGridMeasuredItem6.getMainAxisSize());
            }
            lazyGridMeasuredItem6.position(i6 + i21, ((ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, lazyGridMeasuredItem6.getKey())).getCrossAxisOffset(), layoutWidth, layoutHeight, (48 & 16) != 0 ? -1 : 0, (48 & 32) != 0 ? -1 : 0);
            positionedItems.add(lazyGridMeasuredItem6);
            startAnimationsIfNeeded(lazyGridMeasuredItem6);
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
