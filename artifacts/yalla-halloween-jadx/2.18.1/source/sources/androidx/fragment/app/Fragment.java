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
import androidx.activity.result.ActivityResultRegistry;
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
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, p094o000o0OO.o00Oo0 {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public OooOOOO mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    private boolean mCalled;

    @NonNull
    public FragmentManager mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;

    @LayoutRes
    private int mContentLayoutId;
    public ViewModelProvider.Factory mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManager mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public oo000o<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public LifecycleRegistry mLifecycleRegistry;
    public Lifecycle.State mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<OooOo00> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    private final OooOo00 mSavedStateAttachListener;
    public p094o000o0OO.o00O0O mSavedStateRegistryController;

    @Nullable
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;

    @Nullable
    public o000OO mViewLifecycleOwner;
    public MutableLiveData<LifecycleOwner> mViewLifecycleOwnerLiveData;

    @NonNull
    public String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(@NonNull String str, @Nullable Exception exc) {
            super(str, exc);
        }
    }

    public class OooO implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O0o f8247Oooo0o;

        public OooO(o000O0o o000o0o2) {
            this.f8247Oooo0o = o000o0o2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f8247Oooo0o.OooO0OO();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class OooO00o<I> extends androidx.activity.result.OooO0O0<I> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f8248OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ p011OooOOoo.OooO f8249OooO0O0;

        public OooO00o(AtomicReference atomicReference, p011OooOOoo.OooO oooO) {
            this.f8248OooO00o = atomicReference;
            this.f8249OooO0O0 = oooO;
        }

        @Override // androidx.activity.result.OooO0O0
        @NonNull
        public final p011OooOOoo.OooO<I, ?> OooO00o() {
            return this.f8249OooO0O0;
        }

        @Override // androidx.activity.result.OooO0O0
        public final void OooO0O0(Object obj) {
            androidx.activity.result.OooO0O0 oooO0O0 = (androidx.activity.result.OooO0O0) this.f8248OooO00o.get();
            if (oooO0O0 == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            oooO0O0.OooO0O0(obj);
        }

        @Override // androidx.activity.result.OooO0O0
        public final void OooO0OO() {
            androidx.activity.result.OooO0O0 oooO0O0 = (androidx.activity.result.OooO0O0) this.f8248OooO00o.getAndSet(null);
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
            Fragment.this.mSavedStateRegistryController.OooO0O0();
            SavedStateHandleSupport.enableSavedStateHandles(Fragment.this);
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

    public class OooOO0 extends o00O0O {
        public OooOO0() {
        }

        @Override // androidx.fragment.app.o00O0O
        @Nullable
        public final View OooO0O0(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Fragment ");
            sbOooO0o0.append(Fragment.this);
            sbOooO0o0.append(" does not have a view");
            throw new IllegalStateException(sbOooO0o0.toString());
        }

        @Override // androidx.fragment.app.o00O0O
        public final boolean OooO0OO() {
            return Fragment.this.mView != null;
        }
    }

    public class OooOO0O implements Function<Void, ActivityResultRegistry> {
        public OooOO0O() {
        }

        @Override // androidx.arch.core.util.Function
        public final ActivityResultRegistry apply(Void r3) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof androidx.activity.result.OooO0OO ? ((androidx.activity.result.OooO0OO) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    public class OooOOO extends OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Function f8255OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f8256OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ p011OooOOoo.OooO f8257OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.OooO00o f8258OooO0Oo;

        public OooOOO(Function function, AtomicReference atomicReference, p011OooOOoo.OooO oooO, androidx.activity.result.OooO00o oooO00o) {
            this.f8255OooO00o = function;
            this.f8256OooO0O0 = atomicReference;
            this.f8257OooO0OO = oooO;
            this.f8258OooO0Oo = oooO00o;
        }

        @Override // androidx.fragment.app.Fragment.OooOo00
        public final void OooO00o() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f8256OooO0O0.set(((ActivityResultRegistry) this.f8255OooO00o.apply(null)).OooO0o0(strGenerateActivityResultKey, Fragment.this, this.f8257OooO0OO, this.f8258OooO0Oo));
        }
    }

    public class OooOOO0 implements Function<Void, ActivityResultRegistry> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ ActivityResultRegistry f8260OooO00o;

        public OooOOO0(ActivityResultRegistry activityResultRegistry) {
            this.f8260OooO00o = activityResultRegistry;
        }

        @Override // androidx.arch.core.util.Function
        public final ActivityResultRegistry apply(Void r1) {
            return this.f8260OooO00o;
        }
    }

    public static class OooOOOO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Object f8261OooO = null;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f8262OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @AnimRes
        public int f8263OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @AnimRes
        public int f8264OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @AnimRes
        public int f8265OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f8266OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @AnimRes
        public int f8267OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ArrayList<String> f8268OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ArrayList<String> f8269OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Object f8270OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Object f8271OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Object f8272OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Object f8273OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public Object f8274OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Boolean f8275OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public Boolean f8276OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public View f8277OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public float f8278OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public boolean f8279OooOOoo;

        public OooOOOO() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f8270OooOO0 = obj;
            this.f8271OooOO0O = null;
            this.f8272OooOO0o = obj;
            this.f8274OooOOO0 = null;
            this.f8273OooOOO = obj;
            this.f8278OooOOo0 = 1.0f;
            this.f8277OooOOo = null;
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
        this.mChildFragmentManager = new o000OOo();
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
        this.mSavedStateRegistryController = p094o000o0OO.o00O0O.OooO00o(this);
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

    @NonNull
    private <I, O> androidx.activity.result.OooO0O0<I> prepareCallInternal(@NonNull p011OooOOoo.OooO<I, O> oooO, @NonNull Function<Void, ActivityResultRegistry> function, @NonNull androidx.activity.result.OooO00o<O> oooO00o) {
        if (this.mState > 1) {
            throw new IllegalStateException(OooO0o.OooO0o.OooO0O0("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new OooOOO(function, atomicReference, oooO, oooO00o));
        return new OooO00o(atomicReference, oooO);
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
            oooOOOO.f8279OooOOoo = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        o000O0o o000o0oOooO0oO = o000O0o.OooO0oO(viewGroup, fragmentManager.Oooo0o0());
        o000o0oOooO0oO.OooO0oo();
        if (z) {
            this.mHost.f8530Oooo0oo.post(new OooO(o000o0oOooO0oO));
        } else {
            o000o0oOooO0oO.OooO0OO();
        }
    }

    @NonNull
    public o00O0O createFragmentContainer() {
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
            p082o000OoOO.OooOOO.OooO0O0(this).OooO00o(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + CertificateUtil.DELIMITER);
        this.mChildFragmentManager.OooOo0o(p016OooOoO0.OooOo00.OooO0Oo(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f8289OooO0OO.OooO0Oo(str);
    }

    @NonNull
    public String generateActivityResultKey() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("fragment_");
        sbOooO0o0.append(this.mWho);
        sbOooO0o0.append("_rq#");
        sbOooO0o0.append(this.mNextLocalRequestCode.getAndIncrement());
        return sbOooO0o0.toString();
    }

    @Nullable
    public final FragmentActivity getActivity() {
        oo000o<?> oo000oVar = this.mHost;
        if (oo000oVar == null) {
            return null;
        }
        return (FragmentActivity) oo000oVar.f8528Oooo0o;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null || (bool = oooOOOO.f8276OooOOOo) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null || (bool = oooOOOO.f8275OooOOOO) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        Objects.requireNonNull(oooOOOO);
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
        throw new IllegalStateException(OooO0o.OooO0o.OooO0O0("Fragment ", this, " has not been attached yet."));
    }

    @Nullable
    public Context getContext() {
        oo000o<?> oo000oVar = this.mHost;
        if (oo000oVar == null) {
            return null;
        }
        return oo000oVar.f8529Oooo0oO;
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
        if (application == null && FragmentManager.Oooo0oO(3)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Could not find Application instance from Context ");
            sbOooO0o0.append(requireContext().getApplicationContext());
            sbOooO0o0.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            Log.d("FragmentManager", sbOooO0o0.toString());
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
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Application application = null;
            for (Context applicationContext = requireContext().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            if (application == null && FragmentManager.Oooo0oO(3)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Could not find Application instance from Context ");
                sbOooO0o0.append(requireContext().getApplicationContext());
                sbOooO0o0.append(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                Log.d("FragmentManager", sbOooO0o0.toString());
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
        return oooOOOO.f8263OooO0O0;
    }

    @Nullable
    public Object getEnterTransition() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        return oooOOOO.f8261OooO;
    }

    public p070o0000ooO.o0000O0O getEnterTransitionCallback() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        Objects.requireNonNull(oooOOOO);
        return null;
    }

    @AnimRes
    public int getExitAnim() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return 0;
        }
        return oooOOOO.f8264OooO0OO;
    }

    @Nullable
    public Object getExitTransition() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        return oooOOOO.f8271OooOO0O;
    }

    public p070o0000ooO.o0000O0O getExitTransitionCallback() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        Objects.requireNonNull(oooOOOO);
        return null;
    }

    public View getFocusedView() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        return oooOOOO.f8277OooOOo;
    }

    @Nullable
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable
    public final Object getHost() {
        oo000o<?> oo000oVar = this.mHost;
        if (oo000oVar == null) {
            return null;
        }
        return oo000oVar.OooO0o0();
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
    public p082o000OoOO.OooOOO getLoaderManager() {
        return p082o000OoOO.OooOOO.OooO0O0(this);
    }

    public int getNextTransition() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return 0;
        }
        return oooOOOO.f8266OooO0o;
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
        throw new IllegalStateException(OooO0o.OooO0o.OooO0O0("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return false;
        }
        return oooOOOO.f8262OooO00o;
    }

    @AnimRes
    public int getPopEnterAnim() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return 0;
        }
        return oooOOOO.f8265OooO0Oo;
    }

    @AnimRes
    public int getPopExitAnim() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return 0;
        }
        return oooOOOO.f8267OooO0o0;
    }

    public float getPostOnViewCreatedAlpha() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return 1.0f;
        }
        return oooOOOO.f8278OooOOo0;
    }

    @Nullable
    public Object getReenterTransition() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        Object obj = oooOOOO.f8272OooOO0o;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f8532OooO00o;
        Intrinsics.checkNotNullParameter(this, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(this);
        FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f8532OooO00o;
        FragmentStrictMode.OooO0OO(getRetainInstanceUsageViolation);
        FragmentStrictMode.OooO0O0 oooO0O0OooO00o = FragmentStrictMode.OooO00o(this);
        if (oooO0O0OooO00o.f8535OooO00o.contains(FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && FragmentStrictMode.OooO0o(oooO0O0OooO00o, getClass(), GetRetainInstanceUsageViolation.class)) {
            FragmentStrictMode.OooO0O0(oooO0O0OooO00o, getRetainInstanceUsageViolation);
        }
        return this.mRetainInstance;
    }

    @Nullable
    public Object getReturnTransition() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        Object obj = oooOOOO.f8270OooOO0;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // p094o000o0OO.o00Oo0
    @NonNull
    public final p094o000o0OO.o0OoOo0 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f29285OooO0O0;
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        return oooOOOO.f8274OooOOO0;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return null;
        }
        Object obj = oooOOOO.f8273OooOOO;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        OooOOOO oooOOOO = this.mAnimationInfo;
        return (oooOOOO == null || (arrayList = oooOOOO.f8268OooO0oO) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        OooOOOO oooOOOO = this.mAnimationInfo;
        return (oooOOOO == null || (arrayList = oooOOOO.f8269OooO0oo) == null) ? new ArrayList<>() : arrayList;
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
        FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f8532OooO00o;
        Intrinsics.checkNotNullParameter(this, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(this);
        FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f8532OooO00o;
        FragmentStrictMode.OooO0OO(getTargetFragmentRequestCodeUsageViolation);
        FragmentStrictMode.OooO0O0 oooO0O0OooO00o = FragmentStrictMode.OooO00o(this);
        if (oooO0O0OooO00o.f8535OooO00o.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.OooO0o(oooO0O0OooO00o, getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            FragmentStrictMode.OooO0O0(oooO0O0OooO00o, getTargetFragmentRequestCodeUsageViolation);
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
        o000OO o000oo2 = this.mViewLifecycleOwner;
        if (o000oo2 != null) {
            return o000oo2;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
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
        o000000 o000000Var = this.mFragmentManager.f8323Oooo0o;
        ViewModelStore viewModelStore = o000000Var.f8427OooO0OO.get(this.mWho);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        o000000Var.f8427OooO0OO.put(this.mWho, viewModelStore2);
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
        this.mChildFragmentManager = new o000OOo();
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
            Objects.requireNonNull(fragmentManager);
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
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.Oooo(this.mParentFragment));
    }

    public boolean isPostponed() {
        OooOOOO oooOOOO = this.mAnimationInfo;
        if (oooOOOO == null) {
            return false;
        }
        return oooOOOO.f8279OooOOoo;
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
        return fragmentManager.OoooO0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.OoooO();
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (FragmentManager.Oooo0oO(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @CallSuper
    @MainThread
    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        oo000o<?> oo000oVar = this.mHost;
        Activity activity = oo000oVar == null ? null : oo000oVar.f8528Oooo0o;
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
        restoreChildFragmentState(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f8307OooOo00 >= 1) {
            return;
        }
        fragmentManager.OooOO0();
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
        oo000o<?> oo000oVar = this.mHost;
        Activity activity = oo000oVar == null ? null : oo000oVar.f8528Oooo0o;
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
        this.mChildFragmentManager.OoooO();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new o000O0(OooO0o.OooO0o.OooO0O0("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f8318Oooo000 = false;
        fragmentManager.f8319Oooo00O = false;
        fragmentManager.f8323Oooo0o.f8429OooO0o = false;
        fragmentManager.OooOo0(4);
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
        onAttach(this.mHost.f8529Oooo0oO);
        if (!this.mCalled) {
            throw new o000O0(OooO0o.OooO0o.OooO0O0("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator<o000000O> it2 = this.mFragmentManager.f8298OooOOO.iterator();
        while (it2.hasNext()) {
            it2.next().OooO00o(this);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f8318Oooo000 = false;
        fragmentManager.f8319Oooo00O = false;
        fragmentManager.f8323Oooo0o.f8429OooO0o = false;
        fragmentManager.OooOo0(0);
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.OooO0oo(configuration);
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
        this.mChildFragmentManager.OoooO();
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
        this.mSavedStateRegistryController.OooO0OO(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new o000O0(OooO0o.OooO0o.OooO0O0("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.OooOO0O(menu, menuInflater);
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.mChildFragmentManager.OoooO();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new o000OO(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f8500Oooo != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.OooO0O0();
            ViewTreeLifecycleOwner.set(this.mView, this.mViewLifecycleOwner);
            ViewTreeViewModelStoreOwner.set(this.mView, this.mViewLifecycleOwner);
            p094o000o0OO.o00Ooo.OooO0O0(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.OooOO0o();
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new o000O0(OooO0o.OooO0o.OooO0O0("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.OooOo0(1);
        if (this.mView != null) {
            o000OO o000oo2 = this.mViewLifecycleOwner;
            o000oo2.OooO0O0();
            if (o000oo2.f8500Oooo.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                this.mViewLifecycleOwner.OooO00o(Lifecycle.Event.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new o000O0(OooO0o.OooO0o.OooO0O0("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        o000OoOO.OooOOOO.OooO0O0 oooO0O0 = ((p082o000OoOO.OooOOOO) p082o000OoOO.OooOOO.OooO0O0(this)).f28359OooO0O0;
        int iOooOO0o = oooO0O0.f28361OooO00o.OooOO0o();
        for (int i = 0; i < iOooOO0o; i++) {
            Objects.requireNonNull(oooO0O0.f28361OooO00o.OooOOO0(i));
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new o000O0(OooO0o.OooO0o.OooO0O0("Fragment ", this, " did not call through to super.onDetach()"));
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f8320Oooo00o) {
            return;
        }
        fragmentManager.OooOO0o();
        this.mChildFragmentManager = new o000OOo();
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.OooOOO0();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.OooOOO(z);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.OooOOOo(menuItem);
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.OooOOo0(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.OooOo0(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.OooO00o(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new o000O0(OooO0o.OooO0o.OooO0O0("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.OooOOoo(z);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.OooOo00(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean zOoooO00 = this.mFragmentManager.OoooO00(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zOoooO00) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zOoooO00);
            onPrimaryNavigationFragmentChanged(zOoooO00);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.o00O0O();
            fragmentManager.OooOOo(fragmentManager.f8305OooOo);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.OoooO();
        this.mChildFragmentManager.OooOoOO(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new o000O0(OooO0o.OooO0o.OooO0O0("Fragment ", this, " did not call through to super.onResume()"));
        }
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        lifecycleRegistry.handleLifecycleEvent(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.OooO00o(event);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f8318Oooo000 = false;
        fragmentManager.f8319Oooo00O = false;
        fragmentManager.f8323Oooo0o.f8429OooO0o = false;
        fragmentManager.OooOo0(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.OooO0Oo(bundle);
        bundle.putParcelable("android:support:fragments", this.mChildFragmentManager.Ooooo0o());
    }

    public void performStart() {
        this.mChildFragmentManager.OoooO();
        this.mChildFragmentManager.OooOoOO(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new o000O0(OooO0o.OooO0o.OooO0O0("Fragment ", this, " did not call through to super.onStart()"));
        }
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        lifecycleRegistry.handleLifecycleEvent(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.OooO00o(event);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f8318Oooo000 = false;
        fragmentManager.f8319Oooo00O = false;
        fragmentManager.f8323Oooo0o.f8429OooO0o = false;
        fragmentManager.OooOo0(5);
    }

    public void performStop() {
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f8319Oooo00O = true;
        fragmentManager.f8323Oooo0o.f8429OooO0o = true;
        fragmentManager.OooOo0(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.OooO00o(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new o000O0(OooO0o.OooO0o.OooO0O0("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.OooOo0(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f8279OooOOoo = true;
    }

    @NonNull
    @MainThread
    public final <I, O> androidx.activity.result.OooO0O0<I> registerForActivityResult(@NonNull p011OooOOoo.OooO<I, O> oooO, @NonNull androidx.activity.result.OooO00o<O> oooO00o) {
        return prepareCallInternal(oooO, new OooOO0O(), oooO00o);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i) {
        if (this.mHost == null) {
            throw new IllegalStateException(OooO0o.OooO0o.OooO0O0("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f8313OooOoo == null) {
            Objects.requireNonNull(parentFragmentManager.f8306OooOo0);
            return;
        }
        parentFragmentManager.f8315OooOooO.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
        parentFragmentManager.f8313OooOoo.OooO0O0(strArr);
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(OooO0o.OooO0o.OooO0O0("Fragment ", this, " not attached to an activity."));
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(OooO0o.OooO0o.OooO0O0("Fragment ", this, " does not have any arguments."));
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(OooO0o.OooO0o.OooO0O0("Fragment ", this, " not attached to a context."));
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
        throw new IllegalStateException(OooO0o.OooO0o.OooO0O0("Fragment ", this, " not attached to a host."));
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(OooO0o.OooO0o.OooO0O0("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(OooO0o.OooO0o.OooO0O0("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState(@Nullable Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.Ooooo00(parcelable);
        this.mChildFragmentManager.OooOO0();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            o000OO o000oo2 = this.mViewLifecycleOwner;
            o000oo2.f8504OoooO00.OooO0OO(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new o000O0(OooO0o.OooO0o.OooO0O0("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.OooO00o(Lifecycle.Event.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f8276OooOOOo = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f8275OooOOOO = Boolean.valueOf(z);
    }

    public void setAnimations(@AnimRes int i, @AnimRes int i2, @AnimRes int i3, @AnimRes int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().f8263OooO0O0 = i;
        ensureAnimationInfo().f8264OooO0OO = i2;
        ensureAnimationInfo().f8265OooO0Oo = i3;
        ensureAnimationInfo().f8267OooO0o0 = i4;
    }

    public void setArguments(@Nullable Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@Nullable p070o0000ooO.o0000O0O o0000o0o2) {
        Objects.requireNonNull(ensureAnimationInfo());
    }

    public void setEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f8261OooO = obj;
    }

    public void setExitSharedElementCallback(@Nullable p070o0000ooO.o0000O0O o0000o0o2) {
        Objects.requireNonNull(ensureAnimationInfo());
    }

    public void setExitTransition(@Nullable Object obj) {
        ensureAnimationInfo().f8271OooOO0O = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f8277OooOOo = view;
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
        if (savedState == null || (bundle = savedState.f8280Oooo0o) == null) {
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
        this.mAnimationInfo.f8266OooO0o = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f8262OooO00o = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().f8278OooOOo0 = f;
    }

    public void setReenterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f8272OooOO0o = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f8532OooO00o;
        Intrinsics.checkNotNullParameter(this, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(this);
        FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f8532OooO00o;
        FragmentStrictMode.OooO0OO(setRetainInstanceUsageViolation);
        FragmentStrictMode.OooO0O0 oooO0O0OooO00o = FragmentStrictMode.OooO00o(this);
        if (oooO0O0OooO00o.f8535OooO00o.contains(FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && FragmentStrictMode.OooO0o(oooO0O0OooO00o, getClass(), SetRetainInstanceUsageViolation.class)) {
            FragmentStrictMode.OooO0O0(oooO0O0OooO00o, setRetainInstanceUsageViolation);
        }
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.f8323Oooo0o.OooO0O0(this);
        } else {
            fragmentManager.f8323Oooo0o.OooO0o0(this);
        }
    }

    public void setReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f8270OooOO0 = obj;
    }

    public void setSharedElementEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f8274OooOOO0 = obj;
    }

    public void setSharedElementNames(@Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        OooOOOO oooOOOO = this.mAnimationInfo;
        oooOOOO.f8268OooO0oO = arrayList;
        oooOOOO.f8269OooO0oo = arrayList2;
    }

    public void setSharedElementReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f8273OooOOO = obj;
    }

    @Deprecated
    public void setTargetFragment(@Nullable Fragment targetFragment, int i) {
        if (targetFragment != null) {
            FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f8532OooO00o;
            Intrinsics.checkNotNullParameter(this, "violatingFragment");
            Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
            SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(this, targetFragment, i);
            FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f8532OooO00o;
            FragmentStrictMode.OooO0OO(setTargetFragmentUsageViolation);
            FragmentStrictMode.OooO0O0 oooO0O0OooO00o = FragmentStrictMode.OooO00o(this);
            if (oooO0O0OooO00o.f8535OooO00o.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.OooO0o(oooO0O0OooO00o, getClass(), SetTargetFragmentUsageViolation.class)) {
                FragmentStrictMode.OooO0O0(oooO0O0OooO00o, setTargetFragmentUsageViolation);
            }
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = targetFragment != null ? targetFragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException(OooO0o.OooO0o.OooO0O0("Fragment ", targetFragment, " must share the same FragmentManager to be set as a target fragment"));
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
        FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f8532OooO00o;
        Intrinsics.checkNotNullParameter(this, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(this, z);
        FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f8532OooO00o;
        FragmentStrictMode.OooO0OO(setUserVisibleHintViolation);
        FragmentStrictMode.OooO0O0 oooO0O0OooO00o = FragmentStrictMode.OooO00o(this);
        if (oooO0O0OooO00o.f8535OooO00o.contains(FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT) && FragmentStrictMode.OooO0o(oooO0O0OooO00o, getClass(), SetUserVisibleHintViolation.class)) {
            FragmentStrictMode.OooO0O0(oooO0O0OooO00o, setUserVisibleHintViolation);
        }
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.OoooOO0(fragmentManager.OooO0o(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        oo000o<?> oo000oVar = this.mHost;
        if (oo000oVar != null) {
            return oo000oVar.OooO0oO(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2 = intent;
        if (this.mHost == null) {
            throw new IllegalStateException(OooO0o.OooO0o.OooO0O0("Fragment ", this, " not attached to Activity"));
        }
        if (FragmentManager.Oooo0oO(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f8314OooOoo0 == null) {
            oo000o<?> oo000oVar = parentFragmentManager.f8306OooOo0;
            Objects.requireNonNull(oo000oVar);
            if (i != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            Activity activity = oo000oVar.f8528Oooo0o;
            int i5 = p070o0000ooO.o00Oo0.f28002OooO0OO;
            o0000ooO.o00Oo0.OooO0O0.OooO0OO(activity, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (FragmentManager.Oooo0oO(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i2, i3);
        parentFragmentManager.f8315OooOooO.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
        if (FragmentManager.Oooo0oO(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.f8314OooOoo0.OooO0O0(intentSenderRequest);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f8279OooOOoo) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f8279OooOOoo = false;
        } else if (Looper.myLooper() != this.mHost.f8530Oooo0oo.getLooper()) {
            this.mHost.f8530Oooo0oo.postAtFrontOfQueue(new OooO0o());
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
        sb.append("}");
        sb.append(" (");
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Bundle f8280Oooo0o;

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
            this.f8280Oooo0o = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeBundle(this.f8280Oooo0o);
        }

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f8280Oooo0o = bundle;
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
            FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f8532OooO00o;
            Intrinsics.checkNotNullParameter(this, "fragment");
            GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(this);
            FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f8532OooO00o;
            FragmentStrictMode.OooO0OO(getTargetFragmentUsageViolation);
            FragmentStrictMode.OooO0O0 oooO0O0OooO00o = FragmentStrictMode.OooO00o(this);
            if (oooO0O0OooO00o.f8535OooO00o.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.OooO0o(oooO0O0OooO00o, getClass(), GetTargetFragmentUsageViolation.class)) {
                FragmentStrictMode.OooO0O0(oooO0O0OooO00o, getTargetFragmentUsageViolation);
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
        return fragmentManager.OooOooo(str);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle) {
        try {
            Fragment fragmentNewInstance = o00Ooo.OooO0OO(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.setArguments(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e) {
            throw new InstantiationException(OooO0o.OooO0OO.OooO00o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (java.lang.InstantiationException e2) {
            throw new InstantiationException(OooO0o.OooO0OO.OooO00o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException(OooO0o.OooO0OO.OooO00o("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException(OooO0o.OooO0OO.OooO00o("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    @NonNull
    public final String getString(@StringRes int i, @Nullable Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, @NonNull TimeUnit timeUnit) {
        ensureAnimationInfo().f8279OooOOoo = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        Handler handler = fragmentManager != null ? fragmentManager.f8306OooOo0.f8530Oooo0oo : new Handler(Looper.getMainLooper());
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    @NonNull
    @MainThread
    public final <I, O> androidx.activity.result.OooO0O0<I> registerForActivityResult(@NonNull p011OooOOoo.OooO<I, O> oooO, @NonNull ActivityResultRegistry activityResultRegistry, @NonNull androidx.activity.result.OooO00o<O> oooO00o) {
        return prepareCallInternal(oooO, new OooOOO0(activityResultRegistry), oooO00o);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, @Nullable Bundle bundle) {
        oo000o<?> oo000oVar = this.mHost;
        if (oo000oVar == null) {
            throw new IllegalStateException(OooO0o.OooO0o.OooO0O0("Fragment ", this, " not attached to Activity"));
        }
        Objects.requireNonNull(oo000oVar);
        Context context = oo000oVar.f8529Oooo0oO;
        Object obj = o000O000.OooO00o.f28085OooO00o;
        o000O000.OooO00o.C0293OooO00o.OooO0O0(context, intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(OooO0o.OooO0o.OooO0O0("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f8312OooOoOO != null) {
            parentFragmentManager.f8315OooOooO.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f8312OooOoOO.OooO0O0(intent);
            return;
        }
        oo000o<?> oo000oVar = parentFragmentManager.f8306OooOo0;
        Objects.requireNonNull(oo000oVar);
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        Context context = oo000oVar.f8529Oooo0oO;
        Object obj = o000O000.OooO00o.f28085OooO00o;
        o000O000.OooO00o.C0293OooO00o.OooO0O0(context, intent, bundle);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle) {
        oo000o<?> oo000oVar = this.mHost;
        if (oo000oVar != null) {
            LayoutInflater layoutInflaterOooO0o = oo000oVar.OooO0o();
            layoutInflaterOooO0o.setFactory2(this.mChildFragmentManager.f8291OooO0o);
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
        if (FragmentManager.Oooo0oO(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }
}
