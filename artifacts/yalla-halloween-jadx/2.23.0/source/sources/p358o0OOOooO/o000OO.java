package p358o0OOOooO;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.o0oOOo;
import androidx.recyclerview.widget.RecyclerView;
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
import o0OO0.OooO0O0;
import o0OO0.OooO0OO;
import org.jetbrains.annotations.NotNull;
import p116o00O0OOo.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nBigImageSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigImageSelectActivity.kt\ncom/yalla/album/BigImageSelectActivity$initViewPager$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,224:1\n1#2:225\n262#3,2:226\n262#3,2:228\n260#3,4:230\n260#3:234\n260#3,4:235\n260#3:239\n*S KotlinDebug\n*F\n+ 1 BigImageSelectActivity.kt\ncom/yalla/album/BigImageSelectActivity$initViewPager$1\n*L\n157#1:226,2\n182#1:228,2\n168#1:230,4\n169#1:234\n170#1:235,4\n171#1:239\n*E\n"})
public final class o000OO extends BaseQuickAdapter<AlbumItem, BaseViewHolder> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BigImageSelectActivity f43800OooOo;

    public static final class OooO00o extends OooOOO0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ AlbumActivity f43801OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ BigImageSelectActivity f43802OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ AlbumItem f43803OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ o000OO f43804OooOO0;

        public OooO00o(BigImageSelectActivity bigImageSelectActivity, AlbumItem albumItem, AlbumActivity albumActivity, o000OO o000oo2) {
            this.f43802OooO0oO = bigImageSelectActivity;
            this.f43803OooO0oo = albumItem;
            this.f43801OooO = albumActivity;
            this.f43804OooOO0 = o000oo2;
        }

        @Override // p116o00O0OOo.OooOOO0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            BigImageSelectActivity bigImageSelectActivity = this.f43802OooO0oO;
            o000O000 o000o001 = (o000O000) bigImageSelectActivity.f22522OooOO0O.getValue();
            AlbumActivity albumActivity = this.f43801OooO;
            Album albumOooOOO = albumActivity.OooOOO();
            int i = albumActivity.f22498OooOO0O;
            o000o001.getClass();
            AlbumItem albumItem = this.f43803OooO0oo;
            if (o000O000.OooO00o(bigImageSelectActivity, albumItem, albumOooOOO, i).booleanValue()) {
                return;
            }
            albumActivity.OooOOO().putOrRemoveMultiSelectData(new AlbumItemWrapper(this.f43803OooO0oo, null, 0, 6, null));
            this.f43804OooOO0.notifyItemRangeChanged(0, bigImageSelectActivity.f22519OooO0oO.size(), CollectionsKt.listOf(albumItem));
            bigImageSelectActivity.OooOOOO();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(BigImageSelectActivity bigImageSelectActivity, int i, List<AlbumItem> list) {
        super(i, list);
        this.f43800OooOo = bigImageSelectActivity;
    }

    public final void OooOoOO(BaseViewHolder baseViewHolder, AlbumItem albumItem) {
        AlbumActivity albumActivity;
        TextView bindText$lambda$5$lambda$4 = (TextView) baseViewHolder.getView(OooO0OO.layout_show_image_select_tv_select);
        WeakReference<AlbumActivity> weakReference = BigImageSelectActivity.f22515OooOOOO;
        WeakReference<AlbumActivity> weakReference2 = BigImageSelectActivity.f22515OooOOOO;
        if (weakReference2 == null || (albumActivity = weakReference2.get()) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(bindText$lambda$5$lambda$4, "bindText$lambda$5$lambda$4");
        BigImageSelectActivity bigImageSelectActivity = this.f43800OooOo;
        bindText$lambda$5$lambda$4.setVisibility(bigImageSelectActivity.f22524OooOOO ^ true ? 0 : 8);
        boolean z = albumActivity.OooOOO().getConfig().isMultiMode() && albumActivity.OooOOO().isMultiModeItemSelected(albumItem.getId());
        bindText$lambda$5$lambda$4.setText(z ? String.valueOf(albumActivity.OooOOO().getMultiSelectedCount(albumItem.getId()) + albumActivity.f22492OooO) : "");
        bindText$lambda$5$lambda$4.setBackgroundResource(z ? OooO0O0.ucrop_select_green : OooO0O0.ucrop_select_gray);
        bindText$lambda$5$lambda$4.setOnClickListener(new OooO00o(bigImageSelectActivity, albumItem, albumActivity, this));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: OooOoo0, reason: merged with bridge method [inline-methods] */
    public final void OooO0oO(@NotNull BaseViewHolder helper, @NotNull final AlbumItem item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        PhotoView photoView = (PhotoView) helper.getView(OooO0OO.layout_show_image_select_pic_iv);
        if (o00O0OO.OooO0OO.f36535OooO00o == null) {
            o00O0OO.OooO0OO.f36535OooO00o = new o00O0OO.OooO0O0();
        }
        o00O0OO.OooO0OO.f36535OooO00o.OooO0O0(photoView.getContext(), item.getContentUri(), photoView);
        final BigImageSelectActivity bigImageSelectActivity = this.f43800OooOo;
        photoView.setOnClickListener(new View.OnClickListener() { // from class: o0OOOooO.o0000O0O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BigImageSelectActivity this$0 = bigImageSelectActivity;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o000OO this$1 = this;
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                AlbumItem item2 = item;
                Intrinsics.checkNotNullParameter(item2, "$item");
                WeakReference<AlbumActivity> weakReference = BigImageSelectActivity.f22515OooOOOO;
                this$0.OooOOO0().setVisibility((this$0.OooOOO0().getVisibility() == 0) ^ true ? 0 : 8);
                ViewGroup viewGroup = null;
                if (!(this$0.OooOOO0().getVisibility() == 0)) {
                    o0oOOo o0oooo = this$0.f22521OooOO0;
                    if (o0oooo == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("controller");
                        o0oooo = null;
                    }
                    o0oooo.f5453OooO00o.OooO00o(1);
                    o0oOOo o0oooo2 = this$0.f22521OooOO0;
                    if (o0oooo2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("controller");
                        o0oooo2 = null;
                    }
                    o0oooo2.f5453OooO00o.OooO00o(2);
                } else {
                    o0oOOo o0oooo3 = this$0.f22521OooOO0;
                    if (o0oooo3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("controller");
                        o0oooo3 = null;
                    }
                    o0oooo3.f5453OooO00o.OooO0oO(1);
                    o0oOOo o0oooo4 = this$0.f22521OooOO0;
                    if (o0oooo4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("controller");
                        o0oooo4 = null;
                    }
                    o0oooo4.f5453OooO00o.OooO0oO(2);
                }
                ViewGroup viewGroup2 = this$0.f22516OooO;
                if (viewGroup2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleBarParent");
                    viewGroup2 = null;
                }
                ViewGroup viewGroup3 = this$0.f22516OooO;
                if (viewGroup3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleBarParent");
                    viewGroup3 = null;
                }
                viewGroup2.setVisibility((viewGroup3.getVisibility() == 0) ^ true ? 0 : 8);
                ViewGroup viewGroup4 = this$0.f22516OooO;
                if (viewGroup4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleBarParent");
                } else {
                    viewGroup = viewGroup4;
                }
                this$0.f22524OooOOO = !(viewGroup.getVisibility() == 0);
                this$1.notifyItemRangeChanged(0, this$0.f22519OooO0oO.size(), CollectionsKt.listOf(item2));
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
        TextView selectTextView = (TextView) holder.getView(OooO0OO.layout_show_image_select_tv_select);
        Intrinsics.checkNotNullExpressionValue(selectTextView, "selectTextView");
        selectTextView.setVisibility(this.f43800OooOo.f22524OooOOO ^ true ? 0 : 8);
        AlbumItem albumItemOooOOO2 = OooOOO(i - OooOOO0());
        if (albumItemOooOOO2 != null) {
            OooOoOO(holder, albumItemOooOOO2);
        }
    }
}
