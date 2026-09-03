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
import com.twitter.sdk.android.core.Oooo0;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.OooOo;
import com.twitter.sdk.android.core.o00O0O;
import com.twitter.sdk.android.core.o00Oo0;
import com.twitter.sdk.android.core.o0OOO0o;
import com.twitter.sdk.android.core.o0ooOOo;
import com.twitter.sdk.android.core.services.MediaService;
import com.twitter.sdk.android.core.services.StatusesService;
import java.io.File;
import java.util.regex.Pattern;
import p350o0OOOOoo.o000000;
import p350o0OOOOoo.o0Oo0oo;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0oO0Ooo;

/* JADX INFO: loaded from: classes2.dex */
public class TweetUploadService extends IntentService {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f21783OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Intent f21784OooO0o0;

    public class OooO00o extends com.twitter.sdk.android.core.OooO0O0<OooOo> {
        public OooO00o() {
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0OO(TwitterException twitterException) {
            TweetUploadService.this.OooO00o(twitterException);
        }

        @Override // com.twitter.sdk.android.core.OooO0O0
        public final void OooO0Oo(Oooo0<OooOo> oooo0) {
            long j = oooo0.f21502OooO00o.f21593OooO;
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
        this.f21783OooO0Oo = oooO0O0;
    }

    public final void OooO00o(TwitterException twitterException) {
        Intent intent = this.f21784OooO0o0;
        Intent intent2 = new Intent("com.twitter.sdk.android.tweetcomposer.UPLOAD_FAILURE");
        intent2.putExtra("EXTRA_RETRY_INTENT", intent);
        intent2.setPackage(getApplicationContext().getPackageName());
        sendBroadcast(intent2);
        o00O0O.OooO0OO().OooO0Oo("TweetUploadService", "Post Tweet failed", twitterException);
        stopSelf();
    }

    public final void OooO0O0(o0OOO0o o0ooo0o2, String str, String str2) {
        this.f21783OooO0Oo.getClass();
        ((StatusesService) o0ooOOo.OooO0OO().OooO00o(o0ooo0o2).OooO00o(StatusesService.class)).update(str, null, null, null, null, null, null, Boolean.TRUE, str2).OooOooo(new OooO00o());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0089  */
    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) throws Throwable {
        String path;
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) intent.getParcelableExtra("EXTRA_USER_TOKEN");
        this.f21784OooO0o0 = intent;
        String strSubstring = "";
        o0OOO0o o0ooo0o2 = new o0OOO0o(-1L, twitterAuthToken, "");
        String stringExtra = intent.getStringExtra("EXTRA_TWEET_TEXT");
        Uri uri = (Uri) intent.getParcelableExtra("EXTRA_IMAGE_URI");
        if (uri == null) {
            OooO0O0(o0ooo0o2, stringExtra, null);
            return;
        }
        o000000 o000000Var = new o000000(this, o0ooo0o2, stringExtra);
        this.f21783OooO0Oo.getClass();
        o00Oo0 o00oo0OooO00o = o0ooOOo.OooO0OO().OooO00o(o0ooo0o2);
        if ("com.android.providers.media.documents".equalsIgnoreCase(uri.getAuthority())) {
            String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(CertificateUtil.DELIMITER);
            if ("image".equals(strArrSplit[0])) {
                path = o0Oo0oo.OooO00o(this, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{strArrSplit[1]});
            } else {
                path = null;
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            path = o0Oo0oo.OooO00o(this, uri, null, null);
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
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        ((MediaService) o00oo0OooO00o.OooO00o(MediaService.class)).upload(o0oO0Ooo.create(o0O000Oo.OooO00o.OooO0O0(mimeTypeFromExtension), file), null, null).OooOooo(o000000Var);
    }
}
