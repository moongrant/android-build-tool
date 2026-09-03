package p617o0oo0o;

import com.yalla.yalla.model.SystemConversationModel;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000Ooo implements Comparator {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final /* synthetic */ o0000Ooo f48485Oooo0o = new o0000Ooo();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        SystemConversationModel o1 = (SystemConversationModel) obj;
        SystemConversationModel o2 = (SystemConversationModel) obj2;
        Intrinsics.checkNotNullParameter(o1, "o1");
        Intrinsics.checkNotNullParameter(o2, "o2");
        return o1.getTime() - o2.getTime() > 0 ? -1 : 1;
    }
}
