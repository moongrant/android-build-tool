package androidx.compose.material;

import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u00ad\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", ShareConstants.WEB_DIALOG_PARAM_TITLE, ViewHierarchyConstants.TEXT_KEY, "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-6oU6zVQ", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "buttons", "AlertDialog-wqdebIU", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidAlertDialog_androidKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:103:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x012e  */
    /* JADX WARN: Code duplicated, block: B:108:0x013c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0158  */
    /* JADX WARN: Code duplicated, block: B:114:0x0165  */
    /* JADX WARN: Code duplicated, block: B:127:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0196  */
    /* JADX WARN: Code duplicated, block: B:129:0x0199  */
    /* JADX WARN: Code duplicated, block: B:132:0x019e  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:143:0x01be  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:153:0x020e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0227  */
    /* JADX WARN: Code duplicated, block: B:160:0x0281  */
    /* JADX WARN: Code duplicated, block: B:165:0x029b  */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: AlertDialog-6oU6zVQ, reason: not valid java name */
    public static final void m962AlertDialog6oU6zVQ(@NotNull final Function0<Unit> onDismissRequest, @NotNull final Function2<? super Composer, ? super Integer, Unit> confirmButton, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Shape shape, long j, long j2, @Nullable DialogProperties dialogProperties, @Nullable Composer composer, final int i, final int i2) {
        final int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int i9;
        long jM1057contentColorForek8zF_U;
        int i10;
        int i11;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Function2<? super Composer, ? super Integer, Unit> function7;
        Shape medium;
        int i12;
        long jM1043getSurface0d7_KjU;
        DialogProperties dialogProperties2;
        long j3;
        Function2<? super Composer, ? super Integer, Unit> function8;
        final Function2<? super Composer, ? super Integer, Unit> function9;
        Function2<? super Composer, ? super Integer, Unit> function10;
        long j4;
        Shape shape2;
        final Function2<? super Composer, ? super Integer, Unit> function11;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function12;
        final Function2<? super Composer, ? super Integer, Unit> function13;
        final Shape shape3;
        final long j5;
        final long j6;
        final DialogProperties dialogProperties3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i13;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Composer composerStartRestartGroup = composer.startRestartGroup(-606536823);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(confirmButton) ? 32 : 16;
        }
        int i16 = i2 & 4;
        if (i16 == 0) {
            if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        i3 |= 196608;
                        function5 = function4;
                    } else {
                        function5 = function4;
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(function5)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                    }
                    if ((i & 3670016) != 0) {
                        if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(shape)) {
                            i15 = 524288;
                        } else {
                            i15 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        }
                        i3 |= i15;
                    }
                    if ((i & 29360128) != 0) {
                        if ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j)) {
                            i14 = Configuration.BLOCK_SIZE;
                        } else {
                            i14 = 8388608;
                        }
                        i3 |= i14;
                    }
                    if ((i & 234881024) == 0) {
                        jM1057contentColorForek8zF_U = j2;
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(jM1057contentColorForek8zF_U)) {
                            i13 = 33554432;
                        } else {
                            i13 = 67108864;
                        }
                        i3 |= i13;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    i10 = i2 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                    if (i10 != 0) {
                        i3 |= 805306368;
                    } else if ((i & 1879048192) == 0) {
                        if (composerStartRestartGroup.changed(dialogProperties)) {
                            i11 = 536870912;
                        } else {
                            i11 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 1533916891) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i6 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function14 = i8 == 0 ? function5 : null;
                            if ((i2 & 64) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -3670017;
                            } else {
                                medium = shape;
                            }
                            if ((i2 & 128) != 0) {
                                i12 = i3 & (-29360129);
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            } else {
                                i12 = i3;
                                jM1043getSurface0d7_KjU = j;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                                i12 &= -234881025;
                            }
                            if (i10 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            j3 = jM1043getSurface0d7_KjU;
                            function8 = function14;
                            function9 = function6;
                            i3 = i12;
                            function10 = function7;
                            j4 = jM1057contentColorForek8zF_U;
                            shape2 = medium;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                i3 &= -234881025;
                            }
                            modifier2 = modifier;
                            function10 = function3;
                            shape2 = shape;
                            j3 = j;
                            dialogProperties2 = dialogProperties;
                            j4 = jM1057contentColorForek8zF_U;
                            function8 = function5;
                            function9 = function2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                        }
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i17) {
                                if ((i17 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1849673151, i17, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                                }
                                float f = 8;
                                Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2));
                                final Function2<Composer, Integer, Unit> function15 = function9;
                                final int i18 = i3;
                                final Function2<Composer, Integer, Unit> function16 = confirmButton;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
                                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                                }
                                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                AlertDialogKt.m961AlertDialogFlowRowixp7dh8(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer3, int i19) {
                                        if ((i19 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1789213604, i19, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
                                        }
                                        Function2<Composer, Integer, Unit> function17 = function15;
                                        composer3.startReplaceableGroup(-1046483318);
                                        if (function17 != null) {
                                            function17.invoke(composer3, Integer.valueOf((i18 >> 9) & 14));
                                            Unit unit = Unit.INSTANCE;
                                        }
                                        composer3.endReplaceableGroup();
                                        if (androidx.compose.animation.OooOO0O.OooO00o((i18 >> 3) & 14, function16, composer3)) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer2, 438);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i17 = (i3 & 14) | 48 | (i3 & 896);
                        int i18 = i3 >> 3;
                        Function2<? super Composer, ? super Integer, Unit> function15 = function9;
                        m963AlertDialogwqdebIU(onDismissRequest, composableLambda, modifier2, function10, function8, shape2, j3, j4, dialogProperties2, composerStartRestartGroup, i17 | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function11 = function15;
                        modifier3 = modifier2;
                        function12 = function10;
                        function13 = function8;
                        shape3 = shape2;
                        j5 = j3;
                        j6 = j4;
                        dialogProperties3 = dialogProperties2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function11 = function2;
                        function12 = function3;
                        dialogProperties3 = dialogProperties;
                        function13 = function5;
                        j6 = jM1057contentColorForek8zF_U;
                        shape3 = shape;
                        j5 = j;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i19) {
                            AndroidAlertDialog_androidKt.m962AlertDialog6oU6zVQ(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j5, j6, dialogProperties3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                    function5 = function4;
                } else {
                    function5 = function4;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                if ((i & 3670016) != 0) {
                    if ((i2 & 64) == 0) {
                        i15 = 524288;
                    } else {
                        i15 = 524288;
                    }
                    i3 |= i15;
                }
                if ((i & 29360128) != 0) {
                    if ((i2 & 128) == 0) {
                        i14 = Configuration.BLOCK_SIZE;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i14;
                }
                if ((i & 234881024) == 0) {
                    jM1057contentColorForek8zF_U = j2;
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                        i13 = 33554432;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                i10 = i2 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i10 != 0) {
                    i3 |= 805306368;
                } else if ((i & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(dialogProperties)) {
                        i11 = 536870912;
                    } else {
                        i11 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i3 |= i11;
                }
                if ((i3 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 128) != 0) {
                            i12 = i3 & (-29360129);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        } else {
                            i12 = i3;
                            jM1043getSurface0d7_KjU = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                            i12 &= -234881025;
                        }
                        if (i10 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j3 = jM1043getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i3 = i12;
                        function10 = function7;
                        j4 = jM1057contentColorForek8zF_U;
                        shape2 = medium;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 128) != 0) {
                            i12 = i3 & (-29360129);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        } else {
                            i12 = i3;
                            jM1043getSurface0d7_KjU = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                            i12 &= -234881025;
                        }
                        if (i10 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j3 = jM1043getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i3 = i12;
                        function10 = function7;
                        j4 = jM1057contentColorForek8zF_U;
                        shape2 = medium;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                    }
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i19) {
                            if ((i19 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1849673151, i19, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                            }
                            float f = 8;
                            Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2));
                            final Function2<? super Composer, ? super Integer, Unit> function16 = function9;
                            final int i110 = i3;
                            final Function2<? super Composer, ? super Integer, Unit> function17 = confirmButton;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            AlertDialogKt.m961AlertDialogFlowRowixp7dh8(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i111) {
                                    if ((i111 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1789213604, i111, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
                                    }
                                    Function2<Composer, Integer, Unit> function18 = function16;
                                    composer3.startReplaceableGroup(-1046483318);
                                    if (function18 != null) {
                                        function18.invoke(composer3, Integer.valueOf((i110 >> 9) & 14));
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer3.endReplaceableGroup();
                                    if (androidx.compose.animation.OooOO0O.OooO00o((i110 >> 3) & 14, function17, composer3)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i19 = (i3 & 14) | 48 | (i3 & 896);
                    int i110 = i3 >> 3;
                    Function2<? super Composer, ? super Integer, Unit> function16 = function9;
                    m963AlertDialogwqdebIU(onDismissRequest, composableLambda2, modifier2, function10, function8, shape2, j3, j4, dialogProperties2, composerStartRestartGroup, i19 | (i110 & 7168) | (57344 & i110) | (458752 & i110) | (i110 & 3670016) | (i110 & 29360128) | (i110 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function16;
                    modifier3 = modifier2;
                    function12 = function10;
                    function13 = function8;
                    shape3 = shape2;
                    j5 = j3;
                    j6 = j4;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 128) != 0) {
                            i12 = i3 & (-29360129);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        } else {
                            i12 = i3;
                            jM1043getSurface0d7_KjU = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                            i12 &= -234881025;
                        }
                        if (i10 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j3 = jM1043getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i3 = i12;
                        function10 = function7;
                        j4 = jM1057contentColorForek8zF_U;
                        shape2 = medium;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 128) != 0) {
                            i12 = i3 & (-29360129);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        } else {
                            i12 = i3;
                            jM1043getSurface0d7_KjU = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                            i12 &= -234881025;
                        }
                        if (i10 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j3 = jM1043getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i3 = i12;
                        function10 = function7;
                        j4 = jM1057contentColorForek8zF_U;
                        shape2 = medium;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                    }
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i111) {
                            if ((i111 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1849673151, i111, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                            }
                            float f = 8;
                            Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2));
                            final Function2<? super Composer, ? super Integer, Unit> function17 = function9;
                            final int i112 = i3;
                            final Function2<? super Composer, ? super Integer, Unit> function18 = confirmButton;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            AlertDialogKt.m961AlertDialogFlowRowixp7dh8(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i113) {
                                    if ((i113 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1789213604, i113, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
                                    }
                                    Function2<Composer, Integer, Unit> function19 = function17;
                                    composer3.startReplaceableGroup(-1046483318);
                                    if (function19 != null) {
                                        function19.invoke(composer3, Integer.valueOf((i112 >> 9) & 14));
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer3.endReplaceableGroup();
                                    if (androidx.compose.animation.OooOO0O.OooO00o((i112 >> 3) & 14, function18, composer3)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i111 = (i3 & 14) | 48 | (i3 & 896);
                    int i112 = i3 >> 3;
                    Function2<? super Composer, ? super Integer, Unit> function17 = function9;
                    m963AlertDialogwqdebIU(onDismissRequest, composableLambda3, modifier2, function10, function8, shape2, j3, j4, dialogProperties2, composerStartRestartGroup, i111 | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (i112 & 3670016) | (i112 & 29360128) | (i112 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function17;
                    modifier3 = modifier2;
                    function12 = function10;
                    function13 = function8;
                    shape3 = shape2;
                    j5 = j3;
                    j6 = j4;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i113) {
                        AndroidAlertDialog_androidKt.m962AlertDialog6oU6zVQ(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j5, j6, dialogProperties3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                    function5 = function4;
                } else {
                    function5 = function4;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                if ((i & 3670016) != 0) {
                    if ((i2 & 64) == 0) {
                        i15 = 524288;
                    } else {
                        i15 = 524288;
                    }
                    i3 |= i15;
                }
                if ((i & 29360128) != 0) {
                    if ((i2 & 128) == 0) {
                        i14 = Configuration.BLOCK_SIZE;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i14;
                }
                if ((i & 234881024) == 0) {
                    jM1057contentColorForek8zF_U = j2;
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                        i13 = 33554432;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                i10 = i2 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i10 != 0) {
                    i3 |= 805306368;
                } else if ((i & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(dialogProperties)) {
                        i11 = 536870912;
                    } else {
                        i11 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i3 |= i11;
                }
                if ((i3 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 128) != 0) {
                            i12 = i3 & (-29360129);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        } else {
                            i12 = i3;
                            jM1043getSurface0d7_KjU = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                            i12 &= -234881025;
                        }
                        if (i10 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j3 = jM1043getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i3 = i12;
                        function10 = function7;
                        j4 = jM1057contentColorForek8zF_U;
                        shape2 = medium;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 128) != 0) {
                            i12 = i3 & (-29360129);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        } else {
                            i12 = i3;
                            jM1043getSurface0d7_KjU = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                            i12 &= -234881025;
                        }
                        if (i10 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j3 = jM1043getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i3 = i12;
                        function10 = function7;
                        j4 = jM1057contentColorForek8zF_U;
                        shape2 = medium;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                    }
                    ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i113) {
                            if ((i113 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1849673151, i113, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                            }
                            float f = 8;
                            Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2));
                            final Function2<? super Composer, ? super Integer, Unit> function18 = function9;
                            final int i114 = i3;
                            final Function2<? super Composer, ? super Integer, Unit> function19 = confirmButton;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            AlertDialogKt.m961AlertDialogFlowRowixp7dh8(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i115) {
                                    if ((i115 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1789213604, i115, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
                                    }
                                    Function2<Composer, Integer, Unit> function110 = function18;
                                    composer3.startReplaceableGroup(-1046483318);
                                    if (function110 != null) {
                                        function110.invoke(composer3, Integer.valueOf((i114 >> 9) & 14));
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer3.endReplaceableGroup();
                                    if (androidx.compose.animation.OooOO0O.OooO00o((i114 >> 3) & 14, function19, composer3)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i113 = (i3 & 14) | 48 | (i3 & 896);
                    int i114 = i3 >> 3;
                    Function2<? super Composer, ? super Integer, Unit> function18 = function9;
                    m963AlertDialogwqdebIU(onDismissRequest, composableLambda4, modifier2, function10, function8, shape2, j3, j4, dialogProperties2, composerStartRestartGroup, i113 | (i114 & 7168) | (57344 & i114) | (458752 & i114) | (i114 & 3670016) | (i114 & 29360128) | (i114 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function18;
                    modifier3 = modifier2;
                    function12 = function10;
                    function13 = function8;
                    shape3 = shape2;
                    j5 = j3;
                    j6 = j4;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 128) != 0) {
                            i12 = i3 & (-29360129);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        } else {
                            i12 = i3;
                            jM1043getSurface0d7_KjU = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                            i12 &= -234881025;
                        }
                        if (i10 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j3 = jM1043getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i3 = i12;
                        function10 = function7;
                        j4 = jM1057contentColorForek8zF_U;
                        shape2 = medium;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 128) != 0) {
                            i12 = i3 & (-29360129);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        } else {
                            i12 = i3;
                            jM1043getSurface0d7_KjU = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                            i12 &= -234881025;
                        }
                        if (i10 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j3 = jM1043getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i3 = i12;
                        function10 = function7;
                        j4 = jM1057contentColorForek8zF_U;
                        shape2 = medium;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                    }
                    ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i115) {
                            if ((i115 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1849673151, i115, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                            }
                            float f = 8;
                            Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2));
                            final Function2<? super Composer, ? super Integer, Unit> function19 = function9;
                            final int i116 = i3;
                            final Function2<? super Composer, ? super Integer, Unit> function110 = confirmButton;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            AlertDialogKt.m961AlertDialogFlowRowixp7dh8(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i117) {
                                    if ((i117 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1789213604, i117, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
                                    }
                                    Function2<Composer, Integer, Unit> function111 = function19;
                                    composer3.startReplaceableGroup(-1046483318);
                                    if (function111 != null) {
                                        function111.invoke(composer3, Integer.valueOf((i116 >> 9) & 14));
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer3.endReplaceableGroup();
                                    if (androidx.compose.animation.OooOO0O.OooO00o((i116 >> 3) & 14, function110, composer3)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i115 = (i3 & 14) | 48 | (i3 & 896);
                    int i116 = i3 >> 3;
                    Function2<? super Composer, ? super Integer, Unit> function19 = function9;
                    m963AlertDialogwqdebIU(onDismissRequest, composableLambda5, modifier2, function10, function8, shape2, j3, j4, dialogProperties2, composerStartRestartGroup, i115 | (i116 & 7168) | (57344 & i116) | (458752 & i116) | (i116 & 3670016) | (i116 & 29360128) | (i116 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function19;
                    modifier3 = modifier2;
                    function12 = function10;
                    function13 = function8;
                    shape3 = shape2;
                    j5 = j3;
                    j6 = j4;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i117) {
                        AndroidAlertDialog_androidKt.m962AlertDialog6oU6zVQ(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j5, j6, dialogProperties3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
                function5 = function4;
            } else {
                function5 = function4;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            if ((i & 3670016) != 0) {
                if ((i2 & 64) == 0) {
                    i15 = 524288;
                } else {
                    i15 = 524288;
                }
                i3 |= i15;
            }
            if ((i & 29360128) != 0) {
                if ((i2 & 128) == 0) {
                    i14 = Configuration.BLOCK_SIZE;
                } else {
                    i14 = Configuration.BLOCK_SIZE;
                }
                i3 |= i14;
            }
            if ((i & 234881024) == 0) {
                jM1057contentColorForek8zF_U = j2;
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    i13 = 33554432;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            } else {
                jM1057contentColorForek8zF_U = j2;
            }
            i10 = i2 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i10 != 0) {
                i3 |= 805306368;
            } else if ((i & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(dialogProperties)) {
                    i11 = 536870912;
                } else {
                    i11 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i3 |= i11;
            }
            if ((i3 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 128) != 0) {
                        i12 = i3 & (-29360129);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    } else {
                        i12 = i3;
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                        i12 &= -234881025;
                    }
                    if (i10 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j3 = jM1043getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i3 = i12;
                    function10 = function7;
                    j4 = jM1057contentColorForek8zF_U;
                    shape2 = medium;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 128) != 0) {
                        i12 = i3 & (-29360129);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    } else {
                        i12 = i3;
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                        i12 &= -234881025;
                    }
                    if (i10 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j3 = jM1043getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i3 = i12;
                    function10 = function7;
                    j4 = jM1057contentColorForek8zF_U;
                    shape2 = medium;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                }
                ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i117) {
                        if ((i117 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1849673151, i117, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                        }
                        float f = 8;
                        Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2));
                        final Function2<? super Composer, ? super Integer, Unit> function110 = function9;
                        final int i118 = i3;
                        final Function2<? super Composer, ? super Integer, Unit> function111 = confirmButton;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        AlertDialogKt.m961AlertDialogFlowRowixp7dh8(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i119) {
                                if ((i119 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1789213604, i119, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
                                }
                                Function2<Composer, Integer, Unit> function112 = function110;
                                composer3.startReplaceableGroup(-1046483318);
                                if (function112 != null) {
                                    function112.invoke(composer3, Integer.valueOf((i118 >> 9) & 14));
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer3.endReplaceableGroup();
                                if (androidx.compose.animation.OooOO0O.OooO00o((i118 >> 3) & 14, function111, composer3)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 438);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i117 = (i3 & 14) | 48 | (i3 & 896);
                int i118 = i3 >> 3;
                Function2<? super Composer, ? super Integer, Unit> function110 = function9;
                m963AlertDialogwqdebIU(onDismissRequest, composableLambda6, modifier2, function10, function8, shape2, j3, j4, dialogProperties2, composerStartRestartGroup, i117 | (i118 & 7168) | (57344 & i118) | (458752 & i118) | (i118 & 3670016) | (i118 & 29360128) | (i118 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function110;
                modifier3 = modifier2;
                function12 = function10;
                function13 = function8;
                shape3 = shape2;
                j5 = j3;
                j6 = j4;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 128) != 0) {
                        i12 = i3 & (-29360129);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    } else {
                        i12 = i3;
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                        i12 &= -234881025;
                    }
                    if (i10 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j3 = jM1043getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i3 = i12;
                    function10 = function7;
                    j4 = jM1057contentColorForek8zF_U;
                    shape2 = medium;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 128) != 0) {
                        i12 = i3 & (-29360129);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    } else {
                        i12 = i3;
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                        i12 &= -234881025;
                    }
                    if (i10 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j3 = jM1043getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i3 = i12;
                    function10 = function7;
                    j4 = jM1057contentColorForek8zF_U;
                    shape2 = medium;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                }
                ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i119) {
                        if ((i119 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1849673151, i119, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                        }
                        float f = 8;
                        Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2));
                        final Function2<? super Composer, ? super Integer, Unit> function111 = function9;
                        final int i1110 = i3;
                        final Function2<? super Composer, ? super Integer, Unit> function112 = confirmButton;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        AlertDialogKt.m961AlertDialogFlowRowixp7dh8(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i1111) {
                                if ((i1111 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1789213604, i1111, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
                                }
                                Function2<Composer, Integer, Unit> function113 = function111;
                                composer3.startReplaceableGroup(-1046483318);
                                if (function113 != null) {
                                    function113.invoke(composer3, Integer.valueOf((i1110 >> 9) & 14));
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer3.endReplaceableGroup();
                                if (androidx.compose.animation.OooOO0O.OooO00o((i1110 >> 3) & 14, function112, composer3)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 438);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i119 = (i3 & 14) | 48 | (i3 & 896);
                int i1110 = i3 >> 3;
                Function2<? super Composer, ? super Integer, Unit> function111 = function9;
                m963AlertDialogwqdebIU(onDismissRequest, composableLambda7, modifier2, function10, function8, shape2, j3, j4, dialogProperties2, composerStartRestartGroup, i119 | (i1110 & 7168) | (57344 & i1110) | (458752 & i1110) | (i1110 & 3670016) | (i1110 & 29360128) | (i1110 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function111;
                modifier3 = modifier2;
                function12 = function10;
                function13 = function8;
                shape3 = shape2;
                j5 = j3;
                j6 = j4;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1111) {
                    AndroidAlertDialog_androidKt.m962AlertDialog6oU6zVQ(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j5, j6, dialogProperties3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                    function5 = function4;
                } else {
                    function5 = function4;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                if ((i & 3670016) != 0) {
                    if ((i2 & 64) == 0) {
                        i15 = 524288;
                    } else {
                        i15 = 524288;
                    }
                    i3 |= i15;
                }
                if ((i & 29360128) != 0) {
                    if ((i2 & 128) == 0) {
                        i14 = Configuration.BLOCK_SIZE;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i14;
                }
                if ((i & 234881024) == 0) {
                    jM1057contentColorForek8zF_U = j2;
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                        i13 = 33554432;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                i10 = i2 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i10 != 0) {
                    i3 |= 805306368;
                } else if ((i & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(dialogProperties)) {
                        i11 = 536870912;
                    } else {
                        i11 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i3 |= i11;
                }
                if ((i3 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 128) != 0) {
                            i12 = i3 & (-29360129);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        } else {
                            i12 = i3;
                            jM1043getSurface0d7_KjU = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                            i12 &= -234881025;
                        }
                        if (i10 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j3 = jM1043getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i3 = i12;
                        function10 = function7;
                        j4 = jM1057contentColorForek8zF_U;
                        shape2 = medium;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 128) != 0) {
                            i12 = i3 & (-29360129);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        } else {
                            i12 = i3;
                            jM1043getSurface0d7_KjU = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                            i12 &= -234881025;
                        }
                        if (i10 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j3 = jM1043getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i3 = i12;
                        function10 = function7;
                        j4 = jM1057contentColorForek8zF_U;
                        shape2 = medium;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                    }
                    ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1111) {
                            if ((i1111 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1849673151, i1111, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                            }
                            float f = 8;
                            Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2));
                            final Function2<? super Composer, ? super Integer, Unit> function112 = function9;
                            final int i1112 = i3;
                            final Function2<? super Composer, ? super Integer, Unit> function113 = confirmButton;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            AlertDialogKt.m961AlertDialogFlowRowixp7dh8(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i1113) {
                                    if ((i1113 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1789213604, i1113, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
                                    }
                                    Function2<Composer, Integer, Unit> function114 = function112;
                                    composer3.startReplaceableGroup(-1046483318);
                                    if (function114 != null) {
                                        function114.invoke(composer3, Integer.valueOf((i1112 >> 9) & 14));
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer3.endReplaceableGroup();
                                    if (androidx.compose.animation.OooOO0O.OooO00o((i1112 >> 3) & 14, function113, composer3)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i1111 = (i3 & 14) | 48 | (i3 & 896);
                    int i1112 = i3 >> 3;
                    Function2<? super Composer, ? super Integer, Unit> function112 = function9;
                    m963AlertDialogwqdebIU(onDismissRequest, composableLambda8, modifier2, function10, function8, shape2, j3, j4, dialogProperties2, composerStartRestartGroup, i1111 | (i1112 & 7168) | (57344 & i1112) | (458752 & i1112) | (i1112 & 3670016) | (i1112 & 29360128) | (i1112 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function112;
                    modifier3 = modifier2;
                    function12 = function10;
                    function13 = function8;
                    shape3 = shape2;
                    j5 = j3;
                    j6 = j4;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 128) != 0) {
                            i12 = i3 & (-29360129);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        } else {
                            i12 = i3;
                            jM1043getSurface0d7_KjU = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                            i12 &= -234881025;
                        }
                        if (i10 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j3 = jM1043getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i3 = i12;
                        function10 = function7;
                        j4 = jM1057contentColorForek8zF_U;
                        shape2 = medium;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i6 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 64) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -3670017;
                        } else {
                            medium = shape;
                        }
                        if ((i2 & 128) != 0) {
                            i12 = i3 & (-29360129);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        } else {
                            i12 = i3;
                            jM1043getSurface0d7_KjU = j;
                        }
                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                            i12 &= -234881025;
                        }
                        if (i10 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        j3 = jM1043getSurface0d7_KjU;
                        function8 = function14;
                        function9 = function6;
                        i3 = i12;
                        function10 = function7;
                        j4 = jM1057contentColorForek8zF_U;
                        shape2 = medium;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                    }
                    ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i1113) {
                            if ((i1113 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1849673151, i1113, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                            }
                            float f = 8;
                            Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2));
                            final Function2<? super Composer, ? super Integer, Unit> function113 = function9;
                            final int i1114 = i3;
                            final Function2<? super Composer, ? super Integer, Unit> function114 = confirmButton;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
                            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            AlertDialogKt.m961AlertDialogFlowRowixp7dh8(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i1115) {
                                    if ((i1115 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1789213604, i1115, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
                                    }
                                    Function2<Composer, Integer, Unit> function115 = function113;
                                    composer3.startReplaceableGroup(-1046483318);
                                    if (function115 != null) {
                                        function115.invoke(composer3, Integer.valueOf((i1114 >> 9) & 14));
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer3.endReplaceableGroup();
                                    if (androidx.compose.animation.OooOO0O.OooO00o((i1114 >> 3) & 14, function114, composer3)) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 438);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i1113 = (i3 & 14) | 48 | (i3 & 896);
                    int i1114 = i3 >> 3;
                    Function2<? super Composer, ? super Integer, Unit> function113 = function9;
                    m963AlertDialogwqdebIU(onDismissRequest, composableLambda9, modifier2, function10, function8, shape2, j3, j4, dialogProperties2, composerStartRestartGroup, i1113 | (i1114 & 7168) | (57344 & i1114) | (458752 & i1114) | (i1114 & 3670016) | (i1114 & 29360128) | (i1114 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function11 = function113;
                    modifier3 = modifier2;
                    function12 = function10;
                    function13 = function8;
                    shape3 = shape2;
                    j5 = j3;
                    j6 = j4;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1115) {
                        AndroidAlertDialog_androidKt.m962AlertDialog6oU6zVQ(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j5, j6, dialogProperties3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
                function5 = function4;
            } else {
                function5 = function4;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            if ((i & 3670016) != 0) {
                if ((i2 & 64) == 0) {
                    i15 = 524288;
                } else {
                    i15 = 524288;
                }
                i3 |= i15;
            }
            if ((i & 29360128) != 0) {
                if ((i2 & 128) == 0) {
                    i14 = Configuration.BLOCK_SIZE;
                } else {
                    i14 = Configuration.BLOCK_SIZE;
                }
                i3 |= i14;
            }
            if ((i & 234881024) == 0) {
                jM1057contentColorForek8zF_U = j2;
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    i13 = 33554432;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            } else {
                jM1057contentColorForek8zF_U = j2;
            }
            i10 = i2 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i10 != 0) {
                i3 |= 805306368;
            } else if ((i & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(dialogProperties)) {
                    i11 = 536870912;
                } else {
                    i11 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i3 |= i11;
            }
            if ((i3 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 128) != 0) {
                        i12 = i3 & (-29360129);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    } else {
                        i12 = i3;
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                        i12 &= -234881025;
                    }
                    if (i10 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j3 = jM1043getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i3 = i12;
                    function10 = function7;
                    j4 = jM1057contentColorForek8zF_U;
                    shape2 = medium;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 128) != 0) {
                        i12 = i3 & (-29360129);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    } else {
                        i12 = i3;
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                        i12 &= -234881025;
                    }
                    if (i10 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j3 = jM1043getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i3 = i12;
                    function10 = function7;
                    j4 = jM1057contentColorForek8zF_U;
                    shape2 = medium;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                }
                ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1115) {
                        if ((i1115 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1849673151, i1115, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                        }
                        float f = 8;
                        Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2));
                        final Function2<? super Composer, ? super Integer, Unit> function114 = function9;
                        final int i1116 = i3;
                        final Function2<? super Composer, ? super Integer, Unit> function115 = confirmButton;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        AlertDialogKt.m961AlertDialogFlowRowixp7dh8(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i1117) {
                                if ((i1117 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1789213604, i1117, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
                                }
                                Function2<Composer, Integer, Unit> function116 = function114;
                                composer3.startReplaceableGroup(-1046483318);
                                if (function116 != null) {
                                    function116.invoke(composer3, Integer.valueOf((i1116 >> 9) & 14));
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer3.endReplaceableGroup();
                                if (androidx.compose.animation.OooOO0O.OooO00o((i1116 >> 3) & 14, function115, composer3)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 438);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1115 = (i3 & 14) | 48 | (i3 & 896);
                int i1116 = i3 >> 3;
                Function2<? super Composer, ? super Integer, Unit> function114 = function9;
                m963AlertDialogwqdebIU(onDismissRequest, composableLambda10, modifier2, function10, function8, shape2, j3, j4, dialogProperties2, composerStartRestartGroup, i1115 | (i1116 & 7168) | (57344 & i1116) | (458752 & i1116) | (i1116 & 3670016) | (i1116 & 29360128) | (i1116 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function114;
                modifier3 = modifier2;
                function12 = function10;
                function13 = function8;
                shape3 = shape2;
                j5 = j3;
                j6 = j4;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 128) != 0) {
                        i12 = i3 & (-29360129);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    } else {
                        i12 = i3;
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                        i12 &= -234881025;
                    }
                    if (i10 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j3 = jM1043getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i3 = i12;
                    function10 = function7;
                    j4 = jM1057contentColorForek8zF_U;
                    shape2 = medium;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 128) != 0) {
                        i12 = i3 & (-29360129);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    } else {
                        i12 = i3;
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                        i12 &= -234881025;
                    }
                    if (i10 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j3 = jM1043getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i3 = i12;
                    function10 = function7;
                    j4 = jM1057contentColorForek8zF_U;
                    shape2 = medium;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                }
                ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1117) {
                        if ((i1117 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1849673151, i1117, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                        }
                        float f = 8;
                        Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2));
                        final Function2<? super Composer, ? super Integer, Unit> function115 = function9;
                        final int i1118 = i3;
                        final Function2<? super Composer, ? super Integer, Unit> function116 = confirmButton;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        AlertDialogKt.m961AlertDialogFlowRowixp7dh8(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i1119) {
                                if ((i1119 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1789213604, i1119, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
                                }
                                Function2<Composer, Integer, Unit> function117 = function115;
                                composer3.startReplaceableGroup(-1046483318);
                                if (function117 != null) {
                                    function117.invoke(composer3, Integer.valueOf((i1118 >> 9) & 14));
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer3.endReplaceableGroup();
                                if (androidx.compose.animation.OooOO0O.OooO00o((i1118 >> 3) & 14, function116, composer3)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 438);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1117 = (i3 & 14) | 48 | (i3 & 896);
                int i1118 = i3 >> 3;
                Function2<? super Composer, ? super Integer, Unit> function115 = function9;
                m963AlertDialogwqdebIU(onDismissRequest, composableLambda11, modifier2, function10, function8, shape2, j3, j4, dialogProperties2, composerStartRestartGroup, i1117 | (i1118 & 7168) | (57344 & i1118) | (458752 & i1118) | (i1118 & 3670016) | (i1118 & 29360128) | (i1118 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function115;
                modifier3 = modifier2;
                function12 = function10;
                function13 = function8;
                shape3 = shape2;
                j5 = j3;
                j6 = j4;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1119) {
                    AndroidAlertDialog_androidKt.m962AlertDialog6oU6zVQ(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j5, j6, dialogProperties3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
                function5 = function4;
            } else {
                function5 = function4;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            if ((i & 3670016) != 0) {
                if ((i2 & 64) == 0) {
                    i15 = 524288;
                } else {
                    i15 = 524288;
                }
                i3 |= i15;
            }
            if ((i & 29360128) != 0) {
                if ((i2 & 128) == 0) {
                    i14 = Configuration.BLOCK_SIZE;
                } else {
                    i14 = Configuration.BLOCK_SIZE;
                }
                i3 |= i14;
            }
            if ((i & 234881024) == 0) {
                jM1057contentColorForek8zF_U = j2;
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    i13 = 33554432;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            } else {
                jM1057contentColorForek8zF_U = j2;
            }
            i10 = i2 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i10 != 0) {
                i3 |= 805306368;
            } else if ((i & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(dialogProperties)) {
                    i11 = 536870912;
                } else {
                    i11 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i3 |= i11;
            }
            if ((i3 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 128) != 0) {
                        i12 = i3 & (-29360129);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    } else {
                        i12 = i3;
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                        i12 &= -234881025;
                    }
                    if (i10 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j3 = jM1043getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i3 = i12;
                    function10 = function7;
                    j4 = jM1057contentColorForek8zF_U;
                    shape2 = medium;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 128) != 0) {
                        i12 = i3 & (-29360129);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    } else {
                        i12 = i3;
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                        i12 &= -234881025;
                    }
                    if (i10 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j3 = jM1043getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i3 = i12;
                    function10 = function7;
                    j4 = jM1057contentColorForek8zF_U;
                    shape2 = medium;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                }
                ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i1119) {
                        if ((i1119 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1849673151, i1119, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                        }
                        float f = 8;
                        Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2));
                        final Function2<? super Composer, ? super Integer, Unit> function116 = function9;
                        final int i11110 = i3;
                        final Function2<? super Composer, ? super Integer, Unit> function117 = confirmButton;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        AlertDialogKt.m961AlertDialogFlowRowixp7dh8(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i11111) {
                                if ((i11111 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1789213604, i11111, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
                                }
                                Function2<Composer, Integer, Unit> function118 = function116;
                                composer3.startReplaceableGroup(-1046483318);
                                if (function118 != null) {
                                    function118.invoke(composer3, Integer.valueOf((i11110 >> 9) & 14));
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer3.endReplaceableGroup();
                                if (androidx.compose.animation.OooOO0O.OooO00o((i11110 >> 3) & 14, function117, composer3)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 438);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i1119 = (i3 & 14) | 48 | (i3 & 896);
                int i11110 = i3 >> 3;
                Function2<? super Composer, ? super Integer, Unit> function116 = function9;
                m963AlertDialogwqdebIU(onDismissRequest, composableLambda12, modifier2, function10, function8, shape2, j3, j4, dialogProperties2, composerStartRestartGroup, i1119 | (i11110 & 7168) | (57344 & i11110) | (458752 & i11110) | (i11110 & 3670016) | (i11110 & 29360128) | (i11110 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function116;
                modifier3 = modifier2;
                function12 = function10;
                function13 = function8;
                shape3 = shape2;
                j5 = j3;
                j6 = j4;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 128) != 0) {
                        i12 = i3 & (-29360129);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    } else {
                        i12 = i3;
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                        i12 &= -234881025;
                    }
                    if (i10 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j3 = jM1043getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i3 = i12;
                    function10 = function7;
                    j4 = jM1057contentColorForek8zF_U;
                    shape2 = medium;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i6 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -3670017;
                    } else {
                        medium = shape;
                    }
                    if ((i2 & 128) != 0) {
                        i12 = i3 & (-29360129);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    } else {
                        i12 = i3;
                        jM1043getSurface0d7_KjU = j;
                    }
                    if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                        i12 &= -234881025;
                    }
                    if (i10 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    j3 = jM1043getSurface0d7_KjU;
                    function8 = function14;
                    function9 = function6;
                    i3 = i12;
                    function10 = function7;
                    j4 = jM1057contentColorForek8zF_U;
                    shape2 = medium;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
                }
                ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i11111) {
                        if ((i11111 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1849673151, i11111, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                        }
                        float f = 8;
                        Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2));
                        final Function2<? super Composer, ? super Integer, Unit> function117 = function9;
                        final int i11112 = i3;
                        final Function2<? super Composer, ? super Integer, Unit> function118 = confirmButton;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        AlertDialogKt.m961AlertDialogFlowRowixp7dh8(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i11113) {
                                if ((i11113 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1789213604, i11113, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
                                }
                                Function2<Composer, Integer, Unit> function119 = function117;
                                composer3.startReplaceableGroup(-1046483318);
                                if (function119 != null) {
                                    function119.invoke(composer3, Integer.valueOf((i11112 >> 9) & 14));
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer3.endReplaceableGroup();
                                if (androidx.compose.animation.OooOO0O.OooO00o((i11112 >> 3) & 14, function118, composer3)) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 438);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                int i11111 = (i3 & 14) | 48 | (i3 & 896);
                int i11112 = i3 >> 3;
                Function2<? super Composer, ? super Integer, Unit> function117 = function9;
                m963AlertDialogwqdebIU(onDismissRequest, composableLambda13, modifier2, function10, function8, shape2, j3, j4, dialogProperties2, composerStartRestartGroup, i11111 | (i11112 & 7168) | (57344 & i11112) | (458752 & i11112) | (i11112 & 3670016) | (i11112 & 29360128) | (i11112 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function11 = function117;
                modifier3 = modifier2;
                function12 = function10;
                function13 = function8;
                shape3 = shape2;
                j5 = j3;
                j6 = j4;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11113) {
                    AndroidAlertDialog_androidKt.m962AlertDialog6oU6zVQ(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j5, j6, dialogProperties3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= 196608;
            function5 = function4;
        } else {
            function5 = function4;
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
        }
        if ((i & 3670016) != 0) {
            if ((i2 & 64) == 0) {
                i15 = 524288;
            } else {
                i15 = 524288;
            }
            i3 |= i15;
        }
        if ((i & 29360128) != 0) {
            if ((i2 & 128) == 0) {
                i14 = Configuration.BLOCK_SIZE;
            } else {
                i14 = Configuration.BLOCK_SIZE;
            }
            i3 |= i14;
        }
        if ((i & 234881024) == 0) {
            jM1057contentColorForek8zF_U = j2;
            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                i13 = 33554432;
            } else {
                i13 = 33554432;
            }
            i3 |= i13;
        } else {
            jM1057contentColorForek8zF_U = j2;
        }
        i10 = i2 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (i10 != 0) {
            i3 |= 805306368;
        } else if ((i & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(dialogProperties)) {
                i11 = 536870912;
            } else {
                i11 = SQLiteDatabase.CREATE_IF_NECESSARY;
            }
            i3 |= i11;
        }
        if ((i3 & 1533916891) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i6 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i8 == 0) {
                }
                if ((i2 & 64) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i3 &= -3670017;
                } else {
                    medium = shape;
                }
                if ((i2 & 128) != 0) {
                    i12 = i3 & (-29360129);
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                } else {
                    i12 = i3;
                    jM1043getSurface0d7_KjU = j;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                    i12 &= -234881025;
                }
                if (i10 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                j3 = jM1043getSurface0d7_KjU;
                function8 = function14;
                function9 = function6;
                i3 = i12;
                function10 = function7;
                j4 = jM1057contentColorForek8zF_U;
                shape2 = medium;
            } else {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i6 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i8 == 0) {
                }
                if ((i2 & 64) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i3 &= -3670017;
                } else {
                    medium = shape;
                }
                if ((i2 & 128) != 0) {
                    i12 = i3 & (-29360129);
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                } else {
                    i12 = i3;
                    jM1043getSurface0d7_KjU = j;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                    i12 &= -234881025;
                }
                if (i10 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                j3 = jM1043getSurface0d7_KjU;
                function8 = function14;
                function9 = function6;
                i3 = i12;
                function10 = function7;
                j4 = jM1057contentColorForek8zF_U;
                shape2 = medium;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
            }
            ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i11113) {
                    if ((i11113 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1849673151, i11113, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                    }
                    float f = 8;
                    Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2));
                    final Function2<? super Composer, ? super Integer, Unit> function118 = function9;
                    final int i11114 = i3;
                    final Function2<? super Composer, ? super Integer, Unit> function119 = confirmButton;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    AlertDialogKt.m961AlertDialogFlowRowixp7dh8(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i11115) {
                            if ((i11115 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1789213604, i11115, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
                            }
                            Function2<Composer, Integer, Unit> function1110 = function118;
                            composer3.startReplaceableGroup(-1046483318);
                            if (function1110 != null) {
                                function1110.invoke(composer3, Integer.valueOf((i11114 >> 9) & 14));
                                Unit unit = Unit.INSTANCE;
                            }
                            composer3.endReplaceableGroup();
                            if (androidx.compose.animation.OooOO0O.OooO00o((i11114 >> 3) & 14, function119, composer3)) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 438);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            int i11113 = (i3 & 14) | 48 | (i3 & 896);
            int i11114 = i3 >> 3;
            Function2<? super Composer, ? super Integer, Unit> function118 = function9;
            m963AlertDialogwqdebIU(onDismissRequest, composableLambda14, modifier2, function10, function8, shape2, j3, j4, dialogProperties2, composerStartRestartGroup, i11113 | (i11114 & 7168) | (57344 & i11114) | (458752 & i11114) | (i11114 & 3670016) | (i11114 & 29360128) | (i11114 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function11 = function118;
            modifier3 = modifier2;
            function12 = function10;
            function13 = function8;
            shape3 = shape2;
            j5 = j3;
            j6 = j4;
            dialogProperties3 = dialogProperties2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i6 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i8 == 0) {
                }
                if ((i2 & 64) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i3 &= -3670017;
                } else {
                    medium = shape;
                }
                if ((i2 & 128) != 0) {
                    i12 = i3 & (-29360129);
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                } else {
                    i12 = i3;
                    jM1043getSurface0d7_KjU = j;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                    i12 &= -234881025;
                }
                if (i10 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                j3 = jM1043getSurface0d7_KjU;
                function8 = function14;
                function9 = function6;
                i3 = i12;
                function10 = function7;
                j4 = jM1057contentColorForek8zF_U;
                shape2 = medium;
            } else {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i6 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i8 == 0) {
                }
                if ((i2 & 64) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i3 &= -3670017;
                } else {
                    medium = shape;
                }
                if ((i2 & 128) != 0) {
                    i12 = i3 & (-29360129);
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                } else {
                    i12 = i3;
                    jM1043getSurface0d7_KjU = j;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 21) & 14);
                    i12 &= -234881025;
                }
                if (i10 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                j3 = jM1043getSurface0d7_KjU;
                function8 = function14;
                function9 = function6;
                i3 = i12;
                function10 = function7;
                j4 = jM1057contentColorForek8zF_U;
                shape2 = medium;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-606536823, i3, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:63)");
            }
            ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i11115) {
                    if ((i11115 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1849673151, i11115, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:77)");
                    }
                    float f = 8;
                    Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2));
                    final Function2<? super Composer, ? super Integer, Unit> function119 = function9;
                    final int i11116 = i3;
                    final Function2<? super Composer, ? super Integer, Unit> function1110 = confirmButton;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
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
                    Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    AlertDialogKt.m961AlertDialogFlowRowixp7dh8(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(12), ComposableLambdaKt.composableLambda(composer2, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i11117) {
                            if ((i11117 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1789213604, i11117, -1, "androidx.compose.material.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:83)");
                            }
                            Function2<Composer, Integer, Unit> function1111 = function119;
                            composer3.startReplaceableGroup(-1046483318);
                            if (function1111 != null) {
                                function1111.invoke(composer3, Integer.valueOf((i11116 >> 9) & 14));
                                Unit unit = Unit.INSTANCE;
                            }
                            composer3.endReplaceableGroup();
                            if (androidx.compose.animation.OooOO0O.OooO00o((i11116 >> 3) & 14, function1110, composer3)) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, 438);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            int i11115 = (i3 & 14) | 48 | (i3 & 896);
            int i11116 = i3 >> 3;
            Function2<? super Composer, ? super Integer, Unit> function119 = function9;
            m963AlertDialogwqdebIU(onDismissRequest, composableLambda15, modifier2, function10, function8, shape2, j3, j4, dialogProperties2, composerStartRestartGroup, i11115 | (i11116 & 7168) | (57344 & i11116) | (458752 & i11116) | (i11116 & 3670016) | (i11116 & 29360128) | (i11116 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function11 = function119;
            modifier3 = modifier2;
            function12 = function10;
            function13 = function8;
            shape3 = shape2;
            j5 = j3;
            j6 = j4;
            dialogProperties3 = dialogProperties2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i11117) {
                AndroidAlertDialog_androidKt.m962AlertDialog6oU6zVQ(onDismissRequest, confirmButton, modifier3, function11, function12, function13, shape3, j5, j6, dialogProperties3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0136  */
    /* JADX WARN: Code duplicated, block: B:108:0x0146  */
    /* JADX WARN: Code duplicated, block: B:122:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0173  */
    /* JADX WARN: Code duplicated, block: B:124:0x0176  */
    /* JADX WARN: Code duplicated, block: B:127:0x017b  */
    /* JADX WARN: Code duplicated, block: B:130:0x017f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0185  */
    /* JADX WARN: Code duplicated, block: B:134:0x0192  */
    /* JADX WARN: Code duplicated, block: B:137:0x0197  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:152:0x0234  */
    /* JADX WARN: Code duplicated, block: B:157:0x024c  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103  */
    /* JADX WARN: Code duplicated, block: B:96:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:0x010e  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: AlertDialog-wqdebIU, reason: not valid java name */
    public static final void m963AlertDialogwqdebIU(@NotNull final Function0<Unit> onDismissRequest, @NotNull final Function2<? super Composer, ? super Integer, Unit> buttons, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Shape shape, long j, long j2, @Nullable DialogProperties dialogProperties, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function4;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int i7;
        Shape shape2;
        long j3;
        int i8;
        int i9;
        Modifier modifier2;
        Shape medium;
        long jM1043getSurface0d7_KjU;
        long jM1057contentColorForek8zF_U;
        DialogProperties dialogProperties2;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Shape shape3;
        Function2<? super Composer, ? super Integer, Unit> function7;
        long j4;
        long j5;
        final int i10;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function8;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function9;
        final Shape shape4;
        final long j6;
        final long j7;
        final DialogProperties dialogProperties3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Composer composerStartRestartGroup = composer.startRestartGroup(1035523925);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(buttons) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    function4 = function2;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        function5 = function3;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((458752 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            int i12 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
                            i3 |= i12;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    if ((3670016 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            j3 = j;
                            int i13 = composerStartRestartGroup.changed(j3) ? ZegoConstants.ErrorMask.RoomServerErrorMask : 524288;
                            i3 |= i13;
                        } else {
                            j3 = j;
                        }
                        i3 |= i13;
                    } else {
                        j3 = j;
                    }
                    if ((i & 29360128) != 0) {
                        i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j2)) ? Configuration.BLOCK_SIZE : 8388608;
                    }
                    i8 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i8 != 0) {
                        if ((234881024 & i) == 0) {
                            if (composerStartRestartGroup.changed(dialogProperties)) {
                                i9 = 67108864;
                            } else {
                                i9 = 33554432;
                            }
                            i3 |= i9;
                        }
                        if ((i3 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i4 != 0) {
                                    function4 = null;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function10 = i6 == 0 ? function5 : null;
                                if ((i2 & 32) != 0) {
                                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                    i3 &= -458753;
                                } else {
                                    medium = shape2;
                                }
                                if ((i2 & 64) != 0) {
                                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                    i3 &= -3670017;
                                } else {
                                    jM1043getSurface0d7_KjU = j3;
                                }
                                if ((i2 & 128) != 0) {
                                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                    i3 &= -29360129;
                                } else {
                                    jM1057contentColorForek8zF_U = j2;
                                }
                                if (i8 != 0) {
                                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                                } else {
                                    dialogProperties2 = dialogProperties;
                                }
                                function6 = function10;
                                shape3 = medium;
                                function7 = function4;
                                j4 = jM1043getSurface0d7_KjU;
                                j5 = jM1057contentColorForek8zF_U;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                modifier2 = modifier;
                                j5 = j2;
                                dialogProperties2 = dialogProperties;
                                function7 = function4;
                                function6 = function5;
                                shape3 = shape2;
                                j4 = j3;
                            }
                            i10 = i3;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                            }
                            final Modifier modifier4 = modifier2;
                            final Function2<? super Composer, ? super Integer, Unit> function11 = function7;
                            final Function2<? super Composer, ? super Integer, Unit> function12 = function6;
                            final Shape shape5 = shape3;
                            final long j8 = j4;
                            Function2<? super Composer, ? super Integer, Unit> function13 = function7;
                            final long j9 = j5;
                            Modifier modifier5 = modifier2;
                            composer2 = composerStartRestartGroup;
                            AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i14) {
                                    if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                                    }
                                    Function2<Composer, Integer, Unit> function14 = buttons;
                                    Modifier modifier6 = modifier4;
                                    Function2<Composer, Integer, Unit> function15 = function11;
                                    Function2<Composer, Integer, Unit> function16 = function12;
                                    Shape shape6 = shape5;
                                    long j10 = j8;
                                    long j11 = j9;
                                    int i15 = i10;
                                    AlertDialogKt.m960AlertDialogContentWMdw5o4(function14, modifier6, function15, function16, shape6, j10, j11, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function13;
                            modifier3 = modifier5;
                            function9 = function6;
                            shape4 = shape3;
                            j6 = j4;
                            j7 = j5;
                            dialogProperties3 = dialogProperties2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            function8 = function4;
                            function9 = function5;
                            shape4 = shape2;
                            j6 = j3;
                            composer2 = composerStartRestartGroup;
                            j7 = j2;
                            dialogProperties3 = dialogProperties;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i14) {
                                AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i3 |= 100663296;
                    if ((i3 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        } else {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        }
                        i10 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        final Modifier modifier6 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function14 = function7;
                        final Function2<? super Composer, ? super Integer, Unit> function15 = function6;
                        final Shape shape6 = shape3;
                        final long j10 = j4;
                        Function2<? super Composer, ? super Integer, Unit> function16 = function7;
                        final long j11 = j5;
                        Modifier modifier7 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i14) {
                                if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                                }
                                Function2<Composer, Integer, Unit> function17 = buttons;
                                Modifier modifier8 = modifier6;
                                Function2<Composer, Integer, Unit> function18 = function14;
                                Function2<Composer, Integer, Unit> function19 = function15;
                                Shape shape7 = shape6;
                                long j12 = j10;
                                long j13 = j11;
                                int i15 = i10;
                                AlertDialogKt.m960AlertDialogContentWMdw5o4(function17, modifier8, function18, function19, shape7, j12, j13, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function16;
                        modifier3 = modifier7;
                        function9 = function6;
                        shape4 = shape3;
                        j6 = j4;
                        j7 = j5;
                        dialogProperties3 = dialogProperties2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        } else {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        }
                        i10 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        final Modifier modifier8 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function17 = function7;
                        final Function2<? super Composer, ? super Integer, Unit> function18 = function6;
                        final Shape shape7 = shape3;
                        final long j12 = j4;
                        Function2<? super Composer, ? super Integer, Unit> function19 = function7;
                        final long j13 = j5;
                        Modifier modifier9 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i14) {
                                if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                                }
                                Function2<Composer, Integer, Unit> function110 = buttons;
                                Modifier modifier10 = modifier8;
                                Function2<Composer, Integer, Unit> function111 = function17;
                                Function2<Composer, Integer, Unit> function112 = function18;
                                Shape shape8 = shape7;
                                long j14 = j12;
                                long j15 = j13;
                                int i15 = i10;
                                AlertDialogKt.m960AlertDialogContentWMdw5o4(function110, modifier10, function111, function112, shape8, j14, j15, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function19;
                        modifier3 = modifier9;
                        function9 = function6;
                        shape4 = shape3;
                        j6 = j4;
                        j7 = j5;
                        dialogProperties3 = dialogProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i14) {
                            AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                function5 = function3;
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        j3 = j;
                        if (composerStartRestartGroup.changed(j3)) {
                        }
                        i3 |= i13;
                    } else {
                        j3 = j;
                    }
                    i3 |= i13;
                } else {
                    j3 = j;
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j2)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i8 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i8 != 0) {
                    if ((234881024 & i) == 0) {
                        if (composerStartRestartGroup.changed(dialogProperties)) {
                            i9 = 67108864;
                        } else {
                            i9 = 33554432;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        } else {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        }
                        i10 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        final Modifier modifier10 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function110 = function7;
                        final Function2<? super Composer, ? super Integer, Unit> function111 = function6;
                        final Shape shape8 = shape3;
                        final long j14 = j4;
                        Function2<? super Composer, ? super Integer, Unit> function112 = function7;
                        final long j15 = j5;
                        Modifier modifier11 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i14) {
                                if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                                }
                                Function2<Composer, Integer, Unit> function113 = buttons;
                                Modifier modifier12 = modifier10;
                                Function2<Composer, Integer, Unit> function114 = function110;
                                Function2<Composer, Integer, Unit> function115 = function111;
                                Shape shape9 = shape8;
                                long j16 = j14;
                                long j17 = j15;
                                int i15 = i10;
                                AlertDialogKt.m960AlertDialogContentWMdw5o4(function113, modifier12, function114, function115, shape9, j16, j17, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function112;
                        modifier3 = modifier11;
                        function9 = function6;
                        shape4 = shape3;
                        j6 = j4;
                        j7 = j5;
                        dialogProperties3 = dialogProperties2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        } else {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        }
                        i10 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        final Modifier modifier12 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function113 = function7;
                        final Function2<? super Composer, ? super Integer, Unit> function114 = function6;
                        final Shape shape9 = shape3;
                        final long j16 = j4;
                        Function2<? super Composer, ? super Integer, Unit> function115 = function7;
                        final long j17 = j5;
                        Modifier modifier13 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i14) {
                                if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                                }
                                Function2<Composer, Integer, Unit> function116 = buttons;
                                Modifier modifier14 = modifier12;
                                Function2<Composer, Integer, Unit> function117 = function113;
                                Function2<Composer, Integer, Unit> function118 = function114;
                                Shape shape10 = shape9;
                                long j18 = j16;
                                long j19 = j17;
                                int i15 = i10;
                                AlertDialogKt.m960AlertDialogContentWMdw5o4(function116, modifier14, function117, function118, shape10, j18, j19, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function115;
                        modifier3 = modifier13;
                        function9 = function6;
                        shape4 = shape3;
                        j6 = j4;
                        j7 = j5;
                        dialogProperties3 = dialogProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i14) {
                            AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 100663296;
                if ((i3 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    }
                    i10 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    final Modifier modifier14 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function116 = function7;
                    final Function2<? super Composer, ? super Integer, Unit> function117 = function6;
                    final Shape shape10 = shape3;
                    final long j18 = j4;
                    Function2<? super Composer, ? super Integer, Unit> function118 = function7;
                    final long j19 = j5;
                    Modifier modifier15 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                            }
                            Function2<Composer, Integer, Unit> function119 = buttons;
                            Modifier modifier16 = modifier14;
                            Function2<Composer, Integer, Unit> function1110 = function116;
                            Function2<Composer, Integer, Unit> function1111 = function117;
                            Shape shape11 = shape10;
                            long j110 = j18;
                            long j111 = j19;
                            int i15 = i10;
                            AlertDialogKt.m960AlertDialogContentWMdw5o4(function119, modifier16, function1110, function1111, shape11, j110, j111, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function118;
                    modifier3 = modifier15;
                    function9 = function6;
                    shape4 = shape3;
                    j6 = j4;
                    j7 = j5;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    }
                    i10 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    final Modifier modifier16 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function119 = function7;
                    final Function2<? super Composer, ? super Integer, Unit> function1110 = function6;
                    final Shape shape11 = shape3;
                    final long j110 = j4;
                    Function2<? super Composer, ? super Integer, Unit> function1111 = function7;
                    final long j111 = j5;
                    Modifier modifier17 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                            }
                            Function2<Composer, Integer, Unit> function1112 = buttons;
                            Modifier modifier18 = modifier16;
                            Function2<Composer, Integer, Unit> function1113 = function119;
                            Function2<Composer, Integer, Unit> function1114 = function1110;
                            Shape shape12 = shape11;
                            long j112 = j110;
                            long j113 = j111;
                            int i15 = i10;
                            AlertDialogKt.m960AlertDialogContentWMdw5o4(function1112, modifier18, function1113, function1114, shape12, j112, j113, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function1111;
                    modifier3 = modifier17;
                    function9 = function6;
                    shape4 = shape3;
                    j6 = j4;
                    j7 = j5;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i14) {
                        AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            function4 = function2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        j3 = j;
                        if (composerStartRestartGroup.changed(j3)) {
                        }
                        i3 |= i13;
                    } else {
                        j3 = j;
                    }
                    i3 |= i13;
                } else {
                    j3 = j;
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j2)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i8 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i8 != 0) {
                    if ((234881024 & i) == 0) {
                        if (composerStartRestartGroup.changed(dialogProperties)) {
                            i9 = 67108864;
                        } else {
                            i9 = 33554432;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        } else {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        }
                        i10 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        final Modifier modifier18 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function1112 = function7;
                        final Function2<? super Composer, ? super Integer, Unit> function1113 = function6;
                        final Shape shape12 = shape3;
                        final long j112 = j4;
                        Function2<? super Composer, ? super Integer, Unit> function1114 = function7;
                        final long j113 = j5;
                        Modifier modifier19 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i14) {
                                if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                                }
                                Function2<Composer, Integer, Unit> function1115 = buttons;
                                Modifier modifier110 = modifier18;
                                Function2<Composer, Integer, Unit> function1116 = function1112;
                                Function2<Composer, Integer, Unit> function1117 = function1113;
                                Shape shape13 = shape12;
                                long j114 = j112;
                                long j115 = j113;
                                int i15 = i10;
                                AlertDialogKt.m960AlertDialogContentWMdw5o4(function1115, modifier110, function1116, function1117, shape13, j114, j115, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function1114;
                        modifier3 = modifier19;
                        function9 = function6;
                        shape4 = shape3;
                        j6 = j4;
                        j7 = j5;
                        dialogProperties3 = dialogProperties2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        } else {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        }
                        i10 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        final Modifier modifier110 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function1115 = function7;
                        final Function2<? super Composer, ? super Integer, Unit> function1116 = function6;
                        final Shape shape13 = shape3;
                        final long j114 = j4;
                        Function2<? super Composer, ? super Integer, Unit> function1117 = function7;
                        final long j115 = j5;
                        Modifier modifier111 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i14) {
                                if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                                }
                                Function2<Composer, Integer, Unit> function1118 = buttons;
                                Modifier modifier112 = modifier110;
                                Function2<Composer, Integer, Unit> function1119 = function1115;
                                Function2<Composer, Integer, Unit> function11110 = function1116;
                                Shape shape14 = shape13;
                                long j116 = j114;
                                long j117 = j115;
                                int i15 = i10;
                                AlertDialogKt.m960AlertDialogContentWMdw5o4(function1118, modifier112, function1119, function11110, shape14, j116, j117, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function1117;
                        modifier3 = modifier111;
                        function9 = function6;
                        shape4 = shape3;
                        j6 = j4;
                        j7 = j5;
                        dialogProperties3 = dialogProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i14) {
                            AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 100663296;
                if ((i3 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    }
                    i10 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    final Modifier modifier112 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function1118 = function7;
                    final Function2<? super Composer, ? super Integer, Unit> function1119 = function6;
                    final Shape shape14 = shape3;
                    final long j116 = j4;
                    Function2<? super Composer, ? super Integer, Unit> function11110 = function7;
                    final long j117 = j5;
                    Modifier modifier113 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                            }
                            Function2<Composer, Integer, Unit> function11111 = buttons;
                            Modifier modifier114 = modifier112;
                            Function2<Composer, Integer, Unit> function11112 = function1118;
                            Function2<Composer, Integer, Unit> function11113 = function1119;
                            Shape shape15 = shape14;
                            long j118 = j116;
                            long j119 = j117;
                            int i15 = i10;
                            AlertDialogKt.m960AlertDialogContentWMdw5o4(function11111, modifier114, function11112, function11113, shape15, j118, j119, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function11110;
                    modifier3 = modifier113;
                    function9 = function6;
                    shape4 = shape3;
                    j6 = j4;
                    j7 = j5;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    }
                    i10 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    final Modifier modifier114 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function11111 = function7;
                    final Function2<? super Composer, ? super Integer, Unit> function11112 = function6;
                    final Shape shape15 = shape3;
                    final long j118 = j4;
                    Function2<? super Composer, ? super Integer, Unit> function11113 = function7;
                    final long j119 = j5;
                    Modifier modifier115 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                            }
                            Function2<Composer, Integer, Unit> function11114 = buttons;
                            Modifier modifier116 = modifier114;
                            Function2<Composer, Integer, Unit> function11115 = function11111;
                            Function2<Composer, Integer, Unit> function11116 = function11112;
                            Shape shape16 = shape15;
                            long j1110 = j118;
                            long j1111 = j119;
                            int i15 = i10;
                            AlertDialogKt.m960AlertDialogContentWMdw5o4(function11114, modifier116, function11115, function11116, shape16, j1110, j1111, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function11113;
                    modifier3 = modifier115;
                    function9 = function6;
                    shape4 = shape3;
                    j6 = j4;
                    j7 = j5;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i14) {
                        AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            function5 = function3;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    j3 = j;
                    if (composerStartRestartGroup.changed(j3)) {
                    }
                    i3 |= i13;
                } else {
                    j3 = j;
                }
                i3 |= i13;
            } else {
                j3 = j;
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j2)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i8 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i8 != 0) {
                if ((234881024 & i) == 0) {
                    if (composerStartRestartGroup.changed(dialogProperties)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i3 |= i9;
                }
                if ((i3 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    }
                    i10 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    final Modifier modifier116 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function11114 = function7;
                    final Function2<? super Composer, ? super Integer, Unit> function11115 = function6;
                    final Shape shape16 = shape3;
                    final long j1110 = j4;
                    Function2<? super Composer, ? super Integer, Unit> function11116 = function7;
                    final long j1111 = j5;
                    Modifier modifier117 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                            }
                            Function2<Composer, Integer, Unit> function11117 = buttons;
                            Modifier modifier118 = modifier116;
                            Function2<Composer, Integer, Unit> function11118 = function11114;
                            Function2<Composer, Integer, Unit> function11119 = function11115;
                            Shape shape17 = shape16;
                            long j1112 = j1110;
                            long j1113 = j1111;
                            int i15 = i10;
                            AlertDialogKt.m960AlertDialogContentWMdw5o4(function11117, modifier118, function11118, function11119, shape17, j1112, j1113, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function11116;
                    modifier3 = modifier117;
                    function9 = function6;
                    shape4 = shape3;
                    j6 = j4;
                    j7 = j5;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    }
                    i10 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    final Modifier modifier118 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function11117 = function7;
                    final Function2<? super Composer, ? super Integer, Unit> function11118 = function6;
                    final Shape shape17 = shape3;
                    final long j1112 = j4;
                    Function2<? super Composer, ? super Integer, Unit> function11119 = function7;
                    final long j1113 = j5;
                    Modifier modifier119 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                            }
                            Function2<Composer, Integer, Unit> function111110 = buttons;
                            Modifier modifier1110 = modifier118;
                            Function2<Composer, Integer, Unit> function111111 = function11117;
                            Function2<Composer, Integer, Unit> function111112 = function11118;
                            Shape shape18 = shape17;
                            long j1114 = j1112;
                            long j1115 = j1113;
                            int i15 = i10;
                            AlertDialogKt.m960AlertDialogContentWMdw5o4(function111110, modifier1110, function111111, function111112, shape18, j1114, j1115, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function11119;
                    modifier3 = modifier119;
                    function9 = function6;
                    shape4 = shape3;
                    j6 = j4;
                    j7 = j5;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i14) {
                        AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 100663296;
            if ((i3 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                }
                i10 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                final Modifier modifier1110 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function111110 = function7;
                final Function2<? super Composer, ? super Integer, Unit> function111111 = function6;
                final Shape shape18 = shape3;
                final long j1114 = j4;
                Function2<? super Composer, ? super Integer, Unit> function111112 = function7;
                final long j1115 = j5;
                Modifier modifier1111 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i14) {
                        if ((i14 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                        }
                        Function2<Composer, Integer, Unit> function111113 = buttons;
                        Modifier modifier1112 = modifier1110;
                        Function2<Composer, Integer, Unit> function111114 = function111110;
                        Function2<Composer, Integer, Unit> function111115 = function111111;
                        Shape shape19 = shape18;
                        long j1116 = j1114;
                        long j1117 = j1115;
                        int i15 = i10;
                        AlertDialogKt.m960AlertDialogContentWMdw5o4(function111113, modifier1112, function111114, function111115, shape19, j1116, j1117, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function111112;
                modifier3 = modifier1111;
                function9 = function6;
                shape4 = shape3;
                j6 = j4;
                j7 = j5;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                }
                i10 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                final Modifier modifier1112 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function111113 = function7;
                final Function2<? super Composer, ? super Integer, Unit> function111114 = function6;
                final Shape shape19 = shape3;
                final long j1116 = j4;
                Function2<? super Composer, ? super Integer, Unit> function111115 = function7;
                final long j1117 = j5;
                Modifier modifier1113 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i14) {
                        if ((i14 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                        }
                        Function2<Composer, Integer, Unit> function111116 = buttons;
                        Modifier modifier1114 = modifier1112;
                        Function2<Composer, Integer, Unit> function111117 = function111113;
                        Function2<Composer, Integer, Unit> function111118 = function111114;
                        Shape shape110 = shape19;
                        long j1118 = j1116;
                        long j1119 = j1117;
                        int i15 = i10;
                        AlertDialogKt.m960AlertDialogContentWMdw5o4(function111116, modifier1114, function111117, function111118, shape110, j1118, j1119, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function111115;
                modifier3 = modifier1113;
                function9 = function6;
                shape4 = shape3;
                j6 = j4;
                j7 = j5;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i14) {
                    AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                function4 = function2;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((3670016 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        j3 = j;
                        if (composerStartRestartGroup.changed(j3)) {
                        }
                        i3 |= i13;
                    } else {
                        j3 = j;
                    }
                    i3 |= i13;
                } else {
                    j3 = j;
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j2)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i8 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i8 != 0) {
                    if ((234881024 & i) == 0) {
                        if (composerStartRestartGroup.changed(dialogProperties)) {
                            i9 = 67108864;
                        } else {
                            i9 = 33554432;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        } else {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        }
                        i10 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        final Modifier modifier1114 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function111116 = function7;
                        final Function2<? super Composer, ? super Integer, Unit> function111117 = function6;
                        final Shape shape110 = shape3;
                        final long j1118 = j4;
                        Function2<? super Composer, ? super Integer, Unit> function111118 = function7;
                        final long j1119 = j5;
                        Modifier modifier1115 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i14) {
                                if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                                }
                                Function2<Composer, Integer, Unit> function111119 = buttons;
                                Modifier modifier1116 = modifier1114;
                                Function2<Composer, Integer, Unit> function1111110 = function111116;
                                Function2<Composer, Integer, Unit> function1111111 = function111117;
                                Shape shape111 = shape110;
                                long j11110 = j1118;
                                long j11111 = j1119;
                                int i15 = i10;
                                AlertDialogKt.m960AlertDialogContentWMdw5o4(function111119, modifier1116, function1111110, function1111111, shape111, j11110, j11111, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function111118;
                        modifier3 = modifier1115;
                        function9 = function6;
                        shape4 = shape3;
                        j6 = j4;
                        j7 = j5;
                        dialogProperties3 = dialogProperties2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        } else {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                                i3 &= -458753;
                            } else {
                                medium = shape2;
                            }
                            if ((i2 & 64) != 0) {
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                i3 &= -3670017;
                            } else {
                                jM1043getSurface0d7_KjU = j3;
                            }
                            if ((i2 & 128) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if (i8 != 0) {
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            } else {
                                dialogProperties2 = dialogProperties;
                            }
                            function6 = function10;
                            shape3 = medium;
                            function7 = function4;
                            j4 = jM1043getSurface0d7_KjU;
                            j5 = jM1057contentColorForek8zF_U;
                        }
                        i10 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                        }
                        final Modifier modifier1116 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function111119 = function7;
                        final Function2<? super Composer, ? super Integer, Unit> function1111110 = function6;
                        final Shape shape111 = shape3;
                        final long j11110 = j4;
                        Function2<? super Composer, ? super Integer, Unit> function1111111 = function7;
                        final long j11111 = j5;
                        Modifier modifier1117 = modifier2;
                        composer2 = composerStartRestartGroup;
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i14) {
                                if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                                }
                                Function2<Composer, Integer, Unit> function1111112 = buttons;
                                Modifier modifier1118 = modifier1116;
                                Function2<Composer, Integer, Unit> function1111113 = function111119;
                                Function2<Composer, Integer, Unit> function1111114 = function1111110;
                                Shape shape112 = shape111;
                                long j11112 = j11110;
                                long j11113 = j11111;
                                int i15 = i10;
                                AlertDialogKt.m960AlertDialogContentWMdw5o4(function1111112, modifier1118, function1111113, function1111114, shape112, j11112, j11113, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function1111111;
                        modifier3 = modifier1117;
                        function9 = function6;
                        shape4 = shape3;
                        j6 = j4;
                        j7 = j5;
                        dialogProperties3 = dialogProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i14) {
                            AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 100663296;
                if ((i3 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    }
                    i10 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    final Modifier modifier1118 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function1111112 = function7;
                    final Function2<? super Composer, ? super Integer, Unit> function1111113 = function6;
                    final Shape shape112 = shape3;
                    final long j11112 = j4;
                    Function2<? super Composer, ? super Integer, Unit> function1111114 = function7;
                    final long j11113 = j5;
                    Modifier modifier1119 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                            }
                            Function2<Composer, Integer, Unit> function1111115 = buttons;
                            Modifier modifier11110 = modifier1118;
                            Function2<Composer, Integer, Unit> function1111116 = function1111112;
                            Function2<Composer, Integer, Unit> function1111117 = function1111113;
                            Shape shape113 = shape112;
                            long j11114 = j11112;
                            long j11115 = j11113;
                            int i15 = i10;
                            AlertDialogKt.m960AlertDialogContentWMdw5o4(function1111115, modifier11110, function1111116, function1111117, shape113, j11114, j11115, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function1111114;
                    modifier3 = modifier1119;
                    function9 = function6;
                    shape4 = shape3;
                    j6 = j4;
                    j7 = j5;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    }
                    i10 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    final Modifier modifier11110 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function1111115 = function7;
                    final Function2<? super Composer, ? super Integer, Unit> function1111116 = function6;
                    final Shape shape113 = shape3;
                    final long j11114 = j4;
                    Function2<? super Composer, ? super Integer, Unit> function1111117 = function7;
                    final long j11115 = j5;
                    Modifier modifier11111 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                            }
                            Function2<Composer, Integer, Unit> function1111118 = buttons;
                            Modifier modifier11112 = modifier11110;
                            Function2<Composer, Integer, Unit> function1111119 = function1111115;
                            Function2<Composer, Integer, Unit> function11111110 = function1111116;
                            Shape shape114 = shape113;
                            long j11116 = j11114;
                            long j11117 = j11115;
                            int i15 = i10;
                            AlertDialogKt.m960AlertDialogContentWMdw5o4(function1111118, modifier11112, function1111119, function11111110, shape114, j11116, j11117, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function1111117;
                    modifier3 = modifier11111;
                    function9 = function6;
                    shape4 = shape3;
                    j6 = j4;
                    j7 = j5;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i14) {
                        AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            function5 = function3;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    j3 = j;
                    if (composerStartRestartGroup.changed(j3)) {
                    }
                    i3 |= i13;
                } else {
                    j3 = j;
                }
                i3 |= i13;
            } else {
                j3 = j;
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j2)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i8 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i8 != 0) {
                if ((234881024 & i) == 0) {
                    if (composerStartRestartGroup.changed(dialogProperties)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i3 |= i9;
                }
                if ((i3 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    }
                    i10 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    final Modifier modifier11112 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function1111118 = function7;
                    final Function2<? super Composer, ? super Integer, Unit> function1111119 = function6;
                    final Shape shape114 = shape3;
                    final long j11116 = j4;
                    Function2<? super Composer, ? super Integer, Unit> function11111110 = function7;
                    final long j11117 = j5;
                    Modifier modifier11113 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                            }
                            Function2<Composer, Integer, Unit> function11111111 = buttons;
                            Modifier modifier11114 = modifier11112;
                            Function2<Composer, Integer, Unit> function11111112 = function1111118;
                            Function2<Composer, Integer, Unit> function11111113 = function1111119;
                            Shape shape115 = shape114;
                            long j11118 = j11116;
                            long j11119 = j11117;
                            int i15 = i10;
                            AlertDialogKt.m960AlertDialogContentWMdw5o4(function11111111, modifier11114, function11111112, function11111113, shape115, j11118, j11119, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function11111110;
                    modifier3 = modifier11113;
                    function9 = function6;
                    shape4 = shape3;
                    j6 = j4;
                    j7 = j5;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    }
                    i10 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    final Modifier modifier11114 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function11111111 = function7;
                    final Function2<? super Composer, ? super Integer, Unit> function11111112 = function6;
                    final Shape shape115 = shape3;
                    final long j11118 = j4;
                    Function2<? super Composer, ? super Integer, Unit> function11111113 = function7;
                    final long j11119 = j5;
                    Modifier modifier11115 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                            }
                            Function2<Composer, Integer, Unit> function11111114 = buttons;
                            Modifier modifier11116 = modifier11114;
                            Function2<Composer, Integer, Unit> function11111115 = function11111111;
                            Function2<Composer, Integer, Unit> function11111116 = function11111112;
                            Shape shape116 = shape115;
                            long j111110 = j11118;
                            long j111111 = j11119;
                            int i15 = i10;
                            AlertDialogKt.m960AlertDialogContentWMdw5o4(function11111114, modifier11116, function11111115, function11111116, shape116, j111110, j111111, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function11111113;
                    modifier3 = modifier11115;
                    function9 = function6;
                    shape4 = shape3;
                    j6 = j4;
                    j7 = j5;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i14) {
                        AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 100663296;
            if ((i3 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                }
                i10 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                final Modifier modifier11116 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function11111114 = function7;
                final Function2<? super Composer, ? super Integer, Unit> function11111115 = function6;
                final Shape shape116 = shape3;
                final long j111110 = j4;
                Function2<? super Composer, ? super Integer, Unit> function11111116 = function7;
                final long j111111 = j5;
                Modifier modifier11117 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i14) {
                        if ((i14 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                        }
                        Function2<Composer, Integer, Unit> function11111117 = buttons;
                        Modifier modifier11118 = modifier11116;
                        Function2<Composer, Integer, Unit> function11111118 = function11111114;
                        Function2<Composer, Integer, Unit> function11111119 = function11111115;
                        Shape shape117 = shape116;
                        long j111112 = j111110;
                        long j111113 = j111111;
                        int i15 = i10;
                        AlertDialogKt.m960AlertDialogContentWMdw5o4(function11111117, modifier11118, function11111118, function11111119, shape117, j111112, j111113, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function11111116;
                modifier3 = modifier11117;
                function9 = function6;
                shape4 = shape3;
                j6 = j4;
                j7 = j5;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                }
                i10 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                final Modifier modifier11118 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function11111117 = function7;
                final Function2<? super Composer, ? super Integer, Unit> function11111118 = function6;
                final Shape shape117 = shape3;
                final long j111112 = j4;
                Function2<? super Composer, ? super Integer, Unit> function11111119 = function7;
                final long j111113 = j5;
                Modifier modifier11119 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i14) {
                        if ((i14 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                        }
                        Function2<Composer, Integer, Unit> function111111110 = buttons;
                        Modifier modifier111110 = modifier11118;
                        Function2<Composer, Integer, Unit> function111111111 = function11111117;
                        Function2<Composer, Integer, Unit> function111111112 = function11111118;
                        Shape shape118 = shape117;
                        long j111114 = j111112;
                        long j111115 = j111113;
                        int i15 = i10;
                        AlertDialogKt.m960AlertDialogContentWMdw5o4(function111111110, modifier111110, function111111111, function111111112, shape118, j111114, j111115, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function11111119;
                modifier3 = modifier11119;
                function9 = function6;
                shape4 = shape3;
                j6 = j4;
                j7 = j5;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i14) {
                    AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        function4 = function2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                function5 = function3;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i12;
                } else {
                    shape2 = shape;
                }
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            if ((3670016 & i) == 0) {
                if ((i2 & 64) == 0) {
                    j3 = j;
                    if (composerStartRestartGroup.changed(j3)) {
                    }
                    i3 |= i13;
                } else {
                    j3 = j;
                }
                i3 |= i13;
            } else {
                j3 = j;
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j2)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i8 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i8 != 0) {
                if ((234881024 & i) == 0) {
                    if (composerStartRestartGroup.changed(dialogProperties)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i3 |= i9;
                }
                if ((i3 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    }
                    i10 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    final Modifier modifier111110 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function111111110 = function7;
                    final Function2<? super Composer, ? super Integer, Unit> function111111111 = function6;
                    final Shape shape118 = shape3;
                    final long j111114 = j4;
                    Function2<? super Composer, ? super Integer, Unit> function111111112 = function7;
                    final long j111115 = j5;
                    Modifier modifier111111 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                            }
                            Function2<Composer, Integer, Unit> function111111113 = buttons;
                            Modifier modifier111112 = modifier111110;
                            Function2<Composer, Integer, Unit> function111111114 = function111111110;
                            Function2<Composer, Integer, Unit> function111111115 = function111111111;
                            Shape shape119 = shape118;
                            long j111116 = j111114;
                            long j111117 = j111115;
                            int i15 = i10;
                            AlertDialogKt.m960AlertDialogContentWMdw5o4(function111111113, modifier111112, function111111114, function111111115, shape119, j111116, j111117, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function111111112;
                    modifier3 = modifier111111;
                    function9 = function6;
                    shape4 = shape3;
                    j6 = j4;
                    j7 = j5;
                    dialogProperties3 = dialogProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                            i3 &= -458753;
                        } else {
                            medium = shape2;
                        }
                        if ((i2 & 64) != 0) {
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            i3 &= -3670017;
                        } else {
                            jM1043getSurface0d7_KjU = j3;
                        }
                        if ((i2 & 128) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                            i3 &= -29360129;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if (i8 != 0) {
                            dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        function6 = function10;
                        shape3 = medium;
                        function7 = function4;
                        j4 = jM1043getSurface0d7_KjU;
                        j5 = jM1057contentColorForek8zF_U;
                    }
                    i10 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                    }
                    final Modifier modifier111112 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function111111113 = function7;
                    final Function2<? super Composer, ? super Integer, Unit> function111111114 = function6;
                    final Shape shape119 = shape3;
                    final long j111116 = j4;
                    Function2<? super Composer, ? super Integer, Unit> function111111115 = function7;
                    final long j111117 = j5;
                    Modifier modifier111113 = modifier2;
                    composer2 = composerStartRestartGroup;
                    AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i14) {
                            if ((i14 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                            }
                            Function2<Composer, Integer, Unit> function111111116 = buttons;
                            Modifier modifier111114 = modifier111112;
                            Function2<Composer, Integer, Unit> function111111117 = function111111113;
                            Function2<Composer, Integer, Unit> function111111118 = function111111114;
                            Shape shape1110 = shape119;
                            long j111118 = j111116;
                            long j111119 = j111117;
                            int i15 = i10;
                            AlertDialogKt.m960AlertDialogContentWMdw5o4(function111111116, modifier111114, function111111117, function111111118, shape1110, j111118, j111119, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function111111115;
                    modifier3 = modifier111113;
                    function9 = function6;
                    shape4 = shape3;
                    j6 = j4;
                    j7 = j5;
                    dialogProperties3 = dialogProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i14) {
                        AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 100663296;
            if ((i3 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                }
                i10 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                final Modifier modifier111114 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function111111116 = function7;
                final Function2<? super Composer, ? super Integer, Unit> function111111117 = function6;
                final Shape shape1110 = shape3;
                final long j111118 = j4;
                Function2<? super Composer, ? super Integer, Unit> function111111118 = function7;
                final long j111119 = j5;
                Modifier modifier111115 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i14) {
                        if ((i14 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                        }
                        Function2<Composer, Integer, Unit> function111111119 = buttons;
                        Modifier modifier111116 = modifier111114;
                        Function2<Composer, Integer, Unit> function1111111110 = function111111116;
                        Function2<Composer, Integer, Unit> function1111111111 = function111111117;
                        Shape shape1111 = shape1110;
                        long j1111110 = j111118;
                        long j1111111 = j111119;
                        int i15 = i10;
                        AlertDialogKt.m960AlertDialogContentWMdw5o4(function111111119, modifier111116, function1111111110, function1111111111, shape1111, j1111110, j1111111, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function111111118;
                modifier3 = modifier111115;
                function9 = function6;
                shape4 = shape3;
                j6 = j4;
                j7 = j5;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                }
                i10 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                final Modifier modifier111116 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function111111119 = function7;
                final Function2<? super Composer, ? super Integer, Unit> function1111111110 = function6;
                final Shape shape1111 = shape3;
                final long j1111110 = j4;
                Function2<? super Composer, ? super Integer, Unit> function1111111111 = function7;
                final long j1111111 = j5;
                Modifier modifier111117 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i14) {
                        if ((i14 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                        }
                        Function2<Composer, Integer, Unit> function1111111112 = buttons;
                        Modifier modifier111118 = modifier111116;
                        Function2<Composer, Integer, Unit> function1111111113 = function111111119;
                        Function2<Composer, Integer, Unit> function1111111114 = function1111111110;
                        Shape shape1112 = shape1111;
                        long j1111112 = j1111110;
                        long j1111113 = j1111111;
                        int i15 = i10;
                        AlertDialogKt.m960AlertDialogContentWMdw5o4(function1111111112, modifier111118, function1111111113, function1111111114, shape1112, j1111112, j1111113, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function1111111111;
                modifier3 = modifier111117;
                function9 = function6;
                shape4 = shape3;
                j6 = j4;
                j7 = j5;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i14) {
                    AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        function5 = function3;
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i3 |= i12;
            } else {
                shape2 = shape;
            }
            i3 |= i12;
        } else {
            shape2 = shape;
        }
        if ((3670016 & i) == 0) {
            if ((i2 & 64) == 0) {
                j3 = j;
                if (composerStartRestartGroup.changed(j3)) {
                }
                i3 |= i13;
            } else {
                j3 = j;
            }
            i3 |= i13;
        } else {
            j3 = j;
        }
        if ((i & 29360128) != 0) {
            i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j2)) ? Configuration.BLOCK_SIZE : 8388608;
        }
        i8 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i8 != 0) {
            if ((234881024 & i) == 0) {
                if (composerStartRestartGroup.changed(dialogProperties)) {
                    i9 = 67108864;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            }
            if ((i3 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                }
                i10 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                final Modifier modifier111118 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function1111111112 = function7;
                final Function2<? super Composer, ? super Integer, Unit> function1111111113 = function6;
                final Shape shape1112 = shape3;
                final long j1111112 = j4;
                Function2<? super Composer, ? super Integer, Unit> function1111111114 = function7;
                final long j1111113 = j5;
                Modifier modifier111119 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i14) {
                        if ((i14 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                        }
                        Function2<Composer, Integer, Unit> function1111111115 = buttons;
                        Modifier modifier1111110 = modifier111118;
                        Function2<Composer, Integer, Unit> function1111111116 = function1111111112;
                        Function2<Composer, Integer, Unit> function1111111117 = function1111111113;
                        Shape shape1113 = shape1112;
                        long j1111114 = j1111112;
                        long j1111115 = j1111113;
                        int i15 = i10;
                        AlertDialogKt.m960AlertDialogContentWMdw5o4(function1111111115, modifier1111110, function1111111116, function1111111117, shape1113, j1111114, j1111115, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function1111111114;
                modifier3 = modifier111119;
                function9 = function6;
                shape4 = shape3;
                j6 = j4;
                j7 = j5;
                dialogProperties3 = dialogProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                        i3 &= -458753;
                    } else {
                        medium = shape2;
                    }
                    if ((i2 & 64) != 0) {
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        i3 &= -3670017;
                    } else {
                        jM1043getSurface0d7_KjU = j3;
                    }
                    if ((i2 & 128) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                        i3 &= -29360129;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if (i8 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    function6 = function10;
                    shape3 = medium;
                    function7 = function4;
                    j4 = jM1043getSurface0d7_KjU;
                    j5 = jM1057contentColorForek8zF_U;
                }
                i10 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
                }
                final Modifier modifier1111110 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function1111111115 = function7;
                final Function2<? super Composer, ? super Integer, Unit> function1111111116 = function6;
                final Shape shape1113 = shape3;
                final long j1111114 = j4;
                Function2<? super Composer, ? super Integer, Unit> function1111111117 = function7;
                final long j1111115 = j5;
                Modifier modifier1111111 = modifier2;
                composer2 = composerStartRestartGroup;
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i14) {
                        if ((i14 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                        }
                        Function2<Composer, Integer, Unit> function1111111118 = buttons;
                        Modifier modifier1111112 = modifier1111110;
                        Function2<Composer, Integer, Unit> function1111111119 = function1111111115;
                        Function2<Composer, Integer, Unit> function11111111110 = function1111111116;
                        Shape shape1114 = shape1113;
                        long j1111116 = j1111114;
                        long j1111117 = j1111115;
                        int i15 = i10;
                        AlertDialogKt.m960AlertDialogContentWMdw5o4(function1111111118, modifier1111112, function1111111119, function11111111110, shape1114, j1111116, j1111117, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function1111111117;
                modifier3 = modifier1111111;
                function9 = function6;
                shape4 = shape3;
                j6 = j4;
                j7 = j5;
                dialogProperties3 = dialogProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i14) {
                    AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 100663296;
        if ((i3 & 191739611) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i3 &= -458753;
                } else {
                    medium = shape2;
                }
                if ((i2 & 64) != 0) {
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    i3 &= -3670017;
                } else {
                    jM1043getSurface0d7_KjU = j3;
                }
                if ((i2 & 128) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                if (i8 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                function6 = function10;
                shape3 = medium;
                function7 = function4;
                j4 = jM1043getSurface0d7_KjU;
                j5 = jM1057contentColorForek8zF_U;
            } else {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i3 &= -458753;
                } else {
                    medium = shape2;
                }
                if ((i2 & 64) != 0) {
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    i3 &= -3670017;
                } else {
                    jM1043getSurface0d7_KjU = j3;
                }
                if ((i2 & 128) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                if (i8 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                function6 = function10;
                shape3 = medium;
                function7 = function4;
                j4 = jM1043getSurface0d7_KjU;
                j5 = jM1057contentColorForek8zF_U;
            }
            i10 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
            }
            final Modifier modifier1111112 = modifier2;
            final Function2<? super Composer, ? super Integer, Unit> function1111111118 = function7;
            final Function2<? super Composer, ? super Integer, Unit> function1111111119 = function6;
            final Shape shape1114 = shape3;
            final long j1111116 = j4;
            Function2<? super Composer, ? super Integer, Unit> function11111111110 = function7;
            final long j1111117 = j5;
            Modifier modifier1111113 = modifier2;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i14) {
                    if ((i14 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                    }
                    Function2<Composer, Integer, Unit> function11111111111 = buttons;
                    Modifier modifier1111114 = modifier1111112;
                    Function2<Composer, Integer, Unit> function11111111112 = function1111111118;
                    Function2<Composer, Integer, Unit> function11111111113 = function1111111119;
                    Shape shape1115 = shape1114;
                    long j1111118 = j1111116;
                    long j1111119 = j1111117;
                    int i15 = i10;
                    AlertDialogKt.m960AlertDialogContentWMdw5o4(function11111111111, modifier1111114, function11111111112, function11111111113, shape1115, j1111118, j1111119, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function11111111110;
            modifier3 = modifier1111113;
            function9 = function6;
            shape4 = shape3;
            j6 = j4;
            j7 = j5;
            dialogProperties3 = dialogProperties2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i3 &= -458753;
                } else {
                    medium = shape2;
                }
                if ((i2 & 64) != 0) {
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    i3 &= -3670017;
                } else {
                    jM1043getSurface0d7_KjU = j3;
                }
                if ((i2 & 128) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                if (i8 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                function6 = function10;
                shape3 = medium;
                function7 = function4;
                j4 = jM1043getSurface0d7_KjU;
                j5 = jM1057contentColorForek8zF_U;
            } else {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                    medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getMedium();
                    i3 &= -458753;
                } else {
                    medium = shape2;
                }
                if ((i2 & 64) != 0) {
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    i3 &= -3670017;
                } else {
                    jM1043getSurface0d7_KjU = j3;
                }
                if ((i2 & 128) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 18) & 14);
                    i3 &= -29360129;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                if (i8 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties2 = dialogProperties;
                }
                function6 = function10;
                shape3 = medium;
                function7 = function4;
                j4 = jM1043getSurface0d7_KjU;
                j5 = jM1057contentColorForek8zF_U;
            }
            i10 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1035523925, i10, -1, "androidx.compose.material.AlertDialog (AndroidAlertDialog.android.kt:125)");
            }
            final Modifier modifier1111114 = modifier2;
            final Function2<? super Composer, ? super Integer, Unit> function11111111111 = function7;
            final Function2<? super Composer, ? super Integer, Unit> function11111111112 = function6;
            final Shape shape1115 = shape3;
            final long j1111118 = j4;
            Function2<? super Composer, ? super Integer, Unit> function11111111113 = function7;
            final long j1111119 = j5;
            Modifier modifier1111115 = modifier2;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(composer2, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer3, int i14) {
                    if ((i14 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1787418772, i14, -1, "androidx.compose.material.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:139)");
                    }
                    Function2<Composer, Integer, Unit> function11111111114 = buttons;
                    Modifier modifier1111116 = modifier1111114;
                    Function2<Composer, Integer, Unit> function11111111115 = function11111111111;
                    Function2<Composer, Integer, Unit> function11111111116 = function11111111112;
                    Shape shape1116 = shape1115;
                    long j11111110 = j1111118;
                    long j11111111 = j1111119;
                    int i15 = i10;
                    AlertDialogKt.m960AlertDialogContentWMdw5o4(function11111111114, modifier1111116, function11111111115, function11111111116, shape1116, j11111110, j11111111, composer3, ((i15 >> 3) & 14) | ((i15 >> 3) & 112) | ((i15 >> 3) & 896) | ((i15 >> 3) & 7168) | ((i15 >> 3) & 57344) | ((i15 >> 3) & 458752) | ((i15 >> 3) & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer2, (i10 & 14) | 384 | ((i10 >> 21) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function11111111113;
            modifier3 = modifier1111115;
            function9 = function6;
            shape4 = shape3;
            j6 = j4;
            j7 = j5;
            dialogProperties3 = dialogProperties2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i14) {
                AndroidAlertDialog_androidKt.m963AlertDialogwqdebIU(onDismissRequest, buttons, modifier3, function8, function9, shape4, j6, j7, dialogProperties3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }
}
