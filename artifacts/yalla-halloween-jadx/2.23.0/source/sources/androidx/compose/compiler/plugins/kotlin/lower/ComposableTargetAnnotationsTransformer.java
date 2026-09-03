package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeClassIds;
import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import androidx.compose.compiler.plugins.kotlin.KtxNameConventions;
import androidx.compose.compiler.plugins.kotlin.ModuleMetrics;
import androidx.compose.compiler.plugins.kotlin.WeakBindingTraceKt;
import androidx.compose.compiler.plugins.kotlin.analysis.ComposeWritableSlices;
import androidx.compose.compiler.plugins.kotlin.inference.ApplierInferencer;
import androidx.compose.compiler.plugins.kotlin.inference.ErrorReporter;
import androidx.compose.compiler.plugins.kotlin.inference.Item;
import androidx.compose.compiler.plugins.kotlin.inference.LazyScheme;
import androidx.compose.compiler.plugins.kotlin.inference.LazySchemeStorage;
import androidx.compose.compiler.plugins.kotlin.inference.NodeAdapter;
import androidx.compose.compiler.plugins.kotlin.inference.NodeKind;
import androidx.compose.compiler.plugins.kotlin.inference.Open;
import androidx.compose.compiler.plugins.kotlin.inference.Scheme;
import androidx.compose.compiler.plugins.kotlin.inference.SchemeKt;
import androidx.compose.compiler.plugins.kotlin.inference.Token;
import androidx.compose.compiler.plugins.kotlin.inference.TypeAdapter;
import com.facebook.internal.security.CertificateUtil;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException;
import org.jetbrains.kotlin.descriptors.SourceElement;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.declarations.IrAttributeContainer;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationsKt;
import org.jetbrains.kotlin.ir.declarations.IrFile;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrLocalDelegatedProperty;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.declarations.IrVariable;
import org.jetbrains.kotlin.ir.expressions.IrBlock;
import org.jetbrains.kotlin.ir.expressions.IrBody;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrConst;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrContainerExpression;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrExpressionBody;
import org.jetbrains.kotlin.ir.expressions.IrFunctionExpression;
import org.jetbrains.kotlin.ir.expressions.IrGetField;
import org.jetbrains.kotlin.ir.expressions.IrGetValue;
import org.jetbrains.kotlin.ir.expressions.IrReturn;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.expressions.impl.IrConstructorCallImpl;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrClassifierSymbol;
import org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol;
import org.jetbrains.kotlin.ir.symbols.IrSymbol;
import org.jetbrains.kotlin.ir.symbols.IrValueParameterSymbol;
import org.jetbrains.kotlin.ir.types.IrSimpleType;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypeArgument;
import org.jetbrains.kotlin.ir.types.IrTypeProjection;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.DumpIrTreeKt;
import org.jetbrains.kotlin.ir.util.IrTypeUtilsKt;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt;
import org.jetbrains.kotlin.name.FqName;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\nH\u0002J\u001c\u00109\u001a\b\u0012\u0004\u0012\u000203022\f\u0010:\u001a\b\u0012\u0004\u0012\u00020302H\u0002J\u000e\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0010J\u000e\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020$J\u0012\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020DH\u0002J\u0012\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0016J\u0014\u0010L\u001a\u0004\u0018\u00010\u00142\b\u0010M\u001a\u0004\u0018\u00010\u0017H\u0002J\"\u0010N\u001a\b\u0012\u0004\u0012\u000203022\f\u0010:\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00100\u001a\u000201J\"\u0010N\u001a\b\u0012\u0004\u0012\u000203022\f\u0010:\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010,\u001a\u00020-J\u0010\u0010O\u001a\u00020P2\u0006\u0010M\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020\u000eH\u0016J\u0010\u0010T\u001a\u00020U2\u0006\u0010S\u001a\u00020\u0010H\u0016J\u0010\u0010V\u001a\u00020U2\u0006\u0010S\u001a\u00020WH\u0016J\u0010\u0010X\u001a\u00020U2\u0006\u0010S\u001a\u00020YH\u0016J\u000e\u0010Z\u001a\u0004\u0018\u00010[*\u00020\u0017H\u0002J\f\u0010\\\u001a\u00020\"*\u00020QH\u0002J\f\u0010]\u001a\u00020\"*\u00020\u0010H\u0002J\n\u0010^\u001a\u00020\"*\u00020\u0010J\u0011\u0010_\u001a\u00020\"*\u00020QH\u0000¢\u0006\u0002\b`J\f\u0010a\u001a\u00020\"*\u00020[H\u0002J\u0011\u0010b\u001a\u00020[*\u00020QH\u0000¢\u0006\u0002\bcJ\u000e\u0010d\u001a\u0004\u0018\u000103*\u000201H\u0002J\u0012\u0010e\u001a\b\u0012\u0004\u0012\u00020302*\u000201H\u0002J\u0012\u0010e\u001a\b\u0012\u0004\u0012\u00020302*\u00020-H\u0002J\u0012\u0010f\u001a\u00020-*\u00020$2\u0006\u0010g\u001a\u000201J\u0011\u0010h\u001a\u00020[*\u00020\u0017H\u0000¢\u0006\u0002\biR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001b0\u001a0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010!\u001a\u00020\"*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010#R\u0018\u0010!\u001a\u00020\"*\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010%R\u001a\u0010&\u001a\u00020\"*\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0018\u0010&\u001a\u00020\"*\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010%R\u001a\u0010(\u001a\u00020\"*\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0018\u0010)\u001a\u00020\"*\u00020$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010%R\u0018\u0010+\u001a\u00020\"*\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010%R\u0017\u0010,\u001a\u0004\u0018\u00010-*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001b\u00100\u001a\u000201*\b\u0012\u0004\u0012\u000203028F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006j"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;", "Landroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLowering;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableSymbolRemapper;", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Landroidx/compose/compiler/plugins/kotlin/lower/ComposableSymbolRemapper;Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;)V", "ComposableInferredTargetClass", "Lorg/jetbrains/kotlin/ir/symbols/IrClassSymbol;", "ComposableOpenTargetClass", "ComposableTargetClass", "currentFile", "Lorg/jetbrains/kotlin/ir/declarations/IrFile;", "currentOwner", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "infer", "Landroidx/compose/compiler/plugins/kotlin/inference/ApplierInferencer;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceNode;", "ownerMap", "", "Lorg/jetbrains/kotlin/ir/IrElement;", "parameterOwners", "Lorg/jetbrains/kotlin/ir/symbols/IrSymbol;", "Lkotlin/Pair;", "", "transformer", "getTransformer", "()Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;", "variableDeclarations", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceVariable;", "isComposable", "", "(Lorg/jetbrains/kotlin/ir/declarations/IrFunction;)Z", "Lorg/jetbrains/kotlin/ir/types/IrType;", "(Lorg/jetbrains/kotlin/ir/types/IrType;)Z", "isComposableLambda", "(Lorg/jetbrains/kotlin/ir/IrElement;)Z", "isComposableParameter", "isOrHasComposableLambda", "isOrHasComposableLambda$compiler_hosted", "isSamComposable", "scheme", "Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "getScheme", "(Lorg/jetbrains/kotlin/ir/declarations/IrFunction;)Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "target", "Landroidx/compose/compiler/plugins/kotlin/inference/Item;", "", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "getTarget", "(Ljava/util/List;)Landroidx/compose/compiler/plugins/kotlin/inference/Item;", "annotation", "Lorg/jetbrains/kotlin/ir/expressions/impl/IrConstructorCallImpl;", "classSymbol", "filteredAnnotations", "annotations", "inferenceFunctionOf", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionDeclaration;", "function", "inferenceFunctionTypeOf", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionType;", "type", "inferenceParameterOrNull", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceResolvedParameter;", "getValue", "Lorg/jetbrains/kotlin/ir/expressions/IrGetValue;", "lineInfoOf", "", "element", "lower", "", "module", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "resolveExpressionOrNull", "expression", "updatedAnnotations", "visitCall", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "visitFile", "declaration", "visitFunction", "Lorg/jetbrains/kotlin/ir/IrStatement;", "visitLocalDelegatedProperty", "Lorg/jetbrains/kotlin/ir/declarations/IrLocalDelegatedProperty;", "visitVariable", "Lorg/jetbrains/kotlin/ir/declarations/IrVariable;", "findTransformedLambda", "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionExpression;", "hasComposableArguments", "hasComposableParameter", "hasSchemeSpecified", "hasTransformedLambda", "hasTransformedLambda$compiler_hosted", "isTransformedLambda", "singletonFunctionExpression", "singletonFunctionExpression$compiler_hosted", "toAnnotation", "toAnnotations", "toScheme", "defaultTarget", "transformedLambda", "transformedLambda$compiler_hosted", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableTargetAnnotationsTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableTargetAnnotationsTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer\n+ 2 AbstractComposeLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLoweringKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ComposableTargetAnnotationsTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformerKt\n*L\n1#1,1104:1\n1146#2,2:1105\n1148#2,4:1108\n1#3:1107\n1#3:1156\n1855#4,2:1112\n777#4:1114\n788#4:1115\n1864#4,2:1116\n789#4,2:1118\n1866#4:1120\n791#4:1121\n1549#4:1122\n1620#4,3:1123\n288#4,2:1126\n288#4,2:1131\n288#4,2:1136\n288#4,2:1138\n1747#4,3:1143\n1603#4,9:1146\n1855#4:1155\n1856#4:1157\n1612#4:1158\n766#4:1159\n857#4,2:1160\n1747#4,3:1162\n1747#4,3:1165\n1747#4,3:1168\n1747#4,3:1171\n1747#4,3:1174\n1051#5,3:1128\n1051#5,3:1133\n1051#5,3:1140\n*S KotlinDebug\n*F\n+ 1 ComposableTargetAnnotationsTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer\n*L\n224#1:1105,2\n224#1:1108,4\n432#1:1156\n247#1:1112,2\n316#1:1114\n316#1:1115\n316#1:1116,2\n316#1:1118,2\n316#1:1120\n316#1:1121\n359#1:1122\n359#1:1123,3\n394#1:1126,2\n396#1:1131,2\n398#1:1136,2\n406#1:1138,2\n413#1:1143,3\n432#1:1146,9\n432#1:1155\n432#1:1157\n432#1:1158\n520#1:1159\n520#1:1160,2\n546#1:1162,3\n556#1:1165,3\n562#1:1168,3\n569#1:1171,3\n572#1:1174,3\n395#1:1128,3\n397#1:1133,3\n407#1:1140,3\n*E\n"})
public final class ComposableTargetAnnotationsTransformer extends AbstractComposeLowering {

    @Nullable
    private final IrClassSymbol ComposableInferredTargetClass;

    @Nullable
    private final IrClassSymbol ComposableOpenTargetClass;

    @Nullable
    private final IrClassSymbol ComposableTargetClass;

    @Nullable
    private IrFile currentFile;

    @Nullable
    private IrFunction currentOwner;

    @NotNull
    private final ApplierInferencer<InferenceFunction, InferenceNode> infer;

    @NotNull
    private final Map<IrElement, IrFunction> ownerMap;

    @NotNull
    private final Map<IrSymbol, Pair<IrFunction, Integer>> parameterOwners;

    @NotNull
    private final Map<IrSymbol, InferenceVariable> variableDeclarations;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableTargetAnnotationsTransformer(@NotNull IrPluginContext context, @NotNull ComposableSymbolRemapper symbolRemapper, @NotNull final ModuleMetrics metrics) {
        super(context, symbolRemapper, metrics);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(symbolRemapper, "symbolRemapper");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        ComposeClassIds composeClassIds = ComposeClassIds.INSTANCE;
        this.ComposableTargetClass = symbolRemapper.getReferencedClassOrNull(getTopLevelClassOrNull(composeClassIds.getComposableTarget()));
        this.ComposableOpenTargetClass = symbolRemapper.getReferencedClassOrNull(getTopLevelClassOrNull(composeClassIds.getComposableOpenTarget()));
        this.ComposableInferredTargetClass = symbolRemapper.getReferencedClassOrNull(getTopLevelClassOrNull(composeClassIds.getComposableInferredTarget()));
        this.ownerMap = new LinkedHashMap();
        this.parameterOwners = new LinkedHashMap();
        this.variableDeclarations = new LinkedHashMap();
        this.infer = new ApplierInferencer<>(new TypeAdapter<InferenceFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableTargetAnnotationsTransformer$infer$1

            @NotNull
            private final Map<InferenceFunction, Scheme> current = new LinkedHashMap();

            @NotNull
            public final Map<InferenceFunction, Scheme> getCurrent() {
                return this.current;
            }

            @Override // androidx.compose.compiler.plugins.kotlin.inference.TypeAdapter
            @Nullable
            public Scheme currentInferredSchemeOf(@NotNull InferenceFunction type) {
                Intrinsics.checkNotNullParameter(type, "type");
                if (!type.getSchemeIsUpdatable()) {
                    return null;
                }
                Scheme scheme = this.current.get(type);
                return scheme == null ? declaredSchemaOf(type) : scheme;
            }

            @Override // androidx.compose.compiler.plugins.kotlin.inference.TypeAdapter
            @NotNull
            public Scheme declaredSchemaOf(@NotNull InferenceFunction type) {
                Intrinsics.checkNotNullParameter(type, "type");
                Scheme declaredScheme$default = InferenceFunction.toDeclaredScheme$default(type, null, 1, null);
                type.recordScheme(declaredScheme$default);
                return declaredScheme$default;
            }

            @Override // androidx.compose.compiler.plugins.kotlin.inference.TypeAdapter
            public void updatedInferredScheme(@NotNull InferenceFunction type, @NotNull Scheme scheme) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(scheme, "scheme");
                type.recordScheme(scheme);
                type.updateScheme(scheme);
                this.current.put(type, scheme);
            }
        }, new NodeAdapter<InferenceFunction, InferenceNode>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableTargetAnnotationsTransformer$infer$2
            @Override // androidx.compose.compiler.plugins.kotlin.inference.NodeAdapter
            @NotNull
            public InferenceNode containerOf(@NotNull InferenceNode node) {
                InferenceNode inferenceNodeInferenceNodeOf;
                Intrinsics.checkNotNullParameter(node, "node");
                IrElement irElement = (IrFunction) this.this$0.ownerMap.get(node.getElement());
                if (irElement != null && (inferenceNodeInferenceNodeOf = ComposableTargetAnnotationsTransformerKt.inferenceNodeOf(irElement, this.this$0.getTransformer())) != null) {
                    return inferenceNodeInferenceNodeOf;
                }
                InferenceResolvedParameter inferenceResolvedParameter = node instanceof InferenceResolvedParameter ? (InferenceResolvedParameter) node : null;
                return inferenceResolvedParameter != null ? inferenceResolvedParameter.getReferenceContainer() : node;
            }

            @Override // androidx.compose.compiler.plugins.kotlin.inference.NodeAdapter
            @NotNull
            public NodeKind kindOf(@NotNull InferenceNode node) {
                Intrinsics.checkNotNullParameter(node, "node");
                return node.getKind();
            }

            @Override // androidx.compose.compiler.plugins.kotlin.inference.NodeAdapter
            @Nullable
            public InferenceNode referencedContainerOf(@NotNull InferenceNode node) {
                Intrinsics.checkNotNullParameter(node, "node");
                return node.getReferenceContainer();
            }

            @Override // androidx.compose.compiler.plugins.kotlin.inference.NodeAdapter
            public int schemeParameterIndexOf(@NotNull InferenceNode node, @NotNull InferenceNode container) {
                Intrinsics.checkNotNullParameter(node, "node");
                Intrinsics.checkNotNullParameter(container, "container");
                return node.parameterIndex(container);
            }

            @Override // androidx.compose.compiler.plugins.kotlin.inference.NodeAdapter
            @Nullable
            public InferenceFunction typeOf(@NotNull InferenceNode node) {
                Intrinsics.checkNotNullParameter(node, "node");
                return node.getFunction();
            }
        }, new LazySchemeStorage<InferenceNode>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableTargetAnnotationsTransformer$infer$3

            @NotNull
            private final Map<InferenceNode, LazyScheme> map = new LinkedHashMap();

            @NotNull
            public final Map<InferenceNode, LazyScheme> getMap() {
                return this.map;
            }

            @Override // androidx.compose.compiler.plugins.kotlin.inference.LazySchemeStorage
            @Nullable
            public LazyScheme getLazyScheme(@NotNull InferenceNode node) {
                Intrinsics.checkNotNullParameter(node, "node");
                return this.map.get(node);
            }

            @Override // androidx.compose.compiler.plugins.kotlin.inference.LazySchemeStorage
            public void storeLazyScheme(@NotNull InferenceNode node, @NotNull LazyScheme value) {
                Intrinsics.checkNotNullParameter(node, "node");
                Intrinsics.checkNotNullParameter(value, "value");
                this.map.put(node, value);
            }
        }, new ErrorReporter<InferenceNode>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposableTargetAnnotationsTransformer$infer$4
            @Override // androidx.compose.compiler.plugins.kotlin.inference.ErrorReporter
            public void reportCallError(@NotNull InferenceNode node, @NotNull String expected, @NotNull String received) {
                Intrinsics.checkNotNullParameter(node, "node");
                Intrinsics.checkNotNullParameter(expected, "expected");
                Intrinsics.checkNotNullParameter(received, "received");
            }

            @Override // androidx.compose.compiler.plugins.kotlin.inference.ErrorReporter
            public void reportParameterError(@NotNull InferenceNode node, int index, @NotNull String expected, @NotNull String received) {
                Intrinsics.checkNotNullParameter(node, "node");
                Intrinsics.checkNotNullParameter(expected, "expected");
                Intrinsics.checkNotNullParameter(received, "received");
            }

            @Override // androidx.compose.compiler.plugins.kotlin.inference.ErrorReporter
            public void log(@Nullable InferenceNode node, @NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                IrElement element = node != null ? node.getElement() : null;
                if (metrics.isEmpty()) {
                    return;
                }
                metrics.log("applier inference" + this.lineInfoOf(element) + ": " + message);
            }
        });
    }

    private final IrConstructorCallImpl annotation(IrClassSymbol classSymbol) {
        return new IrConstructorCallImpl(-1, -1, IrTypesKt.getDefaultType((IrClassifierSymbol) classSymbol), (IrConstructorSymbol) SequencesKt.first(IrUtilsKt.getConstructors(classSymbol)), 0, 0, 1, (IrStatementOrigin) null, (SourceElement) null, PSKKeyManager.MAX_KEY_LENGTH_BYTES, (DefaultConstructorMarker) null);
    }

    private final List<IrConstructorCall> filteredAnnotations(List<? extends IrConstructorCall> annotations) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : annotations) {
            IrConstructorCall irConstructorCall = (IrConstructorCall) obj;
            if ((ComposableTargetAnnotationsTransformerKt.isComposableTarget(irConstructorCall) || ComposableTargetAnnotationsTransformerKt.isComposableOpenTarget(irConstructorCall) || ComposableTargetAnnotationsTransformerKt.isComposableInferredTarget(irConstructorCall)) ? false : true) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final IrFunctionExpression findTransformedLambda(IrElement irElement) {
        IrFunctionExpression irFunctionExpressionFindTransformedLambda;
        if (irElement instanceof IrCall) {
            for (IrExpression irExpression : ComposableTargetAnnotationsTransformerKt.getArguments((IrCall) irElement)) {
                irFunctionExpressionFindTransformedLambda = irExpression != null ? findTransformedLambda((IrElement) irExpression) : null;
                if (irFunctionExpressionFindTransformedLambda != null) {
                }
            }
            return null;
        }
        if (irElement instanceof IrGetField) {
            IrExpressionBody initializer = ((IrGetField) irElement).getSymbol().getOwner().getInitializer();
            if (initializer != null) {
                return findTransformedLambda((IrElement) initializer);
            }
            return null;
        }
        if (irElement instanceof IrBody) {
            Iterator it = IrUtilsKt.getStatements((IrBody) irElement).iterator();
            while (it.hasNext()) {
                irFunctionExpressionFindTransformedLambda = findTransformedLambda((IrElement) ((IrStatement) it.next()));
                if (irFunctionExpressionFindTransformedLambda != null) {
                }
            }
            return null;
        }
        if (irElement instanceof IrReturn) {
            return findTransformedLambda((IrElement) ((IrReturn) irElement).getValue());
        }
        if (!(irElement instanceof IrFunctionExpression)) {
            return null;
        }
        IrFunctionExpression irFunctionExpression = (IrFunctionExpression) irElement;
        if (isTransformedLambda(irFunctionExpression)) {
            return irFunctionExpression;
        }
        return null;
        return irFunctionExpressionFindTransformedLambda;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposableTargetAnnotationsTransformer getTransformer() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    private final boolean hasComposableArguments(IrCall irCall) {
        boolean z;
        IrType type;
        List<IrExpression> arguments = ComposableTargetAnnotationsTransformerKt.getArguments(irCall);
        if ((arguments instanceof Collection) && arguments.isEmpty()) {
            return false;
        }
        for (IrExpression irExpression : arguments) {
            if (irExpression == null || (type = irExpression.getType()) == null) {
                z = false;
            } else if (isOrHasComposableLambda$compiler_hosted(type) || isSamComposable(type)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final boolean hasComposableParameter(IrFunction irFunction) {
        List valueParameters = irFunction.getValueParameters();
        if ((valueParameters instanceof Collection) && valueParameters.isEmpty()) {
            return false;
        }
        Iterator it = valueParameters.iterator();
        while (it.hasNext()) {
            if (isComposable(((IrValueParameter) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    private final InferenceResolvedParameter inferenceParameterOrNull(IrGetValue getValue) {
        Pair<IrFunction, Integer> pair = this.parameterOwners.get(getValue.getSymbol());
        if (pair != null) {
            return new InferenceResolvedParameter(getValue, inferenceFunctionOf(pair.getFirst()), ComposableTargetAnnotationsTransformerKt.inferenceNodeOf(pair.getFirst(), this), pair.getSecond().intValue());
        }
        return null;
    }

    private final boolean isComposable(IrFunction irFunction) {
        boolean z;
        List valueParameters = irFunction.getValueParameters();
        if (!(valueParameters instanceof Collection) || !valueParameters.isEmpty()) {
            Iterator it = valueParameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (Intrinsics.areEqual(((IrValueParameter) it.next()).getName(), KtxNameConventions.INSTANCE.getCOMPOSER_PARAMETER())) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        return z || AdditionalIrUtilsKt.hasAnnotation(irFunction.getAnnotations(), ComposeFqNames.INSTANCE.getComposable());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (hasTransformedLambda$compiler_hosted(r4) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if ((r4 != null ? findTransformedLambda((org.jetbrains.kotlin.ir.IrElement) r4) : null) != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean isComposableLambda(IrElement irElement) {
        if (irElement instanceof IrFunctionExpression) {
            return isComposable((IrFunction) ((IrFunctionExpression) irElement).getFunction());
        }
        if (irElement instanceof IrCall) {
            IrCall irCall = (IrCall) irElement;
            if (!isComposableSingletonGetter(irCall)) {
            }
            return true;
        }
        if (irElement instanceof IrGetField) {
            IrExpressionBody initializer = ((IrGetField) irElement).getSymbol().getOwner().getInitializer();
        }
        return false;
    }

    private final boolean isComposableParameter(IrElement irElement) {
        if (!(irElement instanceof IrGetValue)) {
            return false;
        }
        IrGetValue irGetValue = (IrGetValue) irElement;
        return this.parameterOwners.get(irGetValue.getSymbol()) != null && isComposable(irGetValue.getType());
    }

    private final boolean isSamComposable(IrType irType) {
        IrSimpleFunction irSimpleFunctionSamOwnerOrNull = ComposableTargetAnnotationsTransformerKt.samOwnerOrNull(irType);
        return irSimpleFunctionSamOwnerOrNull != null && isComposable((IrFunction) irSimpleFunctionSamOwnerOrNull);
    }

    private final boolean isTransformedLambda(IrFunctionExpression irFunctionExpression) {
        return Intrinsics.areEqual(WeakBindingTraceKt.getIrTrace(getContext()).get(ComposeWritableSlices.INSTANCE.getIS_TRANSFORMED_LAMBDA(), (IrAttributeContainer) irFunctionExpression), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String lineInfoOf(IrElement element) {
        IrFile irFile = this.currentFile;
        if (element == null || irFile == null) {
            return "";
        }
        return ZegoConstants.ZegoVideoDataAuxPublishingStream + IrDeclarationsKt.getName(irFile) + CertificateUtil.DELIMITER + (irFile.getFileEntry().getLineNumber(element.getStartOffset()) + 1) + CertificateUtil.DELIMITER + (irFile.getFileEntry().getColumnNumber(element.getStartOffset()) + 1);
    }

    private final InferenceNode resolveExpressionOrNull(IrElement expression) {
        if (expression instanceof IrGetValue) {
            IrGetValue irGetValue = (IrGetValue) expression;
            InferenceResolvedParameter inferenceResolvedParameterInferenceParameterOrNull = inferenceParameterOrNull(irGetValue);
            return inferenceResolvedParameterInferenceParameterOrNull != null ? inferenceResolvedParameterInferenceParameterOrNull : this.variableDeclarations.get(irGetValue.getSymbol());
        }
        if (expression instanceof IrCall) {
            return this.variableDeclarations.get(((IrCall) expression).getSymbol());
        }
        return null;
    }

    private final IrConstructorCall toAnnotation(Item item) {
        IrClassSymbol irClassSymbol = this.ComposableTargetClass;
        IrConstructorCallImpl irConstructorCallImplAnnotation = null;
        if (irClassSymbol == null || this.ComposableOpenTargetClass == null) {
            return null;
        }
        if (item instanceof Token) {
            irConstructorCallImplAnnotation = annotation(irClassSymbol);
            irConstructorCallImplAnnotation.putValueArgument(0, irConst(((Token) item).getValue()));
        } else {
            if (!(item instanceof Open)) {
                throw new NoWhenBranchMatchedException();
            }
            Open open = (Open) item;
            if (open.getIndex() >= 0) {
                irConstructorCallImplAnnotation = annotation(this.ComposableOpenTargetClass);
                irConstructorCallImplAnnotation.putValueArgument(0, irConst(open.getIndex()));
            }
        }
        return (IrConstructorCall) irConstructorCallImplAnnotation;
    }

    private final List<IrConstructorCall> toAnnotations(Item item) {
        List<IrConstructorCall> listListOf;
        IrConstructorCall annotation = toAnnotation(item);
        return (annotation == null || (listListOf = CollectionsKt.listOf(annotation)) == null) ? CollectionsKt.emptyList() : listListOf;
    }

    private static final Scheme toScheme$lambda$27$toScheme(ComposableTargetAnnotationsTransformer composableTargetAnnotationsTransformer, Item item, IrTypeArgument irTypeArgument) {
        if (irTypeArgument instanceof IrTypeProjection) {
            IrTypeProjection irTypeProjection = (IrTypeProjection) irTypeArgument;
            if (composableTargetAnnotationsTransformer.isOrHasComposableLambda$compiler_hosted(irTypeProjection.getType())) {
                return composableTargetAnnotationsTransformer.toScheme(irTypeProjection.getType(), item);
            }
        }
        return null;
    }

    private static final void visitCall$recordArgument(ComposableTargetAnnotationsTransformer composableTargetAnnotationsTransformer, List<IrExpression> list, IrExpression irExpression) {
        if (irExpression != null) {
            IrElement irElement = (IrElement) irExpression;
            if (composableTargetAnnotationsTransformer.isComposableLambda(irElement) || composableTargetAnnotationsTransformer.isComposableParameter(irElement) || composableTargetAnnotationsTransformer.isOrHasComposableLambda$compiler_hosted(irExpression.getType())) {
                list.add(irExpression);
            }
        }
    }

    private static final void visitFunction$recordParameter(ComposableTargetAnnotationsTransformer composableTargetAnnotationsTransformer, IrFunction irFunction, Ref.IntRef intRef, IrValueParameter irValueParameter) {
        if (composableTargetAnnotationsTransformer.isOrHasComposableLambda$compiler_hosted(irValueParameter.getType())) {
            Map<IrSymbol, Pair<IrFunction, Integer>> map = composableTargetAnnotationsTransformer.parameterOwners;
            IrValueParameterSymbol symbol = irValueParameter.getSymbol();
            int i = intRef.element;
            intRef.element = i + 1;
            map.put(symbol, TuplesKt.to(irFunction, Integer.valueOf(i)));
        }
    }

    @Nullable
    public final Scheme getScheme(@NotNull IrFunction irFunction) {
        Object next;
        String str;
        Intrinsics.checkNotNullParameter(irFunction, "<this>");
        Iterator it = irFunction.getAnnotations().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ComposableTargetAnnotationsTransformerKt.isComposableInferredTarget((IrConstructorCall) next));
        IrConstructorCall irConstructorCall = (IrConstructorCall) next;
        if (irConstructorCall == null) {
            return null;
        }
        if (irConstructorCall.getValueArgumentsCount() >= 1) {
            IrConst valueArgument = irConstructorCall.getValueArgument(0);
            IrConst irConst = valueArgument instanceof IrConst ? valueArgument : null;
            Object value = irConst != null ? irConst.getValue() : null;
            if (!(value instanceof String)) {
                value = null;
            }
            str = (String) value;
        } else {
            str = null;
        }
        if (str != null) {
            return SchemeKt.deserializeScheme(str);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.compiler.plugins.kotlin.inference.Item] */
    @NotNull
    public final Item getTarget(@NotNull List<? extends IrConstructorCall> list) {
        ?? token;
        Object next;
        Object next2;
        Open open;
        Object next3;
        FqName fqNameWhenAvailable;
        Integer num;
        String str;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        do {
            token = 0;
            token = 0;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ComposableTargetAnnotationsTransformerKt.isComposableTarget((IrConstructorCall) next));
        IrConstructorCall irConstructorCall = (IrConstructorCall) next;
        boolean z = false;
        if (irConstructorCall != null) {
            if (irConstructorCall.getValueArgumentsCount() >= 1) {
                IrConst valueArgument = irConstructorCall.getValueArgument(0);
                IrConst irConst = valueArgument instanceof IrConst ? valueArgument : null;
                Object value = irConst != null ? irConst.getValue() : null;
                if (!(value instanceof String)) {
                    value = null;
                }
                str = (String) value;
            } else {
                str = null;
            }
            Token token2 = str != null ? new Token(str) : null;
            if (token2 != null) {
                return token2;
            }
        }
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!ComposableTargetAnnotationsTransformerKt.isComposableOpenTarget((IrConstructorCall) next2));
        IrConstructorCall irConstructorCall2 = (IrConstructorCall) next2;
        if (irConstructorCall2 == null) {
            open = null;
        } else {
            if (irConstructorCall2.getValueArgumentsCount() >= 1) {
                IrConst valueArgument2 = irConstructorCall2.getValueArgument(0);
                IrConst irConst2 = valueArgument2 instanceof IrConst ? valueArgument2 : null;
                Object value2 = irConst2 != null ? irConst2.getValue() : null;
                if (!(value2 instanceof Integer)) {
                    value2 = null;
                }
                num = (Integer) value2;
            } else {
                num = null;
            }
            if (num != null) {
                open = new Open(num.intValue(), z, 2, token);
            } else {
                open = null;
            }
        }
        if (open != null) {
            return open;
        }
        Iterator it3 = list.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!ComposableTargetAnnotationsTransformerKt.isComposableTargetMarked((IrConstructorCall) next3));
        IrConstructorCall irConstructorCall3 = (IrConstructorCall) next3;
        if (irConstructorCall3 != null && (fqNameWhenAvailable = IrUtilsKt.getFqNameWhenAvailable(IrUtilsKt.getParentAsClass(irConstructorCall3.getSymbol().getOwner()))) != null) {
            String strAsString = fqNameWhenAvailable.asString();
            Intrinsics.checkNotNullExpressionValue(strAsString, "it.asString()");
            token = new Token(strAsString);
        }
        return token != 0 ? token : new Open(-1, true);
    }

    public final boolean hasSchemeSpecified(@NotNull IrFunction irFunction) {
        Intrinsics.checkNotNullParameter(irFunction, "<this>");
        List<IrConstructorCall> annotations = irFunction.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        for (IrConstructorCall irConstructorCall : annotations) {
            if (ComposableTargetAnnotationsTransformerKt.isComposableTarget(irConstructorCall) || ComposableTargetAnnotationsTransformerKt.isComposableOpenTarget(irConstructorCall) || ComposableTargetAnnotationsTransformerKt.isComposableInferredTarget(irConstructorCall) || ComposableTargetAnnotationsTransformerKt.isComposableTargetMarked(irConstructorCall)) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasTransformedLambda$compiler_hosted(@NotNull IrCall irCall) {
        Intrinsics.checkNotNullParameter(irCall, "<this>");
        return Intrinsics.areEqual(WeakBindingTraceKt.getIrTrace(getContext()).get(ComposeWritableSlices.INSTANCE.getHAS_TRANSFORMED_LAMBDA(), (IrAttributeContainer) irCall), Boolean.TRUE);
    }

    @NotNull
    public final InferenceFunctionDeclaration inferenceFunctionOf(@NotNull IrFunction function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new InferenceFunctionDeclaration(this, function);
    }

    @NotNull
    public final InferenceFunctionType inferenceFunctionTypeOf(@NotNull IrType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new InferenceFunctionType(this, type);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    public final boolean isOrHasComposableLambda$compiler_hosted(@NotNull IrType irType) {
        boolean z;
        List arguments;
        boolean z2;
        Intrinsics.checkNotNullParameter(irType, "<this>");
        if (isComposableLambda(irType) || isSamComposable(irType)) {
            return true;
        }
        IrSimpleType irSimpleType = irType instanceof IrSimpleType ? (IrSimpleType) irType : null;
        if (irSimpleType == null || (arguments = irSimpleType.getArguments()) == null) {
            z = false;
        } else {
            if (!arguments.isEmpty()) {
                Iterator it = arguments.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    IrType typeOrNull = IrTypesKt.getTypeOrNull((IrTypeArgument) it.next());
                    if (typeOrNull != null && isOrHasComposableLambda$compiler_hosted(typeOrNull)) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            if (z2) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.ModuleLoweringPass
    public void lower(@NotNull IrModuleFragment module) {
        Intrinsics.checkNotNullParameter(module, "module");
        if (this.ComposableTargetClass == null || this.ComposableInferredTargetClass == null || this.ComposableOpenTargetClass == null) {
            return;
        }
        IrElementTransformerVoidKt.transformChildrenVoid((IrElement) module, this);
    }

    @NotNull
    public final IrFunctionExpression singletonFunctionExpression$compiler_hosted(@NotNull IrCall irCall) {
        IrFunctionExpression irFunctionExpressionFindTransformedLambda;
        Intrinsics.checkNotNullParameter(irCall, "<this>");
        IrBody body = irCall.getSymbol().getOwner().getBody();
        if (body != null && (irFunctionExpressionFindTransformedLambda = findTransformedLambda((IrElement) body)) != null) {
            return irFunctionExpressionFindTransformedLambda;
        }
        throw new IllegalStateException(("Could not find the singleton lambda for " + DumpIrTreeKt.dump$default((IrElement) irCall, false, false, 3, (Object) null)).toString());
    }

    @NotNull
    public final Scheme toScheme(@NotNull IrType irType, @NotNull Item defaultTarget) {
        Intrinsics.checkNotNullParameter(irType, "<this>");
        Intrinsics.checkNotNullParameter(defaultTarget, "defaultTarget");
        List arguments = ((irType instanceof IrSimpleType) && IrTypeUtilsKt.isFunction(irType)) ? ((IrSimpleType) irType).getArguments() : CollectionsKt.emptyList();
        Item target = getTarget(irType.getAnnotations());
        Item item = target.getIsUnspecified() ? defaultTarget : target;
        List listTakeUpTo = ComposableTargetAnnotationsTransformerKt.takeUpTo(arguments, arguments.size() - 1);
        ArrayList arrayList = new ArrayList();
        Iterator it = listTakeUpTo.iterator();
        while (it.hasNext()) {
            Scheme scheme$lambda$27$toScheme = toScheme$lambda$27$toScheme(this, defaultTarget, (IrTypeArgument) it.next());
            if (scheme$lambda$27$toScheme != null) {
                arrayList.add(scheme$lambda$27$toScheme);
            }
        }
        IrTypeArgument irTypeArgument = (IrTypeArgument) CollectionsKt.lastOrNull(arguments);
        return new Scheme(item, arrayList, irTypeArgument != null ? toScheme$lambda$27$toScheme(this, defaultTarget, irTypeArgument) : null, false, 8, null);
    }

    @NotNull
    public final IrFunctionExpression transformedLambda$compiler_hosted(@NotNull IrElement irElement) {
        Intrinsics.checkNotNullParameter(irElement, "<this>");
        IrFunctionExpression irFunctionExpressionFindTransformedLambda = findTransformedLambda(irElement);
        if (irFunctionExpressionFindTransformedLambda != null) {
            return irFunctionExpressionFindTransformedLambda;
        }
        throw new IllegalStateException(("Could not find the lambda for " + DumpIrTreeKt.dump$default(irElement, false, false, 3, (Object) null)).toString());
    }

    @NotNull
    public final List<IrConstructorCall> updatedAnnotations(@NotNull List<? extends IrConstructorCall> annotations, @NotNull Item target) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(target, "target");
        return CollectionsKt.plus((Collection) filteredAnnotations(annotations), (Iterable) toAnnotations(target));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0111  */
    /* JADX WARN: Code duplicated, block: B:73:0x0116  */
    @NotNull
    public IrExpression visitCall(@NotNull IrCall expression) {
        IrExpression dispatchReceiver;
        InferenceNode inferenceNodeResolveExpressionOrNull;
        boolean z;
        boolean z2;
        IrType type;
        IrType type2;
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrFunction irFunction = this.currentOwner;
        if (irFunction != null && (isComposableCall(expression) || hasComposableArguments(expression))) {
            FqName fqNameWhenAvailable = IrUtilsKt.getFqNameWhenAvailable(expression.getSymbol().getOwner());
            ComposeFqNames composeFqNames = ComposeFqNames.INSTANCE;
            if (!(Intrinsics.areEqual(fqNameWhenAvailable, composeFqNames.getGetCurrentComposerFullName()) ? true : Intrinsics.areEqual(fqNameWhenAvailable, composeFqNames.getComposableLambdaFullName()))) {
                this.ownerMap.put(expression, irFunction);
                IrExpression irExpressionVisitCall = super.visitCall(expression);
                if (isInvoke(expression)) {
                    dispatchReceiver = expression.getDispatchReceiver();
                    if (dispatchReceiver != null) {
                        inferenceNodeResolveExpressionOrNull = resolveExpressionOrNull((IrElement) dispatchReceiver);
                    } else {
                        inferenceNodeResolveExpressionOrNull = null;
                    }
                } else {
                    IrExpression dispatchReceiver2 = expression.getDispatchReceiver();
                    if ((dispatchReceiver2 == null || (type2 = dispatchReceiver2.getType()) == null || !isSamComposable(type2)) ? false : true) {
                        dispatchReceiver = expression.getDispatchReceiver();
                        if (dispatchReceiver != null) {
                            inferenceNodeResolveExpressionOrNull = resolveExpressionOrNull((IrElement) dispatchReceiver);
                        } else {
                            inferenceNodeResolveExpressionOrNull = null;
                        }
                    } else {
                        inferenceNodeResolveExpressionOrNull = resolveExpressionOrNull((IrElement) expression);
                    }
                }
                if (inferenceNodeResolveExpressionOrNull == null) {
                    inferenceNodeResolveExpressionOrNull = new InferenceCallTargetNode(this, expression);
                }
                if (inferenceNodeResolveExpressionOrNull.isOverlyWide()) {
                    return irExpressionVisitCall;
                }
                List arguments = ComposableTargetAnnotationsTransformerKt.getArguments(expression);
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (Object obj : arguments) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    IrContainerExpression irContainerExpression = (IrExpression) obj;
                    if (irContainerExpression != null) {
                        IrElement irElement = (IrElement) irContainerExpression;
                        if (isComposableLambda(irElement) || isComposableParameter(irElement)) {
                            z2 = true;
                        } else {
                            if (((irContainerExpression instanceof IrContainerExpression) && Intrinsics.areEqual(irContainerExpression.getOrigin(), IrStatementOrigin.DEFAULT_VALUE.INSTANCE)) || (irContainerExpression instanceof IrBlock) || IrUtilsKt.isNullConst(irContainerExpression)) {
                                List valueParameters = expression.getSymbol().getOwner().getValueParameters();
                                type = i < valueParameters.size() ? ((IrValueParameter) valueParameters.get(i)).getType() : null;
                            } else {
                                type = irContainerExpression.getType();
                            }
                            if (type != null && isOrHasComposableLambda$compiler_hosted(type)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(obj);
                    }
                    i = i2;
                }
                List mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.filterNotNull(arrayList));
                visitCall$recordArgument(this, mutableList, expression.getExtensionReceiver());
                ApplierInferencer<InferenceFunction, InferenceNode> applierInferencer = this.infer;
                InferenceNode inferenceNodeInferenceNodeOf = ComposableTargetAnnotationsTransformerKt.inferenceNodeOf((IrElement) expression, getTransformer());
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(mutableList, 10));
                Iterator it = mutableList.iterator();
                while (it.hasNext()) {
                    IrElement irElement2 = (IrElement) ((IrExpression) it.next());
                    InferenceNode inferenceNodeResolveExpressionOrNull2 = resolveExpressionOrNull(irElement2);
                    if (inferenceNodeResolveExpressionOrNull2 == null) {
                        inferenceNodeResolveExpressionOrNull2 = ComposableTargetAnnotationsTransformerKt.inferenceNodeOf(irElement2, getTransformer());
                    }
                    arrayList2.add(inferenceNodeResolveExpressionOrNull2);
                }
                applierInferencer.visitCall(inferenceNodeInferenceNodeOf, inferenceNodeResolveExpressionOrNull, arrayList2);
                return irExpressionVisitCall;
            }
        }
        return super.visitCall(expression);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException */
    @NotNull
    public IrFile visitFile(@NotNull IrFile declaration) throws Exception {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        try {
            this.currentFile = declaration;
            IrFile irFileVisitFile = super.visitFile(declaration);
            this.currentFile = null;
            return irFileVisitFile;
        } catch (Exception e) {
            throw new Exception(o00O00OO.OooO00o("IR lowering failed at: ", IrDeclarationsKt.getName(declaration)), e);
        } catch (ProcessCanceledException e2) {
            throw e2;
        }
    }

    @NotNull
    public IrStatement visitFunction(@NotNull IrFunction declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        if (hasSchemeSpecified(declaration) || (!(isComposable(declaration) || hasComposableParameter(declaration)) || ComposableTargetAnnotationsTransformerKt.hasOverlyWideParameters(declaration) || ComposableTargetAnnotationsTransformerKt.hasOpenTypeParameters(declaration))) {
            return super.visitFunction(declaration);
        }
        IrFunction irFunction = this.currentOwner;
        this.currentOwner = declaration;
        Ref.IntRef intRef = new Ref.IntRef();
        Iterator it = declaration.getValueParameters().iterator();
        while (it.hasNext()) {
            visitFunction$recordParameter(this, declaration, intRef, (IrValueParameter) it.next());
        }
        IrValueParameter extensionReceiverParameter = declaration.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            visitFunction$recordParameter(this, declaration, intRef, extensionReceiverParameter);
        }
        IrStatement irStatementVisitFunction = super.visitFunction(declaration);
        this.currentOwner = irFunction;
        return irStatementVisitFunction;
    }

    @NotNull
    public IrStatement visitLocalDelegatedProperty(@NotNull IrLocalDelegatedProperty declaration) {
        InferenceVariable inferenceVariable;
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        IrStatement irStatementVisitLocalDelegatedProperty = super.visitLocalDelegatedProperty(declaration);
        if (!isOrHasComposableLambda$compiler_hosted(declaration.getType()) || (inferenceVariable = this.variableDeclarations.get(declaration.getDelegate().getSymbol())) == null) {
            return irStatementVisitLocalDelegatedProperty;
        }
        this.variableDeclarations.put(declaration.getGetter().getSymbol(), inferenceVariable);
        return irStatementVisitLocalDelegatedProperty;
    }

    @NotNull
    public IrStatement visitVariable(@NotNull IrVariable declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        if (isOrHasComposableLambda$compiler_hosted(declaration.getType())) {
            IrFunction irFunction = this.currentOwner;
            if (irFunction != null) {
                this.ownerMap.put(declaration, irFunction);
            }
            IrExpression initializer = declaration.getInitializer();
            if (initializer != null) {
                InferenceNode inferenceNodeResolveExpressionOrNull = resolveExpressionOrNull((IrElement) initializer);
                if (inferenceNodeResolveExpressionOrNull == null) {
                    inferenceNodeResolveExpressionOrNull = new InferenceElementExpression(getTransformer(), initializer);
                }
                InferenceVariable inferenceVariable = new InferenceVariable(this, declaration);
                this.variableDeclarations.put(declaration.getSymbol(), inferenceVariable);
                this.infer.visitVariable(inferenceVariable, inferenceNodeResolveExpressionOrNull);
            }
        }
        return super.visitVariable(declaration);
    }

    private final List<IrConstructorCall> toAnnotations(Scheme scheme) {
        IrClassSymbol irClassSymbol = this.ComposableInferredTargetClass;
        if (irClassSymbol == null) {
            return CollectionsKt.emptyList();
        }
        IrConstructorCallImpl irConstructorCallImplAnnotation = annotation(irClassSymbol);
        irConstructorCallImplAnnotation.putValueArgument(0, irConst(scheme.serialize()));
        return CollectionsKt.listOf(irConstructorCallImplAnnotation);
    }

    @NotNull
    public final List<IrConstructorCall> updatedAnnotations(@NotNull List<? extends IrConstructorCall> annotations, @NotNull Scheme scheme) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        return CollectionsKt.plus((Collection) filteredAnnotations(annotations), (Iterable) toAnnotations(scheme));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    private final boolean isComposableLambda(IrType irType) {
        boolean z;
        List arguments;
        boolean z2;
        if (Intrinsics.areEqual(IrTypesKt.getClassFqName(irType), ComposeFqNames.INSTANCE.getComposableLambdaType())) {
            return true;
        }
        IrSimpleType irSimpleType = irType instanceof IrSimpleType ? (IrSimpleType) irType : null;
        if (irSimpleType == null || (arguments = irSimpleType.getArguments()) == null) {
            z = false;
        } else {
            if (!arguments.isEmpty()) {
                Iterator it = arguments.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    IrType typeOrNull = IrTypesKt.getTypeOrNull((IrTypeArgument) it.next());
                    if (Intrinsics.areEqual(typeOrNull != null ? IrTypesKt.getClassFqName(typeOrNull) : null, ComposeFqNames.INSTANCE.getComposer())) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            if (z2) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private final boolean isComposable(IrType irType) {
        return isComposableLambda(irType) || isSamComposable(irType);
    }
}
