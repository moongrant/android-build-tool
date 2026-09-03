package p543o0o0Ooo0;

import android.graphics.drawable.Drawable;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import com.code.android.util.o0O0O00;
import com.facebook.appevents.OooOOO0;
import com.yalla.yalla.model.user.UserMomentListTypeModel;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import io.agora.rtc.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p423o0OoO0OO.o00O000;
import p476o0OooooO.o0OOo000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserMomentListFilterTypePop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMomentListFilterTypePop.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListFilterTypePop$Pop$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,110:1\n154#2:111\n154#2:112\n164#2:190\n154#2,11:191\n164#2:202\n154#2,11:203\n164#2:214\n154#2,11:215\n36#3:113\n456#3,8:137\n464#3,3:151\n456#3,8:172\n464#3,3:186\n467#3,3:226\n467#3,3:231\n1097#4,6:114\n66#5,6:120\n72#5:154\n76#5:235\n78#6,11:126\n78#6,11:161\n91#6:229\n91#6:234\n4144#7,6:145\n4144#7,6:180\n72#8,6:155\n78#8:189\n82#8:230\n*S KotlinDebug\n*F\n+ 1 UserMomentListFilterTypePop.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListFilterTypePop$Pop$1$2\n*L\n64#1:111\n65#1:112\n75#1:190\n75#1:191,11\n86#1:202\n86#1:203,11\n97#1:214\n97#1:215,11\n66#1:113\n61#1:137,8\n61#1:151,3\n70#1:172,8\n70#1:186,3\n70#1:226,3\n61#1:231,3\n66#1:114,6\n61#1:120,6\n61#1:154\n61#1:235\n61#1:126,11\n70#1:161,11\n70#1:229\n61#1:234\n61#1:145,6\n70#1:180,6\n70#1:155,6\n70#1:189\n70#1:230\n*E\n"})
public final class c1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Drawable f55377OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55378OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<IntSize> f55379OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<UserMomentListTypeModel, Unit> f55380OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c1(Drawable drawable, MutableState<IntSize> mutableState, MomentUserListVM momentUserListVM, Function1<? super UserMomentListTypeModel, Unit> function1) {
        super(2);
        this.f55377OooO0Oo = drawable;
        this.f55379OooO0o0 = mutableState;
        this.f55378OooO0o = momentUserListVM;
        this.f55380OooO0oO = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1875424598, iIntValue, -1, "com.yalla.yalla.ui.screen.user.UserMomentListFilterTypePop.Pop.<anonymous>.<anonymous> (UserMomentListFilterTypePop.kt:60)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 168;
            Modifier modifierM531widthInVpY3zN4 = SizeKt.m531widthInVpY3zN4(SizeKt.m512heightInVpY3zN4(o00O000.OooO00o(companion, this.f55377OooO0Oo, composer2, 70), Dp.m3775constructorimpl(Constants.ERR_MODULE_NOT_FOUND), Dp.m3775constructorimpl(f)), Dp.m3775constructorimpl(132), Dp.m3775constructorimpl(f));
            composer2.startReplaceableGroup(1157296644);
            MutableState<IntSize> mutableState = this.f55379OooO0o0;
            boolean zChanged = composer2.changed(mutableState);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new y0(mutableState);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierM531widthInVpY3zN4, (Function1) objRememberedValue);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOnSizeChanged);
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
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MomentUserListVM momentUserListVM = this.f55378OooO0o;
            String strStringResource = StringResources_androidKt.stringResource(momentUserListVM.getScreenList().get(0).getReId(), composer2, 0);
            composer2.startReplaceableGroup(-1469695324);
            long j = Intrinsics.areEqual(momentUserListVM.getScreenList().get(0), momentUserListVM.getScreenCurrent().getValue()) ? o0OOo000.f48185Ooooo00 : o0000oo.OooO0OO(composer2).f38625OooOO0;
            composer2.endReplaceableGroup();
            float f2 = 28;
            float f3 = (float) 11.5d;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m481paddingqDBjuR0(companion, Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl((float) 28.5d), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f3)), 0.0f, 1, null);
            Function1<UserMomentListTypeModel, Unit> function1 = this.f55380OooO0oO;
            TextKt.m1261Text4IGK_g(strStringResource, o0O0O00.OooO0O0(modifierFillMaxWidth$default, false, false, 0L, false, null, null, null, new z0(momentUserListVM, function1), 255), j, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131064);
            String strStringResource2 = StringResources_androidKt.stringResource(momentUserListVM.getScreenList().get(1).getReId(), composer2, 0);
            composer2.startReplaceableGroup(-1469694501);
            long j2 = Intrinsics.areEqual(momentUserListVM.getScreenList().get(1), momentUserListVM.getScreenCurrent().getValue()) ? o0OOo000.f48185Ooooo00 : o0000oo.OooO0OO(composer2).f38625OooOO0;
            composer2.endReplaceableGroup();
            TextKt.m1261Text4IGK_g(strStringResource2, o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(PaddingKt.m481paddingqDBjuR0(companion, Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f3)), 0.0f, 1, null), false, false, 0L, false, null, null, null, new a1(momentUserListVM, function1), 255), j2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131064);
            String strStringResource3 = StringResources_androidKt.stringResource(momentUserListVM.getScreenList().get(2).getReId(), composer2, 0);
            composer2.startReplaceableGroup(-1469693679);
            long j3 = Intrinsics.areEqual(momentUserListVM.getScreenList().get(2), momentUserListVM.getScreenCurrent().getValue()) ? o0OOo000.f48185Ooooo00 : o0000oo.OooO0OO(composer2).f38625OooOO0;
            composer2.endReplaceableGroup();
            TextKt.m1261Text4IGK_g(strStringResource3, o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(PaddingKt.m481paddingqDBjuR0(companion, Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl((float) 31.5d)), 0.0f, 1, null), false, false, 0L, false, null, null, null, new b1(momentUserListVM, function1), 255), j3, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131064);
            if (OooOOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
