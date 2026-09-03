package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposableTargetCheckerKt;
import androidx.compose.compiler.plugins.kotlin.inference.Item;
import androidx.compose.compiler.plugins.kotlin.inference.Open;
import androidx.compose.compiler.plugins.kotlin.inference.Scheme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.interpreter.UtilsKt;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012H\u0016J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012H\u0016J\f\u0010#\u001a\u00020\u000e*\u00020\u0012H\u0002J\u0016\u0010$\u001a\u0004\u0018\u00010\u0012*\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0002J\u0014\u0010%\u001a\u00020\u0012*\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionDeclaration;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "transformer", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;", "function", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;Lorg/jetbrains/kotlin/ir/declarations/IrFunction;)V", "getFunction", "()Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "name", "", "getName", "()Ljava/lang/String;", "schemeIsUpdatable", "", "getSchemeIsUpdatable", "()Z", "shouldSerialize", "Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "getShouldSerialize", "(Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;)Z", "equals", "other", "", "hashCode", "", "parameters", "", "recordScheme", "", "scheme", "toDeclaredScheme", "defaultTarget", "Landroidx/compose/compiler/plugins/kotlin/inference/Item;", "updateScheme", "allAnonymous", "ancestorScheme", "toScheme", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableTargetAnnotationsTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableTargetAnnotationsTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionDeclaration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1104:1\n3433#2,7:1105\n1549#2:1112\n1620#2,3:1113\n766#2:1117\n857#2,2:1118\n1549#2:1120\n1620#2,3:1121\n1726#2,3:1124\n1#3:1116\n*S KotlinDebug\n*F\n+ 1 ComposableTargetAnnotationsTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionDeclaration\n*L\n660#1:1105,7\n690#1:1112\n690#1:1113,3\n708#1:1117\n708#1:1118,2\n708#1:1120\n708#1:1121,3\n722#1:1124,3\n*E\n"})
public final class InferenceFunctionDeclaration extends InferenceFunction {

    @NotNull
    private final IrFunction function;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InferenceFunctionDeclaration(@NotNull ComposableTargetAnnotationsTransformer transformer, @NotNull IrFunction function) {
        super(transformer, null);
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    private final boolean allAnonymous(Scheme scheme) {
        boolean z;
        if (!scheme.getTarget().isAnonymous$compiler_hosted()) {
            return false;
        }
        if (scheme.getResult() != null && !allAnonymous(scheme.getResult())) {
            return false;
        }
        List<Scheme> parameters = scheme.getParameters();
        if ((parameters instanceof Collection) && parameters.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                if (!allAnonymous((Scheme) it.next())) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    private final Scheme ancestorScheme(IrFunction irFunction, Item item) {
        if ((irFunction instanceof IrSimpleFunction) && (!((IrSimpleFunction) irFunction).getOverriddenSymbols().isEmpty())) {
            return toScheme(UtilsKt.getLastOverridden(irFunction), item);
        }
        return null;
    }

    private final boolean getShouldSerialize(Scheme scheme) {
        return !scheme.getParameters().isEmpty();
    }

    private final List<InferenceFunction> parameters() {
        ComposableTargetAnnotationsTransformer transformer = getTransformer();
        List valueParameters = this.function.getValueParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : valueParameters) {
            if (transformer.isOrHasComposableLambda$compiler_hosted(((IrValueParameter) obj).getType())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new InferenceFunctionParameter(getTransformer(), (IrValueParameter) it.next()));
        }
        IrValueParameter extensionReceiverParameter = this.function.getExtensionReceiverParameter();
        if (extensionReceiverParameter == null) {
            return arrayList2;
        }
        List<InferenceFunction> listPlus = transformer.isOrHasComposableLambda$compiler_hosted(extensionReceiverParameter.getType()) ? CollectionsKt.plus((Collection) arrayList2, (Iterable) CollectionsKt.listOf(new InferenceFunctionParameter(getTransformer(), extensionReceiverParameter))) : arrayList2;
        return listPlus == null ? arrayList2 : listPlus;
    }

    private final Scheme toScheme(IrFunction irFunction, Item item) {
        Item item2;
        Scheme schemeMergeWith;
        ComposableTargetAnnotationsTransformer transformer = getTransformer();
        Item target = transformer.getTarget(this.function.getAnnotations());
        if (target.getIsUnspecified() && this.function.getBody() == null) {
            item2 = item;
        } else {
            if (target.getIsUnspecified()) {
                target = transformer.getTarget(IrUtilsKt.getFile(this.function).getAnnotations());
            }
            item2 = target;
        }
        Item open = this.function.getBody() == null ? item : new Open(-1, true);
        IrType returnType = this.function.getReturnType();
        Scheme scheme = transformer.isOrHasComposableLambda$compiler_hosted(returnType) ? transformer.toScheme(returnType, open) : null;
        List<InferenceFunction> listParameters = parameters();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listParameters, 10));
        Iterator<T> it = listParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((InferenceFunction) it.next()).toDeclaredScheme(open));
        }
        Scheme scheme2 = new Scheme(item2, arrayList, scheme, false, 8, null);
        Scheme schemeAncestorScheme = ancestorScheme(irFunction, item);
        return (schemeAncestorScheme == null || (schemeMergeWith = ComposableTargetCheckerKt.mergeWith(scheme2, CollectionsKt.listOf(schemeAncestorScheme))) == null) ? scheme2 : schemeMergeWith;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof InferenceFunctionDeclaration) && Intrinsics.areEqual(((InferenceFunctionDeclaration) other).function, this.function);
    }

    @NotNull
    public final IrFunction getFunction() {
        return this.function;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    @NotNull
    public String getName() {
        String string = this.function.getName().toString();
        Intrinsics.checkNotNullExpressionValue(string, "function.name.toString()");
        return string;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    public boolean getSchemeIsUpdatable() {
        return true;
    }

    public int hashCode() {
        return this.function.hashCode() * 31;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    public void recordScheme(@NotNull Scheme scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (allAnonymous(scheme)) {
            return;
        }
        getTransformer().metricsFor(this.function).recordScheme(scheme.toString());
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    @NotNull
    public Scheme toDeclaredScheme(@NotNull Item defaultTarget) {
        Intrinsics.checkNotNullParameter(defaultTarget, "defaultTarget");
        Scheme scheme = getTransformer().getScheme(this.function);
        return scheme == null ? toScheme(this.function, defaultTarget) : scheme;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    public void updateScheme(@NotNull Scheme scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (getShouldSerialize(scheme)) {
            IrFunction irFunction = this.function;
            irFunction.setAnnotations(updatedAnnotations(irFunction.getAnnotations(), scheme));
            return;
        }
        IrFunction irFunction2 = this.function;
        irFunction2.setAnnotations(updatedAnnotations(irFunction2.getAnnotations(), scheme.getTarget()));
        List<InferenceFunction> listParameters = parameters();
        List<Scheme> parameters = scheme.getParameters();
        Iterator<T> it = listParameters.iterator();
        Iterator<T> it2 = parameters.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(listParameters, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10)));
        while (it.hasNext() && it2.hasNext()) {
            ((InferenceFunction) it.next()).updateScheme((Scheme) it2.next());
            arrayList.add(Unit.INSTANCE);
        }
    }
}
