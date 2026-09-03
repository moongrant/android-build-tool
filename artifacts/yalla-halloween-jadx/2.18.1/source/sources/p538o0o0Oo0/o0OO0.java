package p538o0o0Oo0;

import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0 extends Lambda implements Function1<List<UserInfo>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f44027Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0(TopicInfoActivity topicInfoActivity) {
        super(1);
        this.f44027Oooo0o = topicInfoActivity;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserInfo> list) {
        List<UserInfo> list2 = list;
        if (list2 != null) {
            this.f44027Oooo0o.f22628OooooOO.addAll(list2);
        }
        return Unit.INSTANCE;
    }
}
