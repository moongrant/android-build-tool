package p363o0OOOooo;

import android.view.View;
import com.yalla.album.AlbumActivity;
import com.yalla.album.BigImageSelectActivity;
import com.yalla.yalla.ui.fragment.TreasureBoxFragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000O00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f42967OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f42968OooO0o0;

    public /* synthetic */ o000O00(Object obj, int i) {
        this.f42967OooO0Oo = i;
        this.f42968OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f42967OooO0Oo;
        Object obj = this.f42968OooO0o0;
        switch (i) {
            case 0:
                BigImageSelectActivity this$0 = (BigImageSelectActivity) obj;
                WeakReference<AlbumActivity> weakReference = BigImageSelectActivity.f22046OooOOOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            default:
                TreasureBoxFragment.initView$lambda$8((TreasureBoxFragment) obj, view);
                break;
        }
    }
}
