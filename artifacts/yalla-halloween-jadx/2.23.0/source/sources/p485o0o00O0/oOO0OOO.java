package p485o0o00O0;

import android.os.Looper;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
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
import p519o0o0O0oO.oO000O0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OOO extends Lambda implements Function1<List<UserInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f48156OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oO000O0O f48157OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OOO(TopicManagerActivity topicManagerActivity, oO000O0O oo000o0o) {
        super(1);
        this.f48156OooO0Oo = topicManagerActivity;
        this.f48157OooO0o0 = oo000o0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserInfo> list) {
        List<UserInfo> list2 = list;
        TopicManagerActivity topicManagerActivity = this.f48156OooO0Oo;
        if (list2 != null) {
            int i = TopicManagerActivity.f26382OooOoO;
            topicManagerActivity.OooOo().OooO0O0(list2);
            topicManagerActivity.OooOo().notifyDataSetChanged();
            LiveEventBus.get("TOPIC_MANAGER_ADD").post(list2.get(0));
        }
        TopicManagerActivity.OooOoO0(topicManagerActivity);
        MutableState<Boolean> mutableState = this.f48157OooO0o0.f52805OooO0o0;
        if (mutableState != null) {
            mutableState.setValue(Boolean.FALSE);
        }
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.topic_info_manage_add_admin_success);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        return Unit.INSTANCE;
    }
}
