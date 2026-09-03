package p353o0OOOo00;

import com.common.support.imagepicker.dataprovider.utils.MediaUtils;
import com.facebook.internal.AnalyticsEvents;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.OooOo;
import com.twitter.sdk.android.core.models.Oooo0;
import com.twitter.sdk.android.core.models.VideoInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 {
    public static VideoInfo.Variant OooO00o(MediaEntity mediaEntity) {
        for (VideoInfo.Variant variant : mediaEntity.f21560OooOOOo.f21725OooO0o) {
            if ("application/x-mpegURL".equals(variant.f21729OooO0o0) || MediaUtils.VIDEO_MP4.equals(variant.f21729OooO0o0)) {
                return variant;
            }
        }
        return null;
    }

    public static MediaEntity OooO0O0(OooOo oooOo) {
        List<MediaEntity> list;
        List<MediaEntity> list2;
        ArrayList<MediaEntity> arrayList = new ArrayList();
        Oooo0 oooo0 = oooOo.f21597OooO0Oo;
        if (oooo0 != null && (list2 = oooo0.f21641OooO0OO) != null) {
            arrayList.addAll(list2);
        }
        Oooo0 oooo1 = oooOo.f21599OooO0o0;
        if (oooo1 != null && (list = oooo1.f21641OooO0OO) != null) {
            arrayList.addAll(list);
        }
        for (MediaEntity mediaEntity : arrayList) {
            if (mediaEntity.f21559OooOOOO != null && OooO0OO(mediaEntity)) {
                return mediaEntity;
            }
        }
        return null;
    }

    public static boolean OooO0OO(MediaEntity mediaEntity) {
        return AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO.equals(mediaEntity.f21559OooOOOO) || "animated_gif".equals(mediaEntity.f21559OooOOOO);
    }
}
