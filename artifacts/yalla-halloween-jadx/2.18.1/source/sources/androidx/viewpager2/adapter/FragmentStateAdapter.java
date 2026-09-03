package androidx.viewpager2.adapter;

import OooO0o.OooO0o;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00000O0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p016OooOoO0.OooOo00;
import p021OooOooo.o00Ooo;
import p021OooOooo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<FragmentViewHolder> implements StatefulAdapter {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    public final FragmentManager mFragmentManager;
    private FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    public final o00Ooo<Fragment> mFragments;
    private boolean mHasStaleFragments;
    public boolean mIsInGracePeriod;
    private final o00Ooo<Integer> mItemIdToViewHolder;
    public final Lifecycle mLifecycle;
    private final o00Ooo<Fragment.SavedState> mSavedStates;

    public static abstract class DataSetChangeObserver extends RecyclerView.OooOOO {
        private DataSetChangeObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            onChanged();
        }
    }

    public class FragmentMaxLifecycleEnforcer {
        private RecyclerView.OooOOO mDataObserver;
        private LifecycleEventObserver mLifecycleObserver;
        private ViewPager2.OnPageChangeCallback mPageChangeCallback;
        private long mPrimaryItemId = -1;
        private ViewPager2 mViewPager;

        public FragmentMaxLifecycleEnforcer() {
        }

        @NonNull
        private ViewPager2 inferViewPager(@NonNull RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public void register(@NonNull RecyclerView recyclerView) {
            this.mViewPager = inferViewPager(recyclerView);
            ViewPager2.OnPageChangeCallback onPageChangeCallback = new ViewPager2.OnPageChangeCallback() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.1
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageScrollStateChanged(int i) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageSelected(int i) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }
            };
            this.mPageChangeCallback = onPageChangeCallback;
            this.mViewPager.registerOnPageChangeCallback(onPageChangeCallback);
            DataSetChangeObserver dataSetChangeObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.2
                @Override // androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.OooOOO
                public void onChanged() {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(true);
                }
            };
            this.mDataObserver = dataSetChangeObserver;
            FragmentStateAdapter.this.registerAdapterDataObserver(dataSetChangeObserver);
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }
            };
            this.mLifecycleObserver = lifecycleEventObserver;
            FragmentStateAdapter.this.mLifecycle.addObserver(lifecycleEventObserver);
        }

        public void unregister(@NonNull RecyclerView recyclerView) {
            inferViewPager(recyclerView).unregisterOnPageChangeCallback(this.mPageChangeCallback);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.mDataObserver);
            FragmentStateAdapter.this.mLifecycle.removeObserver(this.mLifecycleObserver);
            this.mViewPager = null;
        }

        public void updateFragmentMaxLifecycle(boolean z) {
            int currentItem;
            if (FragmentStateAdapter.this.shouldDelayFragmentTransactions() || this.mViewPager.getScrollState() != 0 || FragmentStateAdapter.this.mFragments.OooOO0() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.mViewPager.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if (itemId != this.mPrimaryItemId || z) {
                Fragment fragment = null;
                Fragment fragmentOooO = FragmentStateAdapter.this.mFragments.OooO(itemId, null);
                if (fragmentOooO == null || !fragmentOooO.isAdded()) {
                    return;
                }
                this.mPrimaryItemId = itemId;
                androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(FragmentStateAdapter.this.mFragmentManager);
                for (int i = 0; i < FragmentStateAdapter.this.mFragments.OooOOO(); i++) {
                    long jOooOO0O = FragmentStateAdapter.this.mFragments.OooOO0O(i);
                    Fragment fragmentOooOOOO = FragmentStateAdapter.this.mFragments.OooOOOO(i);
                    if (fragmentOooOOOO.isAdded()) {
                        if (jOooOO0O != this.mPrimaryItemId) {
                            oooO00o.OooO0o0(fragmentOooOOOO, Lifecycle.State.STARTED);
                        } else {
                            fragment = fragmentOooOOOO;
                        }
                        fragmentOooOOOO.setMenuVisibility(jOooOO0O == this.mPrimaryItemId);
                    }
                }
                if (fragment != null) {
                    oooO00o.OooO0o0(fragment, Lifecycle.State.RESUMED);
                }
                if (oooO00o.f8443OooO00o.isEmpty()) {
                    return;
                }
                oooO00o.OooO0OO();
            }
        }
    }

    public FragmentStateAdapter(@NonNull FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    @NonNull
    private static String createKey(@NonNull String str, long j) {
        return OooO00o.OooO00o(str, j);
    }

    private void ensureFragment(int i) {
        long itemId = getItemId(i);
        if (this.mFragments.OooO0o(itemId)) {
            return;
        }
        Fragment fragmentCreateFragment = createFragment(i);
        fragmentCreateFragment.setInitialSavedState(this.mSavedStates.OooO(itemId, null));
        this.mFragments.OooOO0o(itemId, fragmentCreateFragment);
    }

    private boolean isFragmentViewBound(long j) {
        View view;
        if (this.mItemIdToViewHolder.OooO0o(j)) {
            return true;
        }
        Fragment fragmentOooO = this.mFragments.OooO(j, null);
        return (fragmentOooO == null || (view = fragmentOooO.getView()) == null || view.getParent() == null) ? false : true;
    }

    private static boolean isValidKey(@NonNull String str, @NonNull String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long itemForViewHolder(int i) {
        Long lValueOf = null;
        for (int i2 = 0; i2 < this.mItemIdToViewHolder.OooOOO(); i2++) {
            if (this.mItemIdToViewHolder.OooOOOO(i2).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.mItemIdToViewHolder.OooOO0O(i2));
            }
        }
        return lValueOf;
    }

    private static long parseIdFromKey(@NonNull String str, @NonNull String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void removeFragment(long j) {
        Bundle bundleOooOOOO;
        ViewParent parent;
        Fragment.SavedState savedState = null;
        Fragment fragmentOooO = this.mFragments.OooO(j, null);
        if (fragmentOooO == null) {
            return;
        }
        if (fragmentOooO.getView() != null && (parent = fragmentOooO.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j)) {
            this.mSavedStates.OooOOO0(j);
        }
        if (!fragmentOooO.isAdded()) {
            this.mFragments.OooOOO0(j);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
            return;
        }
        if (fragmentOooO.isAdded() && containsItem(j)) {
            o00Ooo<Fragment.SavedState> o00ooo2 = this.mSavedStates;
            FragmentManager fragmentManager = this.mFragmentManager;
            o00000O0 o00000o0OooO0oO = fragmentManager.f8289OooO0OO.OooO0oO(fragmentOooO.mWho);
            if (o00000o0OooO0oO == null || !o00000o0OooO0oO.f8437OooO0OO.equals(fragmentOooO)) {
                fragmentManager.o0OoOo0(new IllegalStateException(OooO0o.OooO0O0("Fragment ", fragmentOooO, " is not currently in the FragmentManager")));
                throw null;
            }
            if (o00000o0OooO0oO.f8437OooO0OO.mState > -1 && (bundleOooOOOO = o00000o0OooO0oO.OooOOOO()) != null) {
                savedState = new Fragment.SavedState(bundleOooOOOO);
            }
            o00ooo2.OooOO0o(j, savedState);
        }
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(this.mFragmentManager);
        oooO00o.OooOOO0(fragmentOooO);
        oooO00o.OooO0OO();
        this.mFragments.OooOOO0(j);
    }

    private void scheduleGracePeriodEnd() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable runnable = new Runnable() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                fragmentStateAdapter.mIsInGracePeriod = false;
                fragmentStateAdapter.gcFragments();
            }
        };
        this.mLifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(runnable);
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }
            }
        });
        handler.postDelayed(runnable, GRACE_WINDOW_TIME_MS);
    }

    private void scheduleViewAttach(final Fragment fragment, @NonNull final FrameLayout frameLayout) {
        this.mFragmentManager.OoooOo0(new FragmentManager.OooOo00() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.3
            @Override // androidx.fragment.app.FragmentManager.OooOo00
            public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment2, @NonNull View view, @Nullable Bundle bundle) {
                if (fragment2 == fragment) {
                    fragmentManager.ooOO(this);
                    FragmentStateAdapter.this.addViewToContainer(view, frameLayout);
                }
            }
        }, false);
    }

    public void addViewToContainer(@NonNull View view, @NonNull FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean containsItem(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    @NonNull
    public abstract Fragment createFragment(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public void gcFragments() {
        if (!this.mHasStaleFragments || shouldDelayFragmentTransactions()) {
            return;
        }
        o0OoOo0 o0oooo1 = new o0OoOo0(0);
        for (int i = 0; i < this.mFragments.OooOOO(); i++) {
            long jOooOO0O = this.mFragments.OooOO0O(i);
            if (!containsItem(jOooOO0O)) {
                o0oooo1.add(Long.valueOf(jOooOO0O));
                this.mItemIdToViewHolder.OooOOO0(jOooOO0O);
            }
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i2 = 0; i2 < this.mFragments.OooOOO(); i2++) {
                long jOooOO0O2 = this.mFragments.OooOO0O(i2);
                if (!isFragmentViewBound(jOooOO0O2)) {
                    o0oooo1.add(Long.valueOf(jOooOO0O2));
                }
            }
        }
        o0OoOo0.OooO00o oooO00o = new o0OoOo0.OooO00o();
        while (oooO00o.hasNext()) {
            removeFragment(((Long) oooO00o.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        if (!(this.mFragmentMaxLifecycleEnforcer == null)) {
            throw new IllegalArgumentException();
        }
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.mFragmentMaxLifecycleEnforcer = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.register(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.mFragmentMaxLifecycleEnforcer.unregister(recyclerView);
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@NonNull FragmentViewHolder fragmentViewHolder) {
        return true;
    }

    public void placeFragmentInViewHolder(@NonNull final FragmentViewHolder fragmentViewHolder) {
        Fragment fragmentOooO = this.mFragments.OooO(fragmentViewHolder.getItemId(), null);
        if (fragmentOooO == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout container = fragmentViewHolder.getContainer();
        View view = fragmentOooO.getView();
        if (!fragmentOooO.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragmentOooO.isAdded() && view == null) {
            scheduleViewAttach(fragmentOooO, container);
            return;
        }
        if (fragmentOooO.isAdded() && view.getParent() != null) {
            if (view.getParent() != container) {
                addViewToContainer(view, container);
                return;
            }
            return;
        }
        if (fragmentOooO.isAdded()) {
            addViewToContainer(view, container);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            if (this.mFragmentManager.f8320Oooo00o) {
                return;
            }
            this.mLifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                    if (FragmentStateAdapter.this.shouldDelayFragmentTransactions()) {
                        return;
                    }
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    FrameLayout container2 = fragmentViewHolder.getContainer();
                    WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    if (ViewCompat.OooOO0O.OooO0O0(container2)) {
                        FragmentStateAdapter.this.placeFragmentInViewHolder(fragmentViewHolder);
                    }
                }
            });
            return;
        }
        scheduleViewAttach(fragmentOooO, container);
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(this.mFragmentManager);
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("f");
        sbOooO0o0.append(fragmentViewHolder.getItemId());
        oooO00o.OooO0Oo(0, fragmentOooO, sbOooO0o0.toString(), 1);
        oooO00o.OooO0o0(fragmentOooO, Lifecycle.State.STARTED);
        oooO00o.OooO0OO();
        this.mFragmentMaxLifecycleEnforcer.updateFragmentMaxLifecycle(false);
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(@NonNull Parcelable parcelable) {
        if (!this.mSavedStates.OooOO0() || !this.mFragments.OooOO0()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (isValidKey(str, KEY_PREFIX_FRAGMENT)) {
                long idFromKey = parseIdFromKey(str, KEY_PREFIX_FRAGMENT);
                FragmentManager fragmentManager = this.mFragmentManager;
                Objects.requireNonNull(fragmentManager);
                String string = bundle.getString(str);
                Fragment fragment = null;
                if (string != null) {
                    Fragment fragmentOooOooo = fragmentManager.OooOooo(string);
                    if (fragmentOooOooo == null) {
                        fragmentManager.o0OoOo0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                        throw null;
                    }
                    fragment = fragmentOooOooo;
                }
                this.mFragments.OooOO0o(idFromKey, fragment);
            } else {
                if (!isValidKey(str, KEY_PREFIX_STATE)) {
                    throw new IllegalArgumentException(OooOo00.OooO0Oo("Unexpected key in savedState: ", str));
                }
                long idFromKey2 = parseIdFromKey(str, KEY_PREFIX_STATE);
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (containsItem(idFromKey2)) {
                    this.mSavedStates.OooOO0o(idFromKey2, savedState);
                }
            }
        }
        if (this.mFragments.OooOO0()) {
            return;
        }
        this.mHasStaleFragments = true;
        this.mIsInGracePeriod = true;
        gcFragments();
        scheduleGracePeriodEnd();
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    @NonNull
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mSavedStates.OooOOO() + this.mFragments.OooOOO());
        for (int i = 0; i < this.mFragments.OooOOO(); i++) {
            long jOooOO0O = this.mFragments.OooOO0O(i);
            Fragment fragmentOooO = this.mFragments.OooO(jOooOO0O, null);
            if (fragmentOooO != null && fragmentOooO.isAdded()) {
                String strCreateKey = createKey(KEY_PREFIX_FRAGMENT, jOooOO0O);
                FragmentManager fragmentManager = this.mFragmentManager;
                Objects.requireNonNull(fragmentManager);
                if (fragmentOooO.mFragmentManager != fragmentManager) {
                    fragmentManager.o0OoOo0(new IllegalStateException(OooO0o.OooO0O0("Fragment ", fragmentOooO, " is not currently in the FragmentManager")));
                    throw null;
                }
                bundle.putString(strCreateKey, fragmentOooO.mWho);
            }
        }
        for (int i2 = 0; i2 < this.mSavedStates.OooOOO(); i2++) {
            long jOooOO0O2 = this.mSavedStates.OooOO0O(i2);
            if (containsItem(jOooOO0O2)) {
                bundle.putParcelable(createKey(KEY_PREFIX_STATE, jOooOO0O2), this.mSavedStates.OooO(jOooOO0O2, null));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.OoooO0();
    }

    public FragmentStateAdapter(@NonNull Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull final FragmentViewHolder fragmentViewHolder, int i) {
        long itemId = fragmentViewHolder.getItemId();
        int id = fragmentViewHolder.getContainer().getId();
        Long lItemForViewHolder = itemForViewHolder(id);
        if (lItemForViewHolder != null && lItemForViewHolder.longValue() != itemId) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.OooOOO0(lItemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.OooOO0o(itemId, Integer.valueOf(id));
        ensureFragment(i);
        final FrameLayout container = fragmentViewHolder.getContainer();
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooOO0O.OooO0O0(container)) {
            if (container.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            container.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    if (container.getParent() != null) {
                        container.removeOnLayoutChangeListener(this);
                        FragmentStateAdapter.this.placeFragmentInViewHolder(fragmentViewHolder);
                    }
                }
            });
        }
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final FragmentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return FragmentViewHolder.create(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NonNull FragmentViewHolder fragmentViewHolder) {
        placeFragmentInViewHolder(fragmentViewHolder);
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@NonNull FragmentViewHolder fragmentViewHolder) {
        Long lItemForViewHolder = itemForViewHolder(fragmentViewHolder.getContainer().getId());
        if (lItemForViewHolder != null) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.OooOOO0(lItemForViewHolder.longValue());
        }
    }

    public FragmentStateAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        this.mFragments = new o00Ooo<>();
        this.mSavedStates = new o00Ooo<>();
        this.mItemIdToViewHolder = new o00Ooo<>();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = fragmentManager;
        this.mLifecycle = lifecycle;
        super.setHasStableIds(true);
    }
}
