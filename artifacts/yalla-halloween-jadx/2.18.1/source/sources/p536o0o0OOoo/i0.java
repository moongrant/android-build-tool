package p536o0o0OOoo;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import java.util.ArrayList;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p255o00ooO0o.o00O0;
import p464o0Ooo0oO.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends Lambda implements Function3<o0000O0O<ChatMessage>, View, Integer, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43799Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(PrivateChatActivity privateChatActivity) {
        super(3);
        this.f43799Oooo0o = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(o0000O0O<ChatMessage> o0000o0o2, View view, Integer num) {
        o0000O0O<ChatMessage> chatMessageBasePagingAdapter = o0000o0o2;
        Integer num2 = num;
        Intrinsics.checkNotNullParameter(chatMessageBasePagingAdapter, "chatMessageBasePagingAdapter");
        Intrinsics.checkNotNull(num2);
        ChatMessage data = chatMessageBasePagingAdapter.getData(num2.intValue());
        ArrayList arrayList = new ArrayList();
        if (data.getContentType() == 1) {
            MoreTag moreTag = MoreTag.copy;
            arrayList.add(new MoreModel(OooOOO.OooO0OO(moreTag.getText()), moreTag));
            if (data.getIsAcceptMsg()) {
                arrayList.add(new MoreModel(OooOOO.OooO0OO(R.string.report), MoreTag.report));
            }
        } else if (data.getContentType() == 2 && data.getIsAcceptMsg()) {
            arrayList.add(new MoreModel(OooOOO.OooO0OO(R.string.report), MoreTag.report));
        }
        if (!arrayList.isEmpty()) {
            o00O0 o00o1 = new o00O0(this.f43799Oooo0o);
            o00o1.OooOOo0(arrayList);
            o00o1.OooOOoo(new h0(data, this.f43799Oooo0o, num2));
            o00o1.OooOOO0();
        }
        return Boolean.FALSE;
    }
}
