package p358o0OOOooO;

import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.share.internal.ShareConstants;
import com.yalla.album.BigImageSelectActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nViewpage2Ext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Viewpage2Ext.kt\ncom/app/selectPicture/utils/Viewpage2ExtKt$doOnPageChange$1\n+ 2 BigImageSelectActivity.kt\ncom/yalla/album/BigImageSelectActivity\n*L\n1#1,13:1\n207#2,2:14\n*E\n"})
public final class o0000O0 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BigImageSelectActivity f43780OooO00o;

    public o0000O0(BigImageSelectActivity bigImageSelectActivity) {
        this.f43780OooO00o = bigImageSelectActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        BigImageSelectActivity bigImageSelectActivity = this.f43780OooO00o;
        TextView textView = bigImageSelectActivity.f22520OooO0oo;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_TITLE);
            textView = null;
        }
        textView.setText((i + 1) + "/" + bigImageSelectActivity.f22519OooO0oO.size());
    }
}
