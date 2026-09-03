package p492o0o00O0O;

import android.widget.Switch;
import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.main.NoticeSettingActivity;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import com.yalla.yalla.ui.screen.user.RoomThemeCustomScreen;
import kotlin.jvm.internal.Intrinsics;
import p107o000ooO0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O00OO implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48950OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48951OooO0o0;

    public /* synthetic */ o00O00OO(Object obj, int i) {
        this.f48950OooO0Oo = i;
        this.f48951OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f48950OooO0Oo;
        Object obj2 = this.f48951OooO0o0;
        switch (i) {
            case 0:
                NoticeSettingActivity this$0 = (NoticeSettingActivity) obj2;
                Boolean bool = (Boolean) obj;
                int i2 = NoticeSettingActivity.f24975OooOo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Switch r0 = this$0.OooOo().f45570OooO0Oo.getViews().f43938OooO0o0;
                Intrinsics.checkNotNull(bool);
                r0.setChecked(bool.booleanValue());
                break;
            case 1:
                MainSearchRoomFragment.observerSearchText$lambda$0((MainSearchRoomFragment) obj2, (String) obj);
                break;
            default:
                RoomThemeCustomScreen.MainContent$lambda$0((OooOOOO) obj2, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
