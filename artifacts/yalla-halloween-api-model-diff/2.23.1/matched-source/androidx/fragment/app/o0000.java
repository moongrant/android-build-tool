package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.internal.AnalyticsEvents;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo0o0Oo f5969OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000O00 f5970OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Fragment f5971OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f5972OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f5973OooO0o0 = -1;

    public class OooO00o implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ View f5974OooO0Oo;

        public OooO00o(View view) {
            this.f5974OooO0Oo = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f5974OooO0Oo;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
            ViewCompat.OooOOO0.OooO0OO(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f5975OooO00o;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f5975OooO00o = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5975OooO00o[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5975OooO00o[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5975OooO00o[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public o0000(@NonNull oo0o0Oo oo0o0oo, @NonNull o0000O00 o0000o00, @NonNull Fragment fragment) {
        this.f5969OooO00o = oo0o0oo;
        this.f5970OooO0O0 = o0000o00;
        this.f5971OooO0OO = fragment;
    }

    public final void OooO() {
        boolean zOooo0O0 = FragmentManager.Oooo0O0(3);
        Fragment fragment = this.f5971OooO0OO;
        if (zOooo0O0) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        boolean z = false;
        this.f5969OooO00o.OooO0o0(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        boolean z2 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (!z) {
            o00000O o00000o = this.f5970OooO0O0.f5998OooO0Oo;
            if (o00000o.f5980OooO00o.containsKey(fragment.mWho) && o00000o.f5983OooO0Oo) {
                z2 = o00000o.f5985OooO0o0;
            }
            if (!z2) {
                return;
            }
        }
        if (FragmentManager.Oooo0O0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void OooO00o() {
        boolean zOooo0O0 = FragmentManager.Oooo0O0(3);
        Fragment fragment = this.f5971OooO0OO;
        if (zOooo0O0) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        fragment.performActivityCreated(bundle2);
        this.f5969OooO00o.OooO00o(fragment, bundle2, false);
    }

    public final void OooO0O0() {
        Fragment expectedParentFragment;
        int iIndexOfChild;
        View view;
        View view2;
        Fragment fragment = this.f5971OooO0OO;
        View view3 = fragment.mContainer;
        while (true) {
            expectedParentFragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(p062o0000o0o.o000000O.fragment_container_view_tag);
            Fragment fragment2 = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment2 != null) {
                expectedParentFragment = fragment2;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        Fragment parentFragment = fragment.getParentFragment();
        if (expectedParentFragment != null && !expectedParentFragment.equals(parentFragment)) {
            int i = fragment.mContainerId;
            FragmentStrictMode.OooO00o oooO00o = FragmentStrictMode.f6074OooO00o;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, expectedParentFragment, i);
            FragmentStrictMode.OooO0OO(wrongNestedHierarchyViolation);
            FragmentStrictMode.OooO00o OooO00o2 = FragmentStrictMode.OooO00o(fragment);
            if (OooO00o2.f6076OooO00o.contains(FragmentStrictMode.Flag.DETECT_WRONG_NESTED_HIERARCHY) && FragmentStrictMode.OooO0o0(OooO00o2, fragment.getClass(), WrongNestedHierarchyViolation.class)) {
                FragmentStrictMode.OooO0O0(OooO00o2, wrongNestedHierarchyViolation);
            }
        }
        o0000O00 o0000o00 = this.f5970OooO0O0;
        o0000o00.getClass();
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            iIndexOfChild = -1;
        } else {
            ArrayList<Fragment> arrayList = o0000o00.f5995OooO00o;
            int iIndexOf = arrayList.indexOf(fragment);
            for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
                Fragment fragment3 = arrayList.get(i2);
                if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                Fragment fragment4 = arrayList.get(iIndexOf);
                if (fragment4.mContainer == viewGroup && (view = fragment4.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                }
            }
            iIndexOfChild = -1;
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    public final void OooO0OO() {
        boolean zOooo0O0 = FragmentManager.Oooo0O0(3);
        Fragment fragment = this.f5971OooO0OO;
        if (zOooo0O0) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        o0000 o0000Var = null;
        o0000O00 o0000o00 = this.f5970OooO0O0;
        if (fragment2 != null) {
            o0000 o0000Var2 = o0000o00.f5996OooO0O0.get(fragment2.mWho);
            if (o0000Var2 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            o0000Var = o0000Var2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (o0000Var = o0000o00.f5996OooO0O0.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(o0oOO.OooO00o(sb, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (o0000Var != null) {
            o0000Var.OooOO0O();
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        fragment.mHost = fragmentManager.f5841OooOo0;
        fragment.mParentFragment = fragmentManager.f5844OooOo0o;
        oo0o0Oo oo0o0oo = this.f5969OooO00o;
        oo0o0oo.OooO0oO(fragment, false);
        fragment.performAttach();
        oo0o0oo.OooO0O0(fragment, false);
    }

    public final int OooO0Oo() {
        Object next;
        SpecialEffectsController.Operation operation;
        Fragment fragment = this.f5971OooO0OO;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f5973OooO0o0;
        int i = OooO0O0.f5975OooO00o[fragment.mMaxState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i != 3) {
                iMin = i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                iMin = Math.max(this.f5973OooO0o0, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f5973OooO0o0 < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = null;
        if (viewGroup != null) {
            SpecialEffectsController specialEffectsControllerOooOO0 = SpecialEffectsController.OooOO0(viewGroup, fragment.getParentFragmentManager());
            specialEffectsControllerOooOO0.getClass();
            Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            SpecialEffectsController.Operation operationOooO0oo = specialEffectsControllerOooOO0.OooO0oo(fragment);
            SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact2 = operationOooO0oo != null ? operationOooO0oo.f5958OooO0O0 : null;
            Iterator it = specialEffectsControllerOooOO0.f5953OooO0OO.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                operation = (SpecialEffectsController.Operation) next;
            } while (!(Intrinsics.areEqual(operation.f5959OooO0OO, fragment) && !operation.f5961OooO0o));
            SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) next;
            lifecycleImpact = operation2 != null ? operation2.f5958OooO0O0 : null;
            int i2 = lifecycleImpact2 == null ? -1 : SpecialEffectsController.OooO0O0.$EnumSwitchMapping$0[lifecycleImpact2.ordinal()];
            if (i2 != -1 && i2 != 1) {
                lifecycleImpact = lifecycleImpact2;
            }
        }
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + fragment);
        }
        return iMin;
    }

    public final void OooO0o() {
        String resourceName;
        Fragment fragment = this.f5971OooO0OO;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.Oooo0O0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup container = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            container = viewGroup;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(androidx.compose.animation.core.OooO0OO.OooO0O0("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                container = (ViewGroup) fragment.mFragmentManager.f5843OooOo0O.OooO0O0(i);
                if (container == null) {
                    if (!fragment.mRestored) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(container instanceof FragmentContainerView)) {
                    FragmentStrictMode.OooO00o oooO00o = FragmentStrictMode.f6074OooO00o;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, container);
                    FragmentStrictMode.OooO0OO(wrongFragmentContainerViolation);
                    FragmentStrictMode.OooO00o OooO00o2 = FragmentStrictMode.OooO00o(fragment);
                    if (OooO00o2.f6076OooO00o.contains(FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && FragmentStrictMode.OooO0o0(OooO00o2, fragment.getClass(), WrongFragmentContainerViolation.class)) {
                        FragmentStrictMode.OooO0O0(OooO00o2, wrongFragmentContainerViolation);
                    }
                }
            }
        }
        fragment.mContainer = container;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, container, bundle2);
        if (fragment.mView != null) {
            if (FragmentManager.Oooo0O0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(p062o0000o0o.o000000O.fragment_container_view_tag, fragment);
            if (container != null) {
                OooO0O0();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            View view = fragment.mView;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
            if (ViewCompat.OooOO0O.OooO0O0(view)) {
                ViewCompat.OooOOO0.OooO0OO(fragment.mView);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new OooO00o(view2));
            }
            fragment.performViewCreated();
            this.f5969OooO00o.OooOOO0(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void OooO0o0() {
        boolean zOooo0O0 = FragmentManager.Oooo0O0(3);
        Fragment fragment = this.f5971OooO0OO;
        if (zOooo0O0) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            oo0o0Oo oo0o0oo = this.f5969OooO00o;
            oo0o0oo.OooO0oo(fragment, bundle2, false);
            fragment.performCreate(bundle2);
            oo0o0oo.OooO0OO(fragment, bundle2, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    public final void OooO0oO() {
        boolean z;
        Fragment fragmentOooO0O0;
        boolean zOooo0O0 = FragmentManager.Oooo0O0(3);
        Fragment fragment = this.f5971OooO0OO;
        if (zOooo0O0) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        o0000O00 o0000o00 = this.f5970OooO0O0;
        if (z2 && !fragment.mBeingSaved) {
            o0000o00.OooO(null, fragment.mWho);
        }
        if (z2) {
            z = true;
        } else {
            o00000O o00000o = o0000o00.f5998OooO0Oo;
            if ((o00000o.f5980OooO00o.containsKey(fragment.mWho) && o00000o.f5983OooO0Oo) ? o00000o.f5985OooO0o0 : true) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            String str = fragment.mTargetWho;
            if (str != null && (fragmentOooO0O0 = o0000o00.OooO0O0(str)) != null && fragmentOooO0O0.mRetainInstance) {
                fragment.mTarget = fragmentOooO0O0;
            }
            fragment.mState = 0;
            return;
        }
        o0Oo0oo<?> o0oo0oo2 = fragment.mHost;
        if (o0oo0oo2 instanceof ViewModelStoreOwner) {
            zIsChangingConfigurations = o0000o00.f5998OooO0Oo.f5985OooO0o0;
        } else {
            Context context = o0oo0oo2.f6059OooO0o0;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z2 && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            o0000o00.f5998OooO0Oo.OooO0OO(fragment);
        }
        fragment.performDestroy();
        this.f5969OooO00o.OooO0Oo(fragment, false);
        for (o0000 o0000Var : o0000o00.OooO0Oo()) {
            if (o0000Var != null) {
                String str2 = fragment.mWho;
                Fragment fragment2 = o0000Var.f5971OooO0OO;
                if (str2.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str3 = fragment.mTargetWho;
        if (str3 != null) {
            fragment.mTarget = o0000o00.OooO0O0(str3);
        }
        o0000o00.OooO0oo(this);
    }

    public final void OooO0oo() {
        View view;
        boolean zOooo0O0 = FragmentManager.Oooo0O0(3);
        Fragment fragment = this.f5971OooO0OO;
        if (zOooo0O0) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f5969OooO00o.OooOOO(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    public final void OooOO0() {
        Fragment fragment = this.f5971OooO0OO;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.Oooo0O0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(p062o0000o0o.o000000O.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f5969OooO00o.OooOOO0(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    public final void OooOO0O() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.f5972OooO0Oo;
        Fragment fragment = this.f5971OooO0OO;
        if (z) {
            if (FragmentManager.Oooo0O0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.f5972OooO0Oo = true;
            boolean z2 = false;
            while (true) {
                int iOooO0Oo = OooO0Oo();
                int i = fragment.mState;
                o0000O00 o0000o00 = this.f5970OooO0O0;
                if (iOooO0Oo == i) {
                    if (!z2 && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (FragmentManager.Oooo0O0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment);
                        }
                        o0000o00.f5998OooO0Oo.OooO0OO(fragment);
                        o0000o00.OooO0oo(this);
                        if (FragmentManager.Oooo0O0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            SpecialEffectsController specialEffectsControllerOooOO0 = SpecialEffectsController.OooOO0(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                specialEffectsControllerOooOO0.OooO0OO(this);
                            } else {
                                specialEffectsControllerOooOO0.OooO0o0(this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null && fragment.mAdded && FragmentManager.Oooo0OO(fragment)) {
                            fragmentManager.f5851OooOooo = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.OooOOO();
                    }
                    return;
                }
                oo0o0Oo oo0o0oo = this.f5969OooO00o;
                if (iOooO0Oo <= i) {
                    switch (i - 1) {
                        case -1:
                            OooO();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (o0000o00.f5997OooO0OO.get(fragment.mWho) == null) {
                                    o0000o00.OooO(OooOOO(), fragment.mWho);
                                }
                            }
                            OooO0oO();
                            break;
                        case 1:
                            OooO0oo();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.Oooo0O0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.mBeingSaved) {
                                o0000o00.OooO(OooOOO(), fragment.mWho);
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                OooOOOO();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                SpecialEffectsController.OooOO0(viewGroup2, fragment.getParentFragmentManager()).OooO0Oo(this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (FragmentManager.Oooo0O0(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fragment);
                            }
                            fragment.performStop();
                            oo0o0oo.OooOO0o(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (FragmentManager.Oooo0O0(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
                            }
                            fragment.performPause();
                            oo0o0oo.OooO0o(fragment, false);
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            OooO0OO();
                            break;
                        case 1:
                            OooO0o0();
                            break;
                        case 2:
                            OooOO0();
                            OooO0o();
                            break;
                        case 3:
                            OooO00o();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                SpecialEffectsController specialEffectsControllerOooOO1 = SpecialEffectsController.OooOO0(viewGroup3, fragment.getParentFragmentManager());
                                int visibility = fragment.mView.getVisibility();
                                SpecialEffectsController.Operation.State.INSTANCE.getClass();
                                specialEffectsControllerOooOO1.OooO0O0(SpecialEffectsController.Operation.State.Companion.OooO0O0(visibility), this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (FragmentManager.Oooo0O0(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fragment);
                            }
                            fragment.performStart();
                            oo0o0oo.OooOO0O(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            OooOOO0();
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.f5972OooO0Oo = false;
        }
    }

    public final void OooOO0o(@NonNull ClassLoader classLoader) {
        Fragment fragment = this.f5971OooO0OO;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
        FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable("state");
        if (fragmentState != null) {
            fragment.mTargetWho = fragmentState.f5893OooOOOO;
            fragment.mTargetRequestCode = fragmentState.f5894OooOOOo;
            Boolean bool = fragment.mSavedUserVisibleHint;
            if (bool != null) {
                fragment.mUserVisibleHint = bool.booleanValue();
                fragment.mSavedUserVisibleHint = null;
            } else {
                fragment.mUserVisibleHint = fragmentState.f5895OooOOo0;
            }
        }
        if (fragment.mUserVisibleHint) {
            return;
        }
        fragment.mDeferStart = true;
    }

    @NonNull
    public final Bundle OooOOO() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f5971OooO0OO;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f5969OooO00o.OooOO0(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.OooO0OO(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleOoooOo0 = fragment.mChildFragmentManager.OoooOo0();
            if (!bundleOoooOo0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleOoooOo0);
            }
            if (fragment.mView != null) {
                OooOOOO();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void OooOOO0() {
        boolean zOooo0O0 = FragmentManager.Oooo0O0(3);
        Fragment fragment = this.f5971OooO0OO;
        if (zOooo0O0) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            boolean z = true;
            if (focusedView != fragment.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent == fragment.mView) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            if (z) {
                boolean zRequestFocus = focusedView.requestFocus();
                if (FragmentManager.Oooo0O0(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(focusedView);
                    sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                    sb.append(zRequestFocus ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
                    sb.append(" on Fragment ");
                    sb.append(fragment);
                    sb.append(" resulting in focused view ");
                    sb.append(fragment.mView.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f5969OooO00o.OooO(fragment, false);
        this.f5970OooO0O0.OooO(null, fragment.mWho);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final void OooOOOO() {
        Fragment fragment = this.f5971OooO0OO;
        if (fragment.mView == null) {
            return;
        }
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f6037OooO.OooO0OO(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public o0000(@NonNull oo0o0Oo oo0o0oo, @NonNull o0000O00 o0000o00, @NonNull ClassLoader classLoader, @NonNull o0OOO0o o0ooo0o2, @NonNull Bundle bundle) {
        this.f5969OooO00o = oo0o0oo;
        this.f5970OooO0O0 = o0000o00;
        FragmentState fragmentState = (FragmentState) bundle.getParcelable("state");
        Fragment fragmentInstantiate = Fragment.instantiate(FragmentManager.this.f5841OooOo0.f6059OooO0o0, fragmentState.f5883OooO0Oo, null);
        fragmentInstantiate.mWho = fragmentState.f5885OooO0o0;
        fragmentInstantiate.mFromLayout = fragmentState.f5884OooO0o;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = fragmentState.f5886OooO0oO;
        fragmentInstantiate.mContainerId = fragmentState.f5887OooO0oo;
        fragmentInstantiate.mTag = fragmentState.f5882OooO;
        fragmentInstantiate.mRetainInstance = fragmentState.f5888OooOO0;
        fragmentInstantiate.mRemoving = fragmentState.f5889OooOO0O;
        fragmentInstantiate.mDetached = fragmentState.f5890OooOO0o;
        fragmentInstantiate.mHidden = fragmentState.f5892OooOOO0;
        fragmentInstantiate.mMaxState = Lifecycle.State.values()[fragmentState.f5891OooOOO];
        fragmentInstantiate.mTargetWho = fragmentState.f5893OooOOOO;
        fragmentInstantiate.mTargetRequestCode = fragmentState.f5894OooOOOo;
        fragmentInstantiate.mUserVisibleHint = fragmentState.f5895OooOOo0;
        this.f5971OooO0OO = fragmentInstantiate;
        fragmentInstantiate.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentInstantiate.setArguments(bundle2);
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentInstantiate);
        }
    }

    public o0000(@NonNull oo0o0Oo oo0o0oo, @NonNull o0000O00 o0000o00, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        this.f5969OooO00o = oo0o0oo;
        this.f5970OooO0O0 = o0000o00;
        this.f5971OooO0OO = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
