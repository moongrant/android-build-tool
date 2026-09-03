package androidx.viewpager2.adapter;

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
import androidx.core.view.o000O0Oo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.WeakHashMap;
import p022Oooo00O.o00O00OO;
import p031OoooO0.o00Ooo;
import p188o00o0O.OooOOO;
import p188o00o0O.OooOOO0;
import p188o00o0O.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<FragmentViewHolder> implements StatefulAdapter {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    final FragmentManager mFragmentManager;
    private FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    final OooOo00<Fragment> mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final OooOo00<Integer> mItemIdToViewHolder;
    final Lifecycle mLifecycle;
    private final OooOo00<Fragment.SavedState> mSavedStates;

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
            if (!FragmentStateAdapter.this.shouldDelayFragmentTransactions() && this.mViewPager.getScrollState() == 0) {
                if ((FragmentStateAdapter.this.mFragments.OooOO0O() == 0) || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.mViewPager.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                    return;
                }
                long itemId = FragmentStateAdapter.this.getItemId(currentItem);
                if (itemId != this.mPrimaryItemId || z) {
                    Fragment fragment = null;
                    Fragment fragment2 = (Fragment) FragmentStateAdapter.this.mFragments.OooO0oO(itemId, null);
                    if (fragment2 == null || !fragment2.isAdded()) {
                        return;
                    }
                    this.mPrimaryItemId = itemId;
                    FragmentManager fragmentManager = FragmentStateAdapter.this.mFragmentManager;
                    fragmentManager.getClass();
                    OooO00o oooO00o = new OooO00o(fragmentManager);
                    for (int i = 0; i < FragmentStateAdapter.this.mFragments.OooOO0O(); i++) {
                        long jOooO0oo = FragmentStateAdapter.this.mFragments.OooO0oo(i);
                        Fragment fragmentOooOO0o = FragmentStateAdapter.this.mFragments.OooOO0o(i);
                        if (fragmentOooOO0o.isAdded()) {
                            if (jOooO0oo != this.mPrimaryItemId) {
                                oooO00o.OooOOO(fragmentOooOO0o, Lifecycle.State.STARTED);
                            } else {
                                fragment = fragmentOooOO0o;
                            }
                            fragmentOooOO0o.setMenuVisibility(jOooO0oo == this.mPrimaryItemId);
                        }
                    }
                    if (fragment != null) {
                        oooO00o.OooOOO(fragment, Lifecycle.State.RESUMED);
                    }
                    if (oooO00o.f5962OooO00o.isEmpty()) {
                        return;
                    }
                    oooO00o.OooO0oo();
                }
            }
        }
    }

    public FragmentStateAdapter(@NonNull FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    @NonNull
    private static String createKey(@NonNull String str, long j) {
        return str + j;
    }

    private void ensureFragment(int i) {
        long itemId = getItemId(i);
        OooOo00<Fragment> oooOo00 = this.mFragments;
        if (oooOo00.f38802OooO0Oo) {
            oooOo00.OooO0o();
        }
        if (OooOOO.OooO0OO(oooOo00.f38804OooO0o0, oooOo00.f38805OooO0oO, itemId) >= 0) {
            return;
        }
        Fragment fragmentCreateFragment = createFragment(i);
        fragmentCreateFragment.setInitialSavedState((Fragment.SavedState) this.mSavedStates.OooO0oO(itemId, null));
        this.mFragments.OooO(itemId, fragmentCreateFragment);
    }

    private boolean isFragmentViewBound(long j) {
        View view;
        OooOo00<Integer> oooOo00 = this.mItemIdToViewHolder;
        if (oooOo00.f38802OooO0Oo) {
            oooOo00.OooO0o();
        }
        if (OooOOO.OooO0OO(oooOo00.f38804OooO0o0, oooOo00.f38805OooO0oO, j) >= 0) {
            return true;
        }
        Fragment fragment = (Fragment) this.mFragments.OooO0oO(j, null);
        return (fragment == null || (view = fragment.getView()) == null || view.getParent() == null) ? false : true;
    }

    private static boolean isValidKey(@NonNull String str, @NonNull String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long itemForViewHolder(int i) {
        Long lValueOf = null;
        for (int i2 = 0; i2 < this.mItemIdToViewHolder.OooOO0O(); i2++) {
            if (this.mItemIdToViewHolder.OooOO0o(i2).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.mItemIdToViewHolder.OooO0oo(i2));
            }
        }
        return lValueOf;
    }

    private static long parseIdFromKey(@NonNull String str, @NonNull String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void removeFragment(long j) {
        ViewParent parent;
        Fragment fragment = (Fragment) this.mFragments.OooO0oO(j, null);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j)) {
            this.mSavedStates.OooOO0(j);
        }
        if (!fragment.isAdded()) {
            this.mFragments.OooOO0(j);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
            return;
        }
        if (fragment.isAdded() && containsItem(j)) {
            this.mSavedStates.OooO(j, this.mFragmentManager.OoooOoO(fragment));
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        fragmentManager.getClass();
        OooO00o oooO00o = new OooO00o(fragmentManager);
        oooO00o.OooOOO0(fragment);
        oooO00o.OooO0oo();
        this.mFragments.OooOO0(j);
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
        this.mFragmentManager.OoooOO0(new FragmentManager.OooOo00() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.3
            @Override // androidx.fragment.app.FragmentManager.OooOo00
            public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment2, @NonNull View view, @Nullable Bundle bundle) {
                if (fragment2 == fragment) {
                    fragmentManager.OoooooO(this);
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
        OooOOO0 oooOOO0 = new OooOOO0();
        for (int i = 0; i < this.mFragments.OooOO0O(); i++) {
            long jOooO0oo = this.mFragments.OooO0oo(i);
            if (!containsItem(jOooO0oo)) {
                oooOOO0.add(Long.valueOf(jOooO0oo));
                this.mItemIdToViewHolder.OooOO0(jOooO0oo);
            }
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i2 = 0; i2 < this.mFragments.OooOO0O(); i2++) {
                long jOooO0oo2 = this.mFragments.OooO0oo(i2);
                if (!isFragmentViewBound(jOooO0oo2)) {
                    oooOOO0.add(Long.valueOf(jOooO0oo2));
                }
            }
        }
        OooOOO0.OooO00o oooO00o = new OooOOO0.OooO00o();
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
        o000OO.OooOOO0.OooO00o(this.mFragmentMaxLifecycleEnforcer == null);
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
        Fragment fragment = (Fragment) this.mFragments.OooO0oO(fragmentViewHolder.getItemId(), null);
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout container = fragmentViewHolder.getContainer();
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragment.isAdded() && view == null) {
            scheduleViewAttach(fragment, container);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != container) {
                addViewToContainer(view, container);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            addViewToContainer(view, container);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            if (this.mFragmentManager.f5836Oooo00o) {
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
                    WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                    if (ViewCompat.OooOO0O.OooO0O0(container2)) {
                        FragmentStateAdapter.this.placeFragmentInViewHolder(fragmentViewHolder);
                    }
                }
            });
            return;
        }
        scheduleViewAttach(fragment, container);
        FragmentManager fragmentManager = this.mFragmentManager;
        fragmentManager.getClass();
        OooO00o oooO00o = new OooO00o(fragmentManager);
        oooO00o.OooO0OO(0, fragment, "f" + fragmentViewHolder.getItemId(), 1);
        oooO00o.OooOOO(fragment, Lifecycle.State.STARTED);
        oooO00o.OooO0oo();
        this.mFragmentMaxLifecycleEnforcer.updateFragmentMaxLifecycle(false);
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(@NonNull Parcelable parcelable) {
        if (this.mSavedStates.OooOO0O() == 0) {
            if (this.mFragments.OooOO0O() == 0) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (isValidKey(str, KEY_PREFIX_FRAGMENT)) {
                        long idFromKey = parseIdFromKey(str, KEY_PREFIX_FRAGMENT);
                        FragmentManager fragmentManager = this.mFragmentManager;
                        fragmentManager.getClass();
                        String string = bundle.getString(str);
                        Fragment fragment = null;
                        if (string != null) {
                            Fragment fragmentOooOoOO = fragmentManager.OooOoOO(string);
                            if (fragmentOooOoOO == null) {
                                fragmentManager.Oooooo(new IllegalStateException(o00Ooo.OooO00o("Fragment no longer exists for key ", str, ": unique id ", string)));
                                throw null;
                            }
                            fragment = fragmentOooOoOO;
                        }
                        this.mFragments.OooO(idFromKey, fragment);
                    } else {
                        if (!isValidKey(str, KEY_PREFIX_STATE)) {
                            throw new IllegalArgumentException(o00O00OO.OooO00o("Unexpected key in savedState: ", str));
                        }
                        long idFromKey2 = parseIdFromKey(str, KEY_PREFIX_STATE);
                        Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                        if (containsItem(idFromKey2)) {
                            this.mSavedStates.OooO(idFromKey2, savedState);
                        }
                    }
                }
                if (this.mFragments.OooOO0O() == 0) {
                    return;
                }
                this.mHasStaleFragments = true;
                this.mIsInGracePeriod = true;
                gcFragments();
                scheduleGracePeriodEnd();
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    @NonNull
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mSavedStates.OooOO0O() + this.mFragments.OooOO0O());
        for (int i = 0; i < this.mFragments.OooOO0O(); i++) {
            long jOooO0oo = this.mFragments.OooO0oo(i);
            Fragment fragment = (Fragment) this.mFragments.OooO0oO(jOooO0oo, null);
            if (fragment != null && fragment.isAdded()) {
                this.mFragmentManager.OoooO(bundle, createKey(KEY_PREFIX_FRAGMENT, jOooO0oo), fragment);
            }
        }
        for (int i2 = 0; i2 < this.mSavedStates.OooOO0O(); i2++) {
            long jOooO0oo2 = this.mSavedStates.OooO0oo(i2);
            if (containsItem(jOooO0oo2)) {
                bundle.putParcelable(createKey(KEY_PREFIX_STATE, jOooO0oo2), (Parcelable) this.mSavedStates.OooO0oO(jOooO0oo2, null));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.Oooo0oO();
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
            this.mItemIdToViewHolder.OooOO0(lItemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.OooO(itemId, Integer.valueOf(id));
        ensureFragment(i);
        final FrameLayout container = fragmentViewHolder.getContainer();
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
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
            this.mItemIdToViewHolder.OooOO0(lItemForViewHolder.longValue());
        }
    }

    public FragmentStateAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        this.mFragments = new OooOo00<>();
        this.mSavedStates = new OooOo00<>();
        this.mItemIdToViewHolder = new OooOo00<>();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = fragmentManager;
        this.mLifecycle = lifecycle;
        super.setHasStableIds(true);
    }
}
