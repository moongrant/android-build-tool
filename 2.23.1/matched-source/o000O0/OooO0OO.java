package o000O0;

import android.content.Intent;
import android.os.Parcelable;
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
import com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.fragment.BadgeNewsFragment;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import p569o0oOo0Oo.o0O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements o000OoO.o00000.OooO00o, Continuation, BaseQuickAdapter.OooO0O0, BaseQuickAdapter.OooO0o, o0O0OO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f33894OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f33895OooO0o0;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f33894OooO0Oo = i;
        this.f33895OooO0o0 = obj;
    }

    @Override // p569o0oOo0Oo.o0O0OO0
    public final void OooO0Oo() {
        RoomInfoMemberListFragment.initData$lambda$21((RoomInfoMemberListFragment) this.f33895OooO0o0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TopicSearchActivity context = (TopicSearchActivity) this.f33895OooO0o0;
        int i2 = TopicSearchActivity.f25949OooOoo0;
        Intrinsics.checkNotNullParameter(context, "this$0");
        TopicInfoModel topicInfoModel = context.OooOoO().f13200OooOOoo.get(i);
        Intrinsics.checkNotNullExpressionValue(topicInfoModel, "get(...)");
        TopicInfoModel topicInfo = topicInfoModel;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(topicInfo, "topicInfo");
        Intent intent = new Intent(context, (Class<?>) TopicDetailActivity.class);
        intent.putExtra("topic", topicInfo);
        context.startActivity(intent);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0o0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = this.f33894OooO0Oo;
        Object obj = this.f33895OooO0o0;
        switch (i2) {
            case 2:
                PhoneCountryCodeSelectActivity this$0 = (PhoneCountryCodeSelectActivity) obj;
                int i3 = PhoneCountryCodeSelectActivity.f24798OooOoO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intent intent = new Intent();
                p490o0o00O0.o00O0OO o00o0oo2 = this$0.f24800OooOo;
                if (o00o0oo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    o00o0oo2 = null;
                }
                intent.putExtra("DATA", (Parcelable) o00o0oo2.f13200OooOOoo.get(i));
                this$0.setResult(-1, intent);
                this$0.finish();
                break;
            default:
                BadgeNewsFragment.initView$lambda$0((BadgeNewsFragment) obj, baseQuickAdapter, view, i);
                break;
        }
    }

    @Override // o000OoO.o00000.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).o0O0O00();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z;
        p318o0O0oOoO.o00O0000 o00o0001 = (p318o0O0oOoO.o00O0000) this.f33895OooO0o0;
        o00o0001.getClass();
        if (task.isSuccessful()) {
            p319o0O0oOoo.oo00o oo00oVar = o00o0001.f41957OooO0OO;
            synchronized (oo00oVar) {
                oo00oVar.f42006OooO0OO = Tasks.forResult(null);
            }
            oo00oVar.f42005OooO0O0.OooO00o();
            if (task.getResult() != null) {
                JSONArray jSONArray = ((p319o0O0oOoo.o00O0) task.getResult()).f41970OooO0Oo;
                FirebaseABTesting firebaseABTesting = o00o0001.f41955OooO00o;
                if (firebaseABTesting != null) {
                    try {
                        firebaseABTesting.OooO0OO(p318o0O0oOoO.o00O0000.OooO0Oo(jSONArray));
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
