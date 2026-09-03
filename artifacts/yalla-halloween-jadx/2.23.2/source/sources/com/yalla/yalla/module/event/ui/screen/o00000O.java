package com.yalla.yalla.module.event.ui.screen;

import android.content.Context;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.compose.ui.unit.TextUnitType;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.session.o00O0O0;
import com.yalla.yalla.model.SquareEventRoomModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O000o;
import p423o0OoO0OO.o000OO;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEventRoomPreviewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventRoomPreviewScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventRoomPreviewScreen$EventRoomPreviewTabRow$2$1$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,372:1\n66#2,6:373\n72#2:407\n65#2,7:457\n72#2:492\n76#2:505\n76#2:517\n78#3,11:379\n78#3,11:426\n78#3,11:464\n91#3:504\n91#3:511\n91#3:516\n456#4,8:390\n464#4,3:404\n25#4:408\n50#4:416\n49#4:417\n456#4,8:437\n464#4,3:451\n456#4,8:475\n464#4,3:489\n467#4,3:501\n467#4,3:508\n467#4,3:513\n4144#5,6:398\n4144#5,6:445\n4144#5,6:483\n1097#6,6:409\n1097#6,6:418\n154#7:415\n164#7:455\n154#7:456\n154#7:493\n154#7:494\n154#7:495\n164#7:496\n154#7:497\n154#7:498\n154#7:499\n154#7:500\n154#7:506\n154#7:507\n76#8,2:424\n78#8:454\n82#8:512\n81#9:518\n107#9,2:519\n*S KotlinDebug\n*F\n+ 1 EventRoomPreviewScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventRoomPreviewScreen$EventRoomPreviewTabRow$2$1$2\n*L\n273#1:373,6\n273#1:407\n297#1:457,7\n297#1:492\n297#1:505\n273#1:517\n273#1:379,11\n278#1:426,11\n297#1:464,11\n297#1:504\n278#1:511\n273#1:516\n273#1:390,8\n273#1:404,3\n276#1:408\n281#1:416\n281#1:417\n278#1:437,8\n278#1:451,3\n297#1:475,8\n297#1:489,3\n297#1:501,3\n278#1:508,3\n273#1:513,3\n273#1:398,6\n278#1:445,6\n297#1:483,6\n276#1:409,6\n281#1:418,6\n280#1:415\n287#1:455\n294#1:456\n304#1:493\n306#1:494\n307#1:495\n314#1:496\n315#1:497\n316#1:498\n322#1:499\n323#1:500\n333#1:506\n343#1:507\n278#1:424,2\n278#1:454\n278#1:512\n276#1:518\n276#1:519,2\n*E\n"})
public final class o00000O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList<SquareEventRoomModel> f23472OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f23473OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f23474OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f23475OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Context f23476OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00000O(ArrayList<SquareEventRoomModel> arrayList, int i, boolean z, Function1<? super Integer, Unit> function1, int i2, Context context) {
        super(2);
        this.f23472OooO0Oo = arrayList;
        this.f23474OooO0o0 = i;
        this.f23473OooO0o = z;
        this.f23475OooO0oO = function1;
        this.f23476OooO0oo = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(568350077, iIntValue, -1, "com.yalla.yalla.module.event.ui.screen.EventRoomPreviewScreen.EventRoomPreviewTabRow.<anonymous>.<anonymous>.<anonymous> (EventRoomPreviewScreen.kt:272)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ArrayList<SquareEventRoomModel> arrayList = this.f23472OooO0Oo;
            int i = this.f23474OooO0o0;
            SquareEventRoomModel squareEventRoomModel = arrayList.get(i);
            Intrinsics.checkNotNullExpressionValue(squareEventRoomModel, "get(...)");
            SquareEventRoomModel squareEventRoomModel2 = squareEventRoomModel;
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(squareEventRoomModel2.getIsNewRoomEvent()), null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            mutableState.setValue(Boolean.valueOf(EventRoomPreviewScreen.INSTANCE.updateSquareEventRoom(((Boolean) mutableState.getValue()).booleanValue(), squareEventRoomModel2, this.f23473OooO0o)));
            Modifier modifierM527sizeVpY3zN4 = SizeKt.m527sizeVpY3zN4(companion, Dp.m3775constructorimpl(77), Dp.m3775constructorimpl(90));
            Integer numValueOf = Integer.valueOf(i);
            composer2.startReplaceableGroup(511388516);
            Function1<Integer, Unit> function1 = this.f23475OooO0oO;
            boolean zChanged = composer2.changed(numValueOf) | composer2.changed(function1);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new o000000O(function1, i);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(modifierM527sizeVpY3zN4, false, false, 0L, false, null, null, null, (Function0) objRememberedValue2, 253);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM184borderziNgDLE = ((Boolean) mutableState.getValue()).booleanValue() ? BorderKt.m184borderziNgDLE(companion, Dp.m3775constructorimpl((float) 1.5d), Brush.Companion.m1638linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(o0OOo000.f48208o0000O), Color.m1671boximpl(o0OOo000.f48214o0000OOO)}), 0L, 0L, 0, 14, (Object) null), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(10))) : companion;
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
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
            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o2, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            float f = 8;
            ImageKt.Image(o000OO.OooO0OO(squareEventRoomModel2.getRoomPic(), o00000.f23468OooO0Oo, composer2, 48, 0), (String) null, o00O0O0.OooO00o(f, PaddingKt.m478padding3ABfNKs(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(46)).then(modifierM184borderziNgDLE), Dp.m3775constructorimpl(3))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
            composer2.startReplaceableGroup(-1550193302);
            int i2 = 4;
            if (squareEventRoomModel2.getIsStarting()) {
                Context context = this.f23476OooO0oo;
                if (context instanceof FragmentActivity) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.ic_event_preview_bg, composer2, 0), (String) null, boxScopeInstance.align(ClipKt.clip(SizeKt.m527sizeVpY3zN4(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl((float) 2.5d), 7, null), Dp.m3775constructorimpl(40), Dp.m3775constructorimpl(14)), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 3, null)), companion2.getBottomCenter()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                    AndroidView_androidKt.AndroidView(new o00000O0(context), boxScopeInstance.align(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(4), 7, null), Dp.m3775constructorimpl(12)), companion2.getBottomCenter()), null, composer2, 0, 4);
                    i2 = 4;
                }
            }
            o00O000o.OooO00o(composer2);
            float f2 = i2;
            SpacerKt.Spacer(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f2)), composer2, 6);
            TextKt.m1261Text4IGK_g(squareEventRoomModel2.getRoomName(), SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(f2), 0.0f, 2, null), 0.0f, 1, null), o0000oo.OooO0OO(composer2).f38616OooO, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, TextUnitKt.m3968TextUnitanM5pPY(0.0f, TextUnitType.INSTANCE.m3989getSpUIouoOA()), (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 3120, 120176);
            if (com.facebook.appevents.OooOOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
