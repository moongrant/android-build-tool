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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrSymbolOwner;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0011H\u0016J\u0010\u0010'\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0011H\u0016J\u0012\u0010(\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010(\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\fH\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006*"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/FunctionContext;", "Landroidx/compose/compiler/plugins/kotlin/lower/DeclarationContext;", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "composable", "", "canRemember", "(Lorg/jetbrains/kotlin/ir/declarations/IrFunction;ZZ)V", "getCanRemember", "()Z", "captures", "", "Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;", "getCaptures", "()Ljava/util/Set;", "collectors", "", "Landroidx/compose/compiler/plugins/kotlin/lower/CaptureCollector;", "getCollectors", "()Ljava/util/List;", "setCollectors", "(Ljava/util/List;)V", "getComposable", "getDeclaration", "()Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "functionContext", "getFunctionContext", "()Landroidx/compose/compiler/plugins/kotlin/lower/FunctionContext;", "locals", "getLocals", "symbol", "Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;", "getSymbol", "()Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;", "declareLocal", "", ImagesContract.LOCAL, "popCollector", "collector", "pushCollector", "recordCapture", "Lorg/jetbrains/kotlin/ir/declarations/IrSymbolOwner;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposerLambdaMemoization.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposerLambdaMemoization.kt\nandroidx/compose/compiler/plugins/kotlin/lower/FunctionContext\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,965:1\n1855#2,2:966\n1#3:968\n*S KotlinDebug\n*F\n+ 1 ComposerLambdaMemoization.kt\nandroidx/compose/compiler/plugins/kotlin/lower/FunctionContext\n*L\n197#1:966,2\n*E\n"})
final class FunctionContext extends DeclarationContext {
    private final boolean canRemember;

    @NotNull
    private final Set<IrValueDeclaration> captures;

    @NotNull
    private List<CaptureCollector> collectors;
    private final boolean composable;

    @NotNull
    private final IrFunction declaration;

    @NotNull
    private final Set<IrValueDeclaration> locals;

    public FunctionContext(@NotNull IrFunction declaration, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        this.declaration = declaration;
        this.composable = z;
        this.canRemember = z2;
        this.locals = new LinkedHashSet();
        this.captures = new LinkedHashSet();
        this.collectors = new ArrayList();
        Iterator it = mo131getDeclaration().getValueParameters().iterator();
        while (it.hasNext()) {
            declareLocal((IrValueDeclaration) ((IrValueParameter) it.next()));
        }
        IrValueParameter dispatchReceiverParameter = mo131getDeclaration().getDispatchReceiverParameter();
        if (dispatchReceiverParameter != null) {
            declareLocal((IrValueDeclaration) dispatchReceiverParameter);
        }
        IrValueParameter extensionReceiverParameter = mo131getDeclaration().getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            declareLocal((IrValueDeclaration) extensionReceiverParameter);
        }
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    public void declareLocal(@Nullable IrValueDeclaration local) {
        if (local != null) {
            this.locals.add(local);
        }
    }

    public final boolean getCanRemember() {
        return this.canRemember;
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
    public FunctionContext getFunctionContext() {
        return this;
    }

    @NotNull
    public final Set<IrValueDeclaration> getLocals() {
        return this.locals;
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
    public boolean recordCapture(@Nullable IrValueDeclaration local) {
        boolean zContains = CollectionsKt.contains(this.locals, local);
        if (local != null && (!this.collectors.isEmpty()) && zContains) {
            Iterator<CaptureCollector> it = this.collectors.iterator();
            while (it.hasNext()) {
                it.next().recordCapture(local);
            }
        }
        if (local != null && AdditionalIrUtilsKt.isLocal(mo131getDeclaration()) && !zContains) {
            getCaptures().add(local);
        }
        return zContains;
    }

    public final void setCollectors(@NotNull List<CaptureCollector> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.collectors = list;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    @NotNull
    /* JADX INFO: renamed from: getDeclaration, reason: from getter and merged with bridge method [inline-methods] */
    public IrFunction mo131getDeclaration() {
        return this.declaration;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    @NotNull
    /* JADX INFO: renamed from: getSymbol, reason: merged with bridge method [inline-methods] */
    public IrFunctionSymbol mo132getSymbol() {
        return mo131getDeclaration().getSymbol();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    public void recordCapture(@Nullable IrSymbolOwner local) {
        if (local != null) {
            Set<IrValueDeclaration> set = getLocalDeclarationCaptures().get(local);
            for (CaptureCollector captureCollector : this.collectors) {
                captureCollector.recordCapture(local);
                if (set != null) {
                    Iterator<IrValueDeclaration> it = set.iterator();
                    while (it.hasNext()) {
                        captureCollector.recordCapture(it.next());
                    }
                }
            }
        }
    }
}
