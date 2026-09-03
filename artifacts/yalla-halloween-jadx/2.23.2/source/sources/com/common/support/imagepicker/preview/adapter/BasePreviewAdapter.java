package com.common.support.imagepicker.preview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import com.common.support.imagepicker.dataprovider.config.AlbumItemType;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.common.support.imagepicker.preview.config.Preview;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u0012J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u001a\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0012H\u0016J\u001a\u0010#\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0012H\u0016J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0012H\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\u0016\u0010&\u001a\u00020\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/common/support/imagepicker/preview/adapter/BasePreviewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/common/support/imagepicker/preview/adapter/BasePreviewViewHolder;", "mContext", "Landroid/content/Context;", "mPreview", "Lcom/common/support/imagepicker/preview/config/Preview;", "(Landroid/content/Context;Lcom/common/support/imagepicker/preview/config/Preview;)V", "mData", "", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "getMData", "()Ljava/util/List;", "mData$delegate", "Lkotlin/Lazy;", "getData", "", "getItemCount", "", "getItemViewType", "position", "inflateLayout", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "id", "onBindImageViewHolder", "", "holder", "Lcom/common/support/imagepicker/preview/adapter/BasePreviewImageViewHolder;", "onBindVideoViewHolder", "Lcom/common/support/imagepicker/preview/adapter/BasePreviewVideoViewHolder;", "onBindViewHolder", "onCreateImageViewHolder", "viewType", "onCreateVideoViewHolder", "onCreateViewHolder", "onViewRecycled", "setData", "data", "preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BasePreviewAdapter extends RecyclerView.Adapter<BasePreviewViewHolder> {

    @NotNull
    private final Context mContext;

    /* JADX INFO: renamed from: mData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mData;

    @NotNull
    private final Preview mPreview;

    public BasePreviewAdapter(@NotNull Context mContext, @NotNull Preview mPreview) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mPreview, "mPreview");
        this.mContext = mContext;
        this.mPreview = mPreview;
        this.mData = LazyKt.lazy(new Function0<List<AlbumItemWrapper>>() { // from class: com.common.support.imagepicker.preview.adapter.BasePreviewAdapter$mData$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<AlbumItemWrapper> invoke() {
                return new ArrayList();
            }
        });
    }

    @NotNull
    public final List<AlbumItemWrapper> getData() {
        return getMData();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getMData().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getMData().get(position).getOriginItem().getItemType().getValue();
    }

    @NotNull
    public final List<AlbumItemWrapper> getMData() {
        return (List) this.mData.getValue();
    }

    @NotNull
    public final View inflateLayout(@NotNull ViewGroup parent, @LayoutRes int id) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(parent.context).inflate(id, parent, false)");
        return viewInflate;
    }

    public void onBindImageViewHolder(@NotNull BasePreviewImageViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public void onBindVideoViewHolder(@NotNull BasePreviewVideoViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Nullable
    public BasePreviewImageViewHolder onCreateImageViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return null;
    }

    @Nullable
    public BasePreviewVideoViewHolder onCreateVideoViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return null;
    }

    public void setData(@NotNull List<AlbumItemWrapper> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        getMData().clear();
        getMData().addAll(data);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull BasePreviewViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (getItemViewType(position) == AlbumItemType.IMAGE.getValue()) {
            onBindImageViewHolder((BasePreviewImageViewHolder) holder, position);
        } else {
            onBindVideoViewHolder((BasePreviewVideoViewHolder) holder, position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public BasePreviewViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        BasePreviewViewHolder basePreviewViewHolderOnCreateImageViewHolder = viewType == AlbumItemType.IMAGE.getValue() ? onCreateImageViewHolder(parent, viewType) : onCreateVideoViewHolder(parent, viewType);
        if (basePreviewViewHolderOnCreateImageViewHolder != null) {
            return basePreviewViewHolderOnCreateImageViewHolder;
        }
        throw new NullPointerException("Please Create ViewHolder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull BasePreviewViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof BasePreviewVideoViewHolder) {
            this.mPreview.getVideoEngine().onUnBind();
        }
    }
}
