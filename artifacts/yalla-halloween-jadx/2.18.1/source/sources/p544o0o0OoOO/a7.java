package p544o0o0OoOO;

import android.view.View;
import com.app.base.model.MusicSelecterModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.room.SelectMusicActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class a7 implements BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SelectMusicActivity f44204OooO0Oo;

    public a7(SelectMusicActivity selectMusicActivity) {
        this.f44204OooO0Oo = selectMusicActivity;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.app.base.model.MusicSelecterModel>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<com.app.base.model.MusicSelecterModel>] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ((MusicSelecterModel) this.f44204OooO0Oo.f23028OoooOoo.get(i)).select = !((MusicSelecterModel) this.f44204OooO0Oo.f23028OoooOoo.get(i)).select;
        baseQuickAdapter.notifyItemChanged(i);
        this.f44204OooO0Oo.OooOoOO();
    }
}
