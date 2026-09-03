package com.yalla.yalla.base.paging;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v4.media.OooO00o;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J#\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u0002*\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u001c\u0010\f\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001e\u0010\f\u001a\u0004\u0018\u00010\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0004H\u0016J\u001c\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0004H\u0016J\u001c\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010\u0019\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u0016J\u001c\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u0004H\u0016J\u001a\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u001a\u0010!\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001dH\u0016J\u001a\u0010#\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u001dH\u0016R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/yalla/yalla/base/paging/PagingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$o0O0O00;", "Landroid/view/View;", "T", "", "viewId", "getView", "(I)Landroid/view/View;", "getViewOrNull", "findView", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setText", "strId", "color", "setTextColor", "colorRes", "setTextColorRes", "imageResId", "setImageResource", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "Landroid/graphics/Bitmap;", "bitmap", "setImageBitmap", "setBackgroundColor", "backgroundRes", "setBackgroundResource", "", "isVisible", "setVisible", "isGone", "setGone", "isEnabled", "setEnabled", "Landroid/util/SparseArray;", "views", "Landroid/util/SparseArray;", "itemView", "<init>", "(Landroid/view/View;)V", "YLBase_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPagingViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingViewHolder.kt\ncom/yalla/yalla/base/paging/PagingViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
public class PagingViewHolder extends RecyclerView.o0O0O00 {
    public static final int $stable = 8;

    @NotNull
    private final SparseArray<View> views;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.views = new SparseArray<>();
    }

    @Nullable
    public <T extends View> T findView(int i) {
        return (T) this.itemView.findViewById(i);
    }

    @NotNull
    public <T extends View> T getView(@IdRes int viewId) {
        T t = (T) getViewOrNull(viewId);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(OooO00o.OooO00o("No view found with id ", viewId).toString());
    }

    @Nullable
    public <T extends View> T getViewOrNull(@IdRes int viewId) {
        T t;
        T t2 = (T) this.views.get(viewId);
        if (t2 == null && (t = (T) this.itemView.findViewById(viewId)) != null) {
            this.views.put(viewId, t);
            return t;
        }
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    @NotNull
    public PagingViewHolder setBackgroundColor(@IdRes int viewId, @ColorInt int color) {
        getView(viewId).setBackgroundColor(color);
        return this;
    }

    @NotNull
    public PagingViewHolder setBackgroundResource(@IdRes int viewId, @DrawableRes int backgroundRes) {
        getView(viewId).setBackgroundResource(backgroundRes);
        return this;
    }

    @NotNull
    public PagingViewHolder setEnabled(@IdRes int viewId, boolean isEnabled) {
        getView(viewId).setEnabled(isEnabled);
        return this;
    }

    @NotNull
    public PagingViewHolder setGone(@IdRes int viewId, boolean isGone) {
        getView(viewId).setVisibility(isGone ? 8 : 0);
        return this;
    }

    @NotNull
    public PagingViewHolder setImageBitmap(@IdRes int viewId, @Nullable Bitmap bitmap) {
        ((ImageView) getView(viewId)).setImageBitmap(bitmap);
        return this;
    }

    @NotNull
    public PagingViewHolder setImageDrawable(@IdRes int viewId, @Nullable Drawable drawable) {
        ((ImageView) getView(viewId)).setImageDrawable(drawable);
        return this;
    }

    @NotNull
    public PagingViewHolder setImageResource(@IdRes int viewId, @DrawableRes int imageResId) {
        ((ImageView) getView(viewId)).setImageResource(imageResId);
        return this;
    }

    @NotNull
    public PagingViewHolder setText(@IdRes int viewId, @Nullable CharSequence value) {
        ((TextView) getView(viewId)).setText(value);
        return this;
    }

    @NotNull
    public PagingViewHolder setTextColor(@IdRes int viewId, @ColorInt int color) {
        ((TextView) getView(viewId)).setTextColor(color);
        return this;
    }

    @NotNull
    public PagingViewHolder setTextColorRes(@IdRes int viewId, @ColorRes int colorRes) {
        ((TextView) getView(viewId)).setTextColor(this.itemView.getResources().getColor(colorRes));
        return this;
    }

    @NotNull
    public PagingViewHolder setVisible(@IdRes int viewId, boolean isVisible) {
        getView(viewId).setVisibility(isVisible ? 0 : 4);
        return this;
    }

    @Nullable
    public PagingViewHolder setText(@IdRes int viewId, @StringRes int strId) {
        ((TextView) getView(viewId)).setText(strId);
        return this;
    }
}
