package com.chad.library.adapter.base;

import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class OooO00o extends RecyclerView.oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SparseArray<View> f12560OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashSet<Integer> f12561OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedHashSet<Integer> f12562OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public BaseQuickAdapter f12563OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Deprecated
    public View f12564OooO0o0;

    /* JADX INFO: renamed from: com.chad.library.adapter.base.OooO00o$OooO00o, reason: collision with other inner class name */
    public class ViewOnClickListenerC0082OooO00o implements View.OnClickListener {
        public ViewOnClickListenerC0082OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (OooO00o.this.f12563OooO0Oo.getOnItemChildClickListener() != null) {
                BaseQuickAdapter.OooOOO0 onItemChildClickListener = OooO00o.this.f12563OooO0Oo.getOnItemChildClickListener();
                OooO00o oooO00o = OooO00o.this;
                onItemChildClickListener.OooO0oo(oooO00o.f12563OooO0Oo, view, OooO00o.OooO00o(oooO00o));
            }
        }
    }

    public OooO00o(View view) {
        super(view);
        this.f12560OooO00o = new SparseArray<>();
        this.f12561OooO0O0 = new LinkedHashSet<>();
        this.f12562OooO0OO = new LinkedHashSet<>();
        new HashSet();
        this.f12564OooO0o0 = view;
    }

    public static int OooO00o(OooO00o oooO00o) {
        if (oooO00o.getLayoutPosition() >= oooO00o.f12563OooO0Oo.getHeaderLayoutCount()) {
            return oooO00o.getLayoutPosition() - oooO00o.f12563OooO0Oo.getHeaderLayoutCount();
        }
        return 0;
    }

    public final OooO00o OooO(@IdRes int i, @StringRes int i2) {
        ((TextView) OooO0Oo(i)).setText(i2);
        return this;
    }

    public final OooO00o OooO0O0(@IdRes int i) {
        this.f12561OooO0O0.add(Integer.valueOf(i));
        View viewOooO0Oo = OooO0Oo(i);
        if (viewOooO0Oo != null) {
            if (!viewOooO0Oo.isClickable()) {
                viewOooO0Oo.setClickable(true);
            }
            viewOooO0Oo.setOnClickListener(new ViewOnClickListenerC0082OooO00o());
        }
        return this;
    }

    public final OooO00o OooO0OO() {
        this.f12562OooO0OO.add(Integer.valueOf(R.id.llRoot));
        View viewOooO0Oo = OooO0Oo(R.id.llRoot);
        if (viewOooO0Oo != null) {
            if (!viewOooO0Oo.isLongClickable()) {
                viewOooO0Oo.setLongClickable(true);
            }
            viewOooO0Oo.setOnLongClickListener(new OooO0O0(this));
        }
        return this;
    }

    public final <T extends View> T OooO0Oo(@IdRes int i) {
        T t = (T) this.f12560OooO00o.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.f12560OooO00o.put(i, t2);
        return t2;
    }

    public final OooO00o OooO0o(@IdRes int i, @DrawableRes int i2) {
        OooO0Oo(i).setBackgroundResource(i2);
        return this;
    }

    public final OooO00o OooO0o0(@IdRes int i, @ColorInt int i2) {
        OooO0Oo(i).setBackgroundColor(i2);
        return this;
    }

    public final OooO00o OooO0oO(@IdRes int i, boolean z) {
        OooO0Oo(i).setVisibility(z ? 0 : 8);
        return this;
    }

    public final OooO00o OooO0oo(@IdRes int i, @DrawableRes int i2) {
        ((ImageView) OooO0Oo(i)).setImageResource(i2);
        return this;
    }

    public final OooO00o OooOO0(@IdRes int i, CharSequence charSequence) {
        ((TextView) OooO0Oo(i)).setText(charSequence);
        return this;
    }

    public final OooO00o OooOO0O(@IdRes int i, @ColorInt int i2) {
        ((TextView) OooO0Oo(i)).setTextColor(i2);
        return this;
    }

    public final OooO00o OooOO0o(@IdRes int i, boolean z) {
        OooO0Oo(i).setVisibility(z ? 0 : 4);
        return this;
    }
}
