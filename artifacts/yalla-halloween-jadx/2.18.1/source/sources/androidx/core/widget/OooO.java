package androidx.core.widget;

import android.media.AudioManager;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.facebook.appevents.suggestedevents.ViewObserver;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.view.MarqueeRecyclerView;
import kotlin.jvm.internal.Intrinsics;
import p537o0o0Oo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f7981Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f7982Oooo0oO;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f7981Oooo0o = i;
        this.f7982Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7981Oooo0o) {
            case 0:
                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) this.f7982Oooo0oO;
                int i = ContentLoadingProgressBar.f7949Oooo0oo;
                contentLoadingProgressBar.setVisibility(8);
                break;
            case 1:
                o00O0O o00o0o2 = (o00O0O) this.f7982Oooo0oO;
                AudioManager audioManager = o00o0o2.f43898OooO00o;
                if (audioManager != null) {
                    audioManager.setMode(3);
                    o00o0o2.f43898OooO00o.startBluetoothSco();
                    o00o0o2.f43898OooO00o.setBluetoothScoOn(true);
                    o00o0o2.f43898OooO00o.setSpeakerphoneOn(false);
                    break;
                }
                break;
            case 2:
                RoomInfoMemberListFragment.m50initObserve$lambda12$lambda11((RoomInfoMemberListFragment) this.f7982Oooo0oO);
                break;
            case 3:
                ViewObserver.m158process$lambda0((ViewObserver) this.f7982Oooo0oO);
                break;
            default:
                BadgeActivity this$0 = (BadgeActivity) this.f7982Oooo0oO;
                BadgeActivity.OooO00o oooO00o = BadgeActivity.f23283OooooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MarqueeRecyclerView marqueeRecyclerView = this$0.OooOooO().f49495OooO0O0.f49903OooO0o0;
                Intrinsics.checkNotNullExpressionValue(marqueeRecyclerView, "binding.header.rvBanner");
                com.yalla.support.common.util.o00O0O.OooO0o0(marqueeRecyclerView, this$0.OooOooO().f49495OooO0O0.f49903OooO0o0.getMeasuredWidth() - 1);
                break;
        }
    }
}
