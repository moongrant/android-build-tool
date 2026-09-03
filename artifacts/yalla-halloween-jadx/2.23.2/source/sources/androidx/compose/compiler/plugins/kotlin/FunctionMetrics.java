package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.analysis.Stability;
import androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer;
import androidx.compose.compiler.plugins.kotlin.lower.IrSourcePrinterVisitor;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.name.FqName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010$\u001a\u00020%2\n\u0010&\u001a\u00060'j\u0002`(2\u0006\u0010)\u001a\u00020*H&J\u001e\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H&J@\u00101\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H&J\b\u00102\u001a\u00020%H&J:\u00103\u001a\u00020%2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0007H&J\u0010\u0010>\u001a\u00020%2\u0006\u0010 \u001a\u00020\u0015H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0012\u0010\u0010\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\tR\u0012\u0010\u0013\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0012\u0010\u001e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0014\u0010 \u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u0012\u0010\"\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006?À\u0006\u0003"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/FunctionMetrics;", "", "calls", "", "getCalls", "()I", "composable", "", "getComposable", "()Z", "defaultsGroup", "getDefaultsGroup", "groups", "getGroups", "hasDefaults", "getHasDefaults", "inline", "getInline", "isEmpty", "isLambda", "name", "", "getName", "()Ljava/lang/String;", RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME, "Lorg/jetbrains/kotlin/name/FqName;", "getPackageName", "()Lorg/jetbrains/kotlin/name/FqName;", "readonly", "getReadonly", "restartable", "getRestartable", "scheme", "getScheme", "skippable", "getSkippable", "print", "", "out", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "src", "Landroidx/compose/compiler/plugins/kotlin/lower/IrSourcePrinterVisitor;", "recordComposableCall", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "paramMeta", "", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$ParamMeta;", "recordFunction", "recordGroup", "recordParameter", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "type", "Lorg/jetbrains/kotlin/ir/types/IrType;", "stability", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", NewFriendsOld.State_Default, "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "defaultStatic", "used", "recordScheme", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface FunctionMetrics {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isEmpty(@NotNull FunctionMetrics functionMetrics) {
            return OooO00o.OooO00o(functionMetrics);
        }
    }

    int getCalls();

    boolean getComposable();

    boolean getDefaultsGroup();

    int getGroups();

    boolean getHasDefaults();

    boolean getInline();

    @NotNull
    String getName();

    @NotNull
    FqName getPackageName();

    boolean getReadonly();

    boolean getRestartable();

    @Nullable
    String getScheme();

    boolean getSkippable();

    boolean isEmpty();

    boolean isLambda();

    void print(@NotNull Appendable out, @NotNull IrSourcePrinterVisitor src);

    void recordComposableCall(@NotNull IrCall expression, @NotNull List<ComposableFunctionBodyTransformer.ParamMeta> paramMeta);

    void recordFunction(boolean composable, boolean restartable, boolean skippable, boolean isLambda, boolean inline, boolean hasDefaults, boolean readonly);

    void recordGroup();

    void recordParameter(@NotNull IrValueParameter declaration, @NotNull IrType type, @NotNull Stability stability, @Nullable IrExpression irExpression, boolean defaultStatic, boolean used);

    void recordScheme(@NotNull String scheme);
}
