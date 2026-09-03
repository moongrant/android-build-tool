package p045Oooooo;

import androidx.camera.core.impl.o00O0;
import androidx.camera.video.internal.BufferProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.jvm.internal.Intrinsics;
import p614o0oo0OoO.q5;
import p620o0oo0o0o.o0o0000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1883OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1884OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1885OooO0o0;

    public /* synthetic */ o0000O0O(int i, Object obj, Object obj2) {
        this.f1883OooO0Oo = i;
        this.f1885OooO0o0 = obj;
        this.f1884OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1883OooO0Oo;
        Object obj = this.f1884OooO0o;
        Object obj2 = this.f1885OooO0o0;
        switch (i) {
            case 0:
                ((o00O0.OooO00o) obj2).OooO00o((BufferProvider.State) obj);
                break;
            default:
                o0o0000 this$0 = (o0o0000) obj2;
                q5 evaFileContainer = (q5) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(evaFileContainer, "$evaFileContainer");
                try {
                    this$0.OooO0Oo(evaFileContainer);
                    this$0.f57167OooOO0 = false;
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
