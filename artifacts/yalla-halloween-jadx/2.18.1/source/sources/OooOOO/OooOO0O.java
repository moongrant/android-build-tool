package OooOOO;

import OooO00o.OooOo;
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
import java.util.Objects;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0Oo.OooOo00;
import p003OooO0Oo.Oooo000;
import p625o0oo0oo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends Oooo000 implements OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public OooOOOO f169OooO0O0;

    public OooOO0O(@NotNull OooOOOO shareClient) {
        Intrinsics.checkNotNullParameter(shareClient, "shareClient");
        this.f169OooO0O0 = shareClient;
    }

    @Override // OooO00o.OooO0O0
    public final void OooO00o(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        OooOOOO oooOOOO = this.f169OooO0O0;
        Objects.requireNonNull(oooOOOO);
        oooOOOO.OooO0Oo(ShareResponse.INSTANCE.createShareResponse(-2002, message));
    }

    @Override // OooO00o.OooO0O0
    public final void OooO0O0(@Nullable OooO00o.OooOOOO oooOOOO) {
        if (oooOOOO == null) {
            OooOOOO oooOOOO2 = this.f169OooO0O0;
            Objects.requireNonNull(oooOOOO2);
            oooOOOO2.OooO0Oo(ShareResponse.INSTANCE.createShareResponse(ResponseInfo.CannotConnectToHost, "Share Canceled"));
            return;
        }
        Bundle bundle = oooOOOO.f85OooO0OO;
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
        OooOOOO oooOOOO3 = this.f169OooO0O0;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        String str = (String) pair.getSecond();
        Objects.requireNonNull(oooOOOO3);
        oooOOOO3.OooO0Oo(ShareResponse.INSTANCE.createShareResponse(iIntValue, str));
    }

    @Override // OooO00o.OooO0O0
    public final void OooO0OO(@NotNull OooO00o.OooOOOO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.f84OooO0O0 != 3) {
            OooOOOO oooOOOO = this.f169OooO0O0;
            oooOOOO.OooO0Oo(oooOOOO.OooO00o(-2002, null));
        } else if (data.f85OooO0OO == null) {
            OooO0oo("Request share success, but we received a null bundle");
        } else {
            OooOOOO oooOOOO2 = this.f169OooO0O0;
            oooOOOO2.OooO0Oo(oooOOOO2.OooO00o(0, null));
        }
    }

    public final Bundle OooO0o(OooO0OO request) {
        String appName;
        String appIcon;
        File file;
        IMedia.MediaType mediaType = IMedia.MediaType.UNKNOWN;
        YLMedia ylMedia = request.f162OooO0OO.getYlMedia();
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
                    OooO00o.OooO0o oooO0o = OooO00o.OooO0o.f66OooO00o;
                    UUID callId = UUID.randomUUID();
                    Intrinsics.checkNotNullExpressionValue(callId, "randomUUID()");
                    byte[] imageData = yLImage.getImageData();
                    byte[] imageData2 = yLImage.getImageData();
                    Intrinsics.checkNotNull(imageData2);
                    Bitmap attachmentBitmap = BitmapFactory.decodeByteArray(imageData, 0, imageData2.length);
                    Intrinsics.checkNotNullExpressionValue(attachmentBitmap, "decodeByteArray(it.image…, 0, it.imageData!!.size)");
                    Intrinsics.checkNotNullParameter(callId, "callId");
                    Intrinsics.checkNotNullParameter(attachmentBitmap, "attachmentBitmap");
                    OooO00o.OooO0o.OooO00o attachment = new OooO00o.OooO0o.OooO00o(callId, attachmentBitmap);
                    yLImage.setImagePath(attachment.f70OooO0OO);
                    bundle2.putString(ShareRequest.YL_PLATFORM_SHARE_IMAGE_PATH, yLImage.getImagePath());
                    Intrinsics.checkNotNullParameter(attachment, "attachment");
                    if (OooO00o.OooO0o.f67OooO0O0 == null) {
                        OooOOO0.OooO00o.OooO0OO(oooO0o.OooO00o());
                    }
                    oooO0o.OooO00o().mkdirs();
                    try {
                        if (attachment.f72OooO0o0) {
                            UUID callId2 = attachment.f68OooO00o;
                            String str = attachment.f71OooO0Oo;
                            Intrinsics.checkNotNullParameter(callId2, "callId");
                            if (OooO00o.OooO0o.f67OooO0O0 == null) {
                                file = null;
                            } else {
                                file = new File(OooO00o.OooO0o.f67OooO0O0, callId2.toString());
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
                            Bitmap bitmap = attachment.f69OooO0O0;
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
                        if (o000OO0O.f48670OooO0O0) {
                            Log.e(o000OO0O.f48669OooO00o, msg);
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
        AppStatus appStatus = request.f117OooO0O0;
        String str2 = "";
        if (appStatus == null || (appName = appStatus.getAppName()) == null) {
            appName = "";
        }
        bundle3.putString(ShareRequest.YL_PLATFORM_SHARE_APP_NAME, appName);
        AppStatus appStatus2 = request.f117OooO0O0;
        if (appStatus2 != null && (appIcon = appStatus2.getAppIcon()) != null) {
            str2 = appIcon;
        }
        bundle3.putString(ShareRequest.YL_PLATFORM_SHARE_APP_ICON, str2);
        bundle3.putString(ShareRequest.YL_PLATFORM_SHARE_REDIRECT_URI, YCSDKOpenKit.getDirectUrl$lib_release());
        bundle3.putString(ShareRequest.YL_PLATFORM_SHARE_TITLE, request.f162OooO0OO.getTitle());
        bundle3.putString(ShareRequest.YL_PLATFORM_SHARE_DESCRIPTION, request.f162OooO0OO.getDescription());
        bundle3.putByteArray(ShareRequest.YL_PLATFORM_SHARE_THUMB_DATA, request.f162OooO0OO.getThumbData());
        bundle3.putInt(ShareRequest.YL_PLATFORM_SHARE_TYPE, mediaType.getType());
        bundle3.putBundle(ShareRequest.YL_PLATFORM_SHARE_EXTRA_DATA, bundle);
        return bundle3;
    }

    @Override // p003OooO0Oo.Oooo000
    public final void OooO0o0() {
        Unit unit;
        OooOo oooOo;
        OooO0OO OooO0oO2 = this.f169OooO0O0.OooO0oO();
        if (OooO0oO2 == null || (oooOo = OooO0oO2.f116OooO00o) == null) {
            unit = null;
        } else {
            if (OooO0Oo()) {
                YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new OooOO0(this, oooOo, 0));
            } else {
                OooO0oO(oooOo);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            OooOOOO oooOOOO = this.f169OooO0O0;
            oooOOOO.OooO0Oo(oooOOOO.OooO00o(-2002, null));
        }
    }

    public final void OooO0oO(OooO00o.OooO oooO) {
        try {
            OooO00o.OooOOO oooOOO = this.f169OooO0O0.f109OooO0o;
            Objects.requireNonNull(oooOOO);
            Intrinsics.checkNotNullParameter(this, "bizClient");
            oooOOO.f78OooO0OO = this;
            OooOo00.OooO00o oooO00o = this.f169OooO0O0.f112OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO00o();
            }
            OooOOOO oooOOOO = this.f169OooO0O0;
            OooO00o.OooOOO oooOOO2 = oooOOOO.f109OooO0o;
            OooO0OO OooO0oO2 = oooOOOO.OooO0oO();
            Intrinsics.checkNotNull(OooO0oO2);
            oooOOO2.OooO0OO(oooO, 3, OooO0o(OooO0oO2), null);
        } catch (YallaException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            OooO0oo(message);
        }
    }

    public final void OooO0oo(String message) {
        OooOOOO oooOOOO = this.f169OooO0O0;
        Objects.requireNonNull(oooOOOO);
        oooOOOO.OooO0Oo(ShareResponse.INSTANCE.createShareResponse(-2002, message));
        Intrinsics.checkNotNullParameter(message, "message");
        if (o000OO0O.f48670OooO0O0) {
            Log.d(o000OO0O.f48669OooO00o, message);
        }
    }
}
