package com.twitter.sdk.android.tweetui;

import android.view.View;
import android.widget.LinearLayout;
import com.code.android.util.o000O;
import com.twitter.sdk.android.tweetui.internal.VideoView;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00Ooo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f21988OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f21989OooO0o0;

    public /* synthetic */ o00Ooo(Object obj, int i) {
        this.f21988OooO0Oo = i;
        this.f21989OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f21988OooO0Oo;
        Object obj = this.f21989OooO0o0;
        switch (i) {
            case 0:
                VideoView videoView = ((oo000o) obj).f21991OooO00o;
                if (!videoView.OooO0OO()) {
                    videoView.OooO0oO();
                } else {
                    videoView.OooO0o0();
                }
                break;
            default:
                ExploreCountryRoomListActivity this$0 = (ExploreCountryRoomListActivity) obj;
                int i2 = ExploreCountryRoomListActivity.f26073OooOoo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                LinearLayout llCountryRoot = this$0.OooOo().f44735OooO0OO.f44780OooO0OO;
                Intrinsics.checkNotNullExpressionValue(llCountryRoot, "llCountryRoot");
                o000O.OooO0O0(llCountryRoot);
                break;
        }
    }
}
