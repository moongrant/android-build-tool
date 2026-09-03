package p022Oooo00O;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import p432o0OoOOOo.o00OOOOo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00000O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f481OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f482OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f483OooO0o0;

    public /* synthetic */ o00000O0(int i, Object obj, Object obj2) {
        this.f481OooO0Oo = i;
        this.f483OooO0o0 = obj;
        this.f482OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f481OooO0Oo;
        Object obj = this.f482OooO0o;
        Object obj2 = this.f483OooO0o0;
        switch (i) {
            case 0:
                o000OO o000oo2 = (o000OO) obj2;
                String str = (String) obj;
                o000oo2.getClass();
                o000oo2.OooOo00("Use case " + str + " INACTIVE", null);
                o000oo2.f550OooO0Oo.OooO0o0(str);
                o000oo2.Oooo0o0();
                break;
            default:
                TextView this_apply = (TextView) obj2;
                o00OOOOo this$0 = (o00OOOOo) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0Oo().f45918OooOoo0 = this_apply.getWidth();
                this$0.OooO0Oo().notifyDataSetChanged();
                break;
        }
    }
}
