package com.facebook.appevents;

import android.app.Activity;
import android.content.Context;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.SendMomentLocationPowerView;
import com.yalla.yalla.util.location.LocationInfo;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p255o00ooO0O.o000O0O0;
import p295o0O0Oo0o.o0O0O00;
import p319o0O0oOo.o00;
import p321o0O0oOoO.o00OOO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12736Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f12737OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12738OoooO00;

    public /* synthetic */ OooOOO0(Object obj, Object obj2, int i) {
        this.f12736Oooo = i;
        this.f12738OoooO00 = obj;
        this.f12737OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12736Oooo) {
            case 0:
                AppEventsLoggerImpl.Companion.m117initializeLib$lambda4((Context) this.f12738OoooO00, (AppEventsLoggerImpl) this.f12737OoooO0);
                break;
            case 1:
                o00OOO0.OooO00o oooO00o = (o00OOO0.OooO00o) this.f12738OoooO00;
                o0O0O00 o0o0o00 = (o0O0O00) this.f12737OoooO0;
                Objects.requireNonNull(oooO00o);
                synchronized (o0o0o00) {
                }
                o00OOO0 o00ooo1 = oooO00o.f36863OooO0O0;
                int i = o00.f36680OooO00o;
                o00ooo1.OooOoo0(o0o0o00);
                break;
            default:
                o00Oo00.OooO0OO listener = (o00Oo00.OooO0OO) this.f12738OoooO00;
                SendMomentLocationPowerView this$0 = (SendMomentLocationPowerView) this.f12737OoooO0;
                int i2 = SendMomentLocationPowerView.OooO00o.f25199OoooO0O;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Activity activity = this$0.f25188OoooO0;
                if (activity == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activity");
                    activity = null;
                }
                LocationInfo locationInfo = new LocationInfo(activity);
                locationInfo.setToLocationInfo(false);
                locationInfo.setCity(o000O0O0.OooO0OO(R.string.Null_Location_Info));
                locationInfo.setCountryCode("");
                listener.OooO00o(locationInfo);
                break;
        }
    }
}
