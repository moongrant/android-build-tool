package androidx.compose.compiler.plugins.kotlin;

import androidx.camera.core.impl.OooOOOO;
import androidx.compose.compiler.plugins.kotlin.analysis.Stability;
import androidx.compose.compiler.plugins.kotlin.analysis.StabilityKt;
import androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer;
import androidx.compose.compiler.plugins.kotlin.lower.IrSourcePrinterVisitor;
import com.facebook.share.internal.ShareConstants;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrField;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrProperty;
import org.jetbrains.kotlin.ir.expressions.IrCall;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001GB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0003H\u0016J\u0010\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020+H\u0016J \u0010,\u001a\u00020'2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\u001e\u00103\u001a\u00020'2\u0006\u00104\u001a\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020807H\u0016J\u0010\u00109\u001a\u00020'2\u0006\u0010*\u001a\u00020\fH\u0016J \u0010:\u001a\u00020'2\u0006\u0010;\u001a\u0002002\u0006\u0010<\u001a\u0002002\u0006\u0010=\u001a\u000200H\u0016J\u0010\u0010>\u001a\u00020'2\u0006\u0010?\u001a\u00020\u0003H\u0016J\u0010\u0010@\u001a\u00020'2\u0006\u0010?\u001a\u00020\u0003H\u0016J\u0010\u0010A\u001a\u00020'*\u00060Bj\u0002`CH\u0016J\u0010\u0010D\u001a\u00020'*\u00060Bj\u0002`CH\u0016J\u0010\u0010E\u001a\u00020'*\u00060Bj\u0002`CH\u0016J\u0010\u0010F\u001a\u00020'*\u00060Bj\u0002`CH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tR\u00020\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0004R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ModuleMetricsImpl;", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "name", "", "(Ljava/lang/String;)V", "certainArguments", "", "classes", "", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetricsImpl$ClassMetrics;", "composableLambdas", "composables", "Landroidx/compose/compiler/plugins/kotlin/FunctionMetrics;", "effectivelyStableClasses", "inferredStableClasses", "inferredUncertainClasses", "inferredUnstableClasses", "knownStableArguments", "knownUnstableArguments", "logMessages", "markedStableClasses", "memoizedLambdas", "getName", "()Ljava/lang/String;", "setName", "readonlyComposables", "restartGroups", "restartableComposables", "singletonComposableLambdas", "singletonLambdas", "skippableComposables", "staticArguments", "totalArguments", "totalClasses", "totalComposables", "totalGroups", "totalLambdas", "unknownStableArguments", "log", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "makeFunctionMetrics", "function", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "recordClass", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "marked", "", "stability", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "recordComposableCall", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "paramMeta", "", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$ParamMeta;", "recordFunction", "recordLambda", "composable", "memoized", "singleton", "saveMetricsTo", "directory", "saveReportsTo", "appendClassesTxt", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "appendComposablesCsv", "appendComposablesTxt", "appendModuleJson", "ClassMetrics", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ModuleMetricsImpl implements ModuleMetrics {
    private int certainArguments;
    private int composableLambdas;
    private int effectivelyStableClasses;
    private int inferredStableClasses;
    private int inferredUncertainClasses;
    private int inferredUnstableClasses;
    private int knownStableArguments;
    private int knownUnstableArguments;
    private int markedStableClasses;
    private int memoizedLambdas;

    @NotNull
    private String name;
    private int readonlyComposables;
    private int restartGroups;
    private int restartableComposables;
    private int singletonComposableLambdas;
    private int singletonLambdas;
    private int skippableComposables;
    private int staticArguments;
    private int totalArguments;
    private int totalClasses;
    private int totalComposables;
    private int totalGroups;
    private int totalLambdas;
    private int unknownStableArguments;

    @NotNull
    private final List<FunctionMetrics> composables = new ArrayList();

    @NotNull
    private final List<ClassMetrics> classes = new ArrayList();

    @NotNull
    private final List<String> logMessages = new ArrayList();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\u000f\u001a\u00060\u0010j\u0002`\u00112\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0007H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ModuleMetricsImpl$ClassMetrics;", "", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "marked", "", "stability", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "(Landroidx/compose/compiler/plugins/kotlin/ModuleMetricsImpl;Lorg/jetbrains/kotlin/ir/declarations/IrClass;ZLandroidx/compose/compiler/plugins/kotlin/analysis/Stability;)V", "getDeclaration", "()Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "getMarked", "()Z", "getStability", "()Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "print", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "src", "Landroidx/compose/compiler/plugins/kotlin/lower/IrSourcePrinterVisitor;", "simpleHumanReadable", "", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ClassMetrics {

        @NotNull
        private final IrClass declaration;
        private final boolean marked;

        @NotNull
        private final Stability stability;

        public ClassMetrics(IrClass irClass, @NotNull boolean z, Stability stability) {
            this.declaration = irClass;
            this.marked = z;
            this.stability = stability;
        }

        private final String simpleHumanReadable(Stability stability) {
            if (StabilityKt.knownStable(stability)) {
                return "stable";
            }
            return StabilityKt.knownUnstable(stability) ? "unstable" : "runtime";
        }

        @NotNull
        public final IrClass getDeclaration() {
            return this.declaration;
        }

        public final boolean getMarked() {
            return this.marked;
        }

        @NotNull
        public final Stability getStability() {
            return this.stability;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:24:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:34:0x008c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:39:0x004c A[SYNTHETIC] */
        @NotNull
        public final Appendable print(@NotNull Appendable out, @NotNull IrSourcePrinterVisitor src) throws IOException {
            IrField backingField;
            String str;
            out.append(simpleHumanReadable(this.stability) + ZegoConstants.ZegoVideoDataAuxPublishingStream);
            out.append("class ");
            out.append(this.declaration.getName().asString());
            Appendable appendableAppend = out.append(" {");
            Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(value)");
            Intrinsics.checkNotNullExpressionValue(appendableAppend.append('\n'), "append('\\n')");
            for (IrProperty irProperty : this.declaration.getDeclarations()) {
                boolean z = irProperty instanceof IrProperty;
                boolean zIsVar = z ? irProperty.isVar() : irProperty instanceof IrField;
                if (z) {
                    backingField = irProperty.getBackingField();
                    if (backingField != null) {
                        if (!Intrinsics.areEqual(backingField.getName(), KtxNameConventions.INSTANCE.getSTABILITY_FLAG())) {
                            out.append("  ");
                            out.append(simpleHumanReadable(StabilityKt.stabilityOf(backingField.getType())) + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                            if (zIsVar) {
                                str = "var ";
                            } else {
                                str = "val ";
                            }
                            out.append(str);
                            out.append(backingField.getName().asString());
                            out.append(": ");
                            out.append(src.printType(backingField.getType()));
                            Intrinsics.checkNotNullExpressionValue(out.append('\n'), "append('\\n')");
                        }
                    }
                } else if (irProperty instanceof IrField) {
                    backingField = (IrField) irProperty;
                    if (!Intrinsics.areEqual(backingField.getName(), KtxNameConventions.INSTANCE.getSTABILITY_FLAG())) {
                        out.append("  ");
                        out.append(simpleHumanReadable(StabilityKt.stabilityOf(backingField.getType())) + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                        if (zIsVar) {
                            str = "var ";
                        } else {
                            str = "val ";
                        }
                        out.append(str);
                        out.append(backingField.getName().asString());
                        out.append(": ");
                        out.append(src.printType(backingField.getType()));
                        Intrinsics.checkNotNullExpressionValue(out.append('\n'), "append('\\n')");
                    }
                }
            }
            if (!this.marked) {
                Appendable appendableAppend2 = out.append("  <runtime stability> = " + this.stability);
                Intrinsics.checkNotNullExpressionValue(appendableAppend2, "append(value)");
                Intrinsics.checkNotNullExpressionValue(appendableAppend2.append('\n'), "append('\\n')");
            }
            Appendable appendableAppend3 = out.append("}");
            Intrinsics.checkNotNullExpressionValue(appendableAppend3, "append(value)");
            Appendable appendableAppend4 = appendableAppend3.append('\n');
            Intrinsics.checkNotNullExpressionValue(appendableAppend4, "append('\\n')");
            return appendableAppend4;
        }
    }

    public ModuleMetricsImpl(@NotNull String str) {
        this.name = str;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void appendClassesTxt(@NotNull Appendable appendable) throws IOException {
        IrSourcePrinterVisitor irSourcePrinterVisitor = new IrSourcePrinterVisitor(appendable, null, false, 6, null);
        Iterator<ClassMetrics> it = this.classes.iterator();
        while (it.hasNext()) {
            it.next().print(appendable, irSourcePrinterVisitor);
        }
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void appendComposablesCsv(@NotNull Appendable appendable) {
        JsonBuilderKt.appendCsv(appendable, new Function1<CsvBuilder, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.ModuleMetricsImpl.appendComposablesCsv.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CsvBuilder csvBuilder) {
                invoke2(csvBuilder);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CsvBuilder csvBuilder) {
                csvBuilder.row(new Function1<CsvBuilder, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.ModuleMetricsImpl.appendComposablesCsv.1.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(CsvBuilder csvBuilder2) throws IOException {
                        invoke2(csvBuilder2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull CsvBuilder csvBuilder2) throws IOException {
                        csvBuilder2.col("package");
                        csvBuilder2.col("name");
                        csvBuilder2.col("composable");
                        csvBuilder2.col("skippable");
                        csvBuilder2.col("restartable");
                        csvBuilder2.col("readonly");
                        csvBuilder2.col("inline");
                        csvBuilder2.col("isLambda");
                        csvBuilder2.col("hasDefaults");
                        csvBuilder2.col("defaultsGroup");
                        csvBuilder2.col("groups");
                        csvBuilder2.col("calls");
                    }
                });
                for (final FunctionMetrics functionMetrics : ModuleMetricsImpl.this.composables) {
                    csvBuilder.row(new Function1<CsvBuilder, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.ModuleMetricsImpl.appendComposablesCsv.1.2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(CsvBuilder csvBuilder2) throws IOException {
                            invoke2(csvBuilder2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull CsvBuilder csvBuilder2) throws IOException {
                            csvBuilder2.col(functionMetrics.getPackageName().asString());
                            csvBuilder2.col(functionMetrics.getName());
                            csvBuilder2.col(functionMetrics.getComposable());
                            csvBuilder2.col(functionMetrics.getSkippable());
                            csvBuilder2.col(functionMetrics.getRestartable());
                            csvBuilder2.col(functionMetrics.getReadonly());
                            csvBuilder2.col(functionMetrics.getInline());
                            csvBuilder2.col(functionMetrics.getIsLambda());
                            csvBuilder2.col(functionMetrics.getHasDefaults());
                            csvBuilder2.col(functionMetrics.getDefaultsGroup());
                            csvBuilder2.col(functionMetrics.getGroups());
                            csvBuilder2.col(functionMetrics.getCalls());
                        }
                    });
                }
            }
        });
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void appendComposablesTxt(@NotNull Appendable appendable) {
        IrSourcePrinterVisitor irSourcePrinterVisitor = new IrSourcePrinterVisitor(appendable, null, false, 6, null);
        Iterator<FunctionMetrics> it = this.composables.iterator();
        while (it.hasNext()) {
            it.next().print(appendable, irSourcePrinterVisitor);
        }
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void appendModuleJson(@NotNull Appendable appendable) throws IOException {
        JsonBuilderKt.appendJson(appendable, new Function1<JsonBuilder, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.ModuleMetricsImpl.appendModuleJson.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) throws IOException {
                invoke2(jsonBuilder);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull JsonBuilder jsonBuilder) throws IOException {
                jsonBuilder.entry("skippableComposables", ModuleMetricsImpl.this.skippableComposables);
                jsonBuilder.entry("restartableComposables", ModuleMetricsImpl.this.restartableComposables);
                jsonBuilder.entry("readonlyComposables", ModuleMetricsImpl.this.readonlyComposables);
                jsonBuilder.entry("totalComposables", ModuleMetricsImpl.this.totalComposables);
                jsonBuilder.entry("restartGroups", ModuleMetricsImpl.this.restartGroups);
                jsonBuilder.entry("totalGroups", ModuleMetricsImpl.this.totalGroups);
                jsonBuilder.entry("staticArguments", ModuleMetricsImpl.this.staticArguments);
                jsonBuilder.entry("certainArguments", ModuleMetricsImpl.this.certainArguments);
                jsonBuilder.entry("knownStableArguments", ModuleMetricsImpl.this.knownStableArguments);
                jsonBuilder.entry("knownUnstableArguments", ModuleMetricsImpl.this.knownUnstableArguments);
                jsonBuilder.entry("unknownStableArguments", ModuleMetricsImpl.this.unknownStableArguments);
                jsonBuilder.entry("totalArguments", ModuleMetricsImpl.this.totalArguments);
                jsonBuilder.entry("markedStableClasses", ModuleMetricsImpl.this.markedStableClasses);
                jsonBuilder.entry("inferredStableClasses", ModuleMetricsImpl.this.inferredStableClasses);
                jsonBuilder.entry("inferredUnstableClasses", ModuleMetricsImpl.this.inferredUnstableClasses);
                jsonBuilder.entry("inferredUncertainClasses", ModuleMetricsImpl.this.inferredUncertainClasses);
                jsonBuilder.entry("effectivelyStableClasses", ModuleMetricsImpl.this.effectivelyStableClasses);
                jsonBuilder.entry("totalClasses", ModuleMetricsImpl.this.totalClasses);
                jsonBuilder.entry("memoizedLambdas", ModuleMetricsImpl.this.memoizedLambdas);
                jsonBuilder.entry("singletonLambdas", ModuleMetricsImpl.this.singletonLambdas);
                jsonBuilder.entry("singletonComposableLambdas", ModuleMetricsImpl.this.singletonComposableLambdas);
                jsonBuilder.entry("composableLambdas", ModuleMetricsImpl.this.composableLambdas);
                jsonBuilder.entry("totalLambdas", ModuleMetricsImpl.this.totalLambdas);
            }
        });
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public final /* synthetic */ boolean isEmpty() {
        return OooO0o.OooO00o(this);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void log(@NotNull String message) {
        this.logMessages.add(message);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    @NotNull
    public FunctionMetrics makeFunctionMetrics(@NotNull IrFunction function) {
        return new FunctionMetricsImpl(function);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void recordClass(@NotNull IrClass declaration, boolean marked, @NotNull Stability stability) {
        this.classes.add(new ClassMetrics(declaration, marked, stability));
        this.totalClasses++;
        if (marked) {
            this.markedStableClasses++;
            this.effectivelyStableClasses++;
        } else if (StabilityKt.knownStable(stability)) {
            this.inferredStableClasses++;
            this.effectivelyStableClasses++;
        } else if (StabilityKt.knownUnstable(stability)) {
            this.inferredUnstableClasses++;
        } else {
            this.inferredUncertainClasses++;
        }
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void recordComposableCall(@NotNull IrCall expression, @NotNull List<ComposableFunctionBodyTransformer.ParamMeta> paramMeta) {
        for (ComposableFunctionBodyTransformer.ParamMeta paramMeta2 : paramMeta) {
            this.totalArguments++;
            if (paramMeta2.isCertain()) {
                this.certainArguments++;
            }
            if (paramMeta2.isStatic()) {
                this.staticArguments++;
            }
            if (StabilityKt.knownStable(paramMeta2.getStability())) {
                this.knownStableArguments++;
            } else if (StabilityKt.knownUnstable(paramMeta2.getStability())) {
                this.knownUnstableArguments++;
            } else {
                this.unknownStableArguments++;
            }
        }
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void recordFunction(@NotNull FunctionMetrics function) {
        if (function.getComposable()) {
            this.totalComposables++;
            if (!function.getIsLambda()) {
                this.composables.add(function);
            }
            if (function.getReadonly()) {
                this.readonlyComposables++;
            }
            if (function.getSkippable()) {
                this.skippableComposables++;
            }
            if (function.getRestartable()) {
                this.restartableComposables++;
                this.restartGroups++;
            }
            this.totalGroups = function.getGroups() + this.totalGroups;
        }
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void recordLambda(boolean composable, boolean memoized, boolean singleton) {
        this.totalLambdas++;
        if (composable) {
            this.composableLambdas++;
        }
        if (memoized) {
            this.memoizedLambdas++;
        }
        if (composable && singleton) {
            this.singletonComposableLambdas++;
        }
        if (composable || !singleton) {
            return;
        }
        this.singletonLambdas++;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void saveMetricsTo(@NotNull String directory) throws IOException {
        JsonBuilderKt.write(new File(new File(directory), OooOOOO.OooO00o(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(this.name, '.', '_', false, 4, (Object) null), "<", "", false, 4, (Object) null), ">", "", false, 4, (Object) null), "-module.json")), new Function1<OutputStreamWriter, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.ModuleMetricsImpl.saveMetricsTo.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OutputStreamWriter outputStreamWriter) throws IOException {
                invoke2(outputStreamWriter);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull OutputStreamWriter outputStreamWriter) throws IOException {
                ModuleMetricsImpl.this.appendModuleJson(outputStreamWriter);
            }
        });
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void saveReportsTo(@NotNull String directory) throws IOException {
        File file = new File(directory);
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(this.name, '.', '_', false, 4, (Object) null), "<", "", false, 4, (Object) null), ">", "", false, 4, (Object) null);
        JsonBuilderKt.write(new File(file, OooOOOO.OooO00o(strReplace$default, "-composables.csv")), new Function1<OutputStreamWriter, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.ModuleMetricsImpl.saveReportsTo.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OutputStreamWriter outputStreamWriter) {
                invoke2(outputStreamWriter);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull OutputStreamWriter outputStreamWriter) {
                ModuleMetricsImpl.this.appendComposablesCsv(outputStreamWriter);
            }
        });
        JsonBuilderKt.write(new File(file, OooOOOO.OooO00o(strReplace$default, "-composables.txt")), new Function1<OutputStreamWriter, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.ModuleMetricsImpl.saveReportsTo.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OutputStreamWriter outputStreamWriter) {
                invoke2(outputStreamWriter);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull OutputStreamWriter outputStreamWriter) {
                ModuleMetricsImpl.this.appendComposablesTxt(outputStreamWriter);
            }
        });
        if (!this.logMessages.isEmpty()) {
            JsonBuilderKt.write(new File(file, OooOOOO.OooO00o(strReplace$default, "-composables.log")), new Function1<OutputStreamWriter, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.ModuleMetricsImpl.saveReportsTo.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(OutputStreamWriter outputStreamWriter) throws IOException {
                    invoke2(outputStreamWriter);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull OutputStreamWriter outputStreamWriter) throws IOException {
                    Iterator it = ModuleMetricsImpl.this.logMessages.iterator();
                    while (it.hasNext()) {
                        Appendable appendableAppend = outputStreamWriter.append((CharSequence) it.next());
                        Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(value)");
                        Intrinsics.checkNotNullExpressionValue(appendableAppend.append('\n'), "append('\\n')");
                    }
                }
            });
        }
        JsonBuilderKt.write(new File(file, OooOOOO.OooO00o(strReplace$default, "-classes.txt")), new Function1<OutputStreamWriter, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.ModuleMetricsImpl.saveReportsTo.4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OutputStreamWriter outputStreamWriter) throws IOException {
                invoke2(outputStreamWriter);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull OutputStreamWriter outputStreamWriter) throws IOException {
                ModuleMetricsImpl.this.appendClassesTxt(outputStreamWriter);
            }
        });
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }
}
