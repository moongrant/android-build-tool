package p466o0OooO0;

import OooO00o.OooO00o;
import android.util.Log;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.OooO0OO;
import com.google.android.exoplayer2.OooOO0;
import com.google.android.exoplayer2.Player;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.yalla.yalla.ui.activity.user.SupportTopActivity;
import com.yalla.yalla.ui.fragment.MainMomentsTopicNewFragment;
import java.io.File;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p228o00oOo.o0000OO0;
import p361o0OOOoOo.o000O000;
import p407o0Oo0OOo.oO000Oo;
import p417o0Oo0oOo.oO00OOO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000Ooo implements OooO0OO.OooO0O0, Continuation, oO00OOO, BaseQuickAdapter.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f40517OooO0Oo;

    public /* synthetic */ o0000Ooo(Object obj) {
        this.f40517OooO0Oo = obj;
    }

    @Override // p417o0Oo0oOo.oO00OOO
    public final void OooO0O0(oO000Oo it) {
        SupportTopActivity this$0 = (SupportTopActivity) this.f40517OooO0Oo;
        SupportTopActivity.OooO00o oooO00o = SupportTopActivity.f23411OooooO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.OooOooO();
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        oooO00o.OooOOO0(((OooOO0.OooO0O0) this.f40517OooO0Oo).f13238Oooo0o.f40560OooO0o);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MainMomentsTopicNewFragment.m359initView$lambda6((MainMomentsTopicNewFragment) this.f40517OooO0Oo, baseQuickAdapter, view, i);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z;
        Objects.requireNonNull((o000O000) this.f40517OooO0Oo);
        if (task.isSuccessful()) {
            p361o0OOOoOo.o0000Ooo o0000ooo = (p361o0OOOoOo.o0000Ooo) task.getResult();
            o0000OO0 o0000oo1 = o0000OO0.f33887OooO00o;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Crashlytics report successfully enqueued to DataTransport: ");
            sbOooO0o0.append(o0000ooo.OooO0OO());
            o0000oo1.OooO0Oo(sbOooO0o0.toString());
            File fileOooO0O0 = o0000ooo.OooO0O0();
            if (fileOooO0O0.delete()) {
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Deleted report file: ");
                sbOooO0o1.append(fileOooO0O0.getPath());
                o0000oo1.OooO0Oo(sbOooO0o1.toString());
            } else {
                StringBuilder sbOooO0o2 = OooO00o.OooO0o0("Crashlytics could not delete report file: ");
                sbOooO0o2.append(fileOooO0O0.getPath());
                o0000oo1.OooOOO0(sbOooO0o2.toString(), null);
            }
            z = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
