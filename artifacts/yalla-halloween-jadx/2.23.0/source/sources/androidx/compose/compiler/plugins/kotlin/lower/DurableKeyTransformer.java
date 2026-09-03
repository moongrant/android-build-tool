package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ModuleMetrics;
import com.facebook.internal.security.CertificateUtil;
import com.qiniu.android.collect.ReportItem;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationWithName;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationsKt;
import org.jetbrains.kotlin.ir.declarations.IrEnumEntry;
import org.jetbrains.kotlin.ir.declarations.IrField;
import org.jetbrains.kotlin.ir.declarations.IrFile;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.declarations.IrPackageFragment;
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
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrElseBranch;
import org.jetbrains.kotlin.ir.expressions.IrEnumConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
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
import org.jetbrains.kotlin.ir.expressions.impl.IrElseBranchImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrStringConcatenationImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl;
import org.jetbrains.kotlin.ir.types.IrDynamicType;
import org.jetbrains.kotlin.ir.types.IrErrorType;
import org.jetbrains.kotlin.ir.types.IrSimpleType;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformer;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt;
import org.jetbrains.kotlin.name.Name;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0004J)\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0017H\u0004¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J/\u0010\u001d\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0017H\u0004¢\u0006\u0002\u0010 J!\u0010!\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0017H\u0004¢\u0006\u0002\u0010\"J)\u0010!\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0017H\u0004¢\u0006\u0002\u0010\u0018J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0016J\u0010\u0010.\u001a\u00020$2\u0006\u0010%\u001a\u00020/H\u0016J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020$2\u0006\u0010%\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020$2\u0006\u0010%\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020$2\u0006\u0010%\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020;2\u0006\u0010-\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020$2\u0006\u0010%\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u0002012\u0006\u00102\u001a\u00020?H\u0016J\u0010\u0010@\u001a\u00020A2\u0006\u00102\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020F2\u0006\u00102\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u0002012\u0006\u00102\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020$2\u0006\u0010%\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020$2\u0006\u0010%\u001a\u00020LH\u0016J\u0010\u0010M\u001a\u0002012\u0006\u00102\u001a\u00020NH\u0016J\u0010\u0010O\u001a\u00020$2\u0006\u0010%\u001a\u00020PH\u0016J\u0010\u0010Q\u001a\u00020$2\u0006\u0010R\u001a\u00020SH\u0016J\u0010\u0010T\u001a\u0002012\u0006\u00102\u001a\u00020UH\u0016J\u0010\u0010V\u001a\u00020$2\u0006\u0010%\u001a\u00020WH\u0016J\u0010\u0010X\u001a\u0002012\u0006\u00102\u001a\u00020YH\u0016J\u0010\u0010Z\u001a\u00020$2\u0006\u0010%\u001a\u00020[H\u0016J\f\u0010\\\u001a\u00020\u000e*\u00020]H\u0004J\f\u0010^\u001a\u00020\u000e*\u00020_H\u0004J\f\u0010`\u001a\u00020\u000e*\u00020NH\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/DurableKeyTransformer;", "Landroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLowering;", "Landroidx/compose/compiler/plugins/kotlin/lower/ModuleLoweringPass;", "keyVisitor", "Landroidx/compose/compiler/plugins/kotlin/lower/DurableKeyVisitor;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "(Landroidx/compose/compiler/plugins/kotlin/lower/DurableKeyVisitor;Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;)V", "buildKey", "Lkotlin/Pair;", "", "", "prefix", "pathSeparator", "siblingSeparator", "enter", "T", "key", ReportItem.LogTypeBlock, "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "lower", "", "module", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "root", "keys", "", "(Ljava/util/Set;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "siblings", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "visitBlock", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrBlock;", "visitBlockBody", "Lorg/jetbrains/kotlin/ir/expressions/IrBody;", "body", "Lorg/jetbrains/kotlin/ir/expressions/IrBlockBody;", "visitBranch", "Lorg/jetbrains/kotlin/ir/expressions/IrBranch;", "branch", "visitCall", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "visitClass", "Lorg/jetbrains/kotlin/ir/IrStatement;", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "visitComposite", "Lorg/jetbrains/kotlin/ir/expressions/IrComposite;", "visitConstructorCall", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "visitDelegatingConstructorCall", "Lorg/jetbrains/kotlin/ir/expressions/IrDelegatingConstructorCall;", "visitElseBranch", "Lorg/jetbrains/kotlin/ir/expressions/IrElseBranch;", "visitEnumConstructorCall", "Lorg/jetbrains/kotlin/ir/expressions/IrEnumConstructorCall;", "visitEnumEntry", "Lorg/jetbrains/kotlin/ir/declarations/IrEnumEntry;", "visitFile", "Lorg/jetbrains/kotlin/ir/declarations/IrFile;", "visitLoop", "loop", "Lorg/jetbrains/kotlin/ir/expressions/IrLoop;", "visitPackageFragment", "Lorg/jetbrains/kotlin/ir/declarations/IrPackageFragment;", "visitProperty", "Lorg/jetbrains/kotlin/ir/declarations/IrProperty;", "visitSetField", "Lorg/jetbrains/kotlin/ir/expressions/IrSetField;", "visitSetValue", "Lorg/jetbrains/kotlin/ir/expressions/IrSetValue;", "visitSimpleFunction", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "visitStringConcatenation", "Lorg/jetbrains/kotlin/ir/expressions/IrStringConcatenation;", "visitTry", "aTry", "Lorg/jetbrains/kotlin/ir/expressions/IrTry;", "visitValueParameter", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "visitVararg", "Lorg/jetbrains/kotlin/ir/expressions/IrVararg;", "visitVariable", "Lorg/jetbrains/kotlin/ir/declarations/IrVariable;", "visitWhen", "Lorg/jetbrains/kotlin/ir/expressions/IrWhen;", "asJvmFriendlyString", "Lorg/jetbrains/kotlin/name/Name;", "asString", "Lorg/jetbrains/kotlin/ir/types/IrType;", "signatureString", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDurableKeyTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurableKeyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/DurableKeyTransformer\n+ 2 AbstractComposeLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLoweringKt\n*L\n1#1,462:1\n1146#2,6:463\n*S KotlinDebug\n*F\n+ 1 DurableKeyTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/DurableKeyTransformer\n*L\n111#1:463,6\n*E\n"})
public class DurableKeyTransformer extends AbstractComposeLowering {

    @NotNull
    private final DurableKeyVisitor keyVisitor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DurableKeyTransformer(@NotNull DurableKeyVisitor keyVisitor, @NotNull IrPluginContext context, @NotNull DeepCopySymbolRemapper symbolRemapper, @NotNull ModuleMetrics metrics) {
        super(context, symbolRemapper, metrics);
        Intrinsics.checkNotNullParameter(keyVisitor, "keyVisitor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(symbolRemapper, "symbolRemapper");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.keyVisitor = keyVisitor;
    }

    public static /* synthetic */ Pair buildKey$default(DurableKeyTransformer durableKeyTransformer, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildKey");
        }
        if ((i & 2) != 0) {
            str2 = "/";
        }
        if ((i & 4) != 0) {
            str3 = CertificateUtil.DELIMITER;
        }
        return durableKeyTransformer.buildKey(str, str2, str3);
    }

    @NotNull
    public final String asJvmFriendlyString(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "<this>");
        if (name.isSpecial()) {
            String strAsString = name.asString();
            Intrinsics.checkNotNullExpressionValue(strAsString, "asString()");
            return StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(strAsString, Typography.less, Typography.dollar, false, 4, (Object) null), Typography.greater, Typography.dollar, false, 4, (Object) null), ' ', '-', false, 4, (Object) null);
        }
        String identifier = name.getIdentifier();
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier");
        return identifier;
    }

    @NotNull
    public final String asString(@NotNull IrType irType) {
        Intrinsics.checkNotNullParameter(irType, "<this>");
        if (irType instanceof IrDynamicType) {
            return "dynamic";
        }
        if (irType instanceof IrErrorType) {
            return "IrErrorType";
        }
        if (irType instanceof IrSimpleType) {
            IrDeclarationWithName owner = ((IrSimpleType) irType).getClassifier().getOwner();
            Intrinsics.checkNotNull(owner, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrDeclarationWithName");
            String strAsString = owner.getName().asString();
            Intrinsics.checkNotNullExpressionValue(strAsString, "classifier.owner as IrDe…WithName).name.asString()");
            return strAsString;
        }
        return "{" + irType.getClass().getSimpleName() + ZegoConstants.ZegoVideoDataAuxPublishingStream + irType + "}";
    }

    @NotNull
    public final Pair<String, Boolean> buildKey(@NotNull String prefix, @NotNull String pathSeparator, @NotNull String siblingSeparator) {
        OooO0OO.OooO00o(prefix, "prefix", pathSeparator, "pathSeparator", siblingSeparator, "siblingSeparator");
        return this.keyVisitor.buildPath(prefix, pathSeparator, siblingSeparator);
    }

    public final <T> T enter(@NotNull String key, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        return (T) this.keyVisitor.enter(key, block);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.ModuleLoweringPass
    public void lower(@NotNull IrModuleFragment module) {
        Intrinsics.checkNotNullParameter(module, "module");
        IrElementTransformerVoidKt.transformChildrenVoid((IrElement) module, this);
    }

    public final <T> T root(@NotNull Set<String> keys, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(block, "block");
        return (T) this.keyVisitor.root(keys, block);
    }

    public final <T> T siblings(@NotNull String key, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        return (T) this.keyVisitor.siblings(key, block);
    }

    @NotNull
    public final String signatureString(@NotNull IrSimpleFunction irSimpleFunction) {
        Intrinsics.checkNotNullParameter(irSimpleFunction, "<this>");
        StringBuilder sb = new StringBuilder();
        IrValueParameter extensionReceiverParameter = irSimpleFunction.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            sb.append(asString(extensionReceiverParameter.getType()));
            sb.append(".");
        }
        sb.append(asJvmFriendlyString(irSimpleFunction.getName()));
        sb.append('(');
        sb.append(CollectionsKt___CollectionsKt.joinToString$default(irSimpleFunction.getValueParameters(), ",", null, null, 0, null, new Function1<IrValueParameter, CharSequence>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer$signatureString$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull IrValueParameter it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.asString(it.getType());
            }
        }, 30, null));
        sb.append(')');
        sb.append(asString(irSimpleFunction.getReturnType()));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public IrExpression visitBlock(@NotNull final IrBlock expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrStatementOrigin origin = expression.getOrigin();
        if (!(Intrinsics.areEqual(origin, IrStatementOrigin.FOR_LOOP.INSTANCE) ? true : Intrinsics.areEqual(origin, IrStatementOrigin.FOR_LOOP_INNER_WHILE.INSTANCE))) {
            return (IrExpression) siblings(new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitBlock.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final IrExpression invoke() {
                    return DurableKeyTransformer.super.visitBlock(expression);
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
        return (IrBody) siblings(new Function0<IrBody>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitBlockBody.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrBody invoke() {
                return DurableKeyTransformer.super.visitBlockBody(body);
            }
        });
    }

    @NotNull
    public IrBranch visitBranch(@NotNull final IrBranch branch) {
        Intrinsics.checkNotNullParameter(branch, "branch");
        return new IrBranchImpl(branch.getStartOffset(), branch.getEndOffset(), (IrExpression) enter("cond", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitBranch.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                return branch.getCondition().transform(this, (Object) null);
            }
        }), (IrExpression) enter("branch", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitBranch.2
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
        return (IrExpression) enter(o00O00OO.OooO00o("call-", asJvmFriendlyString(expression.getSymbol().getOwner().getName())), new Function0<IrCall>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitCall.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrCall invoke() {
                final IrCall irCall = expression;
                final DurableKeyTransformer durableKeyTransformer = this;
                irCall.setDispatchReceiver((IrExpression) durableKeyTransformer.enter("$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitCall.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression dispatchReceiver = irCall.getDispatchReceiver();
                        if (dispatchReceiver != null) {
                            return dispatchReceiver.transform(durableKeyTransformer, (Object) null);
                        }
                        return null;
                    }
                }));
                final IrCall irCall2 = expression;
                final DurableKeyTransformer durableKeyTransformer2 = this;
                irCall2.setExtensionReceiver((IrExpression) durableKeyTransformer2.enter("$$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitCall.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression extensionReceiver = irCall2.getExtensionReceiver();
                        if (extensionReceiver != null) {
                            return extensionReceiver.transform(durableKeyTransformer2, (Object) null);
                        }
                        return null;
                    }
                }));
                int valueArgumentsCount = expression.getValueArgumentsCount();
                for (final int i = 0; i < valueArgumentsCount; i++) {
                    final IrExpression valueArgument = expression.getValueArgument(i);
                    if (valueArgument != null) {
                        DurableKeyTransformer durableKeyTransformer3 = this;
                        String strOooO00o = android.support.v4.media.OooO00o.OooO00o("arg-", i);
                        final IrCall irCall3 = expression;
                        final DurableKeyTransformer durableKeyTransformer4 = this;
                        durableKeyTransformer3.enter(strOooO00o, new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitCall.1.3
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
                                irCall3.putValueArgument(i, valueArgument.transform(durableKeyTransformer4, (Object) null));
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
        return IrUtilsKt.isAnnotationClass(declaration) ? (IrStatement) declaration : (IrStatement) siblings(o00O00OO.OooO00o("class-", asJvmFriendlyString(declaration.getName())), new Function0<IrStatement>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitClass.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrStatement invoke() {
                return DurableKeyTransformer.super.visitClass(declaration);
            }
        });
    }

    @NotNull
    public IrExpression visitComposite(@NotNull final IrComposite expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        return (IrExpression) siblings(new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitComposite.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                return DurableKeyTransformer.super.visitComposite(expression);
            }
        });
    }

    @NotNull
    public IrExpression visitConstructorCall(@NotNull final IrConstructorCall expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrDeclaration irDeclaration = (IrConstructor) expression.getSymbol().getOwner();
        return IrUtilsKt.isAnnotationClass(IrUtilsKt.getParentAsClass(irDeclaration)) ? (IrExpression) expression : (IrExpression) enter(o00O00OO.OooO00o("call-", asJvmFriendlyString(irDeclaration.getName())), new Function0<IrConstructorCall>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitConstructorCall.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrConstructorCall invoke() {
                final IrConstructorCall irConstructorCall = expression;
                final DurableKeyTransformer durableKeyTransformer = this;
                irConstructorCall.setDispatchReceiver((IrExpression) durableKeyTransformer.enter("$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitConstructorCall.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression dispatchReceiver = irConstructorCall.getDispatchReceiver();
                        if (dispatchReceiver != null) {
                            return dispatchReceiver.transform(durableKeyTransformer, (Object) null);
                        }
                        return null;
                    }
                }));
                final IrConstructorCall irConstructorCall2 = expression;
                final DurableKeyTransformer durableKeyTransformer2 = this;
                irConstructorCall2.setExtensionReceiver((IrExpression) durableKeyTransformer2.enter("$$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitConstructorCall.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression extensionReceiver = irConstructorCall2.getExtensionReceiver();
                        if (extensionReceiver != null) {
                            return extensionReceiver.transform(durableKeyTransformer2, (Object) null);
                        }
                        return null;
                    }
                }));
                int valueArgumentsCount = expression.getValueArgumentsCount();
                for (final int i = 0; i < valueArgumentsCount; i++) {
                    final IrExpression valueArgument = expression.getValueArgument(i);
                    if (valueArgument != null) {
                        DurableKeyTransformer durableKeyTransformer3 = this;
                        String strOooO00o = android.support.v4.media.OooO00o.OooO00o("arg-", i);
                        final IrConstructorCall irConstructorCall3 = expression;
                        final DurableKeyTransformer durableKeyTransformer4 = this;
                        durableKeyTransformer3.enter(strOooO00o, new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitConstructorCall.1.3
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
                                irConstructorCall3.putValueArgument(i, valueArgument.transform(durableKeyTransformer4, (Object) null));
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
        return IrUtilsKt.isAnnotationClass(IrUtilsKt.getParentAsClass(irDeclaration)) ? (IrExpression) expression : (IrExpression) enter(o00O00OO.OooO00o("call-", asJvmFriendlyString(irDeclaration.getName())), new Function0<IrDelegatingConstructorCall>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitDelegatingConstructorCall.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrDelegatingConstructorCall invoke() {
                final IrDelegatingConstructorCall irDelegatingConstructorCall = expression;
                final DurableKeyTransformer durableKeyTransformer = this;
                irDelegatingConstructorCall.setDispatchReceiver((IrExpression) durableKeyTransformer.enter("$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitDelegatingConstructorCall.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression dispatchReceiver = irDelegatingConstructorCall.getDispatchReceiver();
                        if (dispatchReceiver != null) {
                            return dispatchReceiver.transform(durableKeyTransformer, (Object) null);
                        }
                        return null;
                    }
                }));
                final IrDelegatingConstructorCall irDelegatingConstructorCall2 = expression;
                final DurableKeyTransformer durableKeyTransformer2 = this;
                irDelegatingConstructorCall2.setExtensionReceiver((IrExpression) durableKeyTransformer2.enter("$$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitDelegatingConstructorCall.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression extensionReceiver = irDelegatingConstructorCall2.getExtensionReceiver();
                        if (extensionReceiver != null) {
                            return extensionReceiver.transform(durableKeyTransformer2, (Object) null);
                        }
                        return null;
                    }
                }));
                int valueArgumentsCount = expression.getValueArgumentsCount();
                for (final int i = 0; i < valueArgumentsCount; i++) {
                    final IrExpression valueArgument = expression.getValueArgument(i);
                    if (valueArgument != null) {
                        DurableKeyTransformer durableKeyTransformer3 = this;
                        String strOooO00o = android.support.v4.media.OooO00o.OooO00o("arg-", i);
                        final IrDelegatingConstructorCall irDelegatingConstructorCall3 = expression;
                        final DurableKeyTransformer durableKeyTransformer4 = this;
                        durableKeyTransformer3.enter(strOooO00o, new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitDelegatingConstructorCall.1.3
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
                                irDelegatingConstructorCall3.putValueArgument(i, valueArgument.transform(durableKeyTransformer4, (Object) null));
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
        return new IrElseBranchImpl(branch.getStartOffset(), branch.getEndOffset(), branch.getCondition(), (IrExpression) enter("else", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitElseBranch.1
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
        return (IrExpression) enter(o00O00OO.OooO00o("call-", asJvmFriendlyString(expression.getSymbol().getOwner().getName())), new Function0<IrEnumConstructorCall>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitEnumConstructorCall.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrEnumConstructorCall invoke() {
                final IrEnumConstructorCall irEnumConstructorCall = expression;
                final DurableKeyTransformer durableKeyTransformer = this;
                irEnumConstructorCall.setDispatchReceiver((IrExpression) durableKeyTransformer.enter("$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitEnumConstructorCall.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression dispatchReceiver = irEnumConstructorCall.getDispatchReceiver();
                        if (dispatchReceiver != null) {
                            return dispatchReceiver.transform(durableKeyTransformer, (Object) null);
                        }
                        return null;
                    }
                }));
                final IrEnumConstructorCall irEnumConstructorCall2 = expression;
                final DurableKeyTransformer durableKeyTransformer2 = this;
                irEnumConstructorCall2.setExtensionReceiver((IrExpression) durableKeyTransformer2.enter("$$this", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitEnumConstructorCall.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression extensionReceiver = irEnumConstructorCall2.getExtensionReceiver();
                        if (extensionReceiver != null) {
                            return extensionReceiver.transform(durableKeyTransformer2, (Object) null);
                        }
                        return null;
                    }
                }));
                int valueArgumentsCount = expression.getValueArgumentsCount();
                for (final int i = 0; i < valueArgumentsCount; i++) {
                    final IrExpression valueArgument = expression.getValueArgument(i);
                    if (valueArgument != null) {
                        DurableKeyTransformer durableKeyTransformer3 = this;
                        String strOooO00o = android.support.v4.media.OooO00o.OooO00o("arg-", i);
                        final IrEnumConstructorCall irEnumConstructorCall3 = expression;
                        final DurableKeyTransformer durableKeyTransformer4 = this;
                        durableKeyTransformer3.enter(strOooO00o, new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitEnumConstructorCall.1.3
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
                                irEnumConstructorCall3.putValueArgument(i, valueArgument.transform(durableKeyTransformer4, (Object) null));
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
        return (IrStatement) enter(o00O00OO.OooO00o("entry-", asJvmFriendlyString(declaration.getName())), new Function0<IrStatement>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitEnumEntry.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrStatement invoke() {
                return DurableKeyTransformer.super.visitEnumEntry(declaration);
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException */
    @NotNull
    public IrFile visitFile(@NotNull final IrFile declaration) throws Exception {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        try {
            return (IrFile) enter("file-" + ((String) CollectionsKt.last(StringsKt__StringsKt.split$default(declaration.getFileEntry().getName(), new char[]{'/'}, false, 0, 6, (Object) null))), new Function0<IrFile>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer$visitFile$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final IrFile invoke() {
                    return super/*androidx.compose.compiler.plugins.kotlin.lower.AbstractComposeLowering*/.visitFile(declaration);
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
        return Intrinsics.areEqual(origin, IrStatementOrigin.WHILE_LOOP.INSTANCE) ? true : Intrinsics.areEqual(origin, IrStatementOrigin.FOR_LOOP_INNER_WHILE.INSTANCE) ? (IrExpression) enter("loop", new Function0<IrLoop>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitLoop.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrLoop invoke() {
                final IrLoop irLoop = loop;
                final DurableKeyTransformer durableKeyTransformer = this;
                irLoop.setBody((IrExpression) durableKeyTransformer.enter("body", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitLoop.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression body = irLoop.getBody();
                        if (body != null) {
                            return body.transform(durableKeyTransformer, (Object) null);
                        }
                        return null;
                    }
                }));
                return loop;
            }
        }) : (IrExpression) enter("loop", new Function0<IrLoop>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitLoop.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrLoop invoke() {
                final IrLoop irLoop = loop;
                final DurableKeyTransformer durableKeyTransformer = this;
                irLoop.setCondition((IrExpression) durableKeyTransformer.enter("cond", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitLoop.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrExpression invoke() {
                        return irLoop.getCondition().transform(durableKeyTransformer, (Object) null);
                    }
                }));
                final IrLoop irLoop2 = loop;
                final DurableKeyTransformer durableKeyTransformer2 = this;
                irLoop2.setBody((IrExpression) durableKeyTransformer2.enter("body", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitLoop.2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrExpression invoke() {
                        IrExpression body = irLoop2.getBody();
                        if (body != null) {
                            return body.transform(durableKeyTransformer2, (Object) null);
                        }
                        return null;
                    }
                }));
                return loop;
            }
        });
    }

    @NotNull
    public IrPackageFragment visitPackageFragment(@NotNull final IrPackageFragment declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        return (IrPackageFragment) enter("pkg-" + AdditionalIrUtilsKt.getFqNameForIrSerialization((IrDeclarationParent) declaration), new Function0<IrPackageFragment>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitPackageFragment.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrPackageFragment invoke() {
                return DurableKeyTransformer.super.visitPackageFragment(declaration);
            }
        });
    }

    @NotNull
    public IrStatement visitProperty(@NotNull final IrProperty declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        final IrField backingField = declaration.getBackingField();
        final IrSimpleFunction getter = declaration.getGetter();
        final IrSimpleFunction setter = declaration.getSetter();
        return (IrStatement) enter(o00O00OO.OooO00o("val-", asJvmFriendlyString(declaration.getName())), new Function0<IrProperty>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitProperty.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrProperty invoke() {
                IrProperty irProperty = declaration;
                IrField irField = backingField;
                IrElement irElementTransform = irField != null ? irField.transform(this, (Object) null) : null;
                irProperty.setBackingField(irElementTransform instanceof IrField ? (IrField) irElementTransform : null);
                IrProperty irProperty2 = declaration;
                final DurableKeyTransformer durableKeyTransformer = this;
                final IrSimpleFunction irSimpleFunction = getter;
                irProperty2.setGetter((IrSimpleFunction) durableKeyTransformer.enter("get", new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitProperty.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrSimpleFunction invoke() {
                        IrSimpleFunction irSimpleFunction2 = irSimpleFunction;
                        IrElement irElementTransform2 = irSimpleFunction2 != null ? irSimpleFunction2.transform(durableKeyTransformer, (Object) null) : null;
                        if (irElementTransform2 instanceof IrSimpleFunction) {
                            return (IrSimpleFunction) irElementTransform2;
                        }
                        return null;
                    }
                }));
                IrProperty irProperty3 = declaration;
                final DurableKeyTransformer durableKeyTransformer2 = this;
                final IrSimpleFunction irSimpleFunction2 = setter;
                irProperty3.setSetter((IrSimpleFunction) durableKeyTransformer2.enter("set", new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitProperty.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final IrSimpleFunction invoke() {
                        IrSimpleFunction irSimpleFunction3 = irSimpleFunction2;
                        IrElement irElementTransform2 = irSimpleFunction3 != null ? irSimpleFunction3.transform(durableKeyTransformer2, (Object) null) : null;
                        if (irElementTransform2 instanceof IrSimpleFunction) {
                            return (IrSimpleFunction) irElementTransform2;
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
        return (IrExpression) enter("set-" + expression.getSymbol().getOwner().getName(), new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitSetField.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                return DurableKeyTransformer.super.visitSetField(expression);
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
        return (IrExpression) enter("set-" + name, new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitSetValue.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrExpression invoke() {
                return DurableKeyTransformer.super.visitSetValue(expression);
            }
        });
    }

    @NotNull
    public IrStatement visitSimpleFunction(@NotNull final IrSimpleFunction declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        return (IrStatement) enter(o00O00OO.OooO00o("fun-", signatureString(declaration)), new Function0<IrStatement>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitSimpleFunction.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrStatement invoke() {
                return DurableKeyTransformer.super.visitSimpleFunction(declaration);
            }
        });
    }

    @NotNull
    public IrExpression visitStringConcatenation(@NotNull final IrStringConcatenation expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        return !(expression instanceof IrStringConcatenationImpl) ? (IrExpression) expression : (IrExpression) enter("str", new Function0<IrStringConcatenationImpl>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitStringConcatenation.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrStringConcatenationImpl invoke() {
                final DurableKeyTransformer durableKeyTransformer = DurableKeyTransformer.this;
                final IrStringConcatenation irStringConcatenation = expression;
                return (IrStringConcatenationImpl) durableKeyTransformer.siblings(new Function0<IrStringConcatenationImpl>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitStringConcatenation.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final IrStringConcatenationImpl invoke() {
                        List arguments = irStringConcatenation.getArguments();
                        IrStringConcatenation irStringConcatenation2 = irStringConcatenation;
                        final DurableKeyTransformer durableKeyTransformer2 = durableKeyTransformer;
                        int i = 0;
                        for (Object obj : arguments) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            final IrExpression irExpression = (IrExpression) obj;
                            irStringConcatenation2.getArguments().set(i, durableKeyTransformer2.enter(String.valueOf(i), new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer$visitStringConcatenation$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final IrExpression invoke() {
                                    return irExpression.transform(durableKeyTransformer2, (Object) null);
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
        aTry.setTryResult((IrExpression) enter("try", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitTry.1
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
        siblings(new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitTry.2
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
                final DurableKeyTransformer durableKeyTransformer = this;
                for (final IrCatch irCatch : catches) {
                    irCatch.setResult((IrExpression) durableKeyTransformer.enter("catch", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer$visitTry$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final IrExpression invoke() {
                            return irCatch.getResult().transform(durableKeyTransformer, (Object) null);
                        }
                    }));
                }
            }
        });
        aTry.setFinallyExpression((IrExpression) enter("finally", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitTry.3
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
        return (IrStatement) enter(o00O00OO.OooO00o("param-", asJvmFriendlyString(declaration.getName())), new Function0<IrStatement>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitValueParameter.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrStatement invoke() {
                return DurableKeyTransformer.super.visitValueParameter(declaration);
            }
        });
    }

    @NotNull
    public IrExpression visitVararg(@NotNull final IrVararg expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        return !(expression instanceof IrVarargImpl) ? (IrExpression) expression : (IrExpression) enter("vararg", new Function0<IrVarargImpl>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitVararg.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrVarargImpl invoke() {
                List elements = expression.getElements();
                IrVararg irVararg = expression;
                final DurableKeyTransformer durableKeyTransformer = this;
                int i = 0;
                for (Object obj : elements) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final IrVarargElement irVarargElement = (IrVarargElement) obj;
                    irVararg.getElements().set(i, durableKeyTransformer.enter(String.valueOf(i), new Function0<IrVarargElement>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer$visitVararg$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final IrVarargElement invoke() {
                            IrVarargElement irVarargElementTransform = irVarargElement.transform(durableKeyTransformer, (Object) null);
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
        return (IrStatement) enter(o00O00OO.OooO00o("val-", asJvmFriendlyString(declaration.getName())), new Function0<IrStatement>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitVariable.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrStatement invoke() {
                return DurableKeyTransformer.super.visitVariable(declaration);
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
            return Intrinsics.areEqual(origin, IrStatementOrigin.IF.INSTANCE) ? (IrExpression) siblings("if", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitWhen.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final IrExpression invoke() {
                    return DurableKeyTransformer.super.visitWhen(expression);
                }
            }) : (IrExpression) siblings("when", new Function0<IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.DurableKeyTransformer.visitWhen.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final IrExpression invoke() {
                    return DurableKeyTransformer.super.visitWhen(expression);
                }
            });
        }
        expression.getBranches().set(1, ((IrBranch) expression.getBranches().get(1)).transform((IrElementTransformer) this, (Object) null));
        return (IrExpression) expression;
    }

    public final <T> T siblings(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (T) this.keyVisitor.siblings(block);
    }
}
