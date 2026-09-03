package p516o0o0O00o;

import android.text.TextUtils;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooO0o;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0000Ooo;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p197o00o0OOo.o00O0O0;
import p200o00o0OoO.o00OO00O;
import p476o0OooooO.o0OOo000;
import p587o0oOooOO.oo000000;
import p587o0oOooOO.w;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomImageDotViewCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomImageDotViewCompose.kt\ncom/yalla/yalla/ui/composable/common/RoomImageDotViewComposeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,102:1\n154#2:103\n154#2:139\n154#2:140\n154#2:146\n154#2:147\n164#2:148\n164#2:149\n72#3,6:104\n78#3:138\n82#3:145\n78#4,11:110\n91#4:144\n456#5,8:121\n464#5,3:135\n467#5,3:141\n4144#6,6:129\n*S KotlinDebug\n*F\n+ 1 RoomImageDotViewCompose.kt\ncom/yalla/yalla/ui/composable/common/RoomImageDotViewComposeKt\n*L\n35#1:103\n45#1:139\n62#1:140\n84#1:146\n85#1:147\n87#1:148\n88#1:149\n43#1:104,6\n43#1:138\n43#1:145\n43#1:110,11\n43#1:144\n43#1:121,8\n43#1:135,3\n43#1:141,3\n43#1:129,6\n*E\n"})
public final class o0 {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ float f51093OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f51094OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f51095OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Integer f51096OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f51097OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Integer f51098OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Color f51099OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f51100OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f51101OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f51102OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Modifier modifier, Integer num, String str, String str2, Integer num2, float f, Color color, boolean z, int i, int i2) {
            super(2);
            this.f51094OooO0Oo = modifier;
            this.f51096OooO0o0 = num;
            this.f51095OooO0o = str;
            this.f51097OooO0oO = str2;
            this.f51098OooO0oo = num2;
            this.f51093OooO = f;
            this.f51099OooOO0 = color;
            this.f51100OooOO0O = z;
            this.f51101OooOO0o = i;
            this.f51102OooOOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0.OooO00o(this.f51094OooO0Oo, this.f51096OooO0o0, this.f51095OooO0o, this.f51097OooO0oO, this.f51098OooO0oo, this.f51093OooO, this.f51099OooOO0, this.f51100OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51101OooOO0o | 1), this.f51102OooOOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ float f51103OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f51104OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f51105OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Integer f51106OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f51107OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Integer f51108OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Color f51109OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f51110OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f51111OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f51112OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Modifier modifier, Integer num, String str, String str2, Integer num2, float f, Color color, boolean z, int i, int i2) {
            super(2);
            this.f51104OooO0Oo = modifier;
            this.f51106OooO0o0 = num;
            this.f51105OooO0o = str;
            this.f51107OooO0oO = str2;
            this.f51108OooO0oo = num2;
            this.f51103OooO = f;
            this.f51109OooOO0 = color;
            this.f51110OooOO0O = z;
            this.f51111OooOO0o = i;
            this.f51112OooOOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0.OooO00o(this.f51104OooO0Oo, this.f51106OooO0o0, this.f51105OooO0o, this.f51107OooO0oO, this.f51108OooO0oo, this.f51103OooO, this.f51109OooOO0, this.f51110OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51111OooOO0o | 1), this.f51112OooOOO0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0134  */
    /* JADX WARN: Code duplicated, block: B:101:0x0138  */
    /* JADX WARN: Code duplicated, block: B:103:0x013c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0140  */
    /* JADX WARN: Code duplicated, block: B:107:0x014a  */
    /* JADX WARN: Code duplicated, block: B:108:0x014d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0152  */
    /* JADX WARN: Code duplicated, block: B:112:0x0155  */
    /* JADX WARN: Code duplicated, block: B:115:0x015d  */
    /* JADX WARN: Code duplicated, block: B:118:0x016c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:136:0x0206  */
    /* JADX WARN: Code duplicated, block: B:138:0x0214  */
    /* JADX WARN: Code duplicated, block: B:141:0x0238  */
    /* JADX WARN: Code duplicated, block: B:142:0x0275  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:146:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:149:0x0328  */
    /* JADX WARN: Code duplicated, block: B:154:0x0340  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0123  */
    /* JADX WARN: Code duplicated, block: B:95:0x0128  */
    /* JADX WARN: Code duplicated, block: B:97:0x012c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0130  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable Modifier modifier, @Nullable Integer num, @Nullable String str, @NotNull String text, @Nullable Integer num2, float f, @Nullable Color color, boolean z, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Integer num3;
        int i8;
        int i9;
        float fM3775constructorimpl;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Modifier modifier2;
        Integer num4;
        String str2;
        Color color2;
        boolean z2;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        Integer num5;
        float f2;
        Composer composer2;
        Modifier modifier3;
        Integer num6;
        String str3;
        boolean z3;
        Color color3;
        float f3;
        Integer num7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1240117667);
        int i15 = i2 & 1;
        if (i15 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(num) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    if (composerStartRestartGroup.changed(str)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (composerStartRestartGroup.changed(text)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 16;
                if (i7 != 0) {
                    if ((57344 & i) == 0) {
                        num3 = num2;
                        if (composerStartRestartGroup.changed(num3)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        if ((458752 & i) == 0) {
                            fM3775constructorimpl = f;
                            if (composerStartRestartGroup.changed(fM3775constructorimpl)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                        i11 = i2 & 64;
                        if (i11 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(color)) {
                                i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i12 = 524288;
                            }
                            i3 |= i12;
                        }
                        i13 = i2 & 128;
                        if (i13 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(z)) {
                                i14 = 8388608;
                            } else {
                                i14 = Configuration.BLOCK_SIZE;
                            }
                            i3 |= i14;
                        }
                        if ((i3 & 23967451) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i16 != 0) {
                                num4 = null;
                            } else {
                                num4 = num;
                            }
                            if (i4 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i7 != 0) {
                                num3 = null;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(39);
                            }
                            if (i11 != 0) {
                                color2 = null;
                            } else {
                                color2 = color;
                            }
                            if (i13 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                            }
                            if (!TextUtils.isEmpty(str2) && num4 == null) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup2 == null) {
                                    return;
                                }
                                scopeUpdateScopeEndRestartGroup2.updateScope(new OooO00o(modifier2, num4, str2, text, num3, fM3775constructorimpl, color2, z2, i, i2));
                                return;
                            }
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            int i17 = (i3 & 14) | 384;
                            composerStartRestartGroup.startReplaceableGroup(-483455358);
                            int i18 = i17 >> 3;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, (i18 & 112) | (i18 & 14));
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
                            int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                            function2OooO00o = OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            OooOO0.OooO00o((i19 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                            if (num4 != null) {
                                composerStartRestartGroup.startReplaceableGroup(859921197);
                                num5 = num3;
                                f2 = fM3775constructorimpl;
                                ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                num5 = num3;
                                f2 = fM3775constructorimpl;
                                composerStartRestartGroup.startReplaceableGroup(859921493);
                                Intrinsics.checkNotNull(str2);
                                o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                            if (z2) {
                                composerStartRestartGroup.startReplaceableGroup(859921759);
                                o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                                composerStartRestartGroup.endReplaceableGroup();
                                composer2 = composerStartRestartGroup;
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(859921926);
                                composer2 = composerStartRestartGroup;
                                oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                                composer2.endReplaceableGroup();
                            }
                            if (OooO0o.OooO00o(composer2)) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            num6 = num4;
                            str3 = str2;
                            z3 = z2;
                            color3 = color2;
                            f3 = f2;
                            num7 = num5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            num6 = num;
                            str3 = str;
                            color3 = color;
                            num7 = num3;
                            f3 = fM3775constructorimpl;
                            composer2 = composerStartRestartGroup;
                            z3 = z;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
                    }
                    i3 |= 196608;
                    fM3775constructorimpl = f;
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(color)) {
                            i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    i13 = i2 & 128;
                    if (i13 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i14 = 8388608;
                        } else {
                            i14 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i14;
                    }
                    if ((i3 & 23967451) == 4793490) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            num4 = null;
                        } else {
                            num4 = num;
                        }
                        if (i4 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i7 != 0) {
                            num3 = null;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(39);
                        }
                        if (i11 != 0) {
                            color2 = null;
                        } else {
                            color2 = color;
                        }
                        if (i13 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                        }
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                        int i110 = (i3 & 14) | 384;
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        int i111 = i110 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composerStartRestartGroup, (i111 & 112) | (i111 & 14));
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier2);
                        int i112 = ((((i110 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy2, composerM1320constructorimpl, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o((i112 >> 3) & 112, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                        if (num4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(859921197);
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(859921493);
                            Intrinsics.checkNotNull(str2);
                            o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                        if (z2) {
                            composerStartRestartGroup.startReplaceableGroup(859921759);
                            o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(859921926);
                            composer2 = composerStartRestartGroup;
                            oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                            composer2.endReplaceableGroup();
                        }
                        if (OooO0o.OooO00o(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        num6 = num4;
                        str3 = str2;
                        z3 = z2;
                        color3 = color2;
                        f3 = f2;
                        num7 = num5;
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            num4 = null;
                        } else {
                            num4 = num;
                        }
                        if (i4 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i7 != 0) {
                            num3 = null;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(39);
                        }
                        if (i11 != 0) {
                            color2 = null;
                        } else {
                            color2 = color;
                        }
                        if (i13 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                        }
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                        int i113 = (i3 & 14) | 384;
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        int i114 = i113 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally3, composerStartRestartGroup, (i114 & 112) | (i114 & 14));
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier2);
                        int i115 = ((((i113 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy3, composerM1320constructorimpl, currentCompositionLocalMap3);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o((i115 >> 3) & 112, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                        if (num4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(859921197);
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(859921493);
                            Intrinsics.checkNotNull(str2);
                            o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                        if (z2) {
                            composerStartRestartGroup.startReplaceableGroup(859921759);
                            o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(859921926);
                            composer2 = composerStartRestartGroup;
                            oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                            composer2.endReplaceableGroup();
                        }
                        if (OooO0o.OooO00o(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        num6 = num4;
                        str3 = str2;
                        z3 = z2;
                        color3 = color2;
                        f3 = f2;
                        num7 = num5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
                }
                i3 |= 24576;
                num3 = num2;
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((458752 & i) == 0) {
                        fM3775constructorimpl = f;
                        if (composerStartRestartGroup.changed(fM3775constructorimpl)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(color)) {
                            i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    i13 = i2 & 128;
                    if (i13 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i14 = 8388608;
                        } else {
                            i14 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i14;
                    }
                    if ((i3 & 23967451) == 4793490) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            num4 = null;
                        } else {
                            num4 = num;
                        }
                        if (i4 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i7 != 0) {
                            num3 = null;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(39);
                        }
                        if (i11 != 0) {
                            color2 = null;
                        } else {
                            color2 = color;
                        }
                        if (i13 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                        }
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        Alignment.Horizontal centerHorizontally4 = Alignment.INSTANCE.getCenterHorizontally();
                        int i116 = (i3 & 14) | 384;
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        int i117 = i116 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally4, composerStartRestartGroup, (i117 & 112) | (i117 & 14));
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifier2);
                        int i118 = ((((i116 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy4, composerM1320constructorimpl, currentCompositionLocalMap4);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o((i118 >> 3) & 112, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                        if (num4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(859921197);
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(859921493);
                            Intrinsics.checkNotNull(str2);
                            o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                        if (z2) {
                            composerStartRestartGroup.startReplaceableGroup(859921759);
                            o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(859921926);
                            composer2 = composerStartRestartGroup;
                            oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                            composer2.endReplaceableGroup();
                        }
                        if (OooO0o.OooO00o(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        num6 = num4;
                        str3 = str2;
                        z3 = z2;
                        color3 = color2;
                        f3 = f2;
                        num7 = num5;
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            num4 = null;
                        } else {
                            num4 = num;
                        }
                        if (i4 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i7 != 0) {
                            num3 = null;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(39);
                        }
                        if (i11 != 0) {
                            color2 = null;
                        } else {
                            color2 = color;
                        }
                        if (i13 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                        }
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        Alignment.Horizontal centerHorizontally5 = Alignment.INSTANCE.getCenterHorizontally();
                        int i119 = (i3 & 14) | 384;
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        int i1110 = i119 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally5, composerStartRestartGroup, (i1110 & 112) | (i1110 & 14));
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        constructor = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifier2);
                        int i1111 = ((((i119 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion5, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy5, composerM1320constructorimpl, currentCompositionLocalMap5);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o((i1111 >> 3) & 112, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                        if (num4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(859921197);
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(859921493);
                            Intrinsics.checkNotNull(str2);
                            o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                        if (z2) {
                            composerStartRestartGroup.startReplaceableGroup(859921759);
                            o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(859921926);
                            composer2 = composerStartRestartGroup;
                            oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                            composer2.endReplaceableGroup();
                        }
                        if (OooO0o.OooO00o(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        num6 = num4;
                        str3 = str2;
                        z3 = z2;
                        color3 = color2;
                        f3 = f2;
                        num7 = num5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
                }
                i3 |= 196608;
                fM3775constructorimpl = f;
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(color)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                i13 = i2 & 128;
                if (i13 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i14 = 8388608;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i14;
                }
                if ((i3 & 23967451) == 4793490) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i4 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i7 != 0) {
                        num3 = null;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(39);
                    }
                    if (i11 != 0) {
                        color2 = null;
                    } else {
                        color2 = color;
                    }
                    if (i13 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    Alignment.Horizontal centerHorizontally6 = Alignment.INSTANCE.getCenterHorizontally();
                    int i1112 = (i3 & 14) | 384;
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    int i1113 = i1112 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally6, composerStartRestartGroup, (i1113 & 112) | (i1113 & 14));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    constructor = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifier2);
                    int i1114 = ((((i1112 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion6, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy6, composerM1320constructorimpl, currentCompositionLocalMap6);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o((i1114 >> 3) & 112, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    if (num4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(859921197);
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(859921493);
                        Intrinsics.checkNotNull(str2);
                        o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    if (z2) {
                        composerStartRestartGroup.startReplaceableGroup(859921759);
                        o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(859921926);
                        composer2 = composerStartRestartGroup;
                        oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                        composer2.endReplaceableGroup();
                    }
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num6 = num4;
                    str3 = str2;
                    z3 = z2;
                    color3 = color2;
                    f3 = f2;
                    num7 = num5;
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i4 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i7 != 0) {
                        num3 = null;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(39);
                    }
                    if (i11 != 0) {
                        color2 = null;
                    } else {
                        color2 = color;
                    }
                    if (i13 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    Alignment.Horizontal centerHorizontally7 = Alignment.INSTANCE.getCenterHorizontally();
                    int i1115 = (i3 & 14) | 384;
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    int i1116 = i1115 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally7, composerStartRestartGroup, (i1116 & 112) | (i1116 & 14));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifier2);
                    int i1117 = ((((i1115 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion7, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy7, composerM1320constructorimpl, currentCompositionLocalMap7);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o((i1117 >> 3) & 112, function3ModifierMaterializerOf7, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    if (num4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(859921197);
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(859921493);
                        Intrinsics.checkNotNull(str2);
                        o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    if (z2) {
                        composerStartRestartGroup.startReplaceableGroup(859921759);
                        o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(859921926);
                        composer2 = composerStartRestartGroup;
                        oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                        composer2.endReplaceableGroup();
                    }
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num6 = num4;
                    str3 = str2;
                    z3 = z2;
                    color3 = color2;
                    f3 = f2;
                    num7 = num5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
            }
            i3 |= 384;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changed(text)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i6;
            }
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((57344 & i) == 0) {
                    num3 = num2;
                    if (composerStartRestartGroup.changed(num3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((458752 & i) == 0) {
                        fM3775constructorimpl = f;
                        if (composerStartRestartGroup.changed(fM3775constructorimpl)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(color)) {
                            i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    i13 = i2 & 128;
                    if (i13 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i14 = 8388608;
                        } else {
                            i14 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i14;
                    }
                    if ((i3 & 23967451) == 4793490) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            num4 = null;
                        } else {
                            num4 = num;
                        }
                        if (i4 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i7 != 0) {
                            num3 = null;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(39);
                        }
                        if (i11 != 0) {
                            color2 = null;
                        } else {
                            color2 = color;
                        }
                        if (i13 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                        }
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        Alignment.Horizontal centerHorizontally8 = Alignment.INSTANCE.getCenterHorizontally();
                        int i1118 = (i3 & 14) | 384;
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        int i1119 = i1118 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally8, composerStartRestartGroup, (i1119 & 112) | (i1119 & 14));
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        constructor = companion8.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifier2);
                        int i11110 = ((((i1118 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion8, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy8, composerM1320constructorimpl, currentCompositionLocalMap8);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o((i11110 >> 3) & 112, function3ModifierMaterializerOf8, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance8 = ColumnScopeInstance.INSTANCE;
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                        if (num4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(859921197);
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(859921493);
                            Intrinsics.checkNotNull(str2);
                            o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                        if (z2) {
                            composerStartRestartGroup.startReplaceableGroup(859921759);
                            o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(859921926);
                            composer2 = composerStartRestartGroup;
                            oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                            composer2.endReplaceableGroup();
                        }
                        if (OooO0o.OooO00o(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        num6 = num4;
                        str3 = str2;
                        z3 = z2;
                        color3 = color2;
                        f3 = f2;
                        num7 = num5;
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            num4 = null;
                        } else {
                            num4 = num;
                        }
                        if (i4 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i7 != 0) {
                            num3 = null;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(39);
                        }
                        if (i11 != 0) {
                            color2 = null;
                        } else {
                            color2 = color;
                        }
                        if (i13 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                        }
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        Alignment.Horizontal centerHorizontally9 = Alignment.INSTANCE.getCenterHorizontally();
                        int i11111 = (i3 & 14) | 384;
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        int i11112 = i11111 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally9, composerStartRestartGroup, (i11112 & 112) | (i11112 & 14));
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        constructor = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifier2);
                        int i11113 = ((((i11111 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion9, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy9, composerM1320constructorimpl, currentCompositionLocalMap9);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o((i11113 >> 3) & 112, function3ModifierMaterializerOf9, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance9 = ColumnScopeInstance.INSTANCE;
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                        if (num4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(859921197);
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(859921493);
                            Intrinsics.checkNotNull(str2);
                            o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                        if (z2) {
                            composerStartRestartGroup.startReplaceableGroup(859921759);
                            o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(859921926);
                            composer2 = composerStartRestartGroup;
                            oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                            composer2.endReplaceableGroup();
                        }
                        if (OooO0o.OooO00o(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        num6 = num4;
                        str3 = str2;
                        z3 = z2;
                        color3 = color2;
                        f3 = f2;
                        num7 = num5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
                }
                i3 |= 196608;
                fM3775constructorimpl = f;
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(color)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                i13 = i2 & 128;
                if (i13 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i14 = 8388608;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i14;
                }
                if ((i3 & 23967451) == 4793490) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i4 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i7 != 0) {
                        num3 = null;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(39);
                    }
                    if (i11 != 0) {
                        color2 = null;
                    } else {
                        color2 = color;
                    }
                    if (i13 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    Alignment.Horizontal centerHorizontally10 = Alignment.INSTANCE.getCenterHorizontally();
                    int i11114 = (i3 & 14) | 384;
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    int i11115 = i11114 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy10 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally10, composerStartRestartGroup, (i11115 & 112) | (i11115 & 14));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    constructor = companion10.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifier2);
                    int i11116 = ((((i11114 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion10, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy10, composerM1320constructorimpl, currentCompositionLocalMap10);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o((i11116 >> 3) & 112, function3ModifierMaterializerOf10, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance10 = ColumnScopeInstance.INSTANCE;
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    if (num4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(859921197);
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(859921493);
                        Intrinsics.checkNotNull(str2);
                        o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    if (z2) {
                        composerStartRestartGroup.startReplaceableGroup(859921759);
                        o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(859921926);
                        composer2 = composerStartRestartGroup;
                        oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                        composer2.endReplaceableGroup();
                    }
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num6 = num4;
                    str3 = str2;
                    z3 = z2;
                    color3 = color2;
                    f3 = f2;
                    num7 = num5;
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i4 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i7 != 0) {
                        num3 = null;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(39);
                    }
                    if (i11 != 0) {
                        color2 = null;
                    } else {
                        color2 = color;
                    }
                    if (i13 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    Alignment.Horizontal centerHorizontally11 = Alignment.INSTANCE.getCenterHorizontally();
                    int i11117 = (i3 & 14) | 384;
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    int i11118 = i11117 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy11 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally11, composerStartRestartGroup, (i11118 & 112) | (i11118 & 14));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifier2);
                    int i11119 = ((((i11117 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion11, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy11, composerM1320constructorimpl, currentCompositionLocalMap11);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o((i11119 >> 3) & 112, function3ModifierMaterializerOf11, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance11 = ColumnScopeInstance.INSTANCE;
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    if (num4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(859921197);
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(859921493);
                        Intrinsics.checkNotNull(str2);
                        o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    if (z2) {
                        composerStartRestartGroup.startReplaceableGroup(859921759);
                        o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(859921926);
                        composer2 = composerStartRestartGroup;
                        oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                        composer2.endReplaceableGroup();
                    }
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num6 = num4;
                    str3 = str2;
                    z3 = z2;
                    color3 = color2;
                    f3 = f2;
                    num7 = num5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
            }
            i3 |= 24576;
            num3 = num2;
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((458752 & i) == 0) {
                    fM3775constructorimpl = f;
                    if (composerStartRestartGroup.changed(fM3775constructorimpl)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(color)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                i13 = i2 & 128;
                if (i13 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i14 = 8388608;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i14;
                }
                if ((i3 & 23967451) == 4793490) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i4 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i7 != 0) {
                        num3 = null;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(39);
                    }
                    if (i11 != 0) {
                        color2 = null;
                    } else {
                        color2 = color;
                    }
                    if (i13 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    Alignment.Horizontal centerHorizontally12 = Alignment.INSTANCE.getCenterHorizontally();
                    int i111110 = (i3 & 14) | 384;
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    int i111111 = i111110 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy12 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally12, composerStartRestartGroup, (i111111 & 112) | (i111111 & 14));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    constructor = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifier2);
                    int i111112 = ((((i111110 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion12, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy12, composerM1320constructorimpl, currentCompositionLocalMap12);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o((i111112 >> 3) & 112, function3ModifierMaterializerOf12, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance12 = ColumnScopeInstance.INSTANCE;
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    if (num4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(859921197);
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(859921493);
                        Intrinsics.checkNotNull(str2);
                        o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    if (z2) {
                        composerStartRestartGroup.startReplaceableGroup(859921759);
                        o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(859921926);
                        composer2 = composerStartRestartGroup;
                        oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                        composer2.endReplaceableGroup();
                    }
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num6 = num4;
                    str3 = str2;
                    z3 = z2;
                    color3 = color2;
                    f3 = f2;
                    num7 = num5;
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i4 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i7 != 0) {
                        num3 = null;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(39);
                    }
                    if (i11 != 0) {
                        color2 = null;
                    } else {
                        color2 = color;
                    }
                    if (i13 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    Alignment.Horizontal centerHorizontally13 = Alignment.INSTANCE.getCenterHorizontally();
                    int i111113 = (i3 & 14) | 384;
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    int i111114 = i111113 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy13 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally13, composerStartRestartGroup, (i111114 & 112) | (i111114 & 14));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    constructor = companion13.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifier2);
                    int i111115 = ((((i111113 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion13, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy13, composerM1320constructorimpl, currentCompositionLocalMap13);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o((i111115 >> 3) & 112, function3ModifierMaterializerOf13, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance13 = ColumnScopeInstance.INSTANCE;
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    if (num4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(859921197);
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(859921493);
                        Intrinsics.checkNotNull(str2);
                        o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    if (z2) {
                        composerStartRestartGroup.startReplaceableGroup(859921759);
                        o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(859921926);
                        composer2 = composerStartRestartGroup;
                        oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                        composer2.endReplaceableGroup();
                    }
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num6 = num4;
                    str3 = str2;
                    z3 = z2;
                    color3 = color2;
                    f3 = f2;
                    num7 = num5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
            }
            i3 |= 196608;
            fM3775constructorimpl = f;
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(color)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            i13 = i2 & 128;
            if (i13 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i14 = 8388608;
                } else {
                    i14 = Configuration.BLOCK_SIZE;
                }
                i3 |= i14;
            }
            if ((i3 & 23967451) == 4793490) {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num;
                }
                if (i4 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i7 != 0) {
                    num3 = null;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(39);
                }
                if (i11 != 0) {
                    color2 = null;
                } else {
                    color2 = color;
                }
                if (i13 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                }
                if (!TextUtils.isEmpty(str2)) {
                }
                Alignment.Horizontal centerHorizontally14 = Alignment.INSTANCE.getCenterHorizontally();
                int i111116 = (i3 & 14) | 384;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                int i111117 = i111116 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy14 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally14, composerStartRestartGroup, (i111117 & 112) | (i111117 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                constructor = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifier2);
                int i111118 = ((((i111116 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion14, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy14, composerM1320constructorimpl, currentCompositionLocalMap14);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o((i111118 >> 3) & 112, function3ModifierMaterializerOf14, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance14 = ColumnScopeInstance.INSTANCE;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                if (num4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(859921197);
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    composerStartRestartGroup.startReplaceableGroup(859921493);
                    Intrinsics.checkNotNull(str2);
                    o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                if (z2) {
                    composerStartRestartGroup.startReplaceableGroup(859921759);
                    o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(859921926);
                    composer2 = composerStartRestartGroup;
                    oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                    composer2.endReplaceableGroup();
                }
                if (OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                num6 = num4;
                str3 = str2;
                z3 = z2;
                color3 = color2;
                f3 = f2;
                num7 = num5;
            } else {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num;
                }
                if (i4 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i7 != 0) {
                    num3 = null;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(39);
                }
                if (i11 != 0) {
                    color2 = null;
                } else {
                    color2 = color;
                }
                if (i13 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                }
                if (!TextUtils.isEmpty(str2)) {
                }
                Alignment.Horizontal centerHorizontally15 = Alignment.INSTANCE.getCenterHorizontally();
                int i111119 = (i3 & 14) | 384;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                int i1111110 = i111119 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy15 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally15, composerStartRestartGroup, (i1111110 & 112) | (i1111110 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifier2);
                int i1111111 = ((((i111119 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion15, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy15, composerM1320constructorimpl, currentCompositionLocalMap15);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o((i1111111 >> 3) & 112, function3ModifierMaterializerOf15, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance15 = ColumnScopeInstance.INSTANCE;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                if (num4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(859921197);
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    composerStartRestartGroup.startReplaceableGroup(859921493);
                    Intrinsics.checkNotNull(str2);
                    o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                if (z2) {
                    composerStartRestartGroup.startReplaceableGroup(859921759);
                    o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(859921926);
                    composer2 = composerStartRestartGroup;
                    oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                    composer2.endReplaceableGroup();
                }
                if (OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                num6 = num4;
                str3 = str2;
                z3 = z2;
                color3 = color2;
                f3 = f2;
                num7 = num5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                if (composerStartRestartGroup.changed(str)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changed(text)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i6;
            }
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((57344 & i) == 0) {
                    num3 = num2;
                    if (composerStartRestartGroup.changed(num3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((458752 & i) == 0) {
                        fM3775constructorimpl = f;
                        if (composerStartRestartGroup.changed(fM3775constructorimpl)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(color)) {
                            i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    i13 = i2 & 128;
                    if (i13 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i14 = 8388608;
                        } else {
                            i14 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i14;
                    }
                    if ((i3 & 23967451) == 4793490) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            num4 = null;
                        } else {
                            num4 = num;
                        }
                        if (i4 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i7 != 0) {
                            num3 = null;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(39);
                        }
                        if (i11 != 0) {
                            color2 = null;
                        } else {
                            color2 = color;
                        }
                        if (i13 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                        }
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        Alignment.Horizontal centerHorizontally16 = Alignment.INSTANCE.getCenterHorizontally();
                        int i1111112 = (i3 & 14) | 384;
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        int i1111113 = i1111112 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy16 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally16, composerStartRestartGroup, (i1111113 & 112) | (i1111113 & 14));
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                        constructor = companion16.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifier2);
                        int i1111114 = ((((i1111112 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion16, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy16, composerM1320constructorimpl, currentCompositionLocalMap16);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o((i1111114 >> 3) & 112, function3ModifierMaterializerOf16, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance16 = ColumnScopeInstance.INSTANCE;
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                        if (num4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(859921197);
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(859921493);
                            Intrinsics.checkNotNull(str2);
                            o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                        if (z2) {
                            composerStartRestartGroup.startReplaceableGroup(859921759);
                            o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(859921926);
                            composer2 = composerStartRestartGroup;
                            oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                            composer2.endReplaceableGroup();
                        }
                        if (OooO0o.OooO00o(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        num6 = num4;
                        str3 = str2;
                        z3 = z2;
                        color3 = color2;
                        f3 = f2;
                        num7 = num5;
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i16 != 0) {
                            num4 = null;
                        } else {
                            num4 = num;
                        }
                        if (i4 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i7 != 0) {
                            num3 = null;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(39);
                        }
                        if (i11 != 0) {
                            color2 = null;
                        } else {
                            color2 = color;
                        }
                        if (i13 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                        }
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        Alignment.Horizontal centerHorizontally17 = Alignment.INSTANCE.getCenterHorizontally();
                        int i1111115 = (i3 & 14) | 384;
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        int i1111116 = i1111115 >> 3;
                        MeasurePolicy measurePolicyColumnMeasurePolicy17 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally17, composerStartRestartGroup, (i1111116 & 112) | (i1111116 & 14));
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                        constructor = companion17.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifier2);
                        int i1111117 = ((((i1111115 << 3) & 112) << 9) & 7168) | 6;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = OooO.OooO00o(companion17, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy17, composerM1320constructorimpl, currentCompositionLocalMap17);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o((i1111117 >> 3) & 112, function3ModifierMaterializerOf17, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance17 = ColumnScopeInstance.INSTANCE;
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                        if (num4 != null) {
                            composerStartRestartGroup.startReplaceableGroup(859921197);
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            num5 = num3;
                            f2 = fM3775constructorimpl;
                            composerStartRestartGroup.startReplaceableGroup(859921493);
                            Intrinsics.checkNotNull(str2);
                            o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                        if (z2) {
                            composerStartRestartGroup.startReplaceableGroup(859921759);
                            o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(859921926);
                            composer2 = composerStartRestartGroup;
                            oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                            composer2.endReplaceableGroup();
                        }
                        if (OooO0o.OooO00o(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        num6 = num4;
                        str3 = str2;
                        z3 = z2;
                        color3 = color2;
                        f3 = f2;
                        num7 = num5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
                }
                i3 |= 196608;
                fM3775constructorimpl = f;
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(color)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                i13 = i2 & 128;
                if (i13 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i14 = 8388608;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i14;
                }
                if ((i3 & 23967451) == 4793490) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i4 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i7 != 0) {
                        num3 = null;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(39);
                    }
                    if (i11 != 0) {
                        color2 = null;
                    } else {
                        color2 = color;
                    }
                    if (i13 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    Alignment.Horizontal centerHorizontally18 = Alignment.INSTANCE.getCenterHorizontally();
                    int i1111118 = (i3 & 14) | 384;
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    int i1111119 = i1111118 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy18 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally18, composerStartRestartGroup, (i1111119 & 112) | (i1111119 & 14));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    constructor = companion18.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifier2);
                    int i11111110 = ((((i1111118 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion18, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy18, composerM1320constructorimpl, currentCompositionLocalMap18);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o((i11111110 >> 3) & 112, function3ModifierMaterializerOf18, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance18 = ColumnScopeInstance.INSTANCE;
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    if (num4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(859921197);
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(859921493);
                        Intrinsics.checkNotNull(str2);
                        o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    if (z2) {
                        composerStartRestartGroup.startReplaceableGroup(859921759);
                        o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(859921926);
                        composer2 = composerStartRestartGroup;
                        oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                        composer2.endReplaceableGroup();
                    }
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num6 = num4;
                    str3 = str2;
                    z3 = z2;
                    color3 = color2;
                    f3 = f2;
                    num7 = num5;
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i4 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i7 != 0) {
                        num3 = null;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(39);
                    }
                    if (i11 != 0) {
                        color2 = null;
                    } else {
                        color2 = color;
                    }
                    if (i13 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    Alignment.Horizontal centerHorizontally19 = Alignment.INSTANCE.getCenterHorizontally();
                    int i11111111 = (i3 & 14) | 384;
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    int i11111112 = i11111111 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy19 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally19, composerStartRestartGroup, (i11111112 & 112) | (i11111112 & 14));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    constructor = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifier2);
                    int i11111113 = ((((i11111111 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion19, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy19, composerM1320constructorimpl, currentCompositionLocalMap19);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o((i11111113 >> 3) & 112, function3ModifierMaterializerOf19, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance19 = ColumnScopeInstance.INSTANCE;
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    if (num4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(859921197);
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(859921493);
                        Intrinsics.checkNotNull(str2);
                        o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    if (z2) {
                        composerStartRestartGroup.startReplaceableGroup(859921759);
                        o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(859921926);
                        composer2 = composerStartRestartGroup;
                        oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                        composer2.endReplaceableGroup();
                    }
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num6 = num4;
                    str3 = str2;
                    z3 = z2;
                    color3 = color2;
                    f3 = f2;
                    num7 = num5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
            }
            i3 |= 24576;
            num3 = num2;
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((458752 & i) == 0) {
                    fM3775constructorimpl = f;
                    if (composerStartRestartGroup.changed(fM3775constructorimpl)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(color)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                i13 = i2 & 128;
                if (i13 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i14 = 8388608;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i14;
                }
                if ((i3 & 23967451) == 4793490) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i4 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i7 != 0) {
                        num3 = null;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(39);
                    }
                    if (i11 != 0) {
                        color2 = null;
                    } else {
                        color2 = color;
                    }
                    if (i13 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    Alignment.Horizontal centerHorizontally110 = Alignment.INSTANCE.getCenterHorizontally();
                    int i11111114 = (i3 & 14) | 384;
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    int i11111115 = i11111114 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy110 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally110, composerStartRestartGroup, (i11111115 & 112) | (i11111115 & 14));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                    constructor = companion110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifier2);
                    int i11111116 = ((((i11111114 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion110, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy110, composerM1320constructorimpl, currentCompositionLocalMap110);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o((i11111116 >> 3) & 112, function3ModifierMaterializerOf110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance110 = ColumnScopeInstance.INSTANCE;
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    if (num4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(859921197);
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(859921493);
                        Intrinsics.checkNotNull(str2);
                        o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    if (z2) {
                        composerStartRestartGroup.startReplaceableGroup(859921759);
                        o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(859921926);
                        composer2 = composerStartRestartGroup;
                        oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                        composer2.endReplaceableGroup();
                    }
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num6 = num4;
                    str3 = str2;
                    z3 = z2;
                    color3 = color2;
                    f3 = f2;
                    num7 = num5;
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i4 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i7 != 0) {
                        num3 = null;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(39);
                    }
                    if (i11 != 0) {
                        color2 = null;
                    } else {
                        color2 = color;
                    }
                    if (i13 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    Alignment.Horizontal centerHorizontally111 = Alignment.INSTANCE.getCenterHorizontally();
                    int i11111117 = (i3 & 14) | 384;
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    int i11111118 = i11111117 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy111 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally111, composerStartRestartGroup, (i11111118 & 112) | (i11111118 & 14));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    constructor = companion111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifier2);
                    int i11111119 = ((((i11111117 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion111, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy111, composerM1320constructorimpl, currentCompositionLocalMap111);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o((i11111119 >> 3) & 112, function3ModifierMaterializerOf111, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance111 = ColumnScopeInstance.INSTANCE;
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    if (num4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(859921197);
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(859921493);
                        Intrinsics.checkNotNull(str2);
                        o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    if (z2) {
                        composerStartRestartGroup.startReplaceableGroup(859921759);
                        o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(859921926);
                        composer2 = composerStartRestartGroup;
                        oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                        composer2.endReplaceableGroup();
                    }
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num6 = num4;
                    str3 = str2;
                    z3 = z2;
                    color3 = color2;
                    f3 = f2;
                    num7 = num5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
            }
            i3 |= 196608;
            fM3775constructorimpl = f;
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(color)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            i13 = i2 & 128;
            if (i13 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i14 = 8388608;
                } else {
                    i14 = Configuration.BLOCK_SIZE;
                }
                i3 |= i14;
            }
            if ((i3 & 23967451) == 4793490) {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num;
                }
                if (i4 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i7 != 0) {
                    num3 = null;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(39);
                }
                if (i11 != 0) {
                    color2 = null;
                } else {
                    color2 = color;
                }
                if (i13 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                }
                if (!TextUtils.isEmpty(str2)) {
                }
                Alignment.Horizontal centerHorizontally112 = Alignment.INSTANCE.getCenterHorizontally();
                int i111111110 = (i3 & 14) | 384;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                int i111111111 = i111111110 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy112 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally112, composerStartRestartGroup, (i111111111 & 112) | (i111111111 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                constructor = companion112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifier2);
                int i111111112 = ((((i111111110 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion112, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy112, composerM1320constructorimpl, currentCompositionLocalMap112);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o((i111111112 >> 3) & 112, function3ModifierMaterializerOf112, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance112 = ColumnScopeInstance.INSTANCE;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                if (num4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(859921197);
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    composerStartRestartGroup.startReplaceableGroup(859921493);
                    Intrinsics.checkNotNull(str2);
                    o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                if (z2) {
                    composerStartRestartGroup.startReplaceableGroup(859921759);
                    o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(859921926);
                    composer2 = composerStartRestartGroup;
                    oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                    composer2.endReplaceableGroup();
                }
                if (OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                num6 = num4;
                str3 = str2;
                z3 = z2;
                color3 = color2;
                f3 = f2;
                num7 = num5;
            } else {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num;
                }
                if (i4 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i7 != 0) {
                    num3 = null;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(39);
                }
                if (i11 != 0) {
                    color2 = null;
                } else {
                    color2 = color;
                }
                if (i13 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                }
                if (!TextUtils.isEmpty(str2)) {
                }
                Alignment.Horizontal centerHorizontally113 = Alignment.INSTANCE.getCenterHorizontally();
                int i111111113 = (i3 & 14) | 384;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                int i111111114 = i111111113 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy113 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally113, composerStartRestartGroup, (i111111114 & 112) | (i111111114 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                constructor = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifier2);
                int i111111115 = ((((i111111113 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion113, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy113, composerM1320constructorimpl, currentCompositionLocalMap113);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o((i111111115 >> 3) & 112, function3ModifierMaterializerOf113, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance113 = ColumnScopeInstance.INSTANCE;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                if (num4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(859921197);
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    composerStartRestartGroup.startReplaceableGroup(859921493);
                    Intrinsics.checkNotNull(str2);
                    o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                if (z2) {
                    composerStartRestartGroup.startReplaceableGroup(859921759);
                    o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(859921926);
                    composer2 = composerStartRestartGroup;
                    oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                    composer2.endReplaceableGroup();
                }
                if (OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                num6 = num4;
                str3 = str2;
                z3 = z2;
                color3 = color2;
                f3 = f2;
                num7 = num5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
        }
        i3 |= 384;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changed(text)) {
                i6 = 2048;
            } else {
                i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i3 |= i6;
        }
        i7 = i2 & 16;
        if (i7 != 0) {
            if ((57344 & i) == 0) {
                num3 = num2;
                if (composerStartRestartGroup.changed(num3)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((458752 & i) == 0) {
                    fM3775constructorimpl = f;
                    if (composerStartRestartGroup.changed(fM3775constructorimpl)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(color)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                i13 = i2 & 128;
                if (i13 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i14 = 8388608;
                    } else {
                        i14 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i14;
                }
                if ((i3 & 23967451) == 4793490) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i4 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i7 != 0) {
                        num3 = null;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(39);
                    }
                    if (i11 != 0) {
                        color2 = null;
                    } else {
                        color2 = color;
                    }
                    if (i13 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    Alignment.Horizontal centerHorizontally114 = Alignment.INSTANCE.getCenterHorizontally();
                    int i111111116 = (i3 & 14) | 384;
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    int i111111117 = i111111116 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy114 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally114, composerStartRestartGroup, (i111111117 & 112) | (i111111117 & 14));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                    constructor = companion114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifier2);
                    int i111111118 = ((((i111111116 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion114, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy114, composerM1320constructorimpl, currentCompositionLocalMap114);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o((i111111118 >> 3) & 112, function3ModifierMaterializerOf114, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance114 = ColumnScopeInstance.INSTANCE;
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    if (num4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(859921197);
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(859921493);
                        Intrinsics.checkNotNull(str2);
                        o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    if (z2) {
                        composerStartRestartGroup.startReplaceableGroup(859921759);
                        o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(859921926);
                        composer2 = composerStartRestartGroup;
                        oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                        composer2.endReplaceableGroup();
                    }
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num6 = num4;
                    str3 = str2;
                    z3 = z2;
                    color3 = color2;
                    f3 = f2;
                    num7 = num5;
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num;
                    }
                    if (i4 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i7 != 0) {
                        num3 = null;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(39);
                    }
                    if (i11 != 0) {
                        color2 = null;
                    } else {
                        color2 = color;
                    }
                    if (i13 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                    }
                    if (!TextUtils.isEmpty(str2)) {
                    }
                    Alignment.Horizontal centerHorizontally115 = Alignment.INSTANCE.getCenterHorizontally();
                    int i111111119 = (i3 & 14) | 384;
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    int i1111111110 = i111111119 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy115 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally115, composerStartRestartGroup, (i1111111110 & 112) | (i1111111110 & 14));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                    constructor = companion115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifier2);
                    int i1111111111 = ((((i111111119 << 3) & 112) << 9) & 7168) | 6;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = OooO.OooO00o(companion115, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy115, composerM1320constructorimpl, currentCompositionLocalMap115);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o((i1111111111 >> 3) & 112, function3ModifierMaterializerOf115, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance115 = ColumnScopeInstance.INSTANCE;
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    if (num4 != null) {
                        composerStartRestartGroup.startReplaceableGroup(859921197);
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        num5 = num3;
                        f2 = fM3775constructorimpl;
                        composerStartRestartGroup.startReplaceableGroup(859921493);
                        Intrinsics.checkNotNull(str2);
                        o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    if (z2) {
                        composerStartRestartGroup.startReplaceableGroup(859921759);
                        o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(859921926);
                        composer2 = composerStartRestartGroup;
                        oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                        composer2.endReplaceableGroup();
                    }
                    if (OooO0o.OooO00o(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num6 = num4;
                    str3 = str2;
                    z3 = z2;
                    color3 = color2;
                    f3 = f2;
                    num7 = num5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
            }
            i3 |= 196608;
            fM3775constructorimpl = f;
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(color)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            i13 = i2 & 128;
            if (i13 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i14 = 8388608;
                } else {
                    i14 = Configuration.BLOCK_SIZE;
                }
                i3 |= i14;
            }
            if ((i3 & 23967451) == 4793490) {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num;
                }
                if (i4 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i7 != 0) {
                    num3 = null;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(39);
                }
                if (i11 != 0) {
                    color2 = null;
                } else {
                    color2 = color;
                }
                if (i13 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                }
                if (!TextUtils.isEmpty(str2)) {
                }
                Alignment.Horizontal centerHorizontally116 = Alignment.INSTANCE.getCenterHorizontally();
                int i1111111112 = (i3 & 14) | 384;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                int i1111111113 = i1111111112 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy116 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally116, composerStartRestartGroup, (i1111111113 & 112) | (i1111111113 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                constructor = companion116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifier2);
                int i1111111114 = ((((i1111111112 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion116, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy116, composerM1320constructorimpl, currentCompositionLocalMap116);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o((i1111111114 >> 3) & 112, function3ModifierMaterializerOf116, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance116 = ColumnScopeInstance.INSTANCE;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                if (num4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(859921197);
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    composerStartRestartGroup.startReplaceableGroup(859921493);
                    Intrinsics.checkNotNull(str2);
                    o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                if (z2) {
                    composerStartRestartGroup.startReplaceableGroup(859921759);
                    o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(859921926);
                    composer2 = composerStartRestartGroup;
                    oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                    composer2.endReplaceableGroup();
                }
                if (OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                num6 = num4;
                str3 = str2;
                z3 = z2;
                color3 = color2;
                f3 = f2;
                num7 = num5;
            } else {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num;
                }
                if (i4 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i7 != 0) {
                    num3 = null;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(39);
                }
                if (i11 != 0) {
                    color2 = null;
                } else {
                    color2 = color;
                }
                if (i13 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                }
                if (!TextUtils.isEmpty(str2)) {
                }
                Alignment.Horizontal centerHorizontally117 = Alignment.INSTANCE.getCenterHorizontally();
                int i1111111115 = (i3 & 14) | 384;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                int i1111111116 = i1111111115 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy117 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally117, composerStartRestartGroup, (i1111111116 & 112) | (i1111111116 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                constructor = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifier2);
                int i1111111117 = ((((i1111111115 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion117, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy117, composerM1320constructorimpl, currentCompositionLocalMap117);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o((i1111111117 >> 3) & 112, function3ModifierMaterializerOf117, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance117 = ColumnScopeInstance.INSTANCE;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                if (num4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(859921197);
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    composerStartRestartGroup.startReplaceableGroup(859921493);
                    Intrinsics.checkNotNull(str2);
                    o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                if (z2) {
                    composerStartRestartGroup.startReplaceableGroup(859921759);
                    o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(859921926);
                    composer2 = composerStartRestartGroup;
                    oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                    composer2.endReplaceableGroup();
                }
                if (OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                num6 = num4;
                str3 = str2;
                z3 = z2;
                color3 = color2;
                f3 = f2;
                num7 = num5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
        }
        i3 |= 24576;
        num3 = num2;
        i9 = i2 & 32;
        if (i9 != 0) {
            if ((458752 & i) == 0) {
                fM3775constructorimpl = f;
                if (composerStartRestartGroup.changed(fM3775constructorimpl)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(color)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            i13 = i2 & 128;
            if (i13 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i14 = 8388608;
                } else {
                    i14 = Configuration.BLOCK_SIZE;
                }
                i3 |= i14;
            }
            if ((i3 & 23967451) == 4793490) {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num;
                }
                if (i4 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i7 != 0) {
                    num3 = null;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(39);
                }
                if (i11 != 0) {
                    color2 = null;
                } else {
                    color2 = color;
                }
                if (i13 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                }
                if (!TextUtils.isEmpty(str2)) {
                }
                Alignment.Horizontal centerHorizontally118 = Alignment.INSTANCE.getCenterHorizontally();
                int i1111111118 = (i3 & 14) | 384;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                int i1111111119 = i1111111118 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy118 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally118, composerStartRestartGroup, (i1111111119 & 112) | (i1111111119 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                constructor = companion118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifier2);
                int i11111111110 = ((((i1111111118 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion118, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy118, composerM1320constructorimpl, currentCompositionLocalMap118);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o((i11111111110 >> 3) & 112, function3ModifierMaterializerOf118, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance118 = ColumnScopeInstance.INSTANCE;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                if (num4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(859921197);
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    composerStartRestartGroup.startReplaceableGroup(859921493);
                    Intrinsics.checkNotNull(str2);
                    o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                if (z2) {
                    composerStartRestartGroup.startReplaceableGroup(859921759);
                    o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(859921926);
                    composer2 = composerStartRestartGroup;
                    oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                    composer2.endReplaceableGroup();
                }
                if (OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                num6 = num4;
                str3 = str2;
                z3 = z2;
                color3 = color2;
                f3 = f2;
                num7 = num5;
            } else {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num;
                }
                if (i4 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i7 != 0) {
                    num3 = null;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(39);
                }
                if (i11 != 0) {
                    color2 = null;
                } else {
                    color2 = color;
                }
                if (i13 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
                }
                if (!TextUtils.isEmpty(str2)) {
                }
                Alignment.Horizontal centerHorizontally119 = Alignment.INSTANCE.getCenterHorizontally();
                int i11111111111 = (i3 & 14) | 384;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                int i11111111112 = i11111111111 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy119 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally119, composerStartRestartGroup, (i11111111112 & 112) | (i11111111112 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                constructor = companion119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifier2);
                int i11111111113 = ((((i11111111111 << 3) & 112) << 9) & 7168) | 6;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = OooO.OooO00o(companion119, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy119, composerM1320constructorimpl, currentCompositionLocalMap119);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o((i11111111113 >> 3) & 112, function3ModifierMaterializerOf119, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance119 = ColumnScopeInstance.INSTANCE;
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                if (num4 != null) {
                    composerStartRestartGroup.startReplaceableGroup(859921197);
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    num5 = num3;
                    f2 = fM3775constructorimpl;
                    composerStartRestartGroup.startReplaceableGroup(859921493);
                    Intrinsics.checkNotNull(str2);
                    o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                if (z2) {
                    composerStartRestartGroup.startReplaceableGroup(859921759);
                    o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(859921926);
                    composer2 = composerStartRestartGroup;
                    oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                    composer2.endReplaceableGroup();
                }
                if (OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                num6 = num4;
                str3 = str2;
                z3 = z2;
                color3 = color2;
                f3 = f2;
                num7 = num5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
        }
        i3 |= 196608;
        fM3775constructorimpl = f;
        i11 = i2 & 64;
        if (i11 != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (composerStartRestartGroup.changed(color)) {
                i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i12 = 524288;
            }
            i3 |= i12;
        }
        i13 = i2 & 128;
        if (i13 != 0) {
            i3 |= 12582912;
        } else if ((i & 29360128) == 0) {
            if (composerStartRestartGroup.changed(z)) {
                i14 = 8388608;
            } else {
                i14 = Configuration.BLOCK_SIZE;
            }
            i3 |= i14;
        }
        if ((i3 & 23967451) == 4793490) {
            if (i15 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i16 != 0) {
                num4 = null;
            } else {
                num4 = num;
            }
            if (i4 != 0) {
                str2 = null;
            } else {
                str2 = str;
            }
            if (i7 != 0) {
                num3 = null;
            }
            if (i9 != 0) {
                fM3775constructorimpl = Dp.m3775constructorimpl(39);
            }
            if (i11 != 0) {
                color2 = null;
            } else {
                color2 = color;
            }
            if (i13 != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
            }
            if (!TextUtils.isEmpty(str2)) {
            }
            Alignment.Horizontal centerHorizontally1110 = Alignment.INSTANCE.getCenterHorizontally();
            int i11111111114 = (i3 & 14) | 384;
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            int i11111111115 = i11111111114 >> 3;
            MeasurePolicy measurePolicyColumnMeasurePolicy1110 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally1110, composerStartRestartGroup, (i11111111115 & 112) | (i11111111115 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
            constructor = companion1110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifier2);
            int i11111111116 = ((((i11111111114 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = OooO.OooO00o(companion1110, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy1110, composerM1320constructorimpl, currentCompositionLocalMap1110);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o((i11111111116 >> 3) & 112, function3ModifierMaterializerOf1110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance1110 = ColumnScopeInstance.INSTANCE;
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
            if (num4 != null) {
                composerStartRestartGroup.startReplaceableGroup(859921197);
                num5 = num3;
                f2 = fM3775constructorimpl;
                ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                num5 = num3;
                f2 = fM3775constructorimpl;
                composerStartRestartGroup.startReplaceableGroup(859921493);
                Intrinsics.checkNotNull(str2);
                o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                composerStartRestartGroup.endReplaceableGroup();
            }
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
            if (z2) {
                composerStartRestartGroup.startReplaceableGroup(859921759);
                o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(859921926);
                composer2 = composerStartRestartGroup;
                oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                composer2.endReplaceableGroup();
            }
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            num6 = num4;
            str3 = str2;
            z3 = z2;
            color3 = color2;
            f3 = f2;
            num7 = num5;
        } else {
            if (i15 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i16 != 0) {
                num4 = null;
            } else {
                num4 = num;
            }
            if (i4 != 0) {
                str2 = null;
            } else {
                str2 = str;
            }
            if (i7 != 0) {
                num3 = null;
            }
            if (i9 != 0) {
                fM3775constructorimpl = Dp.m3775constructorimpl(39);
            }
            if (i11 != 0) {
                color2 = null;
            } else {
                color2 = color;
            }
            if (i13 != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1240117667, i3, -1, "com.yalla.yalla.ui.composable.common.RoomImageWithDotViewCompose (RoomImageDotViewCompose.kt:37)");
            }
            if (!TextUtils.isEmpty(str2)) {
            }
            Alignment.Horizontal centerHorizontally1111 = Alignment.INSTANCE.getCenterHorizontally();
            int i11111111117 = (i3 & 14) | 384;
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            int i11111111118 = i11111111117 >> 3;
            MeasurePolicy measurePolicyColumnMeasurePolicy1111 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally1111, composerStartRestartGroup, (i11111111118 & 112) | (i11111111118 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            constructor = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111 = LayoutKt.modifierMaterializerOf(modifier2);
            int i11111111119 = ((((i11111111117 << 3) & 112) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = OooO.OooO00o(companion1111, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy1111, composerM1320constructorimpl, currentCompositionLocalMap1111);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o((i11111111119 >> 3) & 112, function3ModifierMaterializerOf1111, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance1111 = ColumnScopeInstance.INSTANCE;
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
            if (num4 != null) {
                composerStartRestartGroup.startReplaceableGroup(859921197);
                num5 = num3;
                f2 = fM3775constructorimpl;
                ImageKt.Image(PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i3 >> 3) & 14), (String) null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, fM3775constructorimpl), num3, color2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                num5 = num3;
                f2 = fM3775constructorimpl;
                composerStartRestartGroup.startReplaceableGroup(859921493);
                Intrinsics.checkNotNull(str2);
                o00OO00O.OooO00o(str2, true, 0, null, null, OooO0O0(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, f2), num5, color2), composerStartRestartGroup, 48, 28);
                composerStartRestartGroup.endReplaceableGroup();
            }
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(4), null, composerStartRestartGroup, 6, 2);
            if (z2) {
                composerStartRestartGroup.startReplaceableGroup(859921759);
                o00O0O0.OooO00o(text, o0OOo000.f48147OooOOOO, TextUnitKt.getSp(10), null, false, composerStartRestartGroup, ((i3 >> 9) & 14) | 384, 24);
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(859921926);
                composer2 = composerStartRestartGroup;
                oo000000.OooO00o(text, new w(TextUnitKt.getSp(7), TextUnitKt.getSp(10)), null, o0OOo000.f48147OooOOOO, null, null, null, 0L, null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 1, null, composer2, (i3 >> 9) & 14, 3072, 24052);
                composer2.endReplaceableGroup();
            }
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            num6 = num4;
            str3 = str2;
            z3 = z2;
            color3 = color2;
            f3 = f2;
            num7 = num5;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(modifier3, num6, str3, text, num7, f3, color3, z3, i, i2));
    }

    public static final Modifier OooO0O0(Modifier modifier, Integer num, Color color) {
        return o0000Ooo.OooO0O0(modifier, num, Dp.m3775constructorimpl(8), true, false, color != null ? color.m1691unboximpl() : ColorKt.Color(4293415249L), Dp.m3775constructorimpl((float) 2.5d), Dp.m3775constructorimpl((float) (-3.5d)), Dp.m3775constructorimpl(2), 13896);
    }
}
