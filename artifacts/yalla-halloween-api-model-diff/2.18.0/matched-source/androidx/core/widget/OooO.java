package androidx.core.widget;

import android.media.AudioManager;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.facebook.appevents.suggestedevents.ViewObserver;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.view.MarqueeRecyclerView;
import kotlin.jvm.internal.Intrinsics;
import p539o0o0Oo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f7996Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f7997OoooO00;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f7996Oooo = i;
        this.f7997OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7996Oooo) {
            case 0:
                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) this.f7997OoooO00;
                int i = ContentLoadingProgressBar.f7964OoooO0;
                contentLoadingProgressBar.setVisibility(8);
                break;
            case 1:
                o00Oo0 o00oo1 = (o00Oo0) this.f7997OoooO00;
                AudioManager audioManager = o00oo1.f43913OooO00o;
                if (audioManager != null) {
                    audioManager.setMode(3);
                    o00oo1.f43913OooO00o.startBluetoothSco();
                    o00oo1.f43913OooO00o.setBluetoothScoOn(true);
                    o00oo1.f43913OooO00o.setSpeakerphoneOn(false);
                    break;
                }
                break;
            case 2:
                RoomInfoMemberListFragment.m50initObserve$lambda12$lambda11((RoomInfoMemberListFragment) this.f7997OoooO00);
                break;
            case 3:
                ViewObserver.m158process$lambda0((ViewObserver) this.f7997OoooO00);
                break;
            default:
                BadgeActivity this$0 = (BadgeActivity) this.f7997OoooO00;
                BadgeActivity.OooO00o oooO00o = BadgeActivity.f23302OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MarqueeRecyclerView marqueeRecyclerView = this$0.OooOooO().f49432OooO0O0.f49840OooO0o0;
                Intrinsics.checkNotNullExpressionValue(marqueeRecyclerView, "binding.header.rvBanner");
                o00O0O.OooO0o0(marqueeRecyclerView, this$0.OooOooO().f49432OooO0O0.f49840OooO0o0.getMeasuredWidth() - 1);
                break;
        }
    }
}
