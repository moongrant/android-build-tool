package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.qiniu.android.storage.Configuration;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¢\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u00102\u0013\b\u0002\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192 \b\u0002\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a£\u0001\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u00172\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\b.H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a!\u00103\u001a\u00020\r2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u0014H\u0007¢\u0006\u0002\u00107\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"FabSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "LocalFabPlacement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/FabPlacement;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Scaffold", "", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/ScaffoldState;", "topBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomBar", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "isFloatingActionButtonDocked", "", "drawerContent", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "drawerGesturesEnabled", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "Scaffold-27mzLpw", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/ScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ScaffoldLayout", "isFabDocked", "fabPosition", "Landroidx/compose/ui/UiComposable;", "snackbar", "fab", "ScaffoldLayout-MDYNRJg", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "rememberScaffoldState", "drawerState", "Landroidx/compose/material/DrawerState;", "snackbarHostState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/ScaffoldState;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,375:1\n25#2:376\n25#2:383\n83#2,3:390\n1097#3,6:377\n1097#3,6:384\n1097#3,6:393\n154#4:399\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material/ScaffoldKt\n*L\n65#1:376\n66#1:383\n237#1:390,3\n65#1:377,6\n66#1:384,6\n237#1:393,6\n372#1:399\n*E\n"})
public final class ScaffoldKt {

    @NotNull
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(new Function0<FabPlacement>() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final FabPlacement invoke() {
            return null;
        }
    });
    private static final float FabSpacing = Dp.m3775constructorimpl(16);

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:103:0x014d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0150  */
    /* JADX WARN: Code duplicated, block: B:108:0x0158  */
    /* JADX WARN: Code duplicated, block: B:110:0x015c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x016e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0176  */
    /* JADX WARN: Code duplicated, block: B:120:0x017b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0181  */
    /* JADX WARN: Code duplicated, block: B:124:0x0187  */
    /* JADX WARN: Code duplicated, block: B:125:0x018a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0192  */
    /* JADX WARN: Code duplicated, block: B:131:0x0196  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:164:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:169:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:172:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:174:0x0205  */
    /* JADX WARN: Code duplicated, block: B:177:0x020e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0213  */
    /* JADX WARN: Code duplicated, block: B:182:0x0219  */
    /* JADX WARN: Code duplicated, block: B:184:0x021e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0222  */
    /* JADX WARN: Code duplicated, block: B:188:0x0228  */
    /* JADX WARN: Code duplicated, block: B:189:0x022b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0238  */
    /* JADX WARN: Code duplicated, block: B:198:0x026e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0275  */
    /* JADX WARN: Code duplicated, block: B:225:0x02d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:226:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:227:0x02db  */
    /* JADX WARN: Code duplicated, block: B:230:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:231:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:233:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:234:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:236:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:237:0x0306  */
    /* JADX WARN: Code duplicated, block: B:239:0x030a  */
    /* JADX WARN: Code duplicated, block: B:240:0x0311  */
    /* JADX WARN: Code duplicated, block: B:242:0x0315  */
    /* JADX WARN: Code duplicated, block: B:243:0x031c  */
    /* JADX WARN: Code duplicated, block: B:245:0x0320  */
    /* JADX WARN: Code duplicated, block: B:247:0x0328  */
    /* JADX WARN: Code duplicated, block: B:248:0x032a  */
    /* JADX WARN: Code duplicated, block: B:250:0x032e  */
    /* JADX WARN: Code duplicated, block: B:251:0x0330  */
    /* JADX WARN: Code duplicated, block: B:253:0x0334  */
    /* JADX WARN: Code duplicated, block: B:254:0x0336  */
    /* JADX WARN: Code duplicated, block: B:257:0x0341  */
    /* JADX WARN: Code duplicated, block: B:258:0x034e  */
    /* JADX WARN: Code duplicated, block: B:261:0x0354  */
    /* JADX WARN: Code duplicated, block: B:262:0x035b  */
    /* JADX WARN: Code duplicated, block: B:265:0x0361  */
    /* JADX WARN: Code duplicated, block: B:266:0x037c  */
    /* JADX WARN: Code duplicated, block: B:269:0x038b  */
    /* JADX WARN: Code duplicated, block: B:270:0x0396  */
    /* JADX WARN: Code duplicated, block: B:273:0x039c  */
    /* JADX WARN: Code duplicated, block: B:274:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:277:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:278:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:281:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:282:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:286:0x0408  */
    /* JADX WARN: Code duplicated, block: B:289:0x043b  */
    /* JADX WARN: Code duplicated, block: B:290:0x0499  */
    /* JADX WARN: Code duplicated, block: B:293:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:298:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x0101  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Code duplicated, block: B:83:0x010d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0110  */
    /* JADX WARN: Code duplicated, block: B:88:0x0118  */
    /* JADX WARN: Code duplicated, block: B:89:0x011f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0127  */
    /* JADX WARN: Code duplicated, block: B:93:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130  */
    /* JADX WARN: Code duplicated, block: B:98:0x0138  */
    /* JADX WARN: Code duplicated, block: B:99:0x013f  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: Scaffold-27mzLpw, reason: not valid java name */
    public static final void m1172Scaffold27mzLpw(@Nullable Modifier modifier, @Nullable ScaffoldState scaffoldState, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function4, @Nullable Function2<? super Composer, ? super Integer, Unit> function5, int i, boolean z, @Nullable Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function6, boolean z2, @Nullable Shape shape, float f, long j, long j2, long j3, long j4, long j5, @NotNull final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function7;
        int i11;
        int i12;
        int iM1110getEnd5ygKITE;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        final Modifier modifier2;
        ScaffoldState scaffoldStateRememberScaffoldState;
        Function2<? super Composer, ? super Integer, Unit> function2M1065getLambda1$material_release;
        Function2<? super Composer, ? super Integer, Unit> function2M1066getLambda2$material_release;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M1067getLambda3$material_release;
        Function2<? super Composer, ? super Integer, Unit> function2M1068getLambda4$material_release;
        boolean z3;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function8;
        boolean z4;
        ScaffoldState scaffoldState2;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function9;
        Shape large;
        int i24;
        float fM1079getElevationD9Ej5fM;
        boolean z5;
        int i25;
        long jM1043getSurface0d7_KjU;
        long jM1057contentColorForek8zF_U;
        int i26;
        long scrimColor;
        long jM1032getBackground0d7_KjU;
        long jM1057contentColorForek8zF_U2;
        int i27;
        long j6;
        float f2;
        final ComposableLambda composableLambda;
        final ScaffoldState scaffoldState3;
        final Function2<? super Composer, ? super Integer, Unit> function10;
        final float f3;
        final long j7;
        long j8;
        final long j9;
        final long j10;
        final long j11;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function11;
        final Function2<? super Composer, ? super Integer, Unit> function12;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function13;
        final int i28;
        final Shape shape2;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function14;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i29;
        int i30;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1037492569);
        int i31 = i4 & 1;
        if (i31 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 112) == 0) {
            i5 |= ((i4 & 2) == 0 && composerStartRestartGroup.changed(scaffoldState)) ? 32 : 16;
        }
        int i32 = i4 & 4;
        if (i32 == 0) {
            if ((i2 & 896) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i2 & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 32;
                if (i10 != 0) {
                    i5 |= 196608;
                    function7 = function5;
                } else {
                    function7 = function5;
                    if ((i2 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i5 |= i11;
                    }
                }
                i12 = i4 & 64;
                if (i12 != 0) {
                    i5 |= 1572864;
                    iM1110getEnd5ygKITE = i;
                } else {
                    iM1110getEnd5ygKITE = i;
                    if ((i2 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(iM1110getEnd5ygKITE)) {
                            i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i13 = 524288;
                        }
                        i5 |= i13;
                    }
                }
                i14 = i4 & 128;
                if (i14 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i15 = 8388608;
                    } else {
                        i15 = Configuration.BLOCK_SIZE;
                    }
                    i5 |= i15;
                }
                i16 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i16 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i5 |= i17;
                }
                i18 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i18 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i19 = 536870912;
                    } else {
                        i19 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i5 |= i19;
                }
                if ((i3 & 14) == 0) {
                    i20 = i3 | (((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0 || !composerStartRestartGroup.changed(shape)) ? 2 : 4);
                } else {
                    i20 = i3;
                }
                i21 = i4 & 2048;
                if (i21 != 0) {
                    i20 |= 48;
                } else if ((i3 & 112) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i20 |= i22;
                }
                if ((i3 & 896) != 0) {
                    i20 |= ((i4 & 4096) == 0 || !composerStartRestartGroup.changed(j)) ? 128 : PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                if ((i3 & 7168) != 0) {
                    i20 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(j2)) ? 1024 : 2048;
                }
                if ((i3 & 57344) != 0) {
                    i20 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(j3)) ? 8192 : 16384;
                }
                if ((i3 & 458752) != 0) {
                    if ((i4 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0 || !composerStartRestartGroup.changed(j4)) {
                        i30 = 65536;
                    } else {
                        i30 = 131072;
                    }
                    i20 |= i30;
                }
                if ((i3 & 3670016) != 0) {
                    if ((i4 & 65536) == 0 || !composerStartRestartGroup.changed(j5)) {
                        i29 = 524288;
                    } else {
                        i29 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    }
                    i20 |= i29;
                }
                if ((i4 & 131072) != 0) {
                    if ((i3 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i23 = 8388608;
                        } else {
                            i23 = Configuration.BLOCK_SIZE;
                        }
                    }
                    if ((i5 & 1533916891) != 306783378 && (i20 & 23967451) == 4793490 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        scaffoldState3 = scaffoldState;
                        function12 = function2;
                        function13 = function3;
                        function14 = function4;
                        function11 = function6;
                        shape2 = shape;
                        f3 = f;
                        j7 = j;
                        j8 = j2;
                        j9 = j3;
                        j10 = j4;
                        j11 = j5;
                        function10 = function7;
                        i28 = iM1110getEnd5ygKITE;
                        z7 = z;
                        z6 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i31 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i4 & 2) != 0) {
                                scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                                i5 &= -113;
                            } else {
                                scaffoldStateRememberScaffoldState = scaffoldState;
                            }
                            if (i32 != 0) {
                                function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                            } else {
                                function2M1065getLambda1$material_release = function2;
                            }
                            if (i6 != 0) {
                                function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                            } else {
                                function2M1066getLambda2$material_release = function3;
                            }
                            if (i8 != 0) {
                                function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                            } else {
                                function3M1067getLambda3$material_release = function4;
                            }
                            if (i10 != 0) {
                                function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                            } else {
                                function2M1068getLambda4$material_release = function5;
                            }
                            if (i12 != 0) {
                                iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                            }
                            if (i14 != 0) {
                                z3 = false;
                            } else {
                                z3 = z;
                            }
                            if (i16 != 0) {
                                function8 = null;
                            } else {
                                function8 = function6;
                            }
                            if (i18 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            scaffoldState2 = scaffoldStateRememberScaffoldState;
                            function9 = function8;
                            if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                                i20 &= -15;
                            } else {
                                large = shape;
                            }
                            i24 = i20;
                            if (i21 != 0) {
                                fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                            } else {
                                fM1079getElevationD9Ej5fM = f;
                            }
                            if ((i4 & 4096) != 0) {
                                boolean z8 = z4;
                                i25 = i24 & (-897);
                                jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                                z5 = z8;
                            } else {
                                z5 = z4;
                                i25 = i24;
                                jM1043getSurface0d7_KjU = j;
                            }
                            float f4 = fM1079getElevationD9Ej5fM;
                            if ((i4 & 8192) != 0) {
                                jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                                i25 &= -7169;
                            } else {
                                jM1057contentColorForek8zF_U = j2;
                            }
                            if ((i4 & 16384) != 0) {
                                i26 = 6;
                                scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                                i25 &= -57345;
                            } else {
                                i26 = 6;
                                scrimColor = j3;
                            }
                            if ((32768 & i4) != 0) {
                                jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                                i25 &= -458753;
                            } else {
                                jM1032getBackground0d7_KjU = j4;
                            }
                            if ((i4 & 65536) != 0) {
                                i27 = i25 & (-3670017);
                                jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                            } else {
                                jM1057contentColorForek8zF_U2 = j5;
                                i27 = i25;
                            }
                            j6 = jM1057contentColorForek8zF_U;
                            f2 = f4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i4 & 2) != 0) {
                                i5 &= -113;
                            }
                            if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                i20 &= -15;
                            }
                            int i33 = i20;
                            if ((i4 & 4096) != 0) {
                                i33 &= -897;
                            }
                            if ((i4 & 8192) != 0) {
                                i33 &= -7169;
                            }
                            if ((i4 & 16384) != 0) {
                                i33 &= -57345;
                            }
                            if ((32768 & i4) != 0) {
                                i33 &= -458753;
                            }
                            if ((i4 & 65536) != 0) {
                                i33 &= -3670017;
                            }
                            scaffoldState2 = scaffoldState;
                            function2M1065getLambda1$material_release = function2;
                            function2M1066getLambda2$material_release = function3;
                            z3 = z;
                            function9 = function6;
                            z5 = z2;
                            f2 = f;
                            jM1043getSurface0d7_KjU = j;
                            j6 = j2;
                            scrimColor = j3;
                            jM1032getBackground0d7_KjU = j4;
                            jM1057contentColorForek8zF_U2 = j5;
                            i27 = i33;
                            i5 = i5;
                            function2M1068getLambda4$material_release = function7;
                            modifier2 = modifier;
                            function3M1067getLambda3$material_release = function4;
                            large = shape;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1037492569, i5, i27, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                        }
                        final long j12 = jM1032getBackground0d7_KjU;
                        final long j13 = jM1057contentColorForek8zF_U2;
                        final int i34 = i27;
                        final boolean z9 = z3;
                        final int i35 = iM1110getEnd5ygKITE;
                        final Function2<? super Composer, ? super Integer, Unit> function15 = function2M1065getLambda1$material_release;
                        final Function2<? super Composer, ? super Integer, Unit> function16 = function2M1068getLambda4$material_release;
                        final Function2<? super Composer, ? super Integer, Unit> function17 = function2M1066getLambda2$material_release;
                        final int i36 = i5;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function18 = function3M1067getLambda3$material_release;
                        final ScaffoldState scaffoldState4 = scaffoldState2;
                        Function2<? super Composer, ? super Integer, Unit> function19 = function2M1065getLambda1$material_release;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) {
                                invoke(modifier3, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i37) {
                                int i38;
                                Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                                if ((i37 & 14) == 0) {
                                    i38 = i37 | (composer2.changed(childModifier) ? 4 : 2);
                                } else {
                                    i38 = i37;
                                }
                                if ((i38 & 91) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1823402604, i38, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                                }
                                long j14 = j12;
                                long j15 = j13;
                                final boolean z10 = z9;
                                final int i39 = i35;
                                final Function2<Composer, Integer, Unit> function20 = function15;
                                final Function3<PaddingValues, Composer, Integer, Unit> function21 = content;
                                final Function2<Composer, Integer, Unit> function22 = function16;
                                final Function2<Composer, Integer, Unit> function23 = function17;
                                final int i40 = i36;
                                final int i41 = i34;
                                final Function3<SnackbarHostState, Composer, Integer, Unit> function24 = function18;
                                final ScaffoldState scaffoldState5 = scaffoldState4;
                                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                                    public final void invoke(@Nullable Composer composer3, int i42) {
                                        if ((i42 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1128984656, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                                        }
                                        boolean z11 = z10;
                                        int i43 = i39;
                                        Function2<Composer, Integer, Unit> function25 = function20;
                                        Function3<PaddingValues, Composer, Integer, Unit> function26 = function21;
                                        final Function3<SnackbarHostState, Composer, Integer, Unit> function27 = function24;
                                        final ScaffoldState scaffoldState6 = scaffoldState5;
                                        final int i44 = i40;
                                        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer4, int i45) {
                                                if ((i45 & 11) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(533782017, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                                }
                                                function27.invoke(scaffoldState6.getSnackbarHostState(), composer4, Integer.valueOf((i44 >> 9) & 112));
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        });
                                        Function2<Composer, Integer, Unit> function28 = function22;
                                        Function2<Composer, Integer, Unit> function29 = function23;
                                        int i45 = i40;
                                        ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z11, i43, function25, function26, composableLambda3, function28, function29, composer3, ((i45 >> 21) & 14) | 24576 | ((i45 >> 15) & 112) | (i45 & 896) | ((i41 >> 12) & 7168) | (458752 & i45) | ((i45 << 9) & 3670016));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                });
                                int i42 = 1572864 | (i38 & 14);
                                int i43 = i34;
                                SurfaceKt.m1201SurfaceFjzlyU(childModifier, null, j14, j15, null, 0.0f, composableLambda2, composer2, i42 | ((i43 >> 9) & 896) | ((i43 >> 9) & 7168), 50);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        if (function9 != null) {
                            composerStartRestartGroup.startReplaceableGroup(-1013848234);
                            int i37 = i27 << 12;
                            DrawerKt.m1082ModalDrawerGs3lGvM(function9, modifier2, scaffoldState2.getDrawerState(), z5, large, f2, jM1043getSurface0d7_KjU, j6, scrimColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                                public final void invoke(@Nullable Composer composer2, int i38) {
                                    if ((i38 & 11) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(100842932, i38, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                                    }
                                    composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composerStartRestartGroup, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i37 & 57344) | (i37 & 458752) | (i37 & 3670016) | (i37 & 29360128) | (i37 & 234881024), 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1013847725);
                            composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i5 & 14) | 48));
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scaffoldState3 = scaffoldState2;
                        function10 = function2M1068getLambda4$material_release;
                        f3 = f2;
                        j7 = jM1043getSurface0d7_KjU;
                        j8 = j6;
                        j9 = scrimColor;
                        j10 = jM1032getBackground0d7_KjU;
                        j11 = jM1057contentColorForek8zF_U2;
                        function11 = function9;
                        function12 = function19;
                        int i38 = iM1110getEnd5ygKITE;
                        z6 = z5;
                        function13 = function2M1066getLambda2$material_release;
                        i28 = i38;
                        boolean z10 = z3;
                        shape2 = large;
                        function14 = function3M1067getLambda3$material_release;
                        z7 = z10;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final long j14 = j8;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
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

                        public final void invoke(@Nullable Composer composer2, int i39) {
                            ScaffoldKt.m1172Scaffold27mzLpw(modifier2, scaffoldState3, function12, function13, function14, function10, i28, z7, function11, z6, shape2, f3, j7, j14, j9, j10, j11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                        }
                    });
                }
                i23 = 12582912;
                i20 |= i23;
                if ((i5 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i4 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i5 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i32 != 0) {
                            function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                        } else {
                            function2M1065getLambda1$material_release = function2;
                        }
                        if (i6 != 0) {
                            function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                        } else {
                            function2M1066getLambda2$material_release = function3;
                        }
                        if (i8 != 0) {
                            function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                        } else {
                            function3M1067getLambda3$material_release = function4;
                        }
                        if (i10 != 0) {
                            function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                        } else {
                            function2M1068getLambda4$material_release = function5;
                        }
                        if (i12 != 0) {
                            iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                        }
                        if (i14 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i16 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                        function9 = function8;
                        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i20 &= -15;
                        } else {
                            large = shape;
                        }
                        i24 = i20;
                        if (i21 != 0) {
                            fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                        } else {
                            fM1079getElevationD9Ej5fM = f;
                        }
                        if ((i4 & 4096) != 0) {
                            boolean z11 = z4;
                            i25 = i24 & (-897);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            z5 = z11;
                        } else {
                            z5 = z4;
                            i25 = i24;
                            jM1043getSurface0d7_KjU = j;
                        }
                        float f5 = fM1079getElevationD9Ej5fM;
                        if ((i4 & 8192) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                            i25 &= -7169;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if ((i4 & 16384) != 0) {
                            i26 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i25 &= -57345;
                        } else {
                            i26 = 6;
                            scrimColor = j3;
                        }
                        if ((32768 & i4) != 0) {
                            jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                            i25 &= -458753;
                        } else {
                            jM1032getBackground0d7_KjU = j4;
                        }
                        if ((i4 & 65536) != 0) {
                            i27 = i25 & (-3670017);
                            jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                        } else {
                            jM1057contentColorForek8zF_U2 = j5;
                            i27 = i25;
                        }
                        j6 = jM1057contentColorForek8zF_U;
                        f2 = f5;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i4 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i5 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i32 != 0) {
                            function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                        } else {
                            function2M1065getLambda1$material_release = function2;
                        }
                        if (i6 != 0) {
                            function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                        } else {
                            function2M1066getLambda2$material_release = function3;
                        }
                        if (i8 != 0) {
                            function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                        } else {
                            function3M1067getLambda3$material_release = function4;
                        }
                        if (i10 != 0) {
                            function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                        } else {
                            function2M1068getLambda4$material_release = function5;
                        }
                        if (i12 != 0) {
                            iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                        }
                        if (i14 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i16 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                        function9 = function8;
                        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i20 &= -15;
                        } else {
                            large = shape;
                        }
                        i24 = i20;
                        if (i21 != 0) {
                            fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                        } else {
                            fM1079getElevationD9Ej5fM = f;
                        }
                        if ((i4 & 4096) != 0) {
                            boolean z12 = z4;
                            i25 = i24 & (-897);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            z5 = z12;
                        } else {
                            z5 = z4;
                            i25 = i24;
                            jM1043getSurface0d7_KjU = j;
                        }
                        float f6 = fM1079getElevationD9Ej5fM;
                        if ((i4 & 8192) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                            i25 &= -7169;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if ((i4 & 16384) != 0) {
                            i26 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i25 &= -57345;
                        } else {
                            i26 = 6;
                            scrimColor = j3;
                        }
                        if ((32768 & i4) != 0) {
                            jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                            i25 &= -458753;
                        } else {
                            jM1032getBackground0d7_KjU = j4;
                        }
                        if ((i4 & 65536) != 0) {
                            i27 = i25 & (-3670017);
                            jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                        } else {
                            jM1057contentColorForek8zF_U2 = j5;
                            i27 = i25;
                        }
                        j6 = jM1057contentColorForek8zF_U;
                        f2 = f6;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1037492569, i5, i27, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                    }
                    final long j15 = jM1032getBackground0d7_KjU;
                    final long j16 = jM1057contentColorForek8zF_U2;
                    final int i39 = i27;
                    final boolean z13 = z3;
                    final int i310 = iM1110getEnd5ygKITE;
                    final Function2<? super Composer, ? super Integer, Unit> function110 = function2M1065getLambda1$material_release;
                    final Function2<? super Composer, ? super Integer, Unit> function111 = function2M1068getLambda4$material_release;
                    final Function2<? super Composer, ? super Integer, Unit> function112 = function2M1066getLambda2$material_release;
                    final int i311 = i5;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function113 = function3M1067getLambda3$material_release;
                    final ScaffoldState scaffoldState5 = scaffoldState2;
                    Function2<? super Composer, ? super Integer, Unit> function114 = function2M1065getLambda1$material_release;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) {
                            invoke(modifier3, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i312) {
                            int i313;
                            Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                            if ((i312 & 14) == 0) {
                                i313 = i312 | (composer2.changed(childModifier) ? 4 : 2);
                            } else {
                                i313 = i312;
                            }
                            if ((i313 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1823402604, i313, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                            }
                            long j17 = j15;
                            long j18 = j16;
                            final boolean z14 = z13;
                            final int i314 = i310;
                            final Function2<? super Composer, ? super Integer, Unit> function20 = function110;
                            final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function21 = content;
                            final Function2<? super Composer, ? super Integer, Unit> function22 = function111;
                            final Function2<? super Composer, ? super Integer, Unit> function23 = function112;
                            final int i40 = i311;
                            final int i41 = i39;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function24 = function113;
                            final ScaffoldState scaffoldState6 = scaffoldState5;
                            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                                public final void invoke(@Nullable Composer composer3, int i42) {
                                    if ((i42 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1128984656, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                                    }
                                    boolean z15 = z14;
                                    int i43 = i314;
                                    Function2<Composer, Integer, Unit> function25 = function20;
                                    Function3<PaddingValues, Composer, Integer, Unit> function26 = function21;
                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function27 = function24;
                                    final ScaffoldState scaffoldState7 = scaffoldState6;
                                    final int i44 = i40;
                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i45) {
                                            if ((i45 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(533782017, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                            }
                                            function27.invoke(scaffoldState7.getSnackbarHostState(), composer4, Integer.valueOf((i44 >> 9) & 112));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    });
                                    Function2<Composer, Integer, Unit> function28 = function22;
                                    Function2<Composer, Integer, Unit> function29 = function23;
                                    int i45 = i40;
                                    ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z15, i43, function25, function26, composableLambda3, function28, function29, composer3, ((i45 >> 21) & 14) | 24576 | ((i45 >> 15) & 112) | (i45 & 896) | ((i41 >> 12) & 7168) | (458752 & i45) | ((i45 << 9) & 3670016));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                            int i42 = 1572864 | (i313 & 14);
                            int i43 = i39;
                            SurfaceKt.m1201SurfaceFjzlyU(childModifier, null, j17, j18, null, 0.0f, composableLambda2, composer2, i42 | ((i43 >> 9) & 896) | ((i43 >> 9) & 7168), 50);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    if (function9 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1013848234);
                        int i312 = i27 << 12;
                        DrawerKt.m1082ModalDrawerGs3lGvM(function9, modifier2, scaffoldState2.getDrawerState(), z5, large, f2, jM1043getSurface0d7_KjU, j6, scrimColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                            public final void invoke(@Nullable Composer composer2, int i313) {
                                if ((i313 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(100842932, i313, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                                }
                                composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i312 & 57344) | (i312 & 458752) | (i312 & 3670016) | (i312 & 29360128) | (i312 & 234881024), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1013847725);
                        composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i5 & 14) | 48));
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scaffoldState3 = scaffoldState2;
                    function10 = function2M1068getLambda4$material_release;
                    f3 = f2;
                    j7 = jM1043getSurface0d7_KjU;
                    j8 = j6;
                    j9 = scrimColor;
                    j10 = jM1032getBackground0d7_KjU;
                    j11 = jM1057contentColorForek8zF_U2;
                    function11 = function9;
                    function12 = function114;
                    int i313 = iM1110getEnd5ygKITE;
                    z6 = z5;
                    function13 = function2M1066getLambda2$material_release;
                    i28 = i313;
                    boolean z14 = z3;
                    shape2 = large;
                    function14 = function3M1067getLambda3$material_release;
                    z7 = z14;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i4 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i5 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i32 != 0) {
                            function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                        } else {
                            function2M1065getLambda1$material_release = function2;
                        }
                        if (i6 != 0) {
                            function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                        } else {
                            function2M1066getLambda2$material_release = function3;
                        }
                        if (i8 != 0) {
                            function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                        } else {
                            function3M1067getLambda3$material_release = function4;
                        }
                        if (i10 != 0) {
                            function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                        } else {
                            function2M1068getLambda4$material_release = function5;
                        }
                        if (i12 != 0) {
                            iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                        }
                        if (i14 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i16 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                        function9 = function8;
                        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i20 &= -15;
                        } else {
                            large = shape;
                        }
                        i24 = i20;
                        if (i21 != 0) {
                            fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                        } else {
                            fM1079getElevationD9Ej5fM = f;
                        }
                        if ((i4 & 4096) != 0) {
                            boolean z15 = z4;
                            i25 = i24 & (-897);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            z5 = z15;
                        } else {
                            z5 = z4;
                            i25 = i24;
                            jM1043getSurface0d7_KjU = j;
                        }
                        float f7 = fM1079getElevationD9Ej5fM;
                        if ((i4 & 8192) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                            i25 &= -7169;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if ((i4 & 16384) != 0) {
                            i26 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i25 &= -57345;
                        } else {
                            i26 = 6;
                            scrimColor = j3;
                        }
                        if ((32768 & i4) != 0) {
                            jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                            i25 &= -458753;
                        } else {
                            jM1032getBackground0d7_KjU = j4;
                        }
                        if ((i4 & 65536) != 0) {
                            i27 = i25 & (-3670017);
                            jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                        } else {
                            jM1057contentColorForek8zF_U2 = j5;
                            i27 = i25;
                        }
                        j6 = jM1057contentColorForek8zF_U;
                        f2 = f7;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i4 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i5 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i32 != 0) {
                            function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                        } else {
                            function2M1065getLambda1$material_release = function2;
                        }
                        if (i6 != 0) {
                            function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                        } else {
                            function2M1066getLambda2$material_release = function3;
                        }
                        if (i8 != 0) {
                            function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                        } else {
                            function3M1067getLambda3$material_release = function4;
                        }
                        if (i10 != 0) {
                            function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                        } else {
                            function2M1068getLambda4$material_release = function5;
                        }
                        if (i12 != 0) {
                            iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                        }
                        if (i14 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i16 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                        function9 = function8;
                        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i20 &= -15;
                        } else {
                            large = shape;
                        }
                        i24 = i20;
                        if (i21 != 0) {
                            fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                        } else {
                            fM1079getElevationD9Ej5fM = f;
                        }
                        if ((i4 & 4096) != 0) {
                            boolean z16 = z4;
                            i25 = i24 & (-897);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            z5 = z16;
                        } else {
                            z5 = z4;
                            i25 = i24;
                            jM1043getSurface0d7_KjU = j;
                        }
                        float f8 = fM1079getElevationD9Ej5fM;
                        if ((i4 & 8192) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                            i25 &= -7169;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if ((i4 & 16384) != 0) {
                            i26 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i25 &= -57345;
                        } else {
                            i26 = 6;
                            scrimColor = j3;
                        }
                        if ((32768 & i4) != 0) {
                            jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                            i25 &= -458753;
                        } else {
                            jM1032getBackground0d7_KjU = j4;
                        }
                        if ((i4 & 65536) != 0) {
                            i27 = i25 & (-3670017);
                            jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                        } else {
                            jM1057contentColorForek8zF_U2 = j5;
                            i27 = i25;
                        }
                        j6 = jM1057contentColorForek8zF_U;
                        f2 = f8;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1037492569, i5, i27, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                    }
                    final long j17 = jM1032getBackground0d7_KjU;
                    final long j18 = jM1057contentColorForek8zF_U2;
                    final int i314 = i27;
                    final boolean z17 = z3;
                    final int i315 = iM1110getEnd5ygKITE;
                    final Function2<? super Composer, ? super Integer, Unit> function115 = function2M1065getLambda1$material_release;
                    final Function2<? super Composer, ? super Integer, Unit> function116 = function2M1068getLambda4$material_release;
                    final Function2<? super Composer, ? super Integer, Unit> function117 = function2M1066getLambda2$material_release;
                    final int i316 = i5;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function118 = function3M1067getLambda3$material_release;
                    final ScaffoldState scaffoldState6 = scaffoldState2;
                    Function2<? super Composer, ? super Integer, Unit> function119 = function2M1065getLambda1$material_release;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) {
                            invoke(modifier3, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i317) {
                            int i318;
                            Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                            if ((i317 & 14) == 0) {
                                i318 = i317 | (composer2.changed(childModifier) ? 4 : 2);
                            } else {
                                i318 = i317;
                            }
                            if ((i318 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1823402604, i318, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                            }
                            long j19 = j17;
                            long j110 = j18;
                            final boolean z18 = z17;
                            final int i319 = i315;
                            final Function2<? super Composer, ? super Integer, Unit> function20 = function115;
                            final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function21 = content;
                            final Function2<? super Composer, ? super Integer, Unit> function22 = function116;
                            final Function2<? super Composer, ? super Integer, Unit> function23 = function117;
                            final int i40 = i316;
                            final int i41 = i314;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function24 = function118;
                            final ScaffoldState scaffoldState7 = scaffoldState6;
                            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                                public final void invoke(@Nullable Composer composer3, int i42) {
                                    if ((i42 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1128984656, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                                    }
                                    boolean z19 = z18;
                                    int i43 = i319;
                                    Function2<Composer, Integer, Unit> function25 = function20;
                                    Function3<PaddingValues, Composer, Integer, Unit> function26 = function21;
                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function27 = function24;
                                    final ScaffoldState scaffoldState8 = scaffoldState7;
                                    final int i44 = i40;
                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i45) {
                                            if ((i45 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(533782017, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                            }
                                            function27.invoke(scaffoldState8.getSnackbarHostState(), composer4, Integer.valueOf((i44 >> 9) & 112));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    });
                                    Function2<Composer, Integer, Unit> function28 = function22;
                                    Function2<Composer, Integer, Unit> function29 = function23;
                                    int i45 = i40;
                                    ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z19, i43, function25, function26, composableLambda3, function28, function29, composer3, ((i45 >> 21) & 14) | 24576 | ((i45 >> 15) & 112) | (i45 & 896) | ((i41 >> 12) & 7168) | (458752 & i45) | ((i45 << 9) & 3670016));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                            int i42 = 1572864 | (i318 & 14);
                            int i43 = i314;
                            SurfaceKt.m1201SurfaceFjzlyU(childModifier, null, j19, j110, null, 0.0f, composableLambda2, composer2, i42 | ((i43 >> 9) & 896) | ((i43 >> 9) & 7168), 50);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    if (function9 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1013848234);
                        int i317 = i27 << 12;
                        DrawerKt.m1082ModalDrawerGs3lGvM(function9, modifier2, scaffoldState2.getDrawerState(), z5, large, f2, jM1043getSurface0d7_KjU, j6, scrimColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                            public final void invoke(@Nullable Composer composer2, int i318) {
                                if ((i318 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(100842932, i318, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                                }
                                composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i317 & 57344) | (i317 & 458752) | (i317 & 3670016) | (i317 & 29360128) | (i317 & 234881024), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1013847725);
                        composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i5 & 14) | 48));
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scaffoldState3 = scaffoldState2;
                    function10 = function2M1068getLambda4$material_release;
                    f3 = f2;
                    j7 = jM1043getSurface0d7_KjU;
                    j8 = j6;
                    j9 = scrimColor;
                    j10 = jM1032getBackground0d7_KjU;
                    j11 = jM1057contentColorForek8zF_U2;
                    function11 = function9;
                    function12 = function119;
                    int i318 = iM1110getEnd5ygKITE;
                    z6 = z5;
                    function13 = function2M1066getLambda2$material_release;
                    i28 = i318;
                    boolean z18 = z3;
                    shape2 = large;
                    function14 = function3M1067getLambda3$material_release;
                    z7 = z18;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final long j19 = j8;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
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

                    public final void invoke(@Nullable Composer composer2, int i319) {
                        ScaffoldKt.m1172Scaffold27mzLpw(modifier2, scaffoldState3, function12, function13, function14, function10, i28, z7, function11, z6, shape2, f3, j7, j19, j9, j10, j11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                    }
                });
            }
            i5 |= 3072;
            i8 = i4 & 16;
            if (i8 != 0) {
                i5 |= 24576;
            } else if ((i2 & 57344) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i5 |= i9;
            }
            i10 = i4 & 32;
            if (i10 != 0) {
                i5 |= 196608;
                function7 = function5;
            } else {
                function7 = function5;
                if ((i2 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i5 |= i11;
                }
            }
            i12 = i4 & 64;
            if (i12 != 0) {
                i5 |= 1572864;
                iM1110getEnd5ygKITE = i;
            } else {
                iM1110getEnd5ygKITE = i;
                if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(iM1110getEnd5ygKITE)) {
                        i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i13 = 524288;
                    }
                    i5 |= i13;
                }
            }
            i14 = i4 & 128;
            if (i14 != 0) {
                i5 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i15 = 8388608;
                } else {
                    i15 = Configuration.BLOCK_SIZE;
                }
                i5 |= i15;
            }
            i16 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i16 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i5 |= i17;
            }
            i18 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i18 != 0) {
                i5 |= 805306368;
            } else if ((i2 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i19 = 536870912;
                } else {
                    i19 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i5 |= i19;
            }
            if ((i3 & 14) == 0) {
                i20 = i3 | (((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0 || !composerStartRestartGroup.changed(shape)) ? 2 : 4);
            } else {
                i20 = i3;
            }
            i21 = i4 & 2048;
            if (i21 != 0) {
                i20 |= 48;
            } else if ((i3 & 112) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i20 |= i22;
            }
            if ((i3 & 896) != 0) {
                i20 |= ((i4 & 4096) == 0 || !composerStartRestartGroup.changed(j)) ? 128 : PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            if ((i3 & 7168) != 0) {
                i20 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(j2)) ? 1024 : 2048;
            }
            if ((i3 & 57344) != 0) {
                i20 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(j3)) ? 8192 : 16384;
            }
            if ((i3 & 458752) != 0) {
                if ((i4 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                    i30 = 65536;
                } else {
                    i30 = 65536;
                }
                i20 |= i30;
            }
            if ((i3 & 3670016) != 0) {
                if ((i4 & 65536) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i20 |= i29;
            }
            if ((i4 & 131072) != 0) {
                if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i23 = 8388608;
                    } else {
                        i23 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((i5 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i4 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i5 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i32 != 0) {
                            function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                        } else {
                            function2M1065getLambda1$material_release = function2;
                        }
                        if (i6 != 0) {
                            function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                        } else {
                            function2M1066getLambda2$material_release = function3;
                        }
                        if (i8 != 0) {
                            function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                        } else {
                            function3M1067getLambda3$material_release = function4;
                        }
                        if (i10 != 0) {
                            function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                        } else {
                            function2M1068getLambda4$material_release = function5;
                        }
                        if (i12 != 0) {
                            iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                        }
                        if (i14 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i16 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                        function9 = function8;
                        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i20 &= -15;
                        } else {
                            large = shape;
                        }
                        i24 = i20;
                        if (i21 != 0) {
                            fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                        } else {
                            fM1079getElevationD9Ej5fM = f;
                        }
                        if ((i4 & 4096) != 0) {
                            boolean z19 = z4;
                            i25 = i24 & (-897);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            z5 = z19;
                        } else {
                            z5 = z4;
                            i25 = i24;
                            jM1043getSurface0d7_KjU = j;
                        }
                        float f9 = fM1079getElevationD9Ej5fM;
                        if ((i4 & 8192) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                            i25 &= -7169;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if ((i4 & 16384) != 0) {
                            i26 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i25 &= -57345;
                        } else {
                            i26 = 6;
                            scrimColor = j3;
                        }
                        if ((32768 & i4) != 0) {
                            jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                            i25 &= -458753;
                        } else {
                            jM1032getBackground0d7_KjU = j4;
                        }
                        if ((i4 & 65536) != 0) {
                            i27 = i25 & (-3670017);
                            jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                        } else {
                            jM1057contentColorForek8zF_U2 = j5;
                            i27 = i25;
                        }
                        j6 = jM1057contentColorForek8zF_U;
                        f2 = f9;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i4 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i5 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i32 != 0) {
                            function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                        } else {
                            function2M1065getLambda1$material_release = function2;
                        }
                        if (i6 != 0) {
                            function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                        } else {
                            function2M1066getLambda2$material_release = function3;
                        }
                        if (i8 != 0) {
                            function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                        } else {
                            function3M1067getLambda3$material_release = function4;
                        }
                        if (i10 != 0) {
                            function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                        } else {
                            function2M1068getLambda4$material_release = function5;
                        }
                        if (i12 != 0) {
                            iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                        }
                        if (i14 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i16 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                        function9 = function8;
                        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i20 &= -15;
                        } else {
                            large = shape;
                        }
                        i24 = i20;
                        if (i21 != 0) {
                            fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                        } else {
                            fM1079getElevationD9Ej5fM = f;
                        }
                        if ((i4 & 4096) != 0) {
                            boolean z110 = z4;
                            i25 = i24 & (-897);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            z5 = z110;
                        } else {
                            z5 = z4;
                            i25 = i24;
                            jM1043getSurface0d7_KjU = j;
                        }
                        float f10 = fM1079getElevationD9Ej5fM;
                        if ((i4 & 8192) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                            i25 &= -7169;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if ((i4 & 16384) != 0) {
                            i26 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i25 &= -57345;
                        } else {
                            i26 = 6;
                            scrimColor = j3;
                        }
                        if ((32768 & i4) != 0) {
                            jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                            i25 &= -458753;
                        } else {
                            jM1032getBackground0d7_KjU = j4;
                        }
                        if ((i4 & 65536) != 0) {
                            i27 = i25 & (-3670017);
                            jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                        } else {
                            jM1057contentColorForek8zF_U2 = j5;
                            i27 = i25;
                        }
                        j6 = jM1057contentColorForek8zF_U;
                        f2 = f10;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1037492569, i5, i27, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                    }
                    final long j110 = jM1032getBackground0d7_KjU;
                    final long j111 = jM1057contentColorForek8zF_U2;
                    final int i319 = i27;
                    final boolean z111 = z3;
                    final int i3110 = iM1110getEnd5ygKITE;
                    final Function2<? super Composer, ? super Integer, Unit> function1110 = function2M1065getLambda1$material_release;
                    final Function2<? super Composer, ? super Integer, Unit> function1111 = function2M1068getLambda4$material_release;
                    final Function2<? super Composer, ? super Integer, Unit> function1112 = function2M1066getLambda2$material_release;
                    final int i3111 = i5;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function1113 = function3M1067getLambda3$material_release;
                    final ScaffoldState scaffoldState7 = scaffoldState2;
                    Function2<? super Composer, ? super Integer, Unit> function1114 = function2M1065getLambda1$material_release;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) {
                            invoke(modifier3, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i3112) {
                            int i3113;
                            Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                            if ((i3112 & 14) == 0) {
                                i3113 = i3112 | (composer2.changed(childModifier) ? 4 : 2);
                            } else {
                                i3113 = i3112;
                            }
                            if ((i3113 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1823402604, i3113, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                            }
                            long j112 = j110;
                            long j113 = j111;
                            final boolean z112 = z111;
                            final int i3114 = i3110;
                            final Function2<? super Composer, ? super Integer, Unit> function20 = function1110;
                            final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function21 = content;
                            final Function2<? super Composer, ? super Integer, Unit> function22 = function1111;
                            final Function2<? super Composer, ? super Integer, Unit> function23 = function1112;
                            final int i40 = i3111;
                            final int i41 = i319;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function24 = function1113;
                            final ScaffoldState scaffoldState8 = scaffoldState7;
                            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                                public final void invoke(@Nullable Composer composer3, int i42) {
                                    if ((i42 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1128984656, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                                    }
                                    boolean z113 = z112;
                                    int i43 = i3114;
                                    Function2<Composer, Integer, Unit> function25 = function20;
                                    Function3<PaddingValues, Composer, Integer, Unit> function26 = function21;
                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function27 = function24;
                                    final ScaffoldState scaffoldState9 = scaffoldState8;
                                    final int i44 = i40;
                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i45) {
                                            if ((i45 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(533782017, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                            }
                                            function27.invoke(scaffoldState9.getSnackbarHostState(), composer4, Integer.valueOf((i44 >> 9) & 112));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    });
                                    Function2<Composer, Integer, Unit> function28 = function22;
                                    Function2<Composer, Integer, Unit> function29 = function23;
                                    int i45 = i40;
                                    ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z113, i43, function25, function26, composableLambda3, function28, function29, composer3, ((i45 >> 21) & 14) | 24576 | ((i45 >> 15) & 112) | (i45 & 896) | ((i41 >> 12) & 7168) | (458752 & i45) | ((i45 << 9) & 3670016));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                            int i42 = 1572864 | (i3113 & 14);
                            int i43 = i319;
                            SurfaceKt.m1201SurfaceFjzlyU(childModifier, null, j112, j113, null, 0.0f, composableLambda2, composer2, i42 | ((i43 >> 9) & 896) | ((i43 >> 9) & 7168), 50);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    if (function9 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1013848234);
                        int i3112 = i27 << 12;
                        DrawerKt.m1082ModalDrawerGs3lGvM(function9, modifier2, scaffoldState2.getDrawerState(), z5, large, f2, jM1043getSurface0d7_KjU, j6, scrimColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                            public final void invoke(@Nullable Composer composer2, int i3113) {
                                if ((i3113 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(100842932, i3113, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                                }
                                composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i3112 & 57344) | (i3112 & 458752) | (i3112 & 3670016) | (i3112 & 29360128) | (i3112 & 234881024), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1013847725);
                        composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i5 & 14) | 48));
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scaffoldState3 = scaffoldState2;
                    function10 = function2M1068getLambda4$material_release;
                    f3 = f2;
                    j7 = jM1043getSurface0d7_KjU;
                    j8 = j6;
                    j9 = scrimColor;
                    j10 = jM1032getBackground0d7_KjU;
                    j11 = jM1057contentColorForek8zF_U2;
                    function11 = function9;
                    function12 = function1114;
                    int i3113 = iM1110getEnd5ygKITE;
                    z6 = z5;
                    function13 = function2M1066getLambda2$material_release;
                    i28 = i3113;
                    boolean z112 = z3;
                    shape2 = large;
                    function14 = function3M1067getLambda3$material_release;
                    z7 = z112;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i4 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i5 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i32 != 0) {
                            function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                        } else {
                            function2M1065getLambda1$material_release = function2;
                        }
                        if (i6 != 0) {
                            function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                        } else {
                            function2M1066getLambda2$material_release = function3;
                        }
                        if (i8 != 0) {
                            function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                        } else {
                            function3M1067getLambda3$material_release = function4;
                        }
                        if (i10 != 0) {
                            function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                        } else {
                            function2M1068getLambda4$material_release = function5;
                        }
                        if (i12 != 0) {
                            iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                        }
                        if (i14 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i16 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                        function9 = function8;
                        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i20 &= -15;
                        } else {
                            large = shape;
                        }
                        i24 = i20;
                        if (i21 != 0) {
                            fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                        } else {
                            fM1079getElevationD9Ej5fM = f;
                        }
                        if ((i4 & 4096) != 0) {
                            boolean z113 = z4;
                            i25 = i24 & (-897);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            z5 = z113;
                        } else {
                            z5 = z4;
                            i25 = i24;
                            jM1043getSurface0d7_KjU = j;
                        }
                        float f11 = fM1079getElevationD9Ej5fM;
                        if ((i4 & 8192) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                            i25 &= -7169;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if ((i4 & 16384) != 0) {
                            i26 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i25 &= -57345;
                        } else {
                            i26 = 6;
                            scrimColor = j3;
                        }
                        if ((32768 & i4) != 0) {
                            jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                            i25 &= -458753;
                        } else {
                            jM1032getBackground0d7_KjU = j4;
                        }
                        if ((i4 & 65536) != 0) {
                            i27 = i25 & (-3670017);
                            jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                        } else {
                            jM1057contentColorForek8zF_U2 = j5;
                            i27 = i25;
                        }
                        j6 = jM1057contentColorForek8zF_U;
                        f2 = f11;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i4 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i5 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i32 != 0) {
                            function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                        } else {
                            function2M1065getLambda1$material_release = function2;
                        }
                        if (i6 != 0) {
                            function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                        } else {
                            function2M1066getLambda2$material_release = function3;
                        }
                        if (i8 != 0) {
                            function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                        } else {
                            function3M1067getLambda3$material_release = function4;
                        }
                        if (i10 != 0) {
                            function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                        } else {
                            function2M1068getLambda4$material_release = function5;
                        }
                        if (i12 != 0) {
                            iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                        }
                        if (i14 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i16 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                        function9 = function8;
                        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i20 &= -15;
                        } else {
                            large = shape;
                        }
                        i24 = i20;
                        if (i21 != 0) {
                            fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                        } else {
                            fM1079getElevationD9Ej5fM = f;
                        }
                        if ((i4 & 4096) != 0) {
                            boolean z114 = z4;
                            i25 = i24 & (-897);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            z5 = z114;
                        } else {
                            z5 = z4;
                            i25 = i24;
                            jM1043getSurface0d7_KjU = j;
                        }
                        float f12 = fM1079getElevationD9Ej5fM;
                        if ((i4 & 8192) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                            i25 &= -7169;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if ((i4 & 16384) != 0) {
                            i26 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i25 &= -57345;
                        } else {
                            i26 = 6;
                            scrimColor = j3;
                        }
                        if ((32768 & i4) != 0) {
                            jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                            i25 &= -458753;
                        } else {
                            jM1032getBackground0d7_KjU = j4;
                        }
                        if ((i4 & 65536) != 0) {
                            i27 = i25 & (-3670017);
                            jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                        } else {
                            jM1057contentColorForek8zF_U2 = j5;
                            i27 = i25;
                        }
                        j6 = jM1057contentColorForek8zF_U;
                        f2 = f12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1037492569, i5, i27, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                    }
                    final long j112 = jM1032getBackground0d7_KjU;
                    final long j113 = jM1057contentColorForek8zF_U2;
                    final int i3114 = i27;
                    final boolean z115 = z3;
                    final int i3115 = iM1110getEnd5ygKITE;
                    final Function2<? super Composer, ? super Integer, Unit> function1115 = function2M1065getLambda1$material_release;
                    final Function2<? super Composer, ? super Integer, Unit> function1116 = function2M1068getLambda4$material_release;
                    final Function2<? super Composer, ? super Integer, Unit> function1117 = function2M1066getLambda2$material_release;
                    final int i3116 = i5;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function1118 = function3M1067getLambda3$material_release;
                    final ScaffoldState scaffoldState8 = scaffoldState2;
                    Function2<? super Composer, ? super Integer, Unit> function1119 = function2M1065getLambda1$material_release;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) {
                            invoke(modifier3, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i3117) {
                            int i3118;
                            Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                            if ((i3117 & 14) == 0) {
                                i3118 = i3117 | (composer2.changed(childModifier) ? 4 : 2);
                            } else {
                                i3118 = i3117;
                            }
                            if ((i3118 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1823402604, i3118, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                            }
                            long j114 = j112;
                            long j115 = j113;
                            final boolean z116 = z115;
                            final int i3119 = i3115;
                            final Function2<? super Composer, ? super Integer, Unit> function20 = function1115;
                            final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function21 = content;
                            final Function2<? super Composer, ? super Integer, Unit> function22 = function1116;
                            final Function2<? super Composer, ? super Integer, Unit> function23 = function1117;
                            final int i40 = i3116;
                            final int i41 = i3114;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function24 = function1118;
                            final ScaffoldState scaffoldState9 = scaffoldState8;
                            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                                public final void invoke(@Nullable Composer composer3, int i42) {
                                    if ((i42 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1128984656, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                                    }
                                    boolean z117 = z116;
                                    int i43 = i3119;
                                    Function2<Composer, Integer, Unit> function25 = function20;
                                    Function3<PaddingValues, Composer, Integer, Unit> function26 = function21;
                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function27 = function24;
                                    final ScaffoldState scaffoldState10 = scaffoldState9;
                                    final int i44 = i40;
                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i45) {
                                            if ((i45 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(533782017, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                            }
                                            function27.invoke(scaffoldState10.getSnackbarHostState(), composer4, Integer.valueOf((i44 >> 9) & 112));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    });
                                    Function2<Composer, Integer, Unit> function28 = function22;
                                    Function2<Composer, Integer, Unit> function29 = function23;
                                    int i45 = i40;
                                    ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z117, i43, function25, function26, composableLambda3, function28, function29, composer3, ((i45 >> 21) & 14) | 24576 | ((i45 >> 15) & 112) | (i45 & 896) | ((i41 >> 12) & 7168) | (458752 & i45) | ((i45 << 9) & 3670016));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                            int i42 = 1572864 | (i3118 & 14);
                            int i43 = i3114;
                            SurfaceKt.m1201SurfaceFjzlyU(childModifier, null, j114, j115, null, 0.0f, composableLambda2, composer2, i42 | ((i43 >> 9) & 896) | ((i43 >> 9) & 7168), 50);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    if (function9 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1013848234);
                        int i3117 = i27 << 12;
                        DrawerKt.m1082ModalDrawerGs3lGvM(function9, modifier2, scaffoldState2.getDrawerState(), z5, large, f2, jM1043getSurface0d7_KjU, j6, scrimColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                            public final void invoke(@Nullable Composer composer2, int i3118) {
                                if ((i3118 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(100842932, i3118, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                                }
                                composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i3117 & 57344) | (i3117 & 458752) | (i3117 & 3670016) | (i3117 & 29360128) | (i3117 & 234881024), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1013847725);
                        composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i5 & 14) | 48));
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scaffoldState3 = scaffoldState2;
                    function10 = function2M1068getLambda4$material_release;
                    f3 = f2;
                    j7 = jM1043getSurface0d7_KjU;
                    j8 = j6;
                    j9 = scrimColor;
                    j10 = jM1032getBackground0d7_KjU;
                    j11 = jM1057contentColorForek8zF_U2;
                    function11 = function9;
                    function12 = function1119;
                    int i3118 = iM1110getEnd5ygKITE;
                    z6 = z5;
                    function13 = function2M1066getLambda2$material_release;
                    i28 = i3118;
                    boolean z116 = z3;
                    shape2 = large;
                    function14 = function3M1067getLambda3$material_release;
                    z7 = z116;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final long j114 = j8;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
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

                    public final void invoke(@Nullable Composer composer2, int i3119) {
                        ScaffoldKt.m1172Scaffold27mzLpw(modifier2, scaffoldState3, function12, function13, function14, function10, i28, z7, function11, z6, shape2, f3, j7, j114, j9, j10, j11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                    }
                });
            }
            i23 = 12582912;
            i20 |= i23;
            if ((i5 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i4 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i5 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i32 != 0) {
                        function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                    } else {
                        function2M1065getLambda1$material_release = function2;
                    }
                    if (i6 != 0) {
                        function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                    } else {
                        function2M1066getLambda2$material_release = function3;
                    }
                    if (i8 != 0) {
                        function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                    } else {
                        function3M1067getLambda3$material_release = function4;
                    }
                    if (i10 != 0) {
                        function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                    } else {
                        function2M1068getLambda4$material_release = function5;
                    }
                    if (i12 != 0) {
                        iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                    }
                    if (i14 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i16 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    scaffoldState2 = scaffoldStateRememberScaffoldState;
                    function9 = function8;
                    if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i20 &= -15;
                    } else {
                        large = shape;
                    }
                    i24 = i20;
                    if (i21 != 0) {
                        fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                    } else {
                        fM1079getElevationD9Ej5fM = f;
                    }
                    if ((i4 & 4096) != 0) {
                        boolean z117 = z4;
                        i25 = i24 & (-897);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        z5 = z117;
                    } else {
                        z5 = z4;
                        i25 = i24;
                        jM1043getSurface0d7_KjU = j;
                    }
                    float f13 = fM1079getElevationD9Ej5fM;
                    if ((i4 & 8192) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                        i25 &= -7169;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i4 & 16384) != 0) {
                        i26 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i25 &= -57345;
                    } else {
                        i26 = 6;
                        scrimColor = j3;
                    }
                    if ((32768 & i4) != 0) {
                        jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                        i25 &= -458753;
                    } else {
                        jM1032getBackground0d7_KjU = j4;
                    }
                    if ((i4 & 65536) != 0) {
                        i27 = i25 & (-3670017);
                        jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                    } else {
                        jM1057contentColorForek8zF_U2 = j5;
                        i27 = i25;
                    }
                    j6 = jM1057contentColorForek8zF_U;
                    f2 = f13;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i4 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i5 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i32 != 0) {
                        function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                    } else {
                        function2M1065getLambda1$material_release = function2;
                    }
                    if (i6 != 0) {
                        function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                    } else {
                        function2M1066getLambda2$material_release = function3;
                    }
                    if (i8 != 0) {
                        function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                    } else {
                        function3M1067getLambda3$material_release = function4;
                    }
                    if (i10 != 0) {
                        function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                    } else {
                        function2M1068getLambda4$material_release = function5;
                    }
                    if (i12 != 0) {
                        iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                    }
                    if (i14 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i16 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    scaffoldState2 = scaffoldStateRememberScaffoldState;
                    function9 = function8;
                    if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i20 &= -15;
                    } else {
                        large = shape;
                    }
                    i24 = i20;
                    if (i21 != 0) {
                        fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                    } else {
                        fM1079getElevationD9Ej5fM = f;
                    }
                    if ((i4 & 4096) != 0) {
                        boolean z118 = z4;
                        i25 = i24 & (-897);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        z5 = z118;
                    } else {
                        z5 = z4;
                        i25 = i24;
                        jM1043getSurface0d7_KjU = j;
                    }
                    float f14 = fM1079getElevationD9Ej5fM;
                    if ((i4 & 8192) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                        i25 &= -7169;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i4 & 16384) != 0) {
                        i26 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i25 &= -57345;
                    } else {
                        i26 = 6;
                        scrimColor = j3;
                    }
                    if ((32768 & i4) != 0) {
                        jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                        i25 &= -458753;
                    } else {
                        jM1032getBackground0d7_KjU = j4;
                    }
                    if ((i4 & 65536) != 0) {
                        i27 = i25 & (-3670017);
                        jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                    } else {
                        jM1057contentColorForek8zF_U2 = j5;
                        i27 = i25;
                    }
                    j6 = jM1057contentColorForek8zF_U;
                    f2 = f14;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1037492569, i5, i27, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                }
                final long j115 = jM1032getBackground0d7_KjU;
                final long j116 = jM1057contentColorForek8zF_U2;
                final int i3119 = i27;
                final boolean z119 = z3;
                final int i31110 = iM1110getEnd5ygKITE;
                final Function2<? super Composer, ? super Integer, Unit> function11110 = function2M1065getLambda1$material_release;
                final Function2<? super Composer, ? super Integer, Unit> function11111 = function2M1068getLambda4$material_release;
                final Function2<? super Composer, ? super Integer, Unit> function11112 = function2M1066getLambda2$material_release;
                final int i31111 = i5;
                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function11113 = function3M1067getLambda3$material_release;
                final ScaffoldState scaffoldState9 = scaffoldState2;
                Function2<? super Composer, ? super Integer, Unit> function11114 = function2M1065getLambda1$material_release;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) {
                        invoke(modifier3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i31112) {
                        int i31113;
                        Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                        if ((i31112 & 14) == 0) {
                            i31113 = i31112 | (composer2.changed(childModifier) ? 4 : 2);
                        } else {
                            i31113 = i31112;
                        }
                        if ((i31113 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1823402604, i31113, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                        }
                        long j117 = j115;
                        long j118 = j116;
                        final boolean z1110 = z119;
                        final int i31114 = i31110;
                        final Function2<? super Composer, ? super Integer, Unit> function20 = function11110;
                        final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function21 = content;
                        final Function2<? super Composer, ? super Integer, Unit> function22 = function11111;
                        final Function2<? super Composer, ? super Integer, Unit> function23 = function11112;
                        final int i40 = i31111;
                        final int i41 = i3119;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function24 = function11113;
                        final ScaffoldState scaffoldState10 = scaffoldState9;
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                            public final void invoke(@Nullable Composer composer3, int i42) {
                                if ((i42 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1128984656, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                                }
                                boolean z1111 = z1110;
                                int i43 = i31114;
                                Function2<Composer, Integer, Unit> function25 = function20;
                                Function3<PaddingValues, Composer, Integer, Unit> function26 = function21;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function27 = function24;
                                final ScaffoldState scaffoldState11 = scaffoldState10;
                                final int i44 = i40;
                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i45) {
                                        if ((i45 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(533782017, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                        }
                                        function27.invoke(scaffoldState11.getSnackbarHostState(), composer4, Integer.valueOf((i44 >> 9) & 112));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                });
                                Function2<Composer, Integer, Unit> function28 = function22;
                                Function2<Composer, Integer, Unit> function29 = function23;
                                int i45 = i40;
                                ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z1111, i43, function25, function26, composableLambda3, function28, function29, composer3, ((i45 >> 21) & 14) | 24576 | ((i45 >> 15) & 112) | (i45 & 896) | ((i41 >> 12) & 7168) | (458752 & i45) | ((i45 << 9) & 3670016));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i42 = 1572864 | (i31113 & 14);
                        int i43 = i3119;
                        SurfaceKt.m1201SurfaceFjzlyU(childModifier, null, j117, j118, null, 0.0f, composableLambda2, composer2, i42 | ((i43 >> 9) & 896) | ((i43 >> 9) & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                if (function9 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1013848234);
                    int i31112 = i27 << 12;
                    DrawerKt.m1082ModalDrawerGs3lGvM(function9, modifier2, scaffoldState2.getDrawerState(), z5, large, f2, jM1043getSurface0d7_KjU, j6, scrimColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                        public final void invoke(@Nullable Composer composer2, int i31113) {
                            if ((i31113 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(100842932, i31113, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                            }
                            composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i31112 & 57344) | (i31112 & 458752) | (i31112 & 3670016) | (i31112 & 29360128) | (i31112 & 234881024), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1013847725);
                    composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i5 & 14) | 48));
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scaffoldState3 = scaffoldState2;
                function10 = function2M1068getLambda4$material_release;
                f3 = f2;
                j7 = jM1043getSurface0d7_KjU;
                j8 = j6;
                j9 = scrimColor;
                j10 = jM1032getBackground0d7_KjU;
                j11 = jM1057contentColorForek8zF_U2;
                function11 = function9;
                function12 = function11114;
                int i31113 = iM1110getEnd5ygKITE;
                z6 = z5;
                function13 = function2M1066getLambda2$material_release;
                i28 = i31113;
                boolean z1110 = z3;
                shape2 = large;
                function14 = function3M1067getLambda3$material_release;
                z7 = z1110;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i4 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i5 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i32 != 0) {
                        function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                    } else {
                        function2M1065getLambda1$material_release = function2;
                    }
                    if (i6 != 0) {
                        function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                    } else {
                        function2M1066getLambda2$material_release = function3;
                    }
                    if (i8 != 0) {
                        function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                    } else {
                        function3M1067getLambda3$material_release = function4;
                    }
                    if (i10 != 0) {
                        function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                    } else {
                        function2M1068getLambda4$material_release = function5;
                    }
                    if (i12 != 0) {
                        iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                    }
                    if (i14 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i16 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    scaffoldState2 = scaffoldStateRememberScaffoldState;
                    function9 = function8;
                    if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i20 &= -15;
                    } else {
                        large = shape;
                    }
                    i24 = i20;
                    if (i21 != 0) {
                        fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                    } else {
                        fM1079getElevationD9Ej5fM = f;
                    }
                    if ((i4 & 4096) != 0) {
                        boolean z1111 = z4;
                        i25 = i24 & (-897);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        z5 = z1111;
                    } else {
                        z5 = z4;
                        i25 = i24;
                        jM1043getSurface0d7_KjU = j;
                    }
                    float f15 = fM1079getElevationD9Ej5fM;
                    if ((i4 & 8192) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                        i25 &= -7169;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i4 & 16384) != 0) {
                        i26 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i25 &= -57345;
                    } else {
                        i26 = 6;
                        scrimColor = j3;
                    }
                    if ((32768 & i4) != 0) {
                        jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                        i25 &= -458753;
                    } else {
                        jM1032getBackground0d7_KjU = j4;
                    }
                    if ((i4 & 65536) != 0) {
                        i27 = i25 & (-3670017);
                        jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                    } else {
                        jM1057contentColorForek8zF_U2 = j5;
                        i27 = i25;
                    }
                    j6 = jM1057contentColorForek8zF_U;
                    f2 = f15;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i4 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i5 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i32 != 0) {
                        function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                    } else {
                        function2M1065getLambda1$material_release = function2;
                    }
                    if (i6 != 0) {
                        function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                    } else {
                        function2M1066getLambda2$material_release = function3;
                    }
                    if (i8 != 0) {
                        function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                    } else {
                        function3M1067getLambda3$material_release = function4;
                    }
                    if (i10 != 0) {
                        function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                    } else {
                        function2M1068getLambda4$material_release = function5;
                    }
                    if (i12 != 0) {
                        iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                    }
                    if (i14 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i16 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    scaffoldState2 = scaffoldStateRememberScaffoldState;
                    function9 = function8;
                    if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i20 &= -15;
                    } else {
                        large = shape;
                    }
                    i24 = i20;
                    if (i21 != 0) {
                        fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                    } else {
                        fM1079getElevationD9Ej5fM = f;
                    }
                    if ((i4 & 4096) != 0) {
                        boolean z1112 = z4;
                        i25 = i24 & (-897);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        z5 = z1112;
                    } else {
                        z5 = z4;
                        i25 = i24;
                        jM1043getSurface0d7_KjU = j;
                    }
                    float f16 = fM1079getElevationD9Ej5fM;
                    if ((i4 & 8192) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                        i25 &= -7169;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i4 & 16384) != 0) {
                        i26 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i25 &= -57345;
                    } else {
                        i26 = 6;
                        scrimColor = j3;
                    }
                    if ((32768 & i4) != 0) {
                        jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                        i25 &= -458753;
                    } else {
                        jM1032getBackground0d7_KjU = j4;
                    }
                    if ((i4 & 65536) != 0) {
                        i27 = i25 & (-3670017);
                        jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                    } else {
                        jM1057contentColorForek8zF_U2 = j5;
                        i27 = i25;
                    }
                    j6 = jM1057contentColorForek8zF_U;
                    f2 = f16;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1037492569, i5, i27, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                }
                final long j117 = jM1032getBackground0d7_KjU;
                final long j118 = jM1057contentColorForek8zF_U2;
                final int i31114 = i27;
                final boolean z1113 = z3;
                final int i31115 = iM1110getEnd5ygKITE;
                final Function2<? super Composer, ? super Integer, Unit> function11115 = function2M1065getLambda1$material_release;
                final Function2<? super Composer, ? super Integer, Unit> function11116 = function2M1068getLambda4$material_release;
                final Function2<? super Composer, ? super Integer, Unit> function11117 = function2M1066getLambda2$material_release;
                final int i31116 = i5;
                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function11118 = function3M1067getLambda3$material_release;
                final ScaffoldState scaffoldState10 = scaffoldState2;
                Function2<? super Composer, ? super Integer, Unit> function11119 = function2M1065getLambda1$material_release;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) {
                        invoke(modifier3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i31117) {
                        int i31118;
                        Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                        if ((i31117 & 14) == 0) {
                            i31118 = i31117 | (composer2.changed(childModifier) ? 4 : 2);
                        } else {
                            i31118 = i31117;
                        }
                        if ((i31118 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1823402604, i31118, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                        }
                        long j119 = j117;
                        long j1110 = j118;
                        final boolean z1114 = z1113;
                        final int i31119 = i31115;
                        final Function2<? super Composer, ? super Integer, Unit> function20 = function11115;
                        final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function21 = content;
                        final Function2<? super Composer, ? super Integer, Unit> function22 = function11116;
                        final Function2<? super Composer, ? super Integer, Unit> function23 = function11117;
                        final int i40 = i31116;
                        final int i41 = i31114;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function24 = function11118;
                        final ScaffoldState scaffoldState11 = scaffoldState10;
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                            public final void invoke(@Nullable Composer composer3, int i42) {
                                if ((i42 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1128984656, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                                }
                                boolean z1115 = z1114;
                                int i43 = i31119;
                                Function2<Composer, Integer, Unit> function25 = function20;
                                Function3<PaddingValues, Composer, Integer, Unit> function26 = function21;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function27 = function24;
                                final ScaffoldState scaffoldState12 = scaffoldState11;
                                final int i44 = i40;
                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i45) {
                                        if ((i45 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(533782017, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                        }
                                        function27.invoke(scaffoldState12.getSnackbarHostState(), composer4, Integer.valueOf((i44 >> 9) & 112));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                });
                                Function2<Composer, Integer, Unit> function28 = function22;
                                Function2<Composer, Integer, Unit> function29 = function23;
                                int i45 = i40;
                                ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z1115, i43, function25, function26, composableLambda3, function28, function29, composer3, ((i45 >> 21) & 14) | 24576 | ((i45 >> 15) & 112) | (i45 & 896) | ((i41 >> 12) & 7168) | (458752 & i45) | ((i45 << 9) & 3670016));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i42 = 1572864 | (i31118 & 14);
                        int i43 = i31114;
                        SurfaceKt.m1201SurfaceFjzlyU(childModifier, null, j119, j1110, null, 0.0f, composableLambda2, composer2, i42 | ((i43 >> 9) & 896) | ((i43 >> 9) & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                if (function9 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1013848234);
                    int i31117 = i27 << 12;
                    DrawerKt.m1082ModalDrawerGs3lGvM(function9, modifier2, scaffoldState2.getDrawerState(), z5, large, f2, jM1043getSurface0d7_KjU, j6, scrimColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                        public final void invoke(@Nullable Composer composer2, int i31118) {
                            if ((i31118 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(100842932, i31118, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                            }
                            composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i31117 & 57344) | (i31117 & 458752) | (i31117 & 3670016) | (i31117 & 29360128) | (i31117 & 234881024), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1013847725);
                    composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i5 & 14) | 48));
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scaffoldState3 = scaffoldState2;
                function10 = function2M1068getLambda4$material_release;
                f3 = f2;
                j7 = jM1043getSurface0d7_KjU;
                j8 = j6;
                j9 = scrimColor;
                j10 = jM1032getBackground0d7_KjU;
                j11 = jM1057contentColorForek8zF_U2;
                function11 = function9;
                function12 = function11119;
                int i31118 = iM1110getEnd5ygKITE;
                z6 = z5;
                function13 = function2M1066getLambda2$material_release;
                i28 = i31118;
                boolean z1114 = z3;
                shape2 = large;
                function14 = function3M1067getLambda3$material_release;
                z7 = z1114;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final long j119 = j8;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
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

                public final void invoke(@Nullable Composer composer2, int i31119) {
                    ScaffoldKt.m1172Scaffold27mzLpw(modifier2, scaffoldState3, function12, function13, function14, function10, i28, z7, function11, z6, shape2, f3, j7, j119, j9, j10, j11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
        i5 |= 384;
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i2 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i5 |= i7;
            }
            i8 = i4 & 16;
            if (i8 != 0) {
                i5 |= 24576;
            } else if ((i2 & 57344) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i5 |= i9;
            }
            i10 = i4 & 32;
            if (i10 != 0) {
                i5 |= 196608;
                function7 = function5;
            } else {
                function7 = function5;
                if ((i2 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i5 |= i11;
                }
            }
            i12 = i4 & 64;
            if (i12 != 0) {
                i5 |= 1572864;
                iM1110getEnd5ygKITE = i;
            } else {
                iM1110getEnd5ygKITE = i;
                if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(iM1110getEnd5ygKITE)) {
                        i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i13 = 524288;
                    }
                    i5 |= i13;
                }
            }
            i14 = i4 & 128;
            if (i14 != 0) {
                i5 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i15 = 8388608;
                } else {
                    i15 = Configuration.BLOCK_SIZE;
                }
                i5 |= i15;
            }
            i16 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i16 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i5 |= i17;
            }
            i18 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i18 != 0) {
                i5 |= 805306368;
            } else if ((i2 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i19 = 536870912;
                } else {
                    i19 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i5 |= i19;
            }
            if ((i3 & 14) == 0) {
                i20 = i3 | (((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0 || !composerStartRestartGroup.changed(shape)) ? 2 : 4);
            } else {
                i20 = i3;
            }
            i21 = i4 & 2048;
            if (i21 != 0) {
                i20 |= 48;
            } else if ((i3 & 112) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i20 |= i22;
            }
            if ((i3 & 896) != 0) {
                i20 |= ((i4 & 4096) == 0 || !composerStartRestartGroup.changed(j)) ? 128 : PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            if ((i3 & 7168) != 0) {
                i20 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(j2)) ? 1024 : 2048;
            }
            if ((i3 & 57344) != 0) {
                i20 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(j3)) ? 8192 : 16384;
            }
            if ((i3 & 458752) != 0) {
                if ((i4 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                    i30 = 65536;
                } else {
                    i30 = 65536;
                }
                i20 |= i30;
            }
            if ((i3 & 3670016) != 0) {
                if ((i4 & 65536) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i20 |= i29;
            }
            if ((i4 & 131072) != 0) {
                if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i23 = 8388608;
                    } else {
                        i23 = Configuration.BLOCK_SIZE;
                    }
                }
                if ((i5 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i4 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i5 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i32 != 0) {
                            function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                        } else {
                            function2M1065getLambda1$material_release = function2;
                        }
                        if (i6 != 0) {
                            function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                        } else {
                            function2M1066getLambda2$material_release = function3;
                        }
                        if (i8 != 0) {
                            function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                        } else {
                            function3M1067getLambda3$material_release = function4;
                        }
                        if (i10 != 0) {
                            function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                        } else {
                            function2M1068getLambda4$material_release = function5;
                        }
                        if (i12 != 0) {
                            iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                        }
                        if (i14 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i16 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                        function9 = function8;
                        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i20 &= -15;
                        } else {
                            large = shape;
                        }
                        i24 = i20;
                        if (i21 != 0) {
                            fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                        } else {
                            fM1079getElevationD9Ej5fM = f;
                        }
                        if ((i4 & 4096) != 0) {
                            boolean z1115 = z4;
                            i25 = i24 & (-897);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            z5 = z1115;
                        } else {
                            z5 = z4;
                            i25 = i24;
                            jM1043getSurface0d7_KjU = j;
                        }
                        float f17 = fM1079getElevationD9Ej5fM;
                        if ((i4 & 8192) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                            i25 &= -7169;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if ((i4 & 16384) != 0) {
                            i26 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i25 &= -57345;
                        } else {
                            i26 = 6;
                            scrimColor = j3;
                        }
                        if ((32768 & i4) != 0) {
                            jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                            i25 &= -458753;
                        } else {
                            jM1032getBackground0d7_KjU = j4;
                        }
                        if ((i4 & 65536) != 0) {
                            i27 = i25 & (-3670017);
                            jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                        } else {
                            jM1057contentColorForek8zF_U2 = j5;
                            i27 = i25;
                        }
                        j6 = jM1057contentColorForek8zF_U;
                        f2 = f17;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i4 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i5 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i32 != 0) {
                            function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                        } else {
                            function2M1065getLambda1$material_release = function2;
                        }
                        if (i6 != 0) {
                            function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                        } else {
                            function2M1066getLambda2$material_release = function3;
                        }
                        if (i8 != 0) {
                            function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                        } else {
                            function3M1067getLambda3$material_release = function4;
                        }
                        if (i10 != 0) {
                            function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                        } else {
                            function2M1068getLambda4$material_release = function5;
                        }
                        if (i12 != 0) {
                            iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                        }
                        if (i14 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i16 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                        function9 = function8;
                        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i20 &= -15;
                        } else {
                            large = shape;
                        }
                        i24 = i20;
                        if (i21 != 0) {
                            fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                        } else {
                            fM1079getElevationD9Ej5fM = f;
                        }
                        if ((i4 & 4096) != 0) {
                            boolean z1116 = z4;
                            i25 = i24 & (-897);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            z5 = z1116;
                        } else {
                            z5 = z4;
                            i25 = i24;
                            jM1043getSurface0d7_KjU = j;
                        }
                        float f18 = fM1079getElevationD9Ej5fM;
                        if ((i4 & 8192) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                            i25 &= -7169;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if ((i4 & 16384) != 0) {
                            i26 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i25 &= -57345;
                        } else {
                            i26 = 6;
                            scrimColor = j3;
                        }
                        if ((32768 & i4) != 0) {
                            jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                            i25 &= -458753;
                        } else {
                            jM1032getBackground0d7_KjU = j4;
                        }
                        if ((i4 & 65536) != 0) {
                            i27 = i25 & (-3670017);
                            jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                        } else {
                            jM1057contentColorForek8zF_U2 = j5;
                            i27 = i25;
                        }
                        j6 = jM1057contentColorForek8zF_U;
                        f2 = f18;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1037492569, i5, i27, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                    }
                    final long j1110 = jM1032getBackground0d7_KjU;
                    final long j1111 = jM1057contentColorForek8zF_U2;
                    final int i31119 = i27;
                    final boolean z1117 = z3;
                    final int i311110 = iM1110getEnd5ygKITE;
                    final Function2<? super Composer, ? super Integer, Unit> function111110 = function2M1065getLambda1$material_release;
                    final Function2<? super Composer, ? super Integer, Unit> function111111 = function2M1068getLambda4$material_release;
                    final Function2<? super Composer, ? super Integer, Unit> function111112 = function2M1066getLambda2$material_release;
                    final int i311111 = i5;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function111113 = function3M1067getLambda3$material_release;
                    final ScaffoldState scaffoldState11 = scaffoldState2;
                    Function2<? super Composer, ? super Integer, Unit> function111114 = function2M1065getLambda1$material_release;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) {
                            invoke(modifier3, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i311112) {
                            int i311113;
                            Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                            if ((i311112 & 14) == 0) {
                                i311113 = i311112 | (composer2.changed(childModifier) ? 4 : 2);
                            } else {
                                i311113 = i311112;
                            }
                            if ((i311113 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1823402604, i311113, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                            }
                            long j1112 = j1110;
                            long j1113 = j1111;
                            final boolean z1118 = z1117;
                            final int i311114 = i311110;
                            final Function2<? super Composer, ? super Integer, Unit> function20 = function111110;
                            final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function21 = content;
                            final Function2<? super Composer, ? super Integer, Unit> function22 = function111111;
                            final Function2<? super Composer, ? super Integer, Unit> function23 = function111112;
                            final int i40 = i311111;
                            final int i41 = i31119;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function24 = function111113;
                            final ScaffoldState scaffoldState12 = scaffoldState11;
                            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                                public final void invoke(@Nullable Composer composer3, int i42) {
                                    if ((i42 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1128984656, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                                    }
                                    boolean z1119 = z1118;
                                    int i43 = i311114;
                                    Function2<Composer, Integer, Unit> function25 = function20;
                                    Function3<PaddingValues, Composer, Integer, Unit> function26 = function21;
                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function27 = function24;
                                    final ScaffoldState scaffoldState13 = scaffoldState12;
                                    final int i44 = i40;
                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i45) {
                                            if ((i45 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(533782017, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                            }
                                            function27.invoke(scaffoldState13.getSnackbarHostState(), composer4, Integer.valueOf((i44 >> 9) & 112));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    });
                                    Function2<Composer, Integer, Unit> function28 = function22;
                                    Function2<Composer, Integer, Unit> function29 = function23;
                                    int i45 = i40;
                                    ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z1119, i43, function25, function26, composableLambda3, function28, function29, composer3, ((i45 >> 21) & 14) | 24576 | ((i45 >> 15) & 112) | (i45 & 896) | ((i41 >> 12) & 7168) | (458752 & i45) | ((i45 << 9) & 3670016));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                            int i42 = 1572864 | (i311113 & 14);
                            int i43 = i31119;
                            SurfaceKt.m1201SurfaceFjzlyU(childModifier, null, j1112, j1113, null, 0.0f, composableLambda2, composer2, i42 | ((i43 >> 9) & 896) | ((i43 >> 9) & 7168), 50);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    if (function9 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1013848234);
                        int i311112 = i27 << 12;
                        DrawerKt.m1082ModalDrawerGs3lGvM(function9, modifier2, scaffoldState2.getDrawerState(), z5, large, f2, jM1043getSurface0d7_KjU, j6, scrimColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                            public final void invoke(@Nullable Composer composer2, int i311113) {
                                if ((i311113 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(100842932, i311113, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                                }
                                composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i311112 & 57344) | (i311112 & 458752) | (i311112 & 3670016) | (i311112 & 29360128) | (i311112 & 234881024), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1013847725);
                        composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i5 & 14) | 48));
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scaffoldState3 = scaffoldState2;
                    function10 = function2M1068getLambda4$material_release;
                    f3 = f2;
                    j7 = jM1043getSurface0d7_KjU;
                    j8 = j6;
                    j9 = scrimColor;
                    j10 = jM1032getBackground0d7_KjU;
                    j11 = jM1057contentColorForek8zF_U2;
                    function11 = function9;
                    function12 = function111114;
                    int i311113 = iM1110getEnd5ygKITE;
                    z6 = z5;
                    function13 = function2M1066getLambda2$material_release;
                    i28 = i311113;
                    boolean z1118 = z3;
                    shape2 = large;
                    function14 = function3M1067getLambda3$material_release;
                    z7 = z1118;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i4 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i5 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i32 != 0) {
                            function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                        } else {
                            function2M1065getLambda1$material_release = function2;
                        }
                        if (i6 != 0) {
                            function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                        } else {
                            function2M1066getLambda2$material_release = function3;
                        }
                        if (i8 != 0) {
                            function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                        } else {
                            function3M1067getLambda3$material_release = function4;
                        }
                        if (i10 != 0) {
                            function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                        } else {
                            function2M1068getLambda4$material_release = function5;
                        }
                        if (i12 != 0) {
                            iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                        }
                        if (i14 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i16 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                        function9 = function8;
                        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i20 &= -15;
                        } else {
                            large = shape;
                        }
                        i24 = i20;
                        if (i21 != 0) {
                            fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                        } else {
                            fM1079getElevationD9Ej5fM = f;
                        }
                        if ((i4 & 4096) != 0) {
                            boolean z1119 = z4;
                            i25 = i24 & (-897);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            z5 = z1119;
                        } else {
                            z5 = z4;
                            i25 = i24;
                            jM1043getSurface0d7_KjU = j;
                        }
                        float f19 = fM1079getElevationD9Ej5fM;
                        if ((i4 & 8192) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                            i25 &= -7169;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if ((i4 & 16384) != 0) {
                            i26 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i25 &= -57345;
                        } else {
                            i26 = 6;
                            scrimColor = j3;
                        }
                        if ((32768 & i4) != 0) {
                            jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                            i25 &= -458753;
                        } else {
                            jM1032getBackground0d7_KjU = j4;
                        }
                        if ((i4 & 65536) != 0) {
                            i27 = i25 & (-3670017);
                            jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                        } else {
                            jM1057contentColorForek8zF_U2 = j5;
                            i27 = i25;
                        }
                        j6 = jM1057contentColorForek8zF_U;
                        f2 = f19;
                    } else {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i4 & 2) != 0) {
                            scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                            i5 &= -113;
                        } else {
                            scaffoldStateRememberScaffoldState = scaffoldState;
                        }
                        if (i32 != 0) {
                            function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                        } else {
                            function2M1065getLambda1$material_release = function2;
                        }
                        if (i6 != 0) {
                            function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                        } else {
                            function2M1066getLambda2$material_release = function3;
                        }
                        if (i8 != 0) {
                            function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                        } else {
                            function3M1067getLambda3$material_release = function4;
                        }
                        if (i10 != 0) {
                            function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                        } else {
                            function2M1068getLambda4$material_release = function5;
                        }
                        if (i12 != 0) {
                            iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                        }
                        if (i14 != 0) {
                            z3 = false;
                        } else {
                            z3 = z;
                        }
                        if (i16 != 0) {
                            function8 = null;
                        } else {
                            function8 = function6;
                        }
                        if (i18 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        scaffoldState2 = scaffoldStateRememberScaffoldState;
                        function9 = function8;
                        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                            i20 &= -15;
                        } else {
                            large = shape;
                        }
                        i24 = i20;
                        if (i21 != 0) {
                            fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                        } else {
                            fM1079getElevationD9Ej5fM = f;
                        }
                        if ((i4 & 4096) != 0) {
                            boolean z11110 = z4;
                            i25 = i24 & (-897);
                            jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                            z5 = z11110;
                        } else {
                            z5 = z4;
                            i25 = i24;
                            jM1043getSurface0d7_KjU = j;
                        }
                        float f110 = fM1079getElevationD9Ej5fM;
                        if ((i4 & 8192) != 0) {
                            jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                            i25 &= -7169;
                        } else {
                            jM1057contentColorForek8zF_U = j2;
                        }
                        if ((i4 & 16384) != 0) {
                            i26 = 6;
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i25 &= -57345;
                        } else {
                            i26 = 6;
                            scrimColor = j3;
                        }
                        if ((32768 & i4) != 0) {
                            jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                            i25 &= -458753;
                        } else {
                            jM1032getBackground0d7_KjU = j4;
                        }
                        if ((i4 & 65536) != 0) {
                            i27 = i25 & (-3670017);
                            jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                        } else {
                            jM1057contentColorForek8zF_U2 = j5;
                            i27 = i25;
                        }
                        j6 = jM1057contentColorForek8zF_U;
                        f2 = f110;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1037492569, i5, i27, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                    }
                    final long j1112 = jM1032getBackground0d7_KjU;
                    final long j1113 = jM1057contentColorForek8zF_U2;
                    final int i311114 = i27;
                    final boolean z11111 = z3;
                    final int i311115 = iM1110getEnd5ygKITE;
                    final Function2<? super Composer, ? super Integer, Unit> function111115 = function2M1065getLambda1$material_release;
                    final Function2<? super Composer, ? super Integer, Unit> function111116 = function2M1068getLambda4$material_release;
                    final Function2<? super Composer, ? super Integer, Unit> function111117 = function2M1066getLambda2$material_release;
                    final int i311116 = i5;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function111118 = function3M1067getLambda3$material_release;
                    final ScaffoldState scaffoldState12 = scaffoldState2;
                    Function2<? super Composer, ? super Integer, Unit> function111119 = function2M1065getLambda1$material_release;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) {
                            invoke(modifier3, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i311117) {
                            int i311118;
                            Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                            if ((i311117 & 14) == 0) {
                                i311118 = i311117 | (composer2.changed(childModifier) ? 4 : 2);
                            } else {
                                i311118 = i311117;
                            }
                            if ((i311118 & 91) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1823402604, i311118, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                            }
                            long j1114 = j1112;
                            long j1115 = j1113;
                            final boolean z11112 = z11111;
                            final int i311119 = i311115;
                            final Function2<? super Composer, ? super Integer, Unit> function20 = function111115;
                            final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function21 = content;
                            final Function2<? super Composer, ? super Integer, Unit> function22 = function111116;
                            final Function2<? super Composer, ? super Integer, Unit> function23 = function111117;
                            final int i40 = i311116;
                            final int i41 = i311114;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function24 = function111118;
                            final ScaffoldState scaffoldState13 = scaffoldState12;
                            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                                public final void invoke(@Nullable Composer composer3, int i42) {
                                    if ((i42 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1128984656, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                                    }
                                    boolean z11113 = z11112;
                                    int i43 = i311119;
                                    Function2<Composer, Integer, Unit> function25 = function20;
                                    Function3<PaddingValues, Composer, Integer, Unit> function26 = function21;
                                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function27 = function24;
                                    final ScaffoldState scaffoldState14 = scaffoldState13;
                                    final int i44 = i40;
                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i45) {
                                            if ((i45 & 11) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(533782017, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                            }
                                            function27.invoke(scaffoldState14.getSnackbarHostState(), composer4, Integer.valueOf((i44 >> 9) & 112));
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    });
                                    Function2<Composer, Integer, Unit> function28 = function22;
                                    Function2<Composer, Integer, Unit> function29 = function23;
                                    int i45 = i40;
                                    ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z11113, i43, function25, function26, composableLambda3, function28, function29, composer3, ((i45 >> 21) & 14) | 24576 | ((i45 >> 15) & 112) | (i45 & 896) | ((i41 >> 12) & 7168) | (458752 & i45) | ((i45 << 9) & 3670016));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                            int i42 = 1572864 | (i311118 & 14);
                            int i43 = i311114;
                            SurfaceKt.m1201SurfaceFjzlyU(childModifier, null, j1114, j1115, null, 0.0f, composableLambda2, composer2, i42 | ((i43 >> 9) & 896) | ((i43 >> 9) & 7168), 50);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    if (function9 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-1013848234);
                        int i311117 = i27 << 12;
                        DrawerKt.m1082ModalDrawerGs3lGvM(function9, modifier2, scaffoldState2.getDrawerState(), z5, large, f2, jM1043getSurface0d7_KjU, j6, scrimColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                            public final void invoke(@Nullable Composer composer2, int i311118) {
                                if ((i311118 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(100842932, i311118, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                                }
                                composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composerStartRestartGroup, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i311117 & 57344) | (i311117 & 458752) | (i311117 & 3670016) | (i311117 & 29360128) | (i311117 & 234881024), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1013847725);
                        composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i5 & 14) | 48));
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scaffoldState3 = scaffoldState2;
                    function10 = function2M1068getLambda4$material_release;
                    f3 = f2;
                    j7 = jM1043getSurface0d7_KjU;
                    j8 = j6;
                    j9 = scrimColor;
                    j10 = jM1032getBackground0d7_KjU;
                    j11 = jM1057contentColorForek8zF_U2;
                    function11 = function9;
                    function12 = function111119;
                    int i311118 = iM1110getEnd5ygKITE;
                    z6 = z5;
                    function13 = function2M1066getLambda2$material_release;
                    i28 = i311118;
                    boolean z11112 = z3;
                    shape2 = large;
                    function14 = function3M1067getLambda3$material_release;
                    z7 = z11112;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final long j1114 = j8;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
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

                    public final void invoke(@Nullable Composer composer2, int i311119) {
                        ScaffoldKt.m1172Scaffold27mzLpw(modifier2, scaffoldState3, function12, function13, function14, function10, i28, z7, function11, z6, shape2, f3, j7, j1114, j9, j10, j11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                    }
                });
            }
            i23 = 12582912;
            i20 |= i23;
            if ((i5 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i4 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i5 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i32 != 0) {
                        function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                    } else {
                        function2M1065getLambda1$material_release = function2;
                    }
                    if (i6 != 0) {
                        function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                    } else {
                        function2M1066getLambda2$material_release = function3;
                    }
                    if (i8 != 0) {
                        function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                    } else {
                        function3M1067getLambda3$material_release = function4;
                    }
                    if (i10 != 0) {
                        function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                    } else {
                        function2M1068getLambda4$material_release = function5;
                    }
                    if (i12 != 0) {
                        iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                    }
                    if (i14 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i16 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    scaffoldState2 = scaffoldStateRememberScaffoldState;
                    function9 = function8;
                    if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i20 &= -15;
                    } else {
                        large = shape;
                    }
                    i24 = i20;
                    if (i21 != 0) {
                        fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                    } else {
                        fM1079getElevationD9Ej5fM = f;
                    }
                    if ((i4 & 4096) != 0) {
                        boolean z11113 = z4;
                        i25 = i24 & (-897);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        z5 = z11113;
                    } else {
                        z5 = z4;
                        i25 = i24;
                        jM1043getSurface0d7_KjU = j;
                    }
                    float f111 = fM1079getElevationD9Ej5fM;
                    if ((i4 & 8192) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                        i25 &= -7169;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i4 & 16384) != 0) {
                        i26 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i25 &= -57345;
                    } else {
                        i26 = 6;
                        scrimColor = j3;
                    }
                    if ((32768 & i4) != 0) {
                        jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                        i25 &= -458753;
                    } else {
                        jM1032getBackground0d7_KjU = j4;
                    }
                    if ((i4 & 65536) != 0) {
                        i27 = i25 & (-3670017);
                        jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                    } else {
                        jM1057contentColorForek8zF_U2 = j5;
                        i27 = i25;
                    }
                    j6 = jM1057contentColorForek8zF_U;
                    f2 = f111;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i4 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i5 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i32 != 0) {
                        function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                    } else {
                        function2M1065getLambda1$material_release = function2;
                    }
                    if (i6 != 0) {
                        function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                    } else {
                        function2M1066getLambda2$material_release = function3;
                    }
                    if (i8 != 0) {
                        function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                    } else {
                        function3M1067getLambda3$material_release = function4;
                    }
                    if (i10 != 0) {
                        function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                    } else {
                        function2M1068getLambda4$material_release = function5;
                    }
                    if (i12 != 0) {
                        iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                    }
                    if (i14 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i16 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    scaffoldState2 = scaffoldStateRememberScaffoldState;
                    function9 = function8;
                    if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i20 &= -15;
                    } else {
                        large = shape;
                    }
                    i24 = i20;
                    if (i21 != 0) {
                        fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                    } else {
                        fM1079getElevationD9Ej5fM = f;
                    }
                    if ((i4 & 4096) != 0) {
                        boolean z11114 = z4;
                        i25 = i24 & (-897);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        z5 = z11114;
                    } else {
                        z5 = z4;
                        i25 = i24;
                        jM1043getSurface0d7_KjU = j;
                    }
                    float f112 = fM1079getElevationD9Ej5fM;
                    if ((i4 & 8192) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                        i25 &= -7169;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i4 & 16384) != 0) {
                        i26 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i25 &= -57345;
                    } else {
                        i26 = 6;
                        scrimColor = j3;
                    }
                    if ((32768 & i4) != 0) {
                        jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                        i25 &= -458753;
                    } else {
                        jM1032getBackground0d7_KjU = j4;
                    }
                    if ((i4 & 65536) != 0) {
                        i27 = i25 & (-3670017);
                        jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                    } else {
                        jM1057contentColorForek8zF_U2 = j5;
                        i27 = i25;
                    }
                    j6 = jM1057contentColorForek8zF_U;
                    f2 = f112;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1037492569, i5, i27, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                }
                final long j1115 = jM1032getBackground0d7_KjU;
                final long j1116 = jM1057contentColorForek8zF_U2;
                final int i311119 = i27;
                final boolean z11115 = z3;
                final int i3111110 = iM1110getEnd5ygKITE;
                final Function2<? super Composer, ? super Integer, Unit> function1111110 = function2M1065getLambda1$material_release;
                final Function2<? super Composer, ? super Integer, Unit> function1111111 = function2M1068getLambda4$material_release;
                final Function2<? super Composer, ? super Integer, Unit> function1111112 = function2M1066getLambda2$material_release;
                final int i3111111 = i5;
                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function1111113 = function3M1067getLambda3$material_release;
                final ScaffoldState scaffoldState13 = scaffoldState2;
                Function2<? super Composer, ? super Integer, Unit> function1111114 = function2M1065getLambda1$material_release;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) {
                        invoke(modifier3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i3111112) {
                        int i3111113;
                        Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                        if ((i3111112 & 14) == 0) {
                            i3111113 = i3111112 | (composer2.changed(childModifier) ? 4 : 2);
                        } else {
                            i3111113 = i3111112;
                        }
                        if ((i3111113 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1823402604, i3111113, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                        }
                        long j1117 = j1115;
                        long j1118 = j1116;
                        final boolean z11116 = z11115;
                        final int i3111114 = i3111110;
                        final Function2<? super Composer, ? super Integer, Unit> function20 = function1111110;
                        final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function21 = content;
                        final Function2<? super Composer, ? super Integer, Unit> function22 = function1111111;
                        final Function2<? super Composer, ? super Integer, Unit> function23 = function1111112;
                        final int i40 = i3111111;
                        final int i41 = i311119;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function24 = function1111113;
                        final ScaffoldState scaffoldState14 = scaffoldState13;
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                            public final void invoke(@Nullable Composer composer3, int i42) {
                                if ((i42 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1128984656, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                                }
                                boolean z11117 = z11116;
                                int i43 = i3111114;
                                Function2<Composer, Integer, Unit> function25 = function20;
                                Function3<PaddingValues, Composer, Integer, Unit> function26 = function21;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function27 = function24;
                                final ScaffoldState scaffoldState15 = scaffoldState14;
                                final int i44 = i40;
                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i45) {
                                        if ((i45 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(533782017, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                        }
                                        function27.invoke(scaffoldState15.getSnackbarHostState(), composer4, Integer.valueOf((i44 >> 9) & 112));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                });
                                Function2<Composer, Integer, Unit> function28 = function22;
                                Function2<Composer, Integer, Unit> function29 = function23;
                                int i45 = i40;
                                ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z11117, i43, function25, function26, composableLambda3, function28, function29, composer3, ((i45 >> 21) & 14) | 24576 | ((i45 >> 15) & 112) | (i45 & 896) | ((i41 >> 12) & 7168) | (458752 & i45) | ((i45 << 9) & 3670016));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i42 = 1572864 | (i3111113 & 14);
                        int i43 = i311119;
                        SurfaceKt.m1201SurfaceFjzlyU(childModifier, null, j1117, j1118, null, 0.0f, composableLambda2, composer2, i42 | ((i43 >> 9) & 896) | ((i43 >> 9) & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                if (function9 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1013848234);
                    int i3111112 = i27 << 12;
                    DrawerKt.m1082ModalDrawerGs3lGvM(function9, modifier2, scaffoldState2.getDrawerState(), z5, large, f2, jM1043getSurface0d7_KjU, j6, scrimColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                        public final void invoke(@Nullable Composer composer2, int i3111113) {
                            if ((i3111113 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(100842932, i3111113, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                            }
                            composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i3111112 & 57344) | (i3111112 & 458752) | (i3111112 & 3670016) | (i3111112 & 29360128) | (i3111112 & 234881024), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1013847725);
                    composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i5 & 14) | 48));
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scaffoldState3 = scaffoldState2;
                function10 = function2M1068getLambda4$material_release;
                f3 = f2;
                j7 = jM1043getSurface0d7_KjU;
                j8 = j6;
                j9 = scrimColor;
                j10 = jM1032getBackground0d7_KjU;
                j11 = jM1057contentColorForek8zF_U2;
                function11 = function9;
                function12 = function1111114;
                int i3111113 = iM1110getEnd5ygKITE;
                z6 = z5;
                function13 = function2M1066getLambda2$material_release;
                i28 = i3111113;
                boolean z11116 = z3;
                shape2 = large;
                function14 = function3M1067getLambda3$material_release;
                z7 = z11116;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i4 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i5 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i32 != 0) {
                        function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                    } else {
                        function2M1065getLambda1$material_release = function2;
                    }
                    if (i6 != 0) {
                        function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                    } else {
                        function2M1066getLambda2$material_release = function3;
                    }
                    if (i8 != 0) {
                        function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                    } else {
                        function3M1067getLambda3$material_release = function4;
                    }
                    if (i10 != 0) {
                        function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                    } else {
                        function2M1068getLambda4$material_release = function5;
                    }
                    if (i12 != 0) {
                        iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                    }
                    if (i14 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i16 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    scaffoldState2 = scaffoldStateRememberScaffoldState;
                    function9 = function8;
                    if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i20 &= -15;
                    } else {
                        large = shape;
                    }
                    i24 = i20;
                    if (i21 != 0) {
                        fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                    } else {
                        fM1079getElevationD9Ej5fM = f;
                    }
                    if ((i4 & 4096) != 0) {
                        boolean z11117 = z4;
                        i25 = i24 & (-897);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        z5 = z11117;
                    } else {
                        z5 = z4;
                        i25 = i24;
                        jM1043getSurface0d7_KjU = j;
                    }
                    float f113 = fM1079getElevationD9Ej5fM;
                    if ((i4 & 8192) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                        i25 &= -7169;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i4 & 16384) != 0) {
                        i26 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i25 &= -57345;
                    } else {
                        i26 = 6;
                        scrimColor = j3;
                    }
                    if ((32768 & i4) != 0) {
                        jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                        i25 &= -458753;
                    } else {
                        jM1032getBackground0d7_KjU = j4;
                    }
                    if ((i4 & 65536) != 0) {
                        i27 = i25 & (-3670017);
                        jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                    } else {
                        jM1057contentColorForek8zF_U2 = j5;
                        i27 = i25;
                    }
                    j6 = jM1057contentColorForek8zF_U;
                    f2 = f113;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i4 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i5 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i32 != 0) {
                        function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                    } else {
                        function2M1065getLambda1$material_release = function2;
                    }
                    if (i6 != 0) {
                        function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                    } else {
                        function2M1066getLambda2$material_release = function3;
                    }
                    if (i8 != 0) {
                        function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                    } else {
                        function3M1067getLambda3$material_release = function4;
                    }
                    if (i10 != 0) {
                        function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                    } else {
                        function2M1068getLambda4$material_release = function5;
                    }
                    if (i12 != 0) {
                        iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                    }
                    if (i14 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i16 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    scaffoldState2 = scaffoldStateRememberScaffoldState;
                    function9 = function8;
                    if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i20 &= -15;
                    } else {
                        large = shape;
                    }
                    i24 = i20;
                    if (i21 != 0) {
                        fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                    } else {
                        fM1079getElevationD9Ej5fM = f;
                    }
                    if ((i4 & 4096) != 0) {
                        boolean z11118 = z4;
                        i25 = i24 & (-897);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        z5 = z11118;
                    } else {
                        z5 = z4;
                        i25 = i24;
                        jM1043getSurface0d7_KjU = j;
                    }
                    float f114 = fM1079getElevationD9Ej5fM;
                    if ((i4 & 8192) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                        i25 &= -7169;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i4 & 16384) != 0) {
                        i26 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i25 &= -57345;
                    } else {
                        i26 = 6;
                        scrimColor = j3;
                    }
                    if ((32768 & i4) != 0) {
                        jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                        i25 &= -458753;
                    } else {
                        jM1032getBackground0d7_KjU = j4;
                    }
                    if ((i4 & 65536) != 0) {
                        i27 = i25 & (-3670017);
                        jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                    } else {
                        jM1057contentColorForek8zF_U2 = j5;
                        i27 = i25;
                    }
                    j6 = jM1057contentColorForek8zF_U;
                    f2 = f114;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1037492569, i5, i27, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                }
                final long j1117 = jM1032getBackground0d7_KjU;
                final long j1118 = jM1057contentColorForek8zF_U2;
                final int i3111114 = i27;
                final boolean z11119 = z3;
                final int i3111115 = iM1110getEnd5ygKITE;
                final Function2<? super Composer, ? super Integer, Unit> function1111115 = function2M1065getLambda1$material_release;
                final Function2<? super Composer, ? super Integer, Unit> function1111116 = function2M1068getLambda4$material_release;
                final Function2<? super Composer, ? super Integer, Unit> function1111117 = function2M1066getLambda2$material_release;
                final int i3111116 = i5;
                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function1111118 = function3M1067getLambda3$material_release;
                final ScaffoldState scaffoldState14 = scaffoldState2;
                Function2<? super Composer, ? super Integer, Unit> function1111119 = function2M1065getLambda1$material_release;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) {
                        invoke(modifier3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i3111117) {
                        int i3111118;
                        Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                        if ((i3111117 & 14) == 0) {
                            i3111118 = i3111117 | (composer2.changed(childModifier) ? 4 : 2);
                        } else {
                            i3111118 = i3111117;
                        }
                        if ((i3111118 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1823402604, i3111118, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                        }
                        long j1119 = j1117;
                        long j11110 = j1118;
                        final boolean z111110 = z11119;
                        final int i3111119 = i3111115;
                        final Function2<? super Composer, ? super Integer, Unit> function20 = function1111115;
                        final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function21 = content;
                        final Function2<? super Composer, ? super Integer, Unit> function22 = function1111116;
                        final Function2<? super Composer, ? super Integer, Unit> function23 = function1111117;
                        final int i40 = i3111116;
                        final int i41 = i3111114;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function24 = function1111118;
                        final ScaffoldState scaffoldState15 = scaffoldState14;
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                            public final void invoke(@Nullable Composer composer3, int i42) {
                                if ((i42 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1128984656, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                                }
                                boolean z111111 = z111110;
                                int i43 = i3111119;
                                Function2<Composer, Integer, Unit> function25 = function20;
                                Function3<PaddingValues, Composer, Integer, Unit> function26 = function21;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function27 = function24;
                                final ScaffoldState scaffoldState16 = scaffoldState15;
                                final int i44 = i40;
                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i45) {
                                        if ((i45 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(533782017, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                        }
                                        function27.invoke(scaffoldState16.getSnackbarHostState(), composer4, Integer.valueOf((i44 >> 9) & 112));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                });
                                Function2<Composer, Integer, Unit> function28 = function22;
                                Function2<Composer, Integer, Unit> function29 = function23;
                                int i45 = i40;
                                ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z111111, i43, function25, function26, composableLambda3, function28, function29, composer3, ((i45 >> 21) & 14) | 24576 | ((i45 >> 15) & 112) | (i45 & 896) | ((i41 >> 12) & 7168) | (458752 & i45) | ((i45 << 9) & 3670016));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i42 = 1572864 | (i3111118 & 14);
                        int i43 = i3111114;
                        SurfaceKt.m1201SurfaceFjzlyU(childModifier, null, j1119, j11110, null, 0.0f, composableLambda2, composer2, i42 | ((i43 >> 9) & 896) | ((i43 >> 9) & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                if (function9 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1013848234);
                    int i3111117 = i27 << 12;
                    DrawerKt.m1082ModalDrawerGs3lGvM(function9, modifier2, scaffoldState2.getDrawerState(), z5, large, f2, jM1043getSurface0d7_KjU, j6, scrimColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                        public final void invoke(@Nullable Composer composer2, int i3111118) {
                            if ((i3111118 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(100842932, i3111118, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                            }
                            composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i3111117 & 57344) | (i3111117 & 458752) | (i3111117 & 3670016) | (i3111117 & 29360128) | (i3111117 & 234881024), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1013847725);
                    composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i5 & 14) | 48));
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scaffoldState3 = scaffoldState2;
                function10 = function2M1068getLambda4$material_release;
                f3 = f2;
                j7 = jM1043getSurface0d7_KjU;
                j8 = j6;
                j9 = scrimColor;
                j10 = jM1032getBackground0d7_KjU;
                j11 = jM1057contentColorForek8zF_U2;
                function11 = function9;
                function12 = function1111119;
                int i3111118 = iM1110getEnd5ygKITE;
                z6 = z5;
                function13 = function2M1066getLambda2$material_release;
                i28 = i3111118;
                boolean z111110 = z3;
                shape2 = large;
                function14 = function3M1067getLambda3$material_release;
                z7 = z111110;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final long j1119 = j8;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
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

                public final void invoke(@Nullable Composer composer2, int i3111119) {
                    ScaffoldKt.m1172Scaffold27mzLpw(modifier2, scaffoldState3, function12, function13, function14, function10, i28, z7, function11, z6, shape2, f3, j7, j1119, j9, j10, j11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
        i5 |= 3072;
        i8 = i4 & 16;
        if (i8 != 0) {
            i5 |= 24576;
        } else if ((i2 & 57344) == 0) {
            if (composerStartRestartGroup.changedInstance(function4)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i5 |= i9;
        }
        i10 = i4 & 32;
        if (i10 != 0) {
            i5 |= 196608;
            function7 = function5;
        } else {
            function7 = function5;
            if ((i2 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(function7)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i5 |= i11;
            }
        }
        i12 = i4 & 64;
        if (i12 != 0) {
            i5 |= 1572864;
            iM1110getEnd5ygKITE = i;
        } else {
            iM1110getEnd5ygKITE = i;
            if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(iM1110getEnd5ygKITE)) {
                    i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i13 = 524288;
                }
                i5 |= i13;
            }
        }
        i14 = i4 & 128;
        if (i14 != 0) {
            i5 |= 12582912;
        } else if ((i2 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(z)) {
                i15 = 8388608;
            } else {
                i15 = Configuration.BLOCK_SIZE;
            }
            i5 |= i15;
        }
        i16 = i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i16 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function6)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i5 |= i17;
        }
        i18 = i4 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (i18 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 1879048192) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i19 = 536870912;
            } else {
                i19 = SQLiteDatabase.CREATE_IF_NECESSARY;
            }
            i5 |= i19;
        }
        if ((i3 & 14) == 0) {
            i20 = i3 | (((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0 || !composerStartRestartGroup.changed(shape)) ? 2 : 4);
        } else {
            i20 = i3;
        }
        i21 = i4 & 2048;
        if (i21 != 0) {
            i20 |= 48;
        } else if ((i3 & 112) == 0) {
            if (composerStartRestartGroup.changed(f)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i20 |= i22;
        }
        if ((i3 & 896) != 0) {
            i20 |= ((i4 & 4096) == 0 || !composerStartRestartGroup.changed(j)) ? 128 : PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if ((i3 & 7168) != 0) {
            i20 |= ((i4 & 8192) == 0 || !composerStartRestartGroup.changed(j2)) ? 1024 : 2048;
        }
        if ((i3 & 57344) != 0) {
            i20 |= ((i4 & 16384) == 0 || !composerStartRestartGroup.changed(j3)) ? 8192 : 16384;
        }
        if ((i3 & 458752) != 0) {
            if ((i4 & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                i30 = 65536;
            } else {
                i30 = 65536;
            }
            i20 |= i30;
        }
        if ((i3 & 3670016) != 0) {
            if ((i4 & 65536) == 0) {
                i29 = 524288;
            } else {
                i29 = 524288;
            }
            i20 |= i29;
        }
        if ((i4 & 131072) != 0) {
            if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i23 = 8388608;
                } else {
                    i23 = Configuration.BLOCK_SIZE;
                }
            }
            if ((i5 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i4 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i5 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i32 != 0) {
                        function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                    } else {
                        function2M1065getLambda1$material_release = function2;
                    }
                    if (i6 != 0) {
                        function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                    } else {
                        function2M1066getLambda2$material_release = function3;
                    }
                    if (i8 != 0) {
                        function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                    } else {
                        function3M1067getLambda3$material_release = function4;
                    }
                    if (i10 != 0) {
                        function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                    } else {
                        function2M1068getLambda4$material_release = function5;
                    }
                    if (i12 != 0) {
                        iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                    }
                    if (i14 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i16 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    scaffoldState2 = scaffoldStateRememberScaffoldState;
                    function9 = function8;
                    if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i20 &= -15;
                    } else {
                        large = shape;
                    }
                    i24 = i20;
                    if (i21 != 0) {
                        fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                    } else {
                        fM1079getElevationD9Ej5fM = f;
                    }
                    if ((i4 & 4096) != 0) {
                        boolean z111111 = z4;
                        i25 = i24 & (-897);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        z5 = z111111;
                    } else {
                        z5 = z4;
                        i25 = i24;
                        jM1043getSurface0d7_KjU = j;
                    }
                    float f115 = fM1079getElevationD9Ej5fM;
                    if ((i4 & 8192) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                        i25 &= -7169;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i4 & 16384) != 0) {
                        i26 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i25 &= -57345;
                    } else {
                        i26 = 6;
                        scrimColor = j3;
                    }
                    if ((32768 & i4) != 0) {
                        jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                        i25 &= -458753;
                    } else {
                        jM1032getBackground0d7_KjU = j4;
                    }
                    if ((i4 & 65536) != 0) {
                        i27 = i25 & (-3670017);
                        jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                    } else {
                        jM1057contentColorForek8zF_U2 = j5;
                        i27 = i25;
                    }
                    j6 = jM1057contentColorForek8zF_U;
                    f2 = f115;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i4 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i5 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i32 != 0) {
                        function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                    } else {
                        function2M1065getLambda1$material_release = function2;
                    }
                    if (i6 != 0) {
                        function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                    } else {
                        function2M1066getLambda2$material_release = function3;
                    }
                    if (i8 != 0) {
                        function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                    } else {
                        function3M1067getLambda3$material_release = function4;
                    }
                    if (i10 != 0) {
                        function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                    } else {
                        function2M1068getLambda4$material_release = function5;
                    }
                    if (i12 != 0) {
                        iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                    }
                    if (i14 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i16 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    scaffoldState2 = scaffoldStateRememberScaffoldState;
                    function9 = function8;
                    if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i20 &= -15;
                    } else {
                        large = shape;
                    }
                    i24 = i20;
                    if (i21 != 0) {
                        fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                    } else {
                        fM1079getElevationD9Ej5fM = f;
                    }
                    if ((i4 & 4096) != 0) {
                        boolean z111112 = z4;
                        i25 = i24 & (-897);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        z5 = z111112;
                    } else {
                        z5 = z4;
                        i25 = i24;
                        jM1043getSurface0d7_KjU = j;
                    }
                    float f116 = fM1079getElevationD9Ej5fM;
                    if ((i4 & 8192) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                        i25 &= -7169;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i4 & 16384) != 0) {
                        i26 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i25 &= -57345;
                    } else {
                        i26 = 6;
                        scrimColor = j3;
                    }
                    if ((32768 & i4) != 0) {
                        jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                        i25 &= -458753;
                    } else {
                        jM1032getBackground0d7_KjU = j4;
                    }
                    if ((i4 & 65536) != 0) {
                        i27 = i25 & (-3670017);
                        jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                    } else {
                        jM1057contentColorForek8zF_U2 = j5;
                        i27 = i25;
                    }
                    j6 = jM1057contentColorForek8zF_U;
                    f2 = f116;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1037492569, i5, i27, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                }
                final long j11110 = jM1032getBackground0d7_KjU;
                final long j11111 = jM1057contentColorForek8zF_U2;
                final int i3111119 = i27;
                final boolean z111113 = z3;
                final int i31111110 = iM1110getEnd5ygKITE;
                final Function2<? super Composer, ? super Integer, Unit> function11111110 = function2M1065getLambda1$material_release;
                final Function2<? super Composer, ? super Integer, Unit> function11111111 = function2M1068getLambda4$material_release;
                final Function2<? super Composer, ? super Integer, Unit> function11111112 = function2M1066getLambda2$material_release;
                final int i31111111 = i5;
                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function11111113 = function3M1067getLambda3$material_release;
                final ScaffoldState scaffoldState15 = scaffoldState2;
                Function2<? super Composer, ? super Integer, Unit> function11111114 = function2M1065getLambda1$material_release;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) {
                        invoke(modifier3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i31111112) {
                        int i31111113;
                        Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                        if ((i31111112 & 14) == 0) {
                            i31111113 = i31111112 | (composer2.changed(childModifier) ? 4 : 2);
                        } else {
                            i31111113 = i31111112;
                        }
                        if ((i31111113 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1823402604, i31111113, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                        }
                        long j11112 = j11110;
                        long j11113 = j11111;
                        final boolean z111114 = z111113;
                        final int i31111114 = i31111110;
                        final Function2<? super Composer, ? super Integer, Unit> function20 = function11111110;
                        final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function21 = content;
                        final Function2<? super Composer, ? super Integer, Unit> function22 = function11111111;
                        final Function2<? super Composer, ? super Integer, Unit> function23 = function11111112;
                        final int i40 = i31111111;
                        final int i41 = i3111119;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function24 = function11111113;
                        final ScaffoldState scaffoldState16 = scaffoldState15;
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                            public final void invoke(@Nullable Composer composer3, int i42) {
                                if ((i42 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1128984656, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                                }
                                boolean z111115 = z111114;
                                int i43 = i31111114;
                                Function2<Composer, Integer, Unit> function25 = function20;
                                Function3<PaddingValues, Composer, Integer, Unit> function26 = function21;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function27 = function24;
                                final ScaffoldState scaffoldState17 = scaffoldState16;
                                final int i44 = i40;
                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i45) {
                                        if ((i45 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(533782017, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                        }
                                        function27.invoke(scaffoldState17.getSnackbarHostState(), composer4, Integer.valueOf((i44 >> 9) & 112));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                });
                                Function2<Composer, Integer, Unit> function28 = function22;
                                Function2<Composer, Integer, Unit> function29 = function23;
                                int i45 = i40;
                                ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z111115, i43, function25, function26, composableLambda3, function28, function29, composer3, ((i45 >> 21) & 14) | 24576 | ((i45 >> 15) & 112) | (i45 & 896) | ((i41 >> 12) & 7168) | (458752 & i45) | ((i45 << 9) & 3670016));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i42 = 1572864 | (i31111113 & 14);
                        int i43 = i3111119;
                        SurfaceKt.m1201SurfaceFjzlyU(childModifier, null, j11112, j11113, null, 0.0f, composableLambda2, composer2, i42 | ((i43 >> 9) & 896) | ((i43 >> 9) & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                if (function9 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1013848234);
                    int i31111112 = i27 << 12;
                    DrawerKt.m1082ModalDrawerGs3lGvM(function9, modifier2, scaffoldState2.getDrawerState(), z5, large, f2, jM1043getSurface0d7_KjU, j6, scrimColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                        public final void invoke(@Nullable Composer composer2, int i31111113) {
                            if ((i31111113 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(100842932, i31111113, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                            }
                            composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i31111112 & 57344) | (i31111112 & 458752) | (i31111112 & 3670016) | (i31111112 & 29360128) | (i31111112 & 234881024), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1013847725);
                    composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i5 & 14) | 48));
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scaffoldState3 = scaffoldState2;
                function10 = function2M1068getLambda4$material_release;
                f3 = f2;
                j7 = jM1043getSurface0d7_KjU;
                j8 = j6;
                j9 = scrimColor;
                j10 = jM1032getBackground0d7_KjU;
                j11 = jM1057contentColorForek8zF_U2;
                function11 = function9;
                function12 = function11111114;
                int i31111113 = iM1110getEnd5ygKITE;
                z6 = z5;
                function13 = function2M1066getLambda2$material_release;
                i28 = i31111113;
                boolean z111114 = z3;
                shape2 = large;
                function14 = function3M1067getLambda3$material_release;
                z7 = z111114;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i4 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i5 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i32 != 0) {
                        function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                    } else {
                        function2M1065getLambda1$material_release = function2;
                    }
                    if (i6 != 0) {
                        function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                    } else {
                        function2M1066getLambda2$material_release = function3;
                    }
                    if (i8 != 0) {
                        function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                    } else {
                        function3M1067getLambda3$material_release = function4;
                    }
                    if (i10 != 0) {
                        function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                    } else {
                        function2M1068getLambda4$material_release = function5;
                    }
                    if (i12 != 0) {
                        iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                    }
                    if (i14 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i16 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    scaffoldState2 = scaffoldStateRememberScaffoldState;
                    function9 = function8;
                    if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i20 &= -15;
                    } else {
                        large = shape;
                    }
                    i24 = i20;
                    if (i21 != 0) {
                        fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                    } else {
                        fM1079getElevationD9Ej5fM = f;
                    }
                    if ((i4 & 4096) != 0) {
                        boolean z111115 = z4;
                        i25 = i24 & (-897);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        z5 = z111115;
                    } else {
                        z5 = z4;
                        i25 = i24;
                        jM1043getSurface0d7_KjU = j;
                    }
                    float f117 = fM1079getElevationD9Ej5fM;
                    if ((i4 & 8192) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                        i25 &= -7169;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i4 & 16384) != 0) {
                        i26 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i25 &= -57345;
                    } else {
                        i26 = 6;
                        scrimColor = j3;
                    }
                    if ((32768 & i4) != 0) {
                        jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                        i25 &= -458753;
                    } else {
                        jM1032getBackground0d7_KjU = j4;
                    }
                    if ((i4 & 65536) != 0) {
                        i27 = i25 & (-3670017);
                        jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                    } else {
                        jM1057contentColorForek8zF_U2 = j5;
                        i27 = i25;
                    }
                    j6 = jM1057contentColorForek8zF_U;
                    f2 = f117;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i4 & 2) != 0) {
                        scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                        i5 &= -113;
                    } else {
                        scaffoldStateRememberScaffoldState = scaffoldState;
                    }
                    if (i32 != 0) {
                        function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                    } else {
                        function2M1065getLambda1$material_release = function2;
                    }
                    if (i6 != 0) {
                        function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                    } else {
                        function2M1066getLambda2$material_release = function3;
                    }
                    if (i8 != 0) {
                        function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                    } else {
                        function3M1067getLambda3$material_release = function4;
                    }
                    if (i10 != 0) {
                        function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                    } else {
                        function2M1068getLambda4$material_release = function5;
                    }
                    if (i12 != 0) {
                        iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                    }
                    if (i14 != 0) {
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    if (i16 != 0) {
                        function8 = null;
                    } else {
                        function8 = function6;
                    }
                    if (i18 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    scaffoldState2 = scaffoldStateRememberScaffoldState;
                    function9 = function8;
                    if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                        i20 &= -15;
                    } else {
                        large = shape;
                    }
                    i24 = i20;
                    if (i21 != 0) {
                        fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                    } else {
                        fM1079getElevationD9Ej5fM = f;
                    }
                    if ((i4 & 4096) != 0) {
                        boolean z111116 = z4;
                        i25 = i24 & (-897);
                        jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                        z5 = z111116;
                    } else {
                        z5 = z4;
                        i25 = i24;
                        jM1043getSurface0d7_KjU = j;
                    }
                    float f118 = fM1079getElevationD9Ej5fM;
                    if ((i4 & 8192) != 0) {
                        jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                        i25 &= -7169;
                    } else {
                        jM1057contentColorForek8zF_U = j2;
                    }
                    if ((i4 & 16384) != 0) {
                        i26 = 6;
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i25 &= -57345;
                    } else {
                        i26 = 6;
                        scrimColor = j3;
                    }
                    if ((32768 & i4) != 0) {
                        jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                        i25 &= -458753;
                    } else {
                        jM1032getBackground0d7_KjU = j4;
                    }
                    if ((i4 & 65536) != 0) {
                        i27 = i25 & (-3670017);
                        jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                    } else {
                        jM1057contentColorForek8zF_U2 = j5;
                        i27 = i25;
                    }
                    j6 = jM1057contentColorForek8zF_U;
                    f2 = f118;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1037492569, i5, i27, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
                }
                final long j11112 = jM1032getBackground0d7_KjU;
                final long j11113 = jM1057contentColorForek8zF_U2;
                final int i31111114 = i27;
                final boolean z111117 = z3;
                final int i31111115 = iM1110getEnd5ygKITE;
                final Function2<? super Composer, ? super Integer, Unit> function11111115 = function2M1065getLambda1$material_release;
                final Function2<? super Composer, ? super Integer, Unit> function11111116 = function2M1068getLambda4$material_release;
                final Function2<? super Composer, ? super Integer, Unit> function11111117 = function2M1066getLambda2$material_release;
                final int i31111116 = i5;
                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function11111118 = function3M1067getLambda3$material_release;
                final ScaffoldState scaffoldState16 = scaffoldState2;
                Function2<? super Composer, ? super Integer, Unit> function11111119 = function2M1065getLambda1$material_release;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) {
                        invoke(modifier3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i31111117) {
                        int i31111118;
                        Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                        if ((i31111117 & 14) == 0) {
                            i31111118 = i31111117 | (composer2.changed(childModifier) ? 4 : 2);
                        } else {
                            i31111118 = i31111117;
                        }
                        if ((i31111118 & 91) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1823402604, i31111118, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                        }
                        long j11114 = j11112;
                        long j11115 = j11113;
                        final boolean z111118 = z111117;
                        final int i31111119 = i31111115;
                        final Function2<? super Composer, ? super Integer, Unit> function20 = function11111115;
                        final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function21 = content;
                        final Function2<? super Composer, ? super Integer, Unit> function22 = function11111116;
                        final Function2<? super Composer, ? super Integer, Unit> function23 = function11111117;
                        final int i40 = i31111116;
                        final int i41 = i31111114;
                        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function24 = function11111118;
                        final ScaffoldState scaffoldState17 = scaffoldState16;
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                            public final void invoke(@Nullable Composer composer3, int i42) {
                                if ((i42 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1128984656, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                                }
                                boolean z111119 = z111118;
                                int i43 = i31111119;
                                Function2<Composer, Integer, Unit> function25 = function20;
                                Function3<PaddingValues, Composer, Integer, Unit> function26 = function21;
                                final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function27 = function24;
                                final ScaffoldState scaffoldState18 = scaffoldState17;
                                final int i44 = i40;
                                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer4, int i45) {
                                        if ((i45 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(533782017, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                        }
                                        function27.invoke(scaffoldState18.getSnackbarHostState(), composer4, Integer.valueOf((i44 >> 9) & 112));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                });
                                Function2<Composer, Integer, Unit> function28 = function22;
                                Function2<Composer, Integer, Unit> function29 = function23;
                                int i45 = i40;
                                ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z111119, i43, function25, function26, composableLambda3, function28, function29, composer3, ((i45 >> 21) & 14) | 24576 | ((i45 >> 15) & 112) | (i45 & 896) | ((i41 >> 12) & 7168) | (458752 & i45) | ((i45 << 9) & 3670016));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        int i42 = 1572864 | (i31111118 & 14);
                        int i43 = i31111114;
                        SurfaceKt.m1201SurfaceFjzlyU(childModifier, null, j11114, j11115, null, 0.0f, composableLambda2, composer2, i42 | ((i43 >> 9) & 896) | ((i43 >> 9) & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                });
                if (function9 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-1013848234);
                    int i31111117 = i27 << 12;
                    DrawerKt.m1082ModalDrawerGs3lGvM(function9, modifier2, scaffoldState2.getDrawerState(), z5, large, f2, jM1043getSurface0d7_KjU, j6, scrimColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                        public final void invoke(@Nullable Composer composer2, int i31111118) {
                            if ((i31111118 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(100842932, i31111118, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                            }
                            composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), composerStartRestartGroup, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i31111117 & 57344) | (i31111117 & 458752) | (i31111117 & 3670016) | (i31111117 & 29360128) | (i31111117 & 234881024), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1013847725);
                    composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i5 & 14) | 48));
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scaffoldState3 = scaffoldState2;
                function10 = function2M1068getLambda4$material_release;
                f3 = f2;
                j7 = jM1043getSurface0d7_KjU;
                j8 = j6;
                j9 = scrimColor;
                j10 = jM1032getBackground0d7_KjU;
                j11 = jM1057contentColorForek8zF_U2;
                function11 = function9;
                function12 = function11111119;
                int i31111118 = iM1110getEnd5ygKITE;
                z6 = z5;
                function13 = function2M1066getLambda2$material_release;
                i28 = i31111118;
                boolean z111118 = z3;
                shape2 = large;
                function14 = function3M1067getLambda3$material_release;
                z7 = z111118;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final long j11114 = j8;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
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

                public final void invoke(@Nullable Composer composer2, int i31111119) {
                    ScaffoldKt.m1172Scaffold27mzLpw(modifier2, scaffoldState3, function12, function13, function14, function10, i28, z7, function11, z6, shape2, f3, j7, j11114, j9, j10, j11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
        i23 = 12582912;
        i20 |= i23;
        if ((i5 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i4 & 2) != 0) {
                    scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                    i5 &= -113;
                } else {
                    scaffoldStateRememberScaffoldState = scaffoldState;
                }
                if (i32 != 0) {
                    function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                } else {
                    function2M1065getLambda1$material_release = function2;
                }
                if (i6 != 0) {
                    function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                } else {
                    function2M1066getLambda2$material_release = function3;
                }
                if (i8 != 0) {
                    function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                } else {
                    function3M1067getLambda3$material_release = function4;
                }
                if (i10 != 0) {
                    function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                } else {
                    function2M1068getLambda4$material_release = function5;
                }
                if (i12 != 0) {
                    iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                }
                if (i14 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if (i16 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i18 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                scaffoldState2 = scaffoldStateRememberScaffoldState;
                function9 = function8;
                if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i20 &= -15;
                } else {
                    large = shape;
                }
                i24 = i20;
                if (i21 != 0) {
                    fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                } else {
                    fM1079getElevationD9Ej5fM = f;
                }
                if ((i4 & 4096) != 0) {
                    boolean z111119 = z4;
                    i25 = i24 & (-897);
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    z5 = z111119;
                } else {
                    z5 = z4;
                    i25 = i24;
                    jM1043getSurface0d7_KjU = j;
                }
                float f119 = fM1079getElevationD9Ej5fM;
                if ((i4 & 8192) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                    i25 &= -7169;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                if ((i4 & 16384) != 0) {
                    i26 = 6;
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i25 &= -57345;
                } else {
                    i26 = 6;
                    scrimColor = j3;
                }
                if ((32768 & i4) != 0) {
                    jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                    i25 &= -458753;
                } else {
                    jM1032getBackground0d7_KjU = j4;
                }
                if ((i4 & 65536) != 0) {
                    i27 = i25 & (-3670017);
                    jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                } else {
                    jM1057contentColorForek8zF_U2 = j5;
                    i27 = i25;
                }
                j6 = jM1057contentColorForek8zF_U;
                f2 = f119;
            } else {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i4 & 2) != 0) {
                    scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                    i5 &= -113;
                } else {
                    scaffoldStateRememberScaffoldState = scaffoldState;
                }
                if (i32 != 0) {
                    function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                } else {
                    function2M1065getLambda1$material_release = function2;
                }
                if (i6 != 0) {
                    function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                } else {
                    function2M1066getLambda2$material_release = function3;
                }
                if (i8 != 0) {
                    function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                } else {
                    function3M1067getLambda3$material_release = function4;
                }
                if (i10 != 0) {
                    function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                } else {
                    function2M1068getLambda4$material_release = function5;
                }
                if (i12 != 0) {
                    iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                }
                if (i14 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if (i16 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i18 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                scaffoldState2 = scaffoldStateRememberScaffoldState;
                function9 = function8;
                if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i20 &= -15;
                } else {
                    large = shape;
                }
                i24 = i20;
                if (i21 != 0) {
                    fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                } else {
                    fM1079getElevationD9Ej5fM = f;
                }
                if ((i4 & 4096) != 0) {
                    boolean z1111110 = z4;
                    i25 = i24 & (-897);
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    z5 = z1111110;
                } else {
                    z5 = z4;
                    i25 = i24;
                    jM1043getSurface0d7_KjU = j;
                }
                float f1110 = fM1079getElevationD9Ej5fM;
                if ((i4 & 8192) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                    i25 &= -7169;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                if ((i4 & 16384) != 0) {
                    i26 = 6;
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i25 &= -57345;
                } else {
                    i26 = 6;
                    scrimColor = j3;
                }
                if ((32768 & i4) != 0) {
                    jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                    i25 &= -458753;
                } else {
                    jM1032getBackground0d7_KjU = j4;
                }
                if ((i4 & 65536) != 0) {
                    i27 = i25 & (-3670017);
                    jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                } else {
                    jM1057contentColorForek8zF_U2 = j5;
                    i27 = i25;
                }
                j6 = jM1057contentColorForek8zF_U;
                f2 = f1110;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1037492569, i5, i27, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
            }
            final long j11115 = jM1032getBackground0d7_KjU;
            final long j11116 = jM1057contentColorForek8zF_U2;
            final int i31111119 = i27;
            final boolean z1111111 = z3;
            final int i311111110 = iM1110getEnd5ygKITE;
            final Function2<? super Composer, ? super Integer, Unit> function111111110 = function2M1065getLambda1$material_release;
            final Function2<? super Composer, ? super Integer, Unit> function111111111 = function2M1068getLambda4$material_release;
            final Function2<? super Composer, ? super Integer, Unit> function111111112 = function2M1066getLambda2$material_release;
            final int i311111111 = i5;
            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function111111113 = function3M1067getLambda3$material_release;
            final ScaffoldState scaffoldState17 = scaffoldState2;
            Function2<? super Composer, ? super Integer, Unit> function111111114 = function2M1065getLambda1$material_release;
            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) {
                    invoke(modifier3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i311111112) {
                    int i311111113;
                    Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                    if ((i311111112 & 14) == 0) {
                        i311111113 = i311111112 | (composer2.changed(childModifier) ? 4 : 2);
                    } else {
                        i311111113 = i311111112;
                    }
                    if ((i311111113 & 91) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1823402604, i311111113, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                    }
                    long j11117 = j11115;
                    long j11118 = j11116;
                    final boolean z1111112 = z1111111;
                    final int i311111114 = i311111110;
                    final Function2<? super Composer, ? super Integer, Unit> function20 = function111111110;
                    final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function21 = content;
                    final Function2<? super Composer, ? super Integer, Unit> function22 = function111111111;
                    final Function2<? super Composer, ? super Integer, Unit> function23 = function111111112;
                    final int i40 = i311111111;
                    final int i41 = i31111119;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function24 = function111111113;
                    final ScaffoldState scaffoldState18 = scaffoldState17;
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                        public final void invoke(@Nullable Composer composer3, int i42) {
                            if ((i42 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1128984656, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                            }
                            boolean z1111113 = z1111112;
                            int i43 = i311111114;
                            Function2<Composer, Integer, Unit> function25 = function20;
                            Function3<PaddingValues, Composer, Integer, Unit> function26 = function21;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function27 = function24;
                            final ScaffoldState scaffoldState19 = scaffoldState18;
                            final int i44 = i40;
                            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i45) {
                                    if ((i45 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(533782017, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                    }
                                    function27.invoke(scaffoldState19.getSnackbarHostState(), composer4, Integer.valueOf((i44 >> 9) & 112));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                            Function2<Composer, Integer, Unit> function28 = function22;
                            Function2<Composer, Integer, Unit> function29 = function23;
                            int i45 = i40;
                            ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z1111113, i43, function25, function26, composableLambda3, function28, function29, composer3, ((i45 >> 21) & 14) | 24576 | ((i45 >> 15) & 112) | (i45 & 896) | ((i41 >> 12) & 7168) | (458752 & i45) | ((i45 << 9) & 3670016));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i42 = 1572864 | (i311111113 & 14);
                    int i43 = i31111119;
                    SurfaceKt.m1201SurfaceFjzlyU(childModifier, null, j11117, j11118, null, 0.0f, composableLambda2, composer2, i42 | ((i43 >> 9) & 896) | ((i43 >> 9) & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            if (function9 != null) {
                composerStartRestartGroup.startReplaceableGroup(-1013848234);
                int i311111112 = i27 << 12;
                DrawerKt.m1082ModalDrawerGs3lGvM(function9, modifier2, scaffoldState2.getDrawerState(), z5, large, f2, jM1043getSurface0d7_KjU, j6, scrimColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                    public final void invoke(@Nullable Composer composer2, int i311111113) {
                        if ((i311111113 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(100842932, i311111113, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                        }
                        composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i311111112 & 57344) | (i311111112 & 458752) | (i311111112 & 3670016) | (i311111112 & 29360128) | (i311111112 & 234881024), 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1013847725);
                composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i5 & 14) | 48));
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scaffoldState3 = scaffoldState2;
            function10 = function2M1068getLambda4$material_release;
            f3 = f2;
            j7 = jM1043getSurface0d7_KjU;
            j8 = j6;
            j9 = scrimColor;
            j10 = jM1032getBackground0d7_KjU;
            j11 = jM1057contentColorForek8zF_U2;
            function11 = function9;
            function12 = function111111114;
            int i311111113 = iM1110getEnd5ygKITE;
            z6 = z5;
            function13 = function2M1066getLambda2$material_release;
            i28 = i311111113;
            boolean z1111112 = z3;
            shape2 = large;
            function14 = function3M1067getLambda3$material_release;
            z7 = z1111112;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i4 & 2) != 0) {
                    scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                    i5 &= -113;
                } else {
                    scaffoldStateRememberScaffoldState = scaffoldState;
                }
                if (i32 != 0) {
                    function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                } else {
                    function2M1065getLambda1$material_release = function2;
                }
                if (i6 != 0) {
                    function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                } else {
                    function2M1066getLambda2$material_release = function3;
                }
                if (i8 != 0) {
                    function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                } else {
                    function3M1067getLambda3$material_release = function4;
                }
                if (i10 != 0) {
                    function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                } else {
                    function2M1068getLambda4$material_release = function5;
                }
                if (i12 != 0) {
                    iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                }
                if (i14 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if (i16 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i18 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                scaffoldState2 = scaffoldStateRememberScaffoldState;
                function9 = function8;
                if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i20 &= -15;
                } else {
                    large = shape;
                }
                i24 = i20;
                if (i21 != 0) {
                    fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                } else {
                    fM1079getElevationD9Ej5fM = f;
                }
                if ((i4 & 4096) != 0) {
                    boolean z1111113 = z4;
                    i25 = i24 & (-897);
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    z5 = z1111113;
                } else {
                    z5 = z4;
                    i25 = i24;
                    jM1043getSurface0d7_KjU = j;
                }
                float f1111 = fM1079getElevationD9Ej5fM;
                if ((i4 & 8192) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                    i25 &= -7169;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                if ((i4 & 16384) != 0) {
                    i26 = 6;
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i25 &= -57345;
                } else {
                    i26 = 6;
                    scrimColor = j3;
                }
                if ((32768 & i4) != 0) {
                    jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                    i25 &= -458753;
                } else {
                    jM1032getBackground0d7_KjU = j4;
                }
                if ((i4 & 65536) != 0) {
                    i27 = i25 & (-3670017);
                    jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                } else {
                    jM1057contentColorForek8zF_U2 = j5;
                    i27 = i25;
                }
                j6 = jM1057contentColorForek8zF_U;
                f2 = f1111;
            } else {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i4 & 2) != 0) {
                    scaffoldStateRememberScaffoldState = rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                    i5 &= -113;
                } else {
                    scaffoldStateRememberScaffoldState = scaffoldState;
                }
                if (i32 != 0) {
                    function2M1065getLambda1$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1065getLambda1$material_release();
                } else {
                    function2M1065getLambda1$material_release = function2;
                }
                if (i6 != 0) {
                    function2M1066getLambda2$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1066getLambda2$material_release();
                } else {
                    function2M1066getLambda2$material_release = function3;
                }
                if (i8 != 0) {
                    function3M1067getLambda3$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1067getLambda3$material_release();
                } else {
                    function3M1067getLambda3$material_release = function4;
                }
                if (i10 != 0) {
                    function2M1068getLambda4$material_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1068getLambda4$material_release();
                } else {
                    function2M1068getLambda4$material_release = function5;
                }
                if (i12 != 0) {
                    iM1110getEnd5ygKITE = FabPosition.INSTANCE.m1110getEnd5ygKITE();
                }
                if (i14 != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if (i16 != 0) {
                    function8 = null;
                } else {
                    function8 = function6;
                }
                if (i18 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                scaffoldState2 = scaffoldStateRememberScaffoldState;
                function9 = function8;
                if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getLarge();
                    i20 &= -15;
                } else {
                    large = shape;
                }
                i24 = i20;
                if (i21 != 0) {
                    fM1079getElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1079getElevationD9Ej5fM();
                } else {
                    fM1079getElevationD9Ej5fM = f;
                }
                if ((i4 & 4096) != 0) {
                    boolean z1111114 = z4;
                    i25 = i24 & (-897);
                    jM1043getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m1043getSurface0d7_KjU();
                    z5 = z1111114;
                } else {
                    z5 = z4;
                    i25 = i24;
                    jM1043getSurface0d7_KjU = j;
                }
                float f1112 = fM1079getElevationD9Ej5fM;
                if ((i4 & 8192) != 0) {
                    jM1057contentColorForek8zF_U = ColorsKt.m1057contentColorForek8zF_U(jM1043getSurface0d7_KjU, composerStartRestartGroup, (i25 >> 6) & 14);
                    i25 &= -7169;
                } else {
                    jM1057contentColorForek8zF_U = j2;
                }
                if ((i4 & 16384) != 0) {
                    i26 = 6;
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i25 &= -57345;
                } else {
                    i26 = 6;
                    scrimColor = j3;
                }
                if ((32768 & i4) != 0) {
                    jM1032getBackground0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, i26).m1032getBackground0d7_KjU();
                    i25 &= -458753;
                } else {
                    jM1032getBackground0d7_KjU = j4;
                }
                if ((i4 & 65536) != 0) {
                    i27 = i25 & (-3670017);
                    jM1057contentColorForek8zF_U2 = ColorsKt.m1057contentColorForek8zF_U(jM1032getBackground0d7_KjU, composerStartRestartGroup, (i25 >> 15) & 14);
                } else {
                    jM1057contentColorForek8zF_U2 = j5;
                    i27 = i25;
                }
                j6 = jM1057contentColorForek8zF_U;
                f2 = f1112;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1037492569, i5, i27, "androidx.compose.material.Scaffold (Scaffold.kt:158)");
            }
            final long j11117 = jM1032getBackground0d7_KjU;
            final long j11118 = jM1057contentColorForek8zF_U2;
            final int i311111114 = i27;
            final boolean z1111115 = z3;
            final int i311111115 = iM1110getEnd5ygKITE;
            final Function2<? super Composer, ? super Integer, Unit> function111111115 = function2M1065getLambda1$material_release;
            final Function2<? super Composer, ? super Integer, Unit> function111111116 = function2M1068getLambda4$material_release;
            final Function2<? super Composer, ? super Integer, Unit> function111111117 = function2M1066getLambda2$material_release;
            final int i311111116 = i5;
            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function111111118 = function3M1067getLambda3$material_release;
            final ScaffoldState scaffoldState18 = scaffoldState2;
            Function2<? super Composer, ? super Integer, Unit> function111111119 = function2M1065getLambda1$material_release;
            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1823402604, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier3, Composer composer2, Integer num) {
                    invoke(modifier3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer2, int i311111117) {
                    int i311111118;
                    Intrinsics.checkNotNullParameter(childModifier, "childModifier");
                    if ((i311111117 & 14) == 0) {
                        i311111118 = i311111117 | (composer2.changed(childModifier) ? 4 : 2);
                    } else {
                        i311111118 = i311111117;
                    }
                    if ((i311111118 & 91) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1823402604, i311111118, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
                    }
                    long j11119 = j11117;
                    long j111110 = j11118;
                    final boolean z1111116 = z1111115;
                    final int i311111119 = i311111115;
                    final Function2<? super Composer, ? super Integer, Unit> function20 = function111111115;
                    final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function21 = content;
                    final Function2<? super Composer, ? super Integer, Unit> function22 = function111111116;
                    final Function2<? super Composer, ? super Integer, Unit> function23 = function111111117;
                    final int i40 = i311111116;
                    final int i41 = i311111114;
                    final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function24 = function111111118;
                    final ScaffoldState scaffoldState19 = scaffoldState18;
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.1
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
                        public final void invoke(@Nullable Composer composer3, int i42) {
                            if ((i42 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1128984656, i42, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                            }
                            boolean z1111117 = z1111116;
                            int i43 = i311111119;
                            Function2<Composer, Integer, Unit> function25 = function20;
                            Function3<PaddingValues, Composer, Integer, Unit> function26 = function21;
                            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function27 = function24;
                            final ScaffoldState scaffoldState110 = scaffoldState19;
                            final int i44 = i40;
                            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer3, 533782017, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer4, int i45) {
                                    if ((i45 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(533782017, i45, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                    }
                                    function27.invoke(scaffoldState110.getSnackbarHostState(), composer4, Integer.valueOf((i44 >> 9) & 112));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            });
                            Function2<Composer, Integer, Unit> function28 = function22;
                            Function2<Composer, Integer, Unit> function29 = function23;
                            int i45 = i40;
                            ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z1111117, i43, function25, function26, composableLambda3, function28, function29, composer3, ((i45 >> 21) & 14) | 24576 | ((i45 >> 15) & 112) | (i45 & 896) | ((i41 >> 12) & 7168) | (458752 & i45) | ((i45 << 9) & 3670016));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    int i42 = 1572864 | (i311111118 & 14);
                    int i43 = i311111114;
                    SurfaceKt.m1201SurfaceFjzlyU(childModifier, null, j11119, j111110, null, 0.0f, composableLambda2, composer2, i42 | ((i43 >> 9) & 896) | ((i43 >> 9) & 7168), 50);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            });
            if (function9 != null) {
                composerStartRestartGroup.startReplaceableGroup(-1013848234);
                int i311111117 = i27 << 12;
                DrawerKt.m1082ModalDrawerGs3lGvM(function9, modifier2, scaffoldState2.getDrawerState(), z5, large, f2, jM1043getSurface0d7_KjU, j6, scrimColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 100842932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
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
                    public final void invoke(@Nullable Composer composer2, int i311111118) {
                        if ((i311111118 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(100842932, i311111118, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
                        }
                        composableLambda.invoke(Modifier.INSTANCE, composer2, 54);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composerStartRestartGroup, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i311111117 & 57344) | (i311111117 & 458752) | (i311111117 & 3670016) | (i311111117 & 29360128) | (i311111117 & 234881024), 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1013847725);
                composableLambda.invoke(modifier2, composerStartRestartGroup, Integer.valueOf((i5 & 14) | 48));
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scaffoldState3 = scaffoldState2;
            function10 = function2M1068getLambda4$material_release;
            f3 = f2;
            j7 = jM1043getSurface0d7_KjU;
            j8 = j6;
            j9 = scrimColor;
            j10 = jM1032getBackground0d7_KjU;
            j11 = jM1057contentColorForek8zF_U2;
            function11 = function9;
            function12 = function111111119;
            int i311111118 = iM1110getEnd5ygKITE;
            z6 = z5;
            function13 = function2M1066getLambda2$material_release;
            i28 = i311111118;
            boolean z1111116 = z3;
            shape2 = large;
            function14 = function3M1067getLambda3$material_release;
            z7 = z1111116;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final long j11119 = j8;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
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

            public final void invoke(@Nullable Composer composer2, int i311111119) {
                ScaffoldKt.m1172Scaffold27mzLpw(modifier2, scaffoldState3, function12, function13, function14, function10, i28, z7, function11, z6, shape2, f3, j7, j11119, j9, j10, j11, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @UiComposable
    /* JADX INFO: renamed from: ScaffoldLayout-MDYNRJg, reason: not valid java name */
    public static final void m1173ScaffoldLayoutMDYNRJg(final boolean z, final int i, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function4, final Function2<? super Composer, ? super Integer, Unit> function5, final Function2<? super Composer, ? super Integer, Unit> function6, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1401632215);
        int i3 = (i2 & 14) == 0 ? (composerStartRestartGroup.changed(z) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((57344 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function4) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function5) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function6) ? ZegoConstants.ErrorMask.RoomServerErrorMask : 524288;
        }
        final int i4 = i3;
        if ((2995931 & i4) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1401632215, i4, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:227)");
            }
            Object[] objArr = {function2, function4, function5, FabPosition.m1102boximpl(i), Boolean.valueOf(z), function6, function3};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            int i5 = 0;
            boolean zChanged = false;
            for (int i6 = 7; i5 < i6; i6 = 7) {
                zChanged |= composerStartRestartGroup.changed(objArr[i5]);
                i5++;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function7 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m1175invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                    }

                    @NotNull
                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m1175invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, long j) {
                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                        final int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j);
                        final int iM3742getMaxHeightimpl = Constraints.m3742getMaxHeightimpl(j);
                        final long jM3734copyZbe2FdA$default = Constraints.m3734copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                        final Function2<Composer, Integer, Unit> function8 = function2;
                        final Function2<Composer, Integer, Unit> function9 = function4;
                        final Function2<Composer, Integer, Unit> function10 = function5;
                        final int i7 = i;
                        final boolean z2 = z;
                        final Function2<Composer, Integer, Unit> function11 = function6;
                        final int i8 = i4;
                        final Function3<PaddingValues, Composer, Integer, Unit> function12 = function3;
                        return MeasureScope.CC.OooOOo0(SubcomposeLayout, iM3743getMaxWidthimpl, iM3742getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Code duplicated, block: B:83:0x01bb  */
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                                Object obj;
                                Object obj2;
                                final FabPlacement fabPlacement;
                                Object obj3;
                                Integer numValueOf;
                                int height;
                                int iMo320roundToPx0680j_4;
                                int height2;
                                Object obj4;
                                Object obj5;
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                List<Measurable> listSubcompose = SubcomposeLayout.subcompose(ScaffoldLayoutContent.TopBar, function8);
                                long j2 = jM3734copyZbe2FdA$default;
                                ArrayList arrayList = new ArrayList(listSubcompose.size());
                                int size = listSubcompose.size();
                                int i9 = 0;
                                for (int i10 = 0; i10 < size; i10++) {
                                    arrayList.add(listSubcompose.get(i10).mo2804measureBRTryo0(j2));
                                }
                                if (!arrayList.isEmpty()) {
                                    obj = arrayList.get(0);
                                    int height3 = ((Placeable) obj).getHeight();
                                    int lastIndex = CollectionsKt.getLastIndex(arrayList);
                                    if (1 <= lastIndex) {
                                        int i11 = 1;
                                        while (true) {
                                            Object obj6 = arrayList.get(i11);
                                            int height4 = ((Placeable) obj6).getHeight();
                                            if (height3 < height4) {
                                                obj = obj6;
                                                height3 = height4;
                                            }
                                            if (i11 == lastIndex) {
                                                break;
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                } else {
                                    obj = null;
                                }
                                Placeable placeable = (Placeable) obj;
                                int height5 = placeable != null ? placeable.getHeight() : 0;
                                List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(ScaffoldLayoutContent.Snackbar, function9);
                                long j3 = jM3734copyZbe2FdA$default;
                                ArrayList arrayList2 = new ArrayList(listSubcompose2.size());
                                int size2 = listSubcompose2.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    arrayList2.add(listSubcompose2.get(i12).mo2804measureBRTryo0(j3));
                                }
                                if (!arrayList2.isEmpty()) {
                                    obj2 = arrayList2.get(0);
                                    int height6 = ((Placeable) obj2).getHeight();
                                    int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
                                    if (1 <= lastIndex2) {
                                        int i13 = 1;
                                        while (true) {
                                            Object obj7 = arrayList2.get(i13);
                                            int height7 = ((Placeable) obj7).getHeight();
                                            if (height6 < height7) {
                                                obj2 = obj7;
                                                height6 = height7;
                                            }
                                            if (i13 == lastIndex2) {
                                                break;
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }
                                } else {
                                    obj2 = null;
                                }
                                Placeable placeable2 = (Placeable) obj2;
                                int height8 = placeable2 != null ? placeable2.getHeight() : 0;
                                List<Measurable> listSubcompose3 = SubcomposeLayout.subcompose(ScaffoldLayoutContent.Fab, function10);
                                long j4 = jM3734copyZbe2FdA$default;
                                ArrayList arrayList3 = new ArrayList(listSubcompose3.size());
                                int size3 = listSubcompose3.size();
                                for (int i14 = 0; i14 < size3; i14++) {
                                    arrayList3.add(listSubcompose3.get(i14).mo2804measureBRTryo0(j4));
                                }
                                if (!arrayList3.isEmpty()) {
                                    if (!arrayList3.isEmpty()) {
                                        obj4 = arrayList3.get(0);
                                        int width = ((Placeable) obj4).getWidth();
                                        int lastIndex3 = CollectionsKt.getLastIndex(arrayList3);
                                        if (1 <= lastIndex3) {
                                            int i15 = 1;
                                            while (true) {
                                                Object obj8 = arrayList3.get(i15);
                                                int width2 = ((Placeable) obj8).getWidth();
                                                if (width < width2) {
                                                    obj4 = obj8;
                                                    width = width2;
                                                }
                                                if (i15 == lastIndex3) {
                                                    break;
                                                } else {
                                                    i15++;
                                                }
                                            }
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                    Placeable placeable3 = (Placeable) obj4;
                                    int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                                    if (!arrayList3.isEmpty()) {
                                        obj5 = arrayList3.get(0);
                                        int height9 = ((Placeable) obj5).getHeight();
                                        int lastIndex4 = CollectionsKt.getLastIndex(arrayList3);
                                        if (1 <= lastIndex4) {
                                            int i16 = 1;
                                            while (true) {
                                                Object obj9 = arrayList3.get(i16);
                                                int height10 = ((Placeable) obj9).getHeight();
                                                if (height9 < height10) {
                                                    height9 = height10;
                                                    obj5 = obj9;
                                                }
                                                if (i16 == lastIndex4) {
                                                    break;
                                                } else {
                                                    i16++;
                                                }
                                            }
                                        }
                                    } else {
                                        obj5 = null;
                                    }
                                    Placeable placeable4 = (Placeable) obj5;
                                    int height11 = placeable4 != null ? placeable4.getHeight() : 0;
                                    if (width3 == 0 || height11 == 0) {
                                        fabPlacement = null;
                                    } else {
                                        fabPlacement = new FabPlacement(z2, FabPosition.m1105equalsimpl0(i7, FabPosition.INSTANCE.m1110getEnd5ygKITE()) ? SubcomposeLayout.getLayoutDirection() == LayoutDirection.Ltr ? (iM3743getMaxWidthimpl - SubcomposeLayout.mo320roundToPx0680j_4(ScaffoldKt.FabSpacing)) - width3 : SubcomposeLayout.mo320roundToPx0680j_4(ScaffoldKt.FabSpacing) : (iM3743getMaxWidthimpl - width3) / 2, width3, height11);
                                    }
                                } else {
                                    fabPlacement = null;
                                }
                                SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                                final Function2<Composer, Integer, Unit> function13 = function11;
                                final int i17 = i8;
                                List<Measurable> listSubcompose4 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(1529070963, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1
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
                                    public final void invoke(@Nullable Composer composer2, int i18) {
                                        if ((i18 & 11) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1529070963, i18, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:288)");
                                        }
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ScaffoldKt.getLocalFabPlacement().provides(fabPlacement)}, function13, composer2, ((i17 >> 15) & 112) | 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                long j5 = jM3734copyZbe2FdA$default;
                                ArrayList arrayList4 = new ArrayList(listSubcompose4.size());
                                int size4 = listSubcompose4.size();
                                for (int i18 = 0; i18 < size4; i18++) {
                                    arrayList4.add(listSubcompose4.get(i18).mo2804measureBRTryo0(j5));
                                }
                                if (!arrayList4.isEmpty()) {
                                    obj3 = arrayList4.get(0);
                                    int height12 = ((Placeable) obj3).getHeight();
                                    int lastIndex5 = CollectionsKt.getLastIndex(arrayList4);
                                    if (1 <= lastIndex5) {
                                        int i19 = 1;
                                        while (true) {
                                            Object obj10 = arrayList4.get(i19);
                                            int height13 = ((Placeable) obj10).getHeight();
                                            if (height12 < height13) {
                                                obj3 = obj10;
                                                height12 = height13;
                                            }
                                            if (i19 == lastIndex5) {
                                                break;
                                            } else {
                                                i19++;
                                            }
                                        }
                                    }
                                } else {
                                    obj3 = null;
                                }
                                Placeable placeable5 = (Placeable) obj3;
                                final int height14 = placeable5 != null ? placeable5.getHeight() : 0;
                                if (fabPlacement != null) {
                                    SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                    boolean z3 = z2;
                                    if (height14 == 0) {
                                        height = fabPlacement.getHeight();
                                        iMo320roundToPx0680j_4 = subcomposeMeasureScope2.mo320roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    } else {
                                        if (z3) {
                                            height2 = (fabPlacement.getHeight() / 2) + height14;
                                        } else {
                                            height = fabPlacement.getHeight() + height14;
                                            iMo320roundToPx0680j_4 = subcomposeMeasureScope2.mo320roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                        }
                                        numValueOf = Integer.valueOf(height2);
                                    }
                                    height2 = iMo320roundToPx0680j_4 + height;
                                    numValueOf = Integer.valueOf(height2);
                                } else {
                                    numValueOf = null;
                                }
                                int iIntValue = height8 != 0 ? height8 + (numValueOf != null ? numValueOf.intValue() : height14) : 0;
                                int i20 = iM3742getMaxHeightimpl - height5;
                                final SubcomposeMeasureScope subcomposeMeasureScope3 = SubcomposeLayout;
                                ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                                final Function3<PaddingValues, Composer, Integer, Unit> function14 = function12;
                                final int i21 = i8;
                                List<Measurable> listSubcompose5 = subcomposeMeasureScope3.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(-1132241596, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1
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

                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i22) {
                                        if ((i22 & 11) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1132241596, i22, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:319)");
                                        }
                                        function14.invoke(PaddingKt.m475PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, subcomposeMeasureScope3.mo323toDpu2uoSUM(height14), 7, null), composer2, Integer.valueOf((i21 >> 6) & 112));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                long j6 = jM3734copyZbe2FdA$default;
                                ArrayList arrayList5 = new ArrayList(listSubcompose5.size());
                                int size5 = listSubcompose5.size();
                                while (i9 < size5) {
                                    arrayList5.add(listSubcompose5.get(i9).mo2804measureBRTryo0(Constraints.m3734copyZbe2FdA$default(j6, 0, 0, 0, i20, 7, null)));
                                    i9++;
                                    listSubcompose5 = listSubcompose5;
                                    j6 = j6;
                                }
                                int size6 = arrayList5.size();
                                int i22 = 0;
                                while (i22 < size6) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList5.get(i22), 0, height5, 0.0f, 4, null);
                                    i22++;
                                    arrayList5 = arrayList5;
                                    height14 = height14;
                                }
                                int i23 = height14;
                                int size7 = arrayList.size();
                                for (int i24 = 0; i24 < size7; i24++) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList.get(i24), 0, 0, 0.0f, 4, null);
                                }
                                int i25 = iM3742getMaxHeightimpl;
                                int size8 = arrayList2.size();
                                for (int i26 = 0; i26 < size8; i26++) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList2.get(i26), 0, i25 - iIntValue, 0.0f, 4, null);
                                }
                                int i27 = iM3742getMaxHeightimpl;
                                int size9 = arrayList4.size();
                                for (int i28 = 0; i28 < size9; i28++) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList4.get(i28), 0, i27 - i23, 0.0f, 4, null);
                                }
                                int i29 = iM3742getMaxHeightimpl;
                                int size10 = arrayList3.size();
                                for (int i30 = 0; i30 < size10; i30++) {
                                    Placeable.PlacementScope.place$default(layout, (Placeable) arrayList3.get(i30), fabPlacement != null ? fabPlacement.getLeft() : 0, i29 - (numValueOf != null ? numValueOf.intValue() : 0), 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function7);
                objRememberedValue = function7;
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
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

            public final void invoke(@Nullable Composer composer2, int i7) {
                ScaffoldKt.m1173ScaffoldLayoutMDYNRJg(z, i, function2, function3, function4, function5, function6, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    @NotNull
    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }

    @Composable
    @NotNull
    public static final ScaffoldState rememberScaffoldState(@Nullable DrawerState drawerState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1569641925);
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1569641925, i, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:62)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new ScaffoldState(drawerState, snackbarHostState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        ScaffoldState scaffoldState = (ScaffoldState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scaffoldState;
    }
}
