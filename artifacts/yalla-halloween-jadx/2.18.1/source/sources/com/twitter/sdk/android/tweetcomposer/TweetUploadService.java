package com.twitter.sdk.android.tweetcomposer;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.facebook.internal.security.CertificateUtil;
import com.facebook.share.internal.ShareInternalUtility;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.services.MediaService;
import com.twitter.sdk.android.core.services.StatusesService;
import java.io.File;
import java.util.Objects;
import p433o0OoOO0o.o0O00O;
import p433o0OoOO0o.o0O00o00;
import p433o0OoOO0o.o0O0O0Oo;
import p433o0OoOO0o.o0O0o;
import p433o0OoOO0o.o0O0oo0o;
import p433o0OoOO0o.o0oO0Ooo;
import p436o0OoOOOO.o0O00OOO;
import p437o0OoOOOo.o0O0OO0;
import p437o0OoOOOo.o0O0o00O;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public class TweetUploadService extends IntentService {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0O0 f20082Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Intent f20083Oooo0oO;

    public class OooO00o extends o0O0o<o0O00OOO> {
        public OooO00o() {
        }

        @Override // p433o0OoOO0o.o0O0o
        public final void OooO0OO(TwitterException twitterException) {
            TweetUploadService.this.OooO00o(twitterException);
        }

        @Override // p433o0OoOO0o.o0O0o
        public final void OooO0Oo(o0O00O<o0O00OOO> o0o00o2) {
            TweetUploadService tweetUploadService = TweetUploadService.this;
            long j = o0o00o2.f39934OooO00o.f40002OooO;
            Objects.requireNonNull(tweetUploadService);
            Intent intent = new Intent("com.twitter.sdk.android.tweetcomposer.UPLOAD_SUCCESS");
            intent.putExtra("EXTRA_TWEET_ID", j);
            intent.setPackage(tweetUploadService.getApplicationContext().getPackageName());
            tweetUploadService.sendBroadcast(intent);
            TweetUploadService.this.stopSelf();
        }
    }

    public static class OooO0O0 {
    }

    public TweetUploadService() {
        OooO0O0 oooO0O0 = new OooO0O0();
        super("TweetUploadService");
        this.f20082Oooo0o = oooO0O0;
    }

    public final void OooO00o(TwitterException twitterException) {
        Intent intent = this.f20083Oooo0oO;
        Intent intent2 = new Intent("com.twitter.sdk.android.tweetcomposer.UPLOAD_FAILURE");
        intent2.putExtra("EXTRA_RETRY_INTENT", intent);
        intent2.setPackage(getApplicationContext().getPackageName());
        sendBroadcast(intent2);
        o0oO0Ooo.OooO0OO().OooO0O0("TweetUploadService", "Post Tweet failed", twitterException);
        stopSelf();
    }

    public final void OooO0O0(o0O0O0Oo o0o0o0oo, String str, String str2) {
        Objects.requireNonNull(this.f20082Oooo0o);
        ((StatusesService) o0O0oo0o.OooO0OO().OooO00o(o0o0o0oo).OooO00o(StatusesService.class)).update(str, null, null, null, null, null, null, Boolean.TRUE, str2).OoooOo0(new OooO00o());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0089  */
    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) throws Throwable {
        String path;
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) intent.getParcelableExtra("EXTRA_USER_TOKEN");
        this.f20083Oooo0oO = intent;
        String strSubstring = "";
        o0O0O0Oo o0o0o0oo = new o0O0O0Oo(twitterAuthToken, -1L, "");
        String stringExtra = intent.getStringExtra("EXTRA_TWEET_TEXT");
        Uri uri = (Uri) intent.getParcelableExtra("EXTRA_IMAGE_URI");
        if (uri == null) {
            OooO0O0(o0o0o0oo, stringExtra, null);
            return;
        }
        o0O0o00O o0o0o00o = new o0O0o00O(this, o0o0o0oo, stringExtra);
        Objects.requireNonNull(this.f20082Oooo0o);
        o0O00o00 o0o00o00OooO00o = o0O0oo0o.OooO0OO().OooO00o(o0o0o0oo);
        if ("com.android.providers.media.documents".equalsIgnoreCase(uri.getAuthority())) {
            String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(CertificateUtil.DELIMITER);
            if ("image".equals(strArrSplit[0])) {
                path = o0O0OO0.OooO00o(this, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{strArrSplit[1]});
            } else {
                path = null;
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            path = o0O0OO0.OooO00o(this, uri, null, null);
        } else if (ShareInternalUtility.STAGING_PARAM.equalsIgnoreCase(uri.getScheme())) {
            path = uri.getPath();
        } else {
            path = null;
        }
        if (path == null) {
            OooO00o(new TwitterException("Uri file path resolved to null"));
            return;
        }
        File file = new File(path);
        String name = file.getName();
        if (name == null) {
            strSubstring = null;
        } else {
            int iLastIndexOf = name.lastIndexOf(".");
            if (iLastIndexOf >= 0) {
                strSubstring = name.substring(iLastIndexOf + 1);
            }
        }
        ((MediaService) o0o00o00OooO00o.OooO00o(MediaService.class)).upload(o0o0Oo.create(o00OO0O0.OooO0OO(!TextUtils.isEmpty(strSubstring) ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strSubstring) : "application/octet-stream"), file), null, null).OoooOo0(o0o0o00o);
    }
}
