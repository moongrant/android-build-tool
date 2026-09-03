package p361o0OOOooo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0000O0O;
import com.app.selectPicture.view.photoview.PhotoView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.common.support.imagepicker.album.config.Album;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.yalla.album.AlbumActivity;
import com.yalla.album.BigImageSelectActivity;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o0OO0O0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p139o00OOOo0.OooOO0;
import p140o00OOOoO.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nBigImageSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigImageSelectActivity.kt\ncom/yalla/album/BigImageSelectActivity$initViewPager$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,239:1\n1#2:240\n262#3,2:241\n262#3,2:243\n260#3,4:245\n260#3,4:249\n*S KotlinDebug\n*F\n+ 1 BigImageSelectActivity.kt\ncom/yalla/album/BigImageSelectActivity$initViewPager$1\n*L\n161#1:241,2\n192#1:243,2\n179#1:245,4\n181#1:249,4\n*E\n"})
public final class o000O0 extends BaseQuickAdapter<AlbumItem, BaseViewHolder> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BigImageSelectActivity f42970OooOo;

    public static final class OooO00o extends OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ AlbumActivity f42971OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ BigImageSelectActivity f42972OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ AlbumItem f42973OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ o000O0 f42974OooOO0;

        public OooO00o(BigImageSelectActivity bigImageSelectActivity, AlbumItem albumItem, AlbumActivity albumActivity, o000O0 o000o0) {
            this.f42972OooO0oO = bigImageSelectActivity;
            this.f42973OooO0oo = albumItem;
            this.f42971OooO = albumActivity;
            this.f42974OooOO0 = o000o0;
        }

        @Override // p140o00OOOoO.OooO0OO
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            BigImageSelectActivity bigImageSelectActivity = this.f42972OooO0oO;
            o000O o000o = (o000O) bigImageSelectActivity.f22049OooOO0O.getValue();
            AlbumActivity albumActivity = this.f42971OooO;
            Album albumOooOOO = albumActivity.OooOOO();
            int i = albumActivity.f22025OooOO0O;
            o000o.getClass();
            AlbumItem albumItem = this.f42973OooO0oo;
            if (o000O.OooO00o(bigImageSelectActivity, albumItem, albumOooOOO, i).booleanValue()) {
                return;
            }
            albumActivity.OooOOO().putOrRemoveMultiSelectData(new AlbumItemWrapper(this.f42973OooO0oo, null, 0, 6, null));
            this.f42974OooOO0.notifyItemRangeChanged(0, bigImageSelectActivity.f22046OooO0oO.size(), CollectionsKt.listOf(albumItem));
            bigImageSelectActivity.OooOOOO();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(BigImageSelectActivity bigImageSelectActivity, int i, List<AlbumItem> list) {
        super(i, list);
        this.f42970OooOo = bigImageSelectActivity;
    }

    public final void OooOoOO(BaseViewHolder baseViewHolder, AlbumItem albumItem) {
        AlbumActivity albumActivity;
        TextView textView = (TextView) baseViewHolder.getView(o0OO0O0.OooO0OO.layout_show_image_select_tv_select);
        WeakReference<AlbumActivity> weakReference = BigImageSelectActivity.f22042OooOOOO;
        WeakReference<AlbumActivity> weakReference2 = BigImageSelectActivity.f22042OooOOOO;
        if (weakReference2 == null || (albumActivity = weakReference2.get()) == null) {
            return;
        }
        Intrinsics.checkNotNull(textView);
        BigImageSelectActivity bigImageSelectActivity = this.f42970OooOo;
        textView.setVisibility(bigImageSelectActivity.f22050OooOO0o > 1 && !bigImageSelectActivity.f22051OooOOO ? 0 : 8);
        boolean z = albumActivity.OooOOO().getConfig().isMultiMode() && albumActivity.OooOOO().isMultiModeItemSelected(albumItem.getId());
        textView.setText(z ? String.valueOf(albumActivity.OooOOO().getMultiSelectedCount(albumItem.getId()) + albumActivity.f22019OooO) : "");
        textView.setBackgroundResource(z ? OooO0O0.ucrop_select_green : OooO0O0.ucrop_select_gray);
        textView.setOnClickListener(new OooO00o(bigImageSelectActivity, albumItem, albumActivity, this));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: OooOoo0, reason: merged with bridge method [inline-methods] */
    public final void OooO0oO(@NotNull BaseViewHolder helper, @NotNull final AlbumItem item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        PhotoView photoView = (PhotoView) helper.getView(o0OO0O0.OooO0OO.layout_show_image_select_pic_iv);
        if (OooOO0.f37472OooO00o == null) {
            OooOO0.f37472OooO00o = new o0000O0O();
        }
        OooOO0.f37472OooO00o.OooO0O0(photoView.getContext(), item.getContentUri(), photoView);
        final BigImageSelectActivity bigImageSelectActivity = this.f42970OooOo;
        photoView.setOnClickListener(new View.OnClickListener() { // from class: o0OOOooo.o000O00O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BigImageSelectActivity this$0 = bigImageSelectActivity;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o000O0 this$1 = this;
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                AlbumItem item2 = item;
                Intrinsics.checkNotNullParameter(item2, "$item");
                boolean z = !this$0.f22051OooOOO;
                this$0.f22051OooOOO = z;
                ViewGroup viewGroup = null;
                if (!z) {
                    o0 o0Var = this$0.f22048OooOO0;
                    if (o0Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("controller");
                        o0Var = null;
                    }
                    o0Var.f5420OooO00o.OooO00o(1);
                    o0 o0Var2 = this$0.f22048OooOO0;
                    if (o0Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("controller");
                        o0Var2 = null;
                    }
                    o0Var2.f5420OooO00o.OooO00o(2);
                } else {
                    o0 o0Var3 = this$0.f22048OooOO0;
                    if (o0Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("controller");
                        o0Var3 = null;
                    }
                    o0Var3.f5420OooO00o.OooO0oO(1);
                    o0 o0Var4 = this$0.f22048OooOO0;
                    if (o0Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("controller");
                        o0Var4 = null;
                    }
                    o0Var4.f5420OooO00o.OooO0oO(2);
                }
                if (this$0.f22050OooOO0o > 1) {
                    this$0.OooOOO0().setVisibility((this$0.OooOOO0().getVisibility() == 0) ^ true ? 0 : 8);
                }
                ViewGroup viewGroup2 = this$0.f22043OooO;
                if (viewGroup2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleBarParent");
                    viewGroup2 = null;
                }
                ViewGroup viewGroup3 = this$0.f22043OooO;
                if (viewGroup3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleBarParent");
                } else {
                    viewGroup = viewGroup3;
                }
                viewGroup2.setVisibility(true ^ (viewGroup.getVisibility() == 0) ? 0 : 8);
                this$1.notifyItemRangeChanged(0, this$0.f22046OooO0oO.size(), CollectionsKt.listOf(item2));
            }
        });
        OooOoOO(helper, item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, int i, List payloads) {
        BaseViewHolder holder = (BaseViewHolder) o0o0o00;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            AlbumItem albumItemOooOOO = OooOOO(i - OooOOO0());
            if (albumItemOooOOO != null) {
                OooO0oO(holder, albumItemOooOOO);
                return;
            }
            return;
        }
        TextView textView = (TextView) holder.getView(o0OO0O0.OooO0OO.layout_show_image_select_tv_select);
        Intrinsics.checkNotNull(textView);
        BigImageSelectActivity bigImageSelectActivity = this.f42970OooOo;
        textView.setVisibility(bigImageSelectActivity.f22050OooOO0o > 1 && !bigImageSelectActivity.f22051OooOOO ? 0 : 8);
        AlbumItem albumItemOooOOO2 = OooOOO(i - OooOOO0());
        if (albumItemOooOOO2 != null) {
            OooOoOO(holder, albumItemOooOOO2);
        }
    }
}
