package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import p070o0000ooO.o0000;
import p070o0000ooO.o0000O0;
import p070o0000ooO.o0000O00;
import p070o0000ooO.oo0o0Oo;
import p094o000o0OO.o00O0O;
import p094o000o0OO.o00Oo0;
import p094o000o0OO.o00Ooo;
import p094o000o0OO.o0OoOo0;
import p099o000o0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ViewModelStoreOwner, HasDefaultViewModelProviderFactory, o00Oo0, OooOOOO, androidx.activity.result.OooO0OO, o000O000.OooO0O0, o000O000.OooO0OO, o0000, o0000O00, o000O0O0.OooOO0O {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;

    @LayoutRes
    private int mContentLayoutId;
    public final p009OooOOo.OooOo00 mContextAwareHelper;
    private ViewModelProvider.Factory mDefaultFactory;
    private final LifecycleRegistry mLifecycleRegistry;
    private final o000O0O0.OooOOOO mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<o000OO0O.OooO00o<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<o000OO0O.OooO00o<oo0o0Oo>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<o000OO0O.OooO00o<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<o000OO0O.OooO00o<o0000O0>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<o000OO0O.OooO00o<Integer>> mOnTrimMemoryListeners;
    public final o00O0O mSavedStateRegistryController;
    private ViewModelStore mViewModelStore;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    public class OooO0O0 extends ActivityResultRegistry {
        public OooO0O0() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public final void OooO0OO(int i, @NonNull p011OooOOoo.OooO oooO, Object obj) {
            ComponentActivity componentActivity = ComponentActivity.this;
            OooOOoo.OooO.OooO00o<O> synchronousResult = oooO.getSynchronousResult(componentActivity, obj);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new OooO(this, i, synchronousResult));
                return;
            }
            Intent intentCreateIntent = oooO.createIntent(componentActivity, obj);
            Bundle bundleExtra = null;
            if (intentCreateIntent.getExtras() != null && intentCreateIntent.getExtras().getClassLoader() == null) {
                intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle = bundleExtra;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                p070o0000ooO.o00Oo0.OooO0Oo(componentActivity, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentCreateIntent.getAction())) {
                int i2 = p070o0000ooO.o00Oo0.f28002OooO0OO;
                o0000ooO.o00Oo0.OooO0O0.OooO0O0(componentActivity, intentCreateIntent, i, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = intentSenderRequest.f4358Oooo0o;
                Intent intent = intentSenderRequest.f4359Oooo0oO;
                int i3 = intentSenderRequest.f4360Oooo0oo;
                int i4 = intentSenderRequest.f4357Oooo;
                int i5 = p070o0000ooO.o00Oo0.f28002OooO0OO;
                o0000ooO.o00Oo0.OooO0O0.OooO0OO(componentActivity, intentSender, i, intent, i3, i4, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new OooOO0(this, i, e));
            }
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Object f4300OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ViewModelStore f4301OooO0O0;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new p009OooOOo.OooOo00();
        this.mMenuHostHelper = new o000O0O0.OooOOOO(new androidx.activity.OooO0OO(this, 0));
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        o00O0O o00o0oOooO00o = o00O0O.OooO00o(this);
        this.mSavedStateRegistryController = o00o0oOooO00o;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new OooO00o());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new OooO0O0();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i = Build.VERSION.SDK_INT;
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.f181OooO0O0 = null;
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().clear();
                }
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().removeObserver(this);
            }
        });
        o00o0oOooO00o.OooO0O0();
        SavedStateHandleSupport.enableSavedStateHandles(this);
        if (i <= 23) {
            getLifecycle().addObserver(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().OooO0OO(ACTIVITY_RESULT_TAG, new o0OoOo0.OooO0O0() { // from class: androidx.activity.OooO0o
            @Override // o000o0OO.o0OoOo0.OooO0O0
            public final Bundle saveState() {
                return this.f4321OooO00o.lambda$new$0();
            }
        });
        addOnContextAvailableListener(new p009OooOOo.OooOo() { // from class: androidx.activity.OooO0O0
            @Override // p009OooOOo.OooOo
            public final void OooO00o(Context context) {
                this.f4318OooO00o.lambda$new$1(context);
            }
        });
    }

    private void initViewTreeOwners() {
        ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.set(getWindow().getDecorView(), this);
        o00Ooo.OooO0O0(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView.setTag(OooOo00.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    public Bundle lambda$new$0() {
        Bundle bundle = new Bundle();
        ActivityResultRegistry activityResultRegistry = this.mActivityResultRegistry;
        Objects.requireNonNull(activityResultRegistry);
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(activityResultRegistry.f4337OooO0OO.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(activityResultRegistry.f4337OooO0OO.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(activityResultRegistry.f4340OooO0o0));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) activityResultRegistry.f4342OooO0oo.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", activityResultRegistry.f4335OooO00o);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.HashMap, java.util.Map<java.lang.Integer, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    public void lambda$new$1(Context context) {
        Bundle bundleOooO00o = getSavedStateRegistry().OooO00o(ACTIVITY_RESULT_TAG);
        if (bundleOooO00o != null) {
            ActivityResultRegistry activityResultRegistry = this.mActivityResultRegistry;
            Objects.requireNonNull(activityResultRegistry);
            ArrayList<Integer> integerArrayList = bundleOooO00o.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleOooO00o.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            activityResultRegistry.f4340OooO0o0 = bundleOooO00o.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            activityResultRegistry.f4335OooO00o = (Random) bundleOooO00o.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            activityResultRegistry.f4342OooO0oo.putAll(bundleOooO00o.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                if (activityResultRegistry.f4337OooO0OO.containsKey(str)) {
                    Integer num = (Integer) activityResultRegistry.f4337OooO0OO.remove(str);
                    if (!activityResultRegistry.f4342OooO0oo.containsKey(str)) {
                        activityResultRegistry.f4336OooO0O0.remove(num);
                    }
                }
                activityResultRegistry.OooO00o(integerArrayList.get(i).intValue(), stringArrayList.get(i));
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // o000O0O0.OooOO0O
    public void addMenuProvider(@NonNull o000O0O0.OooOo oooOo) {
        this.mMenuHostHelper.OooO00o(oooOo);
    }

    @Override // o000O000.OooO0O0
    public final void addOnConfigurationChangedListener(@NonNull o000OO0O.OooO00o<Configuration> oooO00o) {
        this.mOnConfigurationChangedListeners.add(oooO00o);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set<OooOOo.OooOo>, java.util.concurrent.CopyOnWriteArraySet] */
    public final void addOnContextAvailableListener(@NonNull p009OooOOo.OooOo oooOo) {
        p009OooOOo.OooOo00 oooOo00 = this.mContextAwareHelper;
        if (oooOo00.f181OooO0O0 != null) {
            oooOo.OooO00o(oooOo00.f181OooO0O0);
        }
        oooOo00.f180OooO00o.add(oooOo);
    }

    @Override // p070o0000ooO.o0000
    public final void addOnMultiWindowModeChangedListener(@NonNull o000OO0O.OooO00o<oo0o0Oo> oooO00o) {
        this.mOnMultiWindowModeChangedListeners.add(oooO00o);
    }

    public final void addOnNewIntentListener(@NonNull o000OO0O.OooO00o<Intent> oooO00o) {
        this.mOnNewIntentListeners.add(oooO00o);
    }

    @Override // p070o0000ooO.o0000O00
    public final void addOnPictureInPictureModeChangedListener(@NonNull o000OO0O.OooO00o<o0000O0> oooO00o) {
        this.mOnPictureInPictureModeChangedListeners.add(oooO00o);
    }

    @Override // o000O000.OooO0OO
    public final void addOnTrimMemoryListener(@NonNull o000OO0O.OooO00o<Integer> oooO00o) {
        this.mOnTrimMemoryListeners.add(oooO00o);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            OooO0OO oooO0OO = (OooO0OO) getLastNonConfigurationInstance();
            if (oooO0OO != null) {
                this.mViewModelStore = oooO0OO.f4301OooO0O0;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new ViewModelStore();
            }
        }
    }

    @Override // androidx.activity.result.OooO0OO
    @NonNull
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    @CallSuper
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (getApplication() != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, getApplication());
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, getIntent().getExtras());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new SavedStateViewModelFactory(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Nullable
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        OooO0OO oooO0OO = (OooO0OO) getLastNonConfigurationInstance();
        if (oooO0OO != null) {
            return oooO0OO.f4300OooO00o;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.OooOOOO
    @NonNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // p094o000o0OO.o00Oo0
    @NonNull
    public final o0OoOo0 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f29285OooO0O0;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NonNull
    public ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (this.mActivityResultRegistry.OooO0O0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @MainThread
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.OooO0O0();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<o000OO0O.OooO00o<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Set<OooOOo.OooOo>, java.util.concurrent.CopyOnWriteArraySet] */
    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        this.mSavedStateRegistryController.OooO0OO(bundle);
        p009OooOOo.OooOo00 oooOo00 = this.mContextAwareHelper;
        oooOo00.f181OooO0O0 = this;
        Iterator it = oooOo00.f180OooO00o.iterator();
        while (it.hasNext()) {
            ((p009OooOOo.OooOo) it.next()).OooO00o(this);
        }
        super.onCreate(bundle);
        ReportFragment.injectIfNeededIn(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.mMenuHostHelper.OooO0O0(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.OooO0OO(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @CallSuper
    public void onMultiWindowModeChanged(boolean z) {
        Iterator<o000OO0O.OooO00o<oo0o0Oo>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new oo0o0Oo(z));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<o000OO0O.OooO00o<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @NonNull Menu menu) {
        Iterator<o000O0O0.OooOo> it = this.mMenuHostHelper.f28112OooO0O0.iterator();
        while (it.hasNext()) {
            it.next().OooO0O0(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z) {
        Iterator<o000OO0O.OooO00o<o0000O0>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new o0000O0(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, @Nullable View view, @NonNull Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.mMenuHostHelper.OooO0Oo(menu);
        return true;
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (this.mActivityResultRegistry.OooO0O0(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Nullable
    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        OooO0OO oooO0OO;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this.mViewModelStore;
        if (viewModelStore == null && (oooO0OO = (OooO0OO) getLastNonConfigurationInstance()) != null) {
            viewModelStore = oooO0OO.f4301OooO0O0;
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        OooO0OO oooO0OO2 = new OooO0OO();
        oooO0OO2.f4300OooO00o = objOnRetainCustomNonConfigurationInstance;
        oooO0OO2.f4301OooO0O0 = viewModelStore;
        return oooO0OO2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof LifecycleRegistry) {
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.OooO0Oo(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @CallSuper
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<o000OO0O.OooO00o<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f181OooO0O0;
    }

    @NonNull
    public final <I, O> androidx.activity.result.OooO0O0<I> registerForActivityResult(@NonNull p011OooOOoo.OooO<I, O> oooO, @NonNull ActivityResultRegistry activityResultRegistry, @NonNull androidx.activity.result.OooO00o<O> oooO00o) {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("activity_rq#");
        sbOooO0o0.append(this.mNextLocalRequestCode.getAndIncrement());
        return activityResultRegistry.OooO0o0(sbOooO0o0.toString(), this, oooO, oooO00o);
    }

    @Override // o000O0O0.OooOO0O
    public void removeMenuProvider(@NonNull o000O0O0.OooOo oooOo) {
        this.mMenuHostHelper.OooO0o0(oooOo);
    }

    @Override // o000O000.OooO0O0
    public final void removeOnConfigurationChangedListener(@NonNull o000OO0O.OooO00o<Configuration> oooO00o) {
        this.mOnConfigurationChangedListeners.remove(oooO00o);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set<OooOOo.OooOo>, java.util.concurrent.CopyOnWriteArraySet] */
    public final void removeOnContextAvailableListener(@NonNull p009OooOOo.OooOo oooOo) {
        this.mContextAwareHelper.f180OooO00o.remove(oooOo);
    }

    @Override // p070o0000ooO.o0000
    public final void removeOnMultiWindowModeChangedListener(@NonNull o000OO0O.OooO00o<oo0o0Oo> oooO00o) {
        this.mOnMultiWindowModeChangedListeners.remove(oooO00o);
    }

    public final void removeOnNewIntentListener(@NonNull o000OO0O.OooO00o<Intent> oooO00o) {
        this.mOnNewIntentListeners.remove(oooO00o);
    }

    @Override // p070o0000ooO.o0000O00
    public final void removeOnPictureInPictureModeChangedListener(@NonNull o000OO0O.OooO00o<o0000O0> oooO00o) {
        this.mOnPictureInPictureModeChangedListeners.remove(oooO00o);
    }

    @Override // o000O000.OooO0OO
    public final void removeOnTrimMemoryListener(@NonNull o000OO0O.OooO00o<Integer> oooO00o) {
        this.mOnTrimMemoryListeners.remove(oooO00o);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (o0Oo0oo.OooO00o()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(@LayoutRes int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<o000O0O0.OooOo, o000O0O0.OooOOOO$OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<o000O0O0.OooOo, o000O0O0.OooOOOO$OooO00o>] */
    public void addMenuProvider(@NonNull final o000O0O0.OooOo oooOo, @NonNull LifecycleOwner lifecycleOwner) {
        final o000O0O0.OooOOOO oooOOOO = this.mMenuHostHelper;
        oooOOOO.OooO00o(oooOo);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o000O0O0.OooOOOO.OooO00o oooO00o = (o000O0O0.OooOOOO.OooO00o) oooOOOO.f28113OooO0OO.remove(oooOo);
        if (oooO00o != null) {
            oooO00o.OooO00o();
        }
        oooOOOO.f28113OooO0OO.put(oooOo, new o000O0O0.OooOOOO.OooO00o(lifecycle, new LifecycleEventObserver() { // from class: o000O0O0.OooOOO
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                OooOOOO oooOOOO2 = oooOOOO;
                OooOo oooOo2 = oooOo;
                Objects.requireNonNull(oooOOOO2);
                if (event == Lifecycle.Event.ON_DESTROY) {
                    oooOOOO2.OooO0o0(oooOo2);
                }
            }
        }));
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onMultiWindowModeChanged(boolean z, @NonNull Configuration configuration) {
        Iterator<o000OO0O.OooO00o<oo0o0Oo>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new oo0o0Oo(z, configuration));
        }
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z, @NonNull Configuration configuration) {
        Iterator<o000OO0O.OooO00o<o0000O0>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new o0000O0(z, configuration));
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    @NonNull
    public final <I, O> androidx.activity.result.OooO0O0<I> registerForActivityResult(@NonNull p011OooOOoo.OooO<I, O> oooO, @NonNull androidx.activity.result.OooO00o<O> oooO00o) {
        return registerForActivityResult(oooO, this.mActivityResultRegistry, oooO00o);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<o000O0O0.OooOo, o000O0O0.OooOOOO$OooO00o>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashMap, java.util.Map<o000O0O0.OooOo, o000O0O0.OooOOOO$OooO00o>] */
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull final o000O0O0.OooOo oooOo, @NonNull LifecycleOwner lifecycleOwner, @NonNull final Lifecycle.State state) {
        final o000O0O0.OooOOOO oooOOOO = this.mMenuHostHelper;
        Objects.requireNonNull(oooOOOO);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o000O0O0.OooOOOO.OooO00o oooO00o = (o000O0O0.OooOOOO.OooO00o) oooOOOO.f28113OooO0OO.remove(oooOo);
        if (oooO00o != null) {
            oooO00o.OooO00o();
        }
        oooOOOO.f28113OooO0OO.put(oooOo, new o000O0O0.OooOOOO.OooO00o(lifecycle, new LifecycleEventObserver() { // from class: o000O0O0.OooOOO0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                OooOOOO oooOOOO2 = oooOOOO;
                Lifecycle.State state2 = state;
                OooOo oooOo2 = oooOo;
                Objects.requireNonNull(oooOOOO2);
                if (event == Lifecycle.Event.upTo(state2)) {
                    oooOOOO2.OooO00o(oooOo2);
                    return;
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    oooOOOO2.OooO0o0(oooOo2);
                } else if (event == Lifecycle.Event.downFrom(state2)) {
                    oooOOOO2.f28112OooO0O0.remove(oooOo2);
                    oooOOOO2.f28111OooO00o.run();
                }
            }
        }));
    }

    @ContentView
    public ComponentActivity(@LayoutRes int i) {
        this();
        this.mContentLayoutId = i;
    }
}
