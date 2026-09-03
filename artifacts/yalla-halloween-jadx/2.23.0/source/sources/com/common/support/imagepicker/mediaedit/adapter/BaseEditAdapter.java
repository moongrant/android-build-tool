package com.common.support.imagepicker.mediaedit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import com.common.support.imagepicker.dataprovider.config.AlbumItemType;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.common.support.imagepicker.mediaedit.config.MediaEdit;
import com.common.support.imagepicker.mediaedit.entities.MediaEditSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u0012J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0012H&J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0012H&J\u001a\u0010#\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0012H\u0016J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0012H\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\u0016\u0010&\u001a\u00020\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/adapter/BaseEditAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/common/support/imagepicker/mediaedit/adapter/BaseEditViewHolder;", "mContext", "Landroid/content/Context;", "mEdit", "Lcom/common/support/imagepicker/mediaedit/config/MediaEdit;", "(Landroid/content/Context;Lcom/common/support/imagepicker/mediaedit/config/MediaEdit;)V", "mData", "", "Lcom/common/support/imagepicker/mediaedit/entities/MediaEditSource;", "getMData", "()Ljava/util/List;", "mData$delegate", "Lkotlin/Lazy;", "getData", "", "getItemCount", "", "getItemViewType", "position", "inflateLayout", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "id", "onBindImageViewHolder", "", "holder", "Lcom/common/support/imagepicker/mediaedit/adapter/BaseEditImageViewHolder;", "onBindVideoViewHolder", "Lcom/common/support/imagepicker/mediaedit/adapter/BaseEditVideoViewHolder;", "onBindViewHolder", "onCreateImageViewHolder", "viewType", "onCreateVideoViewHolder", "onCreateViewHolder", "onViewRecycled", "setData", "data", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "mediaedit_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseEditAdapter extends RecyclerView.Adapter<BaseEditViewHolder> {

    @NotNull
    private final Context mContext;

    /* JADX INFO: renamed from: mData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mData;

    @NotNull
    private final MediaEdit mEdit;

    public BaseEditAdapter(@NotNull Context mContext, @NotNull MediaEdit mEdit) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mEdit, "mEdit");
        this.mContext = mContext;
        this.mEdit = mEdit;
        this.mData = LazyKt.lazy(new Function0<List<MediaEditSource>>() { // from class: com.common.support.imagepicker.mediaedit.adapter.BaseEditAdapter$mData$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<MediaEditSource> invoke() {
                return new ArrayList();
            }
        });
    }

    @NotNull
    public final List<MediaEditSource> getData() {
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
    public final List<MediaEditSource> getMData() {
        return (List) this.mData.getValue();
    }

    @NotNull
    public final View inflateLayout(@NotNull ViewGroup parent, @LayoutRes int id) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(parent.context).inflate(id, parent, false)");
        return viewInflate;
    }

    public abstract void onBindImageViewHolder(@NotNull BaseEditImageViewHolder holder, int position);

    public void onBindVideoViewHolder(@NotNull BaseEditVideoViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @NotNull
    public abstract BaseEditImageViewHolder onCreateImageViewHolder(@NotNull ViewGroup parent, int viewType);

    @Nullable
    public BaseEditVideoViewHolder onCreateVideoViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return null;
    }

    public void setData(@NotNull List<AlbumItemWrapper> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        getMData().clear();
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            getMData().add(new MediaEditSource((AlbumItemWrapper) it.next()));
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull BaseEditViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (getItemViewType(position) == AlbumItemType.IMAGE.getValue()) {
            onBindImageViewHolder((BaseEditImageViewHolder) holder, position);
        } else {
            onBindVideoViewHolder((BaseEditVideoViewHolder) holder, position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public BaseEditViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        BaseEditViewHolder baseEditViewHolderOnCreateImageViewHolder = viewType == AlbumItemType.IMAGE.getValue() ? onCreateImageViewHolder(parent, viewType) : onCreateVideoViewHolder(parent, viewType);
        if (baseEditViewHolderOnCreateImageViewHolder != null) {
            return baseEditViewHolderOnCreateImageViewHolder;
        }
        throw new NullPointerException("Please Create ViewHolder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull BaseEditViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof BaseEditVideoViewHolder) {
            this.mEdit.getMPreview().getVideoEngine().onUnBind();
        }
    }
}
