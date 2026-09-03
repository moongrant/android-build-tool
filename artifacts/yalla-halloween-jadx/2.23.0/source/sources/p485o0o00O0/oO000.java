package p485o0o00O0;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.moment.TopicCreateActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p136o00OOOo0.OooO0OO;
import p519o0o0O0oO.O0000000;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000 implements Observer<OooO0OO> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ O0000000 f48030OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicCreateActivity f48031OooO0o0;

    public oO000(O0000000 o0000000, TopicCreateActivity topicCreateActivity) {
        this.f48030OooO0Oo = o0000000;
        this.f48031OooO0o0 = topicCreateActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(OooO0OO oooO0OO) {
        OooO0OO oooO0OO2 = oooO0OO;
        this.f48030OooO0Oo.OooO00o();
        boolean z = true;
        if (oooO0OO2 != null) {
            Intrinsics.checkNotNull(oooO0OO2);
            String strOooO00o = oooO0OO2.OooO00o();
            TopicCreateActivity topicCreateActivity = this.f48031OooO0o0;
            topicCreateActivity.f26289OooOo0 = strOooO00o;
            topicCreateActivity.OooOoO0();
            return;
        }
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.Image_upload_failed);
        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
            z = false;
        }
        if (z) {
            return;
        }
        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
        }
    }
}
