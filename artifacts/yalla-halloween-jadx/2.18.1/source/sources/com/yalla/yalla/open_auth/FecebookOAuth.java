package com.yalla.yalla.open_auth;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OooO0O0;
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
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class FecebookOAuth {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f21634OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CallbackManager f21635OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f21636OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f21637OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f21638OooO0o0;

    public static final class OooO00o implements FacebookCallback<LoginResult> {
        public OooO00o() {
        }

        @Override // com.facebook.FacebookCallback
        public final void onCancel() {
            Function0<Unit> function0 = FecebookOAuth.this.f21637OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // com.facebook.FacebookCallback
        public final void onError(@NotNull FacebookException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            o00O00.OooO0o("FecebookOAuth", "FecebookOAuthError", error);
            Function0<Unit> function0 = FecebookOAuth.this.f21638OooO0o0;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // com.facebook.FacebookCallback
        public final void onSuccess(LoginResult loginResult) {
            LoginResult loginResult2 = loginResult;
            Intrinsics.checkNotNullParameter(loginResult2, "loginResult");
            String token = loginResult2.getAccessToken().getToken();
            Function1<? super String, Unit> function1 = FecebookOAuth.this.f21636OooO0OO;
            if (function1 != null) {
                function1.invoke(token);
            }
        }
    }

    public FecebookOAuth(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.f21634OooO00o = fragmentActivity;
        CallbackManager callbackManagerCreate = CallbackManager.Factory.create();
        this.f21635OooO0O0 = callbackManagerCreate;
        LoginManager.Companion companion = LoginManager.INSTANCE;
        companion.getInstance().setLoginBehavior(LoginBehavior.NATIVE_WITH_FALLBACK);
        companion.getInstance().registerCallback(callbackManagerCreate, new OooO00o());
        fragmentActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.open_auth.FecebookOAuth.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                LoginManager companion2;
                FecebookOAuth fecebookOAuth;
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0O0.OooO0O0(this, owner);
                FecebookOAuth fecebookOAuth2 = FecebookOAuth.this;
                fecebookOAuth2.f21636OooO0OO = null;
                fecebookOAuth2.f21637OooO0Oo = null;
                fecebookOAuth2.f21638OooO0o0 = null;
                try {
                    try {
                        LoginManager.Companion companion3 = LoginManager.INSTANCE;
                        companion3.getInstance().logOut();
                        companion2 = companion3.getInstance();
                        fecebookOAuth = FecebookOAuth.this;
                    } catch (Exception e) {
                        o00O00.OooO0o("OAuthManager", "Facebook Logout Error", e);
                        companion2 = LoginManager.INSTANCE.getInstance();
                        fecebookOAuth = FecebookOAuth.this;
                    }
                    companion2.unregisterCallback(fecebookOAuth.f21635OooO0O0);
                } catch (Throwable th) {
                    LoginManager.INSTANCE.getInstance().unregisterCallback(FecebookOAuth.this.f21635OooO0O0);
                    throw th;
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO0Oo(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO0o(this, lifecycleOwner);
            }
        });
    }
}
