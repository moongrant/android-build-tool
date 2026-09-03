package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements o00000O.OooO00o.OooOO0 {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final LifecycleRegistry mFragmentLifecycleRegistry;
    final o00oO0o mFragments;
    boolean mResumed;
    boolean mStopped;

    public class OooO00o extends o0OOO0o<FragmentActivity> implements p050o00000Oo.OooO0o, p050o00000Oo.OooO, o00000O.o0ooOOo, o00000O.o0OOO0o, ViewModelStoreOwner, androidx.activity.o0OoOo0, androidx.activity.result.OooOO0, o000OO00.OooO0o, o00000O, androidx.core.view.o00Oo0 {
        public OooO00o() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.o00000O
        public final void OooO00o(@NonNull Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.oo000o
        @Nullable
        public final View OooO0O0(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.fragment.app.oo000o
        public final boolean OooO0OO() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.o0OOO0o
        public final void OooO0Oo(@NonNull PrintWriter printWriter, @Nullable String[] strArr) {
            FragmentActivity.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.o0OOO0o
        @NonNull
        public final LayoutInflater OooO0o() {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            return fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        }

        @Override // androidx.fragment.app.o0OOO0o
        public final FragmentActivity OooO0o0() {
            return FragmentActivity.this;
        }

        @Override // androidx.fragment.app.o0OOO0o
        public final boolean OooO0oO(@NonNull String str) {
            return o00000O.OooO00o.OooO0o0(FragmentActivity.this, str);
        }

        @Override // androidx.fragment.app.o0OOO0o
        public final void OooO0oo() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // androidx.core.view.o00Oo0
        public final void addMenuProvider(@NonNull androidx.core.view.o0OOO0o o0ooo0o2) {
            FragmentActivity.this.addMenuProvider(o0ooo0o2);
        }

        @Override // p050o00000Oo.OooO0o
        public final void addOnConfigurationChangedListener(@NonNull o000OO.OooO00o<Configuration> oooO00o) {
            FragmentActivity.this.addOnConfigurationChangedListener(oooO00o);
        }

        @Override // o00000O.o0ooOOo
        public final void addOnMultiWindowModeChangedListener(@NonNull o000OO.OooO00o<o00000O.Oooo000> oooO00o) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(oooO00o);
        }

        @Override // o00000O.o0OOO0o
        public final void addOnPictureInPictureModeChangedListener(@NonNull o000OO.OooO00o<o00000O.o0OO00O> oooO00o) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(oooO00o);
        }

        @Override // p050o00000Oo.OooO
        public final void addOnTrimMemoryListener(@NonNull o000OO.OooO00o<Integer> oooO00o) {
            FragmentActivity.this.addOnTrimMemoryListener(oooO00o);
        }

        @Override // androidx.activity.result.OooOO0
        @NonNull
        public final androidx.activity.result.OooO getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.LifecycleOwner
        @NonNull
        public final Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.o0OoOo0
        @NonNull
        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // o000OO00.OooO0o
        @NonNull
        public final androidx.savedstate.OooO00o getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.ViewModelStoreOwner
        @NonNull
        public final ViewModelStore getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.core.view.o00Oo0
        public final void removeMenuProvider(@NonNull androidx.core.view.o0OOO0o o0ooo0o2) {
            FragmentActivity.this.removeMenuProvider(o0ooo0o2);
        }

        @Override // p050o00000Oo.OooO0o
        public final void removeOnConfigurationChangedListener(@NonNull o000OO.OooO00o<Configuration> oooO00o) {
            FragmentActivity.this.removeOnConfigurationChangedListener(oooO00o);
        }

        @Override // o00000O.o0ooOOo
        public final void removeOnMultiWindowModeChangedListener(@NonNull o000OO.OooO00o<o00000O.Oooo000> oooO00o) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(oooO00o);
        }

        @Override // o00000O.o0OOO0o
        public final void removeOnPictureInPictureModeChangedListener(@NonNull o000OO.OooO00o<o00000O.o0OO00O> oooO00o) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(oooO00o);
        }

        @Override // p050o00000Oo.OooO
        public final void removeOnTrimMemoryListener(@NonNull o000OO.OooO00o<Integer> oooO00o) {
            FragmentActivity.this.removeOnTrimMemoryListener(oooO00o);
        }
    }

    public FragmentActivity() {
        this.mFragments = new o00oO0o(new OooO00o());
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().OooO0OO(LIFECYCLE_TAG, new androidx.savedstate.OooO00o.OooO0O0() { // from class: androidx.fragment.app.o000oOoO
            @Override // androidx.savedstate.OooO00o.OooO0O0
            public final Bundle saveState() {
                return this.f6018OooO00o.lambda$init$0();
            }
        });
        addOnConfigurationChangedListener(new o000OO.OooO00o() { // from class: androidx.fragment.app.o0OoOo0
            @Override // o000OO.OooO00o
            public final void accept(Object obj) {
                this.f6041OooO00o.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new o000OO.OooO00o() { // from class: androidx.fragment.app.o00O0O
            @Override // o000OO.OooO00o
            public final void accept(Object obj) {
                this.f6019OooO00o.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new OooOo00.OooO0O0() { // from class: androidx.fragment.app.o00Oo0
            @Override // OooOo00.OooO0O0
            public final void OooO00o(Context context) {
                this.f6020OooO00o.lambda$init$3(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.OooO00o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.OooO00o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        o0OOO0o<?> o0ooo0o2 = this.mFragments.f6028OooO00o;
        o0ooo0o2.f6037OooO0oO.OooO0O0(o0ooo0o2, o0ooo0o2, null);
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.Oooo00O()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), state);
                }
                o000O000 o000o001 = fragment.mViewLifecycleOwner;
                if (o000o001 != null) {
                    o000o001.OooO0O0();
                    if (o000o001.f6007OooO0oo.getState().isAtLeast(Lifecycle.State.STARTED)) {
                        fragment.mViewLifecycleOwner.f6007OooO0oo.setCurrentState(state);
                        zMarkState = true;
                    }
                }
                if (fragment.mLifecycleRegistry.getState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.setCurrentState(state);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.f6028OooO00o.f6037OooO0oO.f5807OooO0o.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                p065o0000oOO.o0ooOOo.OooO00o(this).OooO0O0(str2, printWriter);
            }
            this.mFragments.f6028OooO00o.f6037OooO0oO.OooOo0(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f6028OooO00o.f6037OooO0oO;
    }

    @NonNull
    @Deprecated
    public p065o0000oOO.o0ooOOo getSupportLoaderManager() {
        return p065o0000oOO.o0ooOOo.OooO00o(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        this.mFragments.OooO00o();
        super.onActivityResult(i, i2, intent);
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        o00000 o00000Var = this.mFragments.f6028OooO00o.f6037OooO0oO;
        o00000Var.f5834Oooo000 = false;
        o00000Var.f5835Oooo00O = false;
        o00000Var.f5839Oooo0o.f5952OooO0o = false;
        o00000Var.OooOo00(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f6028OooO00o.f6037OooO0oO.OooOO0O();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f6028OooO00o.f6037OooO0oO.OooO(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f6028OooO00o.f6037OooO0oO.OooOo00(5);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.OooO00o();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.OooO00o();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f6028OooO00o.f6037OooO0oO.OooOo(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        o00000 o00000Var = this.mFragments.f6028OooO00o.f6037OooO0oO;
        o00000Var.f5834Oooo000 = false;
        o00000Var.f5835Oooo00O = false;
        o00000Var.f5839Oooo0o.f5952OooO0o = false;
        o00000Var.OooOo00(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.OooO00o();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            o00000 o00000Var = this.mFragments.f6028OooO00o.f6037OooO0oO;
            o00000Var.f5834Oooo000 = false;
            o00000Var.f5835Oooo00O = false;
            o00000Var.f5839Oooo0o.f5952OooO0o = false;
            o00000Var.OooOo00(4);
        }
        this.mFragments.f6028OooO00o.f6037OooO0oO.OooOo(true);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        o00000 o00000Var2 = this.mFragments.f6028OooO00o.f6037OooO0oO;
        o00000Var2.f5834Oooo000 = false;
        o00000Var2.f5835Oooo00O = false;
        o00000Var2.f5839Oooo0o.f5952OooO0o = false;
        o00000Var2.OooOo00(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.OooO00o();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        o00000 o00000Var = this.mFragments.f6028OooO00o.f6037OooO0oO;
        o00000Var.f5835Oooo00O = true;
        o00000Var.f5839Oooo0o.f5952OooO0o = true;
        o00000Var.OooOo00(4);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable o00000O.oo0o0Oo oo0o0oo) {
        int i = o00000O.OooO00o.f33927OooO0OO;
        o00000O.OooO00o.OooO0O0.OooO0OO(this, oo0o0oo != null ? new o00000O.OooO00o.OooOO0O(oo0o0oo) : null);
    }

    public void setExitSharedElementCallback(@Nullable o00000O.oo0o0Oo oo0o0oo) {
        int i = o00000O.OooO00o.f33927OooO0OO;
        o00000O.OooO00o.OooO0O0.OooO0Oo(this, oo0o0oo != null ? new o00000O.OooO00o.OooOO0O(oo0o0oo) : null);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            int i5 = o00000O.OooO00o.f33927OooO0OO;
            o00000O.OooO00o.C0392OooO00o.OooO0OO(this, intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        int i = o00000O.OooO00o.f33927OooO0OO;
        o00000O.OooO00o.OooO0O0.OooO00o(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        int i = o00000O.OooO00o.f33927OooO0OO;
        o00000O.OooO00o.OooO0O0.OooO0O0(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i = o00000O.OooO00o.f33927OooO0OO;
        o00000O.OooO00o.OooO0O0.OooO0o0(this);
    }

    @Override // o00000O.OooO00o.OooOO0
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i, @Nullable Bundle bundle) {
        if (i != -1) {
            fragment.startActivityForResult(intent, i, bundle);
        } else {
            int i2 = o00000O.OooO00o.f33927OooO0OO;
            o00000O.OooO00o.C0392OooO00o.OooO0O0(this, intent, -1, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @ContentView
    public FragmentActivity(@LayoutRes int i) {
        super(i);
        this.mFragments = new o00oO0o(new OooO00o());
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        init();
    }
}
