package androidx.compose.compiler.plugins.kotlin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.name.CallableId;
import org.jetbrains.kotlin.name.Name;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%H\u0000¢\u0006\u0002\b&J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006¨\u0006("}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ComposeCallableIds;", "", "()V", "cache", "Lorg/jetbrains/kotlin/name/CallableId;", "getCache", "()Lorg/jetbrains/kotlin/name/CallableId;", "composableLambda", "getComposableLambda", "composableLambdaInstance", "getComposableLambdaInstance", "composableLambdaN", "getComposableLambdaN", "composableLambdaNInstance", "getComposableLambdaNInstance", "currentComposer", "getCurrentComposer", "isLiveLiteralsEnabled", "isTraceInProgress", "liveLiteral", "getLiveLiteral", "remember", "getRemember", "sourceInformation", "getSourceInformation", "sourceInformationMarkerEnd", "getSourceInformationMarkerEnd", "sourceInformationMarkerStart", "getSourceInformationMarkerStart", "traceEventEnd", "getTraceEventEnd", "traceEventStart", "getTraceEventStart", "updateChangedFlags", "getUpdateChangedFlags", "internalTopLevelCallableId", "name", "", "internalTopLevelCallableId$compiler_hosted", "topLevelCallableId", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeCallableIds {

    @NotNull
    public static final ComposeCallableIds INSTANCE;

    @NotNull
    private static final CallableId cache;

    @NotNull
    private static final CallableId composableLambda;

    @NotNull
    private static final CallableId composableLambdaInstance;

    @NotNull
    private static final CallableId composableLambdaN;

    @NotNull
    private static final CallableId composableLambdaNInstance;

    @NotNull
    private static final CallableId currentComposer;

    @NotNull
    private static final CallableId isLiveLiteralsEnabled;

    @NotNull
    private static final CallableId isTraceInProgress;

    @NotNull
    private static final CallableId liveLiteral;

    @NotNull
    private static final CallableId remember;

    @NotNull
    private static final CallableId sourceInformation;

    @NotNull
    private static final CallableId sourceInformationMarkerEnd;

    @NotNull
    private static final CallableId sourceInformationMarkerStart;

    @NotNull
    private static final CallableId traceEventEnd;

    @NotNull
    private static final CallableId traceEventStart;

    @NotNull
    private static final CallableId updateChangedFlags;

    static {
        ComposeCallableIds composeCallableIds = new ComposeCallableIds();
        INSTANCE = composeCallableIds;
        cache = composeCallableIds.topLevelCallableId("cache");
        composableLambda = composeCallableIds.internalTopLevelCallableId$compiler_hosted("composableLambda");
        composableLambdaInstance = composeCallableIds.internalTopLevelCallableId$compiler_hosted("composableLambdaInstance");
        composableLambdaN = composeCallableIds.internalTopLevelCallableId$compiler_hosted("composableLambdaN");
        composableLambdaNInstance = composeCallableIds.internalTopLevelCallableId$compiler_hosted("composableLambdaNInstance");
        currentComposer = composeCallableIds.topLevelCallableId("currentComposer");
        isLiveLiteralsEnabled = composeCallableIds.internalTopLevelCallableId$compiler_hosted("isLiveLiteralsEnabled");
        KtxNameConventions ktxNameConventions = KtxNameConventions.INSTANCE;
        isTraceInProgress = composeCallableIds.topLevelCallableId(ktxNameConventions.getIS_TRACE_IN_PROGRESS());
        liveLiteral = composeCallableIds.internalTopLevelCallableId$compiler_hosted("liveLiteral");
        remember = composeCallableIds.topLevelCallableId("remember");
        sourceInformation = composeCallableIds.topLevelCallableId(ktxNameConventions.getSOURCEINFORMATION());
        sourceInformationMarkerEnd = composeCallableIds.topLevelCallableId(ktxNameConventions.getSOURCEINFORMATIONMARKEREND());
        sourceInformationMarkerStart = composeCallableIds.topLevelCallableId(ktxNameConventions.getSOURCEINFORMATIONMARKERSTART());
        traceEventEnd = composeCallableIds.topLevelCallableId(ktxNameConventions.getTRACE_EVENT_END());
        traceEventStart = composeCallableIds.topLevelCallableId(ktxNameConventions.getTRACE_EVENT_START());
        updateChangedFlags = composeCallableIds.topLevelCallableId(ktxNameConventions.getUPDATE_CHANGED_FLAGS());
    }

    private ComposeCallableIds() {
    }

    private final CallableId topLevelCallableId(String name) {
        return new CallableId(ComposeFqNamesKt.rootFqName, Name.identifier(name));
    }

    @NotNull
    public final CallableId getCache() {
        return cache;
    }

    @NotNull
    public final CallableId getComposableLambda() {
        return composableLambda;
    }

    @NotNull
    public final CallableId getComposableLambdaInstance() {
        return composableLambdaInstance;
    }

    @NotNull
    public final CallableId getComposableLambdaN() {
        return composableLambdaN;
    }

    @NotNull
    public final CallableId getComposableLambdaNInstance() {
        return composableLambdaNInstance;
    }

    @NotNull
    public final CallableId getCurrentComposer() {
        return currentComposer;
    }

    @NotNull
    public final CallableId getLiveLiteral() {
        return liveLiteral;
    }

    @NotNull
    public final CallableId getRemember() {
        return remember;
    }

    @NotNull
    public final CallableId getSourceInformation() {
        return sourceInformation;
    }

    @NotNull
    public final CallableId getSourceInformationMarkerEnd() {
        return sourceInformationMarkerEnd;
    }

    @NotNull
    public final CallableId getSourceInformationMarkerStart() {
        return sourceInformationMarkerStart;
    }

    @NotNull
    public final CallableId getTraceEventEnd() {
        return traceEventEnd;
    }

    @NotNull
    public final CallableId getTraceEventStart() {
        return traceEventStart;
    }

    @NotNull
    public final CallableId getUpdateChangedFlags() {
        return updateChangedFlags;
    }

    @NotNull
    public final CallableId internalTopLevelCallableId$compiler_hosted(@NotNull String name) {
        return new CallableId(ComposeFqNamesKt.internalRootFqName, Name.identifier(name));
    }

    @NotNull
    public final CallableId isLiveLiteralsEnabled() {
        return isLiveLiteralsEnabled;
    }

    @NotNull
    public final CallableId isTraceInProgress() {
        return isTraceInProgress;
    }
}
