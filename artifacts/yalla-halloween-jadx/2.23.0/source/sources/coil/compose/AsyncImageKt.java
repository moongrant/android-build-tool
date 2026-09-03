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
import p097o000o0oO.o000O000;
import p100o000oOoo.o0000O;
import p100o000oOoo.o0000O0;
import p100o000oOoo.o0000OO0;
import p100o000oOoo.o0000oo;
import p100o000oOoo.o000O0;
import p111o000oooO.o00O00;
import p111o000oooO.o00O000;
import p111o000oooO.o00O00O;

/* JADX INFO: loaded from: classes2.dex */
public final class AsyncImageKt {

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<o0000O0.OooO0O0, Unit> f8497OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Object f8498OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o000O000 f8499OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f8500OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Modifier f8501OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<o0000O0.OooO0O0, o0000O0.OooO0O0> f8502OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Alignment f8503OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ ContentScale f8504OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ float f8505OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f8506OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ ColorFilter f8507OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f8508OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ int f8509OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f8510OooOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Object obj, String str, o000O000 o000o001, Modifier modifier, Function1<? super o0000O0.OooO0O0, ? extends o0000O0.OooO0O0> function1, Function1<? super o0000O0.OooO0O0, Unit> function2, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, int i2, int i3, int i4) {
            super(2);
            this.f8498OooO0Oo = obj;
            this.f8500OooO0o0 = str;
            this.f8499OooO0o = o000o001;
            this.f8501OooO0oO = modifier;
            this.f8502OooO0oo = function1;
            this.f8497OooO = function2;
            this.f8503OooOO0 = alignment;
            this.f8504OooOO0O = contentScale;
            this.f8505OooOO0o = f;
            this.f8507OooOOO0 = colorFilter;
            this.f8506OooOOO = i;
            this.f8508OooOOOO = i2;
            this.f8509OooOOOo = i3;
            this.f8510OooOOo0 = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AsyncImageKt.OooO00o(this.f8498OooO0Oo, this.f8500OooO0o0, this.f8499OooO0o, this.f8501OooO0oO, this.f8502OooO0oo, this.f8497OooO, this.f8503OooOO0, this.f8504OooOO0O, this.f8505OooOO0o, this.f8507OooOOO0, this.f8506OooOOO, composer, this.f8508OooOOOO | 1, this.f8509OooOOOo, this.f8510OooOOo0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements MeasurePolicy {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f8511OooO00o = new OooO0O0();

        public static final class OooO00o extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO00o f8512OooO0Oo = new OooO00o();

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
            return MeasureScope.CC.OooOOo0(measureScope, Constraints.m3735getMinWidthimpl(j), Constraints.m3734getMinHeightimpl(j), null, OooO00o.f8512OooO0Oo, 4, null);
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
        public final /* synthetic */ float f8513OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f8514OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f8515OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Painter f8516OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Alignment f8517OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ ContentScale f8518OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ ColorFilter f8519OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f8520OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i) {
            super(2);
            this.f8514OooO0Oo = modifier;
            this.f8516OooO0o0 = painter;
            this.f8515OooO0o = str;
            this.f8517OooO0oO = alignment;
            this.f8518OooO0oo = contentScale;
            this.f8513OooO = f;
            this.f8519OooOO0 = colorFilter;
            this.f8520OooOO0O = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AsyncImageKt.OooO0O0(this.f8514OooO0Oo, this.f8516OooO0o0, this.f8515OooO0o, this.f8517OooO0oO, this.f8518OooO0oo, this.f8513OooO, this.f8519OooOO0, composer, this.f8520OooOO0O | 1);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void OooO00o(@Nullable Object obj, @Nullable String str, @NotNull o000O000 o000o001, @Nullable Modifier modifier, @Nullable Function1<? super o0000O0.OooO0O0, ? extends o0000O0.OooO0O0> function1, @Nullable Function1<? super o0000O0.OooO0O0, Unit> function2, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, int i, @Nullable Composer composer, int i2, int i3, int i4) {
        int iM2139getDefaultFilterQualityfv9h1I;
        int i5;
        o00O00O o00o001;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2030202961);
        Modifier modifier2 = (i4 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Function1<? super o0000O0.OooO0O0, ? extends o0000O0.OooO0O0> function3 = (i4 & 16) != 0 ? o0000O0.f35466OooOOoo : function1;
        Function1<? super o0000O0.OooO0O0, Unit> function4 = (i4 & 32) != 0 ? null : function2;
        Alignment center = (i4 & 64) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i4 & 128) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : colorFilter;
        if ((i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
            i5 = i3 & (-15);
            iM2139getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m2139getDefaultFilterQualityfv9h1I();
        } else {
            iM2139getDefaultFilterQualityfv9h1I = i;
            i5 = i3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2030202961, i2, i5, "coil.compose.AsyncImage (AsyncImage.kt:116)");
        }
        coil.request.OooO00o OooO00o2 = o000O0.OooO00o(obj, composerStartRestartGroup);
        int i6 = ((i2 >> 18) & 112) | 8;
        composerStartRestartGroup.startReplaceableGroup(402368983);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(402368983, i6, -1, "coil.compose.updateRequest (AsyncImage.kt:181)");
        }
        if (OooO00o2.f8586Oooo0o0.f35879OooO0O0 == null) {
            if (Intrinsics.areEqual(fit, ContentScale.INSTANCE.getNone())) {
                o00o001 = new o00O000(o00O00.f35923OooO0OO);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new o0000OO0();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                o00o001 = (o00O00O) objRememberedValue;
            }
            coil.request.OooO00o.C0170OooO00o c0170OooO00oOooO00o = coil.request.OooO00o.OooO00o(OooO00o2);
            c0170OooO00oOooO00o.f8623Oooo0OO = o00o001;
            c0170OooO00oOooO00o.OooO0o0();
            OooO00o2 = c0170OooO00oOooO00o.OooO00o();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i7 = i2 >> 6;
        int i8 = i2 >> 9;
        int i9 = 57344 & i8;
        o0000O0 o0000o0OooO00o = o0000O.OooO00o(OooO00o2, o000o001, function3, function4, fit, iM2139getDefaultFilterQualityfv9h1I, composerStartRestartGroup, (i7 & 7168) | (i7 & 896) | 72 | i9 | ((i5 << 15) & 458752));
        o00O00O o00o00o2 = OooO00o2.f8576OooOoo0;
        OooO0O0(o00o00o2 instanceof o0000OO0 ? modifier2.then((Modifier) o00o00o2) : modifier2, o0000o0OooO00o, str, center, fit, f2, colorFilter2, composerStartRestartGroup, ((i2 << 3) & 896) | (i8 & 7168) | i9 | (458752 & i8) | (i8 & 3670016));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(obj, str, o000o001, modifier2, function3, function4, center, fit, f2, colorFilter2, iM2139getDefaultFilterQualityfv9h1I, i2, i3, i4));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull Modifier modifier, @NotNull Painter painter, @Nullable String str, @NotNull Alignment alignment, @NotNull ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, @Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(10290533);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10290533, i, -1, "coil.compose.Content (AsyncImage.kt:154)");
        }
        Modifier modifierThen = ClipKt.clipToBounds(str != null ? SemanticsModifierKt.semantics$default(modifier, false, new o0000oo(str), 1, null) : modifier).then(new ContentPainterModifier(painter, alignment, contentScale, f, colorFilter));
        OooO0O0 oooO0O0 = OooO0O0.f8511OooO00o;
        Density density = (Density) androidx.compose.material.OooO00o.OooO00o(composerStartRestartGroup, 544976794);
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Updater.m1316setimpl(composerM1309constructorimpl, oooO0O0, companion.getSetMeasurePolicy());
        Updater.m1316setimpl(composerM1309constructorimpl, density, companion.getSetDensity());
        Updater.m1316setimpl(composerM1309constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1316setimpl(composerM1309constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        Updater.m1316setimpl(composerM1309constructorimpl, modifierMaterialize, companion.getSetModifier());
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
