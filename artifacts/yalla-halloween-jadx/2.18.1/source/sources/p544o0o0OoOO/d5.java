package p544o0o0OoOO;

import OooO00o.OooO00o;
import androidx.lifecycle.Observer;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.ui.activity.room.MusicActivity;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d5 implements Observer<List<MusicTable>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f44222OooO00o;

    public d5(MusicActivity musicActivity) {
        this.f44222OooO00o = musicActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<MusicTable> list) {
        String string;
        List<MusicTable> list2 = list;
        this.f44222OooO00o.f22909OooooO0.setNewData(list2);
        this.f44222OooO00o.f22909OooooO0.setLoadComplete();
        if (list2.size() > 0) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("(");
            sbOooO0o0.append(list2.size());
            sbOooO0o0.append(")");
            string = sbOooO0o0.toString();
        } else {
            string = "";
        }
        this.f44222OooO00o.OooOoO0(this.f44222OooO00o.getString(R.string.title_activity_music) + string);
        this.f44222OooO00o.f22910OooooOO.setVisibility(list2.size() == 0 ? 8 : 0);
    }
}
