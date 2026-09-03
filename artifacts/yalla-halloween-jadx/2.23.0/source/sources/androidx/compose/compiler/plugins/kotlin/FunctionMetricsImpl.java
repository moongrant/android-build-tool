package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.analysis.Stability;
import androidx.compose.compiler.plugins.kotlin.analysis.StabilityKt;
import androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer;
import androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformerKt;
import androidx.compose.compiler.plugins.kotlin.lower.IrSourcePrinterVisitor;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.visitors.IrElementVisitor;
import org.jetbrains.kotlin.js.resolve.diagnostics.SourceLocationUtilsKt;
import org.jetbrains.kotlin.name.FqName;
import org.jetbrains.kotlin.psi.KtExpression;
import org.jetbrains.kotlin.psi.KtParameter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001WB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010<\u001a\u00020=2\n\u0010>\u001a\u00060?j\u0002`@2\u0006\u0010A\u001a\u00020BH\u0016J\u001e\u0010C\u001a\u00020=2\u0006\u0010D\u001a\u00020E2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020H0GH\u0016J@\u0010I\u001a\u00020=2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00109\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u00100\u001a\u00020\fH\u0016J\b\u0010J\u001a\u00020=H\u0016J:\u0010K\u001a\u00020=2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010S2\u0006\u0010T\u001a\u00020\f2\u0006\u0010U\u001a\u00020\fH\u0016J\u0010\u0010V\u001a\u00020=2\u0006\u00106\u001a\u00020\"H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\nR\u001a\u0010\u0019\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\u001a\u0010\u001c\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001a\u0010\u001f\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\u001a\u0010!\u001a\u00020\"X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000e\"\u0004\b2\u0010\u0010R\u001a\u00103\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000e\"\u0004\b5\u0010\u0010R\u001c\u00106\u001a\u0004\u0018\u00010\"X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R\u001a\u00109\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000e\"\u0004\b;\u0010\u0010¨\u0006X"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/FunctionMetricsImpl;", "Landroidx/compose/compiler/plugins/kotlin/FunctionMetrics;", "function", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "(Lorg/jetbrains/kotlin/ir/declarations/IrFunction;)V", "calls", "", "getCalls", "()I", "setCalls", "(I)V", "composable", "", "getComposable", "()Z", "setComposable", "(Z)V", "defaultsGroup", "getDefaultsGroup", "setDefaultsGroup", "getFunction", "()Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "groups", "getGroups", "setGroups", "hasDefaults", "getHasDefaults", "setHasDefaults", "inline", "getInline", "setInline", "isLambda", "setLambda", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME, "Lorg/jetbrains/kotlin/name/FqName;", "getPackageName", "()Lorg/jetbrains/kotlin/name/FqName;", "setPackageName", "(Lorg/jetbrains/kotlin/name/FqName;)V", "parameters", "", "Landroidx/compose/compiler/plugins/kotlin/FunctionMetricsImpl$Param;", "readonly", "getReadonly", "setReadonly", "restartable", "getRestartable", "setRestartable", "scheme", "getScheme", "setScheme", "skippable", "getSkippable", "setSkippable", "print", "", "out", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "src", "Landroidx/compose/compiler/plugins/kotlin/lower/IrSourcePrinterVisitor;", "recordComposableCall", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "paramMeta", "", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$ParamMeta;", "recordFunction", "recordGroup", "recordParameter", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "type", "Lorg/jetbrains/kotlin/ir/types/IrType;", "stability", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", NewFriendsOld.State_Default, "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "defaultStatic", "used", "recordScheme", "Param", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBuildMetrics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuildMetrics.kt\nandroidx/compose/compiler/plugins/kotlin/FunctionMetricsImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,586:1\n1#2:587\n*E\n"})
public final class FunctionMetricsImpl implements FunctionMetrics {
    private int calls;
    private boolean composable;
    private boolean defaultsGroup;

    @NotNull
    private final IrFunction function;
    private int groups;
    private boolean hasDefaults;
    private boolean inline;
    private boolean isLambda;

    @NotNull
    private String name;

    @NotNull
    private FqName packageName;

    @NotNull
    private final List<Param> parameters;
    private boolean readonly;
    private boolean restartable;

    @Nullable
    private String scheme;
    private boolean skippable;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\u001a\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001d2\u0006\u0010\u001e\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006 "}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/FunctionMetricsImpl$Param;", "", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "type", "Lorg/jetbrains/kotlin/ir/types/IrType;", "stability", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", NewFriendsOld.State_Default, "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "defaultStatic", "", "used", "(Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;Lorg/jetbrains/kotlin/ir/types/IrType;Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;Lorg/jetbrains/kotlin/ir/expressions/IrExpression;ZZ)V", "getDeclaration", "()Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "getDefault", "()Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "getDefaultStatic", "()Z", "getStability", "()Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "getType", "()Lorg/jetbrains/kotlin/ir/types/IrType;", "getUsed", "print", "", "out", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "src", "Landroidx/compose/compiler/plugins/kotlin/lower/IrSourcePrinterVisitor;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Param {

        @NotNull
        private final IrValueParameter declaration;

        @Nullable
        private final IrExpression default;
        private final boolean defaultStatic;

        @NotNull
        private final Stability stability;

        @NotNull
        private final IrType type;
        private final boolean used;

        public Param(@NotNull IrValueParameter declaration, @NotNull IrType type, @NotNull Stability stability, @Nullable IrExpression irExpression, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(declaration, "declaration");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(stability, "stability");
            this.declaration = declaration;
            this.type = type;
            this.stability = stability;
            this.default = irExpression;
            this.defaultStatic = z;
            this.used = z2;
        }

        @NotNull
        public final IrValueParameter getDeclaration() {
            return this.declaration;
        }

        @Nullable
        public final IrExpression getDefault() {
            return this.default;
        }

        public final boolean getDefaultStatic() {
            return this.defaultStatic;
        }

        @NotNull
        public final Stability getStability() {
            return this.stability;
        }

        @NotNull
        public final IrType getType() {
            return this.type;
        }

        public final boolean getUsed() {
            return this.used;
        }

        public final void print(@NotNull Appendable out, @NotNull IrSourcePrinterVisitor src) throws IOException {
            KtExpression defaultValue;
            Intrinsics.checkNotNullParameter(out, "out");
            Intrinsics.checkNotNullParameter(src, "src");
            if (!this.used) {
                out.append("unused ");
            }
            if (StabilityKt.knownStable(this.stability)) {
                out.append("stable ");
            } else if (StabilityKt.knownUnstable(this.stability)) {
                out.append("unstable ");
            }
            out.append(this.declaration.getName().asString());
            out.append(": ");
            out.append(src.printType(this.type));
            if (this.default != null) {
                out.append(" = ");
                if (this.defaultStatic) {
                    out.append("@static ");
                } else {
                    out.append("@dynamic ");
                }
                KtParameter ktParameterFindPsi = SourceLocationUtilsKt.findPsi(this.declaration.getSymbol().getDescriptor());
                KtParameter ktParameter = ktParameterFindPsi instanceof KtParameter ? ktParameterFindPsi : null;
                String text = (ktParameter == null || (defaultValue = ktParameter.getDefaultValue()) == null) ? null : defaultValue.getText();
                if (text != null) {
                    out.append(text);
                } else {
                    this.default.accept((IrElementVisitor) src, (Object) null);
                }
            }
        }
    }

    public FunctionMetricsImpl(@NotNull IrFunction function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
        this.packageName = AdditionalIrUtilsKt.getFqNameForIrSerialization((IrDeclarationParent) function);
        String strAsString = function.getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "function.name.asString()");
        this.name = strAsString;
        this.parameters = new ArrayList();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public int getCalls() {
        return this.calls;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean getComposable() {
        return this.composable;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean getDefaultsGroup() {
        return this.defaultsGroup;
    }

    @NotNull
    public final IrFunction getFunction() {
        return this.function;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public int getGroups() {
        return this.groups;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean getHasDefaults() {
        return this.hasDefaults;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean getInline() {
        return this.inline;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    @NotNull
    public FqName getPackageName() {
        return this.packageName;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean getReadonly() {
        return this.readonly;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean getRestartable() {
        return this.restartable;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    @Nullable
    public String getScheme() {
        return this.scheme;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean getSkippable() {
        return this.skippable;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public final /* synthetic */ boolean isEmpty() {
        return OooO0O0.OooO00o(this);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    /* JADX INFO: renamed from: isLambda, reason: from getter */
    public boolean getIsLambda() {
        return this.isLambda;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public void print(@NotNull Appendable out, @NotNull IrSourcePrinterVisitor src) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(src, "src");
        if (getRestartable()) {
            out.append("restartable ");
        }
        if (getSkippable()) {
            out.append("skippable ");
        }
        if (getReadonly()) {
            out.append("readonly ");
        }
        if (getInline()) {
            out.append("inline ");
        }
        String scheme = getScheme();
        if (scheme != null) {
            out.append("scheme(\"" + scheme + "\") ");
        }
        out.append("fun ");
        out.append(getName());
        if (this.parameters.isEmpty()) {
            Appendable appendableAppend = out.append("()");
            Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(value)");
            Intrinsics.checkNotNullExpressionValue(appendableAppend.append('\n'), "append('\\n')");
            return;
        }
        Appendable appendableAppend2 = out.append("(");
        Intrinsics.checkNotNullExpressionValue(appendableAppend2, "append(value)");
        Intrinsics.checkNotNullExpressionValue(appendableAppend2.append('\n'), "append('\\n')");
        for (Param param : this.parameters) {
            out.append("  ");
            param.print(out, src);
            Intrinsics.checkNotNullExpressionValue(out.append('\n'), "append('\\n')");
        }
        out.append(")");
        if (!ComposableFunctionBodyTransformerKt.isUnitOrNullableUnit(this.function.getReturnType())) {
            out.append(": ");
            out.append(src.printType(this.function.getReturnType()));
        }
        Intrinsics.checkNotNullExpressionValue(out.append('\n'), "append('\\n')");
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public void recordComposableCall(@NotNull IrCall expression, @NotNull List<ComposableFunctionBodyTransformer.ParamMeta> paramMeta) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(paramMeta, "paramMeta");
        setCalls(getCalls() + 1);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public void recordFunction(boolean composable, boolean restartable, boolean skippable, boolean isLambda, boolean inline, boolean hasDefaults, boolean readonly) {
        setComposable(composable);
        setRestartable(restartable);
        setSkippable(skippable);
        setLambda(isLambda);
        setInline(inline);
        setHasDefaults(hasDefaults);
        setReadonly(readonly);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public void recordGroup() {
        setGroups(getGroups() + 1);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public void recordParameter(@NotNull IrValueParameter declaration, @NotNull IrType type, @NotNull Stability stability, @Nullable IrExpression irExpression, boolean defaultStatic, boolean used) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(stability, "stability");
        this.parameters.add(new Param(declaration, type, stability, irExpression, defaultStatic, used));
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public void recordScheme(@NotNull String scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        setScheme(scheme);
    }

    public void setCalls(int i) {
        this.calls = i;
    }

    public void setComposable(boolean z) {
        this.composable = z;
    }

    public void setDefaultsGroup(boolean z) {
        this.defaultsGroup = z;
    }

    public void setGroups(int i) {
        this.groups = i;
    }

    public void setHasDefaults(boolean z) {
        this.hasDefaults = z;
    }

    public void setInline(boolean z) {
        this.inline = z;
    }

    public void setLambda(boolean z) {
        this.isLambda = z;
    }

    public void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public void setPackageName(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "<set-?>");
        this.packageName = fqName;
    }

    public void setReadonly(boolean z) {
        this.readonly = z;
    }

    public void setRestartable(boolean z) {
        this.restartable = z;
    }

    public void setScheme(@Nullable String str) {
        this.scheme = str;
    }

    public void setSkippable(boolean z) {
        this.skippable = z;
    }
}
