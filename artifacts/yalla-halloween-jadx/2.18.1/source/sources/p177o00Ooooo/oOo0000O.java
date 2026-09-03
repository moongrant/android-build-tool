package p177o00Ooooo;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.moment.JoinTopicListActivity;
import kotlin.jvm.internal.Intrinsics;
import p034OoooO0O.o0Oo0oo;
import p186o00o00Oo.o0ooOOo;
import p358o0OOOo0o.o000OO;
import p359o0OOOoO.Oooo0;
import p359o0OOOoO.o000oOoO;
import p359o0OOOoO.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oOo0000O implements BaseQuickAdapter.OooOOOO, o000oOoO, o0ooOOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f32923OooO0Oo;

    public /* synthetic */ oOo0000O(Object obj) {
        this.f32923OooO0Oo = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<o0OOOoO.Oooo0>] */
    @Override // p359o0OOOoO.o000oOoO
    public final void OooO00o(Oooo0 oooo0) {
        o000OO o000oo2 = (o000OO) this.f32923OooO0Oo;
        synchronized (o000oo2) {
            if (o000oo2.f38389OooO0O0 instanceof o0OoOo0) {
                o000oo2.f38390OooO0OO.add(oooo0);
            }
            o000oo2.f38389OooO0O0.OooO00o(oooo0);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        oO0O000o oo0o000o = (oO0O000o) this.f32923OooO0Oo;
        if (i < oo0o000o.f32901o000oOoO.getData().size()) {
            o0Oo0oo.OooO0o0(174, oo0o000o.f32901o000oOoO.getItem(i));
        }
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        JoinTopicListActivity this$0 = (JoinTopicListActivity) this.f32923OooO0Oo;
        JoinTopicListActivity.OooO00o oooO00o = JoinTopicListActivity.f22299Oooooo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOooo(false);
    }
}
