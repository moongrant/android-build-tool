package androidx.compose.compiler.plugins.kotlin.k2;

import androidx.compose.compiler.plugins.kotlin.ComposeClassIds;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.fir.ClassMembersKt;
import org.jetbrains.kotlin.fir.FirAnnotationContainer;
import org.jetbrains.kotlin.fir.FirSession;
import org.jetbrains.kotlin.fir.analysis.checkers.FirHelpersKt;
import org.jetbrains.kotlin.fir.analysis.checkers.context.CheckerContext;
import org.jetbrains.kotlin.fir.declarations.FirAnnotationUtilsKt;
import org.jetbrains.kotlin.fir.declarations.FirCallableDeclaration;
import org.jetbrains.kotlin.fir.declarations.FirContextReceiver;
import org.jetbrains.kotlin.fir.declarations.FirFunction;
import org.jetbrains.kotlin.fir.declarations.FirMemberDeclaration;
import org.jetbrains.kotlin.fir.declarations.FirPropertyAccessor;
import org.jetbrains.kotlin.fir.declarations.FirReceiverParameter;
import org.jetbrains.kotlin.fir.expressions.FirBlock;
import org.jetbrains.kotlin.fir.expressions.FirExpression;
import org.jetbrains.kotlin.fir.expressions.FirFunctionCall;
import org.jetbrains.kotlin.fir.expressions.FirReturnExpression;
import org.jetbrains.kotlin.fir.expressions.FirStatement;
import org.jetbrains.kotlin.fir.references.FirReference;
import org.jetbrains.kotlin.fir.references.FirReferenceUtilsKt;
import org.jetbrains.kotlin.fir.resolve.LookupTagUtilsKt;
import org.jetbrains.kotlin.fir.scopes.FirTypeScope;
import org.jetbrains.kotlin.fir.scopes.FirTypeScopeKt;
import org.jetbrains.kotlin.fir.symbols.ConeClassLikeLookupTag;
import org.jetbrains.kotlin.fir.symbols.FirBasedSymbol;
import org.jetbrains.kotlin.fir.symbols.impl.FirCallableSymbol;
import org.jetbrains.kotlin.fir.symbols.impl.FirClassLikeSymbol;
import org.jetbrains.kotlin.fir.symbols.impl.FirClassSymbol;
import org.jetbrains.kotlin.fir.symbols.impl.FirFunctionSymbol;
import org.jetbrains.kotlin.fir.symbols.impl.FirNamedFunctionSymbol;
import org.jetbrains.kotlin.fir.symbols.impl.FirPropertyAccessorSymbol;
import org.jetbrains.kotlin.fir.symbols.impl.FirPropertySymbol;
import org.jetbrains.kotlin.fir.symbols.impl.FirValueParameterSymbol;
import org.jetbrains.kotlin.fir.types.ConeBuiltinTypeUtilsKt;
import org.jetbrains.kotlin.fir.types.ConeKotlinType;
import org.jetbrains.kotlin.fir.types.ConeTypeProjection;
import org.jetbrains.kotlin.fir.types.ConeTypeProjectionKt;
import org.jetbrains.kotlin.fir.types.FirTypeRef;
import org.jetbrains.kotlin.fir.types.FirTypeUtilsKt;
import org.jetbrains.kotlin.fir.types.ProjectionKind;
import org.jetbrains.kotlin.name.StandardClassIds;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0016\u0010\n\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u0010\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u0011\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0016\u0010\u0011\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0016\u0010\u0012\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\r\u001a\u00020\u000e\u001a\u0014\u0010\u0014\u001a\u00020\u000b*\u00020\u00152\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u0016\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\r\u001a\u00020\u000e\u001a\u0016\u0010\u0017\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\r\u001a\u00020\u000e\u001a\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000eH\u0002\"\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u001b"}, d2 = {"explicitParameterTypes", "", "Lorg/jetbrains/kotlin/fir/types/ConeKotlinType;", "Lorg/jetbrains/kotlin/fir/symbols/impl/FirFunctionSymbol;", "getExplicitParameterTypes", "(Lorg/jetbrains/kotlin/fir/symbols/impl/FirFunctionSymbol;)Ljava/util/List;", "getDirectOverriddenFunctions", "Lorg/jetbrains/kotlin/fir/declarations/FirFunction;", "context", "Lorg/jetbrains/kotlin/fir/analysis/checkers/context/CheckerContext;", "hasComposableAnnotation", "", "Lorg/jetbrains/kotlin/fir/FirAnnotationContainer;", "session", "Lorg/jetbrains/kotlin/fir/FirSession;", "Lorg/jetbrains/kotlin/fir/symbols/FirBasedSymbol;", "hasDisallowComposableCallsAnnotation", "hasReadOnlyComposableAnnotation", "isComposable", "Lorg/jetbrains/kotlin/fir/symbols/impl/FirCallableSymbol;", "isComposableDelegate", "Lorg/jetbrains/kotlin/fir/symbols/impl/FirPropertyAccessorSymbol;", "isMain", "isReadOnlyComposable", "jvmNameAsString", "", "Lorg/jetbrains/kotlin/fir/symbols/impl/FirNamedFunctionSymbol;", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFirUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirUtils.kt\nandroidx/compose/compiler/plugins/kotlin/k2/FirUtilsKt\n+ 2 FirStatusUtils.kt\norg/jetbrains/kotlin/fir/declarations/utils/FirStatusUtilsKt\n+ 3 FirSymbolStatusUtils.kt\norg/jetbrains/kotlin/fir/declarations/utils/FirSymbolStatusUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n37#2:176\n34#3:177\n1603#4,9:178\n1855#4:187\n1856#4:189\n1612#4:190\n1549#4:192\n1620#4,3:193\n1549#4:196\n1620#4,3:197\n1#5:188\n1#5:191\n*S KotlinDebug\n*F\n+ 1 FirUtils.kt\nandroidx/compose/compiler/plugins/kotlin/k2/FirUtilsKt\n*L\n105#1:176\n105#1:177\n119#1:178,9\n119#1:187\n119#1:189\n119#1:190\n172#1:192\n172#1:193,3\n174#1:196\n174#1:197,3\n119#1:188\n*E\n"})
public final class FirUtilsKt {
    @NotNull
    public static final List<FirFunctionSymbol<?>> getDirectOverriddenFunctions(@NotNull FirFunction firFunction, @NotNull CheckerContext checkerContext) {
        FirTypeScope firTypeScopeUnsubstitutedScope;
        FirCallableSymbol propertySymbol;
        if (!((FirMemberDeclaration) firFunction).getStatus().isOverride()) {
            FirPropertyAccessor firPropertyAccessor = firFunction instanceof FirPropertyAccessor ? (FirPropertyAccessor) firFunction : null;
            boolean z = false;
            if (firPropertyAccessor != null && (propertySymbol = firPropertyAccessor.getPropertySymbol()) != null && propertySymbol.getRawStatus().isOverride()) {
                z = true;
            }
            if (!z) {
                return CollectionsKt.emptyList();
            }
        }
        ConeClassLikeLookupTag coneClassLikeLookupTagContainingClassLookupTag = ClassMembersKt.containingClassLookupTag((FirCallableDeclaration) firFunction);
        FirClassLikeSymbol symbol = coneClassLikeLookupTagContainingClassLookupTag != null ? LookupTagUtilsKt.toSymbol(coneClassLikeLookupTagContainingClassLookupTag, checkerContext.getSession()) : null;
        FirClassSymbol firClassSymbol = symbol instanceof FirClassSymbol ? (FirClassSymbol) symbol : null;
        if (firClassSymbol == null || (firTypeScopeUnsubstitutedScope = FirHelpersKt.unsubstitutedScope(firClassSymbol, checkerContext)) == null) {
            return CollectionsKt.emptyList();
        }
        FirNamedFunctionSymbol symbol2 = firFunction.getSymbol();
        if (symbol2 instanceof FirNamedFunctionSymbol) {
            firTypeScopeUnsubstitutedScope.processFunctionsByName(symbol2.getName(), new Function1<FirNamedFunctionSymbol, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.k2.FirUtilsKt.getDirectOverriddenFunctions.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull FirNamedFunctionSymbol firNamedFunctionSymbol) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FirNamedFunctionSymbol firNamedFunctionSymbol) {
                    invoke2(firNamedFunctionSymbol);
                    return Unit.INSTANCE;
                }
            });
            return FirTypeScopeKt.getDirectOverriddenFunctions(firTypeScopeUnsubstitutedScope, symbol2, true);
        }
        if (!(symbol2 instanceof FirPropertyAccessorSymbol)) {
            return CollectionsKt.emptyList();
        }
        FirPropertyAccessorSymbol firPropertyAccessorSymbol = (FirPropertyAccessorSymbol) symbol2;
        List<FirPropertySymbol> directOverriddenProperties = FirTypeScopeKt.getDirectOverriddenProperties(firTypeScopeUnsubstitutedScope, firPropertyAccessorSymbol.getPropertySymbol(), true);
        ArrayList arrayList = new ArrayList();
        for (FirPropertySymbol firPropertySymbol : directOverriddenProperties) {
            FirPropertyAccessorSymbol getterSymbol = firPropertyAccessorSymbol.isGetter() ? firPropertySymbol.getGetterSymbol() : firPropertySymbol.getSetterSymbol();
            if (getterSymbol != null) {
                arrayList.add(getterSymbol);
            }
        }
        return arrayList;
    }

    private static final List<ConeKotlinType> getExplicitParameterTypes(FirFunctionSymbol<?> firFunctionSymbol) {
        FirTypeRef typeRef;
        List resolvedContextReceivers = firFunctionSymbol.getResolvedContextReceivers();
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(resolvedContextReceivers));
        Iterator it = resolvedContextReceivers.iterator();
        while (it.hasNext()) {
            arrayList.add(FirTypeUtilsKt.getConeType(((FirContextReceiver) it.next()).getTypeRef()));
        }
        FirReceiverParameter receiverParameter = firFunctionSymbol.getReceiverParameter();
        List listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt.listOfNotNull((receiverParameter == null || (typeRef = receiverParameter.getTypeRef()) == null) ? null : FirTypeUtilsKt.getConeType(typeRef)));
        List valueParameterSymbols = firFunctionSymbol.getValueParameterSymbols();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(valueParameterSymbols));
        Iterator it2 = valueParameterSymbols.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((FirValueParameterSymbol) it2.next()).getResolvedReturnType());
        }
        return CollectionsKt.plus((Collection) listPlus, (Iterable) arrayList2);
    }

    public static final boolean hasComposableAnnotation(@NotNull FirAnnotationContainer firAnnotationContainer, @NotNull FirSession firSession) {
        return FirAnnotationUtilsKt.hasAnnotation(firAnnotationContainer, ComposeClassIds.INSTANCE.getComposable(), firSession);
    }

    public static final boolean hasDisallowComposableCallsAnnotation(@NotNull FirAnnotationContainer firAnnotationContainer, @NotNull FirSession firSession) {
        return FirAnnotationUtilsKt.hasAnnotation(firAnnotationContainer, ComposeClassIds.INSTANCE.getDisallowComposableCalls(), firSession);
    }

    public static final boolean hasReadOnlyComposableAnnotation(@NotNull FirAnnotationContainer firAnnotationContainer, @NotNull FirSession firSession) {
        return FirAnnotationUtilsKt.hasAnnotation(firAnnotationContainer, ComposeClassIds.INSTANCE.getReadOnlyComposable(), firSession);
    }

    public static final boolean isComposable(@NotNull FirCallableSymbol<?> firCallableSymbol, @NotNull FirSession firSession) {
        FirBasedSymbol getterSymbol;
        if (firCallableSymbol instanceof FirFunctionSymbol) {
            return hasComposableAnnotation((FirBasedSymbol<?>) firCallableSymbol, firSession);
        }
        return (firCallableSymbol instanceof FirPropertySymbol) && (getterSymbol = ((FirPropertySymbol) firCallableSymbol).getGetterSymbol()) != null && (hasComposableAnnotation((FirBasedSymbol<?>) getterSymbol, firSession) || isComposableDelegate(getterSymbol, firSession));
    }

    private static final boolean isComposableDelegate(FirPropertyAccessorSymbol firPropertyAccessorSymbol, FirSession firSession) {
        FirReference calleeReference;
        FirCallableSymbol resolvedCallableSymbol$default;
        List statements;
        if (!firPropertyAccessorSymbol.getPropertySymbol().getHasDelegate()) {
            return false;
        }
        FirBlock body = firPropertyAccessorSymbol.getFir().getBody();
        FirStatement firStatement = (body == null || (statements = body.getStatements()) == null) ? null : (FirStatement) CollectionsKt.singleOrNull(statements);
        FirReturnExpression firReturnExpression = firStatement instanceof FirReturnExpression ? (FirReturnExpression) firStatement : null;
        FirExpression result = firReturnExpression != null ? firReturnExpression.getResult() : null;
        FirFunctionCall firFunctionCall = result instanceof FirFunctionCall ? (FirFunctionCall) result : null;
        if (firFunctionCall == null || (calleeReference = firFunctionCall.getCalleeReference()) == null || (resolvedCallableSymbol$default = FirReferenceUtilsKt.toResolvedCallableSymbol$default(calleeReference, false, 1, (Object) null)) == null) {
            return false;
        }
        return isComposable(resolvedCallableSymbol$default, firSession);
    }

    public static final boolean isMain(@NotNull FirFunctionSymbol<?> firFunctionSymbol, @NotNull FirSession firSession) {
        ConeKotlinType type;
        if (!(firFunctionSymbol instanceof FirNamedFunctionSymbol) || (!firFunctionSymbol.getTypeParameterSymbols().isEmpty()) || !ConeBuiltinTypeUtilsKt.isUnit(firFunctionSymbol.getResolvedReturnType()) || !Intrinsics.areEqual(jvmNameAsString((FirNamedFunctionSymbol) firFunctionSymbol, firSession), "main")) {
            return false;
        }
        List<ConeKotlinType> explicitParameterTypes = getExplicitParameterTypes(firFunctionSymbol);
        int size = explicitParameterTypes.size();
        if (size != 0) {
            if (size != 1) {
                return false;
            }
            ConeKotlinType coneKotlinType = (ConeKotlinType) CollectionsKt.single((List) explicitParameterTypes);
            if (ConeBuiltinTypeUtilsKt.isArrayType(coneKotlinType) && coneKotlinType.getTypeArguments().length == 1) {
                ConeTypeProjection coneTypeProjection = coneKotlinType.getTypeArguments()[0];
                if (!(coneTypeProjection.getKind() != ProjectionKind.IN)) {
                    coneTypeProjection = null;
                }
                if (coneTypeProjection == null || (type = ConeTypeProjectionKt.getType(coneTypeProjection)) == null || !ConeBuiltinTypeUtilsKt.isString(type)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean isReadOnlyComposable(@NotNull FirCallableSymbol<?> firCallableSymbol, @NotNull FirSession firSession) {
        FirBasedSymbol getterSymbol;
        if (firCallableSymbol instanceof FirFunctionSymbol) {
            return hasReadOnlyComposableAnnotation((FirBasedSymbol<?>) firCallableSymbol, firSession);
        }
        if (!(firCallableSymbol instanceof FirPropertySymbol) || (getterSymbol = ((FirPropertySymbol) firCallableSymbol).getGetterSymbol()) == null) {
            return false;
        }
        return hasReadOnlyComposableAnnotation((FirBasedSymbol<?>) getterSymbol, firSession);
    }

    private static final String jvmNameAsString(FirNamedFunctionSymbol firNamedFunctionSymbol, FirSession firSession) {
        String annotationStringParameter = FirHelpersKt.getAnnotationStringParameter((FirBasedSymbol) firNamedFunctionSymbol, StandardClassIds.Annotations.INSTANCE.getJvmName(), firSession);
        return annotationStringParameter == null ? firNamedFunctionSymbol.getName().asString() : annotationStringParameter;
    }

    public static final boolean hasComposableAnnotation(@NotNull FirBasedSymbol<?> firBasedSymbol, @NotNull FirSession firSession) {
        return FirAnnotationUtilsKt.hasAnnotation(firBasedSymbol, ComposeClassIds.INSTANCE.getComposable(), firSession);
    }

    public static final boolean hasReadOnlyComposableAnnotation(@NotNull FirBasedSymbol<?> firBasedSymbol, @NotNull FirSession firSession) {
        return FirAnnotationUtilsKt.hasAnnotation(firBasedSymbol, ComposeClassIds.INSTANCE.getReadOnlyComposable(), firSession);
    }
}
