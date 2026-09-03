package com.common.support.apm.configuration;

import android.content.Context;
import android.content.SharedPreferences;
import com.common.support.apm.Sailfish;
import com.common.support.apm.base.LoggerKt;
import com.common.support.apm.configuration.specific.DomainConfig;
import com.common.support.apm.monitor.BaseMonitorReportApi;
import com.common.support.apm.sailfishhttp.BaseServerResponse;
import com.common.support.apm.sailfishhttp.convertor.SysServerConvertor;
import com.common.support.apm.utils.JsonUtilKt;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.google.gson.reflect.TypeToken;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0006J\u0014\u0010\u0016\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014J\u0014\u0010\u0017\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0018J\u0006\u0010\u001b\u001a\u00020\u001aR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00140'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/common/support/apm/configuration/ConfigurationManager;", "", "Landroid/content/Context;", "context", "Lcom/common/support/apm/configuration/Configuration;", "loadLocalConfig", "", "notifyListeners", "", RemoteConfigConstants$RequestFieldKey.APP_ID, "uniqueId", "", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "fetchConfigFromServer", "configuration", "updateConfig", "Lo0ooO0oO/o00OOOO0;", "okHttpClient", "init", "reloadConfig", "Lkotlin/Function0;", NativeProtocol.WEB_DIALOG_ACTION, "addOnConfigChangeListener", "removeOnConfigChangeListener", "", "getDomainConfigData", "Lcom/common/support/apm/configuration/Configuration$LogConfig;", "getLogConfigData", "SP_NAME", "Ljava/lang/String;", "KEY_CONFIG", ConfigurationManager.SP_NAME, "Lcom/common/support/apm/configuration/Configuration;", "Ljava/lang/ref/WeakReference;", "appContextRef", "Ljava/lang/ref/WeakReference;", "Lcom/common/support/apm/configuration/ConfigApi;", "configApi", "Lcom/common/support/apm/configuration/ConfigApi;", "", "configChangeListeners", "Ljava/util/Set;", "<init>", "()V", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class ConfigurationManager {

    @NotNull
    private static final String KEY_CONFIG = "key_config";

    @NotNull
    private static final String SP_NAME = "config";
    private static WeakReference<Context> appContextRef;
    private static ConfigApi configApi;

    @NotNull
    public static final ConfigurationManager INSTANCE = new ConfigurationManager();

    @NotNull
    private static Configuration config = Configuration.INSTANCE.getDefault();

    @NotNull
    private static final Set<Function0<Unit>> configChangeListeners = new LinkedHashSet();

    private ConfigurationManager() {
    }

    private final void fetchConfigFromServer(String appId, String uniqueId, int version) {
        ConfigApi configApi2;
        ConfigApi configApi3 = configApi;
        if (configApi3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configApi");
            configApi3 = null;
        }
        o00OOOOo o00oooooCreateConfigRequest = configApi3.createConfigRequest(appId, uniqueId, version);
        Type respType = new TypeToken<BaseServerResponse<Configuration>>() { // from class: com.common.support.apm.configuration.ConfigurationManager$fetchConfigFromServer$respType$1
        }.getType();
        ConfigApi configApi4 = configApi;
        if (configApi4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configApi");
            configApi2 = null;
        } else {
            configApi2 = configApi4;
        }
        Intrinsics.checkNotNullExpressionValue(respType, "respType");
        BaseMonitorReportApi.asyncForMetric$default(configApi2, o00oooooCreateConfigRequest, respType, null, new Function1<BaseServerResponse<Configuration>, Unit>() { // from class: com.common.support.apm.configuration.ConfigurationManager.fetchConfigFromServer.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BaseServerResponse<Configuration> baseServerResponse) {
                invoke2(baseServerResponse);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable final BaseServerResponse<Configuration> baseServerResponse) {
                Unit unit;
                if (baseServerResponse == null) {
                    LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.configuration.ConfigurationManager$fetchConfigFromServer$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "Configuration fetch success, but no response!";
                        }
                    }, 1, null);
                    return;
                }
                if (!baseServerResponse.getSuccess()) {
                    LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.configuration.ConfigurationManager.fetchConfigFromServer.1.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "Failed get Configurations! {code: " + baseServerResponse.getCode() + ", message:" + baseServerResponse.getMessage() + '}';
                        }
                    }, 1, null);
                    return;
                }
                final Configuration data = baseServerResponse.getData();
                if (data == null) {
                    unit = null;
                } else {
                    LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.configuration.ConfigurationManager$fetchConfigFromServer$1$2$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "Configuration fetch success, new configuration is " + ((Object) JsonUtilKt.getGson().OooO0oo(data)) + '!';
                        }
                    }, 1, null);
                    ConfigurationManager.INSTANCE.updateConfig(data);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.configuration.ConfigurationManager$fetchConfigFromServer$1$3$1
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final String invoke() {
                            return "Configuration fetch success, but data is null!";
                        }
                    }, 1, null);
                }
            }
        }, 4, null);
    }

    private final Configuration loadLocalConfig(Context context) {
        final String string = context.getSharedPreferences(SP_NAME, 0).getString(KEY_CONFIG, "");
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.configuration.ConfigurationManager.loadLocalConfig.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return Intrinsics.stringPlus("Config json in sp is ", string);
            }
        }, 1, null);
        if (string == null || StringsKt.isBlank(string)) {
            return null;
        }
        try {
            return (Configuration) JsonUtilKt.getGson().OooO0OO(string, Configuration.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void notifyListeners() {
        Iterator<T> it = configChangeListeners.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConfig(Configuration configuration) {
        List<String> domains = configuration.getDomains();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(domains, 10));
        Iterator<T> it = domains.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.trimEnd((String) it.next(), '/'));
        }
        configuration.setDomains(CollectionsKt.toList(arrayList));
        if (Intrinsics.areEqual(config, configuration)) {
            return;
        }
        config = configuration;
        notifyListeners();
        WeakReference<Context> weakReference = appContextRef;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContextRef");
            weakReference = null;
        }
        Context context = weakReference.get();
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(SP_NAME, 0).edit();
        editorEdit.putString(KEY_CONFIG, JsonUtilKt.getGson().OooO0oo(configuration));
        editorEdit.apply();
    }

    public final void addOnConfigChangeListener(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        configChangeListeners.add(action);
    }

    @NotNull
    public final List<String> getDomainConfigData() {
        return config.getDomains();
    }

    @NotNull
    public final Configuration.LogConfig getLogConfigData() {
        return config.getLogConfig();
    }

    public final void init(@NotNull Context context, @NotNull o00OOOO0 okHttpClient) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        appContextRef = new WeakReference<>(context);
        configApi = new ConfigApi(okHttpClient, DomainConfig.INSTANCE.getDefaultDomains().get(0), new SysServerConvertor());
        Configuration configurationLoadLocalConfig = loadLocalConfig(context);
        if (configurationLoadLocalConfig != null) {
            config = configurationLoadLocalConfig;
            INSTANCE.notifyListeners();
        }
        fetchConfigFromServer(Sailfish.appId, Sailfish.uniqueId, config.getLogConfig().getVersion());
    }

    public final void reloadConfig() {
        fetchConfigFromServer(Sailfish.appId, Sailfish.uniqueId, config.getLogConfig().getVersion());
    }

    public final void removeOnConfigChangeListener(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        configChangeListeners.remove(action);
    }
}
