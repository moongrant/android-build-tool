package androidx.compose.compiler.plugins.kotlin;

import com.facebook.internal.ServerProtocol;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.compiler.plugin.AbstractCliOption;
import org.jetbrains.kotlin.compiler.plugin.CliOption;
import org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException;
import org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor;
import org.jetbrains.kotlin.config.CompilerConfiguration;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ComposeCommandLineProcessor;", "Lorg/jetbrains/kotlin/compiler/plugin/CommandLineProcessor;", "()V", "pluginId", "", "getPluginId", "()Ljava/lang/String;", "pluginOptions", "", "Lorg/jetbrains/kotlin/compiler/plugin/CliOption;", "getPluginOptions", "()Ljava/util/List;", "processOption", "", "option", "Lorg/jetbrains/kotlin/compiler/plugin/AbstractCliOption;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "configuration", "Lorg/jetbrains/kotlin/config/CompilerConfiguration;", "Companion", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeCommandLineProcessor implements CommandLineProcessor {

    @NotNull
    private final String pluginId = PLUGIN_ID;

    @NotNull
    private final List<CliOption> pluginOptions = CollectionsKt.listOf((Object[]) new CliOption[]{LIVE_LITERALS_ENABLED_OPTION, LIVE_LITERALS_V2_ENABLED_OPTION, GENERATE_FUNCTION_KEY_META_CLASSES_OPTION, SOURCE_INFORMATION_ENABLED_OPTION, METRICS_DESTINATION_OPTION, REPORTS_DESTINATION_OPTION, INTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_OPTION, SUPPRESS_KOTLIN_VERSION_CHECK_ENABLED_OPTION, DECOYS_ENABLED_OPTION});

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String PLUGIN_ID = "androidx.compose.compiler.plugins.kotlin";

    @NotNull
    private static final CliOption LIVE_LITERALS_ENABLED_OPTION = new CliOption("liveLiterals", "<true|false>", "Enable Live Literals code generation", false, false);

    @NotNull
    private static final CliOption LIVE_LITERALS_V2_ENABLED_OPTION = new CliOption("liveLiteralsEnabled", "<true|false>", "Enable Live Literals code generation (with per-file enabled flags)", false, false);

    @NotNull
    private static final CliOption GENERATE_FUNCTION_KEY_META_CLASSES_OPTION = new CliOption("generateFunctionKeyMetaClasses", "<true|false>", "Generate function key meta classes with annotations indicating the functions and their group keys. Generally used for tooling.", false, false);

    @NotNull
    private static final CliOption SOURCE_INFORMATION_ENABLED_OPTION = new CliOption("sourceInformation", "<true|false>", "Include source information in generated code", false, false);

    @NotNull
    private static final CliOption METRICS_DESTINATION_OPTION = new CliOption("metricsDestination", "<path>", "Save compose build metrics to this folder", false, false);

    @NotNull
    private static final CliOption REPORTS_DESTINATION_OPTION = new CliOption("reportsDestination", "<path>", "Save compose build reports to this folder", false, false);

    @NotNull
    private static final CliOption INTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_OPTION = new CliOption("intrinsicRemember", "<true|false>", "Include source information in generated code", false, false);

    @NotNull
    private static final CliOption SUPPRESS_KOTLIN_VERSION_CHECK_ENABLED_OPTION = new CliOption("suppressKotlinVersionCompatibilityCheck", "<true|false>", "Suppress Kotlin version compatibility check", false, false);

    @NotNull
    private static final CliOption DECOYS_ENABLED_OPTION = new CliOption("generateDecoys", "<true|false>", "Generate decoy methods in IR transform", false, false);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006¨\u0006\u001b"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ComposeCommandLineProcessor$Companion;", "", "()V", "DECOYS_ENABLED_OPTION", "Lorg/jetbrains/kotlin/compiler/plugin/CliOption;", "getDECOYS_ENABLED_OPTION", "()Lorg/jetbrains/kotlin/compiler/plugin/CliOption;", "GENERATE_FUNCTION_KEY_META_CLASSES_OPTION", "getGENERATE_FUNCTION_KEY_META_CLASSES_OPTION", "INTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_OPTION", "getINTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_OPTION", "LIVE_LITERALS_ENABLED_OPTION", "getLIVE_LITERALS_ENABLED_OPTION", "LIVE_LITERALS_V2_ENABLED_OPTION", "getLIVE_LITERALS_V2_ENABLED_OPTION", "METRICS_DESTINATION_OPTION", "getMETRICS_DESTINATION_OPTION", "PLUGIN_ID", "", "getPLUGIN_ID", "()Ljava/lang/String;", "REPORTS_DESTINATION_OPTION", "getREPORTS_DESTINATION_OPTION", "SOURCE_INFORMATION_ENABLED_OPTION", "getSOURCE_INFORMATION_ENABLED_OPTION", "SUPPRESS_KOTLIN_VERSION_CHECK_ENABLED_OPTION", "getSUPPRESS_KOTLIN_VERSION_CHECK_ENABLED_OPTION", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CliOption getDECOYS_ENABLED_OPTION() {
            return ComposeCommandLineProcessor.DECOYS_ENABLED_OPTION;
        }

        @NotNull
        public final CliOption getGENERATE_FUNCTION_KEY_META_CLASSES_OPTION() {
            return ComposeCommandLineProcessor.GENERATE_FUNCTION_KEY_META_CLASSES_OPTION;
        }

        @NotNull
        public final CliOption getINTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_OPTION() {
            return ComposeCommandLineProcessor.INTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_OPTION;
        }

        @NotNull
        public final CliOption getLIVE_LITERALS_ENABLED_OPTION() {
            return ComposeCommandLineProcessor.LIVE_LITERALS_ENABLED_OPTION;
        }

        @NotNull
        public final CliOption getLIVE_LITERALS_V2_ENABLED_OPTION() {
            return ComposeCommandLineProcessor.LIVE_LITERALS_V2_ENABLED_OPTION;
        }

        @NotNull
        public final CliOption getMETRICS_DESTINATION_OPTION() {
            return ComposeCommandLineProcessor.METRICS_DESTINATION_OPTION;
        }

        @NotNull
        public final String getPLUGIN_ID() {
            return ComposeCommandLineProcessor.PLUGIN_ID;
        }

        @NotNull
        public final CliOption getREPORTS_DESTINATION_OPTION() {
            return ComposeCommandLineProcessor.REPORTS_DESTINATION_OPTION;
        }

        @NotNull
        public final CliOption getSOURCE_INFORMATION_ENABLED_OPTION() {
            return ComposeCommandLineProcessor.SOURCE_INFORMATION_ENABLED_OPTION;
        }

        @NotNull
        public final CliOption getSUPPRESS_KOTLIN_VERSION_CHECK_ENABLED_OPTION() {
            return ComposeCommandLineProcessor.SUPPRESS_KOTLIN_VERSION_CHECK_ENABLED_OPTION;
        }
    }

    @NotNull
    public String getPluginId() {
        return this.pluginId;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException */
    public void processOption(@NotNull AbstractCliOption option, @NotNull String value, @NotNull CompilerConfiguration configuration) throws CliOptionProcessingException {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (Intrinsics.areEqual(option, LIVE_LITERALS_ENABLED_OPTION)) {
            configuration.put(ComposeConfiguration.INSTANCE.getLIVE_LITERALS_ENABLED_KEY(), Boolean.valueOf(Intrinsics.areEqual(value, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)));
            return;
        }
        if (Intrinsics.areEqual(option, LIVE_LITERALS_V2_ENABLED_OPTION)) {
            configuration.put(ComposeConfiguration.INSTANCE.getLIVE_LITERALS_V2_ENABLED_KEY(), Boolean.valueOf(Intrinsics.areEqual(value, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)));
            return;
        }
        if (Intrinsics.areEqual(option, GENERATE_FUNCTION_KEY_META_CLASSES_OPTION)) {
            configuration.put(ComposeConfiguration.INSTANCE.getGENERATE_FUNCTION_KEY_META_CLASSES_KEY(), Boolean.valueOf(Intrinsics.areEqual(value, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)));
            return;
        }
        if (Intrinsics.areEqual(option, SOURCE_INFORMATION_ENABLED_OPTION)) {
            configuration.put(ComposeConfiguration.INSTANCE.getSOURCE_INFORMATION_ENABLED_KEY(), Boolean.valueOf(Intrinsics.areEqual(value, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)));
            return;
        }
        if (Intrinsics.areEqual(option, METRICS_DESTINATION_OPTION)) {
            configuration.put(ComposeConfiguration.INSTANCE.getMETRICS_DESTINATION_KEY(), value);
            return;
        }
        if (Intrinsics.areEqual(option, REPORTS_DESTINATION_OPTION)) {
            configuration.put(ComposeConfiguration.INSTANCE.getREPORTS_DESTINATION_KEY(), value);
            return;
        }
        if (Intrinsics.areEqual(option, INTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_OPTION)) {
            configuration.put(ComposeConfiguration.INSTANCE.getINTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_KEY(), Boolean.valueOf(Intrinsics.areEqual(value, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)));
        } else if (Intrinsics.areEqual(option, SUPPRESS_KOTLIN_VERSION_CHECK_ENABLED_OPTION)) {
            configuration.put(ComposeConfiguration.INSTANCE.getSUPPRESS_KOTLIN_VERSION_COMPATIBILITY_CHECK(), value);
        } else {
            if (!Intrinsics.areEqual(option, DECOYS_ENABLED_OPTION)) {
                throw new CliOptionProcessingException(o00O00OO.OooO00o("Unknown option: ", option.getOptionName()), (Throwable) null, 2, (DefaultConstructorMarker) null);
            }
            configuration.put(ComposeConfiguration.INSTANCE.getDECOYS_ENABLED_KEY(), Boolean.valueOf(Intrinsics.areEqual(value, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)));
        }
    }

    @NotNull
    public List<CliOption> getPluginOptions() {
        return this.pluginOptions;
    }
}
