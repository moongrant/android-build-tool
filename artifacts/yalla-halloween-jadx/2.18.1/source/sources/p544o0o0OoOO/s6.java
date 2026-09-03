package p544o0o0OoOO;

import android.content.Intent;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.room.SearchMusicActivity;
import com.yalla.yalla.ui.activity.room.SelectMusicActivity;
import p034OoooO0O.o0Oo0oo;
import p140o00OOOoO.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class s6 implements BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SearchMusicActivity f44309OooO0Oo;

    public s6(SearchMusicActivity searchMusicActivity) {
        this.f44309OooO0Oo = searchMusicActivity;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Object] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intent intent = new Intent(this.f44309OooO0Oo, (Class<?>) SelectMusicActivity.class);
        SearchMusicActivity searchMusicActivity = this.f44309OooO0Oo;
        searchMusicActivity.f23020Ooooo00 = i;
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.f31885OooO00o = 504;
        oooO0OO.f31887OooO0OO = searchMusicActivity.f23019OoooOoo.get(i).clone();
        o0Oo0oo.OooO0oO(oooO0OO);
        this.f44309OooO0Oo.startActivityForResult(intent, 1000);
    }
}
