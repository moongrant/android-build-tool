package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeCallableIds;
import androidx.compose.compiler.plugins.kotlin.ComposeClassIds;
import androidx.compose.compiler.plugins.kotlin.ModuleMetrics;
import com.facebook.internal.security.CertificateUtil;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qiniu.android.collect.ReportItem;
import io.agora.rtc.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder;
import org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException;
import org.jetbrains.kotlin.descriptors.ClassKind;
import org.jetbrains.kotlin.descriptors.DescriptorVisibilities;
import org.jetbrains.kotlin.descriptors.DescriptorVisibility;
import org.jetbrains.kotlin.descriptors.FunctionDescriptor;
import org.jetbrains.kotlin.descriptors.Modality;
import org.jetbrains.kotlin.descriptors.SourceElement;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.SourceRangeInfo;
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
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationContainer;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationsKt;
import org.jetbrains.kotlin.ir.declarations.IrEnumEntry;
import org.jetbrains.kotlin.ir.declarations.IrFactory;
import org.jetbrains.kotlin.ir.declarations.IrField;
import org.jetbrains.kotlin.ir.declarations.IrFile;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.declarations.IrProperty;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.declarations.IrVariable;
import org.jetbrains.kotlin.ir.expressions.IrBlock;
import org.jetbrains.kotlin.ir.expressions.IrBlockBody;
import org.jetbrains.kotlin.ir.expressions.IrBody;
import org.jetbrains.kotlin.ir.expressions.IrBranch;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrCatch;
import org.jetbrains.kotlin.ir.expressions.IrComposite;
import org.jetbrains.kotlin.ir.expressions.IrConst;
import org.jetbrains.kotlin.ir.expressions.IrConstKind;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrElseBranch;
import org.jetbrains.kotlin.ir.expressions.IrEnumConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrExpressionBody;
import org.jetbrains.kotlin.ir.expressions.IrLoop;
import org.jetbrains.kotlin.ir.expressions.IrSetField;
import org.jetbrains.kotlin.ir.expressions.IrSetValue;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.expressions.IrStringConcatenation;
import org.jetbrains.kotlin.ir.expressions.IrTry;
import org.jetbrains.kotlin.ir.expressions.IrVararg;
import org.jetbrains.kotlin.ir.expressions.IrVarargElement;
import org.jetbrains.kotlin.ir.expressions.IrWhen;
import org.jetbrains.kotlin.ir.expressions.impl.IrBranchImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrConstImplKt;
import org.jetbrains.kotlin.ir.expressions.impl.IrConstructorCallImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrElseBranchImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol;
import org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.impl.IrSimpleFunctionSymbolImpl;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformer;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt;
import org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils;
import org.jetbrains.kotlin.name.Name;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ)\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001e0\"H\u0002¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 H\u0002J(\u0010,\u001a\u00020-2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u0002002\u0006\u0010&\u001a\u00020'H\u0002J\u0018\u00101\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020 2\u0006\u00102\u001a\u00020'H\u0002J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020 08H\u0016J!\u00109\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001e0\"H\u0002¢\u0006\u0002\u0010:J)\u00109\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001e0\"H\u0002¢\u0006\u0002\u0010#J\u0010\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020CH\u0016J\u0010\u0010E\u001a\u00020%2\u0006\u0010<\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u001aH\u0016J\u0010\u0010J\u001a\u00020%2\u0006\u0010<\u001a\u00020KH\u0016J\u0014\u0010L\u001a\u00020%2\n\u0010<\u001a\u0006\u0012\u0002\b\u00030MH\u0016J\u0010\u0010N\u001a\u00020%2\u0006\u0010<\u001a\u00020*H\u0016J\u0010\u0010O\u001a\u00020%2\u0006\u0010<\u001a\u00020PH\u0016J\u0010\u0010Q\u001a\u00020R2\u0006\u0010D\u001a\u00020RH\u0016J\u0010\u0010S\u001a\u00020%2\u0006\u0010<\u001a\u00020TH\u0016J\u0010\u0010U\u001a\u00020H2\u0006\u0010I\u001a\u00020VH\u0016J\u0010\u0010W\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u0012H\u0016J\u0010\u0010X\u001a\u00020%2\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010[\u001a\u00020H2\u0006\u0010I\u001a\u00020\\H\u0016J\u0010\u0010]\u001a\u00020%2\u0006\u0010<\u001a\u00020^H\u0016J\u0010\u0010_\u001a\u00020%2\u0006\u0010<\u001a\u00020`H\u0016J\u0010\u0010a\u001a\u00020H2\u0006\u0010I\u001a\u00020-H\u0016J\u0010\u0010b\u001a\u00020%2\u0006\u0010<\u001a\u00020cH\u0016J\u0010\u0010d\u001a\u00020%2\u0006\u0010e\u001a\u00020fH\u0016J\u0010\u0010g\u001a\u00020H2\u0006\u0010I\u001a\u00020hH\u0016J\u0010\u0010i\u001a\u00020%2\u0006\u0010<\u001a\u00020jH\u0016J\u0010\u0010k\u001a\u00020H2\u0006\u0010I\u001a\u00020lH\u0016J\u0010\u0010m\u001a\u00020%2\u0006\u0010<\u001a\u00020nH\u0016J+\u0010o\u001a\u00020-*\u00020\\2\u0019\b\u0002\u0010p\u001a\u0013\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u0002040q¢\u0006\u0002\bsH\u0086\bø\u0001\u0000J\f\u0010t\u001a\u00020 *\u00020uH\u0002J\u0012\u0010v\u001a\u00020-*\u00020w2\u0006\u0010p\u001a\u00020rJ\f\u0010x\u001a\u00020\u0004*\u00020yH\u0002R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006z"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/LiveLiteralTransformer;", "Landroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLowering;", "Landroidx/compose/compiler/plugins/kotlin/lower/ModuleLoweringPass;", "liveLiteralsEnabled", "", "usePerFileEnabledFlag", "keyVisitor", "Landroidx/compose/compiler/plugins/kotlin/lower/DurableKeyVisitor;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "(ZZLandroidx/compose/compiler/plugins/kotlin/lower/DurableKeyVisitor;Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;)V", "NoLiveLiteralsAnnotation", "Lorg/jetbrains/kotlin/ir/symbols/IrClassSymbol;", "currentFile", "Lorg/jetbrains/kotlin/ir/declarations/IrFile;", "isLiveLiteralsEnabled", "Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;", "liveLiteral", "Lorg/jetbrains/kotlin/ir/symbols/IrSimpleFunctionSymbol;", "liveLiteralFileInfoAnnotation", "liveLiteralInfoAnnotation", "liveLiteralsClass", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "liveLiteralsEnabledSymbol", "stateInterface", "enter", "T", "key", "", ReportItem.LogTypeBlock, "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "irGetLiveLiteralsClass", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "startOffset", "", "endOffset", "irLiveLiteralFileInfoAnnotation", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", ShareInternalUtility.STAGING_PARAM, "irLiveLiteralGetter", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "literalValue", "literalType", "Lorg/jetbrains/kotlin/ir/types/IrType;", "irLiveLiteralInfoAnnotation", "offset", "lower", "", "module", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "makeKeySet", "", "siblings", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "visitBlock", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrBlock;", "visitBlockBody", "Lorg/jetbrains/kotlin/ir/expressions/IrBody;", "body", "Lorg/jetbrains/kotlin/ir/expressions/IrBlockBody;", "visitBranch", "Lorg/jetbrains/kotlin/ir/expressions/IrBranch;", "branch", "visitCall", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "visitClass", "Lorg/jetbrains/kotlin/ir/IrStatement;", "declaration", "visitComposite", "Lorg/jetbrains/kotlin/ir/expressions/IrComposite;", "visitConst", "Lorg/jetbrains/kotlin/ir/expressions/IrConst;", "visitConstructorCall", "visitDelegatingConstructorCall", "Lorg/jetbrains/kotlin/ir/expressions/IrDelegatingConstructorCall;", "visitElseBranch", "Lorg/jetbrains/kotlin/ir/expressions/IrElseBranch;", "visitEnumConstructorCall", "Lorg/jetbrains/kotlin/ir/expressions/IrEnumConstructorCall;", "visitEnumEntry", "Lorg/jetbrains/kotlin/ir/declarations/IrEnumEntry;", "visitFile", "visitLoop", "loop", "Lorg/jetbrains/kotlin/ir/expressions/IrLoop;", "visitProperty", "Lorg/jetbrains/kotlin/ir/declarations/IrProperty;", "visitSetField", "Lorg/jetbrains/kotlin/ir/expressions/IrSetField;", "visitSetValue", "Lorg/jetbrains/kotlin/ir/expressions/IrSetValue;", "visitSimpleFunction", "visitStringConcatenation", "Lorg/jetbrains/kotlin/ir/expressions/IrStringConcatenation;", "visitTry", "aTry", "Lorg/jetbrains/kotlin/ir/expressions/IrTry;", "visitValueParameter", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "visitVararg", "Lorg/jetbrains/kotlin/ir/expressions/IrVararg;", "visitVariable", "Lorg/jetbrains/kotlin/ir/declarations/IrVariable;", "visitWhen", "Lorg/jetbrains/kotlin/ir/expressions/IrWhen;", "addSetter", "builder", "Lkotlin/Function1;", "Lorg/jetbrains/kotlin/ir/builders/declarations/IrFunctionBuilder;", "Lkotlin/ExtensionFunctionType;", "asJvmFriendlyString", "Lorg/jetbrains/kotlin/name/Name;", "buildFunction", "Lorg/jetbrains/kotlin/ir/declarations/IrFactory;", "hasNoLiveLiteralsAnnotation", "Lorg/jetbrains/kotlin/ir/declarations/IrAnnotationContainer;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLiveLiteralTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveLiteralTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/LiveLiteralTransformer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 declarationBuilders.kt\norg/jetbrains/kotlin/ir/builders/declarations/DeclarationBuildersKt\n+ 4 ExpressionHelpers.kt\norg/jetbrains/kotlin/ir/builders/ExpressionHelpersKt\n+ 5 IrBuilder.kt\norg/jetbrains/kotlin/ir/builders/IrBlockBodyBuilder\n+ 6 IrBuilder.kt\norg/jetbrains/kotlin/ir/builders/IrBlockBuilder\n+ 7 AbstractComposeLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLoweringKt\n*L\n1#1,902:1\n883#1,8:978\n1747#2,3:903\n98#3:906\n92#3,10:907\n55#3,4:917\n104#3,9:921\n98#3:942\n92#3,10:943\n55#3,4:953\n104#3,9:957\n405#4,10:930\n405#4,10:966\n405#4,10:986\n405#4,10:998\n377#4,13:1009\n72#5,2:940\n72#5,2:976\n72#5,2:996\n72#5:1008\n73#5:1024\n98#6,2:1022\n1146#7,6:1025\n*S KotlinDebug\n*F\n+ 1 LiveLiteralTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/LiveLiteralTransformer\n*L\n307#1:978,8\n186#1:903,3\n250#1:906\n250#1:907,10\n254#1:917,4\n268#1:921,9\n281#1:942\n281#1:943,10\n286#1:953,4\n295#1:957,9\n276#1:930,10\n303#1:966,10\n316#1:986,10\n327#1:998,10\n356#1:1009,13\n276#1:940,2\n303#1:976,2\n316#1:996,2\n327#1:1008\n327#1:1024\n356#1:1022,2\n473#1:1025,6\n*E\n"})
public class LiveLiteralTransformer extends AbstractComposeLowering {

    @NotNull
    private final IrClassSymbol NoLiveLiteralsAnnotation;

    @Nullable
    private IrFile currentFile;

    @NotNull
    private final IrFunctionSymbol isLiveLiteralsEnabled;

    @NotNull
    private final DurableKeyVisitor keyVisitor;

    @NotNull
    private final IrSimpleFunctionSymbol liveLiteral;

    @NotNull
    private final IrClassSymbol liveLiteralFileInfoAnnotation;

    @NotNull
    private final IrClassSymbol liveLiteralInfoAnnotation;

    @Nullable
    private IrClass liveLiteralsClass;
    private final boolean liveLiteralsEnabled;

    @Nullable
    private IrSimpleFunctionSymbol liveLiteralsEnabledSymbol;

    @NotNull
    private final IrClassSymbol stateInterface;
    private final boolean usePerFileEnabledFlag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLiteralTransformer(boolean z, boolean z2, @NotNull DurableKeyVisitor keyVisitor, @NotNull IrPluginContext context, @NotNull DeepCopySymbolRemapper symbolRemapper, @NotNull ModuleMetrics metrics) {
        super(context, symbolRemapper, metrics);
        Intrinsics.checkNotNullParameter(keyVisitor, "keyVisitor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(symbolRemapper, "symbolRemapper");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.liveLiteralsEnabled = z;
        this.usePerFileEnabledFlag = z2;
        this.keyVisitor = keyVisitor;
        ComposeCallableIds composeCallableIds = ComposeCallableIds.INSTANCE;
        this.liveLiteral = getTopLevelFunction(composeCallableIds.getLiveLiteral());
        this.isLiveLiteralsEnabled = getTopLevelPropertyGetter(composeCallableIds.isLiveLiteralsEnabled());
        ComposeClassIds composeClassIds = ComposeClassIds.INSTANCE;
        this.liveLiteralInfoAnnotation = getTopLevelClass(composeClassIds.getLiveLiteralInfo());
        this.liveLiteralFileInfoAnnotation = getTopLevelClass(composeClassIds.getLiveLiteralFileInfo());
        this.stateInterface = getTopLevelClass(composeClassIds.getState());
        this.NoLiveLiteralsAnnotation = getTopLevelClass(composeClassIds.getNoLiveLiterals());
    }

    public static /* synthetic */ IrSimpleFunction addSetter$default(LiveLiteralTransformer liveLiteralTransformer, IrProperty irProperty, Function1 builder, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSetter");
        }
        if ((i & 1) != 0) {
            builder = new Function1<IrFunctionBuilder, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.addSetter.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IrFunctionBuilder irFunctionBuilder) {
                    Intrinsics.checkNotNullParameter(irFunctionBuilder, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IrFunctionBuilder irFunctionBuilder) {
                    invoke2(irFunctionBuilder);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(irProperty, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        IrFunctionBuilder irFunctionBuilder = new IrFunctionBuilder();
        Name nameSpecial = Name.special("<set-" + irProperty.getName() + ">");
        Intrinsics.checkNotNullExpressionValue(nameSpecial, "special(\"<set-${this@addSetter.name}>\")");
        irFunctionBuilder.setName(nameSpecial);
        builder.invoke(irFunctionBuilder);
        IrSimpleFunction irSimpleFunctionBuildFunction = liveLiteralTransformer.buildFunction(liveLiteralTransformer.getContext().getIrFactory(), irFunctionBuilder);
        irProperty.setSetter(irSimpleFunctionBuildFunction);
        irSimpleFunctionBuildFunction.setParent(irProperty.getParent());
        return irSimpleFunctionBuildFunction;
    }

    private final String asJvmFriendlyString(Name name) {
        if (name.isSpecial()) {
            String strAsString = name.asString();
            Intrinsics.checkNotNullExpressionValue(strAsString, "asString()");
            return StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(strAsString, Typography.less, Typography.dollar, false, 4, (Object) null), Typography.greater, Typography.dollar, false, 4, (Object) null), ' ', '-', false, 4, (Object) null);
        }
        String identifier = name.getIdentifier();
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier");
        return identifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T enter(String key, Function0<? extends T> block) {
        return (T) this.keyVisitor.enter(key, block);
    }

    private final boolean hasNoLiveLiteralsAnnotation(IrAnnotationContainer irAnnotationContainer) {
        List annotations = irAnnotationContainer.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((IrConstructorCall) it.next()).getSymbol().getOwner(), IrUtilsKt.getPrimaryConstructor(this.NoLiveLiteralsAnnotation.getOwner()))) {
                return true;
            }
        }
        return false;
    }

    private final IrExpression irGetLiveLiteralsClass(int startOffset, int endOffset) {
        IrClass irClass = this.liveLiteralsClass;
        Intrinsics.checkNotNull(irClass);
        IrType defaultType = IrUtilsKt.getDefaultType(irClass);
        IrClass irClass2 = this.liveLiteralsClass;
        Intrinsics.checkNotNull(irClass2);
        return new IrGetObjectValueImpl(startOffset, endOffset, defaultType, irClass2.getSymbol());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IrConstructorCall irLiveLiteralFileInfoAnnotation(String file) {
        IrConstructorCall irConstructorCallImpl = new IrConstructorCallImpl(-1, -1, IrTypesKt.getDefaultType(this.liveLiteralFileInfoAnnotation), (IrConstructorSymbol) SequencesKt.single(IrUtilsKt.getConstructors(this.liveLiteralFileInfoAnnotation)), 0, 0, 1, (IrStatementOrigin) null, (SourceElement) null, 384, (DefaultConstructorMarker) null);
        irConstructorCallImpl.putValueArgument(0, irConst(file));
        return irConstructorCallImpl;
    }

    private final IrSimpleFunction irLiveLiteralGetter(String key, IrExpression literalValue, IrType literalType, int startOffset) {
        IrExpression irExpressionIrNot;
        IrDeclarationParent irDeclarationParent = this.liveLiteralsClass;
        Intrinsics.checkNotNull(irDeclarationParent);
        IrType irTypeMakeNullable = IrTypesKt.makeNullable(IrTypesKt.typeWith(this.stateInterface.getOwner(), new IrType[]{literalType}));
        IrSimpleFunctionSymbol propertyGetter = AdditionalIrUtilsKt.getPropertyGetter(this.stateInterface, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNull(propertyGetter);
        IrFactory factory = irDeclarationParent.getFactory();
        IrPropertyBuilder irPropertyBuilder = new IrPropertyBuilder();
        Name nameIdentifier = Name.identifier(key);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(key)");
        irPropertyBuilder.setName(nameIdentifier);
        DescriptorVisibility PRIVATE = DescriptorVisibilities.PRIVATE;
        Intrinsics.checkNotNullExpressionValue(PRIVATE, "PRIVATE");
        irPropertyBuilder.setVisibility(PRIVATE);
        IrProperty irPropertyBuildProperty = DeclarationBuildersKt.buildProperty(factory, irPropertyBuilder);
        irDeclarationParent.getDeclarations().add(irPropertyBuildProperty);
        IrDeclarationParent irDeclarationParent2 = irDeclarationParent;
        irPropertyBuildProperty.setParent(irDeclarationParent2);
        IrFactory irFactory = getContext().getIrFactory();
        IrFieldBuilder irFieldBuilder = new IrFieldBuilder();
        Name nameIdentifier2 = Name.identifier(key);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(key)");
        irFieldBuilder.setName(nameIdentifier2);
        irFieldBuilder.setStatic(true);
        irFieldBuilder.setType(literalType);
        DescriptorVisibility PRIVATE2 = DescriptorVisibilities.PRIVATE;
        Intrinsics.checkNotNullExpressionValue(PRIVATE2, "PRIVATE");
        irFieldBuilder.setVisibility(PRIVATE2);
        IrField irFieldBuildField = DeclarationBuildersKt.buildField(irFactory, irFieldBuilder);
        irFieldBuildField.setCorrespondingPropertySymbol(irPropertyBuildProperty.getSymbol());
        irFieldBuildField.setParent(irDeclarationParent2);
        irFieldBuildField.setInitializer(new IrExpressionBodyImpl(-2, -2, literalValue));
        irPropertyBuildProperty.setBackingField(irFieldBuildField);
        IrFunctionBuilder irFunctionBuilder = new IrFunctionBuilder();
        Name nameSpecial = Name.special("<get-" + irPropertyBuildProperty.getName() + Typography.greater);
        Intrinsics.checkNotNullExpressionValue(nameSpecial, "special(\"<get-${this@addGetter.name}>\")");
        irFunctionBuilder.setName(nameSpecial);
        irFunctionBuilder.setReturnType(literalType);
        DescriptorVisibility PRIVATE3 = DescriptorVisibilities.PRIVATE;
        Intrinsics.checkNotNullExpressionValue(PRIVATE3, "PRIVATE");
        irFunctionBuilder.setVisibility(PRIVATE3);
        irFunctionBuilder.setOrigin(IrDeclarationOrigin.DEFAULT_PROPERTY_ACCESSOR.INSTANCE);
        IrFunction irFunctionBuildFunction = DeclarationBuildersKt.buildFunction(irPropertyBuildProperty.getFactory(), irFunctionBuilder);
        irPropertyBuildProperty.setGetter(irFunctionBuildFunction);
        irFunctionBuildFunction.setCorrespondingPropertySymbol(irPropertyBuildProperty.getSymbol());
        irFunctionBuildFunction.setParent(irPropertyBuildProperty.getParent());
        irFunctionBuildFunction.setCorrespondingPropertySymbol(irPropertyBuildProperty.getSymbol());
        IrValueParameter thisReceiver = irDeclarationParent.getThisReceiver();
        Intrinsics.checkNotNull(thisReceiver);
        IrValueDeclaration irValueDeclarationCopyTo$default = IrUtilsKt.copyTo$default(thisReceiver, irFunctionBuildFunction, (IrDeclarationOrigin) null, 0, 0, 0, (Name) null, (Map) null, (IrType) null, (IrType) null, (IrExpressionBody) null, false, false, false, 8190, (Object) null);
        irFunctionBuildFunction.setDispatchReceiverParameter(irValueDeclarationCopyTo$default);
        IrBuilderWithScope declarationIrBuilder = new DeclarationIrBuilder(getContext(), irFunctionBuildFunction.getSymbol(), 0, 0, 12, (DefaultConstructorMarker) null);
        IrBuilderWithScope irBlockBodyBuilder = new IrBlockBodyBuilder(declarationIrBuilder.getContext(), declarationIrBuilder.getScope(), declarationIrBuilder.getStartOffset(), declarationIrBuilder.getEndOffset());
        IrBuilderWithScope irBuilderWithScope = irBlockBodyBuilder;
        IrExpression irExpressionIrGet = ExpressionHelpersKt.irGet(irBuilderWithScope, irValueDeclarationCopyTo$default);
        IrField backingField = irPropertyBuildProperty.getBackingField();
        Intrinsics.checkNotNull(backingField);
        irBlockBodyBuilder.unaryPlus(ExpressionHelpersKt.irReturn(irBuilderWithScope, ExpressionHelpersKt.irGetField$default(irBuilderWithScope, irExpressionIrGet, backingField, (IrType) null, 4, (Object) null)));
        irFunctionBuildFunction.setBody(irBlockBodyBuilder.doBuild());
        IrFactory factory2 = irDeclarationParent.getFactory();
        IrPropertyBuilder irPropertyBuilder2 = new IrPropertyBuilder();
        Name nameIdentifier3 = Name.identifier(o00O00OO.OooO00o("State$", key));
        Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(\"State\\$$key\")");
        irPropertyBuilder2.setName(nameIdentifier3);
        DescriptorVisibility PRIVATE4 = DescriptorVisibilities.PRIVATE;
        Intrinsics.checkNotNullExpressionValue(PRIVATE4, "PRIVATE");
        irPropertyBuilder2.setVisibility(PRIVATE4);
        irPropertyBuilder2.setVar(true);
        IrProperty irPropertyBuildProperty2 = DeclarationBuildersKt.buildProperty(factory2, irPropertyBuilder2);
        irDeclarationParent.getDeclarations().add(irPropertyBuildProperty2);
        irPropertyBuildProperty2.setParent(irDeclarationParent2);
        IrFactory irFactory2 = getContext().getIrFactory();
        IrFieldBuilder irFieldBuilder2 = new IrFieldBuilder();
        Name nameIdentifier4 = Name.identifier(o00O00OO.OooO00o("State$", key));
        Intrinsics.checkNotNullExpressionValue(nameIdentifier4, "identifier(\"State\\$$key\")");
        irFieldBuilder2.setName(nameIdentifier4);
        irFieldBuilder2.setType(irTypeMakeNullable);
        DescriptorVisibility PRIVATE5 = DescriptorVisibilities.PRIVATE;
        Intrinsics.checkNotNullExpressionValue(PRIVATE5, "PRIVATE");
        irFieldBuilder2.setVisibility(PRIVATE5);
        irFieldBuilder2.setStatic(true);
        IrField irFieldBuildField2 = DeclarationBuildersKt.buildField(irFactory2, irFieldBuilder2);
        irFieldBuildField2.setCorrespondingPropertySymbol(irPropertyBuildProperty2.getSymbol());
        irFieldBuildField2.setParent(irDeclarationParent2);
        irPropertyBuildProperty2.setBackingField(irFieldBuildField2);
        IrFunctionBuilder irFunctionBuilder2 = new IrFunctionBuilder();
        Name nameSpecial2 = Name.special("<get-" + irPropertyBuildProperty2.getName() + Typography.greater);
        Intrinsics.checkNotNullExpressionValue(nameSpecial2, "special(\"<get-${this@addGetter.name}>\")");
        irFunctionBuilder2.setName(nameSpecial2);
        irFunctionBuilder2.setReturnType(irTypeMakeNullable);
        DescriptorVisibility PRIVATE6 = DescriptorVisibilities.PRIVATE;
        Intrinsics.checkNotNullExpressionValue(PRIVATE6, "PRIVATE");
        irFunctionBuilder2.setVisibility(PRIVATE6);
        irFunctionBuilder2.setOrigin(IrDeclarationOrigin.DEFAULT_PROPERTY_ACCESSOR.INSTANCE);
        IrFunction irFunctionBuildFunction2 = DeclarationBuildersKt.buildFunction(irPropertyBuildProperty2.getFactory(), irFunctionBuilder2);
        irPropertyBuildProperty2.setGetter(irFunctionBuildFunction2);
        irFunctionBuildFunction2.setCorrespondingPropertySymbol(irPropertyBuildProperty2.getSymbol());
        irFunctionBuildFunction2.setParent(irPropertyBuildProperty2.getParent());
        irFunctionBuildFunction2.setCorrespondingPropertySymbol(irPropertyBuildProperty2.getSymbol());
        IrValueParameter thisReceiver2 = irDeclarationParent.getThisReceiver();
        Intrinsics.checkNotNull(thisReceiver2);
        IrValueDeclaration irValueDeclarationCopyTo$default2 = IrUtilsKt.copyTo$default(thisReceiver2, irFunctionBuildFunction2, (IrDeclarationOrigin) null, 0, 0, 0, (Name) null, (Map) null, (IrType) null, (IrType) null, (IrExpressionBody) null, false, false, false, 8190, (Object) null);
        irFunctionBuildFunction2.setDispatchReceiverParameter(irValueDeclarationCopyTo$default2);
        IrBuilderWithScope declarationIrBuilder2 = new DeclarationIrBuilder(getContext(), irFunctionBuildFunction2.getSymbol(), 0, 0, 12, (DefaultConstructorMarker) null);
        IrBuilderWithScope irBlockBodyBuilder2 = new IrBlockBodyBuilder(declarationIrBuilder2.getContext(), declarationIrBuilder2.getScope(), declarationIrBuilder2.getStartOffset(), declarationIrBuilder2.getEndOffset());
        IrBuilderWithScope irBuilderWithScope2 = irBlockBodyBuilder2;
        IrExpression irExpressionIrGet2 = ExpressionHelpersKt.irGet(irBuilderWithScope2, irValueDeclarationCopyTo$default2);
        IrField backingField2 = irPropertyBuildProperty2.getBackingField();
        Intrinsics.checkNotNull(backingField2);
        irBlockBodyBuilder2.unaryPlus(ExpressionHelpersKt.irReturn(irBuilderWithScope2, ExpressionHelpersKt.irGetField$default(irBuilderWithScope2, irExpressionIrGet2, backingField2, (IrType) null, 4, (Object) null)));
        irFunctionBuildFunction2.setBody(irBlockBodyBuilder2.doBuild());
        IrFunctionBuilder irFunctionBuilder3 = new IrFunctionBuilder();
        Name nameSpecial3 = Name.special("<set-" + irPropertyBuildProperty2.getName() + ">");
        Intrinsics.checkNotNullExpressionValue(nameSpecial3, "special(\"<set-${this@addSetter.name}>\")");
        irFunctionBuilder3.setName(nameSpecial3);
        irFunctionBuilder3.setReturnType(getContext().getIrBuiltIns().getUnitType());
        DescriptorVisibility PRIVATE7 = DescriptorVisibilities.PRIVATE;
        Intrinsics.checkNotNullExpressionValue(PRIVATE7, "PRIVATE");
        irFunctionBuilder3.setVisibility(PRIVATE7);
        irFunctionBuilder3.setOrigin(IrDeclarationOrigin.DEFAULT_PROPERTY_ACCESSOR.INSTANCE);
        IrFunction irFunctionBuildFunction3 = buildFunction(getContext().getIrFactory(), irFunctionBuilder3);
        irPropertyBuildProperty2.setSetter(irFunctionBuildFunction3);
        irFunctionBuildFunction3.setParent(irPropertyBuildProperty2.getParent());
        irFunctionBuildFunction3.setCorrespondingPropertySymbol(irPropertyBuildProperty2.getSymbol());
        IrValueParameter thisReceiver3 = irDeclarationParent.getThisReceiver();
        Intrinsics.checkNotNull(thisReceiver3);
        IrFunction irFunction = irFunctionBuildFunction3;
        IrValueDeclaration irValueDeclarationCopyTo$default3 = IrUtilsKt.copyTo$default(thisReceiver3, irFunction, (IrDeclarationOrigin) null, 0, 0, 0, (Name) null, (Map) null, (IrType) null, (IrType) null, (IrExpressionBody) null, false, false, false, 8190, (Object) null);
        irFunctionBuildFunction3.setDispatchReceiverParameter(irValueDeclarationCopyTo$default3);
        IrValueDeclaration irValueDeclarationAddValueParameter$default = DeclarationBuildersKt.addValueParameter$default(irFunction, AppMeasurementSdk.ConditionalUserProperty.VALUE, irTypeMakeNullable, (IrDeclarationOrigin) null, 4, (Object) null);
        IrBuilderWithScope declarationIrBuilder3 = new DeclarationIrBuilder(getContext(), irFunctionBuildFunction3.getSymbol(), 0, 0, 12, (DefaultConstructorMarker) null);
        IrBuilderWithScope irBlockBodyBuilder3 = new IrBlockBodyBuilder(declarationIrBuilder3.getContext(), declarationIrBuilder3.getScope(), declarationIrBuilder3.getStartOffset(), declarationIrBuilder3.getEndOffset());
        IrBuilderWithScope irBuilderWithScope3 = irBlockBodyBuilder3;
        IrExpression irExpressionIrGet3 = ExpressionHelpersKt.irGet(irBuilderWithScope3, irValueDeclarationCopyTo$default3);
        IrField backingField3 = irPropertyBuildProperty2.getBackingField();
        Intrinsics.checkNotNull(backingField3);
        irBlockBodyBuilder3.unaryPlus(ExpressionHelpersKt.irSetField$default(irBuilderWithScope3, irExpressionIrGet3, backingField3, ExpressionHelpersKt.irGet(irBuilderWithScope3, irValueDeclarationAddValueParameter$default), (IrStatementOrigin) null, 8, (Object) null));
        irFunctionBuildFunction3.setBody(irBlockBodyBuilder3.doBuild());
        IrSimpleFunction irSimpleFunctionAddFunction$default = DeclarationBuildersKt.addFunction$default(irDeclarationParent, key, literalType, (Modality) null, (DescriptorVisibility) null, false, false, false, (IrDeclarationOrigin) null, 0, 0, Constants.WARN_ADM_PLAYOUT_ABNORMAL_FREQUENCY, (Object) null);
        IrValueDeclaration dispatchReceiverParameter = irSimpleFunctionAddFunction$default.getDispatchReceiverParameter();
        Intrinsics.checkNotNull(dispatchReceiverParameter);
        irSimpleFunctionAddFunction$default.setAnnotations(CollectionsKt.plus((Collection<? extends IrConstructorCall>) irSimpleFunctionAddFunction$default.getAnnotations(), irLiveLiteralInfoAnnotation(key, startOffset)));
        IrBuilderWithScope declarationIrBuilder4 = new DeclarationIrBuilder(getContext(), irSimpleFunctionAddFunction$default.getSymbol(), 0, 0, 12, (DefaultConstructorMarker) null);
        IrBuilderWithScope irBlockBodyBuilder4 = new IrBlockBodyBuilder(declarationIrBuilder4.getContext(), declarationIrBuilder4.getScope(), declarationIrBuilder4.getStartOffset(), declarationIrBuilder4.getEndOffset());
        if (this.usePerFileEnabledFlag) {
            IrBuilderWithScope irBuilderWithScope4 = irBlockBodyBuilder4;
            IrType booleanType = getBuiltIns().getBooleanType();
            IrExpression irExpressionIrGet4 = ExpressionHelpersKt.irGet(irBuilderWithScope4, dispatchReceiverParameter);
            IrFunctionSymbol irFunctionSymbol = this.liveLiteralsEnabledSymbol;
            Intrinsics.checkNotNull(irFunctionSymbol);
            irExpressionIrNot = irNot((IrExpression) ExpressionHelpersKt.irGet(irBuilderWithScope4, booleanType, irExpressionIrGet4, irFunctionSymbol));
        } else {
            irExpressionIrNot = irNot((IrExpression) ExpressionHelpersKt.irCall(irBlockBodyBuilder4, this.isLiveLiteralsEnabled));
        }
        IrBuilderWithScope irBuilderWithScope5 = irBlockBodyBuilder4;
        IrValueDeclaration irValueDeclaration = dispatchReceiverParameter;
        IrExpression irExpressionIrGet5 = ExpressionHelpersKt.irGet(irBuilderWithScope5, irValueDeclaration);
        IrSimpleFunction getter = irPropertyBuildProperty.getGetter();
        Intrinsics.checkNotNull(getter);
        irBlockBodyBuilder4.unaryPlus(irIf(irExpressionIrNot, (IrExpression) ExpressionHelpersKt.irReturn(irBuilderWithScope5, ExpressionHelpersKt.irGet(irBuilderWithScope5, literalType, irExpressionIrGet5, getter.getSymbol()))));
        IrExpression irExpressionIrGet6 = ExpressionHelpersKt.irGet(irBuilderWithScope5, irValueDeclaration);
        IrSimpleFunction getter2 = irPropertyBuildProperty2.getGetter();
        Intrinsics.checkNotNull(getter2);
        IrValueDeclaration irValueDeclarationIrTemporary$default = ExpressionHelpersKt.irTemporary$default((IrStatementsBuilder) irBlockBodyBuilder4, ExpressionHelpersKt.irGet(irBuilderWithScope5, irTypeMakeNullable, irExpressionIrGet6, getter2.getSymbol()), (String) null, (IrType) null, false, (IrDeclarationOrigin) null, 30, (Object) null);
        IrExpression irExpressionIrGet7 = ExpressionHelpersKt.irGet(irBuilderWithScope5, irValueDeclarationIrTemporary$default);
        IrStatementsBuilder irBlockBuilder = new IrBlockBuilder(irBuilderWithScope5.getContext(), irBuilderWithScope5.getScope(), irBuilderWithScope5.getStartOffset(), irBuilderWithScope5.getEndOffset(), (IrStatementOrigin) null, irTypeMakeNullable, false, 64, (DefaultConstructorMarker) null);
        IrBuilderWithScope irBuilderWithScope6 = (IrBuilderWithScope) irBlockBuilder;
        IrExpression irExpressionIrCall = ExpressionHelpersKt.irCall(irBuilderWithScope6, this.liveLiteral);
        irExpressionIrCall.putValueArgument(0, ExpressionHelpersKt.irString(irBuilderWithScope6, key));
        IrExpression irExpressionIrGet8 = ExpressionHelpersKt.irGet(irBuilderWithScope6, irValueDeclaration);
        IrSimpleFunction getter3 = irPropertyBuildProperty.getGetter();
        Intrinsics.checkNotNull(getter3);
        irExpressionIrCall.putValueArgument(1, ExpressionHelpersKt.irGet(irBuilderWithScope6, literalType, irExpressionIrGet8, getter3.getSymbol()));
        irExpressionIrCall.putTypeArgument(0, literalType);
        IrValueDeclaration irValueDeclarationIrTemporary$default2 = ExpressionHelpersKt.irTemporary$default(irBlockBuilder, irExpressionIrCall, (String) null, (IrType) null, false, (IrDeclarationOrigin) null, 30, (Object) null);
        IrExpression irExpressionIrGet9 = ExpressionHelpersKt.irGet(irBuilderWithScope6, irValueDeclaration);
        IrSimpleFunction setter = irPropertyBuildProperty2.getSetter();
        Intrinsics.checkNotNull(setter);
        IrValueDeclaration irValueDeclaration2 = irValueDeclarationIrTemporary$default2;
        irBlockBuilder.unaryPlus(ExpressionHelpersKt.irSet(irBuilderWithScope6, irTypeMakeNullable, irExpressionIrGet9, setter.getSymbol(), ExpressionHelpersKt.irGet(irBuilderWithScope6, irValueDeclaration2)));
        irBlockBuilder.unaryPlus(ExpressionHelpersKt.irGet(irBuilderWithScope6, irValueDeclaration2));
        Unit unit = Unit.INSTANCE;
        IrExpression irExpressionIrIfNull = ExpressionHelpersKt.irIfNull(irBuilderWithScope5, irTypeMakeNullable, irExpressionIrGet7, irBlockBuilder.doBuild(), ExpressionHelpersKt.irGet(irBuilderWithScope5, irValueDeclarationIrTemporary$default));
        IrExpression irCallImpl = new IrCallImpl(-1, -1, literalType, propertyGetter, propertyGetter.getOwner().getTypeParameters().size(), propertyGetter.getOwner().getValueParameters().size(), IrStatementOrigin.FOR_LOOP_ITERATOR.INSTANCE, (IrClassSymbol) null, 128, (DefaultConstructorMarker) null);
        irCallImpl.setDispatchReceiver(irExpressionIrIfNull);
        irBlockBodyBuilder4.unaryPlus(ExpressionHelpersKt.irReturn(irBuilderWithScope5, irCallImpl));
        irSimpleFunctionAddFunction$default.setBody(irBlockBodyBuilder4.doBuild());
        return irSimpleFunctionAddFunction$default;
    }

    private final IrConstructorCall irLiveLiteralInfoAnnotation(String key, int offset) {
        IrConstructorCall irConstructorCallImpl = new IrConstructorCallImpl(-1, -1, IrTypesKt.getDefaultType(this.liveLiteralInfoAnnotation), (IrConstructorSymbol) SequencesKt.single(IrUtilsKt.getConstructors(this.liveLiteralInfoAnnotation)), 0, 0, 2, (IrStatementOrigin) null, (SourceElement) null, 384, (DefaultConstructorMarker) null);
        irConstructorCallImpl.putValueArgument(0, irConst(key));
        irConstructorCallImpl.putValueArgument(1, irConst(offset));
        return irConstructorCallImpl;
    }

    private final <T> T siblings(String key, Function0<? extends T> block) {
        return (T) this.keyVisitor.siblings(key, block);
    }

    @NotNull
    public final IrSimpleFunction addSetter(@NotNull IrProperty irProperty, @NotNull Function1<? super IrFunctionBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(irProperty, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        IrFunctionBuilder irFunctionBuilder = new IrFunctionBuilder();
        Name nameSpecial = Name.special("<set-" + irProperty.getName() + ">");
        Intrinsics.checkNotNullExpressionValue(nameSpecial, "special(\"<set-${this@addSetter.name}>\")");
        irFunctionBuilder.setName(nameSpecial);
        builder.invoke(irFunctionBuilder);
        IrSimpleFunction irSimpleFunctionBuildFunction = buildFunction(getContext().getIrFactory(), irFunctionBuilder);
        irProperty.setSetter(irSimpleFunctionBuildFunction);
        irSimpleFunctionBuildFunction.setParent(irProperty.getParent());
        return irSimpleFunctionBuildFunction;
    }

    @NotNull
    public final IrSimpleFunction buildFunction(@NotNull IrFactory irFactory, @NotNull IrFunctionBuilder builder) {
        Intrinsics.checkNotNullParameter(irFactory, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        return irFactory.createFunction(builder.getStartOffset(), builder.getEndOffset(), builder.getOrigin(), new IrSimpleFunctionSymbolImpl((FunctionDescriptor) null, 1, (DefaultConstructorMarker) null), builder.getName(), builder.getVisibility(), builder.getModality(), builder.getReturnType(), builder.isInline(), builder.isExternal(), builder.isTailrec(), builder.isSuspend(), builder.isOperator(), builder.isInfix(), builder.isExpect(), builder.isFakeOverride(), builder.getContainerSource());
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.ModuleLoweringPass
    public void lower(@NotNull IrModuleFragment module) {
        Intrinsics.checkNotNullParameter(module, "module");
        IrElementTransformerVoidKt.transformChildrenVoid((IrElement) module, this);
    }

    @NotNull
    public Set<String> makeKeySet() {
        return new LinkedHashSet();
    }

    @NotNull
    public IrExpression visitBlock(@NotNull final IrBlock expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrStatementOrigin origin = expression.getOrigin();
        if (!(Intrinsics.areEqual(origin, IrStatementOrigin.FOR_LOOP.INSTANCE) ? true : Intrinsics.areEqual(origin, IrStatementOrigin.FOR_LOOP_INNER_WHILE.INSTANCE))) {
            return (IrExpression) siblings(new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitBlock.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final IrExpression invoke() {
                    return LiveLiteralTransformer.super.visitBlock(expression);
                }
            });
        }
        List statements = expression.getStatements();
        IrStatement irStatementTransform = ((IrStatement) expression.getStatements().get(1)).transform((IrElementTransformer) this, (Object) null);
        Intrinsics.checkNotNull(irStatementTransform, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.IrStatement");
        statements.set(1, irStatementTransform);
        return (IrExpression) expression;
    }

    @NotNull
    public IrBody visitBlockBody(@NotNull final IrBlockBody body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return (IrBody) siblings(new Function0<IrBody>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitBlockBody.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrBody invoke() {
                return LiveLiteralTransformer.super.visitBlockBody(body);
            }
        });
    }

    @NotNull
    public IrBranch visitBranch(@NotNull final IrBranch branch) {
        Intrinsics.checkNotNullParameter(branch, "branch");
        return new IrBranchImpl(branch.getStartOffset(), branch.getEndOffset(), (IrExpression) enter("cond", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitBranch.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                return branch.getCondition().transform(this, (Object) null);
            }
        }), (IrExpression) enter("branch", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitBranch.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                return branch.getResult().transform(this, (Object) null);
            }
        }));
    }

    @NotNull
    public IrExpression visitCall(@NotNull final IrCall expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        return (IrExpression) enter(o00O00OO.OooO00o("call-", asJvmFriendlyString(expression.getSymbol().getOwner().getName())), new Function0<IrCall>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitCall.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrCall invoke() {
                final IrCall irCall = expression;
                final LiveLiteralTransformer liveLiteralTransformer = this;
                irCall.setDispatchReceiver((IrExpression) liveLiteralTransformer.enter("$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitCall.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression dispatchReceiver = irCall.getDispatchReceiver();
                        if (dispatchReceiver != null) {
                            return dispatchReceiver.transform(liveLiteralTransformer, (Object) null);
                        }
                        return null;
                    }
                }));
                final IrCall irCall2 = expression;
                final LiveLiteralTransformer liveLiteralTransformer2 = this;
                irCall2.setExtensionReceiver((IrExpression) liveLiteralTransformer2.enter("$$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitCall.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression extensionReceiver = irCall2.getExtensionReceiver();
                        if (extensionReceiver != null) {
                            return extensionReceiver.transform(liveLiteralTransformer2, (Object) null);
                        }
                        return null;
                    }
                }));
                int valueArgumentsCount = expression.getValueArgumentsCount();
                for (final int i = 0; i < valueArgumentsCount; i++) {
                    final IrExpression valueArgument = expression.getValueArgument(i);
                    if (valueArgument != null) {
                        LiveLiteralTransformer liveLiteralTransformer3 = this;
                        String strOooO00o = android.support.v4.media.OooO00o.OooO00o("arg-", i);
                        final IrCall irCall3 = expression;
                        final LiveLiteralTransformer liveLiteralTransformer4 = this;
                        liveLiteralTransformer3.enter(strOooO00o, new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitCall.1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                irCall3.putValueArgument(i, valueArgument.transform(liveLiteralTransformer4, (Object) null));
                            }
                        });
                    }
                }
                return expression;
            }
        });
    }

    @NotNull
    public IrStatement visitClass(@NotNull final IrClass declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        if (hasNoLiveLiteralsAnnotation((IrAnnotationContainer) declaration)) {
            return (IrStatement) declaration;
        }
        return IrUtilsKt.isAnnotationClass(declaration) ? (IrStatement) declaration : (IrStatement) siblings(o00O00OO.OooO00o("class-", asJvmFriendlyString(declaration.getName())), new Function0<IrStatement>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitClass.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrStatement invoke() {
                return LiveLiteralTransformer.super.visitClass(declaration);
            }
        });
    }

    @NotNull
    public IrExpression visitComposite(@NotNull final IrComposite expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        return (IrExpression) siblings(new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitComposite.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                return LiveLiteralTransformer.super.visitComposite(expression);
            }
        });
    }

    @NotNull
    public IrExpression visitConst(@NotNull IrConst<?> expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        if (Intrinsics.areEqual(expression.getKind(), IrConstKind.Null.INSTANCE)) {
            return (IrExpression) expression;
        }
        Pair<String, Boolean> pairBuildPath = this.keyVisitor.buildPath(expression.getKind().getAsString(), "$", "-");
        String strComponent1 = pairBuildPath.component1();
        if (pairBuildPath.component2().booleanValue()) {
            if (!this.liveLiteralsEnabled) {
                return (IrExpression) expression;
            }
            IrSimpleFunction irSimpleFunctionIrLiveLiteralGetter = irLiveLiteralGetter(strComponent1, (IrExpression) IrConstImplKt.copyWithOffsets(expression, -1, -1), expression.getType(), expression.getStartOffset());
            IrExpression irCallImpl = new IrCallImpl(expression.getStartOffset(), expression.getEndOffset(), expression.getType(), irSimpleFunctionIrLiveLiteralGetter.getSymbol(), irSimpleFunctionIrLiveLiteralGetter.getSymbol().getOwner().getTypeParameters().size(), irSimpleFunctionIrLiveLiteralGetter.getSymbol().getOwner().getValueParameters().size(), (IrStatementOrigin) null, (IrClassSymbol) null, 192, (DefaultConstructorMarker) null);
            irCallImpl.setDispatchReceiver(irGetLiveLiteralsClass(expression.getStartOffset(), expression.getEndOffset()));
            return irCallImpl;
        }
        IrFile irFile = this.currentFile;
        if (irFile == null) {
            return (IrExpression) expression;
        }
        SourceRangeInfo sourceRangeInfo = irFile.getFileEntry().getSourceRangeInfo(expression.getStartOffset(), expression.getEndOffset());
        String filePath = sourceRangeInfo.getFilePath();
        int startLineNumber = sourceRangeInfo.getStartLineNumber();
        int startColumnNumber = sourceRangeInfo.getStartColumnNumber();
        StringBuilder sbOooO0OO = androidx.compose.compiler.plugins.kotlin.OooO0o.OooO0OO("Duplicate live literal key found: ", strComponent1, "\nCaused by element at: ", filePath, CertificateUtil.DELIMITER);
        sbOooO0OO.append(startLineNumber);
        sbOooO0OO.append(CertificateUtil.DELIMITER);
        sbOooO0OO.append(startColumnNumber);
        sbOooO0OO.append("\nIf you encounter this error, please file a bug at https://issuetracker.google.com/issues?q=componentid:610764\nTry adding the `@NoLiveLiterals` annotation around the surrounding code to avoid this exception.");
        throw new IllegalStateException(sbOooO0OO.toString().toString());
    }

    @NotNull
    public IrExpression visitConstructorCall(@NotNull final IrConstructorCall expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrDeclaration irDeclaration = (IrConstructor) expression.getSymbol().getOwner();
        return IrUtilsKt.isAnnotationClass(IrUtilsKt.getParentAsClass(irDeclaration)) ? (IrExpression) expression : (IrExpression) enter(o00O00OO.OooO00o("call-", asJvmFriendlyString(irDeclaration.getName())), new Function0<IrConstructorCall>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitConstructorCall.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrConstructorCall invoke() {
                final IrConstructorCall irConstructorCall = expression;
                final LiveLiteralTransformer liveLiteralTransformer = this;
                irConstructorCall.setDispatchReceiver((IrExpression) liveLiteralTransformer.enter("$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitConstructorCall.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression dispatchReceiver = irConstructorCall.getDispatchReceiver();
                        if (dispatchReceiver != null) {
                            return dispatchReceiver.transform(liveLiteralTransformer, (Object) null);
                        }
                        return null;
                    }
                }));
                final IrConstructorCall irConstructorCall2 = expression;
                final LiveLiteralTransformer liveLiteralTransformer2 = this;
                irConstructorCall2.setExtensionReceiver((IrExpression) liveLiteralTransformer2.enter("$$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitConstructorCall.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression extensionReceiver = irConstructorCall2.getExtensionReceiver();
                        if (extensionReceiver != null) {
                            return extensionReceiver.transform(liveLiteralTransformer2, (Object) null);
                        }
                        return null;
                    }
                }));
                int valueArgumentsCount = expression.getValueArgumentsCount();
                for (final int i = 0; i < valueArgumentsCount; i++) {
                    final IrExpression valueArgument = expression.getValueArgument(i);
                    if (valueArgument != null) {
                        LiveLiteralTransformer liveLiteralTransformer3 = this;
                        String strOooO00o = android.support.v4.media.OooO00o.OooO00o("arg-", i);
                        final IrConstructorCall irConstructorCall3 = expression;
                        final LiveLiteralTransformer liveLiteralTransformer4 = this;
                        liveLiteralTransformer3.enter(strOooO00o, new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitConstructorCall.1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                irConstructorCall3.putValueArgument(i, valueArgument.transform(liveLiteralTransformer4, (Object) null));
                            }
                        });
                    }
                }
                return expression;
            }
        });
    }

    @NotNull
    public IrExpression visitDelegatingConstructorCall(@NotNull final IrDelegatingConstructorCall expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrDeclaration irDeclaration = (IrConstructor) expression.getSymbol().getOwner();
        return IrUtilsKt.isAnnotationClass(IrUtilsKt.getParentAsClass(irDeclaration)) ? (IrExpression) expression : (IrExpression) enter(o00O00OO.OooO00o("call-", asJvmFriendlyString(irDeclaration.getName())), new Function0<IrDelegatingConstructorCall>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitDelegatingConstructorCall.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrDelegatingConstructorCall invoke() {
                final IrDelegatingConstructorCall irDelegatingConstructorCall = expression;
                final LiveLiteralTransformer liveLiteralTransformer = this;
                irDelegatingConstructorCall.setDispatchReceiver((IrExpression) liveLiteralTransformer.enter("$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitDelegatingConstructorCall.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression dispatchReceiver = irDelegatingConstructorCall.getDispatchReceiver();
                        if (dispatchReceiver != null) {
                            return dispatchReceiver.transform(liveLiteralTransformer, (Object) null);
                        }
                        return null;
                    }
                }));
                final IrDelegatingConstructorCall irDelegatingConstructorCall2 = expression;
                final LiveLiteralTransformer liveLiteralTransformer2 = this;
                irDelegatingConstructorCall2.setExtensionReceiver((IrExpression) liveLiteralTransformer2.enter("$$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitDelegatingConstructorCall.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression extensionReceiver = irDelegatingConstructorCall2.getExtensionReceiver();
                        if (extensionReceiver != null) {
                            return extensionReceiver.transform(liveLiteralTransformer2, (Object) null);
                        }
                        return null;
                    }
                }));
                int valueArgumentsCount = expression.getValueArgumentsCount();
                for (final int i = 0; i < valueArgumentsCount; i++) {
                    final IrExpression valueArgument = expression.getValueArgument(i);
                    if (valueArgument != null) {
                        LiveLiteralTransformer liveLiteralTransformer3 = this;
                        String strOooO00o = android.support.v4.media.OooO00o.OooO00o("arg-", i);
                        final IrDelegatingConstructorCall irDelegatingConstructorCall3 = expression;
                        final LiveLiteralTransformer liveLiteralTransformer4 = this;
                        liveLiteralTransformer3.enter(strOooO00o, new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitDelegatingConstructorCall.1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                irDelegatingConstructorCall3.putValueArgument(i, valueArgument.transform(liveLiteralTransformer4, (Object) null));
                            }
                        });
                    }
                }
                return expression;
            }
        });
    }

    @NotNull
    public IrElseBranch visitElseBranch(@NotNull final IrElseBranch branch) {
        Intrinsics.checkNotNullParameter(branch, "branch");
        return new IrElseBranchImpl(branch.getStartOffset(), branch.getEndOffset(), branch.getCondition(), (IrExpression) enter("else", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitElseBranch.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                return branch.getResult().transform(this, (Object) null);
            }
        }));
    }

    @NotNull
    public IrExpression visitEnumConstructorCall(@NotNull final IrEnumConstructorCall expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        return (IrExpression) enter(o00O00OO.OooO00o("call-", asJvmFriendlyString(expression.getSymbol().getOwner().getName())), new Function0<IrEnumConstructorCall>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitEnumConstructorCall.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrEnumConstructorCall invoke() {
                final IrEnumConstructorCall irEnumConstructorCall = expression;
                final LiveLiteralTransformer liveLiteralTransformer = this;
                irEnumConstructorCall.setDispatchReceiver((IrExpression) liveLiteralTransformer.enter("$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitEnumConstructorCall.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression dispatchReceiver = irEnumConstructorCall.getDispatchReceiver();
                        if (dispatchReceiver != null) {
                            return dispatchReceiver.transform(liveLiteralTransformer, (Object) null);
                        }
                        return null;
                    }
                }));
                final IrEnumConstructorCall irEnumConstructorCall2 = expression;
                final LiveLiteralTransformer liveLiteralTransformer2 = this;
                irEnumConstructorCall2.setExtensionReceiver((IrExpression) liveLiteralTransformer2.enter("$$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitEnumConstructorCall.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression extensionReceiver = irEnumConstructorCall2.getExtensionReceiver();
                        if (extensionReceiver != null) {
                            return extensionReceiver.transform(liveLiteralTransformer2, (Object) null);
                        }
                        return null;
                    }
                }));
                int valueArgumentsCount = expression.getValueArgumentsCount();
                for (final int i = 0; i < valueArgumentsCount; i++) {
                    final IrExpression valueArgument = expression.getValueArgument(i);
                    if (valueArgument != null) {
                        LiveLiteralTransformer liveLiteralTransformer3 = this;
                        String strOooO00o = android.support.v4.media.OooO00o.OooO00o("arg-", i);
                        final IrEnumConstructorCall irEnumConstructorCall3 = expression;
                        final LiveLiteralTransformer liveLiteralTransformer4 = this;
                        liveLiteralTransformer3.enter(strOooO00o, new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitEnumConstructorCall.1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                irEnumConstructorCall3.putValueArgument(i, valueArgument.transform(liveLiteralTransformer4, (Object) null));
                            }
                        });
                    }
                }
                return expression;
            }
        });
    }

    @NotNull
    public IrStatement visitEnumEntry(@NotNull final IrEnumEntry declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        return (IrStatement) enter(o00O00OO.OooO00o("entry-", asJvmFriendlyString(declaration.getName())), new Function0<IrStatement>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitEnumEntry.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrStatement invoke() {
                return LiveLiteralTransformer.super.visitEnumEntry(declaration);
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException */
    @NotNull
    public IrFile visitFile(@NotNull final IrFile declaration) throws Exception {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        try {
            if (hasNoLiveLiteralsAnnotation((IrAnnotationContainer) declaration)) {
                return declaration;
            }
            final String str = (String) CollectionsKt.last(StringsKt__StringsKt.split$default(declaration.getFileEntry().getName(), new char[]{'/'}, false, 0, 6, (Object) null));
            final Set<String> setMakeKeySet = makeKeySet();
            return (IrFile) this.keyVisitor.root(setMakeKeySet, new Function0<IrFile>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer$visitFile$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final IrFile invoke() {
                    IrSimpleFunctionSymbol irSimpleFunctionSymbol = this.this$0.liveLiteralsEnabledSymbol;
                    IrClass irClass = this.this$0.liveLiteralsClass;
                    IrFactory irFactory = this.this$0.getContext().getIrFactory();
                    String str2 = str;
                    IrClassBuilder irClassBuilder = new IrClassBuilder();
                    irClassBuilder.setKind(ClassKind.OBJECT);
                    DescriptorVisibility INTERNAL = DescriptorVisibilities.INTERNAL;
                    Intrinsics.checkNotNullExpressionValue(INTERNAL, "INTERNAL");
                    irClassBuilder.setVisibility(INTERNAL);
                    Name nameIdentifier = Name.identifier(o00O00OO.OooO00o("LiveLiterals$", PackagePartClassUtils.getFilePartShortName(str2)));
                    Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(\"LiveLiterals${\"$\"}$shortName\")");
                    irClassBuilder.setName(nameIdentifier);
                    IrDeclaration irDeclarationBuildClass = DeclarationBuildersKt.buildClass(irFactory, irClassBuilder);
                    LiveLiteralTransformer liveLiteralTransformer = this.this$0;
                    IrFile irFile = declaration;
                    IrUtilsKt.createParameterDeclarations(irDeclarationBuildClass);
                    irDeclarationBuildClass.setAnnotations(CollectionsKt.plus((Collection<? extends IrConstructorCall>) irDeclarationBuildClass.getAnnotations(), liveLiteralTransformer.irLiveLiteralFileInfoAnnotation(irFile.getFileEntry().getName())));
                    IrFactory factory = irDeclarationBuildClass.getFactory();
                    IrFunctionBuilder irFunctionBuilder = new IrFunctionBuilder();
                    irFunctionBuilder.setPrimary(true);
                    irFunctionBuilder.setReturnType(IrUtilsKt.getDefaultType(irDeclarationBuildClass));
                    IrConstructor irConstructorBuildConstructor = DeclarationBuildersKt.buildConstructor(factory, irFunctionBuilder);
                    irDeclarationBuildClass.getDeclarations().add(irConstructorBuildConstructor);
                    IrDeclarationParent irDeclarationParent = (IrDeclarationParent) irDeclarationBuildClass;
                    irConstructorBuildConstructor.setParent(irDeclarationParent);
                    IrBuilderWithScope declarationIrBuilder = new DeclarationIrBuilder(liveLiteralTransformer.getContext(), irDeclarationBuildClass.getSymbol(), 0, 0, 12, (DefaultConstructorMarker) null);
                    IrBuilderWithScope irBlockBodyBuilder = new IrBlockBodyBuilder(declarationIrBuilder.getContext(), declarationIrBuilder.getScope(), declarationIrBuilder.getStartOffset(), declarationIrBuilder.getEndOffset());
                    IrConstructor primaryConstructor = IrUtilsKt.getPrimaryConstructor(irBlockBodyBuilder.getContext().getIrBuiltIns().getAnyClass().getOwner());
                    Intrinsics.checkNotNull(primaryConstructor);
                    irBlockBodyBuilder.unaryPlus(ExpressionHelpersKt.irDelegatingConstructorCall(irBlockBodyBuilder, primaryConstructor));
                    irConstructorBuildConstructor.setBody(irBlockBodyBuilder.doBuild());
                    IrSimpleFunctionSymbol symbol = null;
                    if (liveLiteralTransformer.usePerFileEnabledFlag) {
                        IrFactory factory2 = irDeclarationBuildClass.getFactory();
                        IrPropertyBuilder irPropertyBuilder = new IrPropertyBuilder();
                        Name nameIdentifier2 = Name.identifier("enabled");
                        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(\"enabled\")");
                        irPropertyBuilder.setName(nameIdentifier2);
                        DescriptorVisibility PRIVATE = DescriptorVisibilities.PRIVATE;
                        Intrinsics.checkNotNullExpressionValue(PRIVATE, "PRIVATE");
                        irPropertyBuilder.setVisibility(PRIVATE);
                        IrProperty irPropertyBuildProperty = DeclarationBuildersKt.buildProperty(factory2, irPropertyBuilder);
                        irDeclarationBuildClass.getDeclarations().add(irPropertyBuildProperty);
                        irPropertyBuildProperty.setParent(irDeclarationParent);
                        IrFactory irFactory2 = liveLiteralTransformer.getContext().getIrFactory();
                        IrFieldBuilder irFieldBuilder = new IrFieldBuilder();
                        Name nameIdentifier3 = Name.identifier("enabled");
                        Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(\"enabled\")");
                        irFieldBuilder.setName(nameIdentifier3);
                        irFieldBuilder.setStatic(true);
                        irFieldBuilder.setType(liveLiteralTransformer.getBuiltIns().getBooleanType());
                        DescriptorVisibility PRIVATE2 = DescriptorVisibilities.PRIVATE;
                        Intrinsics.checkNotNullExpressionValue(PRIVATE2, "PRIVATE");
                        irFieldBuilder.setVisibility(PRIVATE2);
                        IrField irFieldBuildField = DeclarationBuildersKt.buildField(irFactory2, irFieldBuilder);
                        irFieldBuildField.setCorrespondingPropertySymbol(irPropertyBuildProperty.getSymbol());
                        irFieldBuildField.setParent(irDeclarationParent);
                        irFieldBuildField.setInitializer(new IrExpressionBodyImpl(-2, -2, liveLiteralTransformer.irConst(false)));
                        irPropertyBuildProperty.setBackingField(irFieldBuildField);
                        IrFunctionBuilder irFunctionBuilder2 = new IrFunctionBuilder();
                        Name nameSpecial = Name.special("<get-" + irPropertyBuildProperty.getName() + Typography.greater);
                        Intrinsics.checkNotNullExpressionValue(nameSpecial, "special(\"<get-${this@addGetter.name}>\")");
                        irFunctionBuilder2.setName(nameSpecial);
                        irFunctionBuilder2.setReturnType(liveLiteralTransformer.getBuiltIns().getBooleanType());
                        DescriptorVisibility PRIVATE3 = DescriptorVisibilities.PRIVATE;
                        Intrinsics.checkNotNullExpressionValue(PRIVATE3, "PRIVATE");
                        irFunctionBuilder2.setVisibility(PRIVATE3);
                        irFunctionBuilder2.setOrigin(IrDeclarationOrigin.DEFAULT_PROPERTY_ACCESSOR.INSTANCE);
                        IrFunction irFunctionBuildFunction = DeclarationBuildersKt.buildFunction(irPropertyBuildProperty.getFactory(), irFunctionBuilder2);
                        irPropertyBuildProperty.setGetter(irFunctionBuildFunction);
                        irFunctionBuildFunction.setCorrespondingPropertySymbol(irPropertyBuildProperty.getSymbol());
                        irFunctionBuildFunction.setParent(irPropertyBuildProperty.getParent());
                        IrValueParameter thisReceiver = irDeclarationBuildClass.getThisReceiver();
                        Intrinsics.checkNotNull(thisReceiver);
                        IrValueDeclaration irValueDeclarationCopyTo$default = IrUtilsKt.copyTo$default(thisReceiver, irFunctionBuildFunction, (IrDeclarationOrigin) null, 0, 0, 0, (Name) null, (Map) null, (IrType) null, (IrType) null, (IrExpressionBody) null, false, false, false, 8190, (Object) null);
                        irFunctionBuildFunction.setDispatchReceiverParameter(irValueDeclarationCopyTo$default);
                        IrBuilderWithScope declarationIrBuilder2 = new DeclarationIrBuilder(liveLiteralTransformer.getContext(), irFunctionBuildFunction.getSymbol(), 0, 0, 12, (DefaultConstructorMarker) null);
                        IrBuilderWithScope irBlockBodyBuilder2 = new IrBlockBodyBuilder(declarationIrBuilder2.getContext(), declarationIrBuilder2.getScope(), declarationIrBuilder2.getStartOffset(), declarationIrBuilder2.getEndOffset());
                        IrBuilderWithScope irBuilderWithScope = irBlockBodyBuilder2;
                        IrExpression irExpressionIrGet = ExpressionHelpersKt.irGet(irBuilderWithScope, irValueDeclarationCopyTo$default);
                        IrField backingField = irPropertyBuildProperty.getBackingField();
                        Intrinsics.checkNotNull(backingField);
                        irBlockBodyBuilder2.unaryPlus(ExpressionHelpersKt.irReturn(irBuilderWithScope, ExpressionHelpersKt.irGetField$default(irBuilderWithScope, irExpressionIrGet, backingField, (IrType) null, 4, (Object) null)));
                        irFunctionBuildFunction.setBody(irBlockBodyBuilder2.doBuild());
                        IrSimpleFunction getter = irPropertyBuildProperty.getGetter();
                        if (getter != null) {
                            symbol = getter.getSymbol();
                        }
                    }
                    try {
                        this.this$0.liveLiteralsClass = irDeclarationBuildClass;
                        this.this$0.currentFile = declaration;
                        this.this$0.liveLiteralsEnabledSymbol = symbol;
                        IrDeclarationContainer irDeclarationContainerVisitFile = super/*androidx.compose.compiler.plugins.kotlin.lower.AbstractComposeLowering*/.visitFile(declaration);
                        if (this.this$0.liveLiteralsEnabled && (!setMakeKeySet.isEmpty())) {
                            IrUtilsKt.addChild(irDeclarationContainerVisitFile, irDeclarationBuildClass);
                        }
                        return irDeclarationContainerVisitFile;
                    } finally {
                        this.this$0.liveLiteralsClass = irClass;
                        this.this$0.liveLiteralsEnabledSymbol = irSimpleFunctionSymbol;
                    }
                }
            });
        } catch (Exception e) {
            throw new Exception(o00O00OO.OooO00o("IR lowering failed at: ", IrDeclarationsKt.getName(declaration)), e);
        } catch (ProcessCanceledException e2) {
            throw e2;
        }
    }

    @NotNull
    public IrExpression visitLoop(@NotNull final IrLoop loop) {
        Intrinsics.checkNotNullParameter(loop, "loop");
        IrStatementOrigin origin = loop.getOrigin();
        return Intrinsics.areEqual(origin, IrStatementOrigin.WHILE_LOOP.INSTANCE) ? true : Intrinsics.areEqual(origin, IrStatementOrigin.FOR_LOOP_INNER_WHILE.INSTANCE) ? (IrExpression) enter("loop", new Function0<IrLoop>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitLoop.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrLoop invoke() {
                final IrLoop irLoop = loop;
                final LiveLiteralTransformer liveLiteralTransformer = this;
                irLoop.setBody((IrExpression) liveLiteralTransformer.enter("body", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitLoop.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression body = irLoop.getBody();
                        if (body != null) {
                            return body.transform(liveLiteralTransformer, (Object) null);
                        }
                        return null;
                    }
                }));
                return loop;
            }
        }) : (IrExpression) enter("loop", new Function0<IrLoop>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitLoop.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrLoop invoke() {
                final IrLoop irLoop = loop;
                final LiveLiteralTransformer liveLiteralTransformer = this;
                irLoop.setCondition((IrExpression) liveLiteralTransformer.enter("cond", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitLoop.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrExpression invoke() {
                        return irLoop.getCondition().transform(liveLiteralTransformer, (Object) null);
                    }
                }));
                final IrLoop irLoop2 = loop;
                final LiveLiteralTransformer liveLiteralTransformer2 = this;
                irLoop2.setBody((IrExpression) liveLiteralTransformer2.enter("body", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitLoop.2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression body = irLoop2.getBody();
                        if (body != null) {
                            return body.transform(liveLiteralTransformer2, (Object) null);
                        }
                        return null;
                    }
                }));
                return loop;
            }
        });
    }

    @NotNull
    public IrStatement visitProperty(@NotNull final IrProperty declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        if (hasNoLiveLiteralsAnnotation((IrAnnotationContainer) declaration)) {
            return (IrStatement) declaration;
        }
        final IrField backingField = declaration.getBackingField();
        final IrSimpleFunction getter = declaration.getGetter();
        final IrSimpleFunction setter = declaration.getSetter();
        return (IrStatement) enter(o00O00OO.OooO00o("val-", asJvmFriendlyString(declaration.getName())), new Function0<IrProperty>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitProperty.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrProperty invoke() {
                declaration.setBackingField(backingField);
                IrProperty irProperty = declaration;
                final LiveLiteralTransformer liveLiteralTransformer = this;
                final IrSimpleFunction irSimpleFunction = getter;
                irProperty.setGetter((IrSimpleFunction) liveLiteralTransformer.enter("get", new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitProperty.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrSimpleFunction invoke() {
                        IrSimpleFunction irSimpleFunction2 = irSimpleFunction;
                        IrElement irElementTransform = irSimpleFunction2 != null ? irSimpleFunction2.transform(liveLiteralTransformer, (Object) null) : null;
                        if (irElementTransform instanceof IrSimpleFunction) {
                            return (IrSimpleFunction) irElementTransform;
                        }
                        return null;
                    }
                }));
                IrProperty irProperty2 = declaration;
                final LiveLiteralTransformer liveLiteralTransformer2 = this;
                final IrSimpleFunction irSimpleFunction2 = setter;
                irProperty2.setSetter((IrSimpleFunction) liveLiteralTransformer2.enter("set", new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitProperty.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrSimpleFunction invoke() {
                        IrSimpleFunction irSimpleFunction3 = irSimpleFunction2;
                        IrElement irElementTransform = irSimpleFunction3 != null ? irSimpleFunction3.transform(liveLiteralTransformer2, (Object) null) : null;
                        if (irElementTransform instanceof IrSimpleFunction) {
                            return (IrSimpleFunction) irElementTransform;
                        }
                        return null;
                    }
                }));
                return declaration;
            }
        });
    }

    @NotNull
    public IrExpression visitSetField(@NotNull final IrSetField expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        return (IrExpression) enter("set-" + expression.getSymbol().getOwner().getName(), new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitSetField.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                return LiveLiteralTransformer.super.visitSetField(expression);
            }
        });
    }

    @NotNull
    public IrExpression visitSetValue(@NotNull final IrSetValue expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrValueDeclaration owner = expression.getSymbol().getOwner();
        Name name = owner.getName();
        IrDeclarationOrigin origin = owner.getOrigin();
        if (Intrinsics.areEqual(origin, IrDeclarationOrigin.FOR_LOOP_IMPLICIT_VARIABLE.INSTANCE)) {
            return (IrExpression) expression;
        }
        if (Intrinsics.areEqual(origin, IrDeclarationOrigin.IR_TEMPORARY_VARIABLE.INSTANCE)) {
            return (IrExpression) expression;
        }
        if (Intrinsics.areEqual(origin, IrDeclarationOrigin.FOR_LOOP_VARIABLE.INSTANCE)) {
            return (IrExpression) expression;
        }
        return (IrExpression) enter("set-" + name, new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitSetValue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                return LiveLiteralTransformer.super.visitSetValue(expression);
            }
        });
    }

    @NotNull
    public IrStatement visitSimpleFunction(@NotNull final IrSimpleFunction declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        if (hasNoLiveLiteralsAnnotation((IrAnnotationContainer) declaration)) {
            return (IrStatement) declaration;
        }
        String strAsJvmFriendlyString = asJvmFriendlyString(declaration.getName());
        return (IrStatement) enter(Intrinsics.areEqual(strAsJvmFriendlyString, "<anonymous>") ? "lambda" : o00O00OO.OooO00o("fun-", strAsJvmFriendlyString), new Function0<IrStatement>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitSimpleFunction.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrStatement invoke() {
                return LiveLiteralTransformer.super.visitSimpleFunction(declaration);
            }
        });
    }

    @NotNull
    public IrExpression visitStringConcatenation(@NotNull final IrStringConcatenation expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        return !(expression instanceof IrStringConcatenationImpl) ? (IrExpression) expression : (IrExpression) enter("str", new Function0<IrStringConcatenationImpl>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitStringConcatenation.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrStringConcatenationImpl invoke() {
                final LiveLiteralTransformer liveLiteralTransformer = LiveLiteralTransformer.this;
                final IrStringConcatenation irStringConcatenation = expression;
                return (IrStringConcatenationImpl) liveLiteralTransformer.siblings(new Function0<IrStringConcatenationImpl>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitStringConcatenation.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrStringConcatenationImpl invoke() {
                        List arguments = irStringConcatenation.getArguments();
                        IrStringConcatenation irStringConcatenation2 = irStringConcatenation;
                        final LiveLiteralTransformer liveLiteralTransformer2 = liveLiteralTransformer;
                        int i = 0;
                        for (Object obj : arguments) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            final IrExpression irExpression = (IrExpression) obj;
                            irStringConcatenation2.getArguments().set(i, liveLiteralTransformer2.enter(String.valueOf(i), new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer$visitStringConcatenation$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final IrExpression invoke() {
                                    return irExpression.transform(liveLiteralTransformer2, (Object) null);
                                }
                            }));
                            i = i2;
                        }
                        return irStringConcatenation;
                    }
                });
            }
        });
    }

    @NotNull
    public IrExpression visitTry(@NotNull final IrTry aTry) {
        Intrinsics.checkNotNullParameter(aTry, "aTry");
        aTry.setTryResult((IrExpression) enter("try", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitTry.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                return aTry.getTryResult().transform(this, (Object) null);
            }
        }));
        siblings(new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitTry.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                List<IrCatch> catches = aTry.getCatches();
                final LiveLiteralTransformer liveLiteralTransformer = this;
                for (final IrCatch irCatch : catches) {
                    irCatch.setResult((IrExpression) liveLiteralTransformer.enter("catch", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer$visitTry$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final IrExpression invoke() {
                            return irCatch.getResult().transform(liveLiteralTransformer, (Object) null);
                        }
                    }));
                }
            }
        });
        aTry.setFinallyExpression((IrExpression) enter("finally", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitTry.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final IrExpression invoke() {
                IrExpression finallyExpression = aTry.getFinallyExpression();
                if (finallyExpression != null) {
                    return finallyExpression.transform(this, (Object) null);
                }
                return null;
            }
        }));
        return (IrExpression) aTry;
    }

    @NotNull
    public IrStatement visitValueParameter(@NotNull final IrValueParameter declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        return (IrStatement) enter(o00O00OO.OooO00o("param-", asJvmFriendlyString(declaration.getName())), new Function0<IrStatement>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitValueParameter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrStatement invoke() {
                return LiveLiteralTransformer.super.visitValueParameter(declaration);
            }
        });
    }

    @NotNull
    public IrExpression visitVararg(@NotNull final IrVararg expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        return !(expression instanceof IrVarargImpl) ? (IrExpression) expression : (IrExpression) enter("vararg", new Function0<IrVarargImpl>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitVararg.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrVarargImpl invoke() {
                List elements = expression.getElements();
                IrVararg irVararg = expression;
                final LiveLiteralTransformer liveLiteralTransformer = this;
                int i = 0;
                for (Object obj : elements) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final IrVarargElement irVarargElement = (IrVarargElement) obj;
                    irVararg.getElements().set(i, liveLiteralTransformer.enter(String.valueOf(i), new Function0<IrVarargElement>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer$visitVararg$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final IrVarargElement invoke() {
                            IrVarargElement irVarargElementTransform = irVarargElement.transform(liveLiteralTransformer, (Object) null);
                            Intrinsics.checkNotNull(irVarargElementTransform, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrVarargElement");
                            return irVarargElementTransform;
                        }
                    }));
                    i = i2;
                }
                return expression;
            }
        });
    }

    @NotNull
    public IrStatement visitVariable(@NotNull final IrVariable declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        return (IrStatement) enter(o00O00OO.OooO00o("val-", asJvmFriendlyString(declaration.getName())), new Function0<IrStatement>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitVariable.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrStatement invoke() {
                return LiveLiteralTransformer.super.visitVariable(declaration);
            }
        });
    }

    @NotNull
    public IrExpression visitWhen(@NotNull final IrWhen expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrStatementOrigin origin = expression.getOrigin();
        if (Intrinsics.areEqual(origin, IrStatementOrigin.ANDAND.INSTANCE)) {
            expression.getBranches().set(0, ((IrBranch) expression.getBranches().get(0)).transform((IrElementTransformer) this, (Object) null));
            return (IrExpression) expression;
        }
        if (!Intrinsics.areEqual(origin, IrStatementOrigin.OROR.INSTANCE)) {
            return Intrinsics.areEqual(origin, IrStatementOrigin.IF.INSTANCE) ? (IrExpression) siblings("if", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitWhen.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final IrExpression invoke() {
                    return LiveLiteralTransformer.super.visitWhen(expression);
                }
            }) : (IrExpression) siblings("when", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.LiveLiteralTransformer.visitWhen.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final IrExpression invoke() {
                    return LiveLiteralTransformer.super.visitWhen(expression);
                }
            });
        }
        expression.getBranches().set(1, ((IrBranch) expression.getBranches().get(1)).transform((IrElementTransformer) this, (Object) null));
        return (IrExpression) expression;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T siblings(Function0<? extends T> block) {
        return (T) this.keyVisitor.siblings(block);
    }
}
