package p487o0o00O;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.main.SettingActivity;
import com.yalla.yalla.ui.screen.user.RoomThemeMineScreen;
import kotlin.jvm.internal.Intrinsics;
import p107o000ooO0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOO00O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48903OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48904OooO0o0;

    public /* synthetic */ oOO00O(Object obj, int i) {
        this.f48903OooO0Oo = i;
        this.f48904OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f48903OooO0Oo;
        Object obj2 = this.f48904OooO0o0;
        switch (i) {
            case 0:
                SettingActivity this$0 = (SettingActivity) obj2;
                int i2 = SettingActivity.f25078OooOo00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            default:
                RoomThemeMineScreen.MainContent$lambda$0((OooOOOO) obj2, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
