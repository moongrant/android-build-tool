package p650o0ooo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOo;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooOO0;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p193o00o0O0O.o0000oo;
import p202o00o0o.o00Oo0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMoveRoomDialogUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoveRoomDialogUtil.kt\ncom/yalla/yalla/ui/dialog/MoveRoomDialogUtil$showMoveRoomDialog$1$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,175:1\n72#2,6:176\n78#2:210\n82#2:218\n78#3,11:182\n91#3:217\n456#4,8:193\n464#4,3:207\n467#4,3:214\n4144#5,6:201\n154#6:211\n154#6:212\n154#6:213\n*S KotlinDebug\n*F\n+ 1 MoveRoomDialogUtil.kt\ncom/yalla/yalla/ui/dialog/MoveRoomDialogUtil$showMoveRoomDialog$1$1\n*L\n121#1:176,6\n121#1:210\n121#1:218\n121#1:182,11\n121#1:217\n121#1:193,8\n121#1:207,3\n121#1:214,3\n121#1:201,6\n132#1:211\n138#1:212\n141#1:213\n*E\n"})
public final class oOo0o00 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f59036OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f59037OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Integer f59038OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0o00(RoomUserInfoModel roomUserInfoModel, Integer num, MutableState<Boolean> mutableState) {
        super(3);
        this.f59036OooO0Oo = roomUserInfoModel;
        this.f59038OooO0o0 = num;
        this.f59037OooO0o = mutableState;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00cc A[PHI: r1 r7
      0x00cc: PHI (r1v31 androidx.compose.ui.text.AnnotatedString) = (r1v30 androidx.compose.ui.text.AnnotatedString), (r1v34 androidx.compose.ui.text.AnnotatedString) binds: [B:28:0x00ca, B:22:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r7v15 java.lang.String) = (r7v14 java.lang.String), (r7v19 java.lang.String) binds: [B:28:0x00ca, B:22:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0166  */
    /* JADX WARN: Code duplicated, block: B:42:0x0172  */
    /* JADX WARN: Code duplicated, block: B:43:0x0176  */
    /* JADX WARN: Code duplicated, block: B:48:0x0195  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x021a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0237  */
    /* JADX WARN: Code duplicated, block: B:58:0x023b  */
    /* JADX WARN: Code duplicated, block: B:62:0x024c  */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        AnnotatedString annotatedStringOooO00o;
        String strOooO0OO;
        boolean z;
        boolean z2;
        String str;
        Modifier.Companion companion;
        Alignment.Companion companion2;
        MutableState<Boolean> mutableState;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        ColumnScopeInstance columnScopeInstance;
        Composer composer2;
        Composer composer3;
        String str2;
        ColumnScope TextDialog = columnScope;
        Composer composer4 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(TextDialog, "$this$TextDialog");
        if ((iIntValue & 81) == 16 && composer4.getSkipping()) {
            composer4.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(210724184, iIntValue, -1, "com.yalla.yalla.ui.dialog.MoveRoomDialogUtil.showMoveRoomDialog.<anonymous>.<anonymous> (MoveRoomDialogUtil.kt:61)");
            }
            int iIntValue2 = ((Number) SnapshotStateKt.collectAsState(this.f59036OooO0Oo.getRoomMemberType(), null, composer4, 8, 1).getValue()).intValue();
            Integer num2 = this.f59038OooO0o0;
            if (iIntValue2 != 0) {
                if (iIntValue2 == 1) {
                    String strOooO0OO2 = o0000.OooO0OO(o000000.remove_room_title);
                    int i = o000000.title_RoomPerson_roomer;
                    annotatedStringOooO00o = O0O0.OooO00o(o0000O.OooO00o(strOooO0OO2, o0000.OooO0OO(i)), o0000.OooO0OO(i), 4294863980L, 452881516L);
                    str = null;
                    z2 = false;
                } else if (iIntValue2 == 2) {
                    String strOooO0OO3 = o0000.OooO0OO(o000000.remove_room_title);
                    int i2 = o000000.admin;
                    annotatedStringOooO00o = O0O0.OooO00o(o0000O.OooO00o(strOooO0OO3, o0000.OooO0OO(i2)), o0000.OooO0OO(i2), 4294951737L, 452969273L);
                    strOooO0OO = o0000.OooO0OO(o000000.remove_member_room);
                    if (num2 != null && num2.intValue() == 2) {
                        z = false;
                    }
                    z2 = z;
                    str = strOooO0OO;
                } else if (iIntValue2 != 3) {
                    annotatedStringOooO00o = null;
                    str = null;
                    z2 = true;
                } else {
                    String strOooO0OO4 = o0000.OooO0OO(o000000.remove_room_title);
                    int i3 = o000000.Member;
                    annotatedStringOooO00o = O0O0.OooO00o(o0000O.OooO00o(strOooO0OO4, o0000.OooO0OO(i3)), o0000.OooO0OO(i3), 4278245577L, 436263113L);
                    strOooO0OO = o0000.OooO0OO(o000000.remove_member_room);
                    if (num2 != null && num2.intValue() == 2) {
                        z = false;
                    }
                    z2 = z;
                    str = strOooO0OO;
                }
                companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                companion2 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                mutableState = this.f59037OooO0o;
                composer4.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally, composer4, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                if (!(composer4.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor);
                } else {
                    composer4.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composer4);
                function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer4)), composer4, 2058660585);
                columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer4.startReplaceableGroup(483634129);
                if (annotatedStringOooO00o == null) {
                    composer2 = composer4;
                } else {
                    long jOooO0OO = o0000O0.OooO0OO(18, composer4, 6);
                    composer2 = composer4;
                    TextKt.m1262TextIbK3jfQ(annotatedStringOooO00o, columnScopeInstance.align(PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(25), 0.0f, 2, null), companion2.getCenterHorizontally()), o0000oo.OooO0OO(composer4).f38616OooO, jOooO0OO, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 196608, 0, 262096);
                }
                composer2.endReplaceableGroup();
                composer3 = composer2;
                composer3.startReplaceableGroup(-380627520);
                if (z2) {
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(15), null, composer3, 6, 2);
                    Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(25), 0.0f, 2, null);
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    o00Oo0.OooO00o(modifierM480paddingVpY3zN4$default, str2, mutableState, composer3, 390, 0);
                }
                if (OooOo.OooO00o(composer3)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                String strOooO0OO5 = o0000.OooO0OO(o000000.remove_room_title);
                int i4 = o000000.guest;
                annotatedStringOooO00o = O0O0.OooO00o(o0000O.OooO00o(strOooO0OO5, o0000.OooO0OO(i4)), o0000.OooO0OO(i4), 4288256409L, 442852709L);
                strOooO0OO = o0000.OooO0OO(o000000.remove_guest_room);
                if (num2 != null) {
                    num2.intValue();
                }
            }
            z = true;
            z2 = z;
            str = strOooO0OO;
            companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
            mutableState = this.f59037OooO0o;
            composer4.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o2 = OooOO0.OooO00o(Arrangement.INSTANCE, centerHorizontally2, composer4, 48, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
            if (!(composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor);
            } else {
                composer4.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composer4);
            function2OooO00o = OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o2, composerM1320constructorimpl, currentCompositionLocalMap2);
            if (composerM1320constructorimpl.getInserting()) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer4)), composer4, 2058660585);
            columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer4.startReplaceableGroup(483634129);
            if (annotatedStringOooO00o == null) {
                composer2 = composer4;
            } else {
                long jOooO0OO2 = o0000O0.OooO0OO(18, composer4, 6);
                composer2 = composer4;
                TextKt.m1262TextIbK3jfQ(annotatedStringOooO00o, columnScopeInstance.align(PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(25), 0.0f, 2, null), companion2.getCenterHorizontally()), o0000oo.OooO0OO(composer4).f38616OooO, jOooO0OO2, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, 196608, 0, 262096);
            }
            composer2.endReplaceableGroup();
            composer3 = composer2;
            composer3.startReplaceableGroup(-380627520);
            if (z2) {
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(15), null, composer3, 6, 2);
                Modifier modifierM480paddingVpY3zN4$default2 = PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(25), 0.0f, 2, null);
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                o00Oo0.OooO00o(modifierM480paddingVpY3zN4$default2, str2, mutableState, composer3, 390, 0);
            }
            if (OooOo.OooO00o(composer3)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
