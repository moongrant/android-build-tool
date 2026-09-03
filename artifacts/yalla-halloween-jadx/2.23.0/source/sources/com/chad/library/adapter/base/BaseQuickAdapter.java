package com.chad.library.adapter.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.BaseViewHolder;
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
import kotlin.ULong;
import p670oOooo0o.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseQuickAdapter<T, K extends BaseViewHolder> extends RecyclerView.Adapter<K> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO0OO f10093OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f10094OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f10095OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f10096OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00OOOOo.OooO00o f10097OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO0o f10098OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooOO0 f10099OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooO f10100OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO0O0 f10101OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public LinearLayout f10102OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public LinearLayout f10103OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public FrameLayout f10104OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f10105OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f10106OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f10107OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Context f10108OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public LayoutInflater f10109OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final int f10110OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public List<T> f10111OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public OooOO0O f10112OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public RecyclerView f10113OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o0000Ooo<T> f10114OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f10115OooOo0o;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AnimationType {
    }

    public interface OooO {
        boolean OooO00o(BaseQuickAdapter baseQuickAdapter, View view, int i);
    }

    public class OooO00o extends GridLayoutManager.OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ GridLayoutManager f10116OooO0OO;

        public OooO00o(GridLayoutManager gridLayoutManager) {
            this.f10116OooO0OO = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.OooO0O0
        public final int OooO0OO(int i) {
            BaseQuickAdapter baseQuickAdapter = BaseQuickAdapter.this;
            int itemViewType = baseQuickAdapter.getItemViewType(i);
            OooOO0O oooOO0O = baseQuickAdapter.f10112OooOo0;
            GridLayoutManager gridLayoutManager = this.f10116OooO0OO;
            if (oooOO0O != null) {
                return itemViewType == 1365 || itemViewType == 273 || itemViewType == 819 || itemViewType == 546 ? gridLayoutManager.f7447OooO0o0 : oooOO0O.OooO00o(gridLayoutManager, i - baseQuickAdapter.OooOOO0());
            }
            if (itemViewType == 1365 || itemViewType == 273 || itemViewType == 819 || itemViewType == 546) {
                return gridLayoutManager.f7447OooO0o0;
            }
            return 1;
        }
    }

    public interface OooO0O0 {
        void OooO0OO(BaseQuickAdapter baseQuickAdapter, View view, int i);
    }

    public interface OooO0OO {
        void OooO0O0(View view, int i);
    }

    public interface OooO0o {
        void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i);
    }

    public interface OooOO0 {
        void OooO00o();
    }

    public interface OooOO0O {
        int OooO00o(GridLayoutManager gridLayoutManager, int i);
    }

    public BaseQuickAdapter() {
        throw null;
    }

    public BaseQuickAdapter(@LayoutRes int i, @Nullable List<T> list) {
        this.f10094OooO00o = false;
        this.f10095OooO0O0 = false;
        this.f10096OooO0OO = false;
        this.f10097OooO0Oo = new o00OOOOo.OooO0O0();
        new LinearInterpolator();
        this.f10106OooOOO0 = true;
        this.f10115OooOo0o = 1;
        this.f10111OooOOoo = list == null ? new ArrayList<>() : list;
        if (i != 0) {
            this.f10110OooOOo0 = i;
        }
    }

    public int OooO(int i) {
        o0000Ooo<T> o0000ooo = this.f10114OooOo0O;
        if (o0000ooo == null) {
            return super.getItemViewType(i);
        }
        List<T> list = this.f10111OooOOoo;
        o0000ooo.getClass();
        T t = list.get(i);
        if (t != null) {
            return o0000ooo.OooO00o(t);
        }
        return -255;
    }

    public final void OooO00o(@NonNull Object obj) {
        this.f10111OooOOoo.add(0, obj);
        notifyItemInserted(OooOOO0() + 0);
        OooO0o(1);
    }

    public final void OooO0O0(@NonNull Collection<? extends T> collection) {
        this.f10111OooOOoo.addAll(collection);
        notifyItemRangeInserted(OooOOO0() + (this.f10111OooOOoo.size() - collection.size()), collection.size());
        OooO0o(collection.size());
    }

    public final void OooO0OO(@NonNull T t) {
        this.f10111OooOOoo.add(t);
        notifyItemInserted(OooOOO0() + this.f10111OooOOoo.size());
        OooO0o(1);
    }

    public final int OooO0Oo(View view, int i) {
        int iOooOO0o;
        if (this.f10103OooOO0O == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.f10103OooOO0O = linearLayout;
            linearLayout.setOrientation(1);
            this.f10103OooOO0O.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        }
        int childCount = this.f10103OooOO0O.getChildCount();
        if (i < 0 || i > childCount) {
            i = childCount;
        }
        this.f10103OooOO0O.addView(view, i);
        if (this.f10103OooOO0O.getChildCount() == 1 && (iOooOO0o = OooOO0o()) != -1) {
            notifyItemInserted(iOooOO0o);
        }
        return i;
    }

    public final void OooO0o(int i) {
        List<T> list = this.f10111OooOOoo;
        if ((list == null ? 0 : list.size()) == i) {
            notifyDataSetChanged();
        }
    }

    public final int OooO0o0(View view, int i) {
        if (this.f10102OooOO0 == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.f10102OooOO0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f10102OooOO0.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        }
        int childCount = this.f10102OooOO0.getChildCount();
        if (i < 0 || i > childCount) {
            i = childCount;
        }
        this.f10102OooOO0.addView(view, i);
        if (this.f10102OooOO0.getChildCount() == 1) {
            int i2 = 0;
            if (OooOO0() == 1 && !this.f10105OooOOO) {
                i2 = -1;
            }
            if (i2 != -1) {
                notifyItemInserted(i2);
            }
        }
        return i;
    }

    public abstract void OooO0oO(K k, T t);

    public K OooO0oo(View view) {
        K k;
        BaseViewHolder baseViewHolder;
        Class<?> superclass = getClass();
        BaseViewHolder baseViewHolder2 = null;
        Class cls = null;
        while (true) {
            int i = 0;
            if (cls != null || superclass == null) {
                break;
            }
            Type genericSuperclass = superclass.getGenericSuperclass();
            if (!(genericSuperclass instanceof ParameterizedType)) {
                cls = null;
                break;
                break;
            }
            Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (true) {
                if (i >= length) {
                    cls = null;
                    break;
                }
                Type type = actualTypeArguments[i];
                if (type instanceof Class) {
                    Class cls2 = (Class) type;
                    if (BaseViewHolder.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                }
                i++;
            }
            superclass = superclass.getSuperclass();
        }
        if (cls == null) {
            k = (K) new BaseViewHolder(view);
        } else {
            try {
                if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
                    Constructor<T> declaredConstructor = cls.getDeclaredConstructor(View.class);
                    declaredConstructor.setAccessible(true);
                    baseViewHolder = (BaseViewHolder) declaredConstructor.newInstance(view);
                } else {
                    Constructor<T> declaredConstructor2 = cls.getDeclaredConstructor(getClass(), View.class);
                    declaredConstructor2.setAccessible(true);
                    baseViewHolder = (BaseViewHolder) declaredConstructor2.newInstance(this, view);
                }
                baseViewHolder2 = baseViewHolder;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
            k = (K) baseViewHolder2;
        }
        return k != null ? k : (K) new BaseViewHolder(view);
    }

    public final int OooOO0() {
        FrameLayout frameLayout = this.f10104OooOO0o;
        return (frameLayout == null || frameLayout.getChildCount() == 0 || !this.f10106OooOOO0 || this.f10111OooOOoo.size() != 0) ? 0 : 1;
    }

    public final int OooOO0O() {
        LinearLayout linearLayout = this.f10103OooOO0O;
        return (linearLayout == null || linearLayout.getChildCount() == 0) ? 0 : 1;
    }

    public final int OooOO0o() {
        int i = 1;
        if (OooOO0() != 1) {
            return this.f10111OooOOoo.size() + OooOOO0();
        }
        if (this.f10105OooOOO && OooOOO0() != 0) {
            i = 2;
        }
        if (this.f10107OooOOOO) {
            return i;
        }
        return -1;
    }

    @Nullable
    public T OooOOO(@IntRange(from = ULong.MIN_VALUE) int i) {
        if (i < this.f10111OooOOoo.size()) {
            return this.f10111OooOOoo.get(i);
        }
        return null;
    }

    public final int OooOOO0() {
        LinearLayout linearLayout = this.f10102OooOO0;
        return (linearLayout == null || linearLayout.getChildCount() == 0) ? 0 : 1;
    }

    public final int OooOOOO() {
        if (this.f10099OooO0o0 == null || !this.f10095OooO0O0) {
            return 0;
        }
        if (!this.f10094OooO00o) {
            o00OOOOo.OooO00o oooO00o = this.f10097OooO0Oo;
            if (oooO00o.OooO0OO() == 0 ? true : oooO00o.f37351OooO0O0) {
                return 0;
            }
        }
        return this.f10111OooOOoo.size() == 0 ? 0 : 1;
    }

    public final int OooOOOo() {
        return OooOO0O() + this.f10111OooOOoo.size() + OooOOO0();
    }

    public final void OooOOo(@IntRange(from = ULong.MIN_VALUE) int i) {
        this.f10111OooOOoo.remove(i);
        int iOooOOO0 = OooOOO0() + i;
        notifyItemRemoved(iOooOOO0);
        OooO0o(0);
        notifyItemRangeChanged(iOooOOO0, this.f10111OooOOoo.size() - iOooOOO0);
    }

    public K OooOOo0(ViewGroup viewGroup, int i) {
        o0000Ooo<T> o0000ooo = this.f10114OooOo0O;
        return (K) OooO0oo(this.f10109OooOOo.inflate(o0000ooo != null ? o0000ooo.f60851OooO00o.get(i, -404) : this.f10110OooOOo0, viewGroup, false));
    }

    public final void OooOOoo() {
        if (OooOOO0() == 0) {
            return;
        }
        this.f10102OooOO0.removeAllViews();
        int i = 0;
        if (OooOO0() == 1 && !this.f10105OooOOO) {
            i = -1;
        }
        if (i != -1) {
            notifyItemRemoved(i);
        }
    }

    public final void OooOo(View view) {
        LinearLayout linearLayout = this.f10102OooOO0;
        if (linearLayout == null || linearLayout.getChildCount() <= 0) {
            OooO0o0(view, 0);
        } else {
            this.f10102OooOO0.removeViewAt(0);
            this.f10102OooOO0.addView(view, 0);
        }
    }

    public final void OooOo0(View view) {
        boolean z;
        if (this.f10104OooOO0o == null) {
            this.f10104OooOO0o = new FrameLayout(view.getContext());
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = layoutParams2.width;
                ((ViewGroup.MarginLayoutParams) layoutParams).height = layoutParams2.height;
            }
            this.f10104OooOO0o.setLayoutParams(layoutParams);
            z = true;
        } else {
            z = false;
        }
        this.f10104OooOO0o.removeAllViews();
        this.f10104OooOO0o.addView(view);
        this.f10106OooOOO0 = true;
        if (z && OooOO0() == 1) {
            notifyItemInserted((!this.f10105OooOOO || OooOOO0() == 0) ? 0 : 1);
        }
    }

    public final void OooOo00(@IntRange(from = ULong.MIN_VALUE) int i, @NonNull T t) {
        this.f10111OooOOoo.set(i, t);
        notifyItemChanged(OooOOO0() + i);
    }

    public final void OooOo0O(View view) {
        LinearLayout linearLayout = this.f10103OooOO0O;
        if (linearLayout == null || linearLayout.getChildCount() <= 0) {
            OooO0Oo(view, 0);
        } else {
            this.f10103OooOO0O.removeViewAt(0);
            this.f10103OooOO0O.addView(view, 0);
        }
    }

    public final void OooOo0o() {
        this.f10105OooOOO = true;
        this.f10107OooOOOO = false;
    }

    public final void OooOoO(OooOO0 oooOO1, RecyclerView recyclerView) {
        this.f10099OooO0o0 = oooOO1;
        this.f10094OooO00o = true;
        this.f10095OooO0O0 = true;
        this.f10096OooO0OO = false;
        if (this.f10113OooOo00 == null) {
            this.f10113OooOo00 = recyclerView;
        }
    }

    public void OooOoO0(@Nullable List<T> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f10111OooOOoo = list;
        if (this.f10099OooO0o0 != null) {
            this.f10094OooO00o = true;
            this.f10095OooO0O0 = true;
            this.f10096OooO0OO = false;
            this.f10097OooO0Oo.OooO0o(1);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = 1;
        if (OooOO0() != 1) {
            return OooOOOO() + OooOO0O() + this.f10111OooOOoo.size() + OooOOO0();
        }
        if (this.f10105OooOOO && OooOOO0() != 0) {
            i = 2;
        }
        return (!this.f10107OooOOOO || OooOO0O() == 0) ? i : i + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (OooOO0() == 1) {
            boolean z = this.f10105OooOOO && OooOOO0() != 0;
            if (i == 0) {
                return z ? 273 : 1365;
            }
            if (i != 1) {
                return i != 2 ? 1365 : 819;
            }
            return z ? 1365 : 819;
        }
        int iOooOOO0 = OooOOO0();
        if (i < iOooOOO0) {
            return 273;
        }
        int i2 = i - iOooOOO0;
        int size = this.f10111OooOOoo.size();
        if (i2 < size) {
            return OooO(i2);
        }
        return i2 - size < OooOO0O() ? 819 : 546;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.Oooo000 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f7450OooOO0 = new OooO00o(gridLayoutManager);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, int i) {
        BaseViewHolder baseViewHolder = (BaseViewHolder) o0o0o00;
        if (OooOOOO() != 0 && i >= getItemCount() - this.f10115OooOo0o) {
            o00OOOOo.OooO00o oooO00o = this.f10097OooO0Oo;
            if (oooO00o.f37350OooO00o == 1) {
                oooO00o.OooO0o(2);
                if (!this.f10096OooO0OO) {
                    this.f10096OooO0OO = true;
                    RecyclerView recyclerView = this.f10113OooOo00;
                    if (recyclerView != null) {
                        recyclerView.post(new com.chad.library.adapter.base.OooO(this));
                    } else {
                        this.f10099OooO0o0.OooO00o();
                    }
                }
            }
        }
        int itemViewType = baseViewHolder.getItemViewType();
        if (itemViewType == 0) {
            OooO0oO(baseViewHolder, OooOOO(i - OooOOO0()));
            return;
        }
        if (itemViewType != 273) {
            if (itemViewType == 546) {
                this.f10097OooO0Oo.OooO00o(baseViewHolder);
            } else {
                if (itemViewType == 819 || itemViewType == 1365) {
                    return;
                }
                OooO0oO(baseViewHolder, OooOOO(i - OooOOO0()));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup viewGroup, int i) {
        BaseViewHolder baseViewHolderOooO0oo;
        View view;
        Context context = viewGroup.getContext();
        this.f10108OooOOOo = context;
        this.f10109OooOOo = LayoutInflater.from(context);
        if (i == 273) {
            baseViewHolderOooO0oo = OooO0oo(this.f10102OooOO0);
        } else if (i == 546) {
            baseViewHolderOooO0oo = OooO0oo(this.f10109OooOOo.inflate(this.f10097OooO0Oo.OooO0O0(), viewGroup, false));
            baseViewHolderOooO0oo.itemView.setOnClickListener(new com.chad.library.adapter.base.OooO0O0(this));
        } else if (i == 819) {
            baseViewHolderOooO0oo = OooO0oo(this.f10103OooOO0O);
        } else if (i != 1365) {
            baseViewHolderOooO0oo = OooOOo0(viewGroup, i);
            if (baseViewHolderOooO0oo != null && (view = baseViewHolderOooO0oo.itemView) != null) {
                if (this.f10098OooO0o != null) {
                    view.setOnClickListener(new com.chad.library.adapter.base.OooO0OO(this, baseViewHolderOooO0oo));
                }
                if (this.f10100OooO0oO != null) {
                    view.setOnLongClickListener(new com.chad.library.adapter.base.OooO0o(this, baseViewHolderOooO0oo));
                }
            }
        } else {
            baseViewHolderOooO0oo = OooO0oo(this.f10104OooOO0o);
        }
        baseViewHolderOooO0oo.setAdapter(this);
        return baseViewHolderOooO0oo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.o0O0O00 o0o0o00) {
        BaseViewHolder baseViewHolder = (BaseViewHolder) o0o0o00;
        super.onViewAttachedToWindow(baseViewHolder);
        int itemViewType = baseViewHolder.getItemViewType();
        if ((itemViewType == 1365 || itemViewType == 273 || itemViewType == 819 || itemViewType == 546) && (baseViewHolder.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams)) {
            ((StaggeredGridLayoutManager.LayoutParams) baseViewHolder.itemView.getLayoutParams()).f7719OooO = true;
        }
    }
}
