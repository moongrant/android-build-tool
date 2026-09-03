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
public final class o0Oo0oo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TextView f45102Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Conversation f45103Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(TextView textView, Conversation conversation) {
        super(1);
        this.f45102Oooo0o = textView;
        this.f45103Oooo0oO = conversation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        this.f45102Oooo0o.setText(this.f45103Oooo0oO.getIsAcceptMsg() ? OooOo.OooO00o(o000O0O0.OooO0OO(R.string.message_xx_get_you_theme), str2) : OooOo.OooO00o(o000O0O0.OooO0OO(R.string.message_you_get_xx_theme), str2));
        return null;
    }
}
