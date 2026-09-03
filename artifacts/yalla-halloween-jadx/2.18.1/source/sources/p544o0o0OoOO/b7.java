package p544o0o0OoOO;

import android.view.View;
import com.app.base.model.MusicSelecterModel;
import com.yalla.yalla.ui.activity.room.SelectMusicActivity;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b7 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SelectMusicActivity f44210Oooo0o;

    public b7(SelectMusicActivity selectMusicActivity) {
        this.f44210Oooo0o = selectMusicActivity;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.app.base.model.MusicSelecterModel>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList, java.util.List<com.app.base.model.MusicSelecterModel>] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SelectMusicActivity selectMusicActivity = this.f44210Oooo0o;
        selectMusicActivity.f23029Ooooo00 = !selectMusicActivity.f23029Ooooo00;
        Iterator it = selectMusicActivity.f23028OoooOoo.iterator();
        while (it.hasNext()) {
            ((MusicSelecterModel) it.next()).select = selectMusicActivity.f23029Ooooo00;
        }
        selectMusicActivity.f23030Ooooo0o.notifyDataSetChanged();
        selectMusicActivity.OooOoO(selectMusicActivity.f23029Ooooo00 ? selectMusicActivity.f23028OoooOoo.size() : 0);
    }
}
