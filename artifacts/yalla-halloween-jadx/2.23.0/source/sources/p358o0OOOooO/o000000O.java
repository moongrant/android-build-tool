package p358o0OOOooO;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumSource;
import com.common.support.imagepicker.preview.component.image.utils.GlideExtensionsKt;
import com.yalla.album.AlbumActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o0OO0.OooO00o;
import o0OO0.OooO0OO;
import p118o00O0Oo0.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAlbumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumActivity.kt\ncom/yalla/album/AlbumActivity$onInitListView$1\n+ 2 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,370:1\n41#2,2:371\n115#2:373\n74#2,4:374\n43#2:378\n*S KotlinDebug\n*F\n+ 1 AlbumActivity.kt\ncom/yalla/album/AlbumActivity$onInitListView$1\n*L\n207#1:371,2\n209#1:373\n209#1:374,4\n207#1:378\n*E\n"})
public final class o000000O extends BaseQuickAdapter<AlbumSource, BaseViewHolder> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AlbumActivity f43769OooOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(AlbumActivity albumActivity, int i) {
        super(i, null);
        this.f43769OooOo = albumActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder helper, AlbumSource albumSource) {
        AlbumSource itemData = albumSource;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        AlbumItem albumItem = itemData.getData().get(0);
        int i = OooO00o.select_picture_color_85000000;
        Object obj = ContextCompat.f5271OooO00o;
        AlbumActivity albumActivity = this.f43769OooOo;
        int iOooO00o = ContextCompat.OooO0o.OooO00o(albumActivity, i);
        OooO0O0 oooO0O0 = albumActivity.f22494OooO0o0;
        OooO0O0 oooO0O1 = null;
        if (oooO0O0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            oooO0O0 = null;
        }
        if (oooO0O0.f36586OooOOOo.f36551OooOO0 != -1) {
            OooO0O0 oooO0O2 = albumActivity.f22494OooO0o0;
            if (oooO0O2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            } else {
                oooO0O1 = oooO0O2;
            }
            iOooO00o = oooO0O1.f36586OooOOOo.f36551OooOO0;
        }
        ImageView imageView = (ImageView) helper.getView(OooO0OO.layout_image_file_iv);
        if (albumItem.isVideo()) {
            if (imageView != null) {
                GlideExtensionsKt.loadVideo(imageView, albumItem.getContentUri(), (126 & 2) != 0 ? null : null, (126 & 4) == 0 ? null : null, (126 & 8) != 0 ? 0 : 0, (126 & 16) != 0 ? 0 : 0, (126 & 32) == 0 ? 0 : 0, (126 & 64) != 0 ? 0L : 0L);
            }
        } else if (imageView != null) {
            GlideExtensionsKt.load(imageView, albumItem.getContentUri());
        }
        TextView textView = (TextView) helper.getView(OooO0OO.layout_image_file_name_tv);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) itemData.getName());
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(iOooO00o);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ("(" + itemData.getData().size() + ")"));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        textView.setText(new SpannedString(spannableStringBuilder));
    }
}
