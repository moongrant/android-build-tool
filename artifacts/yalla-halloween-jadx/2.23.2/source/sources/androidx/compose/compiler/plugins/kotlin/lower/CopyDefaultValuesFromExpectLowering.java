package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import androidx.compose.compiler.plugins.kotlin.ComposeFqNamesKt;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.descriptors.CallableDescriptor;
import org.jetbrains.kotlin.descriptors.ClassDescriptor;
import org.jetbrains.kotlin.descriptors.DeclarationDescriptor;
import org.jetbrains.kotlin.descriptors.FunctionDescriptor;
import org.jetbrains.kotlin.descriptors.MemberDescriptor;
import org.jetbrains.kotlin.descriptors.PropertyAccessorDescriptor;
import org.jetbrains.kotlin.descriptors.PropertyDescriptor;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrEnumEntry;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.declarations.IrProperty;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrTypeParameter;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.expressions.IrExpressionBody;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrClassifierSymbol;
import org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol;
import org.jetbrains.kotlin.ir.symbols.IrEnumEntrySymbol;
import org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.IrPropertySymbol;
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.IrTypeParameterSymbol;
import org.jetbrains.kotlin.ir.symbols.IrValueParameterSymbol;
import org.jetbrains.kotlin.ir.symbols.IrValueSymbol;
import org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.DeepCopyTypeRemapper;
import org.jetbrains.kotlin.ir.util.DescriptorsRemapper;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.util.PatchDeclarationParentsKt;
import org.jetbrains.kotlin.ir.util.ReferenceSymbolTable;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt;
import org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid;
import org.jetbrains.kotlin.ir.visitors.IrVisitorsKt;
import org.jetbrains.kotlin.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.kotlin.resolve.multiplatform.ExpectedActualResolverKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\u0019\u001a\u0002H\u001a\"\n\b\u0000\u0010\u001a\u0018\u0001*\u00020\u001b*\u0002H\u001aH\u0082\b¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u0002H\u001a\"\n\b\u0000\u0010\u001a\u0018\u0001*\u00020\u000b*\u0002H\u001aH\u0082\b¢\u0006\u0002\u0010\u001eJ\f\u0010\u001d\u001a\u00020\u001f*\u00020\u001fH\u0002J\f\u0010\u001d\u001a\u00020 *\u00020 H\u0002J\f\u0010\u001d\u001a\u00020!*\u00020!H\u0002J\f\u0010\"\u001a\u00020#*\u00020#H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/CopyDefaultValuesFromExpectLowering;", "Landroidx/compose/compiler/plugins/kotlin/lower/ModuleLoweringPass;", "Lorg/jetbrains/kotlin/ir/visitors/IrElementTransformerVoid;", "pluginContext", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;)V", "symbolTable", "Lorg/jetbrains/kotlin/ir/util/ReferenceSymbolTable;", "isApplicable", "", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "lower", "", "module", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "remapExpectTypeParameter", "Lorg/jetbrains/kotlin/ir/declarations/IrTypeParameter;", "symbol", "Lorg/jetbrains/kotlin/ir/symbols/IrTypeParameterSymbol;", "remapExpectValue", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "Lorg/jetbrains/kotlin/ir/symbols/IrValueSymbol;", "visitFunction", "Lorg/jetbrains/kotlin/ir/IrStatement;", "findActualForExpect", "T", "Lorg/jetbrains/kotlin/descriptors/MemberDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/MemberDescriptor;)Lorg/jetbrains/kotlin/descriptors/MemberDescriptor;", "findActualForExpected", "(Lorg/jetbrains/kotlin/ir/declarations/IrFunction;)Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "Lorg/jetbrains/kotlin/ir/declarations/IrEnumEntry;", "Lorg/jetbrains/kotlin/ir/declarations/IrProperty;", "remapExpectValueSymbols", "Lorg/jetbrains/kotlin/ir/expressions/IrExpressionBody;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCopyDefaultValuesFromExpectLowering.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyDefaultValuesFromExpectLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/CopyDefaultValuesFromExpectLowering\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,270:1\n125#1:274\n137#1,2:275\n137#1,2:280\n137#1,2:282\n137#1,2:284\n137#1,2:286\n125#1:288\n137#1,2:289\n125#1:291\n137#1,2:292\n125#1:294\n137#1,2:295\n125#1:297\n137#1,2:298\n1747#2,3:271\n1864#2,3:277\n*S KotlinDebug\n*F\n+ 1 CopyDefaultValuesFromExpectLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/CopyDefaultValuesFromExpectLowering\n*L\n102#1:274\n102#1:275,2\n125#1:280,2\n128#1:282,2\n131#1:284,2\n134#1:286,2\n227#1:288\n227#1:289,2\n255#1:291\n255#1:292,2\n258#1:294\n258#1:295,2\n262#1:297\n262#1:298,2\n90#1:271,3\n104#1:277,3\n*E\n"})
public final class CopyDefaultValuesFromExpectLowering extends IrElementTransformerVoid implements ModuleLoweringPass {

    @NotNull
    private final ReferenceSymbolTable symbolTable;

    @Metadata(d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"androidx/compose/compiler/plugins/kotlin/lower/CopyDefaultValuesFromExpectLowering$remapExpectValueSymbols$SymbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "(Landroidx/compose/compiler/plugins/kotlin/lower/CopyDefaultValuesFromExpectLowering;)V", "getReferencedClass", "Lorg/jetbrains/kotlin/ir/symbols/IrClassSymbol;", "symbol", "getReferencedClassOrNull", "getReferencedClassifier", "Lorg/jetbrains/kotlin/ir/symbols/IrClassifierSymbol;", "getReferencedConstructor", "Lorg/jetbrains/kotlin/ir/symbols/IrConstructorSymbol;", "getReferencedEnumEntry", "Lorg/jetbrains/kotlin/ir/symbols/IrEnumEntrySymbol;", "getReferencedFunction", "Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;", "getReferencedProperty", "Lorg/jetbrains/kotlin/ir/symbols/IrPropertySymbol;", "getReferencedSimpleFunction", "Lorg/jetbrains/kotlin/ir/symbols/IrSimpleFunctionSymbol;", "getReferencedValue", "Lorg/jetbrains/kotlin/ir/symbols/IrValueSymbol;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCopyDefaultValuesFromExpectLowering.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyDefaultValuesFromExpectLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/CopyDefaultValuesFromExpectLowering$remapExpectValueSymbols$SymbolRemapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CopyDefaultValuesFromExpectLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/CopyDefaultValuesFromExpectLowering\n*L\n1#1,270:1\n1#2:271\n125#3:272\n137#3,2:273\n125#3:275\n137#3,2:276\n137#3,2:278\n*S KotlinDebug\n*F\n+ 1 CopyDefaultValuesFromExpectLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/CopyDefaultValuesFromExpectLowering$remapExpectValueSymbols$SymbolRemapper\n*L\n160#1:272\n160#1:273,2\n171#1:275\n171#1:276,2\n175#1:278,2\n*E\n"})
    public static final class SymbolRemapper extends DeepCopySymbolRemapper {
        public SymbolRemapper() {
            super((DescriptorsRemapper) null, 1, (DefaultConstructorMarker) null);
        }

        @NotNull
        public IrClassSymbol getReferencedClass(@NotNull IrClassSymbol symbol) {
            return symbol.getDescriptor().isExpect() ? CopyDefaultValuesFromExpectLowering.this.findActualForExpected(symbol.getOwner()).getSymbol() : super.getReferencedClass(symbol);
        }

        @Nullable
        public IrClassSymbol getReferencedClassOrNull(@Nullable IrClassSymbol symbol) {
            if (symbol != null) {
                return getReferencedClass(symbol);
            }
            return null;
        }

        @NotNull
        public IrClassifierSymbol getReferencedClassifier(@NotNull IrClassifierSymbol symbol) {
            if (symbol instanceof IrClassSymbol) {
                return getReferencedClass((IrClassSymbol) symbol);
            }
            if (symbol instanceof IrTypeParameterSymbol) {
                return CopyDefaultValuesFromExpectLowering.this.remapExpectTypeParameter((IrTypeParameterSymbol) symbol).getSymbol();
            }
            throw new IllegalStateException(("Unexpected symbol " + symbol + ZegoConstants.ZegoVideoDataAuxPublishingStream + symbol.getDescriptor()).toString());
        }

        @NotNull
        public IrConstructorSymbol getReferencedConstructor(@NotNull IrConstructorSymbol symbol) {
            if (!symbol.getDescriptor().isExpect()) {
                return super.getReferencedConstructor(symbol);
            }
            CopyDefaultValuesFromExpectLowering copyDefaultValuesFromExpectLowering = CopyDefaultValuesFromExpectLowering.this;
            IrFunction owner = symbol.getOwner();
            ReferenceSymbolTable referenceSymbolTable = copyDefaultValuesFromExpectLowering.symbolTable;
            DeclarationDescriptor declarationDescriptor = (MemberDescriptor) owner.getDescriptor();
            if (!declarationDescriptor.isExpect()) {
                throw new IllegalStateException(declarationDescriptor.toString());
            }
            CallableDescriptor callableDescriptor = (MemberDescriptor) CollectionsKt.singleOrNull(ExpectedActualResolverKt.findCompatibleActualsForExpected$default(declarationDescriptor, DescriptorUtilsKt.getModule(declarationDescriptor), (Function1) null, 2, (Object) null));
            if (callableDescriptor == null) {
                throw new IllegalStateException(declarationDescriptor.toString());
            }
            IrConstructor owner2 = IrUtilsKt.referenceFunction(referenceSymbolTable, (MemberDescriptor) ((FunctionDescriptor) callableDescriptor)).getOwner();
            if (owner2 != null) {
                return ((IrFunction) owner2).getSymbol();
            }
            throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrConstructor");
        }

        @NotNull
        public IrEnumEntrySymbol getReferencedEnumEntry(@NotNull IrEnumEntrySymbol symbol) {
            return symbol.getDescriptor().isExpect() ? CopyDefaultValuesFromExpectLowering.this.findActualForExpected(symbol.getOwner()).getSymbol() : super.getReferencedEnumEntry(symbol);
        }

        @NotNull
        public IrFunctionSymbol getReferencedFunction(@NotNull IrFunctionSymbol symbol) {
            if (symbol instanceof IrSimpleFunctionSymbol) {
                return getReferencedSimpleFunction((IrSimpleFunctionSymbol) symbol);
            }
            if (symbol instanceof IrConstructorSymbol) {
                return getReferencedConstructor((IrConstructorSymbol) symbol);
            }
            throw new IllegalStateException(("Unexpected symbol " + symbol + ZegoConstants.ZegoVideoDataAuxPublishingStream + symbol.getDescriptor()).toString());
        }

        @NotNull
        public IrPropertySymbol getReferencedProperty(@NotNull IrPropertySymbol symbol) {
            return symbol.getDescriptor().isExpect() ? CopyDefaultValuesFromExpectLowering.this.findActualForExpected(symbol.getOwner()).getSymbol() : super.getReferencedProperty(symbol);
        }

        @NotNull
        public IrSimpleFunctionSymbol getReferencedSimpleFunction(@NotNull IrSimpleFunctionSymbol symbol) {
            PropertyAccessorDescriptor propertyAccessorDescriptor;
            if (symbol.getDescriptor().isExpect()) {
                CopyDefaultValuesFromExpectLowering copyDefaultValuesFromExpectLowering = CopyDefaultValuesFromExpectLowering.this;
                IrFunction owner = symbol.getOwner();
                ReferenceSymbolTable referenceSymbolTable = copyDefaultValuesFromExpectLowering.symbolTable;
                DeclarationDescriptor declarationDescriptor = (MemberDescriptor) owner.getDescriptor();
                if (!declarationDescriptor.isExpect()) {
                    throw new IllegalStateException(declarationDescriptor.toString());
                }
                CallableDescriptor callableDescriptor = (MemberDescriptor) CollectionsKt.singleOrNull(ExpectedActualResolverKt.findCompatibleActualsForExpected$default(declarationDescriptor, DescriptorUtilsKt.getModule(declarationDescriptor), (Function1) null, 2, (Object) null));
                if (callableDescriptor == null) {
                    throw new IllegalStateException(declarationDescriptor.toString());
                }
                IrSimpleFunction owner2 = IrUtilsKt.referenceFunction(referenceSymbolTable, (MemberDescriptor) ((FunctionDescriptor) callableDescriptor)).getOwner();
                if (owner2 != null) {
                    return ((IrFunction) owner2).getSymbol();
                }
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrSimpleFunction");
            }
            if (!DescriptorUtilsKt.getPropertyIfAccessor(symbol.getDescriptor()).isExpect()) {
                return super.getReferencedSimpleFunction(symbol);
            }
            IrPropertySymbol correspondingPropertySymbol = symbol.getOwner().getCorrespondingPropertySymbol();
            Intrinsics.checkNotNull(correspondingPropertySymbol);
            IrProperty owner3 = correspondingPropertySymbol.getOwner();
            DeclarationDescriptor declarationDescriptor2 = (MemberDescriptor) owner3.getDescriptor();
            if (!declarationDescriptor2.isExpect()) {
                throw new IllegalStateException(declarationDescriptor2.toString());
            }
            PropertyDescriptor propertyDescriptor = (MemberDescriptor) CollectionsKt.singleOrNull(ExpectedActualResolverKt.findCompatibleActualsForExpected$default(declarationDescriptor2, DescriptorUtilsKt.getModule(declarationDescriptor2), (Function1) null, 2, (Object) null));
            if (propertyDescriptor == null) {
                throw new IllegalStateException(declarationDescriptor2.toString());
            }
            PropertyDescriptor propertyDescriptor2 = (MemberDescriptor) propertyDescriptor;
            IrSimpleFunction owner4 = symbol.getOwner();
            if (Intrinsics.areEqual(owner4, owner3.getGetter())) {
                PropertyAccessorDescriptor getter = propertyDescriptor2.getGetter();
                Intrinsics.checkNotNull(getter);
                propertyAccessorDescriptor = getter;
            } else {
                if (!Intrinsics.areEqual(owner4, owner3.getSetter())) {
                    throw new IllegalStateException(("Unexpected accessor of " + symbol + ZegoConstants.ZegoVideoDataAuxPublishingStream + symbol.getDescriptor()).toString());
                }
                PropertyAccessorDescriptor setter = propertyDescriptor2.getSetter();
                Intrinsics.checkNotNull(setter);
                propertyAccessorDescriptor = setter;
            }
            IrSimpleFunctionSymbol irSimpleFunctionSymbolReferenceFunction = IrUtilsKt.referenceFunction(CopyDefaultValuesFromExpectLowering.this.symbolTable, (CallableDescriptor) propertyAccessorDescriptor);
            Intrinsics.checkNotNull(irSimpleFunctionSymbolReferenceFunction, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol");
            return irSimpleFunctionSymbolReferenceFunction;
        }

        @NotNull
        public IrValueSymbol getReferencedValue(@NotNull IrValueSymbol symbol) {
            IrValueSymbol symbol2;
            IrValueParameter irValueParameterRemapExpectValue = CopyDefaultValuesFromExpectLowering.this.remapExpectValue(symbol);
            return (irValueParameterRemapExpectValue == null || (symbol2 = irValueParameterRemapExpectValue.getSymbol()) == null) ? super.getReferencedValue(symbol) : symbol2;
        }
    }

    public CopyDefaultValuesFromExpectLowering(@NotNull IrPluginContext irPluginContext) {
        this.symbolTable = irPluginContext.getSymbolTable();
    }

    private final /* synthetic */ <T extends MemberDescriptor> T findActualForExpect(T t) {
        if (!t.isExpect()) {
            throw new IllegalStateException(t.toString());
        }
        T t2 = (T) CollectionsKt.singleOrNull(ExpectedActualResolverKt.findCompatibleActualsForExpected$default(t, DescriptorUtilsKt.getModule((DeclarationDescriptor) t), (Function1) null, 2, (Object) null));
        if (t2 == null) {
            throw new IllegalStateException(t.toString());
        }
        Intrinsics.reifiedOperationMarker(1, "T");
        return t2;
    }

    private final /* synthetic */ <T extends IrFunction> T findActualForExpected(T t) {
        ReferenceSymbolTable referenceSymbolTable = this.symbolTable;
        DeclarationDescriptor declarationDescriptor = (MemberDescriptor) t.getDescriptor();
        if (!declarationDescriptor.isExpect()) {
            throw new IllegalStateException(declarationDescriptor.toString());
        }
        CallableDescriptor callableDescriptor = (MemberDescriptor) CollectionsKt.singleOrNull(ExpectedActualResolverKt.findCompatibleActualsForExpected$default(declarationDescriptor, DescriptorUtilsKt.getModule(declarationDescriptor), (Function1) null, 2, (Object) null));
        if (callableDescriptor == null) {
            throw new IllegalStateException(declarationDescriptor.toString());
        }
        T t2 = (T) IrUtilsKt.referenceFunction(referenceSymbolTable, (MemberDescriptor) ((FunctionDescriptor) callableDescriptor)).getOwner();
        Intrinsics.reifiedOperationMarker(1, "T");
        return t2;
    }

    private final boolean isApplicable(IrFunction declaration) {
        boolean z;
        if (ComposeFqNamesKt.hasComposableAnnotation((IrAnnotationContainer) declaration)) {
            return true;
        }
        List valueParameters = declaration.getValueParameters();
        if ((valueParameters instanceof Collection) && valueParameters.isEmpty()) {
            z = false;
        } else {
            Iterator it = valueParameters.iterator();
            while (it.hasNext()) {
                if (IrUtilsKt.hasAnnotation(((IrValueParameter) it.next()).getType(), ComposeFqNames.INSTANCE.getComposable())) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrTypeParameter remapExpectTypeParameter(IrTypeParameterSymbol symbol) {
        IrTypeParameter owner = symbol.getOwner();
        IrFunction parent = owner.getParent();
        if (parent instanceof IrClass) {
            IrClass irClass = (IrClass) parent;
            return !irClass.getDescriptor().isExpect() ? owner : (IrTypeParameter) findActualForExpected(irClass).getTypeParameters().get(owner.getIndex());
        }
        if (!(parent instanceof IrFunction)) {
            throw new IllegalStateException(parent.toString());
        }
        IrFunction irFunction = parent;
        if (!irFunction.getDescriptor().isExpect()) {
            return owner;
        }
        ReferenceSymbolTable referenceSymbolTable = this.symbolTable;
        DeclarationDescriptor declarationDescriptor = (MemberDescriptor) irFunction.getDescriptor();
        if (!declarationDescriptor.isExpect()) {
            throw new IllegalStateException(declarationDescriptor.toString());
        }
        CallableDescriptor callableDescriptor = (MemberDescriptor) CollectionsKt.singleOrNull(ExpectedActualResolverKt.findCompatibleActualsForExpected$default(declarationDescriptor, DescriptorUtilsKt.getModule(declarationDescriptor), (Function1) null, 2, (Object) null));
        if (callableDescriptor == null) {
            throw new IllegalStateException(declarationDescriptor.toString());
        }
        IrFunction owner2 = IrUtilsKt.referenceFunction(referenceSymbolTable, (MemberDescriptor) ((FunctionDescriptor) callableDescriptor)).getOwner();
        if (owner2 != null) {
            return (IrTypeParameter) owner2.getTypeParameters().get(owner.getIndex());
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrFunction");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrValueParameter remapExpectValue(IrValueSymbol symbol) {
        if (!(symbol instanceof IrValueParameterSymbol)) {
            return null;
        }
        IrValueParameter owner = ((IrValueParameterSymbol) symbol).getOwner();
        IrFunction parent = owner.getParent();
        if (parent instanceof IrClass) {
            IrClass irClass = (IrClass) parent;
            if (!irClass.getDescriptor().isExpect()) {
                return null;
            }
            Intrinsics.areEqual(owner, irClass.getThisReceiver());
            IrValueParameter thisReceiver = findActualForExpected(irClass).getThisReceiver();
            Intrinsics.checkNotNull(thisReceiver);
            return thisReceiver;
        }
        if (!(parent instanceof IrFunction)) {
            throw new IllegalStateException(parent.toString());
        }
        IrFunction irFunction = parent;
        if (!irFunction.getDescriptor().isExpect()) {
            return null;
        }
        if (Intrinsics.areEqual(owner, irFunction.getDispatchReceiverParameter())) {
            ReferenceSymbolTable referenceSymbolTable = this.symbolTable;
            DeclarationDescriptor declarationDescriptor = (MemberDescriptor) irFunction.getDescriptor();
            if (!declarationDescriptor.isExpect()) {
                throw new IllegalStateException(declarationDescriptor.toString());
            }
            CallableDescriptor callableDescriptor = (MemberDescriptor) CollectionsKt.singleOrNull(ExpectedActualResolverKt.findCompatibleActualsForExpected$default(declarationDescriptor, DescriptorUtilsKt.getModule(declarationDescriptor), (Function1) null, 2, (Object) null));
            if (callableDescriptor == null) {
                throw new IllegalStateException(declarationDescriptor.toString());
            }
            IrFunction owner2 = IrUtilsKt.referenceFunction(referenceSymbolTable, (MemberDescriptor) ((FunctionDescriptor) callableDescriptor)).getOwner();
            if (owner2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrFunction");
            }
            IrValueParameter dispatchReceiverParameter = owner2.getDispatchReceiverParameter();
            Intrinsics.checkNotNull(dispatchReceiverParameter);
            return dispatchReceiverParameter;
        }
        if (!Intrinsics.areEqual(owner, irFunction.getExtensionReceiverParameter())) {
            Intrinsics.areEqual(irFunction.getValueParameters().get(owner.getIndex()), owner);
            ReferenceSymbolTable referenceSymbolTable2 = this.symbolTable;
            DeclarationDescriptor declarationDescriptor2 = (MemberDescriptor) irFunction.getDescriptor();
            if (!declarationDescriptor2.isExpect()) {
                throw new IllegalStateException(declarationDescriptor2.toString());
            }
            CallableDescriptor callableDescriptor2 = (MemberDescriptor) CollectionsKt.singleOrNull(ExpectedActualResolverKt.findCompatibleActualsForExpected$default(declarationDescriptor2, DescriptorUtilsKt.getModule(declarationDescriptor2), (Function1) null, 2, (Object) null));
            if (callableDescriptor2 == null) {
                throw new IllegalStateException(declarationDescriptor2.toString());
            }
            IrFunction owner3 = IrUtilsKt.referenceFunction(referenceSymbolTable2, (MemberDescriptor) ((FunctionDescriptor) callableDescriptor2)).getOwner();
            if (owner3 != null) {
                return (IrValueParameter) owner3.getValueParameters().get(owner.getIndex());
            }
            throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrFunction");
        }
        ReferenceSymbolTable referenceSymbolTable3 = this.symbolTable;
        DeclarationDescriptor declarationDescriptor3 = (MemberDescriptor) irFunction.getDescriptor();
        if (!declarationDescriptor3.isExpect()) {
            throw new IllegalStateException(declarationDescriptor3.toString());
        }
        CallableDescriptor callableDescriptor3 = (MemberDescriptor) CollectionsKt.singleOrNull(ExpectedActualResolverKt.findCompatibleActualsForExpected$default(declarationDescriptor3, DescriptorUtilsKt.getModule(declarationDescriptor3), (Function1) null, 2, (Object) null));
        if (callableDescriptor3 == null) {
            throw new IllegalStateException(declarationDescriptor3.toString());
        }
        IrFunction owner4 = IrUtilsKt.referenceFunction(referenceSymbolTable3, (MemberDescriptor) ((FunctionDescriptor) callableDescriptor3)).getOwner();
        if (owner4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrFunction");
        }
        IrValueParameter extensionReceiverParameter = owner4.getExtensionReceiverParameter();
        Intrinsics.checkNotNull(extensionReceiverParameter);
        return extensionReceiverParameter;
    }

    private final IrExpressionBody remapExpectValueSymbols(IrExpressionBody irExpressionBody) {
        org.jetbrains.kotlin.ir.util.SymbolRemapper symbolRemapper = new SymbolRemapper();
        IrVisitorsKt.acceptVoid((IrElement) irExpressionBody, (IrElementVisitorVoid) symbolRemapper);
        org.jetbrains.kotlin.ir.util.SymbolRemapper symbolRemapper2 = symbolRemapper;
        return irExpressionBody.transform(new DeepCopyIrTreeWithSymbols(symbolRemapper2, new DeepCopyTypeRemapper(symbolRemapper2)), (Object) null);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.ModuleLoweringPass
    public void lower(@NotNull IrModuleFragment module) {
        IrElementTransformerVoidKt.transformChildrenVoid((IrElement) module, this);
    }

    @NotNull
    public IrStatement visitFunction(@NotNull IrFunction declaration) {
        IrFunction irFunctionVisitFunction = super.visitFunction(declaration);
        IrFunction irFunction = irFunctionVisitFunction instanceof IrFunction ? irFunctionVisitFunction : null;
        if (irFunction == null) {
            return (IrStatement) declaration;
        }
        if (!irFunction.isExpect() || !isApplicable(irFunction)) {
            return (IrStatement) irFunction;
        }
        ReferenceSymbolTable referenceSymbolTable = this.symbolTable;
        DeclarationDescriptor declarationDescriptor = (MemberDescriptor) irFunction.getDescriptor();
        if (!declarationDescriptor.isExpect()) {
            throw new IllegalStateException(declarationDescriptor.toString());
        }
        CallableDescriptor callableDescriptor = (MemberDescriptor) CollectionsKt.singleOrNull(ExpectedActualResolverKt.findCompatibleActualsForExpected$default(declarationDescriptor, DescriptorUtilsKt.getModule(declarationDescriptor), (Function1) null, 2, (Object) null));
        if (callableDescriptor == null) {
            throw new IllegalStateException(declarationDescriptor.toString());
        }
        IrDeclarationParent owner = IrUtilsKt.referenceFunction(referenceSymbolTable, (MemberDescriptor) ((FunctionDescriptor) callableDescriptor)).getOwner();
        if (owner == null) {
            throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrFunction");
        }
        int i = 0;
        for (Object obj : irFunction.getValueParameters()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            IrValueParameter irValueParameter = (IrValueParameter) obj;
            IrValueParameter irValueParameter2 = (IrValueParameter) owner.getValueParameters().get(i);
            IrExpressionBody defaultValue = irValueParameter.getDefaultValue();
            if (defaultValue != null) {
                irValueParameter2.setDefaultValue(PatchDeclarationParentsKt.patchDeclarationParents(remapExpectValueSymbols(defaultValue), owner));
                irValueParameter.setDefaultValue((IrExpressionBody) null);
            }
            i = i2;
        }
        return (IrStatement) irFunction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrProperty findActualForExpected(IrProperty irProperty) {
        ReferenceSymbolTable referenceSymbolTable = this.symbolTable;
        DeclarationDescriptor declarationDescriptor = (MemberDescriptor) irProperty.getDescriptor();
        if (declarationDescriptor.isExpect()) {
            PropertyDescriptor propertyDescriptor = (MemberDescriptor) CollectionsKt.singleOrNull(ExpectedActualResolverKt.findCompatibleActualsForExpected$default(declarationDescriptor, DescriptorUtilsKt.getModule(declarationDescriptor), (Function1) null, 2, (Object) null));
            if (propertyDescriptor != null) {
                return referenceSymbolTable.referenceProperty((MemberDescriptor) propertyDescriptor).getOwner();
            }
            throw new IllegalStateException(declarationDescriptor.toString());
        }
        throw new IllegalStateException(declarationDescriptor.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrClass findActualForExpected(IrClass irClass) {
        ReferenceSymbolTable referenceSymbolTable = this.symbolTable;
        DeclarationDescriptor declarationDescriptor = (MemberDescriptor) irClass.getDescriptor();
        if (declarationDescriptor.isExpect()) {
            ClassDescriptor classDescriptor = (MemberDescriptor) CollectionsKt.singleOrNull(ExpectedActualResolverKt.findCompatibleActualsForExpected$default(declarationDescriptor, DescriptorUtilsKt.getModule(declarationDescriptor), (Function1) null, 2, (Object) null));
            if (classDescriptor != null) {
                return referenceSymbolTable.referenceClass((MemberDescriptor) classDescriptor).getOwner();
            }
            throw new IllegalStateException(declarationDescriptor.toString());
        }
        throw new IllegalStateException(declarationDescriptor.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrEnumEntry findActualForExpected(IrEnumEntry irEnumEntry) {
        ReferenceSymbolTable referenceSymbolTable = this.symbolTable;
        DeclarationDescriptor declarationDescriptor = (MemberDescriptor) irEnumEntry.getDescriptor();
        if (declarationDescriptor.isExpect()) {
            ClassDescriptor classDescriptor = (MemberDescriptor) CollectionsKt.singleOrNull(ExpectedActualResolverKt.findCompatibleActualsForExpected$default(declarationDescriptor, DescriptorUtilsKt.getModule(declarationDescriptor), (Function1) null, 2, (Object) null));
            if (classDescriptor != null) {
                return referenceSymbolTable.referenceEnumEntry((MemberDescriptor) classDescriptor).getOwner();
            }
            throw new IllegalStateException(declarationDescriptor.toString());
        }
        throw new IllegalStateException(declarationDescriptor.toString());
    }
}
