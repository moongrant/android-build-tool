package p192o00o0O0;

import com.app.selectPicture.activity.ShowImagesLoadActivity;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.OooO00o;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.activity.room.MemberListRemoveActivity;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import p186o00o00Oo.o0ooOOo;
import p200o00o0Oo0.o0000Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O0 implements o0000Ooo, MediaCodecUtil.OooO, BaseQuickAdapter.OooOo, o0ooOOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f33086OooO0Oo;

    public /* synthetic */ o00000O0(Object obj) {
        this.f33086OooO0Oo = obj;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO
    public final int OooO00o(Object obj) {
        Format format = (Format) this.f33086OooO0Oo;
        OooO00o oooO00o = (OooO00o) obj;
        Pattern pattern = MediaCodecUtil.f14427OooO00o;
        try {
            return oooO00o.OooO0Oo(format) ? 1 : 0;
        } catch (MediaCodecUtil.DecoderQueryException unused) {
            return -1;
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo
    public final void OooO0Oo() {
        TopicInfoActivity this$0 = (TopicInfoActivity) this.f33086OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TopicInfoActivity.OooOoo(this$0, false);
    }

    @Override // p200o00o0Oo0.o0000Ooo
    public final void OooO0o0(Object obj, Object obj2) {
        ShowImagesLoadActivity showImagesLoadActivity = (ShowImagesLoadActivity) this.f33086OooO0Oo;
        int i = ShowImagesLoadActivity.f12276OoooO0O;
        Objects.requireNonNull(showImagesLoadActivity);
        if (((Integer) obj2).intValue() != 1010) {
            return;
        }
        showImagesLoadActivity.finish();
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        MemberListRemoveActivity this$0 = (MemberListRemoveActivity) this.f33086OooO0Oo;
        MemberListRemoveActivity.OooO00o oooO00o = MemberListRemoveActivity.f22886Oooooo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOooo(false);
    }
}
