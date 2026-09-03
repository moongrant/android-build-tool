package p358o0OOOooO;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.yalla.album.AlbumActivity;
import com.yalla.album.BigImageSelectActivity;
import com.yalla.yalla.ui.activity.user.AristocracyPresentationActivity;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f43787OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f43788OooO0o0;

    public /* synthetic */ o0000oo(Object obj, int i) {
        this.f43787OooO0Oo = i;
        this.f43788OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AlbumActivity albumActivity;
        int i = this.f43787OooO0Oo;
        Object obj = this.f43788OooO0o0;
        switch (i) {
            case 0:
                BigImageSelectActivity this$0 = (BigImageSelectActivity) obj;
                WeakReference<AlbumActivity> weakReference = BigImageSelectActivity.f22515OooOOOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                WeakReference<AlbumActivity> weakReference2 = BigImageSelectActivity.f22515OooOOOO;
                if (weakReference2 != null && (albumActivity = weakReference2.get()) != null) {
                    if (albumActivity.OooOOO().getMultiSelectedData().isEmpty()) {
                        albumActivity.OooOOO().putOrRemoveMultiSelectData(new AlbumItemWrapper(this$0.f22519OooO0oO.get(this$0.OooOOO().getCurrentItem()), null, 0, 6, null));
                    }
                    albumActivity.OooOOOo();
                    this$0.finish();
                    break;
                }
                break;
            case 1:
                AristocracyPresentationActivity this$1 = (AristocracyPresentationActivity) obj;
                int i2 = AristocracyPresentationActivity.f27068OooOo00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions")));
                break;
            default:
                MainSearchUserFragment this$2 = (MainSearchUserFragment) obj;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.getVm().clearSearchHistory();
                break;
        }
    }
}
