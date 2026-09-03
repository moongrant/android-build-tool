package androidx.media3.session;

import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import p238o00oOooo.o0OO00OO;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9301OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9302OooO0o0;

    public /* synthetic */ o0000oo(Object obj, int i) {
        this.f9301OooO0Oo = i;
        this.f9302OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9301OooO0Oo;
        Object obj = this.f9302OooO0o0;
        switch (i) {
            case 0:
                ((o000oOoO) obj).release();
                break;
            case 1:
                final p246o00oo0Oo.o000O00 o000o01 = (p246o00oo0Oo.o000O00) obj;
                o000o01.getClass();
                o000o01.f40141OooO0Oo.OooO0OO(new o00oo0o.o000O00.OooO00o() { // from class: o00oo0Oo.o000Oo0
                    @Override // o00oo0o.o000O00.OooO00o
                    public final Object OooO0OO() {
                        o000O00 o000o02 = o000o01;
                        Iterator it = o000o02.f40139OooO0O0.OooOo0O().iterator();
                        while (it.hasNext()) {
                            o000o02.f40140OooO0OO.OooO00o((o0OO00OO) it.next(), 1);
                        }
                        return null;
                    }
                });
                break;
            default:
                MomentDetailActivity this$0 = (MomentDetailActivity) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i2 = MomentDetailActivity.f25608Oooo0;
                this$0.OooOoOO().commentReplaceCid();
                break;
        }
    }
}
