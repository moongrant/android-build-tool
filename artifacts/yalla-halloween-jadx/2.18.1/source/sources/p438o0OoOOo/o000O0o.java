package p438o0OoOOo;

import com.facebook.internal.AnalyticsEvents;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.VideoInfo;
import java.util.ArrayList;
import java.util.List;
import p436o0OoOOOO.o0O00OOO;
import p436o0OoOOOO.o0O00o00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0o {
    public static List<MediaEntity> OooO00o(o0O00OOO o0o00ooo2) {
        List<MediaEntity> list;
        List<MediaEntity> list2;
        ArrayList arrayList = new ArrayList();
        o0O00o00 o0o00o01 = o0o00ooo2.f40006OooO0Oo;
        if (o0o00o01 != null && (list2 = o0o00o01.f40039OooO0OO) != null) {
            arrayList.addAll(list2);
        }
        o0O00o00 o0o00o02 = o0o00ooo2.f40008OooO0o0;
        if (o0o00o02 != null && (list = o0o00o02.f40039OooO0OO) != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public static VideoInfo.Variant OooO0O0(MediaEntity mediaEntity) {
        for (VideoInfo.Variant variant : mediaEntity.f19995OoooOo0.f20057Oooo0oo) {
            boolean z = true;
            if (!"application/x-mpegURL".equals(variant.f20059Oooo0oO) && !"video/mp4".equals(variant.f20059Oooo0oO)) {
                z = false;
            }
            if (z) {
                return variant;
            }
        }
        return null;
    }

    public static MediaEntity OooO0OO(o0O00OOO o0o00ooo2) {
        for (MediaEntity mediaEntity : (ArrayList) OooO00o(o0o00ooo2)) {
            if (mediaEntity.f19994OoooOOo != null && OooO0o0(mediaEntity)) {
                return mediaEntity;
            }
        }
        return null;
    }

    public static boolean OooO0Oo(MediaEntity mediaEntity) {
        return AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO.equals(mediaEntity.f19994OoooOOo);
    }

    public static boolean OooO0o0(MediaEntity mediaEntity) {
        return AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO.equals(mediaEntity.f19994OoooOOo) || "animated_gif".equals(mediaEntity.f19994OoooOOo);
    }
}
