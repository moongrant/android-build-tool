package com.yalla.yalla.module.event.ui.screen;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.LocalSoftwareKeyboardController;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000OO00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.event.EventCreateStateModel;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.event.EventTagModel;
import com.yalla.yalla.module.event.vm.EventCreateViewModel;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import io.agora.rtc.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o000O000;
import p442o0OoOoO0.oo0O;
import p446o0OoOoo0.o0O0o000;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.t0;
import p507o0o00ooo.t1;
import p519o0o0O0oO.a;
import p519o0o0O0oO.o0O0o0;
import p526o0o0OOO0.o00O;
import p526o0o0OOO0.o00O00O;
import p526o0o0OOO0.oo0oOO0;
import p579o0oOoo.oO000OOo;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p601o0oo0O0.o000OO;
import p641o0ooOOOO.i1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u001e\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u000f\u0010\b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u000f\u0010\u0010\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\tJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0013\u0010\tJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0015\u0010\tJ\u0013\u0010\u0017\u001a\u00020\u0006*\u00020\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001c\u0010\u001f\u001a\u00020\u00062\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0013\u0010!\u001a\u00020\u0006*\u00020 H\u0017¢\u0006\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/yalla/yalla/module/event/ui/screen/EventCreateScreen;", "Lo0o0OOO0/o00O00O;", "Lcom/yalla/yalla/model/event/EventModel;", "event", "Lcom/yalla/yalla/model/event/EventCreateStateModel;", "eventCreate", "", "navigate", "EventCreateToolbar", "(Landroidx/compose/runtime/Composer;I)V", "EventCreateContent", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/yalla/yalla/module/event/vm/EventCreateViewModel;", "vm", "getImagePath", "EventCreateHeader", "EventCreateName", "EventCreateTag", "EventCreateTime", "EventCreateRoom", "EventCreateDescribe", "Landroidx/compose/foundation/layout/BoxScope;", "EventCreateButton", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "toEventCreate", "createEvent", "copyEvent", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "<init>", "()V", "Event_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEventCreateScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventCreateScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventCreateScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 14 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,827:1\n76#2:828\n76#2:1281\n76#2:1566\n76#2:1630\n36#3:829\n456#3,8:864\n464#3,3:878\n467#3,3:882\n25#3:887\n36#3:894\n456#3,8:918\n464#3,3:932\n456#3,8:954\n464#3,3:968\n467#3,3:974\n467#3,3:979\n456#3,8:1012\n464#3,3:1026\n456#3,8:1051\n464#3,3:1065\n456#3,8:1084\n464#3,3:1098\n467#3,3:1106\n467#3,3:1111\n467#3,3:1118\n456#3,8:1153\n464#3,3:1167\n456#3,8:1190\n464#3,3:1204\n467#3,3:1210\n467#3,3:1215\n456#3,8:1250\n464#3,3:1264\n467#3,3:1275\n456#3,8:1308\n464#3,3:1322\n467#3,3:1333\n456#3,8:1367\n464#3,3:1381\n456#3,8:1400\n464#3,3:1414\n467#3,3:1420\n456#3,8:1439\n464#3,3:1453\n467#3,3:1459\n467#3,3:1465\n456#3,8:1502\n464#3,3:1516\n456#3,8:1536\n464#3,3:1550\n467#3,3:1555\n467#3,3:1560\n25#3:1582\n456#3,8:1612\n464#3,3:1626\n456#3,8:1646\n464#3,3:1660\n467#3,3:1664\n467#3,3:1669\n1097#4,6:830\n1097#4,6:888\n1097#4,6:895\n1097#4,3:1583\n1100#4,3:1589\n81#5,11:836\n81#5,11:984\n81#5,11:1123\n81#5,11:1221\n81#5,11:1282\n81#5,11:1339\n81#5,11:1470\n81#5,11:1567\n66#6,6:847\n72#6:881\n76#6:886\n66#6,6:995\n72#6:1029\n66#6,6:1034\n72#6:1068\n76#6:1115\n76#6:1122\n66#6,6:1595\n72#6:1629\n76#6:1673\n78#7,11:853\n91#7:885\n78#7,11:907\n78#7,11:943\n91#7:977\n91#7:982\n78#7,11:1001\n78#7,11:1040\n78#7,11:1073\n91#7:1109\n91#7:1114\n91#7:1121\n78#7,11:1142\n78#7,11:1179\n91#7:1213\n91#7:1218\n78#7,11:1239\n91#7:1278\n78#7,11:1297\n91#7:1336\n78#7,11:1356\n78#7,11:1389\n91#7:1423\n78#7,11:1428\n91#7:1462\n91#7:1468\n78#7,11:1491\n78#7,11:1525\n91#7:1558\n91#7:1563\n78#7,11:1601\n78#7,11:1635\n91#7:1667\n91#7:1672\n4144#8,6:872\n4144#8,6:926\n4144#8,6:962\n4144#8,6:1020\n4144#8,6:1059\n4144#8,6:1092\n4144#8,6:1161\n4144#8,6:1198\n4144#8,6:1258\n4144#8,6:1316\n4144#8,6:1375\n4144#8,6:1408\n4144#8,6:1447\n4144#8,6:1510\n4144#8,6:1544\n4144#8,6:1620\n4144#8,6:1654\n72#9,6:901\n78#9:935\n72#9,6:937\n78#9:971\n82#9:978\n82#9:983\n72#9,6:1350\n78#9:1384\n82#9:1469\n72#9,6:1485\n78#9:1519\n82#9:1564\n154#10:936\n154#10:972\n154#10:973\n154#10:1030\n154#10:1032\n154#10:1069\n154#10:1070\n154#10:1102\n154#10:1103\n154#10:1104\n154#10:1105\n154#10:1116\n154#10:1117\n154#10:1134\n154#10:1135\n154#10:1171\n154#10:1172\n154#10:1208\n154#10:1209\n154#10:1220\n154#10:1232\n154#10:1233\n154#10:1234\n154#10:1235\n154#10:1236\n154#10:1268\n154#10:1269\n154#10:1270\n154#10:1271\n154#10:1272\n154#10:1273\n154#10:1274\n154#10:1280\n154#10:1293\n154#10:1294\n154#10:1326\n154#10:1327\n154#10:1328\n154#10:1329\n154#10:1330\n154#10:1331\n154#10:1332\n154#10:1338\n154#10:1385\n154#10:1386\n154#10:1418\n154#10:1419\n154#10:1425\n154#10:1457\n154#10:1458\n154#10:1464\n154#10:1481\n154#10:1482\n154#10:1483\n154#10:1484\n154#10:1520\n154#10:1521\n154#10:1522\n154#10:1554\n154#10:1565\n154#10:1593\n154#10:1594\n164#10:1631\n154#10:1632\n51#11:1031\n51#11:1033\n77#12,2:1071\n79#12:1101\n83#12:1110\n73#12,6:1136\n79#12:1170\n73#12,6:1173\n79#12:1207\n83#12:1214\n83#12:1219\n77#12,2:1237\n79#12:1267\n83#12:1279\n77#12,2:1295\n79#12:1325\n83#12:1337\n77#12,2:1387\n79#12:1417\n83#12:1424\n77#12,2:1426\n79#12:1456\n83#12:1463\n77#12,2:1523\n79#12:1553\n83#12:1559\n77#12,2:1633\n79#12:1663\n83#12:1668\n486#13,4:1578\n490#13,2:1586\n494#13:1592\n486#14:1588\n*S KotlinDebug\n*F\n+ 1 EventCreateScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventCreateScreen\n*L\n133#1:828\n510#1:1281\n759#1:1566\n772#1:1630\n134#1:829\n145#1:864,8\n145#1:878,3\n145#1:882,3\n181#1:887\n195#1:894\n190#1:918,8\n190#1:932,3\n211#1:954,8\n211#1:968,3\n211#1:974,3\n190#1:979,3\n269#1:1012,8\n269#1:1026,3\n295#1:1051,8\n295#1:1065,3\n306#1:1084,8\n306#1:1098,3\n306#1:1106,3\n295#1:1111,3\n269#1:1118,3\n371#1:1153,8\n371#1:1167,3\n416#1:1190,8\n416#1:1204,3\n416#1:1210,3\n371#1:1215,3\n454#1:1250,8\n454#1:1264,3\n454#1:1275,3\n521#1:1308,8\n521#1:1322,3\n521#1:1333,3\n617#1:1367,8\n617#1:1381,3\n629#1:1400,8\n629#1:1414,3\n629#1:1420,3\n650#1:1439,8\n650#1:1453,3\n650#1:1459,3\n617#1:1465,3\n685#1:1502,8\n685#1:1516,3\n729#1:1536,8\n729#1:1550,3\n729#1:1555,3\n685#1:1560,3\n761#1:1582\n763#1:1612,8\n763#1:1626,3\n773#1:1646,8\n773#1:1660,3\n773#1:1664,3\n763#1:1669,3\n134#1:830,6\n181#1:888,6\n195#1:895,6\n761#1:1583,3\n761#1:1589,3\n135#1:836,11\n268#1:984,11\n363#1:1123,11\n445#1:1221,11\n513#1:1282,11\n615#1:1339,11\n677#1:1470,11\n760#1:1567,11\n145#1:847,6\n145#1:881\n145#1:886\n269#1:995,6\n269#1:1029\n295#1:1034,6\n295#1:1068\n295#1:1115\n269#1:1122\n763#1:1595,6\n763#1:1629\n763#1:1673\n145#1:853,11\n145#1:885\n190#1:907,11\n211#1:943,11\n211#1:977\n190#1:982\n269#1:1001,11\n295#1:1040,11\n306#1:1073,11\n306#1:1109\n295#1:1114\n269#1:1121\n371#1:1142,11\n416#1:1179,11\n416#1:1213\n371#1:1218\n454#1:1239,11\n454#1:1278\n521#1:1297,11\n521#1:1336\n617#1:1356,11\n629#1:1389,11\n629#1:1423\n650#1:1428,11\n650#1:1462\n617#1:1468\n685#1:1491,11\n729#1:1525,11\n729#1:1558\n685#1:1563\n763#1:1601,11\n773#1:1635,11\n773#1:1667\n763#1:1672\n145#1:872,6\n190#1:926,6\n211#1:962,6\n269#1:1020,6\n295#1:1059,6\n306#1:1092,6\n371#1:1161,6\n416#1:1198,6\n454#1:1258,6\n521#1:1316,6\n617#1:1375,6\n629#1:1408,6\n650#1:1447,6\n685#1:1510,6\n729#1:1544,6\n763#1:1620,6\n773#1:1654,6\n190#1:901,6\n190#1:935\n211#1:937,6\n211#1:971\n211#1:978\n190#1:983\n617#1:1350,6\n617#1:1384\n617#1:1469\n685#1:1485,6\n685#1:1519\n685#1:1564\n213#1:936\n221#1:972\n227#1:973\n288#1:1030\n300#1:1032\n309#1:1069\n310#1:1070\n326#1:1102\n332#1:1103\n334#1:1104\n340#1:1105\n352#1:1116\n353#1:1117\n364#1:1134\n370#1:1135\n412#1:1171\n417#1:1172\n424#1:1208\n431#1:1209\n439#1:1220\n447#1:1232\n453#1:1233\n456#1:1234\n457#1:1235\n472#1:1236\n479#1:1268\n481#1:1269\n489#1:1270\n492#1:1271\n493#1:1272\n495#1:1273\n500#1:1274\n503#1:1280\n514#1:1293\n520#1:1294\n566#1:1326\n568#1:1327\n571#1:1328\n572#1:1329\n573#1:1330\n604#1:1331\n606#1:1332\n610#1:1338\n622#1:1385\n628#1:1386\n640#1:1418\n641#1:1419\n649#1:1425\n661#1:1457\n662#1:1458\n670#1:1464\n678#1:1481\n684#1:1482\n687#1:1483\n689#1:1484\n723#1:1520\n725#1:1521\n731#1:1522\n746#1:1554\n754#1:1565\n766#1:1593\n767#1:1594\n775#1:1631\n776#1:1632\n288#1:1031\n300#1:1033\n306#1:1071,2\n306#1:1101\n306#1:1110\n371#1:1136,6\n371#1:1170\n416#1:1173,6\n416#1:1207\n416#1:1214\n371#1:1219\n454#1:1237,2\n454#1:1267\n454#1:1279\n521#1:1295,2\n521#1:1325\n521#1:1337\n629#1:1387,2\n629#1:1417\n629#1:1424\n650#1:1426,2\n650#1:1456\n650#1:1463\n729#1:1523,2\n729#1:1553\n729#1:1559\n773#1:1633,2\n773#1:1663\n773#1:1668\n761#1:1578,4\n761#1:1586,2\n761#1:1592\n761#1:1588\n*E\n"})
public final class EventCreateScreen extends o00O00O {
    public static final int $stable = 0;

    @NotNull
    public static final EventCreateScreen INSTANCE = new EventCreateScreen();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f23656OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f23657OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(BoxScope boxScope, int i) {
            super(2);
            this.f23657OooO0o0 = boxScope;
            this.f23656OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23656OooO0o | 1);
            EventCreateScreen.this.EventCreateButton(this.f23657OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.event.ui.screen.EventCreateScreen$Content$1", f = "EventCreateScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23658OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(EventCreateViewModel eventCreateViewModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f23658OooO0Oo = eventCreateViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f23658OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f23658OooO0Oo.m4199getTagList();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f23660OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f23661OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ColumnScope columnScope, int i) {
            super(2);
            this.f23661OooO0o0 = columnScope;
            this.f23660OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23660OooO0o | 1);
            EventCreateScreen.this.Content(this.f23661OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ EventModel f23662OooO00o;

        public OooO0OO(EventModel eventModel) {
            this.f23662OooO00o = eventModel;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.OooOo.OooO0O0(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public final <T extends ViewModel> T create(@NotNull Class<T> modelClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            T tNewInstance = modelClass.getConstructor(EventModel.class).newInstance(this.f23662OooO00o);
            Intrinsics.checkNotNullExpressionValue(tNewInstance, "modelClass.getConstructo… .newInstance(eventModel)");
            return tNewInstance;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f23663OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f23664OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23665OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(LifecycleOwner lifecycleOwner, EventCreateViewModel eventCreateViewModel, CoroutineScope coroutineScope) {
            super(0);
            this.f23663OooO0Oo = lifecycleOwner;
            this.f23665OooO0o0 = eventCreateViewModel;
            this.f23664OooO0o = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            EventCreateScreen.INSTANCE.toEventCreate(this.f23663OooO0Oo, this.f23665OooO0o0, this.f23664OooO0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<MotionEvent, Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SoftwareKeyboardController f23666OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(SoftwareKeyboardController softwareKeyboardController) {
            super(1);
            this.f23666OooO0Oo = softwareKeyboardController;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean z;
            MotionEvent it = motionEvent;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getAction() == 0) {
                SoftwareKeyboardController softwareKeyboardController = this.f23666OooO0Oo;
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.hide();
                }
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23668OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i) {
            super(2);
            this.f23668OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23668OooO0o0 | 1);
            EventCreateScreen.this.EventCreateContent(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23669OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(EventCreateViewModel eventCreateViewModel) {
            super(1);
            this.f23669OooO0Oo = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            EventCreateViewModel eventCreateViewModel = this.f23669OooO0Oo;
            String describe = eventCreateViewModel.getDescribe();
            if (!StringsKt.isBlank(it)) {
                eventCreateViewModel.setDescribe("");
            }
            if (it.length() <= eventCreateViewModel.getMaxCountDescribe()) {
                eventCreateViewModel.setDescribe(it);
            } else {
                eventCreateViewModel.setDescribe(describe);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<FocusState, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23670OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(EventCreateViewModel eventCreateViewModel) {
            super(1);
            this.f23670OooO0Oo = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FocusState focusState) {
            FocusState it = focusState;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f23670OooO0Oo.setDescribeHasFocus(it.getHasFocus());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23671OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(EventCreateViewModel eventCreateViewModel) {
            super(3);
            this.f23671OooO0Oo = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            Composer composer2;
            Function2<? super Composer, ? super Integer, ? extends Unit> innerTextField = function2;
            Composer composer3 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer3.changedInstance(innerTextField) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && composer3.getSkipping()) {
                composer3.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1328598280, i, -1, "com.yalla.yalla.module.event.ui.screen.EventCreateScreen.EventCreateDescribe.<anonymous>.<anonymous> (EventCreateScreen.kt:706)");
                }
                composer3.startReplaceableGroup(1428098741);
                String describe = this.f23671OooO0Oo.getDescribe();
                if (describe == null || describe.length() == 0) {
                    composer2 = composer3;
                    TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.event_describe_hint, composer3, 0), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composer3).f37714OooOOO0, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                } else {
                    composer2 = composer3;
                }
                composer2.endReplaceableGroup();
                if (androidx.compose.animation.OooOO0O.OooO00o(i & 14, innerTextField, composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23673OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(int i) {
            super(2);
            this.f23673OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23673OooO0o0 | 1);
            EventCreateScreen.this.EventCreateDescribe(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23674OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(EventCreateViewModel eventCreateViewModel) {
            super(0);
            this.f23674OooO0Oo = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23674OooO0Oo.setDescribe("");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEventCreateScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventCreateScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventCreateScreen$EventCreateHeader$1$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,827:1\n1#2:828\n*E\n"})
    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SoftwareKeyboardController f23675OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23676OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f23677OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(SoftwareKeyboardController softwareKeyboardController, FragmentActivity fragmentActivity, EventCreateViewModel eventCreateViewModel) {
            super(0);
            this.f23675OooO0Oo = softwareKeyboardController;
            this.f23677OooO0o0 = fragmentActivity;
            this.f23676OooO0o = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SoftwareKeyboardController softwareKeyboardController = this.f23675OooO0Oo;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            FragmentActivity fragmentActivity = this.f23677OooO0o0;
            if (fragmentActivity != null) {
                EventCreateScreen.INSTANCE.getImagePath(fragmentActivity, this.f23676OooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f23678OooO0Oo = new Oooo000();

        public Oooo000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            p417o0OoO0.o00Oo0.OooO0o0(it, oOo00OO0.ic_event_default_head_bg);
            it.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.event.ui.screen.EventCreateScreen$toEventCreate$1", f = "EventCreateScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23679OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f23680OooO0o0;

        public static final class OooO00o extends Lambda implements Function1<Long, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ EventCreateViewModel f23681OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EventCreateViewModel eventCreateViewModel) {
                super(1);
                this.f23681OooO0Oo = eventCreateViewModel;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Long l) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("roomid", String.valueOf(this.f23681OooO0Oo.getRoomId()));
                linkedHashMap.put("roomeventid", String.valueOf(l));
                LiveEventBus.get("EVENT_CREATE_SUCCESS").post(linkedHashMap);
                oo0oOO0.OooO0o(null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00000(EventCreateViewModel eventCreateViewModel, LifecycleOwner lifecycleOwner, Continuation<? super o00000> continuation) {
            super(2, continuation);
            this.f23679OooO0Oo = eventCreateViewModel;
            this.f23680OooO0o0 = lifecycleOwner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00000(this.f23679OooO0Oo, this.f23680OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            EventCreateViewModel eventCreateViewModel = this.f23679OooO0Oo;
            o000O000.OooO0Oo(eventCreateViewModel.create(eventCreateViewModel.getCreateToken(), String.valueOf(eventCreateViewModel.getRoomId())), this.f23680OooO0o0, false, null, null, new OooO00o(eventCreateViewModel), 14);
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23682OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000(EventCreateViewModel eventCreateViewModel) {
            super(0);
            this.f23682OooO0Oo = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23682OooO0Oo.setShowPermission(false);
            return Unit.INSTANCE;
        }
    }

    public static final class o000000O extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f23683OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23684OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(FragmentActivity fragmentActivity, EventCreateViewModel eventCreateViewModel) {
            super(1);
            this.f23683OooO0Oo = fragmentActivity;
            this.f23684OooO0o0 = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            EventCreateViewModel eventCreateViewModel = this.f23684OooO0o0;
            if (zBooleanValue) {
                o00O0OO.OooO0o.OooO0OO(this.f23683OooO0Oo, 16.0f, 9.0f, true, true, new com.yalla.yalla.module.event.ui.screen.OooO0o(eventCreateViewModel));
            } else {
                eventCreateViewModel.setShowPermission(false);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000OOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23686OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(int i) {
            super(2);
            this.f23686OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23686OooO0o0 | 1);
            EventCreateScreen.this.EventCreateToolbar(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEventCreateScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventCreateScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventCreateScreen$EventCreateHeader$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,827:1\n1#2:828\n*E\n"})
    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SoftwareKeyboardController f23687OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23688OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f23689OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(SoftwareKeyboardController softwareKeyboardController, FragmentActivity fragmentActivity, EventCreateViewModel eventCreateViewModel) {
            super(0);
            this.f23687OooO0Oo = softwareKeyboardController;
            this.f23689OooO0o0 = fragmentActivity;
            this.f23688OooO0o = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SoftwareKeyboardController softwareKeyboardController = this.f23687OooO0Oo;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            FragmentActivity fragmentActivity = this.f23689OooO0o0;
            if (fragmentActivity != null) {
                EventCreateScreen.INSTANCE.getImagePath(fragmentActivity, this.f23688OooO0o);
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nEventCreateScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventCreateScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventCreateScreen$EventCreateName$1$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,827:1\n429#2:828\n502#2,5:829\n*S KotlinDebug\n*F\n+ 1 EventCreateScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventCreateScreen$EventCreateName$1$1\n*L\n381#1:828\n381#1:829,5\n*E\n"})
    public static final class o00O0O extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23690OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(EventCreateViewModel eventCreateViewModel) {
            super(1);
            this.f23690OooO0Oo = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            EventCreateViewModel eventCreateViewModel = this.f23690OooO0Oo;
            String name = eventCreateViewModel.getName();
            StringBuilder sb = new StringBuilder();
            int length = it.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                char cCharAt = it.charAt(i);
                if (cCharAt != '\n') {
                    sb.append(cCharAt);
                }
                i++;
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "filterTo(StringBuilder(), predicate).toString()");
            if (!StringsKt.isBlank(it)) {
                eventCreateViewModel.setName("");
            }
            if (string.length() <= eventCreateViewModel.getMaxCountName()) {
                eventCreateViewModel.setName(string);
            } else {
                eventCreateViewModel.setName(name);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23691OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(EventCreateViewModel eventCreateViewModel) {
            super(3);
            this.f23691OooO0Oo = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            Composer composer2;
            Function2<? super Composer, ? super Integer, ? extends Unit> innerTextField = function2;
            Composer composer3 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer3.changedInstance(innerTextField) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && composer3.getSkipping()) {
                composer3.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2145702794, i, -1, "com.yalla.yalla.module.event.ui.screen.EventCreateScreen.EventCreateName.<anonymous>.<anonymous> (EventCreateScreen.kt:394)");
                }
                composer3.startReplaceableGroup(224983272);
                String name = this.f23691OooO0Oo.getName();
                if (name == null || name.length() == 0) {
                    composer2 = composer3;
                    TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.event_name_hint, composer3, 0), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composer3).f37714OooOOO0, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 3072, 122866);
                } else {
                    composer2 = composer3;
                }
                composer2.endReplaceableGroup();
                if (androidx.compose.animation.OooOO0O.OooO00o(i & 14, innerTextField, composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23692OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(EventCreateViewModel eventCreateViewModel) {
            super(0);
            this.f23692OooO0Oo = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23692OooO0Oo.setName("");
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23694OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(int i) {
            super(2);
            this.f23694OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23694OooO0o0 | 1);
            EventCreateScreen.this.EventCreateRoom(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23696OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(int i) {
            super(2);
            this.f23696OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23696OooO0o0 | 1);
            EventCreateScreen.this.EventCreateTime(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OO00O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SoftwareKeyboardController f23697OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23698OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f23699OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(SoftwareKeyboardController softwareKeyboardController, AppCompatActivity appCompatActivity, EventCreateViewModel eventCreateViewModel) {
            super(0);
            this.f23697OooO0Oo = softwareKeyboardController;
            this.f23699OooO0o0 = appCompatActivity;
            this.f23698OooO0o = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SoftwareKeyboardController softwareKeyboardController = this.f23697OooO0Oo;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            Calendar calendar = Calendar.getInstance();
            EventCreateViewModel eventCreateViewModel = this.f23698OooO0o;
            long timeInMillis = eventCreateViewModel.getDateModelStart().getTimeInMillis();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(timeInMillis);
            calendar2.set(13, 0);
            calendar.setTimeInMillis(calendar2.getTimeInMillis());
            com.code.android.yldialog.timechoose.OooO0OO oooO0OO = new com.code.android.yldialog.timechoose.OooO0OO(this.f23699OooO0o0, com.code.android.util.o0000.OooO0OO(oO00OOo0.Cancel), com.code.android.util.o0000.OooO0OO(oO00OOo0.Confirm), oO000OOo.f56535OooO00o, oO000OOo.f56536OooO0O0, true);
            oooO0OO.OooOOo0(eventCreateViewModel.getDateModelStart(), null);
            com.yalla.yalla.module.event.ui.screen.OooO0O0 callBack = new com.yalla.yalla.module.event.ui.screen.OooO0O0(eventCreateViewModel);
            Intrinsics.checkNotNullParameter(callBack, "callBack");
            oooO0OO.f10490OooOOo0 = callBack;
            oooO0OO.OooOO0o();
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OOO0o f23700OooO0Oo = new o0OOO0o();

        public o0OOO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            p417o0OoO0.o00Oo0.OooO0o0(it, oOo00OO0.ic_evnet_chat);
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23702OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(int i) {
            super(2);
            this.f23702OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23702OooO0o0 | 1);
            EventCreateScreen.this.EventCreateTag(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23704OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(int i) {
            super(2);
            this.f23704OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23704OooO0o0 | 1);
            EventCreateScreen.this.EventCreateHeader(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23705OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventTagModel f23706OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(EventCreateViewModel eventCreateViewModel, EventTagModel eventTagModel) {
            super(0);
            this.f23705OooO0Oo = eventCreateViewModel;
            this.f23706OooO0o0 = eventTagModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            EventTagModel eventTagModel;
            o0O0o0 o0o0o0;
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
            if (fragmentActivity != null) {
                final o0O0o0 o0o0o1 = new o0O0o0(fragmentActivity);
                EventCreateViewModel eventCreateViewModel = this.f23705OooO0Oo;
                List<EventTagModel> list = eventCreateViewModel.getTagList();
                final com.yalla.yalla.module.event.ui.screen.OooO00o oooO00o = new com.yalla.yalla.module.event.ui.screen.OooO00o(eventCreateViewModel);
                Intrinsics.checkNotNullParameter(list, "list");
                EventTagModel select = this.f23706OooO0o0;
                Intrinsics.checkNotNullParameter(select, "select");
                Lazy lazy = o0o0o1.f52673OooOO0o;
                ((i1) lazy.getValue()).f58098OooO0O0.removeAllViews();
                Iterator<EventTagModel> it = list.iterator();
                while (it.hasNext()) {
                    final EventTagModel next = it.next();
                    final o0O0o0.OooO00o oooO00o2 = new o0O0o0.OooO00o(o0o0o1.f52532OooO0Oo, next);
                    oooO00o2.OooO00o().setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.o0O0o00O
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            o0O0o0 this$0 = o0o0o1;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            o0O0o0.OooO00o this_apply = oooO00o2;
                            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                            EventTagModel item = next;
                            Intrinsics.checkNotNullParameter(item, "$item");
                            o0O0o0.OooO00o oooO00o3 = this$0.f52674OooOOO0;
                            if (oooO00o3 != null) {
                                oooO00o3.OooO0O0(false);
                            }
                            this_apply.OooO0O0(true);
                            this$0.f52674OooOOO0 = this_apply;
                            Function1 function1 = oooO00o;
                            if (function1 != null) {
                                function1.invoke(item);
                            }
                            this$0.OooO0O0();
                        }
                    });
                    Lazy lazy2 = oooO00o2.f52680OooO0o0;
                    Object value = lazy2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "<get-image>(...)");
                    o000OO00.OooO0O0((NetImageView) value);
                    EventTagModel eventTagModel2 = oooO00o2.f52676OooO0O0;
                    if (eventTagModel2.getIcon().length() > 0) {
                        Object value2 = lazy2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "<get-image>(...)");
                        o000OO00.OooOOOO((NetImageView) value2);
                        o0OOo0O.OooOO0.OooO00o oooO00o3 = new o0OOo0O.OooOO0.OooO00o(oooO00o2.f52675OooO00o);
                        int i = oOo00OO0.ic_evnet_chat;
                        o0OOo0O.OooOO0.OooO00o oooO00o4 = new o0OOo0O.OooOO0.OooO00o();
                        oooO00o4.f43923OooOOOo = i;
                        oooO00o4.f43913OooO0o = i;
                        oooO00o4.f43936OooOoo0 = 2;
                        String str = oooO00o4.f43916OooO0oo;
                        boolean z = oooO00o4.f43912OooO0Oo;
                        int i2 = oooO00o4.f43926OooOOoo;
                        ImageView imageView = oooO00o4.f43917OooOO0;
                        boolean z2 = oooO00o4.f43921OooOOO0;
                        boolean z3 = oooO00o4.f43914OooO0o0;
                        int i3 = oooO00o4.f43920OooOOO;
                        int i4 = oooO00o4.f43922OooOOOO;
                        int i5 = oooO00o4.f43935OooOoo;
                        int i6 = oooO00o4.f43929OooOo00;
                        boolean z4 = oooO00o4.f43928OooOo0;
                        int i7 = oooO00o4.f43931OooOo0o;
                        eventTagModel = eventTagModel2;
                        int i8 = oooO00o4.f43927OooOo;
                        int i9 = oooO00o4.f43933OooOoO0;
                        int i10 = oooO00o4.f43932OooOoO;
                        int i11 = oooO00o4.f43934OooOoOO;
                        int i12 = oooO00o4.f43937OooOooO;
                        int i13 = oooO00o4.f43938OooOooo;
                        boolean z5 = oooO00o4.f43930OooOo0O;
                        boolean z6 = oooO00o4.f43940Oooo00O;
                        oooO00o3.f43916OooO0oo = str;
                        oooO00o3.f43912OooO0Oo = z;
                        oooO00o3.f43923OooOOOo = i;
                        oooO00o3.f43926OooOOoo = i2;
                        oooO00o3.f43913OooO0o = i;
                        oooO00o3.f43917OooOO0 = imageView;
                        oooO00o3.f43920OooOOO = i3;
                        oooO00o3.f43922OooOOOO = i4;
                        oooO00o3.f43936OooOoo0 = 2;
                        oooO00o3.f43935OooOoo = i5;
                        oooO00o3.f43929OooOo00 = i6;
                        oooO00o3.f43928OooOo0 = z4;
                        oooO00o3.f43930OooOo0O = z5;
                        oooO00o3.f43931OooOo0o = i7;
                        oooO00o3.f43927OooOo = i8;
                        oooO00o3.f43933OooOoO0 = i9;
                        oooO00o3.f43932OooOoO = i10;
                        oooO00o3.f43934OooOoOO = i11;
                        oooO00o3.f43937OooOooO = i12;
                        oooO00o3.f43938OooOooo = i13;
                        oooO00o3.f43940Oooo00O = z6;
                        oooO00o3.f43921OooOOO0 = z2;
                        oooO00o3.f43914OooO0o0 = z3;
                        oooO00o3.f43911OooO0OO = eventTagModel.getIcon();
                        oooO00o3.f43909OooO00o = 0;
                        Object value3 = lazy2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "<get-image>(...)");
                        oooO00o3.OooO0Oo((NetImageView) value3);
                    } else {
                        eventTagModel = eventTagModel2;
                    }
                    Lazy lazy3 = oooO00o2.f52679OooO0o;
                    Object value4 = lazy3.getValue();
                    Intrinsics.checkNotNullExpressionValue(value4, "<get-text>(...)");
                    o000OO00.OooO0O0((TextView) value4);
                    if (eventTagModel.getTagName().length() > 0) {
                        Object value5 = lazy3.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "<get-text>(...)");
                        o000OO00.OooOOOO((TextView) value5);
                        Object value6 = lazy3.getValue();
                        Intrinsics.checkNotNullExpressionValue(value6, "<get-text>(...)");
                        ((TextView) value6).setText(eventTagModel.getTagName());
                    }
                    oooO00o2.OooO0O0(false);
                    if (select.getId() == next.getId()) {
                        oooO00o2.OooO0O0(true);
                        o0o0o0 = o0o0o1;
                        o0o0o0.f52674OooOOO0 = oooO00o2;
                    } else {
                        o0o0o0 = o0o0o1;
                    }
                    ((i1) lazy.getValue()).f58098OooO0O0.addView(oooO00o2.OooO00o());
                    o0o0o1 = o0o0o0;
                    it = it;
                    oooO00o = oooO00o;
                    lazy = lazy;
                    select = select;
                }
                o0o0o1.OooO();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f23708OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(int i) {
            super(2);
            this.f23708OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23708OooO0o0 | 1);
            EventCreateScreen.this.EventCreateName(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SoftwareKeyboardController f23709OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ EventCreateViewModel f23710OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f23711OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(SoftwareKeyboardController softwareKeyboardController, AppCompatActivity appCompatActivity, EventCreateViewModel eventCreateViewModel) {
            super(0);
            this.f23709OooO0Oo = softwareKeyboardController;
            this.f23711OooO0o0 = appCompatActivity;
            this.f23710OooO0o = eventCreateViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SoftwareKeyboardController softwareKeyboardController = this.f23709OooO0Oo;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            com.code.android.yldialog.timechoose.OooO0OO oooO0OO = new com.code.android.yldialog.timechoose.OooO0OO(this.f23711OooO0o0, com.code.android.util.o0000.OooO0OO(oO00OOo0.Cancel), com.code.android.util.o0000.OooO0OO(oO00OOo0.Confirm), oO000OOo.f56535OooO00o, oO000OOo.f56536OooO0O0, false);
            EventCreateViewModel eventCreateViewModel = this.f23710OooO0o;
            oooO0OO.OooOOo0(eventCreateViewModel.getDateModelEnd(), eventCreateViewModel.getDateModelStart());
            com.yalla.yalla.module.event.ui.screen.OooO0OO callBack = new com.yalla.yalla.module.event.ui.screen.OooO0OO(eventCreateViewModel);
            Intrinsics.checkNotNullParameter(callBack, "callBack");
            oooO0OO.f10490OooOOo0 = callBack;
            oooO0OO.OooOO0o();
            return Unit.INSTANCE;
        }
    }

    private EventCreateScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void EventCreateButton(BoxScope boxScope, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1569489478);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1569489478, i, -1, "com.yalla.yalla.module.event.ui.screen.EventCreateScreen.EventCreateButton (EventCreateScreen.kt:757)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
            if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                objOooO00o = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m477paddingVpY3zN4(companion, Dp.m3765constructorimpl(24), Dp.m3765constructorimpl(12)), 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierFillMaxWidth$default, companion2.getBottomCenter());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
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
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(ClipKt.clip(companion, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 20.5d))), Dp.m3765constructorimpl(41)), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1549444678);
            long j = StringsKt.isBlank(eventCreateViewModel.getName()) ^ true ? o0oO0O0o.f46993OoooOo0 : p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0;
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM202clickableXHw0xAI$default = ClickableKt.m202clickableXHw0xAI$default(BackgroundKt.m169backgroundbw27NRU$default(modifierFillMaxWidth$default2, j, null, 2, null), !StringsKt.isBlank(eventCreateViewModel.getName()), null, null, new OooO0o(lifecycleOwner, eventCreateViewModel, coroutineScope), 6, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM202clickableXHw0xAI$default);
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
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyRowMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.event_create_button, composerStartRestartGroup, 0), (Modifier) null, o0oO0O0o.f46946OooO0O0, TextUnitKt.getSp(17), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            if (p150o00Oo0oO.o00000OO.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(boxScope, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void EventCreateContent(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-402033702);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-402033702, i, -1, "com.yalla.yalla.module.event.ui.screen.EventCreateScreen.EventCreateContent (EventCreateScreen.kt:179)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ScrollState(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ScrollState scrollState = (ScrollState) objRememberedValue;
            SoftwareKeyboardController current = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composerStartRestartGroup, LocalSoftwareKeyboardController.$stable);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m169backgroundbw27NRU$default(WindowInsetsPadding_androidKt.imePadding(companion2), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0, null, 2, null), scrollState, false, null, false, 14, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(current);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new OooOO0(current);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierPointerInteropFilter$default = PointerInteropFilter_androidKt.pointerInteropFilter$default(modifierVerticalScroll$default, null, (Function1) objRememberedValue2, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion3, top, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPointerInteropFilter$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            EventCreateScreen eventCreateScreen = INSTANCE;
            eventCreateScreen.EventCreateHeader(composerStartRestartGroup, 6);
            float f = 13;
            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(8), Dp.m3765constructorimpl(f), 0.0f, 8, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion3, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
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
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            eventCreateScreen.EventCreateName(composerStartRestartGroup, 6);
            eventCreateScreen.EventCreateTag(composerStartRestartGroup, 6);
            eventCreateScreen.EventCreateTime(composerStartRestartGroup, 6);
            eventCreateScreen.EventCreateRoom(composerStartRestartGroup, 6);
            eventCreateScreen.EventCreateDescribe(composerStartRestartGroup, 6);
            p150o00Oo0oO.o00000O.OooO00o(4, companion2, composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.event_create_hint, composerStartRestartGroup, 0), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(91)), composer2, 6);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void EventCreateDescribe(Composer composer, int i) {
        Modifier.Companion companion;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1607098504);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1607098504, i, -1, "com.yalla.yalla.module.event.ui.screen.EventCreateScreen.EventCreateDescribe (EventCreateScreen.kt:675)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f = 12;
            p150o00Oo0oO.o00000O.OooO00o(f, companion2, composerStartRestartGroup, 6);
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.event_describe, composerStartRestartGroup, 0), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
            float f2 = 10;
            p150o00Oo0oO.o00000O.OooO00o(f2, companion2, composerStartRestartGroup, 6);
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m511heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(ClipKt.clip(companion2, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(4))), 0.0f, 1, null), Dp.m3765constructorimpl(Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR), 0.0f, 2, null), o0oO0O0o.f47030o0000Ooo, null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion3, top, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            BasicTextFieldKt.BasicTextField(eventCreateViewModel.getDescribe(), (Function1<? super String, Unit>) new OooOOO(eventCreateViewModel), FocusChangedModifierKt.onFocusChanged(PaddingKt.m479paddingqDBjuR0(SizeKt.fillMaxWidth$default(SizeKt.m511heightInVpY3zN4$default(BackgroundKt.m169backgroundbw27NRU$default(companion2, o0oO0O0o.f46945OooO00o, null, 2, null), Dp.m3765constructorimpl(125), 0.0f, 2, null), 0.0f, 1, null), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f)), new OooOOO0(eventCreateViewModel)), true, false, new TextStyle(p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, TextUnitKt.getSp(15), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), (KeyboardOptions) null, (KeyboardActions) null, false, 5, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1328598280, true, new OooOOOO(eventCreateViewModel)), composerStartRestartGroup, 805309440, 196608, 15824);
            composerStartRestartGroup.startReplaceableGroup(1446317500);
            if (eventCreateViewModel.getDescribe().length() > 0) {
                float f3 = 23;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(f3)), 0.0f, 1, null);
                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                Arrangement.Horizontal end = arrangement.getEnd();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyRowMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                TextKt.m1251Text4IGK_g(eventCreateViewModel.getDescribe().length() + "/" + eventCreateViewModel.getMaxCountDescribe(), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
                composerStartRestartGroup = composerStartRestartGroup;
                companion = companion2;
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icon_uderinfo_edit_clear, composerStartRestartGroup, 0), (String) null, ClickableKt.m202clickableXHw0xAI$default(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f3)), false, null, null, new OooOo00(eventCreateViewModel), 7, null), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37714OooOOO0, composerStartRestartGroup, 56, 0);
                p426o0OoOO.o000oOoO.OooO00o(composerStartRestartGroup);
            } else {
                composerStartRestartGroup = composerStartRestartGroup;
                companion = companion2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:85:0x03a9  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void EventCreateHeader(Composer composer, int i) {
        String eventDefaultPic;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1914043786);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1914043786, i, -1, "com.yalla.yalla.module.event.ui.screen.EventCreateScreen.EventCreateHeader (EventCreateScreen.kt:264)");
            }
            SoftwareKeyboardController current = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composerStartRestartGroup, LocalSoftwareKeyboardController.$stable);
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            Modifier.Companion companion = Modifier.INSTANCE;
            long j = o0oO0O0o.f46970OooOoOO;
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(companion, j, null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
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
            if (eventCreateViewModel.getHeadUrl().length() > 0) {
                eventDefaultPic = eventCreateViewModel.getHeadUrl();
            } else {
                if (eventCreateViewModel.getHeadPath().length() > 0) {
                    eventDefaultPic = eventCreateViewModel.getHeadPath();
                } else if (eventCreateViewModel.getSelectTag() != null) {
                    EventTagModel selectTag = eventCreateViewModel.getSelectTag();
                    Intrinsics.checkNotNull(selectTag);
                    eventDefaultPic = selectTag.getEventDefaultPic();
                } else {
                    eventDefaultPic = "";
                }
            }
            p100o000oOoo.o0000O0 o0000o0OooO0OO = p417o0OoO0.o00Oo0.OooO0OO(eventDefaultPic, Oooo000.f23678OooO0Oo, composerStartRestartGroup, 48, 0);
            ContentScale crop = ContentScale.INSTANCE.getCrop();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f = 179;
            float fM3765constructorimpl = Dp.m3765constructorimpl(f);
            WindowInsets.Companion companion4 = WindowInsets.INSTANCE;
            ImageKt.Image(o0000o0OooO0OO, (String) null, SizeKt.m509height3ABfNKs(modifierFillMaxWidth$default, Dp.m3765constructorimpl(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(companion4, composerStartRestartGroup, 8), composerStartRestartGroup, 0).getTop() + fM3765constructorimpl)), companion2.getTopCenter(), crop, 0.0f, (ColorFilter) null, composerStartRestartGroup, 27696, 96);
            if (eventCreateViewModel.getHeadPath().length() == 0) {
                if (eventCreateViewModel.getHeadUrl().length() == 0) {
                    composerStartRestartGroup.startReplaceableGroup(-731501796);
                    Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m169backgroundbw27NRU$default(companion, j, null, 2, null), 0.0f, 1, null), Dp.m3765constructorimpl(WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(companion4, composerStartRestartGroup, 8), composerStartRestartGroup, 0).getTop() + Dp.m3765constructorimpl(f))));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierStatusBarsPadding);
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
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    Modifier modifierM202clickableXHw0xAI$default = ClickableKt.m202clickableXHw0xAI$default(boxScopeInstance.align(BackgroundKt.background$default(com.facebook.OooOo.OooO0O0(8, SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(companion), Dp.m3765constructorimpl(35))), Brush.Companion.m1625horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.mutableListOf(Color.m1660boximpl(o0oO0O0o.f47033o0000o0O), Color.m1660boximpl(o0oO0O0o.f47032o0000o0)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), companion2.getCenter()), false, null, null, new Oooo0(current, fragmentActivity, eventCreateViewModel), 7, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM202clickableXHw0xAI$default);
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
                    Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy, composerM1309constructorimpl3, currentCompositionLocalMap3);
                    if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    float f2 = 15;
                    oo0O.OooO00o(f2, companion, composerStartRestartGroup, 6);
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_add_white, composerStartRestartGroup, 0);
                    long j2 = o0oO0O0o.f46946OooO0O0;
                    IconKt.m1103Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(14)), j2, composerStartRestartGroup, 440, 0);
                    oo0O.OooO00o(4, companion, composerStartRestartGroup, 6);
                    composer2 = composerStartRestartGroup;
                    TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.event_add_cover_photo, composerStartRestartGroup, 0), (Modifier) null, j2, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                    SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f2)), composer2, 6);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-731499486);
                    ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_update_photo, composer2, 0), (String) null, boxScopeInstance.align(SizeKt.m523size3ABfNKs(PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(companion, false, null, null, new o000oOoO(current, fragmentActivity, eventCreateViewModel), 7, null), Dp.m3765constructorimpl(14)), Dp.m3765constructorimpl(27)), companion2.getBottomEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    composer2.endReplaceableGroup();
                }
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(-731499486);
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_update_photo, composer2, 0), (String) null, boxScopeInstance.align(SizeKt.m523size3ABfNKs(PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(companion, false, null, null, new o000oOoO(current, fragmentActivity, eventCreateViewModel), 7, null), Dp.m3765constructorimpl(14)), Dp.m3765constructorimpl(27)), companion2.getBottomEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                composer2.endReplaceableGroup();
            }
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void EventCreateName(Composer composer, int i) {
        Composer composer2;
        Modifier.Companion companion;
        Composer composerStartRestartGroup = composer.startRestartGroup(1216024504);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1216024504, i, -1, "com.yalla.yalla.module.event.ui.screen.EventCreateScreen.EventCreateName (EventCreateScreen.kt:361)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            p150o00Oo0oO.o00000O.OooO00o(19, companion2, composerStartRestartGroup, 6);
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.event_name, composerStartRestartGroup, 0), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(10)), composerStartRestartGroup, 6);
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), o0oO0O0o.f46946OooO0O0, null, 2, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Vertical bottom = companion3.getBottom();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(arrangement, bottom, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f = 24;
            BasicTextFieldKt.BasicTextField(eventCreateViewModel.getName(), (Function1<? super String, Unit>) new o00O0O(eventCreateViewModel), rowScopeInstance.align(SizeKt.m511heightInVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion2, 1.0f, false, 2, null), Dp.m3765constructorimpl(f), 0.0f, 2, null), companion3.getCenterVertically()), true, false, new TextStyle(p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, TextUnitKt.getSp(15), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), (KeyboardOptions) null, (KeyboardActions) null, false, 3, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(o0oO0O0o.f46993OoooOo0, null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2145702794, true, new o00Oo0(eventCreateViewModel)), composerStartRestartGroup, 805309440, 196608, 15824);
            composerStartRestartGroup.startReplaceableGroup(-1993132203);
            if (eventCreateViewModel.getName().length() > 0) {
                Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(f));
                Alignment.Vertical bottom2 = companion3.getBottom();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, bottom2, composerStartRestartGroup, 48, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs);
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
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                TextKt.m1251Text4IGK_g(eventCreateViewModel.getName().length() + "/" + eventCreateViewModel.getMaxCountName(), SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(20)), p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
                composer2 = composerStartRestartGroup;
                companion = companion2;
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icon_uderinfo_edit_clear, composer2, 0), (String) null, ClickableKt.m202clickableXHw0xAI$default(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl((float) 23)), false, null, null, new o00Ooo(eventCreateViewModel), 7, null), p147o00Oo0Oo.o000OOo.OooO0OO(composer2).f37714OooOOO0, composer2, 56, 0);
                p426o0OoOO.o000oOoO.OooO00o(composer2);
            } else {
                composer2 = composerStartRestartGroup;
                companion = companion2;
            }
            p148o00Oo0o.o0ooOOo.OooO00o(composer2);
            p150o00Oo0oO.o00000O.OooO00o(11, companion, composer2, 6);
            t0.OooO00o(null, 0.0f, 0L, composer2, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo000o(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void EventCreateRoom(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1044945048);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1044945048, i, -1, "com.yalla.yalla.module.event.ui.screen.EventCreateScreen.EventCreateRoom (EventCreateScreen.kt:613)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            if (!(eventCreateViewModel.getRoomName().length() > 0) || eventCreateViewModel.getRoomIdx() <= 0) {
                composer2 = composerStartRestartGroup;
            } else {
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), o0oO0O0o.f46946OooO0O0, null, 2, null);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
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
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f = 12;
                p150o00Oo0oO.o00000O.OooO00o(f, companion, composerStartRestartGroup, 6);
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.event_create_Where, composerStartRestartGroup, 0), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
                float f2 = 10;
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f2)), composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion, null, false, 3, null), 0.0f, 1, null);
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Arrangement.Horizontal start = arrangement.getStart();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyRowMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                float f3 = 15;
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_evnet_room, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3765constructorimpl(f2), 0.0f, 11, null), Dp.m3765constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                TextKt.m1251Text4IGK_g(eventCreateViewModel.getRoomName(), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 6);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.wrapContentHeight$default(companion, null, false, 3, null), 0.0f, 1, null);
                Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                Arrangement.Horizontal start2 = arrangement.getStart();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, centerVertically2, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
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
                Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyRowMeasurePolicy2, composerM1309constructorimpl3, currentCompositionLocalMap3);
                if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_evnet_room_id, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3765constructorimpl(f2), 0.0f, 11, null), Dp.m3765constructorimpl(f3)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(String.valueOf(eventCreateViewModel.getRoomIdx()), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f2)), composer2, 6);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void EventCreateTag(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1495238937);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1495238937, i, -1, "com.yalla.yalla.module.event.ui.screen.EventCreateScreen.EventCreateTag (EventCreateScreen.kt:443)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            EventTagModel selectTag = eventCreateViewModel.getSelectTag();
            if (selectTag == null) {
                composer2 = composerStartRestartGroup;
            } else {
                Modifier.Companion companion = Modifier.INSTANCE;
                float f = 12;
                p150o00Oo0oO.o00000O.OooO00o(f, companion, composerStartRestartGroup, 6);
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.event_keyword, composerStartRestartGroup, 0), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
                float f2 = 10;
                p150o00Oo0oO.o00000O.OooO00o(f2, companion, composerStartRestartGroup, 6);
                Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(ClickableKt.m202clickableXHw0xAI$default(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m530widthInVpY3zN4$default(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(33)), Dp.m3765constructorimpl(111), 0.0f, 2, null), RoundedCornerShapeKt.RoundedCornerShape(50)), o0oO0O0o.f46996Ooooo00, null, 2, null), false, null, null, new o0ooOOo(eventCreateViewModel, selectTag), 7, null), Dp.m3765constructorimpl(f), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ImageKt.Image(p417o0OoO0.o00Oo0.OooO0OO(selectTag.getIcon(), o0OOO0o.f23700OooO0Oo, composerStartRestartGroup, 48, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(18)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25008, 104);
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(6)), composerStartRestartGroup, 6);
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(selectTag.getTagName(), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 3120, 120818);
                float f3 = 8;
                SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f3)), composer2, 6);
                t0.OooO0O0(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f2)), Dp.m3765constructorimpl(1), 0L, composer2, 54, 4);
                oo0O.OooO00o(f3, companion, composer2, 6);
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.ic_sort_gray, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(13)), p147o00Oo0Oo.o000OOo.OooO0OO(composer2).f37712OooOO0o, composer2, 440, 0);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f)), composer2, 6);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0Oo0oo(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void EventCreateTime(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(533909558);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(533909558, i, -1, "com.yalla.yalla.module.event.ui.screen.EventCreateScreen.EventCreateTime (EventCreateScreen.kt:508)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            AppCompatActivity appCompatActivity = (AppCompatActivity) objConsume;
            SoftwareKeyboardController current = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composerStartRestartGroup, LocalSoftwareKeyboardController.$stable);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 12;
            p150o00Oo0oO.o00000O.OooO00o(f, companion, composerStartRestartGroup, 6);
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.event_time, composerStartRestartGroup, 0), (Modifier) null, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(10)), composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String strOooO0OO = p601o0oo0O0.o0000oo.OooO0OO(eventCreateViewModel.getDateModelStart().getTimeInMillis(), "dd/MM/yyyy HH:mm");
            long sp = TextUnitKt.getSp(15);
            long j = p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            int iM3671getCentere0LSkKk = companion3.m3671getCentere0LSkKk();
            float f2 = 5;
            Modifier modifierOooO0O0 = com.facebook.OooOo.OooO0O0(f2, ClickableKt.m202clickableXHw0xAI$default(companion, false, null, null, new o0OO00O(current, appCompatActivity, eventCreateViewModel), 7, null));
            long j2 = o0oO0O0o.f47030o0000Ooo;
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(modifierOooO0O0, j2, null, 2, null);
            float f3 = 9;
            float fM3765constructorimpl = Dp.m3765constructorimpl(f3);
            float f4 = 7;
            TextKt.m1251Text4IGK_g(strOooO0OO, androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, PaddingKt.m477paddingVpY3zN4(modifierM169backgroundbw27NRU$default, fM3765constructorimpl, Dp.m3765constructorimpl(f4)), 1.0f, false, 2, null), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(iM3671getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130544);
            float f5 = 4;
            composer2 = composerStartRestartGroup;
            oo0O.OooO00o(f5, companion, composer2, 6);
            t0.OooO00o(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(13)), Dp.m3765constructorimpl(1), 0L, composer2, 54, 4);
            SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, Dp.m3765constructorimpl(f5)), composer2, 6);
            TextKt.m1251Text4IGK_g(p601o0oo0O0.o0000oo.OooO0OO(eventCreateViewModel.getDateModelEnd().getTimeInMillis(), "dd/MM/yyyy HH:mm"), androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, PaddingKt.m477paddingVpY3zN4(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(ClickableKt.m202clickableXHw0xAI$default(companion, false, null, null, new oo0o0Oo(current, appCompatActivity, eventCreateViewModel), 7, null), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f2))), j2, null, 2, null), Dp.m3765constructorimpl(f3), Dp.m3765constructorimpl(f4)), 1.0f, false, 2, null), p147o00Oo0Oo.o000OOo.OooO0OO(composer2).f37701OooO, TextUnitKt.getSp(15), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(companion3.m3671getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130544);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f)), composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O0O00(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void EventCreateToolbar(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-357614184);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-357614184, i, -1, "com.yalla.yalla.module.event.ui.screen.EventCreateScreen.EventCreateToolbar (EventCreateScreen.kt:156)");
            }
            t1.OooO00o(null, 0.0f, o0oO0O0o.f46946OooO0O0, null, null, null, null, o0O0o000.f46376OooO00o, null, composerStartRestartGroup, 12582912, 379);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000OOo(i));
    }

    public static /* synthetic */ void copyEvent$default(EventCreateScreen eventCreateScreen, EventModel eventModel, EventCreateStateModel eventCreateStateModel, int i, Object obj) {
        if ((i & 1) != 0) {
            eventModel = null;
        }
        eventCreateScreen.copyEvent(eventModel, eventCreateStateModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getImagePath(FragmentActivity activity, EventCreateViewModel vm) {
        if (vm.getShowPermission()) {
            return;
        }
        vm.setShowPermission(true);
        com.yalla.yalla.util.permission.OooO00o.OooO0OO(activity, PermissionGroupReveal.f32883OooO0o, new o000000(vm), new o000000O(activity, vm));
    }

    private final void navigate(EventModel event, EventCreateStateModel eventCreate) {
        if (eventCreate != null && event != null) {
            event.setRoomId(eventCreate.getRoomId());
            event.setRoomIdx(eventCreate.getRoomIdx());
            event.setRoomName(eventCreate.getRoomName());
            event.setCreateToken(eventCreate.getCreateToken());
        }
        Bundle bundleOooO00o = p063o0000oO.o00Ooo.OooO00o();
        bundleOooO00o.putSerializable("key", event);
        oo0oOO0.OooO0o0(INSTANCE, bundleOooO00o, false, null, 12);
    }

    public static /* synthetic */ void navigate$default(EventCreateScreen eventCreateScreen, EventModel eventModel, EventCreateStateModel eventCreateStateModel, int i, Object obj) {
        if ((i & 1) != 0) {
            eventModel = null;
        }
        eventCreateScreen.navigate(eventModel, eventCreateStateModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toEventCreate(LifecycleOwner lifecycleOwner, EventCreateViewModel vm, CoroutineScope coroutineScope) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.set(13, 0);
        if (o000OO.OooO00o(vm.getDateModelStart().getTimeInMillis()) < (((long) 60) * 60000) + calendar.getTimeInMillis()) {
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.event_create_err_start_time_invalid);
            if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jCurrentTimeMillis2);
        calendar2.set(13, 0);
        if (o000OO.OooO00o(vm.getDateModelEnd().getTimeInMillis()) < (((long) 65) * 60000) + calendar2.getTimeInMillis()) {
            String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0.event_create_err_end_time_invalid);
            if (strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) {
                return;
            }
            o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o2.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                return;
            }
        }
        if (o000OO.OooO00o(vm.getDateModelStart().getTimeInMillis()) <= o000OO.OooO00o(vm.getDateModelEnd().getTimeInMillis())) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new o00000(vm, lifecycleOwner, null), 3, null);
            return;
        }
        String strOooO0OO3 = com.code.android.util.o0000.OooO0OO(oO00OOo0.event_create_err_end_time_must_last_start_time);
        if (strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3)) {
            return;
        }
        o000Oo0 o000oo0OooO00o3 = o000O00.OooO00o(strOooO0OO3, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o3.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o3);
        }
    }

    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(109904016);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(109904016, i, -1, "com.yalla.yalla.module.event.ui.screen.EventCreateScreen.Content (EventCreateScreen.kt:130)");
            }
            p149o00Oo0o0.o00000O.OooO0O0(true, composerStartRestartGroup, 6, 0);
            Bundle bundleOooO0O0 = o00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O.f53592OooO00o), composerStartRestartGroup);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(bundleOooO0O0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (EventModel) bundleOooO0O0.getSerializable("key");
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO0OO oooO0OO = new OooO0OO((EventModel) objRememberedValue);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventCreateViewModel.class, current, null, oooO0OO, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            EventCreateViewModel eventCreateViewModel = (EventCreateViewModel) viewModel;
            EffectsKt.LaunchedEffect(eventCreateViewModel, new OooO00o(eventCreateViewModel, null), composerStartRestartGroup, 72);
            a.OooO00o(null, eventCreateViewModel.getShowLoadingDialog().getValue().booleanValue(), null, composerStartRestartGroup, 0, 6);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(Modifier.INSTANCE, p147o00Oo0Oo.o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0, null, 2, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            EventCreateScreen eventCreateScreen = INSTANCE;
            eventCreateScreen.EventCreateContent(composerStartRestartGroup, 6);
            eventCreateScreen.EventCreateToolbar(composerStartRestartGroup, 6);
            eventCreateScreen.EventCreateButton(boxScopeInstance, composerStartRestartGroup, 54);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(columnScope, i));
    }

    public final void copyEvent(@Nullable EventModel event, @Nullable EventCreateStateModel eventCreate) {
        navigate(event, eventCreate);
    }

    public final void createEvent(@Nullable EventCreateStateModel eventCreate) {
        navigate(new EventModel(), eventCreate);
    }
}
