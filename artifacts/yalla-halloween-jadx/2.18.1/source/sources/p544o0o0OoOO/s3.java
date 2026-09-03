package p544o0o0OoOO;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.room.DeleteMusicActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class s3 implements BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteMusicActivity f44306OooO0Oo;

    public s3(DeleteMusicActivity deleteMusicActivity) {
        this.f44306OooO0Oo = deleteMusicActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        this.f44306OooO0Oo.f22794Ooooo0o.getData().get(i).isSelect = !this.f44306OooO0Oo.f22794Ooooo0o.getData().get(i).isSelect;
        baseQuickAdapter.notifyItemChanged(i);
        DeleteMusicActivity.OooOoO(this.f44306OooO0Oo);
    }
}
