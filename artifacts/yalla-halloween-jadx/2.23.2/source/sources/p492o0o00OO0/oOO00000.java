package p492o0o00OO0;

import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00000 extends Lambda implements Function1<List<UserInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f49469OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00000(TopicManagerActivity topicManagerActivity) {
        super(1);
        this.f49469OooO0Oo = topicManagerActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserInfo> list) {
        int i = TopicManagerActivity.f25931OooOoO;
        TopicManagerActivity topicManagerActivity = this.f49469OooO0Oo;
        topicManagerActivity.OooOo().OooOoO0(list);
        TopicManagerActivity.OooOoO0(topicManagerActivity);
        return Unit.INSTANCE;
    }
}
