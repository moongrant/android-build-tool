package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.internal.security.CertificateUtil;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p022Oooo00O.o00O00OO;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f5818OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.OooO00o> f5820OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList<Fragment> f5822OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OnBackPressedDispatcher f5823OooO0oO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public Fragment f5835OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o0Oo0oo<?> f5836OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o00oO0o f5838OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Fragment f5839OooOo0o;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public androidx.activity.result.OooO0o f5842OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public androidx.activity.result.OooO0o f5843OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public androidx.activity.result.OooO0o f5844OooOoo0;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f5846OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f5847Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f5848Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f5849Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f5850Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.OooO00o> f5851Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ArrayList<Boolean> f5852Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00000O f5853Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public ArrayList<Fragment> f5854Oooo0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<OooOo> f5817OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000O00 f5819OooO0OO = new o0000O00();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OO00O f5821OooO0o = new o0OO00O(this);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0O0 f5824OooO0oo = new OooO0O0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final AtomicInteger f5816OooO = new AtomicInteger();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Map<String, BackStackState> f5825OooOO0 = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Map<String, Bundle> f5826OooOO0O = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Map<String, Object> f5827OooOO0o = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final oo0o0Oo f5829OooOOO0 = new oo0o0Oo(this);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final CopyOnWriteArrayList<o00000OO> f5828OooOOO = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final o0O0O00 f5830OooOOOO = new o000OO.OooO00o() { // from class: androidx.fragment.app.o0O0O00
        @Override // o000OO.OooO00o
        public final void accept(Object obj) {
            Configuration configuration = (Configuration) obj;
            FragmentManager fragmentManager = this.f6047OooO00o;
            if (fragmentManager.Oooo0o0()) {
                fragmentManager.OooO0oo(false, configuration);
            }
        }
    };

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o000OOo f5831OooOOOo = new o000OO.OooO00o() { // from class: androidx.fragment.app.o000OOo
        @Override // o000OO.OooO00o
        public final void accept(Object obj) {
            Integer num = (Integer) obj;
            FragmentManager fragmentManager = this.f6041OooO00o;
            if (fragmentManager.Oooo0o0() && num.intValue() == 80) {
                fragmentManager.OooOO0o(false);
            }
        }
    };

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o000000 f5833OooOOo0 = new o000OO.OooO00o() { // from class: androidx.fragment.app.o000000
        @Override // o000OO.OooO00o
        public final void accept(Object obj) {
            o00000O.Oooo0 oooo0 = (o00000O.Oooo0) obj;
            FragmentManager fragmentManager = this.f5972OooO00o;
            if (fragmentManager.Oooo0o0()) {
                fragmentManager.OooOOO0(oooo0.f33425OooO00o, false);
            }
        }
    };

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o000000O f5832OooOOo = new o000OO.OooO00o() { // from class: androidx.fragment.app.o000000O
        @Override // o000OO.OooO00o
        public final void accept(Object obj) {
            o00000O.o0OO00O o0oo00o2 = (o00000O.o0OO00O) obj;
            FragmentManager fragmentManager = this.f5973OooO00o;
            if (fragmentManager.Oooo0o0()) {
                fragmentManager.OooOOo(o0oo00o2.f33451OooO00o, false);
            }
        }
    };

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final OooO0OO f5834OooOOoo = new OooO0OO();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f5837OooOo00 = -1;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0o f5841OooOoO0 = new OooO0o();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO f5840OooOoO = new OooO();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ArrayDeque<LaunchedFragmentInfo> f5845OooOooO = new ArrayDeque<>();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooOO0 f5855Oooo0oO = new OooOO0();

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$6, reason: invalid class name */
    class AnonymousClass6 implements LifecycleEventObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START || event == Lifecycle.Event.ON_DESTROY) {
                throw null;
            }
        }
    }

    public class OooO implements o000OO0O {
    }

    public class OooO00o implements androidx.activity.result.OooO00o<Map<String, Boolean>> {
        public OooO00o() {
        }

        @Override // androidx.activity.result.OooO00o
        @SuppressLint({"SyntheticAccessor"})
        public final void onActivityResult(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.f5845OooOooO.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            o0000O00 o0000o00 = fragmentManager.f5819OooO0OO;
            String str = launchedFragmentInfoPollFirst.f5856OooO0Oo;
            Fragment fragmentOooO0OO = o0000o00.OooO0OO(str);
            if (fragmentOooO0OO != null) {
                fragmentOooO0OO.onRequestPermissionsResult(launchedFragmentInfoPollFirst.f5857OooO0o0, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public class OooO0O0 extends androidx.activity.o000oOoO {
        public OooO0O0() {
            super(false);
        }

        @Override // androidx.activity.o000oOoO
        public final void OooO00o() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.OooOo(true);
            if (fragmentManager.f5824OooO0oo.f2191OooO00o) {
                fragmentManager.OoooO00();
            } else {
                fragmentManager.f5823OooO0oO.OooO0O0();
            }
        }
    }

    public class OooO0OO implements androidx.core.view.o0OOO0o {
        public OooO0OO() {
        }

        @Override // androidx.core.view.o0OOO0o
        public final void OooO00o(@NonNull Menu menu) {
            FragmentManager.this.OooOOOo(menu);
        }

        @Override // androidx.core.view.o0OOO0o
        public final void OooO0O0(@NonNull Menu menu) {
            FragmentManager.this.OooOOoo(menu);
        }

        @Override // androidx.core.view.o0OOO0o
        public final boolean OooO0OO(@NonNull MenuItem menuItem) {
            return FragmentManager.this.OooOOOO(menuItem);
        }

        @Override // androidx.core.view.o0OOO0o
        public final void OooO0Oo(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
            FragmentManager.this.OooOO0(menu, menuInflater);
        }
    }

    public class OooO0o extends o0OOO0o {
        public OooO0o() {
        }
    }

    public class OooOO0 implements Runnable {
        public OooOO0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.OooOo(true);
        }
    }

    public class OooOO0O implements o00000OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Fragment f5863OooO0Oo;

        public OooOO0O(Fragment fragment) {
            this.f5863OooO0Oo = fragment;
        }

        @Override // androidx.fragment.app.o00000OO
        public final void OooO00o(@NonNull Fragment fragment) {
            this.f5863OooO0Oo.onAttachFragment(fragment);
        }
    }

    public class OooOOO implements androidx.activity.result.OooO00o<ActivityResult> {
        public OooOOO() {
        }

        @Override // androidx.activity.result.OooO00o
        public final void onActivityResult(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.f5845OooOooO.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            o0000O00 o0000o00 = fragmentManager.f5819OooO0OO;
            String str = launchedFragmentInfoPollFirst.f5856OooO0Oo;
            Fragment fragmentOooO0OO = o0000o00.OooO0OO(str);
            if (fragmentOooO0OO != null) {
                fragmentOooO0OO.onActivityResult(launchedFragmentInfoPollFirst.f5857OooO0o0, activityResult2.f2198OooO0Oo, activityResult2.f2199OooO0o0);
            } else {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            }
        }
    }

    public class OooOOO0 implements androidx.activity.result.OooO00o<ActivityResult> {
        public OooOOO0() {
        }

        @Override // androidx.activity.result.OooO00o
        public final void onActivityResult(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollLast = fragmentManager.f5845OooOooO.pollLast();
            if (launchedFragmentInfoPollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            o0000O00 o0000o00 = fragmentManager.f5819OooO0OO;
            String str = launchedFragmentInfoPollLast.f5856OooO0Oo;
            Fragment fragmentOooO0OO = o0000o00.OooO0OO(str);
            if (fragmentOooO0OO != null) {
                fragmentOooO0OO.onActivityResult(launchedFragmentInfoPollLast.f5857OooO0o0, activityResult2.f2198OooO0Oo, activityResult2.f2199OooO0o0);
            } else {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            }
        }
    }

    public static class OooOOOO extends p011OooOo0.OooOO0<IntentSenderRequest, ActivityResult> {
        @Override // p011OooOo0.OooOO0
        @NonNull
        public final Intent createIntent(@NonNull Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest2 = intentSenderRequest;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest2.f2206OooO0o0;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = intentSenderRequest2.f2204OooO0Oo;
                    Intrinsics.checkNotNullParameter(intentSender, "intentSender");
                    intentSenderRequest2 = new IntentSenderRequest(intentSender, null, intentSenderRequest2.f2205OooO0o, intentSenderRequest2.f2207OooO0oO);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
            if (FragmentManager.Oooo0O0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p011OooOo0.OooOO0
        @NonNull
        public final ActivityResult parseResult(int i, @Nullable Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    public interface OooOo {
        boolean OooO00o(@NonNull ArrayList<androidx.fragment.app.OooO00o> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    public static abstract class OooOo00 {
        @Deprecated
        public void onFragmentActivityCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentDetached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentPaused(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentPreAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentPreCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentResumed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        }

        public void onFragmentStarted(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentStopped(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
        }

        public void onFragmentViewDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }
    }

    public class Oooo000 implements OooOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f5866OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f5867OooO0O0 = 1;

        public Oooo000(int i) {
            this.f5866OooO00o = i;
        }

        @Override // androidx.fragment.app.FragmentManager.OooOo
        public final boolean OooO00o(@NonNull ArrayList<androidx.fragment.app.OooO00o> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            FragmentManager fragmentManager = FragmentManager.this;
            Fragment fragment = fragmentManager.f5835OooOo;
            int i = this.f5866OooO00o;
            if (fragment == null || i >= 0 || !fragment.getChildFragmentManager().OoooO00()) {
                return fragmentManager.OoooO0O(arrayList, arrayList2, i, this.f5867OooO0O0);
            }
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean Oooo0O0(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public static boolean Oooo0OO(@NonNull Fragment fragment) {
        boolean z;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        boolean zOooo0OO = false;
        for (Fragment fragment2 : fragment.mChildFragmentManager.f5819OooO0OO.OooO0o0()) {
            if (fragment2 != null) {
                zOooo0OO = Oooo0OO(fragment2);
            }
            if (zOooo0OO) {
                z = true;
                if (z) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        if (z) {
            return true;
        }
        return false;
    }

    public static boolean Oooo0o(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.f5835OooOo) && Oooo0o(fragmentManager.f5839OooOo0o);
    }

    public static void OooooOo(@NonNull Fragment fragment) {
        if (Oooo0O0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final boolean OooO(@NonNull MenuItem menuItem) {
        if (this.f5837OooOo00 < 1) {
            return false;
        }
        for (Fragment fragment : this.f5819OooO0OO.OooO0o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final o0000 OooO00o(@NonNull Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.OooO0Oo(fragment, str);
        }
        if (Oooo0O0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        o0000 o0000VarOooO0o = OooO0o(fragment);
        fragment.mFragmentManager = this;
        o0000O00 o0000o00 = this.f5819OooO0OO;
        o0000o00.OooO0oO(o0000VarOooO0o);
        if (!fragment.mDetached) {
            o0000o00.OooO00o(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (Oooo0OO(fragment)) {
                this.f5846OooOooo = true;
            }
        }
        return o0000VarOooO0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public final void OooO0O0(@NonNull o0Oo0oo<?> o0oo0oo2, @NonNull o00oO0o o00oo0o2, @Nullable Fragment fragment) {
        LifecycleOwner lifecycleOwner;
        if (this.f5836OooOo0 != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f5836OooOo0 = o0oo0oo2;
        this.f5838OooOo0O = o00oo0o2;
        this.f5839OooOo0o = fragment;
        CopyOnWriteArrayList<o00000OO> copyOnWriteArrayList = this.f5828OooOOO;
        if (fragment != null) {
            copyOnWriteArrayList.add(new OooOO0O(fragment));
        } else if (o0oo0oo2 instanceof o00000OO) {
            copyOnWriteArrayList.add((o00000OO) o0oo0oo2);
        }
        if (this.f5839OooOo0o != null) {
            Ooooooo();
        }
        if (o0oo0oo2 instanceof androidx.activity.o00Oo0) {
            androidx.activity.o00Oo0 o00oo1 = (androidx.activity.o00Oo0) o0oo0oo2;
            OnBackPressedDispatcher onBackPressedDispatcher = o00oo1.getOnBackPressedDispatcher();
            this.f5823OooO0oO = onBackPressedDispatcher;
            if (fragment != null) {
                lifecycleOwner = o00oo1;
                lifecycleOwner = fragment;
            }
            lifecycleOwner = o00oo1;
            onBackPressedDispatcher.OooO00o(lifecycleOwner, this.f5824OooO0oo);
        }
        if (fragment != null) {
            o00000O o00000o = fragment.mFragmentManager.f5853Oooo0o;
            HashMap<String, o00000O> map = o00000o.f5976OooO0O0;
            o00000O o00000o2 = map.get(fragment.mWho);
            if (o00000o2 == null) {
                o00000o2 = new o00000O(o00000o.f5978OooO0Oo);
                map.put(fragment.mWho, o00000o2);
            }
            this.f5853Oooo0o = o00000o2;
        } else if (o0oo0oo2 instanceof ViewModelStoreOwner) {
            this.f5853Oooo0o = (o00000O) new ViewModelProvider(((ViewModelStoreOwner) o0oo0oo2).getViewModelStore(), o00000O.f5974OooO0oO).get(o00000O.class);
        } else {
            this.f5853Oooo0o = new o00000O(false);
        }
        this.f5853Oooo0o.f5979OooO0o = Oooo0oO();
        this.f5819OooO0OO.f5993OooO0Oo = this.f5853Oooo0o;
        Object obj = this.f5836OooOo0;
        if ((obj instanceof o00O0000.OooO0o) && fragment == null) {
            androidx.savedstate.OooO00o savedStateRegistry = ((o00O0000.OooO0o) obj).getSavedStateRegistry();
            savedStateRegistry.OooO0OO("android:support:fragments", new androidx.savedstate.OooO00o.OooO0O0() { // from class: androidx.fragment.app.o00000
                @Override // androidx.savedstate.OooO00o.OooO0O0
                public final Bundle saveState() {
                    return this.f5971OooO00o.OoooOo0();
                }
            });
            Bundle bundleOooO00o = savedStateRegistry.OooO00o("android:support:fragments");
            if (bundleOooO00o != null) {
                OoooOOo(bundleOooO00o);
            }
        }
        Object obj2 = this.f5836OooOo0;
        if (obj2 instanceof androidx.activity.result.OooOO0) {
            androidx.activity.result.OooO activityResultRegistry = ((androidx.activity.result.OooOO0) obj2).getActivityResultRegistry();
            String strOooO00o = o00O00OO.OooO00o("FragmentManager:", fragment != null ? o0oOO.OooO0O0(new StringBuilder(), fragment.mWho, CertificateUtil.DELIMITER) : "");
            this.f5842OooOoOO = activityResultRegistry.OooO0Oo(androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, "StartActivityForResult"), new p011OooOo0.OooOOO(), new OooOOO0());
            this.f5844OooOoo0 = activityResultRegistry.OooO0Oo(androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, "StartIntentSenderForResult"), new OooOOOO(), new OooOOO());
            this.f5843OooOoo = activityResultRegistry.OooO0Oo(androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, "RequestPermissions"), new p011OooOo0.OooOO0O(), new OooO00o());
        }
        Object obj3 = this.f5836OooOo0;
        if (obj3 instanceof p050o00000Oo.OooO0o) {
            ((p050o00000Oo.OooO0o) obj3).addOnConfigurationChangedListener(this.f5830OooOOOO);
        }
        Object obj4 = this.f5836OooOo0;
        if (obj4 instanceof p050o00000Oo.OooO) {
            ((p050o00000Oo.OooO) obj4).addOnTrimMemoryListener(this.f5831OooOOOo);
        }
        Object obj5 = this.f5836OooOo0;
        if (obj5 instanceof o00000O.o0ooOOo) {
            ((o00000O.o0ooOOo) obj5).addOnMultiWindowModeChangedListener(this.f5833OooOOo0);
        }
        Object obj6 = this.f5836OooOo0;
        if (obj6 instanceof o00000O.o0OOO0o) {
            ((o00000O.o0OOO0o) obj6).addOnPictureInPictureModeChangedListener(this.f5832OooOOo);
        }
        Object obj7 = this.f5836OooOo0;
        if ((obj7 instanceof androidx.core.view.o00Oo0) && fragment == null) {
            ((androidx.core.view.o00Oo0) obj7).addMenuProvider(this.f5834OooOOoo);
        }
    }

    public final void OooO0OO(@NonNull Fragment fragment) {
        if (Oooo0O0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f5819OooO0OO.OooO00o(fragment);
            if (Oooo0O0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (Oooo0OO(fragment)) {
                this.f5846OooOooo = true;
            }
        }
    }

    public final void OooO0Oo() {
        this.f5818OooO0O0 = false;
        this.f5852Oooo0OO.clear();
        this.f5851Oooo0O0.clear();
    }

    @NonNull
    public final o0000 OooO0o(@NonNull Fragment fragment) {
        String str = fragment.mWho;
        o0000O00 o0000o00 = this.f5819OooO0OO;
        o0000 o0000Var = o0000o00.f5991OooO0O0.get(str);
        if (o0000Var != null) {
            return o0000Var;
        }
        o0000 o0000Var2 = new o0000(this.f5829OooOOO0, o0000o00, fragment);
        o0000Var2.OooOO0o(this.f5836OooOo0.f6054OooO0o0.getClassLoader());
        o0000Var2.f5968OooO0o0 = this.f5837OooOo00;
        return o0000Var2;
    }

    public final HashSet OooO0o0() {
        Object oooOOO;
        HashSet hashSet = new HashSet();
        Iterator it = this.f5819OooO0OO.OooO0Oo().iterator();
        while (it.hasNext()) {
            ViewGroup container = ((o0000) it.next()).f5966OooO0OO.mContainer;
            if (container != null) {
                o000OO0O factory = Oooo00o();
                Intrinsics.checkNotNullParameter(container, "container");
                Intrinsics.checkNotNullParameter(factory, "factory");
                int i = p062o0000o0o.o000000O.special_effects_controller_view_tag;
                Object tag = container.getTag(i);
                if (tag instanceof SpecialEffectsController) {
                    oooOOO = (SpecialEffectsController) tag;
                } else {
                    ((OooO) factory).getClass();
                    oooOOO = new androidx.fragment.app.OooOOO(container);
                    Intrinsics.checkNotNullExpressionValue(oooOOO, "factory.createController(container)");
                    container.setTag(i, oooOOO);
                }
                hashSet.add(oooOOO);
            }
        }
        return hashSet;
    }

    public final void OooO0oO(@NonNull Fragment fragment) {
        if (Oooo0O0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (Oooo0O0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            o0000O00 o0000o00 = this.f5819OooO0OO;
            synchronized (o0000o00.f5990OooO00o) {
                o0000o00.f5990OooO00o.remove(fragment);
            }
            fragment.mAdded = false;
            if (Oooo0OO(fragment)) {
                this.f5846OooOooo = true;
            }
            OooooOO(fragment);
        }
    }

    public final void OooO0oo(boolean z, @NonNull Configuration configuration) {
        if (z && (this.f5836OooOo0 instanceof p050o00000Oo.OooO0o)) {
            Oooooo(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f5819OooO0OO.OooO0o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.OooO0oo(true, configuration);
                }
            }
        }
    }

    public final boolean OooOO0(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.f5837OooOo00 < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f5819OooO0OO.OooO0o()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f5822OooO0o0 != null) {
            for (int i = 0; i < this.f5822OooO0o0.size(); i++) {
                Fragment fragment2 = this.f5822OooO0o0.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f5822OooO0o0 = arrayList;
        return z;
    }

    public final void OooOO0O() {
        boolean zIsChangingConfigurations = true;
        this.f5850Oooo00o = true;
        OooOo(true);
        Iterator it = OooO0o0().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).OooO();
        }
        o0Oo0oo<?> o0oo0oo2 = this.f5836OooOo0;
        boolean z = o0oo0oo2 instanceof ViewModelStoreOwner;
        o0000O00 o0000o00 = this.f5819OooO0OO;
        if (z) {
            zIsChangingConfigurations = o0000o00.f5993OooO0Oo.f5980OooO0o0;
        } else {
            Context context = o0oo0oo2.f6054OooO0o0;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator<BackStackState> it2 = this.f5825OooOO0.values().iterator();
            while (it2.hasNext()) {
                for (String str : it2.next().f5772OooO0Oo) {
                    o00000O o00000o = o0000o00.f5993OooO0Oo;
                    o00000o.getClass();
                    if (Oooo0O0(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    o00000o.OooO0Oo(str);
                }
            }
        }
        OooOo00(-1);
        Object obj = this.f5836OooOo0;
        if (obj instanceof p050o00000Oo.OooO) {
            ((p050o00000Oo.OooO) obj).removeOnTrimMemoryListener(this.f5831OooOOOo);
        }
        Object obj2 = this.f5836OooOo0;
        if (obj2 instanceof p050o00000Oo.OooO0o) {
            ((p050o00000Oo.OooO0o) obj2).removeOnConfigurationChangedListener(this.f5830OooOOOO);
        }
        Object obj3 = this.f5836OooOo0;
        if (obj3 instanceof o00000O.o0ooOOo) {
            ((o00000O.o0ooOOo) obj3).removeOnMultiWindowModeChangedListener(this.f5833OooOOo0);
        }
        Object obj4 = this.f5836OooOo0;
        if (obj4 instanceof o00000O.o0OOO0o) {
            ((o00000O.o0OOO0o) obj4).removeOnPictureInPictureModeChangedListener(this.f5832OooOOo);
        }
        Object obj5 = this.f5836OooOo0;
        if ((obj5 instanceof androidx.core.view.o00Oo0) && this.f5839OooOo0o == null) {
            ((androidx.core.view.o00Oo0) obj5).removeMenuProvider(this.f5834OooOOoo);
        }
        this.f5836OooOo0 = null;
        this.f5838OooOo0O = null;
        this.f5839OooOo0o = null;
        if (this.f5823OooO0oO != null) {
            Iterator<androidx.activity.OooO00o> it3 = this.f5824OooO0oo.f2192OooO0O0.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
            this.f5823OooO0oO = null;
        }
        androidx.activity.result.OooO0o oooO0o = this.f5842OooOoOO;
        if (oooO0o != null) {
            oooO0o.OooO0OO();
            this.f5844OooOoo0.OooO0OO();
            this.f5843OooOoo.OooO0OO();
        }
    }

    public final void OooOO0o(boolean z) {
        if (z && (this.f5836OooOo0 instanceof p050o00000Oo.OooO)) {
            Oooooo(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f5819OooO0OO.OooO0o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.OooOO0o(true);
                }
            }
        }
    }

    public final void OooOOO() {
        for (Fragment fragment : this.f5819OooO0OO.OooO0o0()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.OooOOO();
            }
        }
    }

    public final void OooOOO0(boolean z, boolean z2) {
        if (z2 && (this.f5836OooOo0 instanceof o00000O.o0ooOOo)) {
            Oooooo(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f5819OooO0OO.OooO0o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.OooOOO0(z, true);
                }
            }
        }
    }

    public final boolean OooOOOO(@NonNull MenuItem menuItem) {
        if (this.f5837OooOo00 < 1) {
            return false;
        }
        for (Fragment fragment : this.f5819OooO0OO.OooO0o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void OooOOOo(@NonNull Menu menu) {
        if (this.f5837OooOo00 < 1) {
            return;
        }
        for (Fragment fragment : this.f5819OooO0OO.OooO0o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void OooOOo(boolean z, boolean z2) {
        if (z2 && (this.f5836OooOo0 instanceof o00000O.o0OOO0o)) {
            Oooooo(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f5819OooO0OO.OooO0o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.OooOOo(z, true);
                }
            }
        }
    }

    public final void OooOOo0(@Nullable Fragment fragment) {
        if (fragment == null || !fragment.equals(OooOoOO(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public final boolean OooOOoo(@NonNull Menu menu) {
        boolean z = false;
        if (this.f5837OooOo00 < 1) {
            return false;
        }
        for (Fragment fragment : this.f5819OooO0OO.OooO0o()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean OooOo(boolean z) {
        boolean zOooO00o;
        OooOo0o(z);
        boolean z2 = false;
        while (true) {
            ArrayList<androidx.fragment.app.OooO00o> arrayList = this.f5851Oooo0O0;
            ArrayList<Boolean> arrayList2 = this.f5852Oooo0OO;
            synchronized (this.f5817OooO00o) {
                if (this.f5817OooO00o.isEmpty()) {
                    zOooO00o = false;
                } else {
                    try {
                        int size = this.f5817OooO00o.size();
                        zOooO00o = false;
                        for (int i = 0; i < size; i++) {
                            zOooO00o |= this.f5817OooO00o.get(i).OooO00o(arrayList, arrayList2);
                        }
                        this.f5817OooO00o.clear();
                        this.f5836OooOo0.f6053OooO0o.removeCallbacks(this.f5855Oooo0oO);
                    } catch (Throwable th) {
                        this.f5817OooO00o.clear();
                        this.f5836OooOo0.f6053OooO0o.removeCallbacks(this.f5855Oooo0oO);
                        throw th;
                    }
                }
            }
            if (!zOooO00o) {
                break;
            }
            z2 = true;
            this.f5818OooO0O0 = true;
            try {
                OoooOOO(this.f5851Oooo0O0, this.f5852Oooo0OO);
                OooO0Oo();
            } catch (Throwable th2) {
                OooO0Oo();
                throw th2;
            }
        }
        Ooooooo();
        if (this.f5847Oooo0) {
            this.f5847Oooo0 = false;
            Oooooo0();
        }
        this.f5819OooO0OO.f5991OooO0O0.values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void OooOo0(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        int size;
        int size2;
        String strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(str, "    ");
        o0000O00 o0000o00 = this.f5819OooO0OO;
        o0000o00.getClass();
        String str2 = str + "    ";
        HashMap<String, o0000> map = o0000o00.f5991OooO0O0;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (o0000 o0000Var : map.values()) {
                printWriter.print(str);
                if (o0000Var != null) {
                    Fragment fragment = o0000Var.f5966OooO0OO;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList<Fragment> arrayList = o0000o00.f5990OooO00o;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                Fragment fragment2 = arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.f5822OooO0o0;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment3 = this.f5822OooO0o0.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.OooO00o> arrayList3 = this.f5820OooO0Oo;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                androidx.fragment.app.OooO00o oooO00o = this.f5820OooO0Oo.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(oooO00o.toString());
                oooO00o.OooOO0(strOooO00o, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f5816OooO.get());
        synchronized (this.f5817OooO00o) {
            int size4 = this.f5817OooO00o.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (OooOo) this.f5817OooO00o.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f5836OooOo0);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f5838OooOo0O);
        if (this.f5839OooOo0o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f5839OooOo0o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f5837OooOo00);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f5848Oooo000);
        printWriter.print(" mStopped=");
        printWriter.print(this.f5849Oooo00O);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f5850Oooo00o);
        if (this.f5846OooOooo) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f5846OooOooo);
        }
    }

    public final void OooOo00(int i) {
        try {
            this.f5818OooO0O0 = true;
            for (o0000 o0000Var : this.f5819OooO0OO.f5991OooO0O0.values()) {
                if (o0000Var != null) {
                    o0000Var.f5968OooO0o0 = i;
                }
            }
            Oooo0oo(i, false);
            Iterator it = OooO0o0().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).OooO();
            }
            this.f5818OooO0O0 = false;
            OooOo(true);
        } catch (Throwable th) {
            this.f5818OooO0O0 = false;
            throw th;
        }
    }

    public final void OooOo0O(@NonNull OooOo oooOo, boolean z) {
        if (!z) {
            if (this.f5836OooOo0 == null) {
                if (!this.f5850Oooo00o) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (Oooo0oO()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f5817OooO00o) {
            if (this.f5836OooOo0 == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f5817OooO00o.add(oooOo);
                OoooOoo();
            }
        }
    }

    public final void OooOo0o(boolean z) {
        if (this.f5818OooO0O0) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f5836OooOo0 == null) {
            if (!this.f5850Oooo00o) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f5836OooOo0.f6053OooO0o.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && Oooo0oO()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f5851Oooo0O0 == null) {
            this.f5851Oooo0O0 = new ArrayList<>();
            this.f5852Oooo0OO = new ArrayList<>();
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0215 A[PHI: r13
      0x0215: PHI (r13v10 int) = (r13v9 int), (r13v11 int) binds: [B:101:0x0203, B:103:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0153  */
    public final void OooOoO(@NonNull ArrayList<androidx.fragment.app.OooO00o> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        o0000O00 o0000o00;
        o0000O00 o0000o01;
        int i3;
        ArrayList<androidx.fragment.app.OooO00o> arrayList3 = arrayList;
        boolean z = arrayList3.get(i).f6015OooOOOO;
        ArrayList<Fragment> arrayList4 = this.f5854Oooo0o0;
        if (arrayList4 == null) {
            this.f5854Oooo0o0 = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        ArrayList<Fragment> arrayList5 = this.f5854Oooo0o0;
        o0000O00 o0000o02 = this.f5819OooO0OO;
        arrayList5.addAll(o0000o02.OooO0o());
        Fragment fragment = this.f5835OooOo;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            int i5 = 1;
            if (i4 >= i2) {
                o0000O00 o0000o03 = o0000o02;
                this.f5854Oooo0o0.clear();
                if (!z && this.f5837OooOo00 >= 1) {
                    for (int i6 = i; i6 < i2; i6++) {
                        Iterator<o0000oo.OooO00o> it = arrayList.get(i6).f6002OooO00o.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = it.next().f6018OooO0O0;
                            if (fragment2 == null || fragment2.mFragmentManager == null) {
                                o0000o00 = o0000o03;
                            } else {
                                o0000o00 = o0000o03;
                                o0000o00.OooO0oO(OooO0o(fragment2));
                            }
                            o0000o03 = o0000o00;
                        }
                    }
                }
                for (int i7 = i; i7 < i2; i7++) {
                    androidx.fragment.app.OooO00o oooO00o = arrayList.get(i7);
                    if (!arrayList2.get(i7).booleanValue()) {
                        oooO00o.OooO0Oo(1);
                        ArrayList<o0000oo.OooO00o> arrayList6 = oooO00o.f6002OooO00o;
                        int size = arrayList6.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            o0000oo.OooO00o oooO00o2 = arrayList6.get(i8);
                            Fragment fragment3 = oooO00o2.f6018OooO0O0;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = false;
                                fragment3.setPopDirection(false);
                                fragment3.setNextTransition(oooO00o.f6006OooO0o);
                                fragment3.setSharedElementNames(oooO00o.f6014OooOOO0, oooO00o.f6013OooOOO);
                            }
                            int i9 = oooO00o2.f6017OooO00o;
                            FragmentManager fragmentManager = oooO00o.f5896OooOOOo;
                            switch (i9) {
                                case 1:
                                    fragment3.setAnimations(oooO00o2.f6020OooO0Oo, oooO00o2.f6022OooO0o0, oooO00o2.f6021OooO0o, oooO00o2.f6023OooO0oO);
                                    fragmentManager.Ooooo00(fragment3, false);
                                    fragmentManager.OooO00o(fragment3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + oooO00o2.f6017OooO00o);
                                case 3:
                                    fragment3.setAnimations(oooO00o2.f6020OooO0Oo, oooO00o2.f6022OooO0o0, oooO00o2.f6021OooO0o, oooO00o2.f6023OooO0oO);
                                    fragmentManager.o000oOoO(fragment3);
                                    break;
                                case 4:
                                    fragment3.setAnimations(oooO00o2.f6020OooO0Oo, oooO00o2.f6022OooO0o0, oooO00o2.f6021OooO0o, oooO00o2.f6023OooO0oO);
                                    fragmentManager.Oooo0(fragment3);
                                    break;
                                case 5:
                                    fragment3.setAnimations(oooO00o2.f6020OooO0Oo, oooO00o2.f6022OooO0o0, oooO00o2.f6021OooO0o, oooO00o2.f6023OooO0oO);
                                    fragmentManager.Ooooo00(fragment3, false);
                                    OooooOo(fragment3);
                                    break;
                                case 6:
                                    fragment3.setAnimations(oooO00o2.f6020OooO0Oo, oooO00o2.f6022OooO0o0, oooO00o2.f6021OooO0o, oooO00o2.f6023OooO0oO);
                                    fragmentManager.OooO0oO(fragment3);
                                    break;
                                case 7:
                                    fragment3.setAnimations(oooO00o2.f6020OooO0Oo, oooO00o2.f6022OooO0o0, oooO00o2.f6021OooO0o, oooO00o2.f6023OooO0oO);
                                    fragmentManager.Ooooo00(fragment3, false);
                                    fragmentManager.OooO0OO(fragment3);
                                    break;
                                case 8:
                                    fragmentManager.OooooO0(fragment3);
                                    break;
                                case 9:
                                    fragmentManager.OooooO0(null);
                                    break;
                                case 10:
                                    fragmentManager.Ooooo0o(fragment3, oooO00o2.f6016OooO);
                                    break;
                            }
                        }
                    } else {
                        oooO00o.OooO0Oo(-1);
                        ArrayList<o0000oo.OooO00o> arrayList7 = oooO00o.f6002OooO00o;
                        boolean z3 = true;
                        int size2 = arrayList7.size() - 1;
                        while (size2 >= 0) {
                            o0000oo.OooO00o oooO00o3 = arrayList7.get(size2);
                            Fragment fragment4 = oooO00o3.f6018OooO0O0;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = false;
                                fragment4.setPopDirection(z3);
                                int i10 = oooO00o.f6006OooO0o;
                                int i11 = 8194;
                                int i12 = 4097;
                                if (i10 != 4097) {
                                    if (i10 != 8194) {
                                        i11 = 8197;
                                        i12 = 4100;
                                        if (i10 == 8197) {
                                            i11 = i12;
                                        } else if (i10 == 4099) {
                                            i11 = 4099;
                                        } else if (i10 != 4100) {
                                            i11 = 0;
                                        }
                                    } else {
                                        i11 = i12;
                                    }
                                }
                                fragment4.setNextTransition(i11);
                                fragment4.setSharedElementNames(oooO00o.f6013OooOOO, oooO00o.f6014OooOOO0);
                            }
                            int i13 = oooO00o3.f6017OooO00o;
                            FragmentManager fragmentManager2 = oooO00o.f5896OooOOOo;
                            switch (i13) {
                                case 1:
                                    fragment4.setAnimations(oooO00o3.f6020OooO0Oo, oooO00o3.f6022OooO0o0, oooO00o3.f6021OooO0o, oooO00o3.f6023OooO0oO);
                                    fragmentManager2.Ooooo00(fragment4, true);
                                    fragmentManager2.o000oOoO(fragment4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + oooO00o3.f6017OooO00o);
                                case 3:
                                    fragment4.setAnimations(oooO00o3.f6020OooO0Oo, oooO00o3.f6022OooO0o0, oooO00o3.f6021OooO0o, oooO00o3.f6023OooO0oO);
                                    fragmentManager2.OooO00o(fragment4);
                                    break;
                                case 4:
                                    fragment4.setAnimations(oooO00o3.f6020OooO0Oo, oooO00o3.f6022OooO0o0, oooO00o3.f6021OooO0o, oooO00o3.f6023OooO0oO);
                                    fragmentManager2.getClass();
                                    OooooOo(fragment4);
                                    break;
                                case 5:
                                    fragment4.setAnimations(oooO00o3.f6020OooO0Oo, oooO00o3.f6022OooO0o0, oooO00o3.f6021OooO0o, oooO00o3.f6023OooO0oO);
                                    fragmentManager2.Ooooo00(fragment4, true);
                                    fragmentManager2.Oooo0(fragment4);
                                    break;
                                case 6:
                                    fragment4.setAnimations(oooO00o3.f6020OooO0Oo, oooO00o3.f6022OooO0o0, oooO00o3.f6021OooO0o, oooO00o3.f6023OooO0oO);
                                    fragmentManager2.OooO0OO(fragment4);
                                    break;
                                case 7:
                                    fragment4.setAnimations(oooO00o3.f6020OooO0Oo, oooO00o3.f6022OooO0o0, oooO00o3.f6021OooO0o, oooO00o3.f6023OooO0oO);
                                    fragmentManager2.Ooooo00(fragment4, true);
                                    fragmentManager2.OooO0oO(fragment4);
                                    break;
                                case 8:
                                    fragmentManager2.OooooO0(null);
                                    break;
                                case 9:
                                    fragmentManager2.OooooO0(fragment4);
                                    break;
                                case 10:
                                    fragmentManager2.Ooooo0o(fragment4, oooO00o3.f6024OooO0oo);
                                    break;
                            }
                            size2--;
                            z3 = true;
                        }
                    }
                }
                boolean zBooleanValue = arrayList2.get(i2 - 1).booleanValue();
                for (int i14 = i; i14 < i2; i14++) {
                    androidx.fragment.app.OooO00o oooO00o4 = arrayList.get(i14);
                    if (zBooleanValue) {
                        for (int size3 = oooO00o4.f6002OooO00o.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment5 = oooO00o4.f6002OooO00o.get(size3).f6018OooO0O0;
                            if (fragment5 != null) {
                                OooO0o(fragment5).OooOO0O();
                            }
                        }
                    } else {
                        Iterator<o0000oo.OooO00o> it2 = oooO00o4.f6002OooO00o.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment6 = it2.next().f6018OooO0O0;
                            if (fragment6 != null) {
                                OooO0o(fragment6).OooOO0O();
                            }
                        }
                    }
                }
                Oooo0oo(this.f5837OooOo00, true);
                HashSet<SpecialEffectsController> hashSet = new HashSet();
                for (int i15 = i; i15 < i2; i15++) {
                    Iterator<o0000oo.OooO00o> it3 = arrayList.get(i15).f6002OooO00o.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment7 = it3.next().f6018OooO0O0;
                        if (fragment7 != null && (viewGroup = fragment7.mContainer) != null) {
                            hashSet.add(SpecialEffectsController.OooOO0(viewGroup, this));
                        }
                    }
                }
                for (SpecialEffectsController specialEffectsController : hashSet) {
                    specialEffectsController.f5949OooO0Oo = zBooleanValue;
                    specialEffectsController.OooOO0O();
                    specialEffectsController.OooO0oO();
                }
                for (int i16 = i; i16 < i2; i16++) {
                    androidx.fragment.app.OooO00o oooO00o5 = arrayList.get(i16);
                    if (arrayList2.get(i16).booleanValue() && oooO00o5.f5897OooOOo >= 0) {
                        oooO00o5.f5897OooOOo = -1;
                    }
                    oooO00o5.getClass();
                }
                return;
            }
            androidx.fragment.app.OooO00o oooO00o6 = arrayList3.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                o0000o01 = o0000o02;
                int i17 = 1;
                ArrayList<Fragment> arrayList8 = this.f5854Oooo0o0;
                ArrayList<o0000oo.OooO00o> arrayList9 = oooO00o6.f6002OooO00o;
                int size4 = arrayList9.size() - 1;
                while (size4 >= 0) {
                    o0000oo.OooO00o oooO00o7 = arrayList9.get(size4);
                    int i18 = oooO00o7.f6017OooO00o;
                    if (i18 != i17) {
                        if (i18 != 3) {
                            switch (i18) {
                                case 6:
                                    arrayList8.add(oooO00o7.f6018OooO0O0);
                                    break;
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = oooO00o7.f6018OooO0O0;
                                    break;
                                case 10:
                                    oooO00o7.f6016OooO = oooO00o7.f6024OooO0oo;
                                    break;
                            }
                        } else {
                            arrayList8.add(oooO00o7.f6018OooO0O0);
                        }
                        size4--;
                        i17 = 1;
                    }
                    arrayList8.remove(oooO00o7.f6018OooO0O0);
                    size4--;
                    i17 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList10 = this.f5854Oooo0o0;
                int i19 = 0;
                while (true) {
                    ArrayList<o0000oo.OooO00o> arrayList11 = oooO00o6.f6002OooO00o;
                    if (i19 < arrayList11.size()) {
                        o0000oo.OooO00o oooO00o8 = arrayList11.get(i19);
                        int i20 = oooO00o8.f6017OooO00o;
                        if (i20 != i5) {
                            if (i20 != 2) {
                                if (i20 == 3 || i20 == 6) {
                                    arrayList10.remove(oooO00o8.f6018OooO0O0);
                                    Fragment fragment8 = oooO00o8.f6018OooO0O0;
                                    if (fragment8 == fragment) {
                                        arrayList11.add(i19, new o0000oo.OooO00o(fragment8, 9));
                                        i19++;
                                        o0000o02 = o0000o02;
                                        i3 = 1;
                                        fragment = null;
                                    }
                                } else if (i20 == 7) {
                                    i3 = 1;
                                } else if (i20 == 8) {
                                    arrayList11.add(i19, new o0000oo.OooO00o(9, fragment));
                                    oooO00o8.f6019OooO0OO = true;
                                    i19++;
                                    fragment = oooO00o8.f6018OooO0O0;
                                }
                                o0000o02 = o0000o02;
                                i3 = 1;
                            } else {
                                Fragment fragment9 = oooO00o8.f6018OooO0O0;
                                int i21 = fragment9.mContainerId;
                                int size5 = arrayList10.size() - 1;
                                boolean z4 = false;
                                while (size5 >= 0) {
                                    o0000O00 o0000o04 = o0000o02;
                                    Fragment fragment10 = arrayList10.get(size5);
                                    if (fragment10.mContainerId == i21) {
                                        if (fragment10 == fragment9) {
                                            z4 = true;
                                        } else {
                                            if (fragment10 == fragment) {
                                                arrayList11.add(i19, new o0000oo.OooO00o(9, fragment10));
                                                i19++;
                                                fragment = null;
                                            }
                                            o0000oo.OooO00o oooO00o9 = new o0000oo.OooO00o(3, fragment10);
                                            oooO00o9.f6020OooO0Oo = oooO00o8.f6020OooO0Oo;
                                            oooO00o9.f6021OooO0o = oooO00o8.f6021OooO0o;
                                            oooO00o9.f6022OooO0o0 = oooO00o8.f6022OooO0o0;
                                            oooO00o9.f6023OooO0oO = oooO00o8.f6023OooO0oO;
                                            arrayList11.add(i19, oooO00o9);
                                            arrayList10.remove(fragment10);
                                            i19++;
                                            fragment = fragment;
                                        }
                                    }
                                    size5--;
                                    o0000o02 = o0000o04;
                                }
                                o0000o02 = o0000o02;
                                i3 = 1;
                                if (z4) {
                                    arrayList11.remove(i19);
                                    i19--;
                                } else {
                                    oooO00o8.f6017OooO00o = 1;
                                    oooO00o8.f6019OooO0OO = true;
                                    arrayList10.add(fragment9);
                                }
                            }
                            i19 += i3;
                            i5 = i3;
                            o0000o02 = o0000o02;
                        } else {
                            i3 = i5;
                        }
                        arrayList10.add(oooO00o8.f6018OooO0O0);
                        i19 += i3;
                        i5 = i3;
                        o0000o02 = o0000o02;
                    } else {
                        o0000o01 = o0000o02;
                    }
                }
            }
            z2 = z2 || oooO00o6.f6008OooO0oO;
            i4++;
            arrayList3 = arrayList;
            o0000o02 = o0000o01;
        }
    }

    public final void OooOoO0(@NonNull OooOo oooOo, boolean z) {
        if (z && (this.f5836OooOo0 == null || this.f5850Oooo00o)) {
            return;
        }
        OooOo0o(z);
        if (oooOo.OooO00o(this.f5851Oooo0O0, this.f5852Oooo0OO)) {
            this.f5818OooO0O0 = true;
            try {
                OoooOOO(this.f5851Oooo0O0, this.f5852Oooo0OO);
                OooO0Oo();
            } catch (Throwable th) {
                OooO0Oo();
                throw th;
            }
        }
        Ooooooo();
        if (this.f5847Oooo0) {
            this.f5847Oooo0 = false;
            Oooooo0();
        }
        this.f5819OooO0OO.f5991OooO0O0.values().removeAll(Collections.singleton(null));
    }

    @Nullable
    public final Fragment OooOoOO(@NonNull String str) {
        return this.f5819OooO0OO.OooO0O0(str);
    }

    @Nullable
    public final Fragment OooOoo(@Nullable String str) {
        o0000O00 o0000o00 = this.f5819OooO0OO;
        if (str != null) {
            ArrayList<Fragment> arrayList = o0000o00.f5990OooO00o;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (o0000 o0000Var : o0000o00.f5991OooO0O0.values()) {
                if (o0000Var != null) {
                    Fragment fragment2 = o0000Var.f5966OooO0OO;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        } else {
            o0000o00.getClass();
        }
        return null;
    }

    @Nullable
    public final Fragment OooOoo0(@IdRes int i) {
        o0000O00 o0000o00 = this.f5819OooO0OO;
        ArrayList<Fragment> arrayList = o0000o00.f5990OooO00o;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (o0000 o0000Var : o0000o00.f5991OooO0O0.values()) {
                    if (o0000Var != null) {
                        Fragment fragment = o0000Var.f5966OooO0OO;
                        if (fragment.mFragmentId == i) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = arrayList.get(size);
            if (fragment2 != null && fragment2.mFragmentId == i) {
                return fragment2;
            }
        }
    }

    public final void OooOooO() {
        for (SpecialEffectsController specialEffectsController : OooO0o0()) {
            if (specialEffectsController.f5950OooO0o0) {
                if (Oooo0O0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                specialEffectsController.f5950OooO0o0 = false;
                specialEffectsController.OooO0oO();
            }
        }
    }

    public final ViewGroup OooOooo(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f5838OooOo0O.OooO0OO()) {
            View viewOooO0O0 = this.f5838OooOo0O.OooO0O0(fragment.mContainerId);
            if (viewOooO0O0 instanceof ViewGroup) {
                return (ViewGroup) viewOooO0O0;
            }
        }
        return null;
    }

    public final void Oooo() {
        if (this.f5836OooOo0 == null) {
            return;
        }
        this.f5848Oooo000 = false;
        this.f5849Oooo00O = false;
        this.f5853Oooo0o.f5979OooO0o = false;
        for (Fragment fragment : this.f5819OooO0OO.OooO0o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void Oooo0(@NonNull Fragment fragment) {
        if (Oooo0O0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        OooooOO(fragment);
    }

    @NonNull
    public final o0OOO0o Oooo000() {
        Fragment fragment = this.f5839OooOo0o;
        return fragment != null ? fragment.mFragmentManager.Oooo000() : this.f5841OooOoO0;
    }

    @NonNull
    public final List<Fragment> Oooo00O() {
        return this.f5819OooO0OO.OooO0o();
    }

    @NonNull
    public final o000OO0O Oooo00o() {
        Fragment fragment = this.f5839OooOo0o;
        return fragment != null ? fragment.mFragmentManager.Oooo00o() : this.f5840OooOoO;
    }

    public final boolean Oooo0o0() {
        Fragment fragment = this.f5839OooOo0o;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f5839OooOo0o.getParentFragmentManager().Oooo0o0();
    }

    public final boolean Oooo0oO() {
        return this.f5848Oooo000 || this.f5849Oooo00O;
    }

    public final void Oooo0oo(int i, boolean z) {
        HashMap<String, o0000> map;
        o0Oo0oo<?> o0oo0oo2;
        if (this.f5836OooOo0 == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f5837OooOo00) {
            this.f5837OooOo00 = i;
            o0000O00 o0000o00 = this.f5819OooO0OO;
            Iterator<Fragment> it = o0000o00.f5990OooO00o.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = o0000o00.f5991OooO0O0;
                if (!zHasNext) {
                    break;
                }
                o0000 o0000Var = map.get(it.next().mWho);
                if (o0000Var != null) {
                    o0000Var.OooOO0O();
                }
            }
            Iterator<o0000> it2 = map.values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                o0000 next = it2.next();
                if (next != null) {
                    next.OooOO0O();
                    Fragment fragment = next.f5966OooO0OO;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        z2 = true;
                    }
                    if (z2) {
                        if (fragment.mBeingSaved && !o0000o00.f5992OooO0OO.containsKey(fragment.mWho)) {
                            o0000o00.OooO(next.OooOOO(), fragment.mWho);
                        }
                        o0000o00.OooO0oo(next);
                    }
                }
            }
            Oooooo0();
            if (this.f5846OooOooo && (o0oo0oo2 = this.f5836OooOo0) != null && this.f5837OooOo00 == 7) {
                o0oo0oo2.OooO0oo();
                this.f5846OooOooo = false;
            }
        }
    }

    public final void OoooO(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            Oooooo(new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final boolean OoooO0(int i, int i2) {
        OooOo(false);
        OooOo0o(true);
        Fragment fragment = this.f5835OooOo;
        if (fragment != null && i < 0 && fragment.getChildFragmentManager().OoooO00()) {
            return true;
        }
        boolean zOoooO0O = OoooO0O(this.f5851Oooo0O0, this.f5852Oooo0OO, i, i2);
        if (zOoooO0O) {
            this.f5818OooO0O0 = true;
            try {
                OoooOOO(this.f5851Oooo0O0, this.f5852Oooo0OO);
                OooO0Oo();
            } catch (Throwable th) {
                OooO0Oo();
                throw th;
            }
        }
        Ooooooo();
        if (this.f5847Oooo0) {
            this.f5847Oooo0 = false;
            Oooooo0();
        }
        this.f5819OooO0OO.f5991OooO0O0.values().removeAll(Collections.singleton(null));
        return zOoooO0O;
    }

    @MainThread
    public final boolean OoooO00() {
        return OoooO0(-1, 0);
    }

    public final boolean OoooO0O(@NonNull ArrayList arrayList, @NonNull ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList<androidx.fragment.app.OooO00o> arrayList3 = this.f5820OooO0Oo;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : (-1) + this.f5820OooO0Oo.size();
            } else {
                int size2 = this.f5820OooO0Oo.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.OooO00o oooO00o = this.f5820OooO0Oo.get(size2);
                    if (i >= 0 && i == oooO00o.f5897OooOOo) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z) {
                        while (size2 > 0) {
                            int i3 = size2 - 1;
                            androidx.fragment.app.OooO00o oooO00o2 = this.f5820OooO0Oo.get(i3);
                            if (i < 0 || i != oooO00o2.f5897OooOOo) {
                                break;
                            }
                            size2 = i3;
                        }
                    } else if (size2 != this.f5820OooO0Oo.size() - 1) {
                        size2++;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f5820OooO0Oo.size() - 1; size3 >= size; size3--) {
            arrayList.add(this.f5820OooO0Oo.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void OoooOO0(@NonNull OooOo00 oooOo00, boolean z) {
        this.f5829OooOOO0.f6065OooO00o.add(new oo0o0Oo.OooO00o(oooOo00, z));
    }

    public final void OoooOOO(@NonNull ArrayList<androidx.fragment.app.OooO00o> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).f6015OooOOOO) {
                if (i2 != i) {
                    OooOoO(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f6015OooOOOO) {
                        i2++;
                    }
                }
                OooOoO(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            OooOoO(arrayList, arrayList2, i2, size);
        }
    }

    public final void OoooOOo(@Nullable Bundle bundle) {
        oo0o0Oo oo0o0oo;
        int i;
        o0000 o0000Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f5836OooOo0.f6054OooO0o0.getClassLoader());
                this.f5826OooOO0O.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f5836OooOo0.f6054OooO0o0.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        o0000O00 o0000o00 = this.f5819OooO0OO;
        HashMap<String, Bundle> map2 = o0000o00.f5992OooO0OO;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        HashMap<String, o0000> map3 = o0000o00.f5991OooO0O0;
        map3.clear();
        Iterator<String> it = fragmentManagerState.f5870OooO0Oo.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            oo0o0oo = this.f5829OooOOO0;
            if (!zHasNext) {
                break;
            }
            Bundle bundleOooO = o0000o00.OooO(null, it.next());
            if (bundleOooO != null) {
                Fragment fragment = this.f5853Oooo0o.f5975OooO00o.get(((FragmentState) bundleOooO.getParcelable("state")).f5880OooO0o0);
                if (fragment != null) {
                    if (Oooo0O0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    o0000Var = new o0000(oo0o0oo, o0000o00, fragment, bundleOooO);
                } else {
                    o0000Var = new o0000(this.f5829OooOOO0, this.f5819OooO0OO, this.f5836OooOo0.f6054OooO0o0.getClassLoader(), Oooo000(), bundleOooO);
                }
                Fragment fragment2 = o0000Var.f5966OooO0OO;
                fragment2.mSavedFragmentState = bundleOooO;
                fragment2.mFragmentManager = this;
                if (Oooo0O0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                o0000Var.OooOO0o(this.f5836OooOo0.f6054OooO0o0.getClassLoader());
                o0000o00.OooO0oO(o0000Var);
                o0000Var.f5968OooO0o0 = this.f5837OooOo00;
            }
        }
        o00000O o00000o = this.f5853Oooo0o;
        o00000o.getClass();
        Iterator it2 = new ArrayList(o00000o.f5975OooO00o.values()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Fragment fragment3 = (Fragment) it2.next();
            if ((map3.get(fragment3.mWho) != null ? 1 : 0) == 0) {
                if (Oooo0O0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f5870OooO0Oo);
                }
                this.f5853Oooo0o.OooO0o0(fragment3);
                fragment3.mFragmentManager = this;
                o0000 o0000Var2 = new o0000(oo0o0oo, o0000o00, fragment3);
                o0000Var2.f5968OooO0o0 = 1;
                o0000Var2.OooOO0O();
                fragment3.mRemoving = true;
                o0000Var2.OooOO0O();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f5872OooO0o0;
        o0000o00.f5990OooO00o.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentOooO0O0 = o0000o00.OooO0O0(str3);
                if (fragmentOooO0O0 == null) {
                    throw new IllegalStateException(p004OooO0oO.o000oOoO.OooO0O0("No instantiated fragment for (", str3, ")"));
                }
                if (Oooo0O0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentOooO0O0);
                }
                o0000o00.OooO00o(fragmentOooO0O0);
            }
        }
        if (fragmentManagerState.f5871OooO0o != null) {
            this.f5820OooO0Oo = new ArrayList<>(fragmentManagerState.f5871OooO0o.length);
            int i2 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f5871OooO0o;
                if (i2 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i2];
                backStackRecordState.getClass();
                androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = backStackRecordState.f5759OooO0Oo;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    o0000oo.OooO00o oooO00o2 = new o0000oo.OooO00o();
                    int i5 = i3 + 1;
                    oooO00o2.f6017OooO00o = iArr[i3];
                    if (Oooo0O0(2)) {
                        Log.v("FragmentManager", "Instantiate " + oooO00o + " op #" + i4 + " base fragment #" + iArr[i5]);
                    }
                    oooO00o2.f6024OooO0oo = Lifecycle.State.values()[backStackRecordState.f5760OooO0o[i4]];
                    oooO00o2.f6016OooO = Lifecycle.State.values()[backStackRecordState.f5762OooO0oO[i4]];
                    int i6 = i5 + 1;
                    oooO00o2.f6019OooO0OO = iArr[i5] != 0;
                    int i7 = i6 + 1;
                    int i8 = iArr[i6];
                    oooO00o2.f6020OooO0Oo = i8;
                    int i9 = i7 + 1;
                    int i10 = iArr[i7];
                    oooO00o2.f6022OooO0o0 = i10;
                    int i11 = i9 + 1;
                    int i12 = iArr[i9];
                    oooO00o2.f6021OooO0o = i12;
                    int i13 = iArr[i11];
                    oooO00o2.f6023OooO0oO = i13;
                    oooO00o.f6003OooO0O0 = i8;
                    oooO00o.f6004OooO0OO = i10;
                    oooO00o.f6005OooO0Oo = i12;
                    oooO00o.f6007OooO0o0 = i13;
                    oooO00o.OooO0O0(oooO00o2);
                    i4++;
                    i3 = i11 + 1;
                }
                oooO00o.f6006OooO0o = backStackRecordState.f5763OooO0oo;
                oooO00o.f6009OooO0oo = backStackRecordState.f5758OooO;
                oooO00o.f6008OooO0oO = true;
                oooO00o.f6001OooO = backStackRecordState.f5765OooOO0O;
                oooO00o.f6010OooOO0 = backStackRecordState.f5766OooOO0o;
                oooO00o.f6011OooOO0O = backStackRecordState.f5768OooOOO0;
                oooO00o.f6012OooOO0o = backStackRecordState.f5767OooOOO;
                oooO00o.f6014OooOOO0 = backStackRecordState.f5769OooOOOO;
                oooO00o.f6013OooOOO = backStackRecordState.f5770OooOOOo;
                oooO00o.f6015OooOOOO = backStackRecordState.f5771OooOOo0;
                oooO00o.f5897OooOOo = backStackRecordState.f5764OooOO0;
                int i14 = 0;
                while (true) {
                    ArrayList<String> arrayList2 = backStackRecordState.f5761OooO0o0;
                    if (i14 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = arrayList2.get(i14);
                    if (str4 != null) {
                        oooO00o.f6002OooO00o.get(i14).f6018OooO0O0 = OooOoOO(str4);
                    }
                    i14++;
                }
                oooO00o.OooO0Oo(1);
                if (Oooo0O0(2)) {
                    StringBuilder sbOooO0O0 = androidx.appcompat.widget.o0000O0.OooO0O0("restoreAllState: back stack #", i2, " (index ");
                    sbOooO0O0.append(oooO00o.f5897OooOOo);
                    sbOooO0O0.append("): ");
                    sbOooO0O0.append(oooO00o);
                    Log.v("FragmentManager", sbOooO0O0.toString());
                    PrintWriter printWriter = new PrintWriter(new o000O00());
                    oooO00o.OooOO0("  ", printWriter, false);
                    printWriter.close();
                }
                this.f5820OooO0Oo.add(oooO00o);
                i2++;
            }
        } else {
            this.f5820OooO0Oo = null;
        }
        this.f5816OooO.set(fragmentManagerState.f5873OooO0oO);
        String str5 = fragmentManagerState.f5874OooO0oo;
        if (str5 != null) {
            Fragment fragmentOooOoOO = OooOoOO(str5);
            this.f5835OooOo = fragmentOooOoOO;
            OooOOo0(fragmentOooOoOO);
        }
        ArrayList<String> arrayList3 = fragmentManagerState.f5869OooO;
        if (arrayList3 != null) {
            for (i = 0; i < arrayList3.size(); i++) {
                this.f5825OooOO0.put(arrayList3.get(i), fragmentManagerState.f5875OooOO0.get(i));
            }
        }
        this.f5845OooOooO = new ArrayDeque<>(fragmentManagerState.f5876OooOO0O);
    }

    @NonNull
    public final Bundle OoooOo0() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        OooOooO();
        Iterator it = OooO0o0().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).OooO();
        }
        OooOo(true);
        this.f5848Oooo000 = true;
        this.f5853Oooo0o.f5979OooO0o = true;
        o0000O00 o0000o00 = this.f5819OooO0OO;
        o0000o00.getClass();
        HashMap<String, o0000> map = o0000o00.f5991OooO0O0;
        ArrayList<String> arrayList2 = new ArrayList<>(map.size());
        for (o0000 o0000Var : map.values()) {
            if (o0000Var != null) {
                Fragment fragment = o0000Var.f5966OooO0OO;
                o0000o00.OooO(o0000Var.OooOOO(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (Oooo0O0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap<String, Bundle> map2 = this.f5819OooO0OO.f5992OooO0OO;
        if (!map2.isEmpty()) {
            o0000O00 o0000o01 = this.f5819OooO0OO;
            synchronized (o0000o01.f5990OooO00o) {
                backStackRecordStateArr = null;
                if (o0000o01.f5990OooO00o.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(o0000o01.f5990OooO00o.size());
                    for (Fragment fragment2 : o0000o01.f5990OooO00o) {
                        arrayList.add(fragment2.mWho);
                        if (Oooo0O0(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                        }
                    }
                }
            }
            ArrayList<androidx.fragment.app.OooO00o> arrayList3 = this.f5820OooO0Oo;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState(this.f5820OooO0Oo.get(i));
                    if (Oooo0O0(2)) {
                        StringBuilder sbOooO0O0 = androidx.appcompat.widget.o0000O0.OooO0O0("saveAllState: adding back stack #", i, ": ");
                        sbOooO0O0.append(this.f5820OooO0Oo.get(i));
                        Log.v("FragmentManager", sbOooO0O0.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f5870OooO0Oo = arrayList2;
            fragmentManagerState.f5872OooO0o0 = arrayList;
            fragmentManagerState.f5871OooO0o = backStackRecordStateArr;
            fragmentManagerState.f5873OooO0oO = this.f5816OooO.get();
            Fragment fragment3 = this.f5835OooOo;
            if (fragment3 != null) {
                fragmentManagerState.f5874OooO0oo = fragment3.mWho;
            }
            fragmentManagerState.f5869OooO.addAll(this.f5825OooOO0.keySet());
            fragmentManagerState.f5875OooOO0.addAll(this.f5825OooOO0.values());
            fragmentManagerState.f5876OooOO0O = new ArrayList<>(this.f5845OooOooO);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.f5826OooOO0O.keySet()) {
                bundle.putBundle(o00O00OO.OooO00o("result_", str), this.f5826OooOO0O.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(o00O00OO.OooO00o("fragment_", str2), map2.get(str2));
            }
        } else if (Oooo0O0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    @Nullable
    public final Fragment.SavedState OoooOoO(@NonNull Fragment fragment) {
        o0000 o0000Var = this.f5819OooO0OO.f5991OooO0O0.get(fragment.mWho);
        if (o0000Var != null) {
            Fragment fragment2 = o0000Var.f5966OooO0OO;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState > -1) {
                    return new Fragment.SavedState(o0000Var.OooOOO());
                }
                return null;
            }
        }
        Oooooo(new IllegalStateException(androidx.compose.animation.o00O0O.OooO0O0("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void OoooOoo() {
        synchronized (this.f5817OooO00o) {
            boolean z = true;
            if (this.f5817OooO00o.size() != 1) {
                z = false;
            }
            if (z) {
                this.f5836OooOo0.f6053OooO0o.removeCallbacks(this.f5855Oooo0oO);
                this.f5836OooOo0.f6053OooO0o.post(this.f5855Oooo0oO);
                Ooooooo();
            }
        }
    }

    public final void Ooooo00(@NonNull Fragment fragment, boolean z) {
        ViewGroup viewGroupOooOooo = OooOooo(fragment);
        if (viewGroupOooOooo == null || !(viewGroupOooOooo instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupOooOooo).setDrawDisappearingViewsLast(!z);
    }

    public final void Ooooo0o(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.equals(OooOoOO(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void OooooO0(@Nullable Fragment fragment) {
        if (fragment == null || (fragment.equals(OooOoOO(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f5835OooOo;
            this.f5835OooOo = fragment;
            OooOOo0(fragment2);
            OooOOo0(this.f5835OooOo);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void OooooOO(@NonNull Fragment fragment) {
        ViewGroup viewGroupOooOooo = OooOooo(fragment);
        if (viewGroupOooOooo != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                int i = p062o0000o0o.o000000O.visible_removing_fragment_view_tag;
                if (viewGroupOooOooo.getTag(i) == null) {
                    viewGroupOooOooo.setTag(i, fragment);
                }
                ((Fragment) viewGroupOooOooo.getTag(i)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void Oooooo(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new o000O00());
        o0Oo0oo<?> o0oo0oo2 = this.f5836OooOo0;
        if (o0oo0oo2 != null) {
            try {
                o0oo0oo2.OooO0Oo(printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            OooOo0("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void Oooooo0() {
        for (o0000 o0000Var : this.f5819OooO0OO.OooO0Oo()) {
            Fragment fragment = o0000Var.f5966OooO0OO;
            if (fragment.mDeferStart) {
                if (this.f5818OooO0O0) {
                    this.f5847Oooo0 = true;
                } else {
                    fragment.mDeferStart = false;
                    o0000Var.OooOO0O();
                }
            }
        }
    }

    public final void OoooooO(@NonNull OooOo00 oooOo00) {
        oo0o0Oo oo0o0oo = this.f5829OooOOO0;
        synchronized (oo0o0oo.f6065OooO00o) {
            int size = oo0o0oo.f6065OooO00o.size();
            for (int i = 0; i < size; i++) {
                if (oo0o0oo.f6065OooO00o.get(i).f6067OooO00o == oooOo00) {
                    oo0o0oo.f6065OooO00o.remove(i);
                    break;
                }
            }
        }
    }

    public final void Ooooooo() {
        synchronized (this.f5817OooO00o) {
            try {
                if (!this.f5817OooO00o.isEmpty()) {
                    OooO0O0 oooO0O0 = this.f5824OooO0oo;
                    oooO0O0.f2191OooO00o = true;
                    Function0<Unit> function0 = oooO0O0.f2193OooO0OO;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return;
                }
                OooO0O0 oooO0O1 = this.f5824OooO0oo;
                ArrayList<androidx.fragment.app.OooO00o> arrayList = this.f5820OooO0Oo;
                oooO0O1.f2191OooO00o = (arrayList != null ? arrayList.size() : 0) > 0 && Oooo0o(this.f5839OooOo0o);
                Function0<Unit> function1 = oooO0O1.f2193OooO0OO;
                if (function1 != null) {
                    function1.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o000oOoO(@NonNull Fragment fragment) {
        if (Oooo0O0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            o0000O00 o0000o00 = this.f5819OooO0OO;
            synchronized (o0000o00.f5990OooO00o) {
                o0000o00.f5990OooO00o.remove(fragment);
            }
            fragment.mAdded = false;
            if (Oooo0OO(fragment)) {
                this.f5846OooOooo = true;
            }
            fragment.mRemoving = true;
            OooooOO(fragment);
        }
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f5839OooOo0o;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f5839OooOo0o)));
            sb.append("}");
        } else {
            o0Oo0oo<?> o0oo0oo2 = this.f5836OooOo0;
            if (o0oo0oo2 != null) {
                sb.append(o0oo0oo2.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f5836OooOo0)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f5856OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f5857OooO0o0;

        public class OooO00o implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(@NonNull String str, int i) {
            this.f5856OooO0Oo = str;
            this.f5857OooO0o0 = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5856OooO0Oo);
            parcel.writeInt(this.f5857OooO0o0);
        }

        public LaunchedFragmentInfo(@NonNull Parcel parcel) {
            this.f5856OooO0Oo = parcel.readString();
            this.f5857OooO0o0 = parcel.readInt();
        }
    }
}
