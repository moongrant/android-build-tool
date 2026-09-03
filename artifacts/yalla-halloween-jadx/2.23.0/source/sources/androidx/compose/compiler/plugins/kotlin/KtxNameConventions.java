package androidx.compose.compiler.plugins.kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.name.Name;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0016X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0016X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u0016X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u0016X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0011\u0010#\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0011\u0010%\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u0016X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0014\u0010)\u001a\u00020\u0016X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\u0014\u0010+\u001a\u00020\u0016X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0018R\u0011\u0010-\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006¨\u0006/"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/KtxNameConventions;", "", "()V", "CHANGED_PARAMETER", "Lorg/jetbrains/kotlin/name/Name;", "getCHANGED_PARAMETER", "()Lorg/jetbrains/kotlin/name/Name;", "COMPOSER", "getCOMPOSER", "COMPOSER_PARAMETER", "getCOMPOSER_PARAMETER", "CURRENTMARKER", "getCURRENTMARKER", "DEFAULT_PARAMETER", "getDEFAULT_PARAMETER", "ENDRESTARTGROUP", "getENDRESTARTGROUP", "ENDTOMARKER", "getENDTOMARKER", "FORCE_PARAMETER", "getFORCE_PARAMETER", "IS_TRACE_IN_PROGRESS", "", "getIS_TRACE_IN_PROGRESS", "()Ljava/lang/String;", "JOINKEY", "getJOINKEY", "SOURCEINFORMATION", "getSOURCEINFORMATION", "SOURCEINFORMATIONMARKEREND", "getSOURCEINFORMATIONMARKEREND", "SOURCEINFORMATIONMARKERSTART", "getSOURCEINFORMATIONMARKERSTART", "STABILITY_FLAG", "getSTABILITY_FLAG", "STABILITY_PROP_FLAG", "getSTABILITY_PROP_FLAG", "STARTRESTARTGROUP", "getSTARTRESTARTGROUP", "TRACE_EVENT_END", "getTRACE_EVENT_END", "TRACE_EVENT_START", "getTRACE_EVENT_START", "UPDATE_CHANGED_FLAGS", "getUPDATE_CHANGED_FLAGS", "UPDATE_SCOPE", "getUPDATE_SCOPE", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KtxNameConventions {

    @NotNull
    private static final Name CHANGED_PARAMETER;

    @NotNull
    private static final Name COMPOSER;

    @NotNull
    private static final Name COMPOSER_PARAMETER;

    @NotNull
    private static final Name CURRENTMARKER;

    @NotNull
    private static final Name DEFAULT_PARAMETER;

    @NotNull
    private static final Name ENDRESTARTGROUP;

    @NotNull
    private static final Name ENDTOMARKER;

    @NotNull
    private static final Name FORCE_PARAMETER;

    @NotNull
    public static final KtxNameConventions INSTANCE = new KtxNameConventions();

    @NotNull
    private static final String IS_TRACE_IN_PROGRESS;

    @NotNull
    private static final Name JOINKEY;

    @NotNull
    private static final String SOURCEINFORMATION;

    @NotNull
    private static final String SOURCEINFORMATIONMARKEREND;

    @NotNull
    private static final String SOURCEINFORMATIONMARKERSTART;

    @NotNull
    private static final Name STABILITY_FLAG;

    @NotNull
    private static final Name STABILITY_PROP_FLAG;

    @NotNull
    private static final Name STARTRESTARTGROUP;

    @NotNull
    private static final String TRACE_EVENT_END;

    @NotNull
    private static final String TRACE_EVENT_START;

    @NotNull
    private static final String UPDATE_CHANGED_FLAGS;

    @NotNull
    private static final Name UPDATE_SCOPE;

    static {
        Name nameIdentifier = Name.identifier("composer");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(\"composer\")");
        COMPOSER = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("$composer");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(\"\\$composer\")");
        COMPOSER_PARAMETER = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("$changed");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(\"\\$changed\")");
        CHANGED_PARAMETER = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("$force");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier4, "identifier(\"\\$force\")");
        FORCE_PARAMETER = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("$stable");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier5, "identifier(\"\\$stable\")");
        STABILITY_FLAG = nameIdentifier5;
        Name nameIdentifier6 = Name.identifier("$stableprop");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier6, "identifier(\"\\$stableprop\")");
        STABILITY_PROP_FLAG = nameIdentifier6;
        Name nameIdentifier7 = Name.identifier("$default");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier7, "identifier(\"\\$default\")");
        DEFAULT_PARAMETER = nameIdentifier7;
        Name nameIdentifier8 = Name.identifier("joinKey");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier8, "identifier(\"joinKey\")");
        JOINKEY = nameIdentifier8;
        Name nameIdentifier9 = Name.identifier("startRestartGroup");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier9, "identifier(\"startRestartGroup\")");
        STARTRESTARTGROUP = nameIdentifier9;
        Name nameIdentifier10 = Name.identifier("endRestartGroup");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier10, "identifier(\"endRestartGroup\")");
        ENDRESTARTGROUP = nameIdentifier10;
        Name nameIdentifier11 = Name.identifier("updateScope");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier11, "identifier(\"updateScope\")");
        UPDATE_SCOPE = nameIdentifier11;
        SOURCEINFORMATION = "sourceInformation";
        SOURCEINFORMATIONMARKERSTART = "sourceInformationMarkerStart";
        IS_TRACE_IN_PROGRESS = "isTraceInProgress";
        TRACE_EVENT_START = "traceEventStart";
        TRACE_EVENT_END = "traceEventEnd";
        SOURCEINFORMATIONMARKEREND = "sourceInformationMarkerEnd";
        UPDATE_CHANGED_FLAGS = "updateChangedFlags";
        Name nameIdentifier12 = Name.identifier("currentMarker");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier12, "identifier(\"currentMarker\")");
        CURRENTMARKER = nameIdentifier12;
        Name nameIdentifier13 = Name.identifier("endToMarker");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier13, "identifier(\"endToMarker\")");
        ENDTOMARKER = nameIdentifier13;
    }

    private KtxNameConventions() {
    }

    @NotNull
    public final Name getCHANGED_PARAMETER() {
        return CHANGED_PARAMETER;
    }

    @NotNull
    public final Name getCOMPOSER() {
        return COMPOSER;
    }

    @NotNull
    public final Name getCOMPOSER_PARAMETER() {
        return COMPOSER_PARAMETER;
    }

    @NotNull
    public final Name getCURRENTMARKER() {
        return CURRENTMARKER;
    }

    @NotNull
    public final Name getDEFAULT_PARAMETER() {
        return DEFAULT_PARAMETER;
    }

    @NotNull
    public final Name getENDRESTARTGROUP() {
        return ENDRESTARTGROUP;
    }

    @NotNull
    public final Name getENDTOMARKER() {
        return ENDTOMARKER;
    }

    @NotNull
    public final Name getFORCE_PARAMETER() {
        return FORCE_PARAMETER;
    }

    @NotNull
    public final String getIS_TRACE_IN_PROGRESS() {
        return IS_TRACE_IN_PROGRESS;
    }

    @NotNull
    public final Name getJOINKEY() {
        return JOINKEY;
    }

    @NotNull
    public final String getSOURCEINFORMATION() {
        return SOURCEINFORMATION;
    }

    @NotNull
    public final String getSOURCEINFORMATIONMARKEREND() {
        return SOURCEINFORMATIONMARKEREND;
    }

    @NotNull
    public final String getSOURCEINFORMATIONMARKERSTART() {
        return SOURCEINFORMATIONMARKERSTART;
    }

    @NotNull
    public final Name getSTABILITY_FLAG() {
        return STABILITY_FLAG;
    }

    @NotNull
    public final Name getSTABILITY_PROP_FLAG() {
        return STABILITY_PROP_FLAG;
    }

    @NotNull
    public final Name getSTARTRESTARTGROUP() {
        return STARTRESTARTGROUP;
    }

    @NotNull
    public final String getTRACE_EVENT_END() {
        return TRACE_EVENT_END;
    }

    @NotNull
    public final String getTRACE_EVENT_START() {
        return TRACE_EVENT_START;
    }

    @NotNull
    public final String getUPDATE_CHANGED_FLAGS() {
        return UPDATE_CHANGED_FLAGS;
    }

    @NotNull
    public final Name getUPDATE_SCOPE() {
        return UPDATE_SCOPE;
    }
}
