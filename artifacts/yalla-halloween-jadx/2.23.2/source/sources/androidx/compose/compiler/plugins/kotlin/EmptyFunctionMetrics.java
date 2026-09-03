package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.analysis.Stability;
import androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer;
import androidx.compose.compiler.plugins.kotlin.lower.IrSourcePrinterVisitor;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.name.FqName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H\u0002J\u001c\u0010'\u001a\u00020(2\n\u0010)\u001a\u00060*j\u0002`+2\u0006\u0010,\u001a\u00020-H\u0016J\u001e\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0016J@\u00104\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0016J\b\u00105\u001a\u00020(H\u0016J:\u00106\u001a\u00020(2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\bH\u0016J\u0010\u0010A\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0016H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0018R\u0014\u0010#\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\n¨\u0006B"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/EmptyFunctionMetrics;", "Landroidx/compose/compiler/plugins/kotlin/FunctionMetrics;", "()V", "calls", "", "getCalls", "()I", "composable", "", "getComposable", "()Z", "defaultsGroup", "getDefaultsGroup", "groups", "getGroups", "hasDefaults", "getHasDefaults", "inline", "getInline", "isEmpty", "isLambda", "name", "", "getName", "()Ljava/lang/String;", RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME, "Lorg/jetbrains/kotlin/name/FqName;", "getPackageName", "()Lorg/jetbrains/kotlin/name/FqName;", "readonly", "getReadonly", "restartable", "getRestartable", "scheme", "getScheme", "skippable", "getSkippable", "emptyMetricsAccessed", "", "print", "", "out", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "src", "Landroidx/compose/compiler/plugins/kotlin/lower/IrSourcePrinterVisitor;", "recordComposableCall", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "paramMeta", "", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$ParamMeta;", "recordFunction", "recordGroup", "recordParameter", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "type", "Lorg/jetbrains/kotlin/ir/types/IrType;", "stability", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", NewFriendsOld.State_Default, "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "defaultStatic", "used", "recordScheme", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmptyFunctionMetrics implements FunctionMetrics {

    @NotNull
    public static final EmptyFunctionMetrics INSTANCE = new EmptyFunctionMetrics();

    private EmptyFunctionMetrics() {
    }

    private final Void emptyMetricsAccessed() {
        throw new IllegalStateException("Empty metrics accessed".toString());
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public int getCalls() {
        emptyMetricsAccessed();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean getComposable() {
        emptyMetricsAccessed();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean getDefaultsGroup() {
        emptyMetricsAccessed();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public int getGroups() {
        emptyMetricsAccessed();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean getHasDefaults() {
        emptyMetricsAccessed();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean getInline() {
        emptyMetricsAccessed();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    @NotNull
    public String getName() {
        emptyMetricsAccessed();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    @NotNull
    public FqName getPackageName() {
        emptyMetricsAccessed();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean getReadonly() {
        emptyMetricsAccessed();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean getRestartable() {
        emptyMetricsAccessed();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    @NotNull
    public String getScheme() {
        emptyMetricsAccessed();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean getSkippable() {
        emptyMetricsAccessed();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean isEmpty() {
        return true;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public boolean isLambda() {
        emptyMetricsAccessed();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public void print(@NotNull Appendable out, @NotNull IrSourcePrinterVisitor src) {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public void recordComposableCall(@NotNull IrCall expression, @NotNull List<ComposableFunctionBodyTransformer.ParamMeta> paramMeta) {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public void recordFunction(boolean composable, boolean restartable, boolean skippable, boolean isLambda, boolean inline, boolean hasDefaults, boolean readonly) {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public void recordGroup() {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public void recordParameter(@NotNull IrValueParameter declaration, @NotNull IrType type, @NotNull Stability stability, @Nullable IrExpression irExpression, boolean defaultStatic, boolean used) {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.FunctionMetrics
    public void recordScheme(@NotNull String scheme) {
    }
}
