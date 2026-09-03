package com.yalla.yalla.ui.screen.moment;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.OooOo;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.model.topic.TopicGroupInfoModel;
import com.yalla.yalla.ui.vm.moment.TopicGroupCreateVM;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p150o00Oo0oO.o00000O;
import p158o00OoOOO.oo000o;
import p417o0OoO0.o0ooOOo;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.t1;
import p519o0o0O0oO.a;
import p526o0o0OOO0.o00O;
import p526o0o0OOO0.o00O00O;
import p526o0o0OOO0.oo0oOO0;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\u000b\u001a\u00020\u0002*\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u0002*\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/ui/screen/moment/TopicGroupCreateScreen;", "Lo0o0OOO0/o00O00O;", "", "TopicGroupCreateLayer", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/ScrollState;", "rememberScrollState", "TopicGroupCreateToolbar", "(Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;I)V", "TopicGroupCreateContent", "Landroidx/compose/foundation/layout/BoxScope;", "TopicGroupCreateButton", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "Lcom/yalla/yalla/model/topic/TopicGroupInfoModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Layer", "(Lcom/yalla/yalla/model/topic/TopicGroupInfoModel;Landroidx/compose/runtime/Composer;I)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopicGroupCreateScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicGroupCreateScreen.kt\ncom/yalla/yalla/ui/screen/moment/TopicGroupCreateScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,499:1\n76#2:500\n81#3,11:501\n81#3,11:552\n81#3,11:564\n81#3,11:1252\n66#4,6:512\n72#4:546\n76#4:551\n66#4,6:611\n72#4:645\n76#4:705\n67#4,5:1265\n72#4:1298\n76#4:1305\n78#5,11:518\n91#5:550\n78#5,11:581\n78#5,11:617\n78#5,11:656\n91#5:699\n91#5:704\n78#5,11:713\n78#5,11:749\n78#5,11:781\n91#5:814\n78#5,11:824\n78#5,11:862\n91#5:895\n91#5:900\n78#5,11:910\n78#5,11:948\n91#5:981\n91#5:986\n78#5,11:996\n78#5,11:1034\n91#5:1067\n91#5:1072\n91#5:1078\n78#5,11:1088\n78#5,11:1120\n91#5:1153\n78#5,11:1159\n91#5:1192\n78#5,11:1198\n91#5:1231\n91#5:1237\n91#5:1245\n91#5:1250\n78#5,11:1270\n91#5:1304\n456#6,8:529\n464#6,3:543\n467#6,3:547\n456#6,8:592\n464#6,3:606\n456#6,8:628\n464#6,3:642\n456#6,8:667\n464#6,3:681\n467#6,3:696\n467#6,3:701\n456#6,8:724\n464#6,3:738\n456#6,8:760\n464#6,3:774\n456#6,8:792\n464#6,3:806\n467#6,3:811\n456#6,8:835\n464#6,3:849\n456#6,8:873\n464#6,3:887\n467#6,3:892\n467#6,3:897\n456#6,8:921\n464#6,3:935\n456#6,8:959\n464#6,3:973\n467#6,3:978\n467#6,3:983\n456#6,8:1007\n464#6,3:1021\n456#6,8:1045\n464#6,3:1059\n467#6,3:1064\n467#6,3:1069\n467#6,3:1075\n456#6,8:1099\n464#6,3:1113\n456#6,8:1131\n464#6,3:1145\n467#6,3:1150\n456#6,8:1170\n464#6,3:1184\n467#6,3:1189\n456#6,8:1209\n464#6,3:1223\n467#6,3:1228\n467#6,3:1234\n467#6,3:1242\n467#6,3:1247\n456#6,8:1281\n464#6,3:1295\n467#6,3:1301\n4144#7,6:537\n4144#7,6:600\n4144#7,6:636\n4144#7,6:675\n4144#7,6:732\n4144#7,6:768\n4144#7,6:800\n4144#7,6:843\n4144#7,6:881\n4144#7,6:929\n4144#7,6:967\n4144#7,6:1015\n4144#7,6:1053\n4144#7,6:1107\n4144#7,6:1139\n4144#7,6:1178\n4144#7,6:1217\n4144#7,6:1289\n154#8:563\n154#8:610\n154#8:646\n154#8:647\n154#8:648\n154#8:649\n154#8:685\n154#8:686\n154#8:694\n154#8:695\n154#8:706\n154#8:742\n154#8:778\n154#8:810\n154#8:816\n154#8:817\n154#8:853\n154#8:854\n154#8:855\n154#8:891\n154#8:902\n154#8:903\n154#8:939\n154#8:940\n154#8:941\n154#8:977\n154#8:988\n154#8:989\n154#8:1025\n154#8:1026\n154#8:1027\n154#8:1063\n154#8:1074\n154#8:1080\n154#8:1081\n154#8:1117\n154#8:1149\n154#8:1155\n154#8:1156\n154#8:1188\n154#8:1194\n154#8:1195\n154#8:1227\n154#8:1233\n154#8:1239\n154#8:1240\n154#8:1241\n154#8:1263\n154#8:1264\n154#8:1299\n154#8:1300\n72#9,6:575\n78#9:609\n72#9,6:650\n78#9:684\n82#9:700\n72#9,6:707\n78#9:741\n72#9,6:743\n78#9:777\n72#9,6:856\n78#9:890\n82#9:896\n72#9,6:942\n78#9:976\n82#9:982\n72#9,6:1028\n78#9:1062\n82#9:1068\n82#9:1079\n72#9,6:1082\n78#9:1116\n82#9:1238\n82#9:1246\n82#9:1251\n1098#10:687\n927#10,6:688\n77#11,2:779\n79#11:809\n83#11:815\n73#11,6:818\n79#11:852\n83#11:901\n73#11,6:904\n79#11:938\n83#11:987\n73#11,6:990\n79#11:1024\n83#11:1073\n77#11,2:1118\n79#11:1148\n83#11:1154\n77#11,2:1157\n79#11:1187\n83#11:1193\n77#11,2:1196\n79#11:1226\n83#11:1232\n*S KotlinDebug\n*F\n+ 1 TopicGroupCreateScreen.kt\ncom/yalla/yalla/ui/screen/moment/TopicGroupCreateScreen\n*L\n52#1:500\n64#1:501,11\n118#1:552,11\n131#1:564,11\n461#1:1252,11\n100#1:512,6\n100#1:546\n100#1:551\n139#1:611,6\n139#1:645\n139#1:705\n462#1:1265,5\n462#1:1298\n462#1:1305\n100#1:518,11\n100#1:550\n132#1:581,11\n139#1:617,11\n163#1:656,11\n163#1:699\n139#1:704\n203#1:713,11\n207#1:749,11\n213#1:781,11\n213#1:814\n247#1:824,11\n258#1:862,11\n258#1:895\n247#1:900\n279#1:910,11\n290#1:948,11\n290#1:981\n279#1:986\n311#1:996,11\n322#1:1034,11\n322#1:1067\n311#1:1072\n207#1:1078\n347#1:1088,11\n353#1:1120,11\n353#1:1153\n387#1:1159,11\n387#1:1192\n415#1:1198,11\n415#1:1231\n347#1:1237\n203#1:1245\n132#1:1250\n462#1:1270,11\n462#1:1304\n100#1:529,8\n100#1:543,3\n100#1:547,3\n132#1:592,8\n132#1:606,3\n139#1:628,8\n139#1:642,3\n163#1:667,8\n163#1:681,3\n163#1:696,3\n139#1:701,3\n203#1:724,8\n203#1:738,3\n207#1:760,8\n207#1:774,3\n213#1:792,8\n213#1:806,3\n213#1:811,3\n247#1:835,8\n247#1:849,3\n258#1:873,8\n258#1:887,3\n258#1:892,3\n247#1:897,3\n279#1:921,8\n279#1:935,3\n290#1:959,8\n290#1:973,3\n290#1:978,3\n279#1:983,3\n311#1:1007,8\n311#1:1021,3\n322#1:1045,8\n322#1:1059,3\n322#1:1064,3\n311#1:1069,3\n207#1:1075,3\n347#1:1099,8\n347#1:1113,3\n353#1:1131,8\n353#1:1145,3\n353#1:1150,3\n387#1:1170,8\n387#1:1184,3\n387#1:1189,3\n415#1:1209,8\n415#1:1223,3\n415#1:1228,3\n347#1:1234,3\n203#1:1242,3\n132#1:1247,3\n462#1:1281,8\n462#1:1295,3\n462#1:1301,3\n100#1:537,6\n132#1:600,6\n139#1:636,6\n163#1:675,6\n203#1:732,6\n207#1:768,6\n213#1:800,6\n247#1:843,6\n258#1:881,6\n279#1:929,6\n290#1:967,6\n311#1:1015,6\n322#1:1053,6\n347#1:1107,6\n353#1:1139,6\n387#1:1178,6\n415#1:1217,6\n462#1:1289,6\n119#1:563\n142#1:610\n149#1:646\n157#1:647\n158#1:648\n164#1:649\n168#1:685\n170#1:686\n193#1:694\n198#1:695\n204#1:706\n209#1:742\n224#1:778\n237#1:810\n246#1:816\n248#1:817\n254#1:853\n255#1:854\n260#1:855\n273#1:891\n278#1:902\n280#1:903\n286#1:939\n287#1:940\n292#1:941\n305#1:977\n310#1:988\n312#1:989\n318#1:1025\n319#1:1026\n324#1:1027\n337#1:1063\n342#1:1074\n346#1:1080\n349#1:1081\n364#1:1117\n377#1:1149\n386#1:1155\n388#1:1156\n410#1:1188\n414#1:1194\n416#1:1195\n438#1:1227\n442#1:1233\n445#1:1239\n451#1:1240\n454#1:1241\n465#1:1263\n467#1:1264\n484#1:1299\n488#1:1300\n132#1:575,6\n132#1:609\n163#1:650,6\n163#1:684\n163#1:700\n203#1:707,6\n203#1:741\n207#1:743,6\n207#1:777\n258#1:856,6\n258#1:890\n258#1:896\n290#1:942,6\n290#1:976\n290#1:982\n322#1:1028,6\n322#1:1062\n322#1:1068\n207#1:1079\n347#1:1082,6\n347#1:1116\n347#1:1238\n203#1:1246\n132#1:1251\n176#1:687\n177#1:688,6\n213#1:779,2\n213#1:809\n213#1:815\n247#1:818,6\n247#1:852\n247#1:901\n279#1:904,6\n279#1:938\n279#1:987\n311#1:990,6\n311#1:1024\n311#1:1073\n353#1:1118,2\n353#1:1148\n353#1:1154\n387#1:1157,2\n387#1:1187\n387#1:1193\n415#1:1196,2\n415#1:1226\n415#1:1232\n*E\n"})
public final class TopicGroupCreateScreen extends o00O00O {
    public static final int $stable = 0;

    @NotNull
    public static final TopicGroupCreateScreen INSTANCE = new TopicGroupCreateScreen();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29238OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TopicGroupInfoModel f29239OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(TopicGroupInfoModel topicGroupInfoModel, int i) {
            super(2);
            this.f29239OooO0o0 = topicGroupInfoModel;
            this.f29238OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29238OooO0o | 1);
            TopicGroupCreateScreen.this.Layer(this.f29239OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29241OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29242OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f29242OooO0o0 = columnScope;
            this.f29241OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29241OooO0o | 1);
            TopicGroupCreateScreen.this.Content(this.f29242OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29244OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29245OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ColumnScope columnScope, int i) {
            super(2);
            this.f29245OooO0o0 = columnScope;
            this.f29244OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29244OooO0o | 1);
            TopicGroupCreateScreen.this.Content(this.f29245OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ TopicGroupCreateVM f29246OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(TopicGroupCreateVM topicGroupCreateVM) {
            super(0);
            this.f29246OooO0Oo = topicGroupCreateVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO0O0("103004", MapsKt.mapOf(new Pair("type", 1)));
            this.f29246OooO0Oo.toBindingYallaChat();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f29247OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ TopicGroupInfoModel f29248OooO00o;

        public OooOO0(TopicGroupInfoModel topicGroupInfoModel) {
            this.f29248OooO00o = topicGroupInfoModel;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return OooOo.OooO0O0(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public final <T extends ViewModel> T create(@NotNull Class<T> modelClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            T tNewInstance = modelClass.getConstructor(TopicGroupInfoModel.class).newInstance(this.f29248OooO00o);
            Intrinsics.checkNotNullExpressionValue(tNewInstance, "modelClass.getConstructo…      .newInstance(model)");
            return tNewInstance;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ TopicGroupCreateVM f29249OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(TopicGroupCreateVM topicGroupCreateVM) {
            super(0);
            this.f29249OooO0Oo = topicGroupCreateVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("103002");
            this.f29249OooO0Oo.checkIsGroupCreate();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29251OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ScrollState f29252OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(ScrollState scrollState, int i) {
            super(2);
            this.f29252OooO0o0 = scrollState;
            this.f29251OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29251OooO0o | 1);
            TopicGroupCreateScreen.this.TopicGroupCreateContent(this.f29252OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29254OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f29255OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(BoxScope boxScope, int i) {
            super(2);
            this.f29255OooO0o0 = boxScope;
            this.f29254OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29254OooO0o | 1);
            TopicGroupCreateScreen.this.TopicGroupCreateButton(this.f29255OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f29257OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(int i) {
            super(2);
            this.f29257OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29257OooO0o0 | 1);
            TopicGroupCreateScreen.this.TopicGroupCreateLayer(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29259OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ScrollState f29260OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(ScrollState scrollState, int i) {
            super(2);
            this.f29260OooO0o0 = scrollState;
            this.f29259OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29259OooO0o | 1);
            TopicGroupCreateScreen.this.TopicGroupCreateToolbar(this.f29260OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private TopicGroupCreateScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TopicGroupCreateButton(BoxScope boxScope, Composer composer, int i) {
        int i2;
        Painter painterPainterResource;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1546595920);
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
                ComposerKt.traceEventStart(-1546595920, i, -1, "com.yalla.yalla.ui.screen.moment.TopicGroupCreateScreen.TopicGroupCreateButton (TopicGroupCreateScreen.kt:459)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(TopicGroupCreateVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            TopicGroupCreateVM topicGroupCreateVM = (TopicGroupCreateVM) viewModel;
            Modifier.Companion companion = Modifier.INSTANCE;
            int i3 = o0oO0O0o.f47152o00OOOo;
            float f = 15;
            float f2 = 12;
            Modifier modifierM479paddingqDBjuR0 = PaddingKt.m479paddingqDBjuR0(BackgroundKt.m169backgroundbw27NRU$default(companion, o0oO0O0o.f47155o00Ooo, null, 2, null), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f2));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierM202clickableXHw0xAI$default = ClickableKt.m202clickableXHw0xAI$default(com.facebook.OooOo.OooO0O0(21, boxScope.align(modifierM479paddingqDBjuR0, companion2.getBottomCenter())), topicGroupCreateVM.isAdequateFollowedCount() && topicGroupCreateVM.isAdequateCreateDaysCount(), null, null, new OooOO0O(topicGroupCreateVM), 6, null);
            Alignment topCenter = companion2.getTopCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topCenter, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM202clickableXHw0xAI$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (topicGroupCreateVM.isAdequateFollowedCount() && topicGroupCreateVM.isAdequateCreateDaysCount()) {
                composerStartRestartGroup.startReplaceableGroup(275015108);
                painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.ic_topic_group_create_bottom, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(275015210);
                painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.ic_topic_group_create_bottom_gray, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            ImageKt.Image(painterPainterResource, "", SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(43)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(8), Dp.m3765constructorimpl(f), 0.0f, 8, null);
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.topic_group_create_content_bottom, composerStartRestartGroup, 0);
            long jOooO0OO = o0000O0.OooO0OO(15, composerStartRestartGroup, 6);
            long j = (topicGroupCreateVM.isAdequateFollowedCount() && topicGroupCreateVM.isAdequateCreateDaysCount()) ? o0oO0O0o.f47165o0OOO0o : o0oO0O0o.f47008o00000;
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(strStringResource, modifierM480paddingqDBjuR0$default, j, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 131056);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(boxScope, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TopicGroupCreateContent(ScrollState scrollState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2108756584);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(scrollState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2108756584, i, -1, "com.yalla.yalla.ui.screen.moment.TopicGroupCreateScreen.TopicGroupCreateContent (TopicGroupCreateScreen.kt:129)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(TopicGroupCreateVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            TopicGroupCreateVM topicGroupCreateVM = (TopicGroupCreateVM) viewModel;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion, o0oO0O0o.OooO0OO(), null, 2, null), 0.0f, 1, null)), scrollState, false, null, false, 14, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
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
            float f = 148;
            Modifier modifierM511heightInVpY3zN4$default = SizeKt.m511heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(f), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM511heightInVpY3zN4$default);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_topic_group_create_top_bg_start, composerStartRestartGroup, 0), (String) null, boxScopeInstance.align(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(127)), companion2.getTopStart()), companion2.getTopStart(), (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 3128, 112);
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_topic_group_create_top_bg_end, composerStartRestartGroup, 0), (String) null, boxScopeInstance.align(SizeKt.m525sizeVpY3zN4(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(40), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(122), Dp.m3765constructorimpl(f)), companion2.getTopEnd()), companion2.getTopEnd(), (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 3128, 112);
            float f2 = 15;
            Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f2), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default);
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
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, o0ooOOo.OooO00o() > 72 ? Dp.m3765constructorimpl(72) : Dp.m3765constructorimpl(o0ooOOo.OooO00o())), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1293627325);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            long jOooO0OO = o0000O0.OooO0OO(30, composerStartRestartGroup, 6);
            long jOooO0o = o0oO0O0o.OooO0o();
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            int iPushStyle = builder.pushStyle(new SpanStyle(jOooO0o, jOooO0OO, companion4.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, new Shadow(o0oO0O0o.OooO0Oo(), OffsetKt.Offset(6.0f, 6.0f), 10.0f, null), (PlatformSpanStyle) null, (DrawStyle) null, 57336, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(oO00OOo0.topic_group_create_content1, composerStartRestartGroup, 0));
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                TextKt.m1252TextIbK3jfQ(annotatedString, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 0, 0, 262142);
                float f3 = 8;
                o00000O.OooO00o(f3, companion, composer2, 6);
                float f4 = 12;
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.topic_group_create_content2, composer2, 0), PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(f4), 7, null), o0oO0O0o.OooO0oO(), o0000O0.OooO0OO(12, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 131056);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                Modifier modifierM478paddingVpY3zN4$default2 = PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f2), 0.0f, 2, null);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default2);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl4, measurePolicyOooO00o4, composerM1309constructorimpl4, currentCompositionLocalMap4);
                if (composerM1309constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1309constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
                }
                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(ClipKt.clip(companion, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f4))), 0.0f, 1, null), o0oO0O0o.OooO0o(), null, 2, null);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o5 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl5 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl5, measurePolicyOooO00o5, composerM1309constructorimpl5, currentCompositionLocalMap5);
                if (composerM1309constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash5, composerM1309constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                Brush.Companion companion5 = Brush.INSTANCE;
                Modifier modifierM479paddingqDBjuR0 = PaddingKt.m479paddingqDBjuR0(BackgroundKt.background$default(modifierFillMaxWidth$default, Brush.Companion.m1633verticalGradient8A3gB4$default(companion5, CollectionsKt.mutableListOf(Color.m1660boximpl(o0oO0O0o.OooO0O0()), Color.m1660boximpl(o0oO0O0o.OooO0o0())), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f4), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f4));
                Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM479paddingqDBjuR0);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor6);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl6 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o6 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl6, measurePolicyRowMeasurePolicy, composerM1309constructorimpl6, currentCompositionLocalMap6);
                if (composerM1309constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash6, composerM1309constructorimpl6, currentCompositeKeyHash6, function2OooO00o6);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i3 = oOo00OO0.ic_topic_group_create_star_start;
                ImageKt.Image(PainterResources_androidKt.painterResource(i3, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                float f5 = 4;
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.topic_group_create_content3, composer2, 0), rowScopeInstance.align(PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f5), 0.0f, 2, null), companion2.getCenterVertically()), o0oO0O0o.OooO00o(), o0000O0.OooO0OO(14, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131056);
                int i4 = oOo00OO0.ic_topic_group_create_star_end;
                ImageKt.Image(PainterResources_androidKt.painterResource(i4, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f3)), composer2, 6);
                Modifier modifierM478paddingVpY3zN4$default3 = PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f2), 0.0f, 2, null);
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o6 = androidx.compose.material.OooOOO.OooO00o(companion2, arrangement.getStart(), composer2, 0, -1323940314);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor7 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default3);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor7);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl7 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o7 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl7, measurePolicyOooO00o6, composerM1309constructorimpl7, currentCompositionLocalMap7);
                if (composerM1309constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash7, composerM1309constructorimpl7, currentCompositeKeyHash7, function2OooO00o7);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.ic_topic_group_create_member, composer2, 0);
                float f6 = 7;
                Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(f6), 0.0f, 0.0f, 13, null);
                float f7 = 42;
                ImageKt.Image(painterPainterResource, (String) null, SizeKt.m523size3ABfNKs(modifierM480paddingqDBjuR0$default, Dp.m3765constructorimpl(f7)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                Modifier modifierWeight = rowScopeInstance.weight(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f3), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, true);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o7 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor8 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierWeight);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor8);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl8 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o8 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl8, measurePolicyOooO00o7, composerM1309constructorimpl8, currentCompositionLocalMap8);
                if (composerM1309constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash8, composerM1309constructorimpl8, currentCompositeKeyHash8, function2OooO00o8);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.topic_group_create_content_member_title, composer2, 0), (Modifier) null, o000OOo.OooO0OO(composer2).OooO00o(), o0000O0.OooO0OO(14, composer2, 6), (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196608, 0, 131026);
                float f8 = 6;
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.topic_group_create_content_member_content, composer2, 0), PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(f8), 0.0f, 0.0f, 13, null), o000OOo.OooO0OO(composer2).OooO0O0(), o0000O0.OooO0OO(12, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 131056);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                float f9 = 23;
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f9)), composer2, 6);
                Modifier modifierM478paddingVpY3zN4$default4 = PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f2), 0.0f, 2, null);
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o8 = androidx.compose.material.OooOOO.OooO00o(companion2, arrangement.getStart(), composer2, 0, -1323940314);
                int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor9 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default4);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor9);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl9 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o9 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl9, measurePolicyOooO00o8, composerM1309constructorimpl9, currentCompositionLocalMap9);
                if (composerM1309constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash9, composerM1309constructorimpl9, currentCompositeKeyHash9, function2OooO00o9);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf9, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_topic_group_create_permission, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(f6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(f7)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                Modifier modifierWeight2 = rowScopeInstance.weight(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f3), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, true);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o9 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor10 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierWeight2);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor10);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl10 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o10 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl10, measurePolicyOooO00o9, composerM1309constructorimpl10, currentCompositionLocalMap10);
                if (composerM1309constructorimpl10.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash10, composerM1309constructorimpl10, currentCompositeKeyHash10, function2OooO00o10);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf10, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.topic_group_create_content_permission_title, composer2, 0), (Modifier) null, o000OOo.OooO0OO(composer2).OooO00o(), o0000O0.OooO0OO(14, composer2, 6), (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196608, 0, 131026);
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.topic_group_create_content_permission_content, composer2, 0), PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(f8), 0.0f, 0.0f, 13, null), o000OOo.OooO0OO(composer2).OooO0O0(), o0000O0.OooO0OO(12, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 131056);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f9)), composer2, 6);
                Modifier modifierM478paddingVpY3zN4$default5 = PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f2), 0.0f, 2, null);
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o10 = androidx.compose.material.OooOOO.OooO00o(companion2, arrangement.getStart(), composer2, 0, -1323940314);
                int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor11 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default5);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor11);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl11 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o11 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl11, measurePolicyOooO00o10, composerM1309constructorimpl11, currentCompositionLocalMap11);
                if (composerM1309constructorimpl11.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash11, composerM1309constructorimpl11, currentCompositeKeyHash11, function2OooO00o11);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.ic_topic_group_create_manage, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(f6), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(f7)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                Modifier modifierWeight3 = rowScopeInstance.weight(PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(f3), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, true);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o11 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor12 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierWeight3);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor12);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl12 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o12 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl12, measurePolicyOooO00o11, composerM1309constructorimpl12, currentCompositionLocalMap12);
                if (composerM1309constructorimpl12.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash12, composerM1309constructorimpl12, currentCompositeKeyHash12, function2OooO00o12);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf12, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.topic_group_create_content_manage_title, composer2, 0), (Modifier) null, o000OOo.OooO0OO(composer2).OooO00o(), o0000O0.OooO0OO(14, composer2, 6), (FontStyle) null, companion4.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196608, 0, 131026);
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.topic_group_create_content_manage_content, composer2, 0), PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, Dp.m3765constructorimpl(f8), 0.0f, 0.0f, 13, null), o000OOo.OooO0OO(composer2).OooO0O0(), o0000O0.OooO0OO(12, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 131056);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f9)), composer2, 6);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f2)), composer2, 6);
                Modifier modifierM169backgroundbw27NRU$default2 = BackgroundKt.m169backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(ClipKt.clip(companion, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f4))), 0.0f, 1, null), o0oO0O0o.OooO0o(), null, 2, null);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o12 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor13 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default2);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor13);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl13 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o13 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl13, measurePolicyOooO00o12, composerM1309constructorimpl13, currentCompositionLocalMap13);
                if (composerM1309constructorimpl13.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl13.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash13, composerM1309constructorimpl13, currentCompositeKeyHash13, function2OooO00o13);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf13, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                Modifier modifierM479paddingqDBjuR1 = PaddingKt.m479paddingqDBjuR0(BackgroundKt.background$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Brush.Companion.m1633verticalGradient8A3gB4$default(companion5, CollectionsKt.mutableListOf(Color.m1660boximpl(o0oO0O0o.OooO0O0()), Color.m1660boximpl(o0oO0O0o.OooO0o0())), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f4), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f4));
                Arrangement.HorizontalOrVertical center2 = arrangement.getCenter();
                Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash14 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor14 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierM479paddingqDBjuR1);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor14);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl14 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o14 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl14, measurePolicyRowMeasurePolicy2, composerM1309constructorimpl14, currentCompositionLocalMap14);
                if (composerM1309constructorimpl14.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl14.rememberedValue(), Integer.valueOf(currentCompositeKeyHash14))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash14, composerM1309constructorimpl14, currentCompositeKeyHash14, function2OooO00o14);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf14, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ImageKt.Image(PainterResources_androidKt.painterResource(i3, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.topic_group_create_content_requirements, composer2, 0), rowScopeInstance.align(PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f5), 0.0f, 2, null), companion2.getCenterVertically()), o0oO0O0o.OooO00o(), o0000O0.OooO0OO(14, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131056);
                ImageKt.Image(PainterResources_androidKt.painterResource(i4, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 124);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f3)), composer2, 6);
                Modifier modifierM478paddingVpY3zN4$default6 = PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f2), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical center3 = arrangement.getCenter();
                Alignment.Vertical centerVertically3 = companion2.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(center3, centerVertically3, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash15 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor15 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default6);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor15);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl15 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o15 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl15, measurePolicyRowMeasurePolicy3, composerM1309constructorimpl15, currentCompositionLocalMap15);
                if (composerM1309constructorimpl15.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl15.rememberedValue(), Integer.valueOf(currentCompositeKeyHash15))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash15, composerM1309constructorimpl15, currentCompositeKeyHash15, function2OooO00o15);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf15, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                TextKt.m1251Text4IGK_g(o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.topic_group_create_content_create_day_xxx, composer2, 0), String.valueOf(topicGroupCreateVM.getTopicGroupInfoModel().getCreateDayMin())), rowScopeInstance.weight(companion, 1.0f, true), o000OOo.OooO0OO(composer2).OooO00o(), o0000O0.OooO0OO(14, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131056);
                ImageKt.Image(PainterResources_androidKt.painterResource(topicGroupCreateVM.isAdequateCreateDaysCount() ? oOo00OO0.ic_topic_group_create_select_green : oOo00OO0.ic_topic_group_create_select_gray, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f4)), composer2, 6);
                Modifier modifierM478paddingVpY3zN4$default7 = PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f2), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical center4 = arrangement.getCenter();
                Alignment.Vertical centerVertically4 = companion2.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(center4, centerVertically4, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash16 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap16 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor16 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default7);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor16);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl16 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o16 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl16, measurePolicyRowMeasurePolicy4, composerM1309constructorimpl16, currentCompositionLocalMap16);
                if (composerM1309constructorimpl16.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl16.rememberedValue(), Integer.valueOf(currentCompositeKeyHash16))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash16, composerM1309constructorimpl16, currentCompositeKeyHash16, function2OooO00o16);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf16, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                TextKt.m1251Text4IGK_g(o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.topic_group_create_content_fans_xxx, composer2, 0), String.valueOf(topicGroupCreateVM.getTopicGroupInfoModel().getFollowedCountMin())), rowScopeInstance.weight(companion, 1.0f, true), o000OOo.OooO0OO(composer2).OooO00o(), o0000O0.OooO0OO(14, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131056);
                ImageKt.Image(PainterResources_androidKt.painterResource(topicGroupCreateVM.isAdequateFollowedCount() ? oOo00OO0.ic_topic_group_create_select_green : oOo00OO0.ic_topic_group_create_select_gray, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f9)), composer2, 6);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f4)), composer2, 6);
                TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.topic_group_create_content_yalla_chat_download_and_bind, composer2, 0), PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f2), 0.0f, 2, null), o0oO0O0o.OooO0oo(), o0000O0.OooO0OO(12, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 131056);
                SpacerKt.Spacer(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(180)), composer2, 6);
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
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(scrollState, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TopicGroupCreateLayer(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2038300238);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2038300238, i, -1, "com.yalla.yalla.ui.screen.moment.TopicGroupCreateScreen.TopicGroupCreateLayer (TopicGroupCreateScreen.kt:98)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
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
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 6, 0);
            TopicGroupCreateScreen topicGroupCreateScreen = INSTANCE;
            topicGroupCreateScreen.TopicGroupCreateContent(scrollStateRememberScrollState, composerStartRestartGroup, 48);
            topicGroupCreateScreen.TopicGroupCreateToolbar(scrollStateRememberScrollState, composerStartRestartGroup, 48);
            topicGroupCreateScreen.TopicGroupCreateButton(boxScopeInstance, composerStartRestartGroup, 54);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TopicGroupCreateToolbar(ScrollState scrollState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(847294490);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(scrollState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(847294490, i, -1, "com.yalla.yalla.ui.screen.moment.TopicGroupCreateScreen.TopicGroupCreateToolbar (TopicGroupCreateScreen.kt:114)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(TopicGroupCreateVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            TopicGroupCreateVM topicGroupCreateVM = (TopicGroupCreateVM) viewModel;
            topicGroupCreateVM.getAlphaToolbar().setValue(Float.valueOf(RangesKt.coerceIn(scrollState.getValue() / Dp.m3765constructorimpl(50), 0.0f, 1.0f)));
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.topic_group_create, composerStartRestartGroup, 0);
            float fFloatValue = topicGroupCreateVM.getAlphaToolbar().getValue().floatValue();
            int i3 = o0oO0O0o.f47152o00OOOo;
            long j = o0oO0O0o.f46946OooO0O0;
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(Modifier.INSTANCE, Color.m1669copywmQWz5c$default(o0oO0O0o.f47161o00ooo, topicGroupCreateVM.getAlphaToolbar().getValue().floatValue(), 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            composer2 = composerStartRestartGroup;
            t1.OooO00o(strStringResource, fFloatValue, j, null, null, null, null, null, modifierM169backgroundbw27NRU$default, composerStartRestartGroup, 0, 248);
            p149o00Oo0o0.o00000O.OooO0O0(true, composer2, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(scrollState, i));
    }

    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1145272502);
        if ((i & 112) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1145272502, i2, -1, "com.yalla.yalla.ui.screen.moment.TopicGroupCreateScreen.Content (TopicGroupCreateScreen.kt:49)");
            }
            Object obj = o00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O.f53592OooO00o), composerStartRestartGroup).get("DATA");
            TopicGroupInfoModel topicGroupInfoModel = obj instanceof TopicGroupInfoModel ? (TopicGroupInfoModel) obj : null;
            if (topicGroupInfoModel == null) {
                oo0oOO0.OooO0o(null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(columnScope, i));
                return;
            }
            p149o00Oo0o0.o00000O.OooO0O0(true, composerStartRestartGroup, 6, 0);
            Layer(topicGroupInfoModel, composerStartRestartGroup, (i2 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0O0(columnScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void Layer(@Nullable TopicGroupInfoModel topicGroupInfoModel, @Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-460331101);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-460331101, i, -1, "com.yalla.yalla.ui.screen.moment.TopicGroupCreateScreen.Layer (TopicGroupCreateScreen.kt:62)");
        }
        OooOO0 oooOO1 = new OooOO0(topicGroupInfoModel);
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(TopicGroupCreateVM.class, current, null, oooOO1, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        TopicGroupCreateVM topicGroupCreateVM = (TopicGroupCreateVM) viewModel;
        a.OooO00o(null, topicGroupCreateVM.getShowLoadingDialog().getValue().booleanValue(), null, composerStartRestartGroup, 0, 6);
        if (topicGroupCreateVM.getShowDialogBinding().getValue().booleanValue()) {
            o0OO000.OooO0O0("303002", MapsKt.mapOf(new Pair("type", 1)));
        }
        oo000o.OooO0Oo(topicGroupCreateVM.getShowDialogBinding(), o0000.OooO0OO(oO00OOo0.topic_group_create_please_link_yallachat_title), null, null, false, false, null, null, o0000.OooO0OO(oO00OOo0.topic_group_create_please_link_yallachat), false, null, false, new OooO0OO(topicGroupCreateVM), null, false, false, null, OooO0o.f29247OooO0Oo, null, null, composerStartRestartGroup, 0, 12582912, 913148);
        if (topicGroupCreateVM.isCreateSuccess().getValue().booleanValue()) {
            oo0oOO0.OooO0o(null);
        }
        TopicGroupCreateLayer(composerStartRestartGroup, (i >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(topicGroupInfoModel, i));
    }
}
