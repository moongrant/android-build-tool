package com.yalla.yalla.open_auth;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o0000;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;
import com.twitter.sdk.android.core.o000oOoO;
import com.twitter.sdk.android.core.o00Oo0;
import com.twitter.sdk.android.core.o0OOO0o;
import com.twitter.sdk.android.core.o0Oo0oo;
import com.twitter.sdk.android.core.oo000o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p382o0OOoo0o.o00Ooo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class TwitterOAuth {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final TwitterLoginButton f24738OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super String, Unit> f24739OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f24740OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f24741OooO0Oo;

    public static final class OooO00o extends com.twitter.sdk.android.core.OooO0O0<o0Oo0oo> {
        public OooO00o() {
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0OO(@NotNull TwitterException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            Function0<Unit> function0 = TwitterOAuth.this.f24741OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0Oo(@NotNull o000oOoO<o0Oo0oo> result) {
            Intrinsics.checkNotNullParameter(result, "result");
            o0Oo0oo o0oo0oo2 = result.f22205OooO00o;
            o0Oo0oo o0oo0oo3 = o0oo0oo2;
            TwitterAuthToken twitterAuthTokenOooO00o = o0oo0oo3 != null ? o0oo0oo3.OooO00o() : null;
            TwitterOAuth twitterOAuth = TwitterOAuth.this;
            if (twitterAuthTokenOooO00o != null) {
                Function2<? super String, ? super String, Unit> function2 = twitterOAuth.f24739OooO0O0;
                if (function2 != null) {
                    o0Oo0oo o0oo0oo4 = o0oo0oo2;
                    String str = o0oo0oo4.OooO00o().f21979OooO0o0;
                    Intrinsics.checkNotNullExpressionValue(str, "result.data.authToken.token");
                    String str2 = o0oo0oo4.OooO00o().f21978OooO0o;
                    Intrinsics.checkNotNullExpressionValue(str2, "result.data.authToken.secret");
                    function2.invoke(str, str2);
                }
            } else {
                Function0<Unit> function0 = twitterOAuth.f24740OooO0OO;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            o0OOO0o.OooO0OO().f22220OooO00o.OooO00o();
        }
    }

    public TwitterOAuth(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        TwitterAuthConfig twitterAuthConfig = new TwitterAuthConfig(o0000.OooO0OO(oO00OOo0.single_twitter_key), o0000.OooO0OO(oO00OOo0.single_twitter_secret));
        if (fragmentActivity == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        oo000o oo000oVar = new oo000o(fragmentActivity.getApplicationContext(), new com.twitter.sdk.android.core.OooO0OO(0), twitterAuthConfig, Boolean.valueOf(!o00Ooo.OooO0o0()));
        synchronized (o00Oo0.class) {
            if (o00Oo0.f22208OooO0oo == null) {
                o00Oo0.f22208OooO0oo = new o00Oo0(oo000oVar);
            }
        }
        TwitterLoginButton twitterLoginButton = new TwitterLoginButton(fragmentActivity);
        this.f24738OooO00o = twitterLoginButton;
        twitterLoginButton.setCallback(new OooO00o());
        fragmentActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.open_auth.TwitterOAuth.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO00o.OooO0O0(this, owner);
                TwitterOAuth twitterOAuth = TwitterOAuth.this;
                twitterOAuth.f24739OooO0O0 = null;
                twitterOAuth.f24740OooO0OO = null;
                twitterOAuth.f24741OooO0Oo = null;
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
