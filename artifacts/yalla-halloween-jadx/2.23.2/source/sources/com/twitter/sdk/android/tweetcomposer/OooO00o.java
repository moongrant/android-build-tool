package com.twitter.sdk.android.tweetcomposer;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.twitter.sdk.android.core.o0OOO0o;
import com.twitter.sdk.android.core.o0ooOOo;
import com.twitter.sdk.android.core.services.AccountService;
import com.zego.zegoavkit2.ZegoConstants;
import p350o0OOOOoo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ComposerView f21776OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OOO0o f21777OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Uri f21778OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ComposerActivity.OooO00o f21779OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0OO f21780OooO0o0;

    /* JADX INFO: renamed from: com.twitter.sdk.android.tweetcomposer.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0280OooO00o {
    }

    public class OooO0O0 implements InterfaceC0280OooO00o {
        public OooO0O0() {
        }

        public final void OooO00o(String str) {
            OooO00o oooO00o = OooO00o.this;
            Intent intent = new Intent(oooO00o.f21776OooO00o.getContext(), (Class<?>) TweetUploadService.class);
            intent.putExtra("EXTRA_USER_TOKEN", oooO00o.f21777OooO0O0.OooO00o());
            intent.putExtra("EXTRA_TWEET_TEXT", str);
            intent.putExtra("EXTRA_IMAGE_URI", oooO00o.f21778OooO0OO);
            oooO00o.f21776OooO00o.getContext().startService(intent);
            ComposerActivity.this.finish();
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.twitter.OooO00o f21782OooO00o = new com.twitter.OooO00o();
    }

    public OooO00o(ComposerView composerView, o0OOO0o o0ooo0o2, Uri uri, String str, String str2, ComposerActivity.OooO0O0 oooO0O0) {
        OooO0OO oooO0OO = new OooO0OO();
        this.f21776OooO00o = composerView;
        this.f21777OooO0O0 = o0ooo0o2;
        this.f21778OooO0OO = uri;
        this.f21779OooO0Oo = oooO0O0;
        this.f21780OooO0o0 = oooO0OO;
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
        AccountService accountService = (AccountService) o0ooOOo.OooO0OO().OooO00o(o0ooo0o2).OooO00o(AccountService.class);
        Boolean bool = Boolean.FALSE;
        accountService.verifyCredentials(bool, Boolean.TRUE, bool).OooOooo(new oo000o(this));
        if (uri != null) {
            composerView.setImageView(uri);
        }
    }

    public final void OooO00o() {
        Intent intent = new Intent("com.twitter.sdk.android.tweetcomposer.TWEET_COMPOSE_CANCEL");
        ComposerView composerView = this.f21776OooO00o;
        intent.setPackage(composerView.getContext().getPackageName());
        composerView.getContext().sendBroadcast(intent);
        ComposerActivity.this.finish();
    }
}
