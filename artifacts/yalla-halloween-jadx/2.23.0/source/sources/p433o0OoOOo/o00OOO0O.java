package p433o0OoOOo;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o0O0O00;
import com.facebook.OooOo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p150o00Oo0oO.o00000O;
import p417o0OoO0.o00Oo0;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.i0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomReplyComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomReplyComp.kt\ncom/yalla/yalla/mixedroom/room_bottom/RoomReplyCompKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,356:1\n154#2:357\n154#2:393\n154#2:429\n154#2:557\n154#2:558\n154#2:559\n154#2:560\n154#2:561\n154#2:562\n154#2:563\n154#2:564\n154#2:575\n154#2:611\n154#2:612\n154#2:614\n154#2:615\n154#2:616\n154#2:622\n154#2:623\n73#3,6:358\n79#3:392\n83#3:439\n73#3,6:440\n79#3:474\n83#3:479\n73#3,6:515\n79#3:549\n83#3:569\n78#4,11:364\n78#4,11:400\n91#4:433\n91#4:438\n78#4,11:446\n91#4:478\n78#4,11:486\n78#4,11:521\n91#4:568\n91#4:573\n78#4,11:582\n91#4:620\n456#5,8:375\n464#5,3:389\n456#5,8:411\n464#5,3:425\n467#5,3:430\n467#5,3:435\n456#5,8:457\n464#5,3:471\n467#5,3:475\n456#5,8:497\n464#5,3:511\n456#5,8:532\n464#5,3:546\n36#5:550\n467#5,3:565\n467#5,3:570\n456#5,8:593\n464#5,3:607\n467#5,3:617\n36#5:624\n25#5:631\n4144#6,6:383\n4144#6,6:419\n4144#6,6:465\n4144#6,6:505\n4144#6,6:540\n4144#6,6:601\n72#7,6:394\n78#7:428\n82#7:434\n66#8,6:480\n72#8:514\n76#8:574\n66#8,6:576\n72#8:610\n76#8:621\n1097#9,6:551\n1097#9,6:625\n1097#9,6:632\n76#10:613\n81#11:638\n*S KotlinDebug\n*F\n+ 1 RoomReplyComp.kt\ncom/yalla/yalla/mixedroom/room_bottom/RoomReplyCompKt\n*L\n58#1:357\n64#1:393\n73#1:429\n131#1:557\n136#1:558\n145#1:559\n150#1:560\n163#1:561\n168#1:562\n177#1:563\n182#1:564\n197#1:575\n203#1:611\n204#1:612\n217#1:614\n228#1:615\n229#1:616\n241#1:622\n242#1:623\n55#1:358,6\n55#1:392\n55#1:439\n94#1:440,6\n94#1:474\n94#1:479\n109#1:515,6\n109#1:549\n109#1:569\n55#1:364,11\n61#1:400,11\n61#1:433\n55#1:438\n94#1:446,11\n94#1:478\n108#1:486,11\n109#1:521,11\n109#1:568\n108#1:573\n197#1:582,11\n197#1:620\n55#1:375,8\n55#1:389,3\n61#1:411,8\n61#1:425,3\n61#1:430,3\n55#1:435,3\n94#1:457,8\n94#1:471,3\n94#1:475,3\n108#1:497,8\n108#1:511,3\n109#1:532,8\n109#1:546,3\n119#1:550\n109#1:565,3\n108#1:570,3\n197#1:593,8\n197#1:607,3\n197#1:617,3\n243#1:624\n351#1:631\n55#1:383,6\n61#1:419,6\n94#1:465,6\n108#1:505,6\n109#1:540,6\n197#1:601,6\n61#1:394,6\n61#1:428\n61#1:434\n108#1:480,6\n108#1:514\n108#1:574\n197#1:576,6\n197#1:610\n197#1:621\n119#1:551,6\n243#1:625,6\n351#1:632,6\n211#1:613\n351#1:638\n*E\n"})
public final class o00OOO0O {

    public static final class OooO extends Lambda implements Function1<SVGAView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0o0Oo f46009OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f46010OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0o0Oo o0o0oo, LifecycleOwner lifecycleOwner) {
            super(1);
            this.f46009OooO0Oo = o0o0oo;
            this.f46010OooO0o0 = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SVGAView sVGAView) {
            SVGAView it = sVGAView;
            Intrinsics.checkNotNullParameter(it, "it");
            int i = oOo00OO0.icon_gift_default_gray;
            it.f10172OooOooO = i;
            it.setImageResource(i);
            it.OooOO0O(p139o00OOooO.OooO0o.OooO0Oo(this.f46009OooO0Oo.f46038OooO0oO.getValue()), this.f46010OooO0o0);
            it.OooOO0o();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0o0Oo f46011OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0o0Oo o0o0oo) {
            super(0);
            this.f46011OooO0Oo = o0o0oo;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0o0Oo o0o0oo = this.f46011OooO0Oo;
            o0o0oo.f46032OooO00o.setValue(null);
            o0o0oo.f46033OooO0O0.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0o0Oo f46012OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f46013OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0o0Oo o0o0oo, int i) {
            super(2);
            this.f46012OooO0Oo = o0o0oo;
            this.f46013OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46013OooO0o0 | 1);
            o00OOO0O.OooO00o(this.f46012OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0o0Oo f46014OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f46015OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0o0Oo o0o0oo, int i) {
            super(2);
            this.f46014OooO0Oo = o0o0oo;
            this.f46015OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46015OooO0o0 | 1);
            o00OOO0O.OooO0O0(this.f46014OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Context, SVGAView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f46016OooO0Oo = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SVGAView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            return new SVGAView(it, null, 6, 0);
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0o0Oo f46017OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f46018OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o0o0Oo o0o0oo, int i) {
            super(2);
            this.f46017OooO0Oo = o0o0oo;
            this.f46018OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46018OooO0o0 | 1);
            o00OOO0O.OooO0O0(this.f46017OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0o0Oo f46019OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f46020OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o0o0Oo o0o0oo, int i) {
            super(2);
            this.f46019OooO0Oo = o0o0oo;
            this.f46020OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46020OooO0o0 | 1);
            o00OOO0O.OooO0OO(this.f46019OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<Context, TextView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f46021OooO0Oo = new OooOOO();

        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final TextView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            TextView textView = new TextView(it);
            Intrinsics.checkNotNullParameter(textView, "<this>");
            textView.setTextSize(2, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextColor(o0000.OooO00o(oO00O0o.color_B7B7B7));
            return textView;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f46022OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f46023OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0o0Oo f46024OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f46025OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Modifier modifier, o0o0Oo o0o0oo, int i, int i2) {
            super(2);
            this.f46022OooO0Oo = modifier;
            this.f46024OooO0o0 = o0o0oo;
            this.f46023OooO0o = i;
            this.f46025OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46023OooO0o | 1);
            o00OOO0O.OooO0Oo(this.f46022OooO0Oo, this.f46024OooO0o0, composer, iUpdateChangedFlags, this.f46025OooO0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<TextView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0o0Oo f46026OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(o0o0Oo o0o0oo) {
            super(1);
            this.f46026OooO0Oo = o0o0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextView textView) {
            TextView it = textView;
            Intrinsics.checkNotNullParameter(it, "it");
            it.setText(this.f46026OooO0Oo.f46037OooO0o0.getValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f46027OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f46028OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0o0Oo f46029OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f46030OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(Modifier modifier, o0o0Oo o0o0oo, int i, int i2) {
            super(2);
            this.f46027OooO0Oo = modifier;
            this.f46029OooO0o0 = o0o0oo;
            this.f46028OooO0o = i;
            this.f46030OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46028OooO0o | 1);
            o00OOO0O.OooO0o0(this.f46027OooO0Oo, this.f46029OooO0o0, composer, iUpdateChangedFlags, this.f46030OooO0oO);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(o0o0Oo o0o0oo, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1652584196);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(o0o0oo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1652584196, i2, -1, "com.yalla.yalla.mixedroom.room_bottom.ReplyCloseComp (RoomReplyComp.kt:236)");
            }
            Painter painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.room_reply_close, composerStartRestartGroup, 0);
            float f = 10;
            Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(PaddingKt.m479paddingqDBjuR0(Modifier.INSTANCE, Dp.m3765constructorimpl(23), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(15), Dp.m3765constructorimpl(f)), Dp.m3765constructorimpl(12));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(o0o0oo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO00o(o0o0oo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ImageKt.Image(painterPainterResource, (String) null, o0O0O00.OooO0O0(modifierM523size3ABfNKs, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(o0o0oo, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(o0o0Oo o0o0oo, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(701648376);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(o0o0oo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(701648376, i, -1, "com.yalla.yalla.mixedroom.room_bottom.ReplyImageAndGiftComp (RoomReplyComp.kt:191)");
            }
            boolean z = o0o0oo.f46036OooO0o.getValue().length() == 0;
            MutableState<String> mutableState = o0o0oo.f46038OooO0oO;
            if (z) {
                if (mutableState.getValue().length() == 0) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(o0o0oo, i));
                    return;
                }
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 50;
            Modifier modifierOooO00o = com.facebook.OooOo00.OooO00o(f, companion, composerStartRestartGroup, 733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1728534001);
            MutableState<String> mutableState2 = o0o0oo.f46036OooO0o;
            if (mutableState2.getValue().length() > 0) {
                ImageKt.Image(o00Oo0.OooO0Oo(mutableState2.getValue(), null, composerStartRestartGroup, 0, 1), (String) null, OooOo.OooO0O0(4, SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f))), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-45573403);
            if (mutableState.getValue().length() > 0) {
                AndroidView_androidKt.AndroidView(OooO0o.f46016OooO0Oo, boxScopeInstance.align(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), companion2.getBottomStart()), new OooO(o0o0oo, (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())), composerStartRestartGroup, 6, 0);
                Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getTopEnd());
                float f2 = 4;
                i0.OooO00o(SizeKt.m509height3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(modifierAlign, 0.0f, Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2), 0.0f, 9, null), Dp.m3765constructorimpl(9)), o0o0oo.f46039OooO0oo.getValue().intValue(), false, composerStartRestartGroup, 0, 4);
            }
            if (OooOo.OooO0o.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOO0(o0o0oo, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(@NotNull o0o0Oo roomReplyStates, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(roomReplyStates, "roomReplyStates");
        Composer composerStartRestartGroup = composer.startRestartGroup(1102035231);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(roomReplyStates) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1102035231, i2, -1, "com.yalla.yalla.mixedroom.room_bottom.RoomReplyComp (RoomReplyComp.kt:53)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(66));
            int i3 = o0oO0O0o.f47152o00OOOo;
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(modifierM509height3ABfNKs, o0oO0O0o.f46965OooOo00, null, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), Dp.m3765constructorimpl(13), 0.0f, 0.0f, 0.0f, 14, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO0o.OooO00o(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i4 = (i2 << 3) & 112;
            OooO0Oo(SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), roomReplyStates, composerStartRestartGroup, i4, 0);
            o00000O.OooO00o(4, companion, composerStartRestartGroup, 6);
            OooO0o0(SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, companion, 1.0f, false, 2, null), 0.0f, 1, null), roomReplyStates, composerStartRestartGroup, i4, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            int i5 = i2 & 14;
            OooO0O0(roomReplyStates, composerStartRestartGroup, i5);
            OooO00o(roomReplyStates, composerStartRestartGroup, i5);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(roomReplyStates, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(@Nullable Modifier modifier, @NotNull o0o0Oo roomReplyStates, @Nullable Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(roomReplyStates, "roomReplyStates");
        Composer composerStartRestartGroup = composer.startRestartGroup(-352572672);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(roomReplyStates) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-352572672, i, -1, "com.yalla.yalla.mixedroom.room_bottom.RoomReplyName (RoomReplyComp.kt:89)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierThen = companion.then(modifier4);
            Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, bottom, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
            String value = roomReplyStates.f46035OooO0Oo.getValue();
            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
            long sp = TextUnitKt.getSp(12);
            int i5 = o0oO0O0o.f47152o00OOOo;
            modifier3 = modifier4;
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(value, modifierOooO00o, o0oO0O0o.f47008o00000, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 3120, 120816);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(modifier3, roomReplyStates, i, i2));
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v14 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    public static final void OooO0o0(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r43, @org.jetbrains.annotations.NotNull p433o0OoOOo.o0o0Oo r44, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r45, int r46, int r47) {
        /*
            Method dump skipped, instruction units count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p433o0OoOOo.o00OOO0O.OooO0o0(androidx.compose.ui.Modifier, o0OoOOo.o0o0Oo, androidx.compose.runtime.Composer, int, int):void");
    }
}
