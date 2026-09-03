package com.twitter.sdk.android.tweetcomposer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.o0Oo0oo;
import p345o0OOOOo.o00Ooo;
import p345o0OOOOo.o00oO0o;
import p345o0OOOOo.oo000o;

/* JADX INFO: loaded from: classes4.dex */
public class ComposerActivity extends Activity {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public com.twitter.sdk.android.tweetcomposer.OooO00o f22235OooO0Oo;

    public interface OooO00o {
    }

    public class OooO0O0 implements OooO00o {
        public OooO0O0() {
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        this.f22235OooO0Oo.OooO00o();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        o0Oo0oo o0oo0oo2 = new o0Oo0oo(-1L, (TwitterAuthToken) intent.getParcelableExtra("EXTRA_USER_TOKEN"), "");
        Uri uri = (Uri) intent.getParcelableExtra("EXTRA_IMAGE_URI");
        String stringExtra = intent.getStringExtra("EXTRA_TEXT");
        String stringExtra2 = intent.getStringExtra("EXTRA_HASHTAGS");
        setTheme(intent.getIntExtra("EXTRA_THEME", o00oO0o.ComposerLight));
        setContentView(oo000o.tw__activity_composer);
        this.f22235OooO0Oo = new com.twitter.sdk.android.tweetcomposer.OooO00o((ComposerView) findViewById(o00Ooo.tw__composer_view), o0oo0oo2, uri, stringExtra, stringExtra2, new OooO0O0());
    }
}
