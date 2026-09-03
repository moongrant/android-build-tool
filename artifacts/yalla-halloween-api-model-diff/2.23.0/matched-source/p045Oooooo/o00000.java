package p045Oooooo;

import androidx.emoji2.text.Oooo000;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1870OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1871OooO0o0;

    public /* synthetic */ o00000(Object obj, int i) {
        this.f1870OooO0Oo = i;
        this.f1871OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1870OooO0Oo;
        Object obj = this.f1871OooO0o0;
        switch (i) {
            case 0:
                o0000Ooo o0000ooo = (o0000Ooo) obj;
                o0000ooo.f1925OooOoo0 = true;
                if (o0000ooo.f1923OooOoOO) {
                    o0000ooo.f1903OooO0o0.stop();
                    o0000ooo.OooOO0();
                }
                break;
            case 1:
                ((Oooo000.OooO0O0) obj).OooO0OO();
                break;
            default:
                TaskActivity this$0 = (TaskActivity) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i2 = TaskActivity.f25537OooOooO;
                this$0.OooOoO();
                break;
        }
    }
}
