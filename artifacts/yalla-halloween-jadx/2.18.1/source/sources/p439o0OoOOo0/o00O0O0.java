package p439o0OoOOo0;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.twitter.sdk.android.tweetui.OooO00o;
import java.util.Objects;
import p418o0Oo0oo.oo000o;
import p433o0OoOO0o.o0oO0Ooo;
import p438o0OoOOo.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0 extends o0000O0O {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o000O000 f40162OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f40163OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(int i, int i2, o000O000 o000o001, o0000O0O o0000o0o2) {
        super(i, i2);
        this.f40162OoooO0 = o000o001;
        this.f40163OoooO0O = o0000o0o2;
    }

    @Override // android.text.style.ClickableSpan, p438o0OoOOo.o000OO
    public final void onClick(View view) {
        o000O000 o000o001 = this.f40162OoooO0;
        if (o000o001 == null) {
            return;
        }
        String str = this.f40163OoooO0O.f40133OooO0Oo;
        OooO00o oooO00o = (OooO00o) ((o00000O0) o000o001).f40120OooO0o0;
        Objects.requireNonNull(oooO00o);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        oOO00O ooo00o = oooO00o.f20104Oooo0oo;
        if (ooo00o != null) {
            ooo00o.OooO00o();
            return;
        }
        if (oo000o.OooO0OO(oooO00o.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(str)))) {
            return;
        }
        o0oO0Ooo.OooO0OO().OooO00o("TweetUi", "Activity cannot be found to open URL");
    }
}
