package p196o00o0Oo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.source.OooO0o;
import com.yalla.yalla.model.SystemConversationModel;
import com.yalla.yalla.ui.activity.message.ActivitiesNoticeActivity;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import com.yalla.yalla.ui.activity.message.SystemMessageActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import com.yalla.yalla.ui.adapter.Oooo000;
import com.yalla.yalla.ui.fragment.message.MessageBoxFragment;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p199o00o0Ooo.o00OOOO0;
import p209o00o0oo0.o00O0OO0;
import p230o00oOoO0.o000O0o;
import p230o00oOoO0.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OO00 implements o00OOOO0.OooO00o, o00O0OO0, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39007OooO0Oo;

    public /* synthetic */ o000OO00(Object obj) {
        this.f39007OooO0Oo = obj;
    }

    @Override // p209o00o0oo0.o00O0OO0
    public final Extractor[] OooO00o(Uri uri, Map map) {
        return OooO0O0();
    }

    public final Extractor[] OooO0O0() {
        OooOo oooOo = (OooOo) this.f39007OooO0Oo;
        Extractor[] extractorArr = new Extractor[1];
        o000O0o.OooO00o oooO00o = o000O0o.f40136OooO00o;
        extractorArr[0] = oooO00o.OooO0O0(oooOo) ? new o000Oo0(oooO00o.OooO00o(oooOo), oooOo) : new OooO0o.OooO0O0(oooOo);
        return extractorArr;
    }

    @Override // o00o0Ooo.o00OOOO0.OooO00o
    public final Object OooO0OO() {
        ((o00O0000) this.f39007OooO0Oo).f39020OooO.OooO00o();
        return null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Context context;
        MessageBoxFragment this$0 = (MessageBoxFragment) this.f39007OooO0Oo;
        int i2 = MessageBoxFragment.f28501OooOo00;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Oooo000 oooo000 = this$0.f28503OooOOOo;
        if (oooo000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            oooo000 = null;
        }
        SystemConversationModel systemConversationModelOooOOO = oooo000.OooOOO(i);
        if (systemConversationModelOooOOO == null || (context = this$0.getContext()) == null) {
            return;
        }
        int i3 = MessageBoxFragment.OooO00o.$EnumSwitchMapping$0[systemConversationModelOooOOO.getType().ordinal()];
        if (i3 == 1) {
            int i4 = MomentMessageListActivity.f26116OooOoOO;
            MomentMessageListActivity.OooO00o.OooO00o(context);
            return;
        }
        if (i3 == 2) {
            int i5 = SystemMessageActivity.f25764OooOo0o;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) SystemMessageActivity.class));
        } else {
            if (i3 == 3) {
                context.startActivity(new Intent(this$0.getContext(), (Class<?>) ActivitiesNoticeActivity.class));
                return;
            }
            if (i3 == 4) {
                int i6 = YallaTeamMessageActivity.f25774OooOoo0;
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) YallaTeamMessageActivity.class));
            } else {
                if (i3 != 5) {
                    return;
                }
                int i7 = FriendRequestMessageActivity.f25650OooOo0o;
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) FriendRequestMessageActivity.class));
            }
        }
    }
}
