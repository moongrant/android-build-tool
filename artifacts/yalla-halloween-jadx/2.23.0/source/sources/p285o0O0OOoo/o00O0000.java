package p285o0O0OOoo;

import android.util.Log;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.yalla.yalla.ui.fragment.BadgeNewsFragment;
import java.io.File;
import o0O0OOOo.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0000 implements Continuation, BaseQuickAdapter.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f42185OooO0Oo;

    public /* synthetic */ o00O0000(Object obj) {
        this.f42185OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0OO(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        BadgeNewsFragment.initView$lambda$0((BadgeNewsFragment) this.f42185OooO0Oo, baseQuickAdapter, view, i);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z;
        ((o0O0ooO) this.f42185OooO0Oo).getClass();
        if (task.isSuccessful()) {
            o0000O0 o0000o1 = (o0000O0) task.getResult();
            OooO oooO = OooO.f42075OooO00o;
            oooO.OooO0O0("Crashlytics report successfully enqueued to DataTransport: " + o0000o1.OooO0OO());
            File fileOooO0O0 = o0000o1.OooO0O0();
            if (fileOooO0O0.delete()) {
                oooO.OooO0O0("Deleted report file: " + fileOooO0O0.getPath());
            } else {
                oooO.OooO0Oo("Crashlytics could not delete report file: " + fileOooO0O0.getPath(), null);
            }
            z = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
