package p538o0o0Oo0;

import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p100o000oOoO.o0O00OO;
import p139o00OOOo0.o00000O0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0oO0 extends Lambda implements Function1<List<UserInfo>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f44039Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f44040Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0oO0(TopicManagerActivity topicManagerActivity, o00000O0 o00000o1) {
        super(1);
        this.f44039Oooo0o = topicManagerActivity;
        this.f44040Oooo0oO = o00000o1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserInfo> list) {
        List<UserInfo> list2 = list;
        if (list2 != null) {
            TopicManagerActivity topicManagerActivity = this.f44039Oooo0o;
            TopicManagerActivity.OooO00o oooO00o = TopicManagerActivity.f22638Oooooo;
            topicManagerActivity.OooOoo().addData(list2);
            topicManagerActivity.OooOoo().notifyDataSetChanged();
            LiveEventBus.get("TOPIC_MANAGER_ADD").post(list2.get(0));
        }
        TopicManagerActivity.Oooo00O(this.f44039Oooo0o);
        o0O00OO<Boolean> o0o00oo2 = this.f44040Oooo0oO.f31752OooO0o0;
        if (o0o00oo2 != null) {
            o0o00oo2.setValue(Boolean.FALSE);
        }
        String strOooO0OO = o000O0O0.OooO0OO(R.string.topic_info_manage_add_admin_success);
        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
            }
        }
        return Unit.INSTANCE;
    }
}
