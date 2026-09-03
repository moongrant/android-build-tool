package p536o0o0Oo0o;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.OooOo00;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.OverscrollConfigurationKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000;
import com.code.android.util.o000000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000Ooo;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.model.Vip;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.WealthLevel;
import com.yalla.yalla.ui.screen.user.MyUserInfoScreen;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import com.yalla.yalla.ui.vm.user.MyUserInfoVM;
import io.agora.rtc.Constants;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O000;
import p022Oooo00O.o00O00OO;
import p147o00Oo0Oo.o000OOo;
import p402o0Oo0OOO.o00O000o;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00000OO;
import p426o0OoOO.o000oOoO;
import p445o0OoOoo.o0oOO;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.j0;
import p507o0o00ooo.t1;
import p517o0o0O0o.OooOOOO;
import p536o0o0Oo0o.oO0;
import p536o0o0Oo0o.oO000O0;
import p536o0o0Oo0o.oO00o0;
import p536o0o0Oo0o.oO00o00O;
import p536o0o0Oo0o.oO0O000;
import p536o0o0Oo0o.oO0O000o;
import p536o0o0Oo0o.oO0OO00o;
import p536o0o0Oo0o.oO0OOO00;
import p536o0o0Oo0o.oOo0000O;
import p536o0o0Oo0o.oOo000o0;
import p536o0o0Oo0o.oOo00o0o;
import p536o0o0Oo0o.oOo00ooO;
import p539o0o0OoOO.b0;
import p539o0o0OoOO.b1;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p642o0ooOOo.o0OO;
import p642o0ooOOo.o0OO0O0;
import p642o0ooOOo.oO00000;
import p642o0ooOOo.oO0000Oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMyUserInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/MyUserInfoScreenKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1071:1\n66#2,6:1072\n72#2:1106\n65#2,7:1160\n72#2:1195\n76#2:1201\n76#2:1232\n65#2,7:1682\n72#2:1717\n76#2:1725\n66#2,6:1801\n72#2:1835\n76#2:1840\n78#3,11:1078\n78#3,11:1113\n78#3,11:1167\n91#3:1200\n91#3:1205\n91#3:1231\n78#3,11:1241\n91#3:1274\n78#3,11:1284\n91#3:1318\n78#3,11:1329\n91#3:1363\n78#3,11:1373\n91#3:1410\n78#3,11:1428\n91#3:1468\n78#3,11:1479\n91#3:1511\n78#3,11:1515\n91#3:1550\n78#3,11:1559\n91#3:1605\n78#3,11:1609\n91#3:1644\n78#3,11:1652\n78#3,11:1689\n91#3:1724\n78#3,11:1733\n78#3,11:1769\n78#3,11:1807\n91#3:1839\n91#3:1844\n78#3,11:1854\n91#3:1891\n91#3:1896\n91#3:1904\n456#4,8:1089\n464#4,3:1103\n456#4,8:1124\n464#4,3:1138\n36#4:1153\n456#4,8:1178\n464#4,3:1192\n467#4,3:1197\n467#4,3:1202\n25#4:1207\n36#4:1214\n36#4:1221\n467#4,3:1228\n456#4,8:1252\n464#4,3:1266\n467#4,3:1271\n456#4,8:1295\n464#4,3:1309\n467#4,3:1315\n456#4,8:1340\n464#4,3:1354\n467#4,3:1360\n456#4,8:1384\n464#4,3:1398\n467#4,3:1407\n36#4:1414\n456#4,8:1439\n464#4,3:1453\n467#4,3:1465\n456#4,8:1490\n464#4,3:1504\n467#4,3:1508\n456#4,8:1526\n464#4,3:1540\n467#4,3:1547\n456#4,8:1570\n464#4,3:1584\n36#4:1588\n36#4:1595\n467#4,3:1602\n456#4,8:1620\n464#4,3:1634\n467#4,3:1641\n456#4,8:1663\n464#4,3:1677\n456#4,8:1700\n464#4,3:1714\n467#4,3:1721\n456#4,8:1744\n464#4,3:1758\n456#4,8:1780\n464#4,3:1794\n456#4,8:1818\n464#4,3:1832\n467#4,3:1836\n467#4,3:1841\n456#4,8:1865\n464#4,3:1879\n467#4,3:1888\n467#4,3:1893\n467#4,3:1901\n25#4:1910\n25#4:1941\n4144#5,6:1097\n4144#5,6:1132\n4144#5,6:1186\n4144#5,6:1260\n4144#5,6:1303\n4144#5,6:1348\n4144#5,6:1392\n4144#5,6:1447\n4144#5,6:1498\n4144#5,6:1534\n4144#5,6:1578\n4144#5,6:1628\n4144#5,6:1671\n4144#5,6:1708\n4144#5,6:1752\n4144#5,6:1788\n4144#5,6:1826\n4144#5,6:1873\n72#6,6:1107\n78#6:1141\n82#6:1206\n72#6,6:1235\n78#6:1269\n82#6:1275\n72#6,6:1278\n78#6:1312\n82#6:1319\n72#6,6:1323\n78#6:1357\n82#6:1364\n76#6,2:1513\n78#6:1543\n82#6:1551\n76#6,2:1607\n78#6:1637\n82#6:1645\n72#6,6:1727\n78#6:1761\n82#6:1897\n81#7,11:1142\n1097#8,6:1154\n1097#8,6:1208\n1097#8,6:1215\n1097#8,6:1222\n1097#8,6:1415\n1097#8,6:1589\n1097#8,6:1596\n955#8,6:1911\n955#8,6:1942\n76#9:1196\n76#9:1320\n76#9:1365\n76#9:1886\n154#10:1233\n154#10:1234\n154#10:1270\n154#10:1276\n154#10:1277\n154#10:1313\n154#10:1314\n154#10:1321\n154#10:1322\n154#10:1358\n154#10:1359\n154#10:1366\n154#10:1402\n154#10:1403\n154#10:1404\n154#10:1405\n154#10:1406\n154#10:1412\n154#10:1413\n154#10:1421\n154#10:1457\n154#10:1458\n154#10:1459\n154#10:1460\n164#10:1461\n154#10:1462\n154#10:1463\n154#10:1464\n154#10:1470\n154#10:1471\n154#10:1472\n154#10:1544\n154#10:1545\n154#10:1546\n154#10:1552\n154#10:1638\n154#10:1639\n154#10:1640\n154#10:1681\n154#10:1718\n154#10:1719\n154#10:1720\n154#10:1726\n154#10:1798\n154#10:1799\n154#10:1800\n154#10:1846\n154#10:1883\n154#10:1884\n154#10:1885\n154#10:1887\n154#10:1898\n154#10:1899\n154#10:1900\n73#11,6:1367\n79#11:1401\n83#11:1411\n73#11,6:1422\n79#11:1456\n83#11:1469\n73#11,6:1473\n79#11:1507\n83#11:1512\n73#11,6:1553\n79#11:1587\n83#11:1606\n73#11,6:1646\n79#11:1680\n72#11,7:1762\n79#11:1797\n83#11:1845\n72#11,7:1847\n79#11:1882\n83#11:1892\n83#11:1905\n73#12,4:1906\n77#12,20:1917\n73#12,4:1937\n77#12,20:1948\n81#13:1968\n107#13,2:1969\n81#13:1971\n81#13:1972\n81#13:1973\n81#13:1974\n81#13:1975\n81#13:1976\n81#13:1977\n81#13:1978\n81#13:1979\n81#13:1980\n81#13:1981\n81#13:1982\n81#13:1983\n81#13:1984\n81#13:1985\n81#13:1986\n81#13:1987\n81#13:1988\n81#13:1989\n81#13:1990\n*S KotlinDebug\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/MyUserInfoScreenKt\n*L\n122#1:1072,6\n122#1:1106\n128#1:1160,7\n128#1:1195\n128#1:1201\n122#1:1232\n710#1:1682,7\n710#1:1717\n710#1:1725\n735#1:1801,6\n735#1:1835\n735#1:1840\n122#1:1078,11\n123#1:1113,11\n128#1:1167,11\n128#1:1200\n123#1:1205\n122#1:1231\n190#1:1241,11\n190#1:1274\n269#1:1284,11\n269#1:1318\n330#1:1329,11\n330#1:1363\n420#1:1373,11\n420#1:1410\n495#1:1428,11\n495#1:1468\n550#1:1479,11\n550#1:1511\n609#1:1515,11\n609#1:1550\n636#1:1559,11\n636#1:1605\n665#1:1609,11\n665#1:1644\n693#1:1652,11\n710#1:1689,11\n710#1:1724\n724#1:1733,11\n725#1:1769,11\n735#1:1807,11\n735#1:1839\n725#1:1844\n753#1:1854,11\n753#1:1891\n724#1:1896\n693#1:1904\n122#1:1089,8\n122#1:1103,3\n123#1:1124,8\n123#1:1138,3\n125#1:1153\n128#1:1178,8\n128#1:1192,3\n128#1:1197,3\n123#1:1202,3\n172#1:1207\n173#1:1214\n180#1:1221\n122#1:1228,3\n190#1:1252,8\n190#1:1266,3\n190#1:1271,3\n269#1:1295,8\n269#1:1309,3\n269#1:1315,3\n330#1:1340,8\n330#1:1354,3\n330#1:1360,3\n420#1:1384,8\n420#1:1398,3\n420#1:1407,3\n502#1:1414\n495#1:1439,8\n495#1:1453,3\n495#1:1465,3\n550#1:1490,8\n550#1:1504,3\n550#1:1508,3\n609#1:1526,8\n609#1:1540,3\n609#1:1547,3\n636#1:1570,8\n636#1:1584,3\n647#1:1588\n652#1:1595\n636#1:1602,3\n665#1:1620,8\n665#1:1634,3\n665#1:1641,3\n693#1:1663,8\n693#1:1677,3\n710#1:1700,8\n710#1:1714,3\n710#1:1721,3\n724#1:1744,8\n724#1:1758,3\n725#1:1780,8\n725#1:1794,3\n735#1:1818,8\n735#1:1832,3\n735#1:1836,3\n725#1:1841,3\n753#1:1865,8\n753#1:1879,3\n753#1:1888,3\n724#1:1893,3\n693#1:1901,3\n818#1:1910\n936#1:1941\n122#1:1097,6\n123#1:1132,6\n128#1:1186,6\n190#1:1260,6\n269#1:1303,6\n330#1:1348,6\n420#1:1392,6\n495#1:1447,6\n550#1:1498,6\n609#1:1534,6\n636#1:1578,6\n665#1:1628,6\n693#1:1671,6\n710#1:1708,6\n724#1:1752,6\n725#1:1788,6\n735#1:1826,6\n753#1:1873,6\n123#1:1107,6\n123#1:1141\n123#1:1206\n190#1:1235,6\n190#1:1269\n190#1:1275\n269#1:1278,6\n269#1:1312\n269#1:1319\n330#1:1323,6\n330#1:1357\n330#1:1364\n609#1:1513,2\n609#1:1543\n609#1:1551\n665#1:1607,2\n665#1:1637\n665#1:1645\n724#1:1727,6\n724#1:1761\n724#1:1897\n124#1:1142,11\n125#1:1154,6\n172#1:1208,6\n173#1:1215,6\n180#1:1222,6\n502#1:1415,6\n647#1:1589,6\n652#1:1596,6\n818#1:1911,6\n936#1:1942,6\n129#1:1196\n329#1:1320\n419#1:1365\n771#1:1886\n192#1:1233\n194#1:1234\n199#1:1270\n271#1:1276\n273#1:1277\n279#1:1313\n310#1:1314\n332#1:1321\n334#1:1322\n340#1:1358\n392#1:1359\n423#1:1366\n427#1:1402\n428#1:1403\n453#1:1404\n456#1:1405\n457#1:1406\n478#1:1412\n499#1:1413\n506#1:1421\n514#1:1457\n518#1:1458\n520#1:1459\n528#1:1460\n529#1:1461\n532#1:1462\n536#1:1463\n542#1:1464\n552#1:1470\n554#1:1471\n555#1:1472\n621#1:1544\n622#1:1545\n624#1:1546\n639#1:1552\n682#1:1638\n683#1:1639\n686#1:1640\n707#1:1681\n714#1:1718\n719#1:1719\n720#1:1720\n723#1:1726\n734#1:1798\n737#1:1799\n742#1:1800\n752#1:1846\n759#1:1883\n760#1:1884\n770#1:1885\n777#1:1887\n788#1:1898\n794#1:1899\n797#1:1900\n420#1:1367,6\n420#1:1401\n420#1:1411\n495#1:1422,6\n495#1:1456\n495#1:1469\n550#1:1473,6\n550#1:1507\n550#1:1512\n636#1:1553,6\n636#1:1587\n636#1:1606\n693#1:1646,6\n693#1:1680\n725#1:1762,7\n725#1:1797\n725#1:1845\n753#1:1847,7\n753#1:1882\n753#1:1892\n693#1:1905\n818#1:1906,4\n818#1:1917,20\n936#1:1937,4\n936#1:1948,20\n172#1:1968\n172#1:1969,2\n275#1:1971\n557#1:1972\n567#1:1973\n641#1:1974\n642#1:1975\n646#1:1976\n650#1:1977\n651#1:1978\n708#1:1979\n709#1:1980\n716#1:1981\n726#1:1982\n733#1:1983\n754#1:1984\n763#1:1985\n808#1:1986\n809#1:1987\n810#1:1988\n811#1:1989\n917#1:1990\n*E\n"})
public final class oO000O0 {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f55090OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(AppCompatActivity appCompatActivity) {
            super(0);
            this.f55090OooO0Oo = appCompatActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO0O0("105108", MapsKt.mapOf(TuplesKt.to("type", Integer.valueOf(WealthLevel.Companion.isUnlocked$default(WealthLevel.INSTANCE, null, 1, null) ? 1 : 2))));
            AppCompatActivity appCompatActivity = this.f55090OooO0Oo;
            if (appCompatActivity != null) {
                o00O000o.f44511OooOo0O.observe(appCompatActivity, new OooOOO(new oO0O00O(appCompatActivity)));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f55091OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f55092OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Integer f55093OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55094OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f55095OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55096OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RowScope rowScope, int i, Integer num, String str, Function0<Unit> function0, int i2) {
            super(2);
            this.f55092OooO0Oo = rowScope;
            this.f55094OooO0o0 = i;
            this.f55093OooO0o = num;
            this.f55095OooO0oO = str;
            this.f55096OooO0oo = function0;
            this.f55091OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO000O0.OooO00o(this.f55092OooO0Oo, this.f55094OooO0o0, this.f55093OooO0o, this.f55095OooO0oO, this.f55096OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f55091OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f55097OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f55098OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f55099OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Painter f55100OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f55101OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55102OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f55103OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RowScope rowScope, Painter painter, String str, boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f55098OooO0Oo = rowScope;
            this.f55100OooO0o0 = painter;
            this.f55099OooO0o = str;
            this.f55101OooO0oO = z;
            this.f55102OooO0oo = function0;
            this.f55097OooO = i;
            this.f55103OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO000O0.OooO0O0(this.f55098OooO0Oo, this.f55100OooO0o0, this.f55099OooO0o, this.f55101OooO0oO, this.f55102OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f55097OooO | 1), this.f55103OooOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function2<IntOffset, IntSize, Unit> f55104OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Function2<? super IntOffset, ? super IntSize, Unit> function2) {
            super(1);
            this.f55104OooO0Oo = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(it);
            Function2<IntOffset, IntSize, Unit> function2 = this.f55104OooO0Oo;
            if (function2 != null) {
                function2.invoke(IntOffset.m3874boximpl(IntOffsetKt.IntOffset(o000000.OooO0Oo(Float.valueOf(Offset.m1436getXimpl(jPositionInWindow))), o000000.OooO0Oo(Float.valueOf(Offset.m1437getYimpl(jPositionInWindow))))), IntSize.m3917boximpl(it.mo2801getSizeYbymL2g()));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f55105OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Painter f55106OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f55107OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f55108OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f55109OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f55110OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Shape f55111OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Modifier f55112OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function2<IntOffset, IntSize, Unit> f55113OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f55114OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55115OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f55116OooOOOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Painter painter, boolean z, String str, boolean z2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4, Shape shape, Modifier modifier, Function2<? super IntOffset, ? super IntSize, Unit> function2, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f55106OooO0Oo = painter;
            this.f55108OooO0o0 = z;
            this.f55107OooO0o = str;
            this.f55109OooO0oO = z2;
            this.f55110OooO0oo = function3;
            this.f55105OooO = function4;
            this.f55111OooOO0 = shape;
            this.f55112OooOO0O = modifier;
            this.f55113OooOO0o = function2;
            this.f55115OooOOO0 = function0;
            this.f55114OooOOO = i;
            this.f55116OooOOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO000O0.OooO0OO(this.f55106OooO0Oo, this.f55108OooO0o0, this.f55107OooO0o, this.f55109OooO0oO, this.f55110OooO0oo, this.f55105OooO, this.f55111OooOO0, this.f55112OooOO0O, this.f55113OooOO0o, this.f55115OooOOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f55114OooOOO | 1), this.f55116OooOOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f55117OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00000OO o00000ooOooOO0O = o00Oo0.OooOO0O();
            o00000ooOooOO0O.getClass();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o00O000.OooO0O0("vipRedDot_CustomRoomTheme_Hide4Main", o000000O.OooOOo0().getValue(), o00000ooOooOO0O, true);
            SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
            MutableLiveData<Boolean> vipRedDot_CustomRoomTheme = sharedMainMessageManager.getVipRedDot_CustomRoomTheme();
            Boolean bool = Boolean.FALSE;
            vipRedDot_CustomRoomTheme.postValue(bool);
            o00000OO o00000ooOooOO0O2 = o00Oo0.OooOO0O();
            o00000ooOooOO0O2.getClass();
            o00000ooOooOO0O2.OooO0o("vipRedDot_ExclusiveBubble_Hide4Main" + o000000O.OooOOo0().getValue(), true);
            sharedMainMessageManager.getVipRedDot_ExclusiveBubble().postValue(bool);
            o00000OO o00000ooOooOO0O3 = o00Oo0.OooOO0O();
            o00000ooOooOO0O3.getClass();
            o00000ooOooOO0O3.OooO0o("vipRedDot_IncognitoAccess_Hide4Main" + o000000O.OooOOo0().getValue(), true);
            sharedMainMessageManager.getVipRedDot_IncognitoAccess().postValue(bool);
            o00000OO o00000ooOooOO0O4 = o00Oo0.OooOO0O();
            o00000ooOooOO0O4.getClass();
            o00000ooOooOO0O4.OooO0o("vipRedDot_ExclusiveBackpackGift_Hide4Main" + o000000O.OooOOo0().getValue(), true);
            sharedMainMessageManager.getVipRedDot_ExclusiveBackpackGift().postValue(bool);
            o00000OO o00000ooOooOO0O5 = o00Oo0.OooOO0O();
            o00000ooOooOO0O5.getClass();
            o00000ooOooOO0O5.OooO0o("vipRedDot_ExclusiveGiftRunway_Hide4Main" + o000000O.OooOOo0().getValue(), true);
            sharedMainMessageManager.getVipRedDot_ExclusiveGiftRunway().postValue(bool);
            o0OO000.OooO0O0("105018", MapsKt.mapOf(TuplesKt.to("type", Integer.valueOf(Vip.isNotVip$default(Vip.INSTANCE, null, 1, null) ? 2 : 1))));
            VipScreen.navigate$default(VipScreen.INSTANCE, null, false, 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f55118OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i) {
            super(2);
            this.f55118OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO000O0.OooO0o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f55118OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f55119OooO0Oo;

        public OooOOO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f55119OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f55119OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f55119OooO0Oo;
        }

        public final int hashCode() {
            return this.f55119OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f55119OooO0Oo.invoke(obj);
        }
    }

    public /* synthetic */ class OooOOO0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VipLevel.values().length];
            try {
                iArr[VipLevel.Vip1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VipLevel.Vip2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VipLevel.Vip3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VipLevel.Vip4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VipLevel.Vip5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VipLevel.Vip6.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void OooO(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-746021500);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-746021500, i, -1, "com.yalla.yalla.ui.screen.user.MyInfoHeader (MyUserInfoScreen.kt:691)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), false, false, 0L, false, null, null, null, ooOOOOoo.f55274OooO0Oo, 253);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f = 24;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(o000000O.OooO(), composerStartRestartGroup, 8);
            State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(o000000O.OooO0oo(), composerStartRestartGroup, 8);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            OooOOOO oooOOOO = OooOOOO.f51970OooO00o;
            oooOOOO.OooO((String) stateObserveAsState.getValue(), (String) stateObserveAsState2.getValue(), 0.0f, null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(72)), composerStartRestartGroup, 286720, 12);
            State stateObserveAsState3 = LiveDataAdapterKt.observeAsState((MutableLiveData) o000000O.f46695OooOo0O.getValue(), 0, composerStartRestartGroup, 56);
            UserInfo.Companion companion4 = UserInfo.INSTANCE;
            Integer role = (Integer) stateObserveAsState3.getValue();
            Intrinsics.checkNotNullExpressionValue(role, "role");
            boolean zIsOfficialRole = companion4.isOfficialRole(role.intValue());
            float f2 = 36;
            oooOOOO.OooOOo0(560, 0, composerStartRestartGroup, SizeKt.m525sizeVpY3zN4(OffsetKt.m436offsetVpY3zN4(companion2, Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(-3)), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(22)), zIsOfficialRole);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            float f3 = 18;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion2, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO0o.OooO00o(companion, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
            if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically2 = companion.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl4, measurePolicyOooO00o4, composerM1309constructorimpl4, currentCompositionLocalMap4);
            if (composerM1309constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1309constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            oooOOOO.OooOOOo((String) LiveDataAdapterKt.observeAsState(o000000O.OooOOoo(), composerStartRestartGroup, 8).getValue(), 0L, false, TextUnitKt.getSp(20), 0, 0, FontWeight.INSTANCE.getMedium(), false, rowScopeInstance.weight(companion2, 1.0f, false), composerStartRestartGroup, 1075317760, 182);
            State stateObserveAsState4 = LiveDataAdapterKt.observeAsState((MutableLiveData) o000000O.f46694OooOo00.getValue(), 0, composerStartRestartGroup, 56);
            float f4 = 2;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f4), null, composerStartRestartGroup, 6, 2);
            float f5 = 16;
            Modifier modifierOooO00o2 = o0oOO.OooO00o(5, BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(f5)), o0oO0O0o.f47077o000o00o, RoundedCornerShapeKt.RoundedCornerShape(50)), 0.0f, 2, null, composerStartRestartGroup, 733328855);
            MeasurePolicy measurePolicyOooO00o5 = p018OooOoo0.OooOOO.OooO00o(companion, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierOooO00o2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl5 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl5, measurePolicyOooO00o5, composerM1309constructorimpl5, currentCompositionLocalMap5);
            if (composerM1309constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash5, composerM1309constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
            }
            function3ModifierMaterializerOf5.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            oooOOOO.OooOOO0((Integer) stateObserveAsState4.getValue(), o0oO0O0o.f46946OooO0O0, TextUnitKt.getSp(10), boxScopeInstance.align(companion2, companion.getCenter()), composerStartRestartGroup, 33152, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
            Alignment.Vertical centerVertically3 = companion.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o6 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically3, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor6);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl6 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o6 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl6, measurePolicyOooO00o6, composerM1309constructorimpl6, currentCompositionLocalMap6);
            if (composerM1309constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash6, composerM1309constructorimpl6, currentCompositeKeyHash6, function2OooO00o6);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            State stateObserveAsState5 = LiveDataAdapterKt.observeAsState((MutableLiveData) o000000O.f46691OooOOoo.getValue(), 0, composerStartRestartGroup, 56);
            composerStartRestartGroup.startReplaceableGroup(77712787);
            Integer idLevel = (Integer) stateObserveAsState5.getValue();
            Intrinsics.checkNotNullExpressionValue(idLevel, "idLevel");
            if (idLevel.intValue() > 0) {
                oooOOOO.OooOo00((Integer) stateObserveAsState5.getValue(), SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dp.m3765constructorimpl(f4), 0.0f, 11, null), Dp.m3765constructorimpl(17)), composerStartRestartGroup, 560, 0);
            }
            composerStartRestartGroup.endReplaceableGroup();
            State stateObserveAsState6 = LiveDataAdapterKt.observeAsState(o000000O.OooOOo(), "", composerStartRestartGroup, 56);
            Integer num = (Integer) stateObserveAsState5.getValue();
            String strOooO00o = (num != null && num.intValue() == 0) ? o00O00OO.OooO00o("ID:", (String) stateObserveAsState6.getValue()) : (String) stateObserveAsState6.getValue();
            long sp = TextUnitKt.getSp(15);
            long j = o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
            TextStyle textStyle = new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullExpressionValue(strOooO00o, "if (idLevel == 0) \"ID:${userIdx}\" else userIdx");
            TextKt.m1251Text4IGK_g(strOooO00o, (Modifier) null, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composerStartRestartGroup, 3072, 0, 65522);
            composer2 = composerStartRestartGroup;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(6), null, composer2, 6, 2);
            IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_copy, composer2, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(f5)), false, false, 0L, false, null, null, null, new oO0OOo0o((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext()), stateObserveAsState6), 253), o000OOo.OooO0OO(composer2).f37712OooOO0o, composer2, 56, 0);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f3), null, composer2, 6, 2);
            IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_arrow_more, composer2, 0), (String) null, o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(f5)), composer2, 6), o000OOo.OooO0OO(composer2).f37711OooOO0O, composer2, 56, 0);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composer2, 6, 2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO000Oo0(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(RowScope rowScope, int i, Integer num, String str, Function0<Unit> function0, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2134008469);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(rowScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((46811 & i3) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2134008469, i3, -1, "com.yalla.yalla.ui.screen.user.MyInfoDataItem (MyUserInfoScreen.kt:658)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), false, false, 0L, false, null, null, null, function0, 253);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m1251Text4IGK_g(String.valueOf(i), o0000Ooo.OooO0O0(companion, num, 0.0f, true, false, 0L, Dp.m3765constructorimpl(20), Dp.m3765constructorimpl(-4), 0.0f, 15978), o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199680, 0, 131024);
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(1), null, composerStartRestartGroup, 6, 2);
            TextKt.m1251Text4IGK_g(str, (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 9) & 14) | 3072, 0, 131058);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(rowScope, i, num, str, function0, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(RowScope rowScope, Painter painter, String str, boolean z, Function0<Unit> function0, Composer composer, int i, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1545816099);
        boolean z2 = (i2 & 4) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1545816099, i, -1, "com.yalla.yalla.ui.screen.user.MyInfoFunctionBlockItem (MyUserInfoScreen.kt:602)");
        }
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), false, false, 0L, false, null, null, null, function0, 253);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyColumnMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ImageKt.Image(painter, (String) null, o0000Ooo.OooO00o(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(48)), z2, 0L, Dp.m3765constructorimpl(4), true, false, 0.0f, 0.0f, 0.0f, 1010), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, 6, 2);
        b0.OooO00o(str, new b1(TextUnitKt.getSp(8), TextUnitKt.getSp(14)), null, o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, null, null, null, 0L, null, null, 0L, 0, false, 0, null, composerStartRestartGroup, (i >> 6) & 14, 0, 32756);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, painter, str, z2, function0, i, i2));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OooO0OO(Painter painter, boolean z, String str, boolean z2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4, Shape shape, Modifier modifier, Function2<? super IntOffset, ? super IntSize, Unit> function2, Function0<Unit> function0, Composer composer, int i, int i2) {
        Shape shapeRoundedCornerShape;
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-379806744);
        boolean z3 = (i2 & 2) != 0 ? false : z;
        boolean z4 = (i2 & 8) != 0 ? false : z2;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function5 = (i2 & 16) != 0 ? null : function3;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function6 = (i2 & 32) != 0 ? null : function4;
        if ((i2 & 64) != 0) {
            shapeRoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(0);
            i3 = i & (-3670017);
        } else {
            shapeRoundedCornerShape = shape;
            i3 = i;
        }
        Modifier modifier2 = (i2 & 128) != 0 ? Modifier.INSTANCE : modifier;
        Function2<? super IntOffset, ? super IntSize, Unit> function7 = (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : function2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-379806744, i3, -1, "com.yalla.yalla.ui.screen.user.MyInfoItem (MyUserInfoScreen.kt:481)");
        }
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(ClipKt.clip(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null), Dp.m3765constructorimpl(56)), shapeRoundedCornerShape), false, false, 0L, false, null, null, null, function0, 255);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(function7);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO0OO(function7);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierOooO0O0, (Function1) objRememberedValue);
        float f = 12;
        int i5 = i3;
        Function2<? super IntOffset, ? super IntSize, Unit> function8 = function7;
        Modifier modifierOooO00o = o0oOO.OooO00o(f, modifierOnGloballyPositioned, 0.0f, 2, null, composerStartRestartGroup, 693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (z3) {
            composerStartRestartGroup.startReplaceableGroup(212278347);
            IconKt.m1103Iconww6aTOc(painter, (String) null, o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(24)), composerStartRestartGroup, 6), o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, composerStartRestartGroup, 56, 0);
            composerStartRestartGroup.endReplaceableGroup();
            i4 = 2;
        } else {
            composerStartRestartGroup.startReplaceableGroup(212278647);
            ImageKt.Image(painter, (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            composerStartRestartGroup.endReplaceableGroup();
            i4 = 2;
        }
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, i4);
        long sp = TextUnitKt.getSp(16);
        long j = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function9 = function6;
        Modifier modifierOooO00o2 = o0000Ooo.OooO00o(r10, z4, 0L, Dp.m3765constructorimpl((float) 3.5d), true, false, Dp.m3765constructorimpl(f), 0.0f, 0.0f, 946);
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function10 = function5;
        TextKt.m1251Text4IGK_g(str, modifierOooO00o2, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i5 >> 6) & 14) | 3072, 0, 131056);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, 6, i4);
        composerStartRestartGroup.startReplaceableGroup(212279151);
        if (function10 != null) {
            function10.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i5 >> 9) & 112) | 6));
        }
        composerStartRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, r10, 1.0f, false, 2, null), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(212279225);
        if (function9 != null) {
            function9.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i5 >> 12) & 112) | 6));
        }
        composerStartRestartGroup.endReplaceableGroup();
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(6), null, composerStartRestartGroup, 6, i4);
        IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_arrow_more, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(16)), composerStartRestartGroup, 6), o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0, composerStartRestartGroup, 56, 0);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(painter, z3, str, z4, function10, function9, shapeRoundedCornerShape, modifier2, function8, function0, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:108:0x0244  */
    /* JADX WARN: Code duplicated, block: B:113:0x0252  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:54:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x0105  */
    /* JADX WARN: Code duplicated, block: B:57:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x010a  */
    /* JADX WARN: Code duplicated, block: B:59:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0112  */
    /* JADX WARN: Code duplicated, block: B:62:0x0115  */
    /* JADX WARN: Code duplicated, block: B:63:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x011d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0122  */
    /* JADX WARN: Code duplicated, block: B:68:0x0125  */
    /* JADX WARN: Code duplicated, block: B:69:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0135  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x013d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0142  */
    /* JADX WARN: Code duplicated, block: B:80:0x0145  */
    /* JADX WARN: Code duplicated, block: B:81:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:0x014d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0152  */
    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    /* JADX WARN: Code duplicated, block: B:87:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x015a  */
    /* JADX WARN: Code duplicated, block: B:89:0x015d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0162  */
    /* JADX WARN: Code duplicated, block: B:94:0x016a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0185  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b9  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(int i, int i2, Composer composer, Modifier modifier, boolean z) {
        Modifier modifier2;
        int i3;
        boolean z2;
        Modifier modifier3;
        boolean z3;
        final Ref.IntRef intRef;
        int i4;
        final Ref.IntRef intRef2;
        int i5;
        final Ref.BooleanRef booleanRef;
        final Ref.IntRef intRef3;
        final Ref.ObjectRef objectRef;
        Pair pair;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        boolean z4;
        int iLevel;
        boolean z5;
        T tStringResource;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2112146459);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i7 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2112146459, i, -1, "com.yalla.yalla.ui.screen.user.UserVipView (MyUserInfoScreen.kt:915)");
                }
                o000000O o000000o2 = o000000O.f46674OooO00o;
                final State stateObserveAsState = LiveDataAdapterKt.observeAsState(o000000O.OooOO0(), composerStartRestartGroup, 8);
                intRef = new Ref.IntRef();
                i4 = oO00OOO.main_ka_vip_level_1;
                intRef.element = i4;
                intRef2 = new Ref.IntRef();
                i5 = oO00OOO.main_ka_vip_1;
                intRef2.element = i5;
                booleanRef = new Ref.BooleanRef();
                intRef3 = new Ref.IntRef();
                objectRef = new Ref.ObjectRef();
                objectRef.element = "";
                pair = (Pair) stateObserveAsState.getValue();
                composerStartRestartGroup.startReplaceableGroup(-2043296656);
                if (pair != null) {
                    if (((Number) pair.getFirst()).intValue() != VipState.VipFrozen.getValue() || ((Number) pair.getFirst()).intValue() == VipState.VipFrozenHide.getValue()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    booleanRef.element = z4;
                    iLevel = VipLevel.INSTANCE.of(((Number) pair.getSecond()).intValue()).level();
                    intRef3.element = iLevel;
                    z5 = booleanRef.element;
                    switch (iLevel) {
                        case 1:
                            if (z5) {
                                i5 = oO00OOO.main_ka_vip_frozen_1;
                            }
                            break;
                        case 2:
                            if (!z5) {
                                i5 = oO00OOO.main_ka_vip_2;
                            } else {
                                i5 = oO00OOO.main_ka_vip_frozen_2;
                            }
                            break;
                        case 3:
                            if (!z5) {
                                i5 = oO00OOO.main_ka_vip_3;
                            } else {
                                i5 = oO00OOO.main_ka_vip_frozen_3;
                            }
                            break;
                        case 4:
                            if (!z5) {
                                i5 = oO00OOO.main_ka_vip_4;
                            } else {
                                i5 = oO00OOO.main_ka_vip_frozen_4;
                            }
                            break;
                        case 5:
                            if (!z5) {
                                i5 = oO00OOO.main_ka_vip_5;
                            } else {
                                i5 = oO00OOO.main_ka_vip_frozen_5;
                            }
                            break;
                        case 6:
                            if (!z5) {
                                i5 = oO00OOO.main_ka_vip_6;
                            } else {
                                i5 = oO00OOO.main_ka_vip_frozen_6;
                            }
                            break;
                        default:
                            if (z5) {
                                i5 = oO00OOO.main_ka_vip_frozen_1;
                            }
                            break;
                    }
                    intRef2.element = i5;
                    switch (intRef3.element) {
                        case 1:
                            if (z5) {
                                i4 = oO00OOO.main_ka_vip_frozen_level_1;
                            }
                            break;
                        case 2:
                            if (!z5) {
                                i4 = oO00OOO.main_ka_vip_level_2;
                            } else {
                                i4 = oO00OOO.main_ka_vip_frozen_level_2;
                            }
                            break;
                        case 3:
                            if (!z5) {
                                i4 = oO00OOO.main_ka_vip_level_3;
                            } else {
                                i4 = oO00OOO.main_ka_vip_frozen_level_3;
                            }
                            break;
                        case 4:
                            if (!z5) {
                                i4 = oO00OOO.main_ka_vip_level_4;
                            } else {
                                i4 = oO00OOO.main_ka_vip_frozen_level_4;
                            }
                            break;
                        case 5:
                            if (!z5) {
                                i4 = oO00OOO.main_ka_vip_level_5;
                            } else {
                                i4 = oO00OOO.main_ka_vip_frozen_level_5;
                            }
                            break;
                        case 6:
                            if (!z5) {
                                i4 = oO00OOO.main_ka_vip_level_6;
                            } else {
                                i4 = oO00OOO.main_ka_vip_frozen_level_6;
                            }
                            break;
                        default:
                            if (z5) {
                                i4 = oO00OOO.main_ka_vip_frozen_level_1;
                            }
                            break;
                    }
                    intRef.element = i4;
                    if (intRef3.element > 0) {
                        composerStartRestartGroup.startReplaceableGroup(-824013695);
                        tStringResource = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.vip_xxx, composerStartRestartGroup, 0), String.valueOf(intRef3.element));
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-824013663);
                        tStringResource = StringResources_androidKt.stringResource(oO00OOo0.vip_join_now, composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    objectRef.element = tStringResource;
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen = Modifier.INSTANCE.then(modifier3);
                composerStartRestartGroup.startReplaceableGroup(-270267587);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new oO00000();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final oO00000 oo00000 = (oO00000) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new ConstraintLayoutScope();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Pair pairOooO0O0 = o0OO.OooO0O0(constraintLayoutScope, (MutableState) objRememberedValue3, oo00000, composerStartRestartGroup);
                MeasurePolicy measurePolicy = (MeasurePolicy) pairOooO0O0.component1();
                final Function0 function0 = (Function0) pairOooO0O0.component2();
                Modifier modifier4 = modifier3;
                final boolean z6 = z3;
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierThen, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.ui.screen.user.MyUserInfoScreenKt$UserVipView$$inlined$ConstraintLayout$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        oO0000Oo.OooO00o(semantics, oo00000);
                        return Unit.INSTANCE;
                    }
                }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.user.MyUserInfoScreenKt$UserVipView$$inlined$ConstraintLayout$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final Unit invoke(Composer composer2, Integer num) {
                        Modifier.Companion companion2;
                        int i8;
                        Unit unit2;
                        Composer composer3 = composer2;
                        if (((num.intValue() & 11) ^ 2) == 0 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                        } else {
                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                            constraintLayoutScope2.getClass();
                            constraintLayoutScope2.OooO0Oo();
                            ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                            o0OO0O0 o0oo0o0OooO00o = oooO00oOooO0OO.OooO00o();
                            o0OO0O0 o0oo0o0OooO0O0 = oooO00oOooO0OO.OooO0O0();
                            o0OO0O0 o0oo0o0OooO0OO = oooO00oOooO0OO.OooO0OO();
                            o0OO0O0 o0oo0o0OooO0Oo = oooO00oOooO0OO.OooO0Oo();
                            ConstraintLayoutScope constraintLayoutScope3 = oooO00oOooO0OO.f4208OooO00o;
                            o0OO0O0 o0oo0o0OooO0O1 = constraintLayoutScope3.OooO0O0();
                            o0OO0O0 o0oo0o0OooO0O2 = constraintLayoutScope3.OooO0O0();
                            Painter painterPainterResource = PainterResources_androidKt.painterResource(intRef2.element, composer3, 0);
                            ContentScale crop = ContentScale.INSTANCE.getCrop();
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            ImageKt.Image(painterPainterResource, (String) null, SizeKt.fillMaxSize$default(ClipKt.clip(ConstraintLayoutScope.OooO00o(companion3, o0oo0o0OooO0Oo, oO0OOO00.f55159OooO0Oo), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(8))), 0.0f, 1, null), (Alignment) null, crop, 0.0f, (ColorFilter) null, composer3, 24632, 104);
                            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.VIP_Club, composer3, 0);
                            Ref.IntRef intRef4 = intRef3;
                            TextKt.m1251Text4IGK_g(strStringResource, ConstraintLayoutScope.OooO00o(companion3, o0oo0o0OooO00o, oO00o00O.f55137OooO0Oo), oO000O0.OooOOO(intRef4.element), o0000O0.OooO0OO(13, composer3, 6), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 196608, 0, 131024);
                            composer3.startReplaceableGroup(-824012556);
                            if (z6) {
                                composer3.startReplaceableGroup(1157296644);
                                boolean zChanged = composer3.changed(o0oo0o0OooO00o);
                                Object objRememberedValue4 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new oO00o0(o0oo0o0OooO00o);
                                    composer3.updateRememberedValue(objRememberedValue4);
                                }
                                composer3.endReplaceableGroup();
                                BoxKt.Box(BackgroundKt.m168backgroundbw27NRU(SizeKt.m523size3ABfNKs(ConstraintLayoutScope.OooO00o(companion3, o0oo0o0OooO0O2, (Function1) objRememberedValue4), Dp.m3765constructorimpl(6)), ColorKt.Color(4293415249L), RoundedCornerShapeKt.getCircleShape()), composer3, 0);
                            }
                            composer3.endReplaceableGroup();
                            String str = (String) objectRef.element;
                            long jOooOOO = oO000O0.OooOOO(intRef4.element);
                            long jOooO0OO = o0000O0.OooO0OO(11, composer3, 6);
                            composer3.startReplaceableGroup(1157296644);
                            boolean zChanged2 = composer3.changed(o0oo0o0OooO00o);
                            Object objRememberedValue5 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new oOo00o0o(o0oo0o0OooO00o);
                                composer3.updateRememberedValue(objRememberedValue5);
                            }
                            composer3.endReplaceableGroup();
                            TextKt.m1251Text4IGK_g(str, ConstraintLayoutScope.OooO00o(companion3, o0oo0o0OooO0O0, (Function1) objRememberedValue5), jOooOOO, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131056);
                            composer3.startReplaceableGroup(-824011863);
                            if (intRef4.element <= 0) {
                                i8 = 0;
                                Painter painterPainterResource2 = PainterResources_androidKt.painterResource(oO00OOO.main_vip_arraow_right, composer3, 0);
                                companion2 = companion3;
                                Modifier modifierOooO00o = com.facebook.OooOo00.OooO00o(12, companion2, composer3, 1157296644);
                                boolean zChanged3 = composer3.changed(o0oo0o0OooO0O0);
                                Object objRememberedValue6 = composer3.rememberedValue();
                                if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new oOo00ooO(o0oo0o0OooO0O0);
                                    composer3.updateRememberedValue(objRememberedValue6);
                                }
                                composer3.endReplaceableGroup();
                                ImageKt.Image(painterPainterResource2, (String) null, o0O0O00.OooO0Oo(ConstraintLayoutScope.OooO00o(modifierOooO00o, o0oo0o0OooO0OO, (Function1) objRememberedValue6), composer3, 0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                            } else {
                                companion2 = companion3;
                                i8 = 0;
                            }
                            composer3.endReplaceableGroup();
                            Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(ConstraintLayoutScope.OooO00o(companion2, o0oo0o0OooO0O1, oO0OO00o.f55157OooO0Oo), Dp.m3765constructorimpl(36));
                            Pair pair2 = (Pair) stateObserveAsState.getValue();
                            composer3.startReplaceableGroup(-824011106);
                            Ref.IntRef intRef5 = intRef;
                            if (pair2 == null) {
                                unit2 = null;
                            } else {
                                if (VipLevel.INSTANCE.of(((Number) pair2.getSecond()).intValue()) == VipLevel.Vip6) {
                                    composer3.startReplaceableGroup(-855804930);
                                    if (booleanRef.element) {
                                        composer3.startReplaceableGroup(-855804897);
                                        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.main_ka_vip_frozen_level_6, composer3, i8), (String) null, modifierM523size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                        composer3.endReplaceableGroup();
                                    } else {
                                        composer3.startReplaceableGroup(-855804630);
                                        p154o00OoO00.OooOo00.OooO00o("svga/ic_vip6_small.svga", true, 0, null, null, modifierM523size3ABfNKs, composer3, 54, 28);
                                        composer3.endReplaceableGroup();
                                    }
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(-855804392);
                                    ImageKt.Image(PainterResources_androidKt.painterResource(intRef5.element, composer3, i8), (String) null, modifierM523size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                    composer3.endReplaceableGroup();
                                }
                                unit2 = Unit.INSTANCE;
                            }
                            composer3.endReplaceableGroup();
                            composer3.startReplaceableGroup(-2043293704);
                            if (unit2 == null) {
                                ImageKt.Image(PainterResources_androidKt.painterResource(intRef5.element, composer3, i8), (String) null, modifierM523size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                            }
                            composer3.endReplaceableGroup();
                        }
                        return Unit.INSTANCE;
                    }
                }), measurePolicy, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                z2 = z3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new oOo000Oo(modifier2, z2, i, i2));
        }
        i3 |= 48;
        z2 = z;
        if ((i3 & 91) == 18) {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i7 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112146459, i, -1, "com.yalla.yalla.ui.screen.user.UserVipView (MyUserInfoScreen.kt:915)");
            }
            o000000O o000000o3 = o000000O.f46674OooO00o;
            final State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(o000000O.OooOO0(), composerStartRestartGroup, 8);
            intRef = new Ref.IntRef();
            i4 = oO00OOO.main_ka_vip_level_1;
            intRef.element = i4;
            intRef2 = new Ref.IntRef();
            i5 = oO00OOO.main_ka_vip_1;
            intRef2.element = i5;
            booleanRef = new Ref.BooleanRef();
            intRef3 = new Ref.IntRef();
            objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            pair = (Pair) stateObserveAsState2.getValue();
            composerStartRestartGroup.startReplaceableGroup(-2043296656);
            if (pair != null) {
                if (((Number) pair.getFirst()).intValue() != VipState.VipFrozen.getValue()) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                booleanRef.element = z4;
                iLevel = VipLevel.INSTANCE.of(((Number) pair.getSecond()).intValue()).level();
                intRef3.element = iLevel;
                z5 = booleanRef.element;
                switch (iLevel) {
                    case 1:
                        if (z5) {
                            i5 = oO00OOO.main_ka_vip_frozen_1;
                        }
                        break;
                    case 2:
                        if (!z5) {
                            i5 = oO00OOO.main_ka_vip_2;
                        } else {
                            i5 = oO00OOO.main_ka_vip_frozen_2;
                        }
                        break;
                    case 3:
                        if (!z5) {
                            i5 = oO00OOO.main_ka_vip_3;
                        } else {
                            i5 = oO00OOO.main_ka_vip_frozen_3;
                        }
                        break;
                    case 4:
                        if (!z5) {
                            i5 = oO00OOO.main_ka_vip_4;
                        } else {
                            i5 = oO00OOO.main_ka_vip_frozen_4;
                        }
                        break;
                    case 5:
                        if (!z5) {
                            i5 = oO00OOO.main_ka_vip_5;
                        } else {
                            i5 = oO00OOO.main_ka_vip_frozen_5;
                        }
                        break;
                    case 6:
                        if (!z5) {
                            i5 = oO00OOO.main_ka_vip_6;
                        } else {
                            i5 = oO00OOO.main_ka_vip_frozen_6;
                        }
                        break;
                    default:
                        if (z5) {
                            i5 = oO00OOO.main_ka_vip_frozen_1;
                        }
                        break;
                }
                intRef2.element = i5;
                switch (intRef3.element) {
                    case 1:
                        if (z5) {
                            i4 = oO00OOO.main_ka_vip_frozen_level_1;
                        }
                        break;
                    case 2:
                        if (!z5) {
                            i4 = oO00OOO.main_ka_vip_level_2;
                        } else {
                            i4 = oO00OOO.main_ka_vip_frozen_level_2;
                        }
                        break;
                    case 3:
                        if (!z5) {
                            i4 = oO00OOO.main_ka_vip_level_3;
                        } else {
                            i4 = oO00OOO.main_ka_vip_frozen_level_3;
                        }
                        break;
                    case 4:
                        if (!z5) {
                            i4 = oO00OOO.main_ka_vip_level_4;
                        } else {
                            i4 = oO00OOO.main_ka_vip_frozen_level_4;
                        }
                        break;
                    case 5:
                        if (!z5) {
                            i4 = oO00OOO.main_ka_vip_level_5;
                        } else {
                            i4 = oO00OOO.main_ka_vip_frozen_level_5;
                        }
                        break;
                    case 6:
                        if (!z5) {
                            i4 = oO00OOO.main_ka_vip_level_6;
                        } else {
                            i4 = oO00OOO.main_ka_vip_frozen_level_6;
                        }
                        break;
                    default:
                        if (z5) {
                            i4 = oO00OOO.main_ka_vip_frozen_level_1;
                        }
                        break;
                }
                intRef.element = i4;
                if (intRef3.element > 0) {
                    composerStartRestartGroup.startReplaceableGroup(-824013695);
                    tStringResource = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.vip_xxx, composerStartRestartGroup, 0), String.valueOf(intRef3.element));
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-824013663);
                    tStringResource = StringResources_androidKt.stringResource(oO00OOo0.vip_join_now, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                objectRef.element = tStringResource;
                Unit unit2 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen2 = Modifier.INSTANCE.then(modifier3);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new oO00000();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final oO00000 oo00001 = (oO00000) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Pair pairOooO0O1 = o0OO.OooO0O0(constraintLayoutScope2, (MutableState) objRememberedValue3, oo00001, composerStartRestartGroup);
            MeasurePolicy measurePolicy2 = (MeasurePolicy) pairOooO0O1.component1();
            final Function0 function1 = (Function0) pairOooO0O1.component2();
            Modifier modifier5 = modifier3;
            final boolean z7 = z3;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierThen2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.ui.screen.user.MyUserInfoScreenKt$UserVipView$$inlined$ConstraintLayout$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    oO0000Oo.OooO00o(semantics, oo00001);
                    return Unit.INSTANCE;
                }
            }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.user.MyUserInfoScreenKt$UserVipView$$inlined$ConstraintLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(Composer composer2, Integer num) {
                    Modifier.Companion companion2;
                    int i8;
                    Unit unit3;
                    Composer composer3 = composer2;
                    if (((num.intValue() & 11) ^ 2) == 0 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope2;
                        constraintLayoutScope3.getClass();
                        constraintLayoutScope3.OooO0Oo();
                        ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope3.OooO0OO();
                        o0OO0O0 o0oo0o0OooO00o = oooO00oOooO0OO.OooO00o();
                        o0OO0O0 o0oo0o0OooO0O0 = oooO00oOooO0OO.OooO0O0();
                        o0OO0O0 o0oo0o0OooO0OO = oooO00oOooO0OO.OooO0OO();
                        o0OO0O0 o0oo0o0OooO0Oo = oooO00oOooO0OO.OooO0Oo();
                        ConstraintLayoutScope constraintLayoutScope4 = oooO00oOooO0OO.f4208OooO00o;
                        o0OO0O0 o0oo0o0OooO0O1 = constraintLayoutScope4.OooO0O0();
                        o0OO0O0 o0oo0o0OooO0O2 = constraintLayoutScope4.OooO0O0();
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(intRef2.element, composer3, 0);
                        ContentScale crop = ContentScale.INSTANCE.getCrop();
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        ImageKt.Image(painterPainterResource, (String) null, SizeKt.fillMaxSize$default(ClipKt.clip(ConstraintLayoutScope.OooO00o(companion3, o0oo0o0OooO0Oo, oO0OOO00.f55159OooO0Oo), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(8))), 0.0f, 1, null), (Alignment) null, crop, 0.0f, (ColorFilter) null, composer3, 24632, 104);
                        String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.VIP_Club, composer3, 0);
                        Ref.IntRef intRef4 = intRef3;
                        TextKt.m1251Text4IGK_g(strStringResource, ConstraintLayoutScope.OooO00o(companion3, o0oo0o0OooO00o, oO00o00O.f55137OooO0Oo), oO000O0.OooOOO(intRef4.element), o0000O0.OooO0OO(13, composer3, 6), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 196608, 0, 131024);
                        composer3.startReplaceableGroup(-824012556);
                        if (z7) {
                            composer3.startReplaceableGroup(1157296644);
                            boolean zChanged = composer3.changed(o0oo0o0OooO00o);
                            Object objRememberedValue4 = composer3.rememberedValue();
                            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new oO00o0(o0oo0o0OooO00o);
                                composer3.updateRememberedValue(objRememberedValue4);
                            }
                            composer3.endReplaceableGroup();
                            BoxKt.Box(BackgroundKt.m168backgroundbw27NRU(SizeKt.m523size3ABfNKs(ConstraintLayoutScope.OooO00o(companion3, o0oo0o0OooO0O2, (Function1) objRememberedValue4), Dp.m3765constructorimpl(6)), ColorKt.Color(4293415249L), RoundedCornerShapeKt.getCircleShape()), composer3, 0);
                        }
                        composer3.endReplaceableGroup();
                        String str = (String) objectRef.element;
                        long jOooOOO = oO000O0.OooOOO(intRef4.element);
                        long jOooO0OO = o0000O0.OooO0OO(11, composer3, 6);
                        composer3.startReplaceableGroup(1157296644);
                        boolean zChanged2 = composer3.changed(o0oo0o0OooO00o);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new oOo00o0o(o0oo0o0OooO00o);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        composer3.endReplaceableGroup();
                        TextKt.m1251Text4IGK_g(str, ConstraintLayoutScope.OooO00o(companion3, o0oo0o0OooO0O0, (Function1) objRememberedValue5), jOooOOO, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131056);
                        composer3.startReplaceableGroup(-824011863);
                        if (intRef4.element <= 0) {
                            i8 = 0;
                            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(oO00OOO.main_vip_arraow_right, composer3, 0);
                            companion2 = companion3;
                            Modifier modifierOooO00o = com.facebook.OooOo00.OooO00o(12, companion2, composer3, 1157296644);
                            boolean zChanged3 = composer3.changed(o0oo0o0OooO0O0);
                            Object objRememberedValue6 = composer3.rememberedValue();
                            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new oOo00ooO(o0oo0o0OooO0O0);
                                composer3.updateRememberedValue(objRememberedValue6);
                            }
                            composer3.endReplaceableGroup();
                            ImageKt.Image(painterPainterResource2, (String) null, o0O0O00.OooO0Oo(ConstraintLayoutScope.OooO00o(modifierOooO00o, o0oo0o0OooO0OO, (Function1) objRememberedValue6), composer3, 0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                        } else {
                            companion2 = companion3;
                            i8 = 0;
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(ConstraintLayoutScope.OooO00o(companion2, o0oo0o0OooO0O1, oO0OO00o.f55157OooO0Oo), Dp.m3765constructorimpl(36));
                        Pair pair2 = (Pair) stateObserveAsState2.getValue();
                        composer3.startReplaceableGroup(-824011106);
                        Ref.IntRef intRef5 = intRef;
                        if (pair2 == null) {
                            unit3 = null;
                        } else {
                            if (VipLevel.INSTANCE.of(((Number) pair2.getSecond()).intValue()) == VipLevel.Vip6) {
                                composer3.startReplaceableGroup(-855804930);
                                if (booleanRef.element) {
                                    composer3.startReplaceableGroup(-855804897);
                                    ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.main_ka_vip_frozen_level_6, composer3, i8), (String) null, modifierM523size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(-855804630);
                                    p154o00OoO00.OooOo00.OooO00o("svga/ic_vip6_small.svga", true, 0, null, null, modifierM523size3ABfNKs, composer3, 54, 28);
                                    composer3.endReplaceableGroup();
                                }
                                composer3.endReplaceableGroup();
                            } else {
                                composer3.startReplaceableGroup(-855804392);
                                ImageKt.Image(PainterResources_androidKt.painterResource(intRef5.element, composer3, i8), (String) null, modifierM523size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                composer3.endReplaceableGroup();
                            }
                            unit3 = Unit.INSTANCE;
                        }
                        composer3.endReplaceableGroup();
                        composer3.startReplaceableGroup(-2043293704);
                        if (unit3 == null) {
                            ImageKt.Image(PainterResources_androidKt.painterResource(intRef5.element, composer3, i8), (String) null, modifierM523size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                        }
                        composer3.endReplaceableGroup();
                    }
                    return Unit.INSTANCE;
                }
            }), measurePolicy2, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier5;
            z2 = z3;
        } else {
            if (i6 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i7 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112146459, i, -1, "com.yalla.yalla.ui.screen.user.UserVipView (MyUserInfoScreen.kt:915)");
            }
            o000000O o000000o4 = o000000O.f46674OooO00o;
            final State stateObserveAsState3 = LiveDataAdapterKt.observeAsState(o000000O.OooOO0(), composerStartRestartGroup, 8);
            intRef = new Ref.IntRef();
            i4 = oO00OOO.main_ka_vip_level_1;
            intRef.element = i4;
            intRef2 = new Ref.IntRef();
            i5 = oO00OOO.main_ka_vip_1;
            intRef2.element = i5;
            booleanRef = new Ref.BooleanRef();
            intRef3 = new Ref.IntRef();
            objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            pair = (Pair) stateObserveAsState3.getValue();
            composerStartRestartGroup.startReplaceableGroup(-2043296656);
            if (pair != null) {
                if (((Number) pair.getFirst()).intValue() != VipState.VipFrozen.getValue()) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                booleanRef.element = z4;
                iLevel = VipLevel.INSTANCE.of(((Number) pair.getSecond()).intValue()).level();
                intRef3.element = iLevel;
                z5 = booleanRef.element;
                switch (iLevel) {
                    case 1:
                        if (z5) {
                            i5 = oO00OOO.main_ka_vip_frozen_1;
                        }
                        break;
                    case 2:
                        if (!z5) {
                            i5 = oO00OOO.main_ka_vip_2;
                        } else {
                            i5 = oO00OOO.main_ka_vip_frozen_2;
                        }
                        break;
                    case 3:
                        if (!z5) {
                            i5 = oO00OOO.main_ka_vip_3;
                        } else {
                            i5 = oO00OOO.main_ka_vip_frozen_3;
                        }
                        break;
                    case 4:
                        if (!z5) {
                            i5 = oO00OOO.main_ka_vip_4;
                        } else {
                            i5 = oO00OOO.main_ka_vip_frozen_4;
                        }
                        break;
                    case 5:
                        if (!z5) {
                            i5 = oO00OOO.main_ka_vip_5;
                        } else {
                            i5 = oO00OOO.main_ka_vip_frozen_5;
                        }
                        break;
                    case 6:
                        if (!z5) {
                            i5 = oO00OOO.main_ka_vip_6;
                        } else {
                            i5 = oO00OOO.main_ka_vip_frozen_6;
                        }
                        break;
                    default:
                        if (z5) {
                            i5 = oO00OOO.main_ka_vip_frozen_1;
                        }
                        break;
                }
                intRef2.element = i5;
                switch (intRef3.element) {
                    case 1:
                        if (z5) {
                            i4 = oO00OOO.main_ka_vip_frozen_level_1;
                        }
                        break;
                    case 2:
                        if (!z5) {
                            i4 = oO00OOO.main_ka_vip_level_2;
                        } else {
                            i4 = oO00OOO.main_ka_vip_frozen_level_2;
                        }
                        break;
                    case 3:
                        if (!z5) {
                            i4 = oO00OOO.main_ka_vip_level_3;
                        } else {
                            i4 = oO00OOO.main_ka_vip_frozen_level_3;
                        }
                        break;
                    case 4:
                        if (!z5) {
                            i4 = oO00OOO.main_ka_vip_level_4;
                        } else {
                            i4 = oO00OOO.main_ka_vip_frozen_level_4;
                        }
                        break;
                    case 5:
                        if (!z5) {
                            i4 = oO00OOO.main_ka_vip_level_5;
                        } else {
                            i4 = oO00OOO.main_ka_vip_frozen_level_5;
                        }
                        break;
                    case 6:
                        if (!z5) {
                            i4 = oO00OOO.main_ka_vip_level_6;
                        } else {
                            i4 = oO00OOO.main_ka_vip_frozen_level_6;
                        }
                        break;
                    default:
                        if (z5) {
                            i4 = oO00OOO.main_ka_vip_frozen_level_1;
                        }
                        break;
                }
                intRef.element = i4;
                if (intRef3.element > 0) {
                    composerStartRestartGroup.startReplaceableGroup(-824013695);
                    tStringResource = o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.vip_xxx, composerStartRestartGroup, 0), String.valueOf(intRef3.element));
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-824013663);
                    tStringResource = StringResources_androidKt.stringResource(oO00OOo0.vip_join_now, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
                objectRef.element = tStringResource;
                Unit unit3 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen3 = Modifier.INSTANCE.then(modifier3);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new oO00000();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final oO00000 oo00002 = (oO00000) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Pair pairOooO0O2 = o0OO.OooO0O0(constraintLayoutScope3, (MutableState) objRememberedValue3, oo00002, composerStartRestartGroup);
            MeasurePolicy measurePolicy3 = (MeasurePolicy) pairOooO0O2.component1();
            final Function0 function2 = (Function0) pairOooO0O2.component2();
            Modifier modifier6 = modifier3;
            final boolean z8 = z3;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierThen3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.ui.screen.user.MyUserInfoScreenKt$UserVipView$$inlined$ConstraintLayout$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    oO0000Oo.OooO00o(semantics, oo00002);
                    return Unit.INSTANCE;
                }
            }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.user.MyUserInfoScreenKt$UserVipView$$inlined$ConstraintLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(Composer composer2, Integer num) {
                    Modifier.Companion companion2;
                    int i8;
                    Unit unit4;
                    Composer composer3 = composer2;
                    if (((num.intValue() & 11) ^ 2) == 0 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope3;
                        constraintLayoutScope4.getClass();
                        constraintLayoutScope4.OooO0Oo();
                        ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope4.OooO0OO();
                        o0OO0O0 o0oo0o0OooO00o = oooO00oOooO0OO.OooO00o();
                        o0OO0O0 o0oo0o0OooO0O0 = oooO00oOooO0OO.OooO0O0();
                        o0OO0O0 o0oo0o0OooO0OO = oooO00oOooO0OO.OooO0OO();
                        o0OO0O0 o0oo0o0OooO0Oo = oooO00oOooO0OO.OooO0Oo();
                        ConstraintLayoutScope constraintLayoutScope5 = oooO00oOooO0OO.f4208OooO00o;
                        o0OO0O0 o0oo0o0OooO0O1 = constraintLayoutScope5.OooO0O0();
                        o0OO0O0 o0oo0o0OooO0O2 = constraintLayoutScope5.OooO0O0();
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(intRef2.element, composer3, 0);
                        ContentScale crop = ContentScale.INSTANCE.getCrop();
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        ImageKt.Image(painterPainterResource, (String) null, SizeKt.fillMaxSize$default(ClipKt.clip(ConstraintLayoutScope.OooO00o(companion3, o0oo0o0OooO0Oo, oO0OOO00.f55159OooO0Oo), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(8))), 0.0f, 1, null), (Alignment) null, crop, 0.0f, (ColorFilter) null, composer3, 24632, 104);
                        String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.VIP_Club, composer3, 0);
                        Ref.IntRef intRef4 = intRef3;
                        TextKt.m1251Text4IGK_g(strStringResource, ConstraintLayoutScope.OooO00o(companion3, o0oo0o0OooO00o, oO00o00O.f55137OooO0Oo), oO000O0.OooOOO(intRef4.element), o0000O0.OooO0OO(13, composer3, 6), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 196608, 0, 131024);
                        composer3.startReplaceableGroup(-824012556);
                        if (z8) {
                            composer3.startReplaceableGroup(1157296644);
                            boolean zChanged = composer3.changed(o0oo0o0OooO00o);
                            Object objRememberedValue4 = composer3.rememberedValue();
                            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new oO00o0(o0oo0o0OooO00o);
                                composer3.updateRememberedValue(objRememberedValue4);
                            }
                            composer3.endReplaceableGroup();
                            BoxKt.Box(BackgroundKt.m168backgroundbw27NRU(SizeKt.m523size3ABfNKs(ConstraintLayoutScope.OooO00o(companion3, o0oo0o0OooO0O2, (Function1) objRememberedValue4), Dp.m3765constructorimpl(6)), ColorKt.Color(4293415249L), RoundedCornerShapeKt.getCircleShape()), composer3, 0);
                        }
                        composer3.endReplaceableGroup();
                        String str = (String) objectRef.element;
                        long jOooOOO = oO000O0.OooOOO(intRef4.element);
                        long jOooO0OO = o0000O0.OooO0OO(11, composer3, 6);
                        composer3.startReplaceableGroup(1157296644);
                        boolean zChanged2 = composer3.changed(o0oo0o0OooO00o);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new oOo00o0o(o0oo0o0OooO00o);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        composer3.endReplaceableGroup();
                        TextKt.m1251Text4IGK_g(str, ConstraintLayoutScope.OooO00o(companion3, o0oo0o0OooO0O0, (Function1) objRememberedValue5), jOooOOO, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131056);
                        composer3.startReplaceableGroup(-824011863);
                        if (intRef4.element <= 0) {
                            i8 = 0;
                            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(oO00OOO.main_vip_arraow_right, composer3, 0);
                            companion2 = companion3;
                            Modifier modifierOooO00o = com.facebook.OooOo00.OooO00o(12, companion2, composer3, 1157296644);
                            boolean zChanged3 = composer3.changed(o0oo0o0OooO0O0);
                            Object objRememberedValue6 = composer3.rememberedValue();
                            if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new oOo00ooO(o0oo0o0OooO0O0);
                                composer3.updateRememberedValue(objRememberedValue6);
                            }
                            composer3.endReplaceableGroup();
                            ImageKt.Image(painterPainterResource2, (String) null, o0O0O00.OooO0Oo(ConstraintLayoutScope.OooO00o(modifierOooO00o, o0oo0o0OooO0OO, (Function1) objRememberedValue6), composer3, 0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                        } else {
                            companion2 = companion3;
                            i8 = 0;
                        }
                        composer3.endReplaceableGroup();
                        Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(ConstraintLayoutScope.OooO00o(companion2, o0oo0o0OooO0O1, oO0OO00o.f55157OooO0Oo), Dp.m3765constructorimpl(36));
                        Pair pair2 = (Pair) stateObserveAsState3.getValue();
                        composer3.startReplaceableGroup(-824011106);
                        Ref.IntRef intRef5 = intRef;
                        if (pair2 == null) {
                            unit4 = null;
                        } else {
                            if (VipLevel.INSTANCE.of(((Number) pair2.getSecond()).intValue()) == VipLevel.Vip6) {
                                composer3.startReplaceableGroup(-855804930);
                                if (booleanRef.element) {
                                    composer3.startReplaceableGroup(-855804897);
                                    ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.main_ka_vip_frozen_level_6, composer3, i8), (String) null, modifierM523size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(-855804630);
                                    p154o00OoO00.OooOo00.OooO00o("svga/ic_vip6_small.svga", true, 0, null, null, modifierM523size3ABfNKs, composer3, 54, 28);
                                    composer3.endReplaceableGroup();
                                }
                                composer3.endReplaceableGroup();
                            } else {
                                composer3.startReplaceableGroup(-855804392);
                                ImageKt.Image(PainterResources_androidKt.painterResource(intRef5.element, composer3, i8), (String) null, modifierM523size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                composer3.endReplaceableGroup();
                            }
                            unit4 = Unit.INSTANCE;
                        }
                        composer3.endReplaceableGroup();
                        composer3.startReplaceableGroup(-2043293704);
                        if (unit4 == null) {
                            ImageKt.Image(PainterResources_androidKt.painterResource(intRef5.element, composer3, i8), (String) null, modifierM523size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                        }
                        composer3.endReplaceableGroup();
                    }
                    return Unit.INSTANCE;
                }
            }), measurePolicy3, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier6;
            z2 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOo000Oo(modifier2, z2, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-896364125);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-896364125, i, -1, "com.yalla.yalla.ui.screen.user.WealthAndVipItem (MyUserInfoScreen.kt:417)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            AppCompatActivity appCompatActivity = objConsume instanceof AppCompatActivity ? (AppCompatActivity) objConsume : null;
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 12;
            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(f), 0.0f, Dp.m3765constructorimpl(f), 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f2 = 8;
            float f3 = 60;
            OooO0o0(0, 0, composerStartRestartGroup, o0O0O00.OooO0O0(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, SizeKt.m509height3ABfNKs(ClipKt.clip(companion, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f2))), Dp.m3765constructorimpl(f3)), 1.0f, false, 2, null), false, false, 0L, false, null, null, null, new OooO(appCompatActivity), 255));
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
            OooO0Oo(0, 2, composerStartRestartGroup, o0O0O00.OooO0O0(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, SizeKt.m509height3ABfNKs(ClipKt.clip(companion, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f2))), Dp.m3765constructorimpl(f3)), 1.0f, false, 2, null), false, false, 0L, false, null, null, null, OooOO0.f55117OooO0Oo, 255), false);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(int i, int i2, Composer composer, Modifier modifier) {
        Modifier modifier2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-127254557);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-127254557, i, -1, "com.yalla.yalla.ui.screen.user.UserWealthView (MyUserInfoScreen.kt:804)");
            }
            o000000O o000000o2 = o000000O.f46674OooO00o;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(o000000O.OooO0oO(), composerStartRestartGroup, 8);
            final State stateObserveAsState2 = LiveDataAdapterKt.observeAsState((MutableLiveData) o000000O.f46719OoooOO0.getValue(), composerStartRestartGroup, 8);
            final State stateObserveAsState3 = LiveDataAdapterKt.observeAsState((MutableLiveData) o000000O.f46725o000oOoO.getValue(), composerStartRestartGroup, 8);
            final State stateObserveAsState4 = LiveDataAdapterKt.observeAsState(o000000O.OooO0o(), composerStartRestartGroup, 8);
            composerStartRestartGroup.startReplaceableGroup(902523976);
            final String strOooO00o = WealthLevel.Companion.isUnlocked$default(WealthLevel.INSTANCE, null, 1, null) ? o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.wealth_lv_xxx), String.valueOf((Integer) stateObserveAsState.getValue())) : StringResources_androidKt.stringResource(oO00OOo0.UnLock_Now, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierBackground$default = BackgroundKt.background$default(Modifier.INSTANCE.then(modifier3), Brush.Companion.m1633verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1660boximpl(o0oO0O0o.f47115o00O0OO), Color.m1660boximpl(o0oO0O0o.f47117o00O0OOO)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
            Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, -270267587, -3687241);
            Composer.Companion companion = Composer.INSTANCE;
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = new oO00000();
                composerStartRestartGroup.updateRememberedValue(objOooO00o);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final oO00000 oo00000 = (oO00000) objOooO00o;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Pair pairOooO0O0 = o0OO.OooO0O0(constraintLayoutScope, (MutableState) objRememberedValue2, oo00000, composerStartRestartGroup);
            MeasurePolicy measurePolicy = (MeasurePolicy) pairOooO0O0.component1();
            final Function0 function0 = (Function0) pairOooO0O0.component2();
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierBackground$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.ui.screen.user.MyUserInfoScreenKt$UserWealthView$$inlined$ConstraintLayout$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    oO0000Oo.OooO00o(semantics, oo00000);
                    return Unit.INSTANCE;
                }
            }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.user.MyUserInfoScreenKt$UserWealthView$$inlined$ConstraintLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(Composer composer2, Integer num) {
                    Object objM4213constructorimpl;
                    Object objM4213constructorimpl2;
                    Composer composer3 = composer2;
                    int iIntValue = num.intValue();
                    State state = stateObserveAsState2;
                    if (((iIntValue & 11) ^ 2) == 0 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        constraintLayoutScope2.getClass();
                        constraintLayoutScope2.OooO0Oo();
                        ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                        o0OO0O0 o0oo0o0OooO00o = oooO00oOooO0OO.OooO00o();
                        o0OO0O0 o0oo0o0OooO0O0 = oooO00oOooO0OO.OooO0O0();
                        o0OO0O0 o0oo0o0OooO0OO = oooO00oOooO0OO.OooO0OO();
                        o0OO0O0 o0oo0o0OooO0Oo = oooO00oOooO0OO.OooO0Oo();
                        o0OO0O0 o0oo0o0OooO0O1 = oooO00oOooO0OO.f4208OooO00o.OooO0O0();
                        ImageKt.Image(p417o0OoO0.o00Oo0.OooO0OO((String) stateObserveAsState3.getValue(), null, composer3, 0, 1), (String) null, SizeKt.fillMaxSize$default(ClipKt.clip(ConstraintLayoutScope.OooO00o(Modifier.INSTANCE, o0oo0o0OooO0Oo, oOo0000O.f55247OooO0Oo), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(8))), 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                        composer3.startReplaceableGroup(-492369756);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            int iOooO0OO = p591o0oo000O.OooO.OooO0OO();
                            objRememberedValue3 = Boolean.valueOf(iOooO0OO == 5 || iOooO0OO == 6);
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        composer3.endReplaceableGroup();
                        boolean zBooleanValue = ((Boolean) objRememberedValue3).booleanValue();
                        String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Wealth_Level, composer3, 0);
                        try {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM4213constructorimpl = Result.m4213constructorimpl(Integer.valueOf(android.graphics.Color.parseColor((String) state.getValue())));
                        } catch (Throwable th) {
                            Result.Companion companion3 = Result.INSTANCE;
                            objM4213constructorimpl = Result.m4213constructorimpl(ResultKt.createFailure(th));
                        }
                        Integer numValueOf = Integer.valueOf(android.graphics.Color.parseColor("#FF793F22"));
                        if (Result.m4219isFailureimpl(objM4213constructorimpl)) {
                            objM4213constructorimpl = numValueOf;
                        }
                        long jColor = ColorKt.Color(((Number) objM4213constructorimpl).intValue());
                        long sp = TextUnitKt.getSp(zBooleanValue ? 10 : 13);
                        int iM3676getStarte0LSkKk = TextAlign.INSTANCE.m3676getStarte0LSkKk();
                        FontWeight medium = FontWeight.INSTANCE.getMedium();
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        boolean zOooO00o = androidx.compose.foundation.gestures.OooO0OO.OooO00o(zBooleanValue, composer3, 511388516) | composer3.changed(o0oo0o0OooO0O1);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zOooO00o || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new oOo000o0(o0oo0o0OooO0O1, zBooleanValue);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        composer3.endReplaceableGroup();
                        TextKt.m1251Text4IGK_g(strStringResource, ConstraintLayoutScope.OooO00o(companion4, o0oo0o0OooO00o, (Function1) objRememberedValue4), jColor, sp, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(iM3676getStarte0LSkKk), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 196608, 3072, 122320);
                        try {
                            objM4213constructorimpl2 = Result.m4213constructorimpl(Integer.valueOf(android.graphics.Color.parseColor((String) state.getValue())));
                        } catch (Throwable th2) {
                            Result.Companion companion5 = Result.INSTANCE;
                            objM4213constructorimpl2 = Result.m4213constructorimpl(ResultKt.createFailure(th2));
                        }
                        Integer numValueOf2 = Integer.valueOf(android.graphics.Color.parseColor("#FF793F22"));
                        if (Result.m4219isFailureimpl(objM4213constructorimpl2)) {
                            objM4213constructorimpl2 = numValueOf2;
                        }
                        long jColor2 = ColorKt.Color(((Number) objM4213constructorimpl2).intValue());
                        long sp2 = zBooleanValue ? TextUnitKt.getSp(9) : TextUnitKt.getSp(11);
                        int iM3676getStarte0LSkKk2 = TextAlign.INSTANCE.m3676getStarte0LSkKk();
                        Modifier.Companion companion6 = Modifier.INSTANCE;
                        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                        composer3.startReplaceableGroup(511388516);
                        boolean zChanged = composer3.changed(boolValueOf) | composer3.changed(o0oo0o0OooO00o);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new oO0(o0oo0o0OooO00o, zBooleanValue);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        composer3.endReplaceableGroup();
                        TextKt.m1251Text4IGK_g(strOooO00o, ConstraintLayoutScope.OooO00o(companion6, o0oo0o0OooO0O0, (Function1) objRememberedValue5), jColor2, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(iM3676getStarte0LSkKk2), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 3072, 122352);
                        composer3.startReplaceableGroup(1702060540);
                        if (!WealthLevel.Companion.isUnlocked$default(WealthLevel.INSTANCE, null, 1, null)) {
                            Painter painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.main_vip_arraow_right, composer3, 0);
                            Modifier modifierOooO00o = com.facebook.OooOo00.OooO00o(12, companion6, composer3, 1157296644);
                            boolean zChanged2 = composer3.changed(o0oo0o0OooO0O0);
                            Object objRememberedValue6 = composer3.rememberedValue();
                            if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new oO0O000(o0oo0o0OooO0O0);
                                composer3.updateRememberedValue(objRememberedValue6);
                            }
                            composer3.endReplaceableGroup();
                            ImageKt.Image(painterPainterResource, (String) null, o0O0O00.OooO0Oo(ConstraintLayoutScope.OooO00o(modifierOooO00o, o0oo0o0OooO0OO, (Function1) objRememberedValue6), composer3, 0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                        }
                        composer3.endReplaceableGroup();
                        String str = (String) stateObserveAsState4.getValue();
                        composer3.startReplaceableGroup(902527139);
                        if (str != null) {
                            p154o00OoO00.OooOo00.OooO00o(str, true, 0, null, null, SizeKt.m523size3ABfNKs(ConstraintLayoutScope.OooO00o(companion6, o0oo0o0OooO0O1, oO0O000o.f55145OooO0Oo), Dp.m3765constructorimpl(36)), composer3, 48, 28);
                        }
                        composer3.endReplaceableGroup();
                    }
                    return Unit.INSTANCE;
                }
            }), measurePolicy, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO0O00(modifier2, i, i2));
    }

    public static final void OooO0oO(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1646919327);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1646919327, i, -1, "com.yalla.yalla.ui.screen.user.MyInfoData (MyUserInfoScreen.kt:634)");
            }
            Modifier modifierOooO00o = p153o00OoO0.OooOO0.OooO00o(60, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 693286680);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState((MutableLiveData) o000000O.f46684OooOO0o.getValue(), 0, composerStartRestartGroup, 56);
            SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
            LiveData<Integer> newVisitorNum = sharedMainMessageManager.getNewVisitorNum();
            Intrinsics.checkNotNull(newVisitorNum);
            State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(newVisitorNum, 0, composerStartRestartGroup, 56);
            Integer visitorNum = (Integer) stateObserveAsState.getValue();
            Intrinsics.checkNotNullExpressionValue(visitorNum, "visitorNum");
            OooO00o(rowScopeInstance, visitorNum.intValue(), (Integer) stateObserveAsState2.getValue(), StringResources_androidKt.stringResource(oO00OOo0.Visitors, composerStartRestartGroup, 0), oO0000O.f55087OooO0Oo, composerStartRestartGroup, 24582);
            State stateObserveAsState3 = LiveDataAdapterKt.observeAsState((MutableLiveData) o000000O.f46686OooOOO0.getValue(), 0, composerStartRestartGroup, 56);
            Integer followingNum = (Integer) stateObserveAsState3.getValue();
            Intrinsics.checkNotNullExpressionValue(followingNum, "followingNum");
            int iIntValue = followingNum.intValue();
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Following, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(stateObserveAsState3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new oO0000Oo(stateObserveAsState3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO00o(rowScopeInstance, iIntValue, 0, strStringResource, (Function0) objRememberedValue, composerStartRestartGroup, 390);
            State stateObserveAsState4 = LiveDataAdapterKt.observeAsState((MutableLiveData) o000000O.f46685OooOOO.getValue(), 0, composerStartRestartGroup, 56);
            LiveData<Integer> newFansNum = sharedMainMessageManager.getNewFansNum();
            Intrinsics.checkNotNull(newFansNum);
            State stateObserveAsState5 = LiveDataAdapterKt.observeAsState(newFansNum, 0, composerStartRestartGroup, 56);
            Integer fansNum = (Integer) stateObserveAsState4.getValue();
            Intrinsics.checkNotNullExpressionValue(fansNum, "fansNum");
            int iIntValue2 = fansNum.intValue();
            Integer num = (Integer) stateObserveAsState5.getValue();
            String strStringResource2 = StringResources_androidKt.stringResource(oO00OOo0.Followers, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(stateObserveAsState5);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new oO0000o0(stateObserveAsState5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO00o(rowScopeInstance, iIntValue2, num, strStringResource2, (Function0) objRememberedValue2, composerStartRestartGroup, 6);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO000(i));
    }

    public static final void OooO0oo(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1331379708);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1331379708, i, -1, "com.yalla.yalla.ui.screen.user.MyInfoFunctionBlock (MyUserInfoScreen.kt:548)");
            }
            float f = 16;
            Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(PaddingKt.m478paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f))), 0.0f, Dp.m3765constructorimpl(f), 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
            MediatorLiveData<Boolean> drawerTaskDot = sharedMainMessageManager.getDrawerTaskDot();
            Intrinsics.checkNotNull(drawerTaskDot);
            Boolean bool = Boolean.FALSE;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(drawerTaskDot, bool, composerStartRestartGroup, 56);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.ic_my_info_task, composerStartRestartGroup, 0);
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.title_tasks, composerStartRestartGroup, 0);
            Boolean haveNewTask = (Boolean) stateObserveAsState.getValue();
            Intrinsics.checkNotNullExpressionValue(haveNewTask, "haveNewTask");
            OooO0O0(rowScopeInstance, painterPainterResource, strStringResource, haveNewTask.booleanValue(), oO000O0O.f55120OooO0Oo, composerStartRestartGroup, 24646, 0);
            MediatorLiveData<Boolean> storeDot = sharedMainMessageManager.getStoreDot();
            Intrinsics.checkNotNull(storeDot);
            State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(storeDot, bool, composerStartRestartGroup, 56);
            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(oO00OOO.ic_my_info_store, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(oO00OOo0.store, composerStartRestartGroup, 0);
            Boolean haveNewStore = (Boolean) stateObserveAsState2.getValue();
            Intrinsics.checkNotNullExpressionValue(haveNewStore, "haveNewStore");
            OooO0O0(rowScopeInstance, painterPainterResource2, strStringResource2, haveNewStore.booleanValue(), oO0Ooooo.f55169OooO0Oo, composerStartRestartGroup, 24646, 0);
            OooO0O0(rowScopeInstance, PainterResources_androidKt.painterResource(oO00OOO.ic_my_info_outfit, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(oO00OOo0.My_Items, composerStartRestartGroup, 0), false, oO0o0o.f55172OooO0Oo, composerStartRestartGroup, 24646, 4);
            OooO0O0(rowScopeInstance, PainterResources_androidKt.painterResource(oO00OOO.ic_my_info_livel, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(oO00OOo0.Level, composerStartRestartGroup, 0), false, oO0Oo0oo.f55167OooO0Oo, composerStartRestartGroup, 24646, 4);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO000OOo(i));
    }

    public static final void OooOO0(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(689799274);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(689799274, i, -1, "com.yalla.yalla.ui.screen.user.MyInfoPremiumAndBadge (MyUserInfoScreen.kt:267)");
            }
            float f = 16;
            Modifier modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(PaddingKt.m478paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f)));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MediatorLiveData<Boolean> premiumDot = SharedMainMessageManager.INSTANCE.getPremiumDot();
            Intrinsics.checkNotNull(premiumDot);
            float f2 = 0;
            OooO0OO(PainterResources_androidKt.painterResource(oO00OOO.ic_my_info_premium, composerStartRestartGroup, 0), false, StringResources_androidKt.stringResource(oO00OOo0.Yalla_Premium, composerStartRestartGroup, 0), Intrinsics.areEqual((Boolean) LiveDataAdapterKt.observeAsState(premiumDot, composerStartRestartGroup, 8).getValue(), Boolean.TRUE), null, o0OOooO0.f55058OooO0o0, RoundedCornerShapeKt.m728RoundedCornerShapea9UjIt4(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2)), null, null, oO000Oo.f55122OooO0Oo, composerStartRestartGroup, 805502984, YallaTeamMessage.JumpId.YallaPremium_Knight);
            OooO0OO(PainterResources_androidKt.painterResource(oO00OOO.ic_my_info_badge, composerStartRestartGroup, 0), false, StringResources_androidKt.stringResource(oO00OOo0.UserInfo_Badge, composerStartRestartGroup, 0), false, null, null, RoundedCornerShapeKt.m728RoundedCornerShapea9UjIt4(Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f)), null, null, oO000o00.f55124OooO0Oo, composerStartRestartGroup, 805306376, 442);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO0O0OoO(i));
    }

    public static final void OooOO0O(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1662123024);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1662123024, i, -1, "com.yalla.yalla.ui.screen.user.MyInfoWallet (MyUserInfoScreen.kt:188)");
            }
            float f = 16;
            Modifier modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(PaddingKt.m478paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f)));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f2 = 0;
            OooO0OO(PainterResources_androidKt.painterResource(oO00OOO.ic_my_info_wallet, composerStartRestartGroup, 0), false, StringResources_androidKt.stringResource(oO00OOo0.nav_title_wallet, composerStartRestartGroup, 0), false, o0OOooO0.f55055OooO0OO, o0OOooO0.f55056OooO0Oo, RoundedCornerShapeKt.m728RoundedCornerShapea9UjIt4(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2)), null, null, oO00O0o0.f55126OooO0Oo, composerStartRestartGroup, 805527560, 394);
            OooO0o(composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO00O0o(i));
    }

    public static final void OooOO0o(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1278679189);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1278679189, i, -1, "com.yalla.yalla.ui.screen.user.MyUserInfoOtherContent (MyUserInfoScreen.kt:327)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentActivity fragmentActivity = (FragmentActivity) objConsume;
            float f = 16;
            Modifier modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxWidth$default(PaddingKt.m478paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f)));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f2 = 0;
            OooO0OO(PainterResources_androidKt.painterResource(oOo00OO0.ic_user_language, composerStartRestartGroup, 0), true, StringResources_androidKt.stringResource(oO00OOo0.languge, composerStartRestartGroup, 0), false, null, o0OOooO0.f55057OooO0o, RoundedCornerShapeKt.m728RoundedCornerShapea9UjIt4(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2)), null, oOo00OO0.f55254OooO0Oo, new oO00O0oO(fragmentActivity), composerStartRestartGroup, 100859960, Constants.ERR_PUBLISH_STREAM_NUM_REACH_LIMIT);
            composerStartRestartGroup.startReplaceableGroup(-1681105799);
            if (o00Oo0.OooO00o().OooO0O0("redemptionCodeIsOpenCDK", false)) {
                OooO0OO(PainterResources_androidKt.painterResource(oOo00OO0.ic_user_redemption_code, composerStartRestartGroup, 0), true, StringResources_androidKt.stringResource(oO00OOo0.Redemption_code, composerStartRestartGroup, 0), false, null, null, null, null, null, oO00OO0O.f55128OooO0Oo, composerStartRestartGroup, 805306424, 504);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO0OO(PainterResources_androidKt.painterResource(oOo00OO0.ic_user_faq, composerStartRestartGroup, r14), true, StringResources_androidKt.stringResource(oO00OOo0.help, composerStartRestartGroup, r14), false, null, null, null, null, null, new oO00OOOo(fragmentActivity), composerStartRestartGroup, 56, 504);
            OooO0OO(PainterResources_androidKt.painterResource(oOo00OO0.ic_user_setting, composerStartRestartGroup, r14), true, StringResources_androidKt.stringResource(oO00OOo0.nav_title_setting, composerStartRestartGroup, 0), false, null, o0OOooO0.f55059OooO0oO, RoundedCornerShapeKt.m728RoundedCornerShapea9UjIt4(Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f)), null, null, oO00OOo0.f55131OooO0Oo, composerStartRestartGroup, 805503032, 408);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO00Oo00(i));
    }

    public static final long OooOOO(int i) {
        switch (OooOOO0.$EnumSwitchMapping$0[VipLevel.INSTANCE.of(i).ordinal()]) {
            case 1:
                return o0oO0O0o.f47103o00O000;
            case 2:
                return o0oO0O0o.f47105o00O000o;
            case 3:
                return o0oO0O0o.f47102o00O00;
            case 4:
                return o0oO0O0o.f47106o00O00O;
            case 5:
                return o0oO0O0o.f47173oOO00O;
            case 6:
                return o0oO0O0o.f47107o00O00OO;
            default:
                return o0oO0O0o.f47103o00O000;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOOO0(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2048924169);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2048924169, i, -1, "com.yalla.yalla.ui.screen.user.MyUserInfoScreenContent (MyUserInfoScreen.kt:120)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion2, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MyUserInfoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MyUserInfoVM myUserInfoVM = (MyUserInfoVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(myUserInfoVM);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new oO00Oo0(myUserInfoVM);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            com.code.android.util.o00Oo0.OooO0O0((Function1) objRememberedValue, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl3, currentCompositionLocalMap3);
            if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(1508325498);
            if (((Boolean) composerStartRestartGroup.consume(o000OOo.f37692OooO00o)).booleanValue()) {
                ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_my_info_bg_header, composerStartRestartGroup, 0), (String) null, boxScopeInstance.matchParentSize(companion), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            }
            composerStartRestartGroup.endReplaceableGroup();
            t1.OooO00o(null, 0.0f, 0L, null, null, null, null, null, null, composerStartRestartGroup, 0, 511);
            o000oOoO.OooO00o(composerStartRestartGroup);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{OverscrollConfigurationKt.getLocalOverscrollConfiguration().provides(null)}, o0OOooO0.f55054OooO0O0, composerStartRestartGroup, 56);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue2;
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new oOOoOOO0(mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 70);
            composerStartRestartGroup.startReplaceableGroup(2106250548);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                j0 j0Var = j0.f49918OooO00o;
                MyUserInfoScreen myUserInfoScreen = MyUserInfoScreen.INSTANCE;
                long jM4203getLanguageSizeYbymL2g = myUserInfoScreen.m4203getLanguageSizeYbymL2g();
                long jM4202getLanguageLocationnOccac = myUserInfoScreen.m4202getLanguageLocationnOccac();
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged3 = composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue4 == companion4.getEmpty()) {
                    objRememberedValue4 = new oO00o000(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                j0Var.OooO0O0(jM4203getLanguageSizeYbymL2g, jM4202getLanguageLocationnOccac, (Function0) objRememberedValue4, composerStartRestartGroup, 3072);
            }
            if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO00o00(i));
    }
}
