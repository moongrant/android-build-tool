package com.facebook.appevents;

import android.app.Activity;
import android.content.Context;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.SendMomentLocationPowerView;
import com.yalla.yalla.util.location.LocationInfo;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.o000O0O0;
import p294o0O0Oo0o.o0O0O00;
import p318o0O0oOo.o000OOo0;
import p320o0O0oOoO.o00OOO0O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12720Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12721Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f12722Oooo0oo;

    public /* synthetic */ OooOOO0(Object obj, Object obj2, int i) {
        this.f12720Oooo0o = i;
        this.f12721Oooo0oO = obj;
        this.f12722Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12720Oooo0o) {
            case 0:
                AppEventsLoggerImpl.Companion.m117initializeLib$lambda4((Context) this.f12721Oooo0oO, (AppEventsLoggerImpl) this.f12722Oooo0oo);
                break;
            case 1:
                o00OOO0O.OooO00o oooO00o = (o00OOO0O.OooO00o) this.f12721Oooo0oO;
                o0O0O00 o0o0o00 = (o0O0O00) this.f12722Oooo0oo;
                Objects.requireNonNull(oooO00o);
                synchronized (o0o0o00) {
                }
                o00OOO0O o00ooo0o2 = oooO00o.f36831OooO0O0;
                int i = o000OOo0.f36740OooO00o;
                o00ooo0o2.OooOoo0(o0o0o00);
                break;
            default:
                o00Oo00.OooO0OO listener = (o00Oo00.OooO0OO) this.f12721Oooo0oO;
                SendMomentLocationPowerView this$0 = (SendMomentLocationPowerView) this.f12722Oooo0oo;
                int i2 = SendMomentLocationPowerView.OooO00o.f25180Oooo;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Activity activity = this$0.f25170Oooo0oo;
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
