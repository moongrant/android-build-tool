package p024Oooo00o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.compiler.plugin.CliOption;
import org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0000O implements CommandLineProcessor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<CliOption> f1335OooO00o = CollectionsKt.listOf((Object[]) new CliOption[]{f1327OooO0O0, f1328OooO0OO, f1329OooO0Oo, f1331OooO0o0, f1330OooO0o, f1332OooO0oO, f1333OooO0oo, f1326OooO, f1334OooOO0});

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final CliOption f1327OooO0O0 = new CliOption("liveLiterals", "<true|false>", "Enable Live Literals code generation", false, false);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final CliOption f1328OooO0OO = new CliOption("liveLiteralsEnabled", "<true|false>", "Enable Live Literals code generation (with per-file enabled flags)", false, false);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final CliOption f1329OooO0Oo = new CliOption("generateFunctionKeyMetaClasses", "<true|false>", "Generate function key meta classes with annotations indicating the functions and their group keys. Generally used for tooling.", false, false);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final CliOption f1331OooO0o0 = new CliOption("sourceInformation", "<true|false>", "Include source information in generated code", false, false);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final CliOption f1330OooO0o = new CliOption("metricsDestination", "<path>", "Save compose build metrics to this folder", false, false);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final CliOption f1332OooO0oO = new CliOption("reportsDestination", "<path>", "Save compose build reports to this folder", false, false);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final CliOption f1333OooO0oo = new CliOption("intrinsicRemember", "<true|false>", "Include source information in generated code", false, false);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final CliOption f1326OooO = new CliOption("suppressKotlinVersionCompatibilityCheck", "<true|false>", "Suppress Kotlin version compatibility check", false, false);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final CliOption f1334OooOO0 = new CliOption("generateDecoys", "<true|false>", "Generate decoy methods in IR transform", false, false);
}
