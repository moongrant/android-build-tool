package p358o0OOOooO;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.common.support.imagepicker.mediaedit.YLMediaEdit;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.album.CropImageActivity;
import oo0oOO0.OooO0O0;
import oo0oOO0.OooO0OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 {
    public static void OooO00o(FragmentActivity fragmentActivity, Uri uri, float f, float f2, int i, int i2, final OooO0OO oooO0OO) {
        if (uri == null) {
            return;
        }
        Intent intent = new Intent(fragmentActivity, (Class<?>) CropImageActivity.class);
        intent.putExtra("sourceData", uri);
        intent.putExtra(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, f);
        intent.putExtra(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, f2);
        intent.putExtra("origin_width", i);
        intent.putExtra("origin_height", i2);
        OooO0O0 oooO0O0 = new OooO0O0(fragmentActivity);
        oooO0O0.f60908OooO0O0 = intent;
        oooO0O0.OooO00o(new OooO0OO() { // from class: o0OOOooO.o000O00
            @Override // oo0oOO0.OooO0OO
            public final void onActivityResult(int i3, Intent intent2) {
                OooO0OO oooO0OO2;
                Uri second;
                if (i3 != -1 || intent2 == null || (oooO0OO2 = oooO0OO) == null || (second = YLMediaEdit.INSTANCE.getResultDate(intent2).getSecond()) == null) {
                    return;
                }
                intent2.setAction(null);
                intent2.setData(second);
                oooO0OO2.onActivityResult(i3, intent2);
            }
        });
    }
}
