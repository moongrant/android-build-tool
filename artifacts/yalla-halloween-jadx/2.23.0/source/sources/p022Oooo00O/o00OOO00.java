package p022Oooo00O;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.jvm.internal.Intrinsics;
import o000OO.OooOOO0;
import p464o0Oooo.o000000O;
import p485o0o00O0.a;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOO00 implements o00O000.OooO0OO, BaseQuickAdapter.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f649OooO0Oo;

    public /* synthetic */ o00OOO00(Object obj) {
        this.f649OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0OO(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TopicSearchActivity context = (TopicSearchActivity) this.f649OooO0Oo;
        int i2 = TopicSearchActivity.f26398OooOoo0;
        Intrinsics.checkNotNullParameter(context, "this$0");
        if (context.OooOoO().f10111OooOOoo.get(i).getIsJoin() == 1) {
            TopicInfoModel topicInfoModel = context.OooOoO().f10111OooOOoo.get(i);
            Intrinsics.checkNotNullExpressionValue(topicInfoModel, "baseAdapter.data[position]");
            TopicInfoModel topicInfo = topicInfoModel;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(topicInfo, "topicInfo");
            Intent intent = new Intent(context, (Class<?>) TopicDetailActivity.class);
            intent.putExtra("topic", topicInfo);
            context.startActivity(intent);
            return;
        }
        a onLogin = new a(context, i);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity context2 = OooO0O0.OooO0O0();
        if (context2 != null) {
            Intrinsics.checkNotNullParameter(context2, "context");
            context2.startActivity(new Intent(context2, (Class<?>) LoginActivity.class));
        }
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        String str;
        o00OOO0 o00ooo1 = (o00OOO0) this.f649OooO0Oo;
        synchronized (o00ooo1.f629OooO00o) {
            OooOOO0.OooO0o("Release completer expected to be null", o00ooo1.f640OooOOO == null);
            o00ooo1.f640OooOOO = oooO00o;
            str = "Release[session=" + o00ooo1 + "]";
        }
        return str;
    }
}
