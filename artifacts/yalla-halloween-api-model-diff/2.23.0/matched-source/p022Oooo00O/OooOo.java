package p022Oooo00O;

import android.media.MediaFormat;
import androidx.camera.core.impl.o000oOoO;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import p045Oooooo.o0000Ooo;
import p045Oooooo.o000O00O;
import p045Oooooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f448OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f449OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f450OooO0o0;

    public /* synthetic */ OooOo(int i, Object obj, Object obj2) {
        this.f448OooO0Oo = i;
        this.f450OooO0o0 = obj;
        this.f449OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f448OooO0Oo;
        Object obj = this.f449OooO0o;
        Object obj2 = this.f450OooO0o0;
        switch (i) {
            case 0:
                o000oOoO o000oooo2 = (o000oOoO) obj;
                o0Oo0oo.OooO00o oooO00o = ((o0Oo0oo) obj2).f856OooOo;
                oooO00o.f861OooO00o.remove(o000oooo2);
                oooO00o.f862OooO0O0.remove(o000oooo2);
                break;
            case 1:
                int i2 = o0000Ooo.OooO.f1926OooOO0O;
                ((o00Oo0) obj2).OooO0o(new o000O00O((MediaFormat) obj));
                break;
            default:
                MomentDetailCommentFragment.toReplyComment$lambda$2((MomentDetailCommentFragment) obj2, (MomentCommentDetailModel) obj);
                break;
        }
    }
}
