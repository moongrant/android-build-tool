package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.lower.ClassStabilityTransformer;
import androidx.compose.compiler.plugins.kotlin.lower.ComposableFunInterfaceLowering;
import androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer;
import androidx.compose.compiler.plugins.kotlin.lower.ComposableSymbolRemapper;
import androidx.compose.compiler.plugins.kotlin.lower.ComposableTargetAnnotationsTransformer;
import androidx.compose.compiler.plugins.kotlin.lower.ComposerIntrinsicTransformer;
import androidx.compose.compiler.plugins.kotlin.lower.ComposerLambdaMemoization;
import androidx.compose.compiler.plugins.kotlin.lower.ComposerParamTransformer;
import androidx.compose.compiler.plugins.kotlin.lower.CopyDefaultValuesFromExpectLowering;
import androidx.compose.compiler.plugins.kotlin.lower.DurableFunctionKeyTransformer;
import androidx.compose.compiler.plugins.kotlin.lower.DurableKeyVisitor;
import androidx.compose.compiler.plugins.kotlin.lower.KlibAssignableParamTransformer;
import androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer;
import androidx.compose.compiler.plugins.kotlin.lower.WrapJsComposableLambdaLowering;
import androidx.compose.compiler.plugins.kotlin.lower.decoys.CreateDecoysTransformer;
import androidx.compose.compiler.plugins.kotlin.lower.decoys.RecordDecoySignaturesTransformer;
import androidx.compose.compiler.plugins.kotlin.lower.decoys.SubstituteDecoyCallsTransformer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.common.serialization.DeclarationTable;
import org.jetbrains.kotlin.backend.common.serialization.IdSignatureClashTracker;
import org.jetbrains.kotlin.backend.common.serialization.signature.IdSignatureSerializer;
import org.jetbrains.kotlin.backend.common.serialization.signature.PublicIdSignatureComputer;
import org.jetbrains.kotlin.ir.backend.js.lower.serialization.ir.JsGlobalDeclarationTable;
import org.jetbrains.kotlin.ir.backend.js.lower.serialization.ir.JsManglerIr;
import org.jetbrains.kotlin.ir.builders.TranslationPluginContext;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.symbols.IrSymbol;
import org.jetbrains.kotlin.ir.util.KotlinMangler;
import org.jetbrains.kotlin.platform.JsPlatformKt;
import org.jetbrains.kotlin.platform.jvm.JvmPlatformKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ComposeIrGenerationExtension;", "Lorg/jetbrains/kotlin/backend/common/extensions/IrGenerationExtension;", "liveLiteralsEnabled", "", "liveLiteralsV2Enabled", "generateFunctionKeyMetaClasses", "sourceInformationEnabled", "intrinsicRememberEnabled", "decoysEnabled", "metricsDestination", "", "reportsDestination", "validateIr", "(ZZZZZZLjava/lang/String;Ljava/lang/String;Z)V", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "getMetrics", "()Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "setMetrics", "(Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;)V", "generate", "", "moduleFragment", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "pluginContext", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeIrGenerationExtension implements IrGenerationExtension {
    private final boolean decoysEnabled;
    private final boolean generateFunctionKeyMetaClasses;
    private final boolean intrinsicRememberEnabled;
    private final boolean liveLiteralsEnabled;
    private final boolean liveLiteralsV2Enabled;

    @NotNull
    private ModuleMetrics metrics;

    @Nullable
    private final String metricsDestination;

    @Nullable
    private final String reportsDestination;
    private final boolean sourceInformationEnabled;
    private final boolean validateIr;

    public ComposeIrGenerationExtension() {
        this(false, false, false, false, false, false, null, null, false, 511, null);
    }

    public void generate(@NotNull IrModuleFragment moduleFragment, @NotNull IrPluginContext pluginContext) throws IncompatibleComposeRuntimeVersionException {
        Intrinsics.checkNotNullParameter(moduleFragment, "moduleFragment");
        Intrinsics.checkNotNullParameter(pluginContext, "pluginContext");
        boolean z = !JvmPlatformKt.isJvm(pluginContext.getPlatform());
        new VersionChecker(pluginContext).check();
        if (this.validateIr) {
            IrValidatorKt.validateIr(moduleFragment, pluginContext.getIrBuiltIns());
        }
        ComposableSymbolRemapper composableSymbolRemapper = new ComposableSymbolRemapper();
        if (this.metricsDestination != null || this.reportsDestination != null) {
            String strAsString = moduleFragment.getName().asString();
            Intrinsics.checkNotNullExpressionValue(strAsString, "moduleFragment.name.asString()");
            this.metrics = new ModuleMetricsImpl(strAsString);
        }
        ComposableSymbolRemapper composableSymbolRemapper2 = composableSymbolRemapper;
        new ClassStabilityTransformer(pluginContext, composableSymbolRemapper2, this.metrics).lower(moduleFragment);
        IdSignatureSerializer idSignatureSerializer = null;
        new LiveLiteralTransformer(this.liveLiteralsEnabled || this.liveLiteralsV2Enabled, this.liveLiteralsV2Enabled, new DurableKeyVisitor(null, 1, null), pluginContext, composableSymbolRemapper2, this.metrics).lower(moduleFragment);
        new ComposableFunInterfaceLowering(pluginContext).lower(moduleFragment);
        DurableFunctionKeyTransformer durableFunctionKeyTransformer = new DurableFunctionKeyTransformer(pluginContext, composableSymbolRemapper2, this.metrics);
        durableFunctionKeyTransformer.lower(moduleFragment);
        new ComposerLambdaMemoization(pluginContext, composableSymbolRemapper2, this.metrics).lower(moduleFragment);
        new CopyDefaultValuesFromExpectLowering(pluginContext).lower(moduleFragment);
        JsManglerIr jsManglerIr = JsPlatformKt.isJs(pluginContext.getPlatform()) ? JsManglerIr.INSTANCE : null;
        if (JsPlatformKt.isJs(pluginContext.getPlatform())) {
            Intrinsics.checkNotNull(jsManglerIr);
            idSignatureSerializer = new IdSignatureSerializer(new PublicIdSignatureComputer((KotlinMangler.IrMangler) jsManglerIr), new DeclarationTable(new JsGlobalDeclarationTable(pluginContext.getIrBuiltIns(), (IdSignatureClashTracker) null, 2, (DefaultConstructorMarker) null)));
        }
        if (this.decoysEnabled) {
            if (!(idSignatureSerializer != null)) {
                throw new IllegalArgumentException(("decoys are not supported for " + pluginContext.getPlatform()).toString());
            }
            new CreateDecoysTransformer(pluginContext, composableSymbolRemapper2, idSignatureSerializer, this.metrics).lower(moduleFragment);
            new SubstituteDecoyCallsTransformer(pluginContext, composableSymbolRemapper2, idSignatureSerializer, this.metrics).lower(moduleFragment);
        }
        new ComposerParamTransformer(pluginContext, composableSymbolRemapper2, this.decoysEnabled, this.metrics).lower(moduleFragment);
        new ComposableTargetAnnotationsTransformer(pluginContext, composableSymbolRemapper, this.metrics).lower(moduleFragment);
        new ComposerIntrinsicTransformer(pluginContext, this.decoysEnabled).lower(moduleFragment);
        new ComposableFunctionBodyTransformer(pluginContext, composableSymbolRemapper2, this.metrics, this.sourceInformationEnabled, this.intrinsicRememberEnabled).lower(moduleFragment);
        if (this.decoysEnabled) {
            if (!(idSignatureSerializer != null)) {
                throw new IllegalArgumentException(("decoys are not supported for " + pluginContext.getPlatform()).toString());
            }
            ModuleMetrics moduleMetrics = this.metrics;
            Intrinsics.checkNotNull(jsManglerIr);
            new RecordDecoySignaturesTransformer(pluginContext, composableSymbolRemapper2, idSignatureSerializer, moduleMetrics, (KotlinMangler.IrMangler) jsManglerIr).lower(moduleFragment);
        }
        if (z) {
            new KlibAssignableParamTransformer(pluginContext, composableSymbolRemapper2, this.metrics).lower(moduleFragment);
        }
        if (JsPlatformKt.isJs(pluginContext.getPlatform())) {
            ModuleMetrics moduleMetrics2 = this.metrics;
            Intrinsics.checkNotNull(idSignatureSerializer);
            new WrapJsComposableLambdaLowering(pluginContext, composableSymbolRemapper2, moduleMetrics2, idSignatureSerializer, this.decoysEnabled).lower(moduleFragment);
        }
        if (this.generateFunctionKeyMetaClasses) {
            durableFunctionKeyTransformer.realizeKeyMetaAnnotations(moduleFragment);
        } else {
            durableFunctionKeyTransformer.removeKeyMetaClasses(moduleFragment);
        }
        String str = this.metricsDestination;
        if (str != null) {
            this.metrics.saveMetricsTo(str);
        }
        String str2 = this.reportsDestination;
        if (str2 != null) {
            this.metrics.saveReportsTo(str2);
        }
        if (this.validateIr) {
            IrValidatorKt.validateIr(moduleFragment, pluginContext.getIrBuiltIns());
        }
    }

    @NotNull
    public final ModuleMetrics getMetrics() {
        return this.metrics;
    }

    @Nullable
    public IrDeclaration resolveSymbol(@NotNull IrSymbol irSymbol, @NotNull TranslationPluginContext translationPluginContext) {
        return IrGenerationExtension.DefaultImpls.resolveSymbol(this, irSymbol, translationPluginContext);
    }

    public final void setMetrics(@NotNull ModuleMetrics moduleMetrics) {
        Intrinsics.checkNotNullParameter(moduleMetrics, "<set-?>");
        this.metrics = moduleMetrics;
    }

    public ComposeIrGenerationExtension(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @Nullable String str, @Nullable String str2, boolean z7) {
        this.liveLiteralsEnabled = z;
        this.liveLiteralsV2Enabled = z2;
        this.generateFunctionKeyMetaClasses = z3;
        this.sourceInformationEnabled = z4;
        this.intrinsicRememberEnabled = z5;
        this.decoysEnabled = z6;
        this.metricsDestination = str;
        this.reportsDestination = str2;
        this.validateIr = z7;
        this.metrics = EmptyModuleMetrics.INSTANCE;
    }

    public /* synthetic */ ComposeIrGenerationExtension(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? null : str, (i & 128) == 0 ? str2 : null, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 ? z7 : false);
    }
}
