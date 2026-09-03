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
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.internal.AnalyticsEvents;
import com.zego.zegoavkit2.ZegoConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOO0o f8438OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000OO f8439OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Fragment f8440OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f8441OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f8442OooO0o0 = -1;

    public class OooO00o implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ View f8443Oooo;

        public OooO00o(View view) {
            this.f8443Oooo = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.f8443Oooo.removeOnAttachStateChangeListener(this);
            View view2 = this.f8443Oooo;
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7885OooO00o;
            ViewCompat.OooOOO0.OooO0OO(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f8444OooO00o;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f8444OooO00o = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8444OooO00o[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8444OooO00o[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8444OooO00o[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public o00000O(@NonNull o0OOO0o o0ooo0o2, @NonNull o00000OO o00000oo2, @NonNull Fragment fragment) {
        this.f8438OooO00o = o0ooo0o2;
        this.f8439OooO0O0 = o00000oo2;
        this.f8440OooO0OO = fragment;
    }

    public final void OooO() {
        if (FragmentManager.Oooo0oO(3)) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("movefrom ATTACHED: ");
            sbOooO0O0.append(this.f8440OooO0OO);
            Log.d("FragmentManager", sbOooO0O0.toString());
        }
        this.f8440OooO0OO.performDetach();
        boolean z = false;
        this.f8438OooO00o.OooO0o0(this.f8440OooO0OO, false);
        Fragment fragment = this.f8440OooO0OO;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        boolean z2 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (!z) {
            o000000O o000000o2 = this.f8439OooO0O0.f8453OooO0Oo;
            if (o000000o2.f8432OooO00o.containsKey(this.f8440OooO0OO.mWho) && o000000o2.f8435OooO0Oo) {
                z2 = o000000o2.f8437OooO0o0;
            }
            if (!z2) {
                return;
            }
        }
        if (FragmentManager.Oooo0oO(3)) {
            StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("initState called for fragment: ");
            sbOooO0O1.append(this.f8440OooO0OO);
            Log.d("FragmentManager", sbOooO0O1.toString());
        }
        this.f8440OooO0OO.initState();
    }

    public final void OooO00o() {
        if (FragmentManager.Oooo0oO(3)) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("moveto ACTIVITY_CREATED: ");
            sbOooO0O0.append(this.f8440OooO0OO);
            Log.d("FragmentManager", sbOooO0O0.toString());
        }
        Fragment fragment = this.f8440OooO0OO;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        o0OOO0o o0ooo0o2 = this.f8438OooO00o;
        Fragment fragment2 = this.f8440OooO0OO;
        o0ooo0o2.OooO00o(fragment2, fragment2.mSavedFragmentState, false);
    }

    public final void OooO0O0() {
        View view;
        View view2;
        o00000OO o00000oo2 = this.f8439OooO0O0;
        Fragment fragment = this.f8440OooO0OO;
        Objects.requireNonNull(o00000oo2);
        ViewGroup viewGroup = fragment.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = o00000oo2.f8450OooO00o.indexOf(fragment);
            for (int i = iIndexOf - 1; i >= 0; i--) {
                Fragment fragment2 = o00000oo2.f8450OooO00o.get(i);
                if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= o00000oo2.f8450OooO00o.size()) {
                    break;
                }
                Fragment fragment3 = o00000oo2.f8450OooO00o.get(iIndexOf);
                if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        Fragment fragment4 = this.f8440OooO0OO;
        fragment4.mContainer.addView(fragment4.mView, iIndexOfChild);
    }

    public final void OooO0OO() {
        if (FragmentManager.Oooo0oO(3)) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("moveto ATTACHED: ");
            sbOooO0O0.append(this.f8440OooO0OO);
            Log.d("FragmentManager", sbOooO0O0.toString());
        }
        Fragment fragment = this.f8440OooO0OO;
        Fragment fragment2 = fragment.mTarget;
        o00000O o00000oOooO0oO = null;
        if (fragment2 != null) {
            o00000O o00000oOooO0oO2 = this.f8439OooO0O0.OooO0oO(fragment2.mWho);
            if (o00000oOooO0oO2 == null) {
                StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("Fragment ");
                sbOooO0O1.append(this.f8440OooO0OO);
                sbOooO0O1.append(" declared target fragment ");
                sbOooO0O1.append(this.f8440OooO0OO.mTarget);
                sbOooO0O1.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sbOooO0O1.toString());
            }
            Fragment fragment3 = this.f8440OooO0OO;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            o00000oOooO0oO = o00000oOooO0oO2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (o00000oOooO0oO = this.f8439OooO0O0.OooO0oO(str)) == null) {
                StringBuilder sbOooO0O2 = OooO00o.OooO00o.OooO0O0("Fragment ");
                sbOooO0O2.append(this.f8440OooO0OO);
                sbOooO0O2.append(" declared target fragment ");
                throw new IllegalStateException(OooO00o.OooO00o.OooO00o(sbOooO0O2, this.f8440OooO0OO.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (o00000oOooO0oO != null) {
            o00000oOooO0oO.OooOO0O();
        }
        Fragment fragment4 = this.f8440OooO0OO;
        FragmentManager fragmentManager = fragment4.mFragmentManager;
        fragment4.mHost = fragmentManager.f8321OooOo0;
        fragment4.mParentFragment = fragmentManager.f8324OooOo0o;
        this.f8438OooO00o.OooO0oO(fragment4, false);
        this.f8440OooO0OO.performAttach();
        this.f8438OooO00o.OooO0O0(this.f8440OooO0OO, false);
    }

    public final int OooO0Oo() {
        Fragment fragment = this.f8440OooO0OO;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f8442OooO0o0;
        int i = OooO0O0.f8444OooO00o[fragment.mMaxState.ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i != 3) {
                iMin = i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        Fragment fragment2 = this.f8440OooO0OO;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f8442OooO0o0, 2);
                View view = this.f8440OooO0OO.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f8442OooO0o0 < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f8440OooO0OO.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment3 = this.f8440OooO0OO;
        ViewGroup viewGroup = fragment3.mContainer;
        o000Oo0.OooO0OO oooO0OO = null;
        if (viewGroup != null) {
            o000Oo0 o000oo0OooO0o = o000Oo0.OooO0o(viewGroup, fragment3.getParentFragmentManager());
            Objects.requireNonNull(o000oo0OooO0o);
            o000Oo0.OooO0OO OooO0Oo2 = o000oo0OooO0o.OooO0Oo(this.f8440OooO0OO);
            i2 = OooO0Oo2 != null ? OooO0Oo2.f8516OooO0O0 : 0;
            Fragment fragment4 = this.f8440OooO0OO;
            for (o000Oo0.OooO0OO oooO0OO2 : o000oo0OooO0o.f8509OooO0OO) {
                if (oooO0OO2.f8517OooO0OO.equals(fragment4) && !oooO0OO2.f8519OooO0o) {
                    oooO0OO = oooO0OO2;
                    break;
                }
            }
            if (oooO0OO != null && (i2 == 0 || i2 == 1)) {
                i2 = oooO0OO.f8516OooO0O0;
            }
        }
        if (i2 == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i2 == 3) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment5 = this.f8440OooO0OO;
            if (fragment5.mRemoving) {
                iMin = fragment5.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment6 = this.f8440OooO0OO;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.Oooo0oO(2)) {
            StringBuilder sbOooO00o = androidx.appcompat.widget.o00000O0.OooO00o("computeExpectedState() of ", iMin, " for ");
            sbOooO00o.append(this.f8440OooO0OO);
            Log.v("FragmentManager", sbOooO00o.toString());
        }
        return iMin;
    }

    public final void OooO0o() {
        String resourceName;
        if (this.f8440OooO0OO.mFromLayout) {
            return;
        }
        if (FragmentManager.Oooo0oO(3)) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("moveto CREATE_VIEW: ");
            sbOooO0O0.append(this.f8440OooO0OO);
            Log.d("FragmentManager", sbOooO0O0.toString());
        }
        Fragment fragment = this.f8440OooO0OO;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup container = null;
        Fragment fragment2 = this.f8440OooO0OO;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup != null) {
            container = viewGroup;
        } else {
            int i = fragment2.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("Cannot create fragment ");
                    sbOooO0O1.append(this.f8440OooO0OO);
                    sbOooO0O1.append(" for a container view with no id");
                    throw new IllegalArgumentException(sbOooO0O1.toString());
                }
                container = (ViewGroup) fragment2.mFragmentManager.f8323OooOo0O.OooO0O0(i);
                if (container == null) {
                    Fragment fragment3 = this.f8440OooO0OO;
                    if (!fragment3.mRestored) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.f8440OooO0OO.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        StringBuilder sbOooO0O2 = OooO00o.OooO00o.OooO0O0("No view found for id 0x");
                        sbOooO0O2.append(Integer.toHexString(this.f8440OooO0OO.mContainerId));
                        sbOooO0O2.append(" (");
                        sbOooO0O2.append(resourceName);
                        sbOooO0O2.append(") for fragment ");
                        sbOooO0O2.append(this.f8440OooO0OO);
                        throw new IllegalArgumentException(sbOooO0O2.toString());
                    }
                } else if (!(container instanceof FragmentContainerView)) {
                    Fragment fragment4 = this.f8440OooO0OO;
                    FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f8548OooO00o;
                    Intrinsics.checkNotNullParameter(fragment4, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment4, container);
                    FragmentStrictMode fragmentStrictMode2 = FragmentStrictMode.f8548OooO00o;
                    FragmentStrictMode.OooO0OO(wrongFragmentContainerViolation);
                    FragmentStrictMode.OooO0O0 oooO0O0OooO00o = FragmentStrictMode.OooO00o(fragment4);
                    if (oooO0O0OooO00o.f8551OooO00o.contains(FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && FragmentStrictMode.OooO0o(oooO0O0OooO00o, fragment4.getClass(), WrongFragmentContainerViolation.class)) {
                        FragmentStrictMode.OooO0O0(oooO0O0OooO00o, wrongFragmentContainerViolation);
                    }
                }
            }
        }
        Fragment fragment5 = this.f8440OooO0OO;
        fragment5.mContainer = container;
        fragment5.performCreateView(layoutInflaterPerformGetLayoutInflater, container, fragment5.mSavedFragmentState);
        View view = this.f8440OooO0OO.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment6 = this.f8440OooO0OO;
            fragment6.mView.setTag(p079o000Oo0O.Oooo000.fragment_container_view_tag, fragment6);
            if (container != null) {
                OooO0O0();
            }
            Fragment fragment7 = this.f8440OooO0OO;
            if (fragment7.mHidden) {
                fragment7.mView.setVisibility(8);
            }
            View view2 = this.f8440OooO0OO.mView;
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7885OooO00o;
            if (ViewCompat.OooOO0O.OooO0O0(view2)) {
                ViewCompat.OooOOO0.OooO0OO(this.f8440OooO0OO.mView);
            } else {
                View view3 = this.f8440OooO0OO.mView;
                view3.addOnAttachStateChangeListener(new OooO00o(view3));
            }
            this.f8440OooO0OO.performViewCreated();
            o0OOO0o o0ooo0o2 = this.f8438OooO00o;
            Fragment fragment8 = this.f8440OooO0OO;
            o0ooo0o2.OooOOO0(fragment8, fragment8.mView, fragment8.mSavedFragmentState, false);
            int visibility = this.f8440OooO0OO.mView.getVisibility();
            this.f8440OooO0OO.setPostOnViewCreatedAlpha(this.f8440OooO0OO.mView.getAlpha());
            Fragment fragment9 = this.f8440OooO0OO;
            if (fragment9.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment9.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f8440OooO0OO.setFocusedView(viewFindFocus);
                    if (FragmentManager.Oooo0oO(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f8440OooO0OO);
                    }
                }
                this.f8440OooO0OO.mView.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
        }
        this.f8440OooO0OO.mState = 2;
    }

    public final void OooO0o0() {
        if (FragmentManager.Oooo0oO(3)) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("moveto CREATED: ");
            sbOooO0O0.append(this.f8440OooO0OO);
            Log.d("FragmentManager", sbOooO0O0.toString());
        }
        Fragment fragment = this.f8440OooO0OO;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f8440OooO0OO.mState = 1;
            return;
        }
        this.f8438OooO00o.OooO0oo(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f8440OooO0OO;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        o0OOO0o o0ooo0o2 = this.f8438OooO00o;
        Fragment fragment3 = this.f8440OooO0OO;
        o0ooo0o2.OooO0OO(fragment3, fragment3.mSavedFragmentState, false);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    public final void OooO0oO() {
        boolean z;
        Fragment fragmentOooO0OO;
        if (FragmentManager.Oooo0oO(3)) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("movefrom CREATED: ");
            sbOooO0O0.append(this.f8440OooO0OO);
            Log.d("FragmentManager", sbOooO0O0.toString());
        }
        Fragment fragment = this.f8440OooO0OO;
        boolean zIsChangingConfigurations = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2) {
            Fragment fragment2 = this.f8440OooO0OO;
            if (!fragment2.mBeingSaved) {
                this.f8439OooO0O0.OooOO0O(fragment2.mWho, null);
            }
        }
        if (z2) {
            z = true;
        } else {
            o000000O o000000o2 = this.f8439OooO0O0.f8453OooO0Oo;
            if ((o000000o2.f8432OooO00o.containsKey(this.f8440OooO0OO.mWho) && o000000o2.f8435OooO0Oo) ? o000000o2.f8437OooO0o0 : true) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            String str = this.f8440OooO0OO.mTargetWho;
            if (str != null && (fragmentOooO0OO = this.f8439OooO0O0.OooO0OO(str)) != null && fragmentOooO0OO.mRetainInstance) {
                this.f8440OooO0OO.mTarget = fragmentOooO0OO;
            }
            this.f8440OooO0OO.mState = 0;
            return;
        }
        o00oO0o<?> o00oo0o2 = this.f8440OooO0OO.mHost;
        if (o00oo0o2 instanceof ViewModelStoreOwner) {
            zIsChangingConfigurations = this.f8439OooO0O0.f8453OooO0Oo.f8437OooO0o0;
        } else {
            Context context = o00oo0o2.f8533OoooO00;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z2 && !this.f8440OooO0OO.mBeingSaved) || zIsChangingConfigurations) {
            this.f8439OooO0O0.f8453OooO0Oo.OooO0OO(this.f8440OooO0OO);
        }
        this.f8440OooO0OO.performDestroy();
        this.f8438OooO00o.OooO0Oo(this.f8440OooO0OO, false);
        for (o00000O o00000o : (ArrayList) this.f8439OooO0O0.OooO0o0()) {
            if (o00000o != null) {
                Fragment fragment3 = o00000o.f8440OooO0OO;
                if (this.f8440OooO0OO.mWho.equals(fragment3.mTargetWho)) {
                    fragment3.mTarget = this.f8440OooO0OO;
                    fragment3.mTargetWho = null;
                }
            }
        }
        Fragment fragment4 = this.f8440OooO0OO;
        String str2 = fragment4.mTargetWho;
        if (str2 != null) {
            fragment4.mTarget = this.f8439OooO0O0.OooO0OO(str2);
        }
        this.f8439OooO0O0.OooOO0(this);
    }

    public final void OooO0oo() {
        View view;
        if (FragmentManager.Oooo0oO(3)) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("movefrom CREATE_VIEW: ");
            sbOooO0O0.append(this.f8440OooO0OO);
            Log.d("FragmentManager", sbOooO0O0.toString());
        }
        Fragment fragment = this.f8440OooO0OO;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f8440OooO0OO.performDestroyView();
        this.f8438OooO00o.OooOOO(this.f8440OooO0OO, false);
        Fragment fragment2 = this.f8440OooO0OO;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f8440OooO0OO.mInLayout = false;
    }

    public final void OooOO0() {
        Fragment fragment = this.f8440OooO0OO;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.Oooo0oO(3)) {
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("moveto CREATE_VIEW: ");
                sbOooO0O0.append(this.f8440OooO0OO);
                Log.d("FragmentManager", sbOooO0O0.toString());
            }
            Fragment fragment2 = this.f8440OooO0OO;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f8440OooO0OO.mSavedFragmentState);
            View view = this.f8440OooO0OO.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f8440OooO0OO;
                fragment3.mView.setTag(p079o000Oo0O.Oooo000.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f8440OooO0OO;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f8440OooO0OO.performViewCreated();
                o0OOO0o o0ooo0o2 = this.f8438OooO00o;
                Fragment fragment5 = this.f8440OooO0OO;
                o0ooo0o2.OooOOO0(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f8440OooO0OO.mState = 2;
            }
        }
    }

    public final void OooOO0O() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f8441OooO0Oo) {
            if (FragmentManager.Oooo0oO(2)) {
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Ignoring re-entrant call to moveToExpectedState() for ");
                sbOooO0O0.append(this.f8440OooO0OO);
                Log.v("FragmentManager", sbOooO0O0.toString());
                return;
            }
            return;
        }
        try {
            this.f8441OooO0Oo = true;
            boolean z = false;
            while (true) {
                int iOooO0Oo = OooO0Oo();
                Fragment fragment = this.f8440OooO0OO;
                int i = fragment.mState;
                if (iOooO0Oo == i) {
                    if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f8440OooO0OO.mBeingSaved) {
                        if (FragmentManager.Oooo0oO(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f8440OooO0OO);
                        }
                        this.f8439OooO0O0.f8453OooO0Oo.OooO0OO(this.f8440OooO0OO);
                        this.f8439OooO0O0.OooOO0(this);
                        if (FragmentManager.Oooo0oO(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f8440OooO0OO);
                        }
                        this.f8440OooO0OO.initState();
                    }
                    Fragment fragment2 = this.f8440OooO0OO;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            o000Oo0 o000oo0OooO0o = o000Oo0.OooO0o(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f8440OooO0OO.mHidden) {
                                Objects.requireNonNull(o000oo0OooO0o);
                                if (FragmentManager.Oooo0oO(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f8440OooO0OO);
                                }
                                o000oo0OooO0o.OooO00o(3, 1, this);
                            } else {
                                Objects.requireNonNull(o000oo0OooO0o);
                                if (FragmentManager.Oooo0oO(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.f8440OooO0OO);
                                }
                                o000oo0OooO0o.OooO00o(2, 1, this);
                            }
                        }
                        Fragment fragment3 = this.f8440OooO0OO;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null && fragment3.mAdded && fragmentManager.Oooo0oo(fragment3)) {
                            fragmentManager.f8331OooOooo = true;
                        }
                        Fragment fragment4 = this.f8440OooO0OO;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f8440OooO0OO.mChildFragmentManager.OooOOOO();
                    }
                    return;
                }
                if (iOooO0Oo <= i) {
                    switch (i - 1) {
                        case -1:
                            OooO();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (this.f8439OooO0O0.f8452OooO0OO.get(fragment.mWho) == null) {
                                    OooOOOo();
                                }
                            }
                            OooO0oO();
                            break;
                        case 1:
                            OooO0oo();
                            this.f8440OooO0OO.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.Oooo0oO(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f8440OooO0OO);
                            }
                            Fragment fragment5 = this.f8440OooO0OO;
                            if (fragment5.mBeingSaved) {
                                OooOOOo();
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                OooOOo0();
                            }
                            Fragment fragment6 = this.f8440OooO0OO;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                o000Oo0 o000oo0OooO0o2 = o000Oo0.OooO0o(viewGroup2, fragment6.getParentFragmentManager());
                                Objects.requireNonNull(o000oo0OooO0o2);
                                if (FragmentManager.Oooo0oO(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f8440OooO0OO);
                                }
                                o000oo0OooO0o2.OooO00o(1, 3, this);
                            }
                            this.f8440OooO0OO.mState = 3;
                            break;
                        case 4:
                            OooOOoo();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            OooOO0o();
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
                                o000Oo0 o000oo0OooO0o3 = o000Oo0.OooO0o(viewGroup3, fragment.getParentFragmentManager());
                                int iOooO0O0 = o000O0.OooO0O0(this.f8440OooO0OO.mView.getVisibility());
                                Objects.requireNonNull(o000oo0OooO0o3);
                                if (FragmentManager.Oooo0oO(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.f8440OooO0OO);
                                }
                                o000oo0OooO0o3.OooO00o(iOooO0O0, 2, this);
                            }
                            this.f8440OooO0OO.mState = 4;
                            break;
                        case 5:
                            OooOOo();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            OooOOO();
                            break;
                    }
                }
                z = true;
            }
        } finally {
            this.f8441OooO0Oo = false;
        }
    }

    public final void OooOO0o() {
        if (FragmentManager.Oooo0oO(3)) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("movefrom RESUMED: ");
            sbOooO0O0.append(this.f8440OooO0OO);
            Log.d("FragmentManager", sbOooO0O0.toString());
        }
        this.f8440OooO0OO.performPause();
        this.f8438OooO00o.OooO0o(this.f8440OooO0OO, false);
    }

    public final void OooOOO() {
        if (FragmentManager.Oooo0oO(3)) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("moveto RESUMED: ");
            sbOooO0O0.append(this.f8440OooO0OO);
            Log.d("FragmentManager", sbOooO0O0.toString());
        }
        View focusedView = this.f8440OooO0OO.getFocusedView();
        if (focusedView != null) {
            boolean z = true;
            if (focusedView != this.f8440OooO0OO.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent == this.f8440OooO0OO.mView) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            if (z) {
                boolean zRequestFocus = focusedView.requestFocus();
                if (FragmentManager.Oooo0oO(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Restoring focused view ");
                    sb.append(focusedView);
                    sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                    sb.append(zRequestFocus ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
                    sb.append(" on Fragment ");
                    sb.append(this.f8440OooO0OO);
                    sb.append(" resulting in focused view ");
                    sb.append(this.f8440OooO0OO.mView.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        this.f8440OooO0OO.setFocusedView(null);
        this.f8440OooO0OO.performResume();
        this.f8438OooO00o.OooO(this.f8440OooO0OO, false);
        Fragment fragment = this.f8440OooO0OO;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final void OooOOO0(@NonNull ClassLoader classLoader) {
        Bundle bundle = this.f8440OooO0OO.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f8440OooO0OO;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f8440OooO0OO;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f8440OooO0OO;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f8440OooO0OO;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f8440OooO0OO;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f8440OooO0OO.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f8440OooO0OO;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    public final Bundle OooOOOO() {
        Bundle bundle = new Bundle();
        this.f8440OooO0OO.performSaveInstanceState(bundle);
        this.f8438OooO00o.OooOO0(this.f8440OooO0OO, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f8440OooO0OO.mView != null) {
            OooOOo0();
        }
        if (this.f8440OooO0OO.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f8440OooO0OO.mSavedViewState);
        }
        if (this.f8440OooO0OO.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f8440OooO0OO.mSavedViewRegistryState);
        }
        if (!this.f8440OooO0OO.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f8440OooO0OO.mUserVisibleHint);
        }
        return bundle;
    }

    public final void OooOOOo() {
        FragmentState fragmentState = new FragmentState(this.f8440OooO0OO);
        Fragment fragment = this.f8440OooO0OO;
        if (fragment.mState <= -1 || fragmentState.f8373Ooooo00 != null) {
            fragmentState.f8373Ooooo00 = fragment.mSavedFragmentState;
        } else {
            Bundle bundleOooOOOO = OooOOOO();
            fragmentState.f8373Ooooo00 = bundleOooOOOO;
            if (this.f8440OooO0OO.mTargetWho != null) {
                if (bundleOooOOOO == null) {
                    fragmentState.f8373Ooooo00 = new Bundle();
                }
                fragmentState.f8373Ooooo00.putString("android:target_state", this.f8440OooO0OO.mTargetWho);
                int i = this.f8440OooO0OO.mTargetRequestCode;
                if (i != 0) {
                    fragmentState.f8373Ooooo00.putInt("android:target_req_state", i);
                }
            }
        }
        this.f8439OooO0O0.OooOO0O(this.f8440OooO0OO.mWho, fragmentState);
    }

    public final void OooOOo() {
        if (FragmentManager.Oooo0oO(3)) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("moveto STARTED: ");
            sbOooO0O0.append(this.f8440OooO0OO);
            Log.d("FragmentManager", sbOooO0O0.toString());
        }
        this.f8440OooO0OO.performStart();
        this.f8438OooO00o.OooOO0O(this.f8440OooO0OO, false);
    }

    public final void OooOOo0() {
        if (this.f8440OooO0OO.mView == null) {
            return;
        }
        if (FragmentManager.Oooo0oO(2)) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Saving view state for fragment ");
            sbOooO0O0.append(this.f8440OooO0OO);
            sbOooO0O0.append(" with view ");
            sbOooO0O0.append(this.f8440OooO0OO.mView);
            Log.v("FragmentManager", sbOooO0O0.toString());
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f8440OooO0OO.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f8440OooO0OO.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f8440OooO0OO.mViewLifecycleOwner.f8455OoooO.OooO0Oo(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f8440OooO0OO.mSavedViewRegistryState = bundle;
    }

    public final void OooOOoo() {
        if (FragmentManager.Oooo0oO(3)) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("movefrom STARTED: ");
            sbOooO0O0.append(this.f8440OooO0OO);
            Log.d("FragmentManager", sbOooO0O0.toString());
        }
        this.f8440OooO0OO.performStop();
        this.f8438OooO00o.OooOO0o(this.f8440OooO0OO, false);
    }

    public o00000O(@NonNull o0OOO0o o0ooo0o2, @NonNull o00000OO o00000oo2, @NonNull ClassLoader classLoader, @NonNull oo000o oo000oVar, @NonNull FragmentState fragmentState) {
        this.f8438OooO00o = o0ooo0o2;
        this.f8439OooO0O0 = o00000oo2;
        Fragment fragmentOooO00o = oo000oVar.OooO00o(classLoader, fragmentState.f8362Oooo);
        Bundle bundle = fragmentState.f8370OoooOo0;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentOooO00o.setArguments(fragmentState.f8370OoooOo0);
        fragmentOooO00o.mWho = fragmentState.f8365OoooO00;
        fragmentOooO00o.mFromLayout = fragmentState.f8364OoooO0;
        fragmentOooO00o.mRestored = true;
        fragmentOooO00o.mFragmentId = fragmentState.f8366OoooO0O;
        fragmentOooO00o.mContainerId = fragmentState.f8363OoooO;
        fragmentOooO00o.mTag = fragmentState.f8367OoooOO0;
        fragmentOooO00o.mRetainInstance = fragmentState.f8374o000oOoO;
        fragmentOooO00o.mRemoving = fragmentState.f8368OoooOOO;
        fragmentOooO00o.mDetached = fragmentState.f8369OoooOOo;
        fragmentOooO00o.mHidden = fragmentState.f8371OoooOoO;
        fragmentOooO00o.mMaxState = Lifecycle.State.values()[fragmentState.f8372OoooOoo];
        Bundle bundle2 = fragmentState.f8373Ooooo00;
        if (bundle2 != null) {
            fragmentOooO00o.mSavedFragmentState = bundle2;
        } else {
            fragmentOooO00o.mSavedFragmentState = new Bundle();
        }
        this.f8440OooO0OO = fragmentOooO00o;
        if (FragmentManager.Oooo0oO(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentOooO00o);
        }
    }

    public o00000O(@NonNull o0OOO0o o0ooo0o2, @NonNull o00000OO o00000oo2, @NonNull Fragment fragment, @NonNull FragmentState fragmentState) {
        this.f8438OooO00o = o0ooo0o2;
        this.f8439OooO0O0 = o00000oo2;
        this.f8440OooO0OO = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f8373Ooooo00;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
