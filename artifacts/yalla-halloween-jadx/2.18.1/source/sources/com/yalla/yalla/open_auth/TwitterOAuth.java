package com.yalla.yalla.open_auth;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OooO0O0;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;
import com.weieyu.yalla.R;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p433o0OoOO0o.o0;
import p433o0OoOO0o.o0O00O;
import p433o0OoOO0o.o0O00oO0;
import p433o0OoOO0o.o0O0O0Oo;
import p433o0OoOO0o.o0O0o;
import p433o0OoOO0o.o0O0oo0o;
import p433o0OoOO0o.o0oO0Ooo;
import p487o0o000oO.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class TwitterOAuth {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final TwitterLoginButton f21656OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super String, Unit> f21657OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f21658OooO0OO;

    public static final class OooO00o extends o0O0o<o0O0O0Oo> {
        public OooO00o() {
        }

        @Override // p433o0OoOO0o.o0O0o
        public final void OooO0OO(@NotNull TwitterException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            Function0<Unit> function0 = TwitterOAuth.this.f21658OooO0OO;
            if (function0 != null) {
                function0.invoke();
            }
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [o0OoOO0o.o0O000O, o0OoOO0o.o0O00OOO<o0OoOO0o.o0O0O0Oo>] */
        @Override // p433o0OoOO0o.o0O0o
        public final void OooO0Oo(@NotNull o0O00O<o0O0O0Oo> result) {
            Intrinsics.checkNotNullParameter(result, "result");
            o0O0O0Oo o0o0o0oo = result.f39934OooO00o;
            if ((o0o0o0oo != null ? o0o0o0oo.OooO00o() : null) != null) {
                Function2<? super String, ? super String, Unit> function2 = TwitterOAuth.this.f21657OooO0O0;
                if (function2 != null) {
                    String str = result.f39934OooO00o.OooO00o().f19940Oooo0oO;
                    Intrinsics.checkNotNullExpressionValue(str, "result.data.authToken.token");
                    String str2 = result.f39934OooO00o.OooO00o().f19941Oooo0oo;
                    Intrinsics.checkNotNullExpressionValue(str2, "result.data.authToken.secret");
                    function2.invoke(str, str2);
                }
            } else {
                Function0<Unit> function0 = TwitterOAuth.this.f21658OooO0OO;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            o0O0oo0o.OooO0OO().f39949OooO00o.OooO00o();
        }
    }

    public TwitterOAuth(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        TwitterAuthConfig twitterAuthConfig = new TwitterAuthConfig(o000O0O0.OooO0OO(R.string.single_twitter_key), o000O0O0.OooO0OO(R.string.single_twitter_secret));
        if (fragmentActivity == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        o0oO0Ooo.OooO0Oo(new o0O00oO0(fragmentActivity.getApplicationContext(), new o0(2), twitterAuthConfig, Boolean.valueOf(!o0OOO0o.OooO0OO())));
        TwitterLoginButton twitterLoginButton = new TwitterLoginButton(fragmentActivity);
        this.f21656OooO00o = twitterLoginButton;
        twitterLoginButton.setCallback(new OooO00o());
        fragmentActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.open_auth.TwitterOAuth.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0O0.OooO0O0(this, owner);
                TwitterOAuth twitterOAuth = TwitterOAuth.this;
                twitterOAuth.f21657OooO0O0 = null;
                Objects.requireNonNull(twitterOAuth);
                TwitterOAuth.this.f21658OooO0OO = null;
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
