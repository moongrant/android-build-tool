package p650o0ooo;

import com.yalla.yalla.model.chat.ChatModel;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends Lambda implements Function0<ChatModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ a1 f59223OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(a1 a1Var) {
        super(0);
        this.f59223OooO0Oo = a1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ChatModel invoke() {
        a1 a1Var = this.f59223OooO0Oo;
        List<ChatModel> list = a1Var.f58143OooOOO0;
        int size = list.size();
        int i = a1Var.f58142OooOOO;
        if (size > i) {
            return list.get(i);
        }
        return null;
    }
}
