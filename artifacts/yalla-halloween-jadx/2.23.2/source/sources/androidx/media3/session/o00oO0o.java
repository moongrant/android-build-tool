package androidx.media3.session;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00oO0o implements o000OoO.o00000O0.OooO00o, Continuation, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9479OooO0Oo;

    public /* synthetic */ o00oO0o(Object obj) {
        this.f9479OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        com.yalla.yalla.ui.activity.moment.OooOOO0 this_apply = (com.yalla.yalla.ui.activity.moment.OooOOO0) this.f9479OooO0Oo;
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Context context = this_apply.f56423OooOo;
        if (context != null) {
            int i2 = TopicDetailActivity.f25854OooOoOO;
            Object obj = this_apply.f13189OooOOoo.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            TopicDetailActivity.OooO00o.OooO00o(context, (TopicInfoModel) obj);
        }
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlaybackStateChanged(((o00O00O) this.f9479OooO0Oo).f9391OooOoo0);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) throws IOException {
        ((com.google.firebase.messaging.o00Ooo) this.f9479OooO0Oo).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null || (string = bundle.getString("unregistered")) != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if ("RST".equals(string2)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string2 != null) {
            throw new IOException(string2);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
