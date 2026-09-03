package p361o0OOOooo;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.common.support.imagepicker.mediaedit.YLMediaEdit;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.album.CropImageActivity;
import p142o00OOooO.OooOO0;
import p142o00OOooO.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0ooO {
    public static void OooO00o(FragmentActivity fragmentActivity, Uri uri, float f, float f2, int i, int i2, final OooOO0O oooOO0O) {
        if (uri == null) {
            return;
        }
        Intent intent = new Intent(fragmentActivity, (Class<?>) CropImageActivity.class);
        intent.putExtra("sourceData", uri);
        intent.putExtra(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, f);
        intent.putExtra(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, f2);
        intent.putExtra("origin_width", i);
        intent.putExtra("origin_height", i2);
        OooOO0 oooOO1 = new OooOO0(fragmentActivity);
        oooOO1.f37527OooO0O0 = intent;
        oooOO1.OooO00o(new OooOO0O() { // from class: o0OOOooo.o00
            @Override // p142o00OOooO.OooOO0O
            public final void onActivityResult(int i3, Intent intent2) {
                OooOO0O oooOO0O2;
                Uri second;
                if (i3 != -1 || intent2 == null || (oooOO0O2 = oooOO0O) == null || (second = YLMediaEdit.INSTANCE.getResultDate(intent2).getSecond()) == null) {
                    return;
                }
                intent2.setAction(null);
                intent2.setData(second);
                oooOO0O2.onActivityResult(i3, intent2);
            }
        });
    }
}
