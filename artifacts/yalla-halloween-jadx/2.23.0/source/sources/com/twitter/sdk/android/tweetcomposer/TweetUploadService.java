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
import com.twitter.sdk.android.core.models.OooOo;
import com.twitter.sdk.android.core.o000oOoO;
import com.twitter.sdk.android.core.o00Oo0;
import com.twitter.sdk.android.core.o00Ooo;
import com.twitter.sdk.android.core.o0OOO0o;
import com.twitter.sdk.android.core.o0Oo0oo;
import com.twitter.sdk.android.core.services.MediaService;
import com.twitter.sdk.android.core.services.StatusesService;
import java.io.File;
import java.util.regex.Pattern;
import p345o0OOOOo.o00O0O;
import p345o0OOOOo.o0ooOOo;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.oo00oO;

/* JADX INFO: loaded from: classes4.dex */
public class TweetUploadService extends IntentService {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f22256OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Intent f22257OooO0o0;

    public class OooO00o extends com.twitter.sdk.android.core.OooO0O0<OooOo> {
        public OooO00o() {
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0OO(TwitterException twitterException) {
            TweetUploadService.this.OooO00o(twitterException);
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0Oo(o000oOoO<OooOo> o000oooo2) {
            long j = o000oooo2.f22205OooO00o.f22064OooO;
            TweetUploadService tweetUploadService = TweetUploadService.this;
            tweetUploadService.getClass();
            Intent intent = new Intent("com.twitter.sdk.android.tweetcomposer.UPLOAD_SUCCESS");
            intent.putExtra("EXTRA_TWEET_ID", j);
            intent.setPackage(tweetUploadService.getApplicationContext().getPackageName());
            tweetUploadService.sendBroadcast(intent);
            tweetUploadService.stopSelf();
        }
    }

    public static class OooO0O0 {
    }

    public TweetUploadService() {
        OooO0O0 oooO0O0 = new OooO0O0();
        super("TweetUploadService");
        this.f22256OooO0Oo = oooO0O0;
    }

    public final void OooO00o(TwitterException twitterException) {
        Intent intent = this.f22257OooO0o0;
        Intent intent2 = new Intent("com.twitter.sdk.android.tweetcomposer.UPLOAD_FAILURE");
        intent2.putExtra("EXTRA_RETRY_INTENT", intent);
        intent2.setPackage(getApplicationContext().getPackageName());
        sendBroadcast(intent2);
        o00Oo0.OooO0OO().OooO0Oo("TweetUploadService", "Post Tweet failed", twitterException);
        stopSelf();
    }

    public final void OooO0O0(o0Oo0oo o0oo0oo2, String str, String str2) {
        this.f22256OooO0Oo.getClass();
        ((StatusesService) o0OOO0o.OooO0OO().OooO00o(o0oo0oo2).OooO00o(StatusesService.class)).update(str, null, null, null, null, null, null, Boolean.TRUE, str2).OooOooO(new OooO00o());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0089  */
    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) throws Throwable {
        String path;
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) intent.getParcelableExtra("EXTRA_USER_TOKEN");
        this.f22257OooO0o0 = intent;
        String strSubstring = "";
        o0Oo0oo o0oo0oo2 = new o0Oo0oo(-1L, twitterAuthToken, "");
        String stringExtra = intent.getStringExtra("EXTRA_TWEET_TEXT");
        Uri uri = (Uri) intent.getParcelableExtra("EXTRA_IMAGE_URI");
        if (uri == null) {
            OooO0O0(o0oo0oo2, stringExtra, null);
            return;
        }
        o0ooOOo o0ooooo = new o0ooOOo(this, o0oo0oo2, stringExtra);
        this.f22256OooO0Oo.getClass();
        o00Ooo o00oooOooO00o = o0OOO0o.OooO0OO().OooO00o(o0oo0oo2);
        if ("com.android.providers.media.documents".equalsIgnoreCase(uri.getAuthority())) {
            String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(CertificateUtil.DELIMITER);
            if ("image".equals(strArrSplit[0])) {
                path = o00O0O.OooO00o(this, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{strArrSplit[1]});
            } else {
                path = null;
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            path = o00O0O.OooO00o(this, uri, null, null);
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
        String mimeTypeFromExtension = !TextUtils.isEmpty(strSubstring) ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(strSubstring) : "application/octet-stream";
        Pattern pattern = o00OOO0.f57234OooO0o0;
        ((MediaService) o00oooOooO00o.OooO00o(MediaService.class)).upload(oo00oO.create(o00OOO0.OooO00o.OooO0O0(mimeTypeFromExtension), file), null, null).OooOooO(o0ooooo);
    }
}
