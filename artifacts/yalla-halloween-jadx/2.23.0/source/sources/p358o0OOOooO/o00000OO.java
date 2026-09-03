package p358o0OOOooO;

import android.view.ViewGroup;
import com.common.support.imagepicker.album.adapter.AlbumAdapterItemClickListener;
import com.common.support.imagepicker.album.adapter.BaseAlbumAdapter;
import com.common.support.imagepicker.album.adapter.BaseAlbumViewHolder;
import com.common.support.imagepicker.album.config.Album;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.facebook.login.OooOOO;
import com.yalla.album.AlbumCameraViewHolder;
import com.yalla.album.AlbumOthersViewHolder;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import o00O0OOO.OooO00o;
import o0OO0.OooO0o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO extends BaseAlbumAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f43773OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Album f43774OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final AlbumAdapterItemClickListener f43775OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO00o<AlbumItemWrapper> f43776OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o000O000 f43777OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f43778OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(int i, @NotNull Album mAlbum, @NotNull o000OOo mListener, @NotNull OooOOO checkCallBack) {
        super(mAlbum, mListener);
        Intrinsics.checkNotNullParameter(mAlbum, "mAlbum");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(checkCallBack, "checkCallBack");
        this.f43773OooO00o = i;
        this.f43774OooO0O0 = mAlbum;
        this.f43775OooO0OO = mListener;
        this.f43776OooO0Oo = checkCallBack;
        this.f43778OooO0o0 = LazyKt.lazy(o00000O.f43770OooO0Oo);
        this.f43777OooO0o = new o000O000();
    }

    @Override // com.common.support.imagepicker.album.adapter.BaseAlbumAdapter
    public final void onBindCameraViewHolder(@NotNull BaseAlbumViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof AlbumCameraViewHolder) {
            holder.itemView.setOnClickListener(new o00000O0(this, 0));
        }
    }

    @Override // com.common.support.imagepicker.album.adapter.BaseAlbumAdapter
    public final void onBindOthersViewHolder(@NotNull BaseAlbumViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof AlbumOthersViewHolder) {
            ((AlbumOthersViewHolder) holder).bindData(this.f43774OooO0O0, getData().get(i), i);
        }
    }

    @Override // com.common.support.imagepicker.album.adapter.BaseAlbumAdapter
    @NotNull
    public final BaseAlbumViewHolder onCreateCameraViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new AlbumCameraViewHolder(inflateLayout(parent, OooO0o.layout_take_photo));
    }

    @Override // com.common.support.imagepicker.album.adapter.BaseAlbumAdapter
    @NotNull
    public final BaseAlbumViewHolder onCreateOthersViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new AlbumOthersViewHolder(inflateLayout(parent, OooO0o.layout_all_image), this.f43775OooO0OO, this.f43777OooO0o, this.f43773OooO00o);
    }
}
