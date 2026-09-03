package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000 implements HasDefaultViewModelProviderFactory, o000OO00.OooO0o, ViewModelStoreOwner {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Fragment f6003OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Runnable f6004OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ViewModelStore f6005OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ViewModelProvider.Factory f6006OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public LifecycleRegistry f6007OooO0oo = null;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o000OO00.OooO0OO f6002OooO = null;

    public o000O000(@NonNull Fragment fragment, @NonNull ViewModelStore viewModelStore, @NonNull Oooo000 oooo000) {
        this.f6003OooO0Oo = fragment;
        this.f6005OooO0o0 = viewModelStore;
        this.f6004OooO0o = oooo000;
    }

    public final void OooO00o(@NonNull Lifecycle.Event event) {
        this.f6007OooO0oo.handleLifecycleEvent(event);
    }

    public final void OooO0O0() {
        if (this.f6007OooO0oo == null) {
            this.f6007OooO0oo = new LifecycleRegistry(this);
            Intrinsics.checkNotNullParameter(this, "owner");
            o000OO00.OooO0OO oooO0OO = new o000OO00.OooO0OO(this);
            this.f6002OooO = oooO0OO;
            oooO0OO.OooO00o();
            this.f6004OooO0o.run();
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    @CallSuper
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f6003OooO0Oo;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, fragment);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (fragment.getArguments() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, fragment.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f6003OooO0Oo;
        ViewModelProvider.Factory defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f6006OooO0oO = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f6006OooO0oO == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f6006OooO0oO = new SavedStateViewModelFactory(application, fragment, fragment.getArguments());
        }
        return this.f6006OooO0oO;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NonNull
    public final Lifecycle getLifecycle() {
        OooO0O0();
        return this.f6007OooO0oo;
    }

    @Override // o000OO00.OooO0o
    @NonNull
    public final androidx.savedstate.OooO00o getSavedStateRegistry() {
        OooO0O0();
        return this.f6002OooO.f34874OooO0O0;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NonNull
    public final ViewModelStore getViewModelStore() {
        OooO0O0();
        return this.f6005OooO0o0;
    }
}
