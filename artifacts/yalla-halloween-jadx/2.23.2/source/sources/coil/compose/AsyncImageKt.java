package coil.compose;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OooO;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p118o00O0Oo.o00000O;
import p121o00O0Ooo.o0000;
import p121o00O0Ooo.o0000O0;
import p121o00O0Ooo.o0000O0O;
import p121o00O0Ooo.o0000Ooo;
import p121o00O0Ooo.o000Oo0;
import p130o00O0oo.o000O00O;
import p130o00O0oo.o000O0Oo;
import p130o00O0oo.o000OO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class AsyncImageKt {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<o0000.OooO0O0, Unit> f11587OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Object f11588OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00000O f11589OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f11590OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Modifier f11591OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<o0000.OooO0O0, o0000.OooO0O0> f11592OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Alignment f11593OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ ContentScale f11594OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ float f11595OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f11596OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ ColorFilter f11597OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f11598OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ int f11599OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f11600OooOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Object obj, String str, o00000O o00000o, Modifier modifier, Function1<? super o0000.OooO0O0, ? extends o0000.OooO0O0> function1, Function1<? super o0000.OooO0O0, Unit> function2, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, int i2, int i3, int i4) {
            super(2);
            this.f11588OooO0Oo = obj;
            this.f11590OooO0o0 = str;
            this.f11589OooO0o = o00000o;
            this.f11591OooO0oO = modifier;
            this.f11592OooO0oo = function1;
            this.f11587OooO = function2;
            this.f11593OooOO0 = alignment;
            this.f11594OooOO0O = contentScale;
            this.f11595OooOO0o = f;
            this.f11597OooOOO0 = colorFilter;
            this.f11596OooOOO = i;
            this.f11598OooOOOO = i2;
            this.f11599OooOOOo = i3;
            this.f11600OooOOo0 = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AsyncImageKt.OooO00o(this.f11588OooO0Oo, this.f11590OooO0o0, this.f11589OooO0o, this.f11591OooO0oO, this.f11592OooO0oo, this.f11587OooO, this.f11593OooOO0, this.f11594OooOO0O, this.f11595OooOO0o, this.f11597OooOOO0, this.f11596OooOOO, composer, this.f11598OooOOOO | 1, this.f11599OooOOOo, this.f11600OooOOo0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements MeasurePolicy {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f11601OooO00o = new OooO0O0();

        public static final class OooO00o extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO00o f11602OooO0Oo = new OooO00o();

            public OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                return Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return OooO.OooO00o(this, intrinsicMeasureScope, list, i);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return OooO.OooO0O0(this, intrinsicMeasureScope, list, i);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo3measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j) {
            return MeasureScope.CC.OooOOo0(measureScope, Constraints.m3745getMinWidthimpl(j), Constraints.m3744getMinHeightimpl(j), null, OooO00o.f11602OooO0Oo, 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return OooO.OooO0OO(this, intrinsicMeasureScope, list, i);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return OooO.OooO0Oo(this, intrinsicMeasureScope, list, i);
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ float f11603OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f11604OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f11605OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Painter f11606OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Alignment f11607OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ ContentScale f11608OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ ColorFilter f11609OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f11610OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i) {
            super(2);
            this.f11604OooO0Oo = modifier;
            this.f11606OooO0o0 = painter;
            this.f11605OooO0o = str;
            this.f11607OooO0oO = alignment;
            this.f11608OooO0oo = contentScale;
            this.f11603OooO = f;
            this.f11609OooOO0 = colorFilter;
            this.f11610OooOO0O = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AsyncImageKt.OooO0O0(this.f11604OooO0Oo, this.f11606OooO0o0, this.f11605OooO0o, this.f11607OooO0oO, this.f11608OooO0oo, this.f11603OooO, this.f11609OooOO0, composer, this.f11610OooOO0O | 1);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void OooO00o(@Nullable Object obj, @Nullable String str, @NotNull o00000O o00000o, @Nullable Modifier modifier, @Nullable Function1<? super o0000.OooO0O0, ? extends o0000.OooO0O0> function1, @Nullable Function1<? super o0000.OooO0O0, Unit> function2, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, int i, @Nullable Composer composer, int i2, int i3, int i4) {
        int iM2149getDefaultFilterQualityfv9h1I;
        int i5;
        o000OO0O o000o00o2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2030202961);
        Modifier modifier2 = (i4 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Function1<? super o0000.OooO0O0, ? extends o0000.OooO0O0> function3 = (i4 & 16) != 0 ? o0000.f36419OooOOoo : function1;
        Function1<? super o0000.OooO0O0, Unit> function4 = (i4 & 32) != 0 ? null : function2;
        Alignment center = (i4 & 64) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i4 & 128) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : colorFilter;
        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
            i5 = i3 & (-15);
            iM2149getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m2149getDefaultFilterQualityfv9h1I();
        } else {
            iM2149getDefaultFilterQualityfv9h1I = i;
            i5 = i3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2030202961, i2, i5, "coil.compose.AsyncImage (AsyncImage.kt:116)");
        }
        coil.request.OooO00o OooO00o2 = o000Oo0.OooO00o(obj, composerStartRestartGroup);
        int i6 = ((i2 >> 18) & 112) | 8;
        composerStartRestartGroup.startReplaceableGroup(402368983);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(402368983, i6, -1, "coil.compose.updateRequest (AsyncImage.kt:181)");
        }
        if (OooO00o2.f11676Oooo0o0.f36821OooO0O0 == null) {
            if (Intrinsics.areEqual(fit, ContentScale.INSTANCE.getNone())) {
                o000o00o2 = new o000O00O(o000O0Oo.f36770OooO0OO);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new o0000O0O();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                o000o00o2 = (o000OO0O) objRememberedValue;
            }
            coil.request.OooO00o.C0189OooO00o c0189OooO00oOooO00o = coil.request.OooO00o.OooO00o(OooO00o2);
            c0189OooO00oOooO00o.f11713Oooo0OO = o000o00o2;
            c0189OooO00oOooO00o.OooO0o0();
            OooO00o2 = c0189OooO00oOooO00o.OooO00o();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i7 = i2 >> 6;
        int i8 = i2 >> 9;
        int i9 = 57344 & i8;
        o0000 o0000VarOooO00o = o0000O0.OooO00o(OooO00o2, o00000o, function3, function4, fit, iM2149getDefaultFilterQualityfv9h1I, composerStartRestartGroup, (i7 & 7168) | (i7 & 896) | 72 | i9 | ((i5 << 15) & 458752));
        o000OO0O o000oo0o2 = OooO00o2.f11666OooOoo0;
        OooO0O0(o000oo0o2 instanceof o0000O0O ? modifier2.then((Modifier) o000oo0o2) : modifier2, o0000VarOooO00o, str, center, fit, f2, colorFilter2, composerStartRestartGroup, ((i2 << 3) & 896) | (i8 & 7168) | i9 | (458752 & i8) | (i8 & 3670016));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(obj, str, o00000o, modifier2, function3, function4, center, fit, f2, colorFilter2, iM2149getDefaultFilterQualityfv9h1I, i2, i3, i4));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull Modifier modifier, @NotNull Painter painter, @Nullable String str, @NotNull Alignment alignment, @NotNull ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, @Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(10290533);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10290533, i, -1, "coil.compose.Content (AsyncImage.kt:154)");
        }
        Modifier modifierThen = ClipKt.clipToBounds(str != null ? SemanticsModifierKt.semantics$default(modifier, false, new o0000Ooo(str), 1, null) : modifier).then(new ContentPainterModifier(painter, alignment, contentScale, f, colorFilter));
        OooO0O0 oooO0O0 = OooO0O0.f11601OooO00o;
        composerStartRestartGroup.startReplaceableGroup(544976794);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Modifier modifierMaterialize = ComposedModifierKt.materialize(composerStartRestartGroup, modifierThen);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        final Function0<ComposeUiNode> constructor = companion.getConstructor();
        composerStartRestartGroup.startReplaceableGroup(1405779621);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(new Function0<ComposeUiNode>() { // from class: coil.compose.AsyncImageKt$Content$$inlined$Layout$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final ComposeUiNode invoke() {
                    return constructor.invoke();
                }
            });
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Updater.m1327setimpl(composerM1320constructorimpl, oooO0O0, companion.getSetMeasurePolicy());
        Updater.m1327setimpl(composerM1320constructorimpl, density, companion.getSetDensity());
        Updater.m1327setimpl(composerM1320constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1327setimpl(composerM1320constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        Updater.m1327setimpl(composerM1320constructorimpl, modifierMaterialize, companion.getSetModifier());
        composerStartRestartGroup.enableReusing();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(modifier, painter, str, alignment, contentScale, f, colorFilter, i));
    }
}
