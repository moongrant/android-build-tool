package p563o0oOo0;

import android.widget.TextView;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.db.table.Conversation;
import com.yalla.yalla.model.MomentToShareFriend;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TextView f45089Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Conversation f45090Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(TextView textView, Conversation conversation) {
        super(1);
        this.f45089Oooo0o = textView;
        this.f45090Oooo0oO = conversation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        this.f45089Oooo0o.setText(this.f45090Oooo0oO.getIsAcceptMsg() ? OooOo.OooO00o(o000O0O0.OooO0OO(R.string.XXX_shared_a_post_with_you), str2) : OooOo.OooO00o(o000O0O0.OooO0OO(R.string.You_shared_a_post_with_XXX), str2));
        if (this.f45090Oooo0oO.getMomentType() != MomentToShareFriend.Poll.getValue()) {
            return null;
        }
        this.f45089Oooo0o.setText(this.f45090Oooo0oO.getIsAcceptMsg() ? OooOo.OooO00o(o000O0O0.OooO0OO(R.string.moment_poll_share_from_user), str2) : OooOo.OooO00o(o000O0O0.OooO0OO(R.string.moment_poll_share_to_user), str2));
        return null;
    }
}
