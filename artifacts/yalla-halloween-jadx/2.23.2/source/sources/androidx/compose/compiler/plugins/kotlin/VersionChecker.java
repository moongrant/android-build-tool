package androidx.compose.compiler.plugins.kotlin;

import com.facebook.internal.ServerProtocol;
import com.youth.banner.config.BannerConfig;
import io.agora.rtc.Constants;
import io.agora.rtc.internal.RtcEngineEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import me.jessyan.autosize.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrField;
import org.jetbrains.kotlin.ir.declarations.IrProperty;
import org.jetbrains.kotlin.ir.expressions.IrConst;
import org.jetbrains.kotlin.ir.expressions.IrConstKind;
import org.jetbrains.kotlin.ir.expressions.IrExpressionBody;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.platform.jvm.JvmPlatformKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/VersionChecker;", "", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;)V", "getContext", "()Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "check", "", "noRuntimeOnClasspathError", "", "outdatedRuntime", "actualVersion", "", "outdatedRuntimeWithUnknownVersionNumber", "Companion", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVersionChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VersionChecker.kt\nandroidx/compose/compiler/plugins/kotlin/VersionChecker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1603#2,9:207\n1855#2:216\n1856#2:218\n1612#2:219\n288#2,2:220\n1#3:217\n*S KotlinDebug\n*F\n+ 1 VersionChecker.kt\nandroidx/compose/compiler/plugins/kotlin/VersionChecker\n*L\n155#1:207,9\n155#1:216\n155#1:218\n155#1:219\n156#1:220,2\n155#1:217\n*E\n"})
public final class VersionChecker {

    @NotNull
    public static final String compilerVersion = "1.5.3";

    @NotNull
    private final IrPluginContext context;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int minimumRuntimeVersionInt = 3300;

    @NotNull
    private static final Map<Integer, String> runtimeVersionToMavenVersionTable = MapsKt.mapOf(TuplesKt.to(1600, "0.1.0-dev16"), TuplesKt.to(1700, "1.0.0-alpha06"), TuplesKt.to(Integer.valueOf(Constants.ERR_AUDIO_BT_NO_ROUTE), "1.0.0-alpha07"), TuplesKt.to(1900, "1.0.0-alpha08"), TuplesKt.to(2000, "1.0.0-alpha09"), TuplesKt.to(2100, "1.0.0-alpha10"), TuplesKt.to(2200, "1.0.0-alpha11"), TuplesKt.to(2300, "1.0.0-alpha12"), TuplesKt.to(2400, "1.0.0-alpha13"), TuplesKt.to(2500, "1.0.0-beta04"), TuplesKt.to(2600, "1.0.0-beta05"), TuplesKt.to(2700, "1.0.0-beta06"), TuplesKt.to(2800, "1.0.0-beta07"), TuplesKt.to(2900, "1.0.0-beta08"), TuplesKt.to(Integer.valueOf(BannerConfig.LOOP_TIME), "1.0.0-beta09"), TuplesKt.to(3100, "1.0.0-rc01"), TuplesKt.to(3200, "1.0.0-rc02"), TuplesKt.to(Integer.valueOf(minimumRuntimeVersionInt), "1.0.0"), TuplesKt.to(3301, "1.0.1"), TuplesKt.to(3302, "1.0.2"), TuplesKt.to(3303, "1.0.3"), TuplesKt.to(3304, "1.0.4"), TuplesKt.to(3305, "1.0.5"), TuplesKt.to(4000, "1.1.0-alpha01"), TuplesKt.to(4100, "1.1.0-alpha02"), TuplesKt.to(4200, "1.1.0-alpha03"), TuplesKt.to(4300, "1.1.0-alpha04"), TuplesKt.to(4400, "1.1.0-alpha05"), TuplesKt.to(4500, "1.1.0-alpha06"), TuplesKt.to(4600, "1.1.0-beta01"), TuplesKt.to(4700, "1.1.0-beta02"), TuplesKt.to(4800, "1.1.0-beta03"), TuplesKt.to(4900, "1.1.0-beta04"), TuplesKt.to(5000, "1.1.0-rc01"), TuplesKt.to(5001, "1.1.0-rc02"), TuplesKt.to(5002, "1.1.0-rc03"), TuplesKt.to(5003, "1.1.0"), TuplesKt.to(5004, "1.1.1"), TuplesKt.to(6000, "1.2.0-alpha01"), TuplesKt.to(6100, "1.2.0-alpha02"), TuplesKt.to(6200, "1.2.0-alpha03"), TuplesKt.to(6300, "1.2.0-alpha04"), TuplesKt.to(6400, "1.2.0-alpha05"), TuplesKt.to(6500, "1.2.0-alpha06"), TuplesKt.to(6600, "1.2.0-alpha07"), TuplesKt.to(6700, "1.2.0-alpha08"), TuplesKt.to(6800, "1.2.0-beta01"), TuplesKt.to(6900, "1.2.0-beta02"), TuplesKt.to(7000, "1.2.0-beta03"), TuplesKt.to(7100, "1.2.0-rc01"), TuplesKt.to(7101, "1.2.0-rc02"), TuplesKt.to(7102, "1.2.0-rc03"), TuplesKt.to(7103, "1.2.0"), TuplesKt.to(7104, BuildConfig.VERSION_NAME), TuplesKt.to(7105, "1.2.2"), TuplesKt.to(8000, "1.3.0-alpha01"), TuplesKt.to(8100, "1.3.0-alpha02"), TuplesKt.to(8200, "1.3.0-alpha03"), TuplesKt.to(8300, "1.3.0-beta01"), TuplesKt.to(8400, "1.3.0-beta02"), TuplesKt.to(8500, "1.3.0-beta03"), TuplesKt.to(8600, "1.3.0-rc01"), TuplesKt.to(8601, "1.3.0-rc02"), TuplesKt.to(8602, "1.3.0"), TuplesKt.to(8603, "1.3.1"), TuplesKt.to(8604, "1.3.2"), TuplesKt.to(8605, "1.3.3"), TuplesKt.to(8606, "1.3.4"), TuplesKt.to(9000, "1.4.0-alpha01"), TuplesKt.to(9001, "1.4.0-alpha02"), TuplesKt.to(9100, "1.4.0-alpha03"), TuplesKt.to(9200, "1.4.0-alpha04"), TuplesKt.to(9300, "1.4.0-alpha05"), TuplesKt.to(9400, "1.4.0-alpha06"), TuplesKt.to(9500, "1.4.0-beta01"), TuplesKt.to(9600, "1.4.0-beta02"), TuplesKt.to(9700, "1.4.0-rc01"), TuplesKt.to(9701, "1.4.0-rc02"), TuplesKt.to(9701, "1.5.0-alpha01"), TuplesKt.to(9801, "1.5.0-alpha02"), TuplesKt.to(9901, "1.5.0-alpha03"), TuplesKt.to(Integer.valueOf(RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS), "1.5.0-alpha04"), TuplesKt.to(10101, "1.5.0-alpha05"), TuplesKt.to(10200, "1.6.0-alpha01"));

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/VersionChecker$Companion;", "", "()V", "compilerVersion", "", "minimumRuntimeVersion", "getMinimumRuntimeVersion", "()Ljava/lang/String;", "minimumRuntimeVersionInt", "", "runtimeVersionToMavenVersionTable", "", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getMinimumRuntimeVersion() {
            String str = (String) VersionChecker.runtimeVersionToMavenVersionTable.get(Integer.valueOf(VersionChecker.minimumRuntimeVersionInt));
            return str == null ? "unknown" : str;
        }
    }

    public VersionChecker(@NotNull IrPluginContext irPluginContext) {
        this.context = irPluginContext;
    }

    private final Void noRuntimeOnClasspathError() throws IncompatibleComposeRuntimeVersionException {
        throw new IncompatibleComposeRuntimeVersionException(StringsKt__StringsJVMKt.replace$default(StringsKt.trimIndent("\n                The Compose Compiler requires the Compose Runtime to be on the class path, but\n                none could be found. The compose compiler plugin you are using (version\n                1.5.3) expects a minimum runtime version of " + INSTANCE.getMinimumRuntimeVersion() + ".\n            "), '\n', ' ', false, 4, (Object) null));
    }

    private final Void outdatedRuntime(String actualVersion) throws IncompatibleComposeRuntimeVersionException {
        throw new IncompatibleComposeRuntimeVersionException(StringsKt__StringsJVMKt.replace$default(StringsKt.trimIndent("\n                You are using an outdated version of Compose Runtime that is not compatible with\n                the version of the Compose Compiler plugin you have installed. The compose\n                compiler plugin you are using (version 1.5.3) expects a minimum runtime\n                version of " + INSTANCE.getMinimumRuntimeVersion() + ". The version of the runtime on the classpath\n                currently is " + actualVersion + ".\n            "), '\n', ' ', false, 4, (Object) null));
    }

    private final Void outdatedRuntimeWithUnknownVersionNumber() throws IncompatibleComposeRuntimeVersionException {
        throw new IncompatibleComposeRuntimeVersionException(StringsKt__StringsJVMKt.replace$default(StringsKt.trimIndent("\n                You are using an outdated version of Compose Runtime that is not compatible with\n                the version of the Compose Compiler plugin you have installed. The compose\n                compiler plugin you are using (version 1.5.3) expects a minimum runtime\n                version of " + INSTANCE.getMinimumRuntimeVersion() + ".\n            "), '\n', ' ', false, 4, (Object) null));
    }

    public final void check() throws IncompatibleComposeRuntimeVersionException {
        Object next;
        IrProperty irProperty;
        IrField backingField;
        IrExpressionBody initializer;
        if (JvmPlatformKt.isJvm(this.context.getPlatform())) {
            IrPluginContext irPluginContext = this.context;
            ComposeClassIds composeClassIds = ComposeClassIds.INSTANCE;
            IrClassSymbol irClassSymbolReferenceClass = irPluginContext.referenceClass(composeClassIds.getComposeVersion());
            if (irClassSymbolReferenceClass == null) {
                if (this.context.referenceClass(composeClassIds.getComposer()) != null) {
                    outdatedRuntimeWithUnknownVersionNumber();
                    throw new KotlinNothingValueException();
                }
                noRuntimeOnClasspathError();
                throw new KotlinNothingValueException();
            }
            List declarations = irClassSymbolReferenceClass.getOwner().getDeclarations();
            ArrayList arrayList = new ArrayList();
            Iterator it = declarations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                IrProperty irProperty2 = (IrDeclaration) it.next();
                irProperty = irProperty2 instanceof IrProperty ? irProperty2 : null;
                if (irProperty != null) {
                    arrayList.add(irProperty);
                }
            }
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((IrProperty) next).getName().asString(), ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION));
            IrProperty irProperty3 = (IrProperty) next;
            IrProperty expression = (irProperty3 == null || (backingField = irProperty3.getBackingField()) == null || (initializer = backingField.getInitializer()) == null) ? null : initializer.getExpression();
            irProperty = expression instanceof IrConst ? (IrConst) expression : null;
            if (irProperty == null || !Intrinsics.areEqual(irProperty.getKind(), IrConstKind.Int.INSTANCE)) {
                outdatedRuntimeWithUnknownVersionNumber();
                throw new KotlinNothingValueException();
            }
            Object value = irProperty.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) value).intValue();
            if (iIntValue < minimumRuntimeVersionInt) {
                String str = runtimeVersionToMavenVersionTable.get(Integer.valueOf(iIntValue));
                if (str == null) {
                    str = "<unknown>";
                }
                outdatedRuntime(str);
                throw new KotlinNothingValueException();
            }
        }
    }

    @NotNull
    public final IrPluginContext getContext() {
        return this.context;
    }
}
