package OooOOO;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.qiniu.android.http.ResponseInfo;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.exception.YallaException;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.yallatech.support.platform.share.bean.ShareResponse;
import com.yallatech.support.platform.share.bean.YLImage;
import com.yallatech.support.platform.share.bean.YLMedia;
import com.yallatech.support.platform.share.bean.YLMusic;
import com.yallatech.support.platform.share.bean.YLVideo;
import com.yallatech.support.platform.share.bean.YLWebPage;
import java.io.File;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p003OooO0Oo.Oooo000;
import p625o0oo0oo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends Oooo000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public OooOOOO f155OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f156OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f157OooO0Oo;

    public OooO(@NotNull OooOOOO shareClient) {
        Intrinsics.checkNotNullParameter(shareClient, "shareClient");
        this.f155OooO0O0 = shareClient;
        this.f156OooO0OO = "A ContentProvider must add in the AndroidManifest.xml for App(%s).";
        this.f157OooO0Oo = "com.yallatech.support.platform.YallaChatContentProvider";
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0164  */
    public final void OooO0o(ShareRequest shareRequest) throws YallaException {
        boolean z;
        if (shareRequest.getYlMedia() instanceof YLImage) {
            YLMedia ylMedia = shareRequest.getYlMedia();
            Objects.requireNonNull(ylMedia, "null cannot be cast to non-null type com.yallatech.support.platform.share.bean.YLImage");
            if (((YLImage) ylMedia).getImageData() == null) {
                YLMedia ylMedia2 = shareRequest.getYlMedia();
                Objects.requireNonNull(ylMedia2, "null cannot be cast to non-null type com.yallatech.support.platform.share.bean.YLImage");
                String imagePath = ((YLImage) ylMedia2).getImagePath();
                if (imagePath != null) {
                    File file = new File(imagePath);
                    if (!file.exists() || file.length() >= 31457280) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Check failed, the file size is too large: ");
                        sbOooO0o0.append(imagePath.length());
                        sbOooO0o0.append('.');
                        throw new YallaException(sbOooO0o0.toString());
                    }
                    try {
                        YLMedia ylMedia3 = shareRequest.getYlMedia();
                        if (ylMedia3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.yallatech.support.platform.share.bean.YLImage");
                        }
                        ((YLImage) ylMedia3).setImageData(FilesKt.readBytes(file));
                    } catch (Exception e) {
                        throw new YallaException(e.getMessage());
                    }
                }
            }
        }
        YLMedia ylMedia4 = shareRequest.getYlMedia();
        Unit unit = null;
        cursorQuery = null;
        Cursor cursorQuery = null;
        if (ylMedia4 != null) {
            if (ylMedia4 instanceof YLImage) {
                YLImage yLImage = (YLImage) ylMedia4;
                shareRequest.setTitle("");
                shareRequest.setDescription("");
                shareRequest.setThumbData(null);
                byte[] imageData = yLImage.getImageData();
                if (imageData == null) {
                    z = false;
                } else {
                    z = !(imageData.length == 0);
                }
                if (z) {
                    Context applicationContext$lib_release = YCSDKOpenKit.getApplicationContext$lib_release();
                    String thirdApplicationId$lib_release = YCSDKOpenKit.INSTANCE.getThirdApplicationId$lib_release();
                    PackageManager packageManager = applicationContext$lib_release.getPackageManager();
                    if (packageManager != null) {
                        String strStringPlus = Intrinsics.stringPlus(this.f157OooO0Oo, thirdApplicationId$lib_release);
                        if (packageManager.resolveContentProvider(strStringPlus, 0) == null) {
                            throw new YallaException(OooO00o.OooO0OO.OooO00o(new Object[]{strStringPlus}, 1, this.f156OooO0OO, "java.lang.String.format(format, *args)"));
                        }
                    }
                    byte[] imageData2 = yLImage.getImageData();
                    Intrinsics.checkNotNull(imageData2);
                    if (imageData2.length > 31457280) {
                        throw new YallaException("Check failed, the imageData size is too large");
                    }
                } else {
                    if (!OooOOO0.OooO00o.OooO0Oo(yLImage.getImagePath())) {
                        throw new YallaException("Check failed, the arguments are null or empty, please input valid arguments");
                    }
                    String imagePath2 = yLImage.getImagePath();
                    Intrinsics.checkNotNull(imagePath2);
                    if (imagePath2.length() > 1000) {
                        throw new YallaException(Intrinsics.stringPlus("Check failed, the imagePath is too long, it should be <= ", imagePath2));
                    }
                    if (!StringsKt.OooOoOO(imagePath2, "content")) {
                        throw new YallaException("Check failed.");
                    }
                    Context context = YCSDKOpenKit.getApplicationContext$lib_release();
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(imagePath2, "imagePath");
                    long columnIndex = 0;
                    try {
                        try {
                            cursorQuery = context.getContentResolver().query(Uri.parse(imagePath2), null, null, null, null);
                            if (cursorQuery != null) {
                                columnIndex = cursorQuery.getColumnIndex("_size");
                                cursorQuery.moveToFirst();
                                cursorQuery.getLong((int) columnIndex);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (Throwable th) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            throw th;
                        }
                    } catch (Exception t) {
                        t.printStackTrace();
                        Intrinsics.checkNotNullParameter(t, "t");
                        if (o000OO0O.f48670OooO0O0) {
                            Log.e(o000OO0O.f48669OooO00o, "", t);
                        }
                        if (cursorQuery != null) {
                        }
                        if (columnIndex > 31457280) {
                            throw new YallaException(Intrinsics.stringPlus("Check failed, the file size is too large: ", Long.valueOf(columnIndex)));
                        }
                        this.f155OooO0O0.OooO0oo();
                        unit = Unit.INSTANCE;
                    }
                    if (columnIndex > 31457280) {
                        throw new YallaException(Intrinsics.stringPlus("Check failed, the file size is too large: ", Long.valueOf(columnIndex)));
                    }
                }
            } else if (ylMedia4 instanceof YLMusic) {
                YLMusic yLMusic = (YLMusic) ylMedia4;
                OooO0oo(shareRequest);
                yLMusic.setOpenAppUrl(OooO0oO(yLMusic.getOpenAppUrl()));
                if (!OooOOO0.OooO00o.OooO0Oo(yLMusic.getMusicUrl())) {
                    throw new YallaException("Check failed, the musicUrl is null or empty, please input valid argument");
                }
                String musicUrl = yLMusic.getMusicUrl();
                if (musicUrl.length() > 1000) {
                    yLMusic.setMusicUrl(OooOOO0.OooO00o.OooO00o(musicUrl, 1000));
                    String msg = "Check warning, the musicUrl length is " + musicUrl.length() + " exceeded length limit, it will be set limit length.";
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    if (o000OO0O.f48670OooO0O0) {
                        Log.e(o000OO0O.f48669OooO00o, msg);
                    }
                }
            } else if (ylMedia4 instanceof YLVideo) {
                YLVideo yLVideo = (YLVideo) ylMedia4;
                OooO0oo(shareRequest);
                yLVideo.setOpenAppUrl(OooO0oO(yLVideo.getOpenAppUrl()));
                if (!OooOOO0.OooO00o.OooO0Oo(yLVideo.getVideoUrl())) {
                    throw new YallaException("Check failed, the videoUrl is null or empty, please input valid argument");
                }
                String videoUrl = yLVideo.getVideoUrl();
                if (videoUrl.length() > 1000) {
                    yLVideo.setVideoUrl(OooOOO0.OooO00o.OooO00o(videoUrl, 1000));
                    String msg2 = "Check warning, The videoUrl length is " + videoUrl.length() + " exceeded length limit, it will be set limit length.";
                    Intrinsics.checkNotNullParameter(msg2, "msg");
                    if (o000OO0O.f48670OooO0O0) {
                        Log.e(o000OO0O.f48669OooO00o, msg2);
                    }
                }
            } else if (ylMedia4 instanceof YLWebPage) {
                YLWebPage yLWebPage = (YLWebPage) ylMedia4;
                OooO0oo(shareRequest);
                yLWebPage.setOpenAppUrl(OooO0oO(yLWebPage.getOpenAppUrl()));
                if (!OooOOO0.OooO00o.OooO0Oo(yLWebPage.getWebPageUrl())) {
                    throw new YallaException("Check failed, the musicUrl is null or empty, please input valid argument");
                }
                String webPageUrl = yLWebPage.getWebPageUrl();
                if (webPageUrl.length() > 1000) {
                    yLWebPage.setWebPageUrl(OooOOO0.OooO00o.OooO00o(webPageUrl, 1000));
                    String msg3 = "Check warning, the webPageUrl length is " + webPageUrl.length() + " exceeded length limit, it will be set limit length.";
                    Intrinsics.checkNotNullParameter(msg3, "msg");
                    if (o000OO0O.f48670OooO0O0) {
                        Log.e(o000OO0O.f48669OooO00o, msg3);
                    }
                }
            }
            this.f155OooO0O0.OooO0oo();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            OooOOOO oooOOOO = this.f155OooO0O0;
            Objects.requireNonNull(oooOOOO);
            oooOOOO.OooO0Oo(ShareResponse.INSTANCE.createShareResponse(ResponseInfo.UnknownHost, "Check failed, the ylMedia must be not null."));
        }
    }

    @Override // p003OooO0Oo.Oooo000
    public final void OooO0o0() {
        OooO0OO OooO0oO2 = this.f155OooO0O0.OooO0oO();
        if (OooO0oO2 == null) {
            OooO0oO2 = null;
        } else if (OooO0Oo()) {
            YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new OooO0o(this, OooO0oO2, 0));
        } else {
            try {
                OooO0o(OooO0oO2.f162OooO0OO);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                OooOOOO oooOOOO = this.f155OooO0O0;
                Objects.requireNonNull(oooOOOO);
                oooOOOO.OooO0Oo(ShareResponse.INSTANCE.createShareResponse(ResponseInfo.UnknownHost, message));
            }
        }
        if (OooO0oO2 == null) {
            OooOOOO oooOOOO2 = this.f155OooO0O0;
            oooOOOO2.OooO0Oo(oooOOOO2.OooO00o(-2002, null));
        }
    }

    public final String OooO0oO(String url) {
        if (!OooOOO0.OooO00o.OooO0Oo(url) || url == null) {
            return url;
        }
        int length = url.length();
        Intrinsics.checkNotNullParameter(url, "openAppUrl");
        Context context = YCSDKOpenKit.getApplicationContext$lib_release();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(url)), 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
        if (!(!listQueryIntentActivities.isEmpty())) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Check warning, The openAppUrl must add in the AndroidManifest.xml for App scheme(\"yc");
            sbOooO0o0.append(YCSDKOpenKit.getAppId$lib_release());
            sbOooO0o0.append("://\").");
            String msg = sbOooO0o0.toString();
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (o000OO0O.f48670OooO0O0) {
                Log.e(o000OO0O.f48669OooO00o, msg);
            }
        }
        if (length <= 1000) {
            return url;
        }
        String msg2 = "Check warning, The openAppUrl length is " + length + " exceeded length limit, it will be set limit length.";
        Intrinsics.checkNotNullParameter(msg2, "msg");
        if (o000OO0O.f48670OooO0O0) {
            Log.e(o000OO0O.f48669OooO00o, msg2);
        }
        return OooOOO0.OooO00o.OooO00o(url, 1000);
    }

    public final void OooO0oo(ShareRequest shareRequest) {
        byte[] thumbData;
        if (OooOOO0.OooO00o.OooO0Oo(shareRequest.getTitle())) {
            String title = shareRequest.getTitle();
            if (title.length() > 100) {
                shareRequest.setTitle(OooOOO0.OooO00o.OooO00o(title, 100));
                String msg = "Check warning, The title length is " + title.length() + " exceeded length limit, it will be set limit length.";
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (o000OO0O.f48670OooO0O0) {
                    Log.e(o000OO0O.f48669OooO00o, msg);
                }
            }
        }
        if (OooOOO0.OooO00o.OooO0Oo(shareRequest.getDescription())) {
            String description = shareRequest.getDescription();
            if (description.length() > 500) {
                shareRequest.setDescription(OooOOO0.OooO00o.OooO00o(description, 500));
                String msg2 = "Check warning, The desc length is " + description.length() + " exceeded length limit, it will be set limit length.";
                Intrinsics.checkNotNullParameter(msg2, "msg");
                if (o000OO0O.f48670OooO0O0) {
                    Log.e(o000OO0O.f48669OooO00o, msg2);
                }
            }
        }
        byte[] thumbData2 = shareRequest.getThumbData();
        boolean z = false;
        if (thumbData2 != null) {
            z = !(thumbData2.length == 0);
        }
        if (!z || (thumbData = shareRequest.getThumbData()) == null || thumbData.length <= 32768) {
            return;
        }
        shareRequest.setThumbData(null);
        String msg3 = "Check warning, The thumb size is " + thumbData.length + " exceeded size limit, it will be set null.";
        Intrinsics.checkNotNullParameter(msg3, "msg");
        if (o000OO0O.f48670OooO0O0) {
            Log.e(o000OO0O.f48669OooO00o, msg3);
        }
    }
}
