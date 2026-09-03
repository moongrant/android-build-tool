package p028Oooo0oO;

import androidx.camera.core.impl.o000O0O0;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.o00000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1113OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1114OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1115OooO0o0;

    public /* synthetic */ o000O00(int i, Object obj, Object obj2) {
        this.f1113OooO0Oo = i;
        this.f1115OooO0o0 = obj;
        this.f1114OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1113OooO0Oo;
        Object obj = this.f1114OooO0o;
        Object obj2 = this.f1115OooO0o0;
        switch (i) {
            case 0:
                o000O00O o000o00o2 = (o000O00O) obj2;
                o000o00o2.getClass();
                ((o000O0O0.OooO00o) obj).OooO00o(o000o00o2);
                return;
            default:
                Runnable command = (Runnable) obj2;
                o00000 this$0 = (o00000) obj;
                Intrinsics.checkNotNullParameter(command, "$command");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                try {
                    command.run();
                    return;
                } finally {
                    this$0.OooO0O0();
                }
        }
    }
}
