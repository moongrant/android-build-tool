package OooOOOO;

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
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import p003OooO0o0.oo000o;
import p609o0oo0OOO.h5;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends oo000o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOOOO f178OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f179OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f180OooO0Oo;

    public OooO(@NotNull OooOOOO shareClient) {
        Intrinsics.checkNotNullParameter(shareClient, "shareClient");
        this.f178OooO0O0 = shareClient;
        this.f179OooO0OO = "A ContentProvider must add in the AndroidManifest.xml for App(%s).";
        this.f180OooO0Oo = "com.yallatech.support.platform.YallaChatContentProvider";
    }

    public static String OooO0oO(String url) {
        if (!OooOOO.OooO00o.OooO0Oo(url) || url == null) {
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
            String msg = "Check warning, The openAppUrl must add in the AndroidManifest.xml for App scheme(\"yc" + YCSDKOpenKit.getAppId$lib_release() + "://\").";
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (h5.f57416OooO0O0) {
                Log.e(h5.f57415OooO00o, msg);
            }
        }
        if (length <= 1000) {
            return url;
        }
        String msg2 = "Check warning, The openAppUrl length is " + length + " exceeded length limit, it will be set limit length.";
        Intrinsics.checkNotNullParameter(msg2, "msg");
        if (h5.f57416OooO0O0) {
            Log.e(h5.f57415OooO00o, msg2);
        }
        return OooOOO.OooO00o.OooO00o(1000, url);
    }

    public static void OooO0oo(ShareRequest shareRequest) {
        byte[] thumbData;
        if (OooOOO.OooO00o.OooO0Oo(shareRequest.getTitle())) {
            String title = shareRequest.getTitle();
            if (title.length() > 100) {
                shareRequest.setTitle(OooOOO.OooO00o.OooO00o(100, title));
                String msg = "Check warning, The title length is " + title.length() + " exceeded length limit, it will be set limit length.";
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (h5.f57416OooO0O0) {
                    Log.e(h5.f57415OooO00o, msg);
                }
            }
        }
        if (OooOOO.OooO00o.OooO0Oo(shareRequest.getDescription())) {
            String description = shareRequest.getDescription();
            if (description.length() > 500) {
                shareRequest.setDescription(OooOOO.OooO00o.OooO00o(500, description));
                String msg2 = "Check warning, The desc length is " + description.length() + " exceeded length limit, it will be set limit length.";
                Intrinsics.checkNotNullParameter(msg2, "msg");
                if (h5.f57416OooO0O0) {
                    Log.e(h5.f57415OooO00o, msg2);
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
        if (h5.f57416OooO0O0) {
            Log.e(h5.f57415OooO00o, msg3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x017d  */
    public final void OooO0o(ShareRequest shareRequest) throws YallaException {
        boolean z;
        if (shareRequest.getYlMedia() instanceof YLImage) {
            YLMedia ylMedia = shareRequest.getYlMedia();
            if (ylMedia == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yallatech.support.platform.share.bean.YLImage");
            }
            if (((YLImage) ylMedia).getImageData() == null) {
                YLMedia ylMedia2 = shareRequest.getYlMedia();
                if (ylMedia2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yallatech.support.platform.share.bean.YLImage");
                }
                String imagePath = ((YLImage) ylMedia2).getImagePath();
                if (imagePath != null) {
                    File file = new File(imagePath);
                    if (!file.exists() || file.length() >= 31457280) {
                        throw new YallaException("Check failed, the file size is too large: " + imagePath.length() + '.');
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
        OooOOOO oooOOOO = this.f178OooO0O0;
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
                        String strStringPlus = Intrinsics.stringPlus(this.f180OooO0Oo, thirdApplicationId$lib_release);
                        if (packageManager.resolveContentProvider(strStringPlus, 0) == null) {
                            String str = String.format(this.f179OooO0OO, Arrays.copyOf(new Object[]{strStringPlus}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                            throw new YallaException(str);
                        }
                    }
                    byte[] imageData2 = yLImage.getImageData();
                    Intrinsics.checkNotNull(imageData2);
                    if (imageData2.length > 31457280) {
                        throw new YallaException("Check failed, the imageData size is too large");
                    }
                } else {
                    if (!OooOOO.OooO00o.OooO0Oo(yLImage.getImagePath())) {
                        throw new YallaException("Check failed, the arguments are null or empty, please input valid arguments");
                    }
                    String imagePath2 = yLImage.getImagePath();
                    Intrinsics.checkNotNull(imagePath2);
                    if (imagePath2.length() > 1000) {
                        throw new YallaException(Intrinsics.stringPlus("Check failed, the imagePath is too long, it should be <= ", imagePath2));
                    }
                    if (!StringsKt__StringsJVMKt.startsWith$default(imagePath2, "content", false, 2, null)) {
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
                        } catch (Exception t) {
                            t.printStackTrace();
                            Intrinsics.checkNotNullParameter(t, "t");
                            if (h5.f57416OooO0O0) {
                                Log.e(h5.f57415OooO00o, "", t);
                            }
                            if (cursorQuery != null) {
                            }
                            if (columnIndex > 31457280) {
                                throw new YallaException(Intrinsics.stringPlus("Check failed, the file size is too large: ", Long.valueOf(columnIndex)));
                            }
                            oooOOOO.OooO0oo();
                            unit = Unit.INSTANCE;
                        }
                        if (columnIndex > 31457280) {
                            throw new YallaException(Intrinsics.stringPlus("Check failed, the file size is too large: ", Long.valueOf(columnIndex)));
                        }
                    } catch (Throwable th) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th;
                    }
                }
            } else if (ylMedia4 instanceof YLMusic) {
                YLMusic yLMusic = (YLMusic) ylMedia4;
                OooO0oo(shareRequest);
                yLMusic.setOpenAppUrl(OooO0oO(yLMusic.getOpenAppUrl()));
                if (!OooOOO.OooO00o.OooO0Oo(yLMusic.getMusicUrl())) {
                    throw new YallaException("Check failed, the musicUrl is null or empty, please input valid argument");
                }
                String musicUrl = yLMusic.getMusicUrl();
                if (musicUrl.length() > 1000) {
                    yLMusic.setMusicUrl(OooOOO.OooO00o.OooO00o(1000, musicUrl));
                    String msg = "Check warning, the musicUrl length is " + musicUrl.length() + " exceeded length limit, it will be set limit length.";
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    if (h5.f57416OooO0O0) {
                        Log.e(h5.f57415OooO00o, msg);
                    }
                }
            } else if (ylMedia4 instanceof YLVideo) {
                YLVideo yLVideo = (YLVideo) ylMedia4;
                OooO0oo(shareRequest);
                yLVideo.setOpenAppUrl(OooO0oO(yLVideo.getOpenAppUrl()));
                if (!OooOOO.OooO00o.OooO0Oo(yLVideo.getVideoUrl())) {
                    throw new YallaException("Check failed, the videoUrl is null or empty, please input valid argument");
                }
                String videoUrl = yLVideo.getVideoUrl();
                if (videoUrl.length() > 1000) {
                    yLVideo.setVideoUrl(OooOOO.OooO00o.OooO00o(1000, videoUrl));
                    String msg2 = "Check warning, The videoUrl length is " + videoUrl.length() + " exceeded length limit, it will be set limit length.";
                    Intrinsics.checkNotNullParameter(msg2, "msg");
                    if (h5.f57416OooO0O0) {
                        Log.e(h5.f57415OooO00o, msg2);
                    }
                }
            } else if (ylMedia4 instanceof YLWebPage) {
                YLWebPage yLWebPage = (YLWebPage) ylMedia4;
                OooO0oo(shareRequest);
                yLWebPage.setOpenAppUrl(OooO0oO(yLWebPage.getOpenAppUrl()));
                if (!OooOOO.OooO00o.OooO0Oo(yLWebPage.getWebPageUrl())) {
                    throw new YallaException("Check failed, the musicUrl is null or empty, please input valid argument");
                }
                String webPageUrl = yLWebPage.getWebPageUrl();
                if (webPageUrl.length() > 1000) {
                    yLWebPage.setWebPageUrl(OooOOO.OooO00o.OooO00o(1000, webPageUrl));
                    String msg3 = "Check warning, the webPageUrl length is " + webPageUrl.length() + " exceeded length limit, it will be set limit length.";
                    Intrinsics.checkNotNullParameter(msg3, "msg");
                    if (h5.f57416OooO0O0) {
                        Log.e(h5.f57415OooO00o, msg3);
                    }
                }
            }
            oooOOOO.OooO0oo();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            oooOOOO.getClass();
            oooOOOO.OooO0Oo(ShareResponse.INSTANCE.createShareResponse(ResponseInfo.UnknownHost, "Check failed, the ylMedia must be not null."));
        }
    }

    @Override // p003OooO0o0.oo000o
    public final void OooO0o0() {
        OooOOOO oooOOOO = this.f178OooO0O0;
        OooO0OO oooO0OOOooO = oooOOOO.OooO0oO();
        if (oooO0OOOooO == null) {
            oooO0OOOooO = null;
        } else if (oo000o.OooO0Oo()) {
            YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new OooO0o(0, this, oooO0OOOooO));
        } else {
            try {
                OooO0o(oooO0OOOooO.f185OooO0OO);
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                oooOOOO.OooO0Oo(ShareResponse.INSTANCE.createShareResponse(ResponseInfo.UnknownHost, message));
            }
        }
        if (oooO0OOOooO == null) {
            oooOOOO.OooO0Oo(oooOOOO.OooO00o(-2002, null));
        }
    }
}
