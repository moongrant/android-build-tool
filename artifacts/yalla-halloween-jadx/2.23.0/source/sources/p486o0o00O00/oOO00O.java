package p486o0o00O00;

import android.widget.Switch;
import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.main.NoticeSettingActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NoticeSettingActivity f48403OooO0Oo;

    public oOO00O(NoticeSettingActivity noticeSettingActivity) {
        this.f48403OooO0Oo = noticeSettingActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        Boolean it = bool;
        NoticeSettingActivity noticeSettingActivity = this.f48403OooO0Oo;
        noticeSettingActivity.OooOo0();
        Switch r0 = noticeSettingActivity.OooOo().f57856OooO0OO.getViews().f58826OooO0o0;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        r0.setChecked(it.booleanValue());
    }
}
