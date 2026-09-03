package androidx.compose.compiler.plugins.kotlin.lower;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrField;
import org.jetbrains.kotlin.ir.declarations.IrFile;
import org.jetbrains.kotlin.ir.declarations.IrLocalDelegatedProperty;
import org.jetbrains.kotlin.ir.declarations.IrProperty;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols;
import org.jetbrains.kotlin.ir.util.SymbolRemapper;
import org.jetbrains.kotlin.ir.util.SymbolRenamer;
import org.jetbrains.kotlin.ir.util.TypeRemapper;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u0017H\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/DeepCopyPreservingMetadata;", "Lorg/jetbrains/kotlin/ir/util/DeepCopyIrTreeWithSymbols;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/SymbolRemapper;", "typeRemapper", "Lorg/jetbrains/kotlin/ir/util/TypeRemapper;", "symbolRenamer", "Lorg/jetbrains/kotlin/ir/util/SymbolRenamer;", "(Lorg/jetbrains/kotlin/ir/util/SymbolRemapper;Lorg/jetbrains/kotlin/ir/util/TypeRemapper;Lorg/jetbrains/kotlin/ir/util/SymbolRenamer;)V", "visitClass", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "declaration", "visitConstructor", "Lorg/jetbrains/kotlin/ir/declarations/IrConstructor;", "visitField", "Lorg/jetbrains/kotlin/ir/declarations/IrField;", "visitFile", "Lorg/jetbrains/kotlin/ir/declarations/IrFile;", "visitLocalDelegatedProperty", "Lorg/jetbrains/kotlin/ir/declarations/IrLocalDelegatedProperty;", "visitProperty", "Lorg/jetbrains/kotlin/ir/declarations/IrProperty;", "visitSimpleFunction", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DeepCopyPreservingMetadata extends DeepCopyIrTreeWithSymbols {
    public DeepCopyPreservingMetadata(@NotNull SymbolRemapper symbolRemapper, @NotNull TypeRemapper typeRemapper, @NotNull SymbolRenamer symbolRenamer) {
        super(symbolRemapper, typeRemapper, symbolRenamer);
    }

    @NotNull
    public IrFile visitFile(@NotNull IrFile declaration) {
        IrFile irFileVisitFile = super.visitFile(declaration);
        irFileVisitFile.setMetadata(declaration.getMetadata());
        return irFileVisitFile;
    }

    @NotNull
    public IrClass visitClass(@NotNull IrClass declaration) {
        IrClass irClassVisitClass = super.visitClass(declaration);
        irClassVisitClass.setMetadata(declaration.getMetadata());
        return irClassVisitClass;
    }

    @NotNull
    public IrConstructor visitConstructor(@NotNull IrConstructor declaration) {
        IrConstructor irConstructorVisitConstructor = super.visitConstructor(declaration);
        irConstructorVisitConstructor.setMetadata(declaration.getMetadata());
        return irConstructorVisitConstructor;
    }

    @NotNull
    public IrField visitField(@NotNull IrField declaration) {
        IrField irFieldVisitField = super.visitField(declaration);
        irFieldVisitField.setMetadata(declaration.getMetadata());
        return irFieldVisitField;
    }

    @NotNull
    public IrLocalDelegatedProperty visitLocalDelegatedProperty(@NotNull IrLocalDelegatedProperty declaration) {
        IrLocalDelegatedProperty irLocalDelegatedPropertyVisitLocalDelegatedProperty = super.visitLocalDelegatedProperty(declaration);
        irLocalDelegatedPropertyVisitLocalDelegatedProperty.setMetadata(declaration.getMetadata());
        return irLocalDelegatedPropertyVisitLocalDelegatedProperty;
    }

    @Override // 
    @NotNull
    public IrProperty visitProperty(@NotNull IrProperty declaration) {
        IrProperty irPropertyVisitProperty = super.visitProperty(declaration);
        irPropertyVisitProperty.setMetadata(declaration.getMetadata());
        return irPropertyVisitProperty;
    }

    @Override // 
    @NotNull
    public IrSimpleFunction visitSimpleFunction(@NotNull IrSimpleFunction declaration) {
        IrSimpleFunction irSimpleFunctionVisitSimpleFunction = super.visitSimpleFunction(declaration);
        irSimpleFunctionVisitSimpleFunction.setMetadata(declaration.getMetadata());
        return irSimpleFunctionVisitSimpleFunction;
    }
}
