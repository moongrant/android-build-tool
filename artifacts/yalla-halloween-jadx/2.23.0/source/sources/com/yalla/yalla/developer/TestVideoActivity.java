package com.yalla.yalla.developer;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.OooOOO;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import com.common.support.roomgiftplayer.RoomGiftVideoPlayManager;
import com.common.support.roomgiftplayer.view.RoomGiftPlayContainer;
import com.yalla.yalla.ui.view.RoomGiftSVGAView;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p150o00Oo0oO.o00000OO;
import p411o0Oo0oO0.o0Oo0oo;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/developer/TestVideoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class TestVideoActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final /* synthetic */ int f23324OooO = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final List<String> f23326OooO0o0 = CollectionsKt.mutableListOf("https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627110832921.mp4", "https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0422111950545.mp4", "https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627111315333.mp4", "https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627105807152.mp4", "https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627105708965.mp4", "https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627111256118.mp4", "https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627105859972.mp4", "https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627105602865.mp4", "https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0609145213312.mp4", "https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627105500997.mp4", "https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0520113731041.mp4", "https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0506171924794.mp4", "https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0520113320895.mp4");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String f23325OooO0o = "https://yallatestfile.yalla.live/testVideo/yyevaTestVideo.mp4";

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final String f23327OooO0oO = "https://yallatestfile.yalla.live/CustomProp/Skin/0_1.svga";

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final RoomGiftVideoPlayManager f23328OooO0oo = new RoomGiftVideoPlayManager();

    @SourceDebugExtension({"SMAP\nTestVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestVideoActivity.kt\ncom/yalla/yalla/developer/TestVideoActivity$onCreate$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,146:1\n71#2,7:147\n78#2:182\n82#2:310\n78#3,11:154\n78#3,11:190\n91#3:222\n78#3,11:231\n91#3:263\n78#3,11:272\n91#3:304\n91#3:309\n456#4,8:165\n464#4,3:179\n456#4,8:201\n464#4,3:215\n467#4,3:219\n456#4,8:242\n464#4,3:256\n467#4,3:260\n456#4,8:283\n464#4,3:297\n467#4,3:301\n467#4,3:306\n4144#5,6:173\n4144#5,6:209\n4144#5,6:250\n4144#5,6:291\n72#6,7:183\n79#6:218\n83#6:223\n72#6,7:224\n79#6:259\n83#6:264\n72#6,7:265\n79#6:300\n83#6:305\n*S KotlinDebug\n*F\n+ 1 TestVideoActivity.kt\ncom/yalla/yalla/developer/TestVideoActivity$onCreate$1\n*L\n59#1:147,7\n59#1:182\n59#1:310\n59#1:154,11\n60#1:190,11\n60#1:222\n97#1:231,11\n97#1:263\n117#1:272,11\n117#1:304\n59#1:309\n59#1:165,8\n59#1:179,3\n60#1:201,8\n60#1:215,3\n60#1:219,3\n97#1:242,8\n97#1:256,3\n97#1:260,3\n117#1:283,8\n117#1:297,3\n117#1:301,3\n59#1:306,3\n59#1:173,6\n60#1:209,6\n97#1:250,6\n117#1:291,6\n60#1:183,7\n60#1:218\n60#1:223\n97#1:224,7\n97#1:259\n97#1:264\n117#1:265,7\n117#1:300\n117#1:305\n*E\n"})
    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {
        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1822702112, iIntValue, -1, "com.yalla.yalla.developer.TestVideoActivity.onCreate.<anonymous> (TestVideoActivity.kt:57)");
                }
                composer2.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.INSTANCE;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(companion2, arrangement.getStart(), composer2, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ButtonKt.Button(com.yalla.yalla.developer.OooO00o.f23315OooO0Oo, null, false, null, null, null, null, null, null, o0Oo0oo.f45239OooO00o, composer2, 805306374, 510);
                ButtonKt.Button(OooO0O0.f23316OooO0Oo, null, false, null, null, null, null, null, null, o0Oo0oo.f45240OooO0O0, composer2, 805306374, 510);
                ButtonKt.Button(OooO0OO.f23317OooO0Oo, null, false, null, null, null, null, null, null, o0Oo0oo.f45241OooO0OO, composer2, 805306374, 510);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o3 = OooOOO.OooO00o(companion2, arrangement.getStart(), composer2, 0, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
                if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                ButtonKt.Button(OooO0o.f23318OooO0Oo, null, false, null, null, null, null, null, null, o0Oo0oo.f45242OooO0Oo, composer2, 805306374, 510);
                TestVideoActivity testVideoActivity = TestVideoActivity.this;
                ButtonKt.Button(new OooO(testVideoActivity), null, false, null, null, null, null, null, null, o0Oo0oo.f45244OooO0o0, composer2, 805306368, 510);
                ButtonKt.Button(new OooOO0(testVideoActivity), null, false, null, null, null, null, null, null, o0Oo0oo.f45243OooO0o, composer2, 805306368, 510);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o4 = OooOOO.OooO00o(companion2, arrangement.getStart(), composer2, 0, -1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion);
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
                ButtonKt.Button(new OooOO0O(testVideoActivity), null, false, null, null, null, null, null, null, o0Oo0oo.f45245OooO0oO, composer2, 805306368, 510);
                if (o00000OO.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static void OooOOO0(File file) {
        if (!file.isDirectory()) {
            if (file.exists()) {
                file.delete();
                return;
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File f : fileArrListFiles) {
                Intrinsics.checkNotNullExpressionValue(f, "f");
                OooOOO0(f);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_test_video);
        RoomGiftPlayContainer container = (RoomGiftPlayContainer) findViewById(oO00O0oO.roomGifPlayContainer);
        container.initSvgaView(new RoomGiftSVGAView(this, null, 6, 0));
        Intrinsics.checkNotNullExpressionValue(container, "container");
        this.f23328OooO0oo.init(this, container);
        ((ComposeView) findViewById(oO00O0oO.composeView)).setContent(ComposableLambdaKt.composableLambdaInstance(1822702112, true, new OooO00o()));
    }
}
