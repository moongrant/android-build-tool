package p485o0o00O0;

import android.view.KeyEvent;
import android.view.View;
import androidx.camera.core.impl.OooOOOO;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.gift.GifConfigJson;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.activity.moment.oo0o0Oo;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.GifFaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p564o0oOo0OO.o000O;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOO0O0O implements BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48149OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000O f48150OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f48151OooO0o0;

    public /* synthetic */ oOO0O0O(KeyEvent.Callback callback, o000O o000o, int i) {
        this.f48149OooO0Oo = i;
        this.f48151OooO0o0 = callback;
        this.f48150OooO0o = o000o;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        boolean z = false;
        int i2 = this.f48149OooO0Oo;
        o000O o000o = this.f48150OooO0o;
        KeyEvent.Callback callback = this.f48151OooO0o0;
        switch (i2) {
            case 0:
                TopicInfoActivity this$0 = (TopicInfoActivity) callback;
                oo0o0Oo this_apply = (oo0o0Oo) o000o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, this$0, String.valueOf(((UserInfo) this_apply.f10111OooOOoo.get(i)).getUserId()), false, 12);
                break;
            default:
                GifFaceView this$1 = (GifFaceView) callback;
                GifFaceView.OooO00o this_apply2 = (GifFaceView.OooO00o) o000o;
                int i3 = GifFaceView.f30449OooOOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this$1.f30456OooOO0 >= 700) {
                    this$1.f30456OooOO0 = jCurrentTimeMillis;
                    GifListJson gifListJson = this$1.f30455OooO0oo;
                    if (gifListJson != null && gifListJson.canNotUse()) {
                        z = true;
                    }
                    if (!z) {
                        GifConfigJson gifConfigJson = (GifConfigJson) this_apply2.f10111OooOOoo.get(i);
                        Function2<? super String, ? super Integer, Unit> function2 = this$1.f30453OooO0o0;
                        if (function2 != null) {
                            function2.invoke(OooOOOO.OooO00o(this$1.f30452OooO0o, gifConfigJson.getGif()), Integer.valueOf(gifConfigJson.getId()));
                        }
                    } else {
                        Function0<Unit> function0 = this$1.f30459OooOOO0;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }
                    break;
                }
                break;
        }
    }
}
