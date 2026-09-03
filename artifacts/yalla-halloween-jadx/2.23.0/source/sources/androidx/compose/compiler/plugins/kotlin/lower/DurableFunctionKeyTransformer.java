package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.camera.core.impl.OooOOOO;
import androidx.compose.compiler.plugins.kotlin.ComposeClassIds;
import androidx.compose.compiler.plugins.kotlin.ModuleMetrics;
import androidx.compose.compiler.plugins.kotlin.WeakBindingTraceKt;
import androidx.compose.compiler.plugins.kotlin.analysis.ComposeWritableSlices;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder;
import org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException;
import org.jetbrains.kotlin.descriptors.ClassKind;
import org.jetbrains.kotlin.descriptors.DescriptorVisibilities;
import org.jetbrains.kotlin.descriptors.DescriptorVisibility;
import org.jetbrains.kotlin.descriptors.SourceElement;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.builders.ExpressionHelpersKt;
import org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder;
import org.jetbrains.kotlin.ir.builders.IrBuilderWithScope;
import org.jetbrains.kotlin.ir.builders.declarations.DeclarationBuildersKt;
import org.jetbrains.kotlin.ir.builders.declarations.IrClassBuilder;
import org.jetbrains.kotlin.ir.builders.declarations.IrFunctionBuilder;
import org.jetbrains.kotlin.ir.declarations.IrAttributeContainer;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationsKt;
import org.jetbrains.kotlin.ir.declarations.IrFactory;
import org.jetbrains.kotlin.ir.declarations.IrFile;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.expressions.impl.IrConstructorCallImpl;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrClassifierSymbol;
import org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt;
import org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils;
import org.jetbrains.kotlin.name.Name;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010#\u001a\u00020&H\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/DurableFunctionKeyTransformer;", "Landroidx/compose/compiler/plugins/kotlin/lower/DurableKeyTransformer;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;)V", "currentKeys", "", "Landroidx/compose/compiler/plugins/kotlin/lower/KeyInfo;", "getCurrentKeys", "()Ljava/util/List;", "setCurrentKeys", "(Ljava/util/List;)V", "keyMetaAnnotation", "Lorg/jetbrains/kotlin/ir/symbols/IrClassSymbol;", "metaClassAnnotation", "buildClass", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "filePath", "", "irKeyMetaAnnotation", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "key", "irMetaClassAnnotation", ShareInternalUtility.STAGING_PARAM, "realizeKeyMetaAnnotations", "", "moduleFragment", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "removeKeyMetaClasses", "visitFile", "Lorg/jetbrains/kotlin/ir/declarations/IrFile;", "declaration", "visitSimpleFunction", "Lorg/jetbrains/kotlin/ir/IrStatement;", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDurableFunctionKeyTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurableFunctionKeyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/DurableFunctionKeyTransformer\n+ 2 declarationBuilders.kt\norg/jetbrains/kotlin/ir/builders/declarations/DeclarationBuildersKt\n+ 3 ExpressionHelpers.kt\norg/jetbrains/kotlin/ir/builders/ExpressionHelpersKt\n+ 4 IrBuilder.kt\norg/jetbrains/kotlin/ir/builders/IrBlockBodyBuilder\n+ 5 AbstractComposeLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLoweringKt\n*L\n1#1,254:1\n38#2,4:255\n229#2:259\n223#2,13:260\n405#3,10:273\n72#4,2:283\n1146#5,6:285\n*S KotlinDebug\n*F\n+ 1 DurableFunctionKeyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/DurableFunctionKeyTransformer\n*L\n190#1:255,4\n206#1:259\n206#1:260,13\n209#1:273,10\n209#1:283,2\n223#1:285,6\n*E\n"})
public final class DurableFunctionKeyTransformer extends DurableKeyTransformer {

    @NotNull
    private List<KeyInfo> currentKeys;

    @Nullable
    private final IrClassSymbol keyMetaAnnotation;

    @Nullable
    private final IrClassSymbol metaClassAnnotation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DurableFunctionKeyTransformer(@NotNull IrPluginContext context, @NotNull DeepCopySymbolRemapper symbolRemapper, @NotNull ModuleMetrics metrics) {
        super(new DurableKeyVisitor(null, 1, null), context, symbolRemapper, metrics);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(symbolRemapper, "symbolRemapper");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.currentKeys = new ArrayList();
        ComposeClassIds composeClassIds = ComposeClassIds.INSTANCE;
        this.keyMetaAnnotation = getTopLevelClassOrNull(composeClassIds.getFunctionKeyMeta());
        this.metaClassAnnotation = getTopLevelClassOrNull(composeClassIds.getFunctionKeyMetaClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrClass buildClass(String filePath) {
        String str = (String) CollectionsKt.last(StringsKt__StringsKt.split$default(filePath, new char[]{'/'}, false, 0, 6, (Object) null));
        IrFactory irFactory = getContext().getIrFactory();
        IrClassBuilder irClassBuilder = new IrClassBuilder();
        irClassBuilder.setKind(ClassKind.CLASS);
        DescriptorVisibility INTERNAL = DescriptorVisibilities.INTERNAL;
        Intrinsics.checkNotNullExpressionValue(INTERNAL, "INTERNAL");
        irClassBuilder.setVisibility(INTERNAL);
        Name nameIdentifier = Name.identifier(OooOOOO.OooO00o(PackagePartClassUtils.getFilePartShortName(str), "$KeyMeta"));
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(\"$shortName\\$KeyMeta\")");
        irClassBuilder.setName(nameIdentifier);
        IrDeclarationParent irDeclarationParentBuildClass = DeclarationBuildersKt.buildClass(irFactory, irClassBuilder);
        IrUtilsKt.createParameterDeclarations(irDeclarationParentBuildClass);
        if (this.metaClassAnnotation != null) {
            irDeclarationParentBuildClass.setAnnotations(CollectionsKt.plus((Collection<? extends IrConstructorCall>) irDeclarationParentBuildClass.getAnnotations(), irMetaClassAnnotation(filePath)));
        }
        IrFactory factory = irDeclarationParentBuildClass.getFactory();
        IrFunctionBuilder irFunctionBuilder = new IrFunctionBuilder();
        irFunctionBuilder.setPrimary(true);
        irFunctionBuilder.setReturnType(IrUtilsKt.getDefaultType(irDeclarationParentBuildClass));
        IrConstructor irConstructorBuildConstructor = DeclarationBuildersKt.buildConstructor(factory, irFunctionBuilder);
        irDeclarationParentBuildClass.getDeclarations().add(irConstructorBuildConstructor);
        irConstructorBuildConstructor.setParent(irDeclarationParentBuildClass);
        IrBuilderWithScope declarationIrBuilder = new DeclarationIrBuilder(getContext(), irDeclarationParentBuildClass.getSymbol(), 0, 0, 12, (DefaultConstructorMarker) null);
        IrBuilderWithScope irBlockBodyBuilder = new IrBlockBodyBuilder(declarationIrBuilder.getContext(), declarationIrBuilder.getScope(), declarationIrBuilder.getStartOffset(), declarationIrBuilder.getEndOffset());
        IrConstructor primaryConstructor = IrUtilsKt.getPrimaryConstructor(irBlockBodyBuilder.getContext().getIrBuiltIns().getAnyClass().getOwner());
        Intrinsics.checkNotNull(primaryConstructor);
        irBlockBodyBuilder.unaryPlus(ExpressionHelpersKt.irDelegatingConstructorCall(irBlockBodyBuilder, primaryConstructor));
        irConstructorBuildConstructor.setBody(irBlockBodyBuilder.doBuild());
        return irDeclarationParentBuildClass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrConstructorCall irKeyMetaAnnotation(KeyInfo key) {
        IrClassifierSymbol irClassifierSymbol = this.keyMetaAnnotation;
        Intrinsics.checkNotNull(irClassifierSymbol);
        IrConstructorCall irConstructorCallImpl = new IrConstructorCallImpl(-1, -1, IrTypesKt.getDefaultType(irClassifierSymbol), (IrConstructorSymbol) SequencesKt.single(IrUtilsKt.getConstructors(this.keyMetaAnnotation)), 0, 0, 3, (IrStatementOrigin) null, (SourceElement) null, 384, (DefaultConstructorMarker) null);
        irConstructorCallImpl.putValueArgument(0, irConst(key.getKey()));
        irConstructorCallImpl.putValueArgument(1, irConst(key.getStartOffset()));
        irConstructorCallImpl.putValueArgument(2, irConst(key.getEndOffset()));
        return irConstructorCallImpl;
    }

    private final IrConstructorCall irMetaClassAnnotation(String file) {
        IrClassifierSymbol irClassifierSymbol = this.metaClassAnnotation;
        Intrinsics.checkNotNull(irClassifierSymbol);
        IrConstructorCall irConstructorCallImpl = new IrConstructorCallImpl(-1, -1, IrTypesKt.getDefaultType(irClassifierSymbol), (IrConstructorSymbol) SequencesKt.single(IrUtilsKt.getConstructors(this.metaClassAnnotation)), 0, 0, 1, (IrStatementOrigin) null, (SourceElement) null, 384, (DefaultConstructorMarker) null);
        irConstructorCallImpl.putValueArgument(0, irConst(file));
        return irConstructorCallImpl;
    }

    @NotNull
    public final List<KeyInfo> getCurrentKeys() {
        return this.currentKeys;
    }

    public final void realizeKeyMetaAnnotations(@NotNull IrModuleFragment moduleFragment) {
        Intrinsics.checkNotNullParameter(moduleFragment, "moduleFragment");
        IrElementTransformerVoidKt.transformChildrenVoid((IrElement) moduleFragment, new IrElementTransformerVoid() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableFunctionKeyTransformer.realizeKeyMetaAnnotations.1
            /* JADX INFO: Thrown type has an unknown type hierarchy: org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException */
            @NotNull
            public IrFile visitFile(@NotNull IrFile declaration) throws Exception {
                Intrinsics.checkNotNullParameter(declaration, "declaration");
                DurableFunctionKeyTransformer durableFunctionKeyTransformer = DurableFunctionKeyTransformer.this;
                try {
                    List list = CollectionsKt.toList(declaration.getDeclarations());
                    ArrayList<IrAttributeContainer> arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof IrClass) {
                            arrayList.add(obj);
                        }
                    }
                    for (IrAttributeContainer irAttributeContainer : arrayList) {
                        List list2 = (List) WeakBindingTraceKt.getIrTrace(durableFunctionKeyTransformer.getContext()).get(ComposeWritableSlices.INSTANCE.getDURABLE_FUNCTION_KEYS(), irAttributeContainer);
                        if (list2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (((KeyInfo) obj2).getUsed()) {
                                    arrayList2.add(obj2);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                List annotations = irAttributeContainer.getAnnotations();
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    arrayList3.add(durableFunctionKeyTransformer.irKeyMetaAnnotation((KeyInfo) it.next()));
                                }
                                irAttributeContainer.setAnnotations(CollectionsKt.plus((Collection) annotations, (Iterable) arrayList3));
                            } else {
                                declaration.getDeclarations().remove(irAttributeContainer);
                            }
                        }
                    }
                    return declaration;
                } catch (ProcessCanceledException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new Exception(o00O00OO.OooO00o("IR lowering failed at: ", IrDeclarationsKt.getName(declaration)), e2);
                }
            }
        });
    }

    public final void removeKeyMetaClasses(@NotNull IrModuleFragment moduleFragment) {
        Intrinsics.checkNotNullParameter(moduleFragment, "moduleFragment");
        IrElementTransformerVoidKt.transformChildrenVoid((IrElement) moduleFragment, new IrElementTransformerVoid() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableFunctionKeyTransformer.removeKeyMetaClasses.1
            /* JADX INFO: Thrown type has an unknown type hierarchy: org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException */
            @NotNull
            public IrFile visitFile(@NotNull IrFile declaration) throws Exception {
                Intrinsics.checkNotNullParameter(declaration, "declaration");
                DurableFunctionKeyTransformer durableFunctionKeyTransformer = DurableFunctionKeyTransformer.this;
                try {
                    List list = CollectionsKt.toList(declaration.getDeclarations());
                    ArrayList<IrAttributeContainer> arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof IrClass) {
                            arrayList.add(obj);
                        }
                    }
                    for (IrAttributeContainer irAttributeContainer : arrayList) {
                        if (((List) WeakBindingTraceKt.getIrTrace(durableFunctionKeyTransformer.getContext()).get(ComposeWritableSlices.INSTANCE.getDURABLE_FUNCTION_KEYS(), irAttributeContainer)) != null) {
                            declaration.getDeclarations().remove(irAttributeContainer);
                        }
                    }
                    return declaration;
                } catch (Exception e) {
                    throw new Exception(o00O00OO.OooO00o("IR lowering failed at: ", IrDeclarationsKt.getName(declaration)), e);
                } catch (ProcessCanceledException e2) {
                    throw e2;
                }
            }
        });
    }

    public final void setCurrentKeys(@NotNull List<KeyInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.currentKeys = list;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException */
    @Override // androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer
    @NotNull
    public IrFile visitFile(@NotNull final IrFile declaration) throws Exception {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        try {
            return (IrFile) root(new LinkedHashSet(), new Function0<IrFile>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableFunctionKeyTransformer$visitFile$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final IrFile invoke() {
                    IrDeclaration irDeclarationBuildClass = this.this$0.buildClass(declaration.getFileEntry().getName());
                    List<KeyInfo> currentKeys = this.this$0.getCurrentKeys();
                    ArrayList arrayList = new ArrayList();
                    try {
                        this.this$0.setCurrentKeys(arrayList);
                        return super/*androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer*/.visitFile(declaration);
                    } finally {
                        WeakBindingTraceKt.getIrTrace(this.this$0.getContext()).record(ComposeWritableSlices.INSTANCE.getDURABLE_FUNCTION_KEYS(), (IrAttributeContainer) irDeclarationBuildClass, arrayList);
                        IrUtilsKt.addChild(declaration, irDeclarationBuildClass);
                        this.this$0.setCurrentKeys(currentKeys);
                    }
                }
            });
        } catch (ProcessCanceledException e) {
            throw e;
        } catch (Exception e2) {
            throw new Exception(o00O00OO.OooO00o("IR lowering failed at: ", IrDeclarationsKt.getName(declaration)), e2);
        }
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer
    @NotNull
    public IrStatement visitSimpleFunction(@NotNull IrSimpleFunction declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        Pair pairBuildKey$default = DurableKeyTransformer.buildKey$default(this, o00O00OO.OooO00o("fun-", signatureString(declaration)), null, null, 6, null);
        KeyInfo keyInfo = new KeyInfo((String) pairBuildKey$default.component1(), declaration.getStartOffset(), declaration.getEndOffset(), !((Boolean) pairBuildKey$default.component2()).booleanValue());
        this.currentKeys.add(keyInfo);
        WeakBindingTraceKt.getIrTrace(getContext()).record(ComposeWritableSlices.INSTANCE.getDURABLE_FUNCTION_KEY(), (IrAttributeContainer) declaration, keyInfo);
        return super.visitSimpleFunction(declaration);
    }
}
