package p509o0o0O0;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OooOO0O;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.OooO;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import com.code.android.util.o0O0O00;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentForwardContent;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.util.WebPageInfo;
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
import p147o00Oo0Oo.o000OOo;
import p186o00o00oO.o00O00o0;
import p417o0OoO0.o00Oo0;
import p427o0OoOO00.o0OOO0o;
import p469o0OoooOO.o0oO0O0o;
import p515o0o0O0O0.o00oO0o;
import p515o0o0O0O0.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentShareRoomComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentShareRoomComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentShareRoomCompKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,102:1\n76#2:103\n76#2:104\n76#2:105\n76#2:106\n76#2:107\n154#3:108\n154#3:144\n154#3:145\n154#3:146\n73#4,6:109\n79#4:143\n83#4:190\n78#5,11:115\n78#5,11:152\n91#5:184\n91#5:189\n456#6,8:126\n464#6,3:140\n456#6,8:163\n464#6,3:177\n467#6,3:181\n467#6,3:186\n4144#7,6:134\n4144#7,6:171\n73#8,5:147\n78#8:180\n82#8:185\n*S KotlinDebug\n*F\n+ 1 MomentShareRoomComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentShareRoomCompKt\n*L\n36#1:103\n37#1:104\n38#1:105\n39#1:106\n41#1:107\n49#1:108\n66#1:144\n75#1:145\n76#1:146\n45#1:109,6\n45#1:143\n45#1:190\n45#1:115,11\n72#1:152,11\n72#1:184\n45#1:189\n45#1:126,8\n45#1:140,3\n72#1:163,8\n72#1:177,3\n72#1:181,3\n45#1:186,3\n45#1:134,6\n72#1:171,6\n72#1:147,5\n72#1:180\n72#1:185\n*E\n"})
public final class oo00oO {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MomentForwardContent f51333OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f51334OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51335OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f51336OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51337OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f51338OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ EnterRoomParentPage f51339OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, Context context, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, boolean z2, MomentForwardContent momentForwardContent, EnterRoomParentPage enterRoomParentPage) {
            super(0);
            this.f51334OooO0Oo = z;
            this.f51336OooO0o0 = context;
            this.f51335OooO0o = momentDetailModel;
            this.f51337OooO0oO = momentAdapterTag;
            this.f51338OooO0oo = z2;
            this.f51333OooO = momentForwardContent;
            this.f51339OooOO0 = enterRoomParentPage;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004c  */
        /* JADX WARN: Code duplicated, block: B:33:0x009c  */
        /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean z;
            if (this.f51334OooO0Oo) {
                o00oO0o.OooO00o(this.f51336OooO0o0, this.f51335OooO0o, this.f51337OooO0oO, this.f51338OooO0oo, 0, false, 48);
            } else {
                MomentForwardContent model = this.f51333OooO;
                Intrinsics.checkNotNullParameter(model, "model");
                Context context = this.f51336OooO0o0;
                Intrinsics.checkNotNullParameter(context, "context");
                int shareType = model.getShareType();
                if (shareType != 1) {
                    if (shareType == 2) {
                        String url = model.getUrl();
                        if (url != null) {
                            z = url.length() > 0;
                        }
                        if (z) {
                            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.ActivityNotice);
                            String url2 = model.getUrl();
                            Intrinsics.checkNotNull(url2);
                            webPageInfo.OooO0o0(url2);
                            webPageInfo.OooO0Oo(model.getName());
                            webPageInfo.OooO0OO(WebPageInfo.ShareType.Share, model.getImage(), "");
                            long roomId = model.getRoomId();
                            StringBuilder sb = new StringBuilder();
                            sb.append(roomId);
                            webPageInfo.OooO00o("barId", sb.toString());
                            int i = WebActivity.f25584OooOoO0;
                            WebActivity.OooO00o.OooO00o(context, webPageInfo);
                        }
                    } else if (shareType == 3) {
                        String url3 = model.getUrl();
                        if (url3 != null) {
                            z = url3.length() > 0;
                        }
                        if (z) {
                            WebPageInfo webPageInfo2 = new WebPageInfo(WebFrom.RoomMainBanner);
                            String url4 = model.getUrl();
                            Intrinsics.checkNotNull(url4);
                            webPageInfo2.OooO0o0(url4);
                            webPageInfo2.OooO0Oo(model.getName());
                            webPageInfo2.OooO0OO(WebPageInfo.ShareType.Share, model.getImage(), "");
                            long roomId2 = model.getRoomId();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(roomId2);
                            webPageInfo2.OooO00o("barId", sb2.toString());
                            int i2 = WebActivity.f25584OooOoO0;
                            WebActivity.OooO00o.OooO00o(context, webPageInfo2);
                        }
                    } else if (shareType == 4) {
                        String url5 = model.getUrl();
                        if (url5 != null) {
                            z = url5.length() > 0;
                        }
                        if (z) {
                            WebPageInfo webPageInfo3 = new WebPageInfo(WebFrom.MomentActivityBanner);
                            String url6 = model.getUrl();
                            Intrinsics.checkNotNull(url6);
                            webPageInfo3.OooO0o0(url6);
                            webPageInfo3.OooO0Oo(model.getName());
                            webPageInfo3.OooO0OO(WebPageInfo.ShareType.Share, model.getImage(), "");
                            long roomId3 = model.getRoomId();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(roomId3);
                            webPageInfo3.OooO00o("barId", sb3.toString());
                            int i3 = WebActivity.f25584OooOoO0;
                            WebActivity.OooO00o.OooO00o(context, webPageInfo3);
                        }
                    }
                } else if (model.getRoomId() > 0) {
                    RoomModel roomModel = new RoomModel();
                    roomModel.setId(model.getRoomId());
                    roomModel.setImage(model.getImage());
                    roomModel.setName(model.getName());
                    MutableState mutableState = o0OOO0o.f45698OooO00o;
                    o0OOO0o.OooO0o(roomModel, this.f51339OooOO0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f51340OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            it.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f51341OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ EnterRoomParentPage f51342OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentForwardContent f51343OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51344OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f51345OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Modifier modifier, MomentForwardContent momentForwardContent, EnterRoomParentPage enterRoomParentPage, int i, int i2) {
            super(2);
            this.f51341OooO0Oo = modifier;
            this.f51343OooO0o0 = momentForwardContent;
            this.f51342OooO0o = enterRoomParentPage;
            this.f51344OooO0oO = i;
            this.f51345OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oo00oO.OooO00o(this.f51341OooO0Oo, this.f51343OooO0o0, this.f51342OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51344OooO0oO | 1), this.f51345OooO0oo);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable Modifier modifier, @NotNull MomentForwardContent forwardContent, @Nullable EnterRoomParentPage enterRoomParentPage, @Nullable Composer composer, int i, int i2) {
        Composer composer2;
        float f;
        Object obj;
        Intrinsics.checkNotNullParameter(forwardContent, "forwardContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(941853950);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(941853950, i, -1, "com.yalla.yalla.ui.composable.moment.MomentShareRoom (MomentShareRoomComp.kt:34)");
        }
        boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(oo0O.f51351OooO0o)).booleanValue();
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zBooleanValue2 = ((Boolean) composerStartRestartGroup.consume(oo0O.f51347OooO00o)).booleanValue();
        MomentAdapterTag momentAdapterTag = (MomentAdapterTag) composerStartRestartGroup.consume(oo0O.f51348OooO0O0);
        MomentDetailModel momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(oo0O.f51350OooO0Oo);
        int i3 = o0oO0O0o.f47152o00OOOo;
        long j = zBooleanValue ? o0oO0O0o.f46946OooO0O0 : o0oO0O0o.f47078o000o0O;
        Modifier.Companion companion = Modifier.INSTANCE;
        float f2 = 79;
        boolean z = !zBooleanValue;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null), Dp.m3765constructorimpl(f2)), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(oo0o0Oo.OooO00o(z))), j, null, 2, null), false, false, 0L, false, null, null, null, new OooO00o(zBooleanValue, context, momentDetailModel, momentAdapterTag, zBooleanValue2, forwardContent, enterRoomParentPage), 253);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(949065567);
        if (TextUtils.isEmpty(forwardContent.getImage())) {
            composer2 = composerStartRestartGroup;
            f = 0.0f;
            obj = null;
        } else {
            obj = null;
            f = 0.0f;
            composer2 = composerStartRestartGroup;
            ImageKt.Image(o00Oo0.OooO0Oo(forwardContent.getImage(), OooO0O0.f51340OooO0Oo, composerStartRestartGroup, 48, 0), (String) null, ClipKt.clip(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f2)), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(oo0o0Oo.OooO00o(z))), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
        }
        composer2.endReplaceableGroup();
        Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m3765constructorimpl(8), f, 2, obj);
        Arrangement.HorizontalOrVertical horizontalOrVerticalM390spacedBy0680j_4 = arrangement.m390spacedBy0680j_4(Dp.m3765constructorimpl(4));
        composer2.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o2 = o00O00o0.OooO00o(companion2, horizontalOrVerticalM390spacedBy0680j_4, composer2, 6, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default);
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
        OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composer2.startReplaceableGroup(945992040);
        if (!TextUtils.isEmpty(forwardContent.getName())) {
            TextKt.m1251Text4IGK_g(forwardContent.getName(), (Modifier) null, o000OOo.OooO0OO(composer2).f37701OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 3120, 120818);
        }
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(949066391);
        if (!TextUtils.isEmpty(forwardContent.getContent())) {
            TextKt.m1251Text4IGK_g(forwardContent.getContent(), (Modifier) null, o000OOo.OooO0OO(composer2).f37711OooOO0O, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 3120, 120818);
        }
        composer2.endReplaceableGroup();
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(modifier2, forwardContent, enterRoomParentPage, i, i2));
    }
}
