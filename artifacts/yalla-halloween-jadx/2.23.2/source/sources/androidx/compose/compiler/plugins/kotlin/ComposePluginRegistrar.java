package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.k1.ComposableCallChecker;
import androidx.compose.compiler.plugins.kotlin.k1.ComposableDeclarationChecker;
import androidx.compose.compiler.plugins.kotlin.k1.ComposableTargetChecker;
import androidx.compose.compiler.plugins.kotlin.k1.ComposeDiagnosticSuppressor;
import androidx.compose.compiler.plugins.kotlin.k1.ComposeTypeResolutionInterceptorExtension;
import androidx.compose.compiler.plugins.kotlin.k2.ComposeFirExtensionRegistrar;
import androidx.compose.compiler.plugins.kotlin.lower.ClassStabilityFieldSerializationPlugin;
import com.facebook.internal.ServerProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension;
import org.jetbrains.kotlin.cli.common.CLIConfigurationKeys;
import org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity;
import org.jetbrains.kotlin.cli.common.messages.CompilerMessageSourceLocation;
import org.jetbrains.kotlin.cli.common.messages.MessageCollector;
import org.jetbrains.kotlin.com.intellij.mock.MockProject;
import org.jetbrains.kotlin.com.intellij.openapi.project.Project;
import org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar;
import org.jetbrains.kotlin.config.CommonConfigurationKeysKt;
import org.jetbrains.kotlin.config.CompilerConfiguration;
import org.jetbrains.kotlin.config.JVMConfigurationKeys;
import org.jetbrains.kotlin.config.KotlinCompilerVersion;
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor;
import org.jetbrains.kotlin.extensions.internal.TypeResolutionInterceptor;
import org.jetbrains.kotlin.fir.extensions.FirExtensionRegistrarAdapter;
import org.jetbrains.kotlin.serialization.DescriptorSerializerPlugin;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ComposePluginRegistrar;", "Lorg/jetbrains/kotlin/compiler/plugin/ComponentRegistrar;", "()V", "supportsK2", "", "getSupportsK2", "()Z", "registerProjectComponents", "", "project", "Lorg/jetbrains/kotlin/com/intellij/mock/MockProject;", "configuration", "Lorg/jetbrains/kotlin/config/CompilerConfiguration;", "Companion", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposePluginRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ComposePluginRegistrar$Companion;", "", "()V", "checkCompilerVersion", "", "configuration", "Lorg/jetbrains/kotlin/config/CompilerConfiguration;", "createComposeIrExtension", "Landroidx/compose/compiler/plugins/kotlin/ComposeIrGenerationExtension;", "registerCommonExtensions", "", "project", "Lorg/jetbrains/kotlin/com/intellij/openapi/project/Project;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComposePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposePlugin.kt\nandroidx/compose/compiler/plugins/kotlin/ComposePluginRegistrar$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean checkCompilerVersion(@NotNull CompilerConfiguration configuration) {
            try {
                String version = KotlinCompilerVersion.getVersion();
                if (version == null) {
                    return true;
                }
                MessageCollector messageCollector = (MessageCollector) configuration.get(CLIConfigurationKeys.MESSAGE_COLLECTOR_KEY);
                String str = (String) configuration.get(ComposeConfiguration.INSTANCE.getSUPPRESS_KOTLIN_VERSION_COMPATIBILITY_CHECK());
                if (str != null && !Intrinsics.areEqual(str, version)) {
                    if (Intrinsics.areEqual(str, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
                        if (messageCollector != null) {
                            MessageCollector.report$default(messageCollector, CompilerMessageSeverity.STRONG_WARNING, " `suppressKotlinVersionCompatibilityCheck` should specify the version of Kotlin for which you want the compatibility check to be disabled. For example, `suppressKotlinVersionCompatibilityCheck=" + version + "`", (CompilerMessageSourceLocation) null, 4, (Object) null);
                        }
                    } else if (messageCollector != null) {
                        MessageCollector.report$default(messageCollector, CompilerMessageSeverity.STRONG_WARNING, " `suppressKotlinVersionCompatibilityCheck` is set to a version of Kotlin (" + str + ") that you are not using and should be set properly. (you are using Kotlin " + version + ")", (CompilerMessageSourceLocation) null, 4, (Object) null);
                    }
                }
                if (Intrinsics.areEqual(str, "1.9.10") && messageCollector != null) {
                    MessageCollector.report$default(messageCollector, CompilerMessageSeverity.STRONG_WARNING, " `suppressKotlinVersionCompatibilityCheck` is set to the same version of Kotlin that the Compose Compiler was already expecting (Kotlin " + str + "), and thus has no effect and should be removed.", (CompilerMessageSourceLocation) null, 4, (Object) null);
                }
                if (Intrinsics.areEqual(str, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE) || Intrinsics.areEqual(version, "1.9.10") || Intrinsics.areEqual(version, str)) {
                    return true;
                }
                if (messageCollector == null) {
                    return false;
                }
                MessageCollector.report$default(messageCollector, CompilerMessageSeverity.ERROR, "This version (1.5.3) of the Compose Compiler requires Kotlin version 1.9.10 but you appear to be using Kotlin version " + version + " which is not known to be compatible.  Please consult the Compose-Kotlin compatibility map located at https://developer.android.com/jetpack/androidx/releases/compose-kotlin to choose a compatible version pair (or `suppressKotlinVersionCompatibilityCheck` but don't say I didn't warn you!).", (CompilerMessageSourceLocation) null, 4, (Object) null);
                return false;
            } catch (Throwable th) {
                throw new Error("Something went wrong while checking for version compatibility between the Compose Compiler and the Kotlin Compiler.  It is possible that the versions are incompatible.  Please verify your kotlin version  and consult the Compose-Kotlin compatibility map located at https://developer.android.com/jetpack/androidx/releases/compose-kotlin", th);
            }
        }

        @NotNull
        public final ComposeIrGenerationExtension createComposeIrExtension(@NotNull CompilerConfiguration configuration) {
            ComposeConfiguration composeConfiguration = ComposeConfiguration.INSTANCE;
            boolean z = configuration.getBoolean(composeConfiguration.getLIVE_LITERALS_ENABLED_KEY());
            boolean z2 = configuration.getBoolean(composeConfiguration.getLIVE_LITERALS_V2_ENABLED_KEY());
            boolean z3 = configuration.getBoolean(composeConfiguration.getGENERATE_FUNCTION_KEY_META_CLASSES_KEY());
            boolean z4 = configuration.getBoolean(composeConfiguration.getSOURCE_INFORMATION_ENABLED_KEY());
            boolean zBooleanValue = ((Boolean) configuration.get(composeConfiguration.getINTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_KEY(), Boolean.FALSE)).booleanValue();
            boolean z5 = configuration.getBoolean(composeConfiguration.getDECOYS_ENABLED_KEY());
            CharSequence charSequence = (CharSequence) configuration.get(composeConfiguration.getMETRICS_DESTINATION_KEY(), "");
            if (StringsKt.isBlank(charSequence)) {
                charSequence = null;
            }
            String str = (String) charSequence;
            CharSequence charSequence2 = (CharSequence) configuration.get(composeConfiguration.getREPORTS_DESTINATION_KEY(), "");
            return new ComposeIrGenerationExtension(z, z2, z3, z4, zBooleanValue, z5, str, (String) (StringsKt.isBlank(charSequence2) ? null : charSequence2), configuration.getBoolean(JVMConfigurationKeys.VALIDATE_IR), CommonConfigurationKeysKt.getLanguageVersionSettings(configuration).getLanguageVersion().getUsesK2());
        }

        public final void registerCommonExtensions(@NotNull Project project) {
            StorageComponentContainerContributor.Companion.registerExtension(project, new ComposableCallChecker());
            StorageComponentContainerContributor.Companion.registerExtension(project, new ComposableDeclarationChecker());
            StorageComponentContainerContributor.Companion.registerExtension(project, new ComposableTargetChecker());
            ComposeDiagnosticSuppressor.INSTANCE.registerExtension(project, new ComposeDiagnosticSuppressor());
            TypeResolutionInterceptor.Companion.registerExtension(project, new ComposeTypeResolutionInterceptorExtension());
            DescriptorSerializerPlugin.Companion.registerExtension(project, new ClassStabilityFieldSerializationPlugin());
            FirExtensionRegistrarAdapter.Companion.registerExtension(project, new ComposeFirExtensionRegistrar());
        }
    }

    public boolean getSupportsK2() {
        return true;
    }

    public void registerProjectComponents(@NotNull MockProject project, @NotNull CompilerConfiguration configuration) {
        Companion companion = INSTANCE;
        if (companion.checkCompilerVersion(configuration)) {
            Project project2 = (Project) project;
            companion.registerCommonExtensions(project2);
            IrGenerationExtension.Companion.registerExtension(project2, companion.createComposeIrExtension(configuration));
        }
    }
}
