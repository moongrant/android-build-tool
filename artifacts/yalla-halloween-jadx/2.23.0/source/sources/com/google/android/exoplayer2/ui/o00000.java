package com.google.android.exoplayer2.ui;

import android.view.View;
import com.yalla.yalla.model.share.ShareChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f14074OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f14075OooO0o0;

    public /* synthetic */ o00000(Object obj, int i) {
        this.f14074OooO0Oo = i;
        this.f14075OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ShareChannel shareChannel;
        int i = this.f14074OooO0Oo;
        Object obj = this.f14075OooO0o0;
        switch (i) {
            case 0:
                o0000.OooO00o((o0000) obj, view);
                break;
            case 1:
                com.twitter.sdk.android.tweetcomposer.OooO00o.this.OooO00o();
                break;
            default:
                p648o0ooo.oo0o0Oo this$0 = (p648o0ooo.oo0o0Oo) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (Intrinsics.areEqual(view, this$0.OooOO0().f59027OooO0OO)) {
                    shareChannel = ShareChannel.Friends;
                } else if (Intrinsics.areEqual(view, this$0.OooOO0().f59029OooO0o)) {
                    shareChannel = ShareChannel.Moments;
                } else if (Intrinsics.areEqual(view, this$0.OooOO0().f59026OooO0O0)) {
                    shareChannel = ShareChannel.Facebook;
                } else if (Intrinsics.areEqual(view, this$0.OooOO0().f59032OooO0oo)) {
                    shareChannel = ShareChannel.Twitter;
                } else if (Intrinsics.areEqual(view, this$0.OooOO0().f59028OooO0Oo)) {
                    shareChannel = ShareChannel.Instagram;
                } else {
                    shareChannel = Intrinsics.areEqual(view, this$0.OooOO0().f59024OooO) ? ShareChannel.WhatsApp : null;
                }
                p648o0ooo.o0O0O00 o0o0o00 = this$0.f59804OooOOOO;
                o0o0o00.getClass();
                if (shareChannel != null) {
                    switch (o0ooo.o0O0O00.OooO0O0.$EnumSwitchMapping$0[shareChannel.ordinal()]) {
                        case 1:
                            p648o0ooo.o00Oo0 o00oo1 = o0o0o00.f59773OooO0oO;
                            if (o00oo1 != null) {
                                o00oo1.OooO00o(o0o0o00.f59767OooO00o);
                            }
                            break;
                        case 2:
                            p648o0ooo.o0OO00O o0oo00o2 = o0o0o00.f59771OooO0o;
                            if (o0oo00o2 != null) {
                                o0oo00o2.OooO00o(o0o0o00.f59767OooO00o);
                            }
                            break;
                        case 3:
                            p648o0ooo.o000oOoO o000oooo2 = o0o0o00.f59768OooO0O0;
                            if (o000oooo2 != null) {
                                o000oooo2.OooO00o(o0o0o00.f59767OooO00o);
                            }
                            break;
                        case 4:
                            p648o0ooo.o000000 o000000Var = o0o0o00.f59769OooO0OO;
                            if (o000000Var != null) {
                                o000000Var.OooO00o(o0o0o00.f59767OooO00o);
                            }
                            break;
                        case 5:
                            p648o0ooo.oo000o oo000oVar = o0o0o00.f59772OooO0o0;
                            if (oo000oVar != null) {
                                oo000oVar.OooO0O0(o0o0o00.f59767OooO00o);
                            }
                            break;
                        case 6:
                            p648o0ooo.o00000O0 o00000o1 = o0o0o00.f59770OooO0Oo;
                            if (o00000o1 != null) {
                                o00000o1.OooO00o(o0o0o00.f59767OooO00o);
                            }
                            break;
                    }
                }
                this$0.OooO0O0();
                break;
        }
    }
}
