package com.yalla.yalla.open_auth;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class FecebookOAuth {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f24712OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CallbackManager f24713OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f24714OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f24715OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f24716OooO0o0;

    public static final class OooO00o implements FacebookCallback<LoginResult> {
        public OooO00o() {
        }

        @Override // com.facebook.FacebookCallback
        public final void onCancel() {
            Function0<Unit> function0 = FecebookOAuth.this.f24715OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // com.facebook.FacebookCallback
        public final void onError(@NotNull FacebookException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            OooOOO0.OooO0o0("FecebookOAuth", "FecebookOAuthError", error);
            Function0<Unit> function0 = FecebookOAuth.this.f24716OooO0o0;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // com.facebook.FacebookCallback
        public final void onSuccess(LoginResult loginResult) {
            LoginResult loginResult2 = loginResult;
            Intrinsics.checkNotNullParameter(loginResult2, "loginResult");
            String token = loginResult2.getAccessToken().getToken();
            Function1<? super String, Unit> function1 = FecebookOAuth.this.f24714OooO0OO;
            if (function1 != null) {
                function1.invoke(token);
            }
        }
    }

    public FecebookOAuth(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.f24712OooO00o = fragmentActivity;
        CallbackManager callbackManagerCreate = CallbackManager.Factory.create();
        this.f24713OooO0O0 = callbackManagerCreate;
        LoginManager.Companion companion = LoginManager.INSTANCE;
        companion.getInstance().setLoginBehavior(LoginBehavior.NATIVE_WITH_FALLBACK);
        companion.getInstance().registerCallback(callbackManagerCreate, new OooO00o());
        fragmentActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.open_auth.FecebookOAuth.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO00o(this, lifecycleOwner);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [com.yalla.yalla.open_auth.FecebookOAuth] */
            /* JADX WARN: Type inference failed for: r4v4, types: [com.facebook.CallbackManager] */
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                LoginManager companion2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO00o.OooO0O0(this, owner);
                FecebookOAuth fecebookOAuth = FecebookOAuth.this;
                fecebookOAuth.f24714OooO0OO = null;
                fecebookOAuth.f24715OooO0Oo = null;
                fecebookOAuth.f24716OooO0o0 = null;
                try {
                    try {
                        LoginManager.Companion companion3 = LoginManager.INSTANCE;
                        companion3.getInstance().logOut();
                        companion2 = companion3.getInstance();
                    } catch (Exception e) {
                        OooOOO0.OooO0o0("OAuthManager", "Facebook Logout Error", e);
                        companion2 = LoginManager.INSTANCE.getInstance();
                    }
                    fecebookOAuth = fecebookOAuth.f24713OooO0O0;
                    companion2.unregisterCallback(fecebookOAuth);
                } catch (Throwable th) {
                    LoginManager.INSTANCE.getInstance().unregisterCallback(fecebookOAuth.f24713OooO0O0);
                    throw th;
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0Oo(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0o(this, lifecycleOwner);
            }
        });
    }
}
