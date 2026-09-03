package com.yalla.album;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.common.support.imagepicker.album.TimeStringUtilKt;
import com.common.support.imagepicker.album.adapter.AlbumAdapterItemClickListener;
import com.common.support.imagepicker.album.adapter.BaseAlbumViewHolder;
import com.common.support.imagepicker.album.config.Album;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.common.support.imagepicker.preview.component.image.utils.GlideExtensionsKt;
import com.facebook.login.OooOOO;
import com.yalla.album.AlbumOthersViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o00O0OO.OooO0o;
import o0OO0.OooO0O0;
import o0OO0.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p116o00O0OOo.OooOOO0;
import p358o0OOOooO.o00000OO;
import p358o0OOOooO.o000O000;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u00109\u001a\u000202\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b:\u0010;J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010/\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010 \u001a\u0004\b0\u0010\"\"\u0004\b1\u0010$R$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/yalla/album/AlbumOthersViewHolder;", "Lcom/common/support/imagepicker/album/adapter/BaseAlbumViewHolder;", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "data", "", "checkVideo", "Lcom/common/support/imagepicker/album/config/Album;", "album", "", "adapterPosition", "bindData", "Lcom/common/support/imagepicker/album/adapter/AlbumAdapterItemClickListener;", "mListener", "Lcom/common/support/imagepicker/album/adapter/AlbumAdapterItemClickListener;", "Lo0OOOooO/o000O000;", "interceptor", "Lo0OOOooO/o000O000;", "getInterceptor", "()Lo0OOOooO/o000O000;", "maxCount", "I", "getMaxCount", "()I", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "imageGif", "Landroid/widget/TextView;", "getImageGif", "()Landroid/widget/TextView;", "setImageGif", "(Landroid/widget/TextView;)V", "videoDuration", "getVideoDuration", "setVideoDuration", "Landroid/widget/RelativeLayout;", "selectLayout", "Landroid/widget/RelativeLayout;", "getSelectLayout", "()Landroid/widget/RelativeLayout;", "setSelectLayout", "(Landroid/widget/RelativeLayout;)V", "selectTv", "getSelectTv", "setSelectTv", "Landroid/view/View;", "conver", "Landroid/view/View;", "getConver", "()Landroid/view/View;", "setConver", "(Landroid/view/View;)V", "itemView", "<init>", "(Landroid/view/View;Lcom/common/support/imagepicker/album/adapter/AlbumAdapterItemClickListener;Lo0OOOooO/o000O000;I)V", "LibSelectPicture_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAlbumAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumAdapter.kt\ncom/yalla/album/AlbumOthersViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,148:1\n262#2,2:149\n262#2,2:151\n260#2:153\n262#2,2:154\n260#2:156\n*S KotlinDebug\n*F\n+ 1 AlbumAdapter.kt\ncom/yalla/album/AlbumOthersViewHolder\n*L\n92#1:149,2\n94#1:151,2\n95#1:153\n111#1:154,2\n138#1:156\n*E\n"})
public final class AlbumOthersViewHolder extends BaseAlbumViewHolder {

    @Nullable
    private View conver;

    @Nullable
    private TextView imageGif;

    @Nullable
    private ImageView imageView;

    @NotNull
    private final o000O000 interceptor;

    @NotNull
    private final AlbumAdapterItemClickListener mListener;
    private final int maxCount;

    @Nullable
    private RelativeLayout selectLayout;

    @Nullable
    private TextView selectTv;

    @Nullable
    private TextView videoDuration;

    public static final class OooO00o extends OooOOO0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Album f22512OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ AlbumItem f22514OooO0oo;

        public OooO00o(AlbumItem albumItem, Album album) {
            this.f22514OooO0oo = albumItem;
            this.f22512OooO = album;
        }

        @Override // p116o00O0OOo.OooOOO0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            AlbumOthersViewHolder albumOthersViewHolder = AlbumOthersViewHolder.this;
            o000O000 interceptor = albumOthersViewHolder.getInterceptor();
            Context mContext = albumOthersViewHolder.getMContext();
            int maxCount = albumOthersViewHolder.getMaxCount();
            interceptor.getClass();
            if (o000O000.OooO00o(mContext, this.f22514OooO0oo, this.f22512OooO, maxCount).booleanValue()) {
                return;
            }
            RecyclerView.Adapter<? extends RecyclerView.o0O0O00> bindingAdapter = albumOthersViewHolder.getBindingAdapter();
            o00000OO o00000oo2 = bindingAdapter instanceof o00000OO ? (o00000OO) bindingAdapter : null;
            if (o00000oo2 != null) {
                o00000oo2.updateMultiSelectData(new AlbumItemWrapper(this.f22514OooO0oo, null, 0, 6, null));
                AlbumActivity this$0 = (AlbumActivity) ((OooOOO) o00000oo2.f43776OooO0Oo).f10700OooO00o;
                int i = AlbumActivity.f22491OooOo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOOo();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumOthersViewHolder(@NotNull View itemView, @NotNull AlbumAdapterItemClickListener mListener, @NotNull o000O000 interceptor, int i) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.mListener = mListener;
        this.interceptor = interceptor;
        this.maxCount = i;
        this.imageGif = (TextView) itemView.findViewById(OooO0OO.layout_all_image_tv_gif);
        this.videoDuration = (TextView) itemView.findViewById(OooO0OO.item_send_post_video_duration);
        this.imageView = (ImageView) itemView.findViewById(OooO0OO.layout_all_image_iv);
        this.selectLayout = (RelativeLayout) itemView.findViewById(OooO0OO.layout_all_image_layout_select);
        this.selectTv = (TextView) itemView.findViewById(OooO0OO.layout_all_image_tv_select);
        this.conver = itemView.findViewById(OooO0OO.layout_all_image_layout_covering);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$1(AlbumItem data, AlbumOthersViewHolder this$0, Album album, int i, View view) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(album, "$album");
        if (data.isVideo()) {
            this$0.checkVideo(data);
        } else if (album.getConfig().isMultiMode()) {
            this$0.mListener.onMultiModeItemClick(i, new AlbumItemWrapper(data, null, 0, 6, null));
        } else {
            this$0.mListener.onSingleModeItemClick(i, new AlbumItemWrapper(data, null, 0, 6, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    private final void checkVideo(AlbumItem data) {
        boolean z;
        View view = this.conver;
        if (view == null) {
            z = false;
        } else {
            if (view.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            return;
        }
        Function1<? super AlbumItem, Boolean> function1 = OooO0o.f36541OooO0O0;
        if (function1 != null && function1.invoke(data).booleanValue()) {
            return;
        }
        this.mListener.onSingleModeItemClick(getAbsoluteAdapterPosition(), new AlbumItemWrapper(data, null, 0, 6, null));
    }

    public final void bindData(@NotNull final Album album, @NotNull final AlbumItem data, final int adapterPosition) {
        Intrinsics.checkNotNullParameter(album, "album");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.isVideo()) {
            ImageView imageView = this.imageView;
            if (imageView != null) {
                GlideExtensionsKt.loadVideo(imageView, data.getContentUri(), (126 & 2) != 0 ? null : null, (126 & 4) == 0 ? null : null, (126 & 8) != 0 ? 0 : 0, (126 & 16) != 0 ? 0 : 0, (126 & 32) == 0 ? 0 : 0, (126 & 64) != 0 ? 0L : 0L);
            }
        } else if (data.isGif()) {
            ImageView imageView2 = this.imageView;
            if (imageView2 != null) {
                GlideExtensionsKt.loadGif(imageView2, data.getContentUri(), (62 & 2) != 0 ? null : null, (62 & 4) == 0 ? null : null, (62 & 8) != 0 ? 0 : 0, (62 & 16) != 0 ? 0 : 0, (62 & 32) == 0 ? 0 : 0);
            }
        } else {
            ImageView imageView3 = this.imageView;
            if (imageView3 != null) {
                GlideExtensionsKt.loadImg(imageView3, data.getContentUri(), (56 & 2) != 0 ? null : null, (56 & 4) == 0 ? null : null, (56 & 8) != 0 ? 0 : 0, (56 & 16) != 0 ? 0 : 0, (56 & 32) == 0 ? 0 : 0);
            }
        }
        TextView textView = this.imageGif;
        boolean z = false;
        if (textView != null) {
            textView.setVisibility(data.isGif() ? 0 : 8);
        }
        TextView textView2 = this.videoDuration;
        if (textView2 != null) {
            textView2.setVisibility(data.isVideo() ? 0 : 8);
            if (textView2.getVisibility() == 0) {
                textView2.setText(TimeStringUtilKt.formatDurationTime(data.getDuration()));
            }
        }
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: o0OOOooO.o00000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlbumOthersViewHolder.bindData$lambda$1(data, this, album, adapterPosition, view);
            }
        });
        Context mContext = getMContext();
        AlbumActivity albumActivity = mContext instanceof AlbumActivity ? (AlbumActivity) mContext : null;
        int i = albumActivity != null ? albumActivity.f22492OooO : 0;
        View view = this.conver;
        if (view != null) {
            view.setVisibility(data.isVideo() && (album.getMultiSelectedData().size() > 0 || i > 0) ? 0 : 8);
        }
        if (!album.getConfig().isMultiMode() || data.isVideo()) {
            RelativeLayout relativeLayout = this.selectLayout;
            if (relativeLayout == null) {
                return;
            }
            relativeLayout.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout2 = this.selectLayout;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        TextView textView3 = this.selectTv;
        if (textView3 != null) {
            if (album.getConfig().isMultiMode() && album.isMultiModeItemSelected(data.getId())) {
                z = true;
            }
            textView3.setText(z ? String.valueOf(album.getMultiSelectedCount(data.getId()) + i) : "");
            textView3.setBackgroundResource(z ? OooO0O0.ucrop_select_green : OooO0O0.ucrop_select_gray);
        }
        RelativeLayout relativeLayout3 = this.selectLayout;
        if (relativeLayout3 != null) {
            relativeLayout3.setOnClickListener(new OooO00o(data, album));
        }
    }

    @Nullable
    public final View getConver() {
        return this.conver;
    }

    @Nullable
    public final TextView getImageGif() {
        return this.imageGif;
    }

    @Nullable
    public final ImageView getImageView() {
        return this.imageView;
    }

    @NotNull
    public final o000O000 getInterceptor() {
        return this.interceptor;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    @Nullable
    public final RelativeLayout getSelectLayout() {
        return this.selectLayout;
    }

    @Nullable
    public final TextView getSelectTv() {
        return this.selectTv;
    }

    @Nullable
    public final TextView getVideoDuration() {
        return this.videoDuration;
    }

    public final void setConver(@Nullable View view) {
        this.conver = view;
    }

    public final void setImageGif(@Nullable TextView textView) {
        this.imageGif = textView;
    }

    public final void setImageView(@Nullable ImageView imageView) {
        this.imageView = imageView;
    }

    public final void setSelectLayout(@Nullable RelativeLayout relativeLayout) {
        this.selectLayout = relativeLayout;
    }

    public final void setSelectTv(@Nullable TextView textView) {
        this.selectTv = textView;
    }

    public final void setVideoDuration(@Nullable TextView textView) {
        this.videoDuration = textView;
    }
}
