package androidx.compose.compiler.plugins.kotlin.inference;

import com.qiniu.android.collect.ReportItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0002\u0010\fJC\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00028\u00012,\u0010\u001a\u001a(\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0015\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d\u0012\u0004\u0012\u00020\u001f0\u001bH\u0002¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00028\u0001¢\u0006\u0002\u0010#J)\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00028\u00012\u0006\u0010&\u001a\u00028\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010(¢\u0006\u0002\u0010)J\u001b\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00028\u00012\u0006\u0010,\u001a\u00028\u0001¢\u0006\u0002\u0010-J$\u0010.\u001a\u00020\u001e*\u00020\"2\u0006\u0010/\u001a\u00020\u001c2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010H\u0002J\u001b\u00101\u001a\u000202*\u00028\u00012\b\b\u0002\u0010/\u001a\u00020\u001cH\u0002¢\u0006\u0002\u00103J+\u00104\u001a\u00020\u0012*\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\u001eH\u0002¢\u0006\u0002\u00107R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\u00020\u0014*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u00068"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/inference/ApplierInferencer;", "Type", "Node", "", "typeAdapter", "Landroidx/compose/compiler/plugins/kotlin/inference/TypeAdapter;", "nodeAdapter", "Landroidx/compose/compiler/plugins/kotlin/inference/NodeAdapter;", "lazySchemeStorage", "Landroidx/compose/compiler/plugins/kotlin/inference/LazySchemeStorage;", "errorReporter", "Landroidx/compose/compiler/plugins/kotlin/inference/ErrorReporter;", "(Landroidx/compose/compiler/plugins/kotlin/inference/TypeAdapter;Landroidx/compose/compiler/plugins/kotlin/inference/NodeAdapter;Landroidx/compose/compiler/plugins/kotlin/inference/LazySchemeStorage;Landroidx/compose/compiler/plugins/kotlin/inference/ErrorReporter;)V", "inProgress", "", "pending", "", "Lkotlin/Function0;", "", "safeToken", "", "Landroidx/compose/compiler/plugins/kotlin/inference/Binding;", "getSafeToken", "(Landroidx/compose/compiler/plugins/kotlin/inference/Binding;)Ljava/lang/String;", "restartable", "node", ReportItem.LogTypeBlock, "Lkotlin/Function3;", "Landroidx/compose/compiler/plugins/kotlin/inference/Bindings;", "Lkotlin/Function1;", "Landroidx/compose/compiler/plugins/kotlin/inference/CallBindings;", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Z", "toFinalScheme", "Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "(Ljava/lang/Object;)Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "visitCall", "call", "target", "arguments", "", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)Z", "visitVariable", "variable", "initializer", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "toCallBindings", "bindings", "context", "toLazyScheme", "Landroidx/compose/compiler/plugins/kotlin/inference/LazyScheme;", "(Ljava/lang/Object;Landroidx/compose/compiler/plugins/kotlin/inference/Bindings;)Landroidx/compose/compiler/plugins/kotlin/inference/LazyScheme;", "unify", "a", "b", "(Landroidx/compose/compiler/plugins/kotlin/inference/Bindings;Ljava/lang/Object;Landroidx/compose/compiler/plugins/kotlin/inference/CallBindings;Landroidx/compose/compiler/plugins/kotlin/inference/CallBindings;)Z", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nApplierInferencer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplierInferencer.kt\nandroidx/compose/compiler/plugins/kotlin/inference/ApplierInferencer\n+ 2 ApplierInferencer.kt\nandroidx/compose/compiler/plugins/kotlin/inference/ApplierInferencerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,453:1\n119#2,2:454\n119#2,5:456\n121#2,3:461\n1549#3:464\n1620#3,3:465\n1855#3,2:468\n*S KotlinDebug\n*F\n+ 1 ApplierInferencer.kt\nandroidx/compose/compiler/plugins/kotlin/inference/ApplierInferencer\n*L\n184#1:454,2\n201#1:456,5\n184#1:461,3\n218#1:464\n218#1:465,3\n362#1:468,2\n*E\n"})
public final class ApplierInferencer<Type, Node> {

    @NotNull
    private final ErrorReporter<Node> errorReporter;

    @NotNull
    private final Set<Node> inProgress;

    @NotNull
    private final LazySchemeStorage<Node> lazySchemeStorage;

    @NotNull
    private final NodeAdapter<Type, Node> nodeAdapter;

    @NotNull
    private final List<Function0<Boolean>> pending;

    @NotNull
    private final TypeAdapter<Type> typeAdapter;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NodeKind.values().length];
            try {
                iArr[NodeKind.ParameterReference.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NodeKind.Lambda.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NodeKind.Variable.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NodeKind.Expression.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NodeKind.Function.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.compiler.plugins.kotlin.inference.ApplierInferencer$restartable$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Node, CallBindings> {
        final /* synthetic */ Bindings $bindings;
        final /* synthetic */ Function3<Bindings, Binding, Function1<? super Node, CallBindings>, Unit> $block;
        final /* synthetic */ Node $node;
        final /* synthetic */ ApplierInferencer<Type, Node> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ApplierInferencer<Type, Node> applierInferencer, Bindings bindings, Node node, Function3<? super Bindings, ? super Binding, ? super Function1<? super Node, CallBindings>, Unit> function3) {
            super(1, Intrinsics.Kotlin.class, "callBindingsOf", "restartable$callBindingsOf(Landroidx/compose/compiler/plugins/kotlin/inference/ApplierInferencer;Landroidx/compose/compiler/plugins/kotlin/inference/Bindings;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;)Landroidx/compose/compiler/plugins/kotlin/inference/CallBindings;", 0);
            this.this$0 = applierInferencer;
            this.$bindings = bindings;
            this.$node = node;
            this.$block = function3;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final CallBindings invoke(Node node) {
            return ApplierInferencer.restartable$callBindingsOf(this.this$0, this.$bindings, this.$node, this.$block, node);
        }
    }

    public ApplierInferencer(@NotNull TypeAdapter<Type> typeAdapter, @NotNull NodeAdapter<Type, Node> nodeAdapter, @NotNull LazySchemeStorage<Node> lazySchemeStorage, @NotNull ErrorReporter<Node> errorReporter) {
        Intrinsics.checkNotNullParameter(typeAdapter, "typeAdapter");
        Intrinsics.checkNotNullParameter(nodeAdapter, "nodeAdapter");
        Intrinsics.checkNotNullParameter(lazySchemeStorage, "lazySchemeStorage");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.typeAdapter = typeAdapter;
        this.nodeAdapter = nodeAdapter;
        this.lazySchemeStorage = lazySchemeStorage;
        this.errorReporter = errorReporter;
        this.inProgress = new LinkedHashSet();
        this.pending = new ArrayList();
    }

    private final String getSafeToken(Binding binding) {
        String token = binding.getToken();
        return token == null ? "unbound" : token;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean restartable(Node node, Function3<? super Bindings, ? super Binding, ? super Function1<? super Node, CallBindings>, Unit> block) {
        if (this.inProgress.contains(node)) {
            return false;
        }
        this.inProgress.add(node);
        try {
            LazyScheme lazyScheme$default = toLazyScheme$default(this, this.nodeAdapter.containerOf(node), null, 1, null);
            Bindings bindings = lazyScheme$default.getBindings();
            block.invoke(bindings, lazyScheme$default.getTarget(), new AnonymousClass1(this, bindings, node, block));
            if (!this.pending.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                while (!this.pending.isEmpty()) {
                    Function0 function0 = (Function0) CollectionsKt.removeLast(this.pending);
                    if (!((Boolean) function0.invoke()).booleanValue()) {
                        arrayList.add(function0);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.pending.add((Function0) it.next());
                }
            }
            return true;
        } finally {
            this.inProgress.remove(node);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <Node, Type> CallBindings restartable$callBindingsOf(ApplierInferencer<Type, Node> applierInferencer, Bindings bindings, Node node, Function3<? super Bindings, ? super Binding, ? super Function1<? super Node, CallBindings>, Unit> function3, Node node2) {
        int i = WhenMappings.$EnumSwitchMapping$0[((ApplierInferencer) applierInferencer).nodeAdapter.kindOf(node2).ordinal()];
        if (i == 1) {
            Node nodeContainerOf = ((ApplierInferencer) applierInferencer).nodeAdapter.containerOf(node2);
            LazyScheme lazyScheme$default = toLazyScheme$default(applierInferencer, nodeContainerOf, null, 1, null);
            int iSchemeParameterIndexOf = ((ApplierInferencer) applierInferencer).nodeAdapter.schemeParameterIndexOf(node2, nodeContainerOf);
            if (iSchemeParameterIndexOf >= 0 && iSchemeParameterIndexOf < lazyScheme$default.getParameters().size()) {
                return lazyScheme$default.getParameters().get(iSchemeParameterIndexOf).toCallBindings();
            }
            return null;
        }
        if (i == 2 || i == 3 || i == 4) {
            return restartable$observed(bindings, applierInferencer, node, function3, applierInferencer.toLazyScheme(node2, bindings)).toCallBindings();
        }
        if (i == 5) {
            return toCallBindings$default(applierInferencer, restartable$schemeOf(applierInferencer, bindings, node, function3, node2), bindings, null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.compose.compiler.plugins.kotlin.inference.ApplierInferencer$restartable$observed$remove$1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlin.jvm.functions.Function0] */
    private static final <Type, Node> LazyScheme restartable$observed(Bindings bindings, final ApplierInferencer<Type, Node> applierInferencer, final Node node, final Function3<? super Bindings, ? super Binding, ? super Function1<? super Node, CallBindings>, Unit> function3, LazyScheme lazyScheme) {
        if (!Intrinsics.areEqual(lazyScheme.getBindings(), bindings) && !lazyScheme.getClosed()) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.inference.ApplierInferencer$restartable$observed$remove$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
            objectRef.element = lazyScheme.onChange(new Function0<Unit>(applierInferencer) { // from class: androidx.compose.compiler.plugins.kotlin.inference.ApplierInferencer$restartable$observed$result$1
                final /* synthetic */ ApplierInferencer<Type, Node> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                    this.this$0 = applierInferencer;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (((ApplierInferencer) this.this$0).inProgress.contains(node)) {
                        return;
                    }
                    objectRef.element.invoke();
                    List list = ((ApplierInferencer) this.this$0).pending;
                    final ApplierInferencer<Type, Node> applierInferencer2 = this.this$0;
                    final Node node2 = node;
                    final Function3<Bindings, Binding, Function1<? super Node, CallBindings>, Unit> function4 = function3;
                    list.add(new Function0<Boolean>() { // from class: androidx.compose.compiler.plugins.kotlin.inference.ApplierInferencer$restartable$observed$result$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Boolean invoke() {
                            return Boolean.valueOf(applierInferencer2.restartable(node2, function4));
                        }
                    });
                }
            });
        }
        return lazyScheme;
    }

    private static final <Node, Type> Scheme restartable$schemeOf(ApplierInferencer<Type, Node> applierInferencer, Bindings bindings, Node node, Function3<? super Bindings, ? super Binding, ? super Function1<? super Node, CallBindings>, Unit> function3, Node node2) {
        return restartable$observed(bindings, applierInferencer, node, function3, toLazyScheme$default(applierInferencer, node2, null, 1, null)).toScheme();
    }

    private final CallBindings toCallBindings(Scheme scheme, Bindings bindings, List<Binding> list) {
        Binding binding$compiler_hosted = scheme.getTarget().toBinding$compiler_hosted(bindings, list);
        List<Scheme> parameters = scheme.getParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10));
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            arrayList.add(toCallBindings((Scheme) it.next(), bindings, list));
        }
        Scheme result = scheme.getResult();
        return new CallBindings(binding$compiler_hosted, arrayList, result != null ? toCallBindings(result, bindings, list) : null, scheme.getAnyParameters());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallBindings toCallBindings$default(ApplierInferencer applierInferencer, Scheme scheme, Bindings bindings, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = new ArrayList();
        }
        return applierInferencer.toCallBindings(scheme, bindings, list);
    }

    private final LazyScheme toLazyScheme(Node node, Bindings bindings) {
        LazySchemeStorage<Node> lazySchemeStorage = this.lazySchemeStorage;
        LazyScheme lazyScheme = lazySchemeStorage.getLazyScheme(node);
        if (lazyScheme == null) {
            Node nodeReferencedContainerOf = this.nodeAdapter.referencedContainerOf(node);
            if (nodeReferencedContainerOf != null) {
                LazySchemeStorage<Node> lazySchemeStorage2 = this.lazySchemeStorage;
                LazyScheme lazyScheme2 = lazySchemeStorage2.getLazyScheme(nodeReferencedContainerOf);
                if (lazyScheme2 == null) {
                    lazyScheme2 = toLazyScheme$lambda$2$declaredSchemeOf(this, bindings, nodeReferencedContainerOf);
                    lazySchemeStorage2.storeLazyScheme(nodeReferencedContainerOf, lazyScheme2);
                }
                lazyScheme = lazyScheme2;
            } else {
                lazyScheme = toLazyScheme$lambda$2$declaredSchemeOf(this, bindings, node);
            }
            lazySchemeStorage.storeLazyScheme(node, lazyScheme);
        }
        return lazyScheme;
    }

    public static /* synthetic */ LazyScheme toLazyScheme$default(ApplierInferencer applierInferencer, Object obj, Bindings bindings, int i, Object obj2) {
        if ((i & 1) != 0) {
            bindings = new Bindings();
        }
        return applierInferencer.toLazyScheme(obj, bindings);
    }

    private static final <Node, Type> LazyScheme toLazyScheme$lambda$2$declaredSchemeOf(final ApplierInferencer<Type, Node> applierInferencer, Bindings bindings, Node node) {
        final Type typeTypeOf = ((ApplierInferencer) applierInferencer).nodeAdapter.typeOf(node);
        if (typeTypeOf == null) {
            return LazyScheme.INSTANCE.open();
        }
        final LazyScheme lazyScheme = new LazyScheme(((ApplierInferencer) applierInferencer).typeAdapter.declaredSchemaOf(typeTypeOf), null, bindings, 2, null);
        if (((ApplierInferencer) applierInferencer).typeAdapter.currentInferredSchemeOf(typeTypeOf) != null) {
            lazyScheme.onChange(new Function0<Unit>(applierInferencer) { // from class: androidx.compose.compiler.plugins.kotlin.inference.ApplierInferencer$toLazyScheme$1$declaredSchemeOf$1$1
                final /* synthetic */ ApplierInferencer<Type, Node> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = applierInferencer;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Scheme schemeCurrentInferredSchemeOf = ((ApplierInferencer) this.this$0).typeAdapter.currentInferredSchemeOf(typeTypeOf);
                    Scheme scheme = lazyScheme.toScheme();
                    if (Intrinsics.areEqual(scheme, schemeCurrentInferredSchemeOf)) {
                        return;
                    }
                    ((ApplierInferencer) this.this$0).typeAdapter.updatedInferredScheme(typeTypeOf, scheme);
                }
            });
        }
        return lazyScheme;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean unify(Bindings bindings, Node node, CallBindings callBindings, CallBindings callBindings2) {
        int size;
        if (!bindings.unify(callBindings.getTarget(), callBindings2.getTarget())) {
            if (node != null) {
                this.errorReporter.reportCallError(node, getSafeToken(callBindings.getTarget()), getSafeToken(callBindings2.getTarget()));
            }
            return false;
        }
        if (callBindings.getParameters().size() != callBindings2.getParameters().size()) {
            if (node != null) {
                this.errorReporter.log(node, "Type disagreement " + callBindings + " <=> " + callBindings2);
            }
            size = (callBindings.getParameters().size() > callBindings2.getParameters().size() ? callBindings2.getParameters() : callBindings.getParameters()).size();
        } else {
            size = callBindings.getParameters().size();
        }
        for (int i = 0; i < size; i++) {
            CallBindings callBindings3 = callBindings.getParameters().get(i);
            CallBindings callBindings4 = callBindings2.getParameters().get(i);
            if (!unify(bindings, null, callBindings3, callBindings4) && node != null) {
                String token = callBindings3.getTarget().getToken();
                String token2 = callBindings4.getTarget().getToken();
                if (token == null || token2 == null) {
                    unify(bindings, node, callBindings3, callBindings4);
                } else {
                    ErrorReporter<Node> errorReporter = this.errorReporter;
                    String token3 = callBindings4.getTarget().getToken();
                    Intrinsics.checkNotNull(token3);
                    String token4 = callBindings3.getTarget().getToken();
                    Intrinsics.checkNotNull(token4);
                    errorReporter.reportParameterError(node, i, token3, token4);
                }
            }
        }
        CallBindings result = callBindings.getResult();
        CallBindings result2 = callBindings2.getResult();
        if (result == null || result2 == null) {
            return true;
        }
        return unify(bindings, null, result, result2);
    }

    @NotNull
    public final Scheme toFinalScheme(Node node) {
        return toLazyScheme$default(this, node, null, 1, null).toScheme();
    }

    public final boolean visitCall(final Node call, final Node target, @NotNull final List<? extends Node> arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return restartable(call, new Function3<Bindings, Binding, Function1<? super Node, ? extends CallBindings>, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.inference.ApplierInferencer.visitCall.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Bindings bindings, Binding binding, Object obj) {
                invoke(bindings, binding, (Function1) obj);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(@NotNull Bindings bindings, @NotNull Binding currentApplier, @NotNull Function1<? super Node, CallBindings> callBindingsOf) {
                boolean z;
                Intrinsics.checkNotNullParameter(bindings, "bindings");
                Intrinsics.checkNotNullParameter(currentApplier, "currentApplier");
                Intrinsics.checkNotNullParameter(callBindingsOf, "callBindingsOf");
                CallBindings callBindingsInvoke = callBindingsOf.invoke(target);
                if (callBindingsInvoke == null) {
                    ((ApplierInferencer) this).errorReporter.log(call, "Cannot find target");
                    return;
                }
                List<Node> list = arguments;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(callBindingsOf.invoke((Object) it.next()));
                }
                int i = 0;
                if (arrayList.isEmpty()) {
                    z = false;
                    break;
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((CallBindings) it2.next()) == null) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    ((ApplierInferencer) this).errorReporter.log(call, "Cannot determine a parameter scheme");
                    return;
                }
                CallBindings callBindings = new CallBindings(currentApplier, CollectionsKt.filterNotNull(arrayList), callBindingsInvoke.getResult() != null ? callBindingsOf.invoke(call) : null, false);
                this.unify(bindings, call, callBindings, callBindingsInvoke);
                if (callBindings.getParameters().size() == arguments.size()) {
                    List<Node> list2 = arguments;
                    ApplierInferencer<Type, Node> applierInferencer = this;
                    for (Object obj : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((ApplierInferencer) applierInferencer).nodeAdapter.kindOf(obj) == NodeKind.Lambda) {
                            Binding target2 = callBindings.getParameters().get(i).getTarget();
                            if (target2.getToken() == null) {
                                bindings.unify(target2, currentApplier);
                            }
                        }
                        i = i2;
                    }
                }
                for (Pair pair : CollectionsKt.zip(callBindings.getParameters(), arguments)) {
                    CallBindings callBindings2 = (CallBindings) pair.component1();
                    Object objComponent2 = pair.component2();
                    if (((ApplierInferencer) this).nodeAdapter.kindOf(objComponent2) == NodeKind.Lambda && callBindings2.getTarget().getToken() != null) {
                        LazyScheme lazyScheme$default = ApplierInferencer.toLazyScheme$default(this, objComponent2, null, 1, null);
                        if (lazyScheme$default.getTarget().getToken() == null) {
                            lazyScheme$default.getBindings().unify(lazyScheme$default.getTarget(), callBindings2.getTarget());
                        }
                    }
                }
            }
        });
    }

    public final boolean visitVariable(final Node variable, final Node initializer) {
        return restartable(variable, new Function3<Bindings, Binding, Function1<? super Node, ? extends CallBindings>, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.inference.ApplierInferencer.visitVariable.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Bindings bindings, Binding binding, Object obj) {
                invoke(bindings, binding, (Function1) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Bindings bindings, @NotNull Binding binding, @NotNull Function1<? super Node, CallBindings> callBindingsOf) {
                CallBindings callBindingsInvoke;
                Intrinsics.checkNotNullParameter(bindings, "bindings");
                Intrinsics.checkNotNullParameter(binding, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(callBindingsOf, "callBindingsOf");
                CallBindings callBindingsInvoke2 = callBindingsOf.invoke(initializer);
                if (callBindingsInvoke2 == null || (callBindingsInvoke = callBindingsOf.invoke(variable)) == null) {
                    return;
                }
                this.unify(bindings, variable, callBindingsInvoke, callBindingsInvoke2);
            }
        });
    }
}
