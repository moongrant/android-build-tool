package com.yalla.yalla.ui.activity.message;

import android.app.Dialog;
import android.view.View;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000oOoO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f25376OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f25377OooO0o0;

    public /* synthetic */ o000oOoO(Object obj, int i) {
        this.f25376OooO0Oo = i;
        this.f25377OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f25376OooO0Oo;
        Object obj = this.f25377OooO0o0;
        switch (i) {
            case 0:
                FriendRequestMessageActivity this$0 = (FriendRequestMessageActivity) obj;
                int i2 = FriendRequestMessageActivity.f25195OooOo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(this$0);
                o000o.OooOOoo(p562o0oOo000.o000000.message_clear_friend_request);
                o000o.OooOo(true);
                o000o.OooOo0(new o0ooOOo(this$0));
                o000o.OooOO0o();
                break;
            case 1:
                p650o0ooo.o00oOoo this$1 = (p650o0ooo.o00oOoo) obj;
                int i3 = p650o0ooo.o00oOoo.f58591OooOO0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Dialog dialog = this$1.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            default:
                MainSearchUserFragment this$2 = (MainSearchUserFragment) obj;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.getVm().clearSearchHistory();
                break;
        }
    }
}
