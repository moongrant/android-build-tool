package p159o00OoOO;

import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.view.BubbleView;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f32415Oooo0o = 20;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f32416Oooo0oO;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BubbleView bubbleView = o0000OO0.this.f32416Oooo0oO.f11787o00Oo0;
            if (bubbleView != null) {
                bubbleView.OooO00o();
            }
        }
    }

    public o0000OO0(MixedRoomActivity mixedRoomActivity) {
        this.f32416Oooo0oO = mixedRoomActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f32415Oooo0o; i++) {
            this.f32416Oooo0oO.runOnUiThread(new OooO00o());
            try {
                Thread.sleep(250L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.f32416Oooo0oO.f11799o0ooOOo = false;
    }
}
