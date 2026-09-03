package p022Oooo00O;

import androidx.media3.common.Player;
import androidx.media3.session.o00O00O;
import com.facebook.FacebookException;
import com.facebook.internal.FeatureManager;
import p080o000OoO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo0O implements o00O0O0O.OooO00o, o00000O0.OooO00o, FeatureManager.Callback {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f899OooO0Oo;

    public /* synthetic */ oo0O(Object obj) {
        this.f899OooO0Oo = obj;
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        o00O00O o00o00o2 = (o00O00O) this.f899OooO0Oo;
        ((Player.OooO0OO) obj).onDeviceVolumeChanged(o00o00o2.f9383OooOo0, o00o00o2.f9385OooOo0O);
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        FacebookException.m4038_init_$lambda0((String) this.f899OooO0Oo, z);
    }
}
