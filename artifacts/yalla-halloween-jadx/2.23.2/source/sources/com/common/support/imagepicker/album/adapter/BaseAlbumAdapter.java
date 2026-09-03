package com.common.support.imagepicker.album.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import com.common.support.imagepicker.album.config.Album;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\"\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019`\u001aJ\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020\u0010H\u0004J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0018\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0010H&J\u0018\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u0010H&J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u0010H&J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u0010H\u0016J\u0014\u0010*\u001a\u00020!2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\u0013J\u000e\u0010,\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/common/support/imagepicker/album/adapter/BaseAlbumAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/common/support/imagepicker/album/adapter/BaseAlbumViewHolder;", "mAlbum", "Lcom/common/support/imagepicker/album/config/Album;", "mListener", "Lcom/common/support/imagepicker/album/adapter/AlbumAdapterItemClickListener;", "(Lcom/common/support/imagepicker/album/config/Album;Lcom/common/support/imagepicker/album/adapter/AlbumAdapterItemClickListener;)V", "mData", "", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "getMData", "()Ljava/util/List;", "mData$delegate", "Lkotlin/Lazy;", "getAdapterPosition", "", "position", "getData", "", "getItemCount", "getItemViewType", "getMultiSelectedData", "Ljava/util/LinkedHashMap;", "", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "Lkotlin/collections/LinkedHashMap;", "inflateLayout", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "id", "onBindCameraViewHolder", "", "holder", "onBindOthersViewHolder", "adapterPosition", "onBindViewHolder", "onCreateCameraViewHolder", "viewType", "onCreateOthersViewHolder", "onCreateViewHolder", "setData", "data", "updateMultiSelectData", "album_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BaseAlbumAdapter extends RecyclerView.Adapter<BaseAlbumViewHolder> {

    @NotNull
    private final Album mAlbum;

    /* JADX INFO: renamed from: mData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mData;

    @NotNull
    private final AlbumAdapterItemClickListener mListener;

    public BaseAlbumAdapter(@NotNull Album mAlbum, @NotNull AlbumAdapterItemClickListener mListener) {
        Intrinsics.checkNotNullParameter(mAlbum, "mAlbum");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.mAlbum = mAlbum;
        this.mListener = mListener;
        this.mData = LazyKt.lazy(new Function0<List<AlbumItem>>() { // from class: com.common.support.imagepicker.album.adapter.BaseAlbumAdapter$mData$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<AlbumItem> invoke() {
                return new ArrayList();
            }
        });
    }

    private final List<AlbumItem> getMData() {
        return (List) this.mData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(BaseAlbumAdapter this$0, int i, AlbumItem data, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "$data");
        if (this$0.mAlbum.getConfig().isMultiMode()) {
            this$0.mListener.onMultiModeItemClick(i, new AlbumItemWrapper(data, null, 0, 6, null));
        } else {
            this$0.mListener.onSingleModeItemClick(i, new AlbumItemWrapper(data, null, 0, 6, null));
        }
    }

    public final int getAdapterPosition(int position) {
        return this.mAlbum.getConfig().getShowCamera() ? position - 1 : position;
    }

    @NotNull
    public final List<AlbumItem> getData() {
        return getMData();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mAlbum.getConfig().getShowCamera() ? getMData().size() + 1 : getMData().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return (position == 0 && this.mAlbum.getConfig().getShowCamera()) ? 0 : 1;
    }

    @NotNull
    public final LinkedHashMap<Long, AlbumItemWrapper> getMultiSelectedData() {
        return this.mAlbum.getMultiSelectedData();
    }

    @NotNull
    public final View inflateLayout(@NotNull ViewGroup parent, @LayoutRes int id) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(parent.context).inflate(id, parent, false)");
        return viewInflate;
    }

    public abstract void onBindCameraViewHolder(@NotNull BaseAlbumViewHolder holder, int position);

    public abstract void onBindOthersViewHolder(@NotNull BaseAlbumViewHolder holder, int adapterPosition);

    @NotNull
    public abstract BaseAlbumViewHolder onCreateCameraViewHolder(@NotNull ViewGroup parent, int viewType);

    @NotNull
    public abstract BaseAlbumViewHolder onCreateOthersViewHolder(@NotNull ViewGroup parent, int viewType);

    public final void setData(@NotNull List<? extends AlbumItem> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        getMData().clear();
        getMData().addAll(data);
        notifyDataSetChanged();
    }

    public final void updateMultiSelectData(@NotNull AlbumItemWrapper data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.mAlbum.putOrRemoveMultiSelectData(data);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull BaseAlbumViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (getItemViewType(position) == 0) {
            onBindCameraViewHolder(holder, position);
            return;
        }
        final int adapterPosition = getAdapterPosition(position);
        final AlbumItem albumItem = getMData().get(adapterPosition);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.common.support.imagepicker.album.adapter.OooO00o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseAlbumAdapter.onBindViewHolder$lambda$0(this.f13582OooO0Oo, adapterPosition, albumItem, view);
            }
        });
        onBindOthersViewHolder(holder, adapterPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public BaseAlbumViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return viewType == 0 ? onCreateCameraViewHolder(parent, viewType) : onCreateOthersViewHolder(parent, viewType);
    }
}
