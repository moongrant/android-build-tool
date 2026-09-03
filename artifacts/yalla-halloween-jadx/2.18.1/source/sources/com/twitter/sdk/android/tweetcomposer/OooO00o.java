package com.twitter.sdk.android.tweetcomposer;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.twitter.sdk.android.core.services.AccountService;
import com.zego.zegoavkit2.ZegoConstants;
import p433o0OoOO0o.o0O0O0Oo;
import p433o0OoOO0o.o0O0oo0o;
import p437o0OoOOOo.o0oO0O0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ComposerView f20075OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0O0Oo f20076OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Uri f20077OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ComposerActivity.OooO00o f20078OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0OO f20079OooO0o0;

    /* JADX INFO: renamed from: com.twitter.sdk.android.tweetcomposer.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0181OooO00o {
    }

    public class OooO0O0 implements InterfaceC0181OooO00o {
        public OooO0O0() {
        }

        public final void OooO00o(String str) {
            Intent intent = new Intent(OooO00o.this.f20075OooO00o.getContext(), (Class<?>) TweetUploadService.class);
            intent.putExtra("EXTRA_USER_TOKEN", OooO00o.this.f20076OooO0O0.OooO00o());
            intent.putExtra("EXTRA_TWEET_TEXT", str);
            intent.putExtra("EXTRA_IMAGE_URI", OooO00o.this.f20077OooO0OO);
            OooO00o.this.f20075OooO00o.getContext().startService(intent);
            ComposerActivity.this.finish();
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.twitter.OooO00o f20081OooO00o = new com.twitter.OooO00o();
    }

    public OooO00o(ComposerView composerView, o0O0O0Oo o0o0o0oo, Uri uri, String str, String str2, ComposerActivity.OooO00o oooO00o) {
        OooO0OO oooO0OO = new OooO0OO();
        this.f20075OooO00o = composerView;
        this.f20076OooO0O0 = o0o0o0oo;
        this.f20077OooO0OO = uri;
        this.f20078OooO0Oo = oooO00o;
        this.f20079OooO0o0 = oooO0OO;
        composerView.setCallbacks(new OooO0O0());
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            if (sb.length() > 0) {
                sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            }
            sb.append(str2);
        }
        composerView.setTweetText(sb.toString());
        AccountService accountService = (AccountService) o0O0oo0o.OooO0OO().OooO00o(o0o0o0oo).OooO00o(AccountService.class);
        Boolean bool = Boolean.FALSE;
        accountService.verifyCredentials(bool, Boolean.TRUE, bool).OoooOo0(new o0oO0O0o(this));
        if (uri != null) {
            composerView.setImageView(uri);
        }
    }

    public final void OooO00o() {
        Intent intent = new Intent("com.twitter.sdk.android.tweetcomposer.TWEET_COMPOSE_CANCEL");
        intent.setPackage(this.f20075OooO00o.getContext().getPackageName());
        this.f20075OooO00o.getContext().sendBroadcast(intent);
        ComposerActivity.this.finish();
    }
}
