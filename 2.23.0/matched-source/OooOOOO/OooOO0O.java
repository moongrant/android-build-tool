package OooOOOO;

import OooO0O0.OooOo00;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import com.qiniu.android.http.ResponseInfo;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.exception.YallaException;
import com.yallatech.support.platform.login.bean.AppStatus;
import com.yallatech.support.platform.share.bean.IMedia;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.yallatech.support.platform.share.bean.ShareResponse;
import com.yallatech.support.platform.share.bean.YLImage;
import com.yallatech.support.platform.share.bean.YLMedia;
import com.yallatech.support.platform.share.bean.YLMusic;
import com.yallatech.support.platform.share.bean.YLVideo;
import com.yallatech.support.platform.share.bean.YLWebPage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.o00Ooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0o0.o00Oo0;
import p003OooO0o0.oo000o;
import p605o0oo0OO0.o000O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends oo000o implements OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOOOO f194OooO0O0;

    public OooOO0O(@NotNull OooOOOO shareClient) {
        Intrinsics.checkNotNullParameter(shareClient, "shareClient");
        this.f194OooO0O0 = shareClient;
    }

    public static Bundle OooO0o(OooO0OO request) {
        String appName;
        String appIcon;
        File file;
        IMedia.MediaType mediaType = IMedia.MediaType.UNKNOWN;
        YLMedia ylMedia = request.f188OooO0OO.getYlMedia();
        Bundle bundle = null;
        file = null;
        file = null;
        File file2 = null;
        bundle = null;
        if (ylMedia != null) {
            if (ylMedia instanceof YLImage) {
                mediaType = IMedia.MediaType.IMAGE;
                Bundle bundle2 = new Bundle();
                YLImage yLImage = (YLImage) ylMedia;
                if (yLImage.getImageData() != null) {
                    OooO0O0.OooO0OO oooO0OO = OooO0O0.OooO0OO.f88OooO00o;
                    UUID callId = UUID.randomUUID();
                    Intrinsics.checkNotNullExpressionValue(callId, "randomUUID()");
                    byte[] imageData = yLImage.getImageData();
                    byte[] imageData2 = yLImage.getImageData();
                    Intrinsics.checkNotNull(imageData2);
                    Bitmap attachmentBitmap = BitmapFactory.decodeByteArray(imageData, 0, imageData2.length);
                    Intrinsics.checkNotNullExpressionValue(attachmentBitmap, "decodeByteArray(it.image…, 0, it.imageData!!.size)");
                    Intrinsics.checkNotNullParameter(callId, "callId");
                    Intrinsics.checkNotNullParameter(attachmentBitmap, "attachmentBitmap");
                    OooO0O0.OooO0OO.OooO00o attachment = new OooO0O0.OooO0OO.OooO00o(callId, attachmentBitmap);
                    yLImage.setImagePath(attachment.f92OooO0OO);
                    bundle2.putString(ShareRequest.YL_PLATFORM_SHARE_IMAGE_PATH, yLImage.getImagePath());
                    Intrinsics.checkNotNullParameter(attachment, "attachment");
                    if (OooO0O0.OooO0OO.f89OooO0O0 == null) {
                        OooOOO.OooO00o.OooO0OO(oooO0OO.OooO00o());
                    }
                    oooO0OO.OooO00o().mkdirs();
                    try {
                        if (attachment.f94OooO0o0) {
                            UUID callId2 = attachment.f90OooO00o;
                            String str = attachment.f93OooO0Oo;
                            Intrinsics.checkNotNullParameter(callId2, "callId");
                            if (OooO0O0.OooO0OO.f89OooO0O0 == null) {
                                file = null;
                            } else {
                                file = new File(OooO0O0.OooO0OO.f89OooO0O0, callId2.toString());
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                            }
                            if (file != null) {
                                try {
                                    file2 = new File(file, URLEncoder.encode(str, "UTF-8"));
                                } catch (UnsupportedEncodingException unused) {
                                }
                            }
                            Bitmap bitmap = attachment.f91OooO0O0;
                            if (bitmap != null) {
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                try {
                                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException unused2) {
                                    }
                                } catch (Throwable th) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException unused3) {
                                    }
                                    throw th;
                                }
                            }
                        }
                    } catch (IOException e) {
                        String msg = Intrinsics.stringPlus("Got unexpected exception:", e);
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        if (o000O.f56902OooO0O0) {
                            Log.e(o000O.f56901OooO00o, msg);
                        }
                        if (file2 != null) {
                            try {
                                file2.delete();
                            } catch (Exception unused4) {
                            }
                        }
                        throw new YallaException(e);
                    }
                } else {
                    String imagePath = yLImage.getImagePath();
                    if (!(imagePath == null || imagePath.length() == 0)) {
                        bundle2.putString(ShareRequest.YL_PLATFORM_SHARE_IMAGE_PATH, yLImage.getImagePath());
                    }
                }
                bundle = bundle2;
            } else if (ylMedia instanceof YLMusic) {
                mediaType = IMedia.MediaType.MUSIC;
                bundle = new Bundle();
                YLMusic yLMusic = (YLMusic) ylMedia;
                bundle.putString(ShareRequest.YL_PLATFORM_SHARE_MUSIC_URL, yLMusic.getMusicUrl());
                bundle.putString(ShareRequest.YL_PLATFORM_SHARE_OPEN_APP_URL, yLMusic.getOpenAppUrl());
            } else if (ylMedia instanceof YLWebPage) {
                mediaType = IMedia.MediaType.WEB_PAGE;
                bundle = new Bundle();
                YLWebPage yLWebPage = (YLWebPage) ylMedia;
                bundle.putString(ShareRequest.YL_PLATFORM_SHARE_WEB_PAGE_URL, yLWebPage.getWebPageUrl());
                bundle.putString(ShareRequest.YL_PLATFORM_SHARE_OPEN_APP_URL, yLWebPage.getOpenAppUrl());
            } else if (ylMedia instanceof YLVideo) {
                mediaType = IMedia.MediaType.VIDEO;
                bundle = new Bundle();
                YLVideo yLVideo = (YLVideo) ylMedia;
                bundle.putString(ShareRequest.YL_PLATFORM_SHARE_VIDEO_URL, yLVideo.getVideoUrl());
                bundle.putString(ShareRequest.YL_PLATFORM_SHARE_OPEN_APP_URL, yLVideo.getOpenAppUrl());
            }
        }
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Bundle bundle3 = new Bundle();
        AppStatus appStatus = request.f144OooO0O0;
        String str2 = "";
        if (appStatus == null || (appName = appStatus.getAppName()) == null) {
            appName = "";
        }
        bundle3.putString(ShareRequest.YL_PLATFORM_SHARE_APP_NAME, appName);
        AppStatus appStatus2 = request.f144OooO0O0;
        if (appStatus2 != null && (appIcon = appStatus2.getAppIcon()) != null) {
            str2 = appIcon;
        }
        bundle3.putString(ShareRequest.YL_PLATFORM_SHARE_APP_ICON, str2);
        bundle3.putString(ShareRequest.YL_PLATFORM_SHARE_REDIRECT_URI, YCSDKOpenKit.getDirectUrl$lib_release());
        ShareRequest shareRequest = request.f188OooO0OO;
        bundle3.putString(ShareRequest.YL_PLATFORM_SHARE_TITLE, shareRequest.getTitle());
        bundle3.putString(ShareRequest.YL_PLATFORM_SHARE_DESCRIPTION, shareRequest.getDescription());
        bundle3.putByteArray(ShareRequest.YL_PLATFORM_SHARE_THUMB_DATA, shareRequest.getThumbData());
        bundle3.putInt(ShareRequest.YL_PLATFORM_SHARE_TYPE, mediaType.getType());
        bundle3.putBundle(ShareRequest.YL_PLATFORM_SHARE_EXTRA_DATA, bundle);
        return bundle3;
    }

    @Override // OooO0O0.OooO00o
    public final void OooO00o(@Nullable OooO0O0.OooOOO oooOOO) {
        OooOOOO oooOOOO = this.f194OooO0O0;
        if (oooOOO == null) {
            oooOOOO.getClass();
            oooOOOO.OooO0Oo(ShareResponse.INSTANCE.createShareResponse(ResponseInfo.CannotConnectToHost, "Share Canceled"));
            return;
        }
        Bundle bundle = oooOOO.f103OooO0OO;
        if (bundle == null) {
            OooO0oo("Request share success, but we received a null bundle");
            return;
        }
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        int i = bundle.getInt("yp_biz_response_code");
        String string = bundle.getString("yp_biz_response_msg");
        if (string == null) {
            string = "";
        }
        Pair pair = new Pair(Integer.valueOf(i), string);
        int iIntValue = ((Number) pair.getFirst()).intValue();
        String str = (String) pair.getSecond();
        oooOOOO.getClass();
        oooOOOO.OooO0Oo(ShareResponse.INSTANCE.createShareResponse(iIntValue, str));
    }

    @Override // OooO0O0.OooO00o
    public final void OooO0O0(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        OooOOOO oooOOOO = this.f194OooO0O0;
        oooOOOO.getClass();
        oooOOOO.OooO0Oo(ShareResponse.INSTANCE.createShareResponse(-2002, message));
    }

    @Override // OooO0O0.OooO00o
    public final void OooO0OO(@NotNull OooO0O0.OooOOO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i = data.f102OooO0O0;
        OooOOOO oooOOOO = this.f194OooO0O0;
        if (i != 3) {
            oooOOOO.OooO0Oo(oooOOOO.OooO00o(-2002, null));
        } else if (data.f103OooO0OO == null) {
            OooO0oo("Request share success, but we received a null bundle");
        } else {
            oooOOOO.OooO0Oo(oooOOOO.OooO00o(0, null));
        }
    }

    @Override // p003OooO0o0.oo000o
    public final void OooO0o0() {
        Unit unit;
        final OooOo00 oooOo00;
        OooOOOO oooOOOO = this.f194OooO0O0;
        OooO0OO oooO0OOOooO = oooOOOO.OooO0oO();
        if (oooO0OOOooO == null || (oooOo00 = oooO0OOOooO.f143OooO00o) == null) {
            unit = null;
        } else {
            if (oo000o.OooO0Oo()) {
                final int i = 0;
                YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new Runnable() { // from class: OooOOOO.OooOO0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = i;
                        Object obj = oooOo00;
                        Object obj2 = this;
                        switch (i2) {
                            case 0:
                                OooOO0O this$0 = (OooOO0O) obj2;
                                OooO0O0.OooO0o nativeAppInfo = (OooO0O0.OooO0o) obj;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(nativeAppInfo, "$nativeAppInfo");
                                this$0.OooO0oO(nativeAppInfo);
                                return;
                            default:
                                o00Ooo this$1 = (o00Ooo) obj2;
                                String query = (String) obj;
                                Intrinsics.checkNotNullParameter(this$1, "this$0");
                                Intrinsics.checkNotNullParameter(query, "$query");
                                this$1.getClass();
                                CollectionsKt.emptyList();
                                throw null;
                        }
                    }
                });
            } else {
                OooO0oO(oooOo00);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            oooOOOO.OooO0Oo(oooOOOO.OooO00o(-2002, null));
        }
    }

    public final void OooO0oO(OooO0O0.OooO0o oooO0o) {
        OooOOOO oooOOOO = this.f194OooO0O0;
        try {
            OooO0O0.OooOOO0 oooOOO0 = oooOOOO.f133OooO0o;
            oooOOO0.getClass();
            Intrinsics.checkNotNullParameter(this, "bizClient");
            oooOOO0.f106OooO0OO = this;
            o00Oo0.OooO00o oooO00o = oooOOOO.f136OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO00o();
            }
            OooO0O0.OooOOO0 oooOOO1 = oooOOOO.f133OooO0o;
            OooO0OO oooO0OOOooO = oooOOOO.OooO0oO();
            Intrinsics.checkNotNull(oooO0OOOooO);
            oooOOO1.OooO0O0(oooO0o, 3, OooO0o(oooO0OOOooO), null);
        } catch (YallaException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            OooO0oo(message);
        }
    }

    public final void OooO0oo(String message) {
        OooOOOO oooOOOO = this.f194OooO0O0;
        oooOOOO.getClass();
        oooOOOO.OooO0Oo(ShareResponse.INSTANCE.createShareResponse(-2002, message));
        Intrinsics.checkNotNullParameter(message, "message");
        if (o000O.f56902OooO0O0) {
            Log.d(o000O.f56901OooO00o, message);
        }
    }
}
