package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.security.CertificateUtil;
import com.umeng.analytics.pro.o;
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
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f8303OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.OooO00o> f8305OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList<Fragment> f8307OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OnBackPressedDispatcher f8308OooO0oO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public Fragment f8320OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o00oO0o<?> f8321OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o00Oo0 f8323OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Fragment f8324OooOo0o;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public androidx.activity.result.OooO0O0<Intent> f8327OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public androidx.activity.result.OooO0O0<String[]> f8328OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public androidx.activity.result.OooO0O0<IntentSenderRequest> f8329OooOoo0;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f8331OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f8332Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f8333Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f8334Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f8335Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.OooO00o> f8336Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ArrayList<Boolean> f8337Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o000000O f8338Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public ArrayList<Fragment> f8339Oooo0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<OooOo> f8302OooO00o = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00000OO f8304OooO0OO = new o00000OO();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0ooOOo f8306OooO0o = new o0ooOOo(this);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0O0 f8309OooO0oo = new OooO0O0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final AtomicInteger f8301OooO = new AtomicInteger();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Map<String, BackStackState> f8310OooOO0 = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Map<String, Bundle> f8311OooOO0O = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Map<String, Object> f8312OooOO0o = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o0OOO0o f8314OooOOO0 = new o0OOO0o(this);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final CopyOnWriteArrayList<o00000> f8313OooOOO = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final o000OO0O.OooO00o<Configuration> f8315OooOOOO = new o000OO0O.OooO00o() { // from class: androidx.fragment.app.oo0o0Oo
        @Override // o000OO0O.OooO00o
        public final void accept(Object obj) {
            this.f8547OooO00o.OooO0oo((Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o000OO0O.OooO00o<Integer> f8316OooOOOo = new o000OO0O.OooO00o() { // from class: androidx.fragment.app.o0O0O00
        @Override // o000OO0O.OooO00o
        public final void accept(Object obj) {
            FragmentManager fragmentManager = this.f8535OooO00o;
            Objects.requireNonNull(fragmentManager);
            if (((Integer) obj).intValue() == 80) {
                fragmentManager.OooOOO0();
            }
        }
    };

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o000OO0O.OooO00o<p070o0000ooO.o0OO00O> f8318OooOOo0 = new o000OO0O.OooO00o() { // from class: androidx.fragment.app.o0Oo0oo
        @Override // o000OO0O.OooO00o
        public final void accept(Object obj) {
            FragmentManager fragmentManager = this.f8541OooO00o;
            Objects.requireNonNull(fragmentManager);
            fragmentManager.OooOOO(((p070o0000ooO.o0OO00O) obj).f28029OooO00o);
        }
    };

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o000OO0O.OooO00o<p070o0000ooO.o0000oo> f8317OooOOo = new o000OO0O.OooO00o() { // from class: androidx.fragment.app.o0OO00O
        @Override // o000OO0O.OooO00o
        public final void accept(Object obj) {
            FragmentManager fragmentManager = this.f8536OooO00o;
            Objects.requireNonNull(fragmentManager);
            fragmentManager.OooOOoo(((p070o0000ooO.o0000oo) obj).f28016OooO00o);
        }
    };

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final OooO0OO f8319OooOOoo = new OooO0OO();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f8322OooOo00 = -1;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public OooO0o f8326OooOoO0 = new OooO0o();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public OooO f8325OooOoO = new OooO();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ArrayDeque<LaunchedFragmentInfo> f8330OooOooO = new ArrayDeque<>();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooOO0 f8340Oooo0oO = new OooOO0();

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$6, reason: invalid class name */
    class AnonymousClass6 implements LifecycleEventObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START || event == Lifecycle.Event.ON_DESTROY) {
                throw null;
            }
        }
    }

    public class OooO implements o000O0Oo {
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
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f8330OooOooO.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f8341Oooo;
            int i2 = launchedFragmentInfoPollFirst.f8342OoooO00;
            Fragment fragmentOooO0Oo = FragmentManager.this.f8304OooO0OO.OooO0Oo(str);
            if (fragmentOooO0Oo != null) {
                fragmentOooO0Oo.onRequestPermissionsResult(i2, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public class OooO0O0 extends androidx.activity.OooOOO {
        public OooO0O0() {
            super(false);
        }

        @Override // androidx.activity.OooOOO
        public final void OooO00o() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.OooOoOO(true);
            if (fragmentManager.f8309OooO0oo.f4343OooO00o) {
                fragmentManager.o000oOoO();
            } else {
                fragmentManager.f8308OooO0oO.OooO0O0();
            }
        }
    }

    public class OooO0OO implements o000O0O0.OooOo {
        public OooO0OO() {
        }

        @Override // o000O0O0.OooOo
        public final boolean OooO00o(@NonNull MenuItem menuItem) {
            return FragmentManager.this.OooOOOo(menuItem);
        }

        @Override // o000O0O0.OooOo
        public final void OooO0O0(@NonNull Menu menu) {
            FragmentManager.this.OooOOo0(menu);
        }

        @Override // o000O0O0.OooOo
        public final void OooO0OO(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
            FragmentManager.this.OooOO0O(menu, menuInflater);
        }

        @Override // o000O0O0.OooOo
        public final void OooO0Oo(@NonNull Menu menu) {
            FragmentManager.this.OooOo00(menu);
        }
    }

    public class OooO0o extends oo000o {
        public OooO0o() {
        }

        @Override // androidx.fragment.app.oo000o
        @NonNull
        public final Fragment OooO00o(@NonNull ClassLoader classLoader, @NonNull String str) {
            return Fragment.instantiate(FragmentManager.this.f8321OooOo0.f8533OoooO00, str, null);
        }
    }

    public class OooOO0 implements Runnable {
        public OooOO0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.OooOoOO(true);
        }
    }

    public class OooOO0O implements o00000 {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Fragment f8348Oooo;

        public OooOO0O(Fragment fragment) {
            this.f8348Oooo = fragment;
        }

        @Override // androidx.fragment.app.o00000
        public final void OooO00o(@NonNull Fragment fragment) {
            this.f8348Oooo.onAttachFragment(fragment);
        }
    }

    public class OooOOO implements androidx.activity.result.OooO00o<ActivityResult> {
        public OooOOO() {
        }

        @Override // androidx.activity.result.OooO00o
        public final void onActivityResult(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f8330OooOooO.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f8341Oooo;
            int i = launchedFragmentInfoPollFirst.f8342OoooO00;
            Fragment fragmentOooO0Oo = FragmentManager.this.f8304OooO0OO.OooO0Oo(str);
            if (fragmentOooO0Oo != null) {
                fragmentOooO0Oo.onActivityResult(i, activityResult2.f4349Oooo, activityResult2.f4350OoooO00);
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public class OooOOO0 implements androidx.activity.result.OooO00o<ActivityResult> {
        public OooOOO0() {
        }

        @Override // androidx.activity.result.OooO00o
        public final void onActivityResult(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f8330OooOooO.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f8341Oooo;
            int i = launchedFragmentInfoPollFirst.f8342OoooO00;
            Fragment fragmentOooO0Oo = FragmentManager.this.f8304OooO0OO.OooO0Oo(str);
            if (fragmentOooO0Oo != null) {
                fragmentOooO0Oo.onActivityResult(i, activityResult2.f4349Oooo, activityResult2.f4350OoooO00);
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public static class OooOOOO extends p011OooOOoo.OooO<IntentSenderRequest, ActivityResult> {
        @Override // p011OooOOoo.OooO
        @NonNull
        public final Intent createIntent(@NonNull Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest2 = intentSenderRequest;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest2.f4375OoooO00;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest2 = new IntentSenderRequest(intentSenderRequest2.f4373Oooo, null, intentSenderRequest2.f4374OoooO0, intentSenderRequest2.f4376OoooO0O);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
            if (FragmentManager.Oooo0oO(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p011OooOOoo.OooO
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
        public final int f8351OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f8352OooO0O0 = 1;

        public Oooo000(int i) {
            this.f8351OooO00o = i;
        }

        @Override // androidx.fragment.app.FragmentManager.OooOo
        public final boolean OooO00o(@NonNull ArrayList<androidx.fragment.app.OooO00o> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f8320OooOo;
            if (fragment == null || this.f8351OooO00o >= 0 || !fragment.getChildFragmentManager().o000oOoO()) {
                return FragmentManager.this.OoooOOo(arrayList, arrayList2, null, this.f8351OooO00o, this.f8352OooO0O0);
            }
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean Oooo0oO(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public final boolean OooO(@NonNull MenuItem menuItem) {
        if (this.f8322OooOo00 < 1) {
            return false;
        }
        for (Fragment fragment : this.f8304OooO0OO.OooO0oo()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final o00000O OooO00o(@NonNull Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.OooO0Oo(fragment, str);
        }
        if (Oooo0oO(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        o00000O o00000oOooO0o = OooO0o(fragment);
        fragment.mFragmentManager = this;
        this.f8304OooO0OO.OooO(o00000oOooO0o);
        if (!fragment.mDetached) {
            this.f8304OooO0OO.OooO00o(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (Oooo0oo(fragment)) {
                this.f8331OooOooo = true;
            }
        }
        return o00000oOooO0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public final void OooO0O0(@NonNull o00oO0o<?> o00oo0o2, @NonNull o00Oo0 o00oo1, @Nullable Fragment fragment) {
        LifecycleOwner lifecycleOwner;
        if (this.f8321OooOo0 != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f8321OooOo0 = o00oo0o2;
        this.f8323OooOo0O = o00oo1;
        this.f8324OooOo0o = fragment;
        if (fragment != null) {
            this.f8313OooOOO.add(new OooOO0O(fragment));
        } else if (o00oo0o2 instanceof o00000) {
            this.f8313OooOOO.add((o00000) o00oo0o2);
        }
        if (this.f8324OooOo0o != null) {
            o00O0O();
        }
        if (o00oo0o2 instanceof androidx.activity.OooOOOO) {
            androidx.activity.OooOOOO oooOOOO = (androidx.activity.OooOOOO) o00oo0o2;
            OnBackPressedDispatcher onBackPressedDispatcher = oooOOOO.getOnBackPressedDispatcher();
            this.f8308OooO0oO = onBackPressedDispatcher;
            if (fragment != null) {
                lifecycleOwner = oooOOOO;
                lifecycleOwner = fragment;
            }
            lifecycleOwner = oooOOOO;
            onBackPressedDispatcher.OooO00o(lifecycleOwner, this.f8309OooO0oo);
        }
        if (fragment != null) {
            o000000O o000000o2 = fragment.mFragmentManager.f8338Oooo0o;
            o000000O o000000o3 = o000000o2.f8433OooO0O0.get(fragment.mWho);
            if (o000000o3 == null) {
                o000000o3 = new o000000O(o000000o2.f8435OooO0Oo);
                o000000o2.f8433OooO0O0.put(fragment.mWho, o000000o3);
            }
            this.f8338Oooo0o = o000000o3;
        } else if (o00oo0o2 instanceof ViewModelStoreOwner) {
            this.f8338Oooo0o = (o000000O) new ViewModelProvider(((ViewModelStoreOwner) o00oo0o2).getViewModelStore(), o000000O.f8431OooO0oO).get(o000000O.class);
        } else {
            this.f8338Oooo0o = new o000000O(false);
        }
        this.f8338Oooo0o.f8436OooO0o = OoooO0();
        this.f8304OooO0OO.f8453OooO0Oo = this.f8338Oooo0o;
        Object obj = this.f8321OooOo0;
        if ((obj instanceof p094o000o0OO.o00Oo0) && fragment == null) {
            p094o000o0OO.o0OoOo0 savedStateRegistry = ((p094o000o0OO.o00Oo0) obj).getSavedStateRegistry();
            savedStateRegistry.OooO0OO("android:support:fragments", new o000o0OO.o0OoOo0.OooO0O0() { // from class: androidx.fragment.app.o000OOo
                @Override // o000o0OO.o0OoOo0.OooO0O0
                public final Bundle saveState() {
                    return this.f8506OooO00o.Ooooo0o();
                }
            });
            Bundle bundleOooO00o = savedStateRegistry.OooO00o("android:support:fragments");
            if (bundleOooO00o != null) {
                Ooooo00(bundleOooO00o);
            }
        }
        Object obj2 = this.f8321OooOo0;
        if (obj2 instanceof androidx.activity.result.OooO0OO) {
            ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.OooO0OO) obj2).getActivityResultRegistry();
            String strOooO00o = p016OooOoO0.OooOo00.OooO00o("FragmentManager:", fragment != null ? OooO00o.OooO00o.OooO00o(new StringBuilder(), fragment.mWho, CertificateUtil.DELIMITER) : "");
            this.f8327OooOoOO = (ActivityResultRegistry.OooO0O0) activityResultRegistry.OooO0Oo(p016OooOoO0.OooOo00.OooO00o(strOooO00o, "StartActivityForResult"), new p011OooOOoo.OooOOO0(), new OooOOO0());
            this.f8329OooOoo0 = (ActivityResultRegistry.OooO0O0) activityResultRegistry.OooO0Oo(p016OooOoO0.OooOo00.OooO00o(strOooO00o, "StartIntentSenderForResult"), new OooOOOO(), new OooOOO());
            this.f8328OooOoo = (ActivityResultRegistry.OooO0O0) activityResultRegistry.OooO0Oo(p016OooOoO0.OooOo00.OooO00o(strOooO00o, "RequestPermissions"), new p011OooOOoo.OooOO0(), new OooO00o());
        }
        Object obj3 = this.f8321OooOo0;
        if (obj3 instanceof o000O000.OooO0O0) {
            ((o000O000.OooO0O0) obj3).addOnConfigurationChangedListener(this.f8315OooOOOO);
        }
        Object obj4 = this.f8321OooOo0;
        if (obj4 instanceof o000O000.OooO0OO) {
            ((o000O000.OooO0OO) obj4).addOnTrimMemoryListener(this.f8316OooOOOo);
        }
        Object obj5 = this.f8321OooOo0;
        if (obj5 instanceof p070o0000ooO.o0000Ooo) {
            ((p070o0000ooO.o0000Ooo) obj5).addOnMultiWindowModeChangedListener(this.f8318OooOOo0);
        }
        Object obj6 = this.f8321OooOo0;
        if (obj6 instanceof p070o0000ooO.o0000) {
            ((p070o0000ooO.o0000) obj6).addOnPictureInPictureModeChangedListener(this.f8317OooOOo);
        }
        Object obj7 = this.f8321OooOo0;
        if ((obj7 instanceof o000O0O0.OooOO0O) && fragment == null) {
            ((o000O0O0.OooOO0O) obj7).addMenuProvider(this.f8319OooOOoo);
        }
    }

    public final void OooO0OO(@NonNull Fragment fragment) {
        if (Oooo0oO(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f8304OooO0OO.OooO00o(fragment);
            if (Oooo0oO(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (Oooo0oo(fragment)) {
                this.f8331OooOooo = true;
            }
        }
    }

    public final void OooO0Oo() {
        this.f8303OooO0O0 = false;
        this.f8337Oooo0OO.clear();
        this.f8336Oooo0O0.clear();
    }

    @NonNull
    public final o00000O OooO0o(@NonNull Fragment fragment) {
        o00000O o00000oOooO0oO = this.f8304OooO0OO.OooO0oO(fragment.mWho);
        if (o00000oOooO0oO != null) {
            return o00000oOooO0oO;
        }
        o00000O o00000o = new o00000O(this.f8314OooOOO0, this.f8304OooO0OO, fragment);
        o00000o.OooOOO0(this.f8321OooOo0.f8533OoooO00.getClassLoader());
        o00000o.f8442OooO0o0 = this.f8322OooOo00;
        return o00000o;
    }

    public final Set<o000Oo0> OooO0o0() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f8304OooO0OO.OooO0o0()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((o00000O) it.next()).f8440OooO0OO.mContainer;
            if (viewGroup != null) {
                hashSet.add(o000Oo0.OooO0oO(viewGroup, Oooo0o0()));
            }
        }
        return hashSet;
    }

    public final void OooO0oO(@NonNull Fragment fragment) {
        if (Oooo0oO(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (Oooo0oO(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            o00000OO o00000oo2 = this.f8304OooO0OO;
            synchronized (o00000oo2.f8450OooO00o) {
                o00000oo2.f8450OooO00o.remove(fragment);
            }
            fragment.mAdded = false;
            if (Oooo0oo(fragment)) {
                this.f8331OooOooo = true;
            }
            Oooooo(fragment);
        }
    }

    public final void OooO0oo(@NonNull Configuration configuration) {
        for (Fragment fragment : this.f8304OooO0OO.OooO0oo()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public final void OooOO0() {
        this.f8333Oooo000 = false;
        this.f8334Oooo00O = false;
        this.f8338Oooo0o.f8436OooO0o = false;
        OooOo0(1);
    }

    public final boolean OooOO0O(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.f8322OooOo00 < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f8304OooO0OO.OooO0oo()) {
            if (fragment != null && Oooo(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f8307OooO0o0 != null) {
            for (int i = 0; i < this.f8307OooO0o0.size(); i++) {
                Fragment fragment2 = this.f8307OooO0o0.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f8307OooO0o0 = arrayList;
        return z;
    }

    public final void OooOO0o() {
        boolean zIsChangingConfigurations = true;
        this.f8335Oooo00o = true;
        OooOoOO(true);
        OooOo();
        o00oO0o<?> o00oo0o2 = this.f8321OooOo0;
        if (o00oo0o2 instanceof ViewModelStoreOwner) {
            zIsChangingConfigurations = this.f8304OooO0OO.f8453OooO0Oo.f8437OooO0o0;
        } else {
            Context context = o00oo0o2.f8533OoooO00;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator<BackStackState> it = this.f8310OooOO0.values().iterator();
            while (it.hasNext()) {
                for (String str : it.next().f8259Oooo) {
                    o000000O o000000o2 = this.f8304OooO0OO.f8453OooO0Oo;
                    Objects.requireNonNull(o000000o2);
                    if (Oooo0oO(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    o000000o2.OooO0Oo(str);
                }
            }
        }
        OooOo0(-1);
        Object obj = this.f8321OooOo0;
        if (obj instanceof o000O000.OooO0OO) {
            ((o000O000.OooO0OO) obj).removeOnTrimMemoryListener(this.f8316OooOOOo);
        }
        Object obj2 = this.f8321OooOo0;
        if (obj2 instanceof o000O000.OooO0O0) {
            ((o000O000.OooO0O0) obj2).removeOnConfigurationChangedListener(this.f8315OooOOOO);
        }
        Object obj3 = this.f8321OooOo0;
        if (obj3 instanceof p070o0000ooO.o0000Ooo) {
            ((p070o0000ooO.o0000Ooo) obj3).removeOnMultiWindowModeChangedListener(this.f8318OooOOo0);
        }
        Object obj4 = this.f8321OooOo0;
        if (obj4 instanceof p070o0000ooO.o0000) {
            ((p070o0000ooO.o0000) obj4).removeOnPictureInPictureModeChangedListener(this.f8317OooOOo);
        }
        Object obj5 = this.f8321OooOo0;
        if (obj5 instanceof o000O0O0.OooOO0O) {
            ((o000O0O0.OooOO0O) obj5).removeMenuProvider(this.f8319OooOOoo);
        }
        this.f8321OooOo0 = null;
        this.f8323OooOo0O = null;
        this.f8324OooOo0o = null;
        if (this.f8308OooO0oO != null) {
            this.f8309OooO0oo.OooO0O0();
            this.f8308OooO0oO = null;
        }
        androidx.activity.result.OooO0O0<Intent> oooO0O0 = this.f8327OooOoOO;
        if (oooO0O0 != null) {
            oooO0O0.OooO0OO();
            this.f8329OooOoo0.OooO0OO();
            this.f8328OooOoo.OooO0OO();
        }
    }

    public final void OooOOO(boolean z) {
        for (Fragment fragment : this.f8304OooO0OO.OooO0oo()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    public final void OooOOO0() {
        for (Fragment fragment : this.f8304OooO0OO.OooO0oo()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public final void OooOOOO() {
        for (Fragment fragment : (ArrayList) this.f8304OooO0OO.OooO0o()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.OooOOOO();
            }
        }
    }

    public final boolean OooOOOo(@NonNull MenuItem menuItem) {
        if (this.f8322OooOo00 < 1) {
            return false;
        }
        for (Fragment fragment : this.f8304OooO0OO.OooO0oo()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void OooOOo(@Nullable Fragment fragment) {
        if (fragment == null || !fragment.equals(OooOooo(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public final void OooOOo0(@NonNull Menu menu) {
        if (this.f8322OooOo00 < 1) {
            return;
        }
        for (Fragment fragment : this.f8304OooO0OO.OooO0oo()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void OooOOoo(boolean z) {
        for (Fragment fragment : this.f8304OooO0OO.OooO0oo()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    public final void OooOo() {
        Iterator it = ((HashSet) OooO0o0()).iterator();
        while (it.hasNext()) {
            ((o000Oo0) it.next()).OooO0o0();
        }
    }

    public final void OooOo0(int i) {
        try {
            this.f8303OooO0O0 = true;
            for (o00000O o00000o : this.f8304OooO0OO.f8451OooO0O0.values()) {
                if (o00000o != null) {
                    o00000o.f8442OooO0o0 = i;
                }
            }
            OoooO0O(i, false);
            Iterator it = ((HashSet) OooO0o0()).iterator();
            while (it.hasNext()) {
                ((o000Oo0) it.next()).OooO0o0();
            }
            this.f8303OooO0O0 = false;
            OooOoOO(true);
        } catch (Throwable th) {
            this.f8303OooO0O0 = false;
            throw th;
        }
    }

    public final boolean OooOo00(@NonNull Menu menu) {
        boolean z = false;
        if (this.f8322OooOo00 < 1) {
            return false;
        }
        for (Fragment fragment : this.f8304OooO0OO.OooO0oo()) {
            if (fragment != null && Oooo(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void OooOo0O() {
        if (this.f8332Oooo0) {
            this.f8332Oooo0 = false;
            Ooooooo();
        }
    }

    public final void OooOo0o(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        int size;
        int size2;
        String strOooO00o = p016OooOoO0.OooOo00.OooO00o(str, "    ");
        o00000OO o00000oo2 = this.f8304OooO0OO;
        Objects.requireNonNull(o00000oo2);
        String str2 = str + "    ";
        if (!o00000oo2.f8451OooO0O0.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (o00000O o00000o : o00000oo2.f8451OooO0O0.values()) {
                printWriter.print(str);
                if (o00000o != null) {
                    Fragment fragment = o00000o.f8440OooO0OO;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = o00000oo2.f8450OooO00o.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                Fragment fragment2 = o00000oo2.f8450OooO00o.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f8307OooO0o0;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment3 = this.f8307OooO0o0.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.OooO00o> arrayList2 = this.f8305OooO0Oo;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                androidx.fragment.app.OooO00o oooO00o = this.f8305OooO0Oo.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(oooO00o.toString());
                oooO00o.OooOO0o(strOooO00o, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f8301OooO.get());
        synchronized (this.f8302OooO00o) {
            int size4 = this.f8302OooO00o.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (OooOo) this.f8302OooO00o.get(i4);
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
        printWriter.println(this.f8321OooOo0);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f8323OooOo0O);
        if (this.f8324OooOo0o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f8324OooOo0o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f8322OooOo00);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f8333Oooo000);
        printWriter.print(" mStopped=");
        printWriter.print(this.f8334Oooo00O);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f8335Oooo00o);
        if (this.f8331OooOooo) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f8331OooOooo);
        }
    }

    public final void OooOoO(boolean z) {
        if (this.f8303OooO0O0) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f8321OooOo0 == null) {
            if (!this.f8335Oooo00o) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f8321OooOo0.f8532OoooO0.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && OoooO0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f8336Oooo0O0 == null) {
            this.f8336Oooo0O0 = new ArrayList<>();
            this.f8337Oooo0OO = new ArrayList<>();
        }
    }

    public final void OooOoO0(@NonNull OooOo oooOo, boolean z) {
        if (!z) {
            if (this.f8321OooOo0 == null) {
                if (!this.f8335Oooo00o) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (OoooO0()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f8302OooO00o) {
            if (this.f8321OooOo0 == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f8302OooO00o.add(oooOo);
                OooooO0();
            }
        }
    }

    public final boolean OooOoOO(boolean z) {
        boolean zOooO00o;
        OooOoO(z);
        boolean z2 = false;
        while (true) {
            ArrayList<androidx.fragment.app.OooO00o> arrayList = this.f8336Oooo0O0;
            ArrayList<Boolean> arrayList2 = this.f8337Oooo0OO;
            synchronized (this.f8302OooO00o) {
                if (this.f8302OooO00o.isEmpty()) {
                    zOooO00o = false;
                } else {
                    try {
                        int size = this.f8302OooO00o.size();
                        zOooO00o = false;
                        for (int i = 0; i < size; i++) {
                            zOooO00o |= this.f8302OooO00o.get(i).OooO00o(arrayList, arrayList2);
                        }
                        this.f8302OooO00o.clear();
                        this.f8321OooOo0.f8532OoooO0.removeCallbacks(this.f8340Oooo0oO);
                    } catch (Throwable th) {
                        this.f8302OooO00o.clear();
                        this.f8321OooOo0.f8532OoooO0.removeCallbacks(this.f8340Oooo0oO);
                        throw th;
                    }
                }
            }
            if (!zOooO00o) {
                o00O0O();
                OooOo0O();
                this.f8304OooO0OO.OooO0O0();
                return z2;
            }
            this.f8303OooO0O0 = true;
            try {
                OoooOoo(this.f8336Oooo0O0, this.f8337Oooo0OO);
                OooO0Oo();
                z2 = true;
            } catch (Throwable th2) {
                OooO0Oo();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x0153  */
    /* JADX WARN: Code duplicated, block: B:61:0x0159  */
    public final void OooOoo(@NonNull ArrayList<androidx.fragment.app.OooO00o> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i, int i2) {
        ArrayList<androidx.fragment.app.OooO00o> arrayList3;
        int i3;
        ViewGroup viewGroup;
        Fragment fragment;
        int i4;
        boolean z;
        ArrayList<androidx.fragment.app.OooO00o> arrayList4 = arrayList;
        boolean z2 = arrayList4.get(i).f8483OooOOOO;
        ArrayList<Fragment> arrayList5 = this.f8339Oooo0o0;
        if (arrayList5 == null) {
            this.f8339Oooo0o0 = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f8339Oooo0o0.addAll(this.f8304OooO0OO.OooO0oo());
        Fragment fragment2 = this.f8320OooOo;
        boolean z3 = false;
        int i5 = i;
        while (true) {
            int i6 = 1;
            if (i5 >= i2) {
                this.f8339Oooo0o0.clear();
                if (z2 || this.f8322OooOo00 < 1) {
                    arrayList3 = arrayList;
                    i3 = i2;
                } else {
                    int i7 = i;
                    i3 = i2;
                    while (true) {
                        arrayList3 = arrayList;
                        if (i7 < i3) {
                            Iterator<o0000Ooo.OooO00o> it = arrayList3.get(i7).f8470OooO00o.iterator();
                            while (it.hasNext()) {
                                Fragment fragment3 = it.next().f8486OooO0O0;
                                if (fragment3 != null && fragment3.mFragmentManager != null) {
                                    this.f8304OooO0OO.OooO(OooO0o(fragment3));
                                }
                            }
                            i7++;
                        }
                    }
                }
                for (int i8 = i; i8 < i3; i8++) {
                    androidx.fragment.app.OooO00o oooO00o = arrayList3.get(i8);
                    if (arrayList2.get(i8).booleanValue()) {
                        oooO00o.OooO0o(-1);
                        boolean z4 = true;
                        int size = oooO00o.f8470OooO00o.size() - 1;
                        while (size >= 0) {
                            o0000Ooo.OooO00o oooO00o2 = oooO00o.f8470OooO00o.get(size);
                            Fragment fragment4 = oooO00o2.f8486OooO0O0;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = false;
                                fragment4.setPopDirection(z4);
                                int i9 = oooO00o.f8474OooO0o;
                                int i10 = 4099;
                                if (i9 == 4097) {
                                    i10 = o.a.q;
                                } else if (i9 == 8194) {
                                    i10 = 4097;
                                } else if (i9 == 8197) {
                                    i10 = o.a.d;
                                } else if (i9 != 4099) {
                                    i10 = i9 != 4100 ? 0 : o.a.t;
                                }
                                fragment4.setNextTransition(i10);
                                fragment4.setSharedElementNames(oooO00o.f8481OooOOO, oooO00o.f8482OooOOO0);
                            }
                            switch (oooO00o2.f8485OooO00o) {
                                case 1:
                                    fragment4.setAnimations(oooO00o2.f8488OooO0Oo, oooO00o2.f8490OooO0o0, oooO00o2.f8489OooO0o, oooO00o2.f8491OooO0oO);
                                    oooO00o.f8384OooOOOo.OooooOO(fragment4, true);
                                    oooO00o.f8384OooOOOo.OoooOoO(fragment4);
                                    break;
                                case 2:
                                default:
                                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Unknown cmd: ");
                                    sbOooO0O0.append(oooO00o2.f8485OooO00o);
                                    throw new IllegalArgumentException(sbOooO0O0.toString());
                                case 3:
                                    fragment4.setAnimations(oooO00o2.f8488OooO0Oo, oooO00o2.f8490OooO0o0, oooO00o2.f8489OooO0o, oooO00o2.f8491OooO0oO);
                                    oooO00o.f8384OooOOOo.OooO00o(fragment4);
                                    break;
                                case 4:
                                    fragment4.setAnimations(oooO00o2.f8488OooO0Oo, oooO00o2.f8490OooO0o0, oooO00o2.f8489OooO0o, oooO00o2.f8491OooO0oO);
                                    oooO00o.f8384OooOOOo.OoooooO(fragment4);
                                    break;
                                case 5:
                                    fragment4.setAnimations(oooO00o2.f8488OooO0Oo, oooO00o2.f8490OooO0o0, oooO00o2.f8489OooO0o, oooO00o2.f8491OooO0oO);
                                    oooO00o.f8384OooOOOo.OooooOO(fragment4, true);
                                    oooO00o.f8384OooOOOo.Oooo0o(fragment4);
                                    break;
                                case 6:
                                    fragment4.setAnimations(oooO00o2.f8488OooO0Oo, oooO00o2.f8490OooO0o0, oooO00o2.f8489OooO0o, oooO00o2.f8491OooO0oO);
                                    oooO00o.f8384OooOOOo.OooO0OO(fragment4);
                                    break;
                                case 7:
                                    fragment4.setAnimations(oooO00o2.f8488OooO0Oo, oooO00o2.f8490OooO0o0, oooO00o2.f8489OooO0o, oooO00o2.f8491OooO0oO);
                                    oooO00o.f8384OooOOOo.OooooOO(fragment4, true);
                                    oooO00o.f8384OooOOOo.OooO0oO(fragment4);
                                    break;
                                case 8:
                                    oooO00o.f8384OooOOOo.Oooooo0(null);
                                    break;
                                case 9:
                                    oooO00o.f8384OooOOOo.Oooooo0(fragment4);
                                    break;
                                case 10:
                                    oooO00o.f8384OooOOOo.OooooOo(fragment4, oooO00o2.f8492OooO0oo);
                                    break;
                            }
                            size--;
                            z4 = true;
                        }
                    } else {
                        oooO00o.OooO0o(1);
                        int size2 = oooO00o.f8470OooO00o.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            o0000Ooo.OooO00o oooO00o3 = oooO00o.f8470OooO00o.get(i11);
                            Fragment fragment5 = oooO00o3.f8486OooO0O0;
                            if (fragment5 != null) {
                                fragment5.mBeingSaved = false;
                                fragment5.setPopDirection(false);
                                fragment5.setNextTransition(oooO00o.f8474OooO0o);
                                fragment5.setSharedElementNames(oooO00o.f8482OooOOO0, oooO00o.f8481OooOOO);
                            }
                            switch (oooO00o3.f8485OooO00o) {
                                case 1:
                                    fragment5.setAnimations(oooO00o3.f8488OooO0Oo, oooO00o3.f8490OooO0o0, oooO00o3.f8489OooO0o, oooO00o3.f8491OooO0oO);
                                    oooO00o.f8384OooOOOo.OooooOO(fragment5, false);
                                    oooO00o.f8384OooOOOo.OooO00o(fragment5);
                                    break;
                                case 2:
                                default:
                                    StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("Unknown cmd: ");
                                    sbOooO0O1.append(oooO00o3.f8485OooO00o);
                                    throw new IllegalArgumentException(sbOooO0O1.toString());
                                case 3:
                                    fragment5.setAnimations(oooO00o3.f8488OooO0Oo, oooO00o3.f8490OooO0o0, oooO00o3.f8489OooO0o, oooO00o3.f8491OooO0oO);
                                    oooO00o.f8384OooOOOo.OoooOoO(fragment5);
                                    break;
                                case 4:
                                    fragment5.setAnimations(oooO00o3.f8488OooO0Oo, oooO00o3.f8490OooO0o0, oooO00o3.f8489OooO0o, oooO00o3.f8491OooO0oO);
                                    oooO00o.f8384OooOOOo.Oooo0o(fragment5);
                                    break;
                                case 5:
                                    fragment5.setAnimations(oooO00o3.f8488OooO0Oo, oooO00o3.f8490OooO0o0, oooO00o3.f8489OooO0o, oooO00o3.f8491OooO0oO);
                                    oooO00o.f8384OooOOOo.OooooOO(fragment5, false);
                                    oooO00o.f8384OooOOOo.OoooooO(fragment5);
                                    break;
                                case 6:
                                    fragment5.setAnimations(oooO00o3.f8488OooO0Oo, oooO00o3.f8490OooO0o0, oooO00o3.f8489OooO0o, oooO00o3.f8491OooO0oO);
                                    oooO00o.f8384OooOOOo.OooO0oO(fragment5);
                                    break;
                                case 7:
                                    fragment5.setAnimations(oooO00o3.f8488OooO0Oo, oooO00o3.f8490OooO0o0, oooO00o3.f8489OooO0o, oooO00o3.f8491OooO0oO);
                                    oooO00o.f8384OooOOOo.OooooOO(fragment5, false);
                                    oooO00o.f8384OooOOOo.OooO0OO(fragment5);
                                    break;
                                case 8:
                                    oooO00o.f8384OooOOOo.Oooooo0(fragment5);
                                    break;
                                case 9:
                                    oooO00o.f8384OooOOOo.Oooooo0(null);
                                    break;
                                case 10:
                                    oooO00o.f8384OooOOOo.OooooOo(fragment5, oooO00o3.f8484OooO);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = arrayList2.get(i3 - 1).booleanValue();
                for (int i12 = i; i12 < i3; i12++) {
                    androidx.fragment.app.OooO00o oooO00o4 = arrayList3.get(i12);
                    if (zBooleanValue) {
                        for (int size3 = oooO00o4.f8470OooO00o.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment6 = oooO00o4.f8470OooO00o.get(size3).f8486OooO0O0;
                            if (fragment6 != null) {
                                OooO0o(fragment6).OooOO0O();
                            }
                        }
                    } else {
                        Iterator<o0000Ooo.OooO00o> it2 = oooO00o4.f8470OooO00o.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment7 = it2.next().f8486OooO0O0;
                            if (fragment7 != null) {
                                OooO0o(fragment7).OooOO0O();
                            }
                        }
                    }
                }
                OoooO0O(this.f8322OooOo00, true);
                HashSet<o000Oo0> hashSet = new HashSet();
                for (int i13 = i; i13 < i3; i13++) {
                    Iterator<o0000Ooo.OooO00o> it3 = arrayList3.get(i13).f8470OooO00o.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment8 = it3.next().f8486OooO0O0;
                        if (fragment8 != null && (viewGroup = fragment8.mContainer) != null) {
                            hashSet.add(o000Oo0.OooO0oO(viewGroup, Oooo0o0()));
                        }
                    }
                }
                for (o000Oo0 o000oo1 : hashSet) {
                    o000oo1.f8510OooO0Oo = zBooleanValue;
                    o000oo1.OooO0oo();
                    o000oo1.OooO0OO();
                }
                for (int i14 = i; i14 < i3; i14++) {
                    androidx.fragment.app.OooO00o oooO00o5 = arrayList3.get(i14);
                    if (arrayList2.get(i14).booleanValue() && oooO00o5.f8385OooOOo >= 0) {
                        oooO00o5.f8385OooOOo = -1;
                    }
                    Objects.requireNonNull(oooO00o5);
                }
                return;
            }
            androidx.fragment.app.OooO00o oooO00o6 = arrayList4.get(i5);
            int i15 = 3;
            if (arrayList2.get(i5).booleanValue()) {
                int i16 = 1;
                ArrayList<Fragment> arrayList6 = this.f8339Oooo0o0;
                int size4 = oooO00o6.f8470OooO00o.size() - 1;
                while (size4 >= 0) {
                    o0000Ooo.OooO00o oooO00o7 = oooO00o6.f8470OooO00o.get(size4);
                    int i17 = oooO00o7.f8485OooO00o;
                    if (i17 == i16) {
                        arrayList6.remove(oooO00o7.f8486OooO0O0);
                    } else if (i17 != 3) {
                        switch (i17) {
                            case 6:
                                arrayList6.add(oooO00o7.f8486OooO0O0);
                                break;
                            case 7:
                                arrayList6.remove(oooO00o7.f8486OooO0O0);
                                break;
                            case 8:
                                fragment = null;
                                fragment2 = fragment;
                                break;
                            case 9:
                                fragment = oooO00o7.f8486OooO0O0;
                                fragment2 = fragment;
                                break;
                            case 10:
                                oooO00o7.f8484OooO = oooO00o7.f8492OooO0oo;
                                break;
                        }
                    } else {
                        arrayList6.add(oooO00o7.f8486OooO0O0);
                    }
                    size4--;
                    i16 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList7 = this.f8339Oooo0o0;
                int i18 = 0;
                while (i18 < oooO00o6.f8470OooO00o.size()) {
                    o0000Ooo.OooO00o oooO00o8 = oooO00o6.f8470OooO00o.get(i18);
                    int i19 = oooO00o8.f8485OooO00o;
                    if (i19 == i6) {
                        i4 = 1;
                        arrayList7.add(oooO00o8.f8486OooO0O0);
                    } else {
                        if (i19 == 2) {
                            Fragment fragment9 = oooO00o8.f8486OooO0O0;
                            int i20 = fragment9.mContainerId;
                            int size5 = arrayList7.size() - 1;
                            boolean z5 = false;
                            while (size5 >= 0) {
                                Fragment fragment10 = arrayList7.get(size5);
                                if (fragment10.mContainerId != i20) {
                                    i20 = i20;
                                } else if (fragment10 == fragment9) {
                                    i20 = i20;
                                    z5 = true;
                                } else {
                                    if (fragment10 == fragment2) {
                                        z = true;
                                        oooO00o6.f8470OooO00o.add(i18, new o0000Ooo.OooO00o(9, fragment10, true));
                                        i18++;
                                        fragment2 = null;
                                    } else {
                                        z = true;
                                    }
                                    o0000Ooo.OooO00o oooO00o9 = new o0000Ooo.OooO00o(3, fragment10, z);
                                    oooO00o9.f8488OooO0Oo = oooO00o8.f8488OooO0Oo;
                                    oooO00o9.f8489OooO0o = oooO00o8.f8489OooO0o;
                                    oooO00o9.f8490OooO0o0 = oooO00o8.f8490OooO0o0;
                                    oooO00o9.f8491OooO0oO = oooO00o8.f8491OooO0oO;
                                    oooO00o6.f8470OooO00o.add(i18, oooO00o9);
                                    arrayList7.remove(fragment10);
                                    i18++;
                                }
                                size5--;
                                i20 = i20;
                            }
                            if (z5) {
                                oooO00o6.f8470OooO00o.remove(i18);
                                i18--;
                            } else {
                                oooO00o8.f8485OooO00o = 1;
                                oooO00o8.f8487OooO0OO = true;
                                arrayList7.add(fragment9);
                            }
                        } else if (i19 == i15 || i19 == 6) {
                            arrayList7.remove(oooO00o8.f8486OooO0O0);
                            Fragment fragment11 = oooO00o8.f8486OooO0O0;
                            if (fragment11 == fragment2) {
                                oooO00o6.f8470OooO00o.add(i18, new o0000Ooo.OooO00o(9, fragment11));
                                i18++;
                                i4 = 1;
                                fragment2 = null;
                            }
                        } else if (i19 == 7) {
                            i4 = 1;
                            arrayList7.add(oooO00o8.f8486OooO0O0);
                        } else if (i19 == 8) {
                            oooO00o6.f8470OooO00o.add(i18, new o0000Ooo.OooO00o(9, fragment2, true));
                            oooO00o8.f8487OooO0OO = true;
                            i18++;
                            fragment2 = oooO00o8.f8486OooO0O0;
                        }
                        i4 = 1;
                    }
                    i18 += i4;
                    i6 = 1;
                    i15 = 3;
                }
            }
            z3 = z3 || oooO00o6.f8476OooO0oO;
            i5++;
            arrayList4 = arrayList;
        }
    }

    public final void OooOoo0(@NonNull OooOo oooOo, boolean z) {
        if (z && (this.f8321OooOo0 == null || this.f8335Oooo00o)) {
            return;
        }
        OooOoO(z);
        if (oooOo.OooO00o(this.f8336Oooo0O0, this.f8337Oooo0OO)) {
            this.f8303OooO0O0 = true;
            try {
                OoooOoo(this.f8336Oooo0O0, this.f8337Oooo0OO);
                OooO0Oo();
            } catch (Throwable th) {
                OooO0Oo();
                throw th;
            }
        }
        o00O0O();
        OooOo0O();
        this.f8304OooO0OO.OooO0O0();
    }

    public final boolean OooOooO() {
        boolean zOooOoOO = OooOoOO(true);
        Oooo00o();
        return zOooOoOO;
    }

    @Nullable
    public final Fragment OooOooo(@NonNull String str) {
        return this.f8304OooO0OO.OooO0OO(str);
    }

    public final boolean Oooo(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public final ViewGroup Oooo0(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f8323OooOo0O.OooO0OO()) {
            View viewOooO0O0 = this.f8323OooOo0O.OooO0O0(fragment.mContainerId);
            if (viewOooO0O0 instanceof ViewGroup) {
                return (ViewGroup) viewOooO0O0;
            }
        }
        return null;
    }

    @Nullable
    public final Fragment Oooo000(@IdRes int i) {
        o00000OO o00000oo2 = this.f8304OooO0OO;
        int size = o00000oo2.f8450OooO00o.size();
        while (true) {
            size--;
            if (size < 0) {
                for (o00000O o00000o : o00000oo2.f8451OooO0O0.values()) {
                    if (o00000o != null) {
                        Fragment fragment = o00000o.f8440OooO0OO;
                        if (fragment.mFragmentId == i) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = o00000oo2.f8450OooO00o.get(size);
            if (fragment2 != null && fragment2.mFragmentId == i) {
                return fragment2;
            }
        }
    }

    @Nullable
    public final Fragment Oooo00O(@Nullable String str) {
        o00000OO o00000oo2 = this.f8304OooO0OO;
        Objects.requireNonNull(o00000oo2);
        if (str != null) {
            int size = o00000oo2.f8450OooO00o.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = o00000oo2.f8450OooO00o.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (o00000O o00000o : o00000oo2.f8451OooO0O0.values()) {
                if (o00000o != null) {
                    Fragment fragment2 = o00000o.f8440OooO0OO;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        }
        return null;
    }

    public final void Oooo00o() {
        for (o000Oo0 o000oo1 : (HashSet) OooO0o0()) {
            if (o000oo1.f8511OooO0o0) {
                if (Oooo0oO(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                o000oo1.f8511OooO0o0 = false;
                o000oo1.OooO0OO();
            }
        }
    }

    @NonNull
    public final oo000o Oooo0O0() {
        Fragment fragment = this.f8324OooOo0o;
        return fragment != null ? fragment.mFragmentManager.Oooo0O0() : this.f8326OooOoO0;
    }

    @NonNull
    public final List<Fragment> Oooo0OO() {
        return this.f8304OooO0OO.OooO0oo();
    }

    public final void Oooo0o(@NonNull Fragment fragment) {
        if (Oooo0oO(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        Oooooo(fragment);
    }

    @NonNull
    public final o000O0Oo Oooo0o0() {
        Fragment fragment = this.f8324OooOo0o;
        return fragment != null ? fragment.mFragmentManager.Oooo0o0() : this.f8325OooOoO;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean Oooo0oo(@NonNull Fragment fragment) {
        boolean z;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mChildFragmentManager;
        boolean zOooo0oo = false;
        for (Fragment fragment2 : (ArrayList) fragmentManager.f8304OooO0OO.OooO0o()) {
            if (fragment2 != null) {
                zOooo0oo = fragmentManager.Oooo0oo(fragment2);
            }
            if (zOooo0oo) {
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

    public final void OoooO() {
        if (this.f8321OooOo0 == null) {
            return;
        }
        this.f8333Oooo000 = false;
        this.f8334Oooo00O = false;
        this.f8338Oooo0o.f8436OooO0o = false;
        for (Fragment fragment : this.f8304OooO0OO.OooO0oo()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean OoooO0() {
        return this.f8333Oooo000 || this.f8334Oooo00O;
    }

    public final boolean OoooO00(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.f8320OooOo) && OoooO00(fragmentManager.f8324OooOo0o);
    }

    public final void OoooO0O(int i, boolean z) {
        o00oO0o<?> o00oo0o2;
        if (this.f8321OooOo0 == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f8322OooOo00) {
            this.f8322OooOo00 = i;
            o00000OO o00000oo2 = this.f8304OooO0OO;
            Iterator<Fragment> it = o00000oo2.f8450OooO00o.iterator();
            while (it.hasNext()) {
                o00000O o00000o = o00000oo2.f8451OooO0O0.get(it.next().mWho);
                if (o00000o != null) {
                    o00000o.OooOO0O();
                }
            }
            Iterator<o00000O> it2 = o00000oo2.f8451OooO0O0.values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                o00000O next = it2.next();
                if (next != null) {
                    next.OooOO0O();
                    Fragment fragment = next.f8440OooO0OO;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        z2 = true;
                    }
                    if (z2) {
                        if (fragment.mBeingSaved && !o00000oo2.f8452OooO0OO.containsKey(fragment.mWho)) {
                            next.OooOOOo();
                        }
                        o00000oo2.OooOO0(next);
                    }
                }
            }
            Ooooooo();
            if (this.f8331OooOooo && (o00oo0o2 = this.f8321OooOo0) != null && this.f8322OooOo00 == 7) {
                o00oo0o2.OooO0oo();
                this.f8331OooOooo = false;
            }
        }
    }

    public final void OoooOO0(@NonNull o00000O o00000o) {
        Fragment fragment = o00000o.f8440OooO0OO;
        if (fragment.mDeferStart) {
            if (this.f8303OooO0O0) {
                this.f8332Oooo0 = true;
            } else {
                fragment.mDeferStart = false;
                o00000o.OooOO0O();
            }
        }
    }

    public final boolean OoooOOO(int i, int i2) {
        OooOoOO(false);
        OooOoO(true);
        Fragment fragment = this.f8320OooOo;
        if (fragment != null && i < 0 && fragment.getChildFragmentManager().o000oOoO()) {
            return true;
        }
        boolean zOoooOOo = OoooOOo(this.f8336Oooo0O0, this.f8337Oooo0OO, null, i, i2);
        if (zOoooOOo) {
            this.f8303OooO0O0 = true;
            try {
                OoooOoo(this.f8336Oooo0O0, this.f8337Oooo0OO);
                OooO0Oo();
            } catch (Throwable th) {
                OooO0Oo();
                throw th;
            }
        }
        o00O0O();
        OooOo0O();
        this.f8304OooO0OO.OooO0O0();
        return zOoooOOo;
    }

    public final boolean OoooOOo(@NonNull ArrayList<androidx.fragment.app.OooO00o> arrayList, @NonNull ArrayList<Boolean> arrayList2, @Nullable String str, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList<androidx.fragment.app.OooO00o> arrayList3 = this.f8305OooO0Oo;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (str != null || i >= 0) {
                int size2 = this.f8305OooO0Oo.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.OooO00o oooO00o = this.f8305OooO0Oo.get(size2);
                    if ((str != null && str.equals(oooO00o.f8477OooO0oo)) || (i >= 0 && i == oooO00o.f8385OooOOo)) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z) {
                        while (size2 > 0) {
                            int i3 = size2 - 1;
                            androidx.fragment.app.OooO00o oooO00o2 = this.f8305OooO0Oo.get(i3);
                            if ((str == null || !str.equals(oooO00o2.f8477OooO0oo)) && (i < 0 || i != oooO00o2.f8385OooOOo)) {
                                break;
                            }
                            size2 = i3;
                        }
                    } else if (size2 != this.f8305OooO0Oo.size() - 1) {
                        size2++;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            } else {
                size = z ? 0 : (-1) + this.f8305OooO0Oo.size();
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f8305OooO0Oo.size() - 1; size3 >= size; size3--) {
            arrayList.add(this.f8305OooO0Oo.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void OoooOo0(@NonNull OooOo00 oooOo00, boolean z) {
        this.f8314OooOOO0.f8537OooO00o.add(new o0OOO0o.OooO00o(oooOo00, z));
    }

    public final void OoooOoO(@NonNull Fragment fragment) {
        if (Oooo0oO(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            o00000OO o00000oo2 = this.f8304OooO0OO;
            synchronized (o00000oo2.f8450OooO00o) {
                o00000oo2.f8450OooO00o.remove(fragment);
            }
            fragment.mAdded = false;
            if (Oooo0oo(fragment)) {
                this.f8331OooOooo = true;
            }
            fragment.mRemoving = true;
            Oooooo(fragment);
        }
    }

    public final void OoooOoo(@NonNull ArrayList<androidx.fragment.app.OooO00o> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
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
            if (!arrayList.get(i).f8483OooOOOO) {
                if (i2 != i) {
                    OooOoo(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f8483OooOOOO) {
                        i2++;
                    }
                }
                OooOoo(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            OooOoo(arrayList, arrayList2, i2, size);
        }
    }

    public final void Ooooo00(@Nullable Parcelable parcelable) {
        int i;
        o00000O o00000o;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f8321OooOo0.f8533OoooO00.getClassLoader());
                this.f8311OooOO0O.put(str.substring(7), bundle2);
            }
        }
        ArrayList<FragmentState> arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f8321OooOo0.f8533OoooO00.getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable(ServerProtocol.DIALOG_PARAM_STATE));
            }
        }
        o00000OO o00000oo2 = this.f8304OooO0OO;
        o00000oo2.f8452OooO0OO.clear();
        for (FragmentState fragmentState : arrayList) {
            o00000oo2.f8452OooO0OO.put(fragmentState.f8365OoooO00, fragmentState);
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable(ServerProtocol.DIALOG_PARAM_STATE);
        if (fragmentManagerState == null) {
            return;
        }
        this.f8304OooO0OO.f8451OooO0O0.clear();
        Iterator<String> it = fragmentManagerState.f8354Oooo.iterator();
        while (it.hasNext()) {
            FragmentState fragmentStateOooOO0O = this.f8304OooO0OO.OooOO0O(it.next(), null);
            if (fragmentStateOooOO0O != null) {
                Fragment fragment = this.f8338Oooo0o.f8432OooO00o.get(fragmentStateOooOO0O.f8365OoooO00);
                if (fragment != null) {
                    if (Oooo0oO(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    o00000o = new o00000O(this.f8314OooOOO0, this.f8304OooO0OO, fragment, fragmentStateOooOO0O);
                } else {
                    o00000o = new o00000O(this.f8314OooOOO0, this.f8304OooO0OO, this.f8321OooOo0.f8533OoooO00.getClassLoader(), Oooo0O0(), fragmentStateOooOO0O);
                }
                Fragment fragment2 = o00000o.f8440OooO0OO;
                fragment2.mFragmentManager = this;
                if (Oooo0oO(2)) {
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("restoreSaveState: active (");
                    sbOooO0O0.append(fragment2.mWho);
                    sbOooO0O0.append("): ");
                    sbOooO0O0.append(fragment2);
                    Log.v("FragmentManager", sbOooO0O0.toString());
                }
                o00000o.OooOOO0(this.f8321OooOo0.f8533OoooO00.getClassLoader());
                this.f8304OooO0OO.OooO(o00000o);
                o00000o.f8442OooO0o0 = this.f8322OooOo00;
            }
        }
        o000000O o000000o2 = this.f8338Oooo0o;
        Objects.requireNonNull(o000000o2);
        Iterator it2 = new ArrayList(o000000o2.f8432OooO00o.values()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Fragment fragment3 = (Fragment) it2.next();
            if ((this.f8304OooO0OO.f8451OooO0O0.get(fragment3.mWho) != null ? 1 : 0) == 0) {
                if (Oooo0oO(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.f8354Oooo);
                }
                this.f8338Oooo0o.OooO0o0(fragment3);
                fragment3.mFragmentManager = this;
                o00000O o00000o2 = new o00000O(this.f8314OooOOO0, this.f8304OooO0OO, fragment3);
                o00000o2.f8442OooO0o0 = 1;
                o00000o2.OooOO0O();
                fragment3.mRemoving = true;
                o00000o2.OooOO0O();
            }
        }
        o00000OO o00000oo3 = this.f8304OooO0OO;
        ArrayList<String> arrayList2 = fragmentManagerState.f8357OoooO00;
        o00000oo3.f8450OooO00o.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                Fragment fragmentOooO0OO = o00000oo3.OooO0OO(str3);
                if (fragmentOooO0OO == null) {
                    throw new IllegalStateException(OooO0o.OooO0OO.OooO00o("No instantiated fragment for (", str3, ")"));
                }
                if (Oooo0oO(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentOooO0OO);
                }
                o00000oo3.OooO00o(fragmentOooO0OO);
            }
        }
        if (fragmentManagerState.f8356OoooO0 != null) {
            this.f8305OooO0Oo = new ArrayList<>(fragmentManagerState.f8356OoooO0.length);
            int i2 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f8356OoooO0;
                if (i2 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i2];
                Objects.requireNonNull(backStackRecordState);
                androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = backStackRecordState.f8245Oooo;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    o0000Ooo.OooO00o oooO00o2 = new o0000Ooo.OooO00o();
                    int i5 = i3 + 1;
                    oooO00o2.f8485OooO00o = iArr[i3];
                    if (Oooo0oO(2)) {
                        Log.v("FragmentManager", "Instantiate " + oooO00o + " op #" + i4 + " base fragment #" + backStackRecordState.f8245Oooo[i5]);
                    }
                    oooO00o2.f8492OooO0oo = Lifecycle.State.values()[backStackRecordState.f8247OoooO0[i4]];
                    oooO00o2.f8484OooO = Lifecycle.State.values()[backStackRecordState.f8249OoooO0O[i4]];
                    int[] iArr2 = backStackRecordState.f8245Oooo;
                    int i6 = i5 + 1;
                    oooO00o2.f8487OooO0OO = iArr2[i5] != 0;
                    int i7 = i6 + 1;
                    int i8 = iArr2[i6];
                    oooO00o2.f8488OooO0Oo = i8;
                    int i9 = i7 + 1;
                    int i10 = iArr2[i7];
                    oooO00o2.f8490OooO0o0 = i10;
                    int i11 = i9 + 1;
                    int i12 = iArr2[i9];
                    oooO00o2.f8489OooO0o = i12;
                    int i13 = iArr2[i11];
                    oooO00o2.f8491OooO0oO = i13;
                    oooO00o.f8471OooO0O0 = i8;
                    oooO00o.f8472OooO0OO = i10;
                    oooO00o.f8473OooO0Oo = i12;
                    oooO00o.f8475OooO0o0 = i13;
                    oooO00o.OooO0O0(oooO00o2);
                    i4++;
                    i3 = i11 + 1;
                }
                oooO00o.f8474OooO0o = backStackRecordState.f8246OoooO;
                oooO00o.f8477OooO0oo = backStackRecordState.f8250OoooOO0;
                oooO00o.f8476OooO0oO = true;
                oooO00o.f8469OooO = backStackRecordState.f8251OoooOOO;
                oooO00o.f8478OooOO0 = backStackRecordState.f8252OoooOOo;
                oooO00o.f8479OooOO0O = backStackRecordState.f8253OoooOo0;
                oooO00o.f8480OooOO0o = backStackRecordState.f8254OoooOoO;
                oooO00o.f8482OooOOO0 = backStackRecordState.f8255OoooOoo;
                oooO00o.f8481OooOOO = backStackRecordState.f8256Ooooo00;
                oooO00o.f8483OooOOOO = backStackRecordState.f8257Ooooo0o;
                oooO00o.f8385OooOOo = backStackRecordState.f8258o000oOoO;
                for (int i14 = 0; i14 < backStackRecordState.f8248OoooO00.size(); i14++) {
                    String str4 = backStackRecordState.f8248OoooO00.get(i14);
                    if (str4 != null) {
                        oooO00o.f8470OooO00o.get(i14).f8486OooO0O0 = OooOooo(str4);
                    }
                }
                oooO00o.OooO0o(1);
                if (Oooo0oO(2)) {
                    StringBuilder sbOooO00o = androidx.appcompat.widget.o00000O0.OooO00o("restoreAllState: back stack #", i2, " (index ");
                    sbOooO00o.append(oooO00o.f8385OooOOo);
                    sbOooO00o.append("): ");
                    sbOooO00o.append(oooO00o);
                    Log.v("FragmentManager", sbOooO00o.toString());
                    PrintWriter printWriter = new PrintWriter(new o000());
                    oooO00o.OooOO0o("  ", printWriter, false);
                    printWriter.close();
                }
                this.f8305OooO0Oo.add(oooO00o);
                i2++;
            }
        } else {
            this.f8305OooO0Oo = null;
        }
        this.f8301OooO.set(fragmentManagerState.f8358OoooO0O);
        String str5 = fragmentManagerState.f8355OoooO;
        if (str5 != null) {
            Fragment fragmentOooOooo = OooOooo(str5);
            this.f8320OooOo = fragmentOooOooo;
            OooOOo(fragmentOooOooo);
        }
        ArrayList<String> arrayList3 = fragmentManagerState.f8359OoooOO0;
        if (arrayList3 != null) {
            for (i = 0; i < arrayList3.size(); i++) {
                this.f8310OooOO0.put(arrayList3.get(i), fragmentManagerState.f8361o000oOoO.get(i));
            }
        }
        this.f8330OooOooO = new ArrayDeque<>(fragmentManagerState.f8360OoooOOO);
    }

    @NonNull
    public final Bundle Ooooo0o() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        Oooo00o();
        OooOo();
        OooOoOO(true);
        this.f8333Oooo000 = true;
        this.f8338Oooo0o.f8436OooO0o = true;
        o00000OO o00000oo2 = this.f8304OooO0OO;
        Objects.requireNonNull(o00000oo2);
        ArrayList<String> arrayList2 = new ArrayList<>(o00000oo2.f8451OooO0O0.size());
        for (o00000O o00000o : o00000oo2.f8451OooO0O0.values()) {
            if (o00000o != null) {
                Fragment fragment = o00000o.f8440OooO0OO;
                o00000o.OooOOOo();
                arrayList2.add(fragment.mWho);
                if (Oooo0oO(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        o00000OO o00000oo3 = this.f8304OooO0OO;
        Objects.requireNonNull(o00000oo3);
        ArrayList<FragmentState> arrayList3 = new ArrayList(o00000oo3.f8452OooO0OO.values());
        if (!arrayList3.isEmpty()) {
            o00000OO o00000oo4 = this.f8304OooO0OO;
            synchronized (o00000oo4.f8450OooO00o) {
                backStackRecordStateArr = null;
                if (o00000oo4.f8450OooO00o.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(o00000oo4.f8450OooO00o.size());
                    for (Fragment fragment2 : o00000oo4.f8450OooO00o) {
                        arrayList.add(fragment2.mWho);
                        if (Oooo0oO(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                        }
                    }
                }
            }
            ArrayList<androidx.fragment.app.OooO00o> arrayList4 = this.f8305OooO0Oo;
            if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState(this.f8305OooO0Oo.get(i));
                    if (Oooo0oO(2)) {
                        StringBuilder sbOooO00o = androidx.appcompat.widget.o00000O0.OooO00o("saveAllState: adding back stack #", i, ": ");
                        sbOooO00o.append(this.f8305OooO0Oo.get(i));
                        Log.v("FragmentManager", sbOooO00o.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f8354Oooo = arrayList2;
            fragmentManagerState.f8357OoooO00 = arrayList;
            fragmentManagerState.f8356OoooO0 = backStackRecordStateArr;
            fragmentManagerState.f8358OoooO0O = this.f8301OooO.get();
            Fragment fragment3 = this.f8320OooOo;
            if (fragment3 != null) {
                fragmentManagerState.f8355OoooO = fragment3.mWho;
            }
            fragmentManagerState.f8359OoooOO0.addAll(this.f8310OooOO0.keySet());
            fragmentManagerState.f8361o000oOoO.addAll(this.f8310OooOO0.values());
            fragmentManagerState.f8360OoooOOO = new ArrayList<>(this.f8330OooOooO);
            bundle.putParcelable(ServerProtocol.DIALOG_PARAM_STATE, fragmentManagerState);
            for (String str : this.f8311OooOO0O.keySet()) {
                bundle.putBundle(p016OooOoO0.OooOo00.OooO00o("result_", str), this.f8311OooOO0O.get(str));
            }
            for (FragmentState fragmentState : arrayList3) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(ServerProtocol.DIALOG_PARAM_STATE, fragmentState);
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("fragment_");
                sbOooO0O0.append(fragmentState.f8365OoooO00);
                bundle.putBundle(sbOooO0O0.toString(), bundle2);
            }
        } else if (Oooo0oO(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void OooooO0() {
        synchronized (this.f8302OooO00o) {
            boolean z = true;
            if (this.f8302OooO00o.size() != 1) {
                z = false;
            }
            if (z) {
                this.f8321OooOo0.f8532OoooO0.removeCallbacks(this.f8340Oooo0oO);
                this.f8321OooOo0.f8532OoooO0.post(this.f8340Oooo0oO);
                o00O0O();
            }
        }
    }

    public final void OooooOO(@NonNull Fragment fragment, boolean z) {
        ViewGroup viewGroupOooo0 = Oooo0(fragment);
        if (viewGroupOooo0 == null || !(viewGroupOooo0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupOooo0).setDrawDisappearingViewsLast(!z);
    }

    public final void OooooOo(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.equals(OooOooo(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void Oooooo(@NonNull Fragment fragment) {
        ViewGroup viewGroupOooo0 = Oooo0(fragment);
        if (viewGroupOooo0 != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                int i = p079o000Oo0O.Oooo000.visible_removing_fragment_view_tag;
                if (viewGroupOooo0.getTag(i) == null) {
                    viewGroupOooo0.setTag(i, fragment);
                }
                ((Fragment) viewGroupOooo0.getTag(i)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void Oooooo0(@Nullable Fragment fragment) {
        if (fragment == null || (fragment.equals(OooOooo(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f8320OooOo;
            this.f8320OooOo = fragment;
            OooOOo(fragment2);
            OooOOo(this.f8320OooOo);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void OoooooO(@NonNull Fragment fragment) {
        if (Oooo0oO(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void Ooooooo() {
        Iterator it = ((ArrayList) this.f8304OooO0OO.OooO0o0()).iterator();
        while (it.hasNext()) {
            OoooOO0((o00000O) it.next());
        }
    }

    public final boolean o000oOoO() {
        return OoooOOO(-1, 0);
    }

    public final void o00O0O() {
        synchronized (this.f8302OooO00o) {
            if (!this.f8302OooO00o.isEmpty()) {
                this.f8309OooO0oo.f4343OooO00o = true;
                return;
            }
            OooO0O0 oooO0O0 = this.f8309OooO0oo;
            ArrayList<androidx.fragment.app.OooO00o> arrayList = this.f8305OooO0Oo;
            oooO0O0.f4343OooO00o = (arrayList != null ? arrayList.size() : 0) > 0 && OoooO00(this.f8324OooOo0o);
        }
    }

    public final void o0OoOo0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new o000());
        o00oO0o<?> o00oo0o2 = this.f8321OooOo0;
        if (o00oo0o2 != null) {
            try {
                o00oo0o2.OooO0Oo(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            OooOo0o("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void ooOO(@NonNull OooOo00 oooOo00) {
        o0OOO0o o0ooo0o2 = this.f8314OooOOO0;
        synchronized (o0ooo0o2.f8537OooO00o) {
            int size = o0ooo0o2.f8537OooO00o.size();
            for (int i = 0; i < size; i++) {
                if (o0ooo0o2.f8537OooO00o.get(i).f8539OooO00o == oooOo00) {
                    o0ooo0o2.f8537OooO00o.remove(i);
                    break;
                }
            }
        }
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f8324OooOo0o;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f8324OooOo0o)));
            sb.append("}");
        } else {
            o00oO0o<?> o00oo0o2 = this.f8321OooOo0;
            if (o00oo0o2 != null) {
                sb.append(o00oo0o2.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f8321OooOo0)));
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

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public String f8341Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f8342OoooO00;

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
            this.f8341Oooo = str;
            this.f8342OoooO00 = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f8341Oooo);
            parcel.writeInt(this.f8342OoooO00);
        }

        public LaunchedFragmentInfo(@NonNull Parcel parcel) {
            this.f8341Oooo = parcel.readString();
            this.f8342OoooO00 = parcel.readInt();
        }
    }
}
