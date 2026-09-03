package p485o0o00O0;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Observer;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p203o00o0o0o.o0O000Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO implements Observer<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47821OooO0Oo;

    public o000OO(MomentDetailActivity momentDetailActivity) {
        this.f47821OooO0Oo = momentDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        Long l2 = l;
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        MomentDetailActivity momentDetailActivity = this.f47821OooO0Oo;
        if (Intrinsics.areEqual(momentDetailActivity, activityOooO0O0)) {
            int i = MomentDetailActivity.f26057Oooo0;
            MomentDetailModel momentDetailModel = (MomentDetailModel) o0O000Oo.OooO00o(momentDetailActivity);
            if (Intrinsics.areEqual(l2, momentDetailModel != null ? Long.valueOf(momentDetailModel.getId()) : null)) {
                momentDetailActivity.finish();
            }
        }
    }
}
