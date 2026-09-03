package p536o0o0OOoo;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends Lambda implements Function3<Boolean, Integer, View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43868Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(PrivateChatActivity privateChatActivity) {
        super(3);
        this.f43868Oooo0o = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Boolean bool, Integer num, View view) {
        boolean zBooleanValue = bool.booleanValue();
        num.intValue();
        this.f43868Oooo0o.f22180o00Oo0.OooO00o();
        if (zBooleanValue) {
            this.f43868Oooo0o.OooOooO();
            o0O00000.OooO0OO("Message_chat_keyboard");
            PrivateChatActivity.OooOoo(this.f43868Oooo0o, true);
        } else {
            PrivateChatActivity privateChatActivity = this.f43868Oooo0o;
            PrivateChatActivity.OooOoo(privateChatActivity, privateChatActivity.Oooo00o().f49094OooO0OO.isEmojiPanel);
        }
        this.f43868Oooo0o.Oooo00o().f49097OooO0o0.f49549OooO0Oo.setImageResource(zBooleanValue ? R.drawable.icon_emoji : R.drawable.icon_keyboard);
        PrivateChatActivity privateChatActivity2 = this.f43868Oooo0o;
        privateChatActivity2.f22181o00Ooo = !zBooleanValue;
        privateChatActivity2.Oooo0oO();
        return Unit.INSTANCE;
    }
}
