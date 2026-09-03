package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.AnimRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.UiThread;
import androidx.arch.core.util.Function;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.facebook.internal.security.CertificateUtil;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, o00O0000.OooO0o {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    OooOOOO mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @NonNull
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;

    @LayoutRes
    private int mContentLayoutId;
    ViewModelProvider.Factory mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    o0Oo0oo<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    LifecycleRegistry mLifecycleRegistry;
    Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<OooOo00> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final OooOo00 mSavedStateAttachListener;
    o00O0000.OooO0OO mSavedStateRegistryController;

    @Nullable
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;

    @Nullable
    o000O0o mViewLifecycleOwner;
    MutableLiveData<LifecycleOwner> mViewLifecycleOwnerLiveData;

    @NonNull
    String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(@NonNull String str, @Nullable Exception exc) {
            super(str, exc);
        }
    }

    public class OooO implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SpecialEffectsController f5775OooO0Oo;

        public OooO(SpecialEffectsController specialEffectsController) {
            this.f5775OooO0Oo = specialEffectsController;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f5775OooO0Oo.OooO0oO();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class OooO00o<I> extends androidx.activity.result.OooO0O0<I> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f5776OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ p011OooOo0.OooOO0 f5777OooO0O0;

        public OooO00o(AtomicReference atomicReference, p011OooOo0.OooOO0 oooOO1) {
            this.f5776OooO00o = atomicReference;
            this.f5777OooO0O0 = oooOO1;
        }

        @Override // androidx.activity.result.OooO0O0
        @NonNull
        public final p011OooOo0.OooOO0<I, ?> OooO00o() {
            return this.f5777OooO0O0;
        }

        @Override // androidx.activity.result.OooO0O0
        public final void OooO0O0(Object obj) {
            androidx.activity.result.OooO0O0 oooO0O0 = (androidx.activity.result.OooO0O0) this.f5776OooO00o.get();
            if (oooO0O0 == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            oooO0O0.OooO0O0(obj);
        }

        @Override // androidx.activity.result.OooO0O0
        public final void OooO0OO() {
            androidx.activity.result.OooO0O0 oooO0O0 = (androidx.activity.result.OooO0O0) this.f5776OooO00o.getAndSet(null);
            if (oooO0O0 != null) {
                oooO0O0.OooO0OO();
            }
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    public class OooO0OO extends OooOo00 {
        public OooO0OO() {
        }

        @Override // androidx.fragment.app.Fragment.OooOo00
        public final void OooO00o() {
            Fragment fragment = Fragment.this;
            fragment.mSavedStateRegistryController.OooO00o();
            SavedStateHandleSupport.enableSavedStateHandles(fragment);
            Bundle bundle = fragment.mSavedFragmentState;
            fragment.mSavedStateRegistryController.OooO0O0(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    public class OooO0o implements Runnable {
        public OooO0o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    public class OooOO0 extends o00oO0o {
        public OooOO0() {
        }

        @Override // androidx.fragment.app.o00oO0o
        @Nullable
        public final View OooO0O0(int i) {
            Fragment fragment = Fragment.this;
            View view = fragment.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", fragment, " does not have a view"));
        }

        @Override // androidx.fragment.app.o00oO0o
        public final boolean OooO0OO() {
            return Fragment.this.mView != null;
        }
    }

    public class OooOO0O implements Function<Void, androidx.activity.result.OooO> {
        public OooOO0O() {
        }

        @Override // androidx.arch.core.util.Function
        public final androidx.activity.result.OooO apply(Void r3) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof androidx.activity.result.OooOO0 ? ((androidx.activity.result.OooOO0) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    public class OooOOO extends OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Function f5783OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f5784OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ p011OooOo0.OooOO0 f5785OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.OooO00o f5786OooO0Oo;

        public OooOOO(Function function, AtomicReference atomicReference, p011OooOo0.OooOO0 oooOO1, androidx.activity.result.OooO00o oooO00o) {
            this.f5783OooO00o = function;
            this.f5784OooO0O0 = atomicReference;
            this.f5785OooO0OO = oooOO1;
            this.f5786OooO0Oo = oooO00o;
        }

        @Override // androidx.fragment.app.Fragment.OooOo00
        public final void OooO00o() {
            Fragment fragment = Fragment.this;
            this.f5784OooO0O0.set(((androidx.activity.result.OooO) this.f5783OooO00o.apply(null)).OooO0OO(fragment.generateActivityResultKey(), fragment, this.f5785OooO0OO, this.f5786OooO0Oo));
        }
    }

    public class OooOOO0 implements Function<Void, androidx.activity.result.OooO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.OooO f5788OooO00o;

        public OooOOO0(androidx.activity.result.OooO oooO) {
            this.f5788OooO00o = oooO;
        }

        @Override // androidx.arch.core.util.Function
        public final androidx.activity.result.OooO apply(Void r1) {
            return this.f5788OooO00o;
        }
    }

    public static class OooOOOO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Object f5789OooO = null;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f5790OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @AnimRes
        public int f5791OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @AnimRes
        public int f5792OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @AnimRes
        public int f5793OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f5794OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @AnimRes
        public int f5795OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ArrayList<String> f5796OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ArrayList<String> f5797OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Object f5798OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Object f5799OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Object f5800OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Object f5801OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public Object f5802OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Boolean f5803OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public Boolean f5804OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public o00000O.oo0o0Oo f5805OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public o00000O.oo0o0Oo f5806OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public float f5807OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public boolean f5808OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public View f5809OooOo00;

        public OooOOOO() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f5798OooOO0 = obj;
            this.f5799OooOO0O = null;
            this.f5800OooOO0o = obj;
            this.f5802OooOOO0 = null;
            this.f5801OooOOO = obj;
            this.f5806OooOOo0 = null;
            this.f5805OooOOo = null;
            this.f5807OooOOoo = 1.0f;
            this.f5809OooOo00 = null;
        }
    }

    public static abstract class OooOo00 {
        public abstract void OooO00o();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new o00000O0();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new OooO0O0();
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new MutableLiveData<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new OooO0OO();
        initLifecycle();
    }

    private OooOOOO ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new OooOOOO();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        Lifecycle.State state = this.mMaxState;
        return (state == Lifecycle.State.INITIALIZED || this.mParentFragment == null) ? state.ordinal() : Math.min(state.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        Intrinsics.checkNotNullParameter(this, "owner");
        this.mSavedStateRegistryController = new o00O0000.OooO0OO(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        o000O0o o000o0o2 = this.mViewLifecycleOwner;
        o000o0o2.f6032OooO.OooO0O0(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    @NonNull
    private <I, O> androidx.activity.result.OooO0O0<I> prepareCallInternal(@NonNull p011OooOo0.OooOO0<I, O> oooOO1, @NonNull Function<Void, androidx.activity.result.OooO> function, @NonNull androidx.activity.result.OooO00o<O> oooO00o) {
        if (this.mState > 1) {
            throw new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new OooOOO(function, atomicReference, oooOO1, oooO00o));
        return new OooO00o(atomicReference, oooOO1);
    }

    private void registerOnPreAttachListener(@NonNull OooOo00 oooOo00) {
        if (this.mState >= 0) {
            oooOo00.OooO00o();
        } else {
            this.mOnPreAttachedListeners.add(oooOo00);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO != null) {
            oooOOOO.f5808OooOo0 = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        SpecialEffectsController specialEffectsControllerOooOO0 = SpecialEffectsController.OooOO0(viewGroup, fragmentManager);
        specialEffectsControllerOooOO0.OooOO0O();
        if (z) {
            this.mHost.f6053OooO0o.post(new OooO(specialEffectsControllerOooOO0));
        } else {
            specialEffectsControllerOooOO0.OooO0oO();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @NonNull
    public o00oO0o createFragmentContainer() {
        return new OooOO0();
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            p065o0000oOO.o0ooOOo.OooO00o(this).OooO0O0(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + CertificateUtil.DELIMITER);
        this.mChildFragmentManager.OooOo0(androidx.camera.core.impl.OooOOOO.OooO00o(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f5819OooO0OO.OooO0OO(str);
    }

    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @Nullable
    public final FragmentActivity getActivity() {
        o0Oo0oo<?> o0oo0oo2 = this.mHost;
        if (o0oo0oo2 == null) {
            return null;
        }
        return (FragmentActivity) o0oo0oo2.f6052OooO0Oo;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null || (bool = oooOOOO.f5804OooOOOo) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null || (bool = oooOOOO.f5803OooOOOO) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        oooOOOO.getClass();
        return null;
    }

    @Nullable
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " has not been attached yet."));
    }

    @Nullable
    public Context getContext() {
        o0Oo0oo<?> o0oo0oo2 = this.mHost;
        if (o0oo0oo2 == null) {
            return null;
        }
        return o0oo0oo2.f6054OooO0o0;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    @CallSuper
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
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
        if (application == null && FragmentManager.Oooo0O0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (getArguments() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
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
            if (application == null && FragmentManager.Oooo0O0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new SavedStateViewModelFactory(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @AnimRes
    public int getEnterAnim() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return 0;
        }
        return oooOOOO.f5791OooO0O0;
    }

    @Nullable
    public Object getEnterTransition() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        return oooOOOO.f5789OooO;
    }

    public o00000O.oo0o0Oo getEnterTransitionCallback() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        return oooOOOO.f5806OooOOo0;
    }

    @AnimRes
    public int getExitAnim() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return 0;
        }
        return oooOOOO.f5792OooO0OO;
    }

    @Nullable
    public Object getExitTransition() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        return oooOOOO.f5799OooOO0O;
    }

    public o00000O.oo0o0Oo getExitTransitionCallback() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        return oooOOOO.f5805OooOOo;
    }

    public View getFocusedView() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        return oooOOOO.f5809OooOo00;
    }

    @Nullable
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable
    public final Object getHost() {
        o0Oo0oo<?> o0oo0oo2 = this.mHost;
        if (o0oo0oo2 == null) {
            return null;
        }
        return o0oo0oo2.OooO0o0();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public p065o0000oOO.o0ooOOo getLoaderManager() {
        return p065o0000oOO.o0ooOOo.OooO00o(this);
    }

    public int getNextTransition() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return 0;
        }
        return oooOOOO.f5794OooO0o;
    }

    @Nullable
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return false;
        }
        return oooOOOO.f5790OooO00o;
    }

    @AnimRes
    public int getPopEnterAnim() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return 0;
        }
        return oooOOOO.f5793OooO0Oo;
    }

    @AnimRes
    public int getPopExitAnim() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return 0;
        }
        return oooOOOO.f5795OooO0o0;
    }

    public float getPostOnViewCreatedAlpha() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return 1.0f;
        }
        return oooOOOO.f5807OooOOoo;
    }

    @Nullable
    public Object getReenterTransition() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        Object obj = oooOOOO.f5800OooOO0o;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.OooO00o oooO00o = FragmentStrictMode.f6069OooO00o;
        Intrinsics.checkNotNullParameter(this, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(this);
        FragmentStrictMode.OooO0OO(getRetainInstanceUsageViolation);
        FragmentStrictMode.OooO00o OooO00o2 = FragmentStrictMode.OooO00o(this);
        if (OooO00o2.f6071OooO00o.contains(FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && FragmentStrictMode.OooO0o0(OooO00o2, getClass(), GetRetainInstanceUsageViolation.class)) {
            FragmentStrictMode.OooO0O0(OooO00o2, getRetainInstanceUsageViolation);
        }
        return this.mRetainInstance;
    }

    @Nullable
    public Object getReturnTransition() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        Object obj = oooOOOO.f5798OooOO0;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // o00O0000.OooO0o
    @NonNull
    public final androidx.savedstate.OooO00o getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f36017OooO0O0;
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        return oooOOOO.f5802OooOOO0;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        Object obj = oooOOOO.f5801OooOOO;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        OooOOOO oooOOOO = this.mAnimationInfo;
        return (oooOOOO == null || (arrayList = oooOOOO.f5796OooO0oO) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        OooOOOO oooOOOO = this.mAnimationInfo;
        return (oooOOOO == null || (arrayList = oooOOOO.f5797OooO0oo) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public final String getString(@StringRes int i) {
        return getResources().getString(i);
    }

    @Nullable
    public final String getTag() {
        return this.mTag;
    }

    @Nullable
    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.OooO00o oooO00o = FragmentStrictMode.f6069OooO00o;
        Intrinsics.checkNotNullParameter(this, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(this);
        FragmentStrictMode.OooO0OO(getTargetFragmentRequestCodeUsageViolation);
        FragmentStrictMode.OooO00o OooO00o2 = FragmentStrictMode.OooO00o(this);
        if (OooO00o2.f6071OooO00o.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.OooO0o0(OooO00o2, getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            FragmentStrictMode.OooO0O0(OooO00o2, getTargetFragmentRequestCodeUsageViolation);
        }
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(@StringRes int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    @NonNull
    @MainThread
    public LifecycleOwner getViewLifecycleOwner() {
        o000O0o o000o0o2 = this.mViewLifecycleOwner;
        if (o000o0o2 != null) {
            return o000o0o2;
        }
        throw new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @NonNull
    public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NonNull
    public ViewModelStore getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == Lifecycle.State.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap<String, ViewModelStore> map = this.mFragmentManager.f5853Oooo0o.f5977OooO0OO;
        ViewModelStore viewModelStore = map.get(this.mWho);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        map.put(this.mWho, viewModelStore2);
        return viewModelStore2;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new o00000O0();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (!this.mHidden) {
            FragmentManager fragmentManager = this.mFragmentManager;
            if (fragmentManager == null) {
                return false;
            }
            Fragment fragment = this.mParentFragment;
            fragmentManager.getClass();
            if (!(fragment == null ? false : fragment.isHidden())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
        if (this.mMenuVisible) {
            if (this.mFragmentManager == null) {
                return true;
            }
            Fragment fragment = this.mParentFragment;
            if (fragment == null ? true : fragment.isMenuVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isPostponed() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return false;
        }
        return oooOOOO.f5808OooOo0;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.Oooo0oO();
    }

    public boolean isVisiableSystem() {
        return isAdded();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.Oooo();
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @CallSuper
    @MainThread
    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        o0Oo0oo<?> o0oo0oo2 = this.mHost;
        Activity activity = o0oo0oo2 == null ? null : o0oo0oo2.f6052OooO0Oo;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    @MainThread
    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @CallSuper
    @MainThread
    public void onCreate(@Nullable Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f5837OooOo00 >= 1) {
            return;
        }
        fragmentManager.f5848Oooo000 = false;
        fragmentManager.f5849Oooo00O = false;
        fragmentManager.f5853Oooo0o.f5979OooO0o = false;
        fragmentManager.OooOo00(1);
    }

    @Nullable
    @MainThread
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    @Nullable
    @MainThread
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @MainThread
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, @Nullable ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @MainThread
    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    @Nullable
    @MainThread
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    @CallSuper
    @MainThread
    public void onDestroy() {
        this.mCalled = true;
    }

    @MainThread
    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @CallSuper
    @MainThread
    public void onDestroyView() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @MainThread
    public void onHiddenChanged(boolean z) {
    }

    @CallSuper
    @UiThread
    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
        o0Oo0oo<?> o0oo0oo2 = this.mHost;
        Activity activity = o0oo0oo2 == null ? null : o0oo0oo2.f6052OooO0Oo;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @CallSuper
    @MainThread
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @MainThread
    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @MainThread
    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    @CallSuper
    @MainThread
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @MainThread
    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    @MainThread
    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @CallSuper
    @MainThread
    public void onResume() {
        this.mCalled = true;
    }

    @MainThread
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @CallSuper
    @MainThread
    public void onStart() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onStop() {
        this.mCalled = true;
    }

    @MainThread
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }

    @CallSuper
    @MainThread
    public void onViewStateRestored(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.Oooo();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new o000O0O0(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f5848Oooo000 = false;
        fragmentManager.f5849Oooo00O = false;
        fragmentManager.f5853Oooo0o.f5979OooO0o = false;
        fragmentManager.OooOo00(4);
    }

    public void performAttach() {
        Iterator<OooOo00> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().OooO00o();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.OooO0O0(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f6054OooO0o0);
        if (!this.mCalled) {
            throw new o000O0O0(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator<o00000OO> it2 = this.mFragmentManager.f5828OooOOO.iterator();
        while (it2.hasNext()) {
            it2.next().OooO00o(this);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f5848Oooo000 = false;
        fragmentManager.f5849Oooo00O = false;
        fragmentManager.f5853Oooo0o.f5979OooO0o = false;
        fragmentManager.OooOo00(0);
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.OooO(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.Oooo();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new LifecycleEventObserver() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                View view;
                if (event != Lifecycle.Event.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new o000O0O0(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.OooOO0(menu, menuInflater);
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.mChildFragmentManager.Oooo();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new o000O0o(this, getViewModelStore(), new o000oOoO(this, 0));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f6037OooO0oo != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.OooO0O0();
        if (FragmentManager.Oooo0O0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        ViewTreeLifecycleOwner.set(this.mView, this.mViewLifecycleOwner);
        ViewTreeViewModelStoreOwner.set(this.mView, this.mViewLifecycleOwner);
        o00O0000.OooO.OooO0O0(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.OooOO0O();
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new o000O0O0(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.OooOo00(1);
        if (this.mView != null) {
            o000O0o o000o0o2 = this.mViewLifecycleOwner;
            o000o0o2.OooO0O0();
            if (o000o0o2.f6037OooO0oo.getState().isAtLeast(Lifecycle.State.CREATED)) {
                this.mViewLifecycleOwner.OooO00o(Lifecycle.Event.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new o000O0O0(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        p190o00o0O.Oooo000<o0000oOO.o0OOO0o.OooO00o> oooo000 = p065o0000oOO.o0ooOOo.OooO00o(this).f33795OooO0O0.f33797OooO00o;
        int iOooO = oooo000.OooO();
        for (int i = 0; i < iOooO; i++) {
            oooo000.OooOO0(i).getClass();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new o000O0O0(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " did not call through to super.onDetach()"));
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f5850Oooo00o) {
            return;
        }
        fragmentManager.OooOO0O();
        this.mChildFragmentManager = new o00000O0();
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.OooOOOO(menuItem);
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.OooOOOo(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.OooOo00(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.OooO00o(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new o000O0O0(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.OooOOoo(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zOooo0o = FragmentManager.Oooo0o(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zOooo0o) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zOooo0o);
            onPrimaryNavigationFragmentChanged(zOooo0o);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.Ooooooo();
            fragmentManager.OooOOo0(fragmentManager.f5835OooOo);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.Oooo();
        this.mChildFragmentManager.OooOo(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new o000O0O0(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " did not call through to super.onResume()"));
        }
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        lifecycleRegistry.handleLifecycleEvent(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.OooO00o(event);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f5848Oooo000 = false;
        fragmentManager.f5849Oooo00O = false;
        fragmentManager.f5853Oooo0o.f5979OooO0o = false;
        fragmentManager.OooOo00(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.Oooo();
        this.mChildFragmentManager.OooOo(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new o000O0O0(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " did not call through to super.onStart()"));
        }
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        lifecycleRegistry.handleLifecycleEvent(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.OooO00o(event);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f5848Oooo000 = false;
        fragmentManager.f5849Oooo00O = false;
        fragmentManager.f5853Oooo0o.f5979OooO0o = false;
        fragmentManager.OooOo00(5);
    }

    public void performStop() {
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f5849Oooo00O = true;
        fragmentManager.f5853Oooo0o.f5979OooO0o = true;
        fragmentManager.OooOo00(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.OooO00o(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new o000O0O0(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.OooOo00(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f5808OooOo0 = true;
    }

    @NonNull
    @MainThread
    public final <I, O> androidx.activity.result.OooO0O0<I> registerForActivityResult(@NonNull p011OooOo0.OooOO0<I, O> oooOO1, @NonNull androidx.activity.result.OooO00o<O> oooO00o) {
        return prepareCallInternal(oooOO1, new OooOO0O(), oooO00o);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f5843OooOoo == null) {
            parentFragmentManager.f5836OooOo0.getClass();
            return;
        }
        parentFragmentManager.f5845OooOooO.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
        parentFragmentManager.f5843OooOoo.OooO0O0(strArr);
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " not attached to an activity."));
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " does not have any arguments."));
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " not attached to a context."));
    }

    @NonNull
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " not attached to a host."));
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.OoooOOo(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f5848Oooo000 = false;
        fragmentManager.f5849Oooo00O = false;
        fragmentManager.f5853Oooo0o.f5979OooO0o = false;
        fragmentManager.OooOo00(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new o000O0O0(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.OooO00o(Lifecycle.Event.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f5804OooOOOo = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f5803OooOOOO = Boolean.valueOf(z);
    }

    public void setAnimations(@AnimRes int i, @AnimRes int i2, @AnimRes int i3, @AnimRes int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().f5791OooO0O0 = i;
        ensureAnimationInfo().f5792OooO0OO = i2;
        ensureAnimationInfo().f5793OooO0Oo = i3;
        ensureAnimationInfo().f5795OooO0o0 = i4;
    }

    public void setArguments(@Nullable Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@Nullable o00000O.oo0o0Oo oo0o0oo) {
        ensureAnimationInfo().f5806OooOOo0 = oo0o0oo;
    }

    public void setEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f5789OooO = obj;
    }

    public void setExitSharedElementCallback(@Nullable o00000O.oo0o0Oo oo0o0oo) {
        ensureAnimationInfo().f5805OooOOo = oo0o0oo;
    }

    public void setExitTransition(@Nullable Object obj) {
        ensureAnimationInfo().f5799OooOO0O = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f5809OooOo00 = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.OooO0oo();
        }
    }

    public void setInitialSavedState(@Nullable SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f5810OooO0Oo) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.OooO0oo();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f5794OooO0o = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f5790OooO00o = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().f5807OooOOoo = f;
    }

    public void setReenterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f5800OooOO0o = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        FragmentStrictMode.OooO00o oooO00o = FragmentStrictMode.f6069OooO00o;
        Intrinsics.checkNotNullParameter(this, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(this);
        FragmentStrictMode.OooO0OO(setRetainInstanceUsageViolation);
        FragmentStrictMode.OooO00o OooO00o2 = FragmentStrictMode.OooO00o(this);
        if (OooO00o2.f6071OooO00o.contains(FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && FragmentStrictMode.OooO0o0(OooO00o2, getClass(), SetRetainInstanceUsageViolation.class)) {
            FragmentStrictMode.OooO0O0(OooO00o2, setRetainInstanceUsageViolation);
        }
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.f5853Oooo0o.OooO0O0(this);
        } else {
            fragmentManager.f5853Oooo0o.OooO0o0(this);
        }
    }

    public void setReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f5798OooOO0 = obj;
    }

    public void setSharedElementEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f5802OooOOO0 = obj;
    }

    public void setSharedElementNames(@Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        OooOOOO oooOOOO = this.mAnimationInfo;
        oooOOOO.f5796OooO0oO = arrayList;
        oooOOOO.f5797OooO0oo = arrayList2;
    }

    public void setSharedElementReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f5801OooOOO = obj;
    }

    @Deprecated
    public void setTargetFragment(@Nullable Fragment targetFragment, int i) {
        if (targetFragment != null) {
            FragmentStrictMode.OooO00o oooO00o = FragmentStrictMode.f6069OooO00o;
            Intrinsics.checkNotNullParameter(this, "violatingFragment");
            Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
            SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(this, targetFragment, i);
            FragmentStrictMode.OooO0OO(setTargetFragmentUsageViolation);
            FragmentStrictMode.OooO00o OooO00o2 = FragmentStrictMode.OooO00o(this);
            if (OooO00o2.f6071OooO00o.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.OooO0o0(OooO00o2, getClass(), SetTargetFragmentUsageViolation.class)) {
                FragmentStrictMode.OooO0O0(OooO00o2, setTargetFragmentUsageViolation);
            }
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = targetFragment != null ? targetFragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", targetFragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment targetFragment2 = targetFragment; targetFragment2 != null; targetFragment2 = targetFragment2.getTargetFragment(false)) {
            if (targetFragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + targetFragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (targetFragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || targetFragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = targetFragment;
        } else {
            this.mTargetWho = targetFragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        FragmentStrictMode.OooO00o oooO00o = FragmentStrictMode.f6069OooO00o;
        Intrinsics.checkNotNullParameter(this, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(this, z);
        FragmentStrictMode.OooO0OO(setUserVisibleHintViolation);
        FragmentStrictMode.OooO00o OooO00o2 = FragmentStrictMode.OooO00o(this);
        if (OooO00o2.f6071OooO00o.contains(FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT) && FragmentStrictMode.OooO0o0(OooO00o2, getClass(), SetUserVisibleHintViolation.class)) {
            FragmentStrictMode.OooO0O0(OooO00o2, setUserVisibleHintViolation);
        }
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            o0000 o0000VarOooO0o = fragmentManager.OooO0o(this);
            Fragment fragment = o0000VarOooO0o.f5966OooO0OO;
            if (fragment.mDeferStart) {
                if (fragmentManager.f5818OooO0O0) {
                    fragmentManager.f5847Oooo0 = true;
                } else {
                    fragment.mDeferStart = false;
                    o0000VarOooO0o.OooOO0O();
                }
            }
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        o0Oo0oo<?> o0oo0oo2 = this.mHost;
        if (o0oo0oo2 != null) {
            return o0oo0oo2.OooO0oO(str);
        }
        return false;
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2 = intent;
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " not attached to Activity"));
        }
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f5844OooOoo0 == null) {
            o0Oo0oo<?> o0oo0oo2 = parentFragmentManager.f5836OooOo0;
            if (i != -1) {
                o0oo0oo2.getClass();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            Activity activity = o0oo0oo2.f6052OooO0Oo;
            int i5 = o00000O.OooO0O0.f33405OooO0OO;
            o00000O.OooO0O0.OooO00o.OooO0OO(activity, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (FragmentManager.Oooo0O0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i2, i3);
        parentFragmentManager.f5845OooOooO.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.f5844OooOoo0.OooO0O0(intentSenderRequest);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f5808OooOo0) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f5808OooOo0 = false;
        } else if (Looper.myLooper() != this.mHost.f6053OooO0o.getLooper()) {
            this.mHost.f6053OooO0o.postAtFrontOfQueue(new OooO0o());
        } else {
            callStartTransitionListener(true);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Bundle f5810OooO0Oo;

        public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Bundle bundle) {
            this.f5810OooO0Oo = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeBundle(this.f5810OooO0Oo);
        }

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f5810OooO0Oo = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    @Nullable
    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            FragmentStrictMode.OooO00o oooO00o = FragmentStrictMode.f6069OooO00o;
            Intrinsics.checkNotNullParameter(this, "fragment");
            GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(this);
            FragmentStrictMode.OooO0OO(getTargetFragmentUsageViolation);
            FragmentStrictMode.OooO00o OooO00o2 = FragmentStrictMode.OooO00o(this);
            if (OooO00o2.f6071OooO00o.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.OooO0o0(OooO00o2, getClass(), GetTargetFragmentUsageViolation.class)) {
                FragmentStrictMode.OooO0O0(OooO00o2, getTargetFragmentUsageViolation);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.OooOoOO(str);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle) {
        try {
            Fragment fragmentNewInstance = o0OOO0o.OooO0O0(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.setArguments(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e) {
            throw new InstantiationException(p004OooO0oO.o000oOoO.OooO0O0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (java.lang.InstantiationException e2) {
            throw new InstantiationException(p004OooO0oO.o000oOoO.OooO0O0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException(p004OooO0oO.o000oOoO.OooO0O0("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException(p004OooO0oO.o000oOoO.OooO0O0("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    @NonNull
    public final String getString(@StringRes int i, @Nullable Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, @NonNull TimeUnit timeUnit) {
        ensureAnimationInfo().f5808OooOo0 = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.f5836OooOo0.f6053OooO0o;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    @NonNull
    @MainThread
    public final <I, O> androidx.activity.result.OooO0O0<I> registerForActivityResult(@NonNull p011OooOo0.OooOO0<I, O> oooOO1, @NonNull androidx.activity.result.OooO oooO, @NonNull androidx.activity.result.OooO00o<O> oooO00o) {
        return prepareCallInternal(oooOO1, new OooOOO0(oooO), oooO00o);
    }

    public void startActivity(@NonNull Intent intent, @Nullable Bundle bundle) {
        o0Oo0oo<?> o0oo0oo2 = this.mHost;
        if (o0oo0oo2 == null) {
            throw new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " not attached to Activity"));
        }
        Object obj = ContextCompat.f5281OooO00o;
        ContextCompat.OooO00o.OooO0O0(o0oo0oo2.f6054OooO0o0, intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i, @Nullable Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f5842OooOoOO != null) {
            parentFragmentManager.f5845OooOooO.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f5842OooOoOO.OooO0O0(intent);
            return;
        }
        o0Oo0oo<?> o0oo0oo2 = parentFragmentManager.f5836OooOo0;
        o0oo0oo2.getClass();
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        Object obj = ContextCompat.f5281OooO00o;
        ContextCompat.OooO00o.OooO0O0(o0oo0oo2.f6054OooO0o0, intent, bundle);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle) {
        o0Oo0oo<?> o0oo0oo2 = this.mHost;
        if (o0oo0oo2 != null) {
            LayoutInflater layoutInflaterOooO0o = o0oo0oo2.OooO0o();
            layoutInflaterOooO0o.setFactory2(this.mChildFragmentManager.f5821OooO0o);
            return layoutInflaterOooO0o;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @CallSuper
    @UiThread
    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @ContentView
    public Fragment(@LayoutRes int i) {
        this();
        this.mContentLayoutId = i;
    }

    private void restoreViewState() {
        if (FragmentManager.Oooo0O0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }
}
