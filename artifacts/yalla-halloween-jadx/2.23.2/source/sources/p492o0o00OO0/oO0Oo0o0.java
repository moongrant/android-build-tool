package p492o0o00OO0;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p562o0oOo000.o000000;
import p650o0ooo.o0O0oo00;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0o0 extends Lambda implements Function1<List<UserInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f49452OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0oo00 f49453OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0o0(TopicManagerActivity topicManagerActivity, o0O0oo00 o0o0oo00) {
        super(1);
        this.f49452OooO0Oo = topicManagerActivity;
        this.f49453OooO0o0 = o0o0oo00;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserInfo> list) {
        List<UserInfo> list2 = list;
        TopicManagerActivity topicManagerActivity = this.f49452OooO0Oo;
        if (list2 != null) {
            int i = TopicManagerActivity.f25931OooOoO;
            topicManagerActivity.OooOo().OooO0O0(list2);
            topicManagerActivity.OooOo().notifyDataSetChanged();
            LiveEventBus.get("TOPIC_MANAGER_ADD").post(list2.get(0));
        }
        TopicManagerActivity.OooOoO0(topicManagerActivity);
        MutableState<Boolean> mutableState = this.f49453OooO0o0.f58666OooO0o0;
        if (mutableState != null) {
            mutableState.setValue(Boolean.FALSE);
        }
        String strOooO0OO = o0000.OooO0OO(o000000.topic_info_manage_add_admin_success);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        return Unit.INSTANCE;
    }
}
