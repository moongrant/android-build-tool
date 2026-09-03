package p045Oooooo;

import androidx.camera.core.impl.oo00o;
import androidx.camera.video.internal.BufferProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.jvm.internal.Intrinsics;
import p616o0oo0o00.Oooo0;
import p619o0oo0oO.oO0O0Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1880OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1881OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1882OooO0o0;

    public /* synthetic */ o0000O0O(int i, Object obj, Object obj2) {
        this.f1880OooO0Oo = i;
        this.f1882OooO0o0 = obj;
        this.f1881OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1880OooO0Oo;
        Object obj = this.f1881OooO0o;
        Object obj2 = this.f1882OooO0o0;
        switch (i) {
            case 0:
                ((oo00o.OooO00o) obj2).OooO00o((BufferProvider.State) obj);
                break;
            default:
                oO0O0Oo0 this$0 = (oO0O0Oo0) obj2;
                Oooo0 evaFileContainer = (Oooo0) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(evaFileContainer, "$evaFileContainer");
                try {
                    this$0.OooO0Oo(evaFileContainer);
                    this$0.f57572OooOO0 = false;
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
