package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.DoNotInline;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.core.os.BuildCompat;
import androidx.core.view.o00oO0o;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o00000O.o0OO00O;
import o00000O.o0OOO0o;
import o00000O.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ViewModelStoreOwner, HasDefaultViewModelProviderFactory, o000OO00.OooO0o, o0OoOo0, androidx.activity.result.OooOO0, p050o00000Oo.OooO0o, p050o00000Oo.OooO, o0ooOOo, o0OOO0o, androidx.core.view.o00Oo0 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final androidx.activity.result.OooO mActivityResultRegistry;

    @LayoutRes
    private int mContentLayoutId;
    final OooOo00.OooO00o mContextAwareHelper;
    private ViewModelProvider.Factory mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;

    @NonNull
    final OooOo mFullyDrawnReporter;
    private final LifecycleRegistry mLifecycleRegistry;
    private final o00oO0o mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<o000OO.OooO00o<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<o000OO.OooO00o<o00000O.Oooo000>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<o000OO.OooO00o<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<o000OO.OooO00o<o0OO00O>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<o000OO.OooO00o<Integer>> mOnTrimMemoryListeners;
    final OooO mReportFullyDrawnExecutor;
    final o000OO00.OooO0OO mSavedStateRegistryController;
    private ViewModelStore mViewModelStore;

    public interface OooO extends Executor {
        void OooO00o();

        void OooO0OO(@NonNull View view);
    }

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

    public class OooO0O0 extends androidx.activity.result.OooO {
        public OooO0O0() {
        }

        @Override // androidx.activity.result.OooO
        public final void OooO0O0(int i, @NonNull p011OooOo0.OooOO0 oooOO1, Object obj) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            OooOo0.OooOO0.OooO00o synchronousResult = oooOO1.getSynchronousResult(componentActivity, obj);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new androidx.activity.OooOO0(this, i, synchronousResult));
                return;
            }
            Intent intentCreateIntent = oooOO1.createIntent(componentActivity, obj);
            if (intentCreateIntent.getExtras() != null && intentCreateIntent.getExtras().getClassLoader() == null) {
                intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                o00000O.OooO00o.OooO0Oo(componentActivity, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentCreateIntent.getAction())) {
                int i2 = o00000O.OooO00o.f33927OooO0OO;
                o00000O.OooO00o.C0392OooO00o.OooO0O0(componentActivity, intentCreateIntent, i, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = intentSenderRequest.f2206OooO0Oo;
                Intent intent = intentSenderRequest.f2208OooO0o0;
                int i3 = intentSenderRequest.f2207OooO0o;
                int i4 = intentSenderRequest.f2209OooO0oO;
                int i5 = o00000O.OooO00o.f33927OooO0OO;
                o00000O.OooO00o.C0392OooO00o.OooO0OO(componentActivity, intentSender, i, intent, i3, i4, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new OooOO0O(this, i, e));
            }
        }
    }

    @RequiresApi(33)
    public static class OooO0OO {
        @DoNotInline
        public static OnBackInvokedDispatcher OooO00o(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Object f2149OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ViewModelStore f2150OooO0O0;
    }

    @RequiresApi(16)
    public class OooOO0 implements OooO, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f2151OooO0Oo = SystemClock.uptimeMillis() + 10000;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f2152OooO0o = false;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Runnable f2153OooO0o0;

        public OooOO0() {
        }

        @Override // androidx.activity.ComponentActivity.OooO
        public final void OooO00o() {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.getWindow().getDecorView().removeCallbacks(this);
            componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.OooO
        public final void OooO0OO(@NonNull View view) {
            if (this.f2152OooO0o) {
                return;
            }
            this.f2152OooO0o = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f2153OooO0o0 = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f2152OooO0o) {
                decorView.postOnAnimation(new OooOOO0(this, 0));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z;
            Runnable runnable = this.f2153OooO0o0;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f2151OooO0Oo) {
                    this.f2152OooO0o = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f2153OooO0o0 = null;
            OooOo oooOo = ComponentActivity.this.mFullyDrawnReporter;
            synchronized (oooOo.f2190OooO0O0) {
                z = oooOo.f2191OooO0OO;
            }
            if (z) {
                this.f2152OooO0o = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.activity.OooO0OO] */
    public ComponentActivity() {
        this.mContextAwareHelper = new OooOo00.OooO00o();
        this.mMenuHostHelper = new o00oO0o(new Runnable() { // from class: androidx.activity.OooO0O0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2176OooO0Oo.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        Intrinsics.checkNotNullParameter(this, "owner");
        o000OO00.OooO0OO oooO0OO = new o000OO00.OooO0OO(this);
        this.mSavedStateRegistryController = oooO0OO;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new OooO00o());
        OooO oooOCreateFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = oooOCreateFullyDrawnExecutor;
        this.mFullyDrawnReporter = new OooOo(oooOCreateFullyDrawnExecutor, new Function0() { // from class: androidx.activity.OooO0OO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f2177OooO0Oo.lambda$new$0();
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new OooO0O0();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
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
                    ComponentActivity.this.mContextAwareHelper.f286OooO0O0 = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().clear();
                    }
                    ComponentActivity.this.mReportFullyDrawnExecutor.OooO00o();
                }
            }
        });
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                ComponentActivity componentActivity = ComponentActivity.this;
                componentActivity.ensureViewModelStore();
                componentActivity.getLifecycle().removeObserver(this);
            }
        });
        oooO0OO.OooO00o();
        SavedStateHandleSupport.enableSavedStateHandles(this);
        if (i <= 23) {
            getLifecycle().addObserver(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().OooO0OO(ACTIVITY_RESULT_TAG, new androidx.savedstate.OooO00o.OooO0O0() { // from class: androidx.activity.OooO0o
            @Override // androidx.savedstate.OooO00o.OooO0O0
            public final Bundle saveState() {
                return this.f2178OooO00o.lambda$new$1();
            }
        });
        addOnContextAvailableListener(new OooOo00.OooO0O0() { // from class: androidx.activity.OooO
            @Override // OooOo00.OooO0O0
            public final void OooO00o(Context context) {
                this.f2175OooO00o.lambda$new$2(context);
            }
        });
    }

    private OooO createFullyDrawnExecutor() {
        return new OooOO0();
    }

    private void initViewTreeOwners() {
        ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.set(getWindow().getDecorView(), this);
        o000OO00.OooO.OooO0O0(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView.setTag(o00O0O.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        Intrinsics.checkNotNullParameter(this, "fullyDrawnReporterOwner");
        decorView2.setTag(o00O0O.report_drawn, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        androidx.activity.result.OooO oooO = this.mActivityResultRegistry;
        oooO.getClass();
        HashMap map = oooO.f2212OooO0OO;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(oooO.f2215OooO0o0));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) oooO.f2217OooO0oo.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", oooO.f2210OooO00o);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$2(Context context) {
        Bundle bundleOooO00o = getSavedStateRegistry().OooO00o(ACTIVITY_RESULT_TAG);
        if (bundleOooO00o != null) {
            androidx.activity.result.OooO oooO = this.mActivityResultRegistry;
            oooO.getClass();
            ArrayList<Integer> integerArrayList = bundleOooO00o.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleOooO00o.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            oooO.f2215OooO0o0 = bundleOooO00o.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            oooO.f2210OooO00o = (Random) bundleOooO00o.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            Bundle bundle = bundleOooO00o.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = oooO.f2217OooO0oo;
            bundle2.putAll(bundle);
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                HashMap map = oooO.f2212OooO0OO;
                boolean zContainsKey = map.containsKey(str);
                HashMap map2 = oooO.f2211OooO0O0;
                if (zContainsKey) {
                    Integer num = (Integer) map.remove(str);
                    if (!bundle2.containsKey(str)) {
                        map2.remove(num);
                    }
                }
                int iIntValue = integerArrayList.get(i).intValue();
                String str2 = stringArrayList.get(i);
                map2.put(Integer.valueOf(iIntValue), str2);
                map.put(str2, Integer.valueOf(iIntValue));
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.OooO0OO(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.o00Oo0
    public void addMenuProvider(@NonNull androidx.core.view.o0OOO0o o0ooo0o2) {
        o00oO0o o00oo0o2 = this.mMenuHostHelper;
        o00oo0o2.f5440OooO0O0.add(o0ooo0o2);
        o00oo0o2.f5439OooO00o.run();
    }

    @Override // p050o00000Oo.OooO0o
    public final void addOnConfigurationChangedListener(@NonNull o000OO.OooO00o<Configuration> oooO00o) {
        this.mOnConfigurationChangedListeners.add(oooO00o);
    }

    public final void addOnContextAvailableListener(@NonNull OooOo00.OooO0O0 listener) {
        OooOo00.OooO00o oooO00o = this.mContextAwareHelper;
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = oooO00o.f286OooO0O0;
        if (context != null) {
            listener.OooO00o(context);
        }
        oooO00o.f285OooO00o.add(listener);
    }

    @Override // o00000O.o0ooOOo
    public final void addOnMultiWindowModeChangedListener(@NonNull o000OO.OooO00o<o00000O.Oooo000> oooO00o) {
        this.mOnMultiWindowModeChangedListeners.add(oooO00o);
    }

    public final void addOnNewIntentListener(@NonNull o000OO.OooO00o<Intent> oooO00o) {
        this.mOnNewIntentListeners.add(oooO00o);
    }

    @Override // o00000O.o0OOO0o
    public final void addOnPictureInPictureModeChangedListener(@NonNull o000OO.OooO00o<o0OO00O> oooO00o) {
        this.mOnPictureInPictureModeChangedListeners.add(oooO00o);
    }

    @Override // p050o00000Oo.OooO
    public final void addOnTrimMemoryListener(@NonNull o000OO.OooO00o<Integer> oooO00o) {
        this.mOnTrimMemoryListeners.add(oooO00o);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            OooO0o oooO0o = (OooO0o) getLastNonConfigurationInstance();
            if (oooO0o != null) {
                this.mViewModelStore = oooO0o.f2150OooO0O0;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new ViewModelStore();
            }
        }
    }

    @Override // androidx.activity.result.OooOO0
    @NonNull
    public final androidx.activity.result.OooO getActivityResultRegistry() {
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

    @NonNull
    public OooOo getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Nullable
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        OooO0o oooO0o = (OooO0o) getLastNonConfigurationInstance();
        if (oooO0o != null) {
            return oooO0o.f2149OooO00o;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.o0OoOo0
    @NonNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // o000OO00.OooO0o
    @NonNull
    public final androidx.savedstate.OooO00o getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f34874OooO0O0;
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
        if (this.mActivityResultRegistry.OooO00o(i, i2, intent)) {
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
        Iterator<o000OO.OooO00o<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public void onCreate(@Nullable Bundle bundle) {
        this.mSavedStateRegistryController.OooO0O0(bundle);
        OooOo00.OooO00o oooO00o = this.mContextAwareHelper;
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        oooO00o.f286OooO0O0 = this;
        Iterator it = oooO00o.f285OooO00o.iterator();
        while (it.hasNext()) {
            ((OooOo00.OooO0O0) it.next()).OooO00o(this);
        }
        super.onCreate(bundle);
        ReportFragment.injectIfNeededIn(this);
        if (BuildCompat.OooO0OO()) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.mOnBackPressedDispatcher;
            OnBackInvokedDispatcher invoker = OooO0OO.OooO00o(this);
            onBackPressedDispatcher.getClass();
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            onBackPressedDispatcher.f2165OooO0o0 = invoker;
            onBackPressedDispatcher.OooO0OO();
        }
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
        o00oO0o o00oo0o2 = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<androidx.core.view.o0OOO0o> it = o00oo0o2.f5440OooO0O0.iterator();
        while (it.hasNext()) {
            it.next().OooO0Oo(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator<androidx.core.view.o0OOO0o> it = this.mMenuHostHelper.f5440OooO0O0.iterator();
        while (it.hasNext()) {
            if (it.next().OooO0OO(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    @CallSuper
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<o000OO.OooO00o<o00000O.Oooo000>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new o00000O.Oooo000(z));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<o000OO.OooO00o<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @NonNull Menu menu) {
        Iterator<androidx.core.view.o0OOO0o> it = this.mMenuHostHelper.f5440OooO0O0.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<o000OO.OooO00o<o0OO00O>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new o0OO00O(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, @Nullable View view, @NonNull Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator<androidx.core.view.o0OOO0o> it = this.mMenuHostHelper.f5440OooO0O0.iterator();
        while (it.hasNext()) {
            it.next().OooO0O0(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (this.mActivityResultRegistry.OooO00o(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
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
        OooO0o oooO0o;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this.mViewModelStore;
        if (viewModelStore == null && (oooO0o = (OooO0o) getLastNonConfigurationInstance()) != null) {
            viewModelStore = oooO0o.f2150OooO0O0;
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        OooO0o oooO0o2 = new OooO0o();
        oooO0o2.f2149OooO00o = objOnRetainCustomNonConfigurationInstance;
        oooO0o2.f2150OooO0O0 = viewModelStore;
        return oooO0o2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof LifecycleRegistry) {
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.OooO0OO(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @CallSuper
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<o000OO.OooO00o<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f286OooO0O0;
    }

    @NonNull
    public final <I, O> androidx.activity.result.OooO0O0<I> registerForActivityResult(@NonNull p011OooOo0.OooOO0<I, O> oooOO1, @NonNull androidx.activity.result.OooO oooO, @NonNull androidx.activity.result.OooO00o<O> oooO00o) {
        return oooO.OooO0OO("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, oooOO1, oooO00o);
    }

    @Override // androidx.core.view.o00Oo0
    public void removeMenuProvider(@NonNull androidx.core.view.o0OOO0o o0ooo0o2) {
        this.mMenuHostHelper.OooO00o(o0ooo0o2);
    }

    @Override // p050o00000Oo.OooO0o
    public final void removeOnConfigurationChangedListener(@NonNull o000OO.OooO00o<Configuration> oooO00o) {
        this.mOnConfigurationChangedListeners.remove(oooO00o);
    }

    public final void removeOnContextAvailableListener(@NonNull OooOo00.OooO0O0 listener) {
        OooOo00.OooO00o oooO00o = this.mContextAwareHelper;
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        oooO00o.f285OooO00o.remove(listener);
    }

    @Override // o00000O.o0ooOOo
    public final void removeOnMultiWindowModeChangedListener(@NonNull o000OO.OooO00o<o00000O.Oooo000> oooO00o) {
        this.mOnMultiWindowModeChangedListeners.remove(oooO00o);
    }

    public final void removeOnNewIntentListener(@NonNull o000OO.OooO00o<Intent> oooO00o) {
        this.mOnNewIntentListeners.remove(oooO00o);
    }

    @Override // o00000O.o0OOO0o
    public final void removeOnPictureInPictureModeChangedListener(@NonNull o000OO.OooO00o<o0OO00O> oooO00o) {
        this.mOnPictureInPictureModeChangedListeners.remove(oooO00o);
    }

    @Override // p050o00000Oo.OooO
    public final void removeOnTrimMemoryListener(@NonNull o000OO.OooO00o<Integer> oooO00o) {
        this.mOnTrimMemoryListeners.remove(oooO00o);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (p077o000Oo00.OooOO0O.OooO00o()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.OooO00o();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(@LayoutRes int i) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.OooO0OO(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i, @Nullable Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onMultiWindowModeChanged(boolean z, @NonNull Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<o000OO.OooO00o<o00000O.Oooo000>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new o00000O.Oooo000(z, 0));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z, @NonNull Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<o000OO.OooO00o<o0OO00O>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new o0OO00O(z, 0));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @NonNull
    public final <I, O> androidx.activity.result.OooO0O0<I> registerForActivityResult(@NonNull p011OooOo0.OooOO0<I, O> oooOO1, @NonNull androidx.activity.result.OooO00o<O> oooO00o) {
        return registerForActivityResult(oooOO1, this.mActivityResultRegistry, oooO00o);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.OooO0OO(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void addMenuProvider(@NonNull final androidx.core.view.o0OOO0o o0ooo0o2, @NonNull LifecycleOwner lifecycleOwner) {
        final o00oO0o o00oo0o2 = this.mMenuHostHelper;
        o00oo0o2.f5440OooO0O0.add(o0ooo0o2);
        o00oo0o2.f5439OooO00o.run();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap map = o00oo0o2.f5441OooO0OO;
        o00oO0o.OooO00o oooO00o = (o00oO0o.OooO00o) map.remove(o0ooo0o2);
        if (oooO00o != null) {
            oooO00o.f5442OooO00o.removeObserver(oooO00o.f5443OooO0O0);
            oooO00o.f5443OooO0O0 = null;
        }
        map.put(o0ooo0o2, new o00oO0o.OooO00o(lifecycle, new LifecycleEventObserver() { // from class: androidx.core.view.o00Ooo
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                o00oO0o o00oo0o3 = o00oo0o2;
                o00oo0o3.getClass();
                if (event == Lifecycle.Event.ON_DESTROY) {
                    o00oo0o3.OooO00o(o0ooo0o2);
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.OooO0OO(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull final androidx.core.view.o0OOO0o o0ooo0o2, @NonNull LifecycleOwner lifecycleOwner, @NonNull final Lifecycle.State state) {
        final o00oO0o o00oo0o2 = this.mMenuHostHelper;
        o00oo0o2.getClass();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap map = o00oo0o2.f5441OooO0OO;
        o00oO0o.OooO00o oooO00o = (o00oO0o.OooO00o) map.remove(o0ooo0o2);
        if (oooO00o != null) {
            oooO00o.f5442OooO00o.removeObserver(oooO00o.f5443OooO0O0);
            oooO00o.f5443OooO0O0 = null;
        }
        map.put(o0ooo0o2, new o00oO0o.OooO00o(lifecycle, new LifecycleEventObserver() { // from class: androidx.core.view.oo000o
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                o00oO0o o00oo0o3 = o00oo0o2;
                o00oo0o3.getClass();
                Lifecycle.State state2 = state;
                Lifecycle.Event eventUpTo = Lifecycle.Event.upTo(state2);
                Runnable runnable = o00oo0o3.f5439OooO00o;
                CopyOnWriteArrayList<o0OOO0o> copyOnWriteArrayList = o00oo0o3.f5440OooO0O0;
                o0OOO0o o0ooo0o3 = o0ooo0o2;
                if (event == eventUpTo) {
                    copyOnWriteArrayList.add(o0ooo0o3);
                    runnable.run();
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    o00oo0o3.OooO00o(o0ooo0o3);
                } else if (event == Lifecycle.Event.downFrom(state2)) {
                    copyOnWriteArrayList.remove(o0ooo0o3);
                    runnable.run();
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
