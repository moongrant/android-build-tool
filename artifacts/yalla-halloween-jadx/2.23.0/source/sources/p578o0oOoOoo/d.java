package p578o0oOoOoo;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0000O;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p158o00OoOOO.OooOOO0;
import p450o0Ooo00.OooOO0;
import p468o0OoooO0.o0OO0O0;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMusicEditDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicEditDialog.kt\ncom/yalla/yalla/module/media/dialog/MusicEditDialogKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,330:1\n25#2:331\n36#2:338\n25#2:345\n50#2:352\n49#2:353\n1097#3,6:332\n1097#3,6:339\n1097#3,6:346\n1097#3,6:354\n154#4:360\n*S KotlinDebug\n*F\n+ 1 MusicEditDialog.kt\ncom/yalla/yalla/module/media/dialog/MusicEditDialogKt\n*L\n86#1:331\n90#1:338\n95#1:345\n100#1:352\n100#1:353\n86#1:332,6\n90#1:339,6\n95#1:346,6\n100#1:354,6\n324#1:360\n*E\n"})
public final class d {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @NotNull
    public static final Function0 OooO00o(@NotNull MutableState showDialog, @NotNull String musicName, long j, long j2, @NotNull Function1 onStartPlay, @Nullable Function1 function1, @Nullable Function1 function2, @Nullable Function1 function3, @Nullable Function1 function4, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(showDialog, "showDialog");
        Intrinsics.checkNotNullParameter(musicName, "musicName");
        Intrinsics.checkNotNullParameter(onStartPlay, "onStartPlay");
        composer.startReplaceableGroup(1328649818);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1328649818, i, -1, "com.yalla.yalla.module.media.dialog.AddMusicEditDialog (MusicEditDialog.kt:73)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(mutableIntState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new oOOo0000(mutableIntState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        Function0 function0 = (Function0) objRememberedValue2;
        o0OO0O0.OooO00o("_MusicEditDialog", "startPosition  " + j2);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue3;
        int i2 = OooOO0.WindowAnimBottomWithAlpha;
        composer.startReplaceableGroup(511388516);
        boolean zChanged2 = composer.changed(function2) | composer.changed(mutableFloatState);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new oOOO00o0(function2, mutableFloatState);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceableGroup();
        OooOOO0.OooO00o(showDialog, false, false, null, (Function0) objRememberedValue4, 80, i2, 0.0f, ComposableLambdaKt.composableLambda(composer, 1207456140, true, new oOOOOo0O(i, j2, j, mutableFloatState, mutableIntState, showDialog, musicName, onStartPlay, null, function1, function3, function4)), composer, (i & 14) | 100663296, 142);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0121  */
    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:104:0x0126  */
    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:107:0x012b  */
    /* JADX WARN: Code duplicated, block: B:110:0x012f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0137  */
    /* JADX WARN: Code duplicated, block: B:116:0x017c  */
    /* JADX WARN: Code duplicated, block: B:121:0x018c  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:96:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c  */
    public static final void OooO0O0(Modifier modifier, long j, float f, MutableState mutableState, MutableState mutableState2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Composer composer, int i, int i2) {
        int i3;
        int i4;
        MutableState mutableState3;
        int i5;
        int i6;
        int i7;
        int i8;
        Function1 function5;
        int i9;
        int i10;
        Function1 function6;
        int i11;
        int i12;
        int i13;
        Modifier modifier2;
        Function1 function7;
        Function1 function8;
        Modifier modifier3;
        Function1 function9;
        MutableState mutableState4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(911507091);
        int i14 = i2 & 1;
        if (i14 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 4) == 0) {
            if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changed(f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    mutableState3 = mutableState;
                    if (composerStartRestartGroup.changed(mutableState3)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    if ((57344 & i) == 0) {
                        if (composerStartRestartGroup.changed(mutableState2)) {
                            i6 = 16384;
                        } else {
                            i6 = 8192;
                        }
                        i3 |= i6;
                    }
                    if ((i2 & 32) != 0) {
                        if ((458752 & i) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i7 = 131072;
                            } else {
                                i7 = 65536;
                            }
                            i3 |= i7;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            if ((3670016 & i) == 0) {
                                function5 = function2;
                                if (composerStartRestartGroup.changedInstance(function5)) {
                                    i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                                } else {
                                    i9 = 524288;
                                }
                                i3 |= i9;
                            }
                            i10 = i2 & 128;
                            if (i10 != 0) {
                                if ((29360128 & i) == 0) {
                                    function6 = function3;
                                    if (composerStartRestartGroup.changedInstance(function6)) {
                                        i11 = 8388608;
                                    } else {
                                        i11 = Configuration.BLOCK_SIZE;
                                    }
                                    i3 |= i11;
                                }
                                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                if (i12 != 0) {
                                    i3 |= 100663296;
                                } else if ((i & 234881024) == 0) {
                                    if (composerStartRestartGroup.changedInstance(function4)) {
                                        i13 = 67108864;
                                    } else {
                                        i13 = 33554432;
                                    }
                                    i3 |= i13;
                                }
                                if ((i3 & 191739531) == 38347906 || !composerStartRestartGroup.getSkipping()) {
                                    if (i14 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    } else {
                                        modifier2 = modifier;
                                    }
                                    if (i4 != 0) {
                                        mutableState3 = null;
                                    }
                                    if (i8 != 0) {
                                        function7 = null;
                                    } else {
                                        function7 = function5;
                                    }
                                    if (i10 != 0) {
                                        function8 = null;
                                    } else {
                                        function8 = function6;
                                    }
                                    Function1 function10 = i12 == 0 ? function4 : null;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                                    }
                                    Modifier modifier4 = modifier2;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    function9 = function10;
                                    function5 = function7;
                                    function6 = function8;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                    function9 = function4;
                                }
                                mutableState4 = mutableState3;
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                    return;
                                }
                                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                            }
                            i3 |= 12582912;
                            function6 = function3;
                            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            if (i12 != 0) {
                                i3 |= 100663296;
                            } else if ((i & 234881024) == 0) {
                                if (composerStartRestartGroup.changedInstance(function4)) {
                                    i13 = 67108864;
                                } else {
                                    i13 = 33554432;
                                }
                                i3 |= i13;
                            }
                            if ((i3 & 191739531) == 38347906) {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i4 != 0) {
                                    mutableState3 = null;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function5;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function6;
                                }
                                if (i12 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                                }
                                Modifier modifier5 = modifier2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier5;
                                function9 = function10;
                                function5 = function7;
                                function6 = function8;
                            } else {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i4 != 0) {
                                    mutableState3 = null;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function5;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function6;
                                }
                                if (i12 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                                }
                                Modifier modifier6 = modifier2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier6;
                                function9 = function10;
                                function5 = function7;
                                function6 = function8;
                            }
                            mutableState4 = mutableState3;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                        }
                        i3 |= 1572864;
                        function5 = function2;
                        i10 = i2 & 128;
                        if (i10 != 0) {
                            if ((29360128 & i) == 0) {
                                function6 = function3;
                                if (composerStartRestartGroup.changedInstance(function6)) {
                                    i11 = 8388608;
                                } else {
                                    i11 = Configuration.BLOCK_SIZE;
                                }
                                i3 |= i11;
                            }
                            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            if (i12 != 0) {
                                i3 |= 100663296;
                            } else if ((i & 234881024) == 0) {
                                if (composerStartRestartGroup.changedInstance(function4)) {
                                    i13 = 67108864;
                                } else {
                                    i13 = 33554432;
                                }
                                i3 |= i13;
                            }
                            if ((i3 & 191739531) == 38347906) {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i4 != 0) {
                                    mutableState3 = null;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function5;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function6;
                                }
                                if (i12 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                                }
                                Modifier modifier7 = modifier2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier7;
                                function9 = function10;
                                function5 = function7;
                                function6 = function8;
                            } else {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i4 != 0) {
                                    mutableState3 = null;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function5;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function6;
                                }
                                if (i12 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                                }
                                Modifier modifier8 = modifier2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier8;
                                function9 = function10;
                                function5 = function7;
                                function6 = function8;
                            }
                            mutableState4 = mutableState3;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                        }
                        i3 |= 12582912;
                        function6 = function3;
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 191739531) == 38347906) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier9 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier9;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier10 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier10;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        }
                        mutableState4 = mutableState3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                    }
                    i3 |= 196608;
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((3670016 & i) == 0) {
                            function5 = function2;
                            if (composerStartRestartGroup.changedInstance(function5)) {
                                i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 128;
                        if (i10 != 0) {
                            if ((29360128 & i) == 0) {
                                function6 = function3;
                                if (composerStartRestartGroup.changedInstance(function6)) {
                                    i11 = 8388608;
                                } else {
                                    i11 = Configuration.BLOCK_SIZE;
                                }
                                i3 |= i11;
                            }
                            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            if (i12 != 0) {
                                i3 |= 100663296;
                            } else if ((i & 234881024) == 0) {
                                if (composerStartRestartGroup.changedInstance(function4)) {
                                    i13 = 67108864;
                                } else {
                                    i13 = 33554432;
                                }
                                i3 |= i13;
                            }
                            if ((i3 & 191739531) == 38347906) {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i4 != 0) {
                                    mutableState3 = null;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function5;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function6;
                                }
                                if (i12 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                                }
                                Modifier modifier11 = modifier2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier11;
                                function9 = function10;
                                function5 = function7;
                                function6 = function8;
                            } else {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i4 != 0) {
                                    mutableState3 = null;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function5;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function6;
                                }
                                if (i12 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                                }
                                Modifier modifier12 = modifier2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier12;
                                function9 = function10;
                                function5 = function7;
                                function6 = function8;
                            }
                            mutableState4 = mutableState3;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                        }
                        i3 |= 12582912;
                        function6 = function3;
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 191739531) == 38347906) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier13 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier13;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier14 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier14;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        }
                        mutableState4 = mutableState3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                    }
                    i3 |= 1572864;
                    function5 = function2;
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((29360128 & i) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i11 = 8388608;
                            } else {
                                i11 = Configuration.BLOCK_SIZE;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 191739531) == 38347906) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier15 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier15;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier16 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier16;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        }
                        mutableState4 = mutableState3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                    }
                    i3 |= 12582912;
                    function6 = function3;
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier17 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier17;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier18 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier18;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 24576;
                if ((i2 & 32) != 0) {
                    if ((458752 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((3670016 & i) == 0) {
                            function5 = function2;
                            if (composerStartRestartGroup.changedInstance(function5)) {
                                i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 128;
                        if (i10 != 0) {
                            if ((29360128 & i) == 0) {
                                function6 = function3;
                                if (composerStartRestartGroup.changedInstance(function6)) {
                                    i11 = 8388608;
                                } else {
                                    i11 = Configuration.BLOCK_SIZE;
                                }
                                i3 |= i11;
                            }
                            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            if (i12 != 0) {
                                i3 |= 100663296;
                            } else if ((i & 234881024) == 0) {
                                if (composerStartRestartGroup.changedInstance(function4)) {
                                    i13 = 67108864;
                                } else {
                                    i13 = 33554432;
                                }
                                i3 |= i13;
                            }
                            if ((i3 & 191739531) == 38347906) {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i4 != 0) {
                                    mutableState3 = null;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function5;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function6;
                                }
                                if (i12 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                                }
                                Modifier modifier19 = modifier2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier19;
                                function9 = function10;
                                function5 = function7;
                                function6 = function8;
                            } else {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i4 != 0) {
                                    mutableState3 = null;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function5;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function6;
                                }
                                if (i12 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                                }
                                Modifier modifier110 = modifier2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier110;
                                function9 = function10;
                                function5 = function7;
                                function6 = function8;
                            }
                            mutableState4 = mutableState3;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                        }
                        i3 |= 12582912;
                        function6 = function3;
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 191739531) == 38347906) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier111 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier111;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier112 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier112;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        }
                        mutableState4 = mutableState3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                    }
                    i3 |= 1572864;
                    function5 = function2;
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((29360128 & i) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i11 = 8388608;
                            } else {
                                i11 = Configuration.BLOCK_SIZE;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 191739531) == 38347906) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier113 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier113;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier114 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier114;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        }
                        mutableState4 = mutableState3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                    }
                    i3 |= 12582912;
                    function6 = function3;
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier115 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier115;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier116 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier116;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 196608;
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((3670016 & i) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((29360128 & i) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i11 = 8388608;
                            } else {
                                i11 = Configuration.BLOCK_SIZE;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 191739531) == 38347906) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier117 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier117;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier118 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier118;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        }
                        mutableState4 = mutableState3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                    }
                    i3 |= 12582912;
                    function6 = function3;
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier119 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier119;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier1110 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier1110;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 1572864;
                function5 = function2;
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((29360128 & i) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier1111 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier1111;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier1112 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier1112;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 12582912;
                function6 = function3;
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i3 & 191739531) == 38347906) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier1113 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1113;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier1114 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1114;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                }
                mutableState4 = mutableState3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
            }
            i3 |= 3072;
            mutableState3 = mutableState;
            if ((i2 & 16) != 0) {
                if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changed(mutableState2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((i2 & 32) != 0) {
                    if ((458752 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((3670016 & i) == 0) {
                            function5 = function2;
                            if (composerStartRestartGroup.changedInstance(function5)) {
                                i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 128;
                        if (i10 != 0) {
                            if ((29360128 & i) == 0) {
                                function6 = function3;
                                if (composerStartRestartGroup.changedInstance(function6)) {
                                    i11 = 8388608;
                                } else {
                                    i11 = Configuration.BLOCK_SIZE;
                                }
                                i3 |= i11;
                            }
                            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            if (i12 != 0) {
                                i3 |= 100663296;
                            } else if ((i & 234881024) == 0) {
                                if (composerStartRestartGroup.changedInstance(function4)) {
                                    i13 = 67108864;
                                } else {
                                    i13 = 33554432;
                                }
                                i3 |= i13;
                            }
                            if ((i3 & 191739531) == 38347906) {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i4 != 0) {
                                    mutableState3 = null;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function5;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function6;
                                }
                                if (i12 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                                }
                                Modifier modifier1115 = modifier2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier1115;
                                function9 = function10;
                                function5 = function7;
                                function6 = function8;
                            } else {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i4 != 0) {
                                    mutableState3 = null;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function5;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function6;
                                }
                                if (i12 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                                }
                                Modifier modifier1116 = modifier2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier1116;
                                function9 = function10;
                                function5 = function7;
                                function6 = function8;
                            }
                            mutableState4 = mutableState3;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                        }
                        i3 |= 12582912;
                        function6 = function3;
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 191739531) == 38347906) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier1117 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier1117;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier1118 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier1118;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        }
                        mutableState4 = mutableState3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                    }
                    i3 |= 1572864;
                    function5 = function2;
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((29360128 & i) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i11 = 8388608;
                            } else {
                                i11 = Configuration.BLOCK_SIZE;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 191739531) == 38347906) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier1119 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier1119;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier11110 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier11110;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        }
                        mutableState4 = mutableState3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                    }
                    i3 |= 12582912;
                    function6 = function3;
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11111 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11111;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11112 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11112;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 196608;
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((3670016 & i) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((29360128 & i) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i11 = 8388608;
                            } else {
                                i11 = Configuration.BLOCK_SIZE;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 191739531) == 38347906) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier11113 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier11113;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier11114 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier11114;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        }
                        mutableState4 = mutableState3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                    }
                    i3 |= 12582912;
                    function6 = function3;
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11115 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11115;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11116 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11116;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 1572864;
                function5 = function2;
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((29360128 & i) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11117 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11117;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11118 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11118;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 12582912;
                function6 = function3;
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i3 & 191739531) == 38347906) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier11119 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11119;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier111110 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111110;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                }
                mutableState4 = mutableState3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
            }
            i3 |= 24576;
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((3670016 & i) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((29360128 & i) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i11 = 8388608;
                            } else {
                                i11 = Configuration.BLOCK_SIZE;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 191739531) == 38347906) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier111111 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier111111;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier111112 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier111112;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        }
                        mutableState4 = mutableState3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                    }
                    i3 |= 12582912;
                    function6 = function3;
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier111113 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111113;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier111114 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111114;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 1572864;
                function5 = function2;
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((29360128 & i) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier111115 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111115;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier111116 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111116;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 12582912;
                function6 = function3;
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i3 & 191739531) == 38347906) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier111117 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111117;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier111118 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111118;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                }
                mutableState4 = mutableState3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
            }
            i3 |= 196608;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((3670016 & i) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((29360128 & i) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier111119 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111119;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier1111110 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier1111110;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 12582912;
                function6 = function3;
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i3 & 191739531) == 38347906) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier1111111 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111111;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier1111112 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111112;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                }
                mutableState4 = mutableState3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
            }
            i3 |= 1572864;
            function5 = function2;
            i10 = i2 & 128;
            if (i10 != 0) {
                if ((29360128 & i) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i11;
                }
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i3 & 191739531) == 38347906) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier1111113 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111113;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier1111114 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111114;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                }
                mutableState4 = mutableState3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
            }
            i3 |= 12582912;
            function6 = function3;
            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i12 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            }
            if ((i3 & 191739531) == 38347906) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    mutableState3 = null;
                }
                if (i8 != 0) {
                    function7 = null;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i12 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                }
                Modifier modifier1111115 = modifier2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111115;
                function9 = function10;
                function5 = function7;
                function6 = function8;
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    mutableState3 = null;
                }
                if (i8 != 0) {
                    function7 = null;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i12 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                }
                Modifier modifier1111116 = modifier2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111116;
                function9 = function10;
                function5 = function7;
                function6 = function8;
            }
            mutableState4 = mutableState3;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
        }
        i3 |= 384;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                mutableState3 = mutableState;
                if (composerStartRestartGroup.changed(mutableState3)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                if ((57344 & i) == 0) {
                    if (composerStartRestartGroup.changed(mutableState2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((i2 & 32) != 0) {
                    if ((458752 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((3670016 & i) == 0) {
                            function5 = function2;
                            if (composerStartRestartGroup.changedInstance(function5)) {
                                i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 128;
                        if (i10 != 0) {
                            if ((29360128 & i) == 0) {
                                function6 = function3;
                                if (composerStartRestartGroup.changedInstance(function6)) {
                                    i11 = 8388608;
                                } else {
                                    i11 = Configuration.BLOCK_SIZE;
                                }
                                i3 |= i11;
                            }
                            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            if (i12 != 0) {
                                i3 |= 100663296;
                            } else if ((i & 234881024) == 0) {
                                if (composerStartRestartGroup.changedInstance(function4)) {
                                    i13 = 67108864;
                                } else {
                                    i13 = 33554432;
                                }
                                i3 |= i13;
                            }
                            if ((i3 & 191739531) == 38347906) {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i4 != 0) {
                                    mutableState3 = null;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function5;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function6;
                                }
                                if (i12 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                                }
                                Modifier modifier1111117 = modifier2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier1111117;
                                function9 = function10;
                                function5 = function7;
                                function6 = function8;
                            } else {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i4 != 0) {
                                    mutableState3 = null;
                                }
                                if (i8 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function5;
                                }
                                if (i10 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function6;
                                }
                                if (i12 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                                }
                                Modifier modifier1111118 = modifier2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier1111118;
                                function9 = function10;
                                function5 = function7;
                                function6 = function8;
                            }
                            mutableState4 = mutableState3;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                        }
                        i3 |= 12582912;
                        function6 = function3;
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 191739531) == 38347906) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier1111119 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier1111119;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier11111110 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier11111110;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        }
                        mutableState4 = mutableState3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                    }
                    i3 |= 1572864;
                    function5 = function2;
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((29360128 & i) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i11 = 8388608;
                            } else {
                                i11 = Configuration.BLOCK_SIZE;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 191739531) == 38347906) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier11111111 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier11111111;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier11111112 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier11111112;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        }
                        mutableState4 = mutableState3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                    }
                    i3 |= 12582912;
                    function6 = function3;
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11111113 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11111113;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11111114 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11111114;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 196608;
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((3670016 & i) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((29360128 & i) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i11 = 8388608;
                            } else {
                                i11 = Configuration.BLOCK_SIZE;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 191739531) == 38347906) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier11111115 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier11111115;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier11111116 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier11111116;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        }
                        mutableState4 = mutableState3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                    }
                    i3 |= 12582912;
                    function6 = function3;
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11111117 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11111117;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11111118 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11111118;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 1572864;
                function5 = function2;
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((29360128 & i) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11111119 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11111119;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier111111110 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111111110;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 12582912;
                function6 = function3;
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i3 & 191739531) == 38347906) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier111111111 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111111111;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier111111112 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111111112;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                }
                mutableState4 = mutableState3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
            }
            i3 |= 24576;
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((3670016 & i) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((29360128 & i) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i11 = 8388608;
                            } else {
                                i11 = Configuration.BLOCK_SIZE;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 191739531) == 38347906) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier111111113 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier111111113;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier111111114 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier111111114;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        }
                        mutableState4 = mutableState3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                    }
                    i3 |= 12582912;
                    function6 = function3;
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier111111115 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111111115;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier111111116 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111111116;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 1572864;
                function5 = function2;
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((29360128 & i) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier111111117 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111111117;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier111111118 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111111118;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 12582912;
                function6 = function3;
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i3 & 191739531) == 38347906) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier111111119 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111111119;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier1111111110 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111111110;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                }
                mutableState4 = mutableState3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
            }
            i3 |= 196608;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((3670016 & i) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((29360128 & i) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier1111111111 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier1111111111;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier1111111112 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier1111111112;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 12582912;
                function6 = function3;
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i3 & 191739531) == 38347906) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier1111111113 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111111113;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier1111111114 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111111114;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                }
                mutableState4 = mutableState3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
            }
            i3 |= 1572864;
            function5 = function2;
            i10 = i2 & 128;
            if (i10 != 0) {
                if ((29360128 & i) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i11;
                }
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i3 & 191739531) == 38347906) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier1111111115 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111111115;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier1111111116 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111111116;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                }
                mutableState4 = mutableState3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
            }
            i3 |= 12582912;
            function6 = function3;
            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i12 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            }
            if ((i3 & 191739531) == 38347906) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    mutableState3 = null;
                }
                if (i8 != 0) {
                    function7 = null;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i12 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                }
                Modifier modifier1111111117 = modifier2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111111117;
                function9 = function10;
                function5 = function7;
                function6 = function8;
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    mutableState3 = null;
                }
                if (i8 != 0) {
                    function7 = null;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i12 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                }
                Modifier modifier1111111118 = modifier2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111111118;
                function9 = function10;
                function5 = function7;
                function6 = function8;
            }
            mutableState4 = mutableState3;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
        }
        i3 |= 3072;
        mutableState3 = mutableState;
        if ((i2 & 16) != 0) {
            if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(mutableState2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((3670016 & i) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        if ((29360128 & i) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i11 = 8388608;
                            } else {
                                i11 = Configuration.BLOCK_SIZE;
                            }
                            i3 |= i11;
                        }
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i3 & 191739531) == 38347906) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier1111111119 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier1111111119;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        } else {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                mutableState3 = null;
                            }
                            if (i8 != 0) {
                                function7 = null;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                            }
                            Modifier modifier11111111110 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier11111111110;
                            function9 = function10;
                            function5 = function7;
                            function6 = function8;
                        }
                        mutableState4 = mutableState3;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                    }
                    i3 |= 12582912;
                    function6 = function3;
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11111111111 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11111111111;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11111111112 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11111111112;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 1572864;
                function5 = function2;
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((29360128 & i) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11111111113 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11111111113;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11111111114 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11111111114;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 12582912;
                function6 = function3;
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i3 & 191739531) == 38347906) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier11111111115 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11111111115;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier11111111116 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11111111116;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                }
                mutableState4 = mutableState3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
            }
            i3 |= 196608;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((3670016 & i) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((29360128 & i) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11111111117 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11111111117;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier11111111118 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11111111118;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 12582912;
                function6 = function3;
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i3 & 191739531) == 38347906) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier11111111119 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11111111119;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier111111111110 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111111111110;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                }
                mutableState4 = mutableState3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
            }
            i3 |= 1572864;
            function5 = function2;
            i10 = i2 & 128;
            if (i10 != 0) {
                if ((29360128 & i) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i11;
                }
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i3 & 191739531) == 38347906) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier111111111111 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111111111111;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier111111111112 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111111111112;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                }
                mutableState4 = mutableState3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
            }
            i3 |= 12582912;
            function6 = function3;
            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i12 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            }
            if ((i3 & 191739531) == 38347906) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    mutableState3 = null;
                }
                if (i8 != 0) {
                    function7 = null;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i12 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                }
                Modifier modifier111111111113 = modifier2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier111111111113;
                function9 = function10;
                function5 = function7;
                function6 = function8;
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    mutableState3 = null;
                }
                if (i8 != 0) {
                    function7 = null;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i12 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                }
                Modifier modifier111111111114 = modifier2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier111111111114;
                function9 = function10;
                function5 = function7;
                function6 = function8;
            }
            mutableState4 = mutableState3;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
        }
        i3 |= 24576;
        if ((i2 & 32) != 0) {
            if ((458752 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((3670016 & i) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    if ((29360128 & i) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 191739531) == 38347906) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier111111111115 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111111111115;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            mutableState3 = null;
                        }
                        if (i8 != 0) {
                            function7 = null;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                        }
                        Modifier modifier111111111116 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111111111116;
                        function9 = function10;
                        function5 = function7;
                        function6 = function8;
                    }
                    mutableState4 = mutableState3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
                }
                i3 |= 12582912;
                function6 = function3;
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i3 & 191739531) == 38347906) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier111111111117 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111111111117;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier111111111118 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111111111118;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                }
                mutableState4 = mutableState3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
            }
            i3 |= 1572864;
            function5 = function2;
            i10 = i2 & 128;
            if (i10 != 0) {
                if ((29360128 & i) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i11;
                }
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i3 & 191739531) == 38347906) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier111111111119 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111111111119;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier1111111111110 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111111111110;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                }
                mutableState4 = mutableState3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
            }
            i3 |= 12582912;
            function6 = function3;
            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i12 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            }
            if ((i3 & 191739531) == 38347906) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    mutableState3 = null;
                }
                if (i8 != 0) {
                    function7 = null;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i12 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                }
                Modifier modifier1111111111111 = modifier2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111111111111;
                function9 = function10;
                function5 = function7;
                function6 = function8;
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    mutableState3 = null;
                }
                if (i8 != 0) {
                    function7 = null;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i12 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                }
                Modifier modifier1111111111112 = modifier2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111111111112;
                function9 = function10;
                function5 = function7;
                function6 = function8;
            }
            mutableState4 = mutableState3;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
        }
        i3 |= 196608;
        i8 = i2 & 64;
        if (i8 != 0) {
            if ((3670016 & i) == 0) {
                function5 = function2;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                if ((29360128 & i) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i11;
                }
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i3 & 191739531) == 38347906) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier1111111111113 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111111111113;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        mutableState3 = null;
                    }
                    if (i8 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i12 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                    }
                    Modifier modifier1111111111114 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111111111114;
                    function9 = function10;
                    function5 = function7;
                    function6 = function8;
                }
                mutableState4 = mutableState3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
            }
            i3 |= 12582912;
            function6 = function3;
            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i12 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            }
            if ((i3 & 191739531) == 38347906) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    mutableState3 = null;
                }
                if (i8 != 0) {
                    function7 = null;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i12 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                }
                Modifier modifier1111111111115 = modifier2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111111111115;
                function9 = function10;
                function5 = function7;
                function6 = function8;
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    mutableState3 = null;
                }
                if (i8 != 0) {
                    function7 = null;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i12 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                }
                Modifier modifier1111111111116 = modifier2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111111111116;
                function9 = function10;
                function5 = function7;
                function6 = function8;
            }
            mutableState4 = mutableState3;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
        }
        i3 |= 1572864;
        function5 = function2;
        i10 = i2 & 128;
        if (i10 != 0) {
            if ((29360128 & i) == 0) {
                function6 = function3;
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i11 = 8388608;
                } else {
                    i11 = Configuration.BLOCK_SIZE;
                }
                i3 |= i11;
            }
            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i12 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            }
            if ((i3 & 191739531) == 38347906) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    mutableState3 = null;
                }
                if (i8 != 0) {
                    function7 = null;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i12 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                }
                Modifier modifier1111111111117 = modifier2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111111111117;
                function9 = function10;
                function5 = function7;
                function6 = function8;
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    mutableState3 = null;
                }
                if (i8 != 0) {
                    function7 = null;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i12 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
                }
                Modifier modifier1111111111118 = modifier2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111111111118;
                function9 = function10;
                function5 = function7;
                function6 = function8;
            }
            mutableState4 = mutableState3;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
        }
        i3 |= 12582912;
        function6 = function3;
        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i12 != 0) {
            i3 |= 100663296;
        } else if ((i & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function4)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i3 |= i13;
        }
        if ((i3 & 191739531) == 38347906) {
            if (i14 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i4 != 0) {
                mutableState3 = null;
            }
            if (i8 != 0) {
                function7 = null;
            } else {
                function7 = function5;
            }
            if (i10 != 0) {
                function8 = null;
            } else {
                function8 = function6;
            }
            if (i12 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
            }
            Modifier modifier1111111111119 = modifier2;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier1111111111119;
            function9 = function10;
            function5 = function7;
            function6 = function8;
        } else {
            if (i14 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i4 != 0) {
                mutableState3 = null;
            }
            if (i8 != 0) {
                function7 = null;
            } else {
                function7 = function5;
            }
            if (i10 != 0) {
                function8 = null;
            } else {
                function8 = function6;
            }
            if (i12 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(911507091, i3, -1, "com.yalla.yalla.module.media.dialog.CompressCommonSlider (MusicEditDialog.kt:184)");
            }
            Modifier modifier11111111111110 = modifier2;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1191576403, true, new a(modifier2, function1, mutableState2, i3, f, function7, function8, function10, mutableState3)), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier11111111111110;
            function9 = function10;
            function5 = function7;
            function6 = function8;
        }
        mutableState4 = mutableState3;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, j, f, mutableState4, mutableState2, function1, function5, function6, function9, i, i2));
    }

    public static final void OooO0OO(BoxScope boxScope, int i, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1776931490);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1776931490, i2, -1, "com.yalla.yalla.module.media.dialog.CustomSliderShowTime (MusicEditDialog.kt:309)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(o0000O.OooO0OO(i), OffsetKt.m436offsetVpY3zN4(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), Dp.m3765constructorimpl(-2), Dp.m3765constructorimpl(-3)), o0oO0O0o.f46960OooOOo, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(boxScope, i, i2));
    }
}
