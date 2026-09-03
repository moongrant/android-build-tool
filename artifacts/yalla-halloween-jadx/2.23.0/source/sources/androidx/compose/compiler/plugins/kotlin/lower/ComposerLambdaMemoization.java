package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeCallableIds;
import androidx.compose.compiler.plugins.kotlin.ModuleMetrics;
import androidx.compose.compiler.plugins.kotlin.WeakBindingTraceKt;
import androidx.compose.compiler.plugins.kotlin.analysis.ComposeWritableSlices;
import androidx.compose.compiler.plugins.kotlin.analysis.StabilityKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.common.UtilsKt;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContextImpl;
import org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder;
import org.jetbrains.kotlin.backend.jvm.codegen.PromisedValueKt;
import org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException;
import org.jetbrains.kotlin.descriptors.ClassKind;
import org.jetbrains.kotlin.descriptors.DescriptorVisibilities;
import org.jetbrains.kotlin.descriptors.DescriptorVisibility;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.builders.ExpressionHelpersKt;
import org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder;
import org.jetbrains.kotlin.ir.builders.IrBlockBuilder;
import org.jetbrains.kotlin.ir.builders.IrBuilderWithScope;
import org.jetbrains.kotlin.ir.builders.IrStatementsBuilder;
import org.jetbrains.kotlin.ir.builders.declarations.DeclarationBuildersKt;
import org.jetbrains.kotlin.ir.builders.declarations.IrClassBuilder;
import org.jetbrains.kotlin.ir.builders.declarations.IrFieldBuilder;
import org.jetbrains.kotlin.ir.builders.declarations.IrFunctionBuilder;
import org.jetbrains.kotlin.ir.builders.declarations.IrPropertyBuilder;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.declarations.IrAttributeContainer;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationBase;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationContainer;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationsKt;
import org.jetbrains.kotlin.ir.declarations.IrFactory;
import org.jetbrains.kotlin.ir.declarations.IrField;
import org.jetbrains.kotlin.ir.declarations.IrFile;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.declarations.IrProperty;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrSymbolOwner;
import org.jetbrains.kotlin.ir.declarations.IrTypeParameter;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.declarations.IrVariable;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrExpressionBody;
import org.jetbrains.kotlin.ir.expressions.IrFunctionAccessExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionReference;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.expressions.IrValueAccessExpression;
import org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrFunctionReferenceImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrInstanceInitializerCallImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl;
import org.jetbrains.kotlin.ir.linkage.IrDeserializer;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.IrSymbol;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypePredicatesKt;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.IrTypeUtilsKt;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.util.PatchDeclarationParentsKt;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt;
import org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils;
import org.jetbrains.kotlin.name.CallableId;
import org.jetbrains.kotlin.name.Name;
import org.jetbrains.kotlin.platform.JsPlatformKt;
import org.jetbrains.kotlin.platform.jvm.JvmPlatformKt;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001c\u001a\u00020\u000bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u001fH\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J&\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020!2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002J\u0010\u0010/\u001a\u00020&2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020&2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00103\u001a\u00020!2\u0006\u0010+\u001a\u000204H\u0016J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u000bH\u0016J\u0018\u00108\u001a\u00020!2\u0006\u0010+\u001a\u0002092\u0006\u0010:\u001a\u00020\u0014H\u0002J\u0010\u0010;\u001a\u00020!2\u0006\u0010+\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u0002062\u0006\u00107\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020\r2\u0006\u00107\u001a\u00020\rH\u0016J\u0010\u0010@\u001a\u0002062\u0006\u00107\u001a\u00020\u0019H\u0016J\u0010\u0010A\u001a\u00020!2\u0006\u0010+\u001a\u000209H\u0016J\u0010\u0010B\u001a\u00020!2\u0006\u0010+\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u00020!2\u0006\u0010+\u001a\u000209H\u0002J\u0010\u0010E\u001a\u00020!2\u0006\u0010+\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u0002062\u0006\u00107\u001a\u00020HH\u0016J \u0010I\u001a\u00020!2\u0006\u0010:\u001a\u00020\u00142\u0006\u0010+\u001a\u0002092\u0006\u00100\u001a\u000201H\u0002J\f\u0010J\u001a\u00020\u0018*\u00020.H\u0002J\u000e\u0010K\u001a\u00020\u0018*\u0004\u0018\u00010!H\u0002J\f\u0010L\u001a\u00020\u0018*\u00020.H\u0002J\f\u0010M\u001a\u00020\u0018*\u00020.H\u0002J\u001b\u0010N\u001a\u0002HO\"\b\b\u0000\u0010O*\u00020P*\u0002HOH\u0002¢\u0006\u0002\u0010QJ\u001b\u0010R\u001a\u0002HO\"\b\b\u0000\u0010O*\u00020P*\u0002HOH\u0002¢\u0006\u0002\u0010QJ#\u0010S\u001a\u0002HO\"\b\b\u0000\u0010O*\u00020!*\u0002HO2\u0006\u0010T\u001a\u00020\u0018H\u0002¢\u0006\u0002\u0010UJ#\u0010V\u001a\u0002HO\"\b\b\u0000\u0010O*\u00020W*\u0002HO2\u0006\u0010T\u001a\u00020\u0018H\u0002¢\u0006\u0002\u0010XJ\u001b\u0010Y\u001a\u0002HO\"\b\b\u0000\u0010O*\u00020P*\u0002HOH\u0002¢\u0006\u0002\u0010QJ\u001b\u0010Z\u001a\u0002HO\"\b\b\u0000\u0010O*\u00020P*\u0002HOH\u0002¢\u0006\u0002\u0010QR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0017\u001a\u00020\u0018*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006["}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposerLambdaMemoization;", "Landroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLowering;", "Landroidx/compose/compiler/plugins/kotlin/lower/ModuleLoweringPass;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;)V", "composableSingletonsClass", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "currentFile", "Lorg/jetbrains/kotlin/ir/declarations/IrFile;", "currentFunctionContext", "Landroidx/compose/compiler/plugins/kotlin/lower/FunctionContext;", "getCurrentFunctionContext", "()Landroidx/compose/compiler/plugins/kotlin/lower/FunctionContext;", "declarationContextStack", "", "Landroidx/compose/compiler/plugins/kotlin/lower/DeclarationContext;", "inlineLambdaInfo", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposeInlineLambdaLocator;", "allowsComposableCalls", "", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "getAllowsComposableCalls", "(Lorg/jetbrains/kotlin/ir/declarations/IrFunction;)Z", "getOrCreateComposableSingletonsClass", "hasTypeParameter", "type", "Lorg/jetbrains/kotlin/ir/types/IrType;", "irCurrentComposer", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "irGetComposableSingleton", "lambdaExpression", "lambdaType", "lower", "", "module", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "rememberExpression", "functionContext", "expression", "captures", "", "Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;", "startCollector", "collector", "Landroidx/compose/compiler/plugins/kotlin/lower/CaptureCollector;", "stopCollector", "visitCall", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "visitClass", "Lorg/jetbrains/kotlin/ir/IrStatement;", "declaration", "visitComposableFunctionExpression", "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionExpression;", "declarationContext", "visitConstructorCall", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "visitDeclaration", "Lorg/jetbrains/kotlin/ir/declarations/IrDeclarationBase;", "visitFile", "visitFunction", "visitFunctionExpression", "visitFunctionReference", "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionReference;", "visitNonComposableFunctionExpression", "visitValueAccess", "Lorg/jetbrains/kotlin/ir/expressions/IrValueAccessExpression;", "visitVariable", "Lorg/jetbrains/kotlin/ir/declarations/IrVariable;", "wrapFunctionExpression", "isInlinedLambda", "isNullOrStable", "isStable", "isVar", "markAsComposableSingleton", "T", "Lorg/jetbrains/kotlin/ir/declarations/IrAttributeContainer;", "(Lorg/jetbrains/kotlin/ir/declarations/IrAttributeContainer;)Lorg/jetbrains/kotlin/ir/declarations/IrAttributeContainer;", "markAsComposableSingletonClass", "markAsStatic", "mark", "(Lorg/jetbrains/kotlin/ir/expressions/IrExpression;Z)Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "markAsSynthetic", "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionAccessExpression;", "(Lorg/jetbrains/kotlin/ir/expressions/IrFunctionAccessExpression;Z)Lorg/jetbrains/kotlin/ir/expressions/IrFunctionAccessExpression;", "markHasTransformedLambda", "markIsTransformedLambda", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposerLambdaMemoization.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposerLambdaMemoization.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposerLambdaMemoization\n+ 2 declarationBuilders.kt\norg/jetbrains/kotlin/ir/builders/declarations/DeclarationBuildersKt\n+ 3 ExpressionHelpers.kt\norg/jetbrains/kotlin/ir/builders/ExpressionHelpersKt\n+ 4 IrBuilder.kt\norg/jetbrains/kotlin/ir/builders/IrBlockBodyBuilder\n+ 5 AbstractComposeLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLoweringKt\n+ 6 IrBuilder.kt\norg/jetbrains/kotlin/ir/builders/IrBlockBuilder\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,965:1\n38#2,4:966\n229#2:970\n223#2,13:971\n98#2:1018\n92#2,10:1019\n55#2,4:1029\n104#2,9:1033\n405#3,10:984\n377#3,13:1002\n405#3,10:1042\n72#4,2:994\n72#4,2:1052\n1146#5,6:996\n98#6:1015\n99#6:1017\n1#7:1016\n1747#8,3:1054\n1549#8:1057\n1620#8,3:1058\n661#8,11:1061\n618#8,12:1072\n1549#8:1084\n1620#8,3:1085\n*S KotlinDebug\n*F\n+ 1 ComposerLambdaMemoization.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposerLambdaMemoization\n*L\n302#1:966,4\n317#1:970\n317#1:971,13\n625#1:1018\n625#1:1019,10\n629#1:1029,4\n642#1:1033,9\n320#1:984,10\n472#1:1002,13\n650#1:1042,10\n320#1:994,2\n650#1:1052,2\n342#1:996,6\n472#1:1015\n472#1:1017\n791#1:1054,3\n806#1:1057\n806#1:1058,3\n809#1:1061,11\n815#1:1072,12\n858#1:1084\n858#1:1085,3\n*E\n"})
public final class ComposerLambdaMemoization extends AbstractComposeLowering {

    @Nullable
    private IrClass composableSingletonsClass;

    @Nullable
    private IrFile currentFile;

    @NotNull
    private final List<DeclarationContext> declarationContextStack;

    @NotNull
    private ComposeInlineLambdaLocator inlineLambdaInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerLambdaMemoization(@NotNull IrPluginContext context, @NotNull DeepCopySymbolRemapper symbolRemapper, @NotNull ModuleMetrics metrics) {
        super(context, symbolRemapper, metrics);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(symbolRemapper, "symbolRemapper");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.declarationContextStack = new ArrayList();
        this.inlineLambdaInfo = new ComposeInlineLambdaLocator(context);
    }

    private final boolean getAllowsComposableCalls(IrFunction irFunction) {
        if (hasComposableAnnotation((IrAnnotationContainer) irFunction)) {
            return true;
        }
        if (this.inlineLambdaInfo.preservesComposableScope(irFunction)) {
            DeclarationContext declarationContext = (DeclarationContext) UtilsKt.peek(this.declarationContextStack);
            if (declarationContext != null && declarationContext.getComposable()) {
                return true;
            }
        }
        return false;
    }

    private final FunctionContext getCurrentFunctionContext() {
        DeclarationContext declarationContext = (DeclarationContext) UtilsKt.peek(this.declarationContextStack);
        if (declarationContext != null) {
            return declarationContext.getFunctionContext();
        }
        return null;
    }

    private final IrClass getOrCreateComposableSingletonsClass() {
        IrClass irClass = this.composableSingletonsClass;
        if (irClass != null) {
            Intrinsics.checkNotNull(irClass);
            return irClass;
        }
        IrFile irFile = this.currentFile;
        Intrinsics.checkNotNull(irFile);
        String str = (String) CollectionsKt.last(StringsKt__StringsKt.split$default(irFile.getFileEntry().getName(), new char[]{'/'}, false, 0, 6, (Object) null));
        IrFactory irFactory = getContext().getIrFactory();
        IrClassBuilder irClassBuilder = new IrClassBuilder();
        irClassBuilder.setStartOffset(-2);
        irClassBuilder.setEndOffset(-2);
        irClassBuilder.setKind(ClassKind.OBJECT);
        DescriptorVisibility INTERNAL = DescriptorVisibilities.INTERNAL;
        Intrinsics.checkNotNullExpressionValue(INTERNAL, "INTERNAL");
        irClassBuilder.setVisibility(INTERNAL);
        Name nameIdentifier = Name.identifier(o00O00OO.OooO00o("ComposableSingletons$", PackagePartClassUtils.getFilePartShortName(str)));
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(\"ComposableSingletons${\"$\"}$shortName\")");
        irClassBuilder.setName(nameIdentifier);
        IrAttributeContainer irAttributeContainerBuildClass = DeclarationBuildersKt.buildClass(irFactory, irClassBuilder);
        IrUtilsKt.createParameterDeclarations(irAttributeContainerBuildClass);
        IrFactory factory = irAttributeContainerBuildClass.getFactory();
        IrFunctionBuilder irFunctionBuilder = new IrFunctionBuilder();
        irFunctionBuilder.setPrimary(true);
        irFunctionBuilder.setReturnType(IrUtilsKt.getDefaultType(irAttributeContainerBuildClass));
        IrConstructor irConstructorBuildConstructor = DeclarationBuildersKt.buildConstructor(factory, irFunctionBuilder);
        irAttributeContainerBuildClass.getDeclarations().add(irConstructorBuildConstructor);
        irConstructorBuildConstructor.setParent((IrDeclarationParent) irAttributeContainerBuildClass);
        IrBuilderWithScope declarationIrBuilder = new DeclarationIrBuilder(getContext(), irAttributeContainerBuildClass.getSymbol(), 0, 0, 12, (DefaultConstructorMarker) null);
        IrBuilderWithScope irBlockBodyBuilder = new IrBlockBodyBuilder(declarationIrBuilder.getContext(), declarationIrBuilder.getScope(), declarationIrBuilder.getStartOffset(), declarationIrBuilder.getEndOffset());
        IrConstructor primaryConstructor = IrUtilsKt.getPrimaryConstructor(irBlockBodyBuilder.getContext().getIrBuiltIns().getAnyClass().getOwner());
        Intrinsics.checkNotNull(primaryConstructor);
        irBlockBodyBuilder.unaryPlus(ExpressionHelpersKt.irDelegatingConstructorCall(irBlockBodyBuilder, primaryConstructor));
        irBlockBodyBuilder.unaryPlus(new IrInstanceInitializerCallImpl(irBlockBodyBuilder.getStartOffset(), irBlockBodyBuilder.getEndOffset(), irAttributeContainerBuildClass.getSymbol(), IrUtilsKt.getDefaultType(irAttributeContainerBuildClass)));
        irConstructorBuildConstructor.setBody(irBlockBodyBuilder.doBuild());
        IrClass irClassMarkAsComposableSingletonClass = markAsComposableSingletonClass(irAttributeContainerBuildClass);
        this.composableSingletonsClass = irClassMarkAsComposableSingletonClass;
        return irClassMarkAsComposableSingletonClass;
    }

    private final boolean hasTypeParameter(IrType type) {
        return PromisedValueKt.anyTypeArgument(type, new Function1<IrTypeParameter, Boolean>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposerLambdaMemoization.hasTypeParameter.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull IrTypeParameter it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            }
        });
    }

    private final IrExpression irCurrentComposer() {
        IrSimpleFunctionSymbol topLevelPropertyGetter = getTopLevelPropertyGetter(ComposeCallableIds.INSTANCE.getCurrentComposer());
        IrType irTypeReplaceArgumentsWithStarProjections = replaceArgumentsWithStarProjections((IrType) IrUtilsKt.getDefaultType(getComposerIrClass()));
        Intrinsics.checkNotNull(topLevelPropertyGetter, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol");
        IrSimpleFunctionSymbol irSimpleFunctionSymbol = topLevelPropertyGetter;
        return new IrCallImpl(-1, -1, irTypeReplaceArgumentsWithStarProjections, irSimpleFunctionSymbol, irSimpleFunctionSymbol.getOwner().getTypeParameters().size(), irSimpleFunctionSymbol.getOwner().getValueParameters().size(), IrStatementOrigin.FOR_LOOP_ITERATOR.INSTANCE, (IrClassSymbol) null, 128, (DefaultConstructorMarker) null);
    }

    private final IrExpression irGetComposableSingleton(IrExpression lambdaExpression, IrType lambdaType) {
        IrDeclarationParent orCreateComposableSingletonsClass = getOrCreateComposableSingletonsClass();
        String strOooO00o = android.support.v4.media.OooO00o.OooO00o("lambda-", orCreateComposableSingletonsClass.getDeclarations().size());
        IrFactory factory = orCreateComposableSingletonsClass.getFactory();
        IrPropertyBuilder irPropertyBuilder = new IrPropertyBuilder();
        Name nameIdentifier = Name.identifier(strOooO00o);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(lambdaName)");
        irPropertyBuilder.setName(nameIdentifier);
        DescriptorVisibility INTERNAL = DescriptorVisibilities.INTERNAL;
        Intrinsics.checkNotNullExpressionValue(INTERNAL, "INTERNAL");
        irPropertyBuilder.setVisibility(INTERNAL);
        IrProperty irPropertyBuildProperty = DeclarationBuildersKt.buildProperty(factory, irPropertyBuilder);
        orCreateComposableSingletonsClass.getDeclarations().add(irPropertyBuildProperty);
        IrDeclarationParent irDeclarationParent = orCreateComposableSingletonsClass;
        irPropertyBuildProperty.setParent(irDeclarationParent);
        IrFactory irFactory = getContext().getIrFactory();
        IrFieldBuilder irFieldBuilder = new IrFieldBuilder();
        irFieldBuilder.setStartOffset(-2);
        irFieldBuilder.setEndOffset(-2);
        Name nameIdentifier2 = Name.identifier(strOooO00o);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(lambdaName)");
        irFieldBuilder.setName(nameIdentifier2);
        irFieldBuilder.setType(lambdaType);
        DescriptorVisibility INTERNAL2 = DescriptorVisibilities.INTERNAL;
        Intrinsics.checkNotNullExpressionValue(INTERNAL2, "INTERNAL");
        irFieldBuilder.setVisibility(INTERNAL2);
        irFieldBuilder.setStatic(JvmPlatformKt.isJvm(getContext().getPlatform()));
        IrField irFieldBuildField = DeclarationBuildersKt.buildField(irFactory, irFieldBuilder);
        irFieldBuildField.setCorrespondingPropertySymbol(irPropertyBuildProperty.getSymbol());
        irFieldBuildField.setParent(irDeclarationParent);
        irFieldBuildField.setInitializer(ExpressionHelpersKt.irExprBody(new DeclarationIrBuilder(getContext(), orCreateComposableSingletonsClass.getSymbol(), 0, 0, 12, (DefaultConstructorMarker) null), markIsTransformedLambda((IrAttributeContainer) lambdaExpression)));
        irPropertyBuildProperty.setBackingField(irFieldBuildField);
        IrFunctionBuilder irFunctionBuilder = new IrFunctionBuilder();
        Name nameSpecial = Name.special("<get-" + irPropertyBuildProperty.getName() + Typography.greater);
        Intrinsics.checkNotNullExpressionValue(nameSpecial, "special(\"<get-${this@addGetter.name}>\")");
        irFunctionBuilder.setName(nameSpecial);
        irFunctionBuilder.setReturnType(lambdaType);
        DescriptorVisibility INTERNAL3 = DescriptorVisibilities.INTERNAL;
        Intrinsics.checkNotNullExpressionValue(INTERNAL3, "INTERNAL");
        irFunctionBuilder.setVisibility(INTERNAL3);
        irFunctionBuilder.setOrigin(IrDeclarationOrigin.DEFAULT_PROPERTY_ACCESSOR.INSTANCE);
        IrFunction irFunctionBuildFunction = DeclarationBuildersKt.buildFunction(irPropertyBuildProperty.getFactory(), irFunctionBuilder);
        irPropertyBuildProperty.setGetter(irFunctionBuildFunction);
        irFunctionBuildFunction.setCorrespondingPropertySymbol(irPropertyBuildProperty.getSymbol());
        irFunctionBuildFunction.setParent(irPropertyBuildProperty.getParent());
        IrValueParameter thisReceiver = orCreateComposableSingletonsClass.getThisReceiver();
        Intrinsics.checkNotNull(thisReceiver);
        IrValueDeclaration irValueDeclarationCopyTo$default = IrUtilsKt.copyTo$default(thisReceiver, irFunctionBuildFunction, (IrDeclarationOrigin) null, 0, 0, 0, (Name) null, (Map) null, (IrType) null, (IrType) null, (IrExpressionBody) null, false, false, false, 8190, (Object) null);
        irFunctionBuildFunction.setParent(irDeclarationParent);
        irFunctionBuildFunction.setDispatchReceiverParameter(irValueDeclarationCopyTo$default);
        IrBuilderWithScope declarationIrBuilder = new DeclarationIrBuilder(getContext(), irFunctionBuildFunction.getSymbol(), 0, 0, 12, (DefaultConstructorMarker) null);
        IrBuilderWithScope irBlockBodyBuilder = new IrBlockBodyBuilder(declarationIrBuilder.getContext(), declarationIrBuilder.getScope(), declarationIrBuilder.getStartOffset(), declarationIrBuilder.getEndOffset());
        IrBuilderWithScope irBuilderWithScope = irBlockBodyBuilder;
        IrExpression irExpressionIrGet = ExpressionHelpersKt.irGet(irBuilderWithScope, irValueDeclarationCopyTo$default);
        IrField backingField = irPropertyBuildProperty.getBackingField();
        Intrinsics.checkNotNull(backingField);
        irBlockBodyBuilder.unaryPlus(ExpressionHelpersKt.irReturn(irBuilderWithScope, ExpressionHelpersKt.irGetField$default(irBuilderWithScope, irExpressionIrGet, backingField, (IrType) null, 4, (Object) null)));
        irFunctionBuildFunction.setBody(irBlockBodyBuilder.doBuild());
        IrSimpleFunction getter = irPropertyBuildProperty.getGetter();
        Intrinsics.checkNotNull(getter);
        return markAsComposableSingleton(AbstractComposeLowering.irCall$default(this, getter.getSymbol(), null, new IrGetObjectValueImpl(-1, -1, IrUtilsKt.getDefaultType(orCreateComposableSingletonsClass), orCreateComposableSingletonsClass.getSymbol()), null, new IrExpression[0], 10, null));
    }

    private final boolean isInlinedLambda(IrValueDeclaration irValueDeclaration) {
        if (!IrTypeUtilsKt.isFunctionOrKFunction(irValueDeclaration.getType()) || !(irValueDeclaration instanceof IrValueParameter)) {
            return false;
        }
        IrFunction parent = irValueDeclaration.getParent();
        IrFunction irFunction = parent instanceof IrFunction ? parent : null;
        return (irFunction != null && irFunction.isInline()) && !((IrValueParameter) irValueDeclaration).isNoinline();
    }

    private final boolean isNullOrStable(IrExpression irExpression) {
        return irExpression == null || StabilityKt.knownStable(StabilityKt.stabilityOf(irExpression));
    }

    private final boolean isStable(IrValueDeclaration irValueDeclaration) {
        return StabilityKt.knownStable(StabilityKt.stabilityOf(irValueDeclaration.getType()));
    }

    private final boolean isVar(IrValueDeclaration irValueDeclaration) {
        IrVariable irVariable = irValueDeclaration instanceof IrVariable ? (IrVariable) irValueDeclaration : null;
        return irVariable != null && irVariable.isVar();
    }

    private final <T extends IrAttributeContainer> T markAsComposableSingleton(T t) {
        WeakBindingTraceKt.getIrTrace(getContext()).record(ComposeWritableSlices.INSTANCE.getIS_COMPOSABLE_SINGLETON(), t, Boolean.TRUE);
        return t;
    }

    private final <T extends IrAttributeContainer> T markAsComposableSingletonClass(T t) {
        WeakBindingTraceKt.getIrTrace(getContext()).record(ComposeWritableSlices.INSTANCE.getIS_COMPOSABLE_SINGLETON_CLASS(), t, Boolean.TRUE);
        return t;
    }

    private final <T extends IrExpression> T markAsStatic(T t, boolean z) {
        if (z) {
            WeakBindingTraceKt.getIrTrace(getContext()).record(ComposeWritableSlices.INSTANCE.getIS_STATIC_FUNCTION_EXPRESSION(), (IrAttributeContainer) t, Boolean.TRUE);
        }
        return t;
    }

    private final <T extends IrFunctionAccessExpression> T markAsSynthetic(T t, boolean z) {
        if (z) {
            WeakBindingTraceKt.getIrTrace(getContext()).record(ComposeWritableSlices.INSTANCE.getIS_SYNTHETIC_COMPOSABLE_CALL(), (IrAttributeContainer) t, Boolean.TRUE);
        }
        return t;
    }

    private final <T extends IrAttributeContainer> T markHasTransformedLambda(T t) {
        WeakBindingTraceKt.getIrTrace(getContext()).record(ComposeWritableSlices.INSTANCE.getHAS_TRANSFORMED_LAMBDA(), t, Boolean.TRUE);
        return t;
    }

    private final <T extends IrAttributeContainer> T markIsTransformedLambda(T t) {
        WeakBindingTraceKt.getIrTrace(getContext()).record(ComposeWritableSlices.INSTANCE.getIS_TRANSFORMED_LAMBDA(), t, Boolean.TRUE);
        return t;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    private final IrExpression rememberExpression(FunctionContext functionContext, final IrExpression expression, List<? extends IrValueDeclaration> captures) {
        boolean z;
        IrSimpleFunction irSimpleFunction;
        int size;
        boolean z2;
        boolean z3 = !JsPlatformKt.isJs(getContext().getPlatform());
        if (captures.isEmpty() && z3) {
            getMetrics().recordLambda(false, true, true);
            return markAsStatic(expression, true);
        }
        if (captures.isEmpty()) {
            z = false;
            break;
        }
        Iterator<T> it = captures.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            IrValueDeclaration irValueDeclaration = (IrValueDeclaration) it.next();
            if (isVar(irValueDeclaration) || !isStable(irValueDeclaration) || isInlinedLambda(irValueDeclaration)) {
                z = true;
                break;
            }
        }
        if (z) {
            getMetrics().recordLambda(false, false, false);
            return expression;
        }
        int size2 = captures.size() + 1;
        IrDeclarationParent irDeclarationParentMo131getDeclaration = functionContext.mo131getDeclaration();
        List<IrSimpleFunctionSymbol> topLevelFunctions = getTopLevelFunctions(ComposeCallableIds.INSTANCE.getRemember());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(topLevelFunctions, 10));
        Iterator<T> it2 = topLevelFunctions.iterator();
        while (it2.hasNext()) {
            arrayList.add(((IrSimpleFunctionSymbol) it2.next()).getOwner());
        }
        Iterator it3 = arrayList.iterator();
        boolean z4 = false;
        Object obj = null;
        while (true) {
            if (!it3.hasNext()) {
                if (!z4) {
                    break;
                }
                break;
            }
            Object next = it3.next();
            IrSimpleFunction irSimpleFunction2 = (IrSimpleFunction) next;
            if (irSimpleFunction2.getValueParameters().size() != size2) {
                z2 = false;
            } else {
                IrValueParameter irValueParameter = (IrValueParameter) CollectionsKt.firstOrNull(irSimpleFunction2.getValueParameters());
                if ((irValueParameter != null ? irValueParameter.getVarargElementType() : null) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                if (!z4) {
                    z4 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        IrSimpleFunction irSimpleFunction3 = (IrSimpleFunction) obj;
        if (irSimpleFunction3 == null) {
            boolean z5 = false;
            Object obj2 = null;
            for (Object obj3 : arrayList) {
                IrValueParameter irValueParameter2 = (IrValueParameter) CollectionsKt.firstOrNull(((IrSimpleFunction) obj3).getValueParameters());
                if ((irValueParameter2 != null ? irValueParameter2.getVarargElementType() : null) != null) {
                    if (z5) {
                        throw new IllegalArgumentException("Collection contains more than one matching element.");
                    }
                    z5 = true;
                    obj2 = obj3;
                }
            }
            if (!z5) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            irSimpleFunction = (IrSimpleFunction) obj2;
        } else {
            irSimpleFunction = irSimpleFunction3;
        }
        IrSimpleFunctionSymbol irSimpleFunctionSymbolReferenceSimpleFunction = referenceSimpleFunction(irSimpleFunction.getSymbol());
        IrBuilderWithScope declarationIrBuilder = new DeclarationIrBuilder(getContext(), functionContext.mo132getSymbol(), expression.getStartOffset(), expression.getEndOffset());
        getMetrics().recordLambda(false, true, false);
        IrBuilderWithScope irBuilderWithScope = declarationIrBuilder;
        IrElement irElementIrCall$default = ExpressionHelpersKt.irCall$default(irBuilderWithScope, irSimpleFunctionSymbolReferenceSimpleFunction, expression.getType(), 0, 0, (IrStatementOrigin) null, 28, (Object) null);
        irElementIrCall$default.putTypeArgument(0, expression.getType());
        if (irSimpleFunction3 != null) {
            int size3 = captures.size();
            for (int i = 0; i < size3; i++) {
                irElementIrCall$default.putValueArgument(i, ExpressionHelpersKt.irGet(irBuilderWithScope, captures.get(i)));
            }
            size = captures.size();
        } else {
            IrType type = ((IrValueParameter) irSimpleFunction.getValueParameters().get(0)).getType();
            IrType anyType = getContext().getIrBuiltIns().getAnyType();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(captures, 10));
            Iterator<T> it4 = captures.iterator();
            while (it4.hasNext()) {
                arrayList2.add(ExpressionHelpersKt.irGet(irBuilderWithScope, (IrValueDeclaration) it4.next()));
            }
            irElementIrCall$default.putValueArgument(0, new IrVarargImpl(-1, -1, type, anyType, arrayList2));
            size = 1;
        }
        irElementIrCall$default.putValueArgument(size, irLambdaExpression(expression.getStartOffset(), expression.getEndOffset(), expression.getType(), new Function1<IrSimpleFunction, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposerLambdaMemoization$rememberExpression$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IrSimpleFunction irSimpleFunction4) {
                invoke2(irSimpleFunction4);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IrSimpleFunction fn) {
                Intrinsics.checkNotNullParameter(fn, "fn");
                IrBuilderWithScope declarationIrBuilder2 = new DeclarationIrBuilder(this.this$0.getContext(), fn.getSymbol(), 0, 0, 12, (DefaultConstructorMarker) null);
                IrExpression irExpression = expression;
                IrBuilderWithScope irBlockBodyBuilder = new IrBlockBodyBuilder(declarationIrBuilder2.getContext(), declarationIrBuilder2.getScope(), declarationIrBuilder2.getStartOffset(), declarationIrBuilder2.getEndOffset());
                irBlockBodyBuilder.unaryPlus(ExpressionHelpersKt.irReturn(irBlockBodyBuilder, irExpression));
                fn.setBody(irBlockBodyBuilder.doBuild());
            }
        }));
        return markAsSynthetic(PatchDeclarationParentsKt.patchDeclarationParents(irElementIrCall$default, irDeclarationParentMo131getDeclaration), true);
    }

    private final void startCollector(CaptureCollector collector) {
        Iterator<DeclarationContext> it = this.declarationContextStack.iterator();
        while (it.hasNext()) {
            it.next().pushCollector(collector);
        }
    }

    private final void stopCollector(CaptureCollector collector) {
        Iterator<DeclarationContext> it = this.declarationContextStack.iterator();
        while (it.hasNext()) {
            it.next().popCollector(collector);
        }
    }

    private final IrExpression visitComposableFunctionExpression(IrFunctionExpression expression, DeclarationContext declarationContext) {
        CaptureCollector captureCollector = new CaptureCollector();
        startCollector(captureCollector);
        IrFunctionExpression irFunctionExpressionVisitFunctionExpression = super.visitFunctionExpression(expression);
        stopCollector(captureCollector);
        IrFunctionExpression irFunctionExpression = irFunctionExpressionVisitFunctionExpression instanceof IrFunctionExpression ? irFunctionExpressionVisitFunctionExpression : null;
        if (irFunctionExpression == null) {
            return irFunctionExpressionVisitFunctionExpression;
        }
        if (this.inlineLambdaInfo.isInlineLambda((IrFunction) expression.getFunction())) {
            return (IrExpression) irFunctionExpression;
        }
        if (!IrTypePredicatesKt.isUnit(irFunctionExpression.getFunction().getReturnType())) {
            getMetrics().recordLambda(true, !captureCollector.getHasCaptures(), !captureCollector.getHasCaptures());
            return (IrExpression) irFunctionExpression;
        }
        IrExpression irExpressionWrapFunctionExpression = wrapFunctionExpression(declarationContext, irFunctionExpression, captureCollector);
        getMetrics().recordLambda(true, true, !captureCollector.getHasCaptures());
        if (captureCollector.getHasCaptures()) {
            return irExpressionWrapFunctionExpression;
        }
        return (JvmPlatformKt.isJvm(getContext().getPlatform()) || !hasTypeParameter(expression.getType())) ? irGetComposableSingleton(irExpressionWrapFunctionExpression, expression.getType()) : irExpressionWrapFunctionExpression;
    }

    private final IrExpression visitNonComposableFunctionExpression(IrFunctionExpression expression) {
        FunctionContext currentFunctionContext = getCurrentFunctionContext();
        if (currentFunctionContext == null) {
            return super.visitFunctionExpression(expression);
        }
        if (!currentFunctionContext.getCanRemember() || this.inlineLambdaInfo.isInlineLambda((IrFunction) expression.getFunction())) {
            return super.visitFunctionExpression(expression);
        }
        CaptureCollector captureCollector = new CaptureCollector();
        startCollector(captureCollector);
        IrFunctionExpression irFunctionExpressionVisitFunctionExpression = super.visitFunctionExpression(expression);
        stopCollector(captureCollector);
        IrFunctionExpression irFunctionExpression = irFunctionExpressionVisitFunctionExpression instanceof IrFunctionExpression ? irFunctionExpressionVisitFunctionExpression : null;
        return irFunctionExpression == null ? irFunctionExpressionVisitFunctionExpression : rememberExpression(currentFunctionContext, (IrExpression) irFunctionExpression, CollectionsKt.toList(captureCollector.getCaptures()));
    }

    private final IrExpression wrapFunctionExpression(DeclarationContext declarationContext, IrFunctionExpression expression, CaptureCollector collector) {
        CallableId composableLambdaNInstance;
        IrDeserializer linker;
        IrSimpleFunction function = expression.getFunction();
        int size = function.getValueParameters().size();
        boolean zIsJs = JsPlatformKt.isJs(getContext().getPlatform());
        if (size > 22 && zIsJs) {
            throw new IllegalStateException("only 22 parameters in @Composable lambda are supported on JS".toString());
        }
        int i = 0;
        boolean z = size > 22;
        boolean z2 = collector.getHasCaptures() && declarationContext.getComposable();
        if (z2) {
            composableLambdaNInstance = z ? ComposeCallableIds.INSTANCE.getComposableLambdaN() : ComposeCallableIds.INSTANCE.getComposableLambda();
        } else {
            composableLambdaNInstance = z ? ComposeCallableIds.INSTANCE.getComposableLambdaNInstance() : ComposeCallableIds.INSTANCE.getComposableLambdaInstance();
        }
        IrSymbol topLevelFunction = getTopLevelFunction(composableLambdaNInstance);
        IrBuilderWithScope declarationIrBuilder = new DeclarationIrBuilder(getContext(), declarationContext.mo132getSymbol(), expression.getStartOffset(), expression.getEndOffset());
        IrPluginContextImpl context = getContext();
        IrPluginContextImpl irPluginContextImpl = context instanceof IrPluginContextImpl ? context : null;
        if (irPluginContextImpl != null && (linker = irPluginContextImpl.getLinker()) != null) {
            linker.getDeclaration(topLevelFunction);
        }
        IrBuilderWithScope irBuilderWithScope = declarationIrBuilder;
        IrAttributeContainer irAttributeContainerIrCall = ExpressionHelpersKt.irCall(irBuilderWithScope, topLevelFunction);
        if (z2) {
            irAttributeContainerIrCall.putValueArgument(0, irCurrentComposer());
            i = 1;
        }
        int i2 = i + 1;
        irAttributeContainerIrCall.putValueArgument(i, ExpressionHelpersKt.irInt$default(irBuilderWithScope, sourceKey(expression.getFunction()), (IrType) null, 2, (Object) null));
        int i3 = i2 + 1;
        irAttributeContainerIrCall.putValueArgument(i2, ExpressionHelpersKt.irBoolean(irBuilderWithScope, !collector.getCaptures().isEmpty()));
        if (z) {
            irAttributeContainerIrCall.putValueArgument(i3, ExpressionHelpersKt.irInt$default(irBuilderWithScope, size, (IrType) null, 2, (Object) null));
            i3++;
        }
        if (i3 < irAttributeContainerIrCall.getValueArgumentsCount()) {
            irAttributeContainerIrCall.putValueArgument(i3, markIsTransformedLambda((IrAttributeContainer) expression));
            return markHasTransformedLambda(irAttributeContainerIrCall);
        }
        throw new IllegalStateException(("function = " + function.getName().asString() + ", count = " + irAttributeContainerIrCall.getValueArgumentsCount() + ", index = " + i3).toString());
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.ModuleLoweringPass
    public void lower(@NotNull IrModuleFragment module) {
        Intrinsics.checkNotNullParameter(module, "module");
        IrElement irElement = (IrElement) module;
        this.inlineLambdaInfo.scan(irElement);
        IrElementTransformerVoidKt.transformChildrenVoid(irElement, this);
    }

    @NotNull
    public IrExpression visitCall(@NotNull IrCall expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrSymbolOwner irSymbolOwner = (IrSimpleFunction) expression.getSymbol().getOwner();
        if (AdditionalIrUtilsKt.isLocal((IrDeclaration) irSymbolOwner)) {
            ComposerLambdaMemoizationKt.recordLocalCapture(this.declarationContextStack, irSymbolOwner);
        }
        return super.visitCall(expression);
    }

    @NotNull
    public IrStatement visitClass(@NotNull IrClass declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        ClassContext classContext = new ClassContext(declaration);
        UtilsKt.push(this.declarationContextStack, classContext);
        IrStatement irStatementVisitClass = super.visitClass(declaration);
        UtilsKt.pop(this.declarationContextStack);
        if (AdditionalIrUtilsKt.isLocal((IrDeclaration) declaration)) {
            ComposerLambdaMemoizationKt.recordLocalDeclaration(this.declarationContextStack, classContext);
        }
        return irStatementVisitClass;
    }

    @NotNull
    public IrExpression visitConstructorCall(@NotNull IrConstructorCall expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrDeclaration irDeclaration = (IrConstructor) expression.getSymbol().getOwner();
        IrClass parent = irDeclaration.getParent();
        IrClass irClass = parent instanceof IrClass ? parent : null;
        if (irClass != null && AdditionalIrUtilsKt.isLocal(irDeclaration)) {
            ComposerLambdaMemoizationKt.recordLocalCapture(this.declarationContextStack, (IrSymbolOwner) irClass);
        }
        return super.visitConstructorCall(expression);
    }

    @NotNull
    public IrStatement visitDeclaration(@NotNull IrDeclarationBase declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        if (declaration instanceof IrFunction) {
            return super.visitDeclaration(declaration);
        }
        FunctionContext currentFunctionContext = getCurrentFunctionContext();
        if (currentFunctionContext != null) {
            UtilsKt.push(this.declarationContextStack, new FunctionLocalSymbol((IrSymbolOwner) declaration, currentFunctionContext));
        } else {
            UtilsKt.push(this.declarationContextStack, new SymbolOwnerContext((IrSymbolOwner) declaration));
        }
        IrStatement irStatementVisitDeclaration = super.visitDeclaration(declaration);
        UtilsKt.pop(this.declarationContextStack);
        return irStatementVisitDeclaration;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException */
    @NotNull
    public IrFile visitFile(@NotNull IrFile declaration) throws Exception {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        try {
            IrFile irFile = this.currentFile;
            IrClass irClass = this.composableSingletonsClass;
            try {
                this.currentFile = declaration;
                this.composableSingletonsClass = null;
                IrDeclarationContainer irDeclarationContainerVisitFile = super.visitFile(declaration);
                IrDeclaration irDeclaration = this.composableSingletonsClass;
                if (irDeclaration != null && (!irDeclaration.getDeclarations().isEmpty())) {
                    IrUtilsKt.addChild(irDeclarationContainerVisitFile, irDeclaration);
                }
                return irDeclarationContainerVisitFile;
            } finally {
                this.currentFile = irFile;
                this.composableSingletonsClass = irClass;
            }
        } catch (ProcessCanceledException e) {
            throw e;
        } catch (Exception e2) {
            throw new Exception(o00O00OO.OooO00o("IR lowering failed at: ", IrDeclarationsKt.getName(declaration)), e2);
        }
    }

    @NotNull
    public IrStatement visitFunction(@NotNull IrFunction declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        boolean allowsComposableCalls = getAllowsComposableCalls(declaration);
        FunctionContext functionContext = new FunctionContext(declaration, allowsComposableCalls, allowsComposableCalls && !declaration.isInline());
        UtilsKt.push(this.declarationContextStack, functionContext);
        IrStatement irStatementVisitFunction = super.visitFunction(declaration);
        UtilsKt.pop(this.declarationContextStack);
        if (AdditionalIrUtilsKt.isLocal((IrDeclaration) declaration)) {
            ComposerLambdaMemoizationKt.recordLocalDeclaration(this.declarationContextStack, functionContext);
        }
        return irStatementVisitFunction;
    }

    @NotNull
    public IrExpression visitFunctionExpression(@NotNull IrFunctionExpression expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        DeclarationContext declarationContext = (DeclarationContext) UtilsKt.peek(this.declarationContextStack);
        if (declarationContext == null) {
            return super.visitFunctionExpression(expression);
        }
        return getAllowsComposableCalls((IrFunction) expression.getFunction()) ? visitComposableFunctionExpression(expression, declarationContext) : visitNonComposableFunctionExpression(expression);
    }

    @NotNull
    public IrExpression visitFunctionReference(@NotNull IrFunctionReference expression) {
        IrVariable irVariableIrTemporary$default;
        IrVariable irVariableIrTemporary$default2;
        Intrinsics.checkNotNullParameter(expression, "expression");
        if (AdditionalIrUtilsKt.isLocal(expression.getSymbol().getOwner())) {
            ComposerLambdaMemoizationKt.recordLocalCapture(this.declarationContextStack, expression.getSymbol().getOwner());
        }
        IrExpression irExpressionVisitFunctionReference = super.visitFunctionReference(expression);
        FunctionContext currentFunctionContext = getCurrentFunctionContext();
        if (currentFunctionContext != null && expression.getValueArgumentsCount() == 0 && currentFunctionContext.getCanRemember()) {
            IrExpression dispatchReceiver = expression.getDispatchReceiver();
            IrExpression extensionReceiver = expression.getExtensionReceiver();
            if (!(dispatchReceiver == null && extensionReceiver == null) && isNullOrStable(dispatchReceiver) && isNullOrStable(extensionReceiver)) {
                IrBuilderWithScope declarationIrBuilder = new DeclarationIrBuilder(getContext(), currentFunctionContext.mo132getSymbol(), expression.getStartOffset(), expression.getEndOffset());
                IrStatementsBuilder irBlockBuilder = new IrBlockBuilder(declarationIrBuilder.getContext(), declarationIrBuilder.getScope(), declarationIrBuilder.getStartOffset(), declarationIrBuilder.getEndOffset(), (IrStatementOrigin) null, expression.getType(), false, 64, (DefaultConstructorMarker) null);
                ArrayList arrayList = new ArrayList();
                if (dispatchReceiver != null) {
                    irVariableIrTemporary$default = ExpressionHelpersKt.irTemporary$default(irBlockBuilder, dispatchReceiver, (String) null, (IrType) null, false, (IrDeclarationOrigin) null, 30, (Object) null);
                    arrayList.add(irVariableIrTemporary$default);
                } else {
                    irVariableIrTemporary$default = null;
                }
                if (extensionReceiver != null) {
                    irVariableIrTemporary$default2 = ExpressionHelpersKt.irTemporary$default(irBlockBuilder, extensionReceiver, (String) null, (IrType) null, false, (IrDeclarationOrigin) null, 30, (Object) null);
                    arrayList.add(irVariableIrTemporary$default2);
                } else {
                    irVariableIrTemporary$default2 = null;
                }
                IrFunctionReferenceImpl irFunctionReferenceImplCopyAttributes = IrDeclarationsKt.copyAttributes(new IrFunctionReferenceImpl(irBlockBuilder.getStartOffset(), irBlockBuilder.getEndOffset(), expression.getType(), expression.getSymbol(), expression.getTypeArgumentsCount(), expression.getValueArgumentsCount(), expression.getReflectionTarget(), (IrStatementOrigin) null, 128, (DefaultConstructorMarker) null), (IrAttributeContainer) expression);
                IrFunctionReferenceImpl irFunctionReferenceImpl = irFunctionReferenceImplCopyAttributes;
                irFunctionReferenceImpl.setDispatchReceiver((IrExpression) (irVariableIrTemporary$default != null ? ExpressionHelpersKt.irGet((IrBuilderWithScope) irBlockBuilder, (IrValueDeclaration) irVariableIrTemporary$default) : null));
                irFunctionReferenceImpl.setExtensionReceiver((IrExpression) (irVariableIrTemporary$default2 != null ? ExpressionHelpersKt.irGet((IrBuilderWithScope) irBlockBuilder, (IrValueDeclaration) irVariableIrTemporary$default2) : null));
                Unit unit = Unit.INSTANCE;
                irBlockBuilder.unaryPlus(rememberExpression(currentFunctionContext, (IrExpression) irFunctionReferenceImplCopyAttributes, arrayList));
                return irBlockBuilder.doBuild();
            }
            if (dispatchReceiver == null) {
                return rememberExpression(currentFunctionContext, irExpressionVisitFunctionReference, CollectionsKt.emptyList());
            }
        }
        return irExpressionVisitFunctionReference;
    }

    @NotNull
    public IrExpression visitValueAccess(@NotNull IrValueAccessExpression expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        ComposerLambdaMemoizationKt.recordCapture(this.declarationContextStack, expression.getSymbol().getOwner());
        return super.visitValueAccess(expression);
    }

    @NotNull
    public IrStatement visitVariable(@NotNull IrVariable declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        DeclarationContext declarationContext = (DeclarationContext) UtilsKt.peek(this.declarationContextStack);
        if (declarationContext != null) {
            declarationContext.declareLocal((IrValueDeclaration) declaration);
        }
        return super.visitVariable(declaration);
    }
}
