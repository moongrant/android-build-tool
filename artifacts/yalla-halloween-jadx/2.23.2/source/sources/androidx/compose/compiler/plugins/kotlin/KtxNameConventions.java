package androidx.compose.compiler.plugins.kotlin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.name.Name;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0016X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0016X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u0016X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u0016X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0011\u0010#\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0011\u0010%\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u0016X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0014\u0010)\u001a\u00020\u0016X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\u0014\u0010+\u001a\u00020\u0016X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0018R\u0011\u0010-\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006¨\u0006/"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/KtxNameConventions;", "", "()V", "CHANGED_PARAMETER", "Lorg/jetbrains/kotlin/name/Name;", "getCHANGED_PARAMETER", "()Lorg/jetbrains/kotlin/name/Name;", "COMPOSER", "getCOMPOSER", "COMPOSER_PARAMETER", "getCOMPOSER_PARAMETER", "CURRENTMARKER", "getCURRENTMARKER", "DEFAULT_PARAMETER", "getDEFAULT_PARAMETER", "ENDRESTARTGROUP", "getENDRESTARTGROUP", "ENDTOMARKER", "getENDTOMARKER", "FORCE_PARAMETER", "getFORCE_PARAMETER", "IS_TRACE_IN_PROGRESS", "", "getIS_TRACE_IN_PROGRESS", "()Ljava/lang/String;", "JOINKEY", "getJOINKEY", "SOURCEINFORMATION", "getSOURCEINFORMATION", "SOURCEINFORMATIONMARKEREND", "getSOURCEINFORMATIONMARKEREND", "SOURCEINFORMATIONMARKERSTART", "getSOURCEINFORMATIONMARKERSTART", "STABILITY_FLAG", "getSTABILITY_FLAG", "STABILITY_PROP_FLAG", "getSTABILITY_PROP_FLAG", "STARTRESTARTGROUP", "getSTARTRESTARTGROUP", "TRACE_EVENT_END", "getTRACE_EVENT_END", "TRACE_EVENT_START", "getTRACE_EVENT_START", "UPDATE_CHANGED_FLAGS", "getUPDATE_CHANGED_FLAGS", "UPDATE_SCOPE", "getUPDATE_SCOPE", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KtxNameConventions {

    @NotNull
    public static final KtxNameConventions INSTANCE = new KtxNameConventions();

    @NotNull
    private static final Name COMPOSER = Name.identifier("composer");

    @NotNull
    private static final Name COMPOSER_PARAMETER = Name.identifier("$composer");

    @NotNull
    private static final Name CHANGED_PARAMETER = Name.identifier("$changed");

    @NotNull
    private static final Name FORCE_PARAMETER = Name.identifier("$force");

    @NotNull
    private static final Name STABILITY_FLAG = Name.identifier("$stable");

    @NotNull
    private static final Name STABILITY_PROP_FLAG = Name.identifier("$stableprop");

    @NotNull
    private static final Name DEFAULT_PARAMETER = Name.identifier("$default");

    @NotNull
    private static final Name JOINKEY = Name.identifier("joinKey");

    @NotNull
    private static final Name STARTRESTARTGROUP = Name.identifier("startRestartGroup");

    @NotNull
    private static final Name ENDRESTARTGROUP = Name.identifier("endRestartGroup");

    @NotNull
    private static final Name UPDATE_SCOPE = Name.identifier("updateScope");

    @NotNull
    private static final String SOURCEINFORMATION = "sourceInformation";

    @NotNull
    private static final String SOURCEINFORMATIONMARKERSTART = "sourceInformationMarkerStart";

    @NotNull
    private static final String IS_TRACE_IN_PROGRESS = "isTraceInProgress";

    @NotNull
    private static final String TRACE_EVENT_START = "traceEventStart";

    @NotNull
    private static final String TRACE_EVENT_END = "traceEventEnd";

    @NotNull
    private static final String SOURCEINFORMATIONMARKEREND = "sourceInformationMarkerEnd";

    @NotNull
    private static final String UPDATE_CHANGED_FLAGS = "updateChangedFlags";

    @NotNull
    private static final Name CURRENTMARKER = Name.identifier("currentMarker");

    @NotNull
    private static final Name ENDTOMARKER = Name.identifier("endToMarker");

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
