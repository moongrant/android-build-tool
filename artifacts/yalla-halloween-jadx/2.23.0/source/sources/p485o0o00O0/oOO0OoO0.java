package p485o0o00O0;

import android.os.Looper;
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
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OoO0 extends Lambda implements Function1<List<UserInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f48159OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f48160OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f48161OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OoO0(int i, TopicManagerActivity topicManagerActivity, String str) {
        super(1);
        this.f48159OooO0Oo = topicManagerActivity;
        this.f48161OooO0o0 = i;
        this.f48160OooO0o = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserInfo> list) {
        int i = TopicManagerActivity.f26382OooOoO;
        TopicManagerActivity topicManagerActivity = this.f48159OooO0Oo;
        topicManagerActivity.OooOo().OooOOo(this.f48161OooO0o0);
        TopicManagerActivity.OooOoO0(topicManagerActivity);
        LiveEventBus.get("TOPIC_MANAGER_DEL").post(this.f48160OooO0o);
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.Success);
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
