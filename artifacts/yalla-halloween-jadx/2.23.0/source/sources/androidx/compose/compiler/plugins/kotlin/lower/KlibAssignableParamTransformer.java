package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ModuleMetrics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.descriptors.VariableDescriptor;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrElementsKt;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl;
import org.jetbrains.kotlin.ir.expressions.IrBlockBody;
import org.jetbrains.kotlin.ir.expressions.IrBody;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrGetValue;
import org.jetbrains.kotlin.ir.expressions.IrSetValue;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrSetValueImpl;
import org.jetbrains.kotlin.ir.symbols.impl.IrVariableSymbolImpl;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/KlibAssignableParamTransformer;", "Landroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLowering;", "Landroidx/compose/compiler/plugins/kotlin/lower/ModuleLoweringPass;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;)V", "lower", "", "module", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "visitFunction", "Lorg/jetbrains/kotlin/ir/IrStatement;", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKlibAssignableParamTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KlibAssignableParamTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/KlibAssignableParamTransformer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n766#2:153\n857#2,2:154\n1549#2:156\n1620#2,3:157\n*S KotlinDebug\n*F\n+ 1 KlibAssignableParamTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/KlibAssignableParamTransformer\n*L\n69#1:153\n69#1:154,2\n75#1:156\n75#1:157,3\n*E\n"})
public final class KlibAssignableParamTransformer extends AbstractComposeLowering {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlibAssignableParamTransformer(@NotNull IrPluginContext context, @NotNull DeepCopySymbolRemapper symbolRemapper, @NotNull ModuleMetrics metrics) {
        super(context, symbolRemapper, metrics);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(symbolRemapper, "symbolRemapper");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.ModuleLoweringPass
    public void lower(@NotNull IrModuleFragment module) {
        Intrinsics.checkNotNullParameter(module, "module");
        IrElementTransformerVoidKt.transformChildrenVoid((IrElement) module, this);
    }

    @NotNull
    public IrStatement visitFunction(@NotNull IrFunction declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        List valueParameters = declaration.getValueParameters();
        final ArrayList arrayList = new ArrayList();
        for (Object obj : valueParameters) {
            if (((IrValueParameter) obj).isAssignable()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return super.visitFunction(declaration);
        }
        final ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IrValueParameter irValueParameter = (IrValueParameter) it.next();
            IrVariableImpl irVariableImpl = new IrVariableImpl(-1, -1, IrDeclarationOrigin.DEFINED.INSTANCE, new IrVariableSymbolImpl((VariableDescriptor) null, 1, (DefaultConstructorMarker) null), irValueParameter.getName(), irValueParameter.getType(), true, false, false);
            irVariableImpl.setParent((IrDeclarationParent) declaration);
            irVariableImpl.setInitializer(new IrGetValueImpl(-1, -1, irValueParameter.getSymbol(), (IrStatementOrigin) null, 8, (DefaultConstructorMarker) null));
            arrayList2.add(irVariableImpl);
            it = it;
        }
        final IrBody body = declaration.getBody();
        declaration.setBody((IrBody) (body != null ? new IrBlockBodyImpl(body.getStartOffset(), body.getEndOffset(), new Function1<IrBlockBody, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.KlibAssignableParamTransformer$visitFunction$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IrBlockBody irBlockBody) {
                invoke2(irBlockBody);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IrBlockBody $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                $receiver.getStatements().addAll(arrayList2);
                List statements = IrUtilsKt.getStatements(body);
                final List<IrValueParameter> list = arrayList;
                final List<IrVariableImpl> list2 = arrayList2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(statements, 10));
                Iterator it2 = statements.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(IrElementsKt.transformStatement((IrStatement) it2.next(), new IrElementTransformerVoid() { // from class: androidx.compose.compiler.plugins.kotlin.lower.KlibAssignableParamTransformer$visitFunction$1$1$updatedBody$1$1
                        @NotNull
                        public IrExpression visitGetValue(@NotNull IrGetValue expression) {
                            Intrinsics.checkNotNullParameter(expression, "expression");
                            if (!CollectionsKt.contains(list, expression.getSymbol().getOwner())) {
                                return super.visitGetValue(expression);
                            }
                            return super.visitGetValue(new IrGetValueImpl(expression.getStartOffset(), expression.getEndOffset(), expression.getType(), list2.get(CollectionsKt.indexOf((List<? extends IrValueDeclaration>) list, expression.getSymbol().getOwner())).getSymbol(), expression.getOrigin()));
                        }

                        @NotNull
                        public IrExpression visitSetValue(@NotNull IrSetValue expression) {
                            Intrinsics.checkNotNullParameter(expression, "expression");
                            if (!CollectionsKt.contains(list, expression.getSymbol().getOwner())) {
                                return super.visitSetValue(expression);
                            }
                            return super.visitSetValue(new IrSetValueImpl(expression.getStartOffset(), expression.getEndOffset(), expression.getType(), list2.get(CollectionsKt.indexOf((List<? extends IrValueDeclaration>) list, expression.getSymbol().getOwner())).getSymbol(), expression.getValue(), expression.getOrigin()));
                        }
                    }));
                }
                $receiver.getStatements().addAll(arrayList3);
            }
        }) : null));
        return super.visitFunction(declaration);
    }
}
