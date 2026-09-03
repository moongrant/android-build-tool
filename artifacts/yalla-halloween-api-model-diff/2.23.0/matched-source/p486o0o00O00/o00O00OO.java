package p486o0o00O00;

import android.widget.Switch;
import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.main.NoticeSettingActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00OO implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NoticeSettingActivity f48304OooO0Oo;

    public o00O00OO(NoticeSettingActivity noticeSettingActivity) {
        this.f48304OooO0Oo = noticeSettingActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        Boolean it = bool;
        int i = NoticeSettingActivity.f25428OooOo0;
        Switch r0 = this.f48304OooO0Oo.OooOo().f57857OooO0Oo.getViews().f58826OooO0o0;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        r0.setChecked(it.booleanValue());
    }
}
