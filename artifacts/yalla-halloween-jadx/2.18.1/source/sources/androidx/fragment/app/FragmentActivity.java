package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
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
public class FragmentActivity extends ComponentActivity implements o0000ooO.o00Oo0.OooO, o0000ooO.o00Oo0.OooOO0 {
    public static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public boolean mCreated;
    public final LifecycleRegistry mFragmentLifecycleRegistry;
    public final o00Oo0 mFragments;
    public boolean mResumed;
    public boolean mStopped;

    public class OooO00o extends oo000o<FragmentActivity> implements o000O000.OooO0O0, o000O000.OooO0OO, p070o0000ooO.o0000, p070o0000ooO.o0000O00, ViewModelStoreOwner, androidx.activity.OooOOOO, androidx.activity.result.OooO0OO, p094o000o0OO.o00Oo0, o000000O, o000O0O0.OooOO0O {
        public OooO00o() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.o000000O
        public final void OooO00o(@NonNull Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.o00O0O
        @Nullable
        public final View OooO0O0(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.fragment.app.o00O0O
        public final boolean OooO0OO() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.oo000o
        public final void OooO0Oo(@NonNull PrintWriter printWriter, @Nullable String[] strArr) {
            FragmentActivity.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.oo000o
        @NonNull
        public final LayoutInflater OooO0o() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.oo000o
        public final FragmentActivity OooO0o0() {
            return FragmentActivity.this;
        }

        @Override // androidx.fragment.app.oo000o
        public final boolean OooO0oO(@NonNull String str) {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            int i = p070o0000ooO.o00Oo0.f28002OooO0OO;
            if (Build.VERSION.SDK_INT >= 23) {
                return o0000ooO.o00Oo0.OooO0o.OooO0OO(fragmentActivity, str);
            }
            return false;
        }

        @Override // androidx.fragment.app.oo000o
        public final void OooO0oo() {
            FragmentActivity.this.invalidateOptionsMenu();
        }

        @Override // o000O0O0.OooOO0O
        public final void addMenuProvider(@NonNull o000O0O0.OooOo oooOo) {
            FragmentActivity.this.addMenuProvider(oooOo);
        }

        @Override // o000O000.OooO0O0
        public final void addOnConfigurationChangedListener(@NonNull o000OO0O.OooO00o<Configuration> oooO00o) {
            FragmentActivity.this.addOnConfigurationChangedListener(oooO00o);
        }

        @Override // p070o0000ooO.o0000
        public final void addOnMultiWindowModeChangedListener(@NonNull o000OO0O.OooO00o<p070o0000ooO.oo0o0Oo> oooO00o) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(oooO00o);
        }

        @Override // p070o0000ooO.o0000O00
        public final void addOnPictureInPictureModeChangedListener(@NonNull o000OO0O.OooO00o<p070o0000ooO.o0000O0> oooO00o) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(oooO00o);
        }

        @Override // o000O000.OooO0OO
        public final void addOnTrimMemoryListener(@NonNull o000OO0O.OooO00o<Integer> oooO00o) {
            FragmentActivity.this.addOnTrimMemoryListener(oooO00o);
        }

        @Override // androidx.activity.result.OooO0OO
        @NonNull
        public final ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.LifecycleOwner
        @NonNull
        public final Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.OooOOOO
        @NonNull
        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // p094o000o0OO.o00Oo0
        @NonNull
        public final p094o000o0OO.o0OoOo0 getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.ViewModelStoreOwner
        @NonNull
        public final ViewModelStore getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // o000O0O0.OooOO0O
        public final void removeMenuProvider(@NonNull o000O0O0.OooOo oooOo) {
            FragmentActivity.this.removeMenuProvider(oooOo);
        }

        @Override // o000O000.OooO0O0
        public final void removeOnConfigurationChangedListener(@NonNull o000OO0O.OooO00o<Configuration> oooO00o) {
            FragmentActivity.this.removeOnConfigurationChangedListener(oooO00o);
        }

        @Override // p070o0000ooO.o0000
        public final void removeOnMultiWindowModeChangedListener(@NonNull o000OO0O.OooO00o<p070o0000ooO.oo0o0Oo> oooO00o) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(oooO00o);
        }

        @Override // p070o0000ooO.o0000O00
        public final void removeOnPictureInPictureModeChangedListener(@NonNull o000OO0O.OooO00o<p070o0000ooO.o0000O0> oooO00o) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(oooO00o);
        }

        @Override // o000O000.OooO0OO
        public final void removeOnTrimMemoryListener(@NonNull o000OO0O.OooO00o<Integer> oooO00o) {
            FragmentActivity.this.removeOnTrimMemoryListener(oooO00o);
        }
    }

    public FragmentActivity() {
        this.mFragments = new o00Oo0(new OooO00o());
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().OooO0OO(LIFECYCLE_TAG, new o000o0OO.o0OoOo0.OooO0O0() { // from class: androidx.fragment.app.o000oOoO
            @Override // o000o0OO.o0OoOo0.OooO0O0
            public final Bundle saveState() {
                return this.f8506OooO00o.lambda$init$0();
            }
        });
        addOnConfigurationChangedListener(new o000OO0O.OooO00o() { // from class: androidx.fragment.app.Oooo0
            @Override // o000OO0O.OooO00o
            public final void accept(Object obj) {
                this.f8411OooO00o.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new o000OO0O.OooO00o() { // from class: androidx.fragment.app.Oooo000
            @Override // o000OO0O.OooO00o
            public final void accept(Object obj) {
                this.f8412OooO00o.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new p009OooOOo.OooOo() { // from class: androidx.fragment.app.OooOo
            @Override // p009OooOOo.OooOo
            public final void OooO00o(Context context) {
                this.f8404OooO00o.lambda$init$3(context);
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
        oo000o<?> oo000oVar = this.mFragments.f8507OooO00o;
        oo000oVar.f8527Oooo.OooO0O0(oo000oVar, oo000oVar, null);
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.Oooo0OO()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), state);
                }
                o000OO o000oo2 = fragment.mViewLifecycleOwner;
                if (o000oo2 != null) {
                    o000oo2.OooO0O0();
                    if (o000oo2.f8500Oooo.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                        fragment.mViewLifecycleOwner.f8500Oooo.setCurrentState(state);
                        zMarkState = true;
                    }
                }
                if (fragment.mLifecycleRegistry.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.setCurrentState(state);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.f8507OooO00o.f8527Oooo.f8291OooO0o.onCreateView(view, str, context, attributeSet);
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
                p082o000OoOO.OooOOO.OooO0O0(this).OooO00o(str2, printWriter);
            }
            this.mFragments.f8507OooO00o.f8527Oooo.OooOo0o(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f8507OooO00o.f8527Oooo;
    }

    @NonNull
    @Deprecated
    public p082o000OoOO.OooOOO getSupportLoaderManager() {
        return p082o000OoOO.OooOOO.OooO0O0(this);
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
        this.mFragments.f8507OooO00o.f8527Oooo.OooOO0();
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
        this.mFragments.f8507OooO00o.f8527Oooo.OooOO0o();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f8507OooO00o.f8527Oooo.OooO(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f8507OooO00o.f8527Oooo.OooOo0(5);
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
        this.mFragments.f8507OooO00o.f8527Oooo.OooOoOO(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        o000OOo o000ooo2 = this.mFragments.f8507OooO00o.f8527Oooo;
        o000ooo2.f8318Oooo000 = false;
        o000ooo2.f8319Oooo00O = false;
        o000ooo2.f8323Oooo0o.f8429OooO0o = false;
        o000ooo2.OooOo0(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.OooO00o();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            o000OOo o000ooo2 = this.mFragments.f8507OooO00o.f8527Oooo;
            o000ooo2.f8318Oooo000 = false;
            o000ooo2.f8319Oooo00O = false;
            o000ooo2.f8323Oooo0o.f8429OooO0o = false;
            o000ooo2.OooOo0(4);
        }
        this.mFragments.f8507OooO00o.f8527Oooo.OooOoOO(true);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        o000OOo o000ooo3 = this.mFragments.f8507OooO00o.f8527Oooo;
        o000ooo3.f8318Oooo000 = false;
        o000ooo3.f8319Oooo00O = false;
        o000ooo3.f8323Oooo0o.f8429OooO0o = false;
        o000ooo3.OooOo0(5);
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
        o000OOo o000ooo2 = this.mFragments.f8507OooO00o.f8527Oooo;
        o000ooo2.f8319Oooo00O = true;
        o000ooo2.f8323Oooo0o.f8429OooO0o = true;
        o000ooo2.OooOo0(4);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable p070o0000ooO.o0000O0O o0000o0o2) {
        int i = p070o0000ooO.o00Oo0.f28002OooO0OO;
        o0000ooO.o00Oo0.OooO0OO.OooO0OO(this, null);
    }

    public void setExitSharedElementCallback(@Nullable p070o0000ooO.o0000O0O o0000o0o2) {
        int i = p070o0000ooO.o00Oo0.f28002OooO0OO;
        o0000ooO.o00Oo0.OooO0OO.OooO0Oo(this, null);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            int i5 = p070o0000ooO.o00Oo0.f28002OooO0OO;
            o0000ooO.o00Oo0.OooO0O0.OooO0OO(this, intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        int i = p070o0000ooO.o00Oo0.f28002OooO0OO;
        o0000ooO.o00Oo0.OooO0OO.OooO00o(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        int i = p070o0000ooO.o00Oo0.f28002OooO0OO;
        o0000ooO.o00Oo0.OooO0OO.OooO0O0(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i = p070o0000ooO.o00Oo0.f28002OooO0OO;
        o0000ooO.o00Oo0.OooO0OO.OooO0o0(this);
    }

    @Override // o0000ooO.o00Oo0.OooOO0
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        if (i != -1) {
            fragment.startActivityForResult(intent, i, bundle);
        } else {
            int i2 = p070o0000ooO.o00Oo0.f28002OooO0OO;
            o0000ooO.o00Oo0.OooO0O0.OooO0O0(this, intent, -1, bundle);
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
        this.mFragments = new o00Oo0(new OooO00o());
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        init();
    }
}
