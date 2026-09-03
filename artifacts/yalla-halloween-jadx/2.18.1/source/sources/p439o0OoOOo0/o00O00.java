package p439o0OoOOo0;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import com.twitter.sdk.android.core.models.User;
import p418o0Oo0oo.oo000o;
import p433o0OoOO0o.o0oO0Ooo;
import p436o0OoOOOO.o0O00OOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0O00OOO f40152Oooo0o;

    public o00O00(o0O00OOO o0o00ooo2) {
        this.f40152Oooo0o = o0o00ooo2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        User user;
        Context context = view.getContext();
        Resources resources = view.getResources();
        o0O00OOO o0o00ooo2 = this.f40152Oooo0o;
        if (o0o00ooo2 == null || (user = o0o00ooo2.f40031OooOooO) == null) {
            return;
        }
        String string = resources.getString(o00oOoo.tw__share_subject_format, user.f20030OooooOO, user.f20042o00oO0o);
        int i = o00oOoo.tw__share_content_format;
        o0O00OOO o0o00ooo3 = this.f40152Oooo0o;
        String string2 = resources.getString(i, o0o00ooo3.f40031OooOooO.f20042o00oO0o, Long.toString(o0o00ooo3.f40002OooO));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", string);
        intent.putExtra("android.intent.extra.TEXT", string2);
        intent.setType("text/plain");
        if (oo000o.OooO0OO(context, Intent.createChooser(intent, resources.getString(o00oOoo.tw__share_tweet)))) {
            return;
        }
        o0oO0Ooo.OooO0OO().OooO00o("TweetUi", "Activity cannot be found to handle share intent");
    }
}
