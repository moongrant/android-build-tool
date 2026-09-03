package p519o0o0O0oO;

import com.yalla.yalla.model.chat.ChatModel;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends Lambda implements Function0<ChatModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ w0 f53165OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var) {
        super(0);
        this.f53165OooO0Oo = w0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ChatModel invoke() {
        w0 w0Var = this.f53165OooO0Oo;
        List<ChatModel> list = w0Var.f53182OooOOO0;
        int size = list.size();
        int i = w0Var.f53181OooOOO;
        if (size > i) {
            return list.get(i);
        }
        return null;
    }
}
