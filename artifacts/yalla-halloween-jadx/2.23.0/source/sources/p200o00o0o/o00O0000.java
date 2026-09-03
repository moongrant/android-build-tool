package p200o00o0o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.material.OooOO0O;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.Oooo000;
import com.yalla.album.AlbumActivity;
import com.yalla.yalla.ui.fragment.GuessListFragment;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.OooO0OO;
import o00O0OOO.OooO0O0;
import p245o00oo0o.o00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0000 implements o00O.OooO00o, Oooo000.OooO00o, OooO0O0, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39130OooO0Oo;

    public /* synthetic */ o00O0000(Object obj) {
        this.f39130OooO0Oo = obj;
    }

    @Override // o00O0OOO.OooO0O0
    public void OooO0O0(View view, Integer num) {
        AlbumActivity this$0 = (AlbumActivity) this.f39130OooO0Oo;
        int i = AlbumActivity.f22491OooOo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null && num.intValue() == 1010) {
            if (this$0.f22498OooOO0O == 9) {
                if (OooO0OO.f36538OooO0Oo == null) {
                    OooO0OO.f36538OooO0Oo = new OooOO0O();
                }
                OooO0OO.f36538OooO0Oo.OooO00o("Moments_post_pic_cancel");
            }
            this$0.onBackPressed();
            return;
        }
        if (num != null && num.intValue() == 1011) {
            if (this$0.f22498OooOO0O == 9) {
                if (OooO0OO.f36538OooO0Oo == null) {
                    OooO0OO.f36538OooO0Oo = new OooOO0O();
                }
                OooO0OO.f36538OooO0Oo.OooO00o("Moments_post_pic_success");
            }
            this$0.OooOOOo();
            return;
        }
        if ((num != null && num.intValue() == 1012) || (num != null && num.intValue() == 1013)) {
            Object value = this$0.f22504OooOOo.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-albumLayout>(...)");
            this$0.OooOOoo(!(((LinearLayout) value).getVisibility() == 0));
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        GuessListFragment.onLazyInit$lambda$0((GuessListFragment) this.f39130OooO0Oo, baseQuickAdapter, view, i);
    }

    @Override // o00oo0o.o00O.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).o00Oo0();
    }
}
