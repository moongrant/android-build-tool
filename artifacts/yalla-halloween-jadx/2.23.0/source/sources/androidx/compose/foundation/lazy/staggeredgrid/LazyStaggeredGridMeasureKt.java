package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import com.facebook.share.internal.ShareConstants;
import com.qiniu.android.collect.ReportItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082\b\u001a5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\n0\u000e¢\u0006\u0002\b\u000fH\u0083\b¢\u0006\u0002\u0010\u0010\u001aJ\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u000e2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u000eH\u0083\b\u001a;\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010!\u001a\u001d\u0010\"\u001a\u00020\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001d0\u001cH\u0002¢\u0006\u0002\u0010#\u001a\u001c\u0010$\u001a\u00020\u0005*\u00020\u00142\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0003H\u0002\u001a\u001c\u0010'\u001a\u00020\u0003*\u00020\u00142\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0003H\u0002\u001a.\u0010*\u001a\u00020\u0005*\u00020+2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a\f\u0010.\u001a\u00020\u0003*\u00020\u001fH\u0002\u001a2\u0010/\u001a\u00020\u0003\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u001c2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b¢\u0006\u0002\u00100\u001a\u0016\u00101\u001a\u00020\u0003*\u00020\u001f2\b\b\u0002\u00102\u001a\u00020\u0003H\u0000\u001a!\u00103\u001a\u00020\u0003*\u00020\u001f2\u0006\u00104\u001a\u00020+H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106\u001a,\u00107\u001a\u000208*\u00020\u00142\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u0001H\u0003\u001a\u007f\u0010=\u001a\u000208*\u00020\f2\u0006\u0010>\u001a\u00020?2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00012\u0006\u0010H\u001a\u00020\u00012\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bO\u0010P\u001a\u0014\u0010Q\u001a\u00020\u0005*\u00020\u001f2\u0006\u0010R\u001a\u00020\u0003H\u0002\u001a!\u0010S\u001a\u00020\u001f*\u00020\u001f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006T"}, d2 = {"DebugLoggingEnabled", "", "Unset", "", "debugLog", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lkotlin/Function0;", "", "withDebugLogging", "T", "scope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", ReportItem.LogTypeBlock, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "calculateExtraItems", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "position", "filter", "Lkotlin/ParameterName;", "name", "itemIndex", "calculateVisibleItems", "measuredItems", "", "Lkotlin/collections/ArrayDeque;", "itemScrollOffsets", "", "mainAxisLayoutSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;", "debugRender", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "ensureIndicesInRange", "indices", "itemCount", "findPreviousItemIndex", "item", "lane", "forEach", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "indexOfMaxValue", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMinValue", "minBound", "maxInRange", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "measure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measureStaggeredGrid", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "pinnedItems", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "resolvedSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "reverseLayout", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "measureStaggeredGrid-dSVRQoE", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIII)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "offsetBy", "delta", "transform", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 5 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1158:1\n50#1,9:1169\n72#1,4:1178\n912#1:1195\n913#1,3:1200\n72#1,4:1203\n72#1,4:1207\n72#1,4:1211\n912#1:1222\n913#1,3:1227\n72#1,4:1238\n72#1,4:1242\n912#1:1263\n913#1,3:1268\n72#1,4:1273\n72#1,4:1279\n72#1,4:1283\n912#1:1304\n913#1,3:1309\n72#1,4:1312\n72#1,4:1316\n972#1,4:1320\n72#1,4:1324\n72#1,4:1328\n885#1,3:1332\n888#1:1339\n889#1,9:1342\n899#1:1352\n885#1,3:1353\n888#1:1360\n889#1,9:1363\n899#1:1373\n72#1,4:1374\n60#1:1382\n945#1,11:1386\n912#1:1397\n913#1,3:1402\n912#1:1415\n913#1,3:1420\n495#2,4:1159\n500#2:1168\n129#3,5:1163\n234#4:1182\n231#4:1183\n231#4:1189\n234#4:1215\n231#4:1216\n231#4:1232\n234#4:1250\n231#4:1251\n231#4:1257\n234#4:1291\n231#4:1292\n231#4:1298\n908#5:1184\n907#5:1185\n906#5:1187\n908#5:1190\n907#5:1191\n906#5:1193\n906#5:1196\n907#5:1198\n908#5:1217\n907#5:1218\n906#5:1220\n906#5:1223\n907#5:1225\n906#5:1230\n908#5:1233\n907#5:1234\n906#5:1236\n908#5:1252\n907#5:1253\n906#5:1255\n908#5:1258\n907#5:1259\n906#5:1261\n906#5:1264\n907#5:1266\n906#5:1271\n908#5:1293\n907#5:1294\n906#5:1296\n908#5:1299\n907#5:1300\n906#5:1302\n906#5:1305\n907#5:1307\n906#5:1398\n907#5:1400\n906#5:1411\n907#5:1413\n906#5:1416\n907#5:1418\n62#6:1186\n55#6:1188\n62#6:1192\n55#6:1194\n55#6:1197\n62#6:1199\n62#6:1219\n55#6:1221\n55#6:1224\n62#6:1226\n55#6:1231\n62#6:1235\n55#6:1237\n62#6:1254\n55#6:1256\n62#6:1260\n55#6:1262\n55#6:1265\n62#6:1267\n55#6:1272\n62#6:1295\n55#6:1297\n62#6:1301\n55#6:1303\n55#6:1306\n62#6:1308\n55#6:1399\n62#6:1401\n55#6:1412\n62#6:1414\n55#6:1417\n62#6:1419\n12774#7,2:1246\n12541#7,2:1248\n12774#7,2:1277\n12583#7,2:1287\n12774#7,2:1289\n12583#7,2:1340\n12583#7,2:1361\n12774#7,2:1378\n12583#7,2:1380\n12744#7,2:1384\n33#8,4:1335\n38#8:1351\n33#8,4:1356\n38#8:1372\n33#8,6:1405\n1#9:1383\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n244#1:1169,9\n302#1:1178,4\n347#1:1195\n347#1:1200,3\n353#1:1203,4\n395#1:1207,4\n433#1:1211,4\n461#1:1222\n461#1:1227,3\n478#1:1238,4\n481#1:1242,4\n514#1:1263\n514#1:1268,3\n532#1:1273,4\n554#1:1279,4\n557#1:1283,4\n621#1:1304\n621#1:1309,3\n659#1:1312,4\n662#1:1316,4\n679#1:1320,4\n683#1:1324,4\n705#1:1328,4\n735#1:1332,3\n735#1:1339\n735#1:1342,9\n735#1:1352\n764#1:1353,3\n764#1:1360\n764#1:1363,9\n764#1:1373\n794#1:1374,4\n244#1:1382\n850#1:1386,11\n873#1:1397\n873#1:1402,3\n925#1:1415\n925#1:1420,3\n111#1:1159,4\n111#1:1168\n111#1:1163,5\n339#1:1182\n339#1:1183\n346#1:1189\n459#1:1215\n459#1:1216\n471#1:1232\n505#1:1250\n505#1:1251\n509#1:1257\n613#1:1291\n613#1:1292\n620#1:1298\n339#1:1184\n339#1:1185\n339#1:1187\n346#1:1190\n346#1:1191\n346#1:1193\n347#1:1196\n347#1:1198\n459#1:1217\n459#1:1218\n459#1:1220\n461#1:1223\n461#1:1225\n467#1:1230\n471#1:1233\n471#1:1234\n471#1:1236\n505#1:1252\n505#1:1253\n505#1:1255\n509#1:1258\n509#1:1259\n509#1:1261\n514#1:1264\n514#1:1266\n524#1:1271\n613#1:1293\n613#1:1294\n613#1:1296\n620#1:1299\n620#1:1300\n620#1:1302\n621#1:1305\n621#1:1307\n873#1:1398\n873#1:1400\n912#1:1411\n912#1:1413\n925#1:1416\n925#1:1418\n339#1:1186\n339#1:1188\n346#1:1192\n346#1:1194\n347#1:1197\n347#1:1199\n459#1:1219\n459#1:1221\n461#1:1224\n461#1:1226\n467#1:1231\n471#1:1235\n471#1:1237\n505#1:1254\n505#1:1256\n509#1:1260\n509#1:1262\n514#1:1265\n514#1:1267\n524#1:1272\n613#1:1295\n613#1:1297\n620#1:1301\n620#1:1303\n621#1:1306\n621#1:1308\n873#1:1399\n873#1:1401\n912#1:1412\n912#1:1414\n925#1:1417\n925#1:1419\n490#1:1246,2\n493#1:1248,2\n550#1:1277,2\n564#1:1287,2\n572#1:1289,2\n748#1:1340,2\n780#1:1361,2\n813#1:1378,2\n814#1:1380,2\n848#1:1384,2\n735#1:1335,4\n735#1:1351\n764#1:1356,4\n764#1:1372\n887#1:1405,6\n*E\n"})
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    @ExperimentalFoundationApi
    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1<? super LazyStaggeredGridMeasuredItem, Unit> function1, Function1<? super Integer, Boolean> function2) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size = pinnedItems.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            int iIntValue = pinnedItems.get(i).intValue();
            if (function2.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                long jM654getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m654getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue, 0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m662getAndMeasurejy6DScQ(iIntValue, jM654getSpanRangelOCCd4c);
                function1.invoke(lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ);
                arrayList.add(lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ);
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i) {
        boolean z;
        int size = 0;
        for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            size += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            int length = arrayDequeArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                z = true;
                if (!arrayDequeArr[i2].isEmpty()) {
                    break;
                }
                i2++;
            }
            if (!z) {
                return arrayList;
            }
            int length2 = arrayDequeArr.length;
            int i3 = -1;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < length2; i5++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemFirstOrNull = arrayDequeArr[i5].firstOrNull();
                int index = lazyStaggeredGridMeasuredItemFirstOrNull != null ? lazyStaggeredGridMeasuredItemFirstOrNull.getIndex() : Integer.MAX_VALUE;
                if (i4 > index) {
                    i3 = i5;
                    i4 = index;
                }
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemRemoveFirst = arrayDequeArr[i3].removeFirst();
            if (lazyStaggeredGridMeasuredItemRemoveFirst.getLane() == i3) {
                long jM667constructorimpl = SpanRange.m667constructorimpl(lazyStaggeredGridMeasuredItemRemoveFirst.getLane(), lazyStaggeredGridMeasuredItemRemoveFirst.getSpan());
                int iM657maxInRangejy6DScQ = m657maxInRangejy6DScQ(iArr, jM667constructorimpl);
                int i6 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i3];
                if (lazyStaggeredGridMeasuredItemRemoveFirst.getPlaceablesCount() != 0) {
                    lazyStaggeredGridMeasuredItemRemoveFirst.position(iM657maxInRangejy6DScQ, i6, i);
                    arrayList.add(lazyStaggeredGridMeasuredItemRemoveFirst);
                    int i7 = (int) (jM667constructorimpl & 4294967295L);
                    for (int i8 = (int) (jM667constructorimpl >> 32); i8 < i7; i8++) {
                        iArr[i8] = lazyStaggeredGridMeasuredItemRemoveFirst.getSizeWithSpacings() + iM657maxInRangejy6DScQ;
                    }
                }
            }
        }
    }

    private static final void debugLog(Function0<String> function0) {
    }

    private static final String debugRender(ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr) {
        return "";
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            while (true) {
                if (iArr[length] < i && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i, i2);
    }

    /* JADX INFO: renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m656forEachnIS5qE8(long j, Function1<? super Integer, Unit> function1) {
        int i = (int) (j & 4294967295L);
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            function1.invoke(Integer.valueOf(i2));
        }
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int iIntValue = function1.invoke(tArr[i3]).intValue();
            if (i2 > iIntValue) {
                i = i3;
                i2 = iIntValue;
            }
        }
        return i;
    }

    public static final int indexOfMinValue(@NotNull int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 <= i6 && i6 < i3) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i);
    }

    /* JADX INFO: renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m657maxInRangejy6DScQ(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            iMax = Math.max(iMax, iArr[i2]);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0241  */
    /* JADX WARN: Code duplicated, block: B:328:0x061e  */
    /* JADX WARN: Code duplicated, block: B:330:0x062b  */
    /* JADX WARN: Code duplicated, block: B:332:0x0645  */
    /* JADX WARN: Code duplicated, block: B:368:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:371:0x070f  */
    /* JADX WARN: Code duplicated, block: B:373:0x073e  */
    /* JADX WARN: Code duplicated, block: B:374:0x0741  */
    /* JADX WARN: Code duplicated, block: B:376:0x0745  */
    /* JADX WARN: Code duplicated, block: B:377:0x0747  */
    /* JADX WARN: Code duplicated, block: B:380:0x075c  */
    /* JADX WARN: Code duplicated, block: B:381:0x075e  */
    /* JADX WARN: Code duplicated, block: B:383:0x0761  */
    /* JADX WARN: Code duplicated, block: B:385:0x076b  */
    /* JADX WARN: Code duplicated, block: B:386:0x0772  */
    /* JADX WARN: Code duplicated, block: B:389:0x0776 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:390:0x0778  */
    /* JADX WARN: Code duplicated, block: B:394:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:417:0x0251 A[EDGE_INSN: B:417:0x0251->B:122:0x0251 BREAK  A[LOOP:9: B:97:0x0212->B:395:0x07a7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x07a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x077e A[SYNTHETIC] */
    @ExperimentalFoundationApi
    private static final LazyStaggeredGridMeasureResult measure(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int[] iArr, int[] iArr2, boolean z) {
        int iIndexOf;
        boolean z2;
        int i2;
        int iIndexOfMinValue$default;
        int iMaxOrThrow;
        int i3;
        int i4;
        int[] iArr3;
        int i5;
        int i6;
        int i7;
        boolean z3;
        int i8;
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ;
        int iM657maxInRangejy6DScQ;
        boolean z4;
        int[] gaps;
        int i9;
        boolean z5;
        boolean z6;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int i10;
        boolean z7;
        boolean z8;
        boolean z9;
        List<Integer> list;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        int i14;
        String str;
        int[] iArr7;
        int[] iArr8;
        int i15;
        int i16;
        final LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
        int i17 = i;
        LazyLayoutMeasureScope measureScope = lazyStaggeredGridMeasureContext.getMeasureScope();
        int itemCount = lazyStaggeredGridMeasureContext.getItemProvider().getItemCount();
        if (itemCount <= 0 || lazyStaggeredGridMeasureContext.getLaneCount() == 0) {
            return new LazyStaggeredGridMeasureResult(iArr, iArr2, 0.0f, MeasureScope.CC.OooOOo0(measureScope, Constraints.m3735getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()), Constraints.m3734getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints()), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null), false, false, lazyStaggeredGridMeasureContext.getIsVertical(), itemCount, CollectionsKt.emptyList(), IntSizeKt.IntSize(Constraints.m3735getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()), Constraints.m3734getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints())), -lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding() + lazyStaggeredGridMeasureContext.getMainAxisAvailableSize(), lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), null);
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        String str2 = "copyOf(this, size)";
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, size)");
        int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf2, "copyOf(this, size)");
        ensureIndicesInRange(lazyStaggeredGridMeasureContext2, iArrCopyOf, itemCount);
        offsetBy(iArrCopyOf2, -i17);
        int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[laneCount];
        for (int i18 = 0; i18 < laneCount; i18++) {
            arrayDequeArr[i18] = new ArrayDeque(16);
        }
        offsetBy(iArrCopyOf2, -lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        while (true) {
            if (!measure$lambda$38$hasSpaceBeforeFirst(iArrCopyOf, iArrCopyOf2, lazyStaggeredGridMeasureContext2)) {
                iIndexOf = -1;
                break;
            }
            iIndexOf = indexOfMaxValue(iArrCopyOf);
            int i19 = iArrCopyOf[iIndexOf];
            int length = iArrCopyOf2.length;
            for (int i20 = 0; i20 < length; i20++) {
                if (iArrCopyOf[i20] != iArrCopyOf[iIndexOf]) {
                    int i21 = iArrCopyOf2[i20];
                    int i22 = iArrCopyOf2[iIndexOf];
                    if (i21 < i22) {
                        iArrCopyOf2[i20] = i22;
                    }
                }
            }
            int iFindPreviousItemIndex = findPreviousItemIndex(lazyStaggeredGridMeasureContext2, i19, iIndexOf);
            if (iFindPreviousItemIndex < 0) {
                break;
            }
            long jM654getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext2.m654getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iFindPreviousItemIndex, iIndexOf);
            int i23 = (int) (4294967295L & jM654getSpanRangelOCCd4c);
            int i24 = (int) (jM654getSpanRangelOCCd4c >> 32);
            int i25 = i23 - i24;
            lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iFindPreviousItemIndex, i25 != 1 ? -2 : i24);
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m662getAndMeasurejy6DScQ(iFindPreviousItemIndex, jM654getSpanRangelOCCd4c);
            int iM657maxInRangejy6DScQ2 = m657maxInRangejy6DScQ(iArrCopyOf2, jM654getSpanRangelOCCd4c);
            int[] gaps2 = i25 != 1 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(iFindPreviousItemIndex) : null;
            for (int i26 = i24; i26 < i23; i26++) {
                iArrCopyOf[i26] = iFindPreviousItemIndex;
                iArrCopyOf2[i26] = lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ2.getSizeWithSpacings() + iM657maxInRangejy6DScQ2 + (gaps2 == null ? 0 : gaps2[i26]);
            }
        }
        int i27 = -lazyStaggeredGridMeasureContext.getBeforeContentPadding();
        int i28 = iArrCopyOf2[0];
        if (i28 < i27) {
            i17 += i28;
            offsetBy(iArrCopyOf2, i27 - i28);
        }
        offsetBy(iArrCopyOf2, lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        int i29 = -1;
        if (iIndexOf == -1) {
            iIndexOf = ArraysKt.indexOf(iArrCopyOf, 0);
        }
        if (iIndexOf != -1 && measure$lambda$38$misalignedStart(iArrCopyOf, lazyStaggeredGridMeasureContext2, iArrCopyOf2, iIndexOf) && z) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int length2 = iArrCopyOf.length;
            int[] iArr9 = new int[length2];
            int i30 = 0;
            while (i30 < length2) {
                iArr9[i30] = i29;
                i30++;
                i29 = -1;
            }
            int length3 = iArrCopyOf2.length;
            int[] iArr10 = new int[length3];
            for (int i31 = 0; i31 < length3; i31++) {
                iArr10[i31] = iArrCopyOf2[iIndexOf];
            }
            return measure(lazyStaggeredGridMeasureContext2, i17, iArr9, iArr10, false);
        }
        int[] iArrCopyOf3 = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf3, "copyOf(this, size)");
        int length4 = iArrCopyOf2.length;
        int[] iArr11 = new int[length4];
        for (int i32 = 0; i32 < length4; i32++) {
            iArr11[i32] = -iArrCopyOf2[i32];
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(lazyStaggeredGridMeasureContext.getAfterContentPadding() + lazyStaggeredGridMeasureContext.getMainAxisAvailableSize(), 0);
        int iIndexOfMinValue$default2 = indexOfMinValue$default(iArrCopyOf3, 0, 1, null);
        int laneCount2 = 0;
        while (iIndexOfMinValue$default2 != -1 && laneCount2 < lazyStaggeredGridMeasureContext.getLaneCount()) {
            int i33 = iArrCopyOf3[iIndexOfMinValue$default2];
            int iIndexOfMinValue = indexOfMinValue(iArrCopyOf3, i33);
            int i34 = laneCount2 + 1;
            if (i33 >= 0) {
                str = str2;
                long jM654getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext2.m654getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), i33, iIndexOfMinValue$default2);
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ3 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m662getAndMeasurejy6DScQ(i33, jM654getSpanRangelOCCd4c2);
                i14 = i17;
                iArr7 = iArrCopyOf;
                iArr8 = iArrCopyOf2;
                int i35 = (int) (jM654getSpanRangelOCCd4c2 & 4294967295L);
                i15 = i27;
                i16 = itemCount;
                int i36 = (int) (jM654getSpanRangelOCCd4c2 >> 32);
                int i37 = i35 - i36;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(i33, i37 != 1 ? -2 : i36);
                int sizeWithSpacings = lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ3.getSizeWithSpacings() + m657maxInRangejy6DScQ(iArr11, jM654getSpanRangelOCCd4c2);
                for (int i38 = i36; i38 < i35; i38++) {
                    iArr11[i38] = sizeWithSpacings;
                    iArrCopyOf3[i38] = i33;
                    arrayDequeArr[i38].addLast(lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ3);
                }
                if (iArr11[i36] <= lazyStaggeredGridMeasureContext.getMainAxisSpacing() + i15) {
                    lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ3.setVisible(false);
                }
                if (i37 != 1) {
                    laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
                }
                i27 = i15;
                iIndexOfMinValue$default2 = iIndexOfMinValue;
                str2 = str;
                i17 = i14;
                iArrCopyOf = iArr7;
                iArrCopyOf2 = iArr8;
                itemCount = i16;
            } else {
                i14 = i17;
                str = str2;
                iArr7 = iArrCopyOf;
                iArr8 = iArrCopyOf2;
                i15 = i27;
                i16 = itemCount;
            }
            laneCount2 = i34;
            i27 = i15;
            iIndexOfMinValue$default2 = iIndexOfMinValue;
            str2 = str;
            i17 = i14;
            iArrCopyOf = iArr7;
            iArrCopyOf2 = iArr8;
            itemCount = i16;
        }
        int i39 = i17;
        String str3 = str2;
        int[] iArr12 = iArrCopyOf;
        int[] iArr13 = iArrCopyOf2;
        int i40 = i27;
        int i41 = itemCount;
        while (true) {
            int i42 = 0;
            while (true) {
                if (i42 >= length4) {
                    z2 = false;
                    break;
                }
                int i43 = iArr11[i42];
                if (i43 < iCoerceAtLeast || i43 <= 0) {
                    z2 = true;
                    break;
                }
                i42++;
            }
            if (!z2) {
                int i44 = 0;
                while (true) {
                    if (i44 >= laneCount) {
                        z13 = true;
                        break;
                    }
                    if (!arrayDequeArr[i44].isEmpty()) {
                        z13 = false;
                        break;
                    }
                    i44++;
                }
                if (!z13) {
                    i3 = i41;
                    i2 = 1;
                    break;
                }
                i2 = 1;
                iIndexOfMinValue$default = indexOfMinValue$default(iArr11, 0, 1, null);
                iMaxOrThrow = ArraysKt.maxOrThrow(iArrCopyOf3) + 1;
                i3 = i41;
                if (iMaxOrThrow >= i3) {
                    break;
                }
                i4 = i40;
                int i45 = length4;
                iArr3 = iArr11;
                int i46 = iCoerceAtLeast;
                String str4 = str3;
                int i47 = i39;
                int[] iArr14 = iArr12;
                int[] iArr15 = iArr13;
                int i48 = laneCount;
                long jM654getSpanRangelOCCd4c3 = lazyStaggeredGridMeasureContext2.m654getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iMaxOrThrow, iIndexOfMinValue$default);
                LazyStaggeredGridLaneInfo laneInfo = lazyStaggeredGridMeasureContext.getLaneInfo();
                i5 = (int) (jM654getSpanRangelOCCd4c3 & 4294967295L);
                i6 = (int) (jM654getSpanRangelOCCd4c3 >> 32);
                i7 = i5 - i6;
                if (i7 != 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    i8 = -2;
                } else {
                    i8 = i6;
                }
                laneInfo.setLane(iMaxOrThrow, i8);
                lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m662getAndMeasurejy6DScQ(iMaxOrThrow, jM654getSpanRangelOCCd4c3);
                iM657maxInRangejy6DScQ = m657maxInRangejy6DScQ(iArr3, jM654getSpanRangelOCCd4c3);
                if (i7 != 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    gaps = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(iMaxOrThrow);
                    if (gaps == null) {
                        gaps = new int[lazyStaggeredGridMeasureContext.getLaneCount()];
                    }
                } else {
                    gaps = null;
                }
                for (i9 = i6; i9 < i5; i9++) {
                    if (gaps != null) {
                        gaps[i9] = iM657maxInRangejy6DScQ - iArr3[i9];
                    }
                    iArrCopyOf3[i9] = iMaxOrThrow;
                    iArr3[i9] = lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ.getSizeWithSpacings() + iM657maxInRangejy6DScQ;
                    arrayDequeArr[i9].addLast(lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ);
                }
                lazyStaggeredGridMeasureContext.getLaneInfo().setGaps(iMaxOrThrow, gaps);
                if (iArr3[i6] <= lazyStaggeredGridMeasureContext.getMainAxisSpacing() + i4) {
                    lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ.setVisible(false);
                }
                lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                iCoerceAtLeast = i46;
                iArr11 = iArr3;
                i39 = i47;
                i41 = i3;
                i40 = i4;
                laneCount = i48;
                iArr13 = iArr15;
                iArr12 = iArr14;
                length4 = i45;
                str3 = str4;
            } else {
                i2 = 1;
                iIndexOfMinValue$default = indexOfMinValue$default(iArr11, 0, 1, null);
                iMaxOrThrow = ArraysKt.maxOrThrow(iArrCopyOf3) + 1;
                i3 = i41;
                if (iMaxOrThrow >= i3) {
                    break;
                    break;
                }
                i4 = i40;
                int i49 = length4;
                iArr3 = iArr11;
                int i410 = iCoerceAtLeast;
                String str5 = str3;
                int i411 = i39;
                int[] iArr16 = iArr12;
                int[] iArr17 = iArr13;
                int i412 = laneCount;
                long jM654getSpanRangelOCCd4c4 = lazyStaggeredGridMeasureContext2.m654getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iMaxOrThrow, iIndexOfMinValue$default);
                LazyStaggeredGridLaneInfo laneInfo2 = lazyStaggeredGridMeasureContext.getLaneInfo();
                i5 = (int) (jM654getSpanRangelOCCd4c4 & 4294967295L);
                i6 = (int) (jM654getSpanRangelOCCd4c4 >> 32);
                i7 = i5 - i6;
                if (i7 != 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    i8 = -2;
                } else {
                    i8 = i6;
                }
                laneInfo2.setLane(iMaxOrThrow, i8);
                lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m662getAndMeasurejy6DScQ(iMaxOrThrow, jM654getSpanRangelOCCd4c4);
                iM657maxInRangejy6DScQ = m657maxInRangejy6DScQ(iArr3, jM654getSpanRangelOCCd4c4);
                if (i7 != 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    gaps = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(iMaxOrThrow);
                    if (gaps == null) {
                        gaps = new int[lazyStaggeredGridMeasureContext.getLaneCount()];
                    }
                } else {
                    gaps = null;
                }
                while (i9 < i5) {
                    if (gaps != null) {
                        gaps[i9] = iM657maxInRangejy6DScQ - iArr3[i9];
                    }
                    iArrCopyOf3[i9] = iMaxOrThrow;
                    iArr3[i9] = lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ.getSizeWithSpacings() + iM657maxInRangejy6DScQ;
                    arrayDequeArr[i9].addLast(lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ);
                }
                lazyStaggeredGridMeasureContext.getLaneInfo().setGaps(iMaxOrThrow, gaps);
                if (iArr3[i6] <= lazyStaggeredGridMeasureContext.getMainAxisSpacing() + i4) {
                    lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ.setVisible(false);
                }
                lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                iCoerceAtLeast = i410;
                iArr11 = iArr3;
                i39 = i411;
                i41 = i3;
                i40 = i4;
                laneCount = i412;
                iArr13 = iArr17;
                iArr12 = iArr16;
                length4 = i49;
                str3 = str5;
            }
        }
        int i50 = 0;
        while (i50 < laneCount) {
            ArrayDeque arrayDeque = arrayDequeArr[i50];
            while (arrayDeque.size() > i2 && !((LazyStaggeredGridMeasuredItem) arrayDeque.first()).getIsVisible()) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) arrayDeque.removeFirst();
                int[] gaps3 = lazyStaggeredGridMeasuredItem.getSpan() != i2 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem.getIndex()) : null;
                iArr13[i50] = iArr13[i50] - (lazyStaggeredGridMeasuredItem.getSizeWithSpacings() + (gaps3 == null ? 0 : gaps3[i50]));
                i2 = 1;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) arrayDeque.firstOrNull();
            iArr12[i50] = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : -1;
            i50++;
            i2 = 1;
        }
        int length5 = iArrCopyOf3.length;
        int i51 = 0;
        while (true) {
            if (i51 >= length5) {
                z5 = false;
                break;
            }
            if (iArrCopyOf3[i51] == i3 + (-1)) {
                z5 = true;
                break;
            }
            i51++;
        }
        if (z5) {
            offsetBy(iArr11, -lazyStaggeredGridMeasureContext.getMainAxisSpacing());
        }
        int i52 = 0;
        while (true) {
            if (i52 >= length4) {
                z6 = true;
                break;
            }
            if (!(iArr11[i52] < lazyStaggeredGridMeasureContext.getMainAxisAvailableSize())) {
                z6 = false;
                break;
            }
            i52++;
        }
        if (z6) {
            int mainAxisAvailableSize = lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() - iArr11[indexOfMaxValue(iArr11)];
            iArr6 = iArr13;
            offsetBy(iArr6, -mainAxisAvailableSize);
            offsetBy(iArr11, mainAxisAvailableSize);
            boolean z14 = false;
            while (true) {
                int length6 = iArr6.length;
                int i53 = 0;
                while (true) {
                    if (i53 >= length6) {
                        z12 = false;
                        break;
                    }
                    if (iArr6[i53] < lazyStaggeredGridMeasureContext.getBeforeContentPadding()) {
                        z12 = true;
                        break;
                    }
                    i53++;
                }
                if (!z12) {
                    iArr5 = iArr12;
                    break;
                }
                int iIndexOfMinValue$default3 = indexOfMinValue$default(iArr6, 0, 1, null);
                if (iIndexOfMinValue$default3 != indexOfMaxValue(iArr12)) {
                    z14 = true;
                }
                int i54 = iArr12[iIndexOfMinValue$default3];
                if (i54 == -1) {
                    i54 = i3;
                }
                int iFindPreviousItemIndex2 = findPreviousItemIndex(lazyStaggeredGridMeasureContext2, i54, iIndexOfMinValue$default3);
                if (iFindPreviousItemIndex2 < 0) {
                    iArr5 = iArr12;
                    if ((!z14 && !measure$lambda$38$misalignedStart(iArr5, lazyStaggeredGridMeasureContext2, iArr6, iIndexOfMinValue$default3)) || !z) {
                        break;
                    }
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    int length7 = iArr5.length;
                    int[] iArr18 = new int[length7];
                    for (int i55 = 0; i55 < length7; i55++) {
                        iArr18[i55] = -1;
                    }
                    int length8 = iArr6.length;
                    int[] iArr19 = new int[length8];
                    for (int i56 = 0; i56 < length8; i56++) {
                        iArr19[i56] = iArr6[iIndexOfMinValue$default3];
                    }
                    return measure(lazyStaggeredGridMeasureContext2, i39, iArr18, iArr19, false);
                }
                int i57 = i39;
                int[] iArr20 = iArr12;
                int i58 = iCoerceAtLeast;
                long jM654getSpanRangelOCCd4c5 = lazyStaggeredGridMeasureContext2.m654getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iFindPreviousItemIndex2, iIndexOfMinValue$default3);
                int i59 = length4;
                int[] iArr21 = iArr11;
                int i60 = (int) (jM654getSpanRangelOCCd4c5 & 4294967295L);
                boolean z15 = z14;
                int i61 = mainAxisAvailableSize;
                int i62 = (int) (jM654getSpanRangelOCCd4c5 >> 32);
                int i63 = i60 - i62;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iFindPreviousItemIndex2, i63 != 1 ? -2 : i62);
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ4 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m662getAndMeasurejy6DScQ(iFindPreviousItemIndex2, jM654getSpanRangelOCCd4c5);
                int iM657maxInRangejy6DScQ3 = m657maxInRangejy6DScQ(iArr6, jM654getSpanRangelOCCd4c5);
                int[] gaps4 = i63 != 1 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(iFindPreviousItemIndex2) : null;
                while (i62 < i60) {
                    if (iArr6[i62] != iM657maxInRangejy6DScQ3) {
                        z15 = true;
                    }
                    arrayDequeArr[i62].addFirst(lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ4);
                    iArr20[i62] = iFindPreviousItemIndex2;
                    iArr6[i62] = lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ4.getSizeWithSpacings() + iM657maxInRangejy6DScQ3 + (gaps4 == null ? 0 : gaps4[i62]);
                    i62++;
                }
                iCoerceAtLeast = i58;
                length4 = i59;
                iArr11 = iArr21;
                mainAxisAvailableSize = i61;
                z14 = z15;
                iArr12 = iArr20;
                i39 = i57;
            }
            if (z14 && z) {
                lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                return measure(lazyStaggeredGridMeasureContext2, i39, iArr5, iArr6, false);
            }
            int i64 = i39 + mainAxisAvailableSize;
            int i65 = iArr6[indexOfMinValue$default(iArr6, 0, 1, null)];
            if (i65 < 0) {
                i64 += i65;
                iArr4 = iArr11;
                offsetBy(iArr4, i65);
                offsetBy(iArr6, -i65);
            } else {
                iArr4 = iArr11;
            }
            i10 = i64;
        } else {
            length4 = length4;
            iArr4 = iArr11;
            iCoerceAtLeast = iCoerceAtLeast;
            iArr5 = iArr12;
            iArr6 = iArr13;
            i10 = i39;
        }
        float scrollToBeConsumed = (MathKt.getSign(MathKt.roundToInt(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) != MathKt.getSign(i10) || Math.abs(MathKt.roundToInt(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) < Math.abs(i10)) ? lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed() : i10;
        int[] iArrCopyOf4 = Arrays.copyOf(iArr6, iArr6.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf4, str3);
        int length9 = iArrCopyOf4.length;
        for (int i66 = 0; i66 < length9; i66++) {
            iArrCopyOf4[i66] = -iArrCopyOf4[i66];
        }
        if (lazyStaggeredGridMeasureContext.getBeforeContentPadding() > lazyStaggeredGridMeasureContext.getMainAxisSpacing()) {
            int i67 = 0;
            while (i67 < laneCount) {
                ArrayDeque arrayDeque2 = arrayDequeArr[i67];
                int size = arrayDeque2.size();
                int i68 = 0;
                while (true) {
                    if (i68 >= size) {
                        i12 = laneCount;
                        break;
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (LazyStaggeredGridMeasuredItem) arrayDeque2.get(i68);
                    i12 = laneCount;
                    int[] gaps5 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem3.getIndex());
                    int sizeWithSpacings2 = lazyStaggeredGridMeasuredItem3.getSizeWithSpacings() + (gaps5 == null ? 0 : gaps5[i67]);
                    if (i68 == CollectionsKt.getLastIndex(arrayDeque2) || (i13 = iArr6[i67]) == 0 || i13 < sizeWithSpacings2) {
                        break;
                    }
                    iArr6[i67] = i13 - sizeWithSpacings2;
                    i68++;
                    iArr5[i67] = ((LazyStaggeredGridMeasuredItem) arrayDeque2.get(i68)).getIndex();
                    laneCount = i12;
                }
                i67++;
                laneCount = i12;
            }
        }
        int afterContentPadding = lazyStaggeredGridMeasureContext.getAfterContentPadding() + lazyStaggeredGridMeasureContext.getBeforeContentPadding();
        int iM3733getMaxWidthimpl = lazyStaggeredGridMeasureContext.getIsVertical() ? Constraints.m3733getMaxWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()) : ConstraintsKt.m3747constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), ArraysKt.maxOrThrow(iArr4) + afterContentPadding);
        int iM3746constrainHeightK40F9xA = lazyStaggeredGridMeasureContext.getIsVertical() ? ConstraintsKt.m3746constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), ArraysKt.maxOrThrow(iArr4) + afterContentPadding) : Constraints.m3732getMaxHeightimpl(lazyStaggeredGridMeasureContext.getConstraints());
        int afterContentPadding2 = lazyStaggeredGridMeasureContext.getAfterContentPadding() + (Math.min(lazyStaggeredGridMeasureContext.getIsVertical() ? iM3746constrainHeightK40F9xA : iM3733getMaxWidthimpl, lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        int sizeWithSpacings3 = iArrCopyOf4[0];
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size2 = pinnedItems.size();
        int[] iArr22 = iArr4;
        int i69 = 0;
        List listEmptyList = null;
        while (i69 < size2) {
            List<Integer> list2 = pinnedItems;
            int iIntValue = pinnedItems.get(i69).intValue();
            int i70 = size2;
            int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(iIntValue);
            int[] iArr23 = iArr6;
            if (lane == -2 || lane == -1) {
                int length10 = iArr5.length;
                int i71 = 0;
                while (true) {
                    if (i71 < length10) {
                        int i72 = length10;
                        if (iArr5[i71] > iIntValue) {
                            i71++;
                            length10 = i72;
                        }
                    }
                }
            } else {
                z11 = iArr5[lane] > iIntValue;
            }
            if (z11) {
                long jM654getSpanRangelOCCd4c6 = lazyStaggeredGridMeasureContext2.m654getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue, 0);
                if (listEmptyList == null) {
                    listEmptyList = new ArrayList();
                }
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ5 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m662getAndMeasurejy6DScQ(iIntValue, jM654getSpanRangelOCCd4c6);
                sizeWithSpacings3 -= lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ5.getSizeWithSpacings();
                lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ5.position(sizeWithSpacings3, 0, afterContentPadding2);
                listEmptyList.add(lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ5);
            }
            i69++;
            pinnedItems = list2;
            size2 = i70;
            iArr6 = iArr23;
            iArr5 = iArr5;
        }
        int[] iArr24 = iArr6;
        int[] iArr25 = iArr5;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<LazyStaggeredGridMeasuredItem> listCalculateVisibleItems = calculateVisibleItems(lazyStaggeredGridMeasureContext2, arrayDequeArr, iArrCopyOf4, afterContentPadding2);
        int i73 = iArrCopyOf4[0];
        List<Integer> pinnedItems2 = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size3 = pinnedItems2.size();
        List listEmptyList2 = null;
        int i74 = 0;
        while (i74 < size3) {
            int iIntValue2 = pinnedItems2.get(i74).intValue();
            if (iIntValue2 >= i3) {
                list = pinnedItems2;
            } else {
                int lane2 = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(iIntValue2);
                list = pinnedItems2;
                if (lane2 == -2 || lane2 == -1) {
                    int length11 = iArrCopyOf3.length;
                    int i75 = 0;
                    while (true) {
                        if (i75 < length11) {
                            i11 = size3;
                            if (iArrCopyOf3[i75] < iIntValue2) {
                                i75++;
                                size3 = i11;
                            } else {
                                z10 = false;
                                if (z10) {
                                    long jM654getSpanRangelOCCd4c7 = lazyStaggeredGridMeasureContext2.m654getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue2, 0);
                                    if (listEmptyList2 == null) {
                                        listEmptyList2 = new ArrayList();
                                    }
                                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ6 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m662getAndMeasurejy6DScQ(iIntValue2, jM654getSpanRangelOCCd4c7);
                                    lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ6.position(i73, 0, afterContentPadding2);
                                    int sizeWithSpacings4 = lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ6.getSizeWithSpacings() + i73;
                                    listEmptyList2.add(lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ6);
                                    i73 = sizeWithSpacings4;
                                }
                                i74++;
                                pinnedItems2 = list;
                                size3 = i11;
                                iArrCopyOf3 = iArrCopyOf3;
                            }
                        }
                    }
                } else {
                    if (iArrCopyOf3[lane2] < iIntValue2) {
                    }
                    if (z10) {
                        long jM654getSpanRangelOCCd4c8 = lazyStaggeredGridMeasureContext2.m654getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue2, 0);
                        if (listEmptyList2 == null) {
                            listEmptyList2 = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ7 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m662getAndMeasurejy6DScQ(iIntValue2, jM654getSpanRangelOCCd4c8);
                        lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ7.position(i73, 0, afterContentPadding2);
                        int sizeWithSpacings5 = lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ7.getSizeWithSpacings() + i73;
                        listEmptyList2.add(lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ7);
                        i73 = sizeWithSpacings5;
                    }
                    i74++;
                    pinnedItems2 = list;
                    size3 = i11;
                    iArrCopyOf3 = iArrCopyOf3;
                }
                i11 = size3;
                z10 = true;
                if (z10) {
                    long jM654getSpanRangelOCCd4c9 = lazyStaggeredGridMeasureContext2.m654getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue2, 0);
                    if (listEmptyList2 == null) {
                        listEmptyList2 = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ8 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m662getAndMeasurejy6DScQ(iIntValue2, jM654getSpanRangelOCCd4c9);
                    lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ8.position(i73, 0, afterContentPadding2);
                    int sizeWithSpacings6 = lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ8.getSizeWithSpacings() + i73;
                    listEmptyList2.add(lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ8);
                    i73 = sizeWithSpacings6;
                }
                i74++;
                pinnedItems2 = list;
                size3 = i11;
                iArrCopyOf3 = iArrCopyOf3;
            }
            i11 = size3;
            z10 = false;
            if (z10) {
                long jM654getSpanRangelOCCd4c10 = lazyStaggeredGridMeasureContext2.m654getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue2, 0);
                if (listEmptyList2 == null) {
                    listEmptyList2 = new ArrayList();
                }
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ9 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m662getAndMeasurejy6DScQ(iIntValue2, jM654getSpanRangelOCCd4c10);
                lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ9.position(i73, 0, afterContentPadding2);
                int sizeWithSpacings7 = lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ9.getSizeWithSpacings() + i73;
                listEmptyList2.add(lazyStaggeredGridMeasuredItemM662getAndMeasurejy6DScQ9);
                i73 = sizeWithSpacings7;
            }
            i74++;
            pinnedItems2 = list;
            size3 = i11;
            iArrCopyOf3 = iArrCopyOf3;
        }
        int[] iArr26 = iArrCopyOf3;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(listEmptyList);
        arrayList.addAll(listCalculateVisibleItems);
        arrayList.addAll(listEmptyList2);
        lazyStaggeredGridMeasureContext.getState().getPlacementAnimator().onMeasured((int) scrollToBeConsumed, iM3733getMaxWidthimpl, iM3746constrainHeightK40F9xA, arrayList, lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), lazyStaggeredGridMeasureContext.getLaneCount());
        boolean z16 = iArr25[0] != 0 || iArr24[0] > 0;
        int i76 = length4;
        int i77 = 0;
        while (true) {
            if (i77 >= i76) {
                z7 = false;
                break;
            }
            if (iArr22[i77] > lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                z7 = true;
                break;
            }
            i77++;
        }
        if (z7) {
            z8 = true;
        } else {
            int length12 = iArr26.length;
            int i78 = 0;
            while (true) {
                if (i78 >= length12) {
                    z9 = true;
                    break;
                }
                if (!(iArr26[i78] < i3 + (-1))) {
                    z9 = false;
                    break;
                }
                i78++;
            }
            if (z9) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return new LazyStaggeredGridMeasureResult(iArr25, iArr24, scrollToBeConsumed, MeasureScope.CC.OooOOo0(measureScope, iM3733getMaxWidthimpl, iM3746constrainHeightK40F9xA, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$29
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                List<LazyStaggeredGridMeasuredItem> list3 = arrayList;
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext2;
                int size4 = list3.size();
                for (int i79 = 0; i79 < size4; i79++) {
                    list3.get(i79).place(layout, lazyStaggeredGridMeasureContext3);
                }
            }
        }, 4, null), z8, z16, lazyStaggeredGridMeasureContext.getIsVertical(), i3, listCalculateVisibleItems, IntSizeKt.IntSize(iM3733getMaxWidthimpl, iM3746constrainHeightK40F9xA), i40, iCoerceAtLeast, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), null);
    }

    private static final boolean measure$lambda$38$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$38$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalFoundationApi
    @NotNull
    /* JADX INFO: renamed from: measureStaggeredGrid-dSVRQoE, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m658measureStaggeredGriddSVRQoE(@NotNull LazyLayoutMeasureScope measureStaggeredGrid, @NotNull LazyStaggeredGridState state, @NotNull List<Integer> pinnedItems, @NotNull LazyStaggeredGridItemProvider itemProvider, @NotNull LazyStaggeredGridSlots resolvedSlots, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4) {
        T t;
        int iM657maxInRangejy6DScQ;
        T t2;
        int i5;
        Intrinsics.checkNotNullParameter(measureStaggeredGrid, "$this$measureStaggeredGrid");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(resolvedSlots, "resolvedSlots");
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(state, pinnedItems, itemProvider, resolvedSlots, j, z, measureStaggeredGrid, i, j2, i3, i4, z2, i2, null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                int[] iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = state.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(itemProvider, state.getScrollPosition().getIndices());
                int[] offsets = state.getScrollPosition().getOffsets();
                if (iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length == lazyStaggeredGridMeasureContext.getLaneCount()) {
                    t = iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release;
                } else {
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
                    int[] iArr = new int[laneCount];
                    int i6 = 0;
                    while (i6 < laneCount) {
                        if (i6 >= iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (iM657maxInRangejy6DScQ = iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release[i6]) == -1) {
                            iM657maxInRangejy6DScQ = i6 == 0 ? 0 : m657maxInRangejy6DScQ(iArr, SpanRange.m667constructorimpl(0, i6)) + 1;
                        }
                        iArr[i6] = iM657maxInRangejy6DScQ;
                        lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i6], i6);
                        i6++;
                    }
                    t = iArr;
                }
                objectRef.element = t;
                if (offsets.length == lazyStaggeredGridMeasureContext.getLaneCount()) {
                    t2 = offsets;
                } else {
                    int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
                    int[] iArr2 = new int[laneCount2];
                    int i7 = 0;
                    while (i7 < laneCount2) {
                        if (i7 < offsets.length) {
                            i5 = offsets[i7];
                        } else {
                            i5 = i7 == 0 ? 0 : iArr2[i7 - 1];
                        }
                        iArr2[i7] = i5;
                        i7++;
                    }
                    t2 = iArr2;
                }
                objectRef2.element = t2;
                Unit unit = Unit.INSTANCE;
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                snapshotCreateNonObservableSnapshot.dispose();
                return measure(lazyStaggeredGridMeasureContext, MathKt.roundToInt(state.getScrollToBeConsumed()), (int[]) objectRef.element, (int[]) objectRef2.element, true);
            } catch (Throwable th) {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                throw th;
            }
        } catch (Throwable th2) {
            snapshotCreateNonObservableSnapshot.dispose();
            throw th2;
        }
    }

    private static final void offsetBy(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    private static final int[] transform(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = function1.invoke(Integer.valueOf(iArr[i])).intValue();
        }
        return iArr;
    }

    @ExperimentalFoundationApi
    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1<? super LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }
}
