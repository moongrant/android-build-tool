package p544o0o0OoOO;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.room.MusicActivity;
import p617o0oo0o.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class j5 implements BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f44257OooO0Oo;

    public j5(MusicActivity musicActivity) {
        this.f44257OooO0Oo = musicActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (i >= this.f44257OooO0Oo.f22909OooooO0.getData().size()) {
            return;
        }
        o00.f48461OooO00o.OooO0Oo(this.f44257OooO0Oo.f22909OooooO0.getData().get(i));
    }
}
