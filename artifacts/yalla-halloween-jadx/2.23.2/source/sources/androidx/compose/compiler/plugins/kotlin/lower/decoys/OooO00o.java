package androidx.compose.compiler.plugins.kotlin.lower.decoys;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContextImpl;
import org.jetbrains.kotlin.descriptors.ModuleDescriptor;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationContainer;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.expressions.IrConst;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrVararg;
import org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl;
import org.jetbrains.kotlin.ir.interpreter.IrTreeBuildUtilsKt;
import org.jetbrains.kotlin.ir.linkage.IrDeserializer;
import org.jetbrains.kotlin.ir.symbols.IrClassifierSymbol;
import org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.IrSymbol;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypeAbbreviation;
import org.jetbrains.kotlin.ir.types.IrTypeArgument;
import org.jetbrains.kotlin.ir.types.impl.IrSimpleTypeImpl;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.IdSignature;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o {
    public static long OooO(DecoyTransformBase decoyTransformBase, IdSignature idSignature) {
        if (idSignature instanceof IdSignature.AccessorSignature) {
            Long id = ((IdSignature.AccessorSignature) idSignature).getAccessorSignature().getId();
            Intrinsics.checkNotNull(id);
            return id.longValue();
        }
        if (idSignature instanceof IdSignature.FileLocalSignature) {
            return ((IdSignature.FileLocalSignature) idSignature).getId();
        }
        if (idSignature instanceof IdSignature.ScopeLocalDeclaration) {
            return ((IdSignature.ScopeLocalDeclaration) idSignature).getId();
        }
        if (idSignature instanceof IdSignature.SpecialFakeOverrideSignature) {
            return OooO(decoyTransformBase, ((IdSignature.SpecialFakeOverrideSignature) idSignature).getMemberSignature());
        }
        if (idSignature instanceof IdSignature.LoweredDeclarationSignature) {
            throw new NotImplementedError(null, 1, null);
        }
        if (idSignature instanceof IdSignature.FileSignature) {
            throw new NotImplementedError(null, 1, null);
        }
        if (idSignature instanceof IdSignature.CommonSignature) {
            Long id2 = ((IdSignature.CommonSignature) idSignature).getId();
            Intrinsics.checkNotNull(id2);
            return id2.longValue();
        }
        if (idSignature instanceof IdSignature.CompositeSignature) {
            return OooO(decoyTransformBase, idSignature.nearestPublicSig());
        }
        if (idSignature instanceof IdSignature.LocalSignature) {
            return OooO(decoyTransformBase, idSignature);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static IrFunctionSymbol OooO00o(DecoyTransformBase decoyTransformBase, @NotNull IrFunction irFunction) {
        IrFunction irFunction2;
        List declarations;
        Object next;
        List declarations2;
        Object next2;
        IrFunction irFunction3;
        Long decoyImplementationId;
        String strOooO0oo = OooO0oo(decoyTransformBase, irFunction);
        long signatureId = decoyTransformBase.getSignatureId(irFunction);
        IrDeclarationContainer parent = irFunction.getParent();
        IrSimpleFunctionSymbol symbol = null;
        IrDeclarationContainer irDeclarationContainer = parent instanceof IrDeclarationContainer ? parent : null;
        if (irDeclarationContainer == null || (declarations2 = irDeclarationContainer.getDeclarations()) == null) {
            irFunction2 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : declarations2) {
                if (obj instanceof IrFunction) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                irFunction3 = (IrFunction) next2;
            } while (!(Intrinsics.areEqual(decoyTransformBase.getDecoyImplementationName(irFunction3), strOooO0oo) && (decoyImplementationId = decoyTransformBase.getDecoyImplementationId(irFunction3)) != null && decoyImplementationId.longValue() == signatureId));
            irFunction2 = (IrFunction) next2;
        }
        if (irFunction2 != null) {
            return irFunction2.getSymbol();
        }
        List listOooO0oO = OooO0oO(decoyTransformBase, irFunction);
        if (!(listOooO0oO.size() == 4)) {
            throw new IllegalArgumentException(o00O00OO.OooO00o("Could not find local implementation for ", strOooO0oo).toString());
        }
        IdSignature commonSignature = new IdSignature.CommonSignature((String) listOooO0oO.get(0), (String) listOooO0oO.get(1), StringsKt.toLongOrNull((String) listOooO0oO.get(2)), Long.parseLong((String) listOooO0oO.get(3)));
        IrPluginContextImpl context = decoyTransformBase.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type org.jetbrains.kotlin.backend.common.extensions.IrPluginContextImpl");
        IrDeserializer linker = context.getLinker();
        IrDeclaration irDeclaration = (IrDeclaration) irFunction;
        if (IrUtilsKt.isTopLevel(irDeclaration)) {
            IrSimpleFunctionSymbol irSimpleFunctionSymbolOooO0o = OooO0o(decoyTransformBase, linker, AdditionalIrUtilsKt.getModule(irDeclaration), commonSignature);
            symbol = (IrFunctionSymbol) (irSimpleFunctionSymbolOooO0o instanceof IrSimpleFunctionSymbol ? irSimpleFunctionSymbolOooO0o : null);
        } else {
            IrDeclarationContainer parent2 = irFunction.getParent();
            IrDeclarationContainer irDeclarationContainer2 = parent2 instanceof IrDeclarationContainer ? parent2 : null;
            if (irDeclarationContainer2 != null && (declarations = irDeclarationContainer2.getDeclarations()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : declarations) {
                    if (obj2 instanceof IrFunction) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(((IrFunction) next).getSymbol().getSignature(), commonSignature));
                IrFunction irFunction4 = (IrFunction) next;
                if (irFunction4 != null) {
                    symbol = irFunction4.getSymbol();
                }
            }
        }
        if (symbol != null) {
            return symbol;
        }
        throw new IllegalStateException(("Couldn't find implementation for " + irFunction.getName()).toString());
    }

    @Nullable
    public static Long OooO0O0(DecoyTransformBase decoyTransformBase, @NotNull IrFunction irFunction) {
        IrConstructorCall annotation = IrUtilsKt.getAnnotation((IrAnnotationContainer) irFunction, DecoyFqNames.INSTANCE.getDecoyImplementation());
        if (annotation == null) {
            return null;
        }
        IrConst valueArgument = annotation.getValueArgument(1);
        Intrinsics.checkNotNull(valueArgument, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrConst<kotlin.Long>");
        return (Long) valueArgument.getValue();
    }

    @Nullable
    public static String OooO0OO(DecoyTransformBase decoyTransformBase, @NotNull IrFunction irFunction) {
        IrConstructorCall annotation = IrUtilsKt.getAnnotation((IrAnnotationContainer) irFunction, DecoyFqNames.INSTANCE.getDecoyImplementation());
        if (annotation == null) {
            return null;
        }
        IrConst valueArgument = annotation.getValueArgument(0);
        Intrinsics.checkNotNull(valueArgument, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrConst<kotlin.String>");
        return (String) valueArgument.getValue();
    }

    public static long OooO0Oo(DecoyTransformBase decoyTransformBase, @NotNull IrFunction irFunction) {
        IdSignature signature = irFunction.getSymbol().getSignature();
        if (signature == null) {
            signature = decoyTransformBase.getSignatureBuilder().composeSignatureForDeclaration((IrDeclaration) irFunction, false);
        }
        return OooO(decoyTransformBase, signature);
    }

    public static IrSymbol OooO0o(DecoyTransformBase decoyTransformBase, IrDeserializer irDeserializer, ModuleDescriptor moduleDescriptor, IdSignature idSignature) {
        return irDeserializer.resolveBySignatureInModule(idSignature, IrDeserializer.TopLevelSymbolKind.FUNCTION_SYMBOL, moduleDescriptor.getName());
    }

    @NotNull
    public static IrExpression OooO0o0(DecoyTransformBase decoyTransformBase, @NotNull List list) {
        IrClassifierSymbol arrayClass = decoyTransformBase.getContext().getIrBuiltIns().getArrayClass();
        IrTypeArgument stringType = decoyTransformBase.getContext().getIrBuiltIns().getStringType();
        Intrinsics.checkNotNull(stringType, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.types.IrTypeArgument");
        IrType irSimpleTypeImpl = new IrSimpleTypeImpl(arrayClass, false, CollectionsKt.listOf(stringType), CollectionsKt.emptyList(), (IrTypeAbbreviation) null, 16, (DefaultConstructorMarker) null);
        IrType stringType2 = decoyTransformBase.getContext().getIrBuiltIns().getStringType();
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(IrTreeBuildUtilsKt.toIrConst$default((String) it.next(), decoyTransformBase.getContext().getIrBuiltIns().getStringType(), 0, 0, 6, (Object) null));
        }
        return new IrVarargImpl(-1, -1, irSimpleTypeImpl, stringType2, arrayList);
    }

    public static List OooO0oO(DecoyTransformBase decoyTransformBase, IrFunction irFunction) {
        IrConstructorCall annotation = IrUtilsKt.getAnnotation((IrAnnotationContainer) irFunction, DecoyFqNames.INSTANCE.getDecoy());
        Intrinsics.checkNotNull(annotation);
        IrVararg valueArgument = annotation.getValueArgument(1);
        Intrinsics.checkNotNull(valueArgument, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrVararg");
        List<IrConst> elements = valueArgument.getElements();
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(elements));
        for (IrConst irConst : elements) {
            Intrinsics.checkNotNull(irConst, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrConst<kotlin.String>");
            arrayList.add((String) irConst.getValue());
        }
        return arrayList;
    }

    public static String OooO0oo(DecoyTransformBase decoyTransformBase, IrFunction irFunction) {
        IrConstructorCall annotation = IrUtilsKt.getAnnotation((IrAnnotationContainer) irFunction, DecoyFqNames.INSTANCE.getDecoy());
        Intrinsics.checkNotNull(annotation);
        IrConst valueArgument = annotation.getValueArgument(0);
        Intrinsics.checkNotNull(valueArgument, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrConst<kotlin.String>");
        return (String) valueArgument.getValue();
    }
}
