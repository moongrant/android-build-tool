package o000O00O;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p473o0OoooOo.o0OOO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O0 implements o000OoO.o00000O0.OooO00o, o0OOO0, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f34026OooO0Oo;

    public /* synthetic */ o000O0(Object obj) {
        this.f34026OooO0Oo = obj;
    }

    @Override // p473o0OoooOo.o0OOO0
    public final void OooO0O0() {
        PremiumActivity this$0 = (PremiumActivity) this.f34026OooO0Oo;
        int i = PremiumActivity.f26673Oooo0oO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getClass();
        boolean z = true;
        new p429o0OoOO.Oooo000(this$0, new PayManager(this$0)).OooO0OO(this$0.Oooo000(), true);
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Restoring_Please_wait_a_moment);
        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
            z = false;
        }
        if (z) {
            return;
        }
        com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        com.yalla.yalla.ui.fragment.moment.o00Ooo this_apply = (com.yalla.yalla.ui.fragment.moment.o00Ooo) this.f34026OooO0Oo;
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Context context = this_apply.f56423OooOo;
        if (context != null) {
            int i2 = TopicDetailActivity.f25854OooOoOO;
            Object obj = this_apply.f13189OooOOoo.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            TopicDetailActivity.OooO00o.OooO00o(context, (TopicInfoModel) obj);
        }
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onMetadata((Metadata) this.f34026OooO0Oo);
    }
}
