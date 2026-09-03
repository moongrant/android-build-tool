package com.chad.library.adapter.base;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.OooO00o;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.ULong;
import p244o00oo0O.o000000;
import p244o00oo0O.o000OOo;
import p244o00oo0O.o0O0O00;
import p244o00oo0O.o0OO00O;
import p244o00oo0O.oo0o0Oo;
import p247o00oo0Oo.o0000oo;
import p248o00oo0o.o000000O;
import p249o00oo0o0.o0O00O0o;
import p249o00oo0o0.o0OoO00O;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseQuickAdapter<T, K extends com.chad.library.adapter.base.OooO00o> extends RecyclerView.Adapter<K> {
    public static final int ALPHAIN = 1;
    public static final int EMPTY_VIEW = 1365;
    public static final int FOOTER_VIEW = 819;
    public static final int HEADER_VIEW = 273;
    public static final int LOADING_VIEW = 546;
    public static final int SCALEIN = 2;
    public static final int SLIDEIN_BOTTOM = 3;
    public static final int SLIDEIN_LEFT = 4;
    public static final int SLIDEIN_RIGHT = 5;
    public static final String TAG = "BaseQuickAdapter";
    private boolean footerViewAsFlow;
    private boolean headerViewAsFlow;
    public Context mContext;
    private oo0o0Oo mCustomAnimation;
    public List<T> mData;
    private int mDuration;
    private FrameLayout mEmptyLayout;
    private boolean mEnableLoadMoreEndClick;
    private boolean mFirstOnlyEnable;
    private boolean mFootAndEmptyEnable;
    private LinearLayout mFooterLayout;
    private boolean mHeadAndEmptyEnable;
    private LinearLayout mHeaderLayout;
    private Interpolator mInterpolator;
    private boolean mIsUseEmpty;
    private int mLastPosition;
    public LayoutInflater mLayoutInflater;
    public int mLayoutResId;
    private boolean mLoadMoreEnable;
    private o0OoO00O mLoadMoreView;
    private boolean mLoading;
    private o000000O<T> mMultiTypeDelegate;
    private boolean mNextLoadEnable;
    private OooOOO0 mOnItemChildClickListener;
    private OooOOO mOnItemChildLongClickListener;
    private OooOOOO mOnItemClickListener;
    private OooOo00 mOnItemLongClickListener;
    private boolean mOpenAnimationEnable;
    private int mPreLoadNumber;
    private RecyclerView mRecyclerView;
    private OooOo mRequestLoadMoreListener;
    private oo0o0Oo mSelectAnimation;
    private Oooo000 mSpanSizeLookup;
    private int mStartUpFetchPosition;
    private boolean mUpFetchEnable;
    private Oooo0 mUpFetchListener;
    private boolean mUpFetching;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AnimationType {
    }

    public class OooO implements View.OnClickListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ com.chad.library.adapter.base.OooO00o f12548Oooo0o;

        public OooO(com.chad.library.adapter.base.OooO00o oooO00o) {
            this.f12548Oooo0o = oooO00o;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseQuickAdapter.this.getOnItemClickListener().OooO0o(BaseQuickAdapter.this, view, this.f12548Oooo0o.getLayoutPosition() - BaseQuickAdapter.this.getHeaderLayoutCount());
        }
    }

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ LinearLayoutManager f12550Oooo0o;

        public OooO00o(LinearLayoutManager linearLayoutManager) {
            this.f12550Oooo0o = linearLayoutManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f12550Oooo0o.findLastCompletelyVisibleItemPosition() + 1 != BaseQuickAdapter.this.getItemCount()) {
                BaseQuickAdapter.this.setEnableLoadMore(true);
            }
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ StaggeredGridLayoutManager f12552Oooo0o;

        public OooO0O0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
            this.f12552Oooo0o = staggeredGridLayoutManager;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager staggeredGridLayoutManager = this.f12552Oooo0o;
            int[] iArr = new int[staggeredGridLayoutManager.f9078Oooo0o];
            for (int i = 0; i < staggeredGridLayoutManager.f9078Oooo0o; i++) {
                StaggeredGridLayoutManager.OooO0OO oooO0OO = staggeredGridLayoutManager.f9079Oooo0oO[i];
                iArr[i] = StaggeredGridLayoutManager.this.f9081OoooO ? oooO0OO.OooO0oO(0, oooO0OO.f9117OooO00o.size(), true, true, false) : oooO0OO.OooO0oO(oooO0OO.f9117OooO00o.size() - 1, -1, true, true, false);
            }
            if (BaseQuickAdapter.this.getTheBiggestNumber(iArr) + 1 != BaseQuickAdapter.this.getItemCount()) {
                BaseQuickAdapter.this.setEnableLoadMore(true);
            }
        }
    }

    public class OooO0OO implements View.OnClickListener {
        public OooO0OO() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (BaseQuickAdapter.this.mLoadMoreView.f34190OooO00o == 3) {
                BaseQuickAdapter.this.notifyLoadMoreToLoading();
            }
            if (BaseQuickAdapter.this.mEnableLoadMoreEndClick && BaseQuickAdapter.this.mLoadMoreView.f34190OooO00o == 4) {
                BaseQuickAdapter.this.notifyLoadMoreToLoading();
            }
        }
    }

    public class OooO0o extends GridLayoutManager.OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ GridLayoutManager f12555OooO0OO;

        public OooO0o(GridLayoutManager gridLayoutManager) {
            this.f12555OooO0OO = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.OooO0O0
        public final int OooO0OO(int i) {
            int itemViewType = BaseQuickAdapter.this.getItemViewType(i);
            if (itemViewType == 273 && BaseQuickAdapter.this.isHeaderViewAsFlow()) {
                return 1;
            }
            if (itemViewType == 819 && BaseQuickAdapter.this.isFooterViewAsFlow()) {
                return 1;
            }
            if (BaseQuickAdapter.this.mSpanSizeLookup != null) {
                return BaseQuickAdapter.this.isFixedViewType(itemViewType) ? this.f12555OooO0OO.f8828Oooo0oO : BaseQuickAdapter.this.mSpanSizeLookup.OooO00o(this.f12555OooO0OO, i - BaseQuickAdapter.this.getHeaderLayoutCount());
            }
            if (BaseQuickAdapter.this.isFixedViewType(itemViewType)) {
                return this.f12555OooO0OO.f8828Oooo0oO;
            }
            return 1;
        }
    }

    public class OooOO0 implements View.OnLongClickListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ com.chad.library.adapter.base.OooO00o f12557Oooo0o;

        public OooOO0(com.chad.library.adapter.base.OooO00o oooO00o) {
            this.f12557Oooo0o = oooO00o;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return BaseQuickAdapter.this.getOnItemLongClickListener().OooO0O0(BaseQuickAdapter.this, view, this.f12557Oooo0o.getLayoutPosition() - BaseQuickAdapter.this.getHeaderLayoutCount());
        }
    }

    public class OooOO0O implements Runnable {
        public OooOO0O() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseQuickAdapter.this.mRequestLoadMoreListener.OooO0Oo();
        }
    }

    public interface OooOOO {
        void OooO00o(View view, int i);
    }

    public interface OooOOO0 {
        void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i);
    }

    public interface OooOOOO {
        void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i);
    }

    public interface OooOo {
        void OooO0Oo();
    }

    public interface OooOo00 {
        boolean OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i);
    }

    public interface Oooo0 {
        void OooO00o();
    }

    public interface Oooo000 {
        int OooO00o(GridLayoutManager gridLayoutManager, int i);
    }

    public BaseQuickAdapter(@LayoutRes int i, @Nullable List<T> list) {
        this.mNextLoadEnable = false;
        this.mLoadMoreEnable = false;
        this.mLoading = false;
        this.mLoadMoreView = new o0O00O0o();
        this.mEnableLoadMoreEndClick = false;
        this.mFirstOnlyEnable = true;
        this.mOpenAnimationEnable = false;
        this.mInterpolator = new LinearInterpolator();
        this.mDuration = ShopVehicleListModel.VehicleTagType_Vip300;
        this.mLastPosition = -1;
        this.mSelectAnimation = new o0OO00O();
        this.mIsUseEmpty = true;
        this.mStartUpFetchPosition = 1;
        this.mPreLoadNumber = 1;
        this.mData = list == null ? new ArrayList<>() : list;
        if (i != 0) {
            this.mLayoutResId = i;
        }
    }

    private void addAnimation(RecyclerView.oo0o0Oo oo0o0oo) {
        if (this.mOpenAnimationEnable) {
            if (!this.mFirstOnlyEnable || oo0o0oo.getLayoutPosition() > this.mLastPosition) {
                oo0o0Oo oo0o0oo2 = this.mCustomAnimation;
                if (oo0o0oo2 == null) {
                    oo0o0oo2 = this.mSelectAnimation;
                }
                for (Animator animator : oo0o0oo2.OooO00o(oo0o0oo.itemView)) {
                    startAnim(animator, oo0o0oo.getLayoutPosition());
                }
                this.mLastPosition = oo0o0oo.getLayoutPosition();
            }
        }
    }

    private void autoLoadMore(int i) {
        if (getLoadMoreViewCount() != 0 && i >= getItemCount() - this.mPreLoadNumber) {
            o0OoO00O o0ooo00o2 = this.mLoadMoreView;
            if (o0ooo00o2.f34190OooO00o != 1) {
                return;
            }
            o0ooo00o2.OooO0o(2);
            if (this.mLoading) {
                return;
            }
            this.mLoading = true;
            if (getRecyclerView() != null) {
                getRecyclerView().post(new OooOO0O());
            } else {
                this.mRequestLoadMoreListener.OooO0Oo();
            }
        }
    }

    private void autoUpFetch(int i) {
        Oooo0 oooo0;
        if (!isUpFetchEnable() || isUpFetching() || i > this.mStartUpFetchPosition || (oooo0 = this.mUpFetchListener) == null) {
            return;
        }
        oooo0.OooO00o();
    }

    private void bindViewClickListener(com.chad.library.adapter.base.OooO00o oooO00o) {
        View view;
        if (oooO00o == null || (view = oooO00o.itemView) == null) {
            return;
        }
        if (getOnItemClickListener() != null) {
            view.setOnClickListener(new OooO(oooO00o));
        }
        if (getOnItemLongClickListener() != null) {
            view.setOnLongClickListener(new OooOO0(oooO00o));
        }
    }

    private void checkNotNull() {
        if (getRecyclerView() == null) {
            throw new RuntimeException("please bind recyclerView first!");
        }
    }

    private void compatibilityDataSizeChanged(int i) {
        List<T> list = this.mData;
        if ((list == null ? 0 : list.size()) == i) {
            notifyDataSetChanged();
        }
    }

    private K createGenericKInstance(Class cls, View view) {
        try {
            if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(View.class);
                declaredConstructor.setAccessible(true);
                return (K) declaredConstructor.newInstance(view);
            }
            Constructor<T> declaredConstructor2 = cls.getDeclaredConstructor(getClass(), View.class);
            declaredConstructor2.setAccessible(true);
            return (K) declaredConstructor2.newInstance(this, view);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private o0000oo getExpandableItem(int i) {
        T item = getItem(i);
        if (isExpandable(item)) {
            return (o0000oo) item;
        }
        return null;
    }

    private int getFooterViewPosition() {
        int i = 1;
        if (getEmptyViewCount() != 1) {
            return this.mData.size() + getHeaderLayoutCount();
        }
        if (this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0) {
            i = 2;
        }
        if (this.mFootAndEmptyEnable) {
            return i;
        }
        return -1;
    }

    private int getHeaderViewPosition() {
        return (getEmptyViewCount() != 1 || this.mHeadAndEmptyEnable) ? 0 : -1;
    }

    private Class getInstancedGenericKClass(Class cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return null;
        }
        for (Type type : ((ParameterizedType) genericSuperclass).getActualTypeArguments()) {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (com.chad.library.adapter.base.OooO00o.class.isAssignableFrom(cls2)) {
                    return cls2;
                }
            }
        }
        return null;
    }

    private int getItemPosition(T t) {
        List<T> list;
        if (t == null || (list = this.mData) == null || list.isEmpty()) {
            return -1;
        }
        return this.mData.indexOf(t);
    }

    private K getLoadingView(ViewGroup viewGroup) {
        K k = (K) createBaseViewHolder(getItemView(this.mLoadMoreView.OooO0O0(), viewGroup));
        k.itemView.setOnClickListener(new OooO0OO());
        return k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTheBiggestNumber(int[] iArr) {
        int i = -1;
        if (iArr != null && iArr.length != 0) {
            for (int i2 : iArr) {
                if (i2 > i) {
                    i = i2;
                }
            }
        }
        return i;
    }

    private boolean hasSubItems(o0000oo o0000ooVar) {
        List<T> listOooO0O0;
        return (o0000ooVar == null || (listOooO0O0 = o0000ooVar.OooO0O0()) == null || listOooO0O0.size() <= 0) ? false : true;
    }

    private void openLoadMore(OooOo oooOo) {
        this.mRequestLoadMoreListener = oooOo;
        this.mNextLoadEnable = true;
        this.mLoadMoreEnable = true;
        this.mLoading = false;
    }

    private int recursiveCollapse(@IntRange(from = ULong.MIN_VALUE) int i) {
        T item = getItem(i);
        int iRecursiveCollapse = 0;
        if (!isExpandable(item)) {
            return 0;
        }
        o0000oo o0000ooVar = (o0000oo) item;
        if (o0000ooVar.OooO00o()) {
            List<T> listOooO0O0 = o0000ooVar.OooO0O0();
            for (int size = listOooO0O0.size() - 1; size >= 0; size--) {
                T t = listOooO0O0.get(size);
                int itemPosition = getItemPosition(t);
                if (itemPosition >= 0) {
                    if (t instanceof o0000oo) {
                        iRecursiveCollapse += recursiveCollapse(itemPosition);
                    }
                    this.mData.remove(itemPosition);
                    iRecursiveCollapse++;
                }
            }
        }
        return iRecursiveCollapse;
    }

    private int recursiveExpand(int i, @NonNull List list) {
        int size = (list.size() + i) - 1;
        int size2 = list.size() - 1;
        int iRecursiveExpand = 0;
        while (size2 >= 0) {
            if (list.get(size2) instanceof o0000oo) {
                o0000oo o0000ooVar = (o0000oo) list.get(size2);
                if (o0000ooVar.OooO00o() && hasSubItems(o0000ooVar)) {
                    List<T> listOooO0O0 = o0000ooVar.OooO0O0();
                    int i2 = size + 1;
                    this.mData.addAll(i2, listOooO0O0);
                    iRecursiveExpand += recursiveExpand(i2, listOooO0O0);
                }
            }
            size2--;
            size--;
        }
        return iRecursiveExpand;
    }

    private void setRecyclerView(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
    }

    @Deprecated
    public void add(@IntRange(from = ULong.MIN_VALUE) int i, @NonNull T t) {
        addData(i, t);
    }

    public void addData(@IntRange(from = ULong.MIN_VALUE) int i, @NonNull T t) {
        this.mData.add(i, t);
        notifyItemInserted(getHeaderLayoutCount() + i);
        compatibilityDataSizeChanged(1);
    }

    public int addFooterView(View view) {
        return addFooterView(view, -1, 1);
    }

    public int addHeaderView(View view) {
        return addHeaderView(view, -1);
    }

    public void bindToRecyclerView(RecyclerView recyclerView) {
        if (getRecyclerView() != null) {
            throw new RuntimeException("Don't bind twice");
        }
        setRecyclerView(recyclerView);
        getRecyclerView().setAdapter(this);
    }

    public int collapse(@IntRange(from = ULong.MIN_VALUE) int i, boolean z, boolean z2) {
        int headerLayoutCount = i - getHeaderLayoutCount();
        o0000oo expandableItem = getExpandableItem(headerLayoutCount);
        if (expandableItem == null) {
            return 0;
        }
        int iRecursiveCollapse = recursiveCollapse(headerLayoutCount);
        expandableItem.OooO0OO();
        int headerLayoutCount2 = getHeaderLayoutCount() + headerLayoutCount;
        if (z2) {
            if (z) {
                notifyItemChanged(headerLayoutCount2);
                notifyItemRangeRemoved(headerLayoutCount2 + 1, iRecursiveCollapse);
            } else {
                notifyDataSetChanged();
            }
        }
        return iRecursiveCollapse;
    }

    public abstract void convert(K k, T t);

    public K createBaseViewHolder(ViewGroup viewGroup, int i) {
        return (K) createBaseViewHolder(getItemView(i, viewGroup));
    }

    public void disableLoadMoreIfNotFullPage() {
        checkNotNull();
        disableLoadMoreIfNotFullPage(getRecyclerView());
    }

    public void enableLoadMoreEndClick(boolean z) {
        this.mEnableLoadMoreEndClick = z;
    }

    public int expand(@IntRange(from = ULong.MIN_VALUE) int i, boolean z, boolean z2) {
        int headerLayoutCount = i - getHeaderLayoutCount();
        o0000oo expandableItem = getExpandableItem(headerLayoutCount);
        int size = 0;
        if (expandableItem == null) {
            return 0;
        }
        if (!hasSubItems(expandableItem)) {
            expandableItem.OooO0OO();
            return 0;
        }
        if (!expandableItem.OooO00o()) {
            List<T> listOooO0O0 = expandableItem.OooO0O0();
            int i2 = headerLayoutCount + 1;
            this.mData.addAll(i2, listOooO0O0);
            int iRecursiveExpand = recursiveExpand(i2, listOooO0O0) + 0;
            expandableItem.OooO0OO();
            size = listOooO0O0.size() + iRecursiveExpand;
        }
        int headerLayoutCount2 = getHeaderLayoutCount() + headerLayoutCount;
        if (z2) {
            if (z) {
                notifyItemChanged(headerLayoutCount2);
                notifyItemRangeInserted(headerLayoutCount2 + 1, size);
            } else {
                notifyDataSetChanged();
            }
        }
        return size;
    }

    public int expandAll(int i, boolean z, boolean z2) {
        T item;
        int headerLayoutCount = i - getHeaderLayoutCount();
        int i2 = headerLayoutCount + 1;
        T item2 = i2 < this.mData.size() ? getItem(i2) : null;
        o0000oo expandableItem = getExpandableItem(headerLayoutCount);
        if (expandableItem == null || !hasSubItems(expandableItem)) {
            return 0;
        }
        int iExpand = expand(getHeaderLayoutCount() + headerLayoutCount, false, false);
        while (i2 < this.mData.size() && (item = getItem(i2)) != item2) {
            if (isExpandable(item)) {
                iExpand = expand(getHeaderLayoutCount() + i2, false, false) + iExpand;
            }
            i2++;
        }
        if (z2) {
            if (z) {
                notifyItemRangeInserted(getHeaderLayoutCount() + headerLayoutCount + 1, iExpand);
            } else {
                notifyDataSetChanged();
            }
        }
        return iExpand;
    }

    @NonNull
    public List<T> getData() {
        return this.mData;
    }

    public int getDefItemViewType(int i) {
        o000000O<T> o000000o2 = this.mMultiTypeDelegate;
        if (o000000o2 == null) {
            return super.getItemViewType(i);
        }
        List<T> list = this.mData;
        Objects.requireNonNull(o000000o2);
        T t = list.get(i);
        if (t != null) {
            return o000000o2.OooO00o(t);
        }
        return -255;
    }

    public View getEmptyView() {
        return this.mEmptyLayout;
    }

    public int getEmptyViewCount() {
        FrameLayout frameLayout = this.mEmptyLayout;
        return (frameLayout == null || frameLayout.getChildCount() == 0 || !this.mIsUseEmpty || this.mData.size() != 0) ? 0 : 1;
    }

    public LinearLayout getFooterLayout() {
        return this.mFooterLayout;
    }

    public int getFooterLayoutCount() {
        LinearLayout linearLayout = this.mFooterLayout;
        return (linearLayout == null || linearLayout.getChildCount() == 0) ? 0 : 1;
    }

    @Deprecated
    public int getFooterViewsCount() {
        return getFooterLayoutCount();
    }

    public LinearLayout getHeaderLayout() {
        return this.mHeaderLayout;
    }

    public int getHeaderLayoutCount() {
        LinearLayout linearLayout = this.mHeaderLayout;
        return (linearLayout == null || linearLayout.getChildCount() == 0) ? 0 : 1;
    }

    @Deprecated
    public int getHeaderViewsCount() {
        return getHeaderLayoutCount();
    }

    @Nullable
    public T getItem(@IntRange(from = ULong.MIN_VALUE) int i) {
        if (i < this.mData.size()) {
            return this.mData.get(i);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = 1;
        if (getEmptyViewCount() != 1) {
            return getLoadMoreViewCount() + getFooterLayoutCount() + this.mData.size() + getHeaderLayoutCount();
        }
        if (this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0) {
            i = 2;
        }
        return (!this.mFootAndEmptyEnable || getFooterLayoutCount() == 0) ? i : i + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public View getItemView(@LayoutRes int i, ViewGroup viewGroup) {
        return this.mLayoutInflater.inflate(i, viewGroup, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (getEmptyViewCount() == 1) {
            boolean z = this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0;
            if (i != 0) {
                if (i != 1) {
                    return i != 2 ? EMPTY_VIEW : FOOTER_VIEW;
                }
                return z ? EMPTY_VIEW : FOOTER_VIEW;
            }
            if (z) {
                return 273;
            }
            return EMPTY_VIEW;
        }
        int headerLayoutCount = getHeaderLayoutCount();
        if (i < headerLayoutCount) {
            return 273;
        }
        int i2 = i - headerLayoutCount;
        int size = this.mData.size();
        if (i2 < size) {
            return getDefItemViewType(i2);
        }
        return i2 - size < getFooterLayoutCount() ? FOOTER_VIEW : LOADING_VIEW;
    }

    public int getLoadMoreViewCount() {
        if (this.mRequestLoadMoreListener == null || !this.mLoadMoreEnable) {
            return 0;
        }
        if (!this.mNextLoadEnable) {
            o0OoO00O o0ooo00o2 = this.mLoadMoreView;
            if (o0ooo00o2.OooO0OO() == 0 ? true : o0ooo00o2.f34191OooO0O0) {
                return 0;
            }
        }
        return this.mData.size() == 0 ? 0 : 1;
    }

    public int getLoadMoreViewPosition() {
        return getFooterLayoutCount() + this.mData.size() + getHeaderLayoutCount();
    }

    public o000000O<T> getMultiTypeDelegate() {
        return this.mMultiTypeDelegate;
    }

    @Nullable
    public final OooOOO0 getOnItemChildClickListener() {
        return this.mOnItemChildClickListener;
    }

    @Nullable
    public final OooOOO getOnItemChildLongClickListener() {
        return this.mOnItemChildLongClickListener;
    }

    public final OooOOOO getOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    public final OooOo00 getOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }

    public int getParentPosition(@NonNull T t) {
        int itemPosition = getItemPosition(t);
        if (itemPosition == -1) {
            return -1;
        }
        int level = t instanceof o0000oo ? ((o0000oo) t).getLevel() : Integer.MAX_VALUE;
        if (level == 0) {
            return itemPosition;
        }
        if (level == -1) {
            return -1;
        }
        while (itemPosition >= 0) {
            T t2 = this.mData.get(itemPosition);
            if (t2 instanceof o0000oo) {
                o0000oo o0000ooVar = (o0000oo) t2;
                if (o0000ooVar.getLevel() >= 0 && o0000ooVar.getLevel() < level) {
                    return itemPosition;
                }
            }
            itemPosition--;
        }
        return -1;
    }

    public RecyclerView getRecyclerView() {
        return this.mRecyclerView;
    }

    @Nullable
    public View getViewByPosition(int i, @IdRes int i2) {
        checkNotNull();
        return getViewByPosition(getRecyclerView(), i, i2);
    }

    public boolean isExpandable(T t) {
        return t != null && (t instanceof o0000oo);
    }

    public void isFirstOnly(boolean z) {
        this.mFirstOnlyEnable = z;
    }

    public boolean isFixedViewType(int i) {
        return i == 1365 || i == 273 || i == 819 || i == 546;
    }

    public boolean isFooterViewAsFlow() {
        return this.footerViewAsFlow;
    }

    public boolean isHeaderViewAsFlow() {
        return this.headerViewAsFlow;
    }

    public boolean isLoadMoreEnable() {
        return this.mLoadMoreEnable;
    }

    public boolean isLoading() {
        return this.mLoading;
    }

    public boolean isUpFetchEnable() {
        return this.mUpFetchEnable;
    }

    public boolean isUpFetching() {
        return this.mUpFetching;
    }

    public void isUseEmpty(boolean z) {
        this.mIsUseEmpty = z;
    }

    public void loadMoreComplete() {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.mLoading = false;
        this.mNextLoadEnable = true;
        this.mLoadMoreView.OooO0o(1);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    public void loadMoreEnd() {
        loadMoreEnd(false);
    }

    public void loadMoreFail() {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.mLoading = false;
        this.mLoadMoreView.OooO0o(3);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    public void notifyLoadMoreToLoading() {
        o0OoO00O o0ooo00o2 = this.mLoadMoreView;
        if (o0ooo00o2.f34190OooO00o == 2) {
            return;
        }
        o0ooo00o2.OooO0o(1);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.Oooo000 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f8833OoooO0O = new OooO0o(gridLayoutManager);
        }
    }

    public K onCreateDefViewHolder(ViewGroup viewGroup, int i) {
        int i2 = this.mLayoutResId;
        o000000O<T> o000000o2 = this.mMultiTypeDelegate;
        if (o000000o2 != null) {
            i2 = o000000o2.f34189OooO00o.get(i, -404);
        }
        return (K) createBaseViewHolder(viewGroup, i2);
    }

    public void openLoadAnimation(int i) {
        this.mOpenAnimationEnable = true;
        this.mCustomAnimation = null;
        if (i == 1) {
            this.mSelectAnimation = new o0OO00O();
            return;
        }
        if (i == 2) {
            this.mSelectAnimation = new o0O0O00();
            return;
        }
        if (i == 3) {
            this.mSelectAnimation = new o000OOo();
        } else if (i == 4) {
            this.mSelectAnimation = new p139o00OOOo0.Oooo000();
        } else {
            if (i != 5) {
                return;
            }
            this.mSelectAnimation = new o000000();
        }
    }

    public void remove(@IntRange(from = ULong.MIN_VALUE) int i) {
        this.mData.remove(i);
        int headerLayoutCount = getHeaderLayoutCount() + i;
        notifyItemRemoved(headerLayoutCount);
        compatibilityDataSizeChanged(0);
        notifyItemRangeChanged(headerLayoutCount, this.mData.size() - headerLayoutCount);
    }

    public void removeAllFooterView() {
        if (getFooterLayoutCount() == 0) {
            return;
        }
        this.mFooterLayout.removeAllViews();
        int footerViewPosition = getFooterViewPosition();
        if (footerViewPosition != -1) {
            notifyItemRemoved(footerViewPosition);
        }
    }

    public void removeAllHeaderView() {
        if (getHeaderLayoutCount() == 0) {
            return;
        }
        this.mHeaderLayout.removeAllViews();
        int headerViewPosition = getHeaderViewPosition();
        if (headerViewPosition != -1) {
            notifyItemRemoved(headerViewPosition);
        }
    }

    public void removeFooterView(View view) {
        int footerViewPosition;
        if (getFooterLayoutCount() == 0) {
            return;
        }
        this.mFooterLayout.removeView(view);
        if (this.mFooterLayout.getChildCount() != 0 || (footerViewPosition = getFooterViewPosition()) == -1) {
            return;
        }
        notifyItemRemoved(footerViewPosition);
    }

    public void removeHeaderView(View view) {
        int headerViewPosition;
        if (getHeaderLayoutCount() == 0) {
            return;
        }
        this.mHeaderLayout.removeView(view);
        if (this.mHeaderLayout.getChildCount() != 0 || (headerViewPosition = getHeaderViewPosition()) == -1) {
            return;
        }
        notifyItemRemoved(headerViewPosition);
    }

    public void replaceData(@NonNull Collection<? extends T> collection) {
        List<T> list = this.mData;
        if (collection != list) {
            list.clear();
            this.mData.addAll(collection);
        }
        notifyDataSetChanged();
    }

    @Deprecated
    public void setAutoLoadMoreSize(int i) {
        setPreLoadNumber(i);
    }

    public void setData(@IntRange(from = ULong.MIN_VALUE) int i, @NonNull T t) {
        this.mData.set(i, t);
        notifyItemChanged(getHeaderLayoutCount() + i);
    }

    public void setDuration(int i) {
        this.mDuration = i;
    }

    public void setEmptyView(int i, ViewGroup viewGroup) {
        setEmptyView(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    public void setEnableLoadMore(boolean z) {
        int loadMoreViewCount = getLoadMoreViewCount();
        this.mLoadMoreEnable = z;
        int loadMoreViewCount2 = getLoadMoreViewCount();
        if (loadMoreViewCount == 1) {
            if (loadMoreViewCount2 == 0) {
                notifyItemRemoved(getLoadMoreViewPosition());
            }
        } else if (loadMoreViewCount2 == 1) {
            this.mLoadMoreView.OooO0o(1);
            notifyItemInserted(getLoadMoreViewPosition());
        }
    }

    public int setFooterView(View view) {
        return setFooterView(view, 0, 1);
    }

    public void setFooterViewAsFlow(boolean z) {
        this.footerViewAsFlow = z;
    }

    public void setFullSpan(RecyclerView.oo0o0Oo oo0o0oo) {
        if (oo0o0oo.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) oo0o0oo.itemView.getLayoutParams()).f9101OoooO0 = true;
        }
    }

    public void setHeaderAndEmpty(boolean z) {
        setHeaderFooterEmpty(z, false);
    }

    public void setHeaderFooterEmpty(boolean z, boolean z2) {
        this.mHeadAndEmptyEnable = z;
        this.mFootAndEmptyEnable = z2;
    }

    public int setHeaderView(View view) {
        return setHeaderView(view, 0, 1);
    }

    public void setHeaderViewAsFlow(boolean z) {
        this.headerViewAsFlow = z;
    }

    public void setLoadMoreView(o0OoO00O o0ooo00o2) {
        this.mLoadMoreView = o0ooo00o2;
    }

    public void setMultiTypeDelegate(o000000O<T> o000000o2) {
        this.mMultiTypeDelegate = o000000o2;
    }

    public void setNewData(@Nullable List<T> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.mData = list;
        if (this.mRequestLoadMoreListener != null) {
            this.mNextLoadEnable = true;
            this.mLoadMoreEnable = true;
            this.mLoading = false;
            this.mLoadMoreView.OooO0o(1);
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
    }

    public void setNotDoAnimationCount(int i) {
        this.mLastPosition = i;
    }

    public void setOnItemChildClickListener(OooOOO0 oooOOO0) {
        this.mOnItemChildClickListener = oooOOO0;
    }

    public void setOnItemChildLongClickListener(OooOOO oooOOO) {
        this.mOnItemChildLongClickListener = oooOOO;
    }

    public void setOnItemClickListener(@Nullable OooOOOO oooOOOO) {
        this.mOnItemClickListener = oooOOOO;
    }

    public void setOnItemLongClickListener(OooOo00 oooOo00) {
        this.mOnItemLongClickListener = oooOo00;
    }

    @Deprecated
    public void setOnLoadMoreListener(OooOo oooOo) {
        openLoadMore(oooOo);
    }

    public void setPreLoadNumber(int i) {
        if (i > 1) {
            this.mPreLoadNumber = i;
        }
    }

    public void setSpanSizeLookup(Oooo000 oooo000) {
        this.mSpanSizeLookup = oooo000;
    }

    public void setStartUpFetchPosition(int i) {
        this.mStartUpFetchPosition = i;
    }

    public void setUpFetchEnable(boolean z) {
        this.mUpFetchEnable = z;
    }

    public void setUpFetchListener(Oooo0 oooo0) {
        this.mUpFetchListener = oooo0;
    }

    public void setUpFetching(boolean z) {
        this.mUpFetching = z;
    }

    public void startAnim(Animator animator, int i) {
        animator.setDuration(this.mDuration).start();
        animator.setInterpolator(this.mInterpolator);
    }

    public int addFooterView(View view, int i) {
        return addFooterView(view, i, 1);
    }

    public int addHeaderView(View view, int i) {
        return addHeaderView(view, i, 1);
    }

    public K createBaseViewHolder(View view) {
        Class instancedGenericKClass = null;
        for (Class<?> superclass = getClass(); instancedGenericKClass == null && superclass != null; superclass = superclass.getSuperclass()) {
            instancedGenericKClass = getInstancedGenericKClass(superclass);
        }
        K k = instancedGenericKClass == null ? (K) new com.chad.library.adapter.base.OooO00o(view) : (K) createGenericKInstance(instancedGenericKClass, view);
        return k != null ? k : (K) new com.chad.library.adapter.base.OooO00o(view);
    }

    public void loadMoreEnd(boolean z) {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.mLoading = false;
        this.mNextLoadEnable = false;
        o0OoO00O o0ooo00o2 = this.mLoadMoreView;
        o0ooo00o2.f34191OooO0O0 = z;
        if (z) {
            notifyItemRemoved(getLoadMoreViewPosition());
        } else {
            o0ooo00o2.OooO0o(4);
            notifyItemChanged(getLoadMoreViewPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(K k, int i) {
        autoUpFetch(i);
        autoLoadMore(i);
        int itemViewType = k.getItemViewType();
        if (itemViewType == 0) {
            convert(k, getItem(i - getHeaderLayoutCount()));
            return;
        }
        if (itemViewType != 273) {
            if (itemViewType == 546) {
                this.mLoadMoreView.OooO00o(k);
            } else {
                if (itemViewType == 819 || itemViewType == 1365) {
                    return;
                }
                convert(k, getItem(i - getHeaderLayoutCount()));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public K onCreateViewHolder(ViewGroup viewGroup, int i) {
        K k;
        Context context = viewGroup.getContext();
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
        if (i == 273) {
            k = (K) createBaseViewHolder(this.mHeaderLayout);
        } else if (i == 546) {
            k = (K) getLoadingView(viewGroup);
        } else if (i == 819) {
            k = (K) createBaseViewHolder(this.mFooterLayout);
        } else if (i != 1365) {
            k = (K) onCreateDefViewHolder(viewGroup, i);
            bindViewClickListener(k);
        } else {
            k = (K) createBaseViewHolder(this.mEmptyLayout);
        }
        k.f12563OooO0Oo = this;
        return k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(K k) {
        super.onViewAttachedToWindow(k);
        int itemViewType = k.getItemViewType();
        if (itemViewType == 1365 || itemViewType == 273 || itemViewType == 819 || itemViewType == 546) {
            setFullSpan(k);
        } else {
            addAnimation(k);
        }
    }

    public int setFooterView(View view, int i) {
        return setFooterView(view, i, 1);
    }

    public int setHeaderView(View view, int i) {
        return setHeaderView(view, i, 1);
    }

    public void setOnLoadMoreListener(OooOo oooOo, RecyclerView recyclerView) {
        openLoadMore(oooOo);
        if (getRecyclerView() == null) {
            setRecyclerView(recyclerView);
        }
    }

    public int addFooterView(View view, int i, int i2) {
        int footerViewPosition;
        if (this.mFooterLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mFooterLayout = linearLayout;
            if (i2 == 1) {
                linearLayout.setOrientation(1);
                this.mFooterLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                linearLayout.setOrientation(0);
                this.mFooterLayout.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
            }
        }
        int childCount = this.mFooterLayout.getChildCount();
        if (i < 0 || i > childCount) {
            i = childCount;
        }
        this.mFooterLayout.addView(view, i);
        if (this.mFooterLayout.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
            notifyItemInserted(footerViewPosition);
        }
        return i;
    }

    public int addHeaderView(View view, int i, int i2) {
        int headerViewPosition;
        if (this.mHeaderLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mHeaderLayout = linearLayout;
            if (i2 == 1) {
                linearLayout.setOrientation(1);
                this.mHeaderLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                linearLayout.setOrientation(0);
                this.mHeaderLayout.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
            }
        }
        int childCount = this.mHeaderLayout.getChildCount();
        if (i < 0 || i > childCount) {
            i = childCount;
        }
        this.mHeaderLayout.addView(view, i);
        if (this.mHeaderLayout.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
            notifyItemInserted(headerViewPosition);
        }
        return i;
    }

    public void disableLoadMoreIfNotFullPage(RecyclerView recyclerView) {
        RecyclerView.Oooo000 layoutManager;
        setEnableLoadMore(false);
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            recyclerView.postDelayed(new OooO00o((LinearLayoutManager) layoutManager), 50L);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            recyclerView.postDelayed(new OooO0O0((StaggeredGridLayoutManager) layoutManager), 50L);
        }
    }

    @Nullable
    public View getViewByPosition(RecyclerView recyclerView, int i, @IdRes int i2) {
        com.chad.library.adapter.base.OooO00o oooO00o;
        if (recyclerView == null || (oooO00o = (com.chad.library.adapter.base.OooO00o) recyclerView.findViewHolderForLayoutPosition(i)) == null) {
            return null;
        }
        return oooO00o.OooO0Oo(i2);
    }

    public void setEmptyView(int i) {
        checkNotNull();
        setEmptyView(i, getRecyclerView());
    }

    public int setFooterView(View view, int i, int i2) {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout != null && linearLayout.getChildCount() > i) {
            this.mFooterLayout.removeViewAt(i);
            this.mFooterLayout.addView(view, i);
            return i;
        }
        return addFooterView(view, i, i2);
    }

    public int setHeaderView(View view, int i, int i2) {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout != null && linearLayout.getChildCount() > i) {
            this.mHeaderLayout.removeViewAt(i);
            this.mHeaderLayout.addView(view, i);
            return i;
        }
        return addHeaderView(view, i, i2);
    }

    public void addData(@NonNull T t) {
        this.mData.add(t);
        notifyItemInserted(getHeaderLayoutCount() + this.mData.size());
        compatibilityDataSizeChanged(1);
    }

    public void setEmptyView(View view) {
        boolean z;
        int i = 0;
        if (this.mEmptyLayout == null) {
            this.mEmptyLayout = new FrameLayout(view.getContext());
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = layoutParams2.width;
                ((ViewGroup.MarginLayoutParams) layoutParams).height = layoutParams2.height;
            }
            this.mEmptyLayout.setLayoutParams(layoutParams);
            z = true;
        } else {
            z = false;
        }
        this.mEmptyLayout.removeAllViews();
        this.mEmptyLayout.addView(view);
        this.mIsUseEmpty = true;
        if (z && getEmptyViewCount() == 1) {
            if (this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0) {
                i = 1;
            }
            notifyItemInserted(i);
        }
    }

    public void addData(@IntRange(from = ULong.MIN_VALUE) int i, @NonNull Collection<? extends T> collection) {
        this.mData.addAll(i, collection);
        notifyItemRangeInserted(getHeaderLayoutCount() + i, collection.size());
        compatibilityDataSizeChanged(collection.size());
    }

    public void openLoadAnimation(oo0o0Oo oo0o0oo) {
        this.mOpenAnimationEnable = true;
        this.mCustomAnimation = oo0o0oo;
    }

    public int collapse(@IntRange(from = ULong.MIN_VALUE) int i) {
        return collapse(i, true, true);
    }

    public void addData(@NonNull Collection<? extends T> collection) {
        this.mData.addAll(collection);
        notifyItemRangeInserted(getHeaderLayoutCount() + (this.mData.size() - collection.size()), collection.size());
        compatibilityDataSizeChanged(collection.size());
    }

    public int collapse(@IntRange(from = ULong.MIN_VALUE) int i, boolean z) {
        return collapse(i, z, true);
    }

    public void openLoadAnimation() {
        this.mOpenAnimationEnable = true;
    }

    public int expandAll(int i, boolean z) {
        return expandAll(i, true, !z);
    }

    public void expandAll() {
        for (int headerLayoutCount = getHeaderLayoutCount() + (this.mData.size() - 1); headerLayoutCount >= getHeaderLayoutCount(); headerLayoutCount--) {
            expandAll(headerLayoutCount, false, false);
        }
    }

    public int expand(@IntRange(from = ULong.MIN_VALUE) int i, boolean z) {
        return expand(i, z, true);
    }

    public int expand(@IntRange(from = ULong.MIN_VALUE) int i) {
        return expand(i, true, true);
    }

    public BaseQuickAdapter(@Nullable List<T> list) {
        this(0, list);
    }

    public BaseQuickAdapter(@LayoutRes int i) {
        this(i, null);
    }
}
