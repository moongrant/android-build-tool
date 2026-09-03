package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContextImpl;
import org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException;
import org.jetbrains.kotlin.descriptors.SourceElement;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.builders.declarations.DeclarationBuildersKt;
import org.jetbrains.kotlin.ir.declarations.IrAttributeContainer;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationsKt;
import org.jetbrains.kotlin.ir.declarations.IrField;
import org.jetbrains.kotlin.ir.declarations.IrFile;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrMetadataSourceOwner;
import org.jetbrains.kotlin.ir.declarations.IrProperty;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl;
import org.jetbrains.kotlin.ir.expressions.IrBranch;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression;
import org.jetbrains.kotlin.ir.expressions.IrWhen;
import org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrConstructorCallImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrIfThenElseImpl;
import org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.IrPropertySymbol;
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol;
import org.jetbrains.kotlin.ir.types.IrSimpleType;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypeArgument;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.IrTypeUtilsKt;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.util.PatchDeclarationParentsKt;
import org.jetbrains.kotlin.ir.util.SymbolRemapper;
import org.jetbrains.kotlin.ir.util.SymbolRenamer;
import org.jetbrains.kotlin.ir.util.TypeRemapper;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformer;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020(H\u0016J\u0014\u0010)\u001a\u00020**\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u001c\u0010.\u001a\u00020**\u0006\u0012\u0002\b\u00030/2\n\u00100\u001a\u0006\u0012\u0002\b\u00030/H\u0002J\f\u00101\u001a\u00020\f*\u00020\u0013H\u0002J\f\u00102\u001a\u00020\f*\u00020\u000eH\u0002J\f\u00103\u001a\u00020\f*\u00020\u0013H\u0002J\f\u0010\u000b\u001a\u00020\f*\u00020\"H\u0002J'\u00104\u001a\u0002H5\"\f\b\u0000\u00105*\u0006\u0012\u0002\b\u00030/*\u0002H52\u0006\u00106\u001a\u0002H5H\u0002¢\u0006\u0002\u00107J'\u00108\u001a\u00020*\"\f\b\u0000\u00105*\u0006\u0012\u0002\b\u00030/*\u0002H52\u0006\u00106\u001a\u0002H5H\u0002¢\u0006\u0002\u00109R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/DeepCopyIrTreeWithSymbolsPreservingMetadata;", "Lorg/jetbrains/kotlin/ir/util/DeepCopyIrTreeWithSymbols;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "typeRemapper", "Lorg/jetbrains/kotlin/ir/util/TypeRemapper;", "symbolRenamer", "Lorg/jetbrains/kotlin/ir/util/SymbolRenamer;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;Lorg/jetbrains/kotlin/ir/util/TypeRemapper;Lorg/jetbrains/kotlin/ir/util/SymbolRenamer;)V", "needsComposableRemapping", "", "type", "Lorg/jetbrains/kotlin/ir/types/IrType;", "shallowCopyCall", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "expression", "newCallee", "Lorg/jetbrains/kotlin/ir/symbols/IrSimpleFunctionSymbol;", "visitCall", "visitClass", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "declaration", "visitConstructor", "Lorg/jetbrains/kotlin/ir/declarations/IrConstructor;", "visitConstructorCall", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "visitField", "Lorg/jetbrains/kotlin/ir/declarations/IrField;", "visitFile", "Lorg/jetbrains/kotlin/ir/declarations/IrFile;", "visitFunction", "Lorg/jetbrains/kotlin/ir/IrStatement;", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "visitProperty", "Lorg/jetbrains/kotlin/ir/declarations/IrProperty;", "visitSimpleFunction", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "visitWhen", "Lorg/jetbrains/kotlin/ir/expressions/IrWhen;", "copyMetadataFrom", "", "Lorg/jetbrains/kotlin/ir/IrElement;", "owner", "Lorg/jetbrains/kotlin/ir/declarations/IrMetadataSourceOwner;", "copyRemappedTypeArgumentsFrom", "Lorg/jetbrains/kotlin/ir/expressions/IrMemberAccessExpression;", "other", "isBoundButNotRemapped", "isComposable", "isRemappedAndBound", "transformReceiverArguments", "T", "original", "(Lorg/jetbrains/kotlin/ir/expressions/IrMemberAccessExpression;Lorg/jetbrains/kotlin/ir/expressions/IrMemberAccessExpression;)Lorg/jetbrains/kotlin/ir/expressions/IrMemberAccessExpression;", "transformValueArguments", "(Lorg/jetbrains/kotlin/ir/expressions/IrMemberAccessExpression;Lorg/jetbrains/kotlin/ir/expressions/IrMemberAccessExpression;)V", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableTypeRemapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableTypeRemapper.kt\nandroidx/compose/compiler/plugins/kotlin/lower/DeepCopyIrTreeWithSymbolsPreservingMetadata\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AbstractComposeLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLoweringKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 DeepCopyIrTreeWithSymbols.kt\norg/jetbrains/kotlin/ir/util/DeepCopyIrTreeWithSymbols\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,505:1\n1#2:506\n1146#3,6:507\n1620#4,2:513\n1622#4:516\n1747#4,3:517\n1549#4:522\n1620#4,3:523\n1855#4,2:526\n1549#4:528\n1620#4,3:529\n76#5:515\n76#5:532\n76#5:533\n76#5:534\n123#6,2:520\n*S KotlinDebug\n*F\n+ 1 ComposableTypeRemapper.kt\nandroidx/compose/compiler/plugins/kotlin/lower/DeepCopyIrTreeWithSymbolsPreservingMetadata\n*L\n126#1:507,6\n143#1:513,2\n143#1:516\n207#1:517,3\n240#1:522\n240#1:523,3\n243#1:526,2\n313#1:528\n313#1:529,3\n144#1:515\n374#1:532\n381#1:533\n382#1:534\n233#1:520,2\n*E\n"})
public final class DeepCopyIrTreeWithSymbolsPreservingMetadata extends DeepCopyIrTreeWithSymbols {

    @NotNull
    private final IrPluginContext context;

    @NotNull
    private final DeepCopySymbolRemapper symbolRemapper;

    public /* synthetic */ DeepCopyIrTreeWithSymbolsPreservingMetadata(IrPluginContext irPluginContext, DeepCopySymbolRemapper deepCopySymbolRemapper, TypeRemapper typeRemapper, SymbolRenamer symbolRenamer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(irPluginContext, deepCopySymbolRemapper, typeRemapper, (i & 8) != 0 ? (SymbolRenamer) SymbolRenamer.DEFAULT.INSTANCE : symbolRenamer);
    }

    private final void copyMetadataFrom(IrElement irElement, IrMetadataSourceOwner irMetadataSourceOwner) {
        if (irElement instanceof IrMetadataSourceOwner) {
            ((IrMetadataSourceOwner) irElement).setMetadata(irMetadataSourceOwner.getMetadata());
        } else {
            throw new IllegalArgumentException("Cannot copy metadata to " + irElement);
        }
    }

    private final void copyRemappedTypeArgumentsFrom(IrMemberAccessExpression<?> irMemberAccessExpression, IrMemberAccessExpression<?> irMemberAccessExpression2) {
        irMemberAccessExpression.getTypeArgumentsCount();
        irMemberAccessExpression2.getTypeArgumentsCount();
        int typeArgumentsCount = irMemberAccessExpression.getTypeArgumentsCount();
        for (int i = 0; i < typeArgumentsCount; i++) {
            IrType typeArgument = irMemberAccessExpression2.getTypeArgument(i);
            irMemberAccessExpression.putTypeArgument(i, typeArgument != null ? remapType(typeArgument) : null);
        }
    }

    private final boolean isBoundButNotRemapped(IrSimpleFunctionSymbol irSimpleFunctionSymbol) {
        return irSimpleFunctionSymbol.isBound() && Intrinsics.areEqual(this.symbolRemapper.getReferencedFunction((IrFunctionSymbol) irSimpleFunctionSymbol), irSimpleFunctionSymbol);
    }

    private final boolean isComposable(IrType irType) {
        return AdditionalIrUtilsKt.hasAnnotation(irType.getAnnotations(), ComposeFqNames.INSTANCE.getComposable());
    }

    private final boolean isRemappedAndBound(IrSimpleFunctionSymbol irSimpleFunctionSymbol) {
        IrFunctionSymbol referencedFunction = this.symbolRemapper.getReferencedFunction((IrFunctionSymbol) irSimpleFunctionSymbol);
        return referencedFunction.isBound() && !Intrinsics.areEqual(referencedFunction, irSimpleFunctionSymbol);
    }

    private final boolean needsComposableRemapping(IrFunction irFunction) {
        IrValueParameter dispatchReceiverParameter = irFunction.getDispatchReceiverParameter();
        if (!needsComposableRemapping(dispatchReceiverParameter != null ? dispatchReceiverParameter.getType() : null)) {
            IrValueParameter extensionReceiverParameter = irFunction.getExtensionReceiverParameter();
            if (!needsComposableRemapping(extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null) && !needsComposableRemapping(irFunction.getReturnType())) {
                Iterator it = irFunction.getValueParameters().iterator();
                while (it.hasNext()) {
                    if (needsComposableRemapping(((IrValueParameter) it.next()).getType())) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private final IrCall shallowCopyCall(IrCall expression, IrSimpleFunctionSymbol newCallee) {
        IrAttributeContainer irCallImpl = new IrCallImpl(expression.getStartOffset(), expression.getEndOffset(), remapType(expression.getType()), newCallee, expression.getTypeArgumentsCount(), expression.getValueArgumentsCount(), mapStatementOrigin(expression.getOrigin()), this.symbolRemapper.getReferencedClassOrNull(expression.getSuperQualifierSymbol()));
        copyRemappedTypeArgumentsFrom((IrMemberAccessExpression) irCallImpl, (IrMemberAccessExpression) expression);
        return IrDeclarationsKt.copyAttributes(irCallImpl, (IrAttributeContainer) expression);
    }

    private final <T extends IrMemberAccessExpression<?>> T transformReceiverArguments(T t, T t2) {
        IrExpression irExpression;
        IrElement dispatchReceiver = t2.getDispatchReceiver();
        IrExpression irExpression2 = null;
        if (dispatchReceiver != null) {
            IrElement irElementTransform = dispatchReceiver.transform((IrElementTransformer) this, (Object) null);
            if (irElementTransform == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrExpression");
            }
            irExpression = (IrExpression) ((IrExpression) irElementTransform);
        } else {
            irExpression = null;
        }
        t.setDispatchReceiver(irExpression);
        IrElement extensionReceiver = t2.getExtensionReceiver();
        if (extensionReceiver != null) {
            IrElement irElementTransform2 = extensionReceiver.transform((IrElementTransformer) this, (Object) null);
            if (irElementTransform2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrExpression");
            }
            irExpression2 = (IrExpression) ((IrExpression) irElementTransform2);
        }
        t.setExtensionReceiver(irExpression2);
        return t;
    }

    private final <T extends IrMemberAccessExpression<?>> void transformValueArguments(T t, T t2) {
        transformReceiverArguments(t, t2);
        int valueArgumentsCount = t2.getValueArgumentsCount();
        for (int i = 0; i < valueArgumentsCount; i++) {
            IrElement valueArgument = t2.getValueArgument(i);
            IrExpression irExpression = null;
            if (valueArgument != null) {
                IrElement irElementTransform = valueArgument.transform((IrElementTransformer) this, (Object) null);
                if (irElementTransform == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrExpression");
                }
                irExpression = (IrExpression) ((IrExpression) irElementTransform);
            }
            t.putValueArgument(i, irExpression);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException */
    @NotNull
    public IrFile visitFile(@NotNull IrFile declaration) throws Exception {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        try {
            IrFile irFileVisitFile = super.visitFile(declaration);
            if (irFileVisitFile instanceof IrFileImpl) {
                irFileVisitFile.setMetadata(declaration.getMetadata());
            }
            return irFileVisitFile;
        } catch (ProcessCanceledException e) {
            throw e;
        } catch (Exception e2) {
            throw new Exception(o00O00OO.OooO00o("IR lowering failed at: ", IrDeclarationsKt.getName(declaration)), e2);
        }
    }

    @NotNull
    public IrStatement visitFunction(@NotNull IrFunction declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        IrStatement irStatementVisitFunction = super.visitFunction(declaration);
        copyMetadataFrom((IrElement) irStatementVisitFunction, (IrMetadataSourceOwner) declaration);
        return irStatementVisitFunction;
    }

    @NotNull
    /* JADX INFO: renamed from: visitCall, reason: merged with bridge method [inline-methods] */
    public IrCall m134visitCall(@NotNull IrCall expression) {
        IrType type;
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrSimpleFunction owner = expression.getSymbol().getOwner();
        IrSimpleFunction irSimpleFunction = owner instanceof IrSimpleFunction ? owner : null;
        IrClass parentClassOrNull = irSimpleFunction != null ? IrUtilsKt.getParentClassOrNull((IrDeclaration) irSimpleFunction) : null;
        if (parentClassOrNull != null && Intrinsics.areEqual(irSimpleFunction.getOrigin(), IrDeclarationOrigin.FAKE_OVERRIDE.INSTANCE) && IrTypeUtilsKt.isFunction(IrUtilsKt.getDefaultType(parentClassOrNull))) {
            IrExpression dispatchReceiver = expression.getDispatchReceiver();
            if ((dispatchReceiver == null || (type = dispatchReceiver.getType()) == null || !isComposable(type)) ? false : true) {
                int size = parentClassOrNull.getTypeParameters().size() - 1;
                IrDeclarationParent irDeclarationParent = (IrClass) AbstractComposeLoweringKt.function(this.context, ComposableFunctionBodyTransformerKt.changedParamCount(size, 0) + size + 1).getOwner();
                for (Object obj : IrUtilsKt.getFunctions(irDeclarationParent)) {
                    IrSimpleFunction irSimpleFunction2 = (IrSimpleFunction) obj;
                    if (Intrinsics.areEqual(irSimpleFunction2.getName(), irSimpleFunction.getName())) {
                        Object obj2 = obj;
                        if (Intrinsics.areEqual(this.symbolRemapper.getReferencedSimpleFunction(irSimpleFunction2.getSymbol()), irSimpleFunction2.getSymbol())) {
                            this.symbolRemapper.visitSimpleFunction(irSimpleFunction2);
                            IrFunction irFunctionVisitSimpleFunction = super.visitSimpleFunction(irSimpleFunction2);
                            List overriddenSymbols = irSimpleFunction.getOverriddenSymbols();
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(overriddenSymbols, 10));
                            Iterator it = overriddenSymbols.iterator();
                            while (it.hasNext()) {
                                arrayList.add((IrSimpleFunctionSymbol) it.next());
                            }
                            irFunctionVisitSimpleFunction.setOverriddenSymbols(arrayList);
                            irFunctionVisitSimpleFunction.setDispatchReceiverParameter(irSimpleFunction.getDispatchReceiverParameter());
                            irFunctionVisitSimpleFunction.setExtensionReceiverParameter(irSimpleFunction.getExtensionReceiverParameter());
                            for (IrValueParameter irValueParameter : irSimpleFunction2.getValueParameters()) {
                                String identifier = irValueParameter.getName().getIdentifier();
                                Intrinsics.checkNotNullExpressionValue(identifier, "p.name.identifier");
                                DeclarationBuildersKt.addValueParameter$default(irFunctionVisitSimpleFunction, identifier, irValueParameter.getType(), (IrDeclarationOrigin) null, 4, (Object) null);
                            }
                            PatchDeclarationParentsKt.patchDeclarationParents((IrElement) irFunctionVisitSimpleFunction, irDeclarationParent);
                            irFunctionVisitSimpleFunction.getBody();
                            obj2 = irFunctionVisitSimpleFunction;
                        }
                        IrCall irCallShallowCopyCall = shallowCopyCall(expression, this.symbolRemapper.getReferencedSimpleFunction(((IrSimpleFunction) obj2).getSymbol()));
                        IrMemberAccessExpression<?> irMemberAccessExpression = (IrMemberAccessExpression) irCallShallowCopyCall;
                        IrMemberAccessExpression<?> irMemberAccessExpression2 = (IrMemberAccessExpression) expression;
                        copyRemappedTypeArgumentsFrom(irMemberAccessExpression, irMemberAccessExpression2);
                        transformValueArguments(irMemberAccessExpression, irMemberAccessExpression2);
                        return irCallShallowCopyCall;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        }
        if (irSimpleFunction == null || !Intrinsics.areEqual(irSimpleFunction.getOrigin(), IrDeclarationOrigin.IR_EXTERNAL_DECLARATION_STUB.INSTANCE)) {
            if (irSimpleFunction == null || !needsComposableRemapping((IrFunction) irSimpleFunction)) {
                return super.visitCall(expression);
            }
            IrElement irElementVisitSimpleFunction = visitSimpleFunction(irSimpleFunction);
            List<IrSimpleFunctionSymbol> overriddenSymbols2 = irSimpleFunction.getOverriddenSymbols();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(overriddenSymbols2, 10));
            for (IrSimpleFunctionSymbol symbol : overriddenSymbols2) {
                if (symbol.isBound()) {
                    IrElement irElementVisitSimpleFunction2 = visitSimpleFunction((IrSimpleFunction) symbol.getOwner());
                    PatchDeclarationParentsKt.patchDeclarationParents(irElementVisitSimpleFunction2, symbol.getOwner().getParent());
                    symbol = irElementVisitSimpleFunction2.getSymbol();
                }
                arrayList2.add(symbol);
            }
            irElementVisitSimpleFunction.setOverriddenSymbols(arrayList2);
            PatchDeclarationParentsKt.patchDeclarationParents(irElementVisitSimpleFunction, irSimpleFunction.getParent());
            IrCall irCallShallowCopyCall2 = shallowCopyCall(expression, this.symbolRemapper.getReferencedSimpleFunction(irElementVisitSimpleFunction.getSymbol()));
            IrMemberAccessExpression<?> irMemberAccessExpression3 = (IrMemberAccessExpression) irCallShallowCopyCall2;
            IrMemberAccessExpression<?> irMemberAccessExpression4 = (IrMemberAccessExpression) expression;
            copyRemappedTypeArgumentsFrom(irMemberAccessExpression3, irMemberAccessExpression4);
            transformValueArguments(irMemberAccessExpression3, irMemberAccessExpression4);
            return irCallShallowCopyCall2;
        }
        if (irSimpleFunction.getCorrespondingPropertySymbol() != null) {
            IrPropertySymbol correspondingPropertySymbol = irSimpleFunction.getCorrespondingPropertySymbol();
            Intrinsics.checkNotNull(correspondingPropertySymbol);
            IrAttributeContainer irAttributeContainer = (IrProperty) correspondingPropertySymbol.getOwner();
            if (!Intrinsics.areEqual(irAttributeContainer.getOrigin(), IrDeclarationOrigin.IR_EXTERNAL_JAVA_DECLARATION_STUB.INSTANCE)) {
                IrSimpleFunction getter = irAttributeContainer.getGetter();
                if ((getter != null && needsComposableRemapping((IrFunction) getter)) && Intrinsics.areEqual(this.symbolRemapper.getReferencedProperty(irAttributeContainer.getSymbol()), irAttributeContainer.getSymbol())) {
                    this.symbolRemapper.visitProperty(irAttributeContainer);
                    IrAttributeContainer irAttributeContainerVisitProperty = visitProperty((IrProperty) irAttributeContainer);
                    IrSimpleFunction getter2 = irAttributeContainerVisitProperty.getGetter();
                    if (getter2 != null) {
                        getter2.setCorrespondingPropertySymbol(irAttributeContainerVisitProperty.getSymbol());
                    }
                    IrSimpleFunction setter = irAttributeContainerVisitProperty.getSetter();
                    if (setter != null) {
                        setter.setCorrespondingPropertySymbol(irAttributeContainerVisitProperty.getSymbol());
                    }
                    PatchDeclarationParentsKt.patchDeclarationParents((IrElement) irAttributeContainerVisitProperty, irSimpleFunction.getParent());
                    IrDeclarationsKt.copyAttributes(irAttributeContainerVisitProperty, irAttributeContainer);
                }
            }
        } else if (needsComposableRemapping((IrFunction) irSimpleFunction) && Intrinsics.areEqual(this.symbolRemapper.getReferencedSimpleFunction(irSimpleFunction.getSymbol()), irSimpleFunction.getSymbol())) {
            this.symbolRemapper.visitSimpleFunction(irSimpleFunction);
            IrElement irElementVisitSimpleFunction3 = visitSimpleFunction(irSimpleFunction);
            irElementVisitSimpleFunction3.setCorrespondingPropertySymbol((IrPropertySymbol) null);
            PatchDeclarationParentsKt.patchDeclarationParents(irElementVisitSimpleFunction3, irSimpleFunction.getParent());
        }
        IrCall irCallShallowCopyCall3 = shallowCopyCall(expression, this.symbolRemapper.getReferencedSimpleFunction(irSimpleFunction.getSymbol()));
        IrMemberAccessExpression<?> irMemberAccessExpression5 = (IrMemberAccessExpression) irCallShallowCopyCall3;
        IrMemberAccessExpression<?> irMemberAccessExpression6 = (IrMemberAccessExpression) expression;
        copyRemappedTypeArgumentsFrom(irMemberAccessExpression5, irMemberAccessExpression6);
        transformValueArguments(irMemberAccessExpression5, irMemberAccessExpression6);
        return irCallShallowCopyCall3;
    }

    @NotNull
    public IrClass visitClass(@NotNull IrClass declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        IrClass irClassVisitClass = super.visitClass(declaration);
        copyMetadataFrom((IrElement) irClassVisitClass, (IrMetadataSourceOwner) declaration);
        return irClassVisitClass;
    }

    @NotNull
    public IrConstructor visitConstructor(@NotNull IrConstructor declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        IrConstructor irConstructorVisitConstructor = super.visitConstructor(declaration);
        copyMetadataFrom((IrElement) irConstructorVisitConstructor, (IrMetadataSourceOwner) declaration);
        return irConstructorVisitConstructor;
    }

    @NotNull
    /* JADX INFO: renamed from: visitConstructorCall, reason: merged with bridge method [inline-methods] */
    public IrConstructorCall m137visitConstructorCall(@NotNull IrConstructorCall expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        if (!expression.getSymbol().isBound()) {
            IrPluginContextImpl irPluginContextImpl = this.context;
            Intrinsics.checkNotNull(irPluginContextImpl, "null cannot be cast to non-null type org.jetbrains.kotlin.backend.common.extensions.IrPluginContextImpl");
            irPluginContextImpl.getLinker().getDeclaration(expression.getSymbol());
        }
        IrConstructor owner = expression.getSymbol().getOwner();
        IrConstructor irConstructor = owner instanceof IrConstructor ? owner : null;
        if (irConstructor == null || !Intrinsics.areEqual(irConstructor.getOrigin(), IrDeclarationOrigin.IR_EXTERNAL_DECLARATION_STUB.INSTANCE) || !needsComposableRemapping((IrFunction) irConstructor)) {
            return super.visitConstructorCall(expression);
        }
        if (Intrinsics.areEqual(this.symbolRemapper.getReferencedConstructor(irConstructor.getSymbol()), irConstructor.getSymbol())) {
            this.symbolRemapper.visitConstructor(irConstructor);
            PatchDeclarationParentsKt.patchDeclarationParents(super.visitConstructor(irConstructor), irConstructor.getParent());
        }
        IrAttributeContainer irConstructorCallImpl = new IrConstructorCallImpl(expression.getStartOffset(), expression.getEndOffset(), remapType(expression.getType()), this.symbolRemapper.getReferencedConstructor(irConstructor.getSymbol()), expression.getTypeArgumentsCount(), expression.getConstructorTypeArgumentsCount(), expression.getValueArgumentsCount(), mapStatementOrigin(expression.getOrigin()), (SourceElement) null, PSKKeyManager.MAX_KEY_LENGTH_BYTES, (DefaultConstructorMarker) null);
        IrMemberAccessExpression<?> irMemberAccessExpression = (IrMemberAccessExpression) irConstructorCallImpl;
        IrMemberAccessExpression<?> irMemberAccessExpression2 = (IrMemberAccessExpression) expression;
        copyRemappedTypeArgumentsFrom(irMemberAccessExpression, irMemberAccessExpression2);
        transformValueArguments(irMemberAccessExpression, irMemberAccessExpression2);
        return IrDeclarationsKt.copyAttributes(irConstructorCallImpl, (IrAttributeContainer) expression);
    }

    @NotNull
    public IrField visitField(@NotNull IrField declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        IrField irFieldVisitField = super.visitField(declaration);
        irFieldVisitField.setMetadata(declaration.getMetadata());
        return irFieldVisitField;
    }

    @NotNull
    public IrProperty visitProperty(@NotNull IrProperty declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        IrAttributeContainer irAttributeContainerVisitProperty = super.visitProperty(declaration);
        copyMetadataFrom((IrElement) irAttributeContainerVisitProperty, (IrMetadataSourceOwner) declaration);
        IrDeclarationsKt.copyAttributes(irAttributeContainerVisitProperty, (IrAttributeContainer) declaration);
        return irAttributeContainerVisitProperty;
    }

    @NotNull
    public IrSimpleFunction visitSimpleFunction(@NotNull IrSimpleFunction declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        if (isRemappedAndBound(declaration.getSymbol())) {
            return this.symbolRemapper.getReferencedSimpleFunction(declaration.getSymbol()).getOwner();
        }
        if (isBoundButNotRemapped(declaration.getSymbol())) {
            this.symbolRemapper.visitSimpleFunction(declaration);
        }
        IrSimpleFunction irSimpleFunctionVisitSimpleFunction = super.visitSimpleFunction(declaration);
        irSimpleFunctionVisitSimpleFunction.setCorrespondingPropertySymbol(declaration.getCorrespondingPropertySymbol());
        copyMetadataFrom((IrElement) irSimpleFunctionVisitSimpleFunction, (IrMetadataSourceOwner) declaration);
        return irSimpleFunctionVisitSimpleFunction;
    }

    @NotNull
    public IrWhen visitWhen(@NotNull IrWhen expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        if (!(expression instanceof IrIfThenElseImpl)) {
            return super.visitWhen(expression);
        }
        IrAttributeContainer irIfThenElseImpl = new IrIfThenElseImpl(expression.getStartOffset(), expression.getEndOffset(), remapType(expression.getType()), mapStatementOrigin(expression.getOrigin()));
        List branches = expression.getBranches();
        List branches2 = irIfThenElseImpl.getBranches();
        Iterator it = branches.iterator();
        while (it.hasNext()) {
            IrBranch irBranchTransform = ((IrBranch) it.next()).transform((IrElementTransformer) this, (Object) null);
            if (irBranchTransform == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrBranch");
            }
            branches2.add((IrElement) irBranchTransform);
        }
        return IrDeclarationsKt.copyAttributes(irIfThenElseImpl, (IrAttributeContainer) expression);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepCopyIrTreeWithSymbolsPreservingMetadata(@NotNull IrPluginContext context, @NotNull DeepCopySymbolRemapper symbolRemapper, @NotNull TypeRemapper typeRemapper, @NotNull SymbolRenamer symbolRenamer) {
        super((SymbolRemapper) symbolRemapper, typeRemapper, symbolRenamer);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(symbolRemapper, "symbolRemapper");
        Intrinsics.checkNotNullParameter(typeRemapper, "typeRemapper");
        Intrinsics.checkNotNullParameter(symbolRenamer, "symbolRenamer");
        this.context = context;
        this.symbolRemapper = symbolRemapper;
    }

    private final boolean needsComposableRemapping(IrType type) {
        boolean z;
        if (type == null || !(type instanceof IrSimpleType)) {
            return false;
        }
        if (isComposable(type)) {
            return true;
        }
        List arguments = ((IrSimpleType) type).getArguments();
        if ((arguments instanceof Collection) && arguments.isEmpty()) {
            z = false;
        } else {
            Iterator it = arguments.iterator();
            while (it.hasNext()) {
                if (needsComposableRemapping(IrTypesKt.getTypeOrNull((IrTypeArgument) it.next()))) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }
}
