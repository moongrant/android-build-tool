package com.twitter.sdk.android.tweetcomposer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.twitter.sdk.android.core.TwitterAuthToken;
import p433o0OoOO0o.o0O0O0Oo;
import p437o0OoOOOo.o0O0OOOo;
import p437o0OoOOOo.o0O0o000;
import p437o0OoOOOo.oo0OOoo;

/* JADX INFO: loaded from: classes2.dex */
public class ComposerActivity extends Activity {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public com.twitter.sdk.android.tweetcomposer.OooO00o f20061Oooo0o;

    public interface OooO00o {
    }

    public class OooO0O0 implements OooO00o {
        public OooO0O0() {
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        this.f20061Oooo0o.OooO00o();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        o0O0O0Oo o0o0o0oo = new o0O0O0Oo((TwitterAuthToken) intent.getParcelableExtra("EXTRA_USER_TOKEN"), -1L, "");
        Uri uri = (Uri) intent.getParcelableExtra("EXTRA_IMAGE_URI");
        String stringExtra = intent.getStringExtra("EXTRA_TEXT");
        String stringExtra2 = intent.getStringExtra("EXTRA_HASHTAGS");
        setTheme(intent.getIntExtra("EXTRA_THEME", o0O0o000.ComposerLight));
        setContentView(oo0OOoo.tw__activity_composer);
        this.f20061Oooo0o = new com.twitter.sdk.android.tweetcomposer.OooO00o((ComposerView) findViewById(o0O0OOOo.tw__composer_view), o0o0o0oo, uri, stringExtra, stringExtra2, new OooO0O0());
    }
}
