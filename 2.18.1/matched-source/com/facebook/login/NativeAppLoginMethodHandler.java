package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.room.OooO0O0;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.bolts.AppLinks;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.LoginClient;
import com.facebook.login.NativeAppLoginMethodHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u001a\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J0\u0010\u001a\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0014J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0002J\"\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010&\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010'\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020\u0017H&J\u001a\u0010(\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00192\u0006\u0010#\u001a\u00020$H\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006)"}, d2 = {"Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "tokenSource", "Lcom/facebook/AccessTokenSource;", "getTokenSource", "()Lcom/facebook/AccessTokenSource;", "completeLogin", "", "outcome", "Lcom/facebook/login/LoginClient$Result;", "getError", "", AppLinks.KEY_NAME_EXTRAS, "Landroid/os/Bundle;", "getErrorMessage", "handleResultCancel", "request", "Lcom/facebook/login/LoginClient$Request;", "data", "Landroid/content/Intent;", "handleResultError", "error", "errorMessage", "errorCode", "handleResultOk", "isCallable", "", "intent", "onActivityResult", "requestCode", "", "resultCode", "processSuccessResponse", "tryAuthorize", "tryIntent", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@VisibleForTesting(otherwise = 3)
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {

    @NotNull
    private final AccessTokenSource tokenSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(@NotNull LoginClient loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.tokenSource = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }

    private final void completeLogin(LoginClient.Result outcome) {
        if (outcome != null) {
            getLoginClient().completeAndValidate(outcome);
        } else {
            getLoginClient().tryNextHandler();
        }
    }

    private final boolean isCallable(Intent intent) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        List<ResolveInfo> listQueryIntentActivities = FacebookSdk.getApplicationContext().getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
        return !listQueryIntentActivities.isEmpty();
    }

    private final void processSuccessResponse(final LoginClient.Request request, final Bundle extras) {
        if (extras.containsKey("code")) {
            Utility utility = Utility.INSTANCE;
            if (!Utility.isNullOrEmpty(extras.getString("code"))) {
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                final int i = 1;
                FacebookSdk.getExecutor().execute(new Runnable() { // from class: o000o00o.o00000O
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                OooO0O0 oooO0O0 = (OooO0O0) this;
                                SupportSQLiteQuery supportSQLiteQuery = (SupportSQLiteQuery) request;
                                o0000Ooo o0000ooo = (o0000Ooo) extras;
                                RoomDatabase.OooO0o oooO0o = oooO0O0.f9287Oooo0o;
                                supportSQLiteQuery.OooO0Oo();
                                List<Object> list = o0000ooo.f29192Oooo0o;
                                oooO0o.OooO00o();
                                break;
                            default:
                                NativeAppLoginMethodHandler.m233processSuccessResponse$lambda0((NativeAppLoginMethodHandler) this, (LoginClient.Request) request, (Bundle) extras);
                                break;
                        }
                    }
                });
                return;
            }
        }
        handleResultOk(request, extras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processSuccessResponse$lambda-0, reason: not valid java name */
    public static final void m233processSuccessResponse$lambda0(NativeAppLoginMethodHandler this$0, LoginClient.Request request, Bundle extras) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(extras, "$extras");
        try {
            this$0.handleResultOk(request, this$0.processCodeExchange(request, extras));
        } catch (FacebookServiceException e) {
            FacebookRequestError requestError = e.getRequestError();
            this$0.handleResultError(request, requestError.getErrorType(), requestError.getErrorMessage(), String.valueOf(requestError.getErrorCode()));
        } catch (FacebookException e2) {
            this$0.handleResultError(request, null, e2.getMessage(), null);
        }
    }

    @Nullable
    public String getError(@Nullable Bundle extras) {
        String string = extras == null ? null : extras.getString("error");
        if (string != null) {
            return string;
        }
        if (extras == null) {
            return null;
        }
        return extras.getString("error_type");
    }

    @Nullable
    public String getErrorMessage(@Nullable Bundle extras) {
        String string = extras == null ? null : extras.getString(AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE);
        if (string != null) {
            return string;
        }
        if (extras == null) {
            return null;
        }
        return extras.getString("error_description");
    }

    @NotNull
    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    public void handleResultCancel(@Nullable LoginClient.Request request, @NotNull Intent data) {
        Object obj;
        Intrinsics.checkNotNullParameter(data, "data");
        Bundle extras = data.getExtras();
        String error = getError(extras);
        String string = null;
        if (extras != null && (obj = extras.get(NativeProtocol.BRIDGE_ARG_ERROR_CODE)) != null) {
            string = obj.toString();
        }
        ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
        if (Intrinsics.areEqual(ServerProtocol.getErrorConnectionFailure(), string)) {
            completeLogin(LoginClient.Result.INSTANCE.createErrorResult(request, error, getErrorMessage(extras), string));
        } else {
            completeLogin(LoginClient.Result.INSTANCE.createCancelResult(request, error));
        }
    }

    public void handleResultError(@Nullable LoginClient.Request request, @Nullable String error, @Nullable String errorMessage, @Nullable String errorCode) {
        if (error != null && Intrinsics.areEqual(error, "logged_out")) {
            CustomTabLoginMethodHandler.Companion companion = CustomTabLoginMethodHandler.INSTANCE;
            CustomTabLoginMethodHandler.calledThroughLoggedOutAppSwitch = true;
            completeLogin(null);
            return;
        }
        ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
        if (CollectionsKt.contains(ServerProtocol.getErrorsProxyAuthDisabled(), error)) {
            completeLogin(null);
        } else if (CollectionsKt.contains(ServerProtocol.getErrorsUserCanceled(), error)) {
            completeLogin(LoginClient.Result.INSTANCE.createCancelResult(request, null));
        } else {
            completeLogin(LoginClient.Result.INSTANCE.createErrorResult(request, error, errorMessage, errorCode));
        }
    }

    public void handleResultOk(@NotNull LoginClient.Request request, @NotNull Bundle extras) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            LoginMethodHandler.Companion companion = LoginMethodHandler.INSTANCE;
            completeLogin(LoginClient.Result.INSTANCE.createCompositeTokenResult(request, companion.createAccessTokenFromWebBundle(request.getPermissions(), extras, getTokenSource(), request.getApplicationId()), companion.createAuthenticationTokenFromWebBundle(extras, request.getNonce())));
        } catch (FacebookException e) {
            completeLogin(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.INSTANCE, request, null, e.getMessage(), null, 8, null));
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        LoginClient.Request pendingRequest = getLoginClient().getPendingRequest();
        if (data == null) {
            completeLogin(LoginClient.Result.INSTANCE.createCancelResult(pendingRequest, "Operation canceled"));
        } else if (resultCode == 0) {
            handleResultCancel(pendingRequest, data);
        } else if (resultCode != -1) {
            completeLogin(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.INSTANCE, pendingRequest, "Unexpected resultCode from authorization.", null, null, 8, null));
        } else {
            Bundle extras = data.getExtras();
            if (extras == null) {
                completeLogin(LoginClient.Result.Companion.createErrorResult$default(LoginClient.Result.INSTANCE, pendingRequest, "Unexpected null from returned authorization data.", null, null, 8, null));
                return true;
            }
            String error = getError(extras);
            Object obj = extras.get(NativeProtocol.BRIDGE_ARG_ERROR_CODE);
            String string = obj == null ? null : obj.toString();
            String errorMessage = getErrorMessage(extras);
            String string2 = extras.getString("e2e");
            Utility utility = Utility.INSTANCE;
            if (!Utility.isNullOrEmpty(string2)) {
                logWebLoginCompleted(string2);
            }
            if (error == null && string == null && errorMessage == null && pendingRequest != null) {
                processSuccessResponse(pendingRequest, extras);
            } else {
                handleResultError(pendingRequest, error, errorMessage, string);
            }
        }
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public abstract int tryAuthorize(@NotNull LoginClient.Request request);

    public boolean tryIntent(@Nullable Intent intent, int requestCode) {
        androidx.activity.result.OooO0O0<Intent> launcher;
        if (intent == null || !isCallable(intent)) {
            return false;
        }
        Fragment fragment = getLoginClient().getFragment();
        Unit unit = null;
        LoginFragment loginFragment = fragment instanceof LoginFragment ? (LoginFragment) fragment : null;
        if (loginFragment != null && (launcher = loginFragment.getLauncher()) != null) {
            launcher.OooO0O0(intent);
            unit = Unit.INSTANCE;
        }
        return unit != null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(@NotNull Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.tokenSource = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }
}
