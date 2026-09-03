package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.activity.result.ActivityResultRegistry;
import com.facebook.CallbackManager;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.InternalAppEventsLogger;
import com.umeng.analytics.pro.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u00016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\"\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J$\u0010#\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\u001a\u0010'\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010)H\u0007J \u0010*\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001a\u0010-\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010)H\u0007J$\u0010/\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\"\u00100\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J*\u00101\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0007¨\u00067"}, d2 = {"Lcom/facebook/internal/DialogPresenter;", "", "()V", "canPresentNativeDialogWithFeature", "", "feature", "Lcom/facebook/internal/DialogFeature;", "canPresentWebFallbackDialogWithFeature", "getDialogWebFallbackUri", "Landroid/net/Uri;", "getProtocolVersionForNativeDialog", "Lcom/facebook/internal/NativeProtocol$ProtocolVersionQueryResult;", "getVersionSpecForFeature", "", "applicationId", "", "actionName", "logDialogActivity", "", d.R, "Landroid/content/Context;", "eventName", "outcome", "present", "appCall", "Lcom/facebook/internal/AppCall;", "activity", "Landroid/app/Activity;", "registry", "Landroidx/activity/result/ActivityResultRegistry;", "callbackManager", "Lcom/facebook/CallbackManager;", "fragmentWrapper", "Lcom/facebook/internal/FragmentWrapper;", "setupAppCallForCannotShowError", "setupAppCallForCustomTabDialog", NativeProtocol.WEB_DIALOG_ACTION, "parameters", "Landroid/os/Bundle;", "setupAppCallForErrorResult", "exception", "Lcom/facebook/FacebookException;", "setupAppCallForNativeDialog", "parameterProvider", "Lcom/facebook/internal/DialogPresenter$ParameterProvider;", "setupAppCallForValidationError", "validationError", "setupAppCallForWebDialog", "setupAppCallForWebFallbackDialog", "startActivityForResultWithAndroidX", "intent", "Landroid/content/Intent;", "requestCode", "", "ParameterProvider", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DialogPresenter {

    @NotNull
    public static final DialogPresenter INSTANCE = new DialogPresenter();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/facebook/internal/DialogPresenter$ParameterProvider;", "", "legacyParameters", "Landroid/os/Bundle;", "getLegacyParameters", "()Landroid/os/Bundle;", "parameters", "getParameters", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface ParameterProvider {
        @Nullable
        Bundle getLegacyParameters();

        @Nullable
        Bundle getParameters();
    }

    private DialogPresenter() {
    }

    @JvmStatic
    public static final boolean canPresentNativeDialogWithFeature(@NotNull DialogFeature feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return getProtocolVersionForNativeDialog(feature).getProtocolVersion() != -1;
    }

    @JvmStatic
    public static final boolean canPresentWebFallbackDialogWithFeature(@NotNull DialogFeature feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return INSTANCE.getDialogWebFallbackUri(feature) != null;
    }

    private final Uri getDialogWebFallbackUri(DialogFeature feature) {
        String strName = feature.name();
        String action = feature.getAction();
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        FetchedAppSettings.DialogFeatureConfig dialogFeatureConfig = FetchedAppSettings.INSTANCE.getDialogFeatureConfig(FacebookSdk.getApplicationId(), action, strName);
        if (dialogFeatureConfig != null) {
            return dialogFeatureConfig.getFallbackUrl();
        }
        return null;
    }

    @JvmStatic
    @NotNull
    public static final NativeProtocol.ProtocolVersionQueryResult getProtocolVersionForNativeDialog(@NotNull DialogFeature feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        String action = feature.getAction();
        int[] versionSpecForFeature = INSTANCE.getVersionSpecForFeature(applicationId, action, feature);
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        return NativeProtocol.getLatestAvailableProtocolVersionForAction(action, versionSpecForFeature);
    }

    private final int[] getVersionSpecForFeature(String applicationId, String actionName, DialogFeature feature) {
        FetchedAppSettings.DialogFeatureConfig dialogFeatureConfig = FetchedAppSettings.INSTANCE.getDialogFeatureConfig(applicationId, actionName, feature.name());
        int[] versionSpec = dialogFeatureConfig == null ? null : dialogFeatureConfig.getVersionSpec();
        return versionSpec == null ? new int[]{feature.getMinVersion()} : versionSpec;
    }

    @JvmStatic
    public static final void logDialogActivity(@NotNull Context context, @NotNull String eventName, @NotNull String outcome) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
        Bundle bundle = new Bundle();
        bundle.putString(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME, outcome);
        internalAppEventsLogger.logEventImplicitly(eventName, bundle);
    }

    @JvmStatic
    public static final void present(@NotNull AppCall appCall, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivityForResult(appCall.getRequestIntent(), appCall.getRequestCode());
        appCall.setPending();
    }

    @JvmStatic
    public static final void setupAppCallForCannotShowError(@NotNull AppCall appCall) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        setupAppCallForValidationError(appCall, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    @JvmStatic
    public static final void setupAppCallForCustomTabDialog(@NotNull AppCall appCall, @Nullable String action, @Nullable Bundle parameters) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Validate validate = Validate.INSTANCE;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        CustomTabUtils customTabUtils = CustomTabUtils.INSTANCE;
        Validate.hasCustomTabRedirectActivity(applicationContext, CustomTabUtils.getDefaultRedirectURI());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.EXTRA_ACTION, action);
        intent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, parameters);
        intent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, CustomTabUtils.getChromePackage());
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), action, NativeProtocol.getLatestKnownVersion(), null);
        appCall.setRequestIntent(intent);
    }

    @JvmStatic
    public static final void setupAppCallForErrorResult(@NotNull AppCall appCall, @Nullable FacebookException exception) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        if (exception == null) {
            return;
        }
        Validate validate = Validate.INSTANCE;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(FacebookActivity.PASS_THROUGH_CANCEL_ACTION);
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), null, NativeProtocol.getLatestKnownVersion(), NativeProtocol.createBundleForException(exception));
        appCall.setRequestIntent(intent);
    }

    @JvmStatic
    public static final void setupAppCallForNativeDialog(@NotNull AppCall appCall, @NotNull ParameterProvider parameterProvider, @NotNull DialogFeature feature) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(parameterProvider, "parameterProvider");
        Intrinsics.checkNotNullParameter(feature, "feature");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        String action = feature.getAction();
        NativeProtocol.ProtocolVersionQueryResult protocolVersionForNativeDialog = getProtocolVersionForNativeDialog(feature);
        int protocolVersion = protocolVersionForNativeDialog.getProtocolVersion();
        if (protocolVersion == -1) {
            throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        Bundle parameters = NativeProtocol.isVersionCompatibleWithBucketedIntent(protocolVersion) ? parameterProvider.getParameters() : parameterProvider.getLegacyParameters();
        if (parameters == null) {
            parameters = new Bundle();
        }
        Intent intentCreatePlatformActivityIntent = NativeProtocol.createPlatformActivityIntent(applicationContext, appCall.getCallId().toString(), action, protocolVersionForNativeDialog, parameters);
        if (intentCreatePlatformActivityIntent == null) {
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        appCall.setRequestIntent(intentCreatePlatformActivityIntent);
    }

    @JvmStatic
    public static final void setupAppCallForValidationError(@NotNull AppCall appCall, @Nullable FacebookException validationError) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        setupAppCallForErrorResult(appCall, validationError);
    }

    @JvmStatic
    public static final void setupAppCallForWebDialog(@NotNull AppCall appCall, @Nullable String actionName, @Nullable Bundle parameters) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Validate validate = Validate.INSTANCE;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        Bundle bundle = new Bundle();
        bundle.putString(NativeProtocol.WEB_DIALOG_ACTION, actionName);
        bundle.putBundle(NativeProtocol.WEB_DIALOG_PARAMS, parameters);
        Intent intent = new Intent();
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), actionName, NativeProtocol.getLatestKnownVersion(), bundle);
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(FacebookDialogFragment.TAG);
        appCall.setRequestIntent(intent);
    }

    @JvmStatic
    public static final void setupAppCallForWebFallbackDialog(@NotNull AppCall appCall, @Nullable Bundle parameters, @NotNull DialogFeature feature) {
        Uri uriBuildUri;
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(feature, "feature");
        Validate validate = Validate.INSTANCE;
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
        Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
        String strName = feature.name();
        Uri dialogWebFallbackUri = INSTANCE.getDialogWebFallbackUri(feature);
        if (dialogWebFallbackUri == null) {
            throw new FacebookException("Unable to fetch the Url for the DialogFeature : '" + strName + '\'');
        }
        NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
        int latestKnownVersion = NativeProtocol.getLatestKnownVersion();
        ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
        String string = appCall.getCallId().toString();
        Intrinsics.checkNotNullExpressionValue(string, "appCall.callId.toString()");
        Bundle queryParamsForPlatformActivityIntentWebFallback = ServerProtocol.getQueryParamsForPlatformActivityIntentWebFallback(string, latestKnownVersion, parameters);
        if (queryParamsForPlatformActivityIntentWebFallback == null) {
            throw new FacebookException("Unable to fetch the app's key-hash");
        }
        if (dialogWebFallbackUri.isRelative()) {
            Utility utility = Utility.INSTANCE;
            uriBuildUri = Utility.buildUri(ServerProtocol.getDialogAuthority(), dialogWebFallbackUri.toString(), queryParamsForPlatformActivityIntentWebFallback);
        } else {
            Utility utility2 = Utility.INSTANCE;
            uriBuildUri = Utility.buildUri(dialogWebFallbackUri.getAuthority(), dialogWebFallbackUri.getPath(), queryParamsForPlatformActivityIntentWebFallback);
        }
        Bundle bundle = new Bundle();
        bundle.putString("url", uriBuildUri.toString());
        bundle.putBoolean(NativeProtocol.WEB_DIALOG_IS_FALLBACK, true);
        Intent intent = new Intent();
        NativeProtocol.setupProtocolRequestIntent(intent, appCall.getCallId().toString(), feature.getAction(), NativeProtocol.getLatestKnownVersion(), bundle);
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(FacebookDialogFragment.TAG);
        appCall.setRequestIntent(intent);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.activity.result.OooO0O0] */
    @JvmStatic
    public static final void startActivityForResultWithAndroidX(@NotNull ActivityResultRegistry registry, @Nullable final CallbackManager callbackManager, @NotNull Intent intent, final int requestCode) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(intent, "intent");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? OooO0Oo2 = registry.OooO0Oo(Intrinsics.stringPlus("facebook-dialog-request-", Integer.valueOf(requestCode)), new p011OooOOoo.OooO<Intent, Pair<Integer, Intent>>() { // from class: com.facebook.internal.DialogPresenter.startActivityForResultWithAndroidX.1
            @Override // p011OooOOoo.OooO
            @NotNull
            public Intent createIntent(@NotNull Context context, @NotNull Intent input) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                return input;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p011OooOOoo.OooO
            @NotNull
            public Pair<Integer, Intent> parseResult(int resultCode, @Nullable Intent intent2) {
                Pair<Integer, Intent> pairCreate = Pair.create(Integer.valueOf(resultCode), intent2);
                Intrinsics.checkNotNullExpressionValue(pairCreate, "create(resultCode, intent)");
                return pairCreate;
            }
        }, new androidx.activity.result.OooO00o() { // from class: com.facebook.internal.OooO00o
            @Override // androidx.activity.result.OooO00o
            public final void onActivityResult(Object obj) {
                DialogPresenter.m175startActivityForResultWithAndroidX$lambda2(callbackManager, requestCode, objectRef, (Pair) obj);
            }
        });
        objectRef.element = OooO0Oo2;
        OooO0Oo2.OooO0O0(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: startActivityForResultWithAndroidX$lambda-2, reason: not valid java name */
    public static final void m175startActivityForResultWithAndroidX$lambda2(CallbackManager callbackManager, int i, Ref.ObjectRef launcher, Pair pair) {
        Intrinsics.checkNotNullParameter(launcher, "$launcher");
        if (callbackManager == null) {
            callbackManager = new CallbackManagerImpl();
        }
        Object obj = pair.first;
        Intrinsics.checkNotNullExpressionValue(obj, "result.first");
        callbackManager.onActivityResult(i, ((Number) obj).intValue(), (Intent) pair.second);
        androidx.activity.result.OooO0O0 oooO0O0 = (androidx.activity.result.OooO0O0) launcher.element;
        if (oooO0O0 == null) {
            return;
        }
        synchronized (oooO0O0) {
            oooO0O0.OooO0OO();
            launcher.element = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void present(@NotNull AppCall appCall, @NotNull FragmentWrapper fragmentWrapper) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        fragmentWrapper.startActivityForResult(appCall.getRequestIntent(), appCall.getRequestCode());
        appCall.setPending();
    }

    @JvmStatic
    public static final void present(@NotNull AppCall appCall, @NotNull ActivityResultRegistry registry, @Nullable CallbackManager callbackManager) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intent requestIntent = appCall.getRequestIntent();
        if (requestIntent == null) {
            return;
        }
        startActivityForResultWithAndroidX(registry, callbackManager, requestIntent, appCall.getRequestCode());
        appCall.setPending();
    }
}
