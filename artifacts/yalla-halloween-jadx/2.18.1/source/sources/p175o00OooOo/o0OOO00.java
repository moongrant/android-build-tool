package p175o00OooOo;

import android.view.View;
import com.app.base.view.StickerFaceView;
import com.app.base.view.VerifyCodeView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OOO00 implements BaseQuickAdapter.OooOOOO, VerifyCodeView.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f32749OooO0Oo;

    public /* synthetic */ o0OOO00(Object obj) {
        this.f32749OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        StickerFaceView this$0 = (StickerFaceView) this.f32749OooO0Oo;
        int i2 = StickerFaceView.f12135Oooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this$0.f12137Oooo0oO < 700) {
            return;
        }
        this$0.f12137Oooo0oO = jCurrentTimeMillis;
        Function1<? super Integer, Unit> function1 = this$0.f12138Oooo0oo;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this$0.f12136Oooo0o.getData().get(i).f12139OooO00o));
        }
    }
}
