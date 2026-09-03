package com.yalla.yalla.open_auth;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OooO0O0;
import com.weieyu.yalla.R;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p060o0000o.oo000o;
import p254o00ooO0O.o000O0O0;
import p497o0o00Oo.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class InstagramOAuth {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f21641OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super String, Unit> f21642OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f21643OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f21644OooO0Oo;

    public InstagramOAuth(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.f21641OooO00o = fragmentActivity;
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        this.f21644OooO0Oo = oo000o.OooO00o("https://api.instagram.com/oauth/authorize?client_id=", OooOOO0.OooO0o().OooOO0O(), "&redirect_uri=", o000O0O0.OooO0OO(R.string.single_instagram_callback_url), "&scope=user_profile&response_type=code&");
        fragmentActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.open_auth.InstagramOAuth.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0O0.OooO0O0(this, owner);
                InstagramOAuth instagramOAuth = InstagramOAuth.this;
                instagramOAuth.f21642OooO0O0 = null;
                instagramOAuth.f21643OooO0OO = null;
                Objects.requireNonNull(instagramOAuth);
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
