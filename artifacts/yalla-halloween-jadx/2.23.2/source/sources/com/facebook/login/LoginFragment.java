package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.annotation.LayoutRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 >2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b<\u0010=J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\rH\u0002J\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\b\u0010\u0014\u001a\u00020\u0006H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\"\u0010\"\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u000fH\u0016J\b\u0010%\u001a\u00020\u0006H\u0014J\b\u0010&\u001a\u00020\u0006H\u0014R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R(\u0010.\u001a\u0004\u0018\u00010\u00122\b\u0010-\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R4\u00103\u001a\n\u0012\u0004\u0012\u00020 \u0018\u0001022\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020 \u0018\u0001028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u001d8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006?"}, d2 = {"Lcom/facebook/login/LoginFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlin/Function1;", "Landroidx/activity/result/ActivityResult;", "", "getLoginMethodHandlerCallback", "Lcom/facebook/login/LoginClient$Result;", "outcome", "onLoginClientCompleted", "showSpinner", "hideSpinner", "Landroid/app/Activity;", "initializeCallingPackage", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/facebook/login/LoginClient;", "createLoginClient", "onDestroy", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onResume", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "outState", "onSaveInstanceState", "onSpinnerShown", "onSpinnerHidden", "", "callingPackage", "Ljava/lang/String;", "Lcom/facebook/login/LoginClient$Request;", "request", "Lcom/facebook/login/LoginClient$Request;", "<set-?>", LoginFragment.SAVED_LOGIN_CLIENT, "Lcom/facebook/login/LoginClient;", "getLoginClient", "()Lcom/facebook/login/LoginClient;", "Landroidx/activity/result/OooO0O0;", "launcher", "Landroidx/activity/result/OooO0O0;", "getLauncher", "()Landroidx/activity/result/OooO0O0;", "progressBar", "Landroid/view/View;", "getLayoutResId", "()I", "layoutResId", "<init>", "()V", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public class LoginFragment extends Fragment {

    @NotNull
    public static final String EXTRA_REQUEST = "request";

    @NotNull
    private static final String NULL_CALLING_PKG_ERROR_MSG = "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.";

    @NotNull
    public static final String REQUEST_KEY = "com.facebook.LoginFragment:Request";

    @NotNull
    public static final String RESULT_KEY = "com.facebook.LoginFragment:Result";

    @NotNull
    private static final String SAVED_LOGIN_CLIENT = "loginClient";

    @NotNull
    private static final String TAG = "LoginFragment";

    @Nullable
    private String callingPackage;

    @Nullable
    private androidx.activity.result.OooO0O0<Intent> launcher;

    @Nullable
    private LoginClient loginClient;
    private View progressBar;

    @Nullable
    private LoginClient.Request request;

    private final Function1<ActivityResult, Unit> getLoginMethodHandlerCallback(final FragmentActivity activity) {
        return new Function1<ActivityResult, Unit>() { // from class: com.facebook.login.LoginFragment.getLoginMethodHandlerCallback.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.f2198OooO0Oo != -1) {
                    activity.finish();
                    return;
                }
                LoginClient loginClient = LoginFragment.this.getLoginClient();
                if (loginClient == null) {
                    return;
                }
                loginClient.onActivityResult(LoginClient.INSTANCE.getLoginRequestCode(), result.f2198OooO0Oo, result.f2199OooO0o0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
                invoke2(activityResult);
                return Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideSpinner() {
        View view = this.progressBar;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            throw null;
        }
        view.setVisibility(8);
        onSpinnerHidden();
    }

    private final void initializeCallingPackage(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.callingPackage = callingActivity.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m4173onCreate$lambda0(LoginFragment this$0, LoginClient.Result outcome) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        this$0.onLoginClientCompleted(outcome);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final void m4174onCreate$lambda1(Function1 tmp0, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(activityResult);
    }

    private final void onLoginClientCompleted(LoginClient.Result outcome) {
        this.request = null;
        int i = outcome.code == LoginClient.Result.Code.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable(RESULT_KEY, outcome);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        FragmentActivity activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i, intent);
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSpinner() {
        View view = this.progressBar;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            throw null;
        }
        view.setVisibility(0);
        onSpinnerShown();
    }

    @NotNull
    public LoginClient createLoginClient() {
        return new LoginClient(this);
    }

    @Nullable
    public final androidx.activity.result.OooO0O0<Intent> getLauncher() {
        return this.launcher;
    }

    @LayoutRes
    public int getLayoutResId() {
        return com.facebook.common.R.layout.com_facebook_login_fragment;
    }

    @Nullable
    public final LoginClient getLoginClient() {
        return this.loginClient;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        LoginClient loginClient = this.loginClient;
        if (loginClient == null) {
            return;
        }
        loginClient.onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Bundle bundleExtra;
        super.onCreate(savedInstanceState);
        LoginClient loginClientCreateLoginClient = savedInstanceState == null ? null : (LoginClient) savedInstanceState.getParcelable(SAVED_LOGIN_CLIENT);
        if (loginClientCreateLoginClient != null) {
            loginClientCreateLoginClient.setFragment(this);
        } else {
            loginClientCreateLoginClient = createLoginClient();
        }
        this.loginClient = loginClientCreateLoginClient;
        if (loginClientCreateLoginClient != null) {
            loginClientCreateLoginClient.setOnCompletedListener(new LoginClient.OnCompletedListener() { // from class: com.facebook.login.OooOOOO
                @Override // com.facebook.login.LoginClient.OnCompletedListener
                public final void onCompleted(LoginClient.Result result) {
                    LoginFragment.m4173onCreate$lambda0(this.f13751OooO00o, result);
                }
            });
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        initializeCallingPackage(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra(REQUEST_KEY)) != null) {
            this.request = (LoginClient.Request) bundleExtra.getParcelable("request");
        }
        this.launcher = registerForActivityResult(new p011OooOo0.OooOOO(), new o0O0O00(getLoginMethodHandlerCallback(activity), 3));
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(getLayoutResId(), container, false);
        View viewFindViewById = viewInflate.findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.progressBar = viewFindViewById;
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            loginClient.setBackgroundProcessingListener(new LoginClient.BackgroundProcessingListener() { // from class: com.facebook.login.LoginFragment.onCreateView.1
                @Override // com.facebook.login.LoginClient.BackgroundProcessingListener
                public void onBackgroundProcessingStarted() {
                    LoginFragment.this.showSpinner();
                }

                @Override // com.facebook.login.LoginClient.BackgroundProcessingListener
                public void onBackgroundProcessingStopped() {
                    LoginFragment.this.hideSpinner();
                }
            });
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            loginClient.cancelCurrentHandler();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        View viewFindViewById = view == null ? null : view.findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.callingPackage != null) {
            LoginClient loginClient = this.loginClient;
            if (loginClient == null) {
                return;
            }
            loginClient.startOrContinueAuth(this.request);
            return;
        }
        Log.e(TAG, NULL_CALLING_PKG_ERROR_MSG);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable(SAVED_LOGIN_CLIENT, this.loginClient);
    }

    public void onSpinnerHidden() {
    }

    public void onSpinnerShown() {
    }
}
