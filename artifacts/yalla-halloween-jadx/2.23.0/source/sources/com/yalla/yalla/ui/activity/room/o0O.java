package com.yalla.yalla.ui.activity.room;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f26892OooO0Oo;

    public o0O(VoteGameCreateActivity voteGameCreateActivity) {
        this.f26892OooO0Oo = voteGameCreateActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.InitiateVoteReply");
        long createUserId = ((Room.InitiateVoteReply) obj).getCreateUserId();
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        Long l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
        if (l != null && createUserId == l.longValue()) {
            p587o0oOooo.o0OO000.OooO00o("102106");
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            this.f26892OooO0Oo.finish();
        }
    }
}
