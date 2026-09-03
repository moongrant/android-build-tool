package p579o0oOoo;

import com.yalla.yalla.model.SystemConversationModel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class oOo0000O extends Lambda implements Function2<SystemConversationModel, SystemConversationModel, Integer> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oOo0000O f56697OooO0Oo = new oOo0000O();

    public oOo0000O() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(SystemConversationModel systemConversationModel, SystemConversationModel systemConversationModel2) {
        SystemConversationModel o1 = systemConversationModel;
        SystemConversationModel o2 = systemConversationModel2;
        Intrinsics.checkNotNullParameter(o1, "o1");
        Intrinsics.checkNotNullParameter(o2, "o2");
        return Integer.valueOf(o1.getTime() - o2.getTime() > 0 ? -1 : 1);
    }
}
