package p361o0OOOooo;

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
import o0OO0O0.OooO00o;
import o0OO0O0.OooO0OO;
import p141o00OOoo.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAlbumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumActivity.kt\ncom/yalla/album/AlbumActivity$onInitListView$1\n+ 2 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,370:1\n41#2,2:371\n115#2:373\n74#2,4:374\n43#2:378\n*S KotlinDebug\n*F\n+ 1 AlbumActivity.kt\ncom/yalla/album/AlbumActivity$onInitListView$1\n*L\n207#1:371,2\n209#1:373\n209#1:374,4\n207#1:378\n*E\n"})
public final class o0000O0 extends BaseQuickAdapter<AlbumSource, BaseViewHolder> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AlbumActivity f42957OooOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(AlbumActivity albumActivity, int i) {
        super(i, null);
        this.f42957OooOo = albumActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder helper, AlbumSource albumSource) {
        AlbumSource itemData = albumSource;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        AlbumItem albumItem = itemData.getData().get(0);
        int i = OooO00o.select_picture_color_85000000;
        Object obj = ContextCompat.f5281OooO00o;
        AlbumActivity albumActivity = this.f42957OooOo;
        int iOooO00o = ContextCompat.OooO0o.OooO00o(albumActivity, i);
        OooOOO0 oooOOO0 = albumActivity.f22021OooO0o0;
        OooOOO0 oooOOO1 = null;
        if (oooOOO0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            oooOOO0 = null;
        }
        if (oooOOO0.f37523OooOOOo.f37488OooOO0 != -1) {
            OooOOO0 oooOOO2 = albumActivity.f22021OooO0o0;
            if (oooOOO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            } else {
                oooOOO1 = oooOOO2;
            }
            iOooO00o = oooOOO1.f37523OooOOOo.f37488OooOO0;
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
