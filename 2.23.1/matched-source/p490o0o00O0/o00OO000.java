package p490o0o00O0;

import android.view.View;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p510o0o00oo0.o0OO;
import p585o0oOoo00.o00000OO;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00OO000 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48797OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48798OooO0o0;

    public /* synthetic */ o00OO000(Object obj, int i) {
        this.f48797OooO0Oo = i;
        this.f48798OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function1<? super ChatModel, Unit> function1;
        int i = this.f48797OooO0Oo;
        Object obj = this.f48798OooO0o0;
        switch (i) {
            case 0:
                PhoneNumberActivity this$0 = (PhoneNumberActivity) obj;
                int i2 = PhoneNumberActivity.f24809OooOoO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                h0.OooO0O0("101060");
                o00000OO.f56622OooO0oO.observe(this$0, new o00OO00O(this$0, 0));
                break;
            case 1:
                o0OO this$1 = (o0OO) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                ChatModel chatModel = this$1.f50632OooOo0o;
                if (chatModel != null && (function1 = this$1.f50616OooO0o0) != null) {
                    function1.invoke(chatModel);
                    break;
                }
                break;
            default:
                RoomInfoMemberListFragment.initView$lambda$5((RoomInfoMemberListFragment) obj, view);
                break;
        }
    }
}
