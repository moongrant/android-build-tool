package androidx.compose.compiler.plugins.kotlin.lower;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrSymbolOwner;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\fH\u0016J\u0010\u0010'\u001a\u00020#2\u0006\u0010&\u001a\u00020\fH\u0016J\u0012\u0010(\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010(\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u0007H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006*"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ClassContext;", "Landroidx/compose/compiler/plugins/kotlin/lower/DeclarationContext;", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "(Lorg/jetbrains/kotlin/ir/declarations/IrClass;)V", "captures", "", "Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;", "getCaptures", "()Ljava/util/Set;", "collectors", "", "Landroidx/compose/compiler/plugins/kotlin/lower/CaptureCollector;", "getCollectors", "()Ljava/util/List;", "setCollectors", "(Ljava/util/List;)V", "composable", "", "getComposable", "()Z", "getDeclaration", "()Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "functionContext", "Landroidx/compose/compiler/plugins/kotlin/lower/FunctionContext;", "getFunctionContext", "()Landroidx/compose/compiler/plugins/kotlin/lower/FunctionContext;", "symbol", "Lorg/jetbrains/kotlin/ir/symbols/IrClassSymbol;", "getSymbol", "()Lorg/jetbrains/kotlin/ir/symbols/IrClassSymbol;", "thisParam", "getThisParam", "()Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;", "declareLocal", "", ImagesContract.LOCAL, "popCollector", "collector", "pushCollector", "recordCapture", "Lorg/jetbrains/kotlin/ir/declarations/IrSymbolOwner;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ClassContext extends DeclarationContext {

    @NotNull
    private final Set<IrValueDeclaration> captures;

    @NotNull
    private List<CaptureCollector> collectors;
    private final boolean composable;

    @NotNull
    private final IrClass declaration;

    @Nullable
    private final FunctionContext functionContext;

    @Nullable
    private final IrValueDeclaration thisParam;

    public ClassContext(@NotNull IrClass declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        this.declaration = declaration;
        this.captures = new LinkedHashSet();
        IrValueDeclaration thisReceiver = getDeclaration().getThisReceiver();
        Intrinsics.checkNotNull(thisReceiver);
        this.thisParam = thisReceiver;
        this.collectors = new ArrayList();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    public void declareLocal(@Nullable IrValueDeclaration local) {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    @NotNull
    public Set<IrValueDeclaration> getCaptures() {
        return this.captures;
    }

    @NotNull
    public final List<CaptureCollector> getCollectors() {
        return this.collectors;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    public boolean getComposable() {
        return this.composable;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    @NotNull
    public IrClass getDeclaration() {
        return this.declaration;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    @Nullable
    public FunctionContext getFunctionContext() {
        return this.functionContext;
    }

    @Nullable
    public final IrValueDeclaration getThisParam() {
        return this.thisParam;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    public void popCollector(@NotNull CaptureCollector collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        if (!Intrinsics.areEqual(CollectionsKt.lastOrNull((List) this.collectors), collector)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        List<CaptureCollector> list = this.collectors;
        list.remove(list.size() - 1);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    public void pushCollector(@NotNull CaptureCollector collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        this.collectors.add(collector);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    public void recordCapture(@Nullable IrSymbolOwner local) {
    }

    public final void setCollectors(@NotNull List<CaptureCollector> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.collectors = list;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    @NotNull
    /* JADX INFO: renamed from: getSymbol, reason: merged with bridge method [inline-methods] */
    public IrClassSymbol mo132getSymbol() {
        return getDeclaration().getSymbol();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    public boolean recordCapture(@Nullable IrValueDeclaration local) {
        boolean zAreEqual = Intrinsics.areEqual(local, this.thisParam);
        IrDeclarationParent parent = local != null ? local.getParent() : null;
        IrConstructor irConstructor = parent instanceof IrConstructor ? (IrConstructor) parent : null;
        boolean z = zAreEqual || ((irConstructor != null ? irConstructor.getParent() : null) == getDeclaration());
        if (local != null && (!this.collectors.isEmpty()) && z) {
            Iterator<CaptureCollector> it = this.collectors.iterator();
            while (it.hasNext()) {
                it.next().recordCapture(local);
            }
        }
        if (local != null && AdditionalIrUtilsKt.isLocal(getDeclaration()) && !z) {
            getCaptures().add(local);
        }
        return z;
    }
}
