package com.twitter.sdk.android.tweetcomposer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.o0OOO0o;
import p350o0OOOOoo.o000OOo;
import p350o0OOOOoo.o0O0O00;
import p350o0OOOOoo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public class ComposerActivity extends Activity {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public com.twitter.sdk.android.tweetcomposer.OooO00o f21762OooO0Oo;

    public interface OooO00o {
    }

    public class OooO0O0 implements OooO00o {
        public OooO0O0() {
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        this.f21762OooO0Oo.OooO00o();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        o0OOO0o o0ooo0o2 = new o0OOO0o(-1L, (TwitterAuthToken) intent.getParcelableExtra("EXTRA_USER_TOKEN"), "");
        Uri uri = (Uri) intent.getParcelableExtra("EXTRA_IMAGE_URI");
        String stringExtra = intent.getStringExtra("EXTRA_TEXT");
        String stringExtra2 = intent.getStringExtra("EXTRA_HASHTAGS");
        setTheme(intent.getIntExtra("EXTRA_THEME", o000OOo.ComposerLight));
        setContentView(o0O0O00.tw__activity_composer);
        this.f21762OooO0Oo = new com.twitter.sdk.android.tweetcomposer.OooO00o((ComposerView) findViewById(oo0o0Oo.tw__composer_view), o0ooo0o2, uri, stringExtra, stringExtra2, new OooO0O0());
    }
}
