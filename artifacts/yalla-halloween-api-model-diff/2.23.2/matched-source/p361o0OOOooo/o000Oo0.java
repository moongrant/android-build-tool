package p361o0OOOooo;

import android.view.View;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.yalla.album.AlbumActivity;
import com.yalla.album.BigImageSelectActivity;
import com.yalla.yalla.ui.fragment.TreasureBoxFragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000Oo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f42987OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f42988OooO0o0;

    public /* synthetic */ o000Oo0(Object obj, int i) {
        this.f42987OooO0Oo = i;
        this.f42988OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AlbumActivity albumActivity;
        int i = this.f42987OooO0Oo;
        Object obj = this.f42988OooO0o0;
        switch (i) {
            case 0:
                BigImageSelectActivity this$0 = (BigImageSelectActivity) obj;
                WeakReference<AlbumActivity> weakReference = BigImageSelectActivity.f22042OooOOOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                WeakReference<AlbumActivity> weakReference2 = BigImageSelectActivity.f22042OooOOOO;
                if (weakReference2 != null && (albumActivity = weakReference2.get()) != null) {
                    if (albumActivity.OooOOO().getMultiSelectedData().isEmpty()) {
                        albumActivity.OooOOO().putOrRemoveMultiSelectData(new AlbumItemWrapper(this$0.f22046OooO0oO.get(this$0.OooOOO().getCurrentItem()), null, 0, 6, null));
                    }
                    albumActivity.OooOOOo();
                    this$0.finish();
                    break;
                }
                break;
            default:
                TreasureBoxFragment.initView$lambda$10((TreasureBoxFragment) obj, view);
                break;
        }
    }
}
