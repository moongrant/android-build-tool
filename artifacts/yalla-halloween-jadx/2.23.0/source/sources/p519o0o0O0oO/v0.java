package p519o0o0O0oO;

import com.yalla.yalla.model.chat.ChatModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends Lambda implements Function0<List<ChatModel>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ w0 f53172OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var) {
        super(0);
        this.f53172OooO0Oo = w0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<ChatModel> invoke() {
        ChatModel chatModel;
        w0 w0Var = this.f53172OooO0Oo;
        List<ChatModel> list = w0Var.f53182OooOOO0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = w0Var.f53181OooOOO;
        if (i < 0 || list.size() <= i) {
            chatModel = null;
        } else {
            for (int i2 = i - 1; -1 < i2 && arrayList2.size() < 9; i2--) {
                ChatModel chatModel2 = list.get(i2);
                int type = chatModel2.getType();
                if (type == 0 || type == 7) {
                    arrayList2.add(0, chatModel2);
                }
            }
            chatModel = list.get(i);
            int size = list.size();
            for (int i3 = i + 1; i3 < size && arrayList3.size() < 4; i3++) {
                ChatModel chatModel3 = list.get(i3);
                int type2 = chatModel3.getType();
                if (type2 == 0 || type2 == 7) {
                    arrayList3.add(chatModel3);
                }
            }
        }
        arrayList.addAll(arrayList2);
        if (chatModel != null) {
            arrayList.add(chatModel);
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }
}
