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

/* JADX INFO: loaded from: classes.dex */
public final class o000OO implements HasDefaultViewModelProviderFactory, p094o000o0OO.o00Oo0, ViewModelStoreOwner {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Fragment f8501Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ViewModelStore f8502Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ViewModelProvider.Factory f8503Oooo0oo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public LifecycleRegistry f8500Oooo = null;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public p094o000o0OO.o00O0O f8504OoooO00 = null;

    public o000OO(@NonNull Fragment fragment, @NonNull ViewModelStore viewModelStore) {
        this.f8501Oooo0o = fragment;
        this.f8502Oooo0oO = viewModelStore;
    }

    public final void OooO00o(@NonNull Lifecycle.Event event) {
        this.f8500Oooo.handleLifecycleEvent(event);
    }

    public final void OooO0O0() {
        if (this.f8500Oooo == null) {
            this.f8500Oooo = new LifecycleRegistry(this);
            p094o000o0OO.o00O0O o00o0oOooO00o = p094o000o0OO.o00O0O.OooO00o(this);
            this.f8504OoooO00 = o00o0oOooO00o;
            o00o0oOooO00o.OooO0O0();
            SavedStateHandleSupport.enableSavedStateHandles(this);
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    @CallSuper
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f8501Oooo0o.requireContext().getApplicationContext();
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
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (this.f8501Oooo0o.getArguments() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, this.f8501Oooo0o.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.f8501Oooo0o.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f8501Oooo0o.mDefaultFactory)) {
            this.f8503Oooo0oo = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f8503Oooo0oo == null) {
            Application application = null;
            for (Context applicationContext = this.f8501Oooo0o.requireContext().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            this.f8503Oooo0oo = new SavedStateViewModelFactory(application, this, this.f8501Oooo0o.getArguments());
        }
        return this.f8503Oooo0oo;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NonNull
    public final Lifecycle getLifecycle() {
        OooO0O0();
        return this.f8500Oooo;
    }

    @Override // p094o000o0OO.o00Oo0
    @NonNull
    public final p094o000o0OO.o0OoOo0 getSavedStateRegistry() {
        OooO0O0();
        return this.f8504OoooO00.f29285OooO0O0;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NonNull
    public final ViewModelStore getViewModelStore() {
        OooO0O0();
        return this.f8502Oooo0oO;
    }
}
