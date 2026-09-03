package p509o0o00ooO;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.ui.fragment.room.RoomInfoProfileFragment;
import kotlin.jvm.internal.Intrinsics;
import p650o0ooo.o00OOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n2 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f50742OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f50743OooO0o0;

    public /* synthetic */ n2(Object obj, int i) {
        this.f50742OooO0Oo = i;
        this.f50743OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f50742OooO0Oo;
        Object obj = this.f50743OooO0o0;
        switch (i) {
            case 0:
                ChatModel model = (ChatModel) obj;
                Intrinsics.checkNotNullParameter(model, "$model");
                Context context = o000O00O.f13421OooO00o;
                Activity activityOooO0O0 = OooO0O0.OooO0O0();
                Intrinsics.checkNotNull(activityOooO0O0);
                o00OOOO0 o00oooo1 = new o00OOOO0(activityOooO0O0, false, false, true, true);
                o00oooo1.OooOOo0(new q2(model));
                o00oooo1.OooOO0o();
                break;
            default:
                RoomInfoProfileFragment.initView$lambda$4((RoomInfoProfileFragment) obj, view);
                break;
        }
    }
}
