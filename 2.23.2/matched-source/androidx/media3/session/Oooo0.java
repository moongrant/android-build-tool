package androidx.media3.session;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.fragment.room.RoomThemeCustomizeFragment;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Oooo0 implements p080o000OoO.o0O0O00, o0oo0.OooOOOO.OooO00o, BaseQuickAdapter.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9263OooO0Oo;

    public /* synthetic */ Oooo0(Object obj) {
        this.f9263OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        RoomThemeCustomizeFragment.initView$lambda$3((RoomThemeCustomizeFragment) this.f9263OooO0Oo, baseQuickAdapter, view, i);
    }

    @Override // o0oo0.OooOOOO.OooO00o
    public final void OooO0Oo() {
        p598o0oo00Oo.o0000O00.OooO0oO("onTextClicked setViewData 动态详情 postCommentDetailModel = " + ((MomentCommentDetailModel) this.f9263OooO0Oo));
    }

    @Override // p080o000OoO.o0O0O00
    public final void accept(Object obj) {
        ((o000oOoO) this.f9263OooO0Oo).getClass();
        ((o000oOoO.OooO00o) obj).OooO0o0();
    }
}
