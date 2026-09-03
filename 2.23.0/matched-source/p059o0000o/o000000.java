package p059o0000o;

import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.jvm.internal.Intrinsics;
import p609o0oo0OoO.p1;
import p615o0oo0o0o.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34257OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f34258OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34259OooO0o0;

    public /* synthetic */ o000000(int i, Object obj, Object obj2) {
        this.f34257OooO0Oo = i;
        this.f34259OooO0o0 = obj;
        this.f34258OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34257OooO0Oo;
        Object obj = this.f34258OooO0o;
        Object obj2 = this.f34259OooO0o0;
        switch (i) {
            case 1:
                UserDataStore.m4072writeDataIntoCache$lambda0((String) obj2, (String) obj);
                break;
            default:
                oOO00O this$0 = (oOO00O) obj2;
                p1 evaFileContainer = (p1) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(evaFileContainer, "$evaFileContainer");
                try {
                    this$0.OooO0Oo(evaFileContainer);
                    this$0.f57062OooOO0 = false;
                } catch (Throwable tr) {
                    String msg = "Audio exception=" + tr;
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    Intrinsics.checkNotNullParameter(tr, "tr");
                    this$0.OooO0O0();
                    return;
                }
                break;
        }
    }
}
