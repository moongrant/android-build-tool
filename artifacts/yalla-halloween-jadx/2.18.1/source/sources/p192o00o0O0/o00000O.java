package p192o00o0O0;

import android.view.View;
import com.app.selectPicture.activity.ShowImagesLoadActivity;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.room.MemberListRemoveActivity;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import kotlin.jvm.internal.Intrinsics;
import o0O0OOOo.OooO0OO;
import p186o00o00Oo.o0ooOOo;
import p200o00o0Oo0.o0000Ooo;
import p288o0O0OOo.o00Oo0;
import p654o0ooo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O implements o0000Ooo, o00Oo0.OooO00o, o0ooOOo, BaseQuickAdapter.OooOOOO, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f33085OooO0Oo;

    public /* synthetic */ o00000O(Object obj) {
        this.f33085OooO0Oo = obj;
    }

    @Override // o0O0OOo.o00Oo0.OooO00o
    public final Object OooO0O0() {
        return ((OooO0OO) this.f33085OooO0Oo).OooO0Oo();
    }

    @Override // p654o0ooo.o000oOoO
    public final void OooO0Oo() {
        ((UserInfoLeftFragment) this.f33085OooO0Oo).lambda$showAddPowerSeeroomFriend$6();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MainSearchUserFragment.m376initView$lambda14((MainSearchUserFragment) this.f33085OooO0Oo, baseQuickAdapter, view, i);
    }

    @Override // p200o00o0Oo0.o0000Ooo
    public final void OooO0o0(Object obj, Object obj2) {
        ShowImagesLoadActivity showImagesLoadActivity = (ShowImagesLoadActivity) this.f33085OooO0Oo;
        if (showImagesLoadActivity.f12279Oooo0oo) {
            showImagesLoadActivity.finish();
        }
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        MemberListRemoveActivity this$0 = (MemberListRemoveActivity) this.f33085OooO0Oo;
        MemberListRemoveActivity.OooO00o oooO00o = MemberListRemoveActivity.f22886Oooooo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOooo(true);
    }
}
