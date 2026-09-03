package p022Oooo00O;

import android.view.View;
import androidx.activity.result.OooO00o;
import androidx.camera.view.OooO;
import androidx.media3.common.Player;
import androidx.media3.session.o00O00O;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p025Oooo0OO.o000O0o;
import p080o000OoO.o00000O0;
import p335o0OO0o0O.o0OO00O;
import p335o0OO0o0O.o0ooOOo;
import p335o0OO0o0O.oo0o0Oo;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0o0 implements o000O0o.OooO0O0, o000Oo0.OooO0OO, OooO00o, o00000O0.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f783OooO0Oo;

    public /* synthetic */ o0O0o0(Object obj) {
        this.f783OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ((UserInfoLeftFragment) this.f783OooO0Oo).lambda$initView$5(baseQuickAdapter, view, i);
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        ((OooO) this.f783OooO0Oo).f4103OooOO0O.set(oooO00o);
        return "textureViewImpl_waitForNextFrame";
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((Player.OooO0OO) obj).onSeekForwardIncrementChanged(((o00O00O) this.f783OooO0Oo).f9393OooOooo);
    }

    @Override // androidx.activity.result.OooO00o
    public void onActivityResult(Object obj) {
        o0OO00O this$0 = (o0OO00O) this.f783OooO0Oo;
        int i = o0OO00O.f42474OooOO0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.OooO0O0()) {
            o0ooOOo o0ooooo = this$0.f42478OooO0o0;
            oo0o0Oo oo0o0oo = null;
            if (o0ooooo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("task");
                o0ooooo = null;
            }
            oo0o0Oo oo0o0oo2 = this$0.f42476OooO0Oo;
            if (oo0o0oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                oo0o0oo = oo0o0oo2;
            }
            o0ooooo.OooO0O0(new ArrayList(oo0o0oo.f42494OooOO0));
        }
    }
}
