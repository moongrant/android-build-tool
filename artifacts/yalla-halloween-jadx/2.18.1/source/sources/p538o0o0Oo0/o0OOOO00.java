package p538o0o0Oo0;

import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOOO00 extends Lambda implements Function1<List<UserInfo>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f44053Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO00(TopicManagerActivity topicManagerActivity) {
        super(1);
        this.f44053Oooo0o = topicManagerActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserInfo> list) {
        TopicManagerActivity topicManagerActivity = this.f44053Oooo0o;
        TopicManagerActivity.OooO00o oooO00o = TopicManagerActivity.f22638Oooooo;
        topicManagerActivity.OooOoo().setNewData(list);
        TopicManagerActivity.Oooo00O(this.f44053Oooo0o);
        return Unit.INSTANCE;
    }
}
