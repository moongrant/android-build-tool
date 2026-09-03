package p563o0oOo0;

import android.widget.TextView;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.db.table.Conversation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TextView f45106Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Conversation f45107Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(TextView textView, Conversation conversation) {
        super(1);
        this.f45106Oooo0o = textView;
        this.f45107Oooo0oO = conversation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        this.f45106Oooo0o.setText(this.f45107Oooo0oO.getIsAcceptMsg() ? OooOo.OooO00o(o000O0O0.OooO0OO(R.string.message_XX_shared_a_activity_with_you), str2) : OooOo.OooO00o(o000O0O0.OooO0OO(R.string.message_You_shared_a_user_with_XX), str2));
        return null;
    }
}
