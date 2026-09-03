package o000O0;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.fragment.BadgeNewsFragment;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import p475o0Ooooo0.o0O00oO0;
import p492o0o00OO0.oOO0OO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements o000OoO.o00000O0.OooO00o, Continuation, BaseQuickAdapter.OooO0O0, p559o0oOo.o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f33898OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f33899OooO0o0;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f33898OooO0Oo = i;
        this.f33899OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = this.f33898OooO0Oo;
        Object obj = this.f33899OooO0o0;
        switch (i2) {
            case 2:
                TopicSearchActivity context = (TopicSearchActivity) obj;
                int i3 = TopicSearchActivity.f25947OooOoo0;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (!(context.OooOoO().f13189OooOOoo.get(i).getIsJoin() == 1)) {
                    oOO0OO onLogin = new oOO0OO(context, i);
                    Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    if (!Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                        Activity context2 = com.code.android.util.OooO0O0.OooO0O0();
                        if (context2 != null) {
                            Intrinsics.checkNotNullParameter(context2, "context");
                            context2.startActivity(new Intent(context2, (Class<?>) LoginActivity.class));
                        }
                    } else {
                        onLogin.invoke();
                    }
                } else {
                    TopicInfoModel topicInfoModel = context.OooOoO().f13189OooOOoo.get(i);
                    Intrinsics.checkNotNullExpressionValue(topicInfoModel, "get(...)");
                    TopicInfoModel topicInfo = topicInfoModel;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(topicInfo, "topicInfo");
                    Intent intent = new Intent(context, (Class<?>) TopicDetailActivity.class);
                    intent.putExtra("topic", topicInfo);
                    context.startActivity(intent);
                }
                break;
            default:
                BadgeNewsFragment.initView$lambda$0((BadgeNewsFragment) obj, baseQuickAdapter, view, i);
                break;
        }
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        RoomInfoMemberListFragment.initData$lambda$22((RoomInfoMemberListFragment) this.f33899OooO0o0);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).o000OOo();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z;
        p317o0O0oOoO.o00O0000 o00o0001 = (p317o0O0oOoO.o00O0000) this.f33899OooO0o0;
        o00o0001.getClass();
        if (task.isSuccessful()) {
            p318o0O0oOoo.oo00o oo00oVar = o00o0001.f41962OooO0OO;
            synchronized (oo00oVar) {
                oo00oVar.f42011OooO0OO = Tasks.forResult(null);
            }
            oo00oVar.f42010OooO0O0.OooO00o();
            if (task.getResult() != null) {
                JSONArray jSONArray = ((p318o0O0oOoo.o00O0) task.getResult()).f41975OooO0Oo;
                FirebaseABTesting firebaseABTesting = o00o0001.f41960OooO00o;
                if (firebaseABTesting != null) {
                    try {
                        firebaseABTesting.OooO0OO(p317o0O0oOoO.o00O0000.OooO0Oo(jSONArray));
                    } catch (AbtException e) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
                    } catch (JSONException e2) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
                    }
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
