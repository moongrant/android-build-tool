package p022Oooo00O;

import android.hardware.camera2.CameraCharacteristics;
import android.view.View;
import androidx.media3.common.Player;
import androidx.media3.session.o00O00O;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.moment.JoinTopicListActivity;
import com.yalla.yalla.ui.view.StickerFaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p023Oooo00o.oO000o00;
import p025Oooo0OO.oo0o0Oo;
import p080o000OoO.o00000O0;
import p559o0oOo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OO00OO implements oo0o0Oo, BaseQuickAdapter.OooO0o, o00000O0.OooO00o, o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f810OooO0Oo;

    public /* synthetic */ o0OO00OO(Object obj) {
        this.f810OooO0Oo = obj;
    }

    @Override // p025Oooo0OO.oo0o0Oo
    public Object OooO00o(CameraCharacteristics.Key key) {
        return ((oO000o00) this.f810OooO0Oo).OooO00o(key);
    }

    @Override // p559o0oOo.o00O0O
    public void OooO0OO() {
        JoinTopicListActivity this$0 = (JoinTopicListActivity) this.f810OooO0Oo;
        int i = JoinTopicListActivity.f25596OooOoO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoO(false);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        StickerFaceView this$0 = (StickerFaceView) this.f810OooO0Oo;
        int i2 = StickerFaceView.f30181OooO0oO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this$0.f30184OooO0o0 < 700) {
            return;
        }
        this$0.f30184OooO0o0 = jCurrentTimeMillis;
        Function1<? super Integer, Unit> function1 = this$0.f30183OooO0o;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(((StickerFaceView.OooO0O0) this$0.f30182OooO0Oo.f13189OooOOoo.get(i)).f30185OooO00o));
        }
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((Player.OooO0OO) obj).onTracksChanged(((o00O00O) this.f810OooO0Oo).f9395Oooo00O);
    }
}
