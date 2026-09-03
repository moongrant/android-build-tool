package p039OoooOoo;

import android.util.Pair;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.video.OooOOOO;
import androidx.media3.exoplayer.OooOOO0;
import androidx.media3.exoplayer.drm.OooO0O0;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0oOOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1733OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1734OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1735OooO0o0;

    public /* synthetic */ o0oOOo(int i, Object obj, Object obj2) {
        this.f1733OooO0Oo = i;
        this.f1735OooO0o0 = obj;
        this.f1734OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1733OooO0Oo;
        Object obj = this.f1734OooO0o;
        Object obj2 = this.f1735OooO0o0;
        switch (i) {
            case 0:
                OooOOOO oooOOOO = (OooOOOO) obj2;
                if (((DeferrableSurface) obj) == oooOOOO.f4007OooOOO) {
                    oooOOOO.Oooo00o();
                }
                break;
            case 1:
                Pair pair = (Pair) obj;
                ((OooOOO0.OooO00o) obj2).f7325OooO0o0.f7320OooO0oo.OooOo0o(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.OooOOOO.OooO0O0) pair.second);
                break;
            case 2:
                OooO0O0.OooO00o oooO00o = (OooO0O0.OooO00o) obj2;
                ((OooO0O0) obj).Oooo000(oooO00o.f7644OooO00o, oooO00o.f7645OooO0O0);
                break;
            default:
                MomentDetailCommentFragment.toReplyComment$lambda$9((MomentDetailCommentFragment) obj2, (MomentCommentDetailModel) obj);
                break;
        }
    }
}
