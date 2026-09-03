package p003OooO0o0;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o0OoOo0;
import com.facebook.appevents.codeless.CodelessMatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f123OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f124OooO0o0;

    public /* synthetic */ o000000(Object obj, int i) {
        this.f123OooO0Oo = i;
        this.f124OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f123OooO0Oo;
        Object obj = this.f124OooO0o0;
        switch (i) {
            case 0:
                o0OoOo0 this$0 = (o0OoOo0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0o();
                break;
            default:
                CodelessMatcher.m4083startTracking$lambda1((CodelessMatcher) obj);
                break;
        }
    }
}
