package com.yalla.yalla.open_auth;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o0000;
import com.twitter.sdk.android.core.Oooo0;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;
import com.twitter.sdk.android.core.o00O0O;
import com.twitter.sdk.android.core.o00Ooo;
import com.twitter.sdk.android.core.o0OOO0o;
import com.twitter.sdk.android.core.o0ooOOo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p386o0OOooO.oo0o0Oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class TwitterOAuth {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final TwitterLoginButton f24275OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super String, Unit> f24276OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f24277OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f24278OooO0Oo;

    public static final class OooO00o extends com.twitter.sdk.android.core.OooO0O0<o0OOO0o> {
        public OooO00o() {
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0OO(@NotNull TwitterException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            Function0<Unit> function0 = TwitterOAuth.this.f24278OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0Oo(@NotNull Oooo0<o0OOO0o> result) {
            Intrinsics.checkNotNullParameter(result, "result");
            o0OOO0o o0ooo0o2 = result.f21502OooO00o;
            o0OOO0o o0ooo0o3 = o0ooo0o2;
            TwitterAuthToken twitterAuthTokenOooO00o = o0ooo0o3 != null ? o0ooo0o3.OooO00o() : null;
            TwitterOAuth twitterOAuth = TwitterOAuth.this;
            if (twitterAuthTokenOooO00o != null) {
                Function2<? super String, ? super String, Unit> function2 = twitterOAuth.f24276OooO0O0;
                if (function2 != null) {
                    o0OOO0o o0ooo0o4 = o0ooo0o2;
                    String token = o0ooo0o4.OooO00o().f21508OooO0o0;
                    Intrinsics.checkNotNullExpressionValue(token, "token");
                    String secret = o0ooo0o4.OooO00o().f21507OooO0o;
                    Intrinsics.checkNotNullExpressionValue(secret, "secret");
                    function2.invoke(token, secret);
                }
            } else {
                Function0<Unit> function0 = twitterOAuth.f24277OooO0OO;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            o0ooOOo.OooO0OO().f21753OooO00o.OooO00o();
        }
    }

    public TwitterOAuth(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        TwitterAuthConfig twitterAuthConfig = new TwitterAuthConfig(o0000.OooO0OO(o000000.single_twitter_key), o0000.OooO0OO(o000000.single_twitter_secret));
        if (fragmentActivity == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        o00Ooo o00ooo2 = new o00Ooo(fragmentActivity.getApplicationContext(), new com.twitter.sdk.android.core.OooO0OO(0), twitterAuthConfig, Boolean.valueOf(!oo0o0Oo.OooO0o0()));
        synchronized (o00O0O.class) {
            if (o00O0O.f21737OooO0oo == null) {
                o00O0O.f21737OooO0oo = new o00O0O(o00ooo2);
            }
        }
        TwitterLoginButton twitterLoginButton = new TwitterLoginButton(fragmentActivity);
        this.f24275OooO00o = twitterLoginButton;
        twitterLoginButton.setCallback(new OooO00o());
        fragmentActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.open_auth.TwitterOAuth.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO0OO.OooO0O0(this, owner);
                TwitterOAuth twitterOAuth = TwitterOAuth.this;
                twitterOAuth.f24276OooO0O0 = null;
                twitterOAuth.f24277OooO0OO = null;
                twitterOAuth.f24278OooO0Oo = null;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0Oo(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0o(this, lifecycleOwner);
            }
        });
    }
}
