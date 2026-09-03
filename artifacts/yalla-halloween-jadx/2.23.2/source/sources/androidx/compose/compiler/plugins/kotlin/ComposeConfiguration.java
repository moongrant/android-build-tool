package androidx.compose.compiler.plugins.kotlin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.config.CompilerConfigurationKey;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u0019"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ComposeConfiguration;", "", "()V", "DECOYS_ENABLED_KEY", "Lorg/jetbrains/kotlin/config/CompilerConfigurationKey;", "", "getDECOYS_ENABLED_KEY", "()Lorg/jetbrains/kotlin/config/CompilerConfigurationKey;", "GENERATE_FUNCTION_KEY_META_CLASSES_KEY", "getGENERATE_FUNCTION_KEY_META_CLASSES_KEY", "INTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_KEY", "getINTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_KEY", "LIVE_LITERALS_ENABLED_KEY", "getLIVE_LITERALS_ENABLED_KEY", "LIVE_LITERALS_V2_ENABLED_KEY", "getLIVE_LITERALS_V2_ENABLED_KEY", "METRICS_DESTINATION_KEY", "", "getMETRICS_DESTINATION_KEY", "REPORTS_DESTINATION_KEY", "getREPORTS_DESTINATION_KEY", "SOURCE_INFORMATION_ENABLED_KEY", "getSOURCE_INFORMATION_ENABLED_KEY", "SUPPRESS_KOTLIN_VERSION_COMPATIBILITY_CHECK", "getSUPPRESS_KOTLIN_VERSION_COMPATIBILITY_CHECK", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeConfiguration {

    @NotNull
    public static final ComposeConfiguration INSTANCE = new ComposeConfiguration();

    @NotNull
    private static final CompilerConfigurationKey<Boolean> LIVE_LITERALS_ENABLED_KEY = new CompilerConfigurationKey<>("Enable Live Literals code generation");

    @NotNull
    private static final CompilerConfigurationKey<Boolean> LIVE_LITERALS_V2_ENABLED_KEY = new CompilerConfigurationKey<>("Enable Live Literals code generation (with per-file enabled flags)");

    @NotNull
    private static final CompilerConfigurationKey<Boolean> GENERATE_FUNCTION_KEY_META_CLASSES_KEY = new CompilerConfigurationKey<>("Generate function key meta classes");

    @NotNull
    private static final CompilerConfigurationKey<Boolean> SOURCE_INFORMATION_ENABLED_KEY = new CompilerConfigurationKey<>("Include source information in generated code");

    @NotNull
    private static final CompilerConfigurationKey<String> METRICS_DESTINATION_KEY = new CompilerConfigurationKey<>("Directory to save compose build metrics");

    @NotNull
    private static final CompilerConfigurationKey<String> REPORTS_DESTINATION_KEY = new CompilerConfigurationKey<>("Directory to save compose build reports");

    @NotNull
    private static final CompilerConfigurationKey<Boolean> INTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_KEY = new CompilerConfigurationKey<>("Enable optimization to treat remember as an intrinsic");

    @NotNull
    private static final CompilerConfigurationKey<String> SUPPRESS_KOTLIN_VERSION_COMPATIBILITY_CHECK = new CompilerConfigurationKey<>("Version of Kotlin for which version compatibility check should be suppressed");

    @NotNull
    private static final CompilerConfigurationKey<Boolean> DECOYS_ENABLED_KEY = new CompilerConfigurationKey<>("Generate decoy methods in IR transform");

    private ComposeConfiguration() {
    }

    @NotNull
    public final CompilerConfigurationKey<Boolean> getDECOYS_ENABLED_KEY() {
        return DECOYS_ENABLED_KEY;
    }

    @NotNull
    public final CompilerConfigurationKey<Boolean> getGENERATE_FUNCTION_KEY_META_CLASSES_KEY() {
        return GENERATE_FUNCTION_KEY_META_CLASSES_KEY;
    }

    @NotNull
    public final CompilerConfigurationKey<Boolean> getINTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_KEY() {
        return INTRINSIC_REMEMBER_OPTIMIZATION_ENABLED_KEY;
    }

    @NotNull
    public final CompilerConfigurationKey<Boolean> getLIVE_LITERALS_ENABLED_KEY() {
        return LIVE_LITERALS_ENABLED_KEY;
    }

    @NotNull
    public final CompilerConfigurationKey<Boolean> getLIVE_LITERALS_V2_ENABLED_KEY() {
        return LIVE_LITERALS_V2_ENABLED_KEY;
    }

    @NotNull
    public final CompilerConfigurationKey<String> getMETRICS_DESTINATION_KEY() {
        return METRICS_DESTINATION_KEY;
    }

    @NotNull
    public final CompilerConfigurationKey<String> getREPORTS_DESTINATION_KEY() {
        return REPORTS_DESTINATION_KEY;
    }

    @NotNull
    public final CompilerConfigurationKey<Boolean> getSOURCE_INFORMATION_ENABLED_KEY() {
        return SOURCE_INFORMATION_ENABLED_KEY;
    }

    @NotNull
    public final CompilerConfigurationKey<String> getSUPPRESS_KOTLIN_VERSION_COMPATIBILITY_CHECK() {
        return SUPPRESS_KOTLIN_VERSION_COMPATIBILITY_CHECK;
    }
}
