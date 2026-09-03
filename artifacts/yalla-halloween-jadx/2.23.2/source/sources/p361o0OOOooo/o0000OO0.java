package p361o0OOOooo;

import android.view.ViewGroup;
import androidx.media3.session.o00000OO;
import com.common.support.imagepicker.album.adapter.AlbumAdapterItemClickListener;
import com.common.support.imagepicker.album.adapter.BaseAlbumAdapter;
import com.common.support.imagepicker.album.adapter.BaseAlbumViewHolder;
import com.common.support.imagepicker.album.config.Album;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.yalla.album.AlbumCameraViewHolder;
import com.yalla.album.AlbumOthersViewHolder;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0.OooO0o;
import org.jetbrains.annotations.NotNull;
import p138o00OOOo.OooO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 extends BaseAlbumAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f42963OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Album f42964OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final AlbumAdapterItemClickListener f42965OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO0O0<AlbumItemWrapper> f42966OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o000O f42967OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f42968OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(int i, @NotNull Album mAlbum, @NotNull o0000O00 mListener, @NotNull o00000OO checkCallBack) {
        super(mAlbum, mListener);
        Intrinsics.checkNotNullParameter(mAlbum, "mAlbum");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(checkCallBack, "checkCallBack");
        this.f42963OooO00o = i;
        this.f42964OooO0O0 = mAlbum;
        this.f42965OooO0OO = mListener;
        this.f42966OooO0Oo = checkCallBack;
        this.f42968OooO0o0 = LazyKt.lazy(o0000O.f42956OooO0Oo);
        this.f42967OooO0o = new o000O();
    }

    @Override // com.common.support.imagepicker.album.adapter.BaseAlbumAdapter
    public final void onBindCameraViewHolder(@NotNull BaseAlbumViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof AlbumCameraViewHolder) {
            holder.itemView.setOnClickListener(new o000OO(this, 0));
        }
    }

    @Override // com.common.support.imagepicker.album.adapter.BaseAlbumAdapter
    public final void onBindOthersViewHolder(@NotNull BaseAlbumViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof AlbumOthersViewHolder) {
            ((AlbumOthersViewHolder) holder).bindData(this.f42964OooO0O0, getData().get(i), i);
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
        return new AlbumOthersViewHolder(inflateLayout(parent, OooO0o.layout_all_image), this.f42965OooO0OO, this.f42967OooO0o, this.f42963OooO00o);
    }
}
